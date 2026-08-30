package p1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class w0 implements mc.l {
    public final /* synthetic */ int A;
    public final /* synthetic */ y0 B;

    public /* synthetic */ w0(y0 y0Var, int i2) {
        this.A = i2;
        this.B = y0Var;
    }

    @Override // mc.l
    public final Object k(Object obj) {
        switch (this.A) {
            case 0:
                z zVar = (z) this.B.f11289i0.b();
                int a10 = zVar.a();
                int i2 = 0;
                while (true) {
                    if (i2 < a10) {
                        if (!zVar.b(i2).equals(obj)) {
                            i2++;
                        }
                    } else {
                        i2 = -1;
                    }
                }
                return Integer.valueOf(i2);
            default:
                int intValue = ((Integer) obj).intValue();
                y0 y0Var = this.B;
                z zVar2 = (z) y0Var.f11289i0.b();
                if (intValue < 0 || intValue >= zVar2.a()) {
                    StringBuilder i10 = kc.a.i("Can't scroll to index ", intValue, ", it is out of bounds [0, ");
                    i10.append(zVar2.a());
                    i10.append(')');
                    k1.b.a(i10.toString());
                }
                zc.x.v(y0Var.C0(), null, null, new ai.f(y0Var, intValue, null, 2), 3);
                return Boolean.TRUE;
        }
    }
}
