package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: p72  reason: default package */
/* loaded from: classes.dex */
public final class p72 {
    private static final /* synthetic */ e12 $ENTRIES;
    private static final /* synthetic */ p72[] $VALUES;
    public static final p72 TOP_DOWN = new p72("TOP_DOWN", 0);
    public static final p72 BOTTOM_UP = new p72("BOTTOM_UP", 1);

    private static final /* synthetic */ p72[] $values() {
        return new p72[]{TOP_DOWN, BOTTOM_UP};
    }

    static {
        p72[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l.C($values);
    }

    private p72(String str, int i) {
    }

    public static e12 getEntries() {
        return $ENTRIES;
    }

    public static p72 valueOf(String str) {
        return (p72) Enum.valueOf(p72.class, str);
    }

    public static p72[] values() {
        return (p72[]) $VALUES.clone();
    }
}
