package dev.johny.commandhandler.bothandler;

import org.yaml.snakeyaml.Yaml;

import java.io.InputStream;
import java.util.Map;

public final class ConfigManager {


        private final Yaml yaml = new Yaml();
        private final InputStream inputStream = BotHandler.getInstance().getClass().getClassLoader().getResourceAsStream("config.yml");
        private final Map<String, Object> config = yaml.load(inputStream);

        /**
         * @param path String na config.yml na qual você quer puxar
         *
         * String string = (String) configmanager.getString("path");
         *
         */
        public Object getString(String path){
        return config.get(path);
        }
}
