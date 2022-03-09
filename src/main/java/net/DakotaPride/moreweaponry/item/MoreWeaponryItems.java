package net.DakotaPride.moreweaponry.item;

import com.github.crimsondawn45.fabricshieldlib.lib.object.FabricShieldItem;
import net.DakotaPride.moreweaponry.MoreWeaponry;
import net.DakotaPride.moreweaponry.block.MoreWeaponryBlocks;
import net.DakotaPride.moreweaponry.entity.MoreWeaponryEntities;
import net.DakotaPride.moreweaponry.item.custom.*;
import net.DakotaPride.moreweaponry.item.custom.cirtict.cooled.*;
import net.DakotaPride.moreweaponry.item.custom.cirtict.essence.*;
import net.DakotaPride.moreweaponry.item.custom.cirtict.heated.*;
import net.DakotaPride.moreweaponry.item.custom.cores.*;
import net.DakotaPride.moreweaponry.item.custom.elder_scale_items.*;
import net.DakotaPride.moreweaponry.item.custom.maiden_tools.*;
import net.DakotaPride.moreweaponry.item.custom.mod_tools.BluestoneIgnitor;
import net.DakotaPride.moreweaponry.item.custom.mod_tools.ModBattleaxeItem;
import net.DakotaPride.moreweaponry.item.custom.mod_tools.ModKnifeItem;
import net.DakotaPride.moreweaponry.item.custom.phantom_helm.PhantomScaleHelm;
import net.DakotaPride.moreweaponry.item.custom.plagued_tools.*;
import net.DakotaPride.moreweaponry.item.custom.powered_cores.*;
import net.DakotaPride.moreweaponry.item.custom.suppressed_tools.*;
import net.DakotaPride.moreweaponry.item.custom.vanilla_tools.ModHoeItem;
import net.DakotaPride.moreweaponry.item.custom.vanilla_tools.ModPickaxeItem;
import net.DakotaPride.moreweaponry.item.custom.watcher_tools.*;
import net.DakotaPride.moreweaponry.sound.MoreWeaponrySounds;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.DakotaPride.moreweaponry.item.custom.vanilla_tools.ModAxeItem;

public class MoreWeaponryItems {

    public static final Item BLASTED_AMETHYST = registerItem("blasted_amethyst",
            new Item(new FabricItemSettings().group(MoreWeaponryItemGroup.MORE_WEAPONRY)));

    public static final Item GLIMMERING_AMETHYST = registerItem("glimmering_amethyst",
            new Item(new FabricItemSettings().group(MoreWeaponryItemGroup.MORE_WEAPONRY)));

    public static final Item MOON_STONE_DUST = registerItem("moon_stone_dust",
            new Item(new FabricItemSettings().group(MoreWeaponryItemGroup.MORE_WEAPONRY)));

    public static final Item REFINED_MOON_STONE = registerItem("refined_moon_stone",
            new Item(new FabricItemSettings().group(MoreWeaponryItemGroup.MORE_WEAPONRY)));

    public static final Item HANDLE = registerItem("handle",
            new ModHandleItem(new FabricItemSettings().group(MoreWeaponryItemGroup.MORE_WEAPONRY)));

    public static final Item KURO_SEEDS = registerItem("kuro_seeds",
            new BlockItem(MoreWeaponryBlocks.KURO_PLANT, new FabricItemSettings().fireproof().group(MoreWeaponryItemGroup.MORE_WEAPONRY)));

    public static final Item KURO = registerItem("kuro",
            new Item(new FabricItemSettings().fireproof().group(MoreWeaponryItemGroup.MORE_WEAPONRY)));

