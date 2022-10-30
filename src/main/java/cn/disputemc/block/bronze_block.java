package cn.disputemc.block;

import cn.nukkit.Player;
import cn.nukkit.block.Block;
import cn.nukkit.block.customblock.CustomBlock;
import cn.nukkit.block.customblock.CustomBlockDefinition;
import cn.nukkit.item.Item;
import cn.nukkit.item.ItemTool;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class bronze_block extends Block implements CustomBlock {
    @Override
    public String getNamespaceId() {
        return "disputemc:bronze_block";
    }

    /**
     * 设置自定义方块
     * @return
     */
    @Override
    public CustomBlockDefinition getDefinition() {
        return CustomBlockDefinition
                .builder(this,"bronze_block")
                .build();
    }
    /**
     * 设置方块名称
     */
    @Override
    public String getName() {
        return CustomBlock.super.getName();
    }
    /**
     * 设置方块id
     */
    @Override
    public int getId() {
        return CustomBlock.super.getId();
    }

    /**
     * 控制方块是否燃烧
     *
     * 提供int数值
     * @return
     */
    @Override
    public int getBurnAbility(){
        return 0;
    }

    /**
     * 控制挖掘方块的工具类型
     *
     * 提供 ItemTool.XXX
     * @return
     */
    @Override
    public int getToolType(){
        return ItemTool.TYPE_PICKAXE;
    }
    /**
     * 控制方块摩擦力
     *
     * 提供double数值
     * 范围:0-1
     * @return
     */
    @Override
    public double getFrictionFactor() {
        return 0.8;
    }

    /**
     * 设置方块爆炸抗性
     *
     * 提供double数值
     * @return
     */
    @Override
    public double getResistance() {
        return 10;
    }

    /**
     * 设置方块透光度
     *
     * 提供int数值
     * @return
     */
    @Override
    public int getLightFilter() {
        return 0;
    }

    /**
     * 设置方块光照等级
     *
     * 提供int数值
     * 范围 0-15
     * @return
     */
    @Override
    public int getLightLevel() {
        return 0;
    }

    /**
     * 设置方块破坏时间
     *
     * 提供double数值
     * @return
     */
    @Override
    public double calculateBreakTime(@NotNull Item item, @Nullable Player player) {
        return 3;
    }
}
