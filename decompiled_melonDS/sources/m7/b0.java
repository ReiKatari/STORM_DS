package m7;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class b0 extends ec.c {
    public String R;
    public mc.l X;
    public g Y;
    public /* synthetic */ Object Z;

    /* renamed from: b0  reason: collision with root package name */
    public final /* synthetic */ c0 f9310b0;

    /* renamed from: c0  reason: collision with root package name */
    public int f9311c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(c0 c0Var, ec.c cVar) {
        super(cVar);
        this.f9310b0 = c0Var;
    }

    @Override // ec.a
    public final Object v(Object obj) {
        this.Z = obj;
        this.f9311c0 |= Integer.MIN_VALUE;
        return this.f9310b0.a(null, null, this);
    }
}
