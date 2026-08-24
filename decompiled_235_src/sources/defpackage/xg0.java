package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xg0  reason: default package */
/* loaded from: classes.dex */
public abstract /* synthetic */ class xg0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[wg0.values().length];
        try {
            iArr[wg0.CAMERA.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[wg0.SCOPE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[wg0.THREAD.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
