package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ps6  reason: default package */
/* loaded from: classes.dex */
public final class ps6 {
    private static final /* synthetic */ e12 $ENTRIES;
    private static final /* synthetic */ ps6[] $VALUES;
    private final int nightMode;
    public static final ps6 LIGHT = new ps6("LIGHT", 0, 1);
    public static final ps6 DARK = new ps6("DARK", 1, 2);
    public static final ps6 SYSTEM = new ps6("SYSTEM", 2, -1);

    private static final /* synthetic */ ps6[] $values() {
        return new ps6[]{LIGHT, DARK, SYSTEM};
    }

    static {
        ps6[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l.C($values);
    }

    private ps6(String str, int i, int i2) {
        this.nightMode = i2;
    }

    public static e12 getEntries() {
        return $ENTRIES;
    }

    public static ps6 valueOf(String str) {
        return (ps6) Enum.valueOf(ps6.class, str);
    }

    public static ps6[] values() {
        return (ps6[]) $VALUES.clone();
    }

    public final int getNightMode() {
        return this.nightMode;
    }
}
