package defpackage;

import java.util.Set;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: da5  reason: default package */
/* loaded from: classes.dex */
public final class da5 {
    private static final /* synthetic */ e12 $ENTRIES;
    private static final /* synthetic */ da5[] $VALUES;
    public static final ca5 Companion;
    private static final Set<da5> allKinds;
    public static final da5 SCREEN_FRAME = new da5("SCREEN_FRAME", 0);
    public static final da5 PACKED_TOP_PRIMARY = new da5("PACKED_TOP_PRIMARY", 1);
    public static final da5 PACKED_BOTTOM_PRIMARY = new da5("PACKED_BOTTOM_PRIMARY", 2);
    public static final da5 PACKED_TOP_PLANE1 = new da5("PACKED_TOP_PLANE1", 3);
    public static final da5 PACKED_TOP_CONTROL = new da5("PACKED_TOP_CONTROL", 4);
    public static final da5 PACKED_BOTTOM_PLANE1 = new da5("PACKED_BOTTOM_PLANE1", 5);
    public static final da5 PACKED_BOTTOM_CONTROL = new da5("PACKED_BOTTOM_CONTROL", 6);
    public static final da5 CAPTURE3D_SOURCE_DS_FRAME = new da5("CAPTURE3D_SOURCE_DS_FRAME", 7);
    public static final da5 CAPTURE_LINE_USES_3D_MASK = new da5("CAPTURE_LINE_USES_3D_MASK", 8);
    public static final da5 COMP4_TOP_PLACEHOLDER = new da5("COMP4_TOP_PLACEHOLDER", 9);
    public static final da5 COMP4_BOTTOM_PLACEHOLDER = new da5("COMP4_BOTTOM_PLACEHOLDER", 10);
    public static final da5 CAPTURE_FALLBACK_MASK = new da5("CAPTURE_FALLBACK_MASK", 11);
    public static final da5 SOFT_PACKED_FRAME_META_JSON = new da5("SOFT_PACKED_FRAME_META_JSON", 12);
    public static final da5 COMPOSITED_FRAME = new da5("COMPOSITED_FRAME", 13);
    public static final da5 RENDERER3D_FRAME = new da5("RENDERER3D_FRAME", 14);
    public static final da5 RENDERER3D_CAPTURE_FRAME = new da5("RENDERER3D_CAPTURE_FRAME", 15);
    public static final da5 RENDERER3D_DEPTH = new da5("RENDERER3D_DEPTH", 16);
    public static final da5 RENDERER3D_ATTR = new da5("RENDERER3D_ATTR", 17);
    public static final da5 RENDERER3D_COVERAGE = new da5("RENDERER3D_COVERAGE", 18);

    private static final /* synthetic */ da5[] $values() {
        return new da5[]{SCREEN_FRAME, PACKED_TOP_PRIMARY, PACKED_BOTTOM_PRIMARY, PACKED_TOP_PLANE1, PACKED_TOP_CONTROL, PACKED_BOTTOM_PLANE1, PACKED_BOTTOM_CONTROL, CAPTURE3D_SOURCE_DS_FRAME, CAPTURE_LINE_USES_3D_MASK, COMP4_TOP_PLACEHOLDER, COMP4_BOTTOM_PLACEHOLDER, CAPTURE_FALLBACK_MASK, SOFT_PACKED_FRAME_META_JSON, COMPOSITED_FRAME, RENDERER3D_FRAME, RENDERER3D_CAPTURE_FRAME, RENDERER3D_DEPTH, RENDERER3D_ATTR, RENDERER3D_COVERAGE};
    }

    /* JADX WARN: Type inference failed for: r0v21, types: [ca5, java.lang.Object] */
    static {
        da5[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l.C($values);
        Companion = new Object();
        allKinds = tq0.s1(getEntries());
    }

    private da5(String str, int i) {
    }

    public static final /* synthetic */ Set access$getAllKinds$cp() {
        return allKinds;
    }

    public static e12 getEntries() {
        return $ENTRIES;
    }

    public static da5 valueOf(String str) {
        return (da5) Enum.valueOf(da5.class, str);
    }

    public static da5[] values() {
        return (da5[]) $VALUES.clone();
    }
}
