package mh;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class o implements mc.l {
    public final /* synthetic */ int A;
    public final /* synthetic */ n1.x B;
    public final /* synthetic */ zc.u L;
    public final /* synthetic */ float R;

    public /* synthetic */ o(n1.x xVar, zc.u uVar, float f8, int i2) {
        this.A = i2;
        this.B = xVar;
        this.L = uVar;
        this.R = f8;
    }

    @Override // mc.l
    public final Object k(Object obj) {
        switch (this.A) {
            case 0:
                g3.r rVar = (g3.r) obj;
                rVar.getClass();
                rVar.b(new o(this.B, this.L, this.R, 1));
                return yb.y.f14813a;
            default:
                g3.a aVar = (g3.a) obj;
                aVar.getClass();
                int i2 = aVar.f5497a;
                n1.x xVar = this.B;
                zc.u uVar = this.L;
                float f8 = this.R;
                if (i2 == 5) {
                    if (xVar.a()) {
                        aVar.f5498b = true;
                        zc.x.v(uVar, null, null, new v(xVar, f8, null, 0), 3);
                    } else if (xVar.g() == 0) {
                        aVar.f5498b = true;
                    }
                } else if (i2 == 6 && xVar.d()) {
                    aVar.f5498b = true;
                    zc.x.v(uVar, null, null, new v(xVar, f8, null, 1), 3);
                }
                return yb.y.f14813a;
        }
    }
}
