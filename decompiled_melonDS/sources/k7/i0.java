package k7;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class i0 extends ec.c {
    public n R;
    public String X;
    public String[] Y;
    public int Z;

    /* renamed from: b0  reason: collision with root package name */
    public int f8023b0;

    /* renamed from: c0  reason: collision with root package name */
    public /* synthetic */ Object f8024c0;

    /* renamed from: d0  reason: collision with root package name */
    public final /* synthetic */ m0 f8025d0;

    /* renamed from: e0  reason: collision with root package name */
    public int f8026e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(m0 m0Var, ec.c cVar) {
        super(cVar);
        this.f8025d0 = m0Var;
    }

    @Override // ec.a
    public final Object v(Object obj) {
        this.f8024c0 = obj;
        this.f8026e0 |= Integer.MIN_VALUE;
        return m0.d(this.f8025d0, null, 0, this);
    }
}
