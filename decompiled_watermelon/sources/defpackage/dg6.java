package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: dg6  reason: default package */
/* loaded from: classes.dex */
public abstract /* synthetic */ class dg6 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[d57.values().length];
        try {
            iArr[d57.IMAGE_CAPTURE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[d57.VIDEO_CAPTURE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[d57.STREAM_SHARING.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[d57.PREVIEW.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[d57.IMAGE_ANALYSIS.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        a = iArr;
    }
}
