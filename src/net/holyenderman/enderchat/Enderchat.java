1.
/*Copyright (c) 2013 Michael Cummings <michael.cummings.97@outlook.com> and Walker Ross-Fudge <rossfudgew@holyenderman.net>

2.
All rights reserved.

3.
 

4.
Redistribution and use in source and binary forms, with or without

5.
modification, are permitted provided that the following conditions are met:

6.
    * Redistributions of source code must retain the above copyright

7.
      notice, this list of conditions and the following disclaimer.

8.
    * Redistributions in binary form must reproduce the above copyright

9.
      notice, this list of conditions and the following disclaimer in the

10.
      documentation and/or other materials provided with the distribution.

11.
    * Neither the name of EnderChat or the names of its

12.
      contributors may be used to endorse or promote products derived from this

13.
      software without specific prior written permission.

14.
 

15.
THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND

16.
ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED

17.
WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE

18.
DISCLAIMED. IN NO EVENT SHALL <COPYRIGHT HOLDER> BE LIABLE FOR ANY

19.
DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES

20.
(INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;

21.
LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND

22.
ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT

23.
(INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS

24.
SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.*/


package net.holyenderman.enderchat;

import java.io.IOException;

import org.bukkit.Server;
import org.bukkit.plugin.java.JavaPlugin;

import net.holyenderman.enderchat.emoji.*;
import net.holyenderman.enderchat.hashtag.*;

import org.mcstats.*;

public class Enderchat extends JavaPlugin
{
		  private static JavaPlugin instance;

		  public void onLoad()
		  {
		    instance = this;
		  }

		  public void onEnable()
		  {
			  try {
				    Metrics metrics = new Metrics(this);
				    metrics.start();
				} catch (IOException e) {
				    // Failed to submit the stats :-(
				}
		    getServer().getPluginManager().registerEvents(new HashtagListener(), this);
		    getServer().getPluginManager().registerEvents(new EmojiListener(), this);
		  }

		  public static JavaPlugin getInstance()
		  {
		    return instance;
		  }
}