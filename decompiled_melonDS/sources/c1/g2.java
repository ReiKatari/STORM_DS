package c1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class g2 {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int[] f2426a;

    static {
        int[] iArr = new int[r2.values().length];
        try {
            iArr[r2.NoMatchFound.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[r2.NoRequest.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[r2.MatchFound.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[r2.VisibleContentAbsentDuringTransition.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f2426a = iArr;
    }
}
