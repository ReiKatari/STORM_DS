package ai;

import c1.y1;
import l1.d1;
import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class y0 implements mc.p {
    public final /* synthetic */ int A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ int L;
    public final /* synthetic */ Object R;
    public final /* synthetic */ Object X;
    public final /* synthetic */ Object Y;

    public /* synthetic */ y0(b3.p pVar, mg.l lVar, d1 d1Var, mc.a aVar, int i2) {
        this.A = 3;
        this.B = pVar;
        this.X = lVar;
        this.R = d1Var;
        this.Y = aVar;
        this.L = i2;
    }

    @Override // mc.p
    public final Object j(Object obj, Object obj2) {
        switch (this.A) {
            case 0:
                ((Integer) obj2).getClass();
                n.o((b3.p) this.B, (d1) this.R, (zh.x) this.X, (mc.l) this.Y, (n2.m) obj, n2.s.F(this.L | 1));
                break;
            case DSiCameraSource.FrontCamera /* 1 */:
                ((Integer) obj2).getClass();
                c9.m.c((b3.p) this.B, (c9.k) this.R, (b3.d) this.X, (y3.o) this.Y, (n2.m) obj, n2.s.F(this.L | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                ig.m.f((oe.a) this.B, (y1) this.R, (c1.p) this.X, (mc.a) this.Y, (n2.m) obj, n2.s.F(this.L | 1));
                break;
            case 3:
                ((Integer) obj2).intValue();
                mg.n.a((b3.p) this.B, (mg.l) this.X, (d1) this.R, (mc.a) this.Y, (n2.m) obj, n2.s.F(this.L | 1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                int F = n2.s.F(this.L | 1);
                Object obj3 = this.R;
                l0.f.a((b3.p) this.B, obj3, (a4.n) this.X, (mc.q) this.Y, (n2.m) obj, F);
                break;
            case l1.c.f8511g /* 5 */:
                ((Integer) obj2).getClass();
                int F2 = n2.s.F(this.L | 1);
                Object obj4 = this.R;
                p7.k.b((Boolean) this.B, obj4, (androidx.lifecycle.x) this.X, (mc.l) this.Y, (n2.m) obj, F2);
                break;
            default:
                ((Integer) obj2).getClass();
                ((v2.c) this.B).f(this.R, this.X, this.Y, (n2.m) obj, n2.s.F(this.L) | 1);
                break;
        }
        return yb.y.f14813a;
    }

    public /* synthetic */ y0(Object obj, Object obj2, Object obj3, Object obj4, int i2, int i10) {
        this.A = i10;
        this.B = obj;
        this.R = obj2;
        this.X = obj3;
        this.Y = obj4;
        this.L = i2;
    }
}
