package defpackage;

import com.stormds.emulator.R;
import me.magnum.melonds.impl.emulator.debug.RendererDebugBridge;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xj3  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class xj3 implements fo2 {
    public final /* synthetic */ int A = 0;
    public final /* synthetic */ boolean B;
    public final /* synthetic */ qa4 L;
    public final /* synthetic */ Object R;
    public final /* synthetic */ ao2 X;
    public final /* synthetic */ Object Y;

    public /* synthetic */ xj3(on2 on2Var, on2 on2Var2, boolean z, on2 on2Var3, qa4 qa4Var) {
        this.R = on2Var;
        this.X = on2Var2;
        this.B = z;
        this.Y = on2Var3;
        this.L = qa4Var;
    }

    @Override // defpackage.fo2
    public final Object e(Object obj, Object obj2, Object obj3) {
        boolean z;
        boolean z2;
        long f;
        int i;
        boolean z3;
        int i2 = this.A;
        jg7 jg7Var = jg7.a;
        vs0 vs0Var = ox0.a;
        qa4 qa4Var = this.L;
        Object obj4 = this.Y;
        ao2 ao2Var = this.X;
        Object obj5 = this.R;
        switch (i2) {
            case 0:
                Integer num = (Integer) obj5;
                qn2 qn2Var = (qn2) ao2Var;
                l93 l93Var = (l93) obj4;
                lq4 lq4Var = (lq4) obj;
                px0 px0Var = (px0) obj2;
                int intValue = ((Integer) obj3).intValue();
                lq4Var.getClass();
                if ((intValue & 6) == 0) {
                    if (((xq2) px0Var).f(lq4Var)) {
                        i = 4;
                    } else {
                        i = 2;
                    }
                    intValue |= i;
                }
                if ((intValue & 19) != 18) {
                    z = true;
                } else {
                    z = false;
                }
                xq2 xq2Var = (xq2) px0Var;
                if (xq2Var.S(intValue & 1, z)) {
                    x64 x64Var = x64.a;
                    a74 N = ge7.N(dj6.c(x64Var, 1.0f), lq4Var);
                    yt0 a = wt0.a(new gu(4.0f, true, new i(1)), d90.k0, xq2Var, 6);
                    int hashCode = Long.hashCode(xq2Var.T);
                    xv4 l = xq2Var.l();
                    a74 E = l.E(xq2Var, N);
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
                    a74 c = dj6.c(x64Var, 1.0f);
                    String str = (String) qa4Var.getValue();
                    xf1 J = mb3.J(xq2Var);
                    xh3 xh3Var = new xh3(0, 3, 7, 115);
                    boolean f2 = xq2Var.f(num) | xq2Var.f(qn2Var);
                    Object P = xq2Var.P();
                    if (f2 || P == vs0Var) {
                        P = new bi2(10, num, qn2Var);
                        xq2Var.l0(P);
                    }
                    vh3 vh3Var = new vh3(62, (qn2) P);
                    boolean f3 = xq2Var.f(qa4Var);
                    Object P2 = xq2Var.P();
                    if (f3 || P2 == vs0Var) {
                        P2 = new j4(qa4Var, 11);
                        xq2Var.l0(P2);
                    }
                    boolean z4 = this.B;
                    zo4.b(str, (qn2) P2, c, false, null, null, null, z4, null, xh3Var, vh3Var, true, 0, 0, null, J, xq2Var, RendererDebugBridge.CAPTURE_HEIGHT, 24576, 494584);
                    String N2 = yh2.N(R.string.layout_position_allowed_range, new Object[]{Integer.valueOf(l93Var.A), Integer.valueOf(l93Var.B)}, xq2Var);
                    s47 s47Var = ((xe7) xq2Var.j(ye7.b)).l;
                    if (z4) {
                        xq2Var.b0(-325335148);
                        f = ((ut0) xq2Var.j(vt0.a)).b();
                        z2 = false;
                    } else {
                        z2 = false;
                        xq2Var.b0(-325334120);
                        f = ((ut0) xq2Var.j(vt0.a)).f();
                    }
                    xq2Var.p(z2);
                    x37.b(N2, null, f, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, s47Var, xq2Var, 0, 0, 65530);
                    xq2Var.p(true);
                } else {
                    xq2Var.V();
                }
                return jg7Var;
            default:
                on2 on2Var = (on2) obj5;
                on2 on2Var2 = (on2) ao2Var;
                on2 on2Var3 = (on2) obj4;
                px0 px0Var2 = (px0) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((zt0) obj).getClass();
                if ((intValue2 & 17) != 16) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                xq2 xq2Var2 = (xq2) px0Var2;
                if (xq2Var2.S(1 & intValue2, z3)) {
                    boolean f4 = xq2Var2.f(on2Var);
                    Object P3 = xq2Var2.P();
                    if (f4 || P3 == vs0Var) {
                        P3 = new s00(on2Var, qa4Var, 8);
                        xq2Var2.l0(P3);
                    }
                    boolean z5 = this.B;
                    ti.b((on2) P3, null, false, null, n16.I(-440868062, new ao3(z5, 0), xq2Var2), xq2Var2, 196608);
                    boolean f5 = xq2Var2.f(on2Var2);
                    Object P4 = xq2Var2.P();
                    if (f5 || P4 == vs0Var) {
                        P4 = new s00(on2Var2, qa4Var, 9);
                        xq2Var2.l0(P4);
                    }
                    ti.b((on2) P4, null, false, null, g04.e, xq2Var2, 196608);
                    if (z5) {
                        xq2Var2.b0(-857749217);
                        boolean f6 = xq2Var2.f(on2Var3);
                        Object P5 = xq2Var2.P();
                        if (f6 || P5 == vs0Var) {
                            P5 = new s00(on2Var3, qa4Var, 10);
                            xq2Var2.l0(P5);
                        }
                        ti.b((on2) P5, null, false, null, g04.f, xq2Var2, 196608);
                        xq2Var2.p(false);
                    } else {
                        xq2Var2.b0(-857443619);
                        xq2Var2.p(false);
                    }
                } else {
                    xq2Var2.V();
                }
                return jg7Var;
        }
    }

    public /* synthetic */ xj3(Integer num, qn2 qn2Var, qa4 qa4Var, boolean z, l93 l93Var) {
        this.R = num;
        this.X = qn2Var;
        this.L = qa4Var;
        this.B = z;
        this.Y = l93Var;
    }
}
