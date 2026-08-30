package c1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class o1 extends nc.l implements mc.a {
    public final /* synthetic */ int B;
    public final /* synthetic */ p1 L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o1(p1 p1Var, int i2) {
        super(0);
        this.B = i2;
        this.L = p1Var;
    }

    @Override // mc.a
    public final Object b() {
        Object obj;
        switch (this.B) {
            case 0:
                p1 p1Var = this.L;
                boolean z10 = p1Var.f2498e;
                d1.c cVar = p1Var.f2497d;
                y1 y1Var = p1Var.f2495b;
                if (!z10 && y1Var.b() && ((Boolean) cVar.f3526d.getValue()).booleanValue()) {
                    z2.p pVar = p1Var.f2501h;
                    int size = pVar.size();
                    int i2 = 0;
                    while (true) {
                        if (i2 < size) {
                            obj = pVar.get(i2);
                            if (!((q1) obj).d().b()) {
                                i2++;
                            }
                        } else {
                            obj = null;
                        }
                    }
                    q1 q1Var = (q1) obj;
                    if (q1Var != null) {
                        d1.x xVar = q1Var.d().f2442f;
                        if (xVar instanceof d1.a1) {
                            d1.a1 a1Var = (d1.a1) xVar;
                            zc.x.v(y1Var.B, null, null, new a5.o(p1Var, new d1.a1(a1Var.f3515a, a1Var.f3516b, new h3.b((Float.floatToRawIntBits(1.0f) << 32) | (Float.floatToRawIntBits(1.0f) & 4294967295L))), null, 18), 3);
                        }
                        p1Var.f2498e = true;
                    }
                }
                return new h3.b(((h3.b) cVar.e()).f6050a);
            default:
                z2.p pVar2 = this.L.f2500g;
                int size2 = pVar2.size();
                for (int i10 = 0; i10 < size2; i10++) {
                    q1 q1Var2 = (q1) pVar2.get(i10);
                    if (q1Var2.d().b() && q1Var2.h()) {
                        return yb.y.f14813a;
                    }
                }
                return yb.y.f14813a;
        }
    }
}
