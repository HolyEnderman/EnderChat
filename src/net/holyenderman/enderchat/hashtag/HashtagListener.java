package net.holyenderman.enderchat.hashtag;

import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class HashtagListener
  implements Listener
{
  @EventHandler(priority=EventPriority.MONITOR)
  public void onHashtag(AsyncPlayerChatEvent event)
  {
    String msg = event.getMessage();
    while (msg.contains("#")) {
      msg = msg.substring(msg.indexOf("#"));
      String hashtag;
      if (msg.indexOf(" ") == -1) hashtag = msg.substring(1);
      else
      {
        hashtag = msg.substring(msg.indexOf("#") + 1, msg.indexOf(" "));
      }if (hashtag.length() <= 1)
      {
        return;
      }
      String chat = event.getMessage().replace("#", ChatColor.BLUE + "#" + ChatColor.RESET);
      event.setMessage(chat.replace(hashtag, ChatColor.BLUE + hashtag + ChatColor.RESET));

      if (msg.indexOf(" ") != -1) msg = msg.substring(msg.indexOf(" "));
      else
        msg = "";
    }
  }

  @EventHandler(priority=EventPriority.MONITOR)
  public void onUrl(AsyncPlayerChatEvent event)
  {
    String msg = event.getMessage();
    while (msg.contains("http://")) {
      msg = msg.substring(msg.indexOf("http://"));
      String url;
      if (msg.indexOf(" ") == -1) url = msg.substring(1);
      else
      {
        url = msg.substring(msg.indexOf("http://"), msg.indexOf(".com"));
      }String chat = event.getMessage().replace("http://", ChatColor.YELLOW + "http://");
      String chatfinal = chat.replace(".com", ChatColor.YELLOW + ".com" + ChatColor.RESET);
      event.setMessage(chatfinal.replace(url, ChatColor.YELLOW + url + ChatColor.RESET));

      if (msg.indexOf(" ") != -1) msg = msg.substring(msg.indexOf(" "));
      else
        msg = "";
    }
  }

  @EventHandler(priority=EventPriority.MONITOR)
  public void onAtsign(AsyncPlayerChatEvent event)
  {
    String msg = event.getMessage();
    while (msg.contains("@")) {
      msg = msg.substring(msg.indexOf("@"));
      String atsign;
      if (msg.indexOf(" ") == -1) atsign = msg.substring(1);
      else
      {
        atsign = msg.substring(msg.indexOf("@") + 1, msg.indexOf(" "));
      }if (atsign.length() <= 2)
      {
        return;
      }
      String chat = event.getMessage().replace("@", ChatColor.RED + "@" + ChatColor.RESET);
      event.setMessage(chat.replace(atsign, ChatColor.RED + atsign + ChatColor.RESET));

      if (msg.indexOf(" ") != -1) msg = msg.substring(msg.indexOf(" "));
      else
        msg = "";
    }
  }

  @EventHandler(priority=EventPriority.MONITOR)
  public void onMeme(AsyncPlayerChatEvent event)
  {
    String msg = event.getMessage();
    while (msg.contains(">")) {
      msg = msg.substring(msg.indexOf(">"));
      String meme;
      if (msg.indexOf(" ") == -1) meme = msg.substring(1);
      else
      {
        meme = msg.substring(msg.indexOf(">") + 1, msg.indexOf(" "));
      }if (meme.length() <= 2)
      {
        return;
      }
      String chat = event.getMessage().replace(">", ChatColor.GREEN + ">");
      event.setMessage(chat.replace(meme, ChatColor.GREEN + meme));

      if (msg.indexOf(" ") != -1) msg = msg.substring(msg.indexOf(" "));
      else
        msg = "";
    }
  }
}