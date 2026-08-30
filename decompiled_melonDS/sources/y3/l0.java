package y3;

import java.util.List;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class l0 extends a4.j0 {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ p0 f14704b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ mc.p f14705c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(p0 p0Var, mc.p pVar, String str) {
        super(str);
        this.f14704b = p0Var;
        this.f14705c = pVar;
    }

    @Override // y3.v0
    public final w0 a(x0 x0Var, List list, long j2) {
        p0 p0Var = this.f14704b;
        j0 j0Var = p0Var.f14719b0;
        j0Var.A = x0Var.getLayoutDirection();
        j0Var.B = x0Var.b();
        j0Var.L = x0Var.j();
        boolean q10 = x0Var.q();
        mc.p pVar = this.f14705c;
        if (!q10 && p0Var.A.f280d0 != null) {
            p0Var.X = 0;
            w0 w0Var = (w0) pVar.j(p0Var.f14720c0, new x4.a(j2));
            return new k0(w0Var, p0Var, p0Var.X, w0Var, 0);
        }
        p0Var.R = 0;
        w0 w0Var2 = (w0) pVar.j(j0Var, new x4.a(j2));
        return new k0(w0Var2, p0Var, p0Var.R, w0Var2, 1);
    }
}
