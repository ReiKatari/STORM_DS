package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: y25  reason: default package */
/* loaded from: classes.dex */
public final class y25 {
    private static final /* synthetic */ e12 $ENTRIES;
    private static final /* synthetic */ y25[] $VALUES;
    public static final x25 Companion;
    private final int wireValue;
    public static final y25 ACHIEVEMENT = new y25("ACHIEVEMENT", 0, 1);
    public static final y25 LEADERBOARD = new y25("LEADERBOARD", 1, 2);

    private static final /* synthetic */ y25[] $values() {
        return new y25[]{ACHIEVEMENT, LEADERBOARD};
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, x25] */
    static {
        y25[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l.C($values);
        Companion = new Object();
    }

    private y25(String str, int i, int i2) {
        this.wireValue = i2;
    }

    public static e12 getEntries() {
        return $ENTRIES;
    }

    public static y25 valueOf(String str) {
        return (y25) Enum.valueOf(y25.class, str);
    }

    public static y25[] values() {
        return (y25[]) $VALUES.clone();
    }

    public final int getWireValue() {
        return this.wireValue;
    }
}
