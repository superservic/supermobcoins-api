package me.swanis.mobcoins;

import me.swanis.mobcoins.chance.ChanceManager;
import me.swanis.mobcoins.profile.ProfileManager;
import me.swanis.mobcoins.reward.RewardManager;
import me.swanis.mobcoins.storage.Storable;
import org.bukkit.inventory.ItemStack;

public abstract class MobCoins {

    public abstract ProfileManager getProfileManager();

    public abstract RewardManager getRewardManager();

    public abstract ChanceManager getChanceManager();

    public abstract Storable getStorage();

    public abstract ItemStack getMobCoinItem();

}
