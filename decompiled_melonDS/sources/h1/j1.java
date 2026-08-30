package h1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class j1 extends ec.c {
    public p2 R;
    public nc.q X;
    public float Y;
    public /* synthetic */ Object Z;

    /* renamed from: b0  reason: collision with root package name */
    public final /* synthetic */ d0.b1 f5925b0;

    /* renamed from: c0  reason: collision with root package name */
    public int f5926c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(d0.b1 b1Var, ec.c cVar) {
        super(cVar);
        this.f5925b0 = b1Var;
    }

    @Override // ec.a
    public final Object v(Object obj) {
        this.Z = obj;
        this.f5926c0 |= Integer.MIN_VALUE;
        return d0.b1.a(this.f5925b0, null, null, 0.0f, 0.0f, this);
    }
}
