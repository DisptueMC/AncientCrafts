package cn.disputemc.item.mineral;

import cn.nukkit.item.customitem.CustomItemDefinition;
import cn.nukkit.item.customitem.ItemCustom;
import cn.nukkit.item.customitem.data.ItemCreativeCategory;

public class itemalloybronze extends ItemCustom {
    public itemalloybronze(){
        super("yes:alloy_bronze",null,"alloy_bronze");
    }

    @Override
    public CustomItemDefinition getDefinition() {
        return CustomItemDefinition
                .simpleBuilder(this,ItemCreativeCategory.ITEMS)
                .allowOffHand(true)
                .handEquipped(true)
                .creativeGroup("itemGroup.name.bronze")
                .build();
    }
}
