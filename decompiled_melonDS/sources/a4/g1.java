package a4;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class g1 {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int[] f218a;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ int[] f219b;

    static {
        int[] iArr = new int[i0.values().length];
        try {
            iArr[i0.Measuring.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[i0.LayingOut.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f218a = iArr;
        int[] iArr2 = new int[k0.values().length];
        try {
            iArr2[k0.InMeasureBlock.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[k0.InLayoutBlock.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        f219b = iArr2;
    }
}
