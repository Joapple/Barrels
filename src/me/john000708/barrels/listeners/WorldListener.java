package me.john000708.barrels.listeners;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBurnEvent;

import me.john000708.barrels.Barrels;
import me.mrCookieSlime.Slimefun.api.BlockStorage;

/** Created by John on 14.05.2016. */
public class WorldListener implements Listener {
	
	public WorldListener() {
		Bukkit.getPluginManager().registerEvents(this, Barrels.plugin);
	}
	
	@EventHandler
	public static void onFireSpread(BlockBurnEvent e) {
		if(e.getBlock() == null) return;
		
		String id = BlockStorage.checkID(e.getBlock());
		if(id != null && id.startsWith("BARREL_")) e.setCancelled(true);
	}
}
