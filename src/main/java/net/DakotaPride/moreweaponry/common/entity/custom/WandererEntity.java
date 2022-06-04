package net.DakotaPride.moreweaponry.common.entity.custom;

import net.DakotaPride.moreweaponry.common.MoreWeaponry;
import net.DakotaPride.moreweaponry.common.entity.custom.abstract_cases.AbstractHostileEntity;
import net.minecraft.block.BlockState;
import net.minecraft.entity.*;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.boss.BossBar;
import net.minecraft.entity.boss.ServerBossBar;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.mob.HostileEntity;
import net.minecraft.entity.mob.SkeletonEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.core.PlayState;
import software.bernie.geckolib3.core.builder.AnimationBuilder;
import software.bernie.geckolib3.core.controller.AnimationController;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.manager.AnimationData;
import software.bernie.geckolib3.core.manager.AnimationFactory;

public class WandererEntity extends AbstractHostileEntity implements IAnimatable {
    private AnimationFactory factory = new AnimationFactory(this);
    private final ServerBossBar bossBar;
    public WandererEntity(EntityType<? extends AbstractHostileEntity> entityType, World world) {
        super(entityType, world);

        this.bossBar = (ServerBossBar)(new ServerBossBar(new TranslatableText("entity.moreweaponry.wanderer"),
                BossBar.Color.YELLOW, BossBar.Style.PROGRESS)).setDragonMusic(false).setThickenFog(false);

    }

    public boolean damage(DamageSource source, float amount) {
        if (source.getAttacker() != null && source.isProjectile() && source.getAttacker() instanceof LivingEntity) {
            LivingEntity attacker = (LivingEntity) source.getAttacker();
            attacker.addStatusEffect(new StatusEffectInstance(MoreWeaponry.WEBBED, 100), this);
        }

        return super.damage(source, amount);
    }

    @Override
    public boolean canHaveStatusEffect(StatusEffectInstance effect) {
        StatusEffect statusEffect = effect.getEffectType();
        return statusEffect
                != StatusEffects.POISON && statusEffect
                != MoreWeaponry.SICKENED && statusEffect
                != MoreWeaponry.PLAGUED && statusEffect
                != MoreWeaponry.CRACKLER && statusEffect
                != MoreWeaponry.EXPLOSIVE && statusEffect
                != MoreWeaponry.BARD && statusEffect
                != MoreWeaponry.SIREN && statusEffect
                != MoreWeaponry.WANDERER && statusEffect
                != MoreWeaponry.WEBBED && statusEffect
                != MoreWeaponry.NUMBED && statusEffect
                != StatusEffects.WITHER && statusEffect
                != StatusEffects.LEVITATION && statusEffect
                != StatusEffects.GLOWING && statusEffect
                != StatusEffects.UNLUCK && statusEffect
                != StatusEffects.MINING_FATIGUE && statusEffect
                != StatusEffects.HUNGER;
    }


    public boolean tryAttack(Entity target) {
        if (!super.tryAttack(target)) {
            return false;
        } else {
            if (target instanceof LivingEntity) {
                ((LivingEntity)target).addStatusEffect
                        (new StatusEffectInstance(MoreWeaponry.WEBBED, 140), this);
            }

            return true;
        }
    }


    @Override
    public void onStartedTrackingBy(ServerPlayerEntity player) {
        super.onStartedTrackingBy(player);
        this.bossBar.addPlayer(player);
    }

    public void onStoppedTrackingBy(ServerPlayerEntity player) {
        super.onStoppedTrackingBy(player);
        this.bossBar.removePlayer(player);
    }

    public void writeCustomDataToNbt(NbtCompound nbt) {
        super.writeCustomDataToNbt(nbt);
    }

    public void readCustomDataFromNbt(NbtCompound nbt) {
        super.readCustomDataFromNbt(nbt);
        if (this.hasCustomName()) {
            this.bossBar.setName(this.getDisplayName());
        }

    }

    protected void mobTick() {
        this.bossBar.setPercent(this.getHealth() / this.getMaxHealth());
    }


    public static DefaultAttributeContainer.Builder setAttributes() {
        return HostileEntity.createMobAttributes()
                .add(EntityAttributes.GENERIC_MAX_HEALTH, 875.0D)
                .add(EntityAttributes.GENERIC_ATTACK_DAMAGE, 22.0f)
                .add(EntityAttributes.GENERIC_MOVEMENT_SPEED, 0.39)
                .add(EntityAttributes.GENERIC_FOLLOW_RANGE, 194.0D)
                .add(EntityAttributes.GENERIC_ATTACK_SPEED, 0.92f);
    }

