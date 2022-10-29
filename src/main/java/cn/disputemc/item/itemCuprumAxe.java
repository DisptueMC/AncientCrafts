package cn.disputemc.item;

import cn.nukkit.item.Item;
import cn.nukkit.item.ItemSwordDiamond;
import cn.nukkit.item.customitem.CustomItemDefinition;
import cn.nukkit.item.customitem.ItemCustomTool;
import cn.nukkit.item.customitem.data.ItemCreativeCategory;

import java.util.List;

public class itemCuprumAxe extends ItemCustomTool  {
    public itemCuprumAxe(){
      super("yes:cuprum_axe",null,"cuprum_axe");

    }
    @Override
    public CustomItemDefinition getDefinition() {
        return CustomItemDefinition
                .toolBuilder(this, ItemCreativeCategory.EQUIPMENT)
                .addRepairItems(List.of(Item.fromString("minecraft:amethyst_shard")), 100)
                .addRepairItems(List.of(Item.fromString("yes:cuprum_axe")), 400)
                .speed(12)
                .creativeGroup("itemGroup.name.axe")
                .allowOffHand(true)
                .handEquipped(true)
                .build();
    }

    /**
     * 设置最大物品耐久
     * @return
     */
    @Override
    public int getMaxDurability() {

        return 500;
    }

    /**
     * 物品挖掘等级
     * @return
     */
    @Override
    public int getTier() {

        return ItemSwordDiamond.TIER_DIAMOND;
    }
    /**
     * 设置物品攻击伤害
     * @return
     */
    @Override
    public int getAttackDamage() {

        return 6;
    }
    /**
     * 设置物品附魔
     * @return
     */
    @Override
    public int getEnchantAbility() {

        return 22;
    }
    /**
     * 设置物品是否为工具
     * @return
     */
    @Override
    public boolean isAxe() {

        return true;
    }
}
