[![](https://jitpack.io/v/uJ0hn/sCommandHandler.svg)](https://jitpack.io/#uJ0hn/sCommandHandler)
# sCommandHandler
O sCommand Handler é um conjunto de handlers para JDA.
MessageHandler, SlashHandler, ButtonHandler, MenuHandler

## Uso
```java
//MensagemHandler
public class MessageExample extends MessageHandler {  
    public MessageExample() {  
        super("ping", "Ping command", "!");  
    }  
  
    @Override  
  public void execute(MessageReceivedEvent evt, String[] args) {  
        evt.getChannel().sendMessage("Pong").queue();  
    }  
}

// Para adicionar o handler na main:
JDA BOT;
BOT = JDABuilder.createDefault(token).build();
Handlers.addMessageHandler(BOT, new MessageExample());
Handlers.addSlashHandler(BOT,new SlashExample());
Handlers.addMenuHandler(BOT,
new MenuExample1(),
new MenuExample2(),
)
Handlers.addButtonHandler(BOT,
new ButtonExample1(),
new ButtonExample2(),
)

```

## Download
O mais recente .jar estará dentro do  [Projeto/releases](https://github.com/uJ0hn/sCommandHandler/releases) pronto para ser utilizado
## Maven
```java
//pom.xml
<dependency>  
    <groupId>com.github.uJ0hn</groupId>  
    <artifactId>sCommandHandler</artifactId>  
    <version>versão</version>  
</dependency>

```
