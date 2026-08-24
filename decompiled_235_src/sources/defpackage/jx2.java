package defpackage;

import android.view.View;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import com.github.junrar.unpack.decode.Compress;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import me.magnum.melonds.impl.emulator.debug.RendererDebugBridge;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: jx2  reason: default package */
/* loaded from: classes.dex */
public final class jx2 {
    public static e33 b;
    public static final /* synthetic */ int c = 0;
    public static final /* synthetic */ int d = 0;
    public final /* synthetic */ int a;

    public static String A(String str, String str2) {
        int length = str.length() - str2.length();
        if (length >= 0 && length <= 1) {
            StringBuilder sb = new StringBuilder(str2.length() + str.length());
            for (int i = 0; i < str.length(); i++) {
                sb.append(str.charAt(i));
                if (str2.length() > i) {
                    sb.append(str2.charAt(i));
                }
            }
            return sb.toString();
        }
        i.h("Invalid input received");
        return null;
    }

    public static final void B(z64 z64Var, on2 on2Var) {
        hi4 hi4Var = z64Var.Z;
        if (hi4Var == null) {
            hi4Var = new hi4((gi4) z64Var);
            z64Var.Z = hi4Var;
        }
        bq4 snapshotObserver = ((te) nc1.g0(z64Var)).getSnapshotObserver();
        snapshotObserver.a.d(hi4Var, hh2.f0, on2Var);
    }

    public static final gg3 C(ar0 ar0Var, ArrayList arrayList, on2 on2Var) {
        gg3 ruVar;
        gg3 eh5Var;
        ar0Var.getClass();
        Class cls = ar0Var.a;
        if (!ar0Var.equals(gh5.a(Collection.class)) && !ar0Var.equals(gh5.a(List.class)) && !ar0Var.equals(gh5.a(List.class)) && !ar0Var.equals(gh5.a(ArrayList.class))) {
            if (ar0Var.equals(gh5.a(HashSet.class))) {
                ruVar = new ru((gg3) arrayList.get(0), 1);
            } else if (!ar0Var.equals(gh5.a(Set.class)) && !ar0Var.equals(gh5.a(Set.class)) && !ar0Var.equals(gh5.a(LinkedHashSet.class))) {
                if (ar0Var.equals(gh5.a(HashMap.class))) {
                    ruVar = new qw2((gg3) arrayList.get(0), (gg3) arrayList.get(1), 0);
                } else if (!ar0Var.equals(gh5.a(Map.class)) && !ar0Var.equals(gh5.a(Map.class)) && !ar0Var.equals(gh5.a(LinkedHashMap.class))) {
                    if (ar0Var.equals(gh5.a(Map.Entry.class))) {
                        gg3 gg3Var = (gg3) arrayList.get(0);
                        gg3 gg3Var2 = (gg3) arrayList.get(1);
                        gg3Var.getClass();
                        gg3Var2.getClass();
                        eh5Var = new w04(gg3Var, gg3Var2, 0);
                    } else if (ar0Var.equals(gh5.a(vr4.class))) {
                        gg3 gg3Var3 = (gg3) arrayList.get(0);
                        gg3 gg3Var4 = (gg3) arrayList.get(1);
                        gg3Var3.getClass();
                        gg3Var4.getClass();
                        eh5Var = new w04(gg3Var3, gg3Var4, 1);
                    } else if (ar0Var.equals(gh5.a(oc7.class))) {
                        gg3 gg3Var5 = (gg3) arrayList.get(0);
                        gg3 gg3Var6 = (gg3) arrayList.get(1);
                        gg3 gg3Var7 = (gg3) arrayList.get(2);
                        gg3Var5.getClass();
                        gg3Var6.getClass();
                        gg3Var7.getClass();
                        ruVar = new pc7(gg3Var5, gg3Var6, gg3Var7);
                    } else {
                        cls.getClass();
                        if (cls.isArray()) {
                            Object c2 = on2Var.c();
                            c2.getClass();
                            gg3 gg3Var8 = (gg3) arrayList.get(0);
                            gg3Var8.getClass();
                            eh5Var = new eh5((ar0) c2, gg3Var8);
                        } else {
                            ruVar = null;
                        }
                    }
                    ruVar = eh5Var;
                } else {
                    ruVar = new qw2((gg3) arrayList.get(0), (gg3) arrayList.get(1), 1);
                }
            } else {
                ruVar = new ru((gg3) arrayList.get(0), 2);
            }
        } else {
            ruVar = new ru((gg3) arrayList.get(0), 0);
        }
        if (ruVar == null) {
            gg3[] gg3VarArr = (gg3[]) arrayList.toArray(new gg3[0]);
            gg3[] gg3VarArr2 = (gg3[]) Arrays.copyOf(gg3VarArr, gg3VarArr.length);
            cls.getClass();
            return p(cls, (gg3[]) Arrays.copyOf(gg3VarArr2, gg3VarArr2.length));
        }
        return ruVar;
    }

    public static cm7 D(String str) {
        String group;
        String str2;
        if (str != null && !qs6.v0(str)) {
            Matcher matcher = Pattern.compile("(\\d+)(?:\\.(\\d+))(?:\\.(\\d+))(?:-(.+))?").matcher(str);
            if (matcher.matches() && (group = matcher.group(1)) != null) {
                int parseInt = Integer.parseInt(group);
                String group2 = matcher.group(2);
                if (group2 != null) {
                    int parseInt2 = Integer.parseInt(group2);
                    String group3 = matcher.group(3);
                    if (group3 != null) {
                        int parseInt3 = Integer.parseInt(group3);
                        if (matcher.group(4) != null) {
                            str2 = matcher.group(4);
                        } else {
                            str2 = "";
                        }
                        str2.getClass();
                        return new cm7(parseInt, parseInt2, parseInt3, str2);
                    }
                    return null;
                }
                return null;
            }
            return null;
        }
        return null;
    }

