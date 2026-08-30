package ah;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class o {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int[] f802a;

    static {
        int[] iArr = new int[oe.p.values().length];
        try {
            iArr[oe.p.TOP_LEFT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[oe.p.TOP_CENTER.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[oe.p.TOP_RIGHT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[oe.p.BOTTOM_LEFT.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[oe.p.BOTTOM_CENTER.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[oe.p.BOTTOM_RIGHT.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[oe.p.HIDDEN.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        f802a = iArr;
    }
}
