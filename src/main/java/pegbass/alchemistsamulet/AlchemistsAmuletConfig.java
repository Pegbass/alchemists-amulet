package pegbass.alchemistsamulet;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

@ConfigGroup("example")
public interface AlchemistsAmuletConfig extends Config
{
	@ConfigItem(
		keyName = "infobox",
		name = "Show Infobox",
		description = "Show amulet charges in an infobox"
	)
	default boolean infobox()
	{
		return true;
	}
}
