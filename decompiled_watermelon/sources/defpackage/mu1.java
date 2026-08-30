package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: mu1  reason: default package */
/* loaded from: classes.dex */
public final class mu1 {
    private static final /* synthetic */ e12 $ENTRIES;
    private static final /* synthetic */ mu1[] $VALUES;
    public static final mu1 SAVING = new mu1("SAVING", 0);
    public static final mu1 LOADING = new mu1("LOADING", 1);

    private static final /* synthetic */ mu1[] $values() {
        return new mu1[]{SAVING, LOADING};
    }

    static {
        mu1[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l.C($values);
    }

    private mu1(String str, int i) {
    }

    public static e12 getEntries() {
        return $ENTRIES;
    }

    public static mu1 valueOf(String str) {
        return (mu1) Enum.valueOf(mu1.class, str);
    }

    public static mu1[] values() {
        return (mu1[]) $VALUES.clone();
    }
}
