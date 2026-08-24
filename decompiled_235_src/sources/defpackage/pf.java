package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: pf  reason: default package */
/* loaded from: classes.dex */
public final class pf extends aj3 implements eo2 {
    public final /* synthetic */ int B;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pf(a74 a74Var, zv0 zv0Var, int i) {
        super(2);
        this.B = 3;
        this.L = a74Var;
        this.R = zv0Var;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        boolean z;
        int i = this.B;
        jg7 jg7Var = jg7.a;
        Object obj3 = this.R;
        Object obj4 = this.L;
        switch (i) {
            case 0:
                int intValue = ((Number) obj).intValue();
                xa6 xa6Var = (xa6) obj2;
                qf qfVar = (qf) obj3;
                if (!((ya6) obj4).b.c(xa6Var.f)) {
                    qfVar.i(intValue, xa6Var);
                    qfVar.d0.c(jg7Var);
                }
                return jg7Var;
            case 1:
                px0 px0Var = (px0) obj;
                int intValue2 = ((Number) obj2).intValue();
                if ((intValue2 & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                xq2 xq2Var = (xq2) px0Var;
                if (xq2Var.S(intValue2 & 1, z)) {
                    Boolean bool = (Boolean) ((ym3) obj4).g.getValue();
                    boolean booleanValue = bool.booleanValue();
                    eo2 eo2Var = (eo2) obj3;
                    xq2Var.e0(bool);
                    boolean g = xq2Var.g(booleanValue);
                    if (booleanValue) {
                        eo2Var.o(xq2Var, 0);
                    } else {
                        if (xq2Var.l != 0) {
                            tx0.a("No nodes can be emitted before calling deactivateToEndGroup");
                        }
                        if (!xq2Var.S) {
                            if (!g) {
                                xq2Var.U();
                            } else {
                                lk6 lk6Var = xq2Var.G;
                                int i2 = lk6Var.g;
                                int i3 = lk6Var.h;
                                qx0 qx0Var = xq2Var.M;
                                qx0Var.getClass();
                                qx0Var.d(false);
                                qx0Var.b.m.h0(xm4.d);
                                hf.v(i2, xq2Var.s, i3);
                                xq2Var.G.t();
                            }
                        }
                    }
                    if (xq2Var.y && xq2Var.G.i == xq2Var.z) {
                        xq2Var.z = -1;
                        xq2Var.y = false;
                    }
                    xq2Var.p(false);
                } else {
                    xq2Var.V();
                }
                return jg7Var;
            case 2:
                xj0 xj0Var = (xj0) obj;
                ut2 ut2Var = (ut2) obj2;
                eg4 eg4Var = (eg4) obj4;
                sm3 sm3Var = eg4Var.k0;
                if (sm3Var.I()) {
                    eg4Var.F0 = xj0Var;
                    eg4Var.E0 = ut2Var;
                    bq4 snapshotObserver = ((te) vm3.a(sm3Var)).getSnapshotObserver();
                    op5 op5Var = eg4.K0;
                    snapshotObserver.a.d(eg4Var, hh2.d0, (dg4) obj3);
                    eg4Var.I0 = false;
                } else {
                    eg4Var.I0 = true;
                }
                return jg7Var;
            default:
                ((Number) obj2).intValue();
                vg6.a((a74) obj4, (zv0) obj3, (px0) obj, ii2.a0(49));
                return jg7Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pf(int i, Object obj, Object obj2) {
        super(2);
        this.B = i;
        this.L = obj;
        this.R = obj2;
    }
}
