package g2;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class z6 {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int[] f5496a;

    static {
        int[] iArr = new int[c2.values().length];
        try {
            iArr[c2.Focused.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[c2.UnfocusedEmpty.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[c2.UnfocusedNotEmpty.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f5496a = iArr;
    }
}
