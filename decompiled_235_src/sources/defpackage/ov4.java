package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import com.stormds.emulator.R;
import me.magnum.melonds.domain.model.Cheat;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ov4  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ov4 implements fo2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ Object B;

    public /* synthetic */ ov4(hb4 hb4Var, gb4 gb4Var) {
        this.A = 9;
        this.B = hb4Var;
    }

    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v11 */
    /* JADX WARN: Type inference failed for: r15v12, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r15v13 */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r15v8 */
    /* JADX WARN: Type inference failed for: r15v9 */
    @Override // defpackage.fo2
    public final Object e(Object obj, Object obj2, Object obj3) {
        boolean z;
        boolean z2;
        ?? r15;
        int i;
        int i2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        c26 c26Var;
        int i3;
        int i4;
        int i5 = this.A;
        int i6 = 4;
        eu euVar = ju.c;
        vs0 vs0Var = ox0.a;
        jg7 jg7Var = jg7.a;
        boolean z7 = false;
        Object obj4 = this.B;
        switch (i5) {
            case 0:
                g53 g53Var = (g53) obj4;
                px0 px0Var = (px0) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((String) obj).getClass();
                if ((intValue & 17) != 16) {
                    z = true;
                } else {
                    z = false;
                }
                xq2 xq2Var = (xq2) px0Var;
                if (xq2Var.S(intValue & 1, z)) {
                    final e53 h = yh2.h(g53Var, RecyclerView.B1, -360.0f, ge7.G(ge7.Y(2000, 0, ir1.c, 2), ck5.Restart, 4), null, xq2Var, 4152, 8);
                    lc2 lc2Var = dj6.c;
                    boolean f = xq2Var.f(h);
                    Object P = xq2Var.P();
                    if (f || P == vs0Var) {
                        P = new qn2() { // from class: pv4
                            @Override // defpackage.qn2
                            public final Object g(Object obj5) {
                                int i7 = r2;
                                pp6 pp6Var = h;
                                switch (i7) {
                                    case 0:
                                        op5 op5Var = (op5) obj5;
                                        op5Var.getClass();
                                        op5Var.j(((Number) pp6Var.getValue()).floatValue());
                                        return jg7.a;
                                    default:
                                        return new i93(((qh1) obj5).r0(((om1) pp6Var.getValue()).A) << 32);
                                }
                            }
                        };
                        xq2Var.l0(P);
                    }
                    a74 G = hv.G(lc2Var, (qn2) P);
                    e33 e33Var = xk2.d;
                    if (e33Var == null) {
                        d33 d33Var = new d33("Filled.Sync", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i7 = el7.a;
                        cn6 cn6Var = new cn6(kt0.b);
                        ww2 ww2Var = new ww2(1, (byte) 0);
                        ww2Var.o(12.0f, 4.0f);
                        ww2Var.m(12.0f, 1.0f);
                        ww2Var.m(8.0f, 5.0f);
                        ww2Var.n(4.0f, 4.0f);
                        ww2Var.m(12.0f, 6.0f);
                        ww2Var.i(3.31f, RecyclerView.B1, 6.0f, 2.69f, 6.0f, 6.0f);
                        ww2Var.i(RecyclerView.B1, 1.01f, -0.25f, 1.97f, -0.7f, 2.8f);
                        ww2Var.n(1.46f, 1.46f);
                        ww2Var.h(19.54f, 15.03f, 20.0f, 13.57f, 20.0f, 12.0f);
                        ww2Var.i(RecyclerView.B1, -4.42f, -3.58f, -8.0f, -8.0f, -8.0f);
                        ww2Var.g();
                        ww2Var.o(12.0f, 18.0f);
                        ww2Var.i(-3.31f, RecyclerView.B1, -6.0f, -2.69f, -6.0f, -6.0f);
                        ww2Var.i(RecyclerView.B1, -1.01f, 0.25f, -1.97f, 0.7f, -2.8f);
                        ww2Var.m(5.24f, 7.74f);
                        ww2Var.h(4.46f, 8.97f, 4.0f, 10.43f, 4.0f, 12.0f);
                        ww2Var.i(RecyclerView.B1, 4.42f, 3.58f, 8.0f, 8.0f, 8.0f);
                        ww2Var.u(3.0f);
                        ww2Var.n(4.0f, -4.0f);
                        ww2Var.n(-4.0f, -4.0f);
                        ww2Var.u(3.0f);
                        ww2Var.g();
                        d33.a(d33Var, ww2Var.b, 0, cn6Var);
                        e33Var = d33Var.b();
                        xk2.d = e33Var;
                    }
                    i13.a(e33Var, null, G, ((ut0) xq2Var.j(vt0.a)).i(), xq2Var, 48, 0);
                } else {
                    xq2Var.V();
                }
                return jg7Var;
            case 1:
                h3 h3Var = (h3) obj4;
                px0 px0Var2 = (px0) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((lp3) obj).getClass();
                if ((intValue2 & 17) != 16) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                xq2 xq2Var2 = (xq2) px0Var2;
                if (xq2Var2.S(intValue2 & 1, z2)) {
                    switch (v5.c[h3Var.a.ordinal()]) {
                        case 1:
                            r15 = 0;
                            i = -1377717203;
                            i2 = R.string.retro_achievements_pending_unlocks;
                            break;
                        case 2:
                            r15 = 0;
                            i = -1377713361;
                            i2 = R.string.retro_achievements_active_challenges;
                            break;
                        case 3:
                            r15 = 0;
                            i = -1377709457;
                            i2 = R.string.retro_achievements_recently_unlokced;
                            break;
                        case 4:
                            r15 = 0;
                            i = -1377705818;
                            i2 = R.string.retro_achievements_unsynced;
                            break;
                        case 5:
                            r15 = 0;
                            i = -1377702358;
                            i2 = R.string.retro_achievements_almost_there;
                            break;
                        case 6:
                            r15 = 0;
                            i = -1377698940;
                            i2 = R.string.retro_achievements_locked;
                            break;
                        case 7:
                            r15 = 0;
                            i = -1377695543;
                            i2 = R.string.retro_achievements_unsupported;
                            break;
                        case 8:
                            r15 = 0;
                            i = -1377692024;
                            i2 = R.string.retro_achievements_unofficial;
                            break;
                        case 9:
                            r15 = 0;
                            i = -1377688602;
                            i2 = R.string.retro_achievements_unlocked;
                            break;
                        default:
                            throw xg6.f(xq2Var2, -1377718728, false);
                    }
                    nc1.c(i61.l(xq2Var2, i, i2, xq2Var2, r15), xq2Var2, r15);
                } else {
                    xq2Var2.V();
                }
                return jg7Var;
            case 2:
                l3 l3Var = (l3) obj4;
                px0 px0Var3 = (px0) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                ((m26) obj).getClass();
                if ((intValue3 & 17) != 16) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                xq2 xq2Var3 = (xq2) px0Var3;
                if (xq2Var3.S(intValue3 & 1, z3)) {
                    x37.b(l3Var.d, ge7.S(x64.a, 4.0f, RecyclerView.B1, RecyclerView.B1, RecyclerView.B1, 14), 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, ((xe7) xq2Var3.j(ye7.b)).i, xq2Var3, 48, 0, 65532);
                } else {
                    xq2Var3.V();
                }
                return jg7Var;
            case 3:
                return new m4(obj3, (v80) obj4, (v96) obj, 2);
            case 4:
                l61 l61Var = (l61) obj3;
                ((qn2) obj4).g((Throwable) obj);
                return jg7Var;
            case 5:
                e61 e61Var = (e61) obj4;
                int intValue4 = ((Integer) obj).intValue();
                int intValue5 = ((Integer) obj2).intValue();
                boolean booleanValue = ((Boolean) obj3).booleanValue();
                if (!booleanValue) {
                    intValue4 = e61Var.r0.i(intValue4);
                }
                if (!booleanValue) {
                    intValue5 = e61Var.r0.i(intValue5);
                }
                if (e61Var.p0) {
                    long j = e61Var.n0.b;
                    int i8 = k47.c;
                    if (intValue4 != ((int) (j >> 32)) || intValue5 != ((int) (j & 4294967295L))) {
                        if (Math.min(intValue4, intValue5) >= 0 && Math.max(intValue4, intValue5) <= e61Var.n0.a.B.length()) {
                            if (!booleanValue && intValue4 != intValue5) {
                                e61Var.s0.h(true);
                            } else {
                                p27 p27Var = e61Var.s0;
                                p27Var.t(false);
                                p27Var.q(hv2.None);
                            }
                            e61Var.o0.v.g(new c37(e61Var.n0.a, jx2.f(intValue4, intValue5), (k47) null));
                            z4 = true;
                            return Boolean.valueOf(z4);
                        }
                        p27 p27Var2 = e61Var.s0;
                        p27Var2.t(false);
                        p27Var2.q(hv2.None);
                    }
                }
                z4 = false;
                return Boolean.valueOf(z4);
            case 6:
                vy4 vy4Var = (vy4) obj;
                jk4 jk4Var = (jk4) obj3;
                ((cz3) obj4).B.a(((vy4) obj2).c, xd5.o0);
                return jg7Var;
            case 7:
                q3 q3Var = (q3) obj4;
                m26 m26Var = (m26) obj;
                px0 px0Var4 = (px0) obj2;
                int intValue6 = ((Integer) obj3).intValue();
                m26Var.getClass();
                if ((intValue6 & 6) == 0) {
                    if (!((xq2) px0Var4).f(m26Var)) {
                        i6 = 2;
                    }
                    intValue6 |= i6;
                }
                if ((intValue6 & 19) != 18) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                xq2 xq2Var4 = (xq2) px0Var4;
                if (xq2Var4.S(intValue6 & 1, z5)) {
                    Object P2 = xq2Var4.P();
                    if (P2 == vs0Var) {
                        P2 = np2.Y(Boolean.FALSE);
                        xq2Var4.l0(P2);
                    }
                    qa4 qa4Var = (qa4) P2;
                    String N = yh2.N(R.string.leaderboard_submission_info, new Object[]{q3Var.e, Long.valueOf(q3Var.g), Long.valueOf(q3Var.h)}, xq2Var4);
                    boolean h2 = xq2Var4.h(q3Var);
                    Object P3 = xq2Var4.P();
                    if (h2 || P3 == vs0Var) {
                        P3 = new xd1(q3Var, qa4Var, null, 25);
                        xq2Var4.l0(P3);
                    }
                    mb3.i(xq2Var4, (eo2) P3, jg7Var);
                    g04.e(m26Var, ((Boolean) qa4Var.getValue()).booleanValue(), null, null, null, null, n16.I(-496976326, new l4(7, q3Var, N), xq2Var4), xq2Var4, (intValue6 & 14) | 1572864);
                } else {
                    xq2Var4.V();
                }
                return jg7Var;
            case 8:
                r3 r3Var = (r3) obj4;
                px0 px0Var5 = (px0) obj2;
                int intValue7 = ((Integer) obj3).intValue();
                ((m26) obj).getClass();
                if ((intValue7 & 17) != 16) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                xq2 xq2Var5 = (xq2) px0Var5;
                if (xq2Var5.S(intValue7 & 1, z6)) {
                    a74 S = ge7.S(x64.a, 4.0f, RecyclerView.B1, RecyclerView.B1, RecyclerView.B1, 14);
                    yt0 a = wt0.a(euVar, d90.k0, xq2Var5, 0);
                    int hashCode = Long.hashCode(xq2Var5.T);
                    xv4 l = xq2Var5.l();
                    a74 E = l.E(xq2Var5, S);
                    jx0.i.getClass();
                    iy0 iy0Var = ix0.b;
                    xq2Var5.f0();
                    if (xq2Var5.S) {
                        xq2Var5.k(iy0Var);
                    } else {
                        xq2Var5.o0();
                    }
                    yh2.K(xq2Var5, ix0.f, a);
                    yh2.K(xq2Var5, ix0.e, l);
                    yh2.K(xq2Var5, ix0.g, Integer.valueOf(hashCode));
                    yh2.F(xq2Var5, ix0.h);
                    yh2.K(xq2Var5, ix0.d, E);
                    String O = yh2.O(xq2Var5, R.string.leaderboard_submission_pending);
                    nq6 nq6Var = ye7.b;
                    x37.b(O, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 1, 0, null, s47.a(((xe7) xq2Var5.j(nq6Var)).l, 0L, 0L, oj2.e0, null, 0L, 0L, null, 16777211), xq2Var5, 0, 3072, 57342);
                    x37.b(r3Var.b, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 1, 0, null, ((xe7) xq2Var5.j(nq6Var)).l, xq2Var5, 0, 3072, 57342);
                    String str = r3Var.d;
                    if (qs6.v0(str)) {
                        str = "--";
                    }
                    x37.b(str, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 1, 0, null, ((xe7) xq2Var5.j(nq6Var)).l, xq2Var5, 0, 3072, 57342);
                    xq2Var5.p(true);
                } else {
                    xq2Var5.V();
                }
                return jg7Var;
            case 9:
                hb4 hb4Var = (hb4) obj4;
                Throwable th = (Throwable) obj;
                jg7 jg7Var2 = (jg7) obj2;
                l61 l61Var2 = (l61) obj3;
                hb4.f0.set(hb4Var, null);
                hb4Var.h(null);
                return jg7Var;
            case 10:
                k3 k3Var = (k3) obj4;
                px0 px0Var6 = (px0) obj2;
                ((Integer) obj3).getClass();
                ((jo) obj).getClass();
                a74 S2 = ge7.S(x64.a, 4.0f, RecyclerView.B1, RecyclerView.B1, RecyclerView.B1, 14);
                yt0 a2 = wt0.a(euVar, d90.k0, px0Var6, 0);
                xq2 xq2Var6 = (xq2) px0Var6;
                int hashCode2 = Long.hashCode(xq2Var6.T);
                xv4 l2 = xq2Var6.l();
                a74 E2 = l.E(px0Var6, S2);
                jx0.i.getClass();
                iy0 iy0Var2 = ix0.b;
                xq2 xq2Var7 = (xq2) px0Var6;
                xq2Var7.f0();
                if (xq2Var7.S) {
                    xq2Var7.k(iy0Var2);
                } else {
                    xq2Var7.o0();
                }
                yh2.K(px0Var6, ix0.f, a2);
                yh2.K(px0Var6, ix0.e, l2);
                yh2.K(px0Var6, ix0.g, Integer.valueOf(hashCode2));
                yh2.F(px0Var6, ix0.h);
                yh2.K(px0Var6, ix0.d, E2);
                String O2 = yh2.O(px0Var6, R.string.challenge_started);
                nq6 nq6Var2 = ye7.b;
                x37.b(O2, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, s47.a(((xe7) xq2Var7.j(nq6Var2)).l, 0L, 0L, oj2.e0, null, 0L, 0L, null, 16777211), px0Var6, 0, 0, 65534);
                x37.b(k3Var.a.g, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, ((xe7) xq2Var7.j(nq6Var2)).l, px0Var6, 0, 0, 65534);
                xq2Var7.p(true);
                return jg7Var;
            case 11:
                Cheat cheat = (Cheat) obj4;
                px0 px0Var7 = (px0) obj2;
                ((Integer) obj3).getClass();
                ((jo) obj).getClass();
                x64 x64Var = x64.a;
                a74 S3 = ge7.S(x64Var, RecyclerView.B1, 10.0f, RecyclerView.B1, RecyclerView.B1, 13);
                yt0 a3 = wt0.a(euVar, d90.k0, px0Var7, 0);
                xq2 xq2Var8 = (xq2) px0Var7;
                int hashCode3 = Long.hashCode(xq2Var8.T);
                xv4 l3 = xq2Var8.l();
                a74 E3 = l.E(px0Var7, S3);
                jx0.i.getClass();
                iy0 iy0Var3 = ix0.b;
                xq2 xq2Var9 = (xq2) px0Var7;
                xq2Var9.f0();
                if (xq2Var9.S) {
                    xq2Var9.k(iy0Var3);
                } else {
                    xq2Var9.o0();
                }
                pn pnVar = ix0.f;
                yh2.K(px0Var7, pnVar, a3);
                pn pnVar2 = ix0.e;
                yh2.K(px0Var7, pnVar2, l3);
                Integer valueOf = Integer.valueOf(hashCode3);
                pn pnVar3 = ix0.g;
                yh2.K(px0Var7, pnVar3, valueOf);
                ne neVar = ix0.h;
                yh2.F(px0Var7, neVar);
                pn pnVar4 = ix0.d;
                yh2.K(px0Var7, pnVar4, E3);
                a74 O3 = ge7.O(vy7.L(u24.g(dj6.c(x64Var, 1.0f), z16.b(8.0f)), kt0.c(0.35f, kt0.b), u24.m), 10.0f);
                e34 d = h70.d(d90.L, false);
                int hashCode4 = Long.hashCode(xq2Var9.T);
                xv4 l4 = xq2Var9.l();
                a74 E4 = l.E(px0Var7, O3);
                xq2Var9.f0();
                if (xq2Var9.S) {
                    xq2Var9.k(iy0Var3);
                } else {
                    xq2Var9.o0();
                }
                yh2.K(px0Var7, pnVar, d);
                yh2.K(px0Var7, pnVar2, l4);
                yh2.K(px0Var7, pnVar3, Integer.valueOf(hashCode4));
                yh2.F(px0Var7, neVar);
                yh2.K(px0Var7, pnVar4, E4);
                x37.b(cheat.getCode(), null, hv.c(4283096704L), hi2.D(9.5d), null, li2.L, 0L, null, hi2.E(14), 0, false, 0, 0, null, null, px0Var7, 3456, 6, 129970);
                xq2Var9.p(true);
                xq2Var9.p(true);
                return jg7Var;
            case 12:
                eb ebVar = (eb) obj4;
                int intValue8 = ((Integer) obj).intValue();
                String str2 = (String) obj2;
                fd4 fd4Var = (fd4) obj3;
                str2.getClass();
                fd4Var.getClass();
                if (!(fd4Var instanceof dt0) && !((gg3) ebVar.B).e().k(intValue8)) {
                    c26Var = c26.PATH;
                } else {
                    c26Var = c26.QUERY;
                }
                int i9 = d26.a[c26Var.ordinal()];
                if (i9 != 1) {
                    if (i9 == 2) {
                        ebVar.i(str2, "{" + str2 + '}');
                    } else {
                        i.d();
                        return null;
                    }
                } else {
                    ebVar.R = ((String) ebVar.R) + '/' + i61.k('}', "{", str2);
                }
                return jg7Var;
            case 13:
                Throwable th2 = (Throwable) obj;
                jg7 jg7Var3 = (jg7) obj2;
                l61 l61Var3 = (l61) obj3;
                ((kb6) obj4).c();
                return jg7Var;
            case 14:
                u3 u3Var = (u3) obj4;
                px0 px0Var8 = (px0) obj2;
                ((Integer) obj3).getClass();
                ((jo) obj).getClass();
                a74 S4 = ge7.S(x64.a, 4.0f, RecyclerView.B1, RecyclerView.B1, RecyclerView.B1, 14);
                yt0 a4 = wt0.a(euVar, d90.k0, px0Var8, 0);
                xq2 xq2Var10 = (xq2) px0Var8;
                int hashCode5 = Long.hashCode(xq2Var10.T);
                xv4 l5 = xq2Var10.l();
                a74 E5 = l.E(px0Var8, S4);
                jx0.i.getClass();
                iy0 iy0Var4 = ix0.b;
                xq2 xq2Var11 = (xq2) px0Var8;
                xq2Var11.f0();
                if (xq2Var11.S) {
                    xq2Var11.k(iy0Var4);
                } else {
                    xq2Var11.o0();
                }
                yh2.K(px0Var8, ix0.f, a4);
                yh2.K(px0Var8, ix0.e, l5);
                yh2.K(px0Var8, ix0.g, Integer.valueOf(hashCode5));
                yh2.F(px0Var8, ix0.h);
                yh2.K(px0Var8, ix0.d, E5);
                nb3 nb3Var = u3Var.a;
                if (nb3Var instanceof s3) {
                    i3 = R.string.achievement_submission_failed;
                } else if (nb3Var instanceof t3) {
                    i3 = R.string.leaderboard_submission_failed;
                } else {
                    i.d();
                    return null;
                }
                String O4 = yh2.O(px0Var8, i3);
                nq6 nq6Var3 = ye7.b;
                x37.b(O4, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, s47.a(((xe7) xq2Var11.j(nq6Var3)).l, 0L, 0L, oj2.e0, null, 0L, 0L, null, 16777211), px0Var8, 0, 0, 65534);
                if (u3Var.b) {
                    i4 = R.string.ra_submission_retry_background;
                } else {
                    i4 = R.string.ra_submission_not_retrying;
                }
                x37.b(yh2.O(px0Var8, i4), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, ((xe7) xq2Var11.j(nq6Var3)).l, px0Var8, 0, 0, 65534);
                xq2Var11.p(true);
                return jg7Var;
            case 15:
                fy6 fy6Var = (fy6) obj4;
                ((Integer) obj3).getClass();
                xq2 xq2Var12 = (xq2) ((px0) obj2);
                xq2Var12.b0(-398757863);
                float f2 = fy6Var.b;
                v71 v71Var = ir1.a;
                pp6 a5 = in.a(f2, ge7.Y(250, 0, v71Var, 2), xq2Var12, 0, 12);
                final pp6 a6 = in.a(fy6Var.a, ge7.Y(250, 0, v71Var, 2), xq2Var12, 0, 12);
                a74 n = dj6.n(dj6.c((a74) obj, 1.0f), d90.e0, 2);
                boolean f3 = xq2Var12.f(a6);
                Object P4 = xq2Var12.P();
                if (f3 || P4 == vs0Var) {
                    P4 = new qn2() { // from class: pv4
                        @Override // defpackage.qn2
                        public final Object g(Object obj5) {
                            int i72 = r2;
                            pp6 pp6Var = a6;
                            switch (i72) {
                                case 0:
                                    op5 op5Var = (op5) obj5;
                                    op5Var.getClass();
                                    op5Var.j(((Number) pp6Var.getValue()).floatValue());
                                    return jg7.a;
                                default:
                                    return new i93(((qh1) obj5).r0(((om1) pp6Var.getValue()).A) << 32);
                            }
                        }
                    };
                    xq2Var12.l0(P4);
                }
                a74 l6 = dj6.l(g04.L(n, (qn2) P4), ((om1) a5.getValue()).A);
                xq2Var12.p(false);
                return l6;
            case 16:
                p27 p27Var3 = (p27) obj4;
                a74 a74Var = (a74) obj;
                ((Integer) obj3).getClass();
                xq2 xq2Var13 = (xq2) ((px0) obj2);
                xq2Var13.b0(1980580247);
                qh1 qh1Var = (qh1) xq2Var13.j(ky0.h);
                Object P5 = xq2Var13.P();
                if (P5 == vs0Var) {
                    P5 = np2.Y(new q93(0L));
                    xq2Var13.l0(P5);
                }
                qa4 qa4Var2 = (qa4) P5;
                boolean h3 = xq2Var13.h(p27Var3);
                Object P6 = xq2Var13.P();
                if (h3 || P6 == vs0Var) {
                    P6 = new yu6(3, p27Var3, qa4Var2);
                    xq2Var13.l0(P6);
                }
                on2 on2Var = (on2) P6;
                boolean f4 = xq2Var13.f(qh1Var);
                Object P7 = xq2Var13.P();
                if (f4 || P7 == vs0Var) {
                    P7 = new t27(qh1Var, qa4Var2, 0);
                    xq2Var13.l0(P7);
                }
                xo xoVar = qa6.a;
                a74 p = l.p(a74Var, new l4(13, on2Var, (qn2) P7));
                xq2Var13.p(false);
                return p;
            case 17:
                gl6 gl6Var = (gl6) obj4;
                px0 px0Var9 = (px0) obj2;
                int intValue9 = ((Integer) obj3).intValue();
                ((gl6) obj).getClass();
                if ((intValue9 & 17) != 16) {
                    z7 = true;
                }
                xq2 xq2Var14 = (xq2) px0Var9;
                if (xq2Var14.S(intValue9 & 1, z7)) {
                    xk2.e(gl6Var, null, null, xq2Var14, 6);
                } else {
                    xq2Var14.V();
                }
                return jg7Var;
            default:
                qr7 qr7Var = (qr7) obj4;
                px0 px0Var10 = (px0) obj2;
                int intValue10 = ((Integer) obj3).intValue();
                ((m26) obj).getClass();
                if ((intValue10 & 17) != 16) {
                    z7 = true;
                }
                xq2 xq2Var15 = (xq2) px0Var10;
                if (xq2Var15.S(intValue10 & 1, z7)) {
                    boolean h4 = xq2Var15.h(qr7Var);
                    Object P8 = xq2Var15.P();
                    if (h4 || P8 == vs0Var) {
                        P8 = new er7(qr7Var, 1);
                        xq2Var15.l0(P8);
                    }
                    ej2.b((on2) P8, null, false, mb3.h, xq2Var15, 24576, 14);
                } else {
                    xq2Var15.V();
                }
                return jg7Var;
        }
    }

    public /* synthetic */ ov4(Object obj, int i) {
        this.A = i;
        this.B = obj;
    }
}
