package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: lj7  reason: default package */
/* loaded from: classes.dex */
public abstract /* synthetic */ class lj7 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[bj7.values().length];
        try {
            iArr[bj7.IMAGE_ANALYSIS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[bj7.IMAGE_CAPTURE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[bj7.PREVIEW.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[bj7.VIDEO_CAPTURE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[bj7.STREAM_SHARING.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        a = iArr;
        int[] iArr2 = new int[da2.values().length];
        try {
            iArr2[da2.DYNAMIC_RANGE.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[da2.FPS_RANGE.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[da2.VIDEO_STABILIZATION.ordinal()] = 3;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[da2.IMAGE_FORMAT.ordinal()] = 4;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[da2.RECORDING_QUALITY.ordinal()] = 5;
        } catch (NoSuchFieldError unused10) {
        }
        b = iArr2;
    }
}
