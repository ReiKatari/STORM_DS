package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: w41  reason: default package */
/* loaded from: classes.dex */
public final class w41 {
    private static final /* synthetic */ e12 $ENTRIES;
    private static final /* synthetic */ w41[] $VALUES;
    public static final w41 None = new w41("None", 0);
    public static final w41 Cancelled = new w41("Cancelled", 1);
    public static final w41 Redirected = new w41("Redirected", 2);
    public static final w41 RedirectCancelled = new w41("RedirectCancelled", 3);

    private static final /* synthetic */ w41[] $values() {
        return new w41[]{None, Cancelled, Redirected, RedirectCancelled};
    }

    static {
        w41[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l.C($values);
    }

    private w41(String str, int i) {
    }

    public static e12 getEntries() {
        return $ENTRIES;
    }

    public static w41 valueOf(String str) {
        return (w41) Enum.valueOf(w41.class, str);
    }

    public static w41[] values() {
        return (w41[]) $VALUES.clone();
    }
}
