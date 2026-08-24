package defpackage;

import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: mn  reason: default package */
/* loaded from: classes.dex */
public final class mn extends aj3 implements fo2 {
    public final /* synthetic */ int B;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object R;
    public final /* synthetic */ Object X;
    public final /* synthetic */ Object Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mn(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        super(3);
        this.B = i;
        this.L = obj;
        this.R = obj2;
        this.X = obj3;
        this.Y = obj4;
    }

    @Override // defpackage.fo2
    public final Object e(Object obj, Object obj2, Object obj3) {
        boolean z;
        boolean h;
        xq2 xq2Var;
        gf6 gf6Var;
        Object obj4;
        ga7 J;
        int i = this.B;
        Object obj5 = this.Y;
        int i2 = 2;
        jg7 jg7Var = jg7.a;
        vs0 vs0Var = ox0.a;
        Object obj6 = this.X;
        Object obj7 = this.L;
        Object obj8 = this.R;
        boolean z2 = true;
        switch (i) {
            case 0:
                jo joVar = (jo) obj;
                px0 px0Var = (px0) obj2;
                int intValue = ((Number) obj3).intValue();
                mm6 mm6Var = (mm6) obj7;
                yn ynVar = (yn) obj6;
                if ((intValue & 6) == 0) {
                    if ((intValue & 8) == 0) {
                        h = ((xq2) px0Var).f(joVar);
                    } else {
                        h = ((xq2) px0Var).h(joVar);
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
                xq2 xq2Var2 = (xq2) px0Var;
                if (xq2Var2.S(1 & intValue, z)) {
                    boolean f = xq2Var2.f(mm6Var) | xq2Var2.h(obj8) | xq2Var2.h(ynVar);
                    Object P = xq2Var2.P();
                    if (f || P == vs0Var) {
                        P = new ln(mm6Var, obj8, ynVar, 0);
                        xq2Var2.l0(P);
                    }
                    mb3.d(joVar, (qn2) P, xq2Var2);
                    ja4 ja4Var = ynVar.d;
                    joVar.getClass();
                    ja4Var.m(obj8, ((ko) joVar).b);
                    Object P2 = xq2Var2.P();
                    if (P2 == vs0Var) {
                        P2 = new sn(joVar);
                        xq2Var2.l0(P2);
                    }
                    ((zv0) obj5).l((sn) P2, obj8, xq2Var2, 0);
                } else {
                    xq2Var2.V();
                }
                return jg7Var;
            default:
                a74 a74Var = (a74) obj;
                ((Number) obj3).intValue();
                hh2 hh2Var = hh2.s0;
                ga7 ga7Var = (ga7) obj8;
                xq2 xq2Var3 = (xq2) ((px0) obj2);
                xq2Var3.b0(-1539505585);
                rg6 rg6Var = (rg6) obj7;
                String str = rg6Var.a;
                xq2Var3.Z(-1996110647, str);
                sg6 sg6Var = (sg6) obj6;
                Object P3 = xq2Var3.P();
                if (P3 == vs0Var) {
                    om6 om6Var = sg6Var.d0;
                    gf6 gf6Var2 = (gf6) om6Var.get(str);
                    if (gf6Var2 == null) {
                        gf6Var2 = new gf6(str, sg6Var);
                        om6Var.put(str, gf6Var2);
                    }
                    P3 = gf6Var2;
                    xq2Var3.l0(P3);
                }
                gf6 gf6Var3 = (gf6) P3;
                xq2Var3.Z(-1996106866, ga7Var);
                if (ga7Var != null) {
                    gx0 gx0Var = ga7Var.a;
                    xq2Var3.b0(-1749734647);
                    String obj9 = str.toString();
                    boolean f2 = xq2Var3.f(ga7Var);
                    Object P4 = xq2Var3.P();
                    if (f2 || P4 == vs0Var) {
                        P4 = gx0Var.f();
                        xq2Var3.l0(P4);
                    }
                    if (ga7Var.g()) {
                        P4 = gx0Var.f();
                    }
                    xq2Var3.b0(1498260051);
                    xq2Var3.p(false);
                    Object value = ga7Var.d.getValue();
                    xq2Var3.b0(1498260051);
                    Boolean bool = (Boolean) hh2Var.g(value);
                    xq2Var3.p(false);
                    obj4 = null;
                    gf6Var = gf6Var3;
                    J = n16.r(ga7Var, (Boolean) hh2Var.g(P4), bool, obj9, xq2Var3, 0);
                    xq2Var = xq2Var3;
                    xq2Var.p(false);
                } else {
                    xq2Var = xq2Var3;
                    gf6Var = gf6Var3;
                    obj4 = null;
                    xq2Var.b0(-1749482679);
                    ge7.p(1, hh2Var);
                    Boolean bool2 = (Boolean) hh2Var.g(jg7Var);
                    boolean booleanValue = bool2.booleanValue();
                    Object P5 = xq2Var.P();
                    if (P5 == vs0Var) {
                        if (gf6Var.c().isEmpty()) {
                            z2 = booleanValue;
                        } else if (booleanValue) {
                            z2 = false;
                        }
                        P5 = new ta4(Boolean.valueOf(z2));
                        xq2Var.l0(P5);
                    }
                    ta4 ta4Var = (ta4) P5;
                    ta4Var.c.setValue(bool2);
                    J = n16.J(ta4Var, null, xq2Var, 0, 2);
                    xq2Var.p(false);
                }
                ga7 ga7Var2 = J;
                xq2Var.Z(-1996043323, Boolean.valueOf(sg6Var.a()));
                w97 s = n16.s(ga7Var2, nw7.m0, null, xq2Var, 0, 2);
                xq2Var.p(false);
                boolean f3 = xq2Var.f(ga7Var2);
                Object P6 = xq2Var.P();
                if (f3 || P6 == vs0Var) {
                    P6 = new x60(sg6Var, ga7Var2, s, gf6Var.h);
                    xq2Var.l0(P6);
                }
                x60 x60Var = (x60) P6;
                af6 af6Var = lb4.m;
                if (!nb3.k((w97) x60Var.d.getValue(), s)) {
                    x60Var.d.setValue(s);
                    x60Var.g.setValue(obj4);
                    x60Var.f = y60.a;
                }
                x60Var.e.setValue(af6Var);
                xq2Var.p(false);
                tg6 tg6Var = (tg6) obj5;
                Object P7 = xq2Var.P();
                if (P7 == vs0Var) {
                    P7 = new if6(gf6Var, x60Var, tg6Var, rg6Var);
                    xq2Var.l0(P7);
                }
                if6 if6Var = (if6) P7;
                rg6Var.c.setValue(if6Var);
                if6Var.R.setValue(gf6Var);
                vs4 vs4Var = if6Var.Z;
                Boolean bool3 = Boolean.TRUE;
                vs4Var.setValue(bool3);
                if6Var.X.setValue(x60Var);
                if6Var.Y.setValue(pg6.b);
                if6Var.d0.setValue(tg6Var);
                if6Var.B.i(RecyclerView.B1);
                if6Var.L.setValue(bool3);
                if6Var.e0.setValue(rg6Var);
                xq2Var.p(false);
                a74 d = a74Var.d(new df6(if6Var));
                xq2Var.p(false);
                return d;
        }
    }
}
