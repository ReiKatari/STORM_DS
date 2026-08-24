package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: mr7  reason: default package */
/* loaded from: classes.dex */
public final class mr7 implements eo2 {
    public final /* synthetic */ boolean A;
    public final /* synthetic */ qn2 B;
    public final /* synthetic */ zq7 L;
    public final /* synthetic */ qn2 R;

    public mr7(boolean z, qn2 qn2Var, zq7 zq7Var, qn2 qn2Var2) {
        this.A = z;
        this.B = qn2Var;
        this.L = zq7Var;
        this.R = qn2Var2;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        boolean z;
        long g;
        gp1 gp1Var;
        px0 px0Var = (px0) obj;
        int intValue = ((Number) obj2).intValue();
        if ((intValue & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        xq2 xq2Var = (xq2) px0Var;
        if (xq2Var.S(intValue & 1, z)) {
            x64 x64Var = x64.a;
            a74 O = ge7.O(dj6.c(x64Var, 1.0f), 12.0f);
            l26 a = k26.a(ju.a, d90.i0, xq2Var, 48);
            int hashCode = Long.hashCode(xq2Var.T);
            xv4 l = xq2Var.l();
            a74 E = l.E(xq2Var, O);
            jx0.i.getClass();
            on2 on2Var = ix0.b;
            xq2Var.f0();
            if (xq2Var.S) {
                xq2Var.k(on2Var);
            } else {
                xq2Var.o0();
            }
            pn pnVar = ix0.f;
            yh2.K(xq2Var, pnVar, a);
            pn pnVar2 = ix0.e;
            yh2.K(xq2Var, pnVar2, l);
            Integer valueOf = Integer.valueOf(hashCode);
            pn pnVar3 = ix0.g;
            yh2.K(xq2Var, pnVar3, valueOf);
            ne neVar = ix0.h;
            yh2.F(xq2Var, neVar);
            pn pnVar4 = ix0.d;
            yh2.K(xq2Var, pnVar4, E);
            qn2 qn2Var = this.B;
            boolean f = xq2Var.f(qn2Var);
            zq7 zq7Var = this.L;
            boolean f2 = f | xq2Var.f(zq7Var);
            Object P = xq2Var.P();
            Object obj3 = ox0.a;
            if (f2 || P == obj3) {
                P = new lr7(qn2Var, zq7Var, 1);
                xq2Var.l0(P);
            }
            on2 on2Var2 = (on2) P;
            boolean z2 = this.A;
            if (z2) {
                xq2Var.b0(1408980765);
                xq2Var.p(false);
                g = hv.c(4278556265L);
            } else {
                xq2Var.b0(1408982163);
                g = ((ut0) xq2Var.j(vt0.a)).g();
                xq2Var.p(false);
            }
            kd5.a(z2, on2Var2, null, false, jx2.n(g, 0L, xq2Var, 0, 6), xq2Var, 0, 28);
            gi2.h(xq2Var, dj6.l(x64Var, 8.0f));
            vn3 vn3Var = new vn3(1.0f, true);
            yt0 a2 = wt0.a(ju.c, d90.k0, xq2Var, 0);
            int hashCode2 = Long.hashCode(xq2Var.T);
            xv4 l2 = xq2Var.l();
            a74 E2 = l.E(xq2Var, vn3Var);
            xq2Var.f0();
            if (xq2Var.S) {
                xq2Var.k(on2Var);
            } else {
                xq2Var.o0();
            }
            yh2.K(xq2Var, pnVar, a2);
            yh2.K(xq2Var, pnVar2, l2);
            i61.w(hashCode2, xq2Var, pnVar3, xq2Var, neVar);
            yh2.K(xq2Var, pnVar4, E2);
            String str = zq7Var.b;
            oj2 oj2Var = oj2.e0;
            long E3 = hi2.E(14);
            l55 l55Var = vt0.a;
            x37.b(str, null, ((ut0) xq2Var.j(l55Var)).f(), E3, oj2Var, null, 0L, null, 0L, 0, false, 0, 0, null, null, xq2Var, 199680, 0, 131026);
            x37.b(i61.m("Файл: ", zq7Var.d), null, kt0.c(0.7f, ((ut0) xq2Var.j(l55Var)).f()), hi2.E(11), null, null, 0L, null, 0L, 0, false, 0, 0, null, null, xq2Var, 3072, 0, 131058);
            xq2Var.p(true);
            if (z2) {
                gp1Var = gp1.ACTIVE;
            } else {
                gp1Var = gp1.INSTALLED;
            }
            vy7.k(gp1Var, null, xq2Var, 0);
            qn2 qn2Var2 = this.R;
            boolean f3 = xq2Var.f(qn2Var2) | xq2Var.f(zq7Var);
            Object P2 = xq2Var.P();
            if (f3 || P2 == obj3) {
                P2 = new lr7(qn2Var2, zq7Var, 2);
                xq2Var.l0(P2);
            }
            ej2.b((on2) P2, null, false, mb3.p, xq2Var, 24576, 14);
            xq2Var.p(true);
        } else {
            xq2Var.V();
        }
        return jg7.a;
    }
}
