package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: o57  reason: default package */
/* loaded from: classes.dex */
public abstract /* synthetic */ class o57 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[d57.values().length];
        try {
            iArr[d57.IMAGE_ANALYSIS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[d57.IMAGE_CAPTURE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[d57.PREVIEW.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[d57.VIDEO_CAPTURE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[d57.STREAM_SHARING.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        a = iArr;
        int[] iArr2 = new int[k52.values().length];
        try {
            iArr2[k52.DYNAMIC_RANGE.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[k52.FPS_RANGE.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[k52.VIDEO_STABILIZATION.ordinal()] = 3;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[k52.IMAGE_FORMAT.ordinal()] = 4;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[k52.RECORDING_QUALITY.ordinal()] = 5;
        } catch (NoSuchFieldError unused10) {
        }
        b = iArr2;
    }
}
