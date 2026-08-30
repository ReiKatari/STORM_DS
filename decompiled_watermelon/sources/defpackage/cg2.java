package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.window.BackEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.text.Normalizer;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: cg2  reason: default package */
/* loaded from: classes.dex */
public abstract class cg2 {
    public static boolean a = false;
    public static Method b = null;
    public static boolean c = false;
    public static Field d = null;
    public static ax2 e = null;
    public static boolean f = true;

    public static r75 A(List list) {
        Iterator it = list.iterator();
        if (!it.hasNext()) {
            return r75.ALLOW;
        }
        throw b31.m(it);
    }

    public static final long B(ls5 ls5Var) {
        ls5Var.getClass();
        if (I(ls5Var) == 0) {
            return -1L;
        }
        ns5 i0 = ls5Var.i0("SELECT last_insert_rowid()");
        try {
            i0.a0();
            long j = i0.getLong(0);
            iq2.h(i0, null);
            return j;
        } finally {
        }
    }

    public static final int C(vc3 vc3Var) {
        vc3Var.getClass();
        switch (u13.a[vc3Var.ordinal()]) {
            case 1:
                return R.string.top_screen;
            case 2:
                return R.string.bottom_screen;
            case 3:
                return R.string.hybrid_screen;
            case 4:
                return R.string.input_dpad;
            case 5:
                return R.string.input_abxy_buttons;
            case ig7.b /* 6 */:
                return R.string.input_l;
            case 7:
                return R.string.input_r;
            case 8:
                return R.string.input_start;
            case 9:
                return R.string.input_select;
            case 10:
                return R.string.input_lid;
            case 11:
                return R.string.input_pause;
            case mj2.L /* 12 */:
                return R.string.input_fast_forward;
            case 13:
                return R.string.input_microphone;
            case 14:
                return R.string.input_toggle_soft_input;
            case ig7.e /* 15 */:
                return R.string.reset;
            case 16:
                return R.string.input_swap_screens;
            case 17:
                return R.string.input_quick_save;
            case 18:
                return R.string.input_quick_load;
            case 19:
                return R.string.rewind;
            default:
                i.c();
                return 0;
        }
    }

    public static final int D(q04 q04Var, long j, fa7 fa7Var) {
        float f2;
        if (fa7Var != null) {
            f2 = fa7Var.f();
        } else {
            f2 = RecyclerView.A1;
        }
        int i = (int) (4294967295L & j);
        int e2 = q04Var.e(Float.intBitsToFloat(i));
        if (Float.intBitsToFloat(i) >= q04Var.f(e2) - f2 && Float.intBitsToFloat(i) <= q04Var.b(e2) + f2) {
            int i2 = (int) (j >> 32);
            if (Float.intBitsToFloat(i2) >= (-f2) && Float.intBitsToFloat(i2) <= q04Var.d + f2) {
                return e2;
            }
            return -1;
        }
        return -1;
    }

    public static final int E(int i, int i2, int i3) {
        if (i3 > 0) {
            if (i < i2) {
                int i4 = i2 % i3;
                if (i4 < 0) {
                    i4 += i3;
                }
                int i5 = i % i3;
                if (i5 < 0) {
                    i5 += i3;
                }
                int i6 = (i4 - i5) % i3;
                if (i6 < 0) {
                    i6 += i3;
                }
                return i2 - i6;
            }
        } else if (i3 < 0) {
            if (i > i2) {
                int i7 = -i3;
                int i8 = i % i7;
                if (i8 < 0) {
                    i8 += i7;
                }
                int i9 = i2 % i7;
                if (i9 < 0) {
                    i9 += i7;
                }
                int i10 = (i8 - i9) % i7;
                if (i10 < 0) {
                    i10 += i7;
                }
                return i10 + i2;
            }
        } else {
            i.i("Step is zero.");
            return 0;
        }
        return i2;
    }

    public static final long F(hm3 hm3Var, y55 y55Var, int i) {
        q04 q04Var;
        vd6 vd6Var = iq0.s0;
        mr6 d2 = hm3Var.d();
        if (d2 != null) {
            q04Var = d2.a.b;
        } else {
            q04Var = null;
        }
        rd3 c2 = hm3Var.c();
        if (q04Var != null && c2 != null) {
            return q04Var.h(y55Var.i(c2.E(0L)), i, vd6Var);
        }
        return vr6.b;
    }

    public static final hs3 G(hs3 hs3Var) {
        vf3 vf3Var;
        vf3 vf3Var2 = hs3Var.j0.j0;
        while (true) {
            vf3 u = vf3Var2.u();
            vf3 vf3Var3 = null;
            if (u != null) {
                vf3Var = u.d0;
            } else {
                vf3Var = null;
            }
            if (vf3Var != null) {
                vf3 u2 = vf3Var2.u();
                if (u2 != null) {
                    vf3Var3 = u2.d0;
                }
                vf3Var3.getClass();
                if (vf3Var3.c0) {
                    vf3Var2 = vf3Var2.u();
                    vf3Var2.getClass();
                } else {
                    vf3 u3 = vf3Var2.u();
                    u3.getClass();
                    vf3Var2 = u3.d0;
                    vf3Var2.getClass();
                }
            } else {
                hs3 W0 = ((m74) vf3Var2.A0.e).W0();
                W0.getClass();
                return W0;
            }
        }
    }

    public static final String H(tu0 tu0Var, int i) {
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.j(ue.a);
        Resources resources = ((Context) sk2Var.j(ue.b)).getResources();
        if (i == 0) {
            return resources.getString(R.string.navigation_menu);
        }
        if (i == 1) {
            return resources.getString(R.string.close_drawer);
        }
        if (i == 2) {
            return resources.getString(R.string.close_sheet);
        }
        if (i == 3) {
            return resources.getString(R.string.default_error_message);
        }
        if (i == 4) {
            return resources.getString(R.string.dropdown_menu);
        }
        if (i == 5) {
            return resources.getString(R.string.range_start);
        }
        if (i == 6) {
            return resources.getString(R.string.range_end);
        }
        if (i == 7) {
            return resources.getString(R.string.mc2_snackbar_pane_title);
        }
        return "";
    }

    public static final int I(ls5 ls5Var) {
        ls5Var.getClass();
        ns5 i0 = ls5Var.i0("SELECT changes()");
        try {
            i0.a0();
            int i = (int) i0.getLong(0);
            iq2.h(i0, null);
            return i;
        } finally {
        }
    }

