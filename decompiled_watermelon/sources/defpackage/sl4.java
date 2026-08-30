package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: sl4  reason: default package */
/* loaded from: classes.dex */
public final class sl4 {
    private static final /* synthetic */ e12 $ENTRIES;
    private static final /* synthetic */ sl4[] $VALUES;
    public static final sl4 Invalid = new sl4("Invalid", 0);
    public static final sl4 Cancelled = new sl4("Cancelled", 1);
    public static final sl4 InitialPending = new sl4("InitialPending", 2);
    public static final sl4 RecomposePending = new sl4("RecomposePending", 3);
    public static final sl4 Recomposing = new sl4("Recomposing", 4);
    public static final sl4 ApplyPending = new sl4("ApplyPending", 5);
    public static final sl4 Applied = new sl4("Applied", 6);

    private static final /* synthetic */ sl4[] $values() {
        return new sl4[]{Invalid, Cancelled, InitialPending, RecomposePending, Recomposing, ApplyPending, Applied};
    }

    static {
        sl4[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l.C($values);
    }

    private sl4(String str, int i) {
    }

    public static e12 getEntries() {
        return $ENTRIES;
    }

    public static sl4 valueOf(String str) {
        return (sl4) Enum.valueOf(sl4.class, str);
    }

    public static sl4[] values() {
        return (sl4[]) $VALUES.clone();
    }
}
