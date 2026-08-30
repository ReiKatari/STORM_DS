package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: dt4  reason: default package */
/* loaded from: classes.dex */
public final class dt4 {
    private static final /* synthetic */ e12 $ENTRIES;
    private static final /* synthetic */ dt4[] $VALUES;
    public static final dt4 MAIN = new dt4("MAIN", 0);
    public static final dt4 FILL_AREA = new dt4("FILL_AREA", 1);
    public static final dt4 VERTICAL_ALIGNMENT = new dt4("VERTICAL_ALIGNMENT", 2);

    private static final /* synthetic */ dt4[] $values() {
        return new dt4[]{MAIN, FILL_AREA, VERTICAL_ALIGNMENT};
    }

    static {
        dt4[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l.C($values);
    }

    private dt4(String str, int i) {
    }

    public static e12 getEntries() {
        return $ENTRIES;
    }

    public static dt4 valueOf(String str) {
        return (dt4) Enum.valueOf(dt4.class, str);
    }

    public static dt4[] values() {
        return (dt4[]) $VALUES.clone();
    }
}
