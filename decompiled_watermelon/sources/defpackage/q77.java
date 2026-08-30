package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: q77  reason: default package */
/* loaded from: classes.dex */
public final class q77 {
    private static final /* synthetic */ e12 $ENTRIES;
    private static final /* synthetic */ q77[] $VALUES;
    public static final q77 Lsq2 = new q77("Lsq2", 0);
    public static final q77 Impulse = new q77("Impulse", 1);

    private static final /* synthetic */ q77[] $values() {
        return new q77[]{Lsq2, Impulse};
    }

    static {
        q77[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l.C($values);
    }

    private q77(String str, int i) {
    }

    public static e12 getEntries() {
        return $ENTRIES;
    }

    public static q77 valueOf(String str) {
        return (q77) Enum.valueOf(q77.class, str);
    }

    public static q77[] values() {
        return (q77[]) $VALUES.clone();
    }
}
