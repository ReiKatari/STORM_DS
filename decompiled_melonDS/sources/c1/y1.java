package c1;

import java.util.Iterator;
import java.util.Map;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class y1 implements y3.s0 {
    public final /* synthetic */ y3.s0 A;
    public final zc.u B;
    public y3.z X;
    public y3.z Y;
    public final n2.f1 L = n2.s.w(Boolean.FALSE);
    public final y R = new y(1, this);
    public final z2.p Z = new z2.p();

    /* renamed from: b0  reason: collision with root package name */
    public final z2.s f2549b0 = new z2.s();

    public y1(y3.s0 s0Var, zc.u uVar) {
        this.A = s0Var;
        this.B = uVar;
    }

    public static w1 c(String str, n2.r rVar) {
        rVar.X(800730162);
        rVar.X(-148945892);
        boolean f8 = rVar.f(str);
        Object L = rVar.L();
        if (f8 || L == n2.l.f9953a) {
            L = new w1(str);
            rVar.h0(L);
        }
        w1 w1Var = (w1) L;
        w1Var.f2544b.setValue(s1.f2520a);
        rVar.p(false);
        rVar.p(false);
        return w1Var;
    }

    public static b3.p e(y1 y1Var, b3.p pVar, w1 w1Var, f0 f0Var) {
        v1.f2536a.getClass();
        z1 z1Var = c2.f2399b;
        y1Var.getClass();
        return b3.a.a(pVar, new i(w1Var, f0Var.a(), y1Var, z1Var, 1));
    }

    @Override // y3.s0
    public final y3.z a(y3.z zVar) {
        return this.A.a(zVar);
    }

    public final boolean b() {
        return ((Boolean) this.L.getValue()).booleanValue();
    }

    @Override // y3.s0
    public final long d(y3.z zVar, y3.z zVar2) {
        return this.A.d(zVar, zVar2);
    }

    public final void f() {
        boolean z10;
        z2.s sVar = this.f2549b0;
        boolean isEmpty = sVar.isEmpty();
        z2.m mVar = sVar.B;
        if (!isEmpty) {
            Iterator it = mVar.iterator();
            while (it.hasNext()) {
                if (((p1) ((Map.Entry) it.next()).getValue()).a()) {
                    z10 = true;
                    break;
                }
            }
        }
        z10 = false;
        if (z10 != b()) {
            this.L.setValue(Boolean.valueOf(z10));
            if (!z10) {
                Iterator it2 = mVar.iterator();
                while (it2.hasNext()) {
                    p1 p1Var = (p1) ((Map.Entry) it2.next()).getValue();
                    z2.p pVar = p1Var.f2501h;
                    if (pVar.size() > 1) {
                        int i2 = r1.f2518a;
                        int size = pVar.size();
                        for (int i10 = 0; i10 < size; i10++) {
                            if (((q1) pVar.get(i10)).d().b()) {
                                break;
                            }
                        }
                    }
                    h2 h2Var = p1Var.f2496c;
                    h2Var.getClass();
                    h2Var.f2435g = r2.NoRequest;
                    h2Var.f2429a = ((n2.c1) h2Var.f2433e).g();
                    ((n2.f1) h2Var.f2432d).setValue(i1.f2444a);
                }
            }
        }
        Iterator it3 = mVar.iterator();
        while (it3.hasNext()) {
            ((p1) ((Map.Entry) it3.next()).getValue()).b();
        }
    }
}
