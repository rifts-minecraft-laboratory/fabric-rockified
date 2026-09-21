package fr.noahboos.rockified.events;

import fr.noahboos.rockified.Rockified;
import fr.noahboos.rockified.events.handlers.player.AfterBlockBreakEventHandler;

public class RockifiedEvents {
    public static void initialize() {
        Rockified.LOGGER.info("Registering {}'s events.", Rockified.MOD_ID);
        AfterBlockBreakEventHandler.register();
        Rockified.LOGGER.info("Registered {}'s events.", Rockified.MOD_ID);
    }
}
