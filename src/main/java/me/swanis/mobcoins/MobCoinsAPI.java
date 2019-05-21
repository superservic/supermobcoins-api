package me.swanis.mobcoins;

import me.swanis.mobcoins.chance.ChanceManager;
import me.swanis.mobcoins.profile.ProfileManager;
import me.swanis.mobcoins.reward.RewardManager;
import me.swanis.mobcoins.storage.Storable;
import org.bukkit.inventory.ItemStack;

public abstract class MobCoinsAPI {

    private static MobCoins instance;

    public static ProfileManager getProfileManager() {
        return instance.getProfileManager();
    }

    public static RewardManager getRewardManager() {
        return instance.getRewardManager();
    }

    public static ChanceManager getChanceManager() {
        return instance.getChanceManager();
    }

    public static Storable getStorage() {
        return instance.getStorage();
    }

    public static ItemStack getMobCoinItem() {
        return instance.getMobCoinItem();
    }
}