    protected void initGoals() {
        this.goalSelector.add(0, new SwimGoal(this));
        this.goalSelector.add(2, new MeleeAttackGoal(this, 1.0D, false));
        this.goalSelector.add(7, new WanderAroundFarGoal(this, 1.0D, 0.0F));
        this.goalSelector.add(8, new LookAroundGoal(this));
        this.goalSelector.add(6, new LookAtEntityGoal(this, (Class)PlayerEntity.class, 8.0F));

        this.goalSelector.add(12, new RevengeGoal(this, PlayerEntity.class));
        this.goalSelector.add(13, new RevengeGoal(this, CracklerEntity.class));
        this.goalSelector.add(15, new RevengeGoal(this, WatcherEntity.class));
        this.goalSelector.add(19, new RevengeGoal(this, SickenedEntity.class));
        this.goalSelector.add(20, new RevengeGoal(this, SickenedHuskEntity.class));
        this.goalSelector.add(16, new RevengeGoal(this, BardEntity.class));
        this.goalSelector.add(17, new RevengeGoal(this, LurkerEntity.class));
        this.goalSelector.add(18, new RevengeGoal(this, SkeletonEntity.class));

        this.targetSelector.add(1, new ActiveTargetGoal<>(this, PlayerEntity.class, true, false));
        this.targetSelector.add(3, new ActiveTargetGoal<>(this, WatcherEntity.class, true, false));
        this.targetSelector.add(3, new ActiveTargetGoal<>(this, CracklerEntity.class, true, false));
        this.targetSelector.add(4, new ActiveTargetGoal<>(this, LurkerEntity.class, true, false));
        this.targetSelector.add(5, new ActiveTargetGoal<>(this, SickenedEntity.class, true, false));
        this.targetSelector.add(9, new ActiveTargetGoal<>(this, SickenedHuskEntity.class, true, false));
    }

    private static class AttackGoal extends MeleeAttackGoal {
        public AttackGoal(WandererEntity wandererEntity) {
            super(wandererEntity, 1.0D, true);
        }

        public boolean canStart() {
            return (super.canStart() && !this.mob.hasPassengers());
        }


        public boolean shouldContinue() {
            float f = this.mob.getBrightnessAtEyes();
            if (f >= 0.5F && this.mob.getRandom().nextInt(100) == 0) {
                this.mob.setTarget((LivingEntity)null);
                return false;
            }
            return super.shouldContinue();
        }


        protected double getSquaredMaxAttackDistance(LivingEntity entity) {
            return (4.0F + entity.getWidth());
        }

    }

    protected float getActiveEyeHeight(EntityPose pose, EntityDimensions dimensions) {
        return 0.9F;
    }

    private static class TargetGoal<T extends LivingEntity> extends ActiveTargetGoal<T> {
        public TargetGoal(WandererEntity wandererEntity, Class<T> targetEntityClass) {
            super(wandererEntity, targetEntityClass, true);
        }


        public boolean canStart() {
            float f = this.mob.getBrightnessAtEyes();
            if (f >= 0.5F) {
                return false;
            }

            return super.canStart();
        }
    }

    @Override
    protected SoundEvent getAmbientSound() {
        return SoundEvents.ENTITY_SPIDER_AMBIENT;
    }

    @Override
    protected SoundEvent getHurtSound(DamageSource source) {
        return SoundEvents.ENTITY_SPIDER_HURT;
    }

    @Override
    protected SoundEvent getDeathSound() {
        return SoundEvents.ENTITY_SPIDER_DEATH;
    }

    @Override
    protected void playStepSound(BlockPos pos, BlockState state) {
        this.playSound(SoundEvents.BLOCK_STONE_STEP, 0.15f, 1.0f);
    }


    @Override
    public void registerControllers(AnimationData animationData) {
        animationData.addAnimationController(new AnimationController(this, "controller",
                0, this::predicate));
    }

    @Override
    public AnimationFactory getFactory() {
        return factory;
    }

    private <E extends IAnimatable> PlayState predicate(AnimationEvent<E> event) {
        if (event.isMoving()) {
            event.getController().setAnimation(new AnimationBuilder().addAnimation("animation.wanderer.walk", true));
            return PlayState.CONTINUE;
        }

        event.getController().setAnimation(new AnimationBuilder().addAnimation("animation.wanderer.idle", true));
        return PlayState.CONTINUE;
    }
}
