package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ze  reason: default package */
/* loaded from: classes.dex */
public final class ze extends ic3 implements aj2 {
    public final /* synthetic */ int B;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ze(zy3 zy3Var, et0 et0Var, int i) {
        super(2);
        this.B = 3;
        this.L = zy3Var;
        this.R = et0Var;
    }

    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        boolean z;
        int i = this.B;
        o27 o27Var = o27.a;
        Object obj3 = this.R;
        Object obj4 = this.L;
        switch (i) {
            case 0:
                int intValue = ((Number) obj).intValue();
                iz5 iz5Var = (iz5) obj2;
                af afVar = (af) obj3;
                if (!((jz5) obj4).b.c(iz5Var.f)) {
                    afVar.i(intValue, iz5Var);
                    afVar.c0.c(o27Var);
                }
                return o27Var;
            case 1:
                tu0 tu0Var = (tu0) obj;
                int intValue2 = ((Number) obj2).intValue();
                if ((intValue2 & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                sk2 sk2Var = (sk2) tu0Var;
                if (sk2Var.O(intValue2 & 1, z)) {
                    Boolean bool = (Boolean) ((bg3) obj4).g.getValue();
                    boolean booleanValue = bool.booleanValue();
                    aj2 aj2Var = (aj2) obj3;
                    sk2Var.a0(bool);
                    boolean g = sk2Var.g(booleanValue);
                    if (booleanValue) {
                        aj2Var.j(sk2Var, 0);
                    } else {
                        if (sk2Var.l != 0) {
                            xu0.a("No nodes can be emitted before calling deactivateToEndGroup");
                        }
                        if (!sk2Var.S) {
                            if (!g) {
                                sk2Var.Q();
                            } else {
                                v86 v86Var = sk2Var.G;
                                int i2 = v86Var.g;
                                int i3 = v86Var.h;
                                uu0 uu0Var = sk2Var.M;
                                uu0Var.getClass();
                                uu0Var.d(false);
                                uu0Var.b.q0.h0(wd4.d);
                                f34.r(i2, i3, sk2Var.s);
                                sk2Var.G.t();
                            }
                        }
                    }
                    if (sk2Var.y && sk2Var.G.i == sk2Var.z) {
                        sk2Var.z = -1;
                        sk2Var.y = false;
                    }
                    sk2Var.p(false);
                } else {
                    sk2Var.R();
                }
                return o27Var;
            case 2:
                oh0 oh0Var = (oh0) obj;
                pn2 pn2Var = (pn2) obj2;
                m74 m74Var = (m74) obj4;
                vf3 vf3Var = m74Var.j0;
                if (vf3Var.I()) {
                    m74Var.E0 = oh0Var;
                    m74Var.D0 = pn2Var;
                    yg4 snapshotObserver = ((ee) yf3.a(vf3Var)).getSnapshotObserver();
                    rf5 rf5Var = m74.J0;
                    snapshotObserver.a.d(m74Var, qc2.Z, (l74) obj3);
                    m74Var.H0 = false;
                } else {
                    m74Var.H0 = true;
                }
                return o27Var;
            default:
                ((Number) obj2).intValue();
                j56.a((zy3) obj4, (et0) obj3, (tu0) obj, ep2.I(49));
                return o27Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ze(int i, Object obj, Object obj2) {
        super(2);
        this.B = i;
        this.L = obj;
        this.R = obj2;
    }
}
