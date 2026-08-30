package ai;

import android.content.res.Resources;
import android.os.Bundle;
import g2.e7;
import g2.f7;
import g2.g7;
import g2.l0;
import g2.m0;
import g2.n0;
import g2.y4;
import h1.g1;
import h1.n1;
import h1.n2;
import h1.x2;
import java.util.ArrayList;
import java.util.List;
import l1.r1;
import me.magnum.melonds.R;
import me.magnum.melonds.common.camera.DSiCameraSource;
import me.magnum.melonds.domain.model.Cheat;
import n2.d1;
import n2.f1;
import n2.s2;
import y3.o1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class x0 implements mc.l {
    public final /* synthetic */ int A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object R;
    public final /* synthetic */ Object X;

    public /* synthetic */ x0(ArrayList arrayList, nc.r rVar, List list, int i2, o1.n nVar) {
        this.A = 8;
        this.L = arrayList;
        this.R = rVar;
        this.X = list;
        this.B = nVar;
    }

    /* JADX WARN: Type inference failed for: r6v21, types: [nc.t, java.lang.Object] */
    @Override // mc.l
    public final Object k(Object obj) {
        long j2;
        int i2;
        long j10;
        switch (this.A) {
            case 0:
                zh.x xVar = (zh.x) this.L;
                zh.c cVar = (zh.c) this.R;
                d1 d1Var = (d1) this.X;
                mc.l lVar = (mc.l) this.B;
                n1.i iVar = (n1.i) obj;
                iVar.getClass();
                if (xVar.f15142a.size() > 1) {
                    n1.i.p(iVar, "sets", new v2.c(-1129931104, true, new v0(0, xVar, d1Var)), 1);
                }
                n1.i.p(iVar, "header", new v2.c(-100336763, true, new q0(1, cVar)), 1);
                List<zh.b> list = cVar.f15115f;
                ArrayList arrayList = new ArrayList();
                for (zh.b bVar : list) {
                    zb.l.L(bVar.f15109b, arrayList);
                }
                iVar.q(arrayList.size(), null, new b1(0, new a7.a(8), arrayList), new v2.c(802480018, true, new lg.n(arrayList, lVar, 4)));
                return yb.y.f14813a;
            case DSiCameraSource.FrontCamera /* 1 */:
                d1.c cVar2 = (d1.c) this.L;
                d1.k kVar = (d1.k) this.R;
                mc.l lVar2 = (mc.l) this.B;
                nc.p pVar = (nc.p) this.X;
                d1.i iVar2 = (d1.i) obj;
                d1.k kVar2 = cVar2.f3525c;
                d1.d.s(iVar2, kVar2);
                f1 f1Var = iVar2.f3590e;
                Object a10 = d1.c.a(cVar2, f1Var.getValue());
                if (!nc.k.a(a10, f1Var.getValue())) {
                    kVar2.B.setValue(a10);
                    kVar.B.setValue(a10);
                    if (lVar2 != null) {
                        lVar2.k(cVar2);
                    }
                    iVar2.a();
                    pVar.A = true;
                } else if (lVar2 != null) {
                    lVar2.k(cVar2);
                }
                return yb.y.f14813a;
            case 2:
                d1.e0 e0Var = (d1.e0) this.R;
                nc.q qVar = (nc.q) this.X;
                zc.u uVar = (zc.u) this.B;
                long longValue = ((Long) obj).longValue();
                s2 s2Var = (s2) ((n2.w0) this.L).getValue();
                if (s2Var != null) {
                    j2 = ((Number) s2Var.getValue()).longValue();
                } else {
                    j2 = longValue;
                }
                long j11 = e0Var.f3558c;
                p2.b bVar2 = e0Var.f3556a;
                int i10 = (j11 > Long.MIN_VALUE ? 1 : (j11 == Long.MIN_VALUE ? 0 : -1));
                if (i10 == 0 || qVar.A != d1.d.n(uVar.v())) {
                    e0Var.f3558c = longValue;
                    Object[] objArr = bVar2.A;
                    int i11 = bVar2.L;
                    for (int i12 = 0; i12 < i11; i12++) {
                        ((d1.c0) objArr[i12]).Z = true;
                    }
                    qVar.A = d1.d.n(uVar.v());
                }
                float f8 = qVar.A;
                if (f8 == 0.0f) {
                    Object[] objArr2 = bVar2.A;
                    int i13 = bVar2.L;
                    for (int i14 = 0; i14 < i13; i14++) {
                        d1.c0 c0Var = (d1.c0) objArr2[i14];
                        c0Var.R.setValue(c0Var.X.f3577c);
                        c0Var.Z = true;
                    }
                } else {
                    long j12 = ((float) (j2 - e0Var.f3558c)) / f8;
                    Object[] objArr3 = bVar2.A;
                    int i15 = bVar2.L;
                    boolean z10 = true;
                    for (int i16 = 0; i16 < i15; i16++) {
                        d1.c0 c0Var2 = (d1.c0) objArr3[i16];
                        if (!c0Var2.Y) {
                            c0Var2.f3535c0.f3557b.setValue(Boolean.FALSE);
                            if (c0Var2.Z) {
                                c0Var2.Z = false;
                                c0Var2.f3534b0 = j12;
                            }
                            long j13 = j12 - c0Var2.f3534b0;
                            c0Var2.R.setValue(c0Var2.X.b(j13));
                            c0Var2.Y = c0Var2.X.g(j13);
                        }
                        if (!c0Var2.Y) {
                            z10 = false;
                        }
                    }
                    e0Var.f3559d.setValue(Boolean.valueOf(!z10));
                }
                return yb.y.f14813a;
            case 3:
                a7.i iVar3 = (a7.i) obj;
                iVar3.getClass();
                ((nc.p) this.L).A = true;
                ((d7.f) this.R).a((a7.x) this.X, (Bundle) this.B, iVar3, zb.q.A);
                return yb.y.f14813a;
            case 4:
                nc.q qVar2 = (nc.q) this.L;
                d0.b1 b1Var = (d0.b1) this.R;
                n2 n2Var = (n2) this.X;
                d2.a aVar = (d2.a) this.B;
                d1.i iVar4 = (d1.i) obj;
                float floatValue = ((Number) iVar4.f3590e.getValue()).floatValue() - qVar2.A;
                if (!g1.a(floatValue)) {
                    if (!g1.a(floatValue - b1Var.c(n2Var, floatValue))) {
                        iVar4.a();
                        return yb.y.f14813a;
                    }
                    qVar2.A += floatValue;
                }
                if (((Boolean) aVar.k(Float.valueOf(qVar2.A))).booleanValue()) {
                    iVar4.a();
                }
                return yb.y.f14813a;
            case l1.c.f8511g /* 5 */:
                List list2 = (List) this.L;
                n1.i iVar5 = (n1.i) obj;
                iVar5.getClass();
                iVar5.q(list2.size(), new b1(1, new l4.b0(18, (byte) 0), list2), new j(2, list2), new v2.c(2039820996, true, new lg.b(list2, (mc.l) this.B, (n2.w0) this.R, (mc.l) this.X)));
                return yb.y.f14813a;
            case l1.c.f8509e /* 6 */:
                jg.u uVar2 = (jg.u) this.R;
                Cheat cheat = (Cheat) obj;
                cheat.getClass();
                zc.x.v((zc.u) this.L, null, null, new a9.d((y4) this.X, (Resources) this.B, cheat, uVar2, (cc.c) null, 19), 3);
                uVar2.getClass();
                fg.a aVar2 = (fg.a) uVar2.f7877c.a("selected_folder");
                if (aVar2 != null) {
                    zc.x.v(androidx.lifecycle.s0.h(uVar2), null, null, new x2(uVar2, cheat, aVar2, null, 5), 3);
                }
                return yb.y.f14813a;
            case 7:
                List list3 = (List) this.L;
                zh.c cVar3 = (zh.c) this.R;
                d1 d1Var2 = (d1) this.X;
                mc.l lVar3 = (mc.l) this.B;
                n1.i iVar6 = (n1.i) obj;
                iVar6.getClass();
                if (list3.size() > 1) {
                    n1.i.p(iVar6, null, new v2.c(781522073, true, new v0(6, list3, d1Var2)), 3);
                }
                final int i17 = 0;
                for (Object obj2 : cVar3.f15115f) {
                    int i18 = i17 + 1;
                    if (i17 >= 0) {
                        final zh.b bVar3 = (zh.b) obj2;
                        n1.i.p(iVar6, "bucket-header", new v2.c(-1508150631, true, new mc.q() { // from class: mh.p
                            @Override // mc.q
                            public final Object i(Object obj3, Object obj4, Object obj5) {
                                boolean z11;
                                float f10;
                                int i19;
                                int i20;
                                n2.m mVar = (n2.m) obj4;
                                int intValue = ((Integer) obj5).intValue();
                                ((n1.c) obj3).getClass();
                                if ((intValue & 17) != 16) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                n2.r rVar = (n2.r) mVar;
                                if (rVar.O(intValue & 1, z11)) {
                                    float f11 = 16;
                                    if (i17 == 0) {
                                        f10 = 0;
                                    } else {
                                        f10 = f11;
                                    }
                                    b3.m mVar2 = b3.m.f1770a;
                                    b3.p b10 = r1.b(l1.c.w(mVar2, f11, f10, f11, 4), 1.0f);
                                    switch (w.f9703a[bVar3.f15108a.ordinal()]) {
                                        case DSiCameraSource.FrontCamera /* 1 */:
                                            i19 = -1377717203;
                                            i20 = R.string.retro_achievements_pending_unlocks;
                                            break;
                                        case 2:
                                            i19 = -1377713361;
                                            i20 = R.string.retro_achievements_active_challenges;
                                            break;
                                        case 3:
                                            i19 = -1377709457;
                                            i20 = R.string.retro_achievements_recently_unlokced;
                                            break;
                                        case 4:
                                            i19 = -1377705718;
                                            i20 = R.string.retro_achievements_almost_there;
                                            break;
                                        case l1.c.f8511g /* 5 */:
                                            i19 = -1377702300;
                                            i20 = R.string.retro_achievements_locked;
                                            break;
                                        case l1.c.f8509e /* 6 */:
                                            i19 = -1377699002;
                                            i20 = R.string.retro_achievements_unlocked;
                                            break;
                                        default:
                                            throw w.d.i(rVar, -1377719053, false);
                                    }
                                    e7.b(kc.a.h(rVar, i19, i20, rVar, false), b10, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, ((f7) rVar.j(g7.f5161b)).f5147f, rVar, 0, 0, 65532);
                                    n0.c(l1.c.x(mVar2, f11, 0.0f, f11, 8, 2), ((l0) rVar.j(m0.f5257a)).f(), 0.0f, 0.0f, rVar, 6, 12);
                                } else {
                                    rVar.R();
                                }
                                return yb.y.f14813a;
                            }
                        }), 1);
                        List list4 = bVar3.f15109b;
                        iVar6.q(list4.size(), null, new b1(3, new l4.c0(18), list4), new v2.c(802480018, true, new lg.n(list4, lVar3, 3)));
                        i17 = i18;
                    } else {
                        p7.t.F();
                        throw null;
                    }
                }
                return yb.y.f14813a;
            case 8:
                List list5 = (List) this.L;
                nc.r rVar = (nc.r) this.R;
                List list6 = (List) this.X;
                o1.n nVar = (o1.n) this.B;
                p1.b1 b1Var2 = (p1.b1) obj;
                o1 o1Var = b1Var2.f11191e;
                if (o1Var != null) {
                    i2 = o1Var.a();
                } else {
                    i2 = 0;
                }
                int i19 = 0;
                for (int i20 = 0; i20 < i2; i20++) {
                    n1 n1Var = nVar.f10557q;
                    n1 n1Var2 = n1.Vertical;
                    o1 o1Var2 = b1Var2.f11191e;
                    long j14 = 0;
                    if (n1Var == n1Var2) {
                        if (o1Var2 != null) {
                            j14 = o1Var2.c(i20);
                        }
                        j10 = 4294967295L & j14;
                    } else {
                        if (o1Var2 != null) {
                            j14 = o1Var2.c(i20);
                        }
                        j10 = j14 >> 32;
                    }
                    i19 += (int) j10;
                }
                if (list5 != null) {
                    list5.add(Integer.valueOf(i19));
                }
                if (rVar.A != list6.size()) {
                    rVar.A++;
                }
                return yb.y.f14813a;
            case l1.c.f8508d /* 9 */:
                List list7 = (List) this.L;
                n1.i iVar7 = (n1.i) obj;
                iVar7.getClass();
                iVar7.q(list7.size(), new b1(8, new od.x(10), list7), new j(7, list7), new v2.c(802480018, true, new lg.b(list7, (oe.s) this.R, (mc.l) this.B, (mc.l) this.X)));
                return yb.y.f14813a;
            case l1.c.f8510f /* 10 */:
                u1.p0 p0Var = (u1.p0) this.L;
                q4.y yVar = (q4.y) this.R;
                q4.x xVar2 = (q4.x) this.X;
                q4.j jVar = (q4.j) this.B;
                n2.h0 h0Var = (n2.h0) obj;
                if (p0Var.b()) {
                    p1.a0 a0Var = p0Var.f13382d;
                    u1.s sVar = p0Var.f13399v;
                    u1.s sVar2 = p0Var.f13400w;
                    ?? obj3 = new Object();
                    c0 c0Var3 = new c0(a0Var, sVar, (Object) obj3, 15);
                    q4.s sVar3 = yVar.f12279a;
                    sVar3.a(xVar2, jVar, c0Var3, sVar2);
                    q4.d0 d0Var = new q4.d0(yVar, sVar3);
                    yVar.f12280b.set(d0Var);
                    obj3.A = d0Var;
                    p0Var.f13383e = d0Var;
                }
                return new Object();
            default:
                List list8 = (List) this.L;
                n1.i iVar8 = (n1.i) obj;
                iVar8.getClass();
                iVar8.q(list8.size(), null, new j(11, list8), new v2.c(802480018, true, new lg.b(list8, (mc.l) this.B, (mc.p) this.R, (l1.d1) this.X)));
                return yb.y.f14813a;
        }
    }

    public /* synthetic */ x0(Object obj, Object obj2, mc.l lVar, Object obj3, int i2) {
        this.A = i2;
        this.L = obj;
        this.R = obj2;
        this.B = lVar;
        this.X = obj3;
    }

    public /* synthetic */ x0(Object obj, Object obj2, Object obj3, Object obj4, int i2) {
        this.A = i2;
        this.L = obj;
        this.R = obj2;
        this.X = obj3;
        this.B = obj4;
    }

    public /* synthetic */ x0(List list, mc.l lVar, Object obj, Object obj2, int i2) {
        this.A = i2;
        this.L = list;
        this.B = lVar;
        this.R = obj;
        this.X = obj2;
    }
}
