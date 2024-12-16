package pegbass.alchemistsamulet;

import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;

public class AlchemistsAmuletPluginTest
{
	public static void main(String[] args) throws Exception
	{
		ExternalPluginManager.loadBuiltin(AlchemistsAmuletPlugin.class);
		RuneLite.main(args);
	}
}