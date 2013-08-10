package net.holyenderman.enderchat.emoji;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
public class EmojiListener 
  implements Listener
{
  @EventHandler(priority=EventPriority.MONITOR)
  public void onEmoticon(AsyncPlayerChatEvent event)
  {
    String message = event.getMessage();
    message = message.replace(":)", Emoji.smiley);
    message = message.replace(":D", Emoji.smiley);
    message = message.replace(":(", Emoji.sad);
    message = message.replace("<3", Emoji.heart);
    message = message.replace("<-", Emoji.arrowLeft);
    message = message.replace("->", Emoji.arrowRight);
    message = message.replace(":\"", Emoji.meh);
    message = message.replace("{cloud}", Emoji.cloud);
    message = message.replace("{sun}", Emoji.sun);
    message = message.replace("{umbrella}", Emoji.umbrella);
    message = message.replace("{snowman}", Emoji.snowman);
    message = message.replace("{comet}", Emoji.comet);
    message = message.replace("{star}", Emoji.star);
    message = message.replace("{phone}", Emoji.phone);
    message = message.replace("{skull}", Emoji.skull);
    message = message.replace("{radioactive}", Emoji.radioactive);
    message = message.replace("{biohazard}", Emoji.biohazard);
    message = message.replace("{peace}", Emoji.peace);
    message = message.replace("{yingyang}", Emoji.yingyang);
    message = message.replace("{moon}", Emoji.moon);
    message = message.replace("{crown}", Emoji.crown);
    message = message.replace("{music}", Emoji.music);
    message = message.replace("{scissor}", Emoji.scissor);
    message = message.replace("{plane}", Emoji.plane);
    message = message.replace("{mail}", Emoji.mail);
    message = message.replace("{pencil}", Emoji.pencil);
    message = message.replace("{check}", Emoji.check);
    message = message.replace("{yuno}", Emoji.yuno);
    message = message.replace("{tableflip}", Emoji.tableflip);
    message = message.replace("{fuckyou}", Emoji.fuckyou);
    message = message.replace("{meh}", Emoji.meh);
    message = message.replace("{bear}", Emoji.bear);
    message = message.replace("{diamond}", Emoji.diamond);
    message = message.replace("{spade}", Emoji.spade);
    message = message.replace("{club}", Emoji.club);
    message = message.replace("{male}", Emoji.bear);
    message = message.replace("{female}", Emoji.bear);
    message = message.replace("{boy}", Emoji.bear);
    message = message.replace("{girl}", Emoji.bear);
    if (message.contains(":/"))
    {
      if (message.contains("http"))
      {
        return;
      }

      message = message.replace(":\"", Emoji.meh);
    }

    event.setMessage(message);
  }
}
