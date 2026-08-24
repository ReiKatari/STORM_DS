package defpackage;

import com.stormds.emulator.R;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: e46  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class e46 implements eo2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object R;

    public /* synthetic */ e46(c46 c46Var, on2 on2Var, qn2 qn2Var, int i) {
        this.A = 0;
        this.B = c46Var;
        this.L = on2Var;
        this.R = qn2Var;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        boolean z;
        boolean z2;
        int i = this.A;
        jg7 jg7Var = jg7.a;
        Object obj3 = this.R;
        Object obj4 = this.L;
        Object obj5 = this.B;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                nc1.w((c46) obj5, (on2) obj4, (qn2) obj3, (px0) obj, ii2.a0(49));
                return jg7Var;
            case 1:
                ah5 ah5Var = (ah5) obj5;
                m86 m86Var = (m86) obj4;
                float floatValue = ((Float) obj).floatValue();
                ((Float) obj2).getClass();
                long h = m86Var.h(m86Var.d(floatValue - ah5Var.A));
                m86 m86Var2 = ((k86) obj3).a;
                ah5Var.A += m86Var.d(m86Var.g(m86Var2.c(m86Var2.k, h, 1)));
                return jg7Var;
            case 2:
                qa4 qa4Var = (qa4) obj5;
                lq4 lq4Var = (lq4) obj4;
                zv0 zv0Var = (zv0) obj3;
                px0 px0Var = (px0) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                xq2 xq2Var = (xq2) px0Var;
                if (xq2Var.S(intValue & 1, z)) {
                    a74 D = lb4.D(x64.a, "border");
                    long j = ((xi6) qa4Var.getValue()).a;
                    int i2 = zo4.b;
                    a74 y = q60.y(D, new hp2(lq4Var, j, 1));
                    e34 d = h70.d(d90.L, true);
                    int B = ge7.B(xq2Var);
                    xv4 l = xq2Var.l();
                    a74 E = l.E(xq2Var, y);
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
                    pn pnVar = ix0.g;
                    if (xq2Var.S || !nb3.k(xq2Var.P(), Integer.valueOf(B))) {
                        i61.v(B, xq2Var, B, pnVar);
                    }
                    yh2.K(xq2Var, ix0.d, E);
                    xq2Var.b0(235288868);
                    zv0Var.o(xq2Var, 0);
                    xq2Var.p(false);
                    xq2Var.p(true);
                } else {
                    xq2Var.V();
                }
                return jg7Var;
            default:
                final j37 j37Var = (j37) obj5;
                on2 on2Var = (on2) obj4;
                qa4 qa4Var2 = (qa4) obj3;
                px0 px0Var2 = (px0) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if ((intValue2 & 3) != 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                xq2 xq2Var2 = (xq2) px0Var2;
                if (xq2Var2.S(intValue2 & 1, z2)) {
                    String O = yh2.O(xq2Var2, R.string.cancel);
                    boolean f = xq2Var2.f(j37Var);
                    Object P = xq2Var2.P();
                    vs0 vs0Var = ox0.a;
                    if (f || P == vs0Var) {
                        P = new on2() { // from class: i37
                            @Override // defpackage.on2
                            public final Object c() {
                                int i3 = r2;
                                jg7 jg7Var2 = jg7.a;
                                j37 j37Var2 = j37Var;
                                switch (i3) {
                                    case 0:
                                        j37Var2.a();
                                        return jg7Var2;
                                    default:
                                        j37Var2.b();
                                        return jg7Var2;
                                }
                            }
                        };
                        xq2Var2.l0(P);
                    }
                    q60.b(O, false, (on2) P, xq2Var2, 0, 2);
                    if (on2Var != null) {
                        xq2Var2.b0(-243960189);
                        String O2 = yh2.O(xq2Var2, R.string.delete);
                        boolean f2 = xq2Var2.f(on2Var) | xq2Var2.f(j37Var);
                        Object P2 = xq2Var2.P();
                        if (f2 || P2 == vs0Var) {
                            P2 = new yu6(4, on2Var, j37Var);
                            xq2Var2.l0(P2);
                        }
                        q60.b(O2, false, (on2) P2, xq2Var2, 0, 2);
                        xq2Var2.p(false);
                    } else {
                        xq2Var2.b0(-243681499);
                        xq2Var2.p(false);
                    }
                    String O3 = yh2.O(xq2Var2, R.string.ok);
                    boolean z3 = !((Boolean) qa4Var2.getValue()).booleanValue();
                    boolean f3 = xq2Var2.f(j37Var);
                    Object P3 = xq2Var2.P();
                    if (f3 || P3 == vs0Var) {
                        P3 = new on2() { // from class: i37
                            @Override // defpackage.on2
                            public final Object c() {
                                int i3 = r2;
                                jg7 jg7Var2 = jg7.a;
                                j37 j37Var2 = j37Var;
                                switch (i3) {
                                    case 0:
                                        j37Var2.a();
                                        return jg7Var2;
                                    default:
                                        j37Var2.b();
                                        return jg7Var2;
                                }
                            }
                        };
                        xq2Var2.l0(P3);
                    }
                    q60.b(O3, z3, (on2) P3, xq2Var2, 0, 0);
                } else {
                    xq2Var2.V();
                }
                return jg7Var;
        }
    }

    public /* synthetic */ e46(Object obj, Object obj2, Object obj3, int i) {
        this.A = i;
        this.B = obj;
        this.L = obj2;
        this.R = obj3;
    }
}
