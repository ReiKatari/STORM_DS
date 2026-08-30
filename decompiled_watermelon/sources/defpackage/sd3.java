package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: sd3  reason: default package */
/* loaded from: classes.dex */
public final class sd3 {
    private static final /* synthetic */ e12 $ENTRIES;
    private static final /* synthetic */ sd3[] $VALUES;
    public static final sd3 Ltr = new sd3("Ltr", 0);
    public static final sd3 Rtl = new sd3("Rtl", 1);

    private static final /* synthetic */ sd3[] $values() {
        return new sd3[]{Ltr, Rtl};
    }

    static {
        sd3[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l.C($values);
    }

    private sd3(String str, int i) {
    }

    public static e12 getEntries() {
        return $ENTRIES;
    }

    public static sd3 valueOf(String str) {
        return (sd3) Enum.valueOf(sd3.class, str);
    }

    public static sd3[] values() {
        return (sd3[]) $VALUES.clone();
    }
}
