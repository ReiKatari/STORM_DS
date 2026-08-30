package defpackage;

import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: f41  reason: default package */
/* loaded from: classes.dex */
public final class f41 extends ic3 implements aj2 {
    public final /* synthetic */ kx6 B;
    public final /* synthetic */ y72 L;
    public final /* synthetic */ Object R;
    public final /* synthetic */ et0 X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f41(kx6 kx6Var, y72 y72Var, Object obj, et0 et0Var) {
        super(2);
        this.B = kx6Var;
        this.L = y72Var;
        this.R = obj;
        this.X = et0Var;
    }

    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        boolean z;
        Object f;
        float f2;
        mi2 mi2Var;
        tu0 tu0Var = (tu0) obj;
        int intValue = ((Number) obj2).intValue();
        if ((intValue & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        sk2 sk2Var = (sk2) tu0Var;
        if (sk2Var.O(intValue & 1, z)) {
            bz6 bz6Var = dt3.g0;
            kx6 kx6Var = this.B;
            boolean g = kx6Var.g();
            ku0 ku0Var = kx6Var.a;
            sn1 sn1Var = su0.a;
            if (!g) {
                sk2Var.X(1666573488);
                boolean f3 = sk2Var.f(kx6Var);
                f = sk2Var.L();
                if (f3 || f == sn1Var) {
                    ga6 z2 = io2.z();
                    if (z2 != null) {
                        mi2Var = z2.e();
                    } else {
                        mi2Var = null;
                    }
                    ga6 Y = io2.Y(z2);
                    try {
                        Object f4 = ku0Var.f();
                        io2.l0(z2, Y, mi2Var);
                        sk2Var.h0(f4);
                        f = f4;
                    } catch (Throwable th) {
                        io2.l0(z2, Y, mi2Var);
                        throw th;
                    }
                }
                sk2Var.p(false);
            } else {
                sk2Var.X(1666827533);
                sk2Var.p(false);
                f = ku0Var.f();
            }
            sk2Var.X(1378811975);
            Object obj3 = this.R;
            boolean x = b53.x(f, obj3);
            float f5 = RecyclerView.A1;
            if (x) {
                f2 = 1.0f;
            } else {
                f2 = 0.0f;
            }
            sk2Var.p(false);
            Float valueOf = Float.valueOf(f2);
            boolean f6 = sk2Var.f(kx6Var);
            Object L = sk2Var.L();
            if (f6 || L == sn1Var) {
                L = me2.q(new j7(kx6Var, 2));
                sk2Var.h0(L);
            }
            Object value = ((ae6) L).getValue();
            sk2Var.X(1378811975);
            if (b53.x(value, obj3)) {
                f5 = 1.0f;
            }
            sk2Var.p(false);
            Float valueOf2 = Float.valueOf(f5);
            boolean f7 = sk2Var.f(kx6Var);
            Object L2 = sk2Var.L();
            if (f7 || L2 == sn1Var) {
                L2 = me2.q(new j7(kx6Var, 3));
                sk2Var.h0(L2);
            }
            ex6 ex6Var = (ex6) ((ae6) L2).getValue();
            sk2Var.X(955869654);
            sk2Var.p(false);
            gx6 y = a53.y(kx6Var, valueOf, valueOf2, this.L, bz6Var, sk2Var, 0);
            boolean f8 = sk2Var.f(y);
            Object L3 = sk2Var.L();
            if (f8 || L3 == sn1Var) {
                L3 = new yb(13, y);
                sk2Var.h0(L3);
            }
            zy3 q = tq5.q(wy3.a, (mi2) L3);
            tv3 d = d50.d(y60.L, false);
            int hashCode = Long.hashCode(sk2Var.T);
            sm4 l = sk2Var.l();
            zy3 e0 = l07.e0(sk2Var, q);
            nu0.i.getClass();
            mv0 mv0Var = mu0.b;
            sk2Var.b0();
            if (sk2Var.S) {
                sk2Var.k(mv0Var);
            } else {
                sk2Var.k0();
            }
            oo2.S(sk2Var, mu0.f, d);
            oo2.S(sk2Var, mu0.e, l);
            oo2.N(sk2Var, Integer.valueOf(hashCode), mu0.g);
            oo2.P(sk2Var, mu0.h);
            oo2.S(sk2Var, mu0.d, e0);
            this.X.i(obj3, sk2Var, 0);
            sk2Var.p(true);
        } else {
            sk2Var.R();
        }
        return o27.a;
    }
}
