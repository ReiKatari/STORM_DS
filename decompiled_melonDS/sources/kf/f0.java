package kf;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class f0 extends ec.c {
    public k6.a R;
    public cd.i X;
    public k6.a[] Y;
    public int Z;

    /* renamed from: b0  reason: collision with root package name */
    public int f8213b0;

    /* renamed from: c0  reason: collision with root package name */
    public /* synthetic */ Object f8214c0;

    /* renamed from: d0  reason: collision with root package name */
    public final /* synthetic */ l0 f8215d0;

    /* renamed from: e0  reason: collision with root package name */
    public int f8216e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(l0 l0Var, ec.c cVar) {
        super(cVar);
        this.f8215d0 = l0Var;
    }

    @Override // ec.a
    public final Object v(Object obj) {
        this.f8214c0 = obj;
        this.f8216e0 |= Integer.MIN_VALUE;
        return this.f8215d0.c(null, null, this);
    }
}
