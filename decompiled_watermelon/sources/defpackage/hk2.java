package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.text.Layout;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewParent;
import androidx.preference.Preference;
import androidx.recyclerview.widget.RecyclerView;
import java.io.File;
import java.math.BigDecimal;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;
import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: hk2  reason: default package */
/* loaded from: classes.dex */
public abstract class hk2 {
    public static final /* synthetic */ int a = 0;
    public static final /* synthetic */ int b = 0;
    public static ax2 c;
    public static Thread d;

    public hk2() {
        new ConcurrentHashMap();
    }

    public static final Bundle A(Bundle bundle, String str) {
        Bundle bundle2 = bundle.getBundle(str);
        if (bundle2 != null) {
            return bundle2;
        }
        jk2.H(str);
        throw null;
    }

    public static final ArrayList B(Bundle bundle, String str) {
        ArrayList parcelableArrayList;
        Class cls = q75.a(Bundle.class).a;
        cls.getClass();
        if (Build.VERSION.SDK_INT >= 34) {
            parcelableArrayList = p2.d(bundle, str, cls);
        } else {
            parcelableArrayList = bundle.getParcelableArrayList(str);
        }
        if (parcelableArrayList != null) {
            return parcelableArrayList;
        }
        jk2.H(str);
        throw null;
    }

