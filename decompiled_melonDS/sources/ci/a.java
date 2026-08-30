package ci;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class a {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int[] f2882a;

    static {
        int[] iArr = new int[oe.d.values().length];
        try {
            iArr[oe.d.STARTING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[oe.d.ONGOING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[oe.d.NOT_IMPORTING.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[oe.d.FAILED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[oe.d.FINISHED.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f2882a = iArr;
    }
}
