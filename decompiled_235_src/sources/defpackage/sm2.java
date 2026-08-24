package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: sm2  reason: default package */
/* loaded from: classes.dex */
public abstract /* synthetic */ class sm2 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[rm2.values().length];
        try {
            iArr[rm2.STARTED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[rm2.FRAME_INFO_COMPLETE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[rm2.STREAM_RESULTS_COMPLETE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[rm2.COMPLETE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
