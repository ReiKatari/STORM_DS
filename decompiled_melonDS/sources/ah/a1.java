package ah;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class a1 extends ec.c {
    public ze.a R;
    public oe.j0 X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ h1 Z;

    /* renamed from: b0  reason: collision with root package name */
    public int f720b0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(h1 h1Var, ec.c cVar) {
        super(cVar);
        this.Z = h1Var;
    }

    @Override // ec.a
    public final Object v(Object obj) {
        this.Y = obj;
        this.f720b0 |= Integer.MIN_VALUE;
        return h1.k(this.Z, null, null, this);
    }
}
