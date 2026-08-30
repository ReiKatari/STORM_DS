package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: tp5  reason: default package */
/* loaded from: classes.dex */
public final class tp5 {
    private static final /* synthetic */ e12 $ENTRIES;
    private static final /* synthetic */ tp5[] $VALUES;
    public static final tp5 GRID = new tp5("GRID", 0);
    public static final tp5 LIST = new tp5("LIST", 1);

    private static final /* synthetic */ tp5[] $values() {
        return new tp5[]{GRID, LIST};
    }

    static {
        tp5[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l.C($values);
    }

    private tp5(String str, int i) {
    }

    public static e12 getEntries() {
        return $ENTRIES;
    }

    public static tp5 valueOf(String str) {
        return (tp5) Enum.valueOf(tp5.class, str);
    }

    public static tp5[] values() {
        return (tp5[]) $VALUES.clone();
    }
}
