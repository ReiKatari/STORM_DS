package g3;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class f0 {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int[] f5506a;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ int[] f5507b;

    static {
        int[] iArr = new int[b.values().length];
        try {
            iArr[b.None.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[b.Redirected.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[b.Cancelled.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[b.RedirectCancelled.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f5506a = iArr;
        int[] iArr2 = new int[e0.values().length];
        try {
            iArr2[e0.Active.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[e0.Captured.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[e0.ActiveParent.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[e0.Inactive.ordinal()] = 4;
        } catch (NoSuchFieldError unused8) {
        }
        f5507b = iArr2;
    }
}
