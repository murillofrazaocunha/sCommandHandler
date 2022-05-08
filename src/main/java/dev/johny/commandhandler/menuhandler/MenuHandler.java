package dev.johny.commandhandler.menuhandler;


import net.dv8tion.jda.api.events.interaction.component.SelectMenuInteractionEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
/**
 * Evento SelectMenu Handler
 */
public abstract class MenuHandler extends ListenerAdapter {

    public final String nome;
    public final String[] aliases;
    public final String desc;

    public MenuHandler(String command, String desc, String... aliases) {
        this.nome = command;
        this.aliases = aliases;
        this.desc = desc;
    }

    public abstract void selectmenu(SelectMenuInteractionEvent evt);

    public void onSelectMenuInteraction(final SelectMenuInteractionEvent event) {
        if(event.getComponentId().equals(nome)) {
            this.selectmenu(event);
        }
    }




}



