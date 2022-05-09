package dev.johny.commandhandler.bothandler;

import javafx.application.Application;
import javafx.stage.Stage;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;

import javax.security.auth.login.LoginException;
/*
 * Handler para inicialização de uma Main JDA.
 */
public abstract class BotHandler extends Application {
    public final String token;
    public JDA jda;
    private static BotHandler instance;

    /**
     * @param token Token do seu bot
     * <a href="Clique aqui para acessar o discord developers e pegar o token">https://discord.com/developers/applications</a>
     * @param jda Seu public JDA definido na main para iniciar o bot
     */

    public final ConfigManager configmanager;
    public  BotHandler(String token, JDA jda) {
        this.token = token;
        this.jda = jda;
        instance = this;
        configmanager = new ConfigManager();
    }
    /**
     * Codigo de inicialização do bot JDA
     */
    public abstract void enable() throws LoginException;

    public void start(Stage primaryStage) throws Exception {
        this.enable();
    }
    /**
     * Codigo para iniciar o bot sem você precisa construir o JDABuilder no JDA.
     * Exemplo: jda = setupBot(); na sua Main
     */

    public JDA setupBot() throws LoginException {
        return JDABuilder.createDefault(this.token).build();
    }






    public static BotHandler getInstance(){
        return instance;
    }





}
