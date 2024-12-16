package pegbass.alchemistsamulet;

import com.google.inject.Provides;
import javax.inject.Inject;
import lombok.extern.slf4j.Slf4j;
import net.runelite.api.Client;
import net.runelite.api.GameState;
import net.runelite.api.events.GameStateChanged;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;

@Slf4j
@PluginDescriptor(
	name = "Alchemist's Amulet"
)
public class AlchemistsAmuletPlugin extends Plugin
{
	@Inject
	private Client client;

	@Inject
	private AlchemistsAmuletConfig config;

	@Override
	protected void startUp() throws Exception
	{
		log.info("Alchemist's Amulet plugin started!");
	}

	@Override
	protected void shutDown() throws Exception
	{
		log.info("Alchemist's Amulet plugin stopped!");
	}

//	@Subscribe
//	public void onGameStateChanged(GameStateChanged gameStateChanged)
//	{
//		if (gameStateChanged.getGameState() == GameState.LOGGED_IN)
//		{
//			client.addChatMessage(ChatMessageType.GAMEMESSAGE, "", "Example says " + config.greeting(), null);
//		}
//	}

	@Provides
	AlchemistsAmuletConfig provideConfig(ConfigManager configManager)
	{
		return configManager.getConfig(AlchemistsAmuletConfig.class);
	}
}
