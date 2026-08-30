package defpackage;

import me.magnum.melonds.domain.model.VideoRenderer;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ba5  reason: default package */
/* loaded from: classes.dex */
public abstract /* synthetic */ class ba5 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[VideoRenderer.values().length];
        try {
            iArr[VideoRenderer.SOFTWARE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[VideoRenderer.VULKAN.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[VideoRenderer.OPENGL.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[VideoRenderer.COMPUTE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
