package defpackage;

import android.content.res.Resources;
import android.graphics.Paint;
import android.os.Bundle;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: d5  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class d5 implements qn2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object R;
    public final /* synthetic */ Object X;
    public final /* synthetic */ Object Y;

    public /* synthetic */ d5(ss3 ss3Var, ta5 ta5Var, on2 on2Var, qn2 qn2Var, on2 on2Var2) {
        this.A = 0;
        this.B = ss3Var;
        this.L = ta5Var;
        this.R = on2Var;
        this.Y = qn2Var;
        this.X = on2Var2;
    }

    @Override // defpackage.qn2
    public final Object g(Object obj) {
        jt3 jt3Var;
        p27 p27Var;
        boolean z;
        float i;
        List list;
        of5 of5Var;
        float rint;
        int i2 = this.A;
        jg7 jg7Var = jg7.a;
        fo7 fo7Var = null;
        boolean z2 = false;
        Object obj2 = this.Y;
        Object obj3 = this.X;
        Object obj4 = this.R;
        Object obj5 = this.L;
        Object obj6 = this.B;
        switch (i2) {
            case 0:
                ss3 ss3Var = (ss3) obj6;
                ta5 ta5Var = (ta5) obj5;
                on2 on2Var = (on2) obj3;
                er3 er3Var = (er3) obj;
                er3Var.getClass();
                er3.g0(er3Var, null, "leaderboard-header", new zv0(1529186282, true, new dq3(ta5Var, ss3Var, (on2) obj4, (qn2) obj2, 2)), 1);
                if (nb3.k(ss3Var, qs3.b)) {
                    er3.g0(er3Var, null, "leaderboard", f04.d, 1);
                    return jg7Var;
                } else if (nb3.k(ss3Var, qs3.a)) {
                    er3.g0(er3Var, null, "leaderboard", new zv0(1507824041, true, new h5(0, on2Var)), 1);
                    return jg7Var;
                } else if (ss3Var instanceof rs3) {
                    ya5 ya5Var = ((rs3) ss3Var).a;
                    if (ya5Var.c.isEmpty()) {
                        er3.g0(er3Var, null, "leaderboard", f04.f, 1);
                        return jg7Var;
                    }
                    ArrayList arrayList = ya5Var.c;
                    er3Var.h0(arrayList.size(), new r5(3, new k0(ta5Var, 3), arrayList), new r5(4, new k4(0), arrayList), new zv0(802480018, true, new u5(0, arrayList)));
                    return jg7Var;
                } else {
                    i.d();
                    return null;
                }
            case 1:
                e9 e9Var = (e9) obj6;
                gl1 gl1Var = (gl1) obj;
                e9Var.a = ((j9) obj5).c((String) obj4, (b9) obj3, new k9((qa4) obj2, 0));
                return new z3(e9Var, 1);
            case 2:
                kt3 kt3Var = (kt3) obj;
                et3 et3Var = ((ki) obj5).a;
                kt3Var.h = (c37) obj6;
                kt3Var.i = (l33) obj4;
                kt3Var.c = (t00) obj3;
                kt3Var.d = (qn2) obj2;
                if (et3Var != null) {
                    jt3Var = et3Var.l0;
                } else {
                    jt3Var = null;
                }
                kt3Var.e = jt3Var;
                if (et3Var != null) {
                    p27Var = et3Var.m0;
                } else {
                    p27Var = null;
                }
                kt3Var.f = p27Var;
                if (et3Var != null) {
                    fo7Var = (fo7) hf.K(et3Var, ky0.t);
                }
                kt3Var.g = fo7Var;
                return jg7Var;
            case 3:
                v10 v10Var = (v10) obj6;
                n00 n00Var = (n00) obj;
                n00Var.getClass();
                hv.L(to7.a(v10Var), null, null, new u10(v10Var, n00Var, null, 1), 3);
                hv.L((w61) obj5, null, null, new ji((x56) obj4, (String) obj3, (String) obj2, v10Var, n00Var, null, 3), 3);
                return jg7Var;
            case 4:
                final aq0 aq0Var = (aq0) obj6;
                final lq4 lq4Var = (lq4) obj5;
                final w61 w61Var = (w61) obj4;
                final Resources resources = (Resources) obj3;
                final gl6 gl6Var = (gl6) obj2;
                nc4 nc4Var = (nc4) obj;
                nc4Var.getClass();
                zv0 zv0Var = new zv0(355313283, true, new go2() { // from class: ip0
                    /* JADX WARN: Type inference failed for: r0v18, types: [pp0, java.lang.Object] */
                    /* JADX WARN: Type inference failed for: r0v3, types: [pp0, java.lang.Object] */
                    /* JADX WARN: Type inference failed for: r0v9, types: [pp0, java.lang.Object] */
                    @Override // defpackage.go2
                    public final Object l(Object obj7, Object obj8, Object obj9, Object obj10) {
                        int i3 = r3;
                        jg7 jg7Var2 = jg7.a;
                        vs0 vs0Var = ox0.a;
                        aq0 aq0Var2 = aq0Var;
                        sn snVar = (sn) obj7;
                        switch (i3) {
                            case 0:
                                px0 px0Var = (px0) obj9;
                                ((Integer) obj10).getClass();
                                snVar.getClass();
                                ((sb4) obj8).getClass();
                                qa4 l = nb3.l((kf6) aq0Var2.i.getValue(), new Object(), px0Var, 0);
                                lc2 lc2Var = dj6.c;
                                rp0 rp0Var = (rp0) l.getValue();
                                xq2 xq2Var = (xq2) px0Var;
                                boolean h = xq2Var.h(aq0Var2);
                                Object P = xq2Var.P();
                                if (h || P == vs0Var) {
                                    P = new kp0(aq0Var2, 4);
                                    xq2Var.l0(P);
                                }
                                np2.a(lc2Var, lq4Var, rp0Var, (qn2) P, xq2Var, 6);
                                return jg7Var2;
                            case 1:
                                px0 px0Var2 = (px0) obj9;
                                ((Integer) obj10).getClass();
                                snVar.getClass();
                                ((sb4) obj8).getClass();
                                qa4 l2 = nb3.l((kf6) aq0Var2.j.getValue(), new Object(), px0Var2, 0);
                                lc2 lc2Var2 = dj6.c;
                                rp0 rp0Var2 = (rp0) l2.getValue();
                                xq2 xq2Var2 = (xq2) px0Var2;
                                boolean h2 = xq2Var2.h(aq0Var2);
                                Object P2 = xq2Var2.P();
                                if (h2 || P2 == vs0Var) {
                                    P2 = new kp0(aq0Var2, 1);
                                    xq2Var2.l0(P2);
                                }
                                qn2 qn2Var = (qn2) P2;
                                boolean h3 = xq2Var2.h(aq0Var2);
                                Object P3 = xq2Var2.P();
                                if (h3 || P3 == vs0Var) {
                                    P3 = new kp0(aq0Var2, 2);
                                    xq2Var2.l0(P3);
                                }
                                vy7.p(lc2Var2, lq4Var, rp0Var2, qn2Var, (qn2) P3, xq2Var2, 6);
                                return jg7Var2;
                            default:
                                px0 px0Var3 = (px0) obj9;
                                ((Integer) obj10).getClass();
                                snVar.getClass();
                                ((sb4) obj8).getClass();
                                qa4 l3 = nb3.l((kf6) aq0Var2.l.getValue(), new Object(), px0Var3, 0);
                                lc2 lc2Var3 = dj6.c;
                                rp0 rp0Var3 = (rp0) l3.getValue();
                                xq2 xq2Var3 = (xq2) px0Var3;
                                boolean h4 = xq2Var3.h(aq0Var2);
                                Object P4 = xq2Var3.P();
                                if (h4 || P4 == vs0Var) {
                                    P4 = new kp0(aq0Var2, 3);
                                    xq2Var3.l0(P4);
                                }
                                ak7.t(lc2Var3, lq4Var, rp0Var3, (qn2) P4, xq2Var3, 6);
                                return jg7Var2;
                        }
                    }
                });
                ar0 a = gh5.a(dp0.class);
                zt1 zt1Var = zt1.A;
                jx2.o(nc4Var, a, zt1Var, zv0Var);
                jx2.o(nc4Var, gh5.a(cp0.class), zt1Var, new zv0(-198237268, true, new go2() { // from class: ip0
                    /* JADX WARN: Type inference failed for: r0v18, types: [pp0, java.lang.Object] */
                    /* JADX WARN: Type inference failed for: r0v3, types: [pp0, java.lang.Object] */
                    /* JADX WARN: Type inference failed for: r0v9, types: [pp0, java.lang.Object] */
                    @Override // defpackage.go2
                    public final Object l(Object obj7, Object obj8, Object obj9, Object obj10) {
                        int i3 = r3;
                        jg7 jg7Var2 = jg7.a;
                        vs0 vs0Var = ox0.a;
                        aq0 aq0Var2 = aq0Var;
                        sn snVar = (sn) obj7;
                        switch (i3) {
                            case 0:
                                px0 px0Var = (px0) obj9;
                                ((Integer) obj10).getClass();
                                snVar.getClass();
                                ((sb4) obj8).getClass();
                                qa4 l = nb3.l((kf6) aq0Var2.i.getValue(), new Object(), px0Var, 0);
                                lc2 lc2Var = dj6.c;
                                rp0 rp0Var = (rp0) l.getValue();
                                xq2 xq2Var = (xq2) px0Var;
                                boolean h = xq2Var.h(aq0Var2);
                                Object P = xq2Var.P();
                                if (h || P == vs0Var) {
                                    P = new kp0(aq0Var2, 4);
                                    xq2Var.l0(P);
                                }
                                np2.a(lc2Var, lq4Var, rp0Var, (qn2) P, xq2Var, 6);
                                return jg7Var2;
                            case 1:
                                px0 px0Var2 = (px0) obj9;
                                ((Integer) obj10).getClass();
                                snVar.getClass();
                                ((sb4) obj8).getClass();
                                qa4 l2 = nb3.l((kf6) aq0Var2.j.getValue(), new Object(), px0Var2, 0);
                                lc2 lc2Var2 = dj6.c;
                                rp0 rp0Var2 = (rp0) l2.getValue();
                                xq2 xq2Var2 = (xq2) px0Var2;
                                boolean h2 = xq2Var2.h(aq0Var2);
                                Object P2 = xq2Var2.P();
                                if (h2 || P2 == vs0Var) {
                                    P2 = new kp0(aq0Var2, 1);
                                    xq2Var2.l0(P2);
                                }
                                qn2 qn2Var = (qn2) P2;
                                boolean h3 = xq2Var2.h(aq0Var2);
                                Object P3 = xq2Var2.P();
                                if (h3 || P3 == vs0Var) {
                                    P3 = new kp0(aq0Var2, 2);
                                    xq2Var2.l0(P3);
                                }
                                vy7.p(lc2Var2, lq4Var, rp0Var2, qn2Var, (qn2) P3, xq2Var2, 6);
                                return jg7Var2;
                            default:
                                px0 px0Var3 = (px0) obj9;
                                ((Integer) obj10).getClass();
                                snVar.getClass();
                                ((sb4) obj8).getClass();
                                qa4 l3 = nb3.l((kf6) aq0Var2.l.getValue(), new Object(), px0Var3, 0);
                                lc2 lc2Var3 = dj6.c;
                                rp0 rp0Var3 = (rp0) l3.getValue();
                                xq2 xq2Var3 = (xq2) px0Var3;
                                boolean h4 = xq2Var3.h(aq0Var2);
                                Object P4 = xq2Var3.P();
                                if (h4 || P4 == vs0Var) {
                                    P4 = new kp0(aq0Var2, 3);
                                    xq2Var3.l0(P4);
                                }
                                ak7.t(lc2Var3, lq4Var, rp0Var3, (qn2) P4, xq2Var3, 6);
                                return jg7Var2;
                        }
                    }
                }));
                jx2.o(nc4Var, gh5.a(zo0.class), zt1Var, new zv0(247300043, true, new go2() { // from class: jp0
                    /* JADX WARN: Type inference failed for: r2v2, types: [pp0, java.lang.Object] */
                    @Override // defpackage.go2
                    public final Object l(Object obj7, Object obj8, Object obj9, Object obj10) {
                        px0 px0Var = (px0) obj9;
                        ((Integer) obj10).getClass();
                        ((sn) obj7).getClass();
                        ((sb4) obj8).getClass();
                        aq0 aq0Var2 = aq0.this;
                        qa4 l = nb3.l((kf6) aq0Var2.k.getValue(), new Object(), px0Var, 0);
                        lc2 lc2Var = dj6.c;
                        rp0 rp0Var = (rp0) l.getValue();
                        xq2 xq2Var = (xq2) px0Var;
                        boolean h = xq2Var.h(aq0Var2);
                        Object P = xq2Var.P();
                        vs0 vs0Var = ox0.a;
                        if (h || P == vs0Var) {
                            P = new kp0(aq0Var2, 0);
                            xq2Var.l0(P);
                        }
                        qn2 qn2Var = (qn2) P;
                        boolean h2 = xq2Var.h(aq0Var2);
                        Object P2 = xq2Var.P();
                        if (h2 || P2 == vs0Var) {
                            P2 = new a0(1, aq0Var2, aq0.class, "addNewCheat", "addNewCheat(Lme/magnum/melonds/ui/cheats/model/CheatSubmissionForm;)V", 0, 0, 3);
                            xq2Var.l0(P2);
                        }
                        qn2 qn2Var2 = (qn2) ((po2) P2);
                        boolean h3 = xq2Var.h(aq0Var2);
                        Object P3 = xq2Var.P();
                        if (h3 || P3 == vs0Var) {
                            h4 h4Var = new h4(2, aq0Var2, aq0.class, "updateCheat", "updateCheat(Lme/magnum/melonds/domain/model/Cheat;Lme/magnum/melonds/ui/cheats/model/CheatSubmissionForm;)V", 0, 0, 1);
                            xq2Var.l0(h4Var);
                            P3 = h4Var;
                        }
                        eo2 eo2Var = (eo2) ((po2) P3);
                        w61 w61Var2 = w61Var;
                        boolean h4 = xq2Var.h(w61Var2);
                        Resources resources2 = resources;
                        boolean h5 = h4 | xq2Var.h(resources2) | xq2Var.h(aq0Var2);
                        Object P4 = xq2Var.P();
                        if (h5 || P4 == vs0Var) {
                            cn cnVar = new cn(w61Var2, aq0Var2, gl6Var, resources2, 2);
                            xq2Var.l0(cnVar);
                            P4 = cnVar;
                        }
                        nw7.l(lc2Var, lq4Var, rp0Var, qn2Var, qn2Var2, eo2Var, (qn2) P4, xq2Var, 6);
                        return jg7.a;
                    }
                }));
                jx2.o(nc4Var, gh5.a(wo0.class), zt1Var, new zv0(692837354, true, new go2() { // from class: ip0
                    /* JADX WARN: Type inference failed for: r0v18, types: [pp0, java.lang.Object] */
                    /* JADX WARN: Type inference failed for: r0v3, types: [pp0, java.lang.Object] */
                    /* JADX WARN: Type inference failed for: r0v9, types: [pp0, java.lang.Object] */
                    @Override // defpackage.go2
                    public final Object l(Object obj7, Object obj8, Object obj9, Object obj10) {
                        int i3 = r3;
                        jg7 jg7Var2 = jg7.a;
                        vs0 vs0Var = ox0.a;
                        aq0 aq0Var2 = aq0Var;
                        sn snVar = (sn) obj7;
                        switch (i3) {
                            case 0:
                                px0 px0Var = (px0) obj9;
                                ((Integer) obj10).getClass();
                                snVar.getClass();
                                ((sb4) obj8).getClass();
                                qa4 l = nb3.l((kf6) aq0Var2.i.getValue(), new Object(), px0Var, 0);
                                lc2 lc2Var = dj6.c;
                                rp0 rp0Var = (rp0) l.getValue();
                                xq2 xq2Var = (xq2) px0Var;
                                boolean h = xq2Var.h(aq0Var2);
                                Object P = xq2Var.P();
                                if (h || P == vs0Var) {
                                    P = new kp0(aq0Var2, 4);
                                    xq2Var.l0(P);
                                }
                                np2.a(lc2Var, lq4Var, rp0Var, (qn2) P, xq2Var, 6);
                                return jg7Var2;
                            case 1:
                                px0 px0Var2 = (px0) obj9;
                                ((Integer) obj10).getClass();
                                snVar.getClass();
                                ((sb4) obj8).getClass();
                                qa4 l2 = nb3.l((kf6) aq0Var2.j.getValue(), new Object(), px0Var2, 0);
                                lc2 lc2Var2 = dj6.c;
                                rp0 rp0Var2 = (rp0) l2.getValue();
                                xq2 xq2Var2 = (xq2) px0Var2;
                                boolean h2 = xq2Var2.h(aq0Var2);
                                Object P2 = xq2Var2.P();
                                if (h2 || P2 == vs0Var) {
                                    P2 = new kp0(aq0Var2, 1);
                                    xq2Var2.l0(P2);
                                }
                                qn2 qn2Var = (qn2) P2;
                                boolean h3 = xq2Var2.h(aq0Var2);
                                Object P3 = xq2Var2.P();
                                if (h3 || P3 == vs0Var) {
                                    P3 = new kp0(aq0Var2, 2);
                                    xq2Var2.l0(P3);
                                }
                                vy7.p(lc2Var2, lq4Var, rp0Var2, qn2Var, (qn2) P3, xq2Var2, 6);
                                return jg7Var2;
                            default:
                                px0 px0Var3 = (px0) obj9;
                                ((Integer) obj10).getClass();
                                snVar.getClass();
                                ((sb4) obj8).getClass();
                                qa4 l3 = nb3.l((kf6) aq0Var2.l.getValue(), new Object(), px0Var3, 0);
                                lc2 lc2Var3 = dj6.c;
                                rp0 rp0Var3 = (rp0) l3.getValue();
                                xq2 xq2Var3 = (xq2) px0Var3;
                                boolean h4 = xq2Var3.h(aq0Var2);
                                Object P4 = xq2Var3.P();
                                if (h4 || P4 == vs0Var) {
                                    P4 = new kp0(aq0Var2, 3);
                                    xq2Var3.l0(P4);
                                }
                                ak7.t(lc2Var3, lq4Var, rp0Var3, (qn2) P4, xq2Var3, 6);
                                return jg7Var2;
                        }
                    }
                }));
                return jg7Var;
            case 5:
                m84 m84Var = (m84) obj6;
                dh5 dh5Var = (dh5) obj5;
                ah5 ah5Var = (ah5) obj4;
                m86 m86Var = (m86) obj3;
                zg5 zg5Var = (zg5) obj2;
                float floatValue = ((Float) obj).floatValue();
                i84 g = m84.g(m84Var.g);
                if (g != null) {
                    yc1 yc1Var = m84Var.e;
                    long j = g.b;
                    long j2 = g.a;
                    z = true;
                    ((rl7) yc1Var.A).a(Float.intBitsToFloat((int) (j2 >> 32)), j);
                    ((rl7) yc1Var.B).a(Float.intBitsToFloat((int) (j2 & 4294967295L)), j);
                    i84 a2 = ((i84) dh5Var.A).a(g);
                    dh5Var.A = a2;
                    ah5Var.A = m86Var.i(m86Var.e(a2.a));
                    zg5Var.A = !nj2.f(i - floatValue);
                } else {
                    z = true;
                }
                if (g != null) {
                    z2 = z;
                }
                return Boolean.valueOf(z2);
            case 6:
                ArrayList arrayList2 = (ArrayList) obj5;
                bh5 bh5Var = (bh5) obj4;
                zb4 zb4Var = (zb4) obj3;
                Bundle bundle = (Bundle) obj2;
                sb4 sb4Var = (sb4) obj;
                sb4Var.getClass();
                ((zg5) obj6).A = true;
                int indexOf = arrayList2.indexOf(sb4Var);
                if (indexOf != -1) {
                    int i3 = indexOf + 1;
                    list = arrayList2.subList(bh5Var.A, i3);
                    bh5Var.A = i3;
                } else {
                    list = yt1.A;
                }
                zb4Var.a(sb4Var.B, bundle, sb4Var, list);
                return jg7Var;
            case 7:
                mu4 mu4Var = (mu4) obj6;
                oo3 oo3Var = (oo3) obj;
                oo3Var.getClass();
                oo3.g0(oo3Var, "resume", null, new zv0(1050778895, true, new l4(9, (on2) obj4, (nh2) obj5)), 6);
                List list2 = mu4Var.a;
                oo3Var.h0(list2.size(), new r5(18, new x84(26), list2), new j5(15, list2), new zv0(-1117249557, true, new t5(list2, mu4Var, (qn2) obj2, (qa4) obj3)));
                return jg7Var;
            default:
                mk4 mk4Var = (mk4) obj5;
                c37 c37Var = (c37) obj4;
                jt3 jt3Var2 = (jt3) obj3;
                cn6 cn6Var = (cn6) obj2;
                um3 um3Var = (um3) obj;
                um3Var.b();
                zj0 zj0Var = um3Var.A;
                float h = ((c81) obj6).c.h();
                if (h != RecyclerView.B1) {
                    long j3 = c37Var.b;
                    int i4 = k47.c;
                    int s = mk4Var.s((int) (j3 >> 32));
                    b47 d = jt3Var2.d();
                    if (d != null) {
                        of5Var = d.a.c(s);
                    } else {
                        of5Var = new of5(RecyclerView.B1, RecyclerView.B1, RecyclerView.B1, RecyclerView.B1);
                    }
                    float floor = (float) Math.floor(um3Var.e0(2.0f));
                    if (floor < 1.0f) {
                        floor = 1.0f;
                    }
                    float f = floor / 2.0f;
                    float f2 = of5Var.a + f;
                    float intBitsToFloat = Float.intBitsToFloat((int) (zj0Var.e() >> 32)) - f;
                    if (f2 > intBitsToFloat) {
                        f2 = intBitsToFloat;
                    }
                    if (f2 >= f) {
                        f = f2;
                    }
                    if (((int) floor) % 2 == 1) {
                        rint = ((float) Math.floor(f)) + 0.5f;
                    } else {
                        rint = (float) Math.rint(f);
                    }
                    long floatToRawIntBits = (Float.floatToRawIntBits(rint) << 32) | (Float.floatToRawIntBits(of5Var.b) & 4294967295L);
                    float f3 = of5Var.d;
                    long floatToRawIntBits2 = (Float.floatToRawIntBits(rint) << 32) | (Float.floatToRawIntBits(f3) & 4294967295L);
                    xj0 xj0Var = zj0Var.A.c;
                    aj ajVar = zj0Var.R;
                    if (ajVar == null) {
                        ajVar = nc1.t();
                        ajVar.t(1);
                        zj0Var.R = ajVar;
                    }
                    Paint paint = (Paint) ajVar.L;
                    cn6Var.a(h, zj0Var.e(), ajVar);
                    if (!nb3.k((z40) ajVar.X, null)) {
                        ajVar.m(null);
                    }
                    if (ajVar.B != 3) {
                        ajVar.k(3);
                    }
                    if (paint.getStrokeWidth() != floor) {
                        ajVar.s(floor);
                    }
                    if (paint.getStrokeMiter() != 4.0f) {
                        paint.setStrokeMiter(4.0f);
                    }
                    if (ajVar.g() != 0) {
                        ajVar.q(0);
                    }
                    if (ajVar.h() != 0) {
                        ajVar.r(0);
                    }
                    if (!nb3.k(null, null)) {
                        ajVar.o(null);
                    }
                    if (!paint.isFilterBitmap()) {
                        ajVar.n(1);
                    }
                    xj0Var.i(floatToRawIntBits, floatToRawIntBits2, ajVar);
                }
                return jg7Var;
        }
    }

    public /* synthetic */ d5(mu4 mu4Var, on2 on2Var, nh2 nh2Var, qn2 qn2Var, qa4 qa4Var) {
        this.A = 7;
        this.B = mu4Var;
        this.R = on2Var;
        this.L = nh2Var;
        this.Y = qn2Var;
        this.X = qa4Var;
    }

    public /* synthetic */ d5(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.A = i;
        this.B = obj;
        this.L = obj2;
        this.R = obj3;
        this.X = obj4;
        this.Y = obj5;
    }
}
