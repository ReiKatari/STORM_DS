package d0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class g1 {

    /* renamed from: d  reason: collision with root package name */
    public static final g1 f3382d = new g1(false, 0, false);

    /* renamed from: e  reason: collision with root package name */
    public static final g1 f3383e = new g1(true, 500, false);

    /* renamed from: f  reason: collision with root package name */
    public static final g1 f3384f;

    /* renamed from: a  reason: collision with root package name */
    public final long f3385a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f3386b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f3387c;

    static {
        new g1(true, 100L, false);
        f3384f = new g1(false, 0L, true);
    }

    public g1(boolean z10, long j2, boolean z11) {
        this.f3386b = z10;
        this.f3385a = j2;
        if (z11) {
            p7.m.g("shouldRetry must be false when completeWithoutFailure is set to true", !z10);
        }
        this.f3387c = z11;
    }
}
