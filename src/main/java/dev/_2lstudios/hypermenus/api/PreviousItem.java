package dev._2lstudios.hypermenus.api;

import org.bukkit.entity.HumanEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryClickEvent;

import dev._2lstudios.hypermenus.HyperMenus;

public class PreviousItem extends MenuItem {
    private final HyperMenusAPI api;
    private final PageMenu pageMenu;

    public PreviousItem(final PageMenu pageMenu) {
        this.api = HyperMenus.getAPI();
        this.pageMenu = pageMenu;
    }

    @Override
    public void onClick(final InventoryClickEvent event) {
        final Menu nextMenu = pageMenu.getPrevMenu();

        if (nextMenu != null) {
            final HumanEntity humanEntity = event.getWhoClicked();

            if (humanEntity instanceof Player) {
                api.openMenu((Player) humanEntity, nextMenu);
            }
        }
    }
}
