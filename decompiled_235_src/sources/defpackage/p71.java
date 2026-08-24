package defpackage;

import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: p71  reason: default package */
/* loaded from: classes.dex */
public final class p71 extends aj3 implements eo2 {
    public final /* synthetic */ ga7 B;
    public final /* synthetic */ rc2 L;
    public final /* synthetic */ Object R;
    public final /* synthetic */ zv0 X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p71(ga7 ga7Var, rc2 rc2Var, Object obj, zv0 zv0Var) {
        super(2);
        this.B = ga7Var;
        this.L = rc2Var;
        this.R = obj;
        this.X = zv0Var;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        boolean z;
        Object f;
        float f2;
        qn2 qn2Var;
        px0 px0Var = (px0) obj;
        int intValue = ((Number) obj2).intValue();
        if ((intValue & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        xq2 xq2Var = (xq2) px0Var;
        if (xq2Var.S(intValue & 1, z)) {
            wc7 wc7Var = nw7.e0;
            ga7 ga7Var = this.B;
            boolean g = ga7Var.g();
            gx0 gx0Var = ga7Var.a;
            vs0 vs0Var = ox0.a;
            if (!g) {
                xq2Var.b0(1666573488);
                boolean f3 = xq2Var.f(ga7Var);
                f = xq2Var.P();
                if (f3 || f == vs0Var) {
                    vl6 t = ln2.t();
                    if (t != null) {
                        qn2Var = t.e();
                    } else {
                        qn2Var = null;
                    }
                    vl6 N = ln2.N(t);
                    try {
                        Object f4 = gx0Var.f();
                        ln2.V(t, N, qn2Var);
                        xq2Var.l0(f4);
                        f = f4;
                    } catch (Throwable th) {
                        ln2.V(t, N, qn2Var);
                        throw th;
                    }
                }
                xq2Var.p(false);
            } else {
                xq2Var.b0(1666827533);
                xq2Var.p(false);
                f = gx0Var.f();
            }
            xq2Var.b0(1378811975);
            Object obj3 = this.R;
            boolean k = nb3.k(f, obj3);
            float f5 = RecyclerView.B1;
            if (k) {
                f2 = 1.0f;
            } else {
                f2 = 0.0f;
            }
            xq2Var.p(false);
            Float valueOf = Float.valueOf(f2);
            boolean f6 = xq2Var.f(ga7Var);
            Object P = xq2Var.P();
            if (f6 || P == vs0Var) {
                P = np2.I(new k7(ga7Var, 2));
                xq2Var.l0(P);
            }
            Object value = ((pp6) P).getValue();
            xq2Var.b0(1378811975);
            if (nb3.k(value, obj3)) {
                f5 = 1.0f;
            }
            xq2Var.p(false);
            Float valueOf2 = Float.valueOf(f5);
            boolean f7 = xq2Var.f(ga7Var);
            Object P2 = xq2Var.P();
            if (f7 || P2 == vs0Var) {
                P2 = np2.I(new k7(ga7Var, 3));
                xq2Var.l0(P2);
            }
            aa7 aa7Var = (aa7) ((pp6) P2).getValue();
            xq2Var.b0(955869654);
            xq2Var.p(false);
            ca7 t2 = n16.t(ga7Var, valueOf, valueOf2, this.L, wc7Var, xq2Var, 0);
            boolean f8 = xq2Var.f(t2);
            Object P3 = xq2Var.P();
            if (f8 || P3 == vs0Var) {
                P3 = new mc(t2, 12);
                xq2Var.l0(P3);
            }
            a74 G = hv.G(x64.a, (qn2) P3);
            e34 d = h70.d(d90.L, false);
            int hashCode = Long.hashCode(xq2Var.T);
            xv4 l = xq2Var.l();
            a74 E = l.E(xq2Var, G);
            jx0.i.getClass();
            iy0 iy0Var = ix0.b;
            xq2Var.f0();
            if (xq2Var.S) {
                xq2Var.k(iy0Var);
            } else {
                xq2Var.o0();
            }
            yh2.K(xq2Var, ix0.f, d);
            yh2.K(xq2Var, ix0.e, l);
            yh2.x(xq2Var, Integer.valueOf(hashCode), ix0.g);
            yh2.F(xq2Var, ix0.h);
            yh2.K(xq2Var, ix0.d, E);
            this.X.e(obj3, xq2Var, 0);
            xq2Var.p(true);
        } else {
            xq2Var.V();
        }
        return jg7.a;
    }
}
