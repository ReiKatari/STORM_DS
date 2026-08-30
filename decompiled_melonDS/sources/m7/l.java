package m7;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class l {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int[] f9325a;

    static {
        int[] iArr = new int[k7.b0.values().length];
        try {
            iArr[k7.b0.DEFERRED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[k7.b0.IMMEDIATE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[k7.b0.EXCLUSIVE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f9325a = iArr;
    }
}
