package me.spaceramen.aegis.rank;

import me.spaceramen.aegis.user.User;
import me.spaceramen.aegis.command.CommandUser;
import me.spaceramen.aegis.service.AegisService;
import org.bukkit.entity.Player;

public class RankManager extends AegisService
{
    @Override
    public void start()
    {
    }

    @Override
    public void stop()
    {
    }

    public Rank getRank(User user)
    {
        return user.getRank();
    }

    public Rank getRank(Player player)
    {
        return User.getUser(player).getRank();
    }

    public Rank getRank(CommandUser sender)
    {
        return sender.getUser().getRank();
    }

    public Rank getRank(String name)
    {
        User user = User.getUser(name);
        if (user == null)
            return Rank.DEFAULT;
        return user.getRank();
    }

    public boolean isElevated(User user)
    {
        return getRank(user).isElevated();
    }

    public boolean isElevated(Player player)
    {
        return getRank(player).isElevated();
    }

    public boolean isElevated(CommandUser sender)
    {
        return getRank(sender).isElevated();
    }
}