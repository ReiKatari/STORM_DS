package g3;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class i0 {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int[] f5520a;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ int[] f5521b;

    static {
        int[] iArr = new int[x4.m.values().length];
        try {
            iArr[x4.m.Ltr.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[x4.m.Rtl.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f5520a = iArr;
        int[] iArr2 = new int[e0.values().length];
        try {
            iArr2[e0.Active.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[e0.ActiveParent.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[e0.Captured.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[e0.Inactive.ordinal()] = 4;
        } catch (NoSuchFieldError unused6) {
        }
        f5521b = iArr2;
    }
}
