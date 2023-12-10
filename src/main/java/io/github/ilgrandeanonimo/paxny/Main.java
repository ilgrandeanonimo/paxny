package io.github.ilgrandeanonimo.paxny;

import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.events.session.ReadyEvent;
import net.dv8tion.jda.api.requests.GatewayIntent;
import net.dv8tion.jda.api.utils.cache.CacheFlag;

public class Main extends Paxny {
    Logger logger = new Logger();
    public static void main(String[] args) {
        JDABuilder builder = JDABuilder.createDefault("");
        builder.addEventListeners(new Main());
        builder.disableCache(CacheFlag.MEMBER_OVERRIDES, CacheFlag.VOICE_STATE);
        builder.setBulkDeleteSplittingEnabled(false);
        builder.enableIntents(GatewayIntent.MESSAGE_CONTENT);
        builder.setActivity(Activity.customStatus("Moderating"));
        builder.build();
    }

    @Override
    public void onReady(ReadyEvent event) {
        logger.info("Ciao");
    }
}