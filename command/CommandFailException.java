package me.spaceramen.aegis.command;

import me.spaceramen.aegis.util.AUtil;

public class CommandFailException extends RuntimeException
{
    public CommandFailException(String message, Object... objects)
    {
        super(AUtil.getErrorColor() + AUtil.f(message, true, objects));
    }
}