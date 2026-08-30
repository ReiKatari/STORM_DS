package k7;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class h0 extends ec.c {
    public n R;
    public String X;
    public String[] Y;
    public int Z;

    /* renamed from: b0  reason: collision with root package name */
    public int f8017b0;

    /* renamed from: c0  reason: collision with root package name */
    public int f8018c0;

    /* renamed from: d0  reason: collision with root package name */
    public /* synthetic */ Object f8019d0;

    /* renamed from: e0  reason: collision with root package name */
    public final /* synthetic */ m0 f8020e0;

    /* renamed from: f0  reason: collision with root package name */
    public int f8021f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(m0 m0Var, ec.c cVar) {
        super(cVar);
        this.f8020e0 = m0Var;
    }

    @Override // ec.a
    public final Object v(Object obj) {
        this.f8019d0 = obj;
        this.f8021f0 |= Integer.MIN_VALUE;
        return m0.c(this.f8020e0, null, 0, this);
    }
}
