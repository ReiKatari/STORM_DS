package n2;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class h1 {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int[] f9903a;

    static {
        int[] iArr = new int[j1.values().length];
        try {
            iArr[j1.InitialPending.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[j1.RecomposePending.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[j1.Recomposing.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[j1.ApplyPending.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[j1.Applied.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[j1.Cancelled.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[j1.Invalid.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        f9903a = iArr;
    }
}
