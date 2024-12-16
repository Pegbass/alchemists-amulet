package pegbass.alchemistsamulet;

import java.awt.Graphics2D;
import javax.inject.Inject;
import net.runelite.api.ItemID;
import net.runelite.api.widgets.WidgetItem;
import net.runelite.client.ui.overlay.WidgetItemOverlay;

public class AlchemistsAmuletOverlay extends WidgetItemOverlay
{
	private final AlchemistsAmuletPlugin plugin;
	private final AlchemistsAmuletConfig config;

	@Inject
	AlchemistsAmuletOverlay(AlchemistsAmuletPlugin plugin, AlchemistsAmuletConfig config)
	{
		this.plugin = plugin;
		this.config = config;
		showOnEquipment();
		showOnInventory();
	}

	@Override
	public void renderItemOverlay(Graphics2D graphics, int itemId, WidgetItem item)
	{
		if (ItemID.ALCHEMISTS_AMULET != itemId) return;

	}
}