    public static final g81 E(vh2 vh2Var, int i) {
        int i2 = wh2.a[vh2Var.W0().ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                g81 g81Var = null;
                if (i2 != 3) {
                    if (i2 != 4) {
                        i.d();
                        return null;
                    }
                } else {
                    vh2 t = yh2.t(vh2Var);
                    if (t != null) {
                        g81 E = E(t, i);
                        g81 g81Var2 = g81.None;
                        if (E != g81Var2) {
                            g81Var = E;
                        }
                        if (g81Var == null) {
                            if (!vh2Var.l0) {
                                vh2Var.l0 = true;
                                try {
                                    ih2 T0 = vh2Var.T0();
                                    mj0 mj0Var = new mj0(i);
                                    eh2 eh2Var = (eh2) ((te) nc1.g0(vh2Var)).getFocusOwner();
                                    vh2 f = eh2Var.f();
                                    T0.k.g(mj0Var);
                                    vh2 f2 = eh2Var.f();
                                    if (mj0Var.b) {
                                        nh2 nh2Var = nh2.b;
                                        return g81.Cancelled;
                                    } else if (f != f2 && f2 != null) {
                                        if (nh2.d == nh2.c) {
                                            return g81.Cancelled;
                                        }
                                        return g81.Redirected;
                                    } else {
                                        return g81Var2;
                                    }
                                } finally {
                                    vh2Var.l0 = false;
                                }
                            }
                            return g81Var2;
                        }
                        return g81Var;
                    }
                    i.h("ActiveParent with no focused child");
                    return null;
                }
            } else {
                return g81.Cancelled;
            }
        }
        return g81.None;
    }

    public static final g81 F(vh2 vh2Var) {
        if (!vh2Var.m0) {
            vh2Var.m0 = true;
            try {
                ih2 T0 = vh2Var.T0();
                eh2 eh2Var = (eh2) ((te) nc1.g0(vh2Var)).getFocusOwner();
                vh2 f = eh2Var.f();
                T0.j.getClass();
                vh2 f2 = eh2Var.f();
                if (f != f2 && f2 != null) {
                    if (nh2.d == nh2.c) {
                        return g81.Cancelled;
                    }
                    return g81.Redirected;
                }
            } finally {
                vh2Var.m0 = false;
            }
        }
        return g81.None;
    }

    public static final g81 G(vh2 vh2Var, int i) {
        vh2 vh2Var2;
        if0 if0Var;
        int i2 = wh2.a[vh2Var.W0().ordinal()];
        if (i2 != 1 && i2 != 2) {
            g81 g81Var = null;
            if (i2 != 3) {
                if (i2 == 4) {
                    if (!vh2Var.A.j0) {
                        p53.c("visitAncestors called on an unattached node");
                    }
                    z64 z64Var = vh2Var.A.X;
                    sm3 f0 = nc1.f0(vh2Var);
                    loop0: while (true) {
                        if (f0 != null) {
                            if ((((z64) f0.B0.g).R & 1024) != 0) {
                                while (z64Var != null) {
                                    if ((z64Var.L & 1024) != 0) {
                                        vh2Var2 = z64Var;
                                        ua4 ua4Var = null;
                                        while (vh2Var2 != null) {
                                            if (vh2Var2 instanceof vh2) {
                                                break loop0;
                                            }
                                            if ((vh2Var2.L & 1024) != 0 && (vh2Var2 instanceof zg1)) {
                                                int i3 = 0;
                                                for (z64 z64Var2 = ((zg1) vh2Var2).l0; z64Var2 != null; z64Var2 = z64Var2.Y) {
                                                    if ((z64Var2.L & 1024) != 0) {
                                                        i3++;
                                                        if (i3 == 1) {
                                                            vh2Var2 = z64Var2;
                                                        } else {
                                                            if (ua4Var == null) {
                                                                ua4Var = new ua4(new z64[16]);
                                                            }
                                                            if (vh2Var2 != null) {
                                                                ua4Var.b(vh2Var2);
                                                                vh2Var2 = null;
                                                            }
                                                            ua4Var.b(z64Var2);
                                                        }
                                                    }
                                                }
                                                if (i3 == 1) {
                                                }
                                            }
                                            vh2Var2 = nc1.A(ua4Var);
                                        }
                                        continue;
                                    }
                                    z64Var = z64Var.X;
                                }
                            }
                            f0 = f0.v();
                            if (f0 != null && (if0Var = f0.B0) != null) {
                                z64Var = (vy6) if0Var.f;
                            } else {
                                z64Var = null;
                            }
                        } else {
                            vh2Var2 = null;
                            break;
                        }
                    }
                    vh2 vh2Var3 = vh2Var2;
                    if (vh2Var3 == null) {
                        return g81.None;
                    }
                    int i4 = wh2.a[vh2Var3.W0().ordinal()];
                    if (i4 != 1) {
                        if (i4 != 2) {
                            if (i4 != 3) {
                                if (i4 == 4) {
                                    g81 G = G(vh2Var3, i);
                                    if (G != g81.None) {
                                        g81Var = G;
                                    }
                                    if (g81Var == null) {
                                        return F(vh2Var3);
                                    }
                                    return g81Var;
                                }
                                i.d();
                                return null;
                            }
                            return G(vh2Var3, i);
                        }
                        return g81.Cancelled;
                    }
                    return F(vh2Var3);
                }
                i.d();
                return null;
            }
            vh2 t = yh2.t(vh2Var);
            if (t != null) {
                return E(t, i);
            }
            i.h("ActiveParent with no focused child");
            return null;
        }
        return g81.None;
    }

    public static final long H(s43 s43Var, lo4 lo4Var, r43 r43Var, boolean z) {
        float intBitsToFloat;
        long floatToRawIntBits;
        long floatToRawIntBits2;
        long j = s43Var.g;
        if (lo4Var != null) {
            int i = r43Var.a;
            if (i == 1) {
                intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
            } else if (i == 2) {
                intBitsToFloat = Float.intBitsToFloat((int) (j & 4294967295L));
            }
            if (lo4Var == lo4.Horizontal) {
                floatToRawIntBits = Float.floatToRawIntBits(RecyclerView.B1);
                floatToRawIntBits2 = Float.floatToRawIntBits(intBitsToFloat) << 32;
            } else {
                floatToRawIntBits = Float.floatToRawIntBits(intBitsToFloat);
                floatToRawIntBits2 = Float.floatToRawIntBits(RecyclerView.B1) << 32;
            }
            j = floatToRawIntBits2 | (floatToRawIntBits & 4294967295L);
        }
        long e = jk4.e(I(s43Var, lo4Var, r43Var), j);
        if (!z && s43Var.i) {
            return 0L;
        }
        return e;
    }

    public static final long I(s43 s43Var, lo4 lo4Var, r43 r43Var) {
        float intBitsToFloat;
        long floatToRawIntBits;
        long floatToRawIntBits2;
        if (lo4Var == null) {
            return s43Var.c;
        }
        int i = r43Var.a;
        if (i == 1) {
            intBitsToFloat = Float.intBitsToFloat((int) (s43Var.c >> 32));
        } else if (i == 2) {
            intBitsToFloat = Float.intBitsToFloat((int) (s43Var.c & 4294967295L));
        } else {
            return s43Var.c;
        }
        if (lo4Var == lo4.Horizontal) {
            floatToRawIntBits = Float.floatToRawIntBits(RecyclerView.B1);
            floatToRawIntBits2 = Float.floatToRawIntBits(intBitsToFloat) << 32;
        } else {
            floatToRawIntBits = Float.floatToRawIntBits(intBitsToFloat);
            floatToRawIntBits2 = Float.floatToRawIntBits(RecyclerView.B1) << 32;
        }
        return floatToRawIntBits2 | (4294967295L & floatToRawIntBits);
    }

    public static final mi6 J(px0 px0Var) {
        xq2 xq2Var = (xq2) px0Var;
        Object P = xq2Var.P();
        if (P == ox0.a) {
            P = new mi6();
            xq2Var.l0(P);
        }
        return (mi6) P;
    }

    public static final gg3 K(ar0 ar0Var) {
        ar0Var.getClass();
        gg3 M = M(ar0Var);
        if (M != null) {
            return M;
        }
        throw new IllegalArgumentException(q60.P(ar0Var));
    }

    public static final gg3 L(jd1 jd1Var, Type type) {
        jd1Var.getClass();
        type.getClass();
        gg3 J = yh2.J(jd1Var, type, true);
        if (J != null) {
            return J;
        }
        Class D = yh2.D(type);
        D.getClass();
        throw new IllegalArgumentException(q60.P(gh5.a(D)));
    }

    public static final gg3 M(ar0 ar0Var) {
        ar0Var.getClass();
        Class cls = ar0Var.a;
        cls.getClass();
        gg3 p = p(cls, (gg3[]) Arrays.copyOf(new gg3[0], 0));
        if (p == null) {
            return (gg3) a35.a.get(ar0Var);
        }
        return p;
    }

    public static final gg3 N(jd1 jd1Var, hg3 hg3Var) {
        jd1Var.getClass();
        hg3Var.getClass();
        return gi2.O(jd1Var, hg3Var, false);
    }

    public static final ArrayList O(jd1 jd1Var, List list, boolean z) {
        jd1Var.getClass();
        list.getClass();
        if (z) {
            ArrayList arrayList = new ArrayList(ht0.v0(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                hg3 hg3Var = (hg3) it.next();
                hg3Var.getClass();
                gg3 O = gi2.O(jd1Var, hg3Var, true);
                if (O != null) {
                    arrayList.add(O);
                } else {
                    throw new IllegalArgumentException(q60.P(q60.O(hg3Var)));
                }
            }
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(ht0.v0(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            gg3 N = N(jd1Var, (hg3) it2.next());
            if (N == null) {
                return null;
            }
            arrayList2.add(N);
        }
        return arrayList2;
    }

    public static void P(View view, p24 p24Var) {
        ps1 ps1Var = p24Var.B.c;
        if (ps1Var != null && ps1Var.a) {
            float f = RecyclerView.B1;
            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                f += ((View) parent).getElevation();
            }
            n24 n24Var = p24Var.B;
            if (n24Var.m != f) {
                n24Var.m = f;
                p24Var.s();
            }
        }
    }

    public static final double Q(long j) {
        return ((j >>> 11) * 2048.0d) + (j & 2047);
    }

    public static final String R(int i, long j) {
        if (j >= 0) {
            g04.y(i);
            String l = Long.toString(j, i);
            l.getClass();
            return l;
        }
        long j2 = i;
        long j3 = ((j >>> 1) / j2) << 1;
        long j4 = j - (j3 * j2);
        if (j4 >= j2) {
            j4 -= j2;
            j3++;
        }
        g04.y(i);
        String l2 = Long.toString(j3, i);
        l2.getClass();
        g04.y(i);
        String l3 = Long.toString(j4, i);
        l3.getClass();
        return l2.concat(l3);
    }

    public static final void S(xa6 xa6Var, int i, f76 f76Var) {
        xa6 xa6Var2;
        ua4 ua4Var = new ua4(new xa6[16]);
        List i2 = xa6Var.i(false, false);
        while (true) {
            ua4Var.d(ua4Var.L, i2);
            while (true) {
                int i3 = ua4Var.L;
                if (i3 != 0) {
                    xa6Var2 = (xa6) ua4Var.l(i3 - 1);
                    boolean v = u24.v(xa6Var2);
                    ta6 ta6Var = xa6Var2.d;
                    ja4 ja4Var = ta6Var.A;
                    if (!v && !ja4Var.c(bb6.j)) {
                        eg4 d2 = xa6Var2.d();
                        if (d2 != null) {
                            m93 W = ln2.W(ej2.k(d2, true));
                            if (W.a < W.c && W.b < W.d) {
                                Object g = ta6Var.A.g(sa6.e);
                                e76 e76Var = null;
                                if (g == null) {
                                    g = null;
                                }
                                eo2 eo2Var = (eo2) g;
                                Object g2 = ja4Var.g(bb6.w);
                                if (g2 != null) {
                                    e76Var = g2;
                                }
                                e76 e76Var2 = e76Var;
                                if (eo2Var != null && e76Var2 != null && ((Number) e76Var2.b.c()).floatValue() > RecyclerView.B1) {
                                    int i4 = 1 + i;
                                    f76Var.g(new g76(xa6Var2, i4, W, d2));
                                    S(xa6Var2, i4, f76Var);
                                }
                            }
                        } else {
                            throw i61.e("Expected semantics node to have a coordinator.");
                        }
                    }
                } else {
                    return;
                }
            }
            i2 = xa6Var2.i(false, false);
        }
    }

    public static final void a(a74 a74Var, s95 s95Var, px0 px0Var, int i) {
        int i2;
        int i3;
        boolean z;
        s95Var.getClass();
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(-1151379056);
        if (xq2Var.f(a74Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i4 = i2 | i;
        if (xq2Var.h(s95Var)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i5 = i4 | i3;
        if ((i5 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (xq2Var.S(i5 & 1, z)) {
            boolean f = xq2Var.f(s95Var);
            Object P = xq2Var.P();
            vs0 vs0Var = ox0.a;
            if (f || P == vs0Var) {
                P = np2.Y(j14.SHOW_ICON);
                xq2Var.l0(P);
            }
            qa4 qa4Var = (qa4) P;
            boolean f2 = xq2Var.f(qa4Var);
            Object P2 = xq2Var.P();
            if (f2 || P2 == vs0Var) {
                P2 = new x5(qa4Var, null, 2);
                xq2Var.l0(P2);
            }
            mb3.i(xq2Var, (eo2) P2, s95Var);
            hf.b(dj6.m(400.0f, 1, nj2.E(ge7.O(a74Var, 16.0f), 8.0f, z16.b(8.0f), false, hv.c(4294956800L), 12)), z16.b(8.0f), hv.c(4294956800L), RecyclerView.B1, n16.I(1353536755, new ql1(14, s95Var, qa4Var), xq2Var), xq2Var, 1572864, 56);
        } else {
            xq2Var.V();
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new ql1(a74Var, i, 15, s95Var);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x045d  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x046f  */
    /* JADX WARN: Removed duplicated region for block: B:275:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r9v13, types: [java.lang.Object, lp3] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(final a74 a74Var, pr3 pr3Var, final lq4 lq4Var, final boolean z, final sd2 sd2Var, final boolean z2, final sg sgVar, c40 c40Var, iu iuVar, d40 d40Var, fu fuVar, final qn2 qn2Var, px0 px0Var, final int i, final int i2, final int i3) {
        int i4;
        c40 c40Var2;
        int i5;
        int i6;
        int i7;
        pr3 pr3Var2;
        xq2 xq2Var;
        final iu iuVar2;
        final d40 d40Var2;
        final fu fuVar2;
        c40 c40Var3;
        cf5 t;
        int i8;
        iu iuVar3;
        int i9;
        fu fuVar3;
        d40 d40Var3;
        tq3 tq3Var;
        int i10;
        qo3 qo3Var;
        iu iuVar4;
        fu fuVar4;
        a74 a74Var2;
        xq2 xq2Var2 = (xq2) px0Var;
        xq2Var2.d0(924924659);
        if ((i & 6) == 0) {
            i4 = (xq2Var2.f(a74Var) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            i4 |= xq2Var2.f(pr3Var) ? 32 : 16;
        }
        if ((i & RendererDebugBridge.CAPTURE_HEIGHT) == 0) {
            i4 |= xq2Var2.f(lq4Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i4 |= xq2Var2.g(false) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i4 |= xq2Var2.g(z) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i4 |= xq2Var2.f(sd2Var) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i4 |= xq2Var2.g(z2) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i4 |= xq2Var2.f(sgVar) ? 8388608 : Compress.MAXWINSIZE;
        }
        if ((i & 100663296) == 0) {
            i4 |= 33554432;
        }
        int i11 = i3 & 512;
        if (i11 != 0) {
            i4 |= 805306368;
            c40Var2 = c40Var;
        } else {
            c40Var2 = c40Var;
            if ((i & 805306368) == 0) {
                i4 |= xq2Var2.f(c40Var2) ? 536870912 : 268435456;
            }
        }
        int i12 = i3 & 1024;
        if (i12 != 0) {
            i6 = i2 | 6;
            i5 = i4;
        } else if ((i2 & 6) == 0) {
            i5 = i4;
            i6 = i2 | (xq2Var2.f(iuVar) ? 4 : 2);
        } else {
            i5 = i4;
            i6 = i2;
        }
        int i13 = i3 & 2048;
        if (i13 != 0) {
            i6 |= 48;
            i7 = i13;
        } else if ((i2 & 48) == 0) {
            i7 = i13;
            i6 |= xq2Var2.f(d40Var) ? 32 : 16;
        } else {
            i7 = i13;
        }
        int i14 = i6;
        int i15 = i3 & 4096;
        if (i15 != 0) {
            i14 |= RendererDebugBridge.CAPTURE_HEIGHT;
        } else if ((i2 & RendererDebugBridge.CAPTURE_HEIGHT) == 0) {
            i14 |= xq2Var2.f(fuVar) ? 256 : 128;
            if ((i2 & 3072) == 0) {
                i14 |= xq2Var2.h(qn2Var) ? 2048 : 1024;
            }
            if (!xq2Var2.S(i5 & 1, (i5 & 306783379) == 306783378 || (i14 & 1171) != 1170)) {
                xq2Var2.X();
                if ((i & 1) == 0 || xq2Var2.B()) {
                    i8 = i5 & (-234881025);
                    if (i11 != 0) {
                        c40Var2 = null;
                    }
                    iuVar3 = i12 != 0 ? null : iuVar;
                    d40 d40Var4 = i7 != 0 ? null : d40Var;
                    if (i15 != 0) {
                        i9 = i14;
                        c40Var3 = c40Var2;
                        fuVar3 = null;
                    } else {
                        i9 = i14;
                        c40Var3 = c40Var2;
                        fuVar3 = fuVar;
                    }
                    d40Var3 = d40Var4;
                } else {
                    xq2Var2.V();
                    i8 = i5 & (-234881025);
                    iuVar3 = iuVar;
                    i9 = i14;
                    c40Var3 = c40Var2;
                    d40Var3 = d40Var;
                    fuVar3 = fuVar;
                }
                xq2Var2.q();
                int i16 = i8 >> 3;
                int i17 = i16 & 14;
                int i18 = i17 | ((i9 >> 6) & 112);
                int i19 = i8;
                qa4 b0 = np2.b0(qn2Var, xq2Var2);
                int i20 = i9;
                boolean z3 = (((i18 & 14) ^ 6) > 4 && xq2Var2.f(pr3Var)) || (i18 & 6) == 4;
                Object P = xq2Var2.P();
                vs0 vs0Var = ox0.a;
                if (z3 || P == vs0Var) {
                    ?? obj = new Object();
                    obj.a = new ss4(Integer.MAX_VALUE);
                    obj.b = new ss4(Integer.MAX_VALUE);
                    vs0 vs0Var2 = vs0.s0;
                    P = new qo3(0, 2, pp6.class, np2.J(new u6(np2.J(new f4(b0, 29), vs0Var2), pr3Var, (Object) obj, 14), vs0Var2), "value", "getValue()Ljava/lang/Object;");
                    xq2Var2.l0(P);
                }
                qo3 qo3Var2 = (qo3) P;
                int i21 = i19 >> 9;
                int i22 = i17 | (i21 & 112);
                boolean z4 = ((((i22 & 112) ^ 48) > 32 && xq2Var2.g(z)) || (i22 & 48) == 32) | ((((i22 & 14) ^ 6) > 4 && xq2Var2.f(pr3Var)) || (i22 & 6) == 4);
                Object P2 = xq2Var2.P();
                if (z4 || P2 == vs0Var) {
                    P2 = new vq3(pr3Var, z);
                    xq2Var2.l0(P2);
                }
                tq3 tq3Var2 = (tq3) P2;
                Object P3 = xq2Var2.P();
                if (P3 == vs0Var) {
                    P3 = mb3.w(xq2Var2);
                    xq2Var2.l0(P3);
                }
                w61 w61Var = (w61) P3;
                tt2 tt2Var = (tt2) xq2Var2.j(ky0.g);
                q61 q61Var = ((Boolean) xq2Var2.j(ky0.w)).booleanValue() ? null : tq6.a;
                int i23 = i20 << 18;
                int i24 = (i19 & 65520) | (i21 & 3670016) | (i23 & 29360128) | (i23 & 234881024) | ((i20 << 27) & 1879048192);
                boolean d2 = ((((i24 & 112) ^ 48) > 32 && xq2Var2.f(pr3Var)) || (i24 & 48) == 32) | ((((i24 & 896) ^ RendererDebugBridge.CAPTURE_HEIGHT) > 256 && xq2Var2.f(lq4Var)) || (i24 & RendererDebugBridge.CAPTURE_HEIGHT) == 256) | ((((i24 & 7168) ^ 3072) > 2048 && xq2Var2.g(false)) || (i24 & 3072) == 2048) | ((((57344 & i24) ^ 24576) > 16384 && xq2Var2.g(z)) || (i24 & 24576) == 16384) | xq2Var2.d(0) | ((((i24 & 3670016) ^ 1572864) > 1048576 && xq2Var2.f(c40Var3)) || (i24 & 1572864) == 1048576) | ((((i24 & 29360128) ^ 12582912) > 8388608 && xq2Var2.f(d40Var3)) || (i24 & 12582912) == 8388608) | ((((i24 & 234881024) ^ 100663296) > 67108864 && xq2Var2.f(fuVar3)) || (i24 & 100663296) == 67108864) | ((((i24 & 1879048192) ^ 805306368) > 536870912 && xq2Var2.f(iuVar3)) || (i24 & 805306368) == 536870912) | xq2Var2.f(tt2Var) | xq2Var2.f(q61Var);
                Object P4 = xq2Var2.P();
                if (d2 || P4 == vs0Var) {
                    xq2Var = xq2Var2;
                    tq3Var = tq3Var2;
                    i10 = 4;
                    iu iuVar5 = iuVar3;
                    P4 = new ir3(pr3Var, z, lq4Var, qo3Var2, iuVar5, fuVar3, w61Var, tt2Var, q61Var, c40Var3, d40Var3);
                    qo3Var = qo3Var2;
                    iuVar4 = iuVar5;
                    fuVar4 = fuVar3;
                    xq2Var.l0(P4);
                } else {
                    qo3Var = qo3Var2;
                    iuVar4 = iuVar3;
                    xq2Var = xq2Var2;
                    fuVar4 = fuVar3;
                    tq3Var = tq3Var2;
                    i10 = 4;
                }
                eq3 eq3Var = (eq3) P4;
                lo4 lo4Var = z ? lo4.Vertical : lo4.Horizontal;
                if (z2) {
                    xq2Var.b0(-2077147368);
                    boolean d3 = ((((i16 & 14) ^ 6) > i10 && xq2Var.f(pr3Var)) || (i16 & 6) == i10) | xq2Var.d(0);
                    Object P5 = xq2Var.P();
                    if (d3 || P5 == vs0Var) {
                        P5 = new ar3(pr3Var);
                        xq2Var.l0(P5);
                    }
                    a74Var2 = ak7.n0((ar3) P5, pr3Var.p, lo4Var);
                    xq2Var.p(false);
                } else {
                    xq2Var.b0(-2076718545);
                    xq2Var.p(false);
                    a74Var2 = x64.a;
                }
                pr3Var2 = pr3Var;
                kn2.e(qo3Var, f04.O(vy7.p0(a74Var.d(pr3Var.m).d(pr3Var.n), qo3Var, tq3Var, lo4Var, z2).d(a74Var2).d((a74) pr3Var.o.i), pr3Var, lo4Var, sgVar, z2, sd2Var, pr3Var.g, null), pr3Var2.q, eq3Var, xq2Var, 0);
                iuVar2 = iuVar4;
                d40Var2 = d40Var3;
                fuVar2 = fuVar4;
            } else {
                pr3Var2 = pr3Var;
                xq2Var = xq2Var2;
                xq2Var.V();
                iuVar2 = iuVar;
                d40Var2 = d40Var;
                fuVar2 = fuVar;
                c40Var3 = c40Var2;
            }
            t = xq2Var.t();
            if (t == null) {
                final pr3 pr3Var3 = pr3Var2;
                final c40 c40Var4 = c40Var3;
                t.d = new eo2() { // from class: gr3
                    @Override // defpackage.eo2
                    public final Object o(Object obj2, Object obj3) {
                        ((Integer) obj3).getClass();
                        int a0 = ii2.a0(i | 1);
                        int a02 = ii2.a0(i2);
                        jx2.b(a74.this, pr3Var3, lq4Var, z, sd2Var, z2, sgVar, c40Var4, iuVar2, d40Var2, fuVar2, qn2Var, (px0) obj2, a0, a02, i3);
                        return jg7.a;
                    }
                };
                return;
            }
            return;
        }
        if ((i2 & 3072) == 0) {
        }
        if (!xq2Var2.S(i5 & 1, (i5 & 306783379) == 306783378 || (i14 & 1171) != 1170)) {
        }
        t = xq2Var.t();
        if (t == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:116:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00f7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void c(c37 c37Var, qn2 qn2Var, a74 a74Var, boolean z, s47 s47Var, eo2 eo2Var, eo2 eo2Var2, boolean z2, wq7 wq7Var, xh3 xh3Var, vh3 vh3Var, boolean z3, int i, int i2, ke6 ke6Var, i17 i17Var, px0 px0Var, int i3, int i4, int i5) {
        a74 a74Var2;
        s47 s47Var2;
        int i6;
        int i7;
        vh3 vh3Var2;
        int i8;
        int i9;
        boolean z4;
        int i10;
        int i11;
        int i12;
        int i13;
        xq2 xq2Var;
        boolean z5;
        s47 s47Var3;
        boolean z6;
        wq7 wq7Var2;
        int i14;
        ke6 ke6Var2;
        int i15;
        cf5 t;
        int i16;
        vh3 vh3Var3;
        vh3 vh3Var4;
        y16 y16Var;
        int i17;
        fa6 fa6Var;
        boolean z7;
        int i18;
        c37Var.getClass();
        qn2Var.getClass();
        xq2 xq2Var2 = (xq2) px0Var;
        xq2Var2.d0(1252638432);
        int i19 = (xq2Var2.f(c37Var) ? 4 : 2) | i3 | (xq2Var2.h(qn2Var) ? 32 : 16);
        if ((i3 & RendererDebugBridge.CAPTURE_HEIGHT) == 0) {
            a74Var2 = a74Var;
            i19 |= xq2Var2.f(a74Var2) ? 256 : 128;
        } else {
            a74Var2 = a74Var;
        }
        int i20 = i19 | 27648;
        if ((i5 & 32) == 0) {
            s47Var2 = s47Var;
            if (xq2Var2.f(s47Var2)) {
                i6 = 131072;
                i7 = i20 | i6 | 918552576;
                int i21 = i4 | (xq2Var2.g(z2) ? 32 : 16) | RendererDebugBridge.CAPTURE_HEIGHT;
                if ((i5 & 16384) != 0) {
                    vh3Var2 = vh3Var;
                    if (xq2Var2.f(vh3Var2)) {
                        i8 = 16384;
                        int i22 = i21 | i8;
                        i9 = i5 & 32768;
                        if (i9 != 0) {
                            i22 |= 196608;
                            z4 = z3;
                        } else {
                            z4 = z3;
                            if ((i4 & 196608) == 0) {
                                i22 |= xq2Var2.g(z4) ? 131072 : 65536;
                            }
                        }
                        int i23 = 524288 | i22;
                        i10 = 131072 & i5;
                        if (i10 != 0) {
                            i23 = 13107200 | i22;
                        } else if ((i4 & 12582912) == 0) {
                            i11 = i2;
                            i23 |= xq2Var2.d(i11) ? 8388608 : Compress.MAXWINSIZE;
                            i12 = i23 | 369098752;
                            i13 = !xq2Var2.f(i17Var) ? 4 : 2;
                            if (!xq2Var2.S(i7 & 1, ((i7 & 306783379) != 306783378 && (i12 & 306783379) == 306783378 && (i13 & 3) == 2) ? false : true)) {
                                xq2Var2.X();
                                if ((i3 & 1) != 0 && !xq2Var2.B()) {
                                    xq2Var2.V();
                                    i16 = (i5 & 32) != 0 ? i7 & (-458753) : i7;
                                    if ((i5 & 16384) != 0) {
                                        i12 &= -57345;
                                    }
                                    i17 = (-1882718209) & i12;
                                    fa6Var = wq7Var;
                                    i18 = i;
                                    y16Var = ke6Var;
                                    vh3Var4 = vh3Var2;
                                    z7 = z;
                                } else {
                                    if ((i5 & 32) != 0) {
                                        s47Var2 = (s47) xq2Var2.j(x37.a);
                                        i16 = i7 & (-458753);
                                    } else {
                                        i16 = i7;
                                    }
                                    fa6 fa6Var2 = xd5.v0;
                                    if ((i5 & 16384) != 0) {
                                        vh3Var3 = new vh3(63, null);
                                        i12 &= -57345;
                                    } else {
                                        vh3Var3 = vh3Var2;
                                    }
                                    if (i9 != 0) {
                                        z4 = false;
                                    }
                                    int i24 = z4 ? 1 : Integer.MAX_VALUE;
                                    if (i10 != 0) {
                                        i11 = 1;
                                    }
                                    vh3Var4 = vh3Var3;
                                    y16Var = ((ye6) xq2Var2.j(ze6.a)).a;
                                    i17 = i12 & (-1882718209);
                                    fa6Var = fa6Var2;
                                    z7 = true;
                                    i18 = i24;
                                }
                                int i25 = i11;
                                int i26 = i13;
                                boolean z8 = z4;
                                xq2Var2.q();
                                a74 f = u24.f(x64.a);
                                int i27 = i16;
                                yt0 a = wt0.a(new gu(4.0f, true, new i(1)), d90.k0, xq2Var2, 6);
                                int i28 = i17;
                                int hashCode = Long.hashCode(xq2Var2.T);
                                xv4 l = xq2Var2.l();
                                a74 E = l.E(xq2Var2, f);
                                jx0.i.getClass();
                                iy0 iy0Var = ix0.b;
                                xq2Var2.f0();
                                if (xq2Var2.S) {
                                    xq2Var2.k(iy0Var);
                                } else {
                                    xq2Var2.o0();
                                }
                                yh2.K(xq2Var2, ix0.f, a);
                                yh2.K(xq2Var2, ix0.e, l);
                                yh2.K(xq2Var2, ix0.g, Integer.valueOf(hashCode));
                                yh2.F(xq2Var2, ix0.h);
                                yh2.K(xq2Var2, ix0.d, E);
                                zo4.a(c37Var, qn2Var, a74Var2, z7, s47Var2, eo2Var, z2, fa6Var, xh3Var, vh3Var4, z8, i18, i25, y16Var, i17Var, xq2Var2, i27 & 2147483646, ((i28 >> 3) & 268435454) | ((i26 << 27) & 1879048192), 0);
                                xq2Var = xq2Var2;
                                if (z2 && eo2Var2 != null) {
                                    xq2Var.b0(-421320268);
                                    hv.e(new pq[]{x37.a.a(((xe7) xq2Var.j(ye7.b)).l), j31.a.a(new kt0(((ut0) xq2Var.j(vt0.a)).b()))}, n16.I(-1157798543, new bc(6, eo2Var2), xq2Var), xq2Var, 56);
                                    xq2Var.p(false);
                                } else {
                                    xq2Var.b0(-421081940);
                                    xq2Var.p(false);
                                }
                                xq2Var.p(true);
                                z6 = z7;
                                s47Var3 = s47Var2;
                                wq7Var2 = fa6Var;
                                vh3Var2 = vh3Var4;
                                z5 = z8;
                                i14 = i18;
                                i15 = i25;
                                ke6Var2 = y16Var;
                            } else {
                                xq2Var = xq2Var2;
                                xq2Var.V();
                                s47 s47Var4 = s47Var2;
                                z5 = z4;
                                s47Var3 = s47Var4;
                                z6 = z;
                                wq7Var2 = wq7Var;
                                i14 = i;
                                ke6Var2 = ke6Var;
                                i15 = i11;
                            }
                            t = xq2Var.t();
                            if (t == null) {
                                t.d = new uo4(c37Var, qn2Var, a74Var, z6, s47Var3, eo2Var, eo2Var2, z2, wq7Var2, xh3Var, vh3Var2, z5, i14, i15, ke6Var2, i17Var, i3, i4, i5, 1);
                                return;
                            }
                            return;
                        }
                        i11 = i2;
                        i12 = i23 | 369098752;
                        if (!xq2Var2.f(i17Var)) {
                        }
                        if (!xq2Var2.S(i7 & 1, ((i7 & 306783379) != 306783378 && (i12 & 306783379) == 306783378 && (i13 & 3) == 2) ? false : true)) {
                        }
                        t = xq2Var.t();
                        if (t == null) {
                        }
                    }
                } else {
                    vh3Var2 = vh3Var;
                }
                i8 = 8192;
                int i222 = i21 | i8;
                i9 = i5 & 32768;
                if (i9 != 0) {
                }
                int i232 = 524288 | i222;
                i10 = 131072 & i5;
                if (i10 != 0) {
                }
                i11 = i2;
                i12 = i232 | 369098752;
                if (!xq2Var2.f(i17Var)) {
                }
                if (!xq2Var2.S(i7 & 1, ((i7 & 306783379) != 306783378 && (i12 & 306783379) == 306783378 && (i13 & 3) == 2) ? false : true)) {
                }
                t = xq2Var.t();
                if (t == null) {
                }
            }
        } else {
            s47Var2 = s47Var;
        }
        i6 = 65536;
        i7 = i20 | i6 | 918552576;
        int i212 = i4 | (xq2Var2.g(z2) ? 32 : 16) | RendererDebugBridge.CAPTURE_HEIGHT;
        if ((i5 & 16384) != 0) {
        }
        i8 = 8192;
        int i2222 = i212 | i8;
        i9 = i5 & 32768;
        if (i9 != 0) {
        }
        int i2322 = 524288 | i2222;
        i10 = 131072 & i5;
        if (i10 != 0) {
        }
        i11 = i2;
        i12 = i2322 | 369098752;
        if (!xq2Var2.f(i17Var)) {
        }
        if (!xq2Var2.S(i7 & 1, ((i7 & 306783379) != 306783378 && (i12 & 306783379) == 306783378 && (i13 & 3) == 2) ? false : true)) {
        }
        t = xq2Var.t();
        if (t == null) {
        }
    }

    public static final void d(boolean z, eo2 eo2Var, px0 px0Var, int i) {
        int i2;
        boolean z2;
        id4 id4Var;
        eb ebVar;
        jl4 jl4Var;
        boolean z3;
        int i3;
        int i4;
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(-642000585);
        if ((i & 6) == 0) {
            if (xq2Var.g(z)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (xq2Var.h(eo2Var)) {
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        if ((i2 & 19) != 18) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (xq2Var.S(i2 & 1, z2)) {
            Object a = ay3.a(xq2Var);
            if (a == null) {
                xq2Var.b0(1512740606);
                a = by3.a(xq2Var);
            } else {
                xq2Var.b0(1512737723);
            }
            xq2Var.p(false);
            if (a != null) {
                boolean f = xq2Var.f(a);
                Object P = xq2Var.P();
                vs0 vs0Var = ox0.a;
                if (f || P == vs0Var) {
                    il4 il4Var = null;
                    if (a instanceof id4) {
                        id4Var = (id4) a;
                    } else {
                        id4Var = null;
                    }
                    if (id4Var != null) {
                        ebVar = id4Var.a();
                    } else {
                        ebVar = null;
                    }
                    if (a instanceof jl4) {
                        jl4Var = (jl4) a;
                    } else {
                        jl4Var = null;
                    }
                    if (jl4Var != null) {
                        il4Var = jl4Var.b();
                    }
                    P = new e00(ebVar, il4Var);
                    xq2Var.l0(P);
                }
                e00 e00Var = (e00) P;
                Object P2 = xq2Var.P();
                if (P2 == vs0Var) {
                    P2 = mb3.w(xq2Var);
                    xq2Var.l0(P2);
                }
                w61 w61Var = (w61) P2;
                long j = xq2Var.T;
                boolean f2 = xq2Var.f(e00Var) | xq2Var.e(j);
                Object P3 = xq2Var.P();
                if (f2 || P3 == vs0Var) {
                    P3 = new ax0(w61Var, new u05(j, a));
                    xq2Var.l0(P3);
                }
                ax0 ax0Var = (ax0) P3;
                xq2Var.b0(-348514256);
                boolean h = xq2Var.h(ax0Var) | xq2Var.h(eo2Var);
                Object P4 = xq2Var.P();
                if (h || P4 == vs0Var) {
                    P4 = new ci2(16, ax0Var, eo2Var);
                    xq2Var.l0(P4);
                }
                mb3.n((on2) P4, xq2Var);
                int i5 = i2;
                Boolean valueOf = Boolean.valueOf(z);
                boolean h2 = xq2Var.h(ax0Var);
                int i6 = i5 & 14;
                if (i6 == 4) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                boolean z4 = z3 | h2;
                Object P5 = xq2Var.P();
                if (z4 || P5 == vs0Var) {
                    P5 = new g00(ax0Var, z, 4);
                    xq2Var.l0(P5);
                }
                xk2.b(valueOf, ax0Var, null, (qn2) P5, xq2Var, i6);
                boolean h3 = xq2Var.h(e00Var) | xq2Var.h(ax0Var);
                Object P6 = xq2Var.P();
                if (h3 || P6 == vs0Var) {
                    P6 = new qk4(4, e00Var, ax0Var);
                    xq2Var.l0(P6);
                }
                mb3.e(e00Var, ax0Var, (qn2) P6, xq2Var);
                xq2Var.p(false);
            } else {
                i.m("No NavigationEventDispatcherOwner was provided via LocalNavigationEventDispatcherOwner and no OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner. Please provide one of the two.");
                return;
            }
        } else {
            xq2Var.V();
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new h00(z, eo2Var, i);
        }
    }

    public static final void e(mi6 mi6Var, px0 px0Var, int i) {
        int i2;
        boolean z;
        cf5 t;
        ki6 ki6Var;
        mi6Var.getClass();
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(-43957353);
        if (xq2Var.f(mi6Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i3 = i2 | i;
        boolean z2 = false;
        if ((i3 & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        if (xq2Var.S(i3 & 1, z)) {
            if (!((Boolean) mi6Var.a.getValue()).booleanValue()) {
                t = xq2Var.t();
                if (t != null) {
                    ki6Var = new ki6(mi6Var, i, 0);
                } else {
                    return;
                }
            } else {
                li6 li6Var = (li6) mi6Var.b.getValue();
                if (li6Var == null) {
                    t = xq2Var.t();
                    if (t != null) {
                        ki6Var = new ki6(mi6Var, i, 1);
                    } else {
                        return;
                    }
                } else {
                    String str = li6Var.a;
                    if ((i3 & 14) == 4) {
                        z2 = true;
                    }
                    Object P = xq2Var.P();
                    if (z2 || P == ox0.a) {
                        P = new ji6(mi6Var, 1);
                        xq2Var.l0(P);
                    }
                    q60.a(str, (on2) P, n16.I(497074786, new l4(14, li6Var, mi6Var), xq2Var), n16.I(367337888, new ki6(mi6Var), xq2Var), false, xq2Var, 3456, 16);
                }
            }
            t.d = ki6Var;
        }
        xq2Var.V();
        t = xq2Var.t();
        if (t != null) {
            ki6Var = new ki6(mi6Var, i, 3);
            t.d = ki6Var;
        }
    }

    public static final long f(int i, int i2) {
        if (i < 0 || i2 < 0) {
            q53.a("start and end cannot be negative. [start: " + i + ", end: " + i2 + ']');
        }
        long j = (i2 & 4294967295L) | (i << 32);
        int i3 = k47.c;
        return j;
    }

    public static final long g(float f, float f2) {
        long floatToRawIntBits = (Float.floatToRawIntBits(f2) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
        int i = i97.c;
        return floatToRawIntBits;
    }

    public static final void h(j97 j97Var, s43 s43Var, lo4 lo4Var, r43 r43Var, zb zbVar, long j) {
        float intBitsToFloat;
        ca4 ca4Var = (ca4) zbVar.L;
        float intBitsToFloat2 = Float.intBitsToFloat((int) (s43Var.c >> 32));
        float intBitsToFloat3 = Float.intBitsToFloat((int) (s43Var.c & 4294967295L));
        if (k(s43Var)) {
            zbVar.B = 0;
            ca4Var.d();
        }
        if (!i(s43Var) && !k(s43Var)) {
            if (ca4Var.b == 3) {
                int i = zbVar.B;
                zbVar.B = i + 1;
                ca4Var.n(i, s43Var);
            } else {
                ca4Var.a(s43Var);
            }
            if (zbVar.B == 3) {
                zbVar.B = 0;
            }
            Object[] objArr = ca4Var.a;
            int i2 = ca4Var.b;
            float f = 0.0f;
            for (int i3 = 0; i3 < i2; i3++) {
                f += Float.intBitsToFloat((int) (((s43) objArr[i3]).c >> 32));
            }
            int i4 = ca4Var.b;
            intBitsToFloat2 = f / i4;
            Object[] objArr2 = ca4Var.a;
            float f2 = 0.0f;
            for (int i5 = 0; i5 < i4; i5++) {
                f2 += Float.intBitsToFloat((int) (((s43) objArr2[i5]).c & 4294967295L));
            }
            intBitsToFloat3 = f2 / ca4Var.b;
        }
        long floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat2) << 32) | (Float.floatToRawIntBits(intBitsToFloat3) & 4294967295L);
        if (lo4Var != null) {
            int i6 = r43Var.a;
            if (i6 == 1) {
                intBitsToFloat = Float.intBitsToFloat((int) (floatToRawIntBits >> 32));
            } else if (i6 == 2) {
                intBitsToFloat = Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L));
            }
            floatToRawIntBits = lo4Var == lo4.Horizontal ? (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(RecyclerView.B1) & 4294967295L) : (Float.floatToRawIntBits(RecyclerView.B1) << 32) | (Float.floatToRawIntBits(intBitsToFloat) & 4294967295L);
        }
        ((bg1) j97Var.B).e(s43Var.b, jk4.f(floatToRawIntBits, j));
    }

    public static final boolean i(s43 s43Var) {
        if (s43Var.h && !s43Var.d) {
            return true;
        }
        return false;
    }

    public static final void j(Logger logger, lz6 lz6Var, pz6 pz6Var, String str) {
        logger.fine(pz6Var.b + ' ' + String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1)) + ": " + lz6Var.a);
    }

    public static final boolean k(s43 s43Var) {
        if (!s43Var.h && s43Var.d) {
            return true;
        }
        return false;
    }

    public static final boolean l(vh2 vh2Var, boolean z) {
        boolean z2;
        int i = wh2.a[vh2Var.W0().ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        i.d();
                        return false;
                    }
                } else {
                    vh2 t = yh2.t(vh2Var);
                    if (t != null) {
                        z2 = l(t, z);
                    } else {
                        z2 = true;
                    }
                    if (!z2) {
                        return false;
                    }
                    vh2Var.S0(sh2.ActiveParent, sh2.Inactive);
                    return true;
                }
            } else {
                return z;
            }
        }
        return true;
    }

    public static final long m(int i, long j) {
        int i2;
        int i3 = k47.c;
        int i4 = (int) (j >> 32);
        int i5 = 0;
        if (i4 < 0) {
            i2 = 0;
        } else {
            i2 = i4;
        }
        if (i2 > i) {
            i2 = i;
        }
        int i6 = (int) (4294967295L & j);
        if (i6 >= 0) {
            i5 = i6;
        }
        if (i5 <= i) {
            i = i5;
        }
        if (i2 == i4 && i == i6) {
            return j;
        }
        return f(i2, i);
    }

    public static ve1 n(long j, long j2, px0 px0Var, int i, int i2) {
        if ((i2 & 1) != 0) {
            j = ((ut0) ((xq2) px0Var).j(vt0.a)).i();
        }
        long j3 = j;
        if ((i2 & 2) != 0) {
            j2 = kt0.c(0.6f, ((ut0) ((xq2) px0Var).j(vt0.a)).f());
        }
        long j4 = j2;
        nq6 nq6Var = vt0.a;
        xq2 xq2Var = (xq2) px0Var;
        long f = ((ut0) xq2Var.j(nq6Var)).f();
        long j5 = ((kt0) xq2Var.j(j31.a)).a;
        if (((ut0) xq2Var.j(nq6Var)).k()) {
            hv.N(j5);
        } else {
            hv.N(j5);
        }
        long c2 = kt0.c(0.38f, f);
        boolean e = ((xq2) px0Var).e(j3) | ((xq2) px0Var).e(j4) | ((xq2) px0Var).e(c2);
        xq2 xq2Var2 = (xq2) px0Var;
        Object P = xq2Var2.P();
        if (e || P == ox0.a) {
            ve1 ve1Var = new ve1(j3, j4, c2);
            xq2Var2.l0(ve1Var);
            P = ve1Var;
        }
        return (ve1) P;
    }

    public static final void o(nc4 nc4Var, ar0 ar0Var, Map map, zv0 zv0Var) {
        rd4 rd4Var = nc4Var.g;
        rd4Var.getClass();
        nc4Var.i.add(new vw0((uw0) rd4Var.b(xk2.o(uw0.class)), ar0Var, map, zv0Var).a());
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:58|(1:(2:60|(1:113)(1:64))(2:115|116))|(4:108|109|(8:82|83|(1:(3:85|(1:103)(1:(1:91)(2:88|89))|90)(2:104|(1:106)))|92|(1:102)(1:96)|97|(1:99)|101)|(1:71)(2:72|(1:78)(2:80|81)))|66|(1:68)|82|83|(2:(0)(0)|90)|92|(1:94)|102|97|(0)|101|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00ad, code lost:
        if (r11 == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00f3, code lost:
        if (r12 == false) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0191 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0176 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0105 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x015e A[Catch: NoSuchFieldException -> 0x018e, TryCatch #0 {NoSuchFieldException -> 0x018e, blocks: (B:79:0x0150, B:81:0x015e, B:90:0x017b, B:92:0x0181, B:94:0x0187, B:96:0x018b, B:86:0x0173), top: B:112:0x0150 }] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x018b A[Catch: NoSuchFieldException -> 0x018e, TRY_LEAVE, TryCatch #0 {NoSuchFieldException -> 0x018e, blocks: (B:79:0x0150, B:81:0x015e, B:90:0x017b, B:92:0x0181, B:94:0x0187, B:96:0x018b, B:86:0x0173), top: B:112:0x0150 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final gg3 p(Class cls, gg3... gg3VarArr) {
        Object obj;
        gg3 x;
        gg3 gg3Var;
        Field field;
        Object obj2;
        gg3 gg3Var2;
        int length;
        Class<?> cls2;
        int i;
        Object obj3;
        Field field2;
        cc6 cc6Var;
        cls.getClass();
        if (cls.isEnum() && cls.getAnnotation(cc6.class) == null && cls.getAnnotation(cz4.class) == null) {
            Object[] enumConstants = cls.getEnumConstants();
            String canonicalName = cls.getCanonicalName();
            canonicalName.getClass();
            enumConstants.getClass();
            return new v52(canonicalName, (Enum[]) enumConstants);
        }
        gg3[] gg3VarArr2 = (gg3[]) Arrays.copyOf(gg3VarArr, gg3VarArr.length);
        try {
            Field declaredField = cls.getDeclaredField("Companion");
            declaredField.setAccessible(true);
            obj = declaredField.get(null);
        } catch (Throwable unused) {
            obj = null;
        }
        if (obj == null) {
            x = null;
        } else {
            x = x(obj, (gg3[]) Arrays.copyOf(gg3VarArr2, gg3VarArr2.length));
        }
        if (x != null) {
            return x;
        }
        String canonicalName2 = cls.getCanonicalName();
        if (canonicalName2 != null && !xs6.g0(canonicalName2, "java.", false) && !xs6.g0(canonicalName2, "kotlin.", false)) {
            Field[] declaredFields = cls.getDeclaredFields();
            declaredFields.getClass();
            int length2 = declaredFields.length;
            Field field3 = null;
            int i2 = 0;
            boolean z = false;
            while (true) {
                if (i2 < length2) {
                    Field field4 = declaredFields[i2];
                    if (nb3.k(field4.getName(), "INSTANCE") && nb3.k(field4.getType(), cls) && Modifier.isStatic(field4.getModifiers())) {
                        if (z) {
                            break;
                        }
                        z = true;
                        field3 = field4;
                    }
                    i2++;
                }
            }
            field3 = null;
            if (field3 != null) {
                Object obj4 = field3.get(null);
                Method[] methods = cls.getMethods();
                methods.getClass();
                int length3 = methods.length;
                Method method = null;
                int i3 = 0;
                boolean z2 = false;
                while (true) {
                    if (i3 < length3) {
                        Method method2 = methods[i3];
                        if (nb3.k(method2.getName(), "serializer")) {
                            Class<?>[] parameterTypes = method2.getParameterTypes();
                            parameterTypes.getClass();
                            if (parameterTypes.length == 0 && nb3.k(method2.getReturnType(), gg3.class)) {
                                if (z2) {
                                    break;
                                }
                                z2 = true;
                                method = method2;
                            }
                        }
                        i3++;
                    }
                }
                method = null;
                if (method != null) {
                    Object invoke = method.invoke(obj4, null);
                    if (invoke instanceof gg3) {
                        gg3Var = (gg3) invoke;
                        if (gg3Var == null) {
                            return gg3Var;
                        }
                        gg3[] gg3VarArr3 = (gg3[]) Arrays.copyOf(gg3VarArr, gg3VarArr.length);
                        Field[] declaredFields2 = cls.getDeclaredFields();
                        declaredFields2.getClass();
                        int length4 = declaredFields2.length;
                        int i4 = 0;
                        while (true) {
                            if (i4 < length4) {
                                field = declaredFields2[i4];
                                if (Modifier.isStatic(field.getModifiers()) && field.getType().getAnnotation(nb4.class) != null) {
                                    break;
                                }
                                i4++;
                            } else {
                                field = null;
                                break;
                            }
                        }
                        if (field != null) {
                            try {
                                field.setAccessible(true);
                                obj2 = field.get(null);
                            } catch (Throwable unused2) {
                            }
                            if (obj2 != null || (gg3Var2 = x(obj2, (gg3[]) Arrays.copyOf(gg3VarArr3, gg3VarArr3.length))) == null) {
                                Class<?>[] declaredClasses = cls.getDeclaredClasses();
                                declaredClasses.getClass();
                                length = declaredClasses.length;
                                cls2 = null;
                                i = 0;
                                boolean z3 = false;
                                while (true) {
                                    if (i >= length) {
                                        Class<?> cls3 = declaredClasses[i];
                                        if (cls3.getSimpleName().equals("$serializer")) {
                                            if (z3) {
                                                break;
                                            }
                                            z3 = true;
                                            cls2 = cls3;
                                        }
                                        i++;
                                    } else if (!z3) {
                                    }
                                }
                                cls2 = null;
                                if (cls2 == null && (field2 = cls2.getField("INSTANCE")) != null) {
                                    obj3 = field2.get(null);
                                } else {
                                    obj3 = null;
                                }
                                if (obj3 instanceof gg3) {
                                    gg3Var2 = (gg3) obj3;
                                }
                                gg3Var2 = null;
                            }
                            if (gg3Var2 == null) {
                                return gg3Var2;
                            }
                            if (cls.getAnnotation(cz4.class) == null && ((cc6Var = (cc6) cls.getAnnotation(cc6.class)) == null || !gh5.a(cc6Var.with()).equals(gh5.a(fz4.class)))) {
                                return null;
                            }
                            return new fz4(gh5.a(cls));
                        }
                        obj2 = null;
                        if (obj2 != null) {
                        }
                        Class<?>[] declaredClasses2 = cls.getDeclaredClasses();
                        declaredClasses2.getClass();
                        length = declaredClasses2.length;
                        cls2 = null;
                        i = 0;
                        boolean z32 = false;
                        while (true) {
                            if (i >= length) {
                            }
                            i++;
                        }
                        cls2 = null;
                        if (cls2 == null) {
                        }
                        obj3 = null;
                        if (obj3 instanceof gg3) {
                        }
                        gg3Var2 = null;
                        if (gg3Var2 == null) {
                        }
                    }
                }
            }
        }
        gg3Var = null;
        if (gg3Var == null) {
        }
    }

    public static lk5 q(String str, n34 n34Var) {
        Charset charset = qm0.a;
        if (n34Var != null) {
            Charset a = n34.a(n34Var);
            if (a == null) {
                try {
                    n34Var = xk2.k(n34Var + "; charset=utf-8");
                } catch (IllegalArgumentException unused) {
                    n34Var = null;
                }
            } else {
                charset = a;
            }
        }
        byte[] bytes = str.getBytes(charset);
        bytes.getClass();
        int length = bytes.length;
        yy7.a(bytes.length, 0L, length);
        return new lk5(n34Var, length, bytes);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, q60] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, q60] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, q60] */
    public static q60 r(int i) {
        if (i != 0) {
            if (i != 1) {
                return new Object();
            }
            return new Object();
        }
        return new Object();
    }

    public static final String s(long j) {
        String p;
        if (j <= -999500000) {
            p = lb1.p(new StringBuilder(), (j - 500000000) / 1000000000, " s ");
        } else if (j <= -999500) {
            p = lb1.p(new StringBuilder(), (j - 500000) / 1000000, " ms");
        } else if (j <= 0) {
            p = lb1.p(new StringBuilder(), (j - 500) / 1000, " µs");
        } else if (j < 999500) {
            p = lb1.p(new StringBuilder(), (j + 500) / 1000, " µs");
        } else if (j < 999500000) {
            p = lb1.p(new StringBuilder(), (j + 500000) / 1000000, " ms");
        } else {
            p = lb1.p(new StringBuilder(), (j + 500000000) / 1000000000, " s ");
        }
        return String.format("%6s", Arrays.copyOf(new Object[]{p}, 1));
    }

    public static final j26 t(x24 x24Var) {
        Object B = x24Var.B();
        if (B instanceof j26) {
            return (j26) B;
        }
        return null;
    }

    public static final float v(j26 j26Var) {
        if (j26Var != null) {
            return j26Var.a;
        }
        return RecyclerView.B1;
    }

    public static final boolean w(float[] fArr, float[] fArr2) {
        boolean z;
        if (fArr.length < 16 || fArr2.length < 16) {
            return false;
        }
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float f4 = fArr[3];
        float f5 = fArr[4];
        float f6 = fArr[5];
        float f7 = fArr[6];
        float f8 = fArr[7];
        float f9 = fArr[8];
        float f10 = fArr[9];
        float f11 = fArr[10];
        float f12 = fArr[11];
        float f13 = fArr[12];
        float f14 = fArr[13];
        float f15 = fArr[14];
        float f16 = fArr[15];
        float f17 = (f * f6) - (f2 * f5);
        float f18 = (f * f7) - (f3 * f5);
        float f19 = (f * f8) - (f4 * f5);
        float f20 = (f2 * f7) - (f3 * f6);
        float f21 = (f2 * f8) - (f4 * f6);
        float f22 = (f3 * f8) - (f4 * f7);
        float f23 = (f9 * f14) - (f10 * f13);
        float f24 = (f9 * f15) - (f11 * f13);
        float f25 = (f9 * f16) - (f12 * f13);
        float f26 = (f10 * f15) - (f11 * f14);
        float f27 = (f10 * f16) - (f12 * f14);
        float f28 = (f11 * f16) - (f12 * f15);
        float f29 = (f22 * f23) + (((f20 * f25) + ((f19 * f26) + ((f17 * f28) - (f18 * f27)))) - (f21 * f24));
        int i = (f29 > RecyclerView.B1 ? 1 : (f29 == RecyclerView.B1 ? 0 : -1));
        if (i != 0) {
            float f30 = 1.0f / f29;
            fArr2[0] = ((f8 * f26) + ((f6 * f28) - (f7 * f27))) * f30;
            fArr2[1] = (((f3 * f27) + ((-f2) * f28)) - (f4 * f26)) * f30;
            fArr2[2] = ((f16 * f20) + ((f14 * f22) - (f15 * f21))) * f30;
            fArr2[3] = (((f11 * f21) + ((-f10) * f22)) - (f12 * f20)) * f30;
            float f31 = -f5;
            fArr2[4] = (((f7 * f25) + (f31 * f28)) - (f8 * f24)) * f30;
            fArr2[5] = ((f4 * f24) + ((f28 * f) - (f3 * f25))) * f30;
            float f32 = -f13;
            fArr2[6] = (((f15 * f19) + (f32 * f22)) - (f16 * f18)) * f30;
            fArr2[7] = ((f12 * f18) + ((f22 * f9) - (f11 * f19))) * f30;
            fArr2[8] = ((f8 * f23) + ((f5 * f27) - (f6 * f25))) * f30;
            fArr2[9] = (((f25 * f2) + ((-f) * f27)) - (f4 * f23)) * f30;
            fArr2[10] = ((f16 * f17) + ((f13 * f21) - (f14 * f19))) * f30;
            fArr2[11] = (((f19 * f10) + ((-f9) * f21)) - (f12 * f17)) * f30;
            fArr2[12] = (((f6 * f24) + (f31 * f26)) - (f7 * f23)) * f30;
            fArr2[13] = ((f3 * f23) + ((f * f26) - (f2 * f24))) * f30;
            fArr2[14] = (((f14 * f18) + (f32 * f20)) - (f15 * f17)) * f30;
            fArr2[15] = ((f11 * f17) + ((f9 * f20) - (f10 * f18))) * f30;
        }
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        return !z;
    }

    public static final gg3 x(Object obj, gg3... gg3VarArr) {
        Class[] clsArr;
        try {
            if (gg3VarArr.length == 0) {
                clsArr = new Class[0];
            } else {
                int length = gg3VarArr.length;
                Class[] clsArr2 = new Class[length];
                for (int i = 0; i < length; i++) {
                    clsArr2[i] = gg3.class;
                }
                clsArr = clsArr2;
            }
            Object invoke = obj.getClass().getDeclaredMethod("serializer", (Class[]) Arrays.copyOf(clsArr, clsArr.length)).invoke(obj, Arrays.copyOf(gg3VarArr, gg3VarArr.length));
            if (invoke instanceof gg3) {
                return (gg3) invoke;
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        } catch (InvocationTargetException e) {
            Throwable cause = e.getCause();
            if (cause != null) {
                String message = cause.getMessage();
                if (message == null) {
                    message = e.getMessage();
                }
                throw new InvocationTargetException(cause, message);
            }
            throw e;
        }
    }

    public static final boolean y(ar0 ar0Var) {
        ar0Var.getClass();
        Class a = ar0Var.a();
        a.getClass();
        return a.isInterface();
    }

    public static final ap3 z(eo2 eo2Var, qn2 qn2Var) {
        bc bcVar = new bc(5, eo2Var);
        ge7.p(1, qn2Var);
        return new ap3(28, bcVar, qn2Var);
    }

    public final ViewPropertyAnimator u(View view, int i) {
        switch (this.a) {
            case 0:
                return view.animate().translationY(i);
            case 1:
                return view.animate().translationX(-i);
            default:
                return view.animate().translationX(i);
        }
    }
}
