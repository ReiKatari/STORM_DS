package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: km4  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class km4 implements bj2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ Object B;

    public /* synthetic */ km4(b34 b34Var, a34 a34Var) {
        this.A = 9;
        this.B = b34Var;
    }

    @Override // defpackage.bj2
    public final Object i(Object obj, Object obj2, Object obj3) {
        boolean z;
        boolean z2;
        int i;
        int i2;
        boolean z3;
        jr5 jr5Var;
        int i3;
        int i4;
        int i5 = this.A;
        int i6 = 4;
        mt mtVar = rt.c;
        sn1 sn1Var = su0.a;
        boolean z4 = true;
        o27 o27Var = o27.a;
        boolean z5 = false;
        Object obj4 = this.B;
        switch (i5) {
            case 0:
                dz2 dz2Var = (dz2) obj4;
                tu0 tu0Var = (tu0) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((String) obj).getClass();
                if ((intValue & 17) != 16) {
                    z = true;
                } else {
                    z = false;
                }
                sk2 sk2Var = (sk2) tu0Var;
                if (sk2Var.O(intValue & 1, z)) {
                    az2 s = nl2.s(dz2Var, RecyclerView.A1, -360.0f, ct3.t0(ct3.V0(2000, 0, cn1.c, 2), ka5.Restart, 4), null, sk2Var, 4152, 8);
                    s72 s72Var = o76.c;
                    boolean f = sk2Var.f(s);
                    Object L = sk2Var.L();
                    if (f || L == sn1Var) {
                        L = new kb2(19, s);
                        sk2Var.h0(L);
                    }
                    zy3 q = tq5.q(s72Var, (mi2) L);
                    ax2 ax2Var = nk2.c;
                    if (ax2Var == null) {
                        zw2 zw2Var = new zw2("Filled.Sync", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i7 = f77.a;
                        mb6 mb6Var = new mb6(xq0.b);
                        vq2 vq2Var = new vq2(1, (byte) 0);
                        vq2Var.o(12.0f, 4.0f);
                        vq2Var.m(12.0f, 1.0f);
                        vq2Var.m(8.0f, 5.0f);
                        vq2Var.n(4.0f, 4.0f);
                        vq2Var.m(12.0f, 6.0f);
                        vq2Var.i(3.31f, RecyclerView.A1, 6.0f, 2.69f, 6.0f, 6.0f);
                        vq2Var.i(RecyclerView.A1, 1.01f, -0.25f, 1.97f, -0.7f, 2.8f);
                        vq2Var.n(1.46f, 1.46f);
                        vq2Var.h(19.54f, 15.03f, 20.0f, 13.57f, 20.0f, 12.0f);
                        vq2Var.i(RecyclerView.A1, -4.42f, -3.58f, -8.0f, -8.0f, -8.0f);
                        vq2Var.g();
                        vq2Var.o(12.0f, 18.0f);
                        vq2Var.i(-3.31f, RecyclerView.A1, -6.0f, -2.69f, -6.0f, -6.0f);
                        vq2Var.i(RecyclerView.A1, -1.01f, 0.25f, -1.97f, 0.7f, -2.8f);
                        vq2Var.m(5.24f, 7.74f);
                        vq2Var.h(4.46f, 8.97f, 4.0f, 10.43f, 4.0f, 12.0f);
                        vq2Var.i(RecyclerView.A1, 4.42f, 3.58f, 8.0f, 8.0f, 8.0f);
                        vq2Var.u(3.0f);
                        vq2Var.n(4.0f, -4.0f);
                        vq2Var.n(-4.0f, -4.0f);
                        vq2Var.u(3.0f);
                        vq2Var.g();
                        zw2.a(zw2Var, vq2Var.b, 0, mb6Var);
                        ax2Var = zw2Var.b();
                        nk2.c = ax2Var;
                    }
                    ev2.a(ax2Var, null, q, ((hr0) sk2Var.j(ir0.a)).i(), sk2Var, 48, 0);
                } else {
                    sk2Var.R();
                }
                return o27Var;
            case 1:
                f3 f3Var = (f3) obj4;
                tu0 tu0Var2 = (tu0) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((ni3) obj).getClass();
                if ((intValue2 & 17) != 16) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                sk2 sk2Var2 = (sk2) tu0Var2;
                if (sk2Var2.O(intValue2 & 1, z2)) {
                    switch (v5.c[f3Var.a.ordinal()]) {
                        case 1:
                            i = -1377717203;
                            i2 = R.string.retro_achievements_pending_unlocks;
                            break;
                        case 2:
                            i = -1377713361;
                            i2 = R.string.retro_achievements_active_challenges;
                            break;
                        case 3:
                            i = -1377709457;
                            i2 = R.string.retro_achievements_recently_unlokced;
                            break;
                        case 4:
                            i = -1377705818;
                            i2 = R.string.retro_achievements_unsynced;
                            break;
                        case 5:
                            i = -1377702358;
                            i2 = R.string.retro_achievements_almost_there;
                            break;
                        case ig7.b /* 6 */:
                            i = -1377698940;
                            i2 = R.string.retro_achievements_locked;
                            break;
                        case 7:
                            i = -1377695543;
                            i2 = R.string.retro_achievements_unsupported;
                            break;
                        case 8:
                            i = -1377692024;
                            i2 = R.string.retro_achievements_unofficial;
                            break;
                        case 9:
                            i = -1377688602;
                            i2 = R.string.retro_achievements_unlocked;
                            break;
                        default:
                            throw ej6.d(sk2Var2, -1377718728, false);
                    }
                    n40.e(b31.o(sk2Var2, i, i2, sk2Var2, false), sk2Var2, 0);
                } else {
                    sk2Var2.R();
                }
                return o27Var;
            case 2:
                j3 j3Var = (j3) obj4;
                tu0 tu0Var3 = (tu0) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                ((tr5) obj).getClass();
                if ((intValue3 & 17) != 16) {
                    z5 = true;
                }
                sk2 sk2Var3 = (sk2) tu0Var3;
                if (sk2Var3.O(intValue3 & 1, z5)) {
                    ir6.b(j3Var.d, b53.b0(wy3.a, 4.0f, RecyclerView.A1, RecyclerView.A1, RecyclerView.A1, 14), 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, ((c17) sk2Var3.j(d17.b)).i, sk2Var3, 48, 0, 65532);
                } else {
                    sk2Var3.R();
                }
                return o27Var;
            case 3:
                return new m4(obj3, (q60) obj4, (jy5) obj, 2);
            case 4:
                e31 e31Var = (e31) obj3;
                ((kb2) obj4).n((Throwable) obj);
                return o27Var;
            case 5:
                x21 x21Var = (x21) obj4;
                int intValue4 = ((Integer) obj).intValue();
                int intValue5 = ((Integer) obj2).intValue();
                boolean booleanValue = ((Boolean) obj3).booleanValue();
                if (!booleanValue) {
                    intValue4 = x21Var.q0.n(intValue4);
                }
                if (!booleanValue) {
                    intValue5 = x21Var.q0.n(intValue5);
                }
                if (x21Var.o0) {
                    long j = x21Var.m0.b;
                    int i8 = vr6.c;
                    if (intValue4 != ((int) (j >> 32)) || intValue5 != ((int) (j & 4294967295L))) {
                        if (Math.min(intValue4, intValue5) >= 0 && Math.max(intValue4, intValue5) <= x21Var.m0.a.B.length()) {
                            if (!booleanValue && intValue4 != intValue5) {
                                x21Var.r0.h(true);
                            } else {
                                bq6 bq6Var = x21Var.r0;
                                bq6Var.t(false);
                                bq6Var.q(gp2.None);
                            }
                            x21Var.n0.v.n(new oq6(x21Var.m0.a, ve2.g(intValue4, intValue5), (vr6) null));
                            return Boolean.valueOf(z4);
                        }
                        bq6 bq6Var2 = x21Var.r0;
                        bq6Var2.t(false);
                        bq6Var2.q(gp2.None);
                    }
                }
                z4 = false;
                return Boolean.valueOf(z4);
            case ig7.b /* 6 */:
                rp4 rp4Var = (rp4) obj;
                mb4 mb4Var = (mb4) obj3;
                ((xr3) obj4).B.b(((rp4) obj2).c, k45.j0);
                return o27Var;
            case 7:
                o3 o3Var = (o3) obj4;
                tr5 tr5Var = (tr5) obj;
                tu0 tu0Var4 = (tu0) obj2;
                int intValue6 = ((Integer) obj3).intValue();
                tr5Var.getClass();
                if ((intValue6 & 6) == 0) {
                    if (!((sk2) tu0Var4).f(tr5Var)) {
                        i6 = 2;
                    }
                    intValue6 |= i6;
                }
                if ((intValue6 & 19) == 18) {
                    z4 = false;
                }
                sk2 sk2Var4 = (sk2) tu0Var4;
                if (sk2Var4.O(intValue6 & 1, z4)) {
                    Object L2 = sk2Var4.L();
                    if (L2 == sn1Var) {
                        L2 = me2.G(Boolean.FALSE);
                        sk2Var4.h0(L2);
                    }
                    k24 k24Var = (k24) L2;
                    String W = me2.W(R.string.leaderboard_submission_info, new Object[]{o3Var.e, Long.valueOf(o3Var.g), Long.valueOf(o3Var.h)}, sk2Var4);
                    boolean h = sk2Var4.h(o3Var);
                    Object L3 = sk2Var4.L();
                    if (h || L3 == sn1Var) {
                        L3 = new ba1(o3Var, k24Var, null, 24);
                        sk2Var4.h0(L3);
                    }
                    l.g(sk2Var4, (aj2) L3, o27Var);
                    ct3.l(tr5Var, ((Boolean) k24Var.getValue()).booleanValue(), null, null, null, null, ct3.H0(-496976326, new l4(6, o3Var, W), sk2Var4), sk2Var4, (intValue6 & 14) | 1572864);
                } else {
                    sk2Var4.R();
                }
                return o27Var;
            case 8:
                p3 p3Var = (p3) obj4;
                tu0 tu0Var5 = (tu0) obj2;
                int intValue7 = ((Integer) obj3).intValue();
                ((tr5) obj).getClass();
                if ((intValue7 & 17) != 16) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                sk2 sk2Var5 = (sk2) tu0Var5;
                if (sk2Var5.O(intValue7 & 1, z3)) {
                    zy3 b0 = b53.b0(wy3.a, 4.0f, RecyclerView.A1, RecyclerView.A1, RecyclerView.A1, 14);
                    lr0 a = jr0.a(mtVar, y60.j0, sk2Var5, 0);
                    int hashCode = Long.hashCode(sk2Var5.T);
                    sm4 l = sk2Var5.l();
                    zy3 e0 = l07.e0(sk2Var5, b0);
                    nu0.i.getClass();
                    mv0 mv0Var = mu0.b;
                    sk2Var5.b0();
                    if (sk2Var5.S) {
                        sk2Var5.k(mv0Var);
                    } else {
                        sk2Var5.k0();
                    }
                    oo2.S(sk2Var5, mu0.f, a);
                    oo2.S(sk2Var5, mu0.e, l);
                    oo2.S(sk2Var5, mu0.g, Integer.valueOf(hashCode));
                    oo2.P(sk2Var5, mu0.h);
                    oo2.S(sk2Var5, mu0.d, e0);
                    String X = me2.X(sk2Var5, R.string.leaderboard_submission_pending);
                    ye6 ye6Var = d17.b;
                    ir6.b(X, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 1, 0, null, ds6.a(((c17) sk2Var5.j(ye6Var)).l, 0L, 0L, pe2.d0, null, 0L, 0L, null, 16777211), sk2Var5, 0, 3072, 57342);
                    ir6.b(p3Var.b, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 1, 0, null, ((c17) sk2Var5.j(ye6Var)).l, sk2Var5, 0, 3072, 57342);
                    String str = p3Var.d;
                    if (zg6.B0(str)) {
                        str = "--";
                    }
                    ir6.b(str, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 1, 0, null, ((c17) sk2Var5.j(ye6Var)).l, sk2Var5, 0, 3072, 57342);
                    sk2Var5.p(true);
                } else {
                    sk2Var5.R();
                }
                return o27Var;
            case 9:
                b34 b34Var = (b34) obj4;
                Throwable th = (Throwable) obj;
                o27 o27Var2 = (o27) obj2;
                e31 e31Var2 = (e31) obj3;
                b34.e0.set(b34Var, null);
                b34Var.d(null);
                return o27Var;
            case 10:
                i3 i3Var = (i3) obj4;
                tu0 tu0Var6 = (tu0) obj2;
                ((Integer) obj3).getClass();
                ((wn) obj).getClass();
                zy3 b02 = b53.b0(wy3.a, 4.0f, RecyclerView.A1, RecyclerView.A1, RecyclerView.A1, 14);
                lr0 a2 = jr0.a(mtVar, y60.j0, tu0Var6, 0);
                sk2 sk2Var6 = (sk2) tu0Var6;
                int hashCode2 = Long.hashCode(sk2Var6.T);
                sm4 l2 = sk2Var6.l();
                zy3 e02 = l07.e0(tu0Var6, b02);
                nu0.i.getClass();
                mv0 mv0Var2 = mu0.b;
                sk2 sk2Var7 = (sk2) tu0Var6;
                sk2Var7.b0();
                if (sk2Var7.S) {
                    sk2Var7.k(mv0Var2);
                } else {
                    sk2Var7.k0();
                }
                oo2.S(tu0Var6, mu0.f, a2);
                oo2.S(tu0Var6, mu0.e, l2);
                oo2.S(tu0Var6, mu0.g, Integer.valueOf(hashCode2));
                oo2.P(tu0Var6, mu0.h);
                oo2.S(tu0Var6, mu0.d, e02);
                String X2 = me2.X(tu0Var6, R.string.challenge_started);
                ye6 ye6Var2 = d17.b;
                ir6.b(X2, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, ds6.a(((c17) sk2Var7.j(ye6Var2)).l, 0L, 0L, pe2.d0, null, 0L, 0L, null, 16777211), tu0Var6, 0, 0, 65534);
                ir6.b(i3Var.a.g, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, ((c17) sk2Var7.j(ye6Var2)).l, tu0Var6, 0, 0, 65534);
                sk2Var7.p(true);
                return o27Var;
            case 11:
                q9 q9Var = (q9) obj4;
                int intValue8 = ((Integer) obj).intValue();
                String str2 = (String) obj2;
                z44 z44Var = (z44) obj3;
                str2.getClass();
                z44Var.getClass();
                if (!(z44Var instanceof qq0) && !((m93) q9Var.B).e().k(intValue8)) {
                    jr5Var = jr5.PATH;
                } else {
                    jr5Var = jr5.QUERY;
                }
                int i9 = kr5.a[jr5Var.ordinal()];
                if (i9 != 1) {
                    if (i9 == 2) {
                        q9Var.h(str2, "{" + str2 + '}');
                    } else {
                        i.c();
                        return null;
                    }
                } else {
                    q9Var.R = ((String) q9Var.R) + '/' + b31.n('}', "{", str2);
                }
                return o27Var;
            case mj2.L /* 12 */:
                Throwable th2 = (Throwable) obj;
                o27 o27Var3 = (o27) obj2;
                e31 e31Var3 = (e31) obj3;
                ((vz5) obj4).c();
                return o27Var;
            case 13:
                s3 s3Var = (s3) obj4;
                tu0 tu0Var7 = (tu0) obj2;
                ((Integer) obj3).getClass();
                ((wn) obj).getClass();
                zy3 b03 = b53.b0(wy3.a, 4.0f, RecyclerView.A1, RecyclerView.A1, RecyclerView.A1, 14);
                lr0 a3 = jr0.a(mtVar, y60.j0, tu0Var7, 0);
                sk2 sk2Var8 = (sk2) tu0Var7;
                int hashCode3 = Long.hashCode(sk2Var8.T);
                sm4 l3 = sk2Var8.l();
                zy3 e03 = l07.e0(tu0Var7, b03);
                nu0.i.getClass();
                mv0 mv0Var3 = mu0.b;
                sk2 sk2Var9 = (sk2) tu0Var7;
                sk2Var9.b0();
                if (sk2Var9.S) {
                    sk2Var9.k(mv0Var3);
                } else {
                    sk2Var9.k0();
                }
                oo2.S(tu0Var7, mu0.f, a3);
                oo2.S(tu0Var7, mu0.e, l3);
                oo2.S(tu0Var7, mu0.g, Integer.valueOf(hashCode3));
                oo2.P(tu0Var7, mu0.h);
                oo2.S(tu0Var7, mu0.d, e03);
                se seVar = s3Var.a;
                if (seVar instanceof q3) {
                    i3 = R.string.achievement_submission_failed;
                } else if (seVar instanceof r3) {
                    i3 = R.string.leaderboard_submission_failed;
                } else {
                    i.c();
                    return null;
                }
                String X3 = me2.X(tu0Var7, i3);
                ye6 ye6Var3 = d17.b;
                ir6.b(X3, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, ds6.a(((c17) sk2Var9.j(ye6Var3)).l, 0L, 0L, pe2.d0, null, 0L, 0L, null, 16777211), tu0Var7, 0, 0, 65534);
                if (s3Var.b) {
                    i4 = R.string.ra_submission_retry_background;
                } else {
                    i4 = R.string.ra_submission_not_retrying;
                }
                ir6.b(me2.X(tu0Var7, i4), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, ((c17) sk2Var9.j(ye6Var3)).l, tu0Var7, 0, 0, 65534);
                sk2Var9.p(true);
                return o27Var;
            default:
                bq6 bq6Var3 = (bq6) obj4;
                zy3 zy3Var = (zy3) obj;
                ((Integer) obj3).getClass();
                sk2 sk2Var10 = (sk2) ((tu0) obj2);
                sk2Var10.X(1980580247);
                od1 od1Var = (od1) sk2Var10.j(ov0.h);
                Object L4 = sk2Var10.L();
                if (L4 == sn1Var) {
                    L4 = me2.G(new i33(0L));
                    sk2Var10.h0(L4);
                }
                k24 k24Var2 = (k24) L4;
                boolean h2 = sk2Var10.h(bq6Var3);
                Object L5 = sk2Var10.L();
                if (h2 || L5 == sn1Var) {
                    L5 = new eq6(0, bq6Var3, k24Var2);
                    sk2Var10.h0(L5);
                }
                ki2 ki2Var = (ki2) L5;
                boolean f2 = sk2Var10.f(od1Var);
                Object L6 = sk2Var10.L();
                if (f2 || L6 == sn1Var) {
                    L6 = new fq6(od1Var, k24Var2, 0);
                    sk2Var10.h0(L6);
                }
                lo loVar = bz5.a;
                zy3 A = l07.A(zy3Var, new x51(ki2Var, (mi2) L6));
                sk2Var10.p(false);
                return A;
        }
    }

    public /* synthetic */ km4(int i, Object obj) {
        this.A = i;
        this.B = obj;
    }
}
