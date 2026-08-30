package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: gv5  reason: default package */
/* loaded from: classes.dex */
public final class gv5 {
    private static final /* synthetic */ e12 $ENTRIES;
    private static final /* synthetic */ gv5[] $VALUES;
    public static final gv5 TOP = new gv5("TOP", 0);
    public static final gv5 CENTER = new gv5("CENTER", 1);
    public static final gv5 BOTTOM = new gv5("BOTTOM", 2);

    private static final /* synthetic */ gv5[] $values() {
        return new gv5[]{TOP, CENTER, BOTTOM};
    }

    static {
        gv5[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l.C($values);
    }

    private gv5(String str, int i) {
    }

    public static e12 getEntries() {
        return $ENTRIES;
    }

    public static gv5 valueOf(String str) {
        return (gv5) Enum.valueOf(gv5.class, str);
    }

    public static gv5[] values() {
        return (gv5[]) $VALUES.clone();
    }
}
