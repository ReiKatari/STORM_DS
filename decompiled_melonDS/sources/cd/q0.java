package cd;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class q0 {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int[] f2858a;

    static {
        int[] iArr = new int[g1.values().length];
        try {
            iArr[g1.START.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[g1.STOP.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[g1.STOP_AND_RESET_REPLAY_CACHE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f2858a = iArr;
    }
}
