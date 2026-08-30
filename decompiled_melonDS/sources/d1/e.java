package d1;

import n2.s2;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f3555a = 0;

    static {
        d.q(7, null);
        h3.c cVar = h2.f3584a;
        d.q(3, new x4.f(0.4f));
        Float.floatToRawIntBits(1.0f);
        Float.floatToRawIntBits(1.0f);
        Float.floatToRawIntBits(1.0f);
        Float.floatToRawIntBits(1.0f);
    }

    public static final s2 a(float f8, v1 v1Var, n2.m mVar, int i2) {
        return c(new x4.f(f8), d.f3547l, v1Var, null, "DpAnimation", mVar, (i2 << 3) & 896, 8);
    }

    public static final s2 b(float f8, n2.m mVar, int i2, int i10) {
        String str;
        Float valueOf = Float.valueOf(0.01f);
        if ((i10 & 8) != 0) {
            str = "FloatAnimation";
        } else {
            str = "Tab position";
        }
        String str2 = str;
        n2.r rVar = (n2.r) mVar;
        rVar.X(1144089983);
        boolean c4 = rVar.c(0.01f);
        Object L = rVar.L();
        if (c4 || L == n2.l.f9953a) {
            L = d.q(3, valueOf);
            rVar.h0(L);
        }
        rVar.p(false);
        return c(Float.valueOf(f8), d.f3545j, (a1) L, valueOf, str2, mVar, (i2 << 3) & 57344, 0);
    }

    public static final s2 c(Object obj, w1 w1Var, j jVar, Float f8, String str, n2.m mVar, int i2, int i10) {
        if ((i10 & 8) != 0) {
            f8 = null;
        }
        n2.r rVar = (n2.r) mVar;
        Object L = rVar.L();
        Object obj2 = n2.l.f9953a;
        if (L == obj2) {
            L = n2.s.w(null);
            rVar.h0(L);
        }
        n2.w0 w0Var = (n2.w0) L;
        Object L2 = rVar.L();
        if (L2 == obj2) {
            L2 = new c(obj, w1Var, f8);
            rVar.h0(L2);
        }
        c cVar = (c) L2;
        n2.w0 A = n2.s.A(null, rVar);
        if (f8 != null && (jVar instanceof a1)) {
            a1 a1Var = (a1) jVar;
            if (!nc.k.a(a1Var.f3517c, f8)) {
                jVar = new a1(a1Var.f3515a, a1Var.f3516b, f8);
            }
        }
        n2.w0 A2 = n2.s.A(jVar, rVar);
        Object L3 = rVar.L();
        if (L3 == obj2) {
            L3 = ij.a.s(-1, 6, null);
            rVar.h0(L3);
        }
        bd.l lVar = (bd.l) L3;
        boolean h2 = rVar.h(lVar) | rVar.h(obj);
        Object L4 = rVar.L();
        if (h2 || L4 == obj2) {
            L4 = new a3.e(4, lVar, obj);
            rVar.h0(L4);
        }
        n2.s.h((mc.a) L4, rVar);
        boolean h10 = rVar.h(lVar) | rVar.h(cVar) | rVar.f(A2) | rVar.f(A);
        Object L5 = rVar.L();
        if (h10 || L5 == obj2) {
            Object eVar = new a9.e(lVar, cVar, A2, A, (cc.c) null);
            rVar.h0(eVar);
            L5 = eVar;
        }
        n2.s.g(lVar, (mc.p) L5, rVar);
        s2 s2Var = (s2) w0Var.getValue();
        if (s2Var == null) {
            return cVar.f3525c;
        }
        return s2Var;
    }
}
