package defpackage;

import android.graphics.Typeface;
import android.text.Spannable;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.recyclerview.widget.RecyclerView;
import com.stormds.emulator.R;
import java.util.List;
import java.util.Map;
import me.magnum.melonds.ui.backgrounds.BackgroundsActivity;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: l4  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class l4 implements fo2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object L;

    public /* synthetic */ l4(int i, Object obj, Object obj2) {
        this.A = i;
        this.B = obj;
        this.L = obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:215:0x06d5, code lost:
        if (r5 != false) goto L214;
     */
    @Override // defpackage.fo2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(Object obj, Object obj2, Object obj3) {
        boolean z;
        boolean z2;
        boolean z3;
        int i;
        boolean z4;
        float t;
        float f;
        int i2;
        boolean z5;
        int i3;
        c26 c26Var;
        boolean z6;
        int i4;
        int i5;
        Typeface typeface;
        boolean z7;
        boolean z8;
        boolean z9;
        long j;
        int i6 = this.A;
        int i7 = 15;
        float f2 = 1.0f;
        eu euVar = ju.c;
        x64 x64Var = x64.a;
        int i8 = 2;
        vs0 vs0Var = ox0.a;
        boolean z10 = false;
        int i9 = 0;
        boolean z11 = false;
        boolean z12 = false;
        char c = 0;
        boolean z13 = false;
        jg7 jg7Var = jg7.a;
        Object obj4 = this.L;
        Object obj5 = this.B;
        switch (i6) {
            case 0:
                List list = (List) obj5;
                ts4 ts4Var = (ts4) obj4;
                px0 px0Var = (px0) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((lp3) obj).getClass();
                if ((intValue & 17) != 16) {
                    z10 = true;
                }
                int i10 = intValue & 1;
                xq2 xq2Var = (xq2) px0Var;
                if (xq2Var.S(i10, z10)) {
                    long h = ts4Var.h();
                    boolean f3 = xq2Var.f(ts4Var);
                    Object P = xq2Var.P();
                    if (f3 || P == vs0Var) {
                        P = new k0(ts4Var, 4);
                        xq2Var.l0(P);
                    }
                    ge7.a(list, h, (qn2) P, xq2Var, 0);
                    gi2.h(xq2Var, dj6.e(x64Var, 16.0f));
                } else {
                    xq2Var.V();
                }
                return jg7Var;
            case 1:
                rc4 rc4Var = (rc4) obj5;
                BackgroundsActivity backgroundsActivity = (BackgroundsActivity) obj4;
                sg6 sg6Var = (sg6) obj;
                px0 px0Var2 = (px0) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                int i11 = BackgroundsActivity.B0;
                sg6Var.getClass();
                if ((intValue2 & 6) == 0) {
                    if (((xq2) px0Var2).f(sg6Var)) {
                        i8 = 4;
                    }
                    intValue2 |= i8;
                }
                if ((intValue2 & 19) != 18) {
                    z = true;
                } else {
                    z = false;
                }
                xq2 xq2Var2 = (xq2) px0Var2;
                if (xq2Var2.S(intValue2 & 1, z)) {
                    q10 q10Var = q10.INSTANCE;
                    Object P2 = xq2Var2.P();
                    if (P2 == vs0Var) {
                        P2 = new k4(16);
                        xq2Var2.l0(P2);
                    }
                    qn2 qn2Var = (qn2) P2;
                    Object P3 = xq2Var2.P();
                    if (P3 == vs0Var) {
                        P3 = new k4(17);
                        xq2Var2.l0(P3);
                    }
                    qn2 qn2Var2 = (qn2) P3;
                    Object P4 = xq2Var2.P();
                    if (P4 == vs0Var) {
                        P4 = new k4(18);
                        xq2Var2.l0(P4);
                    }
                    qn2 qn2Var3 = (qn2) P4;
                    boolean h2 = xq2Var2.h(backgroundsActivity);
                    if ((intValue2 & 14) == 4) {
                        z13 = true;
                    }
                    boolean h3 = h2 | z13 | xq2Var2.h(rc4Var);
                    Object P5 = xq2Var2.P();
                    if (h3 || P5 == vs0Var) {
                        P5 = new t00(backgroundsActivity, sg6Var, rc4Var, 1);
                        xq2Var2.l0(P5);
                    }
                    hi2.h(rc4Var, q10Var, null, null, null, qn2Var, null, qn2Var2, qn2Var3, (qn2) P5, xq2Var2, 907542576, 1212);
                } else {
                    xq2Var2.V();
                }
                return jg7Var;
            case 2:
                Throwable th = (Throwable) obj;
                oi2.k((qn2) obj5, obj4, (l61) obj3);
                return jg7Var;
            case 3:
                qn2 qn2Var4 = (qn2) obj5;
                i41 i41Var = (i41) obj4;
                zt0 zt0Var = (zt0) obj;
                px0 px0Var3 = (px0) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                if ((intValue3 & 17) != 16) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                xq2 xq2Var3 = (xq2) px0Var3;
                if (xq2Var3.S(intValue3 & 1, z2)) {
                    Object P6 = xq2Var3.P();
                    if (P6 == vs0Var) {
                        P6 = new k41();
                        xq2Var3.l0(P6);
                    }
                    k41 k41Var = (k41) P6;
                    k41Var.a.clear();
                    qn2Var4.g(k41Var);
                    k41Var.a(i41Var, xq2Var3, 0);
                } else {
                    xq2Var3.V();
                }
                return jg7Var;
            case 4:
                rs4 rs4Var = (rs4) obj5;
                qa4 qa4Var = (qa4) obj4;
                float floatValue = ((Float) obj).floatValue();
                ((Float) obj3).getClass();
                rs4Var.i(gi2.p(rs4Var.h() * floatValue, 0.8f, 5.0f));
                qa4Var.setValue(new jk4(jk4.f(((jk4) qa4Var.getValue()).a, ((jk4) obj2).a)));
                return jg7Var;
            case 5:
                p3 p3Var = (p3) obj5;
                String str = (String) obj4;
                px0 px0Var4 = (px0) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                ((m26) obj).getClass();
                if ((intValue4 & 17) != 16) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                xq2 xq2Var4 = (xq2) px0Var4;
                if (xq2Var4.S(intValue4 & 1, z3)) {
                    a74 S = ge7.S(x64.a, 4.0f, RecyclerView.B1, RecyclerView.B1, RecyclerView.B1, 14);
                    yt0 a = wt0.a(euVar, d90.k0, xq2Var4, 0);
                    int hashCode = Long.hashCode(xq2Var4.T);
                    xv4 l = xq2Var4.l();
                    a74 E = l.E(xq2Var4, S);
                    jx0.i.getClass();
                    iy0 iy0Var = ix0.b;
                    xq2Var4.f0();
                    if (xq2Var4.S) {
                        xq2Var4.k(iy0Var);
                    } else {
                        xq2Var4.o0();
                    }
                    yh2.K(xq2Var4, ix0.f, a);
                    yh2.K(xq2Var4, ix0.e, l);
                    yh2.K(xq2Var4, ix0.g, Integer.valueOf(hashCode));
                    yh2.F(xq2Var4, ix0.h);
                    yh2.K(xq2Var4, ix0.d, E);
                    if (p3Var.e == n3.SUCCESS) {
                        i = R.string.leaderboard_submission_success;
                    } else {
                        i = R.string.leaderboard_attempt_failed;
                    }
                    String O = yh2.O(xq2Var4, i);
                    nq6 nq6Var = ye7.b;
                    x37.b(O, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 1, 0, null, s47.a(((xe7) xq2Var4.j(nq6Var)).l, 0L, 0L, oj2.e0, null, 0L, 0L, null, 16777211), xq2Var4, 0, 3072, 57342);
                    x37.b(p3Var.b.g, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 1, 0, null, ((xe7) xq2Var4.j(nq6Var)).l, xq2Var4, 0, 3072, 57342);
                    x37.b(str, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 1, 0, null, ((xe7) xq2Var4.j(nq6Var)).l, xq2Var4, 0, 3072, 57342);
                    xq2Var4.p(true);
                } else {
                    xq2Var4.V();
                }
                return jg7Var;
            case 6:
                String str2 = (String) obj5;
                o3 o3Var = (o3) obj4;
                px0 px0Var5 = (px0) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                ((m26) obj).getClass();
                if ((intValue5 & 17) != 16) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                xq2 xq2Var5 = (xq2) px0Var5;
                if (xq2Var5.S(intValue5 & 1, z4)) {
                    a74 S2 = ge7.S(x64.a, 4.0f, RecyclerView.B1, RecyclerView.B1, RecyclerView.B1, 14);
                    yt0 a2 = wt0.a(euVar, d90.k0, xq2Var5, 0);
                    int hashCode2 = Long.hashCode(xq2Var5.T);
                    xv4 l2 = xq2Var5.l();
                    a74 E2 = l.E(xq2Var5, S2);
                    jx0.i.getClass();
                    iy0 iy0Var2 = ix0.b;
                    xq2Var5.f0();
                    if (xq2Var5.S) {
                        xq2Var5.k(iy0Var2);
                    } else {
                        xq2Var5.o0();
                    }
                    yh2.K(xq2Var5, ix0.f, a2);
                    yh2.K(xq2Var5, ix0.e, l2);
                    yh2.K(xq2Var5, ix0.g, Integer.valueOf(hashCode2));
                    yh2.F(xq2Var5, ix0.h);
                    yh2.K(xq2Var5, ix0.d, E2);
                    nq6 nq6Var2 = ye7.b;
                    x37.b(str2, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 1, 0, null, s47.a(((xe7) xq2Var5.j(nq6Var2)).i, 0L, 0L, oj2.e0, null, 0L, 0L, null, 16777211), xq2Var5, 0, 3072, 57342);
                    x37.b(o3Var.b.g, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 1, 0, null, ((xe7) xq2Var5.j(nq6Var2)).l, xq2Var5, 0, 3072, 57342);
                    xq2Var5.p(true);
                } else {
                    xq2Var5.V();
                }
                return jg7Var;
            case 7:
                q3 q3Var = (q3) obj5;
                String str3 = (String) obj4;
                px0 px0Var6 = (px0) obj2;
                ((Integer) obj3).getClass();
                ((jo) obj).getClass();
                a74 S3 = ge7.S(x64.a, 4.0f, RecyclerView.B1, RecyclerView.B1, RecyclerView.B1, 14);
                yt0 a3 = wt0.a(euVar, d90.k0, px0Var6, 0);
                xq2 xq2Var6 = (xq2) px0Var6;
                int hashCode3 = Long.hashCode(xq2Var6.T);
                xv4 l3 = xq2Var6.l();
                a74 E3 = l.E(px0Var6, S3);
                jx0.i.getClass();
                iy0 iy0Var3 = ix0.b;
                xq2 xq2Var7 = (xq2) px0Var6;
                xq2Var7.f0();
                if (xq2Var7.S) {
                    xq2Var7.k(iy0Var3);
                } else {
                    xq2Var7.o0();
                }
                yh2.K(px0Var6, ix0.f, a3);
                yh2.K(px0Var6, ix0.e, l3);
                yh2.K(px0Var6, ix0.g, Integer.valueOf(hashCode3));
                yh2.F(px0Var6, ix0.h);
                yh2.K(px0Var6, ix0.d, E3);
                String O2 = yh2.O(px0Var6, R.string.leaderboard_submission_success);
                nq6 nq6Var3 = ye7.b;
                x37.b(O2, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 1, 0, null, s47.a(((xe7) xq2Var7.j(nq6Var3)).l, 0L, 0L, oj2.e0, null, 0L, 0L, null, 16777211), px0Var6, 0, 3072, 57342);
                x37.b(q3Var.c, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 1, 0, null, ((xe7) xq2Var7.j(nq6Var3)).l, px0Var6, 0, 3072, 57342);
                x37.b(str3, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 1, 0, null, ((xe7) xq2Var7.j(nq6Var3)).l, px0Var6, 0, 3072, 57342);
                String str4 = q3Var.f;
                if (str4 == null) {
                    xq2Var7.b0(-134465946);
                    xq2Var7.p(false);
                } else {
                    xq2Var7.b0(-134465945);
                    x37.b(yh2.N(R.string.leaderboard_best_score, new Object[]{str4}, px0Var6), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 1, 0, null, ((xe7) xq2Var7.j(nq6Var3)).l, px0Var6, 0, 3072, 57342);
                    xq2Var7.p(false);
                }
                xq2Var7.p(true);
                return jg7Var;
            case 8:
                ue1 ue1Var = (ue1) obj5;
                kk3 kk3Var = (kk3) obj4;
                float floatValue2 = ((Float) obj).floatValue();
                float floatValue3 = ((Float) obj2).floatValue();
                float floatValue4 = ((Float) obj3).floatValue();
                boolean K = oi2.K(ue1Var, floatValue2);
                if (ue1Var.m().e != lo4.Vertical && kk3Var != kk3.Ltr) {
                    K = !K;
                }
                int i12 = ue1Var.m().b;
                if (i12 == 0) {
                    t = RecyclerView.B1;
                } else {
                    t = oi2.t(ue1Var) / i12;
                }
                float f4 = t - ((int) t);
                if (Math.abs(floatValue2) < ue1Var.n.e0(400.0f)) {
                    f = RecyclerView.B1;
                } else {
                    f = RecyclerView.B1;
                    if (floatValue2 > RecyclerView.B1) {
                        c = 1;
                    } else {
                        c = 2;
                    }
                }
                if (c == 0) {
                    if (Math.abs(f4) <= 0.5f) {
                        float abs = Math.abs(t);
                        qh1 qh1Var = ue1Var.n;
                        or4 or4Var = pr4.a;
                        return abs < Math.abs(Math.min(qh1Var.e0(56.0f), ((float) ue1Var.o()) / 2.0f) / ((float) ue1Var.o())) ? Float.valueOf(floatValue4) : Float.valueOf(floatValue4);
                    }
                } else if (c != 1) {
                    if (c != 2) {
                        floatValue4 = f;
                    }
                    floatValue4 = floatValue3;
                }
                break;
            case 9:
                on2 on2Var = (on2) obj5;
                nh2 nh2Var = (nh2) obj4;
                px0 px0Var7 = (px0) obj2;
                int intValue6 = ((Integer) obj3).intValue();
                ((ro3) obj).getClass();
                if ((intValue6 & 17) != 16) {
                    z12 = true;
                }
                xq2 xq2Var8 = (xq2) px0Var7;
                if (xq2Var8.S(intValue6 & 1, z12)) {
                    ru4.d(yh2.O(xq2Var8, R.string.pause_resume), gi2.H(), true, false, on2Var, nh2Var, xq2Var8, 200064, 0);
                } else {
                    xq2Var8.V();
                }
                return jg7Var;
            case 10:
                gn gnVar = (gn) obj5;
                k3 k3Var = (k3) obj4;
                m26 m26Var = (m26) obj;
                px0 px0Var8 = (px0) obj2;
                int intValue7 = ((Integer) obj3).intValue();
                m26Var.getClass();
                if ((intValue7 & 6) == 0) {
                    if (((xq2) px0Var8).f(m26Var)) {
                        i2 = 4;
                    } else {
                        i2 = 2;
                    }
                    intValue7 |= i2;
                }
                if ((intValue7 & 19) != 18) {
                    z11 = true;
                }
                xq2 xq2Var9 = (xq2) px0Var8;
                if (xq2Var9.S(intValue7 & 1, z11)) {
                    Object P7 = xq2Var9.P();
                    if (P7 == vs0Var) {
                        P7 = np2.Y(Boolean.FALSE);
                        xq2Var9.l0(P7);
                    }
                    qa4 qa4Var2 = (qa4) P7;
                    boolean h4 = xq2Var9.h(gnVar);
                    Object P8 = xq2Var9.P();
                    if (h4 || P8 == vs0Var) {
                        P8 = new gq1(gnVar, qa4Var2, null, 1);
                        xq2Var9.l0(P8);
                    }
                    mb3.i(xq2Var9, (eo2) P8, jg7Var);
                    g04.e(m26Var, ((Boolean) qa4Var2.getValue()).booleanValue(), null, null, null, null, n16.I(497749346, new ov4(k3Var, 10), xq2Var9), xq2Var9, (intValue7 & 14) | 1572864);
                } else {
                    xq2Var9.V();
                }
                return jg7Var;
            case 11:
                String str5 = (String) obj5;
                es7 es7Var = (es7) obj4;
                eo2 eo2Var = (eo2) obj;
                px0 px0Var9 = (px0) obj2;
                int intValue8 = ((Integer) obj3).intValue();
                eo2Var.getClass();
                if ((intValue8 & 6) == 0) {
                    if (((xq2) px0Var9).h(eo2Var)) {
                        i3 = 4;
                    } else {
                        i3 = 2;
                    }
                    intValue8 |= i3;
                }
                if ((intValue8 & 19) != 18) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                xq2 xq2Var10 = (xq2) px0Var9;
                if (xq2Var10.S(intValue8 & 1, z5)) {
                    e34 d = h70.d(d90.L, false);
                    int hashCode4 = Long.hashCode(xq2Var10.T);
                    xv4 l4 = xq2Var10.l();
                    a74 E4 = l.E(xq2Var10, x64Var);
                    jx0.i.getClass();
                    iy0 iy0Var4 = ix0.b;
                    xq2Var10.f0();
                    if (xq2Var10.S) {
                        xq2Var10.k(iy0Var4);
                    } else {
                        xq2Var10.o0();
                    }
                    yh2.K(xq2Var10, ix0.f, d);
                    yh2.K(xq2Var10, ix0.e, l4);
                    yh2.K(xq2Var10, ix0.g, Integer.valueOf(hashCode4));
                    yh2.F(xq2Var10, ix0.h);
                    yh2.K(xq2Var10, ix0.d, E4);
                    if (str5.length() == 0) {
                        xq2Var10.b0(143411695);
                        x37.b(yh2.O(xq2Var10, R.string.hint_search_roms), null, es7Var.i, hi2.E(16), null, null, 0L, null, 0L, 0, false, 0, 0, null, null, xq2Var10, 3072, 0, 131058);
                        xq2Var10.p(false);
                    } else {
                        xq2Var10.b0(143700956);
                        xq2Var10.p(false);
                    }
                    eo2Var.o(xq2Var10, Integer.valueOf(intValue8 & 14));
                    xq2Var10.p(true);
                } else {
                    xq2Var10.V();
                }
                return jg7Var;
            case 12:
                eb ebVar = (eb) obj4;
                int intValue9 = ((Integer) obj).intValue();
                String str6 = (String) obj2;
                fd4 fd4Var = (fd4) obj3;
                str6.getClass();
                fd4Var.getClass();
                Object obj6 = ((Map) obj5).get(str6);
                obj6.getClass();
                List<String> list2 = (List) obj6;
                if (!(fd4Var instanceof dt0) && !((gg3) ebVar.B).e().k(intValue9)) {
                    c26Var = c26.PATH;
                } else {
                    c26Var = c26.QUERY;
                }
                int i13 = d26.a[c26Var.ordinal()];
                if (i13 != 1) {
                    if (i13 == 2) {
                        for (String str7 : list2) {
                            ebVar.i(str6, str7);
                        }
                    } else {
                        i.d();
                        return null;
                    }
                } else if (list2.size() == 1) {
                    ebVar.R = ((String) ebVar.R) + '/' + ((String) gt0.H0(list2));
                } else {
                    StringBuilder t2 = i61.t("Expected one value for argument ", str6, ", found ");
                    t2.append(list2.size());
                    t2.append("values instead.");
                    throw new IllegalArgumentException(t2.toString().toString());
                }
                return jg7Var;
            case 13:
                on2 on2Var2 = (on2) obj5;
                qn2 qn2Var5 = (qn2) obj4;
                a74 a74Var = (a74) obj;
                ((Integer) obj3).getClass();
                xq2 xq2Var11 = (xq2) ((px0) obj2);
                xq2Var11.b0(759876635);
                Object P9 = xq2Var11.P();
                ii1 ii1Var = P9;
                if (P9 == vs0Var) {
                    ii1 I = np2.I(on2Var2);
                    xq2Var11.l0(I);
                    ii1Var = I;
                }
                pp6 pp6Var = (pp6) ii1Var;
                Object P10 = xq2Var11.P();
                gn gnVar2 = P10;
                if (P10 == vs0Var) {
                    gn gnVar3 = new gn(new jk4(((jk4) pp6Var.getValue()).a), qa6.b, new jk4(qa6.c), 8);
                    xq2Var11.l0(gnVar3);
                    gnVar2 = gnVar3;
                }
                gn gnVar4 = (gn) gnVar2;
                boolean h5 = xq2Var11.h(gnVar4);
                Object P11 = xq2Var11.P();
                vy5 vy5Var = P11;
                if (h5 || P11 == vs0Var) {
                    vy5 vy5Var2 = new vy5(pp6Var, gnVar4, (r41) null, 5);
                    xq2Var11.l0(vy5Var2);
                    vy5Var = vy5Var2;
                }
                mb3.i(xq2Var11, (eo2) vy5Var, jg7Var);
                uo uoVar = gnVar4.c;
                boolean f5 = xq2Var11.f(uoVar);
                Object P12 = xq2Var11.P();
                if (f5 || P12 == vs0Var) {
                    P12 = new vc4(uoVar, 1);
                    xq2Var11.l0(P12);
                }
                a74 a74Var2 = (a74) qn2Var5.g((on2) P12);
                xq2Var11.p(false);
                return a74Var2;
            case 14:
                li6 li6Var = (li6) obj5;
                mi6 mi6Var = (mi6) obj4;
                lq4 lq4Var = (lq4) obj;
                px0 px0Var10 = (px0) obj2;
                int intValue10 = ((Integer) obj3).intValue();
                lq4Var.getClass();
                if ((intValue10 & 6) == 0) {
                    if (((xq2) px0Var10).f(lq4Var)) {
                        i4 = 4;
                    } else {
                        i4 = 2;
                    }
                    intValue10 |= i4;
                }
                if ((intValue10 & 19) != 18) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                xq2 xq2Var12 = (xq2) px0Var10;
                if (xq2Var12.S(intValue10 & 1, z6)) {
                    a74 N = ge7.N(dj6.c(x64Var, 1.0f), lq4Var);
                    yt0 a4 = wt0.a(euVar, d90.k0, xq2Var12, 0);
                    int hashCode5 = Long.hashCode(xq2Var12.T);
                    xv4 l5 = xq2Var12.l();
                    a74 E5 = l.E(xq2Var12, N);
                    jx0.i.getClass();
                    iy0 iy0Var5 = ix0.b;
                    xq2Var12.f0();
                    if (xq2Var12.S) {
                        xq2Var12.k(iy0Var5);
                    } else {
                        xq2Var12.o0();
                    }
                    yh2.K(xq2Var12, ix0.f, a4);
                    yh2.K(xq2Var12, ix0.e, l5);
                    yh2.K(xq2Var12, ix0.g, Integer.valueOf(hashCode5));
                    yh2.F(xq2Var12, ix0.h);
                    yh2.K(xq2Var12, ix0.d, E5);
                    xq2Var12.b0(1253467878);
                    for (Object obj7 : li6Var.b) {
                        boolean k = nb3.k(obj7, li6Var.d);
                        a74 c2 = dj6.c(x64Var, f2);
                        boolean h6 = xq2Var12.h(li6Var) | xq2Var12.h(obj7) | xq2Var12.f(mi6Var);
                        Object P13 = xq2Var12.P();
                        if (h6 || P13 == vs0Var) {
                            P13 = new u6(li6Var, obj7, mi6Var, 20);
                            xq2Var12.l0(P13);
                        }
                        a74 f6 = dj6.f(mb3.u(c2, false, null, (on2) P13, i7), 48.0f, RecyclerView.B1, 2);
                        l26 a5 = k26.a(ju.a, d90.i0, xq2Var12, 48);
                        int hashCode6 = Long.hashCode(xq2Var12.T);
                        xv4 l6 = xq2Var12.l();
                        a74 E6 = l.E(xq2Var12, f6);
                        jx0.i.getClass();
                        iy0 iy0Var6 = ix0.b;
                        xq2Var12.f0();
                        if (xq2Var12.S) {
                            xq2Var12.k(iy0Var6);
                        } else {
                            xq2Var12.o0();
                        }
                        yh2.K(xq2Var12, ix0.f, a5);
                        yh2.K(xq2Var12, ix0.e, l6);
                        yh2.K(xq2Var12, ix0.g, Integer.valueOf(hashCode6));
                        yh2.F(xq2Var12, ix0.h);
                        yh2.K(xq2Var12, ix0.d, E6);
                        kd5.a(k, null, null, false, null, xq2Var12, 48, 60);
                        gi2.h(xq2Var12, dj6.l(x64Var, 16.0f));
                        x37.b((String) li6Var.c.g(obj7), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, ((xe7) xq2Var12.j(ye7.b)).i, xq2Var12, 0, 0, 65534);
                        xq2Var12.p(true);
                        i7 = 15;
                        f2 = 1.0f;
                    }
                    xq2Var12.p(false);
                    xq2Var12.p(true);
                } else {
                    xq2Var12.V();
                }
                return jg7Var;
            case 15:
                Spannable spannable = (Spannable) obj5;
                fj fjVar = (fj) obj4;
                nn6 nn6Var = (nn6) obj;
                int intValue11 = ((Integer) obj2).intValue();
                int intValue12 = ((Integer) obj3).intValue();
                li2 li2Var = nn6Var.f;
                oj2 oj2Var = nn6Var.c;
                if (oj2Var == null) {
                    oj2Var = oj2.Y;
                }
                ij2 ij2Var = nn6Var.d;
                if (ij2Var != null) {
                    i9 = ij2Var.a;
                }
                jj2 jj2Var = nn6Var.e;
                if (jj2Var != null) {
                    i5 = jj2Var.a;
                } else {
                    i5 = 65535;
                }
                gj gjVar = (gj) fjVar.B;
                we7 b = ((mi2) gjVar.e).b(li2Var, oj2Var, i9, i5);
                if (!(b instanceof ve7)) {
                    m44 m44Var = new m44(b, gjVar.j);
                    gjVar.j = m44Var;
                    Object obj8 = m44Var.R;
                    obj8.getClass();
                    typeface = (Typeface) obj8;
                } else {
                    Object obj9 = ((ve7) b).A;
                    obj9.getClass();
                    typeface = (Typeface) obj9;
                }
                spannable.setSpan(new js0(typeface, 2), intValue11, intValue12, 33);
                return jg7Var;
            case 16:
                eo2 eo2Var2 = (eo2) obj5;
                eo2 eo2Var3 = (eo2) obj4;
                zt0 zt0Var2 = (zt0) obj;
                px0 px0Var11 = (px0) obj2;
                int intValue13 = ((Integer) obj3).intValue();
                if ((intValue13 & 17) != 16) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                xq2 xq2Var13 = (xq2) px0Var11;
                if (xq2Var13.S(intValue13 & 1, z7)) {
                    ey6.c(eo2Var2, eo2Var3, xq2Var13, 0);
                } else {
                    xq2Var13.V();
                }
                return jg7Var;
            case 17:
                xb4 xb4Var = (xb4) obj5;
                r94 r94Var = (r94) obj4;
                a74 a74Var3 = (a74) obj;
                ((Integer) obj3).getClass();
                xq2 xq2Var14 = (xq2) ((px0) obj2);
                xq2Var14.b0(-102778667);
                Object P14 = xq2Var14.P();
                w61 w61Var = P14;
                if (P14 == vs0Var) {
                    w61 w = mb3.w(xq2Var14);
                    xq2Var14.l0(w);
                    w61Var = w;
                }
                w61 w61Var2 = (w61) w61Var;
                Object P15 = xq2Var14.P();
                vs4 vs4Var = P15;
                if (P15 == vs0Var) {
                    vs4 Y = np2.Y(null);
                    xq2Var14.l0(Y);
                    vs4Var = Y;
                }
                qa4 qa4Var3 = (qa4) vs4Var;
                qa4 b0 = np2.b0(xb4Var, xq2Var14);
                boolean f7 = xq2Var14.f(r94Var);
                Object P16 = xq2Var14.P();
                qk4 qk4Var = P16;
                if (f7 || P16 == vs0Var) {
                    qk4 qk4Var2 = new qk4(22, qa4Var3, r94Var);
                    xq2Var14.l0(qk4Var2);
                    qk4Var = qk4Var2;
                }
                mb3.d(r94Var, (qn2) qk4Var, xq2Var14);
                boolean h7 = xq2Var14.h(w61Var2) | xq2Var14.f(r94Var) | xq2Var14.f(b0);
                Object P17 = xq2Var14.P();
                d27 d27Var = P17;
                if (h7 || P17 == vs0Var) {
                    d27 d27Var2 = new d27(w61Var2, qa4Var3, r94Var, b0);
                    xq2Var14.l0(d27Var2);
                    d27Var = d27Var2;
                }
                a74 a6 = jw6.a(x64Var, r94Var, (PointerInputEventHandler) d27Var);
                xq2Var14.p(false);
                return a6;
            default:
                sr7 sr7Var = (sr7) obj5;
                on2 on2Var3 = (on2) obj4;
                px0 px0Var12 = (px0) obj2;
                int intValue14 = ((Integer) obj3).intValue();
                ((lp3) obj).getClass();
                if ((intValue14 & 17) != 16) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                xq2 xq2Var15 = (xq2) px0Var12;
                if (xq2Var15.S(intValue14 & 1, z8)) {
                    if (sr7Var == sr7.SYSTEM) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    a74 c3 = dj6.c(x64Var, 1.0f);
                    boolean f8 = xq2Var15.f(on2Var3);
                    Object P18 = xq2Var15.P();
                    if (f8 || P18 == vs0Var) {
                        P18 = new x7(21, on2Var3);
                        xq2Var15.l0(P18);
                    }
                    a74 u = mb3.u(c3, false, null, (on2) P18, 15);
                    y16 b2 = z16.b(12.0f);
                    if (z9) {
                        xq2Var15.b0(821531987);
                        xq2Var15.p(false);
                        j = kt0.c(0.15f, hv.c(4278556265L));
                    } else {
                        xq2Var15.b0(821533959);
                        j = ((ut0) xq2Var15.j(vt0.a)).j();
                        xq2Var15.p(false);
                    }
                    hf.b(u, b2, j, 2.0f, n16.I(561880451, new u4(on2Var3, z9), xq2Var15), xq2Var15, 1769472, 24);
                } else {
                    xq2Var15.V();
                }
                return jg7Var;
        }
    }
}
