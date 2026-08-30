package y3;

import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class p1 extends nc.l implements mc.p {
    public final /* synthetic */ int B;
    public final /* synthetic */ q1 L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p1(q1 q1Var, int i2) {
        super(2);
        this.B = i2;
        this.L = q1Var;
    }

    @Override // mc.p
    public final Object j(Object obj, Object obj2) {
        switch (this.B) {
            case 0:
                a4.o0 o0Var = (a4.o0) obj;
                this.L.a().B = (n2.v) obj2;
                return yb.y.f14813a;
            case DSiCameraSource.FrontCamera /* 1 */:
                p0 a10 = this.L.a();
                ((a4.o0) obj).e0(new l0(a10, (mc.p) obj2, a10.f14727j0));
                return yb.y.f14813a;
            default:
                a4.o0 o0Var2 = (a4.o0) obj;
                q1 q1Var = (q1) obj2;
                q1 q1Var2 = this.L;
                s1 s1Var = q1Var2.f14729a;
                p0 p0Var = o0Var2.C0;
                if (p0Var == null) {
                    p0Var = new p0(o0Var2, s1Var);
                    o0Var2.C0 = p0Var;
                }
                q1Var2.f14730b = p0Var;
                q1Var2.a().h();
                p0 a11 = q1Var2.a();
                if (a11.L != s1Var) {
                    a11.L = s1Var;
                    a11.i(false);
                    a4.o0.X(a11.A, false, 7);
                }
                return yb.y.f14813a;
        }
    }
}
