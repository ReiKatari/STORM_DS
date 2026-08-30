package kf;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class h1 {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int[] f8227a;

    static {
        int[] iArr = new int[p8.e0.values().length];
        try {
            iArr[p8.e0.ENQUEUED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[p8.e0.RUNNING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[p8.e0.SUCCEEDED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[p8.e0.CANCELLED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[p8.e0.FAILED.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[p8.e0.BLOCKED.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        f8227a = iArr;
    }
}
