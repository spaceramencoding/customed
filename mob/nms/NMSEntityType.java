package me.spaceramen.aegis.mob.nms;

import net.minecraft.server.v1_16_R1.EntityInsentient;

public enum NMSEntityType
{
    RIDEABLE_WITHER(RideableWither.class),
    SPECIAL_SLIME(SpecialSlime.class);

    private final Class<? extends EntityInsentient> clazz;

    NMSEntityType(Class<? extends EntityInsentient> clazz)
    {
        this.clazz = clazz;
    }

    public NMSEntity newInstance()
    {
        EntityInsentient ei;
        try
        {
            ei = clazz.newInstance();
        }
        catch (InstantiationException | IllegalAccessException ex)
        {
            return null;
        }
        return (NMSEntity) ei;
    }

    public static NMSEntityType findType(String s)
    {
        return valueOf(s.toUpperCase());
    }
}