package f2;

import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class g implements mc.p {
    public final /* synthetic */ int A = 0;
    public final /* synthetic */ boolean B;
    public final /* synthetic */ int L;
    public final /* synthetic */ Object R;
    public final /* synthetic */ Object X;

    public /* synthetic */ g(b3.p pVar, mc.a aVar, boolean z10, int i2) {
        this.R = pVar;
        this.X = aVar;
        this.B = z10;
        this.L = i2;
    }

    @Override // mc.p
    public final Object j(Object obj, Object obj2) {
        switch (this.A) {
            case 0:
                ((Integer) obj2).getClass();
                int F = n2.s.F(this.L | 1);
                pc.a.j((b3.p) this.R, (mc.a) this.X, this.B, (n2.m) obj, F);
                break;
            case DSiCameraSource.FrontCamera /* 1 */:
                ((Integer) obj2).getClass();
                int F2 = n2.s.F(this.L | 1);
                l0.f.b(this.B, (w4.j) this.R, (b1) this.X, (n2.m) obj, F2);
                break;
            default:
                ((Integer) obj2).getClass();
                int F3 = n2.s.F(1);
                p7.l.d((String) this.R, this.B, (mc.a) this.X, (n2.m) obj, F3, this.L);
                break;
        }
        return yb.y.f14813a;
    }

    public /* synthetic */ g(String str, boolean z10, mc.a aVar, int i2, int i10) {
        this.R = str;
        this.B = z10;
        this.X = aVar;
        this.L = i10;
    }

    public /* synthetic */ g(boolean z10, w4.j jVar, b1 b1Var, int i2) {
        this.B = z10;
        this.R = jVar;
        this.X = b1Var;
        this.L = i2;
    }
}
