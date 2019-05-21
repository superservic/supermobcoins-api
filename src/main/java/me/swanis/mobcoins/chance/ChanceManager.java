package me.swanis.mobcoins.chance;

import org.bukkit.entity.EntityType;

import java.util.Map;

public abstract class ChanceManager {

    public abstract DropChance getChance(EntityType entityType);

    public abstract void reloadChances();

    public abstract Map<EntityType, DropChance> getDropChances();

}
