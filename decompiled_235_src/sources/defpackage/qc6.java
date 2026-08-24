package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: qc6  reason: default package */
/* loaded from: classes.dex */
public abstract /* synthetic */ class qc6 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[da2.values().length];
        try {
            iArr[da2.DYNAMIC_RANGE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[da2.FPS_RANGE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[da2.VIDEO_STABILIZATION.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[da2.IMAGE_FORMAT.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[da2.RECORDING_QUALITY.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        a = iArr;
    }
}