    public static final ax2 C() {
        ax2 ax2Var = c;
        if (ax2Var != null) {
            return ax2Var;
        }
        zw2 zw2Var = new zw2("Filled.SportsEsports", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = f77.a;
        mb6 mb6Var = new mb6(xq0.b);
        vq2 vq2Var = new vq2(1, (byte) 0);
        vq2Var.o(21.58f, 16.09f);
        vq2Var.n(-1.09f, -7.66f);
        vq2Var.h(20.21f, 6.46f, 18.52f, 5.0f, 16.53f, 5.0f);
        vq2Var.k(7.47f);
        vq2Var.h(5.48f, 5.0f, 3.79f, 6.46f, 3.51f, 8.43f);
        vq2Var.n(-1.09f, 7.66f);
        vq2Var.h(2.2f, 17.63f, 3.39f, 19.0f, 4.94f, 19.0f);
        vq2Var.l(RecyclerView.A1);
        vq2Var.i(0.68f, RecyclerView.A1, 1.32f, -0.27f, 1.8f, -0.75f);
        vq2Var.m(9.0f, 16.0f);
        vq2Var.l(6.0f);
        vq2Var.n(2.25f, 2.25f);
        vq2Var.i(0.48f, 0.48f, 1.13f, 0.75f, 1.8f, 0.75f);
        vq2Var.l(RecyclerView.A1);
        vq2Var.h(20.61f, 19.0f, 21.8f, 17.63f, 21.58f, 16.09f);
        vq2Var.g();
        vq2Var.o(11.0f, 11.0f);
        vq2Var.k(9.0f);
        vq2Var.u(2.0f);
        vq2Var.k(8.0f);
        vq2Var.u(-2.0f);
        vq2Var.k(6.0f);
        vq2Var.u(-1.0f);
        vq2Var.l(2.0f);
        vq2Var.t(8.0f);
        vq2Var.l(1.0f);
        vq2Var.u(2.0f);
        vq2Var.l(2.0f);
        vq2Var.t(11.0f);
        vq2Var.g();
        vq2Var.o(15.0f, 10.0f);
        vq2Var.i(-0.55f, RecyclerView.A1, -1.0f, -0.45f, -1.0f, -1.0f);
        vq2Var.i(RecyclerView.A1, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        vq2Var.q(1.0f, 0.45f, 1.0f, 1.0f);
        vq2Var.h(16.0f, 9.55f, 15.55f, 10.0f, 15.0f, 10.0f);
        vq2Var.g();
        vq2Var.o(17.0f, 13.0f);
        vq2Var.i(-0.55f, RecyclerView.A1, -1.0f, -0.45f, -1.0f, -1.0f);
        vq2Var.i(RecyclerView.A1, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        vq2Var.q(1.0f, 0.45f, 1.0f, 1.0f);
        vq2Var.h(18.0f, 12.55f, 17.55f, 13.0f, 17.0f, 13.0f);
        vq2Var.g();
        zw2.a(zw2Var, vq2Var.b, 0, mb6Var);
        ax2 b2 = zw2Var.b();
        c = b2;
        return b2;
    }

    public static final String D(Bundle bundle, String str) {
        str.getClass();
        String string = bundle.getString(str);
        if (string != null) {
            return string;
        }
        jk2.H(str);
        throw null;
    }

    public static final String[] E(Bundle bundle, String str) {
        str.getClass();
        String[] stringArray = bundle.getStringArray(str);
        if (stringArray != null) {
            return stringArray;
        }
        jk2.H(str);
        throw null;
    }

    public static final rb5 F(lr6 lr6Var, int i) {
        kr6 kr6Var = lr6Var.a;
        q04 q04Var = lr6Var.b;
        if (kr6Var.a.B.length() != 0) {
            int d2 = q04Var.d(i);
            if ((i != 0 && d2 == q04Var.d(i - 1)) || (i != kr6Var.a.B.length() && d2 == q04Var.d(i + 1))) {
                return lr6Var.a(i);
            }
        }
        return lr6Var.h(i);
    }

    public static final boolean G(Bundle bundle, String str) {
        str.getClass();
        if (bundle.containsKey(str) && bundle.get(str) == null) {
            return true;
        }
        return false;
    }

    public static final u26 H(u26 u26Var, u26 u26Var2, float f) {
        return new u26(mh7.U(u26Var.a, u26Var2.a, f), ln2.J(u26Var.b, u26Var2.b, f), ep2.y(u26Var.c, u26Var2.c, f));
    }

    public static final t05 I(a15 a15Var) {
        u05 u05Var = a15Var.a;
        long j = u05Var.a;
        String str = u05Var.b;
        String str2 = u05Var.c;
        URL url = new URL(u05Var.d);
        List list = a15Var.b;
        int i = 10;
        ArrayList arrayList = new ArrayList(uq0.y0(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ky4 ky4Var = (ky4) it.next();
            List<ey4> list2 = ky4Var.b;
            ArrayList arrayList2 = new ArrayList(uq0.y0(list2, i));
            for (ey4 ey4Var : list2) {
                arrayList2.add(gk2.Y(ey4Var));
            }
            List<l15> list3 = ky4Var.c;
            ArrayList arrayList3 = new ArrayList(uq0.y0(list3, i));
            for (l15 l15Var : list3) {
                l15Var.getClass();
                arrayList3.add(new j15(l15Var.a, l15Var.b, l15Var.c, l15Var.d, l15Var.e, l15Var.f, l15Var.g, l15Var.h, l15Var.i));
                ky4Var = ky4Var;
                it = it;
            }
            Iterator it2 = it;
            iy4 iy4Var = ky4Var.a;
            long j2 = iy4Var.a;
            long j3 = iy4Var.b;
            String str3 = iy4Var.c;
            gy4 valueOf = gy4.valueOf(iy4Var.d);
            URL url2 = new URI(iy4Var.e).toURL();
            url2.getClass();
            arrayList.add(new hy4(j2, j3, valueOf, str3, url2, arrayList2, arrayList3));
            it = it2;
            i = 10;
        }
        return new t05(j, str2, url, str, arrayList);
    }

    public static BigDecimal J(String str) {
        f(str);
        BigDecimal bigDecimal = new BigDecimal(str);
        if (Math.abs(bigDecimal.scale()) < 10000) {
            return bigDecimal;
        }
        throw new NumberFormatException("Number has unsupported scale: ".concat(str));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x038e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0396 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:191:0x03ac  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x03e4 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:205:0x03f3  */
    /* JADX WARN: Removed duplicated region for block: B:251:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void L(android.view.ViewStructure r38, defpackage.vf3 r39, android.view.autofill.AutofillId r40, java.lang.String r41, defpackage.b65 r42) {
        /*
            Method dump skipped, instructions count: 1037
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hk2.L(android.view.ViewStructure, vf3, android.view.autofill.AutofillId, java.lang.String, b65):void");
    }

    public static final void M(eu euVar, mi2 mi2Var) {
        euVar.getClass();
        m66 m66Var = new m66(999);
        int i = euVar.L;
        int i2 = 0;
        int i3 = 0;
        while (i2 < i) {
            m66Var.put(euVar.f(i2), euVar.i(i2));
            i2++;
            i3++;
            if (i3 == 999) {
                mi2Var.n(m66Var);
                m66Var.clear();
                i3 = 0;
            }
        }
        if (i3 > 0) {
            mi2Var.n(m66Var);
        }
    }

    public static final void N(cs3 cs3Var, mi2 mi2Var) {
        cs3Var.getClass();
        cs3 cs3Var2 = new cs3(999);
        int j = cs3Var.j();
        int i = 0;
        int i2 = 0;
        while (i < j) {
            cs3Var2.g(cs3Var.f(i), cs3Var.k(i));
            i++;
            i2++;
            if (i2 == 999) {
                mi2Var.n(cs3Var2);
                cs3Var2.a();
                i2 = 0;
            }
        }
        if (i2 > 0) {
            mi2Var.n(cs3Var2);
        }
    }

    public static TypedValue O(Context context, int i) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    public static boolean P(Context context, int i, boolean z) {
        TypedValue O = O(context, i);
        if (O != null && O.type == 18) {
            if (O.data != 0) {
                return true;
            }
            return false;
        }
        return z;
    }

    public static TypedValue Q(Context context, int i, String str) {
        TypedValue O = O(context, i);
        if (O != null) {
            return O;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", str, context.getResources().getResourceName(i)));
    }

    public static final long R(long j) {
        int round = Math.round(Float.intBitsToFloat((int) (j >> 32)));
        return (Math.round(Float.intBitsToFloat((int) (j & 4294967295L))) & 4294967295L) | (round << 32);
    }

    public static final long S(long j, kg3 kg3Var) {
        if (kg3Var == kg3.Horizontal) {
            return nz0.a(lz0.j(j), lz0.h(j), lz0.i(j), lz0.g(j));
        }
        return nz0.a(lz0.i(j), lz0.g(j), lz0.j(j), lz0.h(j));
    }

    public static final void T(List list, vi viVar) {
        int i;
        fl4 fl4Var;
        Path path;
        int i2;
        float f;
        int i3;
        fl4 fl4Var2;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        List list2 = list;
        vi viVar2 = viVar;
        Path path2 = viVar2.a;
        Path path3 = viVar2.a;
        if (path2.getFillType() == Path.FillType.EVEN_ODD) {
            i = 1;
        } else {
            i = 0;
        }
        path3.rewind();
        viVar2.h(i);
        if (list2.isEmpty()) {
            fl4Var = nk4.c;
        } else {
            fl4Var = (fl4) list2.get(0);
        }
        int size = list2.size();
        float f10 = RecyclerView.A1;
        int i4 = 0;
        float f11 = 0.0f;
        float f12 = 0.0f;
        float f13 = 0.0f;
        float f14 = 0.0f;
        float f15 = 0.0f;
        float f16 = 0.0f;
        while (i4 < size) {
            fl4 fl4Var3 = (fl4) list2.get(i4);
            if (fl4Var3 instanceof nk4) {
                path3.close();
                path = path3;
                i2 = size;
                f = f10;
                i3 = i4;
                fl4Var2 = fl4Var3;
                f11 = f15;
                f13 = f11;
                f12 = f16;
                f14 = f12;
            } else {
                if (fl4Var3 instanceof zk4) {
                    zk4 zk4Var = (zk4) fl4Var3;
                    float f17 = zk4Var.c;
                    f13 += f17;
                    float f18 = zk4Var.d;
                    f14 += f18;
                    path3.rMoveTo(f17, f18);
                    path = path3;
                    i2 = size;
                    f = f10;
                    i3 = i4;
                    f15 = f13;
                    f16 = f14;
                } else {
                    if (fl4Var3 instanceof rk4) {
                        rk4 rk4Var = (rk4) fl4Var3;
                        float f19 = rk4Var.c;
                        float f20 = rk4Var.d;
                        path3.moveTo(f19, f20);
                        f14 = f20;
                        f16 = f14;
                        path = path3;
                        f13 = f19;
                        f15 = f13;
                    } else {
                        if (fl4Var3 instanceof yk4) {
                            yk4 yk4Var = (yk4) fl4Var3;
                            float f21 = yk4Var.d;
                            float f22 = yk4Var.c;
                            path3.rLineTo(f22, f21);
                            f13 += f22;
                            f14 += f21;
                        } else if (fl4Var3 instanceof qk4) {
                            qk4 qk4Var = (qk4) fl4Var3;
                            float f23 = qk4Var.d;
                            float f24 = qk4Var.c;
                            viVar2.e(f24, f23);
                            f13 = f24;
                            path = path3;
                            f14 = f23;
                        } else if (fl4Var3 instanceof xk4) {
                            float f25 = ((xk4) fl4Var3).c;
                            path3.rLineTo(f25, f10);
                            f13 += f25;
                        } else if (fl4Var3 instanceof pk4) {
                            float f26 = ((pk4) fl4Var3).c;
                            viVar2.e(f26, f14);
                            f13 = f26;
                        } else {
                            if (fl4Var3 instanceof dl4) {
                                f9 = ((dl4) fl4Var3).c;
                                path3.rLineTo(f10, f9);
                            } else if (fl4Var3 instanceof el4) {
                                float f27 = ((el4) fl4Var3).c;
                                viVar2.e(f13, f27);
                                f14 = f27;
                            } else if (fl4Var3 instanceof wk4) {
                                wk4 wk4Var = (wk4) fl4Var3;
                                path3.rCubicTo(wk4Var.c, wk4Var.d, wk4Var.e, wk4Var.f, wk4Var.g, wk4Var.h);
                                f11 = wk4Var.e + f13;
                                f12 = wk4Var.f + f14;
                                f13 += wk4Var.g;
                                f9 = wk4Var.h;
                            } else {
                                if (fl4Var3 instanceof ok4) {
                                    ok4 ok4Var = (ok4) fl4Var3;
                                    path3.cubicTo(ok4Var.c, ok4Var.d, ok4Var.e, ok4Var.f, ok4Var.g, ok4Var.h);
                                    f11 = ok4Var.e;
                                    f12 = ok4Var.f;
                                    f5 = ok4Var.g;
                                    f6 = ok4Var.h;
                                } else if (fl4Var3 instanceof bl4) {
                                    if (fl4Var.a) {
                                        f8 = f14 - f12;
                                        f7 = f13 - f11;
                                    } else {
                                        f7 = f10;
                                        f8 = f7;
                                    }
                                    bl4 bl4Var = (bl4) fl4Var3;
                                    path3.rCubicTo(f7, f8, bl4Var.c, bl4Var.d, bl4Var.e, bl4Var.f);
                                    f11 = bl4Var.c + f13;
                                    f12 = bl4Var.d + f14;
                                    f13 += bl4Var.e;
                                    f9 = bl4Var.f;
                                } else if (fl4Var3 instanceof tk4) {
                                    if (fl4Var.a) {
                                        f13 = (f13 * 2.0f) - f11;
                                        f14 = (2.0f * f14) - f12;
                                    }
                                    tk4 tk4Var = (tk4) fl4Var3;
                                    path3.cubicTo(f13, f14, tk4Var.c, tk4Var.d, tk4Var.e, tk4Var.f);
                                    f11 = tk4Var.c;
                                    f12 = tk4Var.d;
                                    f5 = tk4Var.e;
                                    f6 = tk4Var.f;
                                } else if (fl4Var3 instanceof al4) {
                                    al4 al4Var = (al4) fl4Var3;
                                    float f28 = al4Var.f;
                                    float f29 = al4Var.e;
                                    float f30 = al4Var.d;
                                    float f31 = al4Var.c;
                                    path3.rQuadTo(f31, f30, f29, f28);
                                    float f32 = f31 + f13;
                                    float f33 = f30 + f14;
                                    f13 += f29;
                                    f14 += f28;
                                    f11 = f32;
                                    path = path3;
                                    f12 = f33;
                                } else {
                                    if (fl4Var3 instanceof sk4) {
                                        sk4 sk4Var = (sk4) fl4Var3;
                                        float f34 = sk4Var.f;
                                        float f35 = sk4Var.e;
                                        float f36 = sk4Var.d;
                                        f4 = sk4Var.c;
                                        path3.quadTo(f4, f36, f35, f34);
                                        path = path3;
                                        f14 = f34;
                                        f13 = f35;
                                        f12 = f36;
                                    } else if (fl4Var3 instanceof cl4) {
                                        if (fl4Var.b) {
                                            f2 = f13 - f11;
                                            f3 = f14 - f12;
                                        } else {
                                            f2 = f10;
                                            f3 = f2;
                                        }
                                        cl4 cl4Var = (cl4) fl4Var3;
                                        float f37 = cl4Var.d;
                                        float f38 = cl4Var.c;
                                        path3.rQuadTo(f2, f3, f38, f37);
                                        f4 = f2 + f13;
                                        float f39 = f3 + f14;
                                        f13 += f38;
                                        f14 += f37;
                                        path = path3;
                                        f12 = f39;
                                    } else if (fl4Var3 instanceof uk4) {
                                        if (fl4Var.b) {
                                            f13 = (f13 * 2.0f) - f11;
                                            f14 = (2.0f * f14) - f12;
                                        }
                                        uk4 uk4Var = (uk4) fl4Var3;
                                        float f40 = uk4Var.d;
                                        float f41 = uk4Var.c;
                                        path3.quadTo(f13, f14, f41, f40);
                                        path = path3;
                                        i2 = size;
                                        f = f10;
                                        i3 = i4;
                                        f12 = f14;
                                        fl4Var2 = fl4Var3;
                                        f14 = f40;
                                        f11 = f13;
                                        f13 = f41;
                                    } else if (fl4Var3 instanceof vk4) {
                                        vk4 vk4Var = (vk4) fl4Var3;
                                        float f42 = vk4Var.h + f13;
                                        float f43 = vk4Var.i + f14;
                                        double d2 = vk4Var.c;
                                        double d3 = vk4Var.d;
                                        double d4 = vk4Var.e;
                                        boolean z = vk4Var.f;
                                        boolean z2 = vk4Var.g;
                                        i2 = size;
                                        f = RecyclerView.A1;
                                        path = path3;
                                        i3 = i4;
                                        q(viVar, f13, f14, f42, f43, d2, d3, d4, z, z2);
                                        f11 = f42;
                                        f13 = f11;
                                        f12 = f43;
                                        f14 = f12;
                                        fl4Var2 = fl4Var3;
                                    } else {
                                        path = path3;
                                        i2 = size;
                                        f = f10;
                                        i3 = i4;
                                        if (fl4Var3 instanceof mk4) {
                                            mk4 mk4Var = (mk4) fl4Var3;
                                            float f44 = mk4Var.i;
                                            float f45 = mk4Var.h;
                                            fl4Var2 = fl4Var3;
                                            q(viVar, f13, f14, f45, f44, mk4Var.c, mk4Var.d, mk4Var.e, mk4Var.f, mk4Var.g);
                                            f12 = f44;
                                            f14 = f12;
                                            f11 = f45;
                                            f13 = f11;
                                        } else {
                                            i.c();
                                            return;
                                        }
                                    }
                                    i2 = size;
                                    f = f10;
                                    i3 = i4;
                                    fl4Var2 = fl4Var3;
                                    f11 = f4;
                                }
                                f14 = f6;
                                path = path3;
                                f13 = f5;
                            }
                            f14 += f9;
                        }
                        path = path3;
                    }
                    i2 = size;
                    f = f10;
                    i3 = i4;
                }
                fl4Var2 = fl4Var3;
            }
            i4 = i3 + 1;
            list2 = list;
            viVar2 = viVar;
            size = i2;
            path3 = path;
            fl4Var = fl4Var2;
            f10 = f;
        }
    }

    public static final long U(long j) {
        return (Float.floatToRawIntBits((int) (j & 4294967295L)) & 4294967295L) | (Float.floatToRawIntBits((int) (j >> 32)) << 32);
    }

    public static final void a(zy3 zy3Var, ih4 ih4Var, gn0 gn0Var, mi2 mi2Var, tu0 tu0Var, int i) {
        int i2;
        int i3;
        int i4;
        boolean z;
        zy3Var.getClass();
        ih4Var.getClass();
        gn0Var.getClass();
        mi2Var.getClass();
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.Z(1411501135);
        if (sk2Var.f(ih4Var)) {
            i2 = 32;
        } else {
            i2 = 16;
        }
        int i5 = i | i2;
        if (sk2Var.f(gn0Var)) {
            i3 = 256;
        } else {
            i3 = 128;
        }
        int i6 = i5 | i3;
        if (sk2Var.h(mi2Var)) {
            i4 = 2048;
        } else {
            i4 = 1024;
        }
        int i7 = i6 | i4;
        if ((i7 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (sk2Var.O(i7 & 1, z)) {
            if (gn0Var instanceof en0) {
                sk2Var.X(-757067682);
                me2.b(b53.W(zy3Var, ih4Var), sk2Var, 0);
                sk2Var.p(false);
            } else if (gn0Var instanceof fn0) {
                sk2Var.X(-757064749);
                c(zy3Var, ih4Var, (List) ((fn0) gn0Var).a, mi2Var, sk2Var, i7 & 7294);
                sk2Var.p(false);
            } else {
                throw ej6.d(sk2Var, -757069238, false);
            }
        } else {
            sk2Var.R();
        }
        m55 r = sk2Var.r();
        if (r != null) {
            r.d = new iz1(zy3Var, ih4Var, gn0Var, mi2Var, i, 1);
        }
    }

    public static final void b(ki2 ki2Var, zy3 zy3Var, qj3 qj3Var, fj3 fj3Var, tu0 tu0Var, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z;
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.Z(1055276397);
        if (sk2Var.h(ki2Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i6 = i2 | i;
        if (sk2Var.f(zy3Var)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i7 = i6 | i3;
        if (sk2Var.f(qj3Var)) {
            i4 = 256;
        } else {
            i4 = 128;
        }
        int i8 = i7 | i4;
        if (sk2Var.f(fj3Var)) {
            i5 = 2048;
        } else {
            i5 = 1024;
        }
        int i9 = i8 | i5;
        if ((i9 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (sk2Var.O(i9 & 1, z)) {
            oo2.f(ct3.H0(-933153643, new g61(qj3Var, zy3Var, fj3Var, me2.L(ki2Var, sk2Var), 1), sk2Var), sk2Var, 6);
        } else {
            sk2Var.R();
        }
        m55 r = sk2Var.r();
        if (r != null) {
            r.d = new p4(ki2Var, zy3Var, qj3Var, fj3Var, i, 6);
        }
    }

    public static final void c(zy3 zy3Var, ih4 ih4Var, List list, mi2 mi2Var, tu0 tu0Var, int i) {
        int i2;
        int i3;
        int i4;
        boolean z;
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.Z(-1123439552);
        if (sk2Var.f(ih4Var)) {
            i2 = 32;
        } else {
            i2 = 16;
        }
        int i5 = i | i2;
        if (sk2Var.h(list)) {
            i3 = 256;
        } else {
            i3 = 128;
        }
        int i6 = i5 | i3;
        if (sk2Var.h(mi2Var)) {
            i4 = 2048;
        } else {
            i4 = 1024;
        }
        int i7 = i6 | i4;
        if ((i7 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (sk2Var.O(i7 & 1, z)) {
            if (list.isEmpty()) {
                sk2Var.X(-2002361285);
                zy3 W = b53.W(zy3Var, ih4Var);
                tv3 d2 = d50.d(y60.L, false);
                int hashCode = Long.hashCode(sk2Var.T);
                sm4 l = sk2Var.l();
                zy3 e0 = l07.e0(sk2Var, W);
                nu0.i.getClass();
                mv0 mv0Var = mu0.b;
                sk2Var.b0();
                if (sk2Var.S) {
                    sk2Var.k(mv0Var);
                } else {
                    sk2Var.k0();
                }
                oo2.S(sk2Var, mu0.f, d2);
                oo2.S(sk2Var, mu0.e, l);
                oo2.S(sk2Var, mu0.g, Integer.valueOf(hashCode));
                oo2.P(sk2Var, mu0.h);
                oo2.S(sk2Var, mu0.d, e0);
                ir6.b(me2.X(sk2Var, R.string.no_cheats_found), y60.n0.i(b53.X(wy3.a, 24.0f), y60.Z), 0L, 0L, null, null, 0L, new kn6(3), 0L, 0, false, 0, 0, null, null, sk2Var, 0, 0, 130556);
                sk2Var = sk2Var;
                sk2Var.p(true);
                sk2Var.p(false);
            } else {
                boolean z2 = true;
                sk2Var.X(-2002034731);
                zy3 B = l07.B(zy3Var, ih4Var);
                ot otVar = new ot(8.0f, true, new i(1));
                ye6 ye6Var = ov0.n;
                mh4 mh4Var = new mh4(b53.B(ih4Var, (sd3) sk2Var.j(ye6Var)) + 16.0f, ih4Var.d() + 12.0f, b53.A(ih4Var, (sd3) sk2Var.j(ye6Var)) + 16.0f, ih4Var.c() + 16.0f);
                boolean h = sk2Var.h(list);
                if ((i7 & 7168) != 2048) {
                    z2 = false;
                }
                boolean z3 = h | z2;
                Object L = sk2Var.L();
                if (z3 || L == su0.a) {
                    L = new jz1(list, mi2Var, 2);
                    sk2Var.h0(L);
                }
                io2.b(B, null, mh4Var, otVar, null, null, false, null, (mi2) L, sk2Var, 24576, 490);
                sk2Var.p(false);
            }
        } else {
            sk2Var.R();
        }
        m55 r = sk2Var.r();
        if (r != null) {
            r.d = new kz1(zy3Var, ih4Var, list, mi2Var, i, 1);
        }
    }

    public static final boolean d(int i, KeyEvent keyEvent) {
        if (((int) (hi2.w(keyEvent) >> 32)) == i) {
            return true;
        }
        return false;
    }

    public static float e(float[] fArr) {
        if (fArr.length < 6) {
            return RecyclerView.A1;
        }
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float f4 = fArr[3];
        float f5 = fArr[4];
        float f6 = fArr[5];
        float f7 = (((((f3 * f6) + ((f2 * f5) + (f * f4))) - (f4 * f5)) - (f2 * f3)) - (f * f6)) * 0.5f;
        if (f7 < RecyclerView.A1) {
            return -f7;
        }
        return f7;
    }

    public static void f(String str) {
        if (str.length() <= 10000) {
            return;
        }
        String substring = str.substring(0, 30);
        throw new NumberFormatException("Number string too large: " + substring + "...");
    }

    public static tb1 g(long j, tu0 tu0Var, int i) {
        long j2;
        ye6 ye6Var = ir0.a;
        long j3 = ((xq0) ((hr0) ((sk2) tu0Var).j(ye6Var)).d.getValue()).a;
        if ((i & 8) != 0) {
            j2 = ((hr0) ((sk2) tu0Var).j(ye6Var)).j();
        } else {
            j2 = j;
        }
        long f = ((hr0) ((sk2) tu0Var).j(ye6Var)).f();
        tv0 tv0Var = e01.a;
        sk2 sk2Var = (sk2) tu0Var;
        long j4 = ((xq0) sk2Var.j(tv0Var)).a;
        if (((hr0) sk2Var.j(ye6Var)).k()) {
            mh7.V(j4);
        } else {
            mh7.V(j4);
        }
        long r = mh7.r(xq0.b(0.38f, j3), ((hr0) sk2Var.j(ye6Var)).j());
        sk2 sk2Var2 = (sk2) tu0Var;
        long j5 = ((xq0) sk2Var2.j(tv0Var)).a;
        if (((hr0) sk2Var2.j(ye6Var)).k()) {
            mh7.V(j5);
        } else {
            mh7.V(j5);
        }
        long r2 = mh7.r(xq0.b(0.38f, j3), ((hr0) sk2Var2.j(ye6Var)).j());
        sk2 sk2Var3 = (sk2) tu0Var;
        long j6 = ((xq0) sk2Var3.j(tv0Var)).a;
        if (((hr0) sk2Var3.j(ye6Var)).k()) {
            mh7.V(j6);
        } else {
            mh7.V(j6);
        }
        long j7 = j2;
        long r3 = mh7.r(xq0.b(0.38f, j2), ((hr0) sk2Var3.j(ye6Var)).j());
        sk2 sk2Var4 = (sk2) tu0Var;
        long j8 = ((xq0) sk2Var4.j(tv0Var)).a;
        if (((hr0) sk2Var4.j(ye6Var)).k()) {
            mh7.V(j8);
        } else {
            mh7.V(j8);
        }
        return new tb1(j3, xq0.b(0.54f, j3), j7, xq0.b(0.38f, f), r, xq0.b(0.54f, r2), r3, xq0.b(0.38f, mh7.r(xq0.b(0.38f, f), ((hr0) sk2Var4.j(ye6Var)).j())));
    }

    public static long h(long j, kg3 kg3Var) {
        int i;
        int g;
        int j2;
        int h;
        kg3 kg3Var2 = kg3.Horizontal;
        if (kg3Var == kg3Var2) {
            i = lz0.j(j);
        } else {
            i = lz0.i(j);
        }
        if (kg3Var == kg3Var2) {
            g = lz0.h(j);
        } else {
            g = lz0.g(j);
        }
        if (kg3Var == kg3Var2) {
            j2 = lz0.i(j);
        } else {
            j2 = lz0.j(j);
        }
        if (kg3Var == kg3Var2) {
            h = lz0.g(j);
        } else {
            h = lz0.h(j);
        }
        return nz0.a(i, g, j2, h);
    }

    public static long i(int i, long j) {
        int i2;
        int h = lz0.h(j);
        if ((i & 4) != 0) {
            i2 = lz0.i(j);
        } else {
            i2 = 0;
        }
        return nz0.a(0, h, i2, lz0.g(j));
    }

    public static tx3 j(qo0 qo0Var, String str) {
        tx3 tx3Var;
        HashMap hashMap = tx3.c;
        synchronized (hashMap) {
            try {
                Object obj = hashMap.get(str);
                if (obj == null) {
                    obj = new tx3(qo0Var, str);
                    hashMap.put(str, obj);
                }
                tx3Var = (tx3) obj;
                if (!tx3Var.b.equals(qo0Var)) {
                    throw new IllegalStateException("Check failed.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return tx3Var;
    }

    public static byte[] p(String str) {
        if (str.length() % 2 == 0) {
            int length = str.length() / 2;
            byte[] bArr = new byte[length];
            for (int i = 0; i < length; i++) {
                int i2 = i * 2;
                int digit = Character.digit(str.charAt(i2), 16);
                int digit2 = Character.digit(str.charAt(i2 + 1), 16);
                if (digit != -1 && digit2 != -1) {
                    bArr[i] = (byte) ((digit * 16) + digit2);
                } else {
                    i.i("input is not hexadecimal");
                    return null;
                }
            }
            return bArr;
        }
        i.i("Expected a string of even length");
        return null;
    }

    public static final void q(vi viVar, double d2, double d3, double d4, double d5, double d6, double d7, double d8, boolean z, boolean z2) {
        double d9;
        double d10;
        boolean z3;
        double d11 = d6;
        double d12 = (d8 / 180.0d) * 3.141592653589793d;
        double cos = Math.cos(d12);
        double sin = Math.sin(d12);
        double d13 = ((d3 * sin) + (d2 * cos)) / d11;
        double d14 = ((d3 * cos) + ((-d2) * sin)) / d7;
        double d15 = ((d5 * sin) + (d4 * cos)) / d11;
        double d16 = ((d5 * cos) + ((-d4) * sin)) / d7;
        double d17 = d13 - d15;
        double d18 = d14 - d16;
        double d19 = (d13 + d15) / 2.0d;
        double d20 = (d14 + d16) / 2.0d;
        double d21 = (d18 * d18) + (d17 * d17);
        if (d21 != 0.0d) {
            double d22 = (1.0d / d21) - 0.25d;
            if (d22 < 0.0d) {
                double sqrt = (float) (Math.sqrt(d21) / 1.99999d);
                q(viVar, d2, d3, d4, d5, d11 * sqrt, d7 * sqrt, d8, z, z2);
                return;
            }
            double sqrt2 = Math.sqrt(d22);
            double d23 = d17 * sqrt2;
            double d24 = sqrt2 * d18;
            if (z == z2) {
                d9 = d19 - d24;
                d10 = d20 + d23;
            } else {
                d9 = d19 + d24;
                d10 = d20 - d23;
            }
            double atan2 = Math.atan2(d14 - d10, d13 - d9);
            double atan22 = Math.atan2(d16 - d10, d15 - d9) - atan2;
            int i = (atan22 > 0.0d ? 1 : (atan22 == 0.0d ? 0 : -1));
            if (i >= 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z2 != z3) {
                if (i > 0) {
                    atan22 -= 6.283185307179586d;
                } else {
                    atan22 += 6.283185307179586d;
                }
            }
            double d25 = d9 * d11;
            double d26 = d10 * d7;
            double d27 = (d25 * cos) - (d26 * sin);
            double d28 = (d26 * cos) + (d25 * sin);
            int ceil = (int) Math.ceil(Math.abs((atan22 * 4.0d) / 3.141592653589793d));
            double cos2 = Math.cos(d12);
            double sin2 = Math.sin(d12);
            double cos3 = Math.cos(atan2);
            double sin3 = Math.sin(atan2);
            double d29 = -d11;
            double d30 = d29 * cos2;
            double d31 = d7 * sin2;
            double d32 = (d30 * sin3) - (d31 * cos3);
            double d33 = d29 * sin2;
            double d34 = d7 * cos2;
            double d35 = (cos3 * d34) + (sin3 * d33);
            double d36 = atan22 / ceil;
            double d37 = atan2;
            double d38 = d32;
            int i2 = 0;
            double d39 = d35;
            double d40 = d3;
            while (i2 < ceil) {
                double d41 = d37 + d36;
                double sin4 = Math.sin(d41);
                double cos4 = Math.cos(d41);
                int i3 = ceil;
                double d42 = (((d11 * cos2) * cos4) + d27) - (d31 * sin4);
                double d43 = (d34 * sin4) + (d11 * sin2 * cos4) + d28;
                double d44 = (d30 * sin4) - (d31 * cos4);
                double d45 = (cos4 * d34) + (sin4 * d33);
                double d46 = d41 - d37;
                double tan = Math.tan(d46 / 2.0d);
                double sqrt3 = ((Math.sqrt(((tan * 3.0d) * tan) + 4.0d) - 1.0d) * Math.sin(d46)) / 3.0d;
                double d47 = d33;
                viVar.a.cubicTo((float) ((d38 * sqrt3) + d2), (float) ((d39 * sqrt3) + d40), (float) (d42 - (sqrt3 * d44)), (float) (d43 - (sqrt3 * d45)), (float) d42, (float) d43);
                d36 = d36;
                sin2 = sin2;
                d27 = d27;
                d2 = d42;
                i2++;
                d33 = d47;
                d37 = d41;
                d39 = d45;
                d38 = d44;
                ceil = i3;
                d40 = d43;
                d11 = d6;
            }
        }
    }

    public static String r(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b2 : bArr) {
            int i = b2 & 255;
            sb.append("0123456789abcdef".charAt(i / 16));
            sb.append("0123456789abcdef".charAt(i % 16));
        }
        return sb.toString();
    }

    public static final boolean s(long j, long j2) {
        if (j == j2) {
            return true;
        }
        return false;
    }

    public static se2 t(se2[] se2VarArr, int i) {
        int i2;
        boolean z;
        int i3;
        if ((i & 1) == 0) {
            i2 = 400;
        } else {
            i2 = 700;
        }
        if ((i & 2) != 0) {
            z = true;
        } else {
            z = false;
        }
        se2 se2Var = null;
        int i4 = Preference.DEFAULT_ORDER;
        for (se2 se2Var2 : se2VarArr) {
            int abs = Math.abs(se2Var2.c - i2) * 2;
            if (se2Var2.d == z) {
                i3 = 0;
            } else {
                i3 = 1;
            }
            int i5 = abs + i3;
            if (se2Var == null || i4 > i5) {
                se2Var = se2Var2;
                i4 = i5;
            }
        }
        return se2Var;
    }

    public static final float u(Layout layout, int i, Paint paint) {
        int i2;
        float abs;
        float width;
        float lineLeft = layout.getLineLeft(i);
        ThreadLocal threadLocal = or6.a;
        if (layout.getEllipsisCount(i) <= 0 || layout.getParagraphDirection(i) != 1 || lineLeft >= RecyclerView.A1) {
            return RecyclerView.A1;
        }
        int lineStart = layout.getLineStart(i);
        float measureText = paint.measureText("…") + (layout.getPrimaryHorizontal(layout.getEllipsisStart(i) + lineStart) - lineLeft);
        Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i);
        if (paragraphAlignment == null) {
            i2 = -1;
        } else {
            i2 = dy2.a[paragraphAlignment.ordinal()];
        }
        if (i2 == 1) {
            abs = Math.abs(lineLeft);
            width = (layout.getWidth() - measureText) / 2.0f;
        } else {
            abs = Math.abs(lineLeft);
            width = layout.getWidth() - measureText;
        }
        return width + abs;
    }

    public static final float v(Layout layout, int i, Paint paint) {
        float width;
        float width2;
        ThreadLocal threadLocal = or6.a;
        if (layout.getEllipsisCount(i) > 0) {
            int i2 = -1;
            if (layout.getParagraphDirection(i) == -1 && layout.getWidth() < layout.getLineRight(i)) {
                float primaryHorizontal = layout.getPrimaryHorizontal(layout.getEllipsisStart(i) + layout.getLineStart(i));
                float measureText = paint.measureText("…") + (layout.getLineRight(i) - primaryHorizontal);
                Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i);
                if (paragraphAlignment != null) {
                    i2 = dy2.a[paragraphAlignment.ordinal()];
                }
                if (i2 == 1) {
                    width = layout.getWidth() - layout.getLineRight(i);
                    width2 = (layout.getWidth() - measureText) / 2.0f;
                } else {
                    width = layout.getWidth() - layout.getLineRight(i);
                    width2 = layout.getWidth() - measureText;
                }
                return width - width2;
            }
            return RecyclerView.A1;
        }
        return RecyclerView.A1;
    }

    public static t34 w(za7 za7Var) {
        l9 l9Var = u34.a;
        x31 x31Var = x31.b;
        l9Var.getClass();
        x31Var.getClass();
        q9 q9Var = new q9(za7Var, l9Var, x31Var);
        qo0 a2 = q75.a(t34.class);
        String b2 = a2.b();
        if (b2 != null) {
            return (t34) q9Var.F(a2, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(b2));
        }
        i.i("Local and anonymous classes can not be ViewModels");
        return null;
    }

    public static final int x(Bundle bundle, String str) {
        str.getClass();
        int i = bundle.getInt(str, Integer.MIN_VALUE);
        if (i == Integer.MIN_VALUE && bundle.getInt(str, Preference.DEFAULT_ORDER) == Integer.MAX_VALUE) {
            jk2.H(str);
            throw null;
        }
        return i;
    }

    public static final ym3 y(fn3 fn3Var) {
        fn3Var.getClass();
        rm3 lifecycle = fn3Var.getLifecycle();
        lifecycle.getClass();
        bq0 bq0Var = lifecycle.a;
        while (true) {
            ym3 ym3Var = (ym3) ((AtomicReference) bq0Var.B).get();
            if (ym3Var != null) {
                return ym3Var;
            }
            mi6 c2 = hi2.c();
            bb1 bb1Var = tg1.a;
            ym3 ym3Var2 = new ym3(lifecycle, se.O(c2, bt3.a.Y));
            AtomicReference atomicReference = (AtomicReference) bq0Var.B;
            while (!atomicReference.compareAndSet(null, ym3Var2)) {
                if (atomicReference.get() != null) {
                    break;
                }
            }
            bb1 bb1Var2 = tg1.a;
            tq5.w(ym3Var2, bt3.a.Y, null, new n5(ym3Var2, null, 17), 2);
            return ym3Var2;
        }
    }

    public static final ViewParent z(View view) {
        view.getClass();
        ViewParent parent = view.getParent();
        if (parent != null) {
            return parent;
        }
        Object tag = view.getTag(R.id.view_tree_disjoint_parent);
        if (tag instanceof ViewParent) {
            return (ViewParent) tag;
        }
        return null;
    }

    public abstract b1 K(x70 x70Var);

    public abstract void V(b1 b1Var);

    public abstract Typeface k(Context context, ee2 ee2Var, Resources resources, int i);

    public abstract Typeface l(Context context, se2[] se2VarArr, int i);

    public Typeface m(Context context, List list, int i) {
        throw new IllegalStateException("createFromFontInfoWithFallback must only be called on API 29+");
    }

    public Typeface n(Context context, Resources resources, int i, String str, int i2) {
        File D = jk2.D(context);
        if (D == null) {
            return null;
        }
        try {
            if (!jk2.p(D, resources, i)) {
                return null;
            }
            return Typeface.createFromFile(D.getPath());
        } catch (RuntimeException unused) {
            return null;
        } finally {
            D.delete();
        }
    }

    public abstract Object o(b1 b1Var);
}
