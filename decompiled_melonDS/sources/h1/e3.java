package h1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class e3 extends ec.c {
    public yb.d R;
    public mc.a X;
    public float Y;
    public /* synthetic */ Object Z;

    /* renamed from: b0  reason: collision with root package name */
    public final /* synthetic */ f3 f5889b0;

    /* renamed from: c0  reason: collision with root package name */
    public int f5890c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e3(f3 f3Var, ec.c cVar) {
        super(cVar);
        this.f5889b0 = f3Var;
    }

    @Override // ec.a
    public final Object v(Object obj) {
        this.Z = obj;
        this.f5890c0 |= Integer.MIN_VALUE;
        return this.f5889b0.a(null, null, this);
    }
}
