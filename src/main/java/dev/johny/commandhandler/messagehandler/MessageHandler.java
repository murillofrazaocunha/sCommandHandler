package dev.johny.commandhandler.messagehandler;


import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
/**
 * Evento MessageReceived Handler
 */
public abstract class MessageHandler extends ListenerAdapter {

    public final String nome;
    public final String[] aliases;
    public final String prefix;
    public final String desc;

    public MessageHandler(String command, String desc, String prefix, String... aliases) {
        this.nome = command;
        this.aliases = aliases;
        this.desc = desc;
        this.prefix = prefix;
    }





    public abstract void execute(MessageReceivedEvent evt, String[] args);




    @Override
    public void onMessageReceived(MessageReceivedEvent event) {
        String[] args = event.getMessage().getContentRaw().split(" ");
        if(args[0].equalsIgnoreCase(prefix + nome)){
            this.execute(event, args);
        }
    }



}



