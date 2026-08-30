package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: gy4  reason: default package */
/* loaded from: classes.dex */
public final class gy4 {
    private static final /* synthetic */ e12 $ENTRIES;
    private static final /* synthetic */ gy4[] $VALUES;
    public static final gy4 Core = new gy4("Core", 0);
    public static final gy4 Bonus = new gy4("Bonus", 1);
    public static final gy4 Specialty = new gy4("Specialty", 2);
    public static final gy4 Exclusive = new gy4("Exclusive", 3);
    public static final gy4 Challenge = new gy4("Challenge", 4);

    private static final /* synthetic */ gy4[] $values() {
        return new gy4[]{Core, Bonus, Specialty, Exclusive, Challenge};
    }

    static {
        gy4[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l.C($values);
    }

    private gy4(String str, int i) {
    }

    public static e12 getEntries() {
        return $ENTRIES;
    }

    public static gy4 valueOf(String str) {
        return (gy4) Enum.valueOf(gy4.class, str);
    }

    public static gy4[] values() {
        return (gy4[]) $VALUES.clone();
    }
}
