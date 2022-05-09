package dev.johny.commandhandler.examples;

import dev.johny.commandhandler.bothandler.BotHandler;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.OnlineStatus;
import net.dv8tion.jda.api.entities.Activity;

import javax.security.auth.login.LoginException;

public class BotExample extends BotHandler {
    public static JDA jda;
    public BotExample() {
        super("TOKEN", jda);
    }


    @Override
    public void enable() throws LoginException {
        jda = setupBot();
        jda.getPresence().setPresence(OnlineStatus.DO_NOT_DISTURB, Activity.playing("teste"));
    }


}
