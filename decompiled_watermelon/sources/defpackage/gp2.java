package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: gp2  reason: default package */
/* loaded from: classes.dex */
public final class gp2 {
    private static final /* synthetic */ e12 $ENTRIES;
    private static final /* synthetic */ gp2[] $VALUES;
    public static final gp2 None = new gp2("None", 0);
    public static final gp2 Selection = new gp2("Selection", 1);
    public static final gp2 Cursor = new gp2("Cursor", 2);

    private static final /* synthetic */ gp2[] $values() {
        return new gp2[]{None, Selection, Cursor};
    }

    static {
        gp2[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l.C($values);
    }

    private gp2(String str, int i) {
    }

    public static e12 getEntries() {
        return $ENTRIES;
    }

    public static gp2 valueOf(String str) {
        return (gp2) Enum.valueOf(gp2.class, str);
    }

    public static gp2[] values() {
        return (gp2[]) $VALUES.clone();
    }
}
