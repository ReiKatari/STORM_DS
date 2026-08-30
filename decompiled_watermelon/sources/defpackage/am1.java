package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: am1  reason: default package */
/* loaded from: classes.dex */
public final class am1 {
    private static final /* synthetic */ e12 $ENTRIES;
    private static final /* synthetic */ am1[] $VALUES;
    public static final am1 BOTH = new am1("BOTH", 0);
    public static final am1 TOP = new am1("TOP", 1);
    public static final am1 BOTTOM = new am1("BOTTOM", 2);

    private static final /* synthetic */ am1[] $values() {
        return new am1[]{BOTH, TOP, BOTTOM};
    }

    static {
        am1[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l.C($values);
    }

    private am1(String str, int i) {
    }

    public static e12 getEntries() {
        return $ENTRIES;
    }

    public static am1 valueOf(String str) {
        return (am1) Enum.valueOf(am1.class, str);
    }

    public static am1[] values() {
        return (am1[]) $VALUES.clone();
    }
}
