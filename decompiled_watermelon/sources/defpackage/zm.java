package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: zm  reason: default package */
/* loaded from: classes.dex */
public final class zm extends ic3 implements mi2 {
    public final /* synthetic */ int B;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object R;
    public final /* synthetic */ Object X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zm(Object obj, Object obj2, Object obj3, int i) {
        super(1);
        this.B = i;
        this.L = obj;
        this.R = obj2;
        this.X = obj3;
    }

    @Override // defpackage.mi2
    public final Object n(Object obj) {
        float f;
        float f2;
        long j;
        long j2;
        gk1 gk1Var;
        int i = this.B;
        sw6 sw6Var = null;
        o27 o27Var = o27.a;
        boolean z = false;
        Object obj2 = this.R;
        Object obj3 = this.X;
        Object obj4 = this.L;
        switch (i) {
            case 0:
                ch1 ch1Var = (ch1) obj;
                return new ym((xa6) obj4, obj2, (mn) obj3, 0);
            case 1:
                if (((Boolean) obj).booleanValue() == ((Boolean) ((u40) obj4).b.d.getValue()).booleanValue()) {
                    return (y55) obj2;
                }
                return (y55) obj3;
            case 2:
                zx6 zx6Var = (zx6) obj;
                si1 si1Var = (si1) zx6Var;
                if (((ag) ((ee) l.Q((si1) obj2)).m6getDragAndDropManager()).b.contains(si1Var) && l.m(si1Var, se.F((t71) obj3))) {
                    ((n75) obj4).A = zx6Var;
                    return yx6.CancelTraversal;
                }
                return yx6.ContinueTraversal;
            case 3:
                rf5 rf5Var = (rf5) obj;
                ae6 ae6Var = (ae6) obj2;
                ae6 ae6Var2 = (ae6) obj4;
                float f3 = 1.0f;
                if (ae6Var2 != null) {
                    f = ((Number) ae6Var2.getValue()).floatValue();
                } else {
                    f = 1.0f;
                }
                rf5Var.c(f);
                if (ae6Var != null) {
                    f2 = ((Number) ae6Var.getValue()).floatValue();
                } else {
                    f2 = 1.0f;
                }
                rf5Var.l(f2);
                if (ae6Var != null) {
                    f3 = ((Number) ae6Var.getValue()).floatValue();
                }
                rf5Var.m(f3);
                ae6 ae6Var3 = (ae6) obj3;
                if (ae6Var3 != null) {
                    j = ((sw6) ae6Var3.getValue()).a;
                } else {
                    j = sw6.b;
                }
                rf5Var.s(j);
                return o27Var;
            case 4:
                h32 h32Var = (h32) obj3;
                int i2 = q02.a[((k02) obj).ordinal()];
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 == 3) {
                            lx6 lx6Var = h32Var.a;
                        } else {
                            i.c();
                            return null;
                        }
                    } else {
                        lx6 lx6Var2 = h32Var.a;
                    }
                } else {
                    sw6Var = (sw6) obj4;
                }
                if (sw6Var != null) {
                    j2 = sw6Var.a;
                } else {
                    j2 = sw6.b;
                }
                return new sw6(j2);
            case 5:
                ed2 ed2Var = (ed2) obj;
                if (!b53.x(ed2Var, (ed2) obj4)) {
                    if (!b53.x(ed2Var, ((nc2) obj2).c)) {
                        z = ((Boolean) ((mi2) obj3).n(ed2Var)).booleanValue();
                    } else {
                        i.n("Focus search landed at the root.");
                        return null;
                    }
                }
                return Boolean.valueOf(z);
            case ig7.b /* 6 */:
                hk1 hk1Var = (hk1) obj;
                xf3 xf3Var = (xf3) obj4;
                rh0 rh0Var = xf3Var.A;
                gk1 gk1Var2 = xf3Var.B;
                xf3Var.B = (gk1) obj2;
                try {
                    od1 v = hk1Var.I().v();
                    sd3 A = hk1Var.I().A();
                    oh0 s = hk1Var.I().s();
                    long E = hk1Var.I().E();
                    pn2 pn2Var = (pn2) hk1Var.I().L;
                    mi2 mi2Var = (mi2) obj3;
                    od1 v2 = rh0Var.B.v();
                    sd3 A2 = rh0Var.B.A();
                    oh0 s2 = rh0Var.B.s();
                    long E2 = rh0Var.B.E();
                    os osVar = rh0Var.B;
                    try {
                        pn2 pn2Var2 = (pn2) osVar.L;
                        osVar.O(v);
                        osVar.P(A);
                        osVar.N(s);
                        osVar.Q(E);
                        osVar.L = pn2Var;
                        s.m();
                        try {
                            mi2Var.n(xf3Var);
                            s.j();
                            os osVar2 = rh0Var.B;
                            osVar2.O(v2);
                            osVar2.P(A2);
                            osVar2.N(s2);
                            osVar2.Q(E2);
                            osVar2.L = pn2Var2;
                            xf3Var.B = gk1Var2;
                            return o27Var;
                        } catch (Throwable th) {
                            gk1Var = gk1Var2;
                            try {
                                s.j();
                                os osVar3 = rh0Var.B;
                                osVar3.O(v2);
                                osVar3.P(A2);
                                osVar3.N(s2);
                                osVar3.Q(E2);
                                osVar3.L = pn2Var2;
                                throw th;
                            } catch (Throwable th2) {
                                th = th2;
                                xf3Var.B = gk1Var;
                                throw th;
                            }
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        gk1Var = gk1Var2;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    gk1Var = gk1Var2;
                }
            default:
                xn4 xn4Var = (xn4) obj;
                rd3 e = xn4Var.e();
                if (e != null) {
                    boolean w = ((vv3) obj4).w();
                    g56 g56Var = ((l56) obj2).j0;
                    if (!w) {
                        g56Var.X = e;
                    } else {
                        g56Var.Y = e;
                    }
                }
                xn4.k(xn4Var, (yn4) obj3, 0, 0);
                return o27Var;
        }
    }
}
