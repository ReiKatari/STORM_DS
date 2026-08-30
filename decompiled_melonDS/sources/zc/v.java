package zc;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class v {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int[] f15029a;

    static {
        int[] iArr = new int[w.values().length];
        try {
            iArr[w.DEFAULT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[w.ATOMIC.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[w.UNDISPATCHED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[w.LAZY.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f15029a = iArr;
    }
}
