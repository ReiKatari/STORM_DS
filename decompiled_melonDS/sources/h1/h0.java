package h1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class h0 extends ec.c {
    public v R;
    public j1.b X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ k0 Z;

    /* renamed from: b0  reason: collision with root package name */
    public int f5906b0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(k0 k0Var, ec.c cVar) {
        super(cVar);
        this.Z = k0Var;
    }

    @Override // ec.a
    public final Object v(Object obj) {
        this.Y = obj;
        this.f5906b0 |= Integer.MIN_VALUE;
        return k0.S0(this.Z, null, this);
    }
}
