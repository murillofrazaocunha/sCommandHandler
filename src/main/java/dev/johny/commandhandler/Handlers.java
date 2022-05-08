package dev.johny.commandhandler;

import dev.johny.commandhandler.buttonhandler.ButtonHandler;
import dev.johny.commandhandler.menuhandler.MenuHandler;
import dev.johny.commandhandler.messagehandler.MessageHandler;
import dev.johny.commandhandler.slashhandler.SlashHandler;
import net.dv8tion.jda.api.JDA;

/**
 * Main de handlers para discord JDA bot
 */
public class Handlers{
    /**
     * Uso para adicionar o evento do handler MessageReceived
     */
    public static void addMessageHandler(JDA jda1, MessageHandler cmds) {
        jda1.addEventListener(cmds);
    }

    /**
     * Uso para adicionar o evento do handler SlashCommand
     * Ele não adiciona o Slash no servidor.
     * Wiki para add Slash: <a href="https://jda.wiki/using-jda/interactions/#creating-slash-commands">Clique aqui</a>
     */
    public static void addSlashHandler(JDA jda1, SlashHandler cmds) {
        jda1.addEventListener(cmds);
    }

    /**
     * Uso para adicionar o evento do handler de Menus do ActionRow
     * Wiki: <a href="https://jda.wiki/using-jda/interactions/#handling-selectmenuinteractionevent">Clique aqui</a>
     */
    public static void addMenuHandler(JDA jda1, Object... cmds) {
        jda1.addEventListener(cmds);
    }
    /**
     * Uso para adicionar o evento do handler de Botões ActionRow
     * Wiki: <a href="https://jda.wiki/using-jda/interactions/#handling-buttoninteractionevent">Clique aqui</a>
     */
    public static void addButtonHandler(JDA jda1, Object... cmds) {
        jda1.addEventListener(cmds);
    }

    /**
    public static void main(String[] args) {
        addMessageHandler(jda, new MessageExample());
        addSlashHandler(jda ,new SlashExample());
    }
    */
}
