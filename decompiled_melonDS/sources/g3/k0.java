package g3;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class k0 {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int[] f5523a;

    static {
        int[] iArr = new int[e0.values().length];
        try {
            iArr[e0.ActiveParent.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[e0.Active.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[e0.Captured.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[e0.Inactive.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f5523a = iArr;
    }
}
