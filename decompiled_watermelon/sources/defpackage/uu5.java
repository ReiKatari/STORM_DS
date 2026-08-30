package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: uu5  reason: default package */
/* loaded from: classes.dex */
public final class uu5 {
    private static final /* synthetic */ e12 $ENTRIES;
    private static final /* synthetic */ uu5[] $VALUES;
    public static final uu5 FILL = new uu5("FILL", 0);
    public static final uu5 FIT = new uu5("FIT", 1);

    private static final /* synthetic */ uu5[] $values() {
        return new uu5[]{FILL, FIT};
    }

    static {
        uu5[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l.C($values);
    }

    private uu5(String str, int i) {
    }

    public static e12 getEntries() {
        return $ENTRIES;
    }

    public static uu5 valueOf(String str) {
        return (uu5) Enum.valueOf(uu5.class, str);
    }

    public static uu5[] values() {
        return (uu5[]) $VALUES.clone();
    }
}
