package defpackage;

import me.magnum.melonds.domain.model.VideoRenderer;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: yt5  reason: default package */
/* loaded from: classes.dex */
public abstract /* synthetic */ class yt5 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[VideoRenderer.values().length];
        try {
            iArr[VideoRenderer.OPENGL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[VideoRenderer.COMPUTE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
