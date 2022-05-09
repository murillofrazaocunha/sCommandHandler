package dev.johny.commandhandler.slashhandler;


import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import net.dv8tion.jda.api.interactions.commands.build.CommandData;

import java.util.Objects;
/**
 * Evento SlashCommandInteraction Handler
 */
public abstract class SlashHandler extends ListenerAdapter {

    public final String nome;
    public final String[] aliases;
    public final String desc;

    public SlashHandler(String command, String desc, String... aliases) {
        this.nome = command;
        this.aliases = aliases;
        this.desc = desc;
    }

    public abstract void executeSlash(SlashCommandInteractionEvent evt);
    /*
     * Usado para setar o slash no bot.
     */
    public abstract CommandData slashsetup();

    /*
    * Usado para obter um comando.
     */
    public SlashHandler getCommand(SlashHandler cmd) {
        return cmd;
    }

    public void onSlashCommandInteraction(final SlashCommandInteractionEvent event) {
        if(event.getName().equals(nome)) {
            this.executeSlash(event);
        }
        if (getAliases() != null) {
            for (String s: getAliases()) {
                if(event.getName().equals(s)) {
                    this.executeSlash(event);
                }
            }
         }
    }
    public String[] getAliases() {
        return this.aliases;
    }


    public final void reply(SlashCommandInteractionEvent evt, String msg) {
        evt.reply(msg).queue();
    }
    public final String getOption(SlashCommandInteractionEvent evt, String option) {
        return Objects.requireNonNull(evt.getOption(option)).getAsString();
    }

}



