package net.DakotaPride.moreweaponry.client.render.armor;

import net.DakotaPride.moreweaponry.common.item.items.BaseHornsItem;
import net.DakotaPride.moreweaponry.common.item.items.bard_tools.BardArmorItem;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class BaseHornsRenderer extends GeoArmorRenderer<BaseHornsItem> {
    public BaseHornsRenderer() {
        super(new BaseHornsModel());

        this.headBone = "armorHead";
        this.bodyBone = "armorBody";
        this.rightArmBone = "armorLeftArm";
        this.leftArmBone = "armorRightArm";
        this.rightLegBone = "armorLeftLeg";
        this.leftLegBone = "armorRightLeg";
        this.rightBootBone = "armorLeftBoot";
        this.leftBootBone = "armorRightBoot";
    }
}
