package defpackage;

import android.content.Context;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.stormds.emulator.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import me.magnum.melonds.domain.model.layout.BackgroundMode;
import me.magnum.melonds.impl.emulator.debug.RendererDebugBridge;
import org.json.JSONObject;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: gi2  reason: default package */
/* loaded from: classes.dex */
public abstract class gi2 {
    public static e33 a = null;
    public static e33 b = null;
    public static String c = "file_name";
    public static final /* synthetic */ int d = 0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [qd4, java.lang.Object] */
    public static final rc4 A(Context context) {
        context.getClass();
        rc4 rc4Var = new rc4(context);
        zb4 zb4Var = rc4Var.b;
        rd4 rd4Var = zb4Var.s;
        rd4Var.a(new qc4(rd4Var));
        rd4 rd4Var2 = zb4Var.s;
        rd4Var2.a(new uw0());
        rd4Var2.a(new Object());
        return rc4Var;
    }

    public static View B(View view, int i) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View findViewById = viewGroup.getChildAt(i2).findViewById(i);
                if (findViewById != null) {
                    return findViewById;
                }
            }
            return null;
        }
        return null;
    }

    public static ua7 C(JSONObject jSONObject) {
        Object em5Var;
        try {
            String optString = jSONObject.optString("id", UUID.randomUUID().toString());
            float p = p((float) jSONObject.getDouble("left"), RecyclerView.B1, 1.0f);
            float p2 = p((float) jSONObject.getDouble("top"), RecyclerView.B1, 1.0f);
            float p3 = p((float) jSONObject.getDouble("right"), RecyclerView.B1, 1.0f);
            float p4 = p((float) jSONObject.getDouble("bottom"), RecyclerView.B1, 1.0f);
            String optString2 = jSONObject.optString("name", "");
            optString.getClass();
            RectF rectF = new RectF(p, p2, p3, p4);
            optString2.getClass();
            em5Var = new ua7(optString, rectF, optString2);
        } catch (Throwable th) {
            em5Var = new em5(th);
        }
        if (em5Var instanceof em5) {
            em5Var = null;
        }
        return (ua7) em5Var;
    }

    public static ut0 E(px0 px0Var) {
        return (ut0) ((xq2) px0Var).j(vt0.a);
    }

    public static final e33 F() {
        e33 e33Var = a;
        if (e33Var != null) {
            return e33Var;
        }
        d33 d33Var = new d33("Filled.Info", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = el7.a;
        cn6 cn6Var = new cn6(kt0.b);
        ww2 ww2Var = new ww2(1, (byte) 0);
        ww2Var.o(12.0f, 2.0f);
        ww2Var.h(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        ww2Var.q(4.48f, 10.0f, 10.0f, 10.0f);
        ww2Var.q(10.0f, -4.48f, 10.0f, -10.0f);
        ww2Var.p(17.52f, 2.0f, 12.0f, 2.0f);
        ww2Var.g();
        ww2Var.o(13.0f, 17.0f);
        ww2Var.l(-2.0f);
        ww2Var.u(-6.0f);
        ww2Var.l(2.0f);
        ww2Var.u(6.0f);
        ww2Var.g();
        ww2Var.o(13.0f, 9.0f);
        ww2Var.l(-2.0f);
        ww2Var.m(11.0f, 7.0f);
        ww2Var.l(2.0f);
        ww2Var.u(2.0f);
        ww2Var.g();
        d33.a(d33Var, ww2Var.b, 0, cn6Var);
        e33 b2 = d33Var.b();
        a = b2;
        return b2;
    }

    public static final int G(cr4 cr4Var) {
        long e;
        if (cr4Var.e == lo4.Vertical) {
            e = cr4Var.e() & 4294967295L;
        } else {
            e = cr4Var.e() >> 32;
        }
        return (int) e;
    }

    public static final e33 H() {
        e33 e33Var = b;
        if (e33Var != null) {
            return e33Var;
        }
        d33 d33Var = new d33("Filled.PlayArrow", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = el7.a;
        cn6 cn6Var = new cn6(kt0.b);
        ArrayList arrayList = new ArrayList(32);
        arrayList.add(new tt4(8.0f, 5.0f));
        arrayList.add(new fu4(14.0f));
        arrayList.add(new au4(11.0f, -7.0f));
        arrayList.add(pt4.c);
        d33.a(d33Var, arrayList, 0, cn6Var);
        e33 b2 = d33Var.b();
        b = b2;
        return b2;
    }

    public static xe7 I(px0 px0Var) {
        return (xe7) ((xq2) px0Var).j(ye7.b);
    }

    public static final long J(float f, long j, long j2) {
        return (Float.floatToRawIntBits(oi2.L(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j2 >> 32)), f)) << 32) | (Float.floatToRawIntBits(oi2.L(Float.intBitsToFloat((int) (j & 4294967295L)), Float.intBitsToFloat((int) (j2 & 4294967295L)), f)) & 4294967295L);
    }

    public static final s47 N(s47 s47Var, kk3 kk3Var) {
        int i;
        int i2;
        float f;
        nn6 nn6Var = s47Var.a;
        e37 e37Var = on6.d;
        e37 e37Var2 = nn6Var.a;
        if (e37Var2.equals(d37.a)) {
            e37Var2 = on6.d;
        }
        e37 e37Var3 = e37Var2;
        long j = nn6Var.b;
        y47[] y47VarArr = x47.b;
        if ((j & 1095216660480L) == 0) {
            j = on6.a;
        }
        long j2 = j;
        oj2 oj2Var = nn6Var.c;
        if (oj2Var == null) {
            oj2Var = oj2.Y;
        }
        oj2 oj2Var2 = oj2Var;
        ij2 ij2Var = nn6Var.d;
        if (ij2Var != null) {
            i = ij2Var.a;
        } else {
            i = 0;
        }
        ij2 ij2Var2 = new ij2(i);
        jj2 jj2Var = nn6Var.e;
        if (jj2Var != null) {
            i2 = jj2Var.a;
        } else {
            i2 = 65535;
        }
        jj2 jj2Var2 = new jj2(i2);
        li2 li2Var = nn6Var.f;
        if (li2Var == null) {
            li2Var = li2.A;
        }
        li2 li2Var2 = li2Var;
        String str = nn6Var.g;
        if (str == null) {
            str = "";
        }
        String str2 = str;
        long j3 = nn6Var.h;
        if ((j3 & 1095216660480L) == 0) {
            j3 = on6.b;
        }
        long j4 = j3;
        x20 x20Var = nn6Var.i;
        float f2 = RecyclerView.B1;
        if (x20Var != null) {
            f = x20Var.a;
        } else {
            f = 0.0f;
        }
        if (!Float.isNaN(f)) {
            f2 = f;
        }
        x20 x20Var2 = new x20(f2);
        f37 f37Var = nn6Var.j;
        if (f37Var == null) {
            f37Var = f37.c;
        }
        f37 f37Var2 = f37Var;
        gy3 gy3Var = nn6Var.k;
        if (gy3Var == null) {
            gy3 gy3Var2 = gy3.L;
            gy3Var = nx4.a.H();
        }
        gy3 gy3Var3 = gy3Var;
        long j5 = nn6Var.l;
        if (j5 == 16) {
            j5 = on6.c;
        }
        long j6 = j5;
        b17 b17Var = nn6Var.m;
        if (b17Var == null) {
            b17Var = b17.b;
        }
        b17 b17Var2 = b17Var;
        ge6 ge6Var = nn6Var.n;
        if (ge6Var == null) {
            ge6Var = ge6.d;
        }
        ge6 ge6Var2 = ge6Var;
        cy4 cy4Var = nn6Var.o;
        oo1 oo1Var = nn6Var.p;
        if (oo1Var == null) {
            oo1Var = kc2.a;
        }
        nn6 nn6Var2 = new nn6(e37Var3, j2, oj2Var2, ij2Var2, jj2Var2, li2Var2, str2, j4, x20Var2, f37Var2, gy3Var3, j6, b17Var2, ge6Var2, cy4Var, oo1Var);
        ds4 ds4Var = s47Var.b;
        int i3 = es4.b;
        int i4 = ds4Var.a;
        int i5 = 5;
        if (i4 == 0) {
            i4 = 5;
        }
        int i6 = ds4Var.b;
        if (i6 == 3) {
            int i7 = t47.a[kk3Var.ordinal()];
            if (i7 != 1) {
                if (i7 != 2) {
                    i.d();
                    return null;
                }
            } else {
                i5 = 4;
            }
            i6 = i5;
        } else if (i6 == 0) {
            int i8 = t47.a[kk3Var.ordinal()];
            if (i8 != 1) {
                if (i8 == 2) {
                    i6 = 2;
                } else {
                    i.d();
                    return null;
                }
            } else {
                i6 = 1;
            }
        }
        long j7 = ds4Var.c;
        if ((j7 & 1095216660480L) == 0) {
            j7 = es4.a;
        }
        g37 g37Var = ds4Var.d;
        if (g37Var == null) {
            g37Var = g37.c;
        }
        ux4 ux4Var = ds4Var.e;
        xu3 xu3Var = ds4Var.f;
        int i9 = ds4Var.g;
        if (i9 == 0) {
            i9 = su3.b;
        }
        int i10 = ds4Var.h;
        if (i10 == 0) {
            i10 = 1;
        }
        i47 i47Var = ds4Var.i;
        if (i47Var == null) {
            i47Var = i47.c;
        }
        return new s47(nn6Var2, new ds4(i4, i6, j7, g37Var, ux4Var, xu3Var, i9, i10, i47Var), s47Var.c);
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final gg3 O(jd1 jd1Var, hg3 hg3Var, boolean z) {
        Object l;
        gg3 gg3Var;
        gg3 C;
        fz4 fz4Var;
        ar0 O = q60.O(hg3Var);
        boolean a2 = hg3Var.a();
        List b2 = hg3Var.b();
        ArrayList arrayList = new ArrayList(ht0.v0(b2, 10));
        Iterator it = b2.iterator();
        if (!it.hasNext()) {
            if (arrayList.isEmpty()) {
                if (jx2.y(O)) {
                    jd1Var.getClass();
                }
                u63 u63Var = hc6.a;
                if (!a2) {
                    gg3Var = hc6.a.k(O);
                    if (gg3Var == null) {
                        gg3Var = null;
                    }
                } else {
                    gg3Var = hc6.b.k(O);
                }
            } else {
                jd1Var.getClass();
                u63 u63Var2 = hc6.a;
                if (!a2) {
                    l = hc6.c.l(O, arrayList);
                } else {
                    l = hc6.d.l(O, arrayList);
                }
                if (l instanceof em5) {
                    l = null;
                }
                gg3Var = (gg3) l;
            }
            if (gg3Var != null) {
                return gg3Var;
            }
            if (arrayList.isEmpty()) {
                C = jx2.M(O);
                if (C == null) {
                    jd1Var.getClass();
                    if (jx2.y(O)) {
                        fz4Var = new fz4(O);
                        C = fz4Var;
                    }
                    C = null;
                }
                if (C != null) {
                    if (a2) {
                        return q60.I(C);
                    }
                    return C;
                }
            } else {
                ArrayList O2 = jx2.O(jd1Var, arrayList, z);
                if (O2 != null) {
                    C = jx2.C(O, O2, new t46(arrayList, 7));
                    if (C == null) {
                        if (jx2.y(O)) {
                            fz4Var = new fz4(O);
                            C = fz4Var;
                        }
                        C = null;
                    }
                    if (C != null) {
                    }
                }
            }
            return null;
        }
        throw i61.j(it);
    }

    public static j93 P(int i, l93 l93Var) {
        boolean z;
        l93Var.getClass();
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        Integer valueOf = Integer.valueOf(i);
        if (z) {
            int i2 = l93Var.A;
            int i3 = l93Var.B;
            if (l93Var.L <= 0) {
                i = -i;
            }
            return new j93(i2, i3, i);
        }
        throw new IllegalArgumentException("Step must be positive, was: " + valueOf + '.');
    }

    public static final String Q(float f) {
        if (Float.isNaN(f)) {
            return "NaN";
        }
        if (Float.isInfinite(f)) {
            if (f < RecyclerView.B1) {
                return "-Infinity";
            }
            return "Infinity";
        }
        int max = Math.max(1, 0);
        float pow = (float) Math.pow(10.0d, max);
        float f2 = f * pow;
        int i = (int) f2;
        if (f2 - i >= 0.5f) {
            i++;
        }
        float f3 = i / pow;
        if (max > 0) {
            return String.valueOf(f3);
        }
        return String.valueOf((int) f3);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [j93, l93] */
    public static l93 R(int i, int i2) {
        if (i2 <= Integer.MIN_VALUE) {
            l93 l93Var = l93.R;
            return l93.R;
        }
        return new j93(i, i2 - 1, 1);
    }

    public static final void a(z23 z23Var, a74 a74Var, sr4 sr4Var, sr4 sr4Var2, px0 px0Var, int i) {
        qn2 s27Var;
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.c0(1693837359);
        e40 e40Var = d90.Z;
        pe5 E = kn2.E(yx3.a, xq2Var);
        int i2 = ((i << 3) & 7168) | 2392632;
        xq2Var.c0(-1481548872);
        nw nwVar = new nw(z23Var, y52.a, E);
        ve5 ve5Var = dk7.b;
        if (sr4Var == null && sr4Var2 == null && sr4Var2 == null) {
            s27Var = lw.p0;
        } else {
            s27Var = new s27(sr4Var, sr4Var2, sr4Var2, 3);
        }
        qn2 qn2Var = s27Var;
        f04.d(nwVar, null, a74Var, qn2Var, null, e40Var, y31.b, 1.0f, 1, xq2Var, 48 | ((i2 >> 3) & 896), 0);
        xq2Var.p(false);
        xq2Var.p(false);
    }

    public static final void b(Object obj, String str, a74 a74Var, z31 z31Var, float f, px0 px0Var, int i, int i2) {
        w31 w31Var;
        float f2;
        int i3;
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.c0(1451072229);
        e40 e40Var = d90.Z;
        if ((i2 & 64) != 0) {
            w31Var = y31.b;
        } else {
            w31Var = z31Var;
        }
        if ((i2 & 128) != 0) {
            f2 = 1.0f;
        } else {
            f2 = f;
        }
        if ((i2 & 512) != 0) {
            i3 = 1;
        } else {
            i3 = 0;
        }
        pe5 E = kn2.E(yx3.a, xq2Var);
        int i4 = i << 3;
        int i5 = (i & 112) | 520 | (i4 & 7168) | (i4 & 57344) | (i4 & 458752) | (i4 & 3670016) | (i4 & 29360128) | (i4 & 234881024) | (i4 & 1879048192);
        xq2Var.c0(2032051394);
        nw nwVar = new nw(obj, y52.a, E);
        int i6 = i5 & 112;
        int i7 = i5 >> 3;
        f04.d(nwVar, str, a74Var, lw.p0, null, e40Var, w31Var, f2, i3, xq2Var, i6 | (i7 & 896) | (i7 & 7168) | (i7 & 57344) | (i7 & 458752) | (i7 & 3670016) | (i7 & 29360128) | (i7 & 234881024) | ((((i >> 27) & 14) << 27) & 1879048192), 0);
        xq2Var.p(false);
        xq2Var.p(false);
    }

    public static final void c(a74 a74Var, an0 an0Var, on2 on2Var, px0 px0Var, int i) {
        int i2;
        int i3;
        boolean z;
        xq2 xq2Var;
        long j;
        boolean z2;
        xq2 xq2Var2;
        a74Var.getClass();
        an0Var.getClass();
        on2Var.getClass();
        xq2 xq2Var3 = (xq2) px0Var;
        xq2Var3.d0(-2038549408);
        if (xq2Var3.h(an0Var)) {
            i2 = 32;
        } else {
            i2 = 16;
        }
        int i4 = i | i2;
        if (xq2Var3.h(on2Var)) {
            i3 = 256;
        } else {
            i3 = 128;
        }
        int i5 = i4 | i3;
        if ((i5 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (xq2Var3.S(i5 & 1, z)) {
            es7 F = bl2.F(xq2Var3);
            Object P = xq2Var3.P();
            vs0 vs0Var = ox0.a;
            if (P == vs0Var) {
                P = i61.f(xq2Var3);
            }
            r94 r94Var = (r94) P;
            qa4 a2 = bw7.a(r94Var, xq2Var3, 6);
            y16 b2 = z16.b(13.0f);
            a74 g = u24.g(a74Var, b2);
            if (((Boolean) a2.getValue()).booleanValue()) {
                xq2Var = xq2Var3;
                j = F.e;
            } else {
                xq2Var = xq2Var3;
                j = F.d;
            }
            jy2 jy2Var = u24.m;
            a74 L = vy7.L(g, j, jy2Var);
            if (((Boolean) a2.getValue()).booleanValue()) {
                L = ak7.I(L, 2.0f, F.j, b2);
            }
            a74 a74Var2 = L;
            if ((i5 & 896) == 256) {
                z2 = true;
            } else {
                z2 = false;
            }
            Object P2 = xq2Var.P();
            if (!z2 && P2 != vs0Var) {
                xq2Var2 = xq2Var;
            } else {
                P2 = new x7(8, on2Var);
                xq2Var2 = xq2Var;
                xq2Var2.l0(P2);
            }
            a74 P3 = ge7.P(mb3.t(a74Var2, r94Var, null, false, null, (on2) P2, 28), 14.0f, 13.0f);
            l26 a3 = k26.a(ju.a, d90.i0, xq2Var2, 48);
            int hashCode = Long.hashCode(xq2Var2.T);
            xv4 l = xq2Var2.l();
            a74 E = l.E(xq2Var2, P3);
            jx0.i.getClass();
            iy0 iy0Var = ix0.b;
            xq2Var2.f0();
            if (xq2Var2.S) {
                xq2Var2.k(iy0Var);
            } else {
                xq2Var2.o0();
            }
            pn pnVar = ix0.f;
            yh2.K(xq2Var2, pnVar, a3);
            pn pnVar2 = ix0.e;
            yh2.K(xq2Var2, pnVar2, l);
            Integer valueOf = Integer.valueOf(hashCode);
            pn pnVar3 = ix0.g;
            yh2.K(xq2Var2, pnVar3, valueOf);
            ne neVar = ix0.h;
            yh2.F(xq2Var2, neVar);
            pn pnVar4 = ix0.d;
            yh2.K(xq2Var2, pnVar4, E);
            x64 x64Var = x64.a;
            a74 L2 = vy7.L(u24.g(dj6.i(x64Var, 34.0f), z16.b(9.0f)), F.m, jy2Var);
            e34 d2 = h70.d(d90.Z, false);
            int hashCode2 = Long.hashCode(xq2Var2.T);
            xv4 l2 = xq2Var2.l();
            a74 E2 = l.E(xq2Var2, L2);
            xq2Var2.f0();
            if (xq2Var2.S) {
                xq2Var2.k(iy0Var);
            } else {
                xq2Var2.o0();
            }
            yh2.K(xq2Var2, pnVar, d2);
            yh2.K(xq2Var2, pnVar2, l2);
            i61.w(hashCode2, xq2Var2, pnVar3, xq2Var2, neVar);
            yh2.K(xq2Var2, pnVar4, E2);
            i13.a(hi2.A(), null, dj6.i(x64Var, 19.0f), F.l, xq2Var2, 432, 0);
            xq2Var2.p(true);
            h(xq2Var2, dj6.l(x64Var, 12.0f));
            xq2 xq2Var4 = xq2Var2;
            x37.b(an0Var.b, new vn3(1.0f, true), F.g, hi2.D(13.5d), oj2.d0, null, 0L, null, 0L, 2, false, 1, 0, null, null, xq2Var4, 199680, 3120, 120784);
            xq2Var3 = xq2Var4;
            i13.a(mp2.J(), null, dj6.i(x64Var, 20.0f), F.i, xq2Var3, 432, 0);
            xq2Var3.p(true);
        } else {
            xq2Var3.V();
        }
        cf5 t = xq2Var3.t();
        if (t != null) {
            t.d = new x3(a74Var, an0Var, on2Var, i, 17);
        }
    }

    public static final void d(UUID uuid, BackgroundMode backgroundMode, eo2 eo2Var, on2 on2Var, qn2 qn2Var, on2 on2Var2, on2 on2Var3, px0 px0Var, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        boolean z;
        backgroundMode.getClass();
        eo2Var.getClass();
        on2Var.getClass();
        qn2Var.getClass();
        on2Var2.getClass();
        on2Var3.getClass();
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(-1099541442);
        if (xq2Var.h(uuid)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i9 = i | i2;
        if (xq2Var.d(backgroundMode.ordinal())) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i10 = i9 | i3;
        if (xq2Var.h(eo2Var)) {
            i4 = 256;
        } else {
            i4 = 128;
        }
        int i11 = i10 | i4;
        if (xq2Var.h(on2Var)) {
            i5 = 2048;
        } else {
            i5 = 1024;
        }
        int i12 = i11 | i5;
        if (xq2Var.h(qn2Var)) {
            i6 = 16384;
        } else {
            i6 = 8192;
        }
        int i13 = i12 | i6;
        if (xq2Var.h(on2Var2)) {
            i7 = 131072;
        } else {
            i7 = 65536;
        }
        int i14 = i13 | i7;
        if (xq2Var.h(on2Var3)) {
            i8 = 1048576;
        } else {
            i8 = 524288;
        }
        int i15 = i14 | i8;
        if ((599187 & i15) != 599186) {
            z = true;
        } else {
            z = false;
        }
        if (xq2Var.S(i15 & 1, z)) {
            Object P = xq2Var.P();
            Object obj = ox0.a;
            if (P == obj) {
                P = np2.Y(null);
                xq2Var.l0(P);
            }
            qa4 qa4Var = (qa4) P;
            qa4 b0 = np2.b0(eo2Var, xq2Var);
            boolean h = xq2Var.h(uuid) | xq2Var.f(b0);
            Object P2 = xq2Var.P();
            if (h || P2 == obj) {
                P2 = new l5(uuid, b0, qa4Var, (r41) null);
                xq2Var.l0(P2);
            }
            mb3.i(xq2Var, (eo2) P2, uuid);
            q60.a(yh2.O(xq2Var, R.string.layout_background_title), on2Var2, n16.I(62324307, new u91(on2Var, yh2.M(xq2Var, R.array.background_portrait_mode_options), backgroundMode, qn2Var, qa4Var, 2), xq2Var), n16.I(882420181, new pn0(on2Var2, on2Var3, 1), xq2Var), false, xq2Var, ((i15 >> 12) & 112) | 3456, 16);
        } else {
            xq2Var.V();
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new fo0(uuid, backgroundMode, eo2Var, on2Var, qn2Var, on2Var2, on2Var3, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:115:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void e(a74 a74Var, pr3 pr3Var, lq4 lq4Var, iu iuVar, c40 c40Var, sd2 sd2Var, boolean z, sg sgVar, qn2 qn2Var, px0 px0Var, int i, int i2) {
        a74 a74Var2;
        int i3;
        int i4;
        pr3 pr3Var2;
        pq4 pq4Var;
        int i5;
        eu euVar;
        int i6;
        c40 c40Var2;
        int i7;
        int i8;
        qn2 qn2Var2;
        boolean z2;
        xq2 xq2Var;
        sg sgVar2;
        a74 a74Var3;
        pr3 pr3Var3;
        lq4 lq4Var2;
        iu iuVar2;
        c40 c40Var3;
        sd2 sd2Var2;
        boolean z3;
        cf5 t;
        a74 a74Var4;
        a74 a74Var5;
        wd1 wd1Var;
        sg a2;
        int i9;
        boolean z4;
        int i10;
        int i11;
        int i12;
        xq2 xq2Var2 = (xq2) px0Var;
        xq2Var2.d0(53695811);
        int i13 = i2 & 1;
        if (i13 != 0) {
            i3 = i | 6;
            a74Var2 = a74Var;
        } else if ((i & 6) == 0) {
            a74Var2 = a74Var;
            if (xq2Var2.f(a74Var2)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i4 | i;
        } else {
            a74Var2 = a74Var;
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                pr3Var2 = pr3Var;
                if (xq2Var2.f(pr3Var2)) {
                    i12 = 32;
                    i3 |= i12;
                }
            } else {
                pr3Var2 = pr3Var;
            }
            i12 = 16;
            i3 |= i12;
        } else {
            pr3Var2 = pr3Var;
        }
        int i14 = i2 & 4;
        if (i14 != 0) {
            i3 |= RendererDebugBridge.CAPTURE_HEIGHT;
        } else if ((i & RendererDebugBridge.CAPTURE_HEIGHT) == 0) {
            pq4Var = lq4Var;
            if (xq2Var2.f(pq4Var)) {
                i5 = 256;
            } else {
                i5 = 128;
            }
            i3 |= i5;
            int i15 = i3 | 3072;
            if ((i & 24576) != 0) {
                if ((i2 & 16) == 0) {
                    euVar = iuVar;
                    if (xq2Var2.f(euVar)) {
                        i11 = 16384;
                        i15 |= i11;
                    }
                } else {
                    euVar = iuVar;
                }
                i11 = 8192;
                i15 |= i11;
            } else {
                euVar = iuVar;
            }
            i6 = i2 & 32;
            if (i6 == 0) {
                i15 |= 196608;
            } else if ((196608 & i) == 0) {
                c40Var2 = c40Var;
                if (xq2Var2.f(c40Var2)) {
                    i7 = 131072;
                } else {
                    i7 = 65536;
                }
                i15 |= i7;
                if ((1572864 & i) == 0) {
                    i15 |= 524288;
                }
                i8 = 12582912 | i15;
                if ((100663296 & i) == 0) {
                    i8 = 46137344 | i15;
                }
                if ((805306368 & i) == 0) {
                    qn2Var2 = qn2Var;
                    if (xq2Var2.h(qn2Var2)) {
                        i10 = 536870912;
                    } else {
                        i10 = 268435456;
                    }
                    i8 |= i10;
                } else {
                    qn2Var2 = qn2Var;
                }
                if ((306783379 & i8) != 306783378) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (xq2Var2.S(i8 & 1, z2)) {
                    xq2Var2.X();
                    if ((i & 1) != 0 && !xq2Var2.B()) {
                        xq2Var2.V();
                        if ((i2 & 2) != 0) {
                            i8 &= -113;
                        }
                        if ((i2 & 16) != 0) {
                            i8 &= -57345;
                        }
                        i9 = i8 & (-238551041);
                        wd1Var = sd2Var;
                        z4 = z;
                        a2 = sgVar;
                        a74Var5 = a74Var2;
                    } else {
                        if (i13 != 0) {
                            a74Var4 = x64.a;
                        } else {
                            a74Var4 = a74Var2;
                        }
                        if ((i2 & 2) != 0) {
                            i8 &= -113;
                            pr3Var2 = qr3.a(xq2Var2);
                        }
                        if (i14 != 0) {
                            pq4Var = new pq4(RecyclerView.B1, RecyclerView.B1, RecyclerView.B1, RecyclerView.B1);
                        }
                        if ((i2 & 16) != 0) {
                            i8 &= -57345;
                            euVar = ju.c;
                        }
                        if (i6 != 0) {
                            c40Var2 = d90.k0;
                        }
                        oc1 a3 = eo6.a(xq2Var2);
                        boolean f = xq2Var2.f(a3);
                        Object P = xq2Var2.P();
                        if (f || P == ox0.a) {
                            P = new wd1(a3);
                            xq2Var2.l0(P);
                        }
                        int i16 = i8 & (-238551041);
                        a74Var5 = a74Var4;
                        wd1Var = (wd1) P;
                        a2 = xp4.a(xq2Var2);
                        i9 = i16;
                        z4 = true;
                    }
                    pr3 pr3Var4 = pr3Var2;
                    lq4 lq4Var3 = pq4Var;
                    iu iuVar3 = euVar;
                    c40 c40Var4 = c40Var2;
                    xq2Var2.q();
                    xq2Var = xq2Var2;
                    jx2.b(a74Var5, pr3Var4, lq4Var3, true, wd1Var, z4, a2, c40Var4, iuVar3, null, null, qn2Var2, xq2Var, (i9 & 14) | 24576 | (i9 & 112) | (i9 & 896) | (i9 & 7168) | ((i9 >> 3) & 3670016) | ((i9 << 12) & 1879048192), ((i9 >> 12) & 14) | ((i9 >> 18) & 7168), 6400);
                    a74Var3 = a74Var5;
                    pr3Var3 = pr3Var4;
                    lq4Var2 = lq4Var3;
                    sd2Var2 = wd1Var;
                    z3 = z4;
                    sgVar2 = a2;
                    c40Var3 = c40Var4;
                    iuVar2 = iuVar3;
                } else {
                    xq2Var = xq2Var2;
                    xq2Var.V();
                    sgVar2 = sgVar;
                    a74Var3 = a74Var2;
                    pr3Var3 = pr3Var2;
                    lq4Var2 = pq4Var;
                    iuVar2 = euVar;
                    c40Var3 = c40Var2;
                    sd2Var2 = sd2Var;
                    z3 = z;
                }
                t = xq2Var.t();
                if (t != null) {
                    t.d = new l90(a74Var3, pr3Var3, lq4Var2, iuVar2, c40Var3, sd2Var2, z3, sgVar2, qn2Var, i, i2, 1);
                    return;
                }
                return;
            }
            c40Var2 = c40Var;
            if ((1572864 & i) == 0) {
            }
            i8 = 12582912 | i15;
            if ((100663296 & i) == 0) {
            }
            if ((805306368 & i) == 0) {
            }
            if ((306783379 & i8) != 306783378) {
            }
            if (xq2Var2.S(i8 & 1, z2)) {
            }
            t = xq2Var.t();
            if (t != null) {
            }
        }
        pq4Var = lq4Var;
        int i152 = i3 | 3072;
        if ((i & 24576) != 0) {
        }
        i6 = i2 & 32;
        if (i6 == 0) {
        }
        c40Var2 = c40Var;
        if ((1572864 & i) == 0) {
        }
        i8 = 12582912 | i152;
        if ((100663296 & i) == 0) {
        }
        if ((805306368 & i) == 0) {
        }
        if ((306783379 & i8) != 306783378) {
        }
        if (xq2Var2.S(i8 & 1, z2)) {
        }
        t = xq2Var.t();
        if (t != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:106:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void f(a74 a74Var, pr3 pr3Var, lq4 lq4Var, fu fuVar, d40 d40Var, sd2 sd2Var, boolean z, sg sgVar, qn2 qn2Var, px0 px0Var, int i, int i2) {
        a74 a74Var2;
        int i3;
        int i4;
        pr3 pr3Var2;
        pq4 pq4Var;
        int i5;
        fu fuVar2;
        int i6;
        d40 d40Var2;
        int i7;
        int i8;
        qn2 qn2Var2;
        boolean z2;
        xq2 xq2Var;
        boolean z3;
        sg sgVar2;
        a74 a74Var3;
        pr3 pr3Var3;
        lq4 lq4Var2;
        d40 d40Var3;
        sd2 sd2Var2;
        cf5 t;
        a74 a74Var4;
        a74 a74Var5;
        wd1 wd1Var;
        sg a2;
        int i9;
        boolean z4;
        int i10;
        int i11;
        int i12;
        xq2 xq2Var2 = (xq2) px0Var;
        xq2Var2.d0(-1884325601);
        int i13 = i2 & 1;
        if (i13 != 0) {
            i3 = i | 6;
            a74Var2 = a74Var;
        } else if ((i & 6) == 0) {
            a74Var2 = a74Var;
            if (xq2Var2.f(a74Var2)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i4 | i;
        } else {
            a74Var2 = a74Var;
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                pr3Var2 = pr3Var;
                if (xq2Var2.f(pr3Var2)) {
                    i12 = 32;
                    i3 |= i12;
                }
            } else {
                pr3Var2 = pr3Var;
            }
            i12 = 16;
            i3 |= i12;
        } else {
            pr3Var2 = pr3Var;
        }
        int i14 = i2 & 4;
        if (i14 != 0) {
            i3 |= RendererDebugBridge.CAPTURE_HEIGHT;
        } else if ((i & RendererDebugBridge.CAPTURE_HEIGHT) == 0) {
            pq4Var = lq4Var;
            if (xq2Var2.f(pq4Var)) {
                i5 = 256;
            } else {
                i5 = 128;
            }
            i3 |= i5;
            int i15 = i3 | 3072;
            if ((i & 24576) != 0) {
                fuVar2 = fuVar;
                if (xq2Var2.f(fuVar2)) {
                    i11 = 16384;
                } else {
                    i11 = 8192;
                }
                i15 |= i11;
            } else {
                fuVar2 = fuVar;
            }
            i6 = i2 & 32;
            if (i6 == 0) {
                i15 |= 196608;
            } else if ((196608 & i) == 0) {
                d40Var2 = d40Var;
                if (xq2Var2.f(d40Var2)) {
                    i7 = 131072;
                } else {
                    i7 = 65536;
                }
                i15 |= i7;
                if ((1572864 & i) == 0) {
                    i15 |= 524288;
                }
                i8 = 12582912 | i15;
                if ((100663296 & i) == 0) {
                    i8 = 46137344 | i15;
                }
                if ((805306368 & i) == 0) {
                    qn2Var2 = qn2Var;
                    if (xq2Var2.h(qn2Var2)) {
                        i10 = 536870912;
                    } else {
                        i10 = 268435456;
                    }
                    i8 |= i10;
                } else {
                    qn2Var2 = qn2Var;
                }
                if ((306783379 & i8) != 306783378) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (xq2Var2.S(i8 & 1, z2)) {
                    xq2Var2.X();
                    if ((i & 1) != 0 && !xq2Var2.B()) {
                        xq2Var2.V();
                        if ((i2 & 2) != 0) {
                            i8 &= -113;
                        }
                        i9 = i8 & (-238551041);
                        wd1Var = sd2Var;
                        z4 = z;
                        a2 = sgVar;
                        a74Var5 = a74Var2;
                    } else {
                        if (i13 != 0) {
                            a74Var4 = x64.a;
                        } else {
                            a74Var4 = a74Var2;
                        }
                        if ((i2 & 2) != 0) {
                            i8 &= -113;
                            pr3Var2 = qr3.a(xq2Var2);
                        }
                        if (i14 != 0) {
                            pq4Var = new pq4(RecyclerView.B1, RecyclerView.B1, RecyclerView.B1, RecyclerView.B1);
                        }
                        if (i6 != 0) {
                            d40Var2 = d90.h0;
                        }
                        oc1 a3 = eo6.a(xq2Var2);
                        boolean f = xq2Var2.f(a3);
                        Object P = xq2Var2.P();
                        if (f || P == ox0.a) {
                            P = new wd1(a3);
                            xq2Var2.l0(P);
                        }
                        int i16 = i8 & (-238551041);
                        a74Var5 = a74Var4;
                        wd1Var = (wd1) P;
                        a2 = xp4.a(xq2Var2);
                        i9 = i16;
                        z4 = true;
                    }
                    pr3 pr3Var4 = pr3Var2;
                    lq4 lq4Var3 = pq4Var;
                    d40 d40Var4 = d40Var2;
                    xq2Var2.q();
                    xq2Var = xq2Var2;
                    jx2.b(a74Var5, pr3Var4, lq4Var3, false, wd1Var, z4, a2, null, null, d40Var4, fuVar2, qn2Var2, xq2Var, (i9 & 14) | 24576 | (i9 & 112) | (i9 & 896) | (i9 & 7168) | ((i9 >> 3) & 3670016), ((i9 >> 12) & 112) | ((i9 >> 6) & 896) | ((i9 >> 18) & 7168), 1792);
                    a74Var3 = a74Var5;
                    pr3Var3 = pr3Var4;
                    lq4Var2 = lq4Var3;
                    sd2Var2 = wd1Var;
                    z3 = z4;
                    sgVar2 = a2;
                    d40Var3 = d40Var4;
                } else {
                    xq2Var = xq2Var2;
                    xq2Var.V();
                    z3 = z;
                    sgVar2 = sgVar;
                    a74Var3 = a74Var2;
                    pr3Var3 = pr3Var2;
                    lq4Var2 = pq4Var;
                    d40Var3 = d40Var2;
                    sd2Var2 = sd2Var;
                }
                t = xq2Var.t();
                if (t != null) {
                    t.d = new l90(a74Var3, pr3Var3, lq4Var2, fuVar, d40Var3, sd2Var2, z3, sgVar2, qn2Var, i, i2, 2);
                    return;
                }
                return;
            }
            d40Var2 = d40Var;
            if ((1572864 & i) == 0) {
            }
            i8 = 12582912 | i15;
            if ((100663296 & i) == 0) {
            }
            if ((805306368 & i) == 0) {
            }
            if ((306783379 & i8) != 306783378) {
            }
            if (xq2Var2.S(i8 & 1, z2)) {
            }
            t = xq2Var.t();
            if (t != null) {
            }
        }
        pq4Var = lq4Var;
        int i152 = i3 | 3072;
        if ((i & 24576) != 0) {
        }
        i6 = i2 & 32;
        if (i6 == 0) {
        }
        d40Var2 = d40Var;
        if ((1572864 & i) == 0) {
        }
        i8 = 12582912 | i152;
        if ((100663296 & i) == 0) {
        }
        if ((805306368 & i) == 0) {
        }
        if ((306783379 & i8) != 306783378) {
        }
        if (xq2Var2.S(i8 & 1, z2)) {
        }
        t = xq2Var.t();
        if (t != null) {
        }
    }

    public static final void g(zv0 zv0Var, px0 px0Var, int i) {
        boolean z;
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(-709502251);
        if ((i & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        if (xq2Var.S(i & 1, z)) {
            nq6 nq6Var = s46.a;
            q46 q46Var = (q46) xq2Var.j(nq6Var);
            p46 C = nj2.C(xq2Var);
            Object[] objArr = {q46Var};
            ap3 ap3Var = new ap3(28, new ep3(2, (byte) 0), new bi2(18, q46Var, C));
            boolean h = xq2Var.h(q46Var) | xq2Var.h(C);
            Object P = xq2Var.P();
            if (h || P == ox0.a) {
                P = new ci2(11, q46Var, C);
                xq2Var.l0(P);
            }
            rr3 rr3Var = (rr3) qo2.J(objArr, ap3Var, (on2) P, xq2Var, 0);
            hv.d(nq6Var.a(rr3Var), n16.I(-412824043, new ql1(22, zv0Var, rr3Var), xq2Var), xq2Var, 56);
        } else {
            xq2Var.V();
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new eq(zv0Var, i, 4);
        }
    }

    public static final void h(px0 px0Var, a74 a74Var) {
        fc fcVar = fc.m;
        xq2 xq2Var = (xq2) px0Var;
        int hashCode = Long.hashCode(xq2Var.T);
        a74 E = l.E(px0Var, a74Var);
        xv4 l = xq2Var.l();
        jx0.i.getClass();
        iy0 iy0Var = ix0.b;
        xq2 xq2Var2 = (xq2) px0Var;
        xq2Var2.f0();
        if (xq2Var2.S) {
            xq2Var2.k(iy0Var);
        } else {
            xq2Var2.o0();
        }
        yh2.K(px0Var, ix0.f, fcVar);
        yh2.K(px0Var, ix0.e, l);
        yh2.F(px0Var, ix0.h);
        yh2.K(px0Var, ix0.d, E);
        yh2.K(px0Var, ix0.g, Integer.valueOf(hashCode));
        xq2Var2.p(true);
    }

    public static final float i(cx4 cx4Var, boolean z, hy2[] hy2VarArr, float f) {
        boolean z2;
        float f2 = Float.NaN;
        for (hy2 hy2Var : hy2VarArr) {
            float c2 = cx4Var.c(hy2Var);
            if (!Float.isNaN(f2)) {
                if (c2 > f2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z != z2) {
                }
            }
            f2 = c2;
        }
        if (Float.isNaN(f2)) {
            return f;
        }
        return f2;
    }

    public static final void j(x32 x32Var) {
        hs6 hs6Var;
        x32Var.getClass();
        if (x32Var instanceof hs6) {
            hs6Var = (hs6) x32Var;
        } else {
            hs6Var = null;
        }
        if (hs6Var != null) {
            return;
        }
        e41.z(gh5.a(x32Var.getClass()), "This serializer can be used only with Json format.Expected Encoder to be JsonEncoder, got ");
    }

    public static final void k(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("?");
            if (i2 < i - 1) {
                sb.append(",");
            }
        }
    }

    public static final yd3 l(sc1 sc1Var) {
        yd3 yd3Var;
        sc1Var.getClass();
        if (sc1Var instanceof yd3) {
            yd3Var = (yd3) sc1Var;
        } else {
            yd3Var = null;
        }
        if (yd3Var != null) {
            return yd3Var;
        }
        e41.z(gh5.a(sc1Var.getClass()), "This serializer can be used only with Json format.Expected Decoder to be JsonDecoder, got ");
        return null;
    }

    public static final Object m(gx3 gx3Var, s41 s41Var) {
        try {
            if (gx3Var.isDone()) {
                return r1.f(gx3Var);
            }
            rj0 rj0Var = new rj0(1, np2.V(s41Var));
            gx3Var.a(sj1.INSTANCE, new m67(gx3Var, rj0Var, 1));
            rj0Var.z(new mc(gx3Var, 19));
            Object s = rj0Var.s();
            x61 x61Var = x61.COROUTINE_SUSPENDED;
            return s;
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            if (cause != null) {
                throw cause;
            }
            NullPointerException nullPointerException = new NullPointerException();
            nb3.V(nullPointerException, nb3.class.getName());
            throw nullPointerException;
        }
    }

    public static double o(double d2, double d3, double d4) {
        if (d3 <= d4) {
            if (d2 < d3) {
                return d3;
            }
            if (d2 > d4) {
                return d4;
            }
            return d2;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + d4 + " is less than minimum " + d3 + '.');
    }

    public static float p(float f, float f2, float f3) {
        if (f2 <= f3) {
            if (f < f2) {
                return f2;
            }
            if (f > f3) {
                return f3;
            }
            return f;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f3 + " is less than minimum " + f2 + '.');
    }

    public static int q(int i, int i2, int i3) {
        if (i2 <= i3) {
            if (i < i2) {
                return i2;
            }
            if (i > i3) {
                return i3;
            }
            return i;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i3 + " is less than minimum " + i2 + '.');
    }

    public static int r(int i, l93 l93Var) {
        int i2 = l93Var.B;
        int i3 = l93Var.A;
        if (!l93Var.isEmpty()) {
            if (i < Integer.valueOf(i3).intValue()) {
                return Integer.valueOf(i3).intValue();
            }
            if (i > Integer.valueOf(i2).intValue()) {
                return Integer.valueOf(i2).intValue();
            }
            return i;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + l93Var + '.');
    }

    public static long s(long j, long j2, long j3) {
        if (j2 <= j3) {
            if (j < j2) {
                return j2;
            }
            if (j > j3) {
                return j3;
            }
            return j;
        }
        StringBuilder s = xg6.s(j3, "Cannot coerce value to an empty range: maximum ", " is less than minimum ");
        s.append(j2);
        s.append('.');
        throw new IllegalArgumentException(s.toString());
    }

    public static Comparable t(Comparable comparable, bs0 bs0Var) {
        bs0Var.getClass();
        float f = bs0Var.b;
        float f2 = bs0Var.a;
        if (!bs0Var.c()) {
            if (bs0.d(comparable, Float.valueOf(f2)) && !bs0.d(Float.valueOf(f2), comparable)) {
                return Float.valueOf(f2);
            }
            if (bs0.d(Float.valueOf(f), comparable) && !bs0.d(comparable, Float.valueOf(f))) {
                return Float.valueOf(f);
            }
            return comparable;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + bs0Var + '.');
    }

    public static final qa4 u(r94 r94Var, px0 px0Var) {
        xq2 xq2Var = (xq2) px0Var;
        Object P = xq2Var.P();
        vs0 vs0Var = ox0.a;
        if (P == vs0Var) {
            P = np2.Y(Boolean.FALSE);
            xq2Var.l0(P);
        }
        qa4 qa4Var = (qa4) P;
        Object P2 = xq2Var.P();
        if (P2 == vs0Var) {
            P2 = new vg2(r94Var, qa4Var, null, 1);
            xq2Var.l0(P2);
        }
        mb3.i(xq2Var, (eo2) P2, r94Var);
        return qa4Var;
    }

    public static byte[] v(String str, byte[] bArr, byte[] bArr2, byte[] bArr3, int i) {
        Mac mac = (Mac) p42.f.a(str);
        if (i <= mac.getMacLength() * 255) {
            if (bArr2.length == 0) {
                mac.init(new SecretKeySpec(new byte[mac.getMacLength()], str));
            } else {
                mac.init(new SecretKeySpec(bArr2, str));
            }
            byte[] bArr4 = new byte[i];
            mac.init(new SecretKeySpec(mac.doFinal(bArr), str));
            byte[] bArr5 = new byte[0];
            int i2 = 1;
            int i3 = 0;
            while (true) {
                mac.update(bArr5);
                mac.update(bArr3);
                mac.update((byte) i2);
                bArr5 = mac.doFinal();
                if (bArr5.length + i3 < i) {
                    System.arraycopy(bArr5, 0, bArr4, i3, bArr5.length);
                    i3 += bArr5.length;
                    i2++;
                } else {
                    System.arraycopy(bArr5, 0, bArr4, i3, i - i3);
                    return bArr4;
                }
            }
        } else {
            e41.v("size too large");
            return null;
        }
    }

    public static int w(sg5 sg5Var, ts1 ts1Var, View view, View view2, gg5 gg5Var, boolean z) {
        if (gg5Var.v() != 0 && sg5Var.b() != 0 && view != null && view2 != null) {
            if (!z) {
                return Math.abs(gg5.G(view) - gg5.G(view2)) + 1;
            }
            return Math.min(ts1Var.n(), ts1Var.d(view2) - ts1Var.g(view));
        }
        return 0;
    }

    public static int x(sg5 sg5Var, ts1 ts1Var, View view, View view2, gg5 gg5Var, boolean z, boolean z2) {
        int max;
        if (gg5Var.v() == 0 || sg5Var.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int min = Math.min(gg5.G(view), gg5.G(view2));
        int max2 = Math.max(gg5.G(view), gg5.G(view2));
        if (z2) {
            max = Math.max(0, (sg5Var.b() - max2) - 1);
        } else {
            max = Math.max(0, min);
        }
        if (!z) {
            return max;
        }
        return Math.round((max * (Math.abs(ts1Var.d(view2) - ts1Var.g(view)) / (Math.abs(gg5.G(view) - gg5.G(view2)) + 1))) + (ts1Var.m() - ts1Var.g(view)));
    }

    public static int y(sg5 sg5Var, ts1 ts1Var, View view, View view2, gg5 gg5Var, boolean z) {
        if (gg5Var.v() != 0 && sg5Var.b() != 0 && view != null && view2 != null) {
            if (!z) {
                return sg5Var.b();
            }
            return (int) (((ts1Var.d(view2) - ts1Var.g(view)) / (Math.abs(gg5.G(view) - gg5.G(view2)) + 1)) * sg5Var.b());
        }
        return 0;
    }

    public abstract Object D(j41 j41Var);

    public abstract void K(int i);

    public abstract void L(Typeface typeface);

    public abstract void M(Typeface typeface, boolean z);

    public void n(int i) {
        new Handler(Looper.getMainLooper()).post(new om(this, i, 5));
    }

    public abstract boolean z(j41 j41Var);
}
