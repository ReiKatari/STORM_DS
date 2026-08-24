package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ln  reason: default package */
/* loaded from: classes.dex */
public final class ln extends aj3 implements qn2 {
    public final /* synthetic */ int B;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object R;
    public final /* synthetic */ Object X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ln(Object obj, Object obj2, Object obj3, int i) {
        super(1);
        this.B = i;
        this.L = obj;
        this.R = obj2;
        this.X = obj3;
    }

    @Override // defpackage.qn2
    public final Object g(Object obj) {
        float f;
        float f2;
        long j;
        long j2;
        mo1 mo1Var;
        int i = this.B;
        i97 i97Var = null;
        jg7 jg7Var = jg7.a;
        boolean z = false;
        Object obj2 = this.X;
        Object obj3 = this.R;
        Object obj4 = this.L;
        switch (i) {
            case 0:
                gl1 gl1Var = (gl1) obj;
                return new kn((mm6) obj4, obj3, (yn) obj2, 0);
            case 1:
                if (((Boolean) obj).booleanValue() == ((Boolean) ((x60) obj4).b.d.getValue()).booleanValue()) {
                    return (of5) obj3;
                }
                return (of5) obj2;
            case 2:
                ub7 ub7Var = (ub7) obj;
                ym1 ym1Var = (ym1) ub7Var;
                if (((og) ((te) nc1.g0((ym1) obj3)).m16getDragAndDropManager()).b.contains(ym1Var) && jw2.f(ym1Var, mb3.E((d51) obj2))) {
                    ((dh5) obj4).A = ub7Var;
                    return tb7.CancelTraversal;
                }
                return tb7.ContinueTraversal;
            case 3:
                op5 op5Var = (op5) obj;
                pp6 pp6Var = (pp6) obj3;
                pp6 pp6Var2 = (pp6) obj4;
                float f3 = 1.0f;
                if (pp6Var2 != null) {
                    f = ((Number) pp6Var2.getValue()).floatValue();
                } else {
                    f = 1.0f;
                }
                op5Var.c(f);
                if (pp6Var != null) {
                    f2 = ((Number) pp6Var.getValue()).floatValue();
                } else {
                    f2 = 1.0f;
                }
                op5Var.k(f2);
                if (pp6Var != null) {
                    f3 = ((Number) pp6Var.getValue()).floatValue();
                }
                op5Var.l(f3);
                pp6 pp6Var3 = (pp6) obj2;
                if (pp6Var3 != null) {
                    j = ((i97) pp6Var3.getValue()).a;
                } else {
                    j = i97.b;
                }
                op5Var.r(j);
                return jg7Var;
            case 4:
                ha7 ha7Var = ((o52) obj3).a;
                z72 z72Var = (z72) obj2;
                int i2 = f52.a[((z42) obj).ordinal()];
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 == 3) {
                            z56 z56Var = z72Var.a.d;
                            if (z56Var != null) {
                                i97Var = new i97(z56Var.a);
                            } else {
                                z56 z56Var2 = ha7Var.d;
                                if (z56Var2 != null) {
                                    i97Var = new i97(z56Var2.a);
                                }
                            }
                        } else {
                            i.d();
                            return null;
                        }
                    } else {
                        z56 z56Var3 = ha7Var.d;
                        if (z56Var3 != null) {
                            i97Var = new i97(z56Var3.a);
                        } else {
                            z56 z56Var4 = z72Var.a.d;
                            if (z56Var4 != null) {
                                i97Var = new i97(z56Var4.a);
                            }
                        }
                    }
                } else {
                    i97Var = (i97) obj4;
                }
                if (i97Var != null) {
                    j2 = i97Var.a;
                } else {
                    j2 = i97.b;
                }
                return new i97(j2);
            case 5:
                vh2 vh2Var = (vh2) obj;
                if (!nb3.k(vh2Var, (vh2) obj4)) {
                    if (!nb3.k(vh2Var, ((eh2) obj3).c)) {
                        z = ((Boolean) ((qn2) obj2).g(vh2Var)).booleanValue();
                    } else {
                        i.m("Focus search landed at the root.");
                        return null;
                    }
                }
                return Boolean.valueOf(z);
            case 6:
                no1 no1Var = (no1) obj;
                um3 um3Var = (um3) obj4;
                zj0 zj0Var = um3Var.A;
                mo1 mo1Var2 = um3Var.B;
                um3Var.B = (mo1) obj3;
                try {
                    qh1 I = no1Var.i0().I();
                    kk3 K = no1Var.i0().K();
                    xj0 G = no1Var.i0().G();
                    long L = no1Var.i0().L();
                    ut2 ut2Var = (ut2) no1Var.i0().L;
                    qn2 qn2Var = (qn2) obj2;
                    qh1 I2 = zj0Var.B.I();
                    kk3 K2 = zj0Var.B.K();
                    xj0 G2 = zj0Var.B.G();
                    long L2 = zj0Var.B.L();
                    bt btVar = zj0Var.B;
                    try {
                        ut2 ut2Var2 = (ut2) btVar.L;
                        btVar.W(I);
                        btVar.X(K);
                        btVar.V(G);
                        btVar.Y(L);
                        btVar.L = ut2Var;
                        G.h();
                        try {
                            qn2Var.g(um3Var);
                            G.p();
                            bt btVar2 = zj0Var.B;
                            btVar2.W(I2);
                            btVar2.X(K2);
                            btVar2.V(G2);
                            btVar2.Y(L2);
                            btVar2.L = ut2Var2;
                            um3Var.B = mo1Var2;
                            return jg7Var;
                        } catch (Throwable th) {
                            mo1Var = mo1Var2;
                            try {
                                G.p();
                                bt btVar3 = zj0Var.B;
                                btVar3.W(I2);
                                btVar3.X(K2);
                                btVar3.V(G2);
                                btVar3.Y(L2);
                                btVar3.L = ut2Var2;
                                throw th;
                            } catch (Throwable th2) {
                                th = th2;
                                um3Var.B = mo1Var;
                                throw th;
                            }
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        mo1Var = mo1Var2;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    mo1Var = mo1Var2;
                }
            default:
                cx4 cx4Var = (cx4) obj;
                jk3 d = cx4Var.d();
                if (d != null) {
                    boolean a0 = ((g34) obj4).a0();
                    sg6 sg6Var = ((yg6) obj3).k0;
                    if (!a0) {
                        sg6Var.X = d;
                    } else {
                        sg6Var.Y = d;
                    }
                }
                cx4.j(cx4Var, (dx4) obj2, 0, 0);
                return jg7Var;
        }
    }
}
