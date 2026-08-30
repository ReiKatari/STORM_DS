package g2;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class o5 extends ec.j implements mc.p {
    public /* synthetic */ boolean X;
    public final /* synthetic */ n2.w0 Y;
    public final /* synthetic */ n2.w0 Z;

    /* renamed from: b0  reason: collision with root package name */
    public final /* synthetic */ n2.w0 f5328b0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o5(n2.w0 w0Var, n2.w0 w0Var2, n2.w0 w0Var3, cc.c cVar) {
        super(2, cVar);
        this.Y = w0Var;
        this.Z = w0Var2;
        this.f5328b0 = w0Var3;
    }

    @Override // mc.p
    public final Object j(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        yb.y yVar = yb.y.f14813a;
        ((o5) t((cc.c) obj2, bool)).v(yVar);
        return yVar;
    }

    @Override // ec.a
    public final cc.c t(cc.c cVar, Object obj) {
        o5 o5Var = new o5(this.Y, this.Z, this.f5328b0, cVar);
        o5Var.X = ((Boolean) obj).booleanValue();
        return o5Var;
    }

    @Override // ec.a
    public final Object v(Object obj) {
        dc.a aVar = dc.a.COROUTINE_SUSPENDED;
        p7.j.I(obj);
        boolean z10 = this.X;
        float f8 = p5.f5347a;
        if (((Boolean) this.Y.getValue()).booleanValue() != z10) {
            mc.l lVar = (mc.l) this.Z.getValue();
            if (lVar != null) {
                lVar.k(Boolean.valueOf(z10));
            }
            n2.w0 w0Var = this.f5328b0;
            w0Var.setValue(Boolean.valueOf(!((Boolean) w0Var.getValue()).booleanValue()));
        }
        return yb.y.f14813a;
    }
}
