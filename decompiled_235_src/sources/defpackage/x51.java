package defpackage;

import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: x51  reason: default package */
/* loaded from: classes.dex */
public final class x51 implements e34 {
    public final /* synthetic */ jt3 a;
    public final /* synthetic */ qn2 b;
    public final /* synthetic */ c37 c;
    public final /* synthetic */ mk4 d;
    public final /* synthetic */ qh1 e;
    public final /* synthetic */ int f;

    public x51(jt3 jt3Var, qn2 qn2Var, c37 c37Var, mk4 mk4Var, qh1 qh1Var, int i) {
        this.a = jt3Var;
        this.b = qn2Var;
        this.c = c37Var;
        this.d = mk4Var;
        this.e = qh1Var;
        this.f = i;
    }

    @Override // defpackage.e34
    public final int a(eb3 eb3Var, List list, int i) {
        jt3 jt3Var = this.a;
        jt3Var.a.a(eb3Var.getLayoutDirection());
        s9 s9Var = jt3Var.a.j;
        if (s9Var != null) {
            return ii2.q(s9Var.c());
        }
        i.m("layoutIntrinsics must be called first");
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01fb  */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v2, types: [jk3] */
    @Override // defpackage.e34
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final f34 d(g34 g34Var, List list, long j) {
        qn2 qn2Var;
        a47 a47Var;
        long j2;
        a47 a47Var2;
        kk3 kk3Var;
        f34 f34Var;
        a47 a47Var3;
        int i;
        x51 x51Var;
        int i2;
        jk3 jk3Var;
        int h;
        int i3;
        jt3 jt3Var = this.a;
        vl6 t = ln2.t();
        if (t != null) {
            qn2Var = t.e();
        } else {
            qn2Var = null;
        }
        vl6 N = ln2.N(t);
        try {
            b47 d = jt3Var.d();
            if (d != null) {
                a47Var = d.a;
            } else {
                a47Var = null;
            }
            d17 d17Var = jt3Var.a;
            kk3 layoutDirection = g34Var.getLayoutDirection();
            int i4 = d17Var.f;
            boolean z = d17Var.e;
            int i5 = d17Var.c;
            if (a47Var != null) {
                v84 v84Var = a47Var.b;
                z37 z37Var = a47Var.a;
                fp fpVar = d17Var.a;
                s47 s47Var = d17Var.b;
                List list2 = d17Var.i;
                f34Var = null;
                qh1 qh1Var = d17Var.g;
                ki2 ki2Var = d17Var.h;
                a47 a47Var4 = a47Var;
                if (v84Var.a.a()) {
                    j2 = j;
                    kk3Var = layoutDirection;
                } else {
                    fp fpVar2 = z37Var.a;
                    long j3 = z37Var.j;
                    if (nb3.k(fpVar2, fpVar) && z37Var.b.c(s47Var) && nb3.k(z37Var.c, list2) && z37Var.d == i5 && z37Var.e == z && z37Var.f == i4 && nb3.k(z37Var.g, qh1Var)) {
                        kk3Var = layoutDirection;
                        if (z37Var.h == kk3Var && nb3.k(z37Var.i, ki2Var) && q21.j(j) == q21.j(j3) && ((!z && i4 != 2) || (q21.h(j) == q21.h(j3) && q21.g(j) == q21.g(j3)))) {
                            a47Var2 = a47Var4;
                            z37 z37Var2 = new z37(z37Var.a, d17Var.b, z37Var.c, z37Var.d, z37Var.e, z37Var.f, z37Var.g, z37Var.h, z37Var.i, j);
                            int q = ii2.q(v84Var.d);
                            a47Var3 = new a47(z37Var2, v84Var, s21.d(j, (ii2.q(v84Var.e) & 4294967295L) | (q << 32)));
                            long j4 = a47Var3.c;
                            Integer valueOf = Integer.valueOf((int) (j4 >> 32));
                            Integer valueOf2 = Integer.valueOf((int) (j4 & 4294967295L));
                            int intValue = valueOf.intValue();
                            int intValue2 = valueOf2.intValue();
                            if (nb3.k(a47Var2, a47Var3)) {
                                if (d != null) {
                                    jk3Var = d.c;
                                } else {
                                    jk3Var = f34Var;
                                }
                                jt3Var.i.setValue(new b47(a47Var3, jk3Var));
                                i = 0;
                                jt3Var.p = false;
                                x51Var = this;
                                x51Var.b.g(a47Var3);
                                hf.e0(jt3Var, x51Var.c, x51Var.d);
                            } else {
                                i = 0;
                                x51Var = this;
                            }
                            if (x51Var.f != 1) {
                                i2 = ii2.q(a47Var3.b.b(i));
                            } else {
                                i2 = i;
                            }
                            jt3Var.g.setValue(new om1(x51Var.e.Q(i2)));
                            return g34Var.K(intValue, intValue2, c14.m0(new vr4(lc.a, Integer.valueOf(Math.round(a47Var3.d))), new vr4(lc.b, Integer.valueOf(Math.round(a47Var3.e)))), new bz1(22));
                        }
                        j2 = j;
                    } else {
                        j2 = j;
                        a47Var2 = a47Var4;
                        kk3Var = layoutDirection;
                    }
                }
                a47Var2 = a47Var4;
            } else {
                j2 = j;
                a47Var2 = a47Var;
                kk3Var = layoutDirection;
                f34Var = null;
            }
            d17Var.a(kk3Var);
            int j5 = q21.j(j2);
            if ((z || i4 == 2) && q21.d(j2)) {
                h = q21.h(j2);
            } else {
                h = Integer.MAX_VALUE;
            }
            if (!z && i4 == 2) {
                i3 = 1;
            } else {
                i3 = i5;
            }
            if (j5 != h) {
                s9 s9Var = d17Var.j;
                if (s9Var != null) {
                    h = gi2.q(ii2.q(s9Var.c()), j5, h);
                } else {
                    i.m("layoutIntrinsics must be called first");
                    return f34Var;
                }
            }
            s9 s9Var2 = d17Var.j;
            if (s9Var2 != null) {
                v84 v84Var2 = new v84(s9Var2, nb3.t(0, h, 0, q21.g(j2)), i3, d17Var.f);
                a47Var3 = new a47(new z37(d17Var.a, d17Var.b, d17Var.i, d17Var.c, d17Var.e, d17Var.f, d17Var.g, kk3Var, d17Var.h, j2), v84Var2, s21.d(j2, (ii2.q(v84Var2.d) << 32) | (ii2.q(v84Var2.e) & 4294967295L)));
                long j42 = a47Var3.c;
                Integer valueOf3 = Integer.valueOf((int) (j42 >> 32));
                Integer valueOf22 = Integer.valueOf((int) (j42 & 4294967295L));
                int intValue3 = valueOf3.intValue();
                int intValue22 = valueOf22.intValue();
                if (nb3.k(a47Var2, a47Var3)) {
                }
                if (x51Var.f != 1) {
                }
                jt3Var.g.setValue(new om1(x51Var.e.Q(i2)));
                return g34Var.K(intValue3, intValue22, c14.m0(new vr4(lc.a, Integer.valueOf(Math.round(a47Var3.d))), new vr4(lc.b, Integer.valueOf(Math.round(a47Var3.e)))), new bz1(22));
            }
            i.m("layoutIntrinsics must be called first");
            return f34Var;
        } finally {
            ln2.V(t, N, qn2Var);
        }
    }
}
