package defpackage;

import java.util.Set;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: vj5  reason: default package */
/* loaded from: classes.dex */
public final class vj5 {
    private static final /* synthetic */ t52 $ENTRIES;
    private static final /* synthetic */ vj5[] $VALUES;
    public static final uj5 Companion;
    private static final Set<vj5> allKinds;
    public static final vj5 SCREEN_FRAME = new vj5("SCREEN_FRAME", 0);
    public static final vj5 PACKED_TOP_PRIMARY = new vj5("PACKED_TOP_PRIMARY", 1);
    public static final vj5 PACKED_BOTTOM_PRIMARY = new vj5("PACKED_BOTTOM_PRIMARY", 2);
    public static final vj5 PACKED_TOP_PLANE1 = new vj5("PACKED_TOP_PLANE1", 3);
    public static final vj5 PACKED_TOP_CONTROL = new vj5("PACKED_TOP_CONTROL", 4);
    public static final vj5 PACKED_BOTTOM_PLANE1 = new vj5("PACKED_BOTTOM_PLANE1", 5);
    public static final vj5 PACKED_BOTTOM_CONTROL = new vj5("PACKED_BOTTOM_CONTROL", 6);
    public static final vj5 CAPTURE3D_SOURCE_DS_FRAME = new vj5("CAPTURE3D_SOURCE_DS_FRAME", 7);
    public static final vj5 CAPTURE_LINE_USES_3D_MASK = new vj5("CAPTURE_LINE_USES_3D_MASK", 8);
    public static final vj5 COMP4_TOP_PLACEHOLDER = new vj5("COMP4_TOP_PLACEHOLDER", 9);
    public static final vj5 COMP4_BOTTOM_PLACEHOLDER = new vj5("COMP4_BOTTOM_PLACEHOLDER", 10);
    public static final vj5 CAPTURE_FALLBACK_MASK = new vj5("CAPTURE_FALLBACK_MASK", 11);
    public static final vj5 SOFT_PACKED_FRAME_META_JSON = new vj5("SOFT_PACKED_FRAME_META_JSON", 12);
    public static final vj5 COMPOSITED_FRAME = new vj5("COMPOSITED_FRAME", 13);
    public static final vj5 RENDERER3D_FRAME = new vj5("RENDERER3D_FRAME", 14);
    public static final vj5 RENDERER3D_CAPTURE_FRAME = new vj5("RENDERER3D_CAPTURE_FRAME", 15);
    public static final vj5 RENDERER3D_DEPTH = new vj5("RENDERER3D_DEPTH", 16);
    public static final vj5 RENDERER3D_ATTR = new vj5("RENDERER3D_ATTR", 17);
    public static final vj5 RENDERER3D_COVERAGE = new vj5("RENDERER3D_COVERAGE", 18);

    private static final /* synthetic */ vj5[] $values() {
        return new vj5[]{SCREEN_FRAME, PACKED_TOP_PRIMARY, PACKED_BOTTOM_PRIMARY, PACKED_TOP_PLANE1, PACKED_TOP_CONTROL, PACKED_BOTTOM_PLANE1, PACKED_BOTTOM_CONTROL, CAPTURE3D_SOURCE_DS_FRAME, CAPTURE_LINE_USES_3D_MASK, COMP4_TOP_PLACEHOLDER, COMP4_BOTTOM_PLACEHOLDER, CAPTURE_FALLBACK_MASK, SOFT_PACKED_FRAME_META_JSON, COMPOSITED_FRAME, RENDERER3D_FRAME, RENDERER3D_CAPTURE_FRAME, RENDERER3D_DEPTH, RENDERER3D_ATTR, RENDERER3D_COVERAGE};
    }

    /* JADX WARN: Type inference failed for: r0v21, types: [uj5, java.lang.Object] */
    static {
        vj5[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nc1.L($values);
        Companion = new Object();
        allKinds = gt0.p1(getEntries());
    }

    private vj5(String str, int i) {
    }

    public static final /* synthetic */ Set access$getAllKinds$cp() {
        return allKinds;
    }

    public static t52 getEntries() {
        return $ENTRIES;
    }

    public static vj5 valueOf(String str) {
        return (vj5) Enum.valueOf(vj5.class, str);
    }

    public static vj5[] values() {
        return (vj5[]) $VALUES.clone();
    }
}
