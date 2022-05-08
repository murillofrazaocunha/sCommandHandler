package dev.johny.commandhandler.buttonhandler;


import net.dv8tion.jda.api.events.interaction.component.ButtonInteractionEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
/**
 * Evento ButtonInteraction Handler
 */
public abstract class ButtonHandler extends ListenerAdapter {

    public final String nome;
    public final String[] aliases;
    public final String desc;

    public ButtonHandler(String command, String desc, String... aliases) {
        this.nome = command;
        this.aliases = aliases;
        this.desc = desc;
    }

    public abstract void buttonexecute(ButtonInteractionEvent evt);

    public void onButtonInteraction(final ButtonInteractionEvent event) {
        if(event.getComponentId().equals(nome)) {
            this.buttonexecute(event);
        }
    }




}



