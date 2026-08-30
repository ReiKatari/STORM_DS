package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: sh2  reason: default package */
/* loaded from: classes.dex */
public abstract /* synthetic */ class sh2 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[rh2.values().length];
        try {
            iArr[rh2.STARTED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[rh2.FRAME_INFO_COMPLETE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[rh2.STREAM_RESULTS_COMPLETE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[rh2.COMPLETE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
