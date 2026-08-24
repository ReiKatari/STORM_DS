package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: cg2  reason: default package */
/* loaded from: classes.dex */
public final class cg2 {
    private static final /* synthetic */ t52 $ENTRIES;
    private static final /* synthetic */ cg2[] $VALUES;
    public static final cg2 Visible = new cg2("Visible", 0);
    public static final cg2 Clip = new cg2("Clip", 1);
    public static final cg2 ExpandIndicator = new cg2("ExpandIndicator", 2);
    public static final cg2 ExpandOrCollapseIndicator = new cg2("ExpandOrCollapseIndicator", 3);

    private static final /* synthetic */ cg2[] $values() {
        return new cg2[]{Visible, Clip, ExpandIndicator, ExpandOrCollapseIndicator};
    }

    static {
        cg2[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nc1.L($values);
    }

    private cg2(String str, int i) {
    }

    public static t52 getEntries() {
        return $ENTRIES;
    }

    public static cg2 valueOf(String str) {
        return (cg2) Enum.valueOf(cg2.class, str);
    }

    public static cg2[] values() {
        return (cg2[]) $VALUES.clone();
    }
}
