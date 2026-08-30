package defpackage;

import java.util.LinkedHashSet;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ha5  reason: default package */
/* loaded from: classes.dex */
public abstract class ha5 {
    public static final LinkedHashSet a;

    static {
        da5[] da5VarArr = {da5.SCREEN_FRAME, da5.PACKED_TOP_PRIMARY, da5.PACKED_BOTTOM_PRIMARY, da5.CAPTURE3D_SOURCE_DS_FRAME, da5.CAPTURE_LINE_USES_3D_MASK, da5.COMP4_TOP_PLACEHOLDER, da5.COMP4_BOTTOM_PLACEHOLDER, da5.CAPTURE_FALLBACK_MASK, da5.SOFT_PACKED_FRAME_META_JSON, da5.COMPOSITED_FRAME, da5.RENDERER3D_FRAME, da5.RENDERER3D_CAPTURE_FRAME};
        LinkedHashSet linkedHashSet = new LinkedHashSet(zt3.j0(12));
        nu.B0(da5VarArr, linkedHashSet);
        a = linkedHashSet;
    }
}
