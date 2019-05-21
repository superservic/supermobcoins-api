package me.swanis.mobcoins.profile;

import org.bukkit.entity.Player;

public abstract class Profile {

    public abstract Player getPlayer();

    public abstract int getMobCoins();

    public abstract void setMobCoins(int mobCoins);

}
