package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: i97  reason: default package */
/* loaded from: classes.dex */
public final class i97 {
    private static final /* synthetic */ e12 $ENTRIES;
    private static final /* synthetic */ i97[] $VALUES;
    public static final h97 Companion;
    public static final i97 UNSPECIFIED = new i97("UNSPECIFIED", 0);
    public static final i97 OFF = new i97("OFF", 1);
    public static final i97 ON = new i97("ON", 2);
    public static final i97 PREVIEW = new i97("PREVIEW", 3);

    private static final /* synthetic */ i97[] $values() {
        return new i97[]{UNSPECIFIED, OFF, ON, PREVIEW};
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [h97, java.lang.Object] */
    static {
        i97[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l.C($values);
        Companion = new Object();
    }

    private i97(String str, int i) {
    }

    public static final i97 from$camera_core(int i, int i2) {
        Companion.getClass();
        if (i != 1 && i2 != 1) {
            if (i == 2) {
                return PREVIEW;
            }
            if (i2 == 2) {
                return ON;
            }
            return UNSPECIFIED;
        }
        return OFF;
    }

    public static e12 getEntries() {
        return $ENTRIES;
    }

    public static i97 valueOf(String str) {
        return (i97) Enum.valueOf(i97.class, str);
    }

    public static i97[] values() {
        return (i97[]) $VALUES.clone();
    }
}
