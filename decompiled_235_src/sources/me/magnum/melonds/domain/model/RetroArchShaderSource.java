package me.magnum.melonds.domain.model;

import java.util.Locale;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class RetroArchShaderSource {
    private static final /* synthetic */ t52 $ENTRIES;
    private static final /* synthetic */ RetroArchShaderSource[] $VALUES;
    public static final gp5 Companion;
    public static final RetroArchShaderSource INTERNAL = new RetroArchShaderSource("INTERNAL", 0);
    public static final RetroArchShaderSource FOLDER = new RetroArchShaderSource("FOLDER", 1);

    private static final /* synthetic */ RetroArchShaderSource[] $values() {
        return new RetroArchShaderSource[]{INTERNAL, FOLDER};
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, gp5] */
    static {
        RetroArchShaderSource[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nc1.L($values);
        Companion = new Object();
    }

    private RetroArchShaderSource(String str, int i) {
    }

    public static t52 getEntries() {
        return $ENTRIES;
    }

    public static RetroArchShaderSource valueOf(String str) {
        return (RetroArchShaderSource) Enum.valueOf(RetroArchShaderSource.class, str);
    }

    public static RetroArchShaderSource[] values() {
        return (RetroArchShaderSource[]) $VALUES.clone();
    }

    public final String getPreferenceValue() {
        String lowerCase = name().toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        return lowerCase;
    }
}
