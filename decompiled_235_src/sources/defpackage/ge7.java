package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.Display;
import android.view.WindowManager;
import android.view.translation.TranslationResponseValue;
import android.view.translation.ViewTranslationResponse;
import androidx.camera.camera2.compat.quirk.ExtraSupportedSurfaceCombinationsQuirk;
import androidx.recyclerview.widget.RecyclerView;
import com.google.mlkit.common.MlKitException;
import com.stormds.emulator.R;
import java.io.Closeable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.WeakHashMap;
import me.magnum.melonds.domain.model.Cheat;
import me.magnum.melonds.domain.model.DSiWareTitle;
import me.magnum.melonds.impl.emulator.debug.RendererDebugBridge;
import me.magnum.melonds.ui.emulator.rewind.model.RewindSaveState;
import me.magnum.melonds.ui.emulator.rewind.model.RewindWindow;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ge7  reason: default package */
/* loaded from: classes.dex */
public abstract class ge7 {
    public static final du a = new du(0);
    public static final du b = new du(1);
    public static final zv0 c = new zv0(2071362912, false, new kw0(19));
    public static final zv0 d = new zv0(995300247, false, new kw0(20));
    public static final zv0 e = new zv0(2130912738, false, new iw0(7));
    public static final zv0 f = new zv0(-111945959, false, new iw0(8));
    public static final zv0 g = new zv0(-887041510, false, new iw0(9));
    public static final zv0 h = new zv0(-1662137061, false, new iw0(10));
    public static final Object i = new Object();
    public static final Object j = new Object();
    public static e33 k;
    public static final /* synthetic */ int l = 0;

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0047, code lost:
        if (r5.c == r8.hashCode()) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ColorStateList A(Context context, int i2) {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        ql5 ql5Var;
        Resources resources = context.getResources();
        Resources.Theme theme = context.getTheme();
        rl5 rl5Var = new rl5(resources, theme);
        synchronized (sl5.c) {
            try {
                SparseArray sparseArray = (SparseArray) sl5.b.get(rl5Var);
                colorStateList = null;
                if (sparseArray != null && sparseArray.size() > 0 && (ql5Var = (ql5) sparseArray.get(i2)) != null) {
                    if (ql5Var.b.equals(resources.getConfiguration())) {
                        if (theme == null) {
                            if (ql5Var.c != 0) {
                            }
                            colorStateList2 = ql5Var.a;
                        }
                        if (theme != null) {
                        }
                    }
                    sparseArray.remove(i2);
                }
                colorStateList2 = null;
            } finally {
            }
        }
        if (colorStateList2 != null) {
            return colorStateList2;
        }
        ThreadLocal threadLocal = sl5.a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        resources.getValue(i2, typedValue, true);
        int i3 = typedValue.type;
        if (i3 < 28 || i3 > 31) {
            try {
                colorStateList = rt0.a(resources, resources.getXml(i2), theme);
            } catch (Exception e2) {
                Log.w("ResourcesCompat", "Failed to inflate ColorStateList, leaving it to the framework", e2);
            }
        }
        if (colorStateList != null) {
            synchronized (sl5.c) {
                try {
                    WeakHashMap weakHashMap = sl5.b;
                    SparseArray sparseArray2 = (SparseArray) weakHashMap.get(rl5Var);
                    if (sparseArray2 == null) {
                        sparseArray2 = new SparseArray();
                        weakHashMap.put(rl5Var, sparseArray2);
                    }
                    sparseArray2.append(i2, new ql5(colorStateList, rl5Var.a.getConfiguration(), theme));
                } finally {
                }
            }
            return colorStateList;
        }
        return resources.getColorStateList(i2, theme);
    }

    public static final int B(px0 px0Var) {
        px0Var.getClass();
        return Long.hashCode(((xq2) px0Var).T);
    }

    public static final long C(px0 px0Var) {
        return ((xq2) px0Var).T;
    }

    public static Display D(jq jqVar) {
        if (Build.VERSION.SDK_INT >= 30) {
            return q2.d(jqVar);
        }
        return ((WindowManager) jqVar.getSystemService("window")).getDefaultDisplay();
    }

    public static final bq6 E(mm6 mm6Var) {
        bq6 bq6Var = mm6Var.A;
        bq6Var.getClass();
        return (bq6) bm6.t(bq6Var, mm6Var);
    }

    public static final int F(mm6 mm6Var) {
        bq6 bq6Var = mm6Var.A;
        bq6Var.getClass();
        return ((bq6) bm6.h(bq6Var)).e;
    }

    public static d53 G(pq1 pq1Var, ck5 ck5Var, int i2) {
        if ((i2 & 2) != 0) {
            ck5Var = ck5.Restart;
        }
        return new d53(pq1Var, ck5Var);
    }

    public static boolean H(String str) {
        if (!"Connection".equalsIgnoreCase(str) && !"Keep-Alive".equalsIgnoreCase(str) && !"Proxy-Authenticate".equalsIgnoreCase(str) && !"Proxy-Authorization".equalsIgnoreCase(str) && !"TE".equalsIgnoreCase(str) && !"Trailers".equalsIgnoreCase(str) && !"Transfer-Encoding".equalsIgnoreCase(str) && !"Upgrade".equalsIgnoreCase(str)) {
            return true;
        }
        return false;
    }

    public static boolean I(int i2, Object obj) {
        int i3;
        if (obj instanceof ao2) {
            if (obj instanceof oo2) {
                i3 = ((oo2) obj).d();
            } else if (obj instanceof on2) {
                i3 = 0;
            } else if (obj instanceof qn2) {
                i3 = 1;
            } else if (obj instanceof eo2) {
                i3 = 2;
            } else if (obj instanceof fo2) {
                i3 = 3;
            } else if (obj instanceof go2) {
                i3 = 4;
            } else if (obj instanceof ho2) {
                i3 = 5;
            } else if (obj instanceof io2) {
                i3 = 6;
            } else if (obj instanceof jo2) {
                i3 = 7;
            } else if (obj instanceof ko2) {
                i3 = 8;
            } else if (obj instanceof lo2) {
                i3 = 9;
            } else if (obj instanceof pn2) {
                i3 = 10;
            } else if (obj instanceof rn2) {
                i3 = 11;
            } else if (obj instanceof tn2) {
                i3 = 13;
            } else if (obj instanceof un2) {
                i3 = 14;
            } else if (obj instanceof vn2) {
                i3 = 15;
            } else if (obj instanceof wn2) {
                i3 = 16;
            } else if (obj instanceof xn2) {
                i3 = 17;
            } else if (obj instanceof yn2) {
                i3 = 18;
            } else if (obj instanceof zn2) {
                i3 = 19;
            } else if (obj instanceof bo2) {
                i3 = 20;
            } else if (obj instanceof co2) {
                i3 = 21;
            } else {
                i3 = -1;
            }
            if (i3 == i2) {
                return true;
            }
        }
        return false;
    }

    public static boolean J() {
        String str = Build.MANUFACTURER;
        str.getClass();
        if (!str.equalsIgnoreCase("Samsung")) {
            String str2 = Build.BRAND;
            str2.getClass();
            if (!str2.equalsIgnoreCase("Samsung")) {
                return false;
            }
        }
        if (xs6.Z(Build.DEVICE, "m55xq", true)) {
            return true;
        }
        return false;
    }

    public static final ci3 K(qn2 qn2Var) {
        bi3 bi3Var = new bi3();
        qn2Var.g(bi3Var);
        return new ci3(bi3Var);
    }

    public static final a74 L(a74 a74Var, fo2 fo2Var) {
        return a74Var.d(new zl3(fo2Var));
    }

    public static final boolean M(mm6 mm6Var, qn2 qn2Var) {
        int i2;
        h1 h1Var;
        Object g2;
        vl6 j2;
        boolean o;
        do {
            synchronized (i) {
                bq6 bq6Var = mm6Var.A;
                bq6Var.getClass();
                bq6 bq6Var2 = (bq6) bm6.h(bq6Var);
                i2 = bq6Var2.d;
                h1Var = bq6Var2.c;
            }
            h1Var.getClass();
            jw4 f2 = h1Var.f();
            g2 = qn2Var.g(f2);
            h1 c2 = f2.c();
            if (nb3.k(c2, h1Var)) {
                break;
            }
            bq6 bq6Var3 = mm6Var.A;
            bq6Var3.getClass();
            synchronized (bm6.c) {
                j2 = bm6.j();
                o = o((bq6) bm6.w(bq6Var3, mm6Var, j2), i2, c2, true);
            }
            bm6.n(j2, mm6Var);
        } while (!o);
        return ((Boolean) g2).booleanValue();
    }

    public static final a74 N(a74 a74Var, lq4 lq4Var) {
        return a74Var.d(new oq4(lq4Var));
    }

    public static final a74 O(a74 a74Var, float f2) {
        return a74Var.d(new jq4(f2, f2, f2, f2));
    }

    public static final a74 P(a74 a74Var, float f2, float f3) {
        return a74Var.d(new jq4(f2, f3, f2, f3));
    }

    public static a74 Q(a74 a74Var, float f2, float f3, int i2) {
        if ((i2 & 1) != 0) {
            f2 = 0.0f;
        }
        if ((i2 & 2) != 0) {
            f3 = 0.0f;
        }
        return P(a74Var, f2, f3);
    }

    public static final a74 R(a74 a74Var, float f2, float f3, float f4, float f5) {
        return a74Var.d(new jq4(f2, f3, f4, f5));
    }

    public static a74 S(a74 a74Var, float f2, float f3, float f4, float f5, int i2) {
        if ((i2 & 1) != 0) {
            f2 = 0.0f;
        }
        if ((i2 & 2) != 0) {
            f3 = 0.0f;
        }
        if ((i2 & 4) != 0) {
            f4 = 0.0f;
        }
        if ((i2 & 8) != 0) {
            f5 = 0.0f;
        }
        return R(a74Var, f2, f3, f4, f5);
    }

    public static final vq2 T(px0 px0Var) {
        br2 br2Var;
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.Y(MlKitException.CODE_SCANNER_PIPELINE_INFERENCE_ERROR, tx0.e);
        if (xq2Var.S) {
            pk6.z(xq2Var.I);
        }
        Object H = xq2Var.H();
        if (H instanceof br2) {
            br2Var = (br2) H;
        } else {
            br2Var = null;
        }
        if (br2Var == null) {
            br2Var = new br2(new uq2(new vq2(xq2Var, xq2Var.T, xq2Var.q, xq2Var.C, xq2Var.h.p0)), -1);
            xq2Var.m0(br2Var);
        }
        bj5 bj5Var = br2Var.a;
        bj5Var.getClass();
        vq2 vq2Var = ((uq2) bj5Var).A;
        vq2Var.f.setValue(xq2Var.l());
        xq2Var.p(false);
        return vq2Var;
    }

    public static io6 U(float f2, float f3, Object obj, int i2) {
        if ((i2 & 1) != 0) {
            f2 = 1.0f;
        }
        if ((i2 & 2) != 0) {
            f3 = 1500.0f;
        }
        if ((i2 & 4) != 0) {
            obj = null;
        }
        return new io6(f2, f3, obj);
    }

