package y2;

import g2.q5;
import java.util.Arrays;
import mc.l;
import mc.p;
import mg.m;
import n2.r;
import n2.s;
import nc.w;
import od.n;
import p1.a0;
import p1.c1;
import u1.h1;
import yb.y;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class k {

    /* renamed from: a  reason: collision with root package name */
    public static final a0 f14659a = new a0(28, new m(21, (byte) 0), new h1(24));

    public static final String a(Object obj) {
        return obj + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it to rememberSaveable().";
    }

    public static final a0 b(p pVar, l lVar) {
        q5 q5Var = new q5(pVar, 3, (byte) 0);
        w.b(1, lVar);
        return new a0(28, q5Var, lVar);
    }

    public static final Object c(Object[] objArr, mc.a aVar, n2.m mVar, int i2) {
        return e(Arrays.copyOf(objArr, objArr.length), f14659a, aVar, mVar, ((i2 << 6) & 7168) | 384, 0);
    }

    public static final Object d(Object[] objArr, j jVar, mc.a aVar, n2.m mVar, int i2) {
        return e(Arrays.copyOf(objArr, objArr.length), jVar, aVar, mVar, 384 | ((i2 << 3) & 7168), 0);
    }

    public static final Object e(Object[] objArr, j jVar, mc.a aVar, n2.m mVar, int i2, int i10) {
        Object[] objArr2;
        j jVar2;
        boolean z10;
        final Object obj;
        Object obj2;
        Object d4;
        r rVar = (r) mVar;
        long j2 = rVar.T;
        p7.k.f(36);
        final String l10 = Long.toString(j2, 36);
        l10.getClass();
        jVar.getClass();
        final f fVar = (f) rVar.j(h.f14658a);
        Object L = rVar.L();
        Object obj3 = null;
        n2.e eVar = n2.l.f9953a;
        if (L == eVar) {
            if (fVar != null && (d4 = fVar.d(l10)) != null) {
                obj2 = jVar.f(d4);
            } else {
                obj2 = null;
            }
            if (obj2 == null) {
                obj2 = aVar.b();
            }
            objArr2 = objArr;
            jVar2 = jVar;
            c cVar = new c(jVar2, fVar, l10, obj2, objArr2);
            rVar.h0(cVar);
            L = cVar;
        } else {
            objArr2 = objArr;
            jVar2 = jVar;
        }
        final c cVar2 = (c) L;
        if (Arrays.equals(objArr2, cVar2.X)) {
            obj3 = cVar2.R;
        }
        if (obj3 == null) {
            obj3 = aVar.b();
        }
        boolean h2 = rVar.h(cVar2);
        if ((((i2 & 112) ^ 48) > 32 && rVar.h(jVar2)) || (i2 & 48) == 32) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean h10 = h2 | z10 | rVar.h(fVar) | rVar.f(l10) | rVar.h(obj3) | rVar.h(objArr2);
        Object L2 = rVar.L();
        if (!h10 && L2 != eVar) {
            obj = obj3;
        } else {
            final Object[] objArr3 = objArr2;
            obj = obj3;
            final j jVar3 = jVar2;
            mc.a aVar2 = new mc.a() { // from class: y2.a
                @Override // mc.a
                public final Object b() {
                    boolean z11;
                    c cVar3 = c.this;
                    f fVar2 = cVar3.B;
                    f fVar3 = fVar;
                    boolean z12 = true;
                    if (fVar2 != fVar3) {
                        cVar3.B = fVar3;
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    String str = cVar3.L;
                    String str2 = l10;
                    if (!nc.k.a(str, str2)) {
                        cVar3.L = str2;
                    } else {
                        z12 = z11;
                    }
                    cVar3.A = jVar3;
                    cVar3.R = obj;
                    cVar3.X = objArr3;
                    c1 c1Var = cVar3.Y;
                    if (c1Var != null && z12) {
                        c1Var.s();
                        cVar3.Y = null;
                        cVar3.d();
                    }
                    return y.f14813a;
                }
            };
            rVar.h0(aVar2);
            L2 = aVar2;
        }
        s.h((mc.a) L2, rVar);
        return obj;
    }

    public static final e f(n2.m mVar) {
        r rVar = (r) mVar;
        rVar.X(1967007413);
        Object[] objArr = new Object[0];
        Object L = rVar.L();
        if (L == n2.l.f9953a) {
            L = new n(20);
            rVar.h0(L);
        }
        e eVar = (e) d(objArr, e.X, (mc.a) L, rVar, 384);
        eVar.L = (f) rVar.j(h.f14658a);
        rVar.p(false);
        return eVar;
    }
}
