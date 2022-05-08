package dev.johny.commandhandler.examples;

import dev.johny.commandhandler.messagehandler.MessageHandler;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;

public class MessageExample extends MessageHandler {
    public MessageExample() {
        super("ping", "Ping command", "!");
    }

    @Override
    public void execute(MessageReceivedEvent evt, String[] args) {
        evt.getChannel().sendMessage("Pong").queue();
    }
}
