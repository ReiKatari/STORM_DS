package defpackage;

import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: jb7  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class jb7 implements go2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object R;
    public final /* synthetic */ Object X;

    public /* synthetic */ jb7(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.A = i;
        this.B = obj;
        this.L = obj2;
        this.R = obj3;
        this.X = obj4;
    }

    @Override // defpackage.go2
    public final Object l(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean z;
        long j;
        boolean z2;
        long j2;
        oj2 oj2Var;
        int i;
        int i2 = this.A;
        jg7 jg7Var = jg7.a;
        Object obj5 = this.X;
        Object obj6 = this.R;
        Object obj7 = this.L;
        Object obj8 = this.B;
        switch (i2) {
            case 0:
                List list = (List) obj8;
                final eo2 eo2Var = (eo2) obj7;
                final qa4 qa4Var = (qa4) obj6;
                final qa4 qa4Var2 = (qa4) obj5;
                int intValue = ((Integer) obj2).intValue();
                px0 px0Var = (px0) obj3;
                int intValue2 = ((Integer) obj4).intValue();
                ((lp3) obj).getClass();
                if ((intValue2 & 48) == 0) {
                    if (((xq2) px0Var).d(intValue)) {
                        i = 32;
                    } else {
                        i = 16;
                    }
                    intValue2 |= i;
                }
                if ((intValue2 & 145) != 144) {
                    z = true;
                } else {
                    z = false;
                }
                xq2 xq2Var = (xq2) px0Var;
                if (xq2Var.S(intValue2 & 1, z)) {
                    final xx3 xx3Var = (xx3) list.get(intValue);
                    boolean equals = xx3Var.a.equals((String) qa4Var.getValue());
                    a74 g = u24.g(dj6.c(x64.a, 1.0f), z16.b(8.0f));
                    if (equals) {
                        xq2Var.b0(-2014614786);
                        j = kt0.c(0.15f, bl2.F(xq2Var).l);
                        xq2Var.p(false);
                    } else {
                        xq2Var.b0(-2014612874);
                        xq2Var.p(false);
                        j = kt0.g;
                    }
                    a74 L = vy7.L(g, j, u24.m);
                    boolean h = xq2Var.h(xx3Var) | xq2Var.f(eo2Var);
                    Object P = xq2Var.P();
                    vs0 vs0Var = ox0.a;
                    if (h || P == vs0Var) {
                        P = new on2() { // from class: za7
                            @Override // defpackage.on2
                            public final Object c() {
                                int i3 = r5;
                                jg7 jg7Var2 = jg7.a;
                                qa4 qa4Var3 = qa4Var2;
                                qa4 qa4Var4 = qa4Var;
                                eo2 eo2Var2 = eo2Var;
                                xx3 xx3Var2 = xx3Var;
                                switch (i3) {
                                    case 0:
                                        qa4Var4.setValue(xx3Var2.a);
                                        eo2Var2.o("translator_local_voice_model", (String) qa4Var4.getValue());
                                        qa4Var3.setValue(Boolean.FALSE);
                                        return jg7Var2;
                                    default:
                                        qa4Var4.setValue(xx3Var2.a);
                                        eo2Var2.o("translator_local_voice_model", (String) qa4Var4.getValue());
                                        qa4Var3.setValue(Boolean.FALSE);
                                        return jg7Var2;
                                }
                            }
                        };
                        xq2Var.l0(P);
                    }
                    a74 P2 = ge7.P(mb3.u(L, false, null, (on2) P, 15), 12.0f, 10.0f);
                    l26 a = k26.a(ju.e, d90.i0, xq2Var, 54);
                    int hashCode = Long.hashCode(xq2Var.T);
                    xv4 l = xq2Var.l();
                    a74 E = l.E(xq2Var, P2);
                    jx0.i.getClass();
                    iy0 iy0Var = ix0.b;
                    xq2Var.f0();
                    if (xq2Var.S) {
                        xq2Var.k(iy0Var);
                    } else {
                        xq2Var.o0();
                    }
                    yh2.K(xq2Var, ix0.f, a);
                    yh2.K(xq2Var, ix0.e, l);
                    yh2.K(xq2Var, ix0.g, Integer.valueOf(hashCode));
                    yh2.F(xq2Var, ix0.h);
                    yh2.K(xq2Var, ix0.d, E);
                    String str = xx3Var.b;
                    if (equals) {
                        xq2Var.b0(-741627084);
                        j2 = bl2.F(xq2Var).l;
                        z2 = false;
                    } else {
                        z2 = false;
                        xq2Var.b0(-741626381);
                        j2 = bl2.F(xq2Var).g;
                    }
                    xq2Var.p(z2);
                    long j3 = j2;
                    if (equals) {
                        oj2Var = oj2.e0;
                    } else {
                        oj2Var = oj2.Y;
                    }
                    x37.b(str, new vn3(1.0f, true), j3, hi2.E(13), oj2Var, null, 0L, null, 0L, 0, false, 0, 0, null, null, xq2Var, 3072, 0, 131024);
                    boolean h2 = xq2Var.h(xx3Var) | xq2Var.f(eo2Var);
                    Object P3 = xq2Var.P();
                    if (h2 || P3 == vs0Var) {
                        on2 on2Var = new on2() { // from class: za7
                            @Override // defpackage.on2
                            public final Object c() {
                                int i3 = r5;
                                jg7 jg7Var2 = jg7.a;
                                qa4 qa4Var3 = qa4Var2;
                                qa4 qa4Var4 = qa4Var;
                                eo2 eo2Var2 = eo2Var;
                                xx3 xx3Var2 = xx3Var;
                                switch (i3) {
                                    case 0:
                                        qa4Var4.setValue(xx3Var2.a);
                                        eo2Var2.o("translator_local_voice_model", (String) qa4Var4.getValue());
                                        qa4Var3.setValue(Boolean.FALSE);
                                        return jg7Var2;
                                    default:
                                        qa4Var4.setValue(xx3Var2.a);
                                        eo2Var2.o("translator_local_voice_model", (String) qa4Var4.getValue());
                                        qa4Var3.setValue(Boolean.FALSE);
                                        return jg7Var2;
                                }
                            }
                        };
                        xq2Var.l0(on2Var);
                        P3 = on2Var;
                    }
                    kd5.a(equals, (on2) P3, null, false, jx2.n(bl2.F(xq2Var).l, bl2.F(xq2Var).h, xq2Var, 0, 4), xq2Var, 0, 28);
                    xq2Var.p(true);
                } else {
                    xq2Var.V();
                }
                return jg7Var;
            default:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                boolean booleanValue2 = ((Boolean) obj2).booleanValue();
                boolean booleanValue3 = ((Boolean) obj3).booleanValue();
                boolean booleanValue4 = ((Boolean) obj4).booleanValue();
                ((zg5) obj8).A = booleanValue;
                ((zg5) obj7).A = booleanValue2;
                ((zg5) obj6).A = booleanValue3;
                ((zg5) obj5).A = booleanValue4;
                return jg7Var;
        }
    }
}
