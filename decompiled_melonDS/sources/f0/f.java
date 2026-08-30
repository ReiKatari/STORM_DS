package f0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class f {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int[] f4518a;

    static {
        int[] iArr = new int[g.values().length];
        try {
            iArr[g.PREVIEW.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[g.IMAGE_CAPTURE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[g.VIDEO_CAPTURE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[g.STREAM_SHARING.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[g.UNDEFINED.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f4518a = iArr;
    }
}