    public static final ax2 J() {
        ax2 ax2Var = e;
        if (ax2Var != null) {
            return ax2Var;
        }
        zw2 zw2Var = new zw2("Filled.Tune", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = f77.a;
        mb6 mb6Var = new mb6(xq0.b);
        vq2 vq2Var = new vq2(1, (byte) 0);
        vq2Var.o(3.0f, 17.0f);
        vq2Var.u(2.0f);
        vq2Var.l(6.0f);
        vq2Var.u(-2.0f);
        vq2Var.m(3.0f, 17.0f);
        vq2Var.g();
        vq2Var.o(3.0f, 5.0f);
        vq2Var.u(2.0f);
        vq2Var.l(10.0f);
        vq2Var.m(13.0f, 5.0f);
        vq2Var.m(3.0f, 5.0f);
        vq2Var.g();
        vq2Var.o(13.0f, 21.0f);
        vq2Var.u(-2.0f);
        vq2Var.l(8.0f);
        vq2Var.u(-2.0f);
        vq2Var.l(-8.0f);
        vq2Var.u(-2.0f);
        vq2Var.l(-2.0f);
        vq2Var.u(6.0f);
        vq2Var.l(2.0f);
        vq2Var.g();
        vq2Var.o(7.0f, 9.0f);
        vq2Var.u(2.0f);
        vq2Var.m(3.0f, 11.0f);
        vq2Var.u(2.0f);
        vq2Var.l(4.0f);
        vq2Var.u(2.0f);
        vq2Var.l(2.0f);
        vq2Var.m(9.0f, 9.0f);
        vq2Var.m(7.0f, 9.0f);
        vq2Var.g();
        vq2Var.o(21.0f, 13.0f);
        vq2Var.u(-2.0f);
        vq2Var.m(11.0f, 11.0f);
        vq2Var.u(2.0f);
        vq2Var.l(10.0f);
        vq2Var.g();
        vq2Var.o(15.0f, 9.0f);
        vq2Var.l(2.0f);
        vq2Var.m(17.0f, 7.0f);
        vq2Var.l(4.0f);
        vq2Var.m(21.0f, 5.0f);
        vq2Var.l(-4.0f);
        vq2Var.m(17.0f, 3.0f);
        vq2Var.l(-2.0f);
        vq2Var.u(6.0f);
        vq2Var.g();
        zw2.a(zw2Var, vq2Var.b, 0, mb6Var);
        ax2 b2 = zw2Var.b();
        e = b2;
        return b2;
    }

    public static boolean K(Context context) {
        boolean z;
        ((b81) ((bg2) mh7.L(context, bg2.class))).getClass();
        Set set = Collections.EMPTY_SET;
        if (set.size() <= 1) {
            z = true;
        } else {
            z = false;
        }
        jk2.n(z, "Cannot bind the flag @DisableFragmentGetContextFix more than once.", new Object[0]);
        if (set.isEmpty()) {
            return true;
        }
        return ((Boolean) set.iterator().next()).booleanValue();
    }

    public static final boolean L(vf3 vf3Var) {
        int i = wv3.a[vf3Var.B0.d.ordinal()];
        if (i == 1 || i == 2) {
            return true;
        }
        if (i != 3 && i != 4) {
            if (i == 5) {
                vf3 u = vf3Var.u();
                if (u != null) {
                    return L(u);
                }
                i.i("no parent for idle node");
                return false;
            }
            i.c();
        }
        return false;
    }

    public static boolean M(byte b2) {
        if (b2 > -65) {
            return true;
        }
        return false;
    }

    public static final boolean N(int i) {
        int type = Character.getType(i);
        if (type != 23 && type != 20 && type != 22 && type != 30 && type != 29 && type != 24 && type != 21) {
            return false;
        }
        return true;
    }

    public static final boolean O(int i) {
        if (!Character.isWhitespace(i) && i != 160) {
            return false;
        }
        return true;
    }

    public static final boolean P(int i) {
        int type;
        if (O(i) && (type = Character.getType(i)) != 14 && type != 13 && i != 10) {
            return true;
        }
        return false;
    }

    public static final ArrayList Q(Map map, mi2 mi2Var) {
        Boolean bool;
        map.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            k34 k34Var = (k34) entry.getValue();
            if (k34Var != null) {
                bool = Boolean.valueOf(k34Var.b);
            } else {
                bool = null;
            }
            bool.getClass();
            if (!bool.booleanValue() && !k34Var.c) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : linkedHashMap.keySet()) {
            if (((Boolean) mi2Var.n((String) obj)).booleanValue()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static String R(String str) {
        str.getClass();
        String normalize = Normalizer.normalize(str, Normalizer.Form.NFD);
        normalize.getClass();
        String replaceAll = yo5.I.A.matcher(normalize).replaceAll("");
        replaceAll.getClass();
        String lowerCase = replaceAll.toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        return lowerCase;
    }

    public static final void S(z86 z86Var, xs xsVar, int i) {
        while (true) {
            int i2 = z86Var.v;
            if (i <= i2 || i >= z86Var.u) {
                if (i2 == 0 && i == 0) {
                    return;
                }
                z86Var.M();
                if (z86Var.y(z86Var.v)) {
                    xsVar.s();
                }
                z86Var.j();
            } else {
                return;
            }
        }
    }

    public static final ds6 T(ds6 ds6Var, sd3 sd3Var) {
        int i;
        int i2;
        float f2;
        xb6 xb6Var = ds6Var.a;
        qq6 qq6Var = yb6.d;
        qq6 qq6Var2 = xb6Var.a;
        if (qq6Var2.equals(pq6.a)) {
            qq6Var2 = yb6.d;
        }
        qq6 qq6Var3 = qq6Var2;
        long j = xb6Var.b;
        js6[] js6VarArr = is6.b;
        if ((j & 1095216660480L) == 0) {
            j = yb6.a;
        }
        long j2 = j;
        pe2 pe2Var = xb6Var.c;
        if (pe2Var == null) {
            pe2Var = pe2.Y;
        }
        pe2 pe2Var2 = pe2Var;
        ke2 ke2Var = xb6Var.d;
        if (ke2Var != null) {
            i = ke2Var.a;
        } else {
            i = 0;
        }
        ke2 ke2Var2 = new ke2(i);
        le2 le2Var = xb6Var.e;
        if (le2Var != null) {
            i2 = le2Var.a;
        } else {
            i2 = 65535;
        }
        le2 le2Var2 = new le2(i2);
        pd2 pd2Var = xb6Var.f;
        if (pd2Var == null) {
            pd2Var = pd2.A;
        }
        pd2 pd2Var2 = pd2Var;
        String str = xb6Var.g;
        if (str == null) {
            str = "";
        }
        String str2 = str;
        long j3 = xb6Var.h;
        if ((j3 & 1095216660480L) == 0) {
            j3 = yb6.b;
        }
        long j4 = j3;
        d10 d10Var = xb6Var.i;
        float f3 = RecyclerView.A1;
        if (d10Var != null) {
            f2 = d10Var.a;
        } else {
            f2 = 0.0f;
        }
        if (!Float.isNaN(f2)) {
            f3 = f2;
        }
        d10 d10Var2 = new d10(f3);
        rq6 rq6Var = xb6Var.j;
        if (rq6Var == null) {
            rq6Var = rq6.c;
        }
        rq6 rq6Var2 = rq6Var;
        fr3 fr3Var = xb6Var.k;
        if (fr3Var == null) {
            fr3 fr3Var2 = fr3.L;
            fr3Var = jo4.a.t();
        }
        fr3 fr3Var3 = fr3Var;
        long j5 = xb6Var.l;
        if (j5 == 16) {
            j5 = yb6.c;
        }
        long j6 = j5;
        qo6 qo6Var = xb6Var.m;
        if (qo6Var == null) {
            qo6Var = qo6.b;
        }
        qo6 qo6Var2 = qo6Var;
        u26 u26Var = xb6Var.n;
        if (u26Var == null) {
            u26Var = u26.d;
        }
        u26 u26Var2 = u26Var;
        yo4 yo4Var = xb6Var.o;
        ik1 ik1Var = xb6Var.p;
        if (ik1Var == null) {
            ik1Var = r72.a;
        }
        xb6 xb6Var2 = new xb6(qq6Var3, j2, pe2Var2, ke2Var2, le2Var2, pd2Var2, str2, j4, d10Var2, rq6Var2, fr3Var3, j6, qo6Var2, u26Var2, yo4Var, ik1Var);
        bj4 bj4Var = ds6Var.b;
        int i3 = cj4.b;
        int i4 = bj4Var.a;
        int i5 = 5;
        if (i4 == 0) {
            i4 = 5;
        }
        int i6 = bj4Var.b;
        if (i6 == 3) {
            int i7 = es6.a[sd3Var.ordinal()];
            if (i7 != 1) {
                if (i7 != 2) {
                    i.c();
                    return null;
                }
            } else {
                i5 = 4;
            }
            i6 = i5;
        } else if (i6 == 0) {
            int i8 = es6.a[sd3Var.ordinal()];
            if (i8 != 1) {
                if (i8 == 2) {
                    i6 = 2;
                } else {
                    i.c();
                    return null;
                }
            } else {
                i6 = 1;
            }
        }
        long j7 = bj4Var.c;
        if ((j7 & 1095216660480L) == 0) {
            j7 = cj4.a;
        }
        sq6 sq6Var = bj4Var.d;
        if (sq6Var == null) {
            sq6Var = sq6.c;
        }
        qo4 qo4Var = bj4Var.e;
        vn3 vn3Var = bj4Var.f;
        int i9 = bj4Var.g;
        if (i9 == 0) {
            i9 = qn3.b;
        }
        int i10 = bj4Var.h;
        if (i10 == 0) {
            i10 = 1;
        }
        tr6 tr6Var = bj4Var.i;
        if (tr6Var == null) {
            tr6Var = tr6.c;
        }
        return new ds6(xb6Var2, new bj4(i4, i6, j7, sq6Var, qo4Var, vn3Var, i9, i10, tr6Var), ds6Var.c);
    }

    public static void U(ViewGroup viewGroup, boolean z) {
        if (Build.VERSION.SDK_INT >= 29) {
            fp.v(viewGroup, z);
        } else if (f) {
            try {
                fp.v(viewGroup, z);
            } catch (NoSuchMethodError unused) {
                f = false;
            }
        }
    }

    public static String V(long j) {
        return "PointerId(value=" + j + ')';
    }

    public static final void a(vw2 vw2Var, zy3 zy3Var, qi4 qi4Var, qi4 qi4Var2, tu0 tu0Var, int i) {
        mi2 f67Var;
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.Y(1693837359);
        j20 j20Var = y60.Z;
        c55 t = hi2.t(xq3.a, sk2Var);
        int i2 = ((i << 3) & 7168) | 2392632;
        sk2Var.Y(-1481548872);
        vv vvVar = new vv(vw2Var, j12.a, t);
        i55 i55Var = g67.b;
        if (qi4Var == null && qi4Var2 == null && qi4Var2 == null) {
            f67Var = tv.o0;
        } else {
            f67Var = new f67(qi4Var, qi4Var2, qi4Var2, 0);
        }
        mi2 mi2Var = f67Var;
        n40.d(vvVar, null, zy3Var, mi2Var, null, j20Var, r01.b, 1.0f, 1, sk2Var, 48 | ((i2 >> 3) & 896), 0);
        sk2Var.p(false);
        sk2Var.p(false);
    }

    public static final void b(Object obj, String str, zy3 zy3Var, s01 s01Var, float f2, tu0 tu0Var, int i, int i2) {
        iq0 iq0Var;
        float f3;
        int i3;
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.Y(1451072229);
        j20 j20Var = y60.Z;
        if ((i2 & 64) != 0) {
            iq0Var = r01.b;
        } else {
            iq0Var = s01Var;
        }
        if ((i2 & 128) != 0) {
            f3 = 1.0f;
        } else {
            f3 = f2;
        }
        if ((i2 & 512) != 0) {
            i3 = 1;
        } else {
            i3 = 0;
        }
        c55 t = hi2.t(xq3.a, sk2Var);
        int i4 = i << 3;
        int i5 = (i & 112) | 520 | (i4 & 7168) | (i4 & 57344) | (i4 & 458752) | (i4 & 3670016) | (i4 & 29360128) | (i4 & 234881024) | (i4 & 1879048192);
        sk2Var.Y(2032051394);
        vv vvVar = new vv(obj, j12.a, t);
        int i6 = i5 & 112;
        int i7 = i5 >> 3;
        n40.d(vvVar, str, zy3Var, tv.o0, null, j20Var, iq0Var, f3, i3, sk2Var, i6 | (i7 & 896) | (i7 & 7168) | (i7 & 57344) | (i7 & 458752) | (i7 & 3670016) | (i7 & 29360128) | (i7 & 234881024) | ((((i >> 27) & 14) << 27) & 1879048192), 0);
        sk2Var.p(false);
        sk2Var.p(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(final defpackage.qi4 r16, final defpackage.zy3 r17, defpackage.ub r18, defpackage.s01 r19, float r20, defpackage.tu0 r21, final int r22, final int r23) {
        /*
            Method dump skipped, instructions count: 319
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cg2.c(qi4, zy3, ub, s01, float, tu0, int, int):void");
    }

    public static final void d(nh nhVar, zy3 zy3Var, int i, tu0 tu0Var, int i2, int i3) {
        s01 s01Var;
        j20 j20Var = y60.Z;
        if ((i3 & 16) != 0) {
            s01Var = r01.b;
        } else {
            s01Var = r01.a;
        }
        s01 s01Var2 = s01Var;
        if ((i3 & 128) != 0) {
            i = 1;
        }
        sk2 sk2Var = (sk2) tu0Var;
        boolean f2 = sk2Var.f(nhVar);
        Object L = sk2Var.L();
        if (f2 || L == su0.a) {
            L = w81.b(nhVar, i);
            sk2Var.h0(L);
        }
        c((y20) L, zy3Var, j20Var, s01Var2, 1.0f, sk2Var, (i2 & 896) | 56 | (57344 & i2), 0);
    }

    public static final void e(p3 p3Var, tu0 tu0Var, int i) {
        int i2;
        boolean z;
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.Z(1372074852);
        if (sk2Var.h(p3Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i3 = i2 | i;
        if ((i3 & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        if (sk2Var.O(i3 & 1, z)) {
            pu.a(b53.X(wy3.a, 8.0f), p3Var.c, p3Var.e, null, ct3.H0(759418494, new km4(8, p3Var), sk2Var), sk2Var, 24582, 8);
        } else {
            sk2Var.R();
        }
        m55 r = sk2Var.r();
        if (r != null) {
            r.d = new z5(i, 17, p3Var);
        }
    }

    public static final b54 f(BackEvent backEvent) {
        float touchX;
        float touchY;
        float progress;
        int swipeEdge;
        long j;
        touchX = backEvent.getTouchX();
        touchY = backEvent.getTouchY();
        progress = backEvent.getProgress();
        swipeEdge = backEvent.getSwipeEdge();
        if (Build.VERSION.SDK_INT >= 36) {
            j = backEvent.getFrameTimeMillis();
        } else {
            j = 0;
        }
        return new b54(swipeEdge, progress, touchX, touchY, j);
    }

    public static final void g(b25 b25Var, tu0 tu0Var, int i) {
        int i2;
        boolean z;
        mv0 mv0Var;
        mv0 mv0Var2;
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.Z(-713521460);
        if (sk2Var.h(b25Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i3 = i | i2;
        if ((i3 & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        if (sk2Var.O(i3 & 1, z)) {
            jd7 C = mj2.C(sk2Var);
            fr5 b2 = gr5.b(15.0f);
            NumberFormat integerInstance = NumberFormat.getIntegerInstance();
            wy3 wy3Var = wy3.a;
            zy3 t = a53.t(b53.Y(wy3Var, 16.0f, 8.0f), b2);
            long j = C.d;
            is2 is2Var = iq2.g;
            zy3 i4 = dk7.i(t, j, is2Var);
            long j2 = jd7.p;
            zy3 z2 = b53.z(1.0f, xq0.b(0.35f, j2), i4, b2);
            j20 j20Var = y60.L;
            tv3 d2 = d50.d(j20Var, false);
            int hashCode = Long.hashCode(sk2Var.T);
            sm4 l = sk2Var.l();
            zy3 e0 = l07.e0(sk2Var, z2);
            nu0.i.getClass();
            mv0 mv0Var3 = mu0.b;
            sk2Var.b0();
            if (sk2Var.S) {
                sk2Var.k(mv0Var3);
            } else {
                sk2Var.k0();
            }
            dn dnVar = mu0.f;
            oo2.S(sk2Var, dnVar, d2);
            dn dnVar2 = mu0.e;
            oo2.S(sk2Var, dnVar2, l);
            Integer valueOf = Integer.valueOf(hashCode);
            dn dnVar3 = mu0.g;
            oo2.S(sk2Var, dnVar3, valueOf);
            yd ydVar = mu0.h;
            oo2.P(sk2Var, ydVar);
            dn dnVar4 = mu0.d;
            oo2.S(sk2Var, dnVar4, e0);
            zy3 X = b53.X(wy3Var, 14.0f);
            i20 i20Var = y60.h0;
            lt ltVar = rt.a;
            sr5 a2 = rr5.a(ltVar, i20Var, sk2Var, 48);
            int hashCode2 = Long.hashCode(sk2Var.T);
            sm4 l2 = sk2Var.l();
            zy3 e02 = l07.e0(sk2Var, X);
            sk2Var.b0();
            if (sk2Var.S) {
                sk2Var.k(mv0Var3);
            } else {
                sk2Var.k0();
            }
            oo2.S(sk2Var, dnVar, a2);
            oo2.S(sk2Var, dnVar2, l2);
            b31.x(hashCode2, sk2Var, dnVar3, sk2Var, ydVar);
            oo2.S(sk2Var, dnVar4, e02);
            tw2 tw2Var = new tw2((Context) sk2Var.j(ue.b));
            tw2Var.c = wh1.A("https://media.retroachievements.org/UserPic/", b25Var.a, ".png");
            tw2Var.b(true);
            b(tw2Var.a(), null, dk7.i(a53.t(o76.h(wy3Var, 46.0f), gr5.a), xq0.b(0.18f, j2), is2Var), null, RecyclerView.A1, sk2Var, 48, 4088);
            zy3 b0 = b53.b0(wy3Var, 13.0f, RecyclerView.A1, RecyclerView.A1, RecyclerView.A1, 14);
            lr0 a3 = jr0.a(rt.c, y60.j0, sk2Var, 0);
            int hashCode3 = Long.hashCode(sk2Var.T);
            sm4 l3 = sk2Var.l();
            zy3 e03 = l07.e0(sk2Var, b0);
            sk2Var.b0();
            if (sk2Var.S) {
                mv0Var = mv0Var3;
                sk2Var.k(mv0Var);
            } else {
                mv0Var = mv0Var3;
                sk2Var.k0();
            }
            oo2.S(sk2Var, dnVar, a3);
            oo2.S(sk2Var, dnVar2, l3);
            b31.x(hashCode3, sk2Var, dnVar3, sk2Var, ydVar);
            oo2.S(sk2Var, dnVar4, e03);
            sr5 a4 = rr5.a(ltVar, i20Var, sk2Var, 48);
            int hashCode4 = Long.hashCode(sk2Var.T);
            sm4 l4 = sk2Var.l();
            zy3 e04 = l07.e0(sk2Var, wy3Var);
            sk2Var.b0();
            if (sk2Var.S) {
                sk2Var.k(mv0Var);
            } else {
                sk2Var.k0();
            }
            oo2.S(sk2Var, dnVar, a4);
            oo2.S(sk2Var, dnVar2, l4);
            b31.x(hashCode4, sk2Var, dnVar3, sk2Var, ydVar);
            oo2.S(sk2Var, dnVar4, e04);
            mv0 mv0Var4 = mv0Var;
            ev2.a(mh7.N(), null, o76.h(wy3Var, 12.0f), j2, sk2Var, 3504, 0);
            ir6.b(me2.X(sk2Var, R.string.ra_welcome_eyebrow), b53.b0(wy3Var, 5.0f, RecyclerView.A1, RecyclerView.A1, RecyclerView.A1, 14), j2, hi2.B(9), pe2.d0, td7.c, hi2.A(0.8d), null, 0L, 0, false, 0, 0, null, null, sk2Var, 14355888, 0, 130832);
            sk2Var.p(true);
            ir6.b(b25Var.a, b53.b0(wy3Var, RecyclerView.A1, 2.0f, RecyclerView.A1, RecyclerView.A1, 13), C.g, hi2.B(16), pe2.c0, td7.a, 0L, null, 0L, 2, false, 1, 0, null, null, sk2Var, 1772592, 3120, 120720);
            sk2Var = sk2Var;
            zy3 b02 = b53.b0(wy3Var, RecyclerView.A1, 6.0f, RecyclerView.A1, RecyclerView.A1, 13);
            sr5 a5 = rr5.a(ltVar, i20Var, sk2Var, 48);
            int hashCode5 = Long.hashCode(sk2Var.T);
            sm4 l5 = sk2Var.l();
            zy3 e05 = l07.e0(sk2Var, b02);
            sk2Var.b0();
            if (sk2Var.S) {
                mv0Var2 = mv0Var4;
                sk2Var.k(mv0Var2);
            } else {
                mv0Var2 = mv0Var4;
                sk2Var.k0();
            }
            oo2.S(sk2Var, dnVar, a5);
            oo2.S(sk2Var, dnVar2, l5);
            b31.x(hashCode5, sk2Var, dnVar3, sk2Var, ydVar);
            oo2.S(sk2Var, dnVar4, e05);
            String format = integerInstance.format(b25Var.b);
            format.getClass();
            h(me2.W(R.string.ra_profile_hardcore_points, new Object[]{format}, sk2Var), j2, sk2Var, 48);
            zy3 b03 = b53.b0(wy3Var, 6.0f, RecyclerView.A1, RecyclerView.A1, RecyclerView.A1, 14);
            tv3 d3 = d50.d(j20Var, false);
            int hashCode6 = Long.hashCode(sk2Var.T);
            sm4 l6 = sk2Var.l();
            zy3 e06 = l07.e0(sk2Var, b03);
            sk2Var.b0();
            if (sk2Var.S) {
                sk2Var.k(mv0Var2);
            } else {
                sk2Var.k0();
            }
            oo2.S(sk2Var, dnVar, d3);
            oo2.S(sk2Var, dnVar2, l6);
            b31.x(hashCode6, sk2Var, dnVar3, sk2Var, ydVar);
            oo2.S(sk2Var, dnVar4, e06);
            String format2 = integerInstance.format(b25Var.c);
            format2.getClass();
            h(me2.W(R.string.ra_profile_casual_points, new Object[]{format2}, sk2Var), C.l, sk2Var, 0);
            sk2Var.p(true);
            sk2Var.p(true);
            sk2Var.p(true);
            sk2Var.p(true);
            sk2Var.p(true);
        } else {
            sk2Var.R();
        }
        m55 r = sk2Var.r();
        if (r != null) {
            r.d = new z5(i, 24, b25Var);
        }
    }

    public static final void h(final String str, final long j, tu0 tu0Var, final int i) {
        int i2;
        boolean z;
        sk2 sk2Var;
        int i3;
        sk2 sk2Var2 = (sk2) tu0Var;
        sk2Var2.Z(-47713197);
        if (sk2Var2.f(str)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i4 = i | i2;
        if ((i & 48) == 0) {
            if (sk2Var2.e(j)) {
                i3 = 32;
            } else {
                i3 = 16;
            }
            i4 |= i3;
        }
        if ((i4 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (sk2Var2.O(i4 & 1, z)) {
            sd2 sd2Var = td7.b;
            int i5 = i4;
            sk2Var = sk2Var2;
            ir6.b(str, b53.Y(dk7.i(a53.t(wy3.a, gr5.b(6.0f)), xq0.b(0.14f, j), iq2.g), 7.0f, 3.0f), j, hi2.B(10), pe2.c0, sd2Var, hi2.A(0.4d), null, 0L, 0, false, 0, 0, null, null, sk2Var, (i5 & 14) | 14355456 | ((i5 << 3) & 896), 0, 130832);
        } else {
            sk2Var = sk2Var2;
            sk2Var.R();
        }
        m55 r = sk2Var.r();
        if (r != null) {
            r.d = new aj2() { // from class: td5
                @Override // defpackage.aj2
                public final Object j(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ep2.I(i | 1);
                    cg2.h(str, j, (tu0) obj, I);
                    return o27.a;
                }
            };
        }
    }

    public static final void i(final String str, final float f2, final op0 op0Var, final boolean z, final mi2 mi2Var, final float f3, tu0 tu0Var, final int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        float f4;
        str.getClass();
        mi2Var.getClass();
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.Z(1905014024);
        if (sk2Var.f(str)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i8 = i | i2;
        if (sk2Var.c(f2)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i9 = i8 | i3;
        if (sk2Var.f(op0Var)) {
            i4 = 256;
        } else {
            i4 = 128;
        }
        int i10 = i9 | i4;
        if (sk2Var.g(z)) {
            i5 = 2048;
        } else {
            i5 = 1024;
        }
        int i11 = i10 | i5;
        if (sk2Var.h(mi2Var)) {
            i6 = 16384;
        } else {
            i6 = 8192;
        }
        int i12 = i11 | i6;
        if (sk2Var.c(f3)) {
            i7 = 131072;
        } else {
            i7 = 65536;
        }
        int i13 = i12 | i7;
        if ((74899 & i13) != 74898) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (sk2Var.O(i13 & 1, z2)) {
            if ((i13 & 112) == 32) {
                z3 = true;
            } else {
                z3 = false;
            }
            Object L = sk2Var.L();
            sn1 sn1Var = su0.a;
            if (z3 || L == sn1Var) {
                L = new pj4(f2);
                sk2Var.h0(L);
            }
            pj4 pj4Var = (pj4) L;
            int i14 = i13 & 896;
            if (i14 == 256) {
                z4 = true;
            } else {
                z4 = false;
            }
            Object L2 = sk2Var.L();
            if (z4 || L2 == sn1Var) {
                L2 = Float.valueOf((op0Var.b - op0Var.a) / 20.0f);
                sk2Var.h0(L2);
            }
            float floatValue = ((Number) L2).floatValue();
            zy3 c2 = o76.c(wy3.a, 1.0f);
            Object L3 = sk2Var.L();
            if (L3 == sn1Var) {
                L3 = new d5(17);
                sk2Var.h0(L3);
            }
            zy3 s = a53.s(c2, z, null, (ki2) L3, 14);
            boolean f5 = sk2Var.f(pj4Var) | sk2Var.c(floatValue);
            if (i14 == 256) {
                z5 = true;
            } else {
                z5 = false;
            }
            boolean z6 = z5 | f5;
            Object L4 = sk2Var.L();
            if (z6 || L4 == sn1Var) {
                L4 = new sx5(floatValue, op0Var, pj4Var);
                sk2Var.h0(L4);
            }
            zy3 a0 = b53.a0(o76.e(64.0f, 2, w81.A(s, (mi2) L4)), f3, 8.0f, f3, 8.0f);
            lr0 a2 = jr0.a(rt.c, y60.j0, sk2Var, 0);
            int hashCode = Long.hashCode(sk2Var.T);
            sm4 l = sk2Var.l();
            zy3 e0 = l07.e0(sk2Var, a0);
            nu0.i.getClass();
            mv0 mv0Var = mu0.b;
            sk2Var.b0();
            if (sk2Var.S) {
                sk2Var.k(mv0Var);
            } else {
                sk2Var.k0();
            }
            oo2.S(sk2Var, mu0.f, a2);
            oo2.S(sk2Var, mu0.e, l);
            oo2.S(sk2Var, mu0.g, Integer.valueOf(hashCode));
            oo2.P(sk2Var, mu0.h);
            oo2.S(sk2Var, mu0.d, e0);
            tv0 tv0Var = b01.a;
            if (z) {
                sk2Var.X(-838227882);
                long j = ((xq0) sk2Var.j(e01.a)).a;
                if (!((hr0) sk2Var.j(ir0.a)).k() ? mh7.V(j) < 0.5d : mh7.V(j) > 0.5d) {
                    f4 = 1.0f;
                } else {
                    f4 = 0.87f;
                }
                sk2Var.p(false);
            } else {
                sk2Var.X(-838227142);
                long j2 = ((xq0) sk2Var.j(e01.a)).a;
                if (((hr0) sk2Var.j(ir0.a)).k()) {
                    mh7.V(j2);
                } else {
                    mh7.V(j2);
                }
                sk2Var.p(false);
                f4 = 0.38f;
            }
            dk7.a(tv0Var.a(Float.valueOf(f4)), ct3.H0(1351204114, new gi(str, pj4Var, z, op0Var, mi2Var), sk2Var), sk2Var, 56);
            sk2Var.p(true);
        } else {
            sk2Var.R();
        }
        m55 r = sk2Var.r();
        if (r != null) {
            r.d = new aj2(str, f2, op0Var, z, mi2Var, f3, i) { // from class: rx5
                public final /* synthetic */ String A;
                public final /* synthetic */ float B;
                public final /* synthetic */ op0 L;
                public final /* synthetic */ boolean R;
                public final /* synthetic */ mi2 X;
                public final /* synthetic */ float Y;

                @Override // defpackage.aj2
                public final Object j(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ep2.I(1);
                    cg2.i(this.A, this.B, this.L, this.R, this.X, this.Y, (tu0) obj, I);
                    return o27.a;
                }
            };
        }
    }

    public static final void j(s3 s3Var, tu0 tu0Var, int i) {
        int i2;
        boolean z;
        boolean z2 = s3Var.b;
        se seVar = s3Var.a;
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.Z(849132524);
        if (sk2Var.f(s3Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i3 = i2 | i;
        if ((i3 & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        if (sk2Var.O(i3 & 1, z)) {
            boolean f2 = sk2Var.f(seVar) | sk2Var.g(z2);
            Object L = sk2Var.L();
            sn1 sn1Var = su0.a;
            if (f2 || L == sn1Var) {
                L = a53.c(1.0f);
                sk2Var.h0(L);
            }
            um umVar = (um) L;
            boolean f3 = sk2Var.f(seVar) | sk2Var.g(z2);
            Object L2 = sk2Var.L();
            if (f3 || L2 == sn1Var) {
                L2 = me2.G(Boolean.FALSE);
                sk2Var.h0(L2);
            }
            k24 k24Var = (k24) L2;
            zy3 X = b53.X(wy3.a, 8.0f);
            boolean h = sk2Var.h(umVar);
            Object L3 = sk2Var.L();
            if (h || L3 == sn1Var) {
                L3 = new ll3(umVar, 2);
                sk2Var.h0(L3);
            }
            zy3 q = tq5.q(X, (mi2) L3);
            ThreadLocal threadLocal = ac5.a;
            Drawable drawable = ((Resources) sk2Var.j(ue.c)).getDrawable(R.drawable.ic_ra_error, null);
            drawable.getClass();
            pu.a(q, drawable, s3Var.c, new xq0(s25.b), ct3.H0(-1497146478, new m4(s3Var, k24Var, umVar, 8), sk2Var), sk2Var, 27648, 0);
        } else {
            sk2Var.R();
        }
        m55 r = sk2Var.r();
        if (r != null) {
            r.d = new bt5(i, 3, s3Var);
        }
    }

    public static final void k(tu0 tu0Var, zy3 zy3Var) {
        wf wfVar = wf.l;
        sk2 sk2Var = (sk2) tu0Var;
        int hashCode = Long.hashCode(sk2Var.T);
        zy3 e0 = l07.e0(tu0Var, zy3Var);
        sm4 l = sk2Var.l();
        nu0.i.getClass();
        mv0 mv0Var = mu0.b;
        sk2 sk2Var2 = (sk2) tu0Var;
        sk2Var2.b0();
        if (sk2Var2.S) {
            sk2Var2.k(mv0Var);
        } else {
            sk2Var2.k0();
        }
        oo2.S(tu0Var, mu0.f, wfVar);
        oo2.S(tu0Var, mu0.e, l);
        oo2.P(tu0Var, mu0.h);
        oo2.S(tu0Var, mu0.d, e0);
        oo2.S(tu0Var, mu0.g, Integer.valueOf(hashCode));
        sk2Var2.p(true);
    }

    public static void l(byte b2, byte b3, byte b4, byte b5, char[] cArr, int i) {
        if (!M(b3)) {
            if ((((b3 + 112) + (b2 << 28)) >> 30) == 0 && !M(b4) && !M(b5)) {
                int i2 = ((b2 & 7) << 18) | ((b3 & 63) << 12) | ((b4 & 63) << 6) | (b5 & 63);
                cArr[i] = (char) ((i2 >>> 10) + 55232);
                cArr[i + 1] = (char) ((i2 & 1023) + 56320);
                return;
            }
        }
        throw i53.a();
    }

    public static void m(byte b2, byte b3, char[] cArr, int i) {
        if (b2 >= -62 && !M(b3)) {
            cArr[i] = (char) (((b2 & 31) << 6) | (b3 & 63));
            return;
        }
        throw i53.a();
    }

    public static void n(byte b2, byte b3, byte b4, char[] cArr, int i) {
        if (!M(b3) && ((b2 != -32 || b3 >= -96) && ((b2 != -19 || b3 < -96) && !M(b4)))) {
            cArr[i] = (char) (((b2 & 15) << 12) | ((b3 & 63) << 6) | (b4 & 63));
            return;
        }
        throw i53.a();
    }

    public static final int o(fs3 fs3Var, ds2 ds2Var) {
        long I0;
        fs3 z0 = fs3Var.z0();
        if (z0 == null) {
            mz2.c("Child of " + fs3Var + " cannot be null when calculating alignment line");
        }
        if (fs3Var.G0().e().containsKey(ds2Var)) {
            Integer num = (Integer) fs3Var.G0().e().get(ds2Var);
            if (num != null) {
                return num.intValue();
            }
        } else {
            int j0 = z0.j0(ds2Var);
            if (j0 != Integer.MIN_VALUE) {
                z0.e0 = true;
                fs3Var.f0 = true;
                fs3Var.M0();
                z0.e0 = false;
                fs3Var.f0 = false;
                if (ds2Var instanceof ds2) {
                    I0 = z0.I0() & 4294967295L;
                } else {
                    I0 = z0.I0() >> 32;
                }
                return j0 + ((int) I0);
            }
        }
        return Integer.MIN_VALUE;
    }

    public static final int p(hm3 hm3Var, long j, fa7 fa7Var) {
        long E;
        int D;
        mr6 d2 = hm3Var.d();
        if (d2 != null) {
            q04 q04Var = d2.a.b;
            rd3 c2 = hm3Var.c();
            if (c2 != null && (D = D(q04Var, (E = c2.E(j)), fa7Var)) != -1) {
                return q04Var.g(mb4.a(E, (q04Var.b(D) + q04Var.f(D)) / 2.0f, 1));
            }
        }
        return -1;
    }

    public static final long q(hm3 hm3Var, y55 y55Var, y55 y55Var2, int i) {
        long F = F(hm3Var, y55Var, i);
        if (vr6.c(F)) {
            return vr6.b;
        }
        long F2 = F(hm3Var, y55Var2, i);
        if (vr6.c(F2)) {
            return vr6.b;
        }
        int i2 = (int) (F >> 32);
        int i3 = (int) (F2 & 4294967295L);
        return ve2.g(Math.min(i2, i2), Math.max(i3, i3));
    }

    public static final boolean r(lr6 lr6Var, int i) {
        q04 q04Var = lr6Var.b;
        int d2 = q04Var.d(i);
        if (i == lr6Var.g(d2) || i == q04Var.c(d2, false) ? lr6Var.h(i) != lr6Var.a(i) : lr6Var.a(i) != lr6Var.a(i - 1)) {
            return true;
        }
        return false;
    }

    public static final long s(PointF pointF) {
        return (Float.floatToRawIntBits(pointF.x) << 32) | (Float.floatToRawIntBits(pointF.y) & 4294967295L);
    }

    public static final List u(ej3 ej3Var, nj3 nj3Var, l50 l50Var) {
        boolean z;
        b33 b33Var;
        o24 o24Var = l50Var.a;
        if (o24Var.L != 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z && nj3Var.A.isEmpty()) {
            return pp1.A;
        }
        ArrayList arrayList = new ArrayList();
        if (l50Var.a.L != 0) {
            int i = o24Var.L;
            if (i != 0) {
                Object[] objArr = o24Var.A;
                int i2 = ((pi3) objArr[0]).a;
                for (int i3 = 0; i3 < i; i3++) {
                    int i4 = ((pi3) objArr[i3]).a;
                    if (i4 < i2) {
                        i2 = i4;
                    }
                }
                if (i2 < 0) {
                    pz2.a("negative minIndex");
                }
                int i5 = o24Var.L;
                if (i5 != 0) {
                    Object[] objArr2 = o24Var.A;
                    int i6 = ((pi3) objArr2[0]).b;
                    for (int i7 = 0; i7 < i5; i7++) {
                        int i8 = ((pi3) objArr2[i7]).b;
                        if (i8 > i6) {
                            i6 = i8;
                        }
                    }
                    b33Var = new b33(i2, Math.min(i6, ej3Var.a() - 1), 1);
                } else {
                    vd6.e("MutableVector is empty.");
                    return null;
                }
            } else {
                vd6.e("MutableVector is empty.");
                return null;
            }
        } else {
            b33Var = d33.R;
        }
        int size = nj3Var.A.size();
        for (int i9 = 0; i9 < size; i9++) {
            mj3 mj3Var = (mj3) nj3Var.get(i9);
            int J = gk2.J(mj3Var.c, ej3Var, mj3Var.a);
            int i10 = b33Var.A;
            if ((J > b33Var.B || i10 > J) && J >= 0 && J < ej3Var.a()) {
                arrayList.add(Integer.valueOf(J));
            }
        }
        int i11 = b33Var.A;
        int i12 = b33Var.B;
        if (i11 <= i12) {
            while (true) {
                arrayList.add(Integer.valueOf(i11));
                if (i11 == i12) {
                    break;
                }
                i11++;
            }
        }
        return arrayList;
    }

    public static final zn6 v(vc1 vc1Var) {
        lo6 lo6Var;
        xn6 xn6Var = new xn6();
        ve2.W(vc1Var, bo6.a, new n95(new n95(19, xn6Var), new fa5(1, xn6Var, xn6.class, "addFilter", "addFilter$foundation(Lkotlin/jvm/functions/Function1;)V", 0, 0, 4)));
        w14 w14Var = new w14();
        w14 w14Var2 = xn6Var.a;
        Object[] objArr = w14Var2.a;
        int i = w14Var2.b;
        yn6 yn6Var = null;
        int i2 = 0;
        boolean z = true;
        yn6 yn6Var2 = null;
        while (true) {
            lo6Var = lo6.b;
            if (i2 >= i) {
                break;
            }
            yn6 yn6Var3 = (yn6) objArr[i2];
            if (!z || yn6Var3 != lo6Var) {
                if (yn6Var3 != lo6Var || yn6Var2 != lo6Var) {
                    if (yn6Var3 != lo6Var) {
                        w14 w14Var3 = xn6Var.b;
                        Object[] objArr2 = w14Var3.a;
                        int i3 = w14Var3.b;
                        for (int i4 = 0; i4 < i3; i4++) {
                            if (((Boolean) ((mi2) objArr2[i4]).n(yn6Var3)).booleanValue()) {
                            }
                        }
                    }
                    w14Var.a(yn6Var3);
                    z = false;
                    yn6Var2 = yn6Var3;
                }
                z = false;
                break;
            }
            i2++;
        }
        if (!w14Var.h()) {
            yn6Var = w14Var.a[w14Var.b - 1];
        }
        if (yn6Var == lo6Var) {
            w14Var.k(w14Var.b - 1);
        }
        u14 u14Var = w14Var.c;
        if (u14Var == null) {
            u14Var = new u14(0, w14Var);
            w14Var.c = u14Var;
        }
        return new zn6(u14Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [z97, java.lang.Object] */
    public static boolean w(View view, KeyEvent keyEvent) {
        ArrayList arrayList;
        int size;
        int indexOfKey;
        WeakHashMap weakHashMap = aa7.a;
        if (Build.VERSION.SDK_INT < 28) {
            ArrayList arrayList2 = z97.d;
            z97 z97Var = (z97) view.getTag(R.id.tag_unhandled_key_event_manager);
            WeakReference weakReference = null;
            z97 z97Var2 = z97Var;
            if (z97Var == null) {
                ?? obj = new Object();
                obj.a = null;
                obj.b = null;
                obj.c = null;
                view.setTag(R.id.tag_unhandled_key_event_manager, obj);
                z97Var2 = obj;
            }
            WeakReference weakReference2 = z97Var2.c;
            if (weakReference2 == null || weakReference2.get() != keyEvent) {
                z97Var2.c = new WeakReference(keyEvent);
                if (z97Var2.b == null) {
                    z97Var2.b = new SparseArray();
                }
                SparseArray sparseArray = z97Var2.b;
                if (keyEvent.getAction() == 1 && (indexOfKey = sparseArray.indexOfKey(keyEvent.getKeyCode())) >= 0) {
                    weakReference = (WeakReference) sparseArray.valueAt(indexOfKey);
                    sparseArray.removeAt(indexOfKey);
                }
                if (weakReference == null) {
                    weakReference = (WeakReference) sparseArray.get(keyEvent.getKeyCode());
                }
                if (weakReference != null) {
                    View view2 = (View) weakReference.get();
                    if (view2 == null || !view2.isAttachedToWindow() || (arrayList = (ArrayList) view2.getTag(R.id.tag_unhandled_key_listeners)) == null || (size = arrayList.size() - 1) < 0) {
                        return true;
                    }
                    arrayList.get(size).getClass();
                    c44.b();
                    return false;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:86:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean x(defpackage.ea3 r6, android.view.View r7, android.view.Window.Callback r8, android.view.KeyEvent r9) {
        /*
            r0 = 0
            if (r6 != 0) goto L5
            goto Le4
        L5:
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 28
            if (r1 < r2) goto L10
            boolean r6 = r6.e(r9)
            return r6
        L10:
            boolean r1 = r8 instanceof android.app.Activity
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L82
            android.app.Activity r8 = (android.app.Activity) r8
            r8.onUserInteraction()
            android.view.Window r6 = r8.getWindow()
            r7 = 8
            boolean r7 = r6.hasFeature(r7)
            if (r7 == 0) goto L65
            android.app.ActionBar r7 = r8.getActionBar()
            int r1 = r9.getKeyCode()
            r4 = 82
            if (r1 != r4) goto L65
            if (r7 == 0) goto L65
            boolean r1 = defpackage.cg2.a
            if (r1 != 0) goto L4d
            java.lang.Class r1 = r7.getClass()     // Catch: java.lang.NoSuchMethodException -> L4b
            java.lang.String r4 = "onMenuKeyEvent"
            java.lang.Class<android.view.KeyEvent> r5 = android.view.KeyEvent.class
            java.lang.Class[] r5 = new java.lang.Class[]{r5}     // Catch: java.lang.NoSuchMethodException -> L4b
            java.lang.reflect.Method r1 = r1.getMethod(r4, r5)     // Catch: java.lang.NoSuchMethodException -> L4b
            defpackage.cg2.b = r1     // Catch: java.lang.NoSuchMethodException -> L4b
        L4b:
            defpackage.cg2.a = r3
        L4d:
            java.lang.reflect.Method r1 = defpackage.cg2.b
            if (r1 == 0) goto L62
            java.lang.Object[] r4 = new java.lang.Object[]{r9}     // Catch: java.lang.Throwable -> L62
            java.lang.Object r7 = r1.invoke(r7, r4)     // Catch: java.lang.Throwable -> L62
            if (r7 != 0) goto L5c
            goto L62
        L5c:
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: java.lang.Throwable -> L62
            boolean r0 = r7.booleanValue()     // Catch: java.lang.Throwable -> L62
        L62:
            if (r0 == 0) goto L65
            goto L81
        L65:
            boolean r7 = r6.superDispatchKeyEvent(r9)
            if (r7 == 0) goto L6c
            goto L81
        L6c:
            android.view.View r6 = r6.getDecorView()
            boolean r7 = defpackage.aa7.d(r6, r9)
            if (r7 == 0) goto L77
            goto L81
        L77:
            if (r6 == 0) goto L7d
            android.view.KeyEvent$DispatcherState r2 = r6.getKeyDispatcherState()
        L7d:
            boolean r3 = r9.dispatch(r8, r2, r8)
        L81:
            return r3
        L82:
            boolean r1 = r8 instanceof android.app.Dialog
            if (r1 == 0) goto Ld5
            android.app.Dialog r8 = (android.app.Dialog) r8
            boolean r6 = defpackage.cg2.c
            if (r6 != 0) goto L9b
            java.lang.Class<android.app.Dialog> r6 = android.app.Dialog.class
            java.lang.String r7 = "mOnKeyListener"
            java.lang.reflect.Field r6 = r6.getDeclaredField(r7)     // Catch: java.lang.NoSuchFieldException -> L99
            defpackage.cg2.d = r6     // Catch: java.lang.NoSuchFieldException -> L99
            r6.setAccessible(r3)     // Catch: java.lang.NoSuchFieldException -> L99
        L99:
            defpackage.cg2.c = r3
        L9b:
            java.lang.reflect.Field r6 = defpackage.cg2.d
            if (r6 == 0) goto La6
            java.lang.Object r6 = r6.get(r8)     // Catch: java.lang.IllegalAccessException -> La6
            android.content.DialogInterface$OnKeyListener r6 = (android.content.DialogInterface.OnKeyListener) r6     // Catch: java.lang.IllegalAccessException -> La6
            goto La7
        La6:
            r6 = r2
        La7:
            if (r6 == 0) goto Lb4
            int r7 = r9.getKeyCode()
            boolean r6 = r6.onKey(r8, r7, r9)
            if (r6 == 0) goto Lb4
            goto Ld4
        Lb4:
            android.view.Window r6 = r8.getWindow()
            boolean r7 = r6.superDispatchKeyEvent(r9)
            if (r7 == 0) goto Lbf
            goto Ld4
        Lbf:
            android.view.View r6 = r6.getDecorView()
            boolean r7 = defpackage.aa7.d(r6, r9)
            if (r7 == 0) goto Lca
            goto Ld4
        Lca:
            if (r6 == 0) goto Ld0
            android.view.KeyEvent$DispatcherState r2 = r6.getKeyDispatcherState()
        Ld0:
            boolean r3 = r9.dispatch(r8, r2, r8)
        Ld4:
            return r3
        Ld5:
            if (r7 == 0) goto Ldd
            boolean r7 = defpackage.aa7.d(r7, r9)
            if (r7 != 0) goto Le3
        Ldd:
            boolean r6 = r6.e(r9)
            if (r6 == 0) goto Le4
        Le3:
            return r3
        Le4:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cg2.x(ea3, android.view.View, android.view.Window$Callback, android.view.KeyEvent):boolean");
    }

    public static final boolean y(long j, long j2) {
        if (j == j2) {
            return true;
        }
        return false;
    }

    public static final ArrayList z(s43 s43Var) {
        List m;
        s43Var.getClass();
        vf3 F0 = ((fs3) s43Var).F0();
        boolean L = L(F0);
        u14 u14Var = (u14) F0.o();
        o24 o24Var = (o24) u14Var.B;
        ArrayList arrayList = new ArrayList(o24Var.L);
        int i = o24Var.L;
        for (int i2 = 0; i2 < i; i2++) {
            vf3 vf3Var = (vf3) u14Var.get(i2);
            if (L) {
                m = vf3Var.l();
            } else {
                m = vf3Var.m();
            }
            arrayList.add(m);
        }
        return arrayList;
    }

    public abstract void t(wa5 wa5Var, Object obj);
}
