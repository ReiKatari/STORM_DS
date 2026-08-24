package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: r75  reason: default package */
/* loaded from: classes.dex */
public final class r75 {
    private static final /* synthetic */ t52 $ENTRIES;
    private static final /* synthetic */ r75[] $VALUES;
    public static final r75 Core = new r75("Core", 0);
    public static final r75 Bonus = new r75("Bonus", 1);
    public static final r75 Specialty = new r75("Specialty", 2);
    public static final r75 Exclusive = new r75("Exclusive", 3);
    public static final r75 Challenge = new r75("Challenge", 4);

    private static final /* synthetic */ r75[] $values() {
        return new r75[]{Core, Bonus, Specialty, Exclusive, Challenge};
    }

    static {
        r75[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nc1.L($values);
    }

    private r75(String str, int i) {
    }

    public static t52 getEntries() {
        return $ENTRIES;
    }

    public static r75 valueOf(String str) {
        return (r75) Enum.valueOf(r75.class, str);
    }

    public static r75[] values() {
        return (r75[]) $VALUES.clone();
    }
}
