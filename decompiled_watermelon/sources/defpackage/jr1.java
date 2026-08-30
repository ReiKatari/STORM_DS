package defpackage;

import me.magnum.melonds.domain.model.VideoRenderer;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: jr1  reason: default package */
/* loaded from: classes.dex */
public abstract /* synthetic */ class jr1 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;
    public static final /* synthetic */ int[] c;

    static {
        int[] iArr = new int[zu6.values().length];
        try {
            iArr[zu6.SOFTCORE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[zu6.HARDCORE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[zu6.SOFTCORE_OFFLINE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
        int[] iArr2 = new int[ku6.values().length];
        try {
            iArr2[ku6.MISSING_FROM_CURRENT_SET.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[ku6.DEFINITION_CHANGED.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[ku6.NOT_IN_PREFETCH_CACHE.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[ku6.SERVER_REJECTED.ordinal()] = 4;
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
