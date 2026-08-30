package g2;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class r6 implements mc.q {
    public final /* synthetic */ d1 A;
    public final /* synthetic */ boolean B;
    public final /* synthetic */ boolean L;
    public final /* synthetic */ j1.i R;

    public r6(d1 d1Var, boolean z10, boolean z11, j1.i iVar) {
        this.A = d1Var;
        this.B = z10;
        this.L = z11;
        this.R = iVar;
    }

    @Override // mc.q
    public final Object i(Object obj, Object obj2, Object obj3) {
        boolean z10;
        long j2;
        c2 c2Var = (c2) obj;
        ((Number) obj3).intValue();
        n2.r rVar = (n2.r) ((n2.m) obj2);
        rVar.X(1423138213);
        if (c2Var == c2.UnfocusedEmpty) {
            z10 = false;
        } else {
            z10 = this.L;
        }
        d1 d1Var = this.A;
        d1Var.getClass();
        rVar.X(-1749156593);
        n2.w0 m = a.a.m(this.R, rVar, 0);
        if (!this.B) {
            j2 = d1Var.f5107s;
        } else if (z10) {
            j2 = d1Var.f5108t;
        } else if (((Boolean) m.getValue()).booleanValue()) {
            j2 = d1Var.f5105q;
        } else {
            j2 = d1Var.f5106r;
        }
        long j10 = ((i3.s) w.d.v(j2, rVar, false).getValue()).f6689a;
        rVar.p(false);
        return new i3.s(j10);
    }
}
