package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: in7  reason: default package */
/* loaded from: classes.dex */
public final class in7 {
    private static final /* synthetic */ t52 $ENTRIES;
    private static final /* synthetic */ in7[] $VALUES;
    public static final hn7 Companion;
    public static final in7 UNSPECIFIED = new in7("UNSPECIFIED", 0);
    public static final in7 OFF = new in7("OFF", 1);
    public static final in7 ON = new in7("ON", 2);
    public static final in7 PREVIEW = new in7("PREVIEW", 3);

    private static final /* synthetic */ in7[] $values() {
        return new in7[]{UNSPECIFIED, OFF, ON, PREVIEW};
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [hn7, java.lang.Object] */
    static {
        in7[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nc1.L($values);
        Companion = new Object();
    }

    private in7(String str, int i) {
    }

    public static final in7 from$camera_core(int i, int i2) {
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

    public static t52 getEntries() {
        return $ENTRIES;
    }

    public static in7 valueOf(String str) {
        return (in7) Enum.valueOf(in7.class, str);
    }

    public static in7[] values() {
        return (in7[]) $VALUES.clone();
    }
}
