package me.spaceramen.aegis.command;

import me.spaceramen.aegis.user.User;
import me.spaceramen.aegis.rank.Rank;

@CommandParameters(description = "Kills all Aegis mobs.", rank = Rank.BRUH)
public class Command_akillmobs extends AegisCommand
{
    @Override
    public void run(CommandUser sender, User user, String[] args)
    {
        checkArgs(args.length != 0);
        plugin.amm.killMobs();
        sendf("killedAllMobs");
    }
}