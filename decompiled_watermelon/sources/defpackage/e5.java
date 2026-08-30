package defpackage;

import android.content.res.Resources;
import android.graphics.Paint;
import android.os.Bundle;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: e5  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class e5 implements mi2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object R;
    public final /* synthetic */ Object X;
    public final /* synthetic */ Object Y;

    public /* synthetic */ e5(kl4 kl4Var, ki2 ki2Var, wc2 wc2Var, mi2 mi2Var, k24 k24Var) {
        this.A = 8;
        this.B = kl4Var;
        this.R = ki2Var;
        this.L = wc2Var;
        this.Y = mi2Var;
        this.X = k24Var;
    }

    @Override // defpackage.mi2
    public final Object n(Object obj) {
        hm3 hm3Var;
        bq6 bq6Var;
        boolean z;
        float i;
        List list;
        y55 y55Var;
        float rint;
        int i2 = this.A;
        fa7 fa7Var = null;
        o27 o27Var = o27.a;
        Object obj2 = this.Y;
        Object obj3 = this.X;
        Object obj4 = this.R;
        Object obj5 = this.L;
        Object obj6 = this.B;
        switch (i2) {
            case 0:
                ql3 ql3Var = (ql3) obj6;
                j15 j15Var = (j15) obj5;
                ki2 ki2Var = (ki2) obj3;
                ek3 ek3Var = (ek3) obj;
                ek3Var.getClass();
                ek3.a0(ek3Var, null, "leaderboard-header", new et0(1529186282, true, new g61(j15Var, ql3Var, (ki2) obj4, (mi2) obj2, 2)), 1);
                if (b53.x(ql3Var, ol3.b)) {
                    ek3.a0(ek3Var, null, "leaderboard", ct3.R, 1);
                } else if (b53.x(ql3Var, ol3.a)) {
                    ek3.a0(ek3Var, null, "leaderboard", new et0(1507824041, true, new i5(0, ki2Var)), 1);
                } else if (ql3Var instanceof pl3) {
                    o15 o15Var = ((pl3) ql3Var).a;
                    if (o15Var.c.isEmpty()) {
                        ek3.a0(ek3Var, null, "leaderboard", ct3.Y, 1);
                    } else {
                        ArrayList arrayList = o15Var.c;
                        ek3Var.b0(arrayList.size(), new s5(3, new j0(3, j15Var), arrayList), new s5(4, new k4(0), arrayList), new et0(802480018, true, new u5(0, arrayList)));
                    }
                } else {
                    i.c();
                    return null;
                }
                return o27Var;
            case 1:
                d9 d9Var = (d9) obj6;
                ch1 ch1Var = (ch1) obj;
                d9Var.a = ((i9) obj5).c((String) obj4, (a9) obj3, new j9(0, (k24) obj2));
                return new y3(1, d9Var);
            case 2:
                im3 im3Var = (im3) obj;
                cm3 cm3Var = ((yh) obj5).a;
                im3Var.h = (oq6) obj6;
                im3Var.i = (hx2) obj4;
                im3Var.c = (cz) obj3;
                im3Var.d = (mi2) obj2;
                if (cm3Var != null) {
                    hm3Var = cm3Var.k0;
                } else {
                    hm3Var = null;
                }
                im3Var.e = hm3Var;
                if (cm3Var != null) {
                    bq6Var = cm3Var.l0;
                } else {
                    bq6Var = null;
                }
                im3Var.f = bq6Var;
                if (cm3Var != null) {
                    fa7Var = (fa7) mh7.t(cm3Var, ov0.t);
                }
                im3Var.g = fa7Var;
                return o27Var;
            case 3:
                e00 e00Var = (e00) obj6;
                vy vyVar = (vy) obj;
                vyVar.getClass();
                tq5.w(ua7.a(e00Var), null, null, new d00(e00Var, vyVar, null, 1), 3);
                tq5.w((o31) obj5, null, null, new xh((tu5) obj4, (String) obj3, (String) obj2, e00Var, vyVar, null, 3), 3);
                return o27Var;
            case 4:
                final pn0 pn0Var = (pn0) obj6;
                final ih4 ih4Var = (ih4) obj5;
                final o31 o31Var = (o31) obj4;
                final Resources resources = (Resources) obj3;
                final r96 r96Var = (r96) obj2;
                h44 h44Var = (h44) obj;
                h44Var.getClass();
                et0 et0Var = new et0(355313283, true, new cj2() { // from class: ym0
                    /* JADX WARN: Type inference failed for: r0v18, types: [en0, java.lang.Object] */
                    /* JADX WARN: Type inference failed for: r0v3, types: [en0, java.lang.Object] */
                    /* JADX WARN: Type inference failed for: r0v9, types: [en0, java.lang.Object] */
                    @Override // defpackage.cj2
                    public final Object q(Object obj7, Object obj8, Object obj9, Object obj10) {
                        int i3 = r3;
                        o27 o27Var2 = o27.a;
                        sn1 sn1Var = su0.a;
                        pn0 pn0Var2 = pn0Var;
                        gn gnVar = (gn) obj7;
                        switch (i3) {
                            case 0:
                                tu0 tu0Var = (tu0) obj9;
                                ((Integer) obj10).getClass();
                                gnVar.getClass();
                                ((l34) obj8).getClass();
                                k24 v = l.v((y36) pn0Var2.i.getValue(), new Object(), tu0Var, 0);
                                s72 s72Var = o76.c;
                                gn0 gn0Var = (gn0) v.getValue();
                                sk2 sk2Var = (sk2) tu0Var;
                                boolean h = sk2Var.h(pn0Var2);
                                Object L = sk2Var.L();
                                if (h || L == sn1Var) {
                                    L = new an0(pn0Var2, 4);
                                    sk2Var.h0(L);
                                }
                                hk2.a(s72Var, ih4Var, gn0Var, (mi2) L, sk2Var, 6);
                                return o27Var2;
                            case 1:
                                tu0 tu0Var2 = (tu0) obj9;
                                ((Integer) obj10).getClass();
                                gnVar.getClass();
                                ((l34) obj8).getClass();
                                k24 v2 = l.v((y36) pn0Var2.j.getValue(), new Object(), tu0Var2, 0);
                                s72 s72Var2 = o76.c;
                                gn0 gn0Var2 = (gn0) v2.getValue();
                                sk2 sk2Var2 = (sk2) tu0Var2;
                                boolean h2 = sk2Var2.h(pn0Var2);
                                Object L2 = sk2Var2.L();
                                if (h2 || L2 == sn1Var) {
                                    L2 = new an0(pn0Var2, 1);
                                    sk2Var2.h0(L2);
                                }
                                mi2 mi2Var = (mi2) L2;
                                boolean h3 = sk2Var2.h(pn0Var2);
                                Object L3 = sk2Var2.L();
                                if (h3 || L3 == sn1Var) {
                                    L3 = new an0(pn0Var2, 2);
                                    sk2Var2.h0(L3);
                                }
                                dt3.y(s72Var2, ih4Var, gn0Var2, mi2Var, (mi2) L3, sk2Var2, 6);
                                return o27Var2;
                            default:
                                tu0 tu0Var3 = (tu0) obj9;
                                ((Integer) obj10).getClass();
                                gnVar.getClass();
                                ((l34) obj8).getClass();
                                k24 v3 = l.v((y36) pn0Var2.l.getValue(), new Object(), tu0Var3, 0);
                                s72 s72Var3 = o76.c;
                                gn0 gn0Var3 = (gn0) v3.getValue();
                                sk2 sk2Var3 = (sk2) tu0Var3;
                                boolean h4 = sk2Var3.h(pn0Var2);
                                Object L4 = sk2Var3.L();
                                if (h4 || L4 == sn1Var) {
                                    L4 = new an0(pn0Var2, 3);
                                    sk2Var3.h0(L4);
                                }
                                dt3.v(s72Var3, ih4Var, gn0Var3, (mi2) L4, sk2Var3, 6);
                                return o27Var2;
                        }
                    }
                });
                qo0 a = q75.a(um0.class);
                qp1 qp1Var = qp1.A;
                nl2.E(h44Var, a, qp1Var, et0Var);
                nl2.E(h44Var, q75.a(tm0.class), qp1Var, new et0(-198237268, true, new cj2() { // from class: ym0
                    /* JADX WARN: Type inference failed for: r0v18, types: [en0, java.lang.Object] */
                    /* JADX WARN: Type inference failed for: r0v3, types: [en0, java.lang.Object] */
                    /* JADX WARN: Type inference failed for: r0v9, types: [en0, java.lang.Object] */
                    @Override // defpackage.cj2
                    public final Object q(Object obj7, Object obj8, Object obj9, Object obj10) {
                        int i3 = r3;
                        o27 o27Var2 = o27.a;
                        sn1 sn1Var = su0.a;
                        pn0 pn0Var2 = pn0Var;
                        gn gnVar = (gn) obj7;
                        switch (i3) {
                            case 0:
                                tu0 tu0Var = (tu0) obj9;
                                ((Integer) obj10).getClass();
                                gnVar.getClass();
                                ((l34) obj8).getClass();
                                k24 v = l.v((y36) pn0Var2.i.getValue(), new Object(), tu0Var, 0);
                                s72 s72Var = o76.c;
                                gn0 gn0Var = (gn0) v.getValue();
                                sk2 sk2Var = (sk2) tu0Var;
                                boolean h = sk2Var.h(pn0Var2);
                                Object L = sk2Var.L();
                                if (h || L == sn1Var) {
                                    L = new an0(pn0Var2, 4);
                                    sk2Var.h0(L);
                                }
                                hk2.a(s72Var, ih4Var, gn0Var, (mi2) L, sk2Var, 6);
                                return o27Var2;
                            case 1:
                                tu0 tu0Var2 = (tu0) obj9;
                                ((Integer) obj10).getClass();
                                gnVar.getClass();
                                ((l34) obj8).getClass();
                                k24 v2 = l.v((y36) pn0Var2.j.getValue(), new Object(), tu0Var2, 0);
                                s72 s72Var2 = o76.c;
                                gn0 gn0Var2 = (gn0) v2.getValue();
                                sk2 sk2Var2 = (sk2) tu0Var2;
                                boolean h2 = sk2Var2.h(pn0Var2);
                                Object L2 = sk2Var2.L();
                                if (h2 || L2 == sn1Var) {
                                    L2 = new an0(pn0Var2, 1);
                                    sk2Var2.h0(L2);
                                }
                                mi2 mi2Var = (mi2) L2;
                                boolean h3 = sk2Var2.h(pn0Var2);
                                Object L3 = sk2Var2.L();
                                if (h3 || L3 == sn1Var) {
                                    L3 = new an0(pn0Var2, 2);
                                    sk2Var2.h0(L3);
                                }
                                dt3.y(s72Var2, ih4Var, gn0Var2, mi2Var, (mi2) L3, sk2Var2, 6);
                                return o27Var2;
                            default:
                                tu0 tu0Var3 = (tu0) obj9;
                                ((Integer) obj10).getClass();
                                gnVar.getClass();
                                ((l34) obj8).getClass();
                                k24 v3 = l.v((y36) pn0Var2.l.getValue(), new Object(), tu0Var3, 0);
                                s72 s72Var3 = o76.c;
                                gn0 gn0Var3 = (gn0) v3.getValue();
                                sk2 sk2Var3 = (sk2) tu0Var3;
                                boolean h4 = sk2Var3.h(pn0Var2);
                                Object L4 = sk2Var3.L();
                                if (h4 || L4 == sn1Var) {
                                    L4 = new an0(pn0Var2, 3);
                                    sk2Var3.h0(L4);
                                }
                                dt3.v(s72Var3, ih4Var, gn0Var3, (mi2) L4, sk2Var3, 6);
                                return o27Var2;
                        }
                    }
                }));
                nl2.E(h44Var, q75.a(qm0.class), qp1Var, new et0(247300043, true, new cj2() { // from class: zm0
                    /* JADX WARN: Type inference failed for: r2v2, types: [en0, java.lang.Object] */
                    @Override // defpackage.cj2
                    public final Object q(Object obj7, Object obj8, Object obj9, Object obj10) {
                        tu0 tu0Var = (tu0) obj9;
                        ((Integer) obj10).getClass();
                        ((gn) obj7).getClass();
                        ((l34) obj8).getClass();
                        pn0 pn0Var2 = pn0.this;
                        k24 v = l.v((y36) pn0Var2.k.getValue(), new Object(), tu0Var, 0);
                        s72 s72Var = o76.c;
                        gn0 gn0Var = (gn0) v.getValue();
                        sk2 sk2Var = (sk2) tu0Var;
                        boolean h = sk2Var.h(pn0Var2);
                        Object L = sk2Var.L();
                        sn1 sn1Var = su0.a;
                        if (h || L == sn1Var) {
                            L = new an0(pn0Var2, 0);
                            sk2Var.h0(L);
                        }
                        mi2 mi2Var = (mi2) L;
                        boolean h2 = sk2Var.h(pn0Var2);
                        Object L2 = sk2Var.L();
                        if (h2 || L2 == sn1Var) {
                            L2 = new z(1, pn0Var2, pn0.class, "addNewCheat", "addNewCheat(Lme/magnum/melonds/ui/cheats/model/CheatSubmissionForm;)V", 0, 0, 3);
                            sk2Var.h0(L2);
                        }
                        mi2 mi2Var2 = (mi2) ((lj2) L2);
                        boolean h3 = sk2Var.h(pn0Var2);
                        Object L3 = sk2Var.L();
                        if (h3 || L3 == sn1Var) {
                            h4 h4Var = new h4(2, pn0Var2, pn0.class, "updateCheat", "updateCheat(Lme/magnum/melonds/domain/model/Cheat;Lme/magnum/melonds/ui/cheats/model/CheatSubmissionForm;)V", 0, 0, 1);
                            sk2Var.h0(h4Var);
                            L3 = h4Var;
                        }
                        aj2 aj2Var = (aj2) ((lj2) L3);
                        o31 o31Var2 = o31Var;
                        boolean h4 = sk2Var.h(o31Var2);
                        Resources resources2 = resources;
                        boolean h5 = h4 | sk2Var.h(resources2) | sk2Var.h(pn0Var2);
                        Object L4 = sk2Var.L();
                        if (h5 || L4 == sn1Var) {
                            qm qmVar = new qm(o31Var2, pn0Var2, r96Var, resources2, 2);
                            sk2Var.h0(qmVar);
                            L4 = qmVar;
                        }
                        f34.b(s72Var, ih4Var, gn0Var, mi2Var, mi2Var2, aj2Var, (mi2) L4, sk2Var, 6);
                        return o27.a;
                    }
                }));
                nl2.E(h44Var, q75.a(nm0.class), qp1Var, new et0(692837354, true, new cj2() { // from class: ym0
                    /* JADX WARN: Type inference failed for: r0v18, types: [en0, java.lang.Object] */
                    /* JADX WARN: Type inference failed for: r0v3, types: [en0, java.lang.Object] */
                    /* JADX WARN: Type inference failed for: r0v9, types: [en0, java.lang.Object] */
                    @Override // defpackage.cj2
                    public final Object q(Object obj7, Object obj8, Object obj9, Object obj10) {
                        int i3 = r3;
                        o27 o27Var2 = o27.a;
                        sn1 sn1Var = su0.a;
                        pn0 pn0Var2 = pn0Var;
                        gn gnVar = (gn) obj7;
                        switch (i3) {
                            case 0:
                                tu0 tu0Var = (tu0) obj9;
                                ((Integer) obj10).getClass();
                                gnVar.getClass();
                                ((l34) obj8).getClass();
                                k24 v = l.v((y36) pn0Var2.i.getValue(), new Object(), tu0Var, 0);
                                s72 s72Var = o76.c;
                                gn0 gn0Var = (gn0) v.getValue();
                                sk2 sk2Var = (sk2) tu0Var;
                                boolean h = sk2Var.h(pn0Var2);
                                Object L = sk2Var.L();
                                if (h || L == sn1Var) {
                                    L = new an0(pn0Var2, 4);
                                    sk2Var.h0(L);
                                }
                                hk2.a(s72Var, ih4Var, gn0Var, (mi2) L, sk2Var, 6);
                                return o27Var2;
                            case 1:
                                tu0 tu0Var2 = (tu0) obj9;
                                ((Integer) obj10).getClass();
                                gnVar.getClass();
                                ((l34) obj8).getClass();
                                k24 v2 = l.v((y36) pn0Var2.j.getValue(), new Object(), tu0Var2, 0);
                                s72 s72Var2 = o76.c;
                                gn0 gn0Var2 = (gn0) v2.getValue();
                                sk2 sk2Var2 = (sk2) tu0Var2;
                                boolean h2 = sk2Var2.h(pn0Var2);
                                Object L2 = sk2Var2.L();
                                if (h2 || L2 == sn1Var) {
                                    L2 = new an0(pn0Var2, 1);
                                    sk2Var2.h0(L2);
                                }
                                mi2 mi2Var = (mi2) L2;
                                boolean h3 = sk2Var2.h(pn0Var2);
                                Object L3 = sk2Var2.L();
                                if (h3 || L3 == sn1Var) {
                                    L3 = new an0(pn0Var2, 2);
                                    sk2Var2.h0(L3);
                                }
                                dt3.y(s72Var2, ih4Var, gn0Var2, mi2Var, (mi2) L3, sk2Var2, 6);
                                return o27Var2;
                            default:
                                tu0 tu0Var3 = (tu0) obj9;
                                ((Integer) obj10).getClass();
                                gnVar.getClass();
                                ((l34) obj8).getClass();
                                k24 v3 = l.v((y36) pn0Var2.l.getValue(), new Object(), tu0Var3, 0);
                                s72 s72Var3 = o76.c;
                                gn0 gn0Var3 = (gn0) v3.getValue();
                                sk2 sk2Var3 = (sk2) tu0Var3;
                                boolean h4 = sk2Var3.h(pn0Var2);
                                Object L4 = sk2Var3.L();
                                if (h4 || L4 == sn1Var) {
                                    L4 = new an0(pn0Var2, 3);
                                    sk2Var3.h0(L4);
                                }
                                dt3.v(s72Var3, ih4Var, gn0Var3, (mi2) L4, sk2Var3, 6);
                                return o27Var2;
                        }
                    }
                }));
                return o27Var;
            case 5:
                List list2 = (List) obj6;
                ek3 ek3Var2 = (ek3) obj;
                ek3Var2.getClass();
                ek3Var2.b0(list2.size(), new s5(9, new nl0(17), list2), new k5(5, list2), new et0(802480018, true, new l61(list2, (mi2) obj2, (aj2) obj5, (aj2) obj4, (mi2) obj3)));
                return o27Var;
            case ig7.b /* 6 */:
                h04 h04Var = (h04) obj6;
                n75 n75Var = (n75) obj5;
                k75 k75Var = (k75) obj4;
                ax5 ax5Var = (ax5) obj3;
                j75 j75Var = (j75) obj2;
                float floatValue = ((Float) obj).floatValue();
                d04 g = h04.g(h04Var.g);
                if (g != null) {
                    k91 k91Var = h04Var.e;
                    long j = g.b;
                    long j2 = g.a;
                    ((s77) k91Var.A).a(Float.intBitsToFloat((int) (j2 >> 32)), j);
                    ((s77) k91Var.B).a(Float.intBitsToFloat((int) (j2 & 4294967295L)), j);
                    d04 a2 = ((d04) n75Var.A).a(g);
                    n75Var.A = a2;
                    k75Var.A = ax5Var.i(ax5Var.e(a2.a));
                    j75Var.A = !ve2.i(i - floatValue);
                }
                if (g != null) {
                    z = true;
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 7:
                ArrayList arrayList2 = (ArrayList) obj5;
                l75 l75Var = (l75) obj4;
                s34 s34Var = (s34) obj3;
                Bundle bundle = (Bundle) obj2;
                l34 l34Var = (l34) obj;
                l34Var.getClass();
                ((j75) obj6).A = true;
                int indexOf = arrayList2.indexOf(l34Var);
                if (indexOf != -1) {
                    int i3 = indexOf + 1;
                    list = arrayList2.subList(l75Var.A, i3);
                    l75Var.A = i3;
                } else {
                    list = pp1.A;
                }
                s34Var.a(l34Var.B, bundle, l34Var, list);
                return o27Var;
            case 8:
                kl4 kl4Var = (kl4) obj6;
                k24 k24Var = (k24) obj3;
                ph3 ph3Var = (ph3) obj;
                ph3Var.getClass();
                ph3.a0(ph3Var, "resume", null, new et0(1050778895, true, new l4(8, (ki2) obj4, (wc2) obj5)), 6);
                List list3 = kl4Var.a;
                ph3Var.b0(list3.size(), new s5(17, new n44(14), list3), new k5(12, list3), new et0(-1117249557, true, new t5(list3, kl4Var, (mi2) obj2, k24Var, 4)));
                return o27Var;
            default:
                pb4 pb4Var = (pb4) obj5;
                oq6 oq6Var = (oq6) obj4;
                hm3 hm3Var2 = (hm3) obj3;
                mb6 mb6Var = (mb6) obj2;
                xf3 xf3Var = (xf3) obj;
                xf3Var.a();
                rh0 rh0Var = xf3Var.A;
                float h = ((s41) obj6).c.h();
                if (h != RecyclerView.A1) {
                    long j3 = oq6Var.b;
                    int i4 = vr6.c;
                    int r = pb4Var.r((int) (j3 >> 32));
                    mr6 d = hm3Var2.d();
                    if (d != null) {
                        y55Var = d.a.c(r);
                    } else {
                        y55Var = new y55(RecyclerView.A1, RecyclerView.A1, RecyclerView.A1, RecyclerView.A1);
                    }
                    float floor = (float) Math.floor(xf3Var.C(2.0f));
                    if (floor < 1.0f) {
                        floor = 1.0f;
                    }
                    float f = floor / 2.0f;
                    float f2 = y55Var.a + f;
                    float intBitsToFloat = Float.intBitsToFloat((int) (rh0Var.d() >> 32)) - f;
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
                    long floatToRawIntBits = (Float.floatToRawIntBits(rint) << 32) | (Float.floatToRawIntBits(y55Var.b) & 4294967295L);
                    long floatToRawIntBits2 = (Float.floatToRawIntBits(rint) << 32) | (Float.floatToRawIntBits(y55Var.d) & 4294967295L);
                    oh0 oh0Var = rh0Var.A.c;
                    oi oiVar = rh0Var.R;
                    if (oiVar == null) {
                        oiVar = dk7.e();
                        oiVar.t(1);
                        rh0Var.R = oiVar;
                    }
                    Paint paint = (Paint) oiVar.L;
                    mb6Var.a(h, rh0Var.d(), oiVar);
                    if (!b53.x((b30) oiVar.X, null)) {
                        oiVar.m(null);
                    }
                    if (oiVar.B != 3) {
                        oiVar.k(3);
                    }
                    if (paint.getStrokeWidth() != floor) {
                        oiVar.s(floor);
                    }
                    if (paint.getStrokeMiter() != 4.0f) {
                        paint.setStrokeMiter(4.0f);
                    }
                    if (oiVar.g() != 0) {
                        oiVar.q(0);
                    }
                    if (oiVar.h() != 0) {
                        oiVar.r(0);
                    }
                    if (!b53.x(null, null)) {
                        oiVar.o(null);
                    }
                    if (!paint.isFilterBitmap()) {
                        oiVar.n(1);
                    }
                    oh0Var.n(floatToRawIntBits, floatToRawIntBits2, oiVar);
                }
                return o27Var;
        }
    }

    public /* synthetic */ e5(ql3 ql3Var, j15 j15Var, ki2 ki2Var, mi2 mi2Var, ki2 ki2Var2) {
        this.A = 0;
        this.B = ql3Var;
        this.L = j15Var;
        this.R = ki2Var;
        this.Y = mi2Var;
        this.X = ki2Var2;
    }

    public /* synthetic */ e5(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.A = i;
        this.B = obj;
        this.L = obj2;
        this.R = obj3;
        this.X = obj4;
        this.Y = obj5;
    }

    public /* synthetic */ e5(List list, mi2 mi2Var, aj2 aj2Var, aj2 aj2Var2, mi2 mi2Var2) {
        this.A = 5;
        this.B = list;
        this.Y = mi2Var;
        this.L = aj2Var;
        this.R = aj2Var2;
        this.X = mi2Var2;
    }
}
