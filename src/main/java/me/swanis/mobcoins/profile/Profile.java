package me.swanis.mobcoins.profile;

import org.bukkit.entity.Player;

public abstract class Profile {

    public abstract Player getPlayer();

    public abstract long getMobCoins();

    public abstract void setMobCoins(long mobCoins);

}
