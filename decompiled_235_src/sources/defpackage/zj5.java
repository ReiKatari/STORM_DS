package defpackage;

import java.util.LinkedHashSet;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: zj5  reason: default package */
/* loaded from: classes.dex */
public abstract class zj5 {
    public static final LinkedHashSet a;

    static {
        vj5[] vj5VarArr = {vj5.SCREEN_FRAME, vj5.PACKED_TOP_PRIMARY, vj5.PACKED_BOTTOM_PRIMARY, vj5.CAPTURE3D_SOURCE_DS_FRAME, vj5.CAPTURE_LINE_USES_3D_MASK, vj5.COMP4_TOP_PLACEHOLDER, vj5.COMP4_BOTTOM_PLACEHOLDER, vj5.CAPTURE_FALLBACK_MASK, vj5.SOFT_PACKED_FRAME_META_JSON, vj5.COMPOSITED_FRAME, vj5.RENDERER3D_FRAME, vj5.RENDERER3D_CAPTURE_FRAME};
        LinkedHashSet linkedHashSet = new LinkedHashSet(c14.k0(12));
        fv.P0(vj5VarArr, linkedHashSet);
        a = linkedHashSet;
    }
}
