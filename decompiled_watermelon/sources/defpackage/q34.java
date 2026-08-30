package defpackage;

import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: q34  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class q34 implements mi2 {
    public final /* synthetic */ int A = 2;
    public final /* synthetic */ boolean B;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object R;
    public final /* synthetic */ Object X;
    public final /* synthetic */ Object Y;

    public /* synthetic */ q34(hm3 hm3Var, wc2 wc2Var, boolean z, bq6 bq6Var, pb4 pb4Var) {
        this.L = hm3Var;
        this.R = wc2Var;
        this.B = z;
        this.X = bq6Var;
        this.Y = pb4Var;
    }

    @Override // defpackage.mi2
    public final Object n(Object obj) {
        int i = this.A;
        boolean z = this.B;
        o27 o27Var = o27.a;
        Object obj2 = this.Y;
        Object obj3 = this.X;
        Object obj4 = this.R;
        Object obj5 = this.L;
        switch (i) {
            case 0:
                l34 l34Var = (l34) obj;
                l34Var.getClass();
                ((j75) obj5).A = true;
                ((j75) obj4).A = true;
                ((s34) obj3).m(l34Var, z, (xt) obj2);
                return o27Var;
            case 1:
                List list = (List) obj5;
                ph3 ph3Var = (ph3) obj;
                ph3Var.getClass();
                nh5 nh5Var = new nh5(10);
                ph3Var.b0(list.size(), new s5(22, nh5Var, list), new k5(18, list), new et0(-1117249557, true, new ht5(list, this.B, list, (wc2) obj4, (mi2) obj3, (mi2) obj2)));
                return o27Var;
            default:
                hm3 hm3Var = (hm3) obj5;
                wc2 wc2Var = (wc2) obj4;
                bq6 bq6Var = (bq6) obj3;
                pb4 pb4Var = (pb4) obj2;
                mb4 mb4Var = (mb4) obj;
                if (!hm3Var.b()) {
                    wc2.a(wc2Var);
                } else {
                    ib6 ib6Var = hm3Var.c;
                    if (ib6Var != null) {
                        ((zc1) ib6Var).b();
                    }
                }
                if (hm3Var.b() && z) {
                    if (hm3Var.a() != gp2.Selection) {
                        mr6 d = hm3Var.d();
                        if (d != null) {
                            long j = mb4Var.a;
                            k91 k91Var = hm3Var.d;
                            o21 o21Var = hm3Var.v;
                            int n = pb4Var.n(d.b(j, true));
                            o21Var.n(oq6.a((oq6) k91Var.A, null, ve2.g(n, n), 5));
                            if (hm3Var.a.a.B.length() > 0) {
                                hm3Var.k.setValue(gp2.Cursor);
                            }
                        }
                    } else {
                        bq6Var.g(mb4Var);
                    }
                }
                return o27Var;
        }
    }

    public /* synthetic */ q34(j75 j75Var, j75 j75Var2, s34 s34Var, boolean z, xt xtVar) {
        this.L = j75Var;
        this.R = j75Var2;
        this.X = s34Var;
        this.B = z;
        this.Y = xtVar;
    }

    public /* synthetic */ q34(List list, boolean z, wc2 wc2Var, mi2 mi2Var, mi2 mi2Var2) {
        this.L = list;
        this.B = z;
        this.R = wc2Var;
        this.X = mi2Var;
        this.Y = mi2Var2;
    }
}
