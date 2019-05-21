package me.swanis.mobcoins.storage;

import org.bukkit.entity.Player;

public abstract class Storable {

    public abstract void init();

    public abstract void loadProfile(Player player);

    public abstract void saveProfile(Player player);

}
