package io.github.ilgrandeanonimo.paxny;

import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import net.dv8tion.jda.api.requests.Method;
import okhttp3.Request;

public class IAMod extends ListenerAdapter{
    private String TOKEN = ""; // OpenAI Token (Just needed for authentication, ModerationAPI are FREE)
    @Override
    public void onMessageReceived(MessageReceivedEvent event) {
        // Not yet implemented
    }
}