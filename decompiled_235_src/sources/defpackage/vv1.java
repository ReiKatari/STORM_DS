package defpackage;

import me.magnum.melonds.domain.model.VideoRenderer;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: vv1  reason: default package */
/* loaded from: classes.dex */
public abstract /* synthetic */ class vv1 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;
    public static final /* synthetic */ int[] c;

    static {
        int[] iArr = new int[q77.values().length];
        try {
            iArr[q77.SOFTCORE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[q77.HARDCORE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[q77.SOFTCORE_OFFLINE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
        int[] iArr2 = new int[b77.values().length];
        try {
            iArr2[b77.MISSING_FROM_CURRENT_SET.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[b77.DEFINITION_CHANGED.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[b77.NOT_IN_PREFETCH_CACHE.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[b77.SERVER_REJECTED.ordinal()] = 4;
        } catch (NoSuchFieldError unused7) {
        }
        b = iArr2;
        int[] iArr3 = new int[VideoRenderer.values().length];
        try {
            iArr3[VideoRenderer.SOFTWARE.ordinal()] = 1;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr3[VideoRenderer.OPENGL.ordinal()] = 2;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr3[VideoRenderer.VULKAN.ordinal()] = 3;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr3[VideoRenderer.COMPUTE.ordinal()] = 4;
        } catch (NoSuchFieldError unused11) {
        }
        c = iArr3;
    }
}
