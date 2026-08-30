package cd;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class c1 {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int[] f2819a;

    static {
        int[] iArr = new int[bd.a.values().length];
        try {
            iArr[bd.a.SUSPEND.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[bd.a.DROP_LATEST.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[bd.a.DROP_OLDEST.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f2819a = iArr;
    }
}
