package a2;

import a1.f0;
import a1.h0;
import ai.r0;
import f2.s0;
import f2.t0;
import f2.u0;
import f2.v0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class l {
    public static final b3.p a(b3.p pVar, r0 r0Var) {
        return pVar.f(new b(r0Var));
    }

    public static final x1.c b(a4.j jVar) {
        x1.f fVar;
        w1.a aVar = new w1.a();
        a4.l.w(jVar, e.f124a, new c(2, new c(1, aVar), new g(1, aVar, w1.a.class, "addFilter", "addFilter$foundation(Lkotlin/jvm/functions/Function1;)V", 0, 0, 1)));
        h0 h0Var = new h0();
        h0 h0Var2 = aVar.f14111a;
        Object[] objArr = h0Var2.f44a;
        int i2 = h0Var2.f45b;
        x1.b bVar = null;
        int i10 = 0;
        boolean z10 = true;
        x1.b bVar2 = null;
        while (true) {
            fVar = x1.f.f14333b;
            if (i10 >= i2) {
                break;
            }
            x1.b bVar3 = (x1.b) objArr[i10];
            if (!z10 || bVar3 != fVar) {
                if (bVar3 != fVar || bVar2 != fVar) {
                    if (bVar3 != fVar) {
                        h0 h0Var3 = aVar.f14112b;
                        Object[] objArr2 = h0Var3.f44a;
                        int i11 = h0Var3.f45b;
                        for (int i12 = 0; i12 < i11; i12++) {
                            if (((Boolean) ((mc.l) objArr2[i12]).k(bVar3)).booleanValue()) {
                            }
                        }
                    }
                    h0Var.a(bVar3);
                    z10 = false;
                    bVar2 = bVar3;
                }
                z10 = false;
                break;
            }
            i10++;
        }
        if (!h0Var.h()) {
            bVar = h0Var.f44a[h0Var.f45b - 1];
        }
        if (bVar == fVar) {
            h0Var.k(h0Var.f45b - 1);
        }
        f0 f0Var = h0Var.f46c;
        if (f0Var == null) {
            f0Var = new f0(0, h0Var);
            h0Var.f46c = f0Var;
        }
        return new x1.c(f0Var);
    }

    public static final b3.p c(t0 t0Var) {
        return new f(t0Var);
    }

    public static final b3.p d(b3.p pVar, a0.g gVar, u0 u0Var, v0 v0Var, s0 s0Var) {
        return pVar.f(new m(gVar, u0Var, v0Var, s0Var));
    }
}
