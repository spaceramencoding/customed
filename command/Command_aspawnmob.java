package me.spaceramen.aegis.command;

import me.spaceramen.aegis.user.User;
import me.spaceramen.aegis.mob.AegisMob;
import me.spaceramen.aegis.mob.AegisMobType;

import java.util.ArrayList;
import java.util.List;

@CommandParameters(description = "Spawn a mob from Aegis.", usage = "/<command> <mob>", source = CommandSource.IN_GAME)
public class Command_aspawnmob extends AegisCommand
{
    @Override
    public void run(CommandUser sender, User user, String[] args)
    {
        checkArgs(args.length != 1);
        AegisMobType type = AegisMobType.findType(args[0]);
        if (type == null)
            throw new CommandFailException("invalidType");
        AegisMob mob = type.newInstance();
        mob.spawn(sender.getPlayer().getLocation());
        sendf("entitySpawned", mob.getName());
    }

    @Override
    public List<String> getTabCompleteOptions(CommandUser user, String[] args)
    {
        if (args.length == 1)
        {
            List<String> list = new ArrayList<>();
            for (AegisMobType type : AegisMobType.values())
            {
                list.add(type.name());
            }
            return list;
        }
        return null;
    }
}