package c1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class x0 {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int[] f2548a;

    static {
        int[] iArr = new int[m0.values().length];
        try {
            iArr[m0.Visible.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[m0.PreEnter.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[m0.PostExit.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f2548a = iArr;
    }
}
