package cn.disputemc;

import cn.disputemc.block.bronze_block;
import cn.disputemc.item.itemCuprumAxe;
import cn.disputemc.item.mineral.itemalloybronze;
import cn.disputemc.utils.RecipeManagerTools;
import cn.nukkit.block.Block;
import cn.nukkit.entity.Entity;
import cn.nukkit.entity.provider.CustomClassEntityProvider;
import cn.nukkit.entity.provider.CustomEntityProvider;
import cn.nukkit.event.EventHandler;
import cn.nukkit.event.Listener;
import cn.nukkit.event.player.PlayerJoinEvent;
import cn.nukkit.item.Item;
import cn.nukkit.item.customitem.ItemCustom;
import cn.nukkit.plugin.PluginBase;
import cn.nukkit.plugin.PluginLogger;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

public class ancientcrafts extends PluginBase implements Listener {
    public static PluginLogger log;
    public static ancientcrafts instance;

    @Override
    public void onLoad(){
        instance = this;
        log = this.getLogger();
        try {
                Item.registerCustomItem(List.of(itemCuprumAxe.class, itemalloybronze.class));
                Block.registerCustomBlock(List.of(bronze_block.class));
                /**
                 * 设置自定义生物
                Entity.registerCustomEntity(new CustomClassEntityProvider());
                 */
        } catch (NoSuchMethodException | InstantiationException | IllegalAccessException |
                 InvocationTargetException e){
            log.info("远古工艺加载失败");

        }
    }
    @Override
    public void onEnable() {
        log.info("远古工艺加载成功");
        RecipeManagerTools.registerRecipeToServer(this, "recipes/");
        this.getServer().getPluginManager().registerEvents(this, this);
    }
    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent e) {
        var player = e.getPlayer();
        if (player.containTag("noUseStab")) {
            player.removeTag("noUseStab");
        }
    }
}
