package me.magnum.melonds.domain.model;

import java.util.Locale;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* loaded from: classes.dex */
public final class RetroArchShaderSource {
    private static final /* synthetic */ e12 $ENTRIES;
    private static final /* synthetic */ RetroArchShaderSource[] $VALUES;
    public static final kf5 Companion;
    public static final RetroArchShaderSource INTERNAL = new RetroArchShaderSource("INTERNAL", 0);
    public static final RetroArchShaderSource FOLDER = new RetroArchShaderSource("FOLDER", 1);

    private static final /* synthetic */ RetroArchShaderSource[] $values() {
        return new RetroArchShaderSource[]{INTERNAL, FOLDER};
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kf5] */
    static {
        RetroArchShaderSource[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l.C($values);
        Companion = new Object();
    }

    private RetroArchShaderSource(String str, int i) {
    }

    public static e12 getEntries() {
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
