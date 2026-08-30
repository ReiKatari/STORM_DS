package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ed0  reason: default package */
/* loaded from: classes.dex */
public final class ed0 {
    private static final /* synthetic */ e12 $ENTRIES;
    private static final /* synthetic */ ed0[] $VALUES;
    public static final ed0 AT_LEAST = new ed0("AT_LEAST", 0);
    public static final ed0 EXACT = new ed0("EXACT", 1);

    private static final /* synthetic */ ed0[] $values() {
        return new ed0[]{AT_LEAST, EXACT};
    }

    static {
        ed0[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l.C($values);
    }

    private ed0(String str, int i) {
    }

    public static e12 getEntries() {
        return $ENTRIES;
    }

    public static ed0 valueOf(String str) {
        return (ed0) Enum.valueOf(ed0.class, str);
    }

    public static ed0[] values() {
        return (ed0[]) $VALUES.clone();
    }
}