    public static final Item KURO_BREAD = registerItem("kuro_bread",
            new Item(new FabricItemSettings().fireproof().food
                    (new FoodComponent.Builder().alwaysEdible().hunger(8).statusEffect
                                    (new StatusEffectInstance(StatusEffects.ABSORPTION, 20*10), 1f)
                            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 20*5), 0.5f)
                            .statusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 20*15), 1f)
                            .saturationModifier(0.7f).build()).group(MoreWeaponryItemGroup.MORE_WEAPONRY)));

    public static final Item CURON_BREW = registerItem("curon_brew",
            new ModStewItem(new FabricItemSettings().maxCount(1).food
                    (new FoodComponent.Builder().alwaysEdible().hunger(7).statusEffect
                            (new StatusEffectInstance(StatusEffects.BLINDNESS, 20*10), 1f)
                            .statusEffect(new StatusEffectInstance(StatusEffects.WITHER, 20*5), 1f)
                            .statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 20*5), 1f)
                            .statusEffect(new StatusEffectInstance(StatusEffects.HUNGER, 20*3), 1f)
                            .statusEffect(new StatusEffectInstance(StatusEffects.MINING_FATIGUE, 20*10), 1f)
                            .statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 20*5), 1f)
                            .statusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS, 20*10), 1f)
                            .statusEffect(new StatusEffectInstance(StatusEffects.WEAKNESS, 20*10), 1f)
                            .statusEffect(new StatusEffectInstance(StatusEffects.UNLUCK, 20*5), 1f)
                            .saturationModifier(0.6f).build()).group(MoreWeaponryItemGroup.MORE_WEAPONRY)));

    public static final Item FRODON_BOWL = registerItem("frodon_bowl",
            new Item(new FabricItemSettings().group(MoreWeaponryItemGroup.MORE_WEAPONRY)));

    public static final Item CURON_FLOWER_PETALS = registerItem("curon_flower_petals",
            new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(2).statusEffect
                    (new StatusEffectInstance(StatusEffects.WEAKNESS, 20*3), 0.7f)
                    .saturationModifier(0.4f).build()).group(MoreWeaponryItemGroup.MORE_WEAPONRY)));

    public static final Item CRUSHED_KURO = registerItem("crushed_kuro",
            new Item(new FabricItemSettings().group(MoreWeaponryItemGroup.MORE_WEAPONRY)));

    public static final Item BLACKSTONE_INGOT = registerItem("blackstone_ingot",
            new Item(new FabricItemSettings().fireproof().group(MoreWeaponryItemGroup.MORE_WEAPONRY)));

    public static final Item NETHERITE_HANDLE = registerItem("netherite_handle",
            new ModHandleItem(new FabricItemSettings().fireproof().group(MoreWeaponryItemGroup.MORE_WEAPONRY)));

    public static final Item MARE_DIAMOND = registerItem("mare_diamond",
            new Item(new FabricItemSettings().group(MoreWeaponryItemGroup.MORE_WEAPONRY)));

    public static final Item NETHERITE_NUGGET = registerItem("netherite_nugget",
            new Item(new FabricItemSettings().fireproof().group(MoreWeaponryItemGroup.MORE_WEAPONRY)));

    public static final Item AMETHYST_HANDLE = registerItem("amethyst_handle",
            new ModHandleItem(new FabricItemSettings().group(MoreWeaponryItemGroup.MORE_WEAPONRY)));

    public static final Item GUARDIAN_SCALE = registerItem("guardian_scale",
            new Item(new FabricItemSettings().group(MoreWeaponryItemGroup.MORE_WEAPONRY)));

    public static final Item ELDER_GUARDIAN_SCALE = registerItem("elder_guardian_scale",
            new Item(new FabricItemSettings().group(MoreWeaponryItemGroup.MORE_WEAPONRY)));

    public static final Item ELDER_GUARDIANS_EYE = registerItem("elder_guardians_eye",
            new Item(new FabricItemSettings().group(MoreWeaponryItemGroup.MORE_WEAPONRY)));

    public static final Item PRISMARINE_HANDLE = registerItem("prismarine_handle",
            new ModHandleItem(new FabricItemSettings().group(MoreWeaponryItemGroup.MORE_WEAPONRY)));

    public static final Item WITHER_ESSENCE = registerItem("wither_essence",
            new Item(new FabricItemSettings().group(MoreWeaponryItemGroup.MORE_WEAPONRY)));

    public static final Item WITHER_BONE = registerItem("wither_bone",
            new Item(new FabricItemSettings().group(MoreWeaponryItemGroup.MORE_WEAPONRY)));

    public static final Item PHANTOM_ESSENCE = registerItem("phantom_essence",
            new Item(new FabricItemSettings().group(MoreWeaponryItemGroup.MORE_WEAPONRY)));

    public static final Item PHANTOM_SCALE = registerItem("phantom_scale",
            new Item(new FabricItemSettings().group(MoreWeaponryItemGroup.MORE_WEAPONRY)));

    public static final Item PHANTOM_HELMET = registerItem("phantom_helmet",
            new PhantomScaleHelm(MoreWeaponryArmorMaterials.PHANTOM_SCALE, EquipmentSlot.HEAD,
                    new FabricItemSettings().group(MoreWeaponryItemGroup.MORE_WEAPONRY)));

    public static final Item CIRTICT_INGOT = registerItem("cirtict_ingot",
            new Item(new FabricItemSettings().group(MoreWeaponryItemGroup.MORE_WEAPONRY)));


    public static final Item GLIMMERING_SWORD = registerItem("glimmering_sword",
            new SwordItem((ToolMaterial) ModToolMaterial.GLIMMERING_AMETHYST, 3, -2.4f,
                    new FabricItemSettings().group(MoreWeaponryItemGroup.MORE_WEAPONRY)));
    public static final Item GLIMMERING_SHOVEL = registerItem("glimmering_shovel",
            new ShovelItem((ToolMaterial) ModToolMaterial.GLIMMERING_AMETHYST, 1, -3f,
                    new FabricItemSettings().group(MoreWeaponryItemGroup.MORE_WEAPONRY)));

    public static final Item GLIMMERING_PICKAXE = registerItem("glimmering_pickaxe",
            new ModPickaxeItem((ToolMaterial) ModToolMaterial.GLIMMERING_AMETHYST, 1, -2.8f,
                    new FabricItemSettings().group(MoreWeaponryItemGroup.MORE_WEAPONRY)));
    public static final Item GLIMMERING_AXE = registerItem("glimmering_axe",
            new ModAxeItem((ToolMaterial) ModToolMaterial.GLIMMERING_AMETHYST, 5, -3f,
                    new FabricItemSettings().group(MoreWeaponryItemGroup.MORE_WEAPONRY)));
    public static final Item GLIMMERING_HOE = registerItem("glimmering_hoe",
            new ModHoeItem((ToolMaterial) ModToolMaterial.GLIMMERING_AMETHYST, -1, 0f,
                    new FabricItemSettings().group(MoreWeaponryItemGroup.MORE_WEAPONRY)));

    public static final Item GLIMMERING_BATTLEAXE = registerItem("glimmering_battleaxe",
            new ModBattleaxeItem((ToolMaterial) ModToolMaterial.GLIMMERING_AMETHYST, 6, -3.3f,
                    new FabricItemSettings().group(MoreWeaponryItemGroup.MORE_WEAPONRY)));

    public static final Item MOON_STONE_SWORD = registerItem("moon_stone_sword",
            new SwordItem((ToolMaterial) ModToolMaterial.REFINED_MOON_STONE, 3, -2.4f,
                    new FabricItemSettings().group(MoreWeaponryItemGroup.MORE_WEAPONRY)));
    public static final Item MOON_STONE_SHOVEL = registerItem("moon_stone_shovel",
            new ShovelItem((ToolMaterial) ModToolMaterial.REFINED_MOON_STONE, 1, -3f,
                    new FabricItemSettings().group(MoreWeaponryItemGroup.MORE_WEAPONRY)));

    public static final Item MOON_STONE_PICKAXE = registerItem("moon_stone_pickaxe",
            new ModPickaxeItem((ToolMaterial) ModToolMaterial.REFINED_MOON_STONE, 1, -2.8f,
                    new FabricItemSettings().group(MoreWeaponryItemGroup.MORE_WEAPONRY)));
    public static final Item MOON_STONE_AXE = registerItem("moon_stone_axe",
            new ModAxeItem((ToolMaterial) ModToolMaterial.REFINED_MOON_STONE, 6, -3f,
                    new FabricItemSettings().group(MoreWeaponryItemGroup.MORE_WEAPONRY)));
    public static final Item MOON_STONE_HOE = registerItem("moon_stone_hoe",
            new ModHoeItem((ToolMaterial) ModToolMaterial.REFINED_MOON_STONE, 0, 0f,
                    new FabricItemSettings().group(MoreWeaponryItemGroup.MORE_WEAPONRY)));

    public static final Item MOON_STONE_BATTLEAXE = registerItem("moon_stone_battleaxe",
            new ModBattleaxeItem((ToolMaterial) ModToolMaterial.REFINED_MOON_STONE, 8, -3.3f,
                    new FabricItemSettings().group(MoreWeaponryItemGroup.MORE_WEAPONRY)));

    public static final Item BLACKSTONE_METAL_SWORD = registerItem("blackstone_metal_sword",
            new SwordItem((ToolMaterial) ModToolMaterial.BLACKSTONE_METAL, 4, -2.4f,
                    new FabricItemSettings().group(MoreWeaponryItemGroup.MORE_WEAPONRY)));
    public static final Item BLACKSTONE_METAL_SHOVEL = registerItem("blackstone_metal_shovel",
            new ShovelItem((ToolMaterial) ModToolMaterial.BLACKSTONE_METAL, 2, -3f,
                    new FabricItemSettings().group(MoreWeaponryItemGroup.MORE_WEAPONRY)));

    public static final Item BLACKSTONE_METAL_PICKAXE = registerItem("blackstone_metal_pickaxe",
            new ModPickaxeItem((ToolMaterial) ModToolMaterial.BLACKSTONE_METAL, 3, -2.8f,
                    new FabricItemSettings().group(MoreWeaponryItemGroup.MORE_WEAPONRY)));
    public static final Item BLACKSTONE_METAL_AXE = registerItem("blackstone_metal_axe",
            new ModAxeItem((ToolMaterial) ModToolMaterial.BLACKSTONE_METAL, 8, -3f,
                    new FabricItemSettings().group(MoreWeaponryItemGroup.MORE_WEAPONRY)));
    public static final Item BLACKSTONE_METAL_HOE = registerItem("blackstone_metal_hoe",
            new ModHoeItem((ToolMaterial) ModToolMaterial.BLACKSTONE_METAL, -4, 0f,
                    new FabricItemSettings().group(MoreWeaponryItemGroup.MORE_WEAPONRY)));

    public static final Item BLACKSTONE_METAL_BATTLEAXE = registerItem("blackstone_metal_battleaxe",
            new ModBattleaxeItem((ToolMaterial) ModToolMaterial.BLACKSTONE_METAL, 10, -3.3f,
                    new FabricItemSettings().group(MoreWeaponryItemGroup.MORE_WEAPONRY)));


    public static final Item NETHERITE_BATTLEAXE = registerItem("netherite_battleaxe",
            new ModBattleaxeItem((ToolMaterial) ModToolMaterial.OG_NETHERITE, 9, -3.3f,
                    new FabricItemSettings().group(MoreWeaponryItemGroup.MORE_WEAPONRY)));

    public static final Item DIAMOND_BATTLEAXE = registerItem("diamond_battleaxe",
            new ModBattleaxeItem((ToolMaterial) ModToolMaterial.OG_DIAMOND, 9, -3.3f,
                    new FabricItemSettings().group(MoreWeaponryItemGroup.MORE_WEAPONRY)));

    public static final Item GLIMMERING_HELMET = registerItem("glimmering_helmet",
            new ArmorItem(MoreWeaponryArmorMaterials.GLIMMERING_AMETHYST, EquipmentSlot.HEAD,
                    new FabricItemSettings().group(MoreWeaponryItemGroup.MORE_WEAPONRY)));
    public static final Item GLIMMERING_CHESTPLATE = registerItem("glimmering_chestplate",
            new ArmorItem(MoreWeaponryArmorMaterials.GLIMMERING_AMETHYST, EquipmentSlot.CHEST,
                    new FabricItemSettings().group(MoreWeaponryItemGroup.MORE_WEAPONRY)));
    public static final Item GLIMMERING_LEGGINGS = registerItem("glimmering_leggings",
            new ArmorItem(MoreWeaponryArmorMaterials.GLIMMERING_AMETHYST, EquipmentSlot.LEGS,
                    new FabricItemSettings().group(MoreWeaponryItemGroup.MORE_WEAPONRY)));
    public static final Item GLIMMERING_BOOTS = registerItem("glimmering_boots",
            new ArmorItem(MoreWeaponryArmorMaterials.GLIMMERING_AMETHYST, EquipmentSlot.FEET,
                    new FabricItemSettings().group(MoreWeaponryItemGroup.MORE_WEAPONRY)));

    public static final Item MOON_STONE_HELMET = registerItem("moon_stone_helmet",
            new ArmorItem(MoreWeaponryArmorMaterials.REFINED_MOON_STONE, EquipmentSlot.HEAD,
                    new FabricItemSettings().group(MoreWeaponryItemGroup.MORE_WEAPONRY)));
    public static final Item MOON_STONE_CHESTPLATE = registerItem("moon_stone_chestplate",
            new ArmorItem(MoreWeaponryArmorMaterials.REFINED_MOON_STONE, EquipmentSlot.CHEST,
                    new FabricItemSettings().group(MoreWeaponryItemGroup.MORE_WEAPONRY)));
    public static final Item MOON_STONE_LEGGINGS = registerItem("moon_stone_leggings",
            new ArmorItem(MoreWeaponryArmorMaterials.REFINED_MOON_STONE, EquipmentSlot.LEGS,
                    new FabricItemSettings().group(MoreWeaponryItemGroup.MORE_WEAPONRY)));
    public static final Item MOON_STONE_BOOTS = registerItem("moon_stone_boots",
            new ArmorItem(MoreWeaponryArmorMaterials.REFINED_MOON_STONE, EquipmentSlot.FEET,
                    new FabricItemSettings().group(MoreWeaponryItemGroup.MORE_WEAPONRY)));

    public static final Item BLACKSTONE_METAL_HELMET = registerItem("blackstone_metal_helmet",
            new ArmorItem(MoreWeaponryArmorMaterials.BLACKSTONE_METAL, EquipmentSlot.HEAD,
                    new FabricItemSettings().group(MoreWeaponryItemGroup.MORE_WEAPONRY)));
    public static final Item BLACKSTONE_METAL_CHESTPLATE = registerItem("blackstone_metal_chestplate",
            new ArmorItem(MoreWeaponryArmorMaterials.BLACKSTONE_METAL, EquipmentSlot.CHEST,
                    new FabricItemSettings().group(MoreWeaponryItemGroup.MORE_WEAPONRY)));
    public static final Item BLACKSTONE_METAL_LEGGINGS = registerItem("blackstone_metal_leggings",
            new ArmorItem(MoreWeaponryArmorMaterials.BLACKSTONE_METAL, EquipmentSlot.LEGS,
                    new FabricItemSettings().group(MoreWeaponryItemGroup.MORE_WEAPONRY)));
    public static final Item BLACKSTONE_METAL_BOOTS = registerItem("blackstone_metal_boots",
            new ArmorItem(MoreWeaponryArmorMaterials.BLACKSTONE_METAL, EquipmentSlot.FEET,
                    new FabricItemSettings().group(MoreWeaponryItemGroup.MORE_WEAPONRY)));

    public static final Item ELDER_GUARDIAN_SCALE_HELMET = registerItem("elder_guardian_scale_helmet",
            new ModElderScaleArmorItem(MoreWeaponryArmorMaterials.ELDER_GUARDIAN_SCALE, EquipmentSlot.HEAD,
                    new FabricItemSettings().group(MoreWeaponryItemGroup.MORE_WEAPONRY)));
    public static final Item ELDER_GUARDIAN_SCALE_CHESTPLATE = registerItem("elder_guardian_scale_chestplate",
            new ModElderScaleArmorItem(MoreWeaponryArmorMaterials.ELDER_GUARDIAN_SCALE, EquipmentSlot.CHEST,
                    new FabricItemSettings().group(MoreWeaponryItemGroup.MORE_WEAPONRY)));
    public static final Item ELDER_GUARDIAN_SCALE_LEGGINGS = registerItem("elder_guardian_scale_leggings",
            new ModElderScaleArmorItem(MoreWeaponryArmorMaterials.ELDER_GUARDIAN_SCALE, EquipmentSlot.LEGS,
                    new FabricItemSettings().group(MoreWeaponryItemGroup.MORE_WEAPONRY)));
    public static final Item ELDER_GUARDIAN_SCALE_BOOTS = registerItem("elder_guardian_scale_boots",
            new ModElderScaleArmorItem(MoreWeaponryArmorMaterials.ELDER_GUARDIAN_SCALE, EquipmentSlot.FEET,
                    new FabricItemSettings().group(MoreWeaponryItemGroup.MORE_WEAPONRY)));

    public static final Item ELDER_GUARDIAN_SCALE_SWORD = registerItem("elder_guardian_scale_sword",
            new ElderScaleSword((ToolMaterial) ModToolMaterial.ELDER_GUARDIAN_SCALE, 8, -2.4f,
                    new FabricItemSettings().group(MoreWeaponryItemGroup.MORE_WEAPONRY)));
    public static final Item ELDER_GUARDIAN_SCALE_SHOVEL = registerItem("elder_guardian_scale_shovel",
            new ElderScaleShovel((ToolMaterial) ModToolMaterial.ELDER_GUARDIAN_SCALE, 2, -3f,
                    new FabricItemSettings().group(MoreWeaponryItemGroup.MORE_WEAPONRY)));

    public static final Item ELDER_GUARDIAN_SCALE_PICKAXE = registerItem("elder_guardian_scale_pickaxe",
            new ElderScalePickaxe((ToolMaterial) ModToolMaterial.ELDER_GUARDIAN_SCALE, 5, -2.8f,
                    new FabricItemSettings().group(MoreWeaponryItemGroup.MORE_WEAPONRY)));
    public static final Item ELDER_GUARDIAN_SCALE_AXE = registerItem("elder_guardian_scale_axe",
            new ElderScaleAxe((ToolMaterial) ModToolMaterial.ELDER_GUARDIAN_SCALE, 12, -3f,
                    new FabricItemSettings().group(MoreWeaponryItemGroup.MORE_WEAPONRY)));
    public static final Item ELDER_GUARDIAN_SCALE_HOE = registerItem("elder_guardian_scale_hoe",
            new ElderScaleHoe((ToolMaterial) ModToolMaterial.ELDER_GUARDIAN_SCALE, 2, 0f,
                    new FabricItemSettings().group(MoreWeaponryItemGroup.MORE_WEAPONRY)));

    public static final Item ELDER_GUARDIAN_SCALE_BATTLEAXE = registerItem("elder_guardian_scale_battleaxe",
            new ElderScaleBattleaxe((ToolMaterial) ModToolMaterial.ELDER_GUARDIAN_SCALE, 12, -3.3f,
                    new FabricItemSettings().group(MoreWeaponryItemGroup.MORE_WEAPONRY)));

    public static final Item GUARDIAN_SCALE_HELMET = registerItem("guardian_scale_helmet",
            new ArmorItem(MoreWeaponryArmorMaterials.GUARDIAN_SCALE, EquipmentSlot.HEAD,
                    new FabricItemSettings().group(MoreWeaponryItemGroup.MORE_WEAPONRY)));
    public static final Item GUARDIAN_SCALE_CHESTPLATE = registerItem("guardian_scale_chestplate",
            new ArmorItem(MoreWeaponryArmorMaterials.GUARDIAN_SCALE, EquipmentSlot.CHEST,
                    new FabricItemSettings().group(MoreWeaponryItemGroup.MORE_WEAPONRY)));
    public static final Item GUARDIAN_SCALE_LEGGINGS = registerItem("guardian_scale_leggings",
            new ArmorItem(MoreWeaponryArmorMaterials.GUARDIAN_SCALE, EquipmentSlot.LEGS,
                    new FabricItemSettings().group(MoreWeaponryItemGroup.MORE_WEAPONRY)));
    public static final Item GUARDIAN_SCALE_BOOTS = registerItem("guardian_scale_boots",
            new ArmorItem(MoreWeaponryArmorMaterials.GUARDIAN_SCALE, EquipmentSlot.FEET,
                    new FabricItemSettings().group(MoreWeaponryItemGroup.MORE_WEAPONRY)));

    public static final Item GUARDIAN_SCALE_SWORD = registerItem("guardian_scale_sword",
            new SwordItem((ToolMaterial) ModToolMaterial.GUARDIAN_SCALE, 7, -2.4f,
                    new FabricItemSettings().group(MoreWeaponryItemGroup.MORE_WEAPONRY)));
    public static final Item GUARDIAN_SCALE_SHOVEL = registerItem("guardian_scale_shovel",
            new ShovelItem((ToolMaterial) ModToolMaterial.ELDER_GUARDIAN_SCALE, 1, -3f,
                    new FabricItemSettings().group(MoreWeaponryItemGroup.MORE_WEAPONRY)));

    public static final Item GUARDIAN_SCALE_PICKAXE = registerItem("guardian_scale_pickaxe",
            new ModPickaxeItem((ToolMaterial) ModToolMaterial.GUARDIAN_SCALE, 4, -2.8f,
                    new FabricItemSettings().group(MoreWeaponryItemGroup.MORE_WEAPONRY)));
    public static final Item GUARDIAN_SCALE_AXE = registerItem("guardian_scale_axe",
            new ModAxeItem((ToolMaterial) ModToolMaterial.GUARDIAN_SCALE, 9, -3f,
                    new FabricItemSettings().group(MoreWeaponryItemGroup.MORE_WEAPONRY)));
    public static final Item GUARDIAN_SCALE_HOE = registerItem("guardian_scale_hoe",
            new ModHoeItem((ToolMaterial) ModToolMaterial.GUARDIAN_SCALE, 1, 0f,
                    new FabricItemSettings().group(MoreWeaponryItemGroup.MORE_WEAPONRY)));

    public static final Item GUARDIAN_SCALE_BATTLEAXE = registerItem("guardian_scale_battleaxe",
            new ModBattleaxeItem((ToolMaterial) ModToolMaterial.GUARDIAN_SCALE, 11, -3.3f,
                    new FabricItemSettings().group(MoreWeaponryItemGroup.MORE_WEAPONRY)));

    public static final Item GLIMMERING_SHIELD = registerItem("glimmering_shield",
            new FabricShieldItem(new FabricItemSettings().maxDamage(1782).group(MoreWeaponryItemGroup.MORE_WEAPONRY), 20, 23, MoreWeaponryItems.GLIMMERING_AMETHYST));

    public static final Item BLACKSTONE_METAL_SHIELD = registerItem("blackstone_metal_shield",
            new FabricShieldItem(new FabricItemSettings().maxDamage(2476).group(MoreWeaponryItemGroup.MORE_WEAPONRY), 10, 17, MoreWeaponryItems.BLACKSTONE_INGOT));

    public static final Item MOON_STONE_SHIELD = registerItem("moon_stone_shield",
            new FabricShieldItem(new FabricItemSettings().maxDamage(2006).group(MoreWeaponryItemGroup.MORE_WEAPONRY), 15, 19, MoreWeaponryItems.REFINED_MOON_STONE));

    public static final Item GUARDIAN_SCALE_SHIELD = registerItem("guardian_scale_shield",
            new FabricShieldItem(new FabricItemSettings().maxDamage(2938).group(MoreWeaponryItemGroup.MORE_WEAPONRY), 8, 17, MoreWeaponryItems.GUARDIAN_SCALE));

    public static final Item ELDER_SCALE_SHIELD  = registerItem("elder_scale_shield",
            new FabricShieldItem(new FabricItemSettings().maxDamage(3276).group(MoreWeaponryItemGroup.MORE_WEAPONRY), 7, 18, MoreWeaponryItems.ELDER_GUARDIAN_SCALE));

    public static final Item ELDER_SCALE_ARTIFACT = registerItem("elder_scale_artifact",
            new ElderScaleArtifactItem((ToolMaterial) ModToolMaterial.ELDER_GUARDIAN_SCALE, 15, -2.9f,
                    new FabricItemSettings().group(MoreWeaponryItemGroup.MORE_WEAPONRY)));

    public static final Item GOLDEN_KNIFE = registerItem("golden_knife",
            new ModKnifeItem((ToolMaterial) ModToolMaterial.OG_GOLD, 2, -1f,
                    new FabricItemSettings().group(MoreWeaponryItemGroup.MORE_WEAPONRY)));

    public static final Item STONE_KNIFE = registerItem("stone_knife",
            new ModKnifeItem((ToolMaterial) ModToolMaterial.OG_STONE, 2, -1f,
                    new FabricItemSettings().group(MoreWeaponryItemGroup.MORE_WEAPONRY)));

    public static final Item IRON_KNIFE = registerItem("iron_knife",
            new ModKnifeItem((ToolMaterial) ModToolMaterial.OG_IRON, 3, -1f,
                    new FabricItemSettings().group(MoreWeaponryItemGroup.MORE_WEAPONRY)));

    public static final Item DIAMOND_KNIFE = registerItem("diamond_knife",
            new ModKnifeItem((ToolMaterial) ModToolMaterial.OG_DIAMOND, 4, -1f,
                    new FabricItemSettings().group(MoreWeaponryItemGroup.MORE_WEAPONRY)));

    public static final Item WOODEN_KNIFE = registerItem("wooden_knife",
            new ModKnifeItem((ToolMaterial) ModToolMaterial.OG_WOOD, 1, -1f,
                    new FabricItemSettings().group(MoreWeaponryItemGroup.MORE_WEAPONRY)));

    public static final Item NETHERITE_KNIFE = registerItem("netherite_knife",
            new ModKnifeItem((ToolMaterial) ModToolMaterial.OG_NETHERITE, 5, -1f,
                    new FabricItemSettings().group(MoreWeaponryItemGroup.MORE_WEAPONRY)));

    public static final Item REFINED_MOON_KNIFE = registerItem("refined_moon_knife",
            new ModKnifeItem((ToolMaterial) ModToolMaterial.REFINED_MOON_STONE, 3, -1f,
                    new FabricItemSettings().group(MoreWeaponryItemGroup.MORE_WEAPONRY)));

    public static final Item GLIMMERED_AMETHYST_KNIFE = registerItem("glimmered_amethyst_knife",
            new ModKnifeItem((ToolMaterial) ModToolMaterial.GLIMMERING_AMETHYST, 2, -1f,
                    new FabricItemSettings().group(MoreWeaponryItemGroup.MORE_WEAPONRY)));

    public static final Item BLACKSTONE_METAL_KNIFE = registerItem("blackstone_metal_knife",
            new ModKnifeItem((ToolMaterial) ModToolMaterial.BLACKSTONE_METAL, 6, -1f,
                    new FabricItemSettings().group(MoreWeaponryItemGroup.MORE_WEAPONRY)));

    public static final Item GUARDIAN_SCALE_KNIFE = registerItem("guardian_scale_knife",
            new ModKnifeItem((ToolMaterial) ModToolMaterial.GUARDIAN_SCALE, 7, -1f,
                    new FabricItemSettings().group(MoreWeaponryItemGroup.MORE_WEAPONRY)));

    public static final Item ELDER_GUARDIAN_SCALE_KNIFE = registerItem("elder_guardian_scale_knife",
            new ModKnifeItem((ToolMaterial) ModToolMaterial.ELDER_GUARDIAN_SCALE, 8, -1f,
                    new FabricItemSettings().group(MoreWeaponryItemGroup.MORE_WEAPONRY)));

    public static final Item GOLDEN_BATTLEAXE = registerItem("golden_battleaxe",
            new ModBattleaxeItem((ToolMaterial) ModToolMaterial.OG_GOLD, 3, -3.3f,
                    new FabricItemSettings().group(MoreWeaponryItemGroup.MORE_WEAPONRY)));

    public static final Item WOODEN_BATTLEAXE = registerItem("wooden_battleaxe",
            new ModBattleaxeItem((ToolMaterial) ModToolMaterial.OG_WOOD, 1, -3.3f,
                    new FabricItemSettings().group(MoreWeaponryItemGroup.MORE_WEAPONRY)));

    public static final Item STONE_BATTLEAXE = registerItem("stone_battleaxe",
            new ModBattleaxeItem((ToolMaterial) ModToolMaterial.OG_STONE, 2, -3.3f,
                    new FabricItemSettings().group(MoreWeaponryItemGroup.MORE_WEAPONRY)));

    public static final Item IRON_BATTLEAXE = registerItem("iron_battleaxe",
            new ModBattleaxeItem((ToolMaterial) ModToolMaterial.OG_IRON, 4, -3.3f,
                    new FabricItemSettings().group(MoreWeaponryItemGroup.MORE_WEAPONRY)));

    public static final Item CIRTICT_BATTLEAXE = registerItem("cirtict_battleaxe",
            new ModBattleaxeItem((ToolMaterial) ModToolMaterial.CIRTICT, 12, -3.3f,
                    new FabricItemSettings().group(MoreWeaponryItemGroup.MORE_WEAPONRY)));

    public static final Item HEATED_CIRTICT_BATTLEAXE = registerItem("heated_cirtict_battleaxe",
            new HeatedCirtictBattleaxe((ToolMaterial) ModToolMaterial.HEATED_CIRTICT, 13, -3.3f,
                    new FabricItemSettings().group(MoreWeaponryItemGroup.MORE_WEAPONRY)));

    public static final Item COOLED_CIRTICT_BATTLEAXE = registerItem("cooled_cirtict_battleaxe",
            new CooledCirtictBattleaxe((ToolMaterial) ModToolMaterial.COOLED_CIRTICT, 13, -3.3f,
                    new FabricItemSettings().group(MoreWeaponryItemGroup.MORE_WEAPONRY)));

    public static final Item BLUESTONE_IGNITOR = registerItem("bluestone_ignitor",
            new BluestoneIgnitor(new FabricItemSettings().group(MoreWeaponryItemGroup.MORE_WEAPONRY)));

    public static final Item BLUESTONE_ROCK = registerItem("bluestone_rock",
            new Item(new FabricItemSettings().group(MoreWeaponryItemGroup.MORE_WEAPONRY)));

    public static final Item CIRTICT_SCRAP = registerItem("cirtict_scrap",
            new Item(new FabricItemSettings().group(MoreWeaponryItemGroup.MORE_WEAPONRY)));

    public static final Item COOLED_CIRTICT_INGOT = registerItem("cooled_cirtict_ingot",
            new CooledCirtictIngot(new FabricItemSettings().group(MoreWeaponryItemGroup.MORE_WEAPONRY)));

    public static final Item WARDENS_STEP_MUSIC_DISC = registerItem("wardens_step_music_disc",
            new MoreWeaponryMusicDiscItem(9, MoreWeaponrySounds.WARDENS_STEP,
                    new FabricItemSettings().maxCount(1).group(MoreWeaponryItemGroup.MORE_WEAPONRY)));

    public static final Item FRODON_SIGN = registerItem("frodon_sign",
            new SignItem(new FabricItemSettings().group(MoreWeaponryItemGroup.MORE_WEAPONRY).maxCount(16),
                    MoreWeaponryBlocks.FRODON_SIGN, MoreWeaponryBlocks.FRODON_WALL_SIGN));

    public static final Item DRAGON_SCALE = registerItem("dragon_scale",
            new Item(new FabricItemSettings().group(MoreWeaponryItemGroup.MORE_WEAPONRY)));

    public static final Item SHULKER_SHELL_BOOTS = registerItem("shulker_shell_boots",
            new ShulkerShellBoots(MoreWeaponryArmorMaterials.SHULKER_SHELL, EquipmentSlot.FEET,
                    new FabricItemSettings().group(MoreWeaponryItemGroup.MORE_WEAPONRY)));

    public static final Item WITHER_BROAD_HAMMER = registerItem("wither_broad_hammer",
            new WitherBroadHammerItem((ToolMaterial) ModToolMaterial.WITHERED, 24, -3.0f,
                    new FabricItemSettings().group(MoreWeaponryItemGroup.MORE_WEAPONRY)));

    public static final Item WITHERING_HANDLE = registerItem("withering_handle",
            new ModHandleItem(new FabricItemSettings().group(MoreWeaponryItemGroup.MORE_WEAPONRY)));

    public static final Item WITHER_BROAD_HAMMER_HEAD = registerItem("wither_broad_hammer_head",
            new Item(new FabricItemSettings().maxCount(1).group(MoreWeaponryItemGroup.MORE_WEAPONRY)));

    public static final Item HEATED_CIRTICT_INGOT = registerItem("heated_cirtict_ingot",
            new HeatedCirtictIngot(new FabricItemSettings().group(MoreWeaponryItemGroup.MORE_WEAPONRY)));

    public static final Item COOLED_CIRTICT_SWORD = registerItem("cooled_cirtict_sword",
            new CooledCirtictSword((ToolMaterial) ModToolMaterial.COOLED_CIRTICT, 15, -2.4f,
                    new FabricItemSettings().group(MoreWeaponryItemGroup.MORE_WEAPONRY)));

    public static final Item COOLED_CIRTICT_AXE = registerItem("cooled_cirtict_axe",
            new CooledCirtictAxe((ToolMaterial) ModToolMaterial.COOLED_CIRTICT, 18, -3f,
                    new FabricItemSettings().group(MoreWeaponryItemGroup.MORE_WEAPONRY)));

    public static final Item COOLED_CIRTICT_HOE = registerItem("cooled_cirtict_hoe",
            new CooledCirtictHoe((ToolMaterial) ModToolMaterial.COOLED_CIRTICT, 2, 0f,
                    new FabricItemSettings().group(MoreWeaponryItemGroup.MORE_WEAPONRY)));

    public static final Item COOLED_CIRTICT_PICKAXE = registerItem("cooled_cirtict_pickaxe",
            new CooledCirtictPickaxe((ToolMaterial) ModToolMaterial.COOLED_CIRTICT, 6, -2.8f,
                    new FabricItemSettings().group(MoreWeaponryItemGroup.MORE_WEAPONRY)));

    public static final Item COOLED_CIRTICT_SHOVEL = registerItem("cooled_cirtict_shovel",
            new CooledCirtictShovel((ToolMaterial) ModToolMaterial.COOLED_CIRTICT, 5, -3f,
                    new FabricItemSettings().group(MoreWeaponryItemGroup.MORE_WEAPONRY)));

    public static final Item COOLED_CIRTICT_KNIFE = registerItem("cooled_cirtict_knife",
            new CooledCirtictKnife((ToolMaterial) ModToolMaterial.COOLED_CIRTICT, 10, -1f,
                    new FabricItemSettings().group(MoreWeaponryItemGroup.MORE_WEAPONRY)));

    public static final Item HEATED_CIRTICT_SWORD = registerItem("heated_cirtict_sword",
            new HeatedCirtictSword((ToolMaterial) ModToolMaterial.HEATED_CIRTICT, 15, -2.4f,
                    new FabricItemSettings().group(MoreWeaponryItemGroup.MORE_WEAPONRY)));

    public static final Item HEATED_CIRTICT_AXE = registerItem("heated_cirtict_axe",
            new HeatedCirtictAxe((ToolMaterial) ModToolMaterial.HEATED_CIRTICT, 18, -3f,
                    new FabricItemSettings().group(MoreWeaponryItemGroup.MORE_WEAPONRY)));

    public static final Item HEATED_CIRTICT_HOE = registerItem("heated_cirtict_hoe",
            new HeatedCirtictHoe((ToolMaterial) ModToolMaterial.HEATED_CIRTICT, 2, 0f,
                    new FabricItemSettings().group(MoreWeaponryItemGroup.MORE_WEAPONRY)));

    public static final Item HEATED_CIRTICT_PICKAXE = registerItem("heated_cirtict_pickaxe",
            new HeatedCirtictPickaxe((ToolMaterial) ModToolMaterial.HEATED_CIRTICT, 6, -2.8f,
                    new FabricItemSettings().group(MoreWeaponryItemGroup.MORE_WEAPONRY)));

    public static final Item HEATED_CIRTICT_SHOVEL = registerItem("heated_cirtict_shovel",
            new HeatedCirtictShovel((ToolMaterial) ModToolMaterial.HEATED_CIRTICT, 5, -3f,
                    new FabricItemSettings().group(MoreWeaponryItemGroup.MORE_WEAPONRY)));

    public static final Item HEATED_CIRTICT_KNIFE = registerItem("heated_cirtict_knife",
            new HeatedCirtictKnife((ToolMaterial) ModToolMaterial.HEATED_CIRTICT, 10, -1f,
                    new FabricItemSettings().group(MoreWeaponryItemGroup.MORE_WEAPONRY)));

    public static final Item CIRTICT_SWORD = registerItem("cirtict_sword",
            new SwordItem((ToolMaterial) ModToolMaterial.CIRTICT, 13, -2.4f,
                    new FabricItemSettings().group(MoreWeaponryItemGroup.MORE_WEAPONRY)));

    public static final Item CIRTICT_AXE = registerItem("cirtict_axe",
            new ModAxeItem((ToolMaterial) ModToolMaterial.CIRTICT, 16, -3f,
                    new FabricItemSettings().group(MoreWeaponryItemGroup.MORE_WEAPONRY)));

    public static final Item CIRTICT_HOE = registerItem("cirtict_hoe",
            new ModHoeItem((ToolMaterial) ModToolMaterial.CIRTICT, 1, 0f,
                    new FabricItemSettings().group(MoreWeaponryItemGroup.MORE_WEAPONRY)));

    public static final Item CIRTICT_PICKAXE = registerItem("cirtict_pickaxe",
            new ModPickaxeItem((ToolMaterial) ModToolMaterial.CIRTICT, 5, -2.8f,
                    new FabricItemSettings().group(MoreWeaponryItemGroup.MORE_WEAPONRY)));

    public static final Item CIRTICT_SHOVEL = registerItem("cirtict_shovel",
            new ShovelItem((ToolMaterial) ModToolMaterial.CIRTICT, 4, -3f,
                    new FabricItemSettings().group(MoreWeaponryItemGroup.MORE_WEAPONRY)));

    public static final Item CIRTICT_KNIFE = registerItem("cirtict_knife",
            new ModKnifeItem((ToolMaterial) ModToolMaterial.CIRTICT, 9, -1f,
                    new FabricItemSettings().group(MoreWeaponryItemGroup.MORE_WEAPONRY)));

    public static final Item COOLED_CIRTICT_SHIELD  = registerItem("cooled_cirtict_shield",
            new CooledCirtictShield(new FabricItemSettings().maxDamage(3583).group(MoreWeaponryItemGroup.MORE_WEAPONRY), 6, 16, MoreWeaponryItems.COOLED_CIRTICT_INGOT));

    public static final Item HEATED_CIRTICT_SHIELD  = registerItem("heated_cirtict_shield",
            new HeatedCirtictShield(new FabricItemSettings().maxDamage(3583).group(MoreWeaponryItemGroup.MORE_WEAPONRY), 6, 16, MoreWeaponryItems.HEATED_CIRTICT_INGOT));

    public static final Item CIRTICT_SHIELD  = registerItem("cirtict_shield",
            new FabricShieldItem(new FabricItemSettings().maxDamage(3456).group(MoreWeaponryItemGroup.MORE_WEAPONRY), 6, 17, MoreWeaponryItems.CIRTICT_INGOT));

    public static final Item CIRTICT_NUGGET = registerItem("cirtict_nugget",
            new Item(new FabricItemSettings().group(MoreWeaponryItemGroup.MORE_WEAPONRY)));

    public static final Item HEATED_CIRTICT_NUGGET = registerItem("heated_cirtict_nugget",
            new HeatedCirtictNugget(new FabricItemSettings().group(MoreWeaponryItemGroup.MORE_WEAPONRY)));

    public static final Item COOLED_CIRTICT_NUGGET = registerItem("cooled_cirtict_nugget",
            new CooledCirtictNugget(new FabricItemSettings().group(MoreWeaponryItemGroup.MORE_WEAPONRY)));



    // Plague Update

    public static final Item ENDICATE_STAFF = registerItem("endicate_staff",
            new EndicateStaffItem((ToolMaterial) ModToolMaterial.ENDICATE_STAFF, 24, -3.4f,
                    new FabricItemSettings().group(MoreWeaponryItemGroup.MORE_WEAPONRY)));

    public static final Item ENDICATE_HANDLE = registerItem("endicate_handle",
            new ModHandleItem(new FabricItemSettings().group(MoreWeaponryItemGroup.MORE_WEAPONRY)));

    public static final Item SANDSTONE_DUST = registerItem("sandstone_dust",
            new Item(new FabricItemSettings().group(MoreWeaponryItemGroup.MORE_WEAPONRY)));

    public static final Item WRETCHED_ESSENCE = registerItem("wretched_essence",
            new Item(new FabricItemSettings().group(MoreWeaponryItemGroup.MORE_WEAPONRY)));

    public static final Item WRETCHED_CORE = registerItem("wretched_core",
            new WretchedCoreItem(new FabricItemSettings().maxCount(1).group(MoreWeaponryItemGroup.MORE_WEAPONRY)));
    public static final Item WATCHER_CORE = registerItem("watcher_core",
            new WatcherCoreItem(new FabricItemSettings().maxCount(1).group(MoreWeaponryItemGroup.MORE_WEAPONRY)));
    public static final Item MAIDEN_CORE = registerItem("maiden_core",
            new MaidenCoreItem(new FabricItemSettings().maxCount(1).group(MoreWeaponryItemGroup.MORE_WEAPONRY)));
    public static final Item PLAGUED_CORE = registerItem("plagued_core",
            new PlaguedCoreItem(new FabricItemSettings().maxCount(1).group(MoreWeaponryItemGroup.MORE_WEAPONRY)));
    public static final Item SUPPRESSED_CORE = registerItem("suppressed_core",
            new SuppressedCoreItem(new FabricItemSettings().maxCount(1).group(MoreWeaponryItemGroup.MORE_WEAPONRY)));

    public static final Item MOB_CORE = registerItem("mob_core",
            new EmptyCoreItem(new FabricItemSettings().maxCount(1).group(MoreWeaponryItemGroup.MORE_WEAPONRY)));

    public static final Item CHARGED_MOB_CORE = registerItem("charged_mob_core",
            new ChargedMobCoreItem(new FabricItemSettings().maxCount(1).group(MoreWeaponryItemGroup.MORE_WEAPONRY)));

    public static final Item ESSENCE_CIRTICT_AXE = registerItem("essence_cirtict_axe",
            new EssenceCirtictAxe((ToolMaterial) ModToolMaterial.ESSENCE_CIRTICT, 25, -3f,
                    new FabricItemSettings().group(MoreWeaponryItemGroup.MORE_WEAPONRY)));

    public static final Item ESSENCE_CIRTICT_PICKAXE = registerItem("essence_cirtict_pickaxe",
            new EssenceCirtictPickaxe((ToolMaterial) ModToolMaterial.ESSENCE_CIRTICT, 7, -2.8f,
                    new FabricItemSettings().group(MoreWeaponryItemGroup.MORE_WEAPONRY)));

    public static final Item ESSENCE_CIRTICT_SWORD = registerItem("essence_cirtict_sword",
            new EssenceCirtictSword((ToolMaterial) ModToolMaterial.ESSENCE_CIRTICT, 21, -2.4f,
                    new FabricItemSettings().group(MoreWeaponryItemGroup.MORE_WEAPONRY)));

    public static final Item ESSENCE_CIRTICT_SHOVEL = registerItem("essence_cirtict_shovel",
            new EssenceCirtictShovel((ToolMaterial) ModToolMaterial.ESSENCE_CIRTICT, 8, -3f,
                    new FabricItemSettings().group(MoreWeaponryItemGroup.MORE_WEAPONRY)));

    public static final Item ESSENCE_CIRTICT_KNIFE = registerItem("essence_cirtict_knife",
            new EssenceCirtictKnife((ToolMaterial) ModToolMaterial.ESSENCE_CIRTICT, 11, -1f,
                    new FabricItemSettings().group(MoreWeaponryItemGroup.MORE_WEAPONRY)));

    public static final Item ESSENCE_CIRTICT_HOE = registerItem("essence_cirtict_hoe",
            new EssenceCirtictHoe((ToolMaterial) ModToolMaterial.ESSENCE_CIRTICT, 4, 0f,
                    new FabricItemSettings().group(MoreWeaponryItemGroup.MORE_WEAPONRY)));

    public static final Item ESSENCE_CIRTICT_BATTLEAXE = registerItem("essence_cirtict_battleaxe",
            new EssenceCirtictBattleaxe((ToolMaterial) ModToolMaterial.ESSENCE_CIRTICT, 14, -3.3f,
                    new FabricItemSettings().group(MoreWeaponryItemGroup.MORE_WEAPONRY)));

    public static final Item POWERED_WRETCHED_MOB_CORE = registerItem("powered_wretched_mob_core",
            new PoweredWretchedItem(new FabricItemSettings().maxCount(1).group(MoreWeaponryItemGroup.MORE_WEAPONRY)));
    public static final Item POWERED_WATCHER_MOB_CORE = registerItem("powered_watcher_mob_core",
            new PoweredWickedItem(new FabricItemSettings().maxCount(1).group(MoreWeaponryItemGroup.MORE_WEAPONRY)));
    public static final Item POWERED_MAIDEN_MOB_CORE = registerItem("powered_maiden_mob_core",
            new PoweredMaidenItem(new FabricItemSettings().maxCount(1).group(MoreWeaponryItemGroup.MORE_WEAPONRY)));
    public static final Item POWERED_PLAGUED_MOB_CORE = registerItem("powered_plagued_mob_core",
            new PoweredPlaguedItem(new FabricItemSettings().maxCount(1).group(MoreWeaponryItemGroup.MORE_WEAPONRY)));
    public static final Item POWERED_SUPPRESSED_MOB_CORE = registerItem("powered_suppressed_mob_core",
            new PoweredSuppressedItem(new FabricItemSettings().maxCount(1).group(MoreWeaponryItemGroup.MORE_WEAPONRY)));


    public static final Item WATCHER_ESSENCE_CIRTICT_AXE = registerItem("watcher_essence_cirtict_axe",
            new WatcherAxe((ToolMaterial) ModToolMaterial.ESSENCE_CIRTICT, 25, -3f,
                    new FabricItemSettings().group(MoreWeaponryItemGroup.MORE_WEAPONRY)));

    public static final Item WATCHER_ESSENCE_CIRTICT_PICKAXE = registerItem("watcher_essence_cirtict_pickaxe",
            new WatcherPickaxe((ToolMaterial) ModToolMaterial.ESSENCE_CIRTICT, 7, -2.8f,
                    new FabricItemSettings().group(MoreWeaponryItemGroup.MORE_WEAPONRY)));

    public static final Item WATCHER_ESSENCE_CIRTICT_SWORD = registerItem("watcher_essence_cirtict_sword",
            new WatcherSword((ToolMaterial) ModToolMaterial.ESSENCE_CIRTICT, 21, -2.4f,
                    new FabricItemSettings().group(MoreWeaponryItemGroup.MORE_WEAPONRY)));

    public static final Item WATCHER_ESSENCE_CIRTICT_SHOVEL = registerItem("watcher_essence_cirtict_shovel",
            new WatcherShovel((ToolMaterial) ModToolMaterial.ESSENCE_CIRTICT, 8, -3f,
                    new FabricItemSettings().group(MoreWeaponryItemGroup.MORE_WEAPONRY)));

    public static final Item WATCHER_ESSENCE_CIRTICT_KNIFE = registerItem("watcher_essence_cirtict_knife",
            new WatcherKnife((ToolMaterial) ModToolMaterial.ESSENCE_CIRTICT, 12, -1f,
                    new FabricItemSettings().group(MoreWeaponryItemGroup.MORE_WEAPONRY)));

    public static final Item WATCHER_ESSENCE_CIRTICT_HOE = registerItem("watcher_essence_cirtict_hoe",
            new WatcherHoe((ToolMaterial) ModToolMaterial.ESSENCE_CIRTICT, 4, 0f,
                    new FabricItemSettings().group(MoreWeaponryItemGroup.MORE_WEAPONRY)));

    public static final Item WATCHER_ESSENCE_CIRTICT_BATTLEAXE = registerItem("watcher_essence_cirtict_battleaxe",
            new WatcherBattleaxe((ToolMaterial) ModToolMaterial.ESSENCE_CIRTICT, 15, -3.3f,
                    new FabricItemSettings().group(MoreWeaponryItemGroup.MORE_WEAPONRY)));


    public static final Item MAIDEN_ESSENCE_CIRTICT_AXE = registerItem("maiden_essence_cirtict_axe",
            new MaidenAxe((ToolMaterial) ModToolMaterial.ESSENCE_CIRTICT, 25, -3f,
                    new FabricItemSettings().group(MoreWeaponryItemGroup.MORE_WEAPONRY)));

    public static final Item MAIDEN_ESSENCE_CIRTICT_PICKAXE = registerItem("maiden_essence_cirtict_pickaxe",
            new MaidenPickaxe((ToolMaterial) ModToolMaterial.ESSENCE_CIRTICT, 7, -2.8f,
                    new FabricItemSettings().group(MoreWeaponryItemGroup.MORE_WEAPONRY)));

    public static final Item MAIDEN_ESSENCE_CIRTICT_SWORD = registerItem("maiden_essence_cirtict_sword",
            new MaidenSword((ToolMaterial) ModToolMaterial.ESSENCE_CIRTICT, 21, -2.4f,
                    new FabricItemSettings().group(MoreWeaponryItemGroup.MORE_WEAPONRY)));

    public static final Item MAIDEN_ESSENCE_CIRTICT_SHOVEL = registerItem("maiden_essence_cirtict_shovel",
            new MaidenShovel((ToolMaterial) ModToolMaterial.ESSENCE_CIRTICT, 8, -3f,
                    new FabricItemSettings().group(MoreWeaponryItemGroup.MORE_WEAPONRY)));

    public static final Item MAIDEN_ESSENCE_CIRTICT_KNIFE = registerItem("maiden_essence_cirtict_knife",
            new MaidenKnife((ToolMaterial) ModToolMaterial.ESSENCE_CIRTICT, 12, -1f,
                    new FabricItemSettings().group(MoreWeaponryItemGroup.MORE_WEAPONRY)));

    public static final Item MAIDEN_ESSENCE_CIRTICT_HOE = registerItem("maiden_essence_cirtict_hoe",
            new MaidenHoe((ToolMaterial) ModToolMaterial.ESSENCE_CIRTICT, 4, 0f,
                    new FabricItemSettings().group(MoreWeaponryItemGroup.MORE_WEAPONRY)));

    public static final Item MAIDEN_ESSENCE_CIRTICT_BATTLEAXE = registerItem("maiden_essence_cirtict_battleaxe",
            new MaidenBattleaxe((ToolMaterial) ModToolMaterial.ESSENCE_CIRTICT, 15, -3.3f,
                    new FabricItemSettings().group(MoreWeaponryItemGroup.MORE_WEAPONRY)));

    public static final Item LEECHING_ESSENCE = registerItem("leeching_essence",
            new Item(new FabricItemSettings().group(MoreWeaponryItemGroup.MORE_WEAPONRY)));

    public static final Item WATCHER_HELMET = registerItem("watcher_helmet",
            new ArmorItem(MoreWeaponryArmorMaterials.ENDER, EquipmentSlot.HEAD,
                    new FabricItemSettings().group(MoreWeaponryItemGroup.MORE_WEAPONRY)));

    public static final Item WATCHER_CHESTPLATE = registerItem("watcher_chestplate",
            new ArmorItem(MoreWeaponryArmorMaterials.ENDER, EquipmentSlot.CHEST,
                    new FabricItemSettings().group(MoreWeaponryItemGroup.MORE_WEAPONRY)));

    public static final Item WATCHER_STAFF = registerItem("watcher_staff",
            new WatcherStaffItem((ToolMaterial) ModToolMaterial.WATCHER_STAFF, 26, -3.1f,
                    new FabricItemSettings().group(MoreWeaponryItemGroup.MORE_WEAPONRY)));

    public static final Item MAIDENS_STEM_BOW = registerItem("maidens_stem_bow",
            new MaidensStemBowItem(new FabricItemSettings().group(MoreWeaponryItemGroup.MORE_WEAPONRY).maxCount(1)));

    public static final Item WITHER_BONE_MEAL = registerItem("wither_bone_meal",
            new BoneMealItem(new FabricItemSettings().group(MoreWeaponryItemGroup.MORE_WEAPONRY)));

    public static final Item WATCHER_CLOTH = registerItem("watcher_cloth",
            new Item(new FabricItemSettings().group(MoreWeaponryItemGroup.MORE_WEAPONRY)));

    public static final Item MAIDEN_STEM = registerItem("maiden_stem",
            new Item(new FabricItemSettings().group(MoreWeaponryItemGroup.MORE_WEAPONRY)));

    public static final Item REINFORCED_BONE = registerItem("reinforced_bone",
            new Item(new FabricItemSettings().group(MoreWeaponryItemGroup.MORE_WEAPONRY)));

    public static final Item MELODIC_ESSENCE = registerItem("melodic_essence",
            new Item(new FabricItemSettings().group(MoreWeaponryItemGroup.MORE_WEAPONRY)));

    public static final Item EXPLOSIVE_ESSENCE = registerItem("explosive_essence",
            new Item(new FabricItemSettings().group(MoreWeaponryItemGroup.MORE_WEAPONRY)));

    public static final Item SUPPRESSED_ESSENCE_CIRTICT_AXE = registerItem("suppressed_essence_cirtict_axe",
            new SuppressedAxe((ToolMaterial) ModToolMaterial.ESSENCE_CIRTICT, 25, -3f,
                    new FabricItemSettings().group(MoreWeaponryItemGroup.MORE_WEAPONRY)));

    public static final Item SUPPRESSED_ESSENCE_CIRTICT_PICKAXE = registerItem("suppressed_essence_cirtict_pickaxe",
            new SuppressedPickaxe((ToolMaterial) ModToolMaterial.ESSENCE_CIRTICT, 7, -2.8f,
                    new FabricItemSettings().group(MoreWeaponryItemGroup.MORE_WEAPONRY)));

    public static final Item SUPPRESSED_ESSENCE_CIRTICT_SWORD = registerItem("suppressed_essence_cirtict_sword",
            new SuppressedSword((ToolMaterial) ModToolMaterial.ESSENCE_CIRTICT, 21, -2.4f,
                    new FabricItemSettings().group(MoreWeaponryItemGroup.MORE_WEAPONRY)));

    public static final Item SUPPRESSED_ESSENCE_CIRTICT_SHOVEL = registerItem("suppressed_essence_cirtict_shovel",
            new SuppressedShovel((ToolMaterial) ModToolMaterial.ESSENCE_CIRTICT, 8, -3f,
                    new FabricItemSettings().group(MoreWeaponryItemGroup.MORE_WEAPONRY)));

    public static final Item SUPPRESSED_ESSENCE_CIRTICT_KNIFE = registerItem("suppressed_essence_cirtict_knife",
            new SuppressedKnife((ToolMaterial) ModToolMaterial.ESSENCE_CIRTICT, 12, -1f,
                    new FabricItemSettings().group(MoreWeaponryItemGroup.MORE_WEAPONRY)));

    public static final Item SUPPRESSED_ESSENCE_CIRTICT_HOE = registerItem("suppressed_essence_cirtict_hoe",
            new SuppressedHoe((ToolMaterial) ModToolMaterial.ESSENCE_CIRTICT, 4, 0f,
                    new FabricItemSettings().group(MoreWeaponryItemGroup.MORE_WEAPONRY)));

    public static final Item SUPPRESSED_ESSENCE_CIRTICT_BATTLEAXE = registerItem("suppressed_essence_cirtict_battleaxe",
            new SuppressedBattleaxe((ToolMaterial) ModToolMaterial.ESSENCE_CIRTICT, 15, -3.3f,
                    new FabricItemSettings().group(MoreWeaponryItemGroup.MORE_WEAPONRY)));


    public static final Item PLAGUED_ESSENCE_CIRTICT_AXE = registerItem("plagued_essence_cirtict_axe",
            new PlaguedAxe((ToolMaterial) ModToolMaterial.ESSENCE_CIRTICT, 25, -3f,
                    new FabricItemSettings().group(MoreWeaponryItemGroup.MORE_WEAPONRY)));

    public static final Item PLAGUED_ESSENCE_CIRTICT_PICKAXE = registerItem("plagued_essence_cirtict_pickaxe",
            new PlaguedPickaxe((ToolMaterial) ModToolMaterial.ESSENCE_CIRTICT, 7, -2.8f,
                    new FabricItemSettings().group(MoreWeaponryItemGroup.MORE_WEAPONRY)));

    public static final Item PLAGUED_ESSENCE_CIRTICT_SWORD = registerItem("plagued_essence_cirtict_sword",
            new PlaguedSword((ToolMaterial) ModToolMaterial.ESSENCE_CIRTICT, 21, -2.4f,
                    new FabricItemSettings().group(MoreWeaponryItemGroup.MORE_WEAPONRY)));

    public static final Item PLAGUED_ESSENCE_CIRTICT_SHOVEL = registerItem("plagued_essence_cirtict_shovel",
            new PlaguedShovel((ToolMaterial) ModToolMaterial.ESSENCE_CIRTICT, 8, -3f,
                    new FabricItemSettings().group(MoreWeaponryItemGroup.MORE_WEAPONRY)));

    public static final Item PLAGUED_ESSENCE_CIRTICT_KNIFE = registerItem("plagued_essence_cirtict_knife",
            new PlaguedKnife((ToolMaterial) ModToolMaterial.ESSENCE_CIRTICT, 12, -1f,
                    new FabricItemSettings().group(MoreWeaponryItemGroup.MORE_WEAPONRY)));

    public static final Item PLAGUED_ESSENCE_CIRTICT_HOE = registerItem("plagued_essence_cirtict_hoe",
            new PlaguedHoe((ToolMaterial) ModToolMaterial.ESSENCE_CIRTICT, 4, 0f,
                    new FabricItemSettings().group(MoreWeaponryItemGroup.MORE_WEAPONRY)));

    public static final Item PLAGUED_ESSENCE_CIRTICT_BATTLEAXE = registerItem("plagued_essence_cirtict_battleaxe",
            new PlaguedBattleaxe((ToolMaterial) ModToolMaterial.ESSENCE_CIRTICT, 15, -3.3f,
                    new FabricItemSettings().group(MoreWeaponryItemGroup.MORE_WEAPONRY)));

    public static final Item WATCHER_SPAWN_EGG = registerItem("watcher_spawn_egg",
            new SpawnEggItem(MoreWeaponryEntities.WATCHER,0xC938FF, 0x420059,
                    new FabricItemSettings().group(MoreWeaponryItemGroup.MORE_WEAPONRY)));

    public static final Item LURKER_SPAWN_EGG = registerItem("lurker_spawn_egg",
            new SpawnEggItem(MoreWeaponryEntities.LURKER,0x271A2D, 0x3B2744,
                    new FabricItemSettings().group(MoreWeaponryItemGroup.MORE_WEAPONRY)));


    private static Item registerItem (String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(MoreWeaponry.MOD_ID, name), item);
    }

    public static void registerModItems() {
        MoreWeaponry.LOGGER.info("Registering Mod Items for " + MoreWeaponry.MOD_ID);
    }

}
