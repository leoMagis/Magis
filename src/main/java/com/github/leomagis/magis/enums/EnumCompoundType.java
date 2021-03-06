package com.github.leomagis.magis.enums;

import net.minecraft.item.ItemStack;

public enum EnumCompoundType {
    AURA      ("Aura"),
    AIRY      ("AuraAir"),
    PROXIMITY ("AuraProximity"),
    AURA_RUNE    ("AuraRune"),
    //TODO Add "Empty"

    AQUIS     ("Aquis"),
    WATERY    ("AquisWater"),
    FLUIDIC   ("AquisFluid"),
    AQUIS_RUNE   ("AquisRune"),
    //TODO Add "Flowing"

    ELIQUIS   ("Eliquis"),
    ELECTRIC  ("EliquisElectric"),
    MAGNETIC  ("EliquisMagnetic"),
    LIGHT     ("EliquisLight"),
    ELIQUIS_RUNE ("EliquisRune"),

    FIIRUS    ("Fiirus"),
    HEAT      ("FiirusHeat"),
    PLASMA    ("FiirusPlasma"),
    KINETIC   ("FiirusKinetic"),
    FIIRUS_RUNE  ("FiirusRune"),

    EARTHA    ("Eartha"),
    EARTHY    ("EarthaEarth"),
    METALLIC  ("EarthaMetal"),
    SOLID     ("EarthaSolid"),
    EARTHA_RUNE  ("EarthaRune"),

    YIN       ("Yin"),
    DEATH     ("YinDeath"),
    NEGATIVE  ("YinNegative"),
    CHAOTIC   ("YinChaos"),
    YIN_RUNE  ("YinRune"),

    YAN       ("Yan"),
    LIFE      ("YanLife"),
    POSITIVE  ("YanPositive"),
    ORDER     ("YanOrder"),
    YAN_RUNE  ("YanRune"),

    CHRONUS   ("Chronus"),
    CHRONUS_RUNE ("ChronusRune"),

    PSYCOS    ("Psycos"),
    PSYCOS_RUNE  ("PsycosRune");

    public static EnumCompoundType getFromStack(ItemStack itemStack) {
        EnumCompoundType[] types = values();

        int damageValue = itemStack.getItemDamage();
        if(damageValue < 0 || damageValue >= types.length) {
            damageValue = 0;
        }

        return types[damageValue];
    }

    private final String name;

    EnumCompoundType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
