package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: nf2  reason: default package */
/* loaded from: classes.dex */
public final class nf2 {
    private static final /* synthetic */ e12 $ENTRIES;
    private static final /* synthetic */ nf2[] $VALUES;
    public static final nf2 HIDDEN = new nf2("HIDDEN", 0);
    public static final nf2 TOP_LEFT = new nf2("TOP_LEFT", 1);
    public static final nf2 TOP_CENTER = new nf2("TOP_CENTER", 2);
    public static final nf2 TOP_RIGHT = new nf2("TOP_RIGHT", 3);
    public static final nf2 BOTTOM_LEFT = new nf2("BOTTOM_LEFT", 4);
    public static final nf2 BOTTOM_CENTER = new nf2("BOTTOM_CENTER", 5);
    public static final nf2 BOTTOM_RIGHT = new nf2("BOTTOM_RIGHT", 6);

    private static final /* synthetic */ nf2[] $values() {
        return new nf2[]{HIDDEN, TOP_LEFT, TOP_CENTER, TOP_RIGHT, BOTTOM_LEFT, BOTTOM_CENTER, BOTTOM_RIGHT};
    }

    static {
        nf2[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l.C($values);
    }

    private nf2(String str, int i) {
    }

    public static e12 getEntries() {
        return $ENTRIES;
    }

    public static nf2 valueOf(String str) {
        return (nf2) Enum.valueOf(nf2.class, str);
    }

    public static nf2[] values() {
        return (nf2[]) $VALUES.clone();
    }
}
