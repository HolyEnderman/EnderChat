package net.holyenderman.enderchat;

import org.bukkit.Server;
import org.bukkit.plugin.java.JavaPlugin;
import net.holyenderman.enderchat.emoji.*;
import net.holyenderman.enderchat.hashtag.*;

public class Enderchat extends JavaPlugin
{
		  private static JavaPlugin instance;

		  public void onLoad()
		  {
		    instance = this;
		  }

		  public void onEnable()
		  {
		    getServer().getPluginManager().registerEvents(new HashtagListener(), this);
		    getServer().getPluginManager().registerEvents(new EmojiListener(), this);
		  }

		  public static JavaPlugin getInstance()
		  {
		    return instance;
		  }
}