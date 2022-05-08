package dev.johny.commandhandler.examples;

import dev.johny.commandhandler.slashhandler.SlashHandler;
import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import net.dv8tion.jda.api.interactions.commands.build.CommandData;
import net.dv8tion.jda.api.interactions.commands.build.Commands;

public class SlashExample extends SlashHandler {

    public SlashExample() {
        super("ping", "Ping slash command");
    }

    @Override
    public void executeSlash(SlashCommandInteractionEvent evt) {
        evt.reply("Pong").queue();
    }

    @Override
    public CommandData slashsetup() {
        return Commands.slash("", "");
    }


}
