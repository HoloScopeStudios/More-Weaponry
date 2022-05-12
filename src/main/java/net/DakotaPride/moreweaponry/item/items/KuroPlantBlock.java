package net.DakotaPride.moreweaponry.item.items;

import net.DakotaPride.moreweaponry.MoreWeaponry;
import net.minecraft.block.CropBlock;
import net.minecraft.item.ItemConvertible;

public class KuroPlantBlock extends CropBlock {
    public KuroPlantBlock(Settings settings) {
        super(settings);
    }

    @Override
    protected ItemConvertible getSeedsItem() {
        return MoreWeaponry.KURO_SEEDS;
    }
}
