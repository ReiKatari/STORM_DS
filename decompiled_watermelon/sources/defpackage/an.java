package defpackage;

import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: an  reason: default package */
/* loaded from: classes.dex */
public final class an extends ic3 implements bj2 {
    public final /* synthetic */ int B;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object R;
    public final /* synthetic */ Object X;
    public final /* synthetic */ Object Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ an(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        super(3);
        this.B = i;
        this.L = obj;
        this.R = obj2;
        this.X = obj3;
        this.Y = obj4;
    }

    @Override // defpackage.bj2
    public final Object i(Object obj, Object obj2, Object obj3) {
        boolean z;
        boolean h;
        sk2 sk2Var;
        u36 u36Var;
        Object obj4;
        kx6 P;
        int i = this.B;
        Object obj5 = this.Y;
        int i2 = 2;
        o27 o27Var = o27.a;
        sn1 sn1Var = su0.a;
        Object obj6 = this.X;
        Object obj7 = this.L;
        Object obj8 = this.R;
        boolean z2 = true;
        switch (i) {
            case 0:
                wn wnVar = (wn) obj;
                tu0 tu0Var = (tu0) obj2;
                int intValue = ((Number) obj3).intValue();
                xa6 xa6Var = (xa6) obj7;
                mn mnVar = (mn) obj6;
                if ((intValue & 6) == 0) {
                    if ((intValue & 8) == 0) {
                        h = ((sk2) tu0Var).f(wnVar);
                    } else {
                        h = ((sk2) tu0Var).h(wnVar);
                    }
                    if (h) {
                        i2 = 4;
                    }
                    intValue |= i2;
                }
                if ((intValue & 19) != 18) {
                    z = true;
                } else {
                    z = false;
                }
                sk2 sk2Var2 = (sk2) tu0Var;
                if (sk2Var2.O(1 & intValue, z)) {
                    boolean f = sk2Var2.f(xa6Var) | sk2Var2.h(obj8) | sk2Var2.h(mnVar);
                    Object L = sk2Var2.L();
                    if (f || L == sn1Var) {
                        L = new zm(xa6Var, obj8, mnVar, 0);
                        sk2Var2.h0(L);
                    }
                    l.d(wnVar, (mi2) L, sk2Var2);
                    d24 d24Var = mnVar.d;
                    wnVar.getClass();
                    d24Var.m(obj8, ((xn) wnVar).b);
                    Object L2 = sk2Var2.L();
                    if (L2 == sn1Var) {
                        L2 = new gn(wnVar);
                        sk2Var2.h0(L2);
                    }
                    ((et0) obj5).q((gn) L2, obj8, sk2Var2, 0);
                } else {
                    sk2Var2.R();
                }
                return o27Var;
            default:
                zy3 zy3Var = (zy3) obj;
                ((Number) obj3).intValue();
                qc2 qc2Var = qc2.q0;
                kx6 kx6Var = (kx6) obj8;
                sk2 sk2Var3 = (sk2) ((tu0) obj2);
                sk2Var3.X(-1539505585);
                f56 f56Var = (f56) obj7;
                String str = f56Var.a;
                sk2Var3.V(-1996110647, str);
                g56 g56Var = (g56) obj6;
                Object L3 = sk2Var3.L();
                if (L3 == sn1Var) {
                    za6 za6Var = g56Var.c0;
                    u36 u36Var2 = (u36) za6Var.get(str);
                    if (u36Var2 == null) {
                        u36Var2 = new u36(str, g56Var);
                        za6Var.put(str, u36Var2);
                    }
                    L3 = u36Var2;
                    sk2Var3.h0(L3);
                }
                u36 u36Var3 = (u36) L3;
                sk2Var3.V(-1996106866, kx6Var);
                if (kx6Var != null) {
                    ku0 ku0Var = kx6Var.a;
                    sk2Var3.X(-1749734647);
                    String obj9 = str.toString();
                    boolean f2 = sk2Var3.f(kx6Var);
                    Object L4 = sk2Var3.L();
                    if (f2 || L4 == sn1Var) {
                        L4 = ku0Var.f();
                        sk2Var3.h0(L4);
                    }
                    if (kx6Var.g()) {
                        L4 = ku0Var.f();
                    }
                    sk2Var3.X(1498260051);
                    sk2Var3.p(false);
                    Object value = kx6Var.d.getValue();
                    sk2Var3.X(1498260051);
                    Boolean bool = (Boolean) qc2Var.n(value);
                    sk2Var3.p(false);
                    obj4 = null;
                    u36Var = u36Var3;
                    P = a53.w(kx6Var, (Boolean) qc2Var.n(L4), bool, obj9, sk2Var3, 0);
                    sk2Var = sk2Var3;
                    sk2Var.p(false);
                } else {
                    sk2Var = sk2Var3;
                    u36Var = u36Var3;
                    obj4 = null;
                    sk2Var.X(-1749482679);
                    l07.q(1, qc2Var);
                    Boolean bool2 = (Boolean) qc2Var.n(o27Var);
                    boolean booleanValue = bool2.booleanValue();
                    Object L5 = sk2Var.L();
                    if (L5 == sn1Var) {
                        if (u36Var.c().isEmpty()) {
                            z2 = booleanValue;
                        } else if (booleanValue) {
                            z2 = false;
                        }
                        L5 = new n24(Boolean.valueOf(z2));
                        sk2Var.h0(L5);
                    }
                    n24 n24Var = (n24) L5;
                    n24Var.c.setValue(bool2);
                    P = a53.P(n24Var, null, sk2Var, 0, 2);
                    sk2Var.p(false);
                }
                kx6 kx6Var2 = P;
                sk2Var.V(-1996043323, Boolean.valueOf(g56Var.b()));
                ax6 x = a53.x(kx6Var2, dt3.o0, null, sk2Var, 0, 2);
                sk2Var.p(false);
                boolean f3 = sk2Var.f(kx6Var2);
                Object L6 = sk2Var.L();
                if (f3 || L6 == sn1Var) {
                    L6 = new u40(g56Var, kx6Var2, x, u36Var.h);
                    sk2Var.h0(L6);
                }
                u40 u40Var = (u40) L6;
                o36 o36Var = iq2.h;
                if (!b53.x((ax6) u40Var.d.getValue(), x)) {
                    u40Var.d.setValue(x);
                    u40Var.g.setValue(obj4);
                    u40Var.f = v40.a;
                }
                u40Var.e.setValue(o36Var);
                sk2Var.p(false);
                h56 h56Var = (h56) obj5;
                Object L7 = sk2Var.L();
                if (L7 == sn1Var) {
                    L7 = new w36(u36Var, u40Var, h56Var, f56Var);
                    sk2Var.h0(L7);
                }
                w36 w36Var = (w36) L7;
                f56Var.c.setValue(w36Var);
                w36Var.R.setValue(u36Var);
                tj4 tj4Var = w36Var.Z;
                Boolean bool3 = Boolean.TRUE;
                tj4Var.setValue(bool3);
                w36Var.X.setValue(u40Var);
                w36Var.Y.setValue(d56.b);
                w36Var.c0.setValue(h56Var);
                w36Var.B.i(RecyclerView.A1);
                w36Var.L.setValue(bool3);
                w36Var.d0.setValue(f56Var);
                sk2Var.p(false);
                zy3 f4 = zy3Var.f(new r36(w36Var));
                sk2Var.p(false);
                return f4;
        }
    }
}