    public static boolean V() {
        String str = Build.MANUFACTURER;
        str.getClass();
        if (!str.equalsIgnoreCase("Google")) {
            String str2 = Build.BRAND;
            str2.getClass();
            if (!str2.equalsIgnoreCase("Google")) {
                return false;
            }
        }
        String str3 = Build.MODEL;
        str3.getClass();
        String upperCase = str3.toUpperCase(Locale.ROOT);
        upperCase.getClass();
        return ExtraSupportedSurfaceCombinationsQuirk.c.contains(upperCase);
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0017, code lost:
        if (r0.equalsIgnoreCase("Samsung") != false) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean W() {
        String str = Build.MANUFACTURER;
        str.getClass();
        if (!str.equalsIgnoreCase("Samsung")) {
            String str2 = Build.BRAND;
            str2.getClass();
        }
        String str3 = Build.MODEL;
        str3.getClass();
        String upperCase = str3.toUpperCase(Locale.ROOT);
        upperCase.getClass();
        for (String str4 : ExtraSupportedSurfaceCombinationsQuirk.d) {
            if (xs6.g0(upperCase, str4, false)) {
                return true;
            }
        }
        return false;
    }

    public static void X(Object obj, String str) {
        String name;
        if (obj == null) {
            name = "null";
        } else {
            name = obj.getClass().getName();
        }
        ClassCastException classCastException = new ClassCastException(lb1.m(name, " cannot be cast to ", str));
        nb3.V(classCastException, ge7.class.getName());
        throw classCastException;
    }

    public static sc7 Y(int i2, int i3, hr1 hr1Var, int i4) {
        if ((i4 & 1) != 0) {
            i2 = MlKitException.LOW_LIGHT_AUTO_EXPOSURE_COMPUTATION_FAILURE;
        }
        if ((i4 & 2) != 0) {
            i3 = 0;
        }
        if ((i4 & 4) != 0) {
            hr1Var = ir1.a;
        }
        return new sc7(i2, i3, hr1Var);
    }

    public static final void a(List list, final long j2, qn2 qn2Var, px0 px0Var, int i2) {
        int i3;
        int i4;
        int i5;
        boolean z;
        xq2 xq2Var;
        final qn2 qn2Var2;
        boolean z2;
        ga7 ga7Var;
        Object f2;
        float f3;
        float f4;
        pp6 I;
        boolean z3;
        qn2 n7Var;
        int i6;
        kk3 kk3Var;
        qn2 qn2Var3;
        a74 a74Var;
        float f5;
        pr3 pr3Var;
        boolean z4;
        boolean z5;
        qn2 qn2Var4;
        final List list2 = list;
        list2.getClass();
        qn2Var.getClass();
        xq2 xq2Var2 = (xq2) px0Var;
        xq2Var2.d0(-1816202422);
        if (xq2Var2.h(list2)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i7 = i2 | i3;
        if (xq2Var2.e(j2)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i8 = i7 | i4;
        if (xq2Var2.h(qn2Var)) {
            i5 = 256;
        } else {
            i5 = 128;
        }
        int i9 = i8 | i5;
        if ((i9 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (xq2Var2.S(i9 & 1, z)) {
            nq6 nq6Var = vt0.a;
            final long c2 = ((ut0) xq2Var2.j(nq6Var)).c();
            final long i10 = ((ut0) xq2Var2.j(nq6Var)).i();
            boolean f6 = xq2Var2.f(list2);
            int i11 = i9 & 112;
            if (i11 == 32) {
                z2 = true;
            } else {
                z2 = false;
            }
            boolean z6 = f6 | z2;
            Object P = xq2Var2.P();
            vs0 vs0Var = ox0.a;
            if (z6 || P == vs0Var) {
                Iterator it = list2.iterator();
                int i12 = 0;
                while (true) {
                    if (it.hasNext()) {
                        if (((c6) it.next()).a == j2) {
                            break;
                        }
                        i12++;
                    } else {
                        i12 = -1;
                        break;
                    }
                }
                P = Integer.valueOf(i12);
                xq2Var2.l0(P);
            }
            int intValue = ((Number) P).intValue();
            Object P2 = xq2Var2.P();
            if (P2 == vs0Var) {
                P2 = i61.f(xq2Var2);
            }
            r94 r94Var = (r94) P2;
            qa4 a2 = bw7.a(r94Var, xq2Var2, 6);
            Boolean bool = (Boolean) a2.getValue();
            bool.getClass();
            ga7 N = n16.N(bool, null, xq2Var2, 0, 2);
            gx0 gx0Var = N.a;
            final pp6 b2 = in.b(intValue, null, "Tab position", xq2Var2, 3072, 22);
            wc7 wc7Var = nw7.e0;
            if (!N.g()) {
                xq2Var2.b0(1666573488);
                ga7Var = N;
                boolean f7 = xq2Var2.f(ga7Var);
                f2 = xq2Var2.P();
                if (f7 || f2 == vs0Var) {
                    vl6 t = ln2.t();
                    if (t != null) {
                        qn2Var4 = t.e();
                    } else {
                        qn2Var4 = null;
                    }
                    vl6 N2 = ln2.N(t);
                    try {
                        Object f8 = gx0Var.f();
                        ln2.V(t, N2, qn2Var4);
                        xq2Var2.l0(f8);
                        f2 = f8;
                    } catch (Throwable th) {
                        ln2.V(t, N2, qn2Var4);
                        throw th;
                    }
                }
                xq2Var2.p(false);
            } else {
                ga7Var = N;
                xq2Var2.b0(1666827533);
                xq2Var2.p(false);
                f2 = gx0Var.f();
            }
            boolean booleanValue = ((Boolean) f2).booleanValue();
            xq2Var2.b0(195499522);
            if (booleanValue) {
                f3 = 1.0f;
            } else {
                f3 = 0.75f;
            }
            xq2Var2.p(false);
            Float valueOf = Float.valueOf(f3);
            boolean f9 = xq2Var2.f(ga7Var);
            Object P3 = xq2Var2.P();
            if (f9 || P3 == vs0Var) {
                P3 = np2.I(new k7(ga7Var, 0));
                xq2Var2.l0(P3);
            }
            boolean booleanValue2 = ((Boolean) ((pp6) P3).getValue()).booleanValue();
            xq2Var2.b0(195499522);
            if (booleanValue2) {
                f4 = 1.0f;
            } else {
                f4 = 0.75f;
            }
            xq2Var2.p(false);
            Float valueOf2 = Float.valueOf(f4);
            boolean f10 = xq2Var2.f(ga7Var);
            Object P4 = xq2Var2.P();
            if (!f10 && P4 != vs0Var) {
                I = P4;
            } else {
                I = np2.I(new k7(ga7Var, 1));
                xq2Var2.l0(I);
            }
            aa7 aa7Var = (aa7) I.getValue();
            xq2Var2.b0(-985243360);
            io6 U = U(RecyclerView.B1, RecyclerView.B1, null, 7);
            xq2Var2.p(false);
            final ca7 t2 = n16.t(ga7Var, valueOf, valueOf2, U, wc7Var, xq2Var2, 0);
            Object P5 = xq2Var2.P();
            if (P5 == vs0Var) {
                P5 = nb3.b(-1.0f);
                xq2Var2.l0(P5);
            }
            final gn gnVar = (gn) P5;
            final pr3 a3 = qr3.a(xq2Var2);
            kk3 kk3Var2 = (kk3) xq2Var2.j(ky0.n);
            Integer valueOf3 = Integer.valueOf(intValue);
            boolean f11 = xq2Var2.f(a3) | xq2Var2.d(intValue) | xq2Var2.h(gnVar);
            Object P6 = xq2Var2.P();
            if (f11 || P6 == vs0Var) {
                P6 = new m7(a3, gnVar, intValue, (r41) null);
                xq2Var2.l0(P6);
            }
            mb3.i(xq2Var2, (eo2) P6, valueOf3);
            a74 a4 = ua6.a(nw7.f0(x64.a, false, r94Var, 1), false, new r76(2));
            boolean f12 = xq2Var2.f(a2) | xq2Var2.d(kk3Var2.ordinal()) | xq2Var2.h(list2) | xq2Var2.d(intValue);
            int i13 = i9 & 896;
            if (i13 == 256) {
                z3 = true;
            } else {
                z3 = false;
            }
            boolean z7 = z3 | f12;
            Object P7 = xq2Var2.P();
            if (!z7 && P7 != vs0Var) {
                n7Var = P7;
                i6 = 1;
                kk3Var = kk3Var2;
            } else {
                i6 = 1;
                n7Var = new n7(list2, intValue, qn2Var, a2, kk3Var2);
                kk3Var = kk3Var2;
                xq2Var2.l0(n7Var);
            }
            a74 Q = Q(u24.B(a4, n7Var), RecyclerView.B1, 16.0f, i6);
            final kk3 kk3Var3 = kk3Var;
            boolean f13 = xq2Var2.f(a3) | xq2Var2.h(list2) | xq2Var2.d(kk3Var.ordinal()) | xq2Var2.e(c2) | xq2Var2.f(b2) | xq2Var2.h(gnVar) | xq2Var2.f(t2) | xq2Var2.e(i10);
            Object P8 = xq2Var2.P();
            if (!f13 && P8 != vs0Var) {
                a74Var = Q;
                qn2Var3 = P8;
                xq2Var = xq2Var2;
                pr3Var = a3;
                f5 = 16.0f;
            } else {
                a74Var = Q;
                xq2Var = xq2Var2;
                f5 = 16.0f;
                qn2Var3 = new qn2() { // from class: g7
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // defpackage.qn2
                    public final Object g(Object obj) {
                        float f14;
                        Object next;
                        float intBitsToFloat;
                        float intBitsToFloat2;
                        float f15;
                        float f16;
                        float floatValue;
                        float intBitsToFloat3;
                        float f17;
                        float ceil;
                        int i14;
                        um3 um3Var = (um3) obj;
                        um3Var.getClass();
                        zj0 zj0Var = um3Var.A;
                        pr3 pr3Var2 = pr3.this;
                        if (pr3Var2.h() == 0) {
                            f14 = (-pr3Var2.i()) + (-pr3Var2.j().l);
                        } else {
                            f14 = (-Float.intBitsToFloat((int) (zj0Var.e() & 4294967295L))) / 2.0f;
                        }
                        Iterator it2 = pr3Var2.j().k.iterator();
                        kr3 kr3Var = null;
                        if (!it2.hasNext()) {
                            next = null;
                        } else {
                            next = it2.next();
                            if (it2.hasNext()) {
                                int i15 = ((kr3) next).l;
                                do {
                                    Object next2 = it2.next();
                                    int i16 = ((kr3) next2).l;
                                    if (i15 < i16) {
                                        next = next2;
                                        i15 = i16;
                                    }
                                } while (it2.hasNext());
                            }
                        }
                        kr3 kr3Var2 = (kr3) next;
                        if (kr3Var2 != null && kr3Var2.a == hf.U(list2)) {
                            intBitsToFloat = kr3Var2.l + kr3Var2.m + pr3Var2.j().p;
                        } else {
                            intBitsToFloat = Float.intBitsToFloat((int) (zj0Var.e() >> 32)) + (Float.intBitsToFloat((int) (zj0Var.e() & 4294967295L)) / 2.0f);
                        }
                        float f18 = intBitsToFloat - f14;
                        kk3 kk3Var4 = kk3.Ltr;
                        kk3 kk3Var5 = kk3Var3;
                        if (kk3Var5 != kk3Var4) {
                            f14 = Float.intBitsToFloat((int) (zj0Var.e() >> 32)) - intBitsToFloat;
                        }
                        long floatToRawIntBits = (Float.floatToRawIntBits(f14) << 32) | (Float.floatToRawIntBits(RecyclerView.B1) & 4294967295L);
                        long a5 = xi6.a(f18, zj0Var.e());
                        long floatToRawIntBits2 = Float.floatToRawIntBits(Float.intBitsToFloat((int) (zj0Var.e() & 4294967295L)) / 2.0f);
                        long j3 = c2;
                        kc2 kc2Var = kc2.a;
                        um3Var.d(j3, floatToRawIntBits, a5, (Float.floatToRawIntBits(intBitsToFloat2) << 32) | (floatToRawIntBits2 & 4294967295L), kc2Var, 0.15f);
                        pp6 pp6Var = b2;
                        float floatValue2 = ((Number) pp6Var.getValue()).floatValue();
                        kr3 kr3Var3 = (kr3) gt0.R0(pr3Var2.j().k);
                        if (kr3Var3 != null) {
                            f15 = kr3Var3.a;
                        } else {
                            f15 = Float.MAX_VALUE;
                        }
                        if (floatValue2 <= f15) {
                            float floatValue3 = ((Number) pp6Var.getValue()).floatValue() + 0.999f;
                            kr3 kr3Var4 = (kr3) gt0.J0(pr3Var2.j().k);
                            if (kr3Var4 != null) {
                                f16 = kr3Var4.a;
                            } else {
                                f16 = Float.MIN_VALUE;
                            }
                            if (floatValue3 > f16) {
                                if (((Number) pp6Var.getValue()).floatValue() < ((kr3) gt0.H0(pr3Var2.j().k)).a) {
                                    Iterator it3 = pr3Var2.j().k.iterator();
                                    while (true) {
                                        if (!it3.hasNext()) {
                                            break;
                                        }
                                        Object next3 = it3.next();
                                        if (((kr3) next3).a == ((int) ((Number) pp6Var.getValue()).floatValue()) + 1) {
                                            kr3Var = next3;
                                            break;
                                        }
                                    }
                                    kr3 kr3Var5 = kr3Var;
                                    if (kr3Var5 == null) {
                                        kr3 kr3Var6 = (kr3) gt0.Q0(pr3Var2.j().k);
                                        f17 = kr3Var6.l;
                                        ceil = ((float) Math.ceil(((Number) pp6Var.getValue()).floatValue())) - ((Number) pp6Var.getValue()).floatValue();
                                        i14 = kr3Var6.m;
                                    } else {
                                        f17 = kr3Var5.l;
                                        ceil = ((float) Math.ceil(((Number) pp6Var.getValue()).floatValue())) - ((Number) pp6Var.getValue()).floatValue();
                                        i14 = kr3Var5.m;
                                    }
                                    floatValue = f17 - (ceil * i14);
                                } else {
                                    for (kr3 kr3Var7 : pr3Var2.j().k) {
                                        if (kr3Var7.a == ((int) ((Number) pp6Var.getValue()).floatValue())) {
                                            floatValue = ((((Number) pp6Var.getValue()).floatValue() - ((float) Math.floor(((Number) pp6Var.getValue()).floatValue()))) * kr3Var7.m) + kr3Var7.l + (-pr3Var2.j().l);
                                        }
                                    }
                                    fa6.e("Collection contains no element matching the predicate.");
                                    return null;
                                }
                                kk3 kk3Var6 = kk3.Ltr;
                                gn gnVar2 = gnVar;
                                if (kk3Var5 != kk3Var6) {
                                    floatValue = (Float.intBitsToFloat((int) (zj0Var.e() >> 32)) - floatValue) - ((Number) gnVar2.d()).floatValue();
                                }
                                float floatValue4 = ((Number) t2.getValue()).floatValue();
                                um3Var.d(i10, (Float.floatToRawIntBits(floatValue) << 32) | (Float.floatToRawIntBits(RecyclerView.B1) & 4294967295L), xi6.a(((Number) gnVar2.d()).floatValue(), zj0Var.e()), (Float.floatToRawIntBits(intBitsToFloat3) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (zj0Var.e() & 4294967295L)) / 2.0f) & 4294967295L), kc2Var, floatValue4);
                                um3Var = um3Var;
                            }
                        }
                        um3Var.b();
                        return jg7.a;
                    }
                };
                pr3Var = a3;
                list2 = list2;
                xq2Var.l0(qn2Var3);
            }
            a74 y = q60.y(a74Var, qn2Var3);
            pq4 i14 = i(2, f5);
            boolean h2 = xq2Var.h(list2);
            if (i11 == 32) {
                z4 = true;
            } else {
                z4 = false;
            }
            boolean z8 = h2 | z4;
            if (i13 == 256) {
                z5 = true;
            } else {
                z5 = false;
            }
            boolean z9 = z8 | z5;
            Object P9 = xq2Var.P();
            if (!z9 && P9 != vs0Var) {
                qn2Var2 = qn2Var;
            } else {
                qn2Var2 = qn2Var;
                P9 = new qn2() { // from class: h7
                    @Override // defpackage.qn2
                    public final Object g(Object obj) {
                        er3 er3Var = (er3) obj;
                        er3Var.getClass();
                        List list3 = list2;
                        er3Var.h0(list3.size(), null, new j5(2, list3), new zv0(802480018, true, new o7(list3, j2, qn2Var2)));
                        return jg7.a;
                    }
                };
                xq2Var.l0(P9);
            }
            gi2.f(y, pr3Var, i14, ju.d, null, null, false, null, (qn2) P9, xq2Var, 24960, 488);
        } else {
            xq2Var = xq2Var2;
            qn2Var2 = qn2Var;
            xq2Var.V();
        }
        cf5 t3 = xq2Var.t();
        if (t3 != null) {
            t3.d = new i7(list2, j2, qn2Var2, i2, 0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v7, types: [pw0, java.lang.Object, d2] */
    public static final void b(boolean z, on2 on2Var, px0 px0Var, int i2, int i3) {
        boolean z2;
        int i4;
        int i5;
        int i6;
        boolean z3;
        boolean z4;
        id4 id4Var;
        eb ebVar;
        jl4 jl4Var;
        boolean z5;
        boolean z6;
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(-361453782);
        int i7 = i3 & 1;
        if (i7 != 0) {
            i5 = i2 | 6;
            z2 = z;
        } else {
            z2 = z;
            if (xq2Var.g(z2)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i5 = i4 | i2;
        }
        if (xq2Var.h(on2Var)) {
            i6 = 32;
        } else {
            i6 = 16;
        }
        int i8 = i5 | i6;
        if ((i8 & 19) != 18) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (xq2Var.S(i8 & 1, z3)) {
            if (i7 != 0) {
                z4 = true;
            } else {
                z4 = z2;
            }
            Object a2 = ay3.a(xq2Var);
            if (a2 == null) {
                xq2Var.b0(535274673);
                a2 = by3.a(xq2Var);
            } else {
                xq2Var.b0(535271790);
            }
            xq2Var.p(false);
            if (a2 != null) {
                boolean f2 = xq2Var.f(a2);
                Object P = xq2Var.P();
                Object obj = ox0.a;
                if (f2 || P == obj) {
                    il4 il4Var = null;
                    if (a2 instanceof id4) {
                        id4Var = (id4) a2;
                    } else {
                        id4Var = null;
                    }
                    if (id4Var != null) {
                        ebVar = id4Var.a();
                    } else {
                        ebVar = null;
                    }
                    if (a2 instanceof jl4) {
                        jl4Var = (jl4) a2;
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
                long j2 = xq2Var.T;
                boolean f3 = xq2Var.f(e00Var) | xq2Var.e(j2);
                Object P2 = xq2Var.P();
                pw0 pw0Var = P2;
                if (f3 || P2 == obj) {
                    ?? d2Var = new d2(new f00(j2, a2));
                    d2Var.c = new c5(17);
                    xq2Var.l0(d2Var);
                    pw0Var = d2Var;
                }
                pw0 pw0Var2 = pw0Var;
                xq2Var.b0(-585307852);
                boolean h2 = xq2Var.h(pw0Var2);
                if ((i8 & 112) == 32) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                boolean z7 = h2 | z5;
                Object P3 = xq2Var.P();
                if (z7 || P3 == obj) {
                    P3 = new q6(8, pw0Var2, on2Var);
                    xq2Var.l0(P3);
                }
                mb3.n((on2) P3, xq2Var);
                Boolean valueOf = Boolean.valueOf(z4);
                boolean h3 = xq2Var.h(pw0Var2);
                int i9 = i8 & 14;
                if (i9 == 4) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                boolean z8 = h3 | z6;
                Object P4 = xq2Var.P();
                if (z8 || P4 == obj) {
                    P4 = new g00(pw0Var2, z4, 0);
                    xq2Var.l0(P4);
                }
                xk2.b(valueOf, pw0Var2, null, (qn2) P4, xq2Var, i9);
                boolean h4 = xq2Var.h(e00Var) | xq2Var.h(pw0Var2);
                Object P5 = xq2Var.P();
                if (h4 || P5 == obj) {
                    P5 = new y(3, e00Var, pw0Var2);
                    xq2Var.l0(P5);
                }
                mb3.e(e00Var, pw0Var2, (qn2) P5, xq2Var);
                xq2Var.p(false);
                z2 = z4;
            } else {
                i.m("No NavigationEventDispatcherOwner was provided via LocalNavigationEventDispatcherOwner and no OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner. Please provide one of the two.");
                return;
            }
        } else {
            xq2Var.V();
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new h00(z2, on2Var, i2, i3);
        }
    }

    public static final wd c(zh zhVar) {
        Canvas canvas = xd.a;
        wd wdVar = new wd();
        wdVar.a = new Canvas(l.h(zhVar));
        return wdVar;
    }

    public static final void d(a74 a74Var, co0 co0Var, on2 on2Var, px0 px0Var, int i2) {
        int i3;
        int i4;
        boolean z;
        xq2 xq2Var;
        on2 on2Var2;
        int i5;
        long j2;
        String description;
        boolean z2;
        boolean z3;
        a74Var.getClass();
        co0Var.getClass();
        Cheat cheat = co0Var.a;
        on2Var.getClass();
        xq2 xq2Var2 = (xq2) px0Var;
        xq2Var2.d0(1315035595);
        if (xq2Var2.f(co0Var)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i6 = i2 | i3;
        if (xq2Var2.h(on2Var)) {
            i4 = 256;
        } else {
            i4 = 128;
        }
        int i7 = i6 | i4;
        if ((i7 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (xq2Var2.S(i7 & 1, z)) {
            es7 F = bl2.F(xq2Var2);
            Object P = xq2Var2.P();
            vs0 vs0Var = ox0.a;
            if (P == vs0Var) {
                P = i61.f(xq2Var2);
            }
            r94 r94Var = (r94) P;
            qa4 a2 = bw7.a(r94Var, xq2Var2, 6);
            y16 b2 = z16.b(13.0f);
            a74 g2 = u24.g(a74Var, b2);
            if (((Boolean) a2.getValue()).booleanValue()) {
                i5 = i7;
                j2 = F.e;
            } else {
                i5 = i7;
                j2 = F.d;
            }
            a74 L = vy7.L(g2, j2, u24.m);
            if (((Boolean) a2.getValue()).booleanValue()) {
                L = ak7.I(L, 2.0f, F.j, b2);
            }
            a74 R = R(mb3.t(L, r94Var, null, false, null, on2Var, 28), 14.0f, 11.0f, 14.0f, 11.0f);
            d40 d40Var = d90.i0;
            l26 a3 = k26.a(ju.a, d40Var, xq2Var2, 48);
            int hashCode = Long.hashCode(xq2Var2.T);
            xv4 l2 = xq2Var2.l();
            a74 E = l.E(xq2Var2, R);
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
            yh2.K(xq2Var2, pnVar2, l2);
            Integer valueOf = Integer.valueOf(hashCode);
            pn pnVar3 = ix0.g;
            yh2.K(xq2Var2, pnVar3, valueOf);
            ne neVar = ix0.h;
            yh2.F(xq2Var2, neVar);
            pn pnVar4 = ix0.d;
            yh2.K(xq2Var2, pnVar4, E);
            vn3 vn3Var = new vn3(1.0f, true);
            yt0 a4 = wt0.a(new gu(3.0f, true, new i(1)), d90.k0, xq2Var2, 6);
            int hashCode2 = Long.hashCode(xq2Var2.T);
            xv4 l3 = xq2Var2.l();
            a74 E2 = l.E(xq2Var2, vn3Var);
            xq2Var2.f0();
            if (xq2Var2.S) {
                xq2Var2.k(iy0Var);
            } else {
                xq2Var2.o0();
            }
            yh2.K(xq2Var2, pnVar, a4);
            yh2.K(xq2Var2, pnVar2, l3);
            i61.w(hashCode2, xq2Var2, pnVar3, xq2Var2, neVar);
            yh2.K(xq2Var2, pnVar4, E2);
            l26 a5 = k26.a(new gu(6.0f, true, new i(1)), d40Var, xq2Var2, 54);
            int hashCode3 = Long.hashCode(xq2Var2.T);
            xv4 l4 = xq2Var2.l();
            x64 x64Var = x64.a;
            a74 E3 = l.E(xq2Var2, x64Var);
            xq2Var2.f0();
            if (xq2Var2.S) {
                xq2Var2.k(iy0Var);
            } else {
                xq2Var2.o0();
            }
            yh2.K(xq2Var2, pnVar, a5);
            yh2.K(xq2Var2, pnVar2, l4);
            i61.w(hashCode3, xq2Var2, pnVar3, xq2Var2, neVar);
            yh2.K(xq2Var2, pnVar4, E3);
            i13.a(hi2.A(), null, dj6.i(x64Var, 13.0f), F.i, xq2Var2, 432, 0);
            int i8 = i5;
            x37.b(co0Var.b, null, F.i, hi2.E(9), null, qs7.c, 0L, null, 0L, 2, false, 1, 0, null, null, xq2Var2, 1575936, 3120, 120754);
            xq2Var2.p(true);
            x37.b(cheat.getName(), null, F.g, hi2.D(13.5d), oj2.Z, null, 0L, null, 0L, 2, false, 1, 0, null, null, xq2Var2, 199680, 3120, 120786);
            xq2Var = xq2Var2;
            if (cheat.getDescription() != null && (!qs6.v0(description))) {
                xq2Var.b0(1071540310);
                String description2 = cheat.getDescription();
                description2.getClass();
                x37.b(description2, null, F.i, hi2.D(11.5d), null, null, 0L, null, hi2.E(15), 2, false, 2, 0, null, null, xq2Var, 3072, 3126, 119794);
                xq2Var = xq2Var;
                z2 = false;
                xq2Var.p(false);
            } else {
                z2 = false;
                xq2Var.b0(1071837693);
                xq2Var.p(false);
            }
            xq2Var.p(true);
            gi2.h(xq2Var, dj6.l(x64Var, 10.0f));
            boolean enabled = cheat.getEnabled();
            if ((i8 & 896) == 256) {
                z3 = true;
            } else {
                z3 = z2;
            }
            Object P2 = xq2Var.P();
            if (!z3 && P2 != vs0Var) {
                on2Var2 = on2Var;
            } else {
                on2Var2 = on2Var;
                P2 = new mn0(1, on2Var2);
                xq2Var.l0(P2);
            }
            is7.f(enabled, (qn2) P2, null, false, xq2Var, 0, 12);
            xq2Var.p(true);
        } else {
            xq2Var = xq2Var2;
            on2Var2 = on2Var;
            xq2Var.V();
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new x3(a74Var, co0Var, on2Var2, i2, 8);
        }
    }

    public static final void e(a74 a74Var, DSiWareTitle dSiWareTitle, on2 on2Var, on2 on2Var2, qn2 qn2Var, final qn2 qn2Var2, on2 on2Var3, px0 px0Var, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        boolean z;
        on2 on2Var4;
        xq2 xq2Var;
        on2 on2Var5;
        boolean z2;
        boolean z3;
        zh d2;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        final qn2 qn2Var3 = qn2Var;
        a74Var.getClass();
        dSiWareTitle.getClass();
        on2Var.getClass();
        on2Var2.getClass();
        qn2Var3.getClass();
        qn2Var2.getClass();
        on2Var3.getClass();
        xq2 xq2Var2 = (xq2) px0Var;
        xq2Var2.d0(763148317);
        if (xq2Var2.h(dSiWareTitle)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i9 = i2 | i3;
        if (xq2Var2.h(on2Var)) {
            i4 = 256;
        } else {
            i4 = 128;
        }
        int i10 = i9 | i4;
        if (xq2Var2.h(on2Var2)) {
            i5 = 2048;
        } else {
            i5 = 1024;
        }
        int i11 = i10 | i5;
        if (xq2Var2.h(qn2Var3)) {
            i6 = 16384;
        } else {
            i6 = 8192;
        }
        int i12 = i11 | i6;
        if (xq2Var2.h(qn2Var2)) {
            i7 = 131072;
        } else {
            i7 = 65536;
        }
        int i13 = i12 | i7;
        if (xq2Var2.h(on2Var3)) {
            i8 = 1048576;
        } else {
            i8 = 524288;
        }
        int i14 = i13 | i8;
        if ((599187 & i14) != 599186) {
            z = true;
        } else {
            z = false;
        }
        if (xq2Var2.S(i14 & 1, z)) {
            es7 F = bl2.F(xq2Var2);
            boolean f2 = xq2Var2.f(dSiWareTitle);
            Object P = xq2Var2.P();
            vs0 vs0Var = ox0.a;
            if (f2 || P == vs0Var) {
                P = np2.Y(i91.NONE);
                xq2Var2.l0(P);
            }
            final qa4 qa4Var = (qa4) P;
            a74 g2 = u24.g(P(a74Var, 12.0f, 4.0f), z16.b(10.0f));
            long j2 = F.c;
            jy2 jy2Var = u24.m;
            a74 R = R(ak7.I(vy7.L(g2, j2, jy2Var), 1.0f, F.f, z16.b(10.0f)), 10.0f, 9.0f, 6.0f, 9.0f);
            l26 a2 = k26.a(ju.a, d90.i0, xq2Var2, 48);
            int hashCode = Long.hashCode(xq2Var2.T);
            xv4 l2 = xq2Var2.l();
            a74 E = l.E(xq2Var2, R);
            jx0.i.getClass();
            iy0 iy0Var = ix0.b;
            xq2Var2.f0();
            if (xq2Var2.S) {
                xq2Var2.k(iy0Var);
            } else {
                xq2Var2.o0();
            }
            pn pnVar = ix0.f;
            yh2.K(xq2Var2, pnVar, a2);
            pn pnVar2 = ix0.e;
            yh2.K(xq2Var2, pnVar2, l2);
            Integer valueOf = Integer.valueOf(hashCode);
            pn pnVar3 = ix0.g;
            yh2.K(xq2Var2, pnVar3, valueOf);
            ne neVar = ix0.h;
            yh2.F(xq2Var2, neVar);
            pn pnVar4 = ix0.d;
            yh2.K(xq2Var2, pnVar4, E);
            boolean e2 = xq2Var2.e(dSiWareTitle.getTitleId());
            Object P2 = xq2Var2.P();
            if (e2 || P2 == vs0Var) {
                P2 = (ix5) on2Var3.c();
                xq2Var2.l0(P2);
            }
            ix5 ix5Var = (ix5) P2;
            x64 x64Var = x64.a;
            a74 L = vy7.L(u24.g(dj6.i(x64Var, 46.0f), z16.b(8.0f)), F.d, jy2Var);
            e34 d3 = h70.d(d90.L, false);
            int hashCode2 = Long.hashCode(xq2Var2.T);
            xv4 l3 = xq2Var2.l();
            a74 E2 = l.E(xq2Var2, L);
            xq2Var2.f0();
            if (xq2Var2.S) {
                xq2Var2.k(iy0Var);
            } else {
                xq2Var2.o0();
            }
            yh2.K(xq2Var2, pnVar, d3);
            yh2.K(xq2Var2, pnVar2, l3);
            i61.w(hashCode2, xq2Var2, pnVar3, xq2Var2, neVar);
            yh2.K(xq2Var2, pnVar4, E2);
            lc2 lc2Var = dj6.c;
            Bitmap bitmap = ix5Var.a;
            if (bitmap != null) {
                d2 = new zh(bitmap);
                z2 = true;
                z3 = false;
            } else {
                z2 = true;
                z3 = false;
                d2 = uj2.d(1, 1, 0, 28);
            }
            int i15 = o91.a[ix5Var.b.ordinal()];
            if (i15 != z2) {
                if (i15 == 2) {
                    z4 = z2;
                } else {
                    i.d();
                    return;
                }
            } else {
                z4 = z3;
            }
            boolean z9 = z2;
            bl2.c(d2, lc2Var, z4 ? 1 : 0, xq2Var2, 432, 120);
            xq2Var2.p(z9);
            gi2.h(xq2Var2, dj6.l(x64Var, 12.0f));
            vn3 vn3Var = new vn3(1.0f, z9);
            yt0 a3 = wt0.a(ju.c, d90.k0, xq2Var2, 0);
            int hashCode3 = Long.hashCode(xq2Var2.T);
            xv4 l4 = xq2Var2.l();
            a74 E3 = l.E(xq2Var2, vn3Var);
            xq2Var2.f0();
            if (xq2Var2.S) {
                xq2Var2.k(iy0Var);
            } else {
                xq2Var2.o0();
            }
            yh2.K(xq2Var2, pnVar, a3);
            yh2.K(xq2Var2, pnVar2, l4);
            i61.w(hashCode3, xq2Var2, pnVar3, xq2Var2, neVar);
            yh2.K(xq2Var2, pnVar4, E3);
            String name = dSiWareTitle.getName();
            long j3 = F.g;
            pi2 pi2Var = qs7.a;
            x37.b(name, null, j3, hi2.E(15), oj2.d0, pi2Var, 0L, null, hi2.E(19), 2, false, 1, 0, null, null, xq2Var2, 1772544, 3126, 119698);
            x37.b(dSiWareTitle.getProducer(), null, F.i, hi2.E(11), null, qs7.c, 0L, null, hi2.E(14), 2, false, 1, 0, null, null, xq2Var2, 1575936, 3126, 119730);
            xq2Var2.p(true);
            a74 g3 = u24.g(dj6.i(x64Var, 38.0f), z16.a);
            boolean f3 = xq2Var2.f(qa4Var);
            Object P3 = xq2Var2.P();
            if (f3 || P3 == vs0Var) {
                P3 = new f4(qa4Var, 17);
                xq2Var2.l0(P3);
            }
            a74 u = mb3.u(g3, false, null, (on2) P3, 15);
            e34 d4 = h70.d(d90.Z, false);
            int hashCode4 = Long.hashCode(xq2Var2.T);
            xv4 l5 = xq2Var2.l();
            a74 E4 = l.E(xq2Var2, u);
            xq2Var2.f0();
            if (xq2Var2.S) {
                xq2Var2.k(iy0Var);
            } else {
                xq2Var2.o0();
            }
            yh2.K(xq2Var2, pnVar, d4);
            yh2.K(xq2Var2, pnVar2, l5);
            i61.w(hashCode4, xq2Var2, pnVar3, xq2Var2, neVar);
            yh2.K(xq2Var2, pnVar4, E4);
            i13.b(kj2.R(xq2Var2, R.drawable.ic_menu), yh2.O(xq2Var2, R.string.delete), dj6.i(x64Var, 22.0f), F.i, xq2Var2, 392, 0);
            xq2Var2.p(true);
            xq2Var2.p(true);
            i91 i91Var = (i91) qa4Var.getValue();
            boolean f4 = xq2Var2.f(qa4Var);
            Object P4 = xq2Var2.P();
            if (f4 || P4 == vs0Var) {
                P4 = new j4(qa4Var, 8);
                xq2Var2.l0(P4);
            }
            qn2 qn2Var4 = (qn2) P4;
            boolean f5 = xq2Var2.f(qa4Var);
            if ((i14 & 7168) == 2048) {
                z5 = true;
            } else {
                z5 = false;
            }
            boolean z10 = f5 | z5;
            Object P5 = xq2Var2.P();
            if (!z10 && P5 != vs0Var) {
                on2Var5 = on2Var2;
            } else {
                on2Var5 = on2Var2;
                P5 = new s00(on2Var5, qa4Var, 6);
                xq2Var2.l0(P5);
            }
            on2 on2Var6 = (on2) P5;
            boolean f6 = xq2Var2.f(qa4Var);
            if ((i14 & 896) == 256) {
                z6 = true;
            } else {
                z6 = false;
            }
            boolean z11 = f6 | z6;
            Object P6 = xq2Var2.P();
            if (!z11 && P6 != vs0Var) {
                on2Var4 = on2Var;
            } else {
                on2Var4 = on2Var;
                P6 = new s00(on2Var4, qa4Var, 7);
                xq2Var2.l0(P6);
            }
            on2 on2Var7 = (on2) P6;
            boolean f7 = xq2Var2.f(qa4Var);
            if ((57344 & i14) == 16384) {
                z7 = true;
            } else {
                z7 = false;
            }
            boolean z12 = f7 | z7;
            Object P7 = xq2Var2.P();
            if (!z12 && P7 != vs0Var) {
                qn2Var3 = qn2Var;
                z8 = false;
            } else {
                qn2Var3 = qn2Var;
                z8 = false;
                P7 = new qn2() { // from class: l91
                    @Override // defpackage.qn2
                    public final Object g(Object obj) {
                        int i16 = r3;
                        jg7 jg7Var = jg7.a;
                        qa4 qa4Var2 = qa4Var;
                        qn2 qn2Var5 = qn2Var3;
                        bb1 bb1Var = (bb1) obj;
                        switch (i16) {
                            case 0:
                                bb1Var.getClass();
                                qa4Var2.setValue(i91.NONE);
                                qn2Var5.g(bb1Var);
                                return jg7Var;
                            default:
                                bb1Var.getClass();
                                qa4Var2.setValue(i91.NONE);
                                qn2Var5.g(bb1Var);
                                return jg7Var;
                        }
                    }
                };
                xq2Var2.l0(P7);
            }
            qn2 qn2Var5 = (qn2) P7;
            boolean f8 = xq2Var2.f(qa4Var);
            if ((458752 & i14) == 131072) {
                z8 = true;
            }
            boolean z13 = z8 | f8;
            Object P8 = xq2Var2.P();
            if (z13 || P8 == vs0Var) {
                P8 = new qn2() { // from class: l91
                    @Override // defpackage.qn2
                    public final Object g(Object obj) {
                        int i16 = r3;
                        jg7 jg7Var = jg7.a;
                        qa4 qa4Var2 = qa4Var;
                        qn2 qn2Var52 = qn2Var2;
                        bb1 bb1Var = (bb1) obj;
                        switch (i16) {
                            case 0:
                                bb1Var.getClass();
                                qa4Var2.setValue(i91.NONE);
                                qn2Var52.g(bb1Var);
                                return jg7Var;
                            default:
                                bb1Var.getClass();
                                qa4Var2.setValue(i91.NONE);
                                qn2Var52.g(bb1Var);
                                return jg7Var;
                        }
                    }
                };
                xq2Var2.l0(P8);
            }
            g(dSiWareTitle, i91Var, qn2Var4, on2Var6, on2Var7, qn2Var5, (qn2) P8, xq2Var2, (i14 >> 3) & 14);
            xq2Var = xq2Var2;
        } else {
            on2Var4 = on2Var;
            xq2Var = xq2Var2;
            on2Var5 = on2Var2;
            xq2Var.V();
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new fo0(a74Var, dSiWareTitle, on2Var4, on2Var5, qn2Var3, qn2Var2, on2Var3, i2, 2);
        }
    }

    public static final void f(bb1 bb1Var, boolean z, on2 on2Var, px0 px0Var, int i2) {
        int i3;
        int i4;
        boolean z2;
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(-1003493178);
        if (xq2Var.g(z)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i5 = i3 | i2;
        if (xq2Var.h(on2Var)) {
            i4 = 256;
        } else {
            i4 = 128;
        }
        int i6 = i5 | i4;
        if ((i6 & 147) != 146) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (xq2Var.S(i6 & 1, z2)) {
            mb3.c(bb1Var.getFileName(), z, false, on2Var, xq2Var, (i6 & 112) | ((i6 << 3) & 7168), 4);
        } else {
            xq2Var.V();
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new k91(bb1Var, z, on2Var, i2, 0);
        }
    }

    public static final void g(final DSiWareTitle dSiWareTitle, i91 i91Var, qn2 qn2Var, on2 on2Var, on2 on2Var2, final qn2 qn2Var2, final qn2 qn2Var3, px0 px0Var, int i2) {
        int i3;
        boolean z;
        boolean z2;
        boolean z3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(-1163182073);
        if ((i2 & 6) == 0) {
            if (xq2Var.h(dSiWareTitle)) {
                i10 = 4;
            } else {
                i10 = 2;
            }
            i3 = i10 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            if (xq2Var.d(i91Var.ordinal())) {
                i9 = 32;
            } else {
                i9 = 16;
            }
            i3 |= i9;
        }
        if ((i2 & RendererDebugBridge.CAPTURE_HEIGHT) == 0) {
            if (xq2Var.h(qn2Var)) {
                i8 = 256;
            } else {
                i8 = 128;
            }
            i3 |= i8;
        }
        if ((i2 & 3072) == 0) {
            if (xq2Var.h(on2Var)) {
                i7 = 2048;
            } else {
                i7 = 1024;
            }
            i3 |= i7;
        }
        if ((i2 & 24576) == 0) {
            if (xq2Var.h(on2Var2)) {
                i6 = 16384;
            } else {
                i6 = 8192;
            }
            i3 |= i6;
        }
        if ((196608 & i2) == 0) {
            if (xq2Var.h(qn2Var2)) {
                i5 = 131072;
            } else {
                i5 = 65536;
            }
            i3 |= i5;
        }
        if ((1572864 & i2) == 0) {
            if (xq2Var.h(qn2Var3)) {
                i4 = 1048576;
            } else {
                i4 = 524288;
            }
            i3 |= i4;
        }
        if ((599187 & i3) != 599186) {
            z = true;
        } else {
            z = false;
        }
        if (xq2Var.S(i3 & 1, z)) {
            int i11 = o91.b[i91Var.ordinal()];
            if (i11 != 1) {
                vs0 vs0Var = ox0.a;
                if (i11 != 2) {
                    if (i11 != 3) {
                        if (i11 == 4) {
                            xq2Var.b0(-558853799);
                            String O = yh2.O(xq2Var, R.string.dsiware_manager_export_data);
                            if ((i3 & 896) == 256) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            Object P = xq2Var.P();
                            if (z3 || P == vs0Var) {
                                P = new j91(7, qn2Var);
                                xq2Var.l0(P);
                            }
                            mb3.b(O, (on2) P, n16.I(370896624, new fo2() { // from class: m91
                                @Override // defpackage.fo2
                                public final Object e(Object obj, Object obj2, Object obj3) {
                                    int i12 = r1;
                                    jg7 jg7Var = jg7.a;
                                    boolean z4 = false;
                                    vs0 vs0Var2 = ox0.a;
                                    qn2 qn2Var4 = qn2Var3;
                                    DSiWareTitle dSiWareTitle2 = dSiWareTitle;
                                    zt0 zt0Var = (zt0) obj;
                                    px0 px0Var2 = (px0) obj2;
                                    int intValue = ((Integer) obj3).intValue();
                                    switch (i12) {
                                        case 0:
                                            zt0Var.getClass();
                                            if ((intValue & 17) != 16) {
                                                z4 = true;
                                            }
                                            xq2 xq2Var2 = (xq2) px0Var2;
                                            if (xq2Var2.S(intValue & 1, z4)) {
                                                bb1 bb1Var = bb1.PUBLIC_SAV;
                                                boolean hasPublicSavFile = dSiWareTitle2.hasPublicSavFile();
                                                boolean f2 = xq2Var2.f(qn2Var4);
                                                Object P2 = xq2Var2.P();
                                                if (f2 || P2 == vs0Var2) {
                                                    P2 = new j91(3, qn2Var4);
                                                    xq2Var2.l0(P2);
                                                }
                                                ge7.f(bb1Var, hasPublicSavFile, (on2) P2, xq2Var2, 6);
                                                bb1 bb1Var2 = bb1.PRIVATE_SAV;
                                                boolean hasPrivateSavFile = dSiWareTitle2.hasPrivateSavFile();
                                                boolean f3 = xq2Var2.f(qn2Var4);
                                                Object P3 = xq2Var2.P();
                                                if (f3 || P3 == vs0Var2) {
                                                    P3 = new j91(4, qn2Var4);
                                                    xq2Var2.l0(P3);
                                                }
                                                ge7.f(bb1Var2, hasPrivateSavFile, (on2) P3, xq2Var2, 6);
                                                bb1 bb1Var3 = bb1.BANNER_SAV;
                                                boolean hasBannerSavFile = dSiWareTitle2.hasBannerSavFile();
                                                boolean f4 = xq2Var2.f(qn2Var4);
                                                Object P4 = xq2Var2.P();
                                                if (f4 || P4 == vs0Var2) {
                                                    P4 = new j91(5, qn2Var4);
                                                    xq2Var2.l0(P4);
                                                }
                                                ge7.f(bb1Var3, hasBannerSavFile, (on2) P4, xq2Var2, 6);
                                            } else {
                                                xq2Var2.V();
                                            }
                                            return jg7Var;
                                        default:
                                            zt0Var.getClass();
                                            if ((intValue & 17) != 16) {
                                                z4 = true;
                                            }
                                            xq2 xq2Var3 = (xq2) px0Var2;
                                            if (xq2Var3.S(intValue & 1, z4)) {
                                                bb1 bb1Var4 = bb1.PUBLIC_SAV;
                                                boolean hasPublicSavFile2 = dSiWareTitle2.hasPublicSavFile();
                                                boolean f5 = xq2Var3.f(qn2Var4);
                                                Object P5 = xq2Var3.P();
                                                if (f5 || P5 == vs0Var2) {
                                                    P5 = new j91(8, qn2Var4);
                                                    xq2Var3.l0(P5);
                                                }
                                                ge7.f(bb1Var4, hasPublicSavFile2, (on2) P5, xq2Var3, 6);
                                                bb1 bb1Var5 = bb1.PRIVATE_SAV;
                                                boolean hasPrivateSavFile2 = dSiWareTitle2.hasPrivateSavFile();
                                                boolean f6 = xq2Var3.f(qn2Var4);
                                                Object P6 = xq2Var3.P();
                                                if (f6 || P6 == vs0Var2) {
                                                    P6 = new j91(9, qn2Var4);
                                                    xq2Var3.l0(P6);
                                                }
                                                ge7.f(bb1Var5, hasPrivateSavFile2, (on2) P6, xq2Var3, 6);
                                                bb1 bb1Var6 = bb1.BANNER_SAV;
                                                boolean hasBannerSavFile2 = dSiWareTitle2.hasBannerSavFile();
                                                boolean f7 = xq2Var3.f(qn2Var4);
                                                Object P7 = xq2Var3.P();
                                                if (f7 || P7 == vs0Var2) {
                                                    P7 = new j91(10, qn2Var4);
                                                    xq2Var3.l0(P7);
                                                }
                                                ge7.f(bb1Var6, hasBannerSavFile2, (on2) P7, xq2Var3, 6);
                                            } else {
                                                xq2Var3.V();
                                            }
                                            return jg7Var;
                                    }
                                }
                            }, xq2Var), xq2Var, RendererDebugBridge.CAPTURE_HEIGHT);
                            xq2Var.p(false);
                        } else {
                            throw xg6.f(xq2Var, -1126463078, false);
                        }
                    } else {
                        boolean z4 = true;
                        xq2Var.b0(-559533319);
                        String O2 = yh2.O(xq2Var, R.string.dsiware_manager_import_data);
                        if ((i3 & 896) != 256) {
                            z4 = false;
                        }
                        Object P2 = xq2Var.P();
                        if (z4 || P2 == vs0Var) {
                            P2 = new j91(6, qn2Var);
                            xq2Var.l0(P2);
                        }
                        mb3.b(O2, (on2) P2, n16.I(-207869521, new fo2() { // from class: m91
                            @Override // defpackage.fo2
                            public final Object e(Object obj, Object obj2, Object obj3) {
                                int i12 = r1;
                                jg7 jg7Var = jg7.a;
                                boolean z42 = false;
                                vs0 vs0Var2 = ox0.a;
                                qn2 qn2Var4 = qn2Var2;
                                DSiWareTitle dSiWareTitle2 = dSiWareTitle;
                                zt0 zt0Var = (zt0) obj;
                                px0 px0Var2 = (px0) obj2;
                                int intValue = ((Integer) obj3).intValue();
                                switch (i12) {
                                    case 0:
                                        zt0Var.getClass();
                                        if ((intValue & 17) != 16) {
                                            z42 = true;
                                        }
                                        xq2 xq2Var2 = (xq2) px0Var2;
                                        if (xq2Var2.S(intValue & 1, z42)) {
                                            bb1 bb1Var = bb1.PUBLIC_SAV;
                                            boolean hasPublicSavFile = dSiWareTitle2.hasPublicSavFile();
                                            boolean f2 = xq2Var2.f(qn2Var4);
                                            Object P22 = xq2Var2.P();
                                            if (f2 || P22 == vs0Var2) {
                                                P22 = new j91(3, qn2Var4);
                                                xq2Var2.l0(P22);
                                            }
                                            ge7.f(bb1Var, hasPublicSavFile, (on2) P22, xq2Var2, 6);
                                            bb1 bb1Var2 = bb1.PRIVATE_SAV;
                                            boolean hasPrivateSavFile = dSiWareTitle2.hasPrivateSavFile();
                                            boolean f3 = xq2Var2.f(qn2Var4);
                                            Object P3 = xq2Var2.P();
                                            if (f3 || P3 == vs0Var2) {
                                                P3 = new j91(4, qn2Var4);
                                                xq2Var2.l0(P3);
                                            }
                                            ge7.f(bb1Var2, hasPrivateSavFile, (on2) P3, xq2Var2, 6);
                                            bb1 bb1Var3 = bb1.BANNER_SAV;
                                            boolean hasBannerSavFile = dSiWareTitle2.hasBannerSavFile();
                                            boolean f4 = xq2Var2.f(qn2Var4);
                                            Object P4 = xq2Var2.P();
                                            if (f4 || P4 == vs0Var2) {
                                                P4 = new j91(5, qn2Var4);
                                                xq2Var2.l0(P4);
                                            }
                                            ge7.f(bb1Var3, hasBannerSavFile, (on2) P4, xq2Var2, 6);
                                        } else {
                                            xq2Var2.V();
                                        }
                                        return jg7Var;
                                    default:
                                        zt0Var.getClass();
                                        if ((intValue & 17) != 16) {
                                            z42 = true;
                                        }
                                        xq2 xq2Var3 = (xq2) px0Var2;
                                        if (xq2Var3.S(intValue & 1, z42)) {
                                            bb1 bb1Var4 = bb1.PUBLIC_SAV;
                                            boolean hasPublicSavFile2 = dSiWareTitle2.hasPublicSavFile();
                                            boolean f5 = xq2Var3.f(qn2Var4);
                                            Object P5 = xq2Var3.P();
                                            if (f5 || P5 == vs0Var2) {
                                                P5 = new j91(8, qn2Var4);
                                                xq2Var3.l0(P5);
                                            }
                                            ge7.f(bb1Var4, hasPublicSavFile2, (on2) P5, xq2Var3, 6);
                                            bb1 bb1Var5 = bb1.PRIVATE_SAV;
                                            boolean hasPrivateSavFile2 = dSiWareTitle2.hasPrivateSavFile();
                                            boolean f6 = xq2Var3.f(qn2Var4);
                                            Object P6 = xq2Var3.P();
                                            if (f6 || P6 == vs0Var2) {
                                                P6 = new j91(9, qn2Var4);
                                                xq2Var3.l0(P6);
                                            }
                                            ge7.f(bb1Var5, hasPrivateSavFile2, (on2) P6, xq2Var3, 6);
                                            bb1 bb1Var6 = bb1.BANNER_SAV;
                                            boolean hasBannerSavFile2 = dSiWareTitle2.hasBannerSavFile();
                                            boolean f7 = xq2Var3.f(qn2Var4);
                                            Object P7 = xq2Var3.P();
                                            if (f7 || P7 == vs0Var2) {
                                                P7 = new j91(10, qn2Var4);
                                                xq2Var3.l0(P7);
                                            }
                                            ge7.f(bb1Var6, hasBannerSavFile2, (on2) P7, xq2Var3, 6);
                                        } else {
                                            xq2Var3.V();
                                        }
                                        return jg7Var;
                                }
                            }
                        }, xq2Var), xq2Var, RendererDebugBridge.CAPTURE_HEIGHT);
                        xq2Var.p(false);
                    }
                } else {
                    boolean z5 = true;
                    xq2Var.b0(-560553994);
                    String name = dSiWareTitle.getName();
                    if ((i3 & 896) != 256) {
                        z5 = false;
                    }
                    Object P3 = xq2Var.P();
                    if (!z5 && P3 != vs0Var) {
                        z2 = false;
                    } else {
                        z2 = false;
                        P3 = new j91(0, qn2Var);
                        xq2Var.l0(P3);
                    }
                    mb3.b(name, (on2) P3, n16.I(-786635666, new m4(on2Var, qn2Var, on2Var2, 3), xq2Var), xq2Var, RendererDebugBridge.CAPTURE_HEIGHT);
                    xq2Var.p(z2);
                }
            } else {
                xq2Var.b0(-560639988);
                xq2Var.p(false);
            }
        } else {
            xq2Var.V();
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new n91(dSiWareTitle, i91Var, qn2Var, on2Var, on2Var2, qn2Var2, qn2Var3, i2);
        }
    }

    public static final void h(a74 a74Var, c6 c6Var, boolean z, on2 on2Var, px0 px0Var, int i2) {
        int i3;
        int i4;
        int i5;
        boolean z2;
        a74 a74Var2;
        long f2;
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(-1758575878);
        int i6 = i2 | 6;
        if (xq2Var.h(c6Var)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i7 = i6 | i3;
        if (xq2Var.g(z)) {
            i4 = 256;
        } else {
            i4 = 128;
        }
        int i8 = i7 | i4;
        if (xq2Var.h(on2Var)) {
            i5 = 2048;
        } else {
            i5 = 1024;
        }
        int i9 = i8 | i5;
        if ((i9 & 1171) != 1170) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (xq2Var.S(i9 & 1, z2)) {
            y16 a2 = z16.a();
            a74Var2 = x64.a;
            a74 P = P(g04.P(u24.g(a74Var2, a2), z, null, on2Var, 14), 32.0f, 8.0f);
            l26 a3 = k26.a(new gu(8.0f, true, new h61(d90.l0, 2)), d90.i0, xq2Var, 54);
            int hashCode = Long.hashCode(xq2Var.T);
            xv4 l2 = xq2Var.l();
            a74 E = l.E(xq2Var, P);
            jx0.i.getClass();
            iy0 iy0Var = ix0.b;
            xq2Var.f0();
            if (xq2Var.S) {
                xq2Var.k(iy0Var);
            } else {
                xq2Var.o0();
            }
            yh2.K(xq2Var, ix0.f, a3);
            yh2.K(xq2Var, ix0.e, l2);
            yh2.K(xq2Var, ix0.g, Integer.valueOf(hashCode));
            yh2.F(xq2Var, ix0.h);
            yh2.K(xq2Var, ix0.d, E);
            if (((Boolean) xq2Var.j(q83.a)).booleanValue()) {
                xq2Var.b0(130077244);
                h70.a(vy7.L(dj6.i(a74Var2, 24.0f), kt0.c, u24.m), xq2Var, 6);
                xq2Var.p(false);
            } else {
                xq2Var.b0(130175607);
                a74 i10 = dj6.i(a74Var2, 24.0f);
                x23 x23Var = new x23((Context) xq2Var.j(kf.b));
                x23Var.c = c6Var.d.toString();
                x23Var.b(true);
                gi2.b(x23Var.a(), null, i10, null, RecyclerView.B1, xq2Var, 432, 4088);
                xq2Var.p(false);
            }
            String str = c6Var.b;
            if (str == null) {
                str = i61.l(xq2Var, 2082420514, R.string.ra_base_set, xq2Var, false);
            } else {
                xq2Var.b0(2082420018);
                xq2Var.p(false);
            }
            String str2 = str;
            s47 s47Var = ((xe7) xq2Var.j(ye7.b)).j;
            if (z) {
                xq2Var.b0(2082425129);
                f2 = ((ut0) xq2Var.j(vt0.a)).e();
            } else {
                xq2Var.b0(2082426343);
                f2 = ((ut0) xq2Var.j(vt0.a)).f();
            }
            xq2Var.p(false);
            x37.b(str2, null, f2, 0L, null, null, 0L, null, hi2.E(16), 0, false, 2, 0, null, s47Var, xq2Var, 0, 3078, 56314);
            xq2Var = xq2Var;
            xq2Var.p(true);
        } else {
            xq2Var.V();
            a74Var2 = a74Var;
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new j7(a74Var2, c6Var, z, on2Var, i2);
        }
    }

    public static pq4 i(int i2, float f2) {
        int i3 = i2 & 1;
        float f3 = RecyclerView.B1;
        if (i3 != 0) {
            f2 = 0.0f;
        }
        if ((i2 & 2) == 0) {
            f3 = 40.0f;
        }
        return new pq4(f2, f3, f2, f3);
    }

    public static pq4 j(float f2, float f3, float f4, int i2) {
        float f5;
        if ((i2 & 1) != 0) {
            f2 = 0.0f;
        }
        if ((i2 & 2) != 0) {
            f3 = 0.0f;
        }
        if ((i2 & 4) != 0) {
            f5 = 0.0f;
        } else {
            f5 = 4.0f;
        }
        if ((i2 & 8) != 0) {
            f4 = 0.0f;
        }
        return new pq4(f2, f3, f5, f4);
    }

    public static final void k(RewindWindow rewindWindow, qn2 qn2Var, on2 on2Var, px0 px0Var, int i2) {
        int i3;
        boolean z;
        RewindWindow rewindWindow2;
        boolean z2;
        boolean z3;
        String str;
        boolean z4;
        nh2 nh2Var;
        nh2 nh2Var2;
        int i4;
        int i5;
        int i6;
        qn2 qn2Var2 = qn2Var;
        qn2Var2.getClass();
        on2Var.getClass();
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(1237287984);
        if ((i2 & 6) == 0) {
            if (xq2Var.h(rewindWindow)) {
                i6 = 4;
            } else {
                i6 = 2;
            }
            i3 = i6 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            if (xq2Var.h(qn2Var2)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        if ((i2 & RendererDebugBridge.CAPTURE_HEIGHT) == 0) {
            if (xq2Var.h(on2Var)) {
                i4 = 256;
            } else {
                i4 = 128;
            }
            i3 |= i4;
        }
        if ((i3 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (xq2Var.S(i3 & 1, z)) {
            es7 F = bl2.F(xq2Var);
            Object P = xq2Var.P();
            vs0 vs0Var = ox0.a;
            if (P == vs0Var) {
                P = new nh2();
                xq2Var.l0(P);
            }
            nh2 nh2Var3 = (nh2) P;
            boolean f2 = xq2Var.f(rewindWindow);
            Object P2 = xq2Var.P();
            if (f2 || P2 == vs0Var) {
                P2 = gt0.d1(rewindWindow.getRewindStates(), new tp5(0));
                xq2Var.l0(P2);
            }
            List list = (List) P2;
            int i7 = i3 & 896;
            if (i7 == 256) {
                z2 = true;
            } else {
                z2 = false;
            }
            Object P3 = xq2Var.P();
            if (z2 || P3 == vs0Var) {
                P3 = new x7(15, on2Var);
                xq2Var.l0(P3);
            }
            b(false, (on2) P3, xq2Var, 0, 1);
            lc2 lc2Var = dj6.c;
            long c2 = kt0.c(0.96f, F.b);
            jy2 jy2Var = u24.m;
            a74 j0 = nc1.j0(vy7.L(lc2Var, c2, jy2Var), nc1.o);
            if (i7 == 256) {
                z3 = true;
            } else {
                z3 = false;
            }
            Object P4 = xq2Var.P();
            if (z3 || P4 == vs0Var) {
                P4 = new m01(3, on2Var);
                xq2Var.l0(P4);
            }
            a74 B = u24.B(j0, (qn2) P4);
            yt0 a2 = wt0.a(ju.c, d90.k0, xq2Var, 0);
            int hashCode = Long.hashCode(xq2Var.T);
            xv4 l2 = xq2Var.l();
            a74 E = l.E(xq2Var, B);
            jx0.i.getClass();
            iy0 iy0Var = ix0.b;
            xq2Var.f0();
            if (xq2Var.S) {
                xq2Var.k(iy0Var);
            } else {
                xq2Var.o0();
            }
            pn pnVar = ix0.f;
            yh2.K(xq2Var, pnVar, a2);
            pn pnVar2 = ix0.e;
            yh2.K(xq2Var, pnVar2, l2);
            Integer valueOf = Integer.valueOf(hashCode);
            pn pnVar3 = ix0.g;
            yh2.K(xq2Var, pnVar3, valueOf);
            ne neVar = ix0.h;
            yh2.F(xq2Var, neVar);
            int i8 = i3;
            pn pnVar4 = ix0.d;
            yh2.K(xq2Var, pnVar4, E);
            d40 d40Var = d90.i0;
            x64 x64Var = x64.a;
            a74 R = R(dj6.c(x64Var, 1.0f), 20.0f, 8.0f, 12.0f, 8.0f);
            l26 a3 = k26.a(ju.a, d40Var, xq2Var, 48);
            int hashCode2 = Long.hashCode(xq2Var.T);
            xv4 l3 = xq2Var.l();
            a74 E2 = l.E(xq2Var, R);
            xq2Var.f0();
            if (xq2Var.S) {
                xq2Var.k(iy0Var);
            } else {
                xq2Var.o0();
            }
            yh2.K(xq2Var, pnVar, a3);
            yh2.K(xq2Var, pnVar2, l3);
            i61.w(hashCode2, xq2Var, pnVar3, xq2Var, neVar);
            yh2.K(xq2Var, pnVar4, E2);
            x37.b(yh2.O(xq2Var, R.string.rewind), new vn3(1.0f, true), F.g, hi2.E(16), oj2.d0, qs7.a, 0L, null, 0L, 0, false, 0, 0, null, null, xq2Var, 1772544, 0, 130960);
            a74 u = mb3.u(u24.g(dj6.i(x64Var, 38.0f), z16.a), false, null, on2Var, 15);
            e40 e40Var = d90.Z;
            e34 d2 = h70.d(e40Var, false);
            int hashCode3 = Long.hashCode(xq2Var.T);
            xv4 l4 = xq2Var.l();
            a74 E3 = l.E(xq2Var, u);
            xq2Var.f0();
            if (xq2Var.S) {
                xq2Var.k(iy0Var);
            } else {
                xq2Var.o0();
            }
            yh2.K(xq2Var, pnVar, d2);
            yh2.K(xq2Var, pnVar2, l4);
            i61.w(hashCode3, xq2Var, pnVar3, xq2Var, neVar);
            yh2.K(xq2Var, pnVar4, E3);
            i13.a(n16.y(), yh2.O(xq2Var, R.string.cancel), dj6.i(x64Var, 20.0f), F.g, xq2Var, RendererDebugBridge.CAPTURE_HEIGHT, 0);
            xq2Var.p(true);
            xq2Var.p(true);
            h70.a(vy7.L(dj6.e(dj6.c(x64Var, 1.0f), 1.0f), F.f, jy2Var), xq2Var, 0);
            vn3 vn3Var = new vn3(1.0f, true);
            e34 d3 = h70.d(e40Var, false);
            int hashCode4 = Long.hashCode(xq2Var.T);
            xv4 l5 = xq2Var.l();
            a74 E4 = l.E(xq2Var, vn3Var);
            xq2Var.f0();
            if (xq2Var.S) {
                xq2Var.k(iy0Var);
            } else {
                xq2Var.o0();
            }
            yh2.K(xq2Var, pnVar, d3);
            yh2.K(xq2Var, pnVar2, l5);
            i61.w(hashCode4, xq2Var, pnVar3, xq2Var, neVar);
            yh2.K(xq2Var, pnVar4, E4);
            if (list.isEmpty()) {
                xq2Var.b0(-1447331983);
                str = null;
                x37.b(yh2.O(xq2Var, R.string.rewind), null, F.i, hi2.E(12), null, qs7.c, 0L, null, 0L, 0, false, 0, 0, null, null, xq2Var, 1575936, 0, 130994);
                xq2Var = xq2Var;
                xq2Var.p(false);
                rewindWindow2 = rewindWindow;
                qn2Var2 = qn2Var;
                nh2Var2 = nh2Var3;
            } else {
                xq2Var = xq2Var;
                str = null;
                xq2Var.b0(-1447065848);
                gu guVar = new gu(12.0f, true, new i(1));
                pq4 pq4Var = new pq4(24.0f, 12.0f, 24.0f, 12.0f);
                a74 c3 = dj6.c(x64Var, 1.0f);
                rewindWindow2 = rewindWindow;
                boolean h2 = xq2Var.h(list) | xq2Var.h(rewindWindow2);
                if ((i8 & 112) == 32) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                boolean z5 = h2 | z4;
                Object P5 = xq2Var.P();
                if (!z5 && P5 != vs0Var) {
                    qn2Var2 = qn2Var;
                    nh2Var = nh2Var3;
                } else {
                    qn2Var2 = qn2Var;
                    nh2Var = nh2Var3;
                    P5 = new cn(list, rewindWindow2, nh2Var, qn2Var2);
                    xq2Var.l0(P5);
                }
                nh2Var2 = nh2Var;
                gi2.f(c3, null, pq4Var, guVar, d40Var, null, false, null, (qn2) P5, xq2Var, 221574, 458);
                xq2Var.p(false);
            }
            xq2Var.p(true);
            is7.a(hf.c0(new rq2(str, yh2.O(xq2Var, R.string.pause_hint_navigate)), new rq2("A", yh2.O(xq2Var, R.string.load_state)), new rq2("B", yh2.O(xq2Var, R.string.cancel))), null, false, xq2Var, 0, 6);
            xq2Var.p(true);
            is7.b(nh2Var2, xq2Var, 6);
        } else {
            rewindWindow2 = rewindWindow;
            xq2Var.V();
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new rl(rewindWindow2, qn2Var2, on2Var, i2, 17);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v3, types: [em5] */
    public static final void l(RewindWindow rewindWindow, RewindSaveState rewindSaveState, int i2, nh2 nh2Var, on2 on2Var, px0 px0Var, int i3) {
        int i4;
        boolean z;
        boolean z2;
        float f2;
        Bitmap em5Var;
        oq1 oq1Var;
        a74 a74Var;
        x64 x64Var;
        float f3;
        float f4;
        long j2;
        pn pnVar;
        boolean z3;
        pn pnVar2;
        xq2 xq2Var;
        x64 x64Var2;
        ne neVar;
        long c2;
        boolean z4;
        String string;
        String concat;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        xq2 xq2Var2 = (xq2) px0Var;
        xq2Var2.d0(2010886556);
        if ((i3 & 6) == 0) {
            if (xq2Var2.h(rewindWindow)) {
                i9 = 4;
            } else {
                i9 = 2;
            }
            i4 = i9 | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            if (xq2Var2.h(rewindSaveState)) {
                i8 = 32;
            } else {
                i8 = 16;
            }
            i4 |= i8;
        }
        if ((i3 & RendererDebugBridge.CAPTURE_HEIGHT) == 0) {
            if (xq2Var2.d(i2)) {
                i7 = 256;
            } else {
                i7 = 128;
            }
            i4 |= i7;
        }
        if ((i3 & 3072) == 0) {
            if (xq2Var2.f(nh2Var)) {
                i6 = 2048;
            } else {
                i6 = 1024;
            }
            i4 |= i6;
        }
        if ((i3 & 24576) == 0) {
            if (xq2Var2.h(on2Var)) {
                i5 = 16384;
            } else {
                i5 = 8192;
            }
            i4 |= i5;
        }
        if ((i4 & 9363) != 9362) {
            z = true;
        } else {
            z = false;
        }
        if (xq2Var2.S(i4 & 1, z)) {
            es7 F = bl2.F(xq2Var2);
            Context context = (Context) xq2Var2.j(kf.b);
            Object P = xq2Var2.P();
            vs0 vs0Var = ox0.a;
            if (P == vs0Var) {
                P = i61.f(xq2Var2);
            }
            r94 r94Var = (r94) P;
            qa4 a2 = bw7.a(r94Var, xq2Var2, 6);
            y16 b2 = z16.b(10.0f);
            if (i2 == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            float f5 = 1.0f - (i2 * 0.05f);
            if (f5 < 0.55f) {
                f2 = 0.55f;
            } else {
                f2 = f5;
            }
            boolean f6 = xq2Var2.f(rewindSaveState);
            Bitmap P2 = xq2Var2.P();
            if (f6 || P2 == vs0Var) {
                try {
                    em5Var = rewindSaveState.getScreenshot();
                } catch (Throwable th) {
                    em5Var = new em5(th);
                }
                if (em5Var instanceof em5) {
                    em5Var = null;
                }
                P2 = em5Var;
                xq2Var2.l0(P2);
            }
            Bitmap bitmap = (Bitmap) P2;
            boolean f7 = xq2Var2.f(rewindSaveState);
            Object P3 = xq2Var2.P();
            if (!f7 && P3 != vs0Var) {
                oq1Var = P3;
            } else {
                oq1 oq1Var2 = new oq1(rewindWindow.m5getDeltaFromEmulationTimeToRewindState5sfh64U(rewindSaveState));
                xq2Var2 = xq2Var2;
                xq2Var2.l0(oq1Var2);
                oq1Var = oq1Var2;
            }
            xq2 xq2Var3 = xq2Var2;
            long j3 = ((oq1) oq1Var).A;
            c40 c40Var = d90.l0;
            x64 x64Var3 = x64.a;
            if (nh2Var != null) {
                a74Var = ak7.S(x64Var3, nh2Var);
                x64Var = x64Var3;
            } else {
                a74Var = x64Var3;
                x64Var = a74Var;
            }
            x64 x64Var4 = x64Var;
            a74 v = mb3.v(a74Var, r94Var, false, null, on2Var, 508);
            yt0 a3 = wt0.a(ju.c, c40Var, xq2Var3, 48);
            int hashCode = Long.hashCode(xq2Var3.T);
            xv4 l2 = xq2Var3.l();
            a74 E = l.E(xq2Var3, v);
            jx0.i.getClass();
            iy0 iy0Var = ix0.b;
            xq2Var3.f0();
            if (xq2Var3.S) {
                xq2Var3.k(iy0Var);
            } else {
                xq2Var3.o0();
            }
            pn pnVar3 = ix0.f;
            yh2.K(xq2Var3, pnVar3, a3);
            pn pnVar4 = ix0.e;
            yh2.K(xq2Var3, pnVar4, l2);
            Integer valueOf = Integer.valueOf(hashCode);
            pn pnVar5 = ix0.g;
            yh2.K(xq2Var3, pnVar5, valueOf);
            ne neVar2 = ix0.h;
            yh2.F(xq2Var3, neVar2);
            pn pnVar6 = ix0.d;
            yh2.K(xq2Var3, pnVar6, E);
            a74 H = ak7.H(dj6.l(x64Var4, 118.0f), 1.3333334f);
            if (((Boolean) a2.getValue()).booleanValue()) {
                f3 = 1.0f;
            } else {
                f3 = f2;
            }
            a74 g2 = u24.g(jw2.j(H, f3), b2);
            long j4 = F.d;
            long j5 = F.j;
            jy2 jy2Var = u24.m;
            a74 L = vy7.L(g2, j4, jy2Var);
            if (((Boolean) a2.getValue()).booleanValue()) {
                f4 = 3.0f;
            } else {
                f4 = 2.0f;
            }
            if (((Boolean) a2.getValue()).booleanValue()) {
                j2 = j5;
            } else if (z2) {
                j2 = j5;
                j5 = kt0.c(0.75f, j5);
            } else {
                j2 = j5;
                j5 = F.f;
            }
            a74 I = ak7.I(L, f4, j5, b2);
            e40 e40Var = d90.L;
            e34 d2 = h70.d(e40Var, false);
            int hashCode2 = Long.hashCode(xq2Var3.T);
            xv4 l3 = xq2Var3.l();
            a74 E2 = l.E(xq2Var3, I);
            xq2Var3.f0();
            if (xq2Var3.S) {
                xq2Var3.k(iy0Var);
            } else {
                xq2Var3.o0();
            }
            yh2.K(xq2Var3, pnVar3, d2);
            yh2.K(xq2Var3, pnVar4, l3);
            i61.w(hashCode2, xq2Var3, pnVar5, xq2Var3, neVar2);
            yh2.K(xq2Var3, pnVar6, E2);
            vs0 vs0Var2 = vs0.Y;
            if (bitmap != null) {
                xq2Var3.b0(-339602527);
                pnVar = pnVar6;
                xq2Var = xq2Var3;
                x64Var2 = x64Var4;
                neVar = neVar2;
                pnVar2 = pnVar5;
                z3 = false;
                bl2.c(new zh(bitmap), dj6.c, 0, xq2Var, 25008, 232);
                xq2Var.p(false);
            } else {
                pnVar = pnVar6;
                z3 = false;
                pnVar2 = pnVar5;
                xq2Var = xq2Var3;
                x64Var2 = x64Var4;
                neVar = neVar2;
                xq2Var.b0(-339364726);
                xq2Var.p(false);
            }
            a74 g3 = u24.g(O(vs0Var2.n(x64Var2, d90.e0), 6.0f), z16.b(4.0f));
            if (z2) {
                c2 = j2;
            } else {
                c2 = kt0.c(0.5f, kt0.b);
            }
            a74 P4 = P(vy7.L(g3, c2, jy2Var), 7.0f, 2.0f);
            e34 d3 = h70.d(e40Var, z3);
            int hashCode3 = Long.hashCode(xq2Var.T);
            xv4 l4 = xq2Var.l();
            a74 E3 = l.E(xq2Var, P4);
            xq2Var.f0();
            if (xq2Var.S) {
                xq2Var.k(iy0Var);
            } else {
                xq2Var.o0();
            }
            yh2.K(xq2Var, pnVar3, d3);
            yh2.K(xq2Var, pnVar4, l4);
            i61.w(hashCode3, xq2Var, pnVar2, xq2Var, neVar);
            yh2.K(xq2Var, pnVar, E3);
            if (z2) {
                concat = i61.l(xq2Var, 708622609, R.string.rewind_now, xq2Var, z3);
                z4 = true;
            } else {
                xq2Var.b0(708710897);
                xq2Var.p(z3);
                double e2 = oq1.e(j3) / 1000.0d;
                if (e2 >= 60.0d) {
                    z4 = true;
                    string = context.getString(R.string.rewind_time_minutes_seconds, Integer.valueOf((int) (e2 / 60.0d)), String.format("%.2f", Arrays.copyOf(new Object[]{Double.valueOf(e2 % 60.0d)}, 1)));
                    string.getClass();
                } else {
                    z4 = true;
                    string = context.getString(R.string.rewind_time_seconds, String.format("%.2f", Arrays.copyOf(new Object[]{Double.valueOf(e2)}, 1)));
                    string.getClass();
                }
                concat = "-".concat(string);
            }
            String str = concat;
            xq2 xq2Var4 = xq2Var;
            x37.b(str, null, kt0.d, hi2.D(8.5d), oj2.d0, qs7.c, 0L, null, hi2.E(10), 0, false, 0, 0, null, null, xq2Var4, 1772928, 6, 129938);
            xq2Var2 = xq2Var4;
            i61.y(xq2Var2, z4, z4, z4);
        } else {
            xq2Var2.V();
        }
        cf5 t = xq2Var2.t();
        if (t != null) {
            t.d = new sp5(rewindWindow, rewindSaveState, i2, nh2Var, on2Var, i3, 0);
        }
    }

    public static final void m(int i2, int i3) {
        if (i2 >= 0 && i2 < i3) {
            return;
        }
        throw new IndexOutOfBoundsException("index (" + i2 + ") is out of bound of [0, " + i3 + ')');
    }

    public static Map n(Object obj) {
        if ((obj instanceof zf3) && !(obj instanceof cg3)) {
            X(obj, "kotlin.collections.MutableMap");
            throw null;
        }
        try {
            return (Map) obj;
        } catch (ClassCastException e2) {
            nb3.V(e2, ge7.class.getName());
            throw e2;
        }
    }

    public static final boolean o(bq6 bq6Var, int i2, h1 h1Var, boolean z) {
        boolean z2;
        synchronized (i) {
            try {
                int i3 = bq6Var.d;
                if (i3 == i2) {
                    bq6Var.c = h1Var;
                    z2 = true;
                    if (z) {
                        bq6Var.e++;
                    }
                    bq6Var.d = i3 + 1;
                } else {
                    z2 = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z2;
    }

    public static void p(int i2, Object obj) {
        if (obj != null && !I(i2, obj)) {
            X(obj, "kotlin.jvm.functions.Function" + i2);
            throw null;
        }
    }

    public static final float q(lq4 lq4Var, kk3 kk3Var) {
        if (kk3Var == kk3.Ltr) {
            return lq4Var.c(kk3Var);
        }
        return lq4Var.b(kk3Var);
    }

    public static final float r(lq4 lq4Var, kk3 kk3Var) {
        if (kk3Var == kk3.Ltr) {
            return lq4Var.b(kk3Var);
        }
        return lq4Var.c(kk3Var);
    }

    public static int s(Context context, String str) {
        if (str != null) {
            if (Build.VERSION.SDK_INT < 33 && TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
                if (new ch4(context).b.areNotificationsEnabled()) {
                    return 0;
                }
                return -1;
            }
            return context.checkPermission(str, Process.myPid(), Process.myUid());
        }
        u34.x("permission must be non-null");
        return 0;
    }

    public static final void t(Closeable closeable, Throwable th) {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                mb3.q(th, th2);
            }
        }
    }

    public static yw2 u(yw2 yw2Var, yw2 yw2Var2) {
        ww2 ww2Var = new ww2(0, (byte) 0);
        int size = yw2Var.size();
        for (int i2 = 0; i2 < size; i2++) {
            String b2 = yw2Var.b(i2);
            String d2 = yw2Var.d(i2);
            if ((!"Warning".equalsIgnoreCase(b2) || !xs6.g0(d2, "1", false)) && ("Content-Length".equalsIgnoreCase(b2) || "Content-Encoding".equalsIgnoreCase(b2) || "Content-Type".equalsIgnoreCase(b2) || !H(b2) || yw2Var2.a(b2) == null)) {
                ww2Var.e(b2, d2);
            }
        }
        int size2 = yw2Var2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            String b3 = yw2Var2.b(i3);
            if (!"Content-Length".equalsIgnoreCase(b3) && !"Content-Encoding".equalsIgnoreCase(b3) && !"Content-Type".equalsIgnoreCase(b3) && H(b3)) {
                ww2Var.e(b3, yw2Var2.d(i3));
            }
        }
        return ww2Var.f();
    }

    public static final boolean v(of5 of5Var, float f2, float f3) {
        float f4 = of5Var.a;
        if (f2 <= of5Var.c && f4 <= f2) {
            float f5 = of5Var.b;
            if (f3 <= of5Var.d && f5 <= f3) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static final long w(long j2, uq1 uq1Var) {
        long j3;
        uq1Var.getClass();
        int i2 = vq1.a[uq1Var.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 == 5) {
                            j3 = 1;
                        } else {
                            e41.h(uq1Var, "Wrong unit for millisMultiplier: ");
                            return 0L;
                        }
                    } else {
                        j3 = 1000;
                    }
                } else {
                    j3 = 60000;
                }
            } else {
                j3 = 3600000;
            }
        } else {
            j3 = 86400000;
        }
        if (j2 == 0) {
            return 0L;
        }
        if (j2 == 1) {
            if (j3 <= 4611686018427387903L) {
                return j3;
            }
        } else if (j3 == 1) {
            if (j2 <= 4611686018427387903L) {
                return j2;
            }
        } else {
            int numberOfLeadingZeros = (128 - Long.numberOfLeadingZeros(j2)) - Long.numberOfLeadingZeros(j3);
            if (numberOfLeadingZeros < 63) {
                return j2 * j3;
            }
            if (numberOfLeadingZeros <= 63) {
                long j4 = j2 * j3;
                if (j4 <= 4611686018427387903L) {
                    return j4;
                }
            }
        }
        return 4611686018427387903L;
    }

    public static void x(qf qfVar, LongSparseArray longSparseArray) {
        TranslationResponseValue k2;
        CharSequence o;
        za6 za6Var;
        xa6 xa6Var;
        qn2 qn2Var;
        int size = longSparseArray.size();
        for (int i2 = 0; i2 < size; i2++) {
            long keyAt = longSparseArray.keyAt(i2);
            ViewTranslationResponse n = ma.n(longSparseArray.get(keyAt));
            if (n != null && (k2 = ma.k(n)) != null && (o = ma.o(k2)) != null && (za6Var = (za6) qfVar.c().b((int) keyAt)) != null && (xa6Var = za6Var.a) != null) {
                Object g2 = xa6Var.d.A.g(sa6.l);
                if (g2 == null) {
                    g2 = null;
                }
                y1 y1Var = (y1) g2;
                if (y1Var != null && (qn2Var = (qn2) y1Var.b) != null) {
                    Boolean bool = (Boolean) qn2Var.g(new fp(o.toString()));
                }
            }
        }
    }

    public static final a74 y(a74 a74Var, qn2 qn2Var) {
        return a74Var.d(new gh2(new jh2(qn2Var)));
    }

    public static final e33 z() {
        e33 e33Var = k;
        if (e33Var != null) {
            return e33Var;
        }
        d33 d33Var = new d33("Filled.Bolt", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i2 = el7.a;
        cn6 cn6Var = new cn6(kt0.b);
        ww2 ww2Var = new ww2(1, (byte) 0);
        ww2Var.o(11.0f, 21.0f);
        ww2Var.l(-1.0f);
        ww2Var.n(1.0f, -7.0f);
        ww2Var.k(7.5f);
        ww2Var.i(-0.58f, RecyclerView.B1, -0.57f, -0.32f, -0.38f, -0.66f);
        ww2Var.i(0.19f, -0.34f, 0.05f, -0.08f, 0.07f, -0.12f);
        ww2Var.h(8.48f, 10.94f, 10.42f, 7.54f, 13.0f, 3.0f);
        ww2Var.l(1.0f);
        ww2Var.n(-1.0f, 7.0f);
        ww2Var.l(3.5f);
        ww2Var.i(0.49f, RecyclerView.B1, 0.56f, 0.33f, 0.47f, 0.51f);
        ww2Var.n(-0.07f, 0.15f);
        ww2Var.h(12.96f, 17.55f, 11.0f, 21.0f, 11.0f, 21.0f);
        ww2Var.g();
        d33.a(d33Var, ww2Var.b, 0, cn6Var);
        e33 b2 = d33Var.b();
        k = b2;
        return b2;
    }
}
