package net.DakotaPride.moreweaponry.item.custom.celestial_madalian;

import net.DakotaPride.moreweaponry.MoreWeaponry;
import net.DakotaPride.moreweaponry.entity.MoreWeaponryEntities;
import net.DakotaPride.moreweaponry.entity.custom.WandererEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.ActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class WandererCelestialMedallionItem extends CelestialMadalianItem{
    public WandererCelestialMedallionItem(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        BlockPos blockPos = context.getBlockPos();
        World world = context.getWorld();
        LivingEntity livingEntity = context.getPlayer();
        if (world.getBlockState(blockPos).isOf(MoreWeaponry.WANDERER_SUMMONER)) {
            world.playSound(null, blockPos, SoundEvents.PARTICLE_SOUL_ESCAPE, SoundCategory.PLAYERS, 1.0F, 1.0F);

            WandererEntity wandererEntity = MoreWeaponryEntities.WANDERER.create(world);
            assert wandererEntity != null;
            wandererEntity.refreshPositionAndAngles((double)blockPos.getX() + 0.5, blockPos.getY() + 1.5, (double)blockPos.getZ() + 0.5, 0.0f, 0.0f);
            world.spawnEntity(wandererEntity);
            wandererEntity.playSpawnEffects();

            this.getItemCooldownManager().set(this, 1200);

        }
        return super.useOnBlock(context);
    }


}
