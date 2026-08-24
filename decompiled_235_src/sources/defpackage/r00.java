package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: r00  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class r00 implements fo2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ on2 B;
    public final /* synthetic */ on2 L;
    public final /* synthetic */ qa4 R;

    public /* synthetic */ r00(on2 on2Var, on2 on2Var2, qa4 qa4Var, int i) {
        this.A = i;
        this.B = on2Var;
        this.L = on2Var2;
        this.R = qa4Var;
    }

    @Override // defpackage.fo2
    public final Object e(Object obj, Object obj2, Object obj3) {
        boolean z;
        int i = this.A;
        jg7 jg7Var = jg7.a;
        vs0 vs0Var = ox0.a;
        qa4 qa4Var = this.R;
        on2 on2Var = this.L;
        on2 on2Var2 = this.B;
        boolean z2 = false;
        switch (i) {
            case 0:
                px0 px0Var = (px0) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((zt0) obj).getClass();
                if ((intValue & 17) != 16) {
                    z = true;
                } else {
                    z = false;
                }
                xq2 xq2Var = (xq2) px0Var;
                if (xq2Var.S(intValue & 1, z)) {
                    boolean f = xq2Var.f(on2Var2);
                    Object P = xq2Var.P();
                    if (f || P == vs0Var) {
                        P = new s00(on2Var2, qa4Var, 0);
                        xq2Var.l0(P);
                    }
                    ti.b((on2) P, null, false, null, u24.a, xq2Var, 196608);
                    boolean f2 = xq2Var.f(on2Var);
                    Object P2 = xq2Var.P();
                    if (f2 || P2 == vs0Var) {
                        P2 = new s00(on2Var, qa4Var, 1);
                        xq2Var.l0(P2);
                    }
                    ti.b((on2) P2, null, false, null, u24.b, xq2Var, 196608);
                } else {
                    xq2Var.V();
                }
                return jg7Var;
            case 1:
                px0 px0Var2 = (px0) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((zt0) obj).getClass();
                if ((intValue2 & 17) != 16) {
                    z2 = true;
                }
                xq2 xq2Var2 = (xq2) px0Var2;
                if (xq2Var2.S(intValue2 & 1, z2)) {
                    boolean f3 = xq2Var2.f(on2Var2);
                    Object P3 = xq2Var2.P();
                    if (f3 || P3 == vs0Var) {
                        P3 = new s00(on2Var2, qa4Var, 2);
                        xq2Var2.l0(P3);
                    }
                    ti.b((on2) P3, null, false, null, ge7.c, xq2Var2, 196608);
                    boolean f4 = xq2Var2.f(on2Var);
                    Object P4 = xq2Var2.P();
                    if (f4 || P4 == vs0Var) {
                        P4 = new s00(on2Var, qa4Var, 3);
                        xq2Var2.l0(P4);
                    }
                    ti.b((on2) P4, null, false, null, ge7.d, xq2Var2, 196608);
                } else {
                    xq2Var2.V();
                }
                return jg7Var;
            default:
                px0 px0Var3 = (px0) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                ((zt0) obj).getClass();
                if ((intValue3 & 17) != 16) {
                    z2 = true;
                }
                xq2 xq2Var3 = (xq2) px0Var3;
                if (xq2Var3.S(intValue3 & 1, z2)) {
                    boolean f5 = xq2Var3.f(on2Var2);
                    Object P5 = xq2Var3.P();
                    if (f5 || P5 == vs0Var) {
                        P5 = new s00(on2Var2, qa4Var, 16);
                        xq2Var3.l0(P5);
                    }
                    ti.b((on2) P5, null, false, null, nw7.L, xq2Var3, 196608);
                    boolean f6 = xq2Var3.f(on2Var);
                    Object P6 = xq2Var3.P();
                    if (f6 || P6 == vs0Var) {
                        P6 = new s00(on2Var, qa4Var, 17);
                        xq2Var3.l0(P6);
                    }
                    ti.b((on2) P6, null, false, null, nw7.R, xq2Var3, 196608);
                } else {
                    xq2Var3.V();
                }
                return jg7Var;
        }
    }
}
