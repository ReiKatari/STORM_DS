package cd;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class s1 extends ec.c {
    public t1 R;
    public dd.v X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ t1 Z;

    /* renamed from: b0  reason: collision with root package name */
    public int f2862b0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s1(t1 t1Var, ec.c cVar) {
        super(cVar);
        this.Z = t1Var;
    }

    @Override // ec.a
    public final Object v(Object obj) {
        this.Y = obj;
        this.f2862b0 |= Integer.MIN_VALUE;
        return this.Z.b(this);
    }
}
