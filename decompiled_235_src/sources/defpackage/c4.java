package defpackage;

import android.content.SharedPreferences;
import androidx.recyclerview.widget.RecyclerView;
import com.stormds.emulator.R;
import java.util.Locale;
import me.magnum.melonds.impl.emulator.debug.RendererDebugBridge;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: c4  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class c4 implements eo2 {
    public final /* synthetic */ int A = 3;
    public final /* synthetic */ on2 B;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object R;
    public final /* synthetic */ Object X;
    public final /* synthetic */ Object Y;
    public final /* synthetic */ Object Z;

    public /* synthetic */ c4(on2 on2Var, go2 go2Var, qa4 qa4Var, qa4 qa4Var2, qa4 qa4Var3, rs4 rs4Var) {
        this.B = on2Var;
        this.R = go2Var;
        this.L = qa4Var;
        this.X = qa4Var2;
        this.Y = qa4Var3;
        this.Z = rs4Var;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        boolean z;
        qa4 qa4Var;
        boolean z2;
        boolean z3;
        int i = this.A;
        vs0 vs0Var = ox0.a;
        jg7 jg7Var = jg7.a;
        Object obj3 = this.L;
        Object obj4 = this.Z;
        Object obj5 = this.Y;
        Object obj6 = this.X;
        Object obj7 = this.R;
        boolean z4 = false;
        switch (i) {
            case 0:
                es7 es7Var = (es7) obj7;
                nx1 nx1Var = (nx1) obj6;
                qn2 qn2Var = (qn2) obj5;
                pp6 pp6Var = (pp6) obj4;
                qa4 qa4Var2 = (qa4) obj3;
                px0 px0Var = (px0) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                xq2 xq2Var = (xq2) px0Var;
                if (xq2Var.S(intValue & 1, z)) {
                    lc2 lc2Var = dj6.c;
                    long j = es7Var.b;
                    jy2 jy2Var = u24.m;
                    a74 L = vy7.L(lc2Var, j, jy2Var);
                    e34 d = h70.d(d90.L, false);
                    int hashCode = Long.hashCode(xq2Var.T);
                    xv4 l = xq2Var.l();
                    a74 E = l.E(xq2Var, L);
                    jx0.i.getClass();
                    iy0 iy0Var = ix0.b;
                    xq2Var.f0();
                    if (xq2Var.S) {
                        xq2Var.k(iy0Var);
                    } else {
                        xq2Var.o0();
                    }
                    pn pnVar = ix0.f;
                    yh2.K(xq2Var, pnVar, d);
                    pn pnVar2 = ix0.e;
                    yh2.K(xq2Var, pnVar2, l);
                    Integer valueOf = Integer.valueOf(hashCode);
                    pn pnVar3 = ix0.g;
                    yh2.K(xq2Var, pnVar3, valueOf);
                    ne neVar = ix0.h;
                    yh2.F(xq2Var, neVar);
                    pn pnVar4 = ix0.d;
                    yh2.K(xq2Var, pnVar4, E);
                    a74 j0 = nc1.j0(lc2Var, nc1.o);
                    l26 a = k26.a(ju.a, d90.h0, xq2Var, 0);
                    int hashCode2 = Long.hashCode(xq2Var.T);
                    xv4 l2 = xq2Var.l();
                    a74 E2 = l.E(xq2Var, j0);
                    xq2Var.f0();
                    if (xq2Var.S) {
                        xq2Var.k(iy0Var);
                    } else {
                        xq2Var.o0();
                    }
                    yh2.K(xq2Var, pnVar, a);
                    yh2.K(xq2Var, pnVar2, l2);
                    i61.w(hashCode2, xq2Var, pnVar3, xq2Var, neVar);
                    yh2.K(xq2Var, pnVar4, E2);
                    c40 c40Var = d90.l0;
                    x64 x64Var = x64.a;
                    a74 S = ge7.S(dj6.b(dj6.l(x64Var, 58.0f), 1.0f), RecyclerView.B1, 8.0f, RecyclerView.B1, 12.0f, 5);
                    yt0 a2 = wt0.a(ju.c, c40Var, xq2Var, 48);
                    int hashCode3 = Long.hashCode(xq2Var.T);
                    xv4 l3 = xq2Var.l();
                    a74 E3 = l.E(xq2Var, S);
                    xq2Var.f0();
                    if (xq2Var.S) {
                        xq2Var.k(iy0Var);
                    } else {
                        xq2Var.o0();
                    }
                    yh2.K(xq2Var, pnVar, a2);
                    yh2.K(xq2Var, pnVar2, l3);
                    i61.w(hashCode3, xq2Var, pnVar3, xq2Var, neVar);
                    yh2.K(xq2Var, pnVar4, E3);
                    a74 g = u24.g(dj6.i(x64Var, 36.0f), z16.a);
                    on2 on2Var = this.B;
                    a74 u = mb3.u(g, false, null, on2Var, 15);
                    e34 d2 = h70.d(d90.Z, false);
                    int hashCode4 = Long.hashCode(xq2Var.T);
                    xv4 l4 = xq2Var.l();
                    a74 E4 = l.E(xq2Var, u);
                    xq2Var.f0();
                    if (xq2Var.S) {
                        xq2Var.k(iy0Var);
                    } else {
                        xq2Var.o0();
                    }
                    yh2.K(xq2Var, pnVar, d2);
                    yh2.K(xq2Var, pnVar2, l4);
                    i61.w(hashCode4, xq2Var, pnVar3, xq2Var, neVar);
                    yh2.K(xq2Var, pnVar4, E4);
                    i13.a(jw2.q(), yh2.O(xq2Var, R.string.cancel), dj6.i(x64Var, 19.0f), es7Var.g, xq2Var, RendererDebugBridge.CAPTURE_HEIGHT, 0);
                    xq2Var.p(true);
                    h70.a(new vn3(1.0f, true), xq2Var, 0);
                    yt0 a3 = wt0.a(new gu(10.0f, true, new i(1)), c40Var, xq2Var, 54);
                    int hashCode5 = Long.hashCode(xq2Var.T);
                    xv4 l5 = xq2Var.l();
                    a74 E5 = l.E(xq2Var, x64Var);
                    xq2Var.f0();
                    if (xq2Var.S) {
                        xq2Var.k(iy0Var);
                    } else {
                        xq2Var.o0();
                    }
                    yh2.K(xq2Var, pnVar, a3);
                    yh2.K(xq2Var, pnVar2, l5);
                    i61.w(hashCode5, xq2Var, pnVar3, xq2Var, neVar);
                    yh2.K(xq2Var, pnVar4, E5);
                    g04.r("NAV", null, n16.I(1312402531, new d4(es7Var, 0), xq2Var), xq2Var, 390, 2);
                    String O = yh2.O(xq2Var, R.string.pause_hint_accept);
                    Locale locale = Locale.ROOT;
                    String upperCase = O.toUpperCase(locale);
                    upperCase.getClass();
                    g04.r(upperCase, "A", null, xq2Var, 48, 4);
                    String upperCase2 = yh2.O(xq2Var, R.string.pause_hint_back).toUpperCase(locale);
                    upperCase2.getClass();
                    g04.r(upperCase2, "B", null, xq2Var, 48, 4);
                    xq2Var.p(true);
                    xq2Var.p(true);
                    h70.a(vy7.L(dj6.b(dj6.l(x64Var, 1.0f), 1.0f), es7Var.f, jy2Var), xq2Var, 0);
                    a74 b = dj6.b(new vn3(1.0f, true), 1.0f);
                    e34 d3 = h70.d(d90.R, false);
                    int hashCode6 = Long.hashCode(xq2Var.T);
                    xv4 l6 = xq2Var.l();
                    a74 E6 = l.E(xq2Var, b);
                    xq2Var.f0();
                    if (xq2Var.S) {
                        xq2Var.k(iy0Var);
                    } else {
                        xq2Var.o0();
                    }
                    yh2.K(xq2Var, pnVar, d3);
                    yh2.K(xq2Var, pnVar2, l6);
                    i61.w(hashCode6, xq2Var, pnVar3, xq2Var, neVar);
                    yh2.K(xq2Var, pnVar4, E6);
                    a74 m = dj6.m(760.0f, 1, lc2Var);
                    j06 j06Var = (j06) pp6Var.getValue();
                    Object P = xq2Var.P();
                    if (P == vs0Var) {
                        qa4Var = qa4Var2;
                        P = new e4(qa4Var, 0);
                        xq2Var.l0(P);
                    } else {
                        qa4Var = qa4Var2;
                    }
                    eo2 eo2Var = (eo2) P;
                    boolean h = xq2Var.h(nx1Var);
                    Object P2 = xq2Var.P();
                    if (h || P2 == vs0Var) {
                        a0 a0Var = new a0(1, nx1Var, nx1.class, "viewLeaderboard", "viewLeaderboard(Lme/magnum/rcheevosapi/model/RALeaderboard;)V", 0, 0, 1);
                        xq2Var.l0(a0Var);
                        P2 = a0Var;
                    }
                    qn2 qn2Var2 = (qn2) ((po2) P2);
                    boolean h2 = xq2Var.h(nx1Var);
                    Object P3 = xq2Var.P();
                    if (h2 || P3 == vs0Var) {
                        h4 h4Var = new h4(2, nx1Var, nx1.class, "getLeaderboardRanking", "getLeaderboardRanking-gIAlu-s(Lme/magnum/rcheevosapi/model/RALeaderboard;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 0, 0);
                        xq2Var.l0(h4Var);
                        P3 = h4Var;
                    }
                    eo2 eo2Var2 = (eo2) ((po2) P3);
                    boolean h3 = xq2Var.h(nx1Var);
                    Object P4 = xq2Var.P();
                    if (h3 || P4 == vs0Var) {
                        i4 i4Var = new i4(0, nx1Var, nx1.class, "retryLoadAchievements", "retryLoadAchievements()V", 0, 0, 0);
                        xq2Var.l0(i4Var);
                        P4 = i4Var;
                    }
                    nc1.a(m, j06Var, eo2Var, qn2Var2, eo2Var2, (on2) ((po2) P4), on2Var, qn2Var, xq2Var, 390);
                    xq2Var.p(true);
                    xq2Var.p(true);
                    vr4 vr4Var = (vr4) qa4Var.getValue();
                    if (vr4Var == null) {
                        xq2Var.b0(543721358);
                        xq2Var.p(false);
                    } else {
                        xq2Var.b0(543721359);
                        o6 o6Var = (o6) vr4Var.A;
                        boolean booleanValue = ((Boolean) vr4Var.B).booleanValue();
                        Object P5 = xq2Var.P();
                        if (P5 == vs0Var) {
                            z2 = false;
                            P5 = new f4(qa4Var, 0);
                            xq2Var.l0(P5);
                        } else {
                            z2 = false;
                        }
                        l.b(o6Var, booleanValue, (on2) P5, xq2Var, RendererDebugBridge.CAPTURE_HEIGHT);
                        xq2Var.p(z2);
                    }
                    xq2Var.p(true);
                    return jg7Var;
                }
                xq2Var.V();
                return jg7Var;
            case 1:
                go2 go2Var = (go2) obj7;
                qa4 qa4Var3 = (qa4) obj3;
                qa4 qa4Var4 = (qa4) obj6;
                qa4 qa4Var5 = (qa4) obj5;
                rs4 rs4Var = (rs4) obj4;
                px0 px0Var2 = (px0) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if ((intValue2 & 3) != 2) {
                    z4 = true;
                }
                xq2 xq2Var2 = (xq2) px0Var2;
                if (xq2Var2.S(intValue2 & 1, z4)) {
                    q60.b(yh2.O(xq2Var2, R.string.cancel), false, this.B, xq2Var2, 0, 2);
                    String O2 = yh2.O(xq2Var2, R.string.ok);
                    boolean f = xq2Var2.f(go2Var) | xq2Var2.f(qa4Var3) | xq2Var2.f(qa4Var4) | xq2Var2.f(qa4Var5) | xq2Var2.f(rs4Var);
                    Object P6 = xq2Var2.P();
                    if (f || P6 == vs0Var) {
                        jn3 jn3Var = new jn3(go2Var, qa4Var3, qa4Var4, qa4Var5, rs4Var, 0);
                        xq2Var2.l0(jn3Var);
                        P6 = jn3Var;
                    }
                    q60.b(O2, false, (on2) P6, xq2Var2, 0, 2);
                } else {
                    xq2Var2.V();
                }
                return jg7Var;
            case 2:
                cu5 cu5Var = (cu5) obj7;
                a74 a74Var = (a74) obj6;
                lq4 lq4Var = (lq4) obj4;
                pq5 pq5Var = (pq5) obj3;
                qn2 qn2Var3 = (qn2) obj5;
                px0 px0Var3 = (px0) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if ((intValue3 & 3) != 2) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                xq2 xq2Var3 = (xq2) px0Var3;
                if (xq2Var3.S(intValue3 & 1, z3)) {
                    if (cu5Var instanceof au5) {
                        xq2Var3.b0(605657266);
                        qo2.g(ge7.N(a74Var, lq4Var), xq2Var3, 0);
                        xq2Var3.p(false);
                    } else if (cu5Var instanceof bu5) {
                        xq2Var3.b0(605660199);
                        qo2.a(a74Var, lq4Var, pq5Var, ((bu5) cu5Var).a, qn2Var3, this.B, xq2Var3, 0);
                        xq2Var3.p(false);
                    } else {
                        throw xg6.f(xq2Var3, 605655497, false);
                    }
                } else {
                    xq2Var3.V();
                }
                return jg7Var;
            case 3:
                ((Integer) obj2).getClass();
                qo2.a((a74) obj7, (lq4) obj6, (pq5) obj4, (zt5) obj3, (qn2) obj5, this.B, (px0) obj, ii2.a0(1));
                return jg7Var;
            default:
                ((Integer) obj2).getClass();
                hi2.p((SharedPreferences) obj7, this.B, (on2) obj6, (on2) obj5, (on2) obj4, (on2) obj3, (px0) obj, ii2.a0(1));
                return jg7Var;
        }
    }

    public /* synthetic */ c4(a74 a74Var, lq4 lq4Var, pq5 pq5Var, zt5 zt5Var, qn2 qn2Var, on2 on2Var, int i) {
        this.R = a74Var;
        this.X = lq4Var;
        this.Z = pq5Var;
        this.L = zt5Var;
        this.Y = qn2Var;
        this.B = on2Var;
    }

    public /* synthetic */ c4(cu5 cu5Var, a74 a74Var, lq4 lq4Var, pq5 pq5Var, qn2 qn2Var, on2 on2Var) {
        this.R = cu5Var;
        this.X = a74Var;
        this.Z = lq4Var;
        this.L = pq5Var;
        this.Y = qn2Var;
        this.B = on2Var;
    }

    public /* synthetic */ c4(es7 es7Var, on2 on2Var, nx1 nx1Var, qn2 qn2Var, pp6 pp6Var, qa4 qa4Var) {
        this.R = es7Var;
        this.B = on2Var;
        this.X = nx1Var;
        this.Y = qn2Var;
        this.Z = pp6Var;
        this.L = qa4Var;
    }

    public /* synthetic */ c4(SharedPreferences sharedPreferences, on2 on2Var, on2 on2Var2, on2 on2Var3, on2 on2Var4, on2 on2Var5, int i) {
        this.R = sharedPreferences;
        this.B = on2Var;
        this.X = on2Var2;
        this.Y = on2Var3;
        this.Z = on2Var4;
        this.L = on2Var5;
    }
}
