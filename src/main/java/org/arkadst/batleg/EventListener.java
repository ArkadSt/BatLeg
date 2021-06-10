package org.arkadst.batleg;

import net.kyori.adventure.text.Component;
import org.bukkit.Material;
import org.bukkit.entity.Bat;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class EventListener implements Listener {

    @EventHandler
    public void onEntityDeath(EntityDeathEvent event){
        if (event.getEntity() instanceof Bat){
            ItemStack bat_leg = new ItemStack(Material.BONE);
            ItemMeta bat_leg_meta = bat_leg.getItemMeta();
            bat_leg_meta.displayName(Component.text("bat leg"));
            bat_leg.setItemMeta(bat_leg_meta);
            event.getDrops().add(bat_leg);
        }
    }
}
