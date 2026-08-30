package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: gl5  reason: default package */
/* loaded from: classes.dex */
public final class gl5 {
    private static final /* synthetic */ e12 $ENTRIES;
    private static final /* synthetic */ gl5[] $VALUES;
    private final int tabIndex;
    public static final gl5 CONFIG = new gl5("CONFIG", 0, 0);
    public static final gl5 RETRO_ACHIEVEMENTS = new gl5("RETRO_ACHIEVEMENTS", 1, 1);
    public static final gl5 OFFLINE_ACHIEVEMENTS = new gl5("OFFLINE_ACHIEVEMENTS", 2, 2);

    private static final /* synthetic */ gl5[] $values() {
        return new gl5[]{CONFIG, RETRO_ACHIEVEMENTS, OFFLINE_ACHIEVEMENTS};
    }

    static {
        gl5[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l.C($values);
    }

    private gl5(String str, int i, int i2) {
        this.tabIndex = i2;
    }

    public static e12 getEntries() {
        return $ENTRIES;
    }

    public static gl5 valueOf(String str) {
        return (gl5) Enum.valueOf(gl5.class, str);
    }

    public static gl5[] values() {
        return (gl5[]) $VALUES.clone();
    }

    public final int getTabIndex() {
        return this.tabIndex;
    }
}
