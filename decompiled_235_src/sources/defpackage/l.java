package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.OutputConfiguration;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.os.storage.StorageManager;
import android.provider.DocumentsContract;
import android.system.Os;
import android.util.Log;
import android.util.Size;
import android.view.Surface;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.stormds.emulator.R;
import java.io.File;
import java.lang.invoke.MethodHandle;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.URL;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import me.magnum.melonds.impl.emulator.debug.RendererDebugBridge;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: l  reason: default package */
/* loaded from: classes.dex */
public abstract class l {
    public static final char[] a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public static final wf7 b = new wf7(false, 1);
    public static final zv0 c = new zv0(-1571120048, false, new Object());
    public static final zv0 d = new zv0(-1455401925, false, new kw0(22));
    public static final zv0 e = new zv0(-1620577933, false, new iw0(19));
    public static final e30 f = new Object();
    public static final StackTraceElement[] g = new StackTraceElement[0];
    public static final tm1 h = new Object();
    public static final /* synthetic */ int i = 0;
    public static Constructor j;
    public static e33 k;

    public static Object A(Method method, Object obj, Object[] objArr) {
        MethodHandle unreflectSpecial;
        MethodHandle bindTo;
        Object invokeWithArguments;
        Constructor constructor = j;
        if (constructor == null) {
            constructor = au.f().getDeclaredConstructor(Class.class, Integer.TYPE);
            constructor.setAccessible(true);
            j = constructor;
        }
        unreflectSpecial = au.k(constructor.newInstance(yr2.class, -1)).unreflectSpecial(method, yr2.class);
        bindTo = unreflectSpecial.bindTo(obj);
        invokeWithArguments = bindTo.invokeWithArguments(objArr);
        return invokeWithArguments;
    }

    public static final boolean B(cf0 cf0Var, String str) {
        str.getClass();
        cf0Var.getClass();
        if (nb3.k(Build.FINGERPRINT, "robolectric")) {
            if (kj2.F("CXCP")) {
                Log.d("CXCP", "isBackwardCompatible method returns true because robolectric build detected.");
                return true;
            }
            return true;
        }
        try {
            xf0.a(str);
            lg0 b2 = cf0.b(cf0Var, str);
            CameraCharacteristics.Key key = CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES;
            key.getClass();
            int[] iArr = (int[]) ((qc0) b2).c(key);
            if (iArr == null) {
                return false;
            }
            return fv.m0(iArr, 0);
        } catch (CameraAccessException e2) {
            if (kj2.G()) {
                Log.e("CXCP", "Error while accessing metadata for cameraID: ".concat(str), e2);
            }
            throw new Exception(e2);
        }
    }

    public static final boolean C(o6 o6Var) {
        o6Var.getClass();
        if (o6Var instanceof m6) {
            return ((m6) o6Var).a.a.b;
        }
        if (!(o6Var instanceof n6)) {
            i.d();
            return false;
        }
        throw null;
    }

    public static final a74 D(px0 px0Var, a74 a74Var) {
        if (a74Var.a(ne.q0)) {
            return a74Var;
        }
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.c0(1219399079);
        a74 a74Var2 = (a74) a74Var.b(new o0(xq2Var, 4), x64.a);
        xq2Var.p(false);
        return a74Var2;
    }

    public static final a74 E(px0 px0Var, a74 a74Var) {
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.b0(439770924);
        a74 D = D(xq2Var, a74Var);
        xq2Var.p(false);
        return D;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, qb0] */
    /* JADX WARN: Type inference failed for: r1v0, types: [hl5, java.lang.Object] */
    public static gx3 F(gx3 gx3Var) {
        gx3Var.getClass();
        if (gx3Var.isDone()) {
            return gx3Var;
        }
        ?? obj = new Object();
        obj.c = new Object();
        tb0 tb0Var = new tb0(obj);
        obj.b = tb0Var;
        obj.a = i61.class;
        try {
            J(false, gx3Var, obj, u24.j());
            obj.a = "nonCancellationPropagating[" + gx3Var + "]";
        } catch (Exception e2) {
            tb0Var.b(e2);
        }
        return tb0Var;
    }

    public static void G(EditorInfo editorInfo, InputConnection inputConnection, TextView textView) {
        if (inputConnection != null && editorInfo.hintText == null) {
            for (ViewParent parent = textView.getParent(); parent instanceof View; parent = parent.getParent()) {
            }
        }
    }

    public static long H(int i2, String str) {
        int r = r(false, str, 0, i2);
        Matcher matcher = c51.n.matcher(str);
        int i3 = -1;
        int i4 = -1;
        int i5 = -1;
        int i6 = -1;
        int i7 = -1;
        int i8 = -1;
        while (r < i2) {
            int r2 = r(true, str, r + 1, i2);
            matcher.region(r, r2);
            if (i4 == -1 && matcher.usePattern(c51.n).matches()) {
                String group = matcher.group(1);
                group.getClass();
                i4 = Integer.parseInt(group);
                String group2 = matcher.group(2);
                group2.getClass();
                i7 = Integer.parseInt(group2);
                String group3 = matcher.group(3);
                group3.getClass();
                i8 = Integer.parseInt(group3);
            } else if (i5 == -1 && matcher.usePattern(c51.m).matches()) {
                String group4 = matcher.group(1);
                group4.getClass();
                i5 = Integer.parseInt(group4);
            } else {
                if (i6 == -1) {
                    Pattern pattern = c51.l;
                    if (matcher.usePattern(pattern).matches()) {
                        String group5 = matcher.group(1);
                        group5.getClass();
                        Locale locale = Locale.US;
                        locale.getClass();
                        String lowerCase = group5.toLowerCase(locale);
                        lowerCase.getClass();
                        String pattern2 = pattern.pattern();
                        pattern2.getClass();
                        i6 = qs6.t0(pattern2, lowerCase, 0, false, 6) / 4;
                    }
                }
                if (i3 == -1 && matcher.usePattern(c51.k).matches()) {
                    String group6 = matcher.group(1);
                    group6.getClass();
                    i3 = Integer.parseInt(group6);
                }
            }
            r = r(false, str, r2 + 1, i2);
        }
        if (70 <= i3 && i3 < 100) {
            i3 += 1900;
        }
        if (i3 >= 0 && i3 < 70) {
            i3 += 2000;
        }
        if (i3 >= 1601) {
            if (i6 != -1) {
                if (1 <= i5 && i5 < 32) {
                    if (i4 >= 0 && i4 < 24) {
                        if (i7 >= 0 && i7 < 60) {
                            if (i8 >= 0 && i8 < 60) {
                                GregorianCalendar gregorianCalendar = new GregorianCalendar(az7.a);
                                gregorianCalendar.setLenient(false);
                                gregorianCalendar.set(1, i3);
                                gregorianCalendar.set(2, i6 - 1);
                                gregorianCalendar.set(5, i5);
                                gregorianCalendar.set(11, i4);
                                gregorianCalendar.set(12, i7);
                                gregorianCalendar.set(13, i8);
                                gregorianCalendar.set(14, 0);
                                return gregorianCalendar.getTimeInMillis();
                            }
                            i.h("Failed requirement.");
                            return 0L;
                        }
                        i.h("Failed requirement.");
                        return 0L;
                    }
                    i.h("Failed requirement.");
                    return 0L;
                }
                i.h("Failed requirement.");
                return 0L;
            }
            i.h("Failed requirement.");
            return 0L;
        }
        i.h("Failed requirement.");
        return 0L;
    }

    public static final vr4 I(o6 o6Var) {
        bb5 bb5Var;
        int i2;
        if (!(o6Var instanceof m6) || (i2 = (bb5Var = ((m6) o6Var).a).b) <= 0) {
            return null;
        }
        return new vr4(Integer.valueOf(i2), Integer.valueOf(bb5Var.c));
    }

    public static void J(boolean z, gx3 gx3Var, qb0 qb0Var, uj1 uj1Var) {
        gx3Var.getClass();
        qb0Var.getClass();
        uj1Var.getClass();
        gx3Var.a(uj1Var, new uo2(0, gx3Var, new d51(qb0Var, 24)));
        if (z) {
            g15 g15Var = new g15(gx3Var, 11);
            uj1 j2 = u24.j();
            hl5 hl5Var = qb0Var.c;
            if (hl5Var != null) {
                hl5Var.a(j2, g15Var);
            }
        }
    }

    public static final j04 K(b9 b9Var, qn2 qn2Var, px0 px0Var, int i2) {
        b9 b9Var2;
        np2.b0(b9Var, px0Var);
        qa4 b0 = np2.b0(qn2Var, px0Var);
        Object[] objArr = new Object[0];
        xq2 xq2Var = (xq2) px0Var;
        Object P = xq2Var.P();
        vs0 vs0Var = ox0.a;
        if (P == vs0Var) {
            P = new c5(6);
            xq2Var.l0(P);
        }
        String str = (String) qo2.I(objArr, (on2) P, xq2Var, 48);
        l9 l9Var = (l9) xq2Var.j(wx3.a);
        if (l9Var == null) {
            xq2Var.b0(1213380307);
            Context context = (Context) xq2Var.j(kf.b);
            while (true) {
                if (context instanceof ContextWrapper) {
                    if (context instanceof l9) {
                        break;
                    }
                    context = ((ContextWrapper) context).getBaseContext();
                } else {
                    context = null;
                    break;
                }
            }
            l9Var = (l9) context;
        } else {
            xq2Var.b0(1213379439);
        }
        xq2Var.p(false);
        if (l9Var != null) {
            j9 g2 = l9Var.g();
            Object P2 = xq2Var.P();
            if (P2 == vs0Var) {
                P2 = new Object();
                xq2Var.l0(P2);
            }
            e9 e9Var = (e9) P2;
            Object P3 = xq2Var.P();
            if (P3 == vs0Var) {
                P3 = new j04(e9Var);
                xq2Var.l0(P3);
            }
            j04 j04Var = (j04) P3;
            boolean h2 = xq2Var.h(e9Var) | xq2Var.h(g2) | xq2Var.f(str) | xq2Var.h(b9Var) | xq2Var.f(b0);
            Object P4 = xq2Var.P();
            if (!h2 && P4 != vs0Var) {
                b9Var2 = b9Var;
            } else {
                b9Var2 = b9Var;
                P4 = new d5(e9Var, g2, str, b9Var2, b0, 1);
                xq2Var.l0(P4);
            }
            qn2 qn2Var2 = (qn2) P4;
            boolean f2 = xq2Var.f(g2) | xq2Var.f(str) | xq2Var.f(b9Var2);
            Object P5 = xq2Var.P();
            if (f2 || P5 == vs0Var) {
                P5 = new el1(qn2Var2);
                xq2Var.l0(P5);
            }
            el1 el1Var = (el1) P5;
            return j04Var;
        }
        i.m("No ActivityResultRegistryOwner was provided via LocalActivityResultRegistryOwner");
        return null;
    }

    public static final void L(v2 v2Var, xa6 xa6Var) {
        int size;
        AccessibilityNodeInfo accessibilityNodeInfo = v2Var.a;
        Object g2 = xa6Var.k().A.g(bb6.f);
        Object obj = null;
        if (g2 == null) {
            g2 = null;
        }
        bt0 bt0Var = (bt0) g2;
        if (bt0Var != null) {
            accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(bt0Var.a, bt0Var.b, false, 0));
            return;
        }
        ArrayList arrayList = new ArrayList();
        Object g3 = xa6Var.k().A.g(bb6.e);
        if (g3 != null) {
            obj = g3;
        }
        if (obj != null) {
            List j2 = xa6.j(4, xa6Var);
            int size2 = j2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                xa6 xa6Var2 = (xa6) j2.get(i2);
                if (xa6Var2.k().A.c(bb6.J)) {
                    arrayList.add(xa6Var2);
                }
            }
        }
        if (!arrayList.isEmpty()) {
            boolean l = l(arrayList);
            int i3 = 1;
            if (l) {
                size = 1;
            } else {
                size = arrayList.size();
            }
            if (l) {
                i3 = arrayList.size();
            }
            accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(size, i3, false, 0));
        }
    }

    public static void M(j11 j11Var, View view, float[] fArr) {
        Class<?> cls = view.getClass();
        String str = "set" + j11Var.b;
        try {
            int i2 = l81.a[j11Var.c.ordinal()];
            Class cls2 = Integer.TYPE;
            Class cls3 = Float.TYPE;
            boolean z = true;
            switch (i2) {
                case 1:
                    cls.getMethod(str, cls2).invoke(view, Integer.valueOf((int) fArr[0]));
                    return;
                case 2:
                    cls.getMethod(str, cls3).invoke(view, Float.valueOf(fArr[0]));
                    return;
                case 3:
                    Method method = cls.getMethod(str, Drawable.class);
                    int o = o((int) (((float) Math.pow(fArr[0], 0.45454545454545453d)) * 255.0f));
                    int o2 = o((int) (((float) Math.pow(fArr[1], 0.45454545454545453d)) * 255.0f));
                    ColorDrawable colorDrawable = new ColorDrawable();
                    colorDrawable.setColor((o << 16) | (o((int) (fArr[3] * 255.0f)) << 24) | (o2 << 8) | o((int) (((float) Math.pow(fArr[2], 0.45454545454545453d)) * 255.0f)));
                    method.invoke(view, colorDrawable);
                    return;
                case 4:
                    cls.getMethod(str, cls2).invoke(view, Integer.valueOf((o((int) (((float) Math.pow(fArr[0], 0.45454545454545453d)) * 255.0f)) << 16) | (o((int) (fArr[3] * 255.0f)) << 24) | (o((int) (((float) Math.pow(fArr[1], 0.45454545454545453d)) * 255.0f)) << 8) | o((int) (((float) Math.pow(fArr[2], 0.45454545454545453d)) * 255.0f))));
                    return;
                case 5:
                    throw new RuntimeException("unable to interpolate strings " + j11Var.b);
                case 6:
                    Method method2 = cls.getMethod(str, Boolean.TYPE);
                    if (fArr[0] <= 0.5f) {
                        z = false;
                    }
                    method2.invoke(view, Boolean.valueOf(z));
                    return;
                case 7:
                    cls.getMethod(str, cls3).invoke(view, Float.valueOf(fArr[0]));
                    return;
                default:
                    return;
            }
        } catch (IllegalAccessException e2) {
            StringBuilder t = i61.t("Cannot access method ", str, " on View \"");
            t.append(lb4.y(view));
            t.append("\"");
            Log.e("CustomSupport", t.toString(), e2);
        } catch (NoSuchMethodException e3) {
            StringBuilder t2 = i61.t("No method ", str, " on View \"");
            t2.append(lb4.y(view));
            t2.append("\"");
            Log.e("CustomSupport", t2.toString(), e3);
        } catch (InvocationTargetException e4) {
            StringBuilder t3 = i61.t("Cannot invoke method ", str, " on View \"");
            t3.append(lb4.y(view));
            t3.append("\"");
            Log.e("CustomSupport", t3.toString(), e4);
        }
    }

    public static void N(int i2, p11 p11Var, l21 l21Var, boolean z) {
        float f2;
        float f3 = l21Var.e0;
        h11 h11Var = l21Var.I;
        int d2 = h11Var.f.d();
        h11 h11Var2 = l21Var.K;
        int d3 = h11Var2.f.d();
        int e2 = h11Var.e() + d2;
        int e3 = d3 - h11Var2.e();
        if (d2 == d3) {
            f3 = 0.5f;
        } else {
            d2 = e2;
            d3 = e3;
        }
        int r = l21Var.r();
        int i3 = (d3 - d2) - r;
        if (d2 > d3) {
            i3 = (d2 - d3) - r;
        }
        if (i3 > 0) {
            f2 = (f3 * i3) + 0.5f;
        } else {
            f2 = f3 * i3;
        }
        int i4 = ((int) f2) + d2;
        int i5 = i4 + r;
        if (d2 > d3) {
            i5 = i4 - r;
        }
        l21Var.K(i4, i5);
        y(i2 + 1, p11Var, l21Var, z);
    }

    public static void O(int i2, l21 l21Var, p11 p11Var, l21 l21Var2, boolean z) {
        int r;
        float f2 = l21Var2.e0;
        h11 h11Var = l21Var2.I;
        int e2 = h11Var.e() + h11Var.f.d();
        h11 h11Var2 = l21Var2.K;
        int d2 = h11Var2.f.d() - h11Var2.e();
        if (d2 >= e2) {
            int r2 = l21Var2.r();
            if (l21Var2.h0 != 8) {
                int i3 = l21Var2.r;
                if (i3 == 2) {
                    if (l21Var instanceof m21) {
                        r = l21Var.r();
                    } else {
                        r = l21Var.U.r();
                    }
                    r2 = (int) (l21Var2.e0 * 0.5f * r);
                } else if (i3 == 0) {
                    r2 = d2 - e2;
                }
                r2 = Math.max(l21Var2.u, r2);
                int i4 = l21Var2.v;
                if (i4 > 0) {
                    r2 = Math.min(i4, r2);
                }
            }
            int i5 = e2 + ((int) ((f2 * ((d2 - e2) - r2)) + 0.5f));
            l21Var2.K(i5, r2 + i5);
            y(i2 + 1, p11Var, l21Var2, z);
        }
    }

    public static void P(int i2, p11 p11Var, l21 l21Var) {
        float f2;
        float f3 = l21Var.f0;
        h11 h11Var = l21Var.J;
        int d2 = h11Var.f.d();
        h11 h11Var2 = l21Var.L;
        int d3 = h11Var2.f.d();
        int e2 = h11Var.e() + d2;
        int e3 = d3 - h11Var2.e();
        if (d2 == d3) {
            f3 = 0.5f;
        } else {
            d2 = e2;
            d3 = e3;
        }
        int l = l21Var.l();
        int i3 = (d3 - d2) - l;
        if (d2 > d3) {
            i3 = (d2 - d3) - l;
        }
        if (i3 > 0) {
            f2 = (f3 * i3) + 0.5f;
        } else {
            f2 = f3 * i3;
        }
        int i4 = (int) f2;
        int i5 = d2 + i4;
        int i6 = i5 + l;
        if (d2 > d3) {
            i5 = d2 - i4;
            i6 = i5 - l;
        }
        l21Var.L(i5, i6);
        U(i2 + 1, p11Var, l21Var);
    }

    public static void Q(int i2, l21 l21Var, p11 p11Var, l21 l21Var2) {
        int l;
        float f2 = l21Var2.f0;
        h11 h11Var = l21Var2.J;
        int e2 = h11Var.e() + h11Var.f.d();
        h11 h11Var2 = l21Var2.L;
        int d2 = h11Var2.f.d() - h11Var2.e();
        if (d2 >= e2) {
            int l2 = l21Var2.l();
            if (l21Var2.h0 != 8) {
                int i3 = l21Var2.s;
                if (i3 == 2) {
                    if (l21Var instanceof m21) {
                        l = l21Var.l();
                    } else {
                        l = l21Var.U.l();
                    }
                    l2 = (int) (f2 * 0.5f * l);
                } else if (i3 == 0) {
                    l2 = d2 - e2;
                }
                l2 = Math.max(l21Var2.x, l2);
                int i4 = l21Var2.y;
                if (i4 > 0) {
                    l2 = Math.min(i4, l2);
                }
            }
            int i5 = e2 + ((int) ((f2 * ((d2 - e2) - l2)) + 0.5f));
            l21Var2.L(i5, l2 + i5);
            U(i2 + 1, p11Var, l21Var2);
        }
    }

    public static final Bitmap.Config R(int i2) {
        Bitmap.Config config;
        Bitmap.Config config2;
        if (i2 == 0) {
            return Bitmap.Config.ARGB_8888;
        }
        if (i2 == 1) {
            return Bitmap.Config.ALPHA_8;
        }
        if (i2 == 2) {
            return Bitmap.Config.RGB_565;
        }
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 26 && i2 == 3) {
            config2 = Bitmap.Config.RGBA_F16;
            return config2;
        } else if (i3 >= 26 && i2 == 4) {
            config = Bitmap.Config.HARDWARE;
            return config;
        } else {
            return Bitmap.Config.ARGB_8888;
        }
    }

    public static final String S(byte b2) {
        if (b2 == 1) {
            return "quotation mark '\"'";
        }
        if (b2 == 2) {
            return "string escape sequence '\\'";
        }
        if (b2 == 4) {
            return "comma ','";
        }
        if (b2 == 5) {
            return "colon ':'";
        }
        if (b2 == 6) {
            return "start of the object '{'";
        }
        if (b2 == 7) {
            return "end of the object '}'";
        }
        if (b2 == 8) {
            return "start of the array '['";
        }
        if (b2 == 9) {
            return "end of the array ']'";
        }
        if (b2 == 10) {
            return "end of the input";
        }
        if (b2 == Byte.MAX_VALUE) {
            return "invalid token";
        }
        return "valid token";
    }

    public static ll0 T(gx3 gx3Var, aw awVar, Executor executor) {
        ll0 ll0Var = new ll0(awVar, gx3Var);
        gx3Var.a(executor, ll0Var);
        return ll0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v8, types: [e30, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v15, types: [e30, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v19, types: [e30, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v6, types: [e30, java.lang.Object] */
    public static void U(int i2, p11 p11Var, l21 l21Var) {
        boolean z;
        boolean z2;
        char c2;
        h11 h11Var;
        h11 h11Var2;
        float f2;
        char c3;
        h11 h11Var3;
        h11 h11Var4;
        if (!l21Var.n) {
            if (!(l21Var instanceof m21) && l21Var.A() && m(l21Var)) {
                m21.W(l21Var, p11Var, new Object());
            }
            h11 j2 = l21Var.j(g11.TOP);
            h11 j3 = l21Var.j(g11.BOTTOM);
            int d2 = j2.d();
            int d3 = j3.d();
            HashSet hashSet = j2.a;
            char c4 = 1;
            if (hashSet != null && j2.c) {
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    h11 h11Var5 = (h11) it.next();
                    l21 l21Var2 = h11Var5.d;
                    int i3 = i2 + 1;
                    boolean m = m(l21Var2);
                    h11 h11Var6 = l21Var2.J;
                    h11 h11Var7 = l21Var2.L;
                    if (l21Var2.A() && m) {
                        f2 = RecyclerView.B1;
                        m21.W(l21Var2, p11Var, new Object());
                    } else {
                        f2 = RecyclerView.B1;
                    }
                    if ((h11Var5 == h11Var6 && (h11Var4 = h11Var7.f) != null && h11Var4.c) || (h11Var5 == h11Var7 && (h11Var3 = h11Var6.f) != null && h11Var3.c)) {
                        c3 = c4;
                    } else {
                        c3 = 0;
                    }
                    k21 k21Var = l21Var2.T[c4];
                    char c5 = c4;
                    k21 k21Var2 = k21.MATCH_CONSTRAINT;
                    if (k21Var == k21Var2 && !m) {
                        if (k21Var == k21Var2 && l21Var2.y >= 0 && l21Var2.x >= 0 && ((l21Var2.h0 == 8 || (l21Var2.s == 0 && l21Var2.X == f2)) && !l21Var2.z() && !l21Var2.F && c3 != 0 && !l21Var2.z())) {
                            Q(i3, l21Var, p11Var, l21Var2);
                        }
                    } else if (!l21Var2.A()) {
                        if (h11Var5 == h11Var6 && h11Var7.f == null) {
                            int e2 = h11Var6.e() + d2;
                            l21Var2.L(e2, l21Var2.l() + e2);
                            U(i3, p11Var, l21Var2);
                        } else if (h11Var5 == h11Var7 && h11Var6.f == null) {
                            int e3 = d2 - h11Var7.e();
                            l21Var2.L(e3 - l21Var2.l(), e3);
                            U(i3, p11Var, l21Var2);
                        } else if (c3 != 0 && !l21Var2.z()) {
                            P(i3, p11Var, l21Var2);
                        }
                    }
                    c4 = c5;
                }
            }
            char c6 = c4;
            if (l21Var instanceof av2) {
                return;
            }
            HashSet hashSet2 = j3.a;
            if (hashSet2 != null && j3.c) {
                Iterator it2 = hashSet2.iterator();
                while (it2.hasNext()) {
                    h11 h11Var8 = (h11) it2.next();
                    l21 l21Var3 = h11Var8.d;
                    int i4 = i2 + 1;
                    boolean m2 = m(l21Var3);
                    h11 h11Var9 = l21Var3.J;
                    h11 h11Var10 = l21Var3.L;
                    if (l21Var3.A() && m2) {
                        m21.W(l21Var3, p11Var, new Object());
                    }
                    if ((h11Var8 == h11Var9 && (h11Var2 = h11Var10.f) != null && h11Var2.c) || (h11Var8 == h11Var10 && (h11Var = h11Var9.f) != null && h11Var.c)) {
                        c2 = c6;
                    } else {
                        c2 = 0;
                    }
                    k21 k21Var3 = l21Var3.T[c6];
                    k21 k21Var4 = k21.MATCH_CONSTRAINT;
                    if (k21Var3 == k21Var4 && !m2) {
                        if (k21Var3 == k21Var4 && l21Var3.y >= 0 && l21Var3.x >= 0 && (l21Var3.h0 == 8 || (l21Var3.s == 0 && l21Var3.X == RecyclerView.B1))) {
                            if (!l21Var3.z() && !l21Var3.F && c2 != 0 && !l21Var3.z()) {
                                Q(i4, l21Var, p11Var, l21Var3);
                            }
                        }
                    } else if (!l21Var3.A()) {
                        if (h11Var8 == h11Var9 && h11Var10.f == null) {
                            int e4 = h11Var9.e() + d3;
                            l21Var3.L(e4, l21Var3.l() + e4);
                            U(i4, p11Var, l21Var3);
                        } else if (h11Var8 == h11Var10 && h11Var9.f == null) {
                            int e5 = d3 - h11Var10.e();
                            l21Var3.L(e5 - l21Var3.l(), e5);
                            U(i4, p11Var, l21Var3);
                        } else if (c2 != 0 && !l21Var3.z()) {
                            P(i4, p11Var, l21Var3);
                        }
                    }
                }
            }
            h11 j4 = l21Var.j(g11.BASELINE);
            if (j4.a != null && j4.c) {
                int d4 = j4.d();
                Iterator it3 = j4.a.iterator();
                while (it3.hasNext()) {
                    h11 h11Var11 = (h11) it3.next();
                    l21 l21Var4 = h11Var11.d;
                    int i5 = i2 + 1;
                    boolean m3 = m(l21Var4);
                    h11 h11Var12 = l21Var4.M;
                    if (l21Var4.A() && m3) {
                        m21.W(l21Var4, p11Var, new Object());
                    }
                    if (l21Var4.T[c6 == 1 ? 1 : 0] != k21.MATCH_CONSTRAINT || m3) {
                        if (!l21Var4.A()) {
                            if (h11Var11 == h11Var12) {
                                int e6 = h11Var11.e() + d4;
                                if (!l21Var4.E) {
                                    z = c6 == 1 ? 1 : 0;
                                } else {
                                    int i6 = e6 - l21Var4.b0;
                                    int i7 = l21Var4.W + i6;
                                    l21Var4.a0 = i6;
                                    l21Var4.J.l(i6);
                                    l21Var4.L.l(i7);
                                    h11Var12.l(e6);
                                    boolean z3 = c6 == 1 ? 1 : 0;
                                    l21Var4.l = z3;
                                    z = z3;
                                }
                                U(i5, p11Var, l21Var4);
                                z2 = z;
                                c6 = z2;
                            }
                        }
                    }
                    z2 = c6 == 1 ? 1 : 0;
                    c6 = z2;
                }
            }
            l21Var.n = c6;
        }
    }

    public static final void a(String str, float f2, px0 px0Var, int i2) {
        int i3;
        boolean z;
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(-303455014);
        if (xq2Var.f(str)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i4 = i3 | i2;
        if ((i4 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (xq2Var.S(i4 & 1, z)) {
            es7 F = bl2.F(xq2Var);
            y16 b2 = z16.b(0.24f * f2);
            x64 x64Var = x64.a;
            a74 I = ak7.I(vy7.L(u24.g(dj6.i(x64Var, f2), b2), F.e, u24.m), 1.0f, F.f, b2);
            e34 d2 = h70.d(d90.Z, false);
            int hashCode = Long.hashCode(xq2Var.T);
            xv4 l = xq2Var.l();
            a74 E = E(xq2Var, I);
            jx0.i.getClass();
            iy0 iy0Var = ix0.b;
            xq2Var.f0();
            if (xq2Var.S) {
                xq2Var.k(iy0Var);
            } else {
                xq2Var.o0();
            }
            yh2.K(xq2Var, ix0.f, d2);
            yh2.K(xq2Var, ix0.e, l);
            yh2.K(xq2Var, ix0.g, Integer.valueOf(hashCode));
            yh2.F(xq2Var, ix0.h);
            yh2.K(xq2Var, ix0.d, E);
            if (((Boolean) xq2Var.j(q83.a)).booleanValue()) {
                xq2Var.b0(1660904686);
                i13.a(q60.F(), null, dj6.i(x64Var, 0.5f * f2), F.i, xq2Var, 48, 0);
                xq2Var = xq2Var;
                xq2Var.p(false);
            } else {
                xq2Var.b0(1661038110);
                x23 x23Var = new x23((Context) xq2Var.j(kf.b));
                x23Var.c = str;
                x23Var.b(true);
                gi2.a(x23Var.a(), dj6.c, kj2.R(xq2Var, R.drawable.ic_trophy), kj2.R(xq2Var, R.drawable.ic_trophy), xq2Var, 37296);
                xq2Var.p(false);
            }
            xq2Var.p(true);
        } else {
            xq2Var.V();
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new fq1(str, f2, i2, 2);
        }
    }

    public static final void b(o6 o6Var, boolean z, on2 on2Var, px0 px0Var, int i2) {
        int i3;
        int i4;
        boolean z2;
        xq2 xq2Var;
        o75 o75Var;
        URL url;
        float f2;
        iy0 iy0Var;
        String l;
        long j2;
        d40 d40Var;
        o75 o75Var2;
        sr2 sr2Var;
        iy0 iy0Var2;
        pn pnVar;
        pn pnVar2;
        pn pnVar3;
        ne neVar;
        pn pnVar4;
        du duVar;
        es7 es7Var;
        float f3;
        iy0 iy0Var3;
        float f4;
        o6Var.getClass();
        on2Var.getClass();
        xq2 xq2Var2 = (xq2) px0Var;
        xq2Var2.d0(476282129);
        if (xq2Var2.f(o6Var)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i5 = i2 | i3;
        if (xq2Var2.g(z)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i6 = i5 | i4;
        if ((i6 & 147) != 146) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (xq2Var2.S(i6 & 1, z2)) {
            es7 F = bl2.F(xq2Var2);
            o75 a2 = o6Var.a();
            boolean C = C(o6Var);
            vr4 I = I(o6Var);
            Object P = xq2Var2.P();
            vs0 vs0Var = ox0.a;
            if (P == vs0Var) {
                P = new x7(23, on2Var);
                xq2Var2.l0(P);
            }
            ge7.b(false, (on2) P, xq2Var2, 0, 1);
            lc2 lc2Var = dj6.c;
            long c2 = hv.c(3859285769L);
            jy2 jy2Var = u24.m;
            a74 L = vy7.L(lc2Var, c2, jy2Var);
            Object P2 = xq2Var2.P();
            if (P2 == vs0Var) {
                P2 = new m01(5, on2Var);
                xq2Var2.l0(P2);
            }
            a74 B = u24.B(L, (qn2) P2);
            Object P3 = xq2Var2.P();
            if (P3 == vs0Var) {
                P3 = i61.f(xq2Var2);
            }
            r94 r94Var = (r94) P3;
            Object P4 = xq2Var2.P();
            if (P4 == vs0Var) {
                P4 = new x7(24, on2Var);
                xq2Var2.l0(P4);
            }
            a74 t = mb3.t(B, r94Var, null, false, null, (on2) P4, 28);
            e34 d2 = h70.d(d90.Z, false);
            int hashCode = Long.hashCode(xq2Var2.T);
            xv4 l2 = xq2Var2.l();
            a74 E = E(xq2Var2, t);
            jx0.i.getClass();
            iy0 iy0Var4 = ix0.b;
            xq2Var2.f0();
            if (xq2Var2.S) {
                xq2Var2.k(iy0Var4);
            } else {
                xq2Var2.o0();
            }
            pn pnVar5 = ix0.f;
            yh2.K(xq2Var2, pnVar5, d2);
            pn pnVar6 = ix0.e;
            yh2.K(xq2Var2, pnVar6, l2);
            Integer valueOf = Integer.valueOf(hashCode);
            pn pnVar7 = ix0.g;
            yh2.K(xq2Var2, pnVar7, valueOf);
            ne neVar2 = ix0.h;
            yh2.F(xq2Var2, neVar2);
            pn pnVar8 = ix0.d;
            yh2.K(xq2Var2, pnVar8, E);
            c40 c40Var = d90.l0;
            x64 x64Var = x64.a;
            a74 g2 = u24.g(dj6.m(400.0f, 1, ge7.O(x64Var, 24.0f)), z16.b(18.0f));
            long j3 = F.c;
            long j4 = F.i;
            long j5 = F.l;
            a74 I2 = ak7.I(vy7.L(g2, j3, jy2Var), 1.0f, F.f, z16.b(18.0f));
            Object P5 = xq2Var2.P();
            if (P5 == vs0Var) {
                P5 = i61.f(xq2Var2);
            }
            r94 r94Var2 = (r94) P5;
            Object P6 = xq2Var2.P();
            if (P6 == vs0Var) {
                P6 = new c5(17);
                xq2Var2.l0(P6);
            }
            a74 P7 = ge7.P(mb3.t(I2, r94Var2, null, false, null, (on2) P6, 28), 22.0f, 22.0f);
            yt0 a3 = wt0.a(ju.c, c40Var, xq2Var2, 48);
            int hashCode2 = Long.hashCode(xq2Var2.T);
            xv4 l3 = xq2Var2.l();
            a74 E2 = E(xq2Var2, P7);
            xq2Var2.f0();
            if (xq2Var2.S) {
                xq2Var2.k(iy0Var4);
            } else {
                xq2Var2.o0();
            }
            yh2.K(xq2Var2, pnVar5, a3);
            yh2.K(xq2Var2, pnVar6, l3);
            i61.w(hashCode2, xq2Var2, pnVar7, xq2Var2, neVar2);
            yh2.K(xq2Var2, pnVar8, E2);
            if (C) {
                o75Var = a2;
                url = o75Var.j;
            } else {
                o75Var = a2;
                url = o75Var.k;
            }
            String url2 = url.toString();
            url2.getClass();
            a(url2, 84.0f, xq2Var2, 48);
            gi2.h(xq2Var2, dj6.e(x64Var, 14.0f));
            d40 d40Var2 = d90.i0;
            du duVar2 = ju.a;
            l26 a4 = k26.a(duVar2, d40Var2, xq2Var2, 48);
            int hashCode3 = Long.hashCode(xq2Var2.T);
            xv4 l4 = xq2Var2.l();
            o75 o75Var3 = o75Var;
            a74 E3 = E(xq2Var2, x64Var);
            xq2Var2.f0();
            if (xq2Var2.S) {
                xq2Var2.k(iy0Var4);
            } else {
                xq2Var2.o0();
            }
            yh2.K(xq2Var2, pnVar5, a4);
            yh2.K(xq2Var2, pnVar6, l4);
            i61.w(hashCode3, xq2Var2, pnVar7, xq2Var2, neVar2);
            yh2.K(xq2Var2, pnVar8, E3);
            String a5 = o75Var3.a();
            long j6 = F.g;
            pi2 pi2Var = qs7.a;
            long E4 = hi2.E(17);
            oj2 oj2Var = oj2.e0;
            if (1.0f <= 0.0d) {
                n53.a("invalid weight; must be greater than zero");
            }
            if (1.0f > Float.MAX_VALUE) {
                f2 = Float.MAX_VALUE;
            } else {
                f2 = 1.0f;
            }
            long j7 = j4;
            x37.b(a5, new vn3(f2, false), j6, E4, oj2Var, pi2Var, 0L, new wz6(3), 0L, 0, false, 0, 0, null, null, xq2Var2, 1772544, 0, 130448);
            if (o75Var3.m == n75.UNOFFICIAL) {
                xq2Var2.b0(925545895);
                gi2.h(xq2Var2, dj6.l(x64Var, 8.0f));
                e(xq2Var2, 0);
                xq2Var2.p(false);
            } else {
                xq2Var2.b0(925647761);
                xq2Var2.p(false);
            }
            xq2Var2.p(true);
            gi2.h(xq2Var2, dj6.e(x64Var, 8.0f));
            l26 a6 = k26.a(duVar2, d40Var2, xq2Var2, 48);
            int hashCode4 = Long.hashCode(xq2Var2.T);
            xv4 l5 = xq2Var2.l();
            a74 E5 = E(xq2Var2, x64Var);
            xq2Var2.f0();
            if (xq2Var2.S) {
                iy0Var = iy0Var4;
                xq2Var2.k(iy0Var);
            } else {
                iy0Var = iy0Var4;
                xq2Var2.o0();
            }
            yh2.K(xq2Var2, pnVar5, a6);
            yh2.K(xq2Var2, pnVar6, l5);
            i61.w(hashCode4, xq2Var2, pnVar7, xq2Var2, neVar2);
            yh2.K(xq2Var2, pnVar8, E5);
            if (C) {
                l = i61.l(xq2Var2, 1857402206, R.string.retro_achievements_unlocked, xq2Var2, false);
            } else {
                l = i61.l(xq2Var2, 1857499360, R.string.retro_achievements_locked, xq2Var2, false);
            }
            a74 g3 = u24.g(dj6.i(x64Var, 7.0f), z16.a());
            if (C) {
                j2 = j5;
            } else {
                j2 = j7;
            }
            h70.a(vy7.L(g3, j2, jy2Var), xq2Var2, 0);
            gi2.h(xq2Var2, dj6.l(x64Var, 6.0f));
            Locale locale = Locale.ROOT;
            String upperCase = l.toUpperCase(locale);
            upperCase.getClass();
            if (C) {
                j7 = j5;
            }
            sr2 sr2Var2 = qs7.c;
            long D = hi2.D(9.5d);
            iy0 iy0Var5 = iy0Var;
            oj2 oj2Var2 = oj2.d0;
            x37.b(upperCase, null, j7, D, oj2Var2, sr2Var2, hi2.D(0.6d), null, 0L, 0, false, 0, 0, null, null, xq2Var2, 14355456, 0, 130834);
            gi2.h(xq2Var2, dj6.l(x64Var, 10.0f));
            String g4 = lb1.g(o75Var3.h, "· ");
            long j8 = es7.p;
            x37.b(g4, null, j8, hi2.D(9.5d), oj2Var2, sr2Var2, 0L, null, 0L, 0, false, 0, 0, null, null, xq2Var2, 1772928, 0, 130962);
            gi2.h(xq2Var2, dj6.l(x64Var, 3.0f));
            String upperCase2 = yh2.O(xq2Var2, R.string.points).toUpperCase(locale);
            upperCase2.getClass();
            x37.b(upperCase2, null, j8, hi2.E(8), null, sr2Var2, 0L, null, 0L, 0, false, 0, 0, null, null, xq2Var2, 1576320, 0, 130994);
            xq2Var2.p(true);
            gi2.h(xq2Var2, dj6.e(x64Var, 14.0f));
            es7 es7Var2 = F;
            x37.b(o75Var3.g, null, F.h, hi2.E(13), null, null, 0L, new wz6(3), hi2.E(19), 0, false, 0, 0, null, null, xq2Var2, 3072, 6, 129522);
            xq2 xq2Var3 = xq2Var2;
            if (I != null) {
                Object obj = I.A;
                Object obj2 = I.B;
                xq2Var3.b0(157436200);
                gi2.h(xq2Var3, dj6.e(x64Var, 16.0f));
                a74 c3 = dj6.c(x64Var, 1.0f);
                l26 a7 = k26.a(duVar2, d40Var2, xq2Var3, 48);
                int hashCode5 = Long.hashCode(xq2Var3.T);
                xv4 l6 = xq2Var3.l();
                a74 E6 = E(xq2Var3, c3);
                xq2Var3.f0();
                if (xq2Var3.S) {
                    iy0Var3 = iy0Var5;
                    xq2Var3.k(iy0Var3);
                } else {
                    iy0Var3 = iy0Var5;
                    xq2Var3.o0();
                }
                yh2.K(xq2Var3, pnVar5, a7);
                yh2.K(xq2Var3, pnVar6, l6);
                i61.w(hashCode5, xq2Var3, pnVar7, xq2Var3, neVar2);
                yh2.K(xq2Var3, pnVar8, E6);
                o75Var2 = o75Var3;
                if (1.0f <= 0.0d) {
                    n53.a("invalid weight; must be greater than zero");
                }
                if (1.0f > Float.MAX_VALUE) {
                    f4 = Float.MAX_VALUE;
                } else {
                    f4 = 1.0f;
                }
                a74 L2 = vy7.L(u24.g(dj6.e(new vn3(f4, true), 6.0f), z16.b(3.0f)), es7Var2.d, jy2Var);
                e34 d3 = h70.d(d90.L, false);
                d40Var = d40Var2;
                int hashCode6 = Long.hashCode(xq2Var3.T);
                xv4 l7 = xq2Var3.l();
                a74 E7 = E(xq2Var3, L2);
                xq2Var3.f0();
                if (xq2Var3.S) {
                    xq2Var3.k(iy0Var3);
                } else {
                    xq2Var3.o0();
                }
                yh2.K(xq2Var3, pnVar5, d3);
                yh2.K(xq2Var3, pnVar6, l7);
                i61.w(hashCode6, xq2Var3, pnVar7, xq2Var3, neVar2);
                yh2.K(xq2Var3, pnVar8, E7);
                int intValue = ((Number) obj2).intValue();
                float f5 = RecyclerView.B1;
                if (intValue != 0) {
                    f5 = gi2.p(((Number) obj).intValue() / ((Number) obj2).floatValue(), RecyclerView.B1, 1.0f);
                }
                h70.a(vy7.L(u24.g(dj6.e(dj6.c(x64Var, f5), 6.0f), z16.b(3.0f)), j5, jy2Var), xq2Var3, 0);
                xq2Var3.p(true);
                gi2.h(xq2Var3, dj6.l(x64Var, 10.0f));
                es7Var2 = es7Var2;
                pnVar3 = pnVar7;
                sr2Var = sr2Var2;
                iy0Var2 = iy0Var3;
                pnVar4 = pnVar8;
                neVar = neVar2;
                duVar = duVar2;
                pnVar = pnVar5;
                pnVar2 = pnVar6;
                x37.b(yh2.N(R.string.achievement_progress, new Object[]{obj, obj2}, xq2Var3), null, es7Var2.i, hi2.E(10), null, sr2Var, 0L, null, 0L, 0, false, 0, 0, null, null, xq2Var3, 1575936, 0, 130994);
                xq2Var3 = xq2Var3;
                xq2Var3.p(true);
                xq2Var3.p(false);
            } else {
                d40Var = d40Var2;
                o75Var2 = o75Var3;
                sr2Var = sr2Var2;
                iy0Var2 = iy0Var5;
                pnVar = pnVar5;
                pnVar2 = pnVar6;
                pnVar3 = pnVar7;
                neVar = neVar2;
                pnVar4 = pnVar8;
                duVar = duVar2;
                xq2Var3.b0(158709525);
                xq2Var3.p(false);
            }
            if (z) {
                xq2Var3.b0(158756707);
                gi2.h(xq2Var3, dj6.e(x64Var, 12.0f));
                xq2 xq2Var4 = xq2Var3;
                es7Var = es7Var2;
                f3 = 12.0f;
                x37.b(yh2.O(xq2Var3, R.string.offline_ra_in_ledger_badge), null, es7Var2.l, hi2.E(10), oj2Var2, sr2Var, 0L, null, 0L, 0, false, 0, 0, null, null, xq2Var4, 1772544, 0, 130962);
                xq2Var3 = xq2Var4;
                xq2Var3.p(false);
            } else {
                es7Var = es7Var2;
                f3 = 12.0f;
                xq2Var3.b0(159112277);
                xq2Var3.p(false);
            }
            if (o75Var2.b()) {
                xq2Var3.b0(159178555);
                gi2.h(xq2Var3, dj6.e(x64Var, f3));
                l26 a8 = k26.a(duVar, d40Var, xq2Var3, 48);
                int hashCode7 = Long.hashCode(xq2Var3.T);
                xv4 l8 = xq2Var3.l();
                a74 E8 = E(xq2Var3, x64Var);
                xq2Var3.f0();
                if (xq2Var3.S) {
                    xq2Var3.k(iy0Var2);
                } else {
                    xq2Var3.o0();
                }
                yh2.K(xq2Var3, pnVar, a8);
                yh2.K(xq2Var3, pnVar2, l8);
                i61.w(hashCode7, xq2Var3, pnVar3, xq2Var3, neVar);
                yh2.K(xq2Var3, pnVar4, E8);
                i13.b(kj2.R(xq2Var3, R.drawable.ic_status_warn), null, dj6.i(x64Var, 15.0f), j8, xq2Var3, 3512, 0);
                gi2.h(xq2Var3, dj6.l(x64Var, 6.0f));
                xq2 xq2Var5 = xq2Var3;
                x37.b(yh2.O(xq2Var3, R.string.achievement_missable_description), null, es7Var.i, hi2.E(11), null, null, 0L, null, hi2.E(15), 0, false, 0, 0, null, null, xq2Var5, 3072, 6, 130034);
                xq2Var3 = xq2Var5;
                xq2Var3.p(true);
                xq2Var3.p(false);
            } else {
                xq2Var3.b0(159910837);
                xq2Var3.p(false);
            }
            gi2.h(xq2Var3, dj6.e(x64Var, 18.0f));
            xq2 xq2Var6 = xq2Var3;
            is7.a(hf.b0(new rq2("B", yh2.O(xq2Var3, R.string.pause_hint_back))), null, false, xq2Var6, RendererDebugBridge.CAPTURE_HEIGHT, 2);
            xq2Var = xq2Var6;
            xq2Var.p(true);
            xq2Var.p(true);
        } else {
            xq2Var = xq2Var2;
            xq2Var.V();
        }
        cf5 t2 = xq2Var.t();
        if (t2 != null) {
            t2.d = new k91(o6Var, z, on2Var, i2, 2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00b5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void c(a74 a74Var, long j2, float f2, px0 px0Var, final int i2, final int i3) {
        int i4;
        int i5;
        int i6;
        boolean z;
        final float f3;
        float f4;
        int i7;
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(-1249392198);
        int i8 = i3 & 1;
        if (i8 != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            if (xq2Var.f(a74Var)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i4 = i5 | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            if ((i3 & 2) == 0 && xq2Var.e(j2)) {
                i7 = 32;
            } else {
                i7 = 16;
            }
            i4 |= i7;
        }
        int i9 = i3 & 4;
        if (i9 != 0) {
            i4 |= RendererDebugBridge.CAPTURE_HEIGHT;
        } else if ((i2 & RendererDebugBridge.CAPTURE_HEIGHT) == 0) {
            if (xq2Var.c(f2)) {
                i6 = 256;
            } else {
                i6 = 128;
            }
            i4 |= i6;
        }
        int i10 = i4 | 3072;
        if ((i10 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (xq2Var.S(i10 & 1, z)) {
            xq2Var.X();
            int i11 = i2 & 1;
            x64 x64Var = x64.a;
            if (i11 != 0 && !xq2Var.B()) {
                xq2Var.V();
            } else {
                if (i8 != 0) {
                    a74Var = x64Var;
                }
                if ((i3 & 2) != 0) {
                    j2 = kt0.c(0.12f, ((ut0) xq2Var.j(vt0.a)).f());
                }
                if (i9 != 0) {
                    f3 = 1.0f;
                    xq2Var.q();
                    if (!om1.b(f3, RecyclerView.B1)) {
                        xq2Var.b0(-455979798);
                        f4 = 1.0f / ((qh1) xq2Var.j(ky0.h)).a();
                        xq2Var.p(false);
                    } else {
                        xq2Var.b0(-455913241);
                        xq2Var.p(false);
                        f4 = f3;
                    }
                    h70.a(vy7.L(dj6.e(dj6.c(a74Var.d(x64Var), 1.0f), f4), j2, u24.m), xq2Var, 0);
                }
            }
            f3 = f2;
            xq2Var.q();
            if (!om1.b(f3, RecyclerView.B1)) {
            }
            h70.a(vy7.L(dj6.e(dj6.c(a74Var.d(x64Var), 1.0f), f4), j2, u24.m), xq2Var, 0);
        } else {
            xq2Var.V();
            f3 = f2;
        }
        final a74 a74Var2 = a74Var;
        final long j3 = j2;
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new eo2() { // from class: pl1
                @Override // defpackage.eo2
                public final Object o(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    l.c(a74.this, j3, f3, (px0) obj, ii2.a0(i2 | 1), i3);
                    return jg7.a;
                }
            };
        }
    }

    public static final void d(final pq5 pq5Var, final String str, final cu5 cu5Var, final j06 j06Var, final oi4 oi4Var, final on2 on2Var, final qn2 qn2Var, final qn2 qn2Var2, final on2 on2Var2, final eo2 eo2Var, final on2 on2Var3, final qn2 qn2Var3, final on2 on2Var4, final on2 on2Var5, final on2 on2Var6, final qn2 qn2Var4, final eo2 eo2Var2, px0 px0Var, final int i2) {
        xq2 xq2Var;
        pq5Var.getClass();
        cu5Var.getClass();
        j06Var.getClass();
        oi4Var.getClass();
        on2Var.getClass();
        qn2Var.getClass();
        qn2Var2.getClass();
        on2Var2.getClass();
        eo2Var.getClass();
        on2Var3.getClass();
        qn2Var3.getClass();
        on2Var4.getClass();
        on2Var5.getClass();
        on2Var6.getClass();
        xq2 xq2Var2 = (xq2) px0Var;
        xq2Var2.d0(-344528107);
        int i3 = i2 | (xq2Var2.h(pq5Var) ? 4 : 2) | (xq2Var2.f(str) ? 32 : 16) | (xq2Var2.f(cu5Var) ? 2048 : 1024) | (xq2Var2.f(j06Var) ? 16384 : 8192) | (xq2Var2.f(oi4Var) ? 131072 : 65536) | (xq2Var2.h(on2Var) ? 1048576 : 524288) | (xq2Var2.h(qn2Var) ? 8388608 : 4194304) | (xq2Var2.h(qn2Var2) ? 67108864 : 33554432) | (xq2Var2.h(on2Var2) ? 536870912 : 268435456);
        int i4 = (xq2Var2.h(eo2Var) ? (char) 4 : (char) 2) | (xq2Var2.h(on2Var3) ? ' ' : (char) 16) | (xq2Var2.h(qn2Var3) ? 256 : 128) | (xq2Var2.h(on2Var4) ? 2048 : 1024) | (xq2Var2.h(on2Var5) ? 16384 : 8192) | (xq2Var2.h(on2Var6) ? (char) 0 : (char) 0) | (xq2Var2.h(qn2Var4) ? (char) 0 : (char) 0) | (xq2Var2.h(eo2Var2) ? (char) 0 : (char) 0);
        if (xq2Var2.S(i3 & 1, ((i3 & 306783379) == 306783378 && (i4 & 4793491) == 4793490) ? false : true)) {
            final es7 F = bl2.F(xq2Var2);
            int tabIndex = vv5.CONFIG.getTabIndex();
            Object P = xq2Var2.P();
            vs0 vs0Var = ox0.a;
            if (P == vs0Var) {
                P = new kt5(1);
                xq2Var2.l0(P);
            }
            on2 on2Var7 = (on2) P;
            or4 or4Var = pr4.a;
            Object[] objArr = new Object[0];
            ap3 ap3Var = ue1.G;
            boolean c2 = xq2Var2.c(RecyclerView.B1);
            Object P2 = xq2Var2.P();
            if (c2 || P2 == vs0Var) {
                P2 = new mz2(tabIndex, on2Var7);
                xq2Var2.l0(P2);
            }
            final ue1 ue1Var = (ue1) qo2.J(objArr, ap3Var, (on2) P2, xq2Var2, 0);
            ue1Var.F.setValue(on2Var7);
            Integer valueOf = Integer.valueOf(ue1Var.k());
            boolean f2 = ((i4 & 3670016) == 1048576) | xq2Var2.f(ue1Var) | ((i4 & 29360128) == 8388608);
            Object P3 = xq2Var2.P();
            if (f2 || P3 == vs0Var) {
                P3 = new ag(ue1Var, qn2Var4, eo2Var2, null, 13);
                xq2Var2.l0(P3);
            }
            mb3.i(xq2Var2, (eo2) P3, valueOf);
            Object P4 = xq2Var2.P();
            if (P4 == vs0Var) {
                P4 = new nh2();
                xq2Var2.l0(P4);
            }
            final nh2 nh2Var = (nh2) P4;
            Object P5 = xq2Var2.P();
            if (P5 == vs0Var) {
                int a2 = ((l0) vv5.getEntries()).a();
                ArrayList arrayList = new ArrayList(a2);
                for (int i5 = 0; i5 < a2; i5++) {
                    arrayList.add(new nh2());
                }
                xq2Var2.l0(arrayList);
                P5 = arrayList;
            }
            List list = (List) P5;
            Object P6 = xq2Var2.P();
            if (P6 == vs0Var) {
                P6 = mb3.w(xq2Var2);
                xq2Var2.l0(P6);
            }
            w61 w61Var = (w61) P6;
            boolean f3 = xq2Var2.f(w61Var) | xq2Var2.f(ue1Var);
            Object P7 = xq2Var2.P();
            if (f3 || P7 == vs0Var) {
                P7 = new t00(w61Var, ue1Var, list, 21);
                xq2Var2.l0(P7);
            }
            final qn2 qn2Var5 = (qn2) P7;
            boolean z = ft7.b(xq2Var2, 1).a.a >= 600;
            boolean f4 = xq2Var2.f(ue1Var) | xq2Var2.f(qn2Var5) | ((i3 & 29360128) == 8388608) | xq2Var2.h(pq5Var);
            Object P8 = xq2Var2.P();
            if (f4 || P8 == vs0Var) {
                P8 = new uv5(ue1Var, qn2Var5, qn2Var, pq5Var);
                xq2Var2.l0(P8);
            }
            a74 B = u24.B(x64.a, (qn2) P8);
            xq2Var = xq2Var2;
            final zv0 I = n16.I(577548834, new n73(ue1Var, list, pq5Var, cu5Var, qn2Var2, on2Var2, eo2Var2, j06Var, oi4Var, eo2Var, on2Var3, qn2Var3, on2Var4, qn2Var4), xq2Var);
            long j2 = F.b;
            a74 d2 = dj6.c.d(B);
            final boolean z2 = z;
            ej2.c(d2, null, j2, 0L, RecyclerView.B1, n16.I(2020246609, new eo2() { // from class: rv5
                @Override // defpackage.eo2
                public final Object o(Object obj, Object obj2) {
                    boolean z3;
                    e40 e40Var;
                    xq2 xq2Var3;
                    int i6;
                    pn pnVar;
                    rk7 rk7Var = nc1.o;
                    px0 px0Var2 = (px0) obj;
                    int intValue = ((Integer) obj2).intValue();
                    e40 e40Var2 = d90.L;
                    c40 c40Var = d90.k0;
                    if ((intValue & 3) != 2) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    xq2 xq2Var4 = (xq2) px0Var2;
                    if (xq2Var4.S(intValue & 1, z3)) {
                        boolean z4 = z2;
                        nh2 nh2Var2 = nh2Var;
                        pq5 pq5Var2 = pq5Var;
                        String str2 = str;
                        qn2 qn2Var6 = qn2Var;
                        on2 on2Var8 = on2Var;
                        on2 on2Var9 = on2Var5;
                        on2 on2Var10 = on2Var6;
                        ue1 ue1Var2 = ue1Var;
                        qn2 qn2Var7 = qn2Var5;
                        zv0 zv0Var = I;
                        eu euVar = ju.c;
                        vs0 vs0Var2 = ox0.a;
                        if (z4) {
                            xq2Var4.b0(-209932436);
                            lc2 lc2Var = dj6.c;
                            a74 j0 = nc1.j0(lc2Var, rk7Var);
                            l26 a3 = k26.a(ju.a, d90.h0, xq2Var4, 0);
                            int hashCode = Long.hashCode(xq2Var4.T);
                            xv4 l = xq2Var4.l();
                            a74 E = l.E(xq2Var4, j0);
                            jx0.i.getClass();
                            iy0 iy0Var = ix0.b;
                            xq2Var4.f0();
                            if (xq2Var4.S) {
                                xq2Var4.k(iy0Var);
                            } else {
                                xq2Var4.o0();
                            }
                            pn pnVar2 = ix0.f;
                            yh2.K(xq2Var4, pnVar2, a3);
                            pn pnVar3 = ix0.e;
                            yh2.K(xq2Var4, pnVar3, l);
                            Integer valueOf2 = Integer.valueOf(hashCode);
                            pn pnVar4 = ix0.g;
                            yh2.K(xq2Var4, pnVar4, valueOf2);
                            ne neVar = ix0.h;
                            yh2.F(xq2Var4, neVar);
                            pn pnVar5 = ix0.d;
                            yh2.K(xq2Var4, pnVar5, E);
                            boolean f5 = xq2Var4.f(qn2Var6) | xq2Var4.h(pq5Var2);
                            Object P9 = xq2Var4.P();
                            if (!f5 && P9 != vs0Var2) {
                                pnVar = pnVar3;
                            } else {
                                pnVar = pnVar3;
                                P9 = new yu5(qn2Var6, pq5Var2, 1);
                                xq2Var4.l0(P9);
                            }
                            on2 on2Var11 = (on2) P9;
                            nh2Var2 = nh2Var2;
                            pn pnVar6 = pnVar;
                            hf.m(pq5Var2, str2, nh2Var2, on2Var11, on2Var8, on2Var9, on2Var10, null, xq2Var4, 3072);
                            xq2Var3 = xq2Var4;
                            a74 L = vy7.L(lc2Var, F.b, u24.m);
                            yt0 a4 = wt0.a(euVar, c40Var, xq2Var3, 0);
                            int hashCode2 = Long.hashCode(xq2Var3.T);
                            xv4 l2 = xq2Var3.l();
                            a74 E2 = l.E(xq2Var3, L);
                            xq2Var3.f0();
                            if (xq2Var3.S) {
                                xq2Var3.k(iy0Var);
                            } else {
                                xq2Var3.o0();
                            }
                            yh2.K(xq2Var3, pnVar2, a4);
                            yh2.K(xq2Var3, pnVar6, l2);
                            i61.w(hashCode2, xq2Var3, pnVar4, xq2Var3, neVar);
                            yh2.K(xq2Var3, pnVar5, E2);
                            hf.l((vv5) ((u52) vv5.getEntries()).get(ue1Var2.k()), qn2Var7, null, xq2Var3, 0);
                            a74 c3 = dj6.c(new vn3(1.0f, true), 1.0f);
                            e34 d3 = h70.d(e40Var2, false);
                            int hashCode3 = Long.hashCode(xq2Var3.T);
                            xv4 l3 = xq2Var3.l();
                            a74 E3 = l.E(xq2Var3, c3);
                            xq2Var3.f0();
                            if (xq2Var3.S) {
                                xq2Var3.k(iy0Var);
                            } else {
                                xq2Var3.o0();
                            }
                            yh2.K(xq2Var3, pnVar2, d3);
                            yh2.K(xq2Var3, pnVar6, l3);
                            i61.w(hashCode3, xq2Var3, pnVar4, xq2Var3, neVar);
                            yh2.K(xq2Var3, pnVar5, E3);
                            zv0Var.e(ge7.i(3, RecyclerView.B1), xq2Var3, 54);
                            xq2Var3.p(true);
                            xq2Var3.p(true);
                            xq2Var3.p(true);
                            xq2Var3.p(false);
                            i6 = 1;
                        } else {
                            xq2Var4.b0(-208939754);
                            lc2 lc2Var2 = dj6.c;
                            yt0 a5 = wt0.a(euVar, c40Var, xq2Var4, 0);
                            int hashCode4 = Long.hashCode(xq2Var4.T);
                            xv4 l4 = xq2Var4.l();
                            a74 E4 = l.E(xq2Var4, lc2Var2);
                            jx0.i.getClass();
                            iy0 iy0Var2 = ix0.b;
                            xq2Var4.f0();
                            if (xq2Var4.S) {
                                xq2Var4.k(iy0Var2);
                            } else {
                                xq2Var4.o0();
                            }
                            pn pnVar7 = ix0.f;
                            yh2.K(xq2Var4, pnVar7, a5);
                            pn pnVar8 = ix0.e;
                            yh2.K(xq2Var4, pnVar8, l4);
                            Integer valueOf3 = Integer.valueOf(hashCode4);
                            pn pnVar9 = ix0.g;
                            yh2.K(xq2Var4, pnVar9, valueOf3);
                            ne neVar2 = ix0.h;
                            yh2.F(xq2Var4, neVar2);
                            pn pnVar10 = ix0.d;
                            yh2.K(xq2Var4, pnVar10, E4);
                            boolean f6 = xq2Var4.f(qn2Var6) | xq2Var4.h(pq5Var2);
                            Object P10 = xq2Var4.P();
                            if (!f6 && P10 != vs0Var2) {
                                e40Var = e40Var2;
                            } else {
                                e40Var = e40Var2;
                                P10 = new yu5(qn2Var6, pq5Var2, 2);
                                xq2Var4.l0(P10);
                            }
                            hf.n(pq5Var2, str2, nh2Var2, (on2) P10, on2Var8, on2Var9, on2Var10, nc1.j0(x64.a, rk7Var), xq2Var4, 3072);
                            xq2Var3 = xq2Var4;
                            hf.l((vv5) ((u52) vv5.getEntries()).get(ue1Var2.k()), qn2Var7, null, xq2Var3, 0);
                            a74 c4 = dj6.c(new vn3(1.0f, true), 1.0f);
                            e34 d4 = h70.d(e40Var, false);
                            int hashCode5 = Long.hashCode(xq2Var3.T);
                            xv4 l5 = xq2Var3.l();
                            a74 E5 = l.E(xq2Var3, c4);
                            xq2Var3.f0();
                            if (xq2Var3.S) {
                                xq2Var3.k(iy0Var2);
                            } else {
                                xq2Var3.o0();
                            }
                            yh2.K(xq2Var3, pnVar7, d4);
                            yh2.K(xq2Var3, pnVar8, l5);
                            i61.w(hashCode5, xq2Var3, pnVar9, xq2Var3, neVar2);
                            yh2.K(xq2Var3, pnVar10, E5);
                            zv0Var.e(ge7.i(3, RecyclerView.B1), xq2Var3, 54);
                            i6 = 1;
                            i61.y(xq2Var3, true, true, false);
                        }
                        Object P11 = xq2Var3.P();
                        if (P11 == vs0Var2) {
                            P11 = new jr5(nh2Var2, null, i6);
                            xq2Var3.l0(P11);
                        }
                        mb3.i(xq2Var3, (eo2) P11, nh2Var2);
                    } else {
                        xq2Var4.V();
                    }
                    return jg7.a;
                }
            }, xq2Var), xq2Var, 1572864, 58);
        } else {
            xq2Var = xq2Var2;
            xq2Var.V();
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new eo2(str, cu5Var, j06Var, oi4Var, on2Var, qn2Var, qn2Var2, on2Var2, eo2Var, on2Var3, qn2Var3, on2Var4, on2Var5, on2Var6, qn2Var4, eo2Var2, i2) { // from class: sv5
                public final /* synthetic */ String B;
                public final /* synthetic */ cu5 L;
                public final /* synthetic */ j06 R;
                public final /* synthetic */ oi4 X;
                public final /* synthetic */ on2 Y;
                public final /* synthetic */ qn2 Z;
                public final /* synthetic */ qn2 d0;
                public final /* synthetic */ on2 e0;
                public final /* synthetic */ eo2 f0;
                public final /* synthetic */ on2 g0;
                public final /* synthetic */ qn2 h0;
                public final /* synthetic */ on2 i0;
                public final /* synthetic */ on2 j0;
                public final /* synthetic */ on2 k0;
                public final /* synthetic */ qn2 l0;
                public final /* synthetic */ eo2 m0;

                @Override // defpackage.eo2
                public final Object o(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int a0 = ii2.a0(385);
                    l.d(pq5.this, this.B, this.L, this.R, this.X, this.Y, this.Z, this.d0, this.e0, this.f0, this.g0, this.h0, this.i0, this.j0, this.k0, this.l0, this.m0, (px0) obj, a0);
                    return jg7.a;
                }
            };
        }
    }

    public static final void e(px0 px0Var, int i2) {
        boolean z;
        xq2 xq2Var;
        xq2 xq2Var2 = (xq2) px0Var;
        xq2Var2.d0(1016375248);
        if (i2 != 0) {
            z = true;
        } else {
            z = false;
        }
        if (xq2Var2.S(i2 & 1, z)) {
            String upperCase = yh2.O(xq2Var2, R.string.retro_achievements_unofficial).toUpperCase(Locale.ROOT);
            upperCase.getClass();
            long j2 = es7.p;
            sr2 sr2Var = qs7.c;
            xq2Var = xq2Var2;
            x37.b(upperCase, ge7.P(ak7.I(x64.a, 1.0f, j2, z16.b(4.0f)), 5.0f, 1.0f), j2, hi2.D(7.5d), oj2.d0, sr2Var, hi2.D(0.5d), null, 0L, 0, false, 0, 0, null, null, xq2Var, 14355840, 0, 130832);
        } else {
            xq2Var = xq2Var2;
            xq2Var.V();
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new z17(i2, 7);
        }
    }

    public static final void f(a74 a74Var, o6 o6Var, boolean z, on2 on2Var, qn2 qn2Var, px0 px0Var, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z2;
        boolean z3;
        boolean z4;
        eo2 agVar;
        vr4 vr4Var;
        Boolean bool;
        qa4 qa4Var;
        int i7;
        long j2;
        URL url;
        long j3;
        x64 x64Var;
        x64 x64Var2;
        boolean z5;
        iy0 iy0Var;
        a74Var.getClass();
        on2Var.getClass();
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(1705091830);
        if (xq2Var.f(o6Var)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i8 = i2 | i3;
        if (xq2Var.g(z)) {
            i4 = 256;
        } else {
            i4 = 128;
        }
        int i9 = i8 | i4;
        if (xq2Var.h(on2Var)) {
            i5 = 2048;
        } else {
            i5 = 1024;
        }
        int i10 = i9 | i5;
        if (xq2Var.h(qn2Var)) {
            i6 = 16384;
        } else {
            i6 = 8192;
        }
        int i11 = i10 | i6;
        if ((i11 & 9363) != 9362) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (xq2Var.S(i11 & 1, z2)) {
            es7 F = bl2.F(xq2Var);
            o75 a2 = o6Var.a();
            boolean C = C(o6Var);
            vr4 I = I(o6Var);
            Object P = xq2Var.P();
            vs0 vs0Var = ox0.a;
            if (P == vs0Var) {
                P = i61.f(xq2Var);
            }
            r94 r94Var = (r94) P;
            qa4 a3 = bw7.a(r94Var, xq2Var, 6);
            y16 b2 = z16.b(13.0f);
            Boolean bool2 = (Boolean) a3.getValue();
            bool2.getClass();
            boolean f2 = xq2Var.f(a3);
            if ((i11 & 57344) == 16384) {
                z3 = true;
            } else {
                z3 = false;
            }
            boolean z6 = f2 | z3;
            if ((i11 & 112) == 32) {
                z4 = true;
            } else {
                z4 = false;
            }
            boolean z7 = z4 | z6;
            Object P2 = xq2Var.P();
            if (!z7 && P2 != vs0Var) {
                agVar = P2;
                vr4Var = I;
                bool = bool2;
                qa4Var = a3;
                i7 = 0;
            } else {
                vr4Var = I;
                bool = bool2;
                qa4Var = a3;
                i7 = 0;
                agVar = new ag(qn2Var, o6Var, qa4Var, null, 16);
                xq2Var.l0(agVar);
            }
            mb3.i(xq2Var, agVar, bool);
            a74 g2 = u24.g(a74Var, b2);
            if (((Boolean) qa4Var.getValue()).booleanValue()) {
                j2 = F.e;
            } else {
                j2 = F.d;
            }
            jy2 jy2Var = u24.m;
            a74 L = vy7.L(g2, j2, jy2Var);
            if (((Boolean) qa4Var.getValue()).booleanValue()) {
                L = ak7.I(L, 2.0f, F.j, b2);
            }
            a74 P3 = ge7.P(mb3.t(L, r94Var, null, false, null, on2Var, 28), 13.0f, 11.0f);
            d40 d40Var = d90.h0;
            du duVar = ju.a;
            l26 a4 = k26.a(duVar, d40Var, xq2Var, i7);
            int hashCode = Long.hashCode(xq2Var.T);
            xv4 l = xq2Var.l();
            a74 E = E(xq2Var, P3);
            jx0.i.getClass();
            iy0 iy0Var2 = ix0.b;
            xq2Var.f0();
            if (xq2Var.S) {
                xq2Var.k(iy0Var2);
            } else {
                xq2Var.o0();
            }
            pn pnVar = ix0.f;
            yh2.K(xq2Var, pnVar, a4);
            pn pnVar2 = ix0.e;
            yh2.K(xq2Var, pnVar2, l);
            Integer valueOf = Integer.valueOf(hashCode);
            pn pnVar3 = ix0.g;
            yh2.K(xq2Var, pnVar3, valueOf);
            ne neVar = ix0.h;
            yh2.F(xq2Var, neVar);
            pn pnVar4 = ix0.d;
            yh2.K(xq2Var, pnVar4, E);
            if (C) {
                url = a2.j;
            } else {
                url = a2.k;
            }
            String url2 = url.toString();
            url2.getClass();
            a(url2, 42.0f, xq2Var, 48);
            x64 x64Var3 = x64.a;
            gi2.h(xq2Var, dj6.l(x64Var3, 12.0f));
            n26 n26Var = n26.a;
            a74 b3 = n26Var.b(x64Var3, 1.0f, true);
            yt0 a5 = wt0.a(ju.c, d90.k0, xq2Var, 0);
            int hashCode2 = Long.hashCode(xq2Var.T);
            xv4 l2 = xq2Var.l();
            a74 E2 = E(xq2Var, b3);
            xq2Var.f0();
            if (xq2Var.S) {
                xq2Var.k(iy0Var2);
            } else {
                xq2Var.o0();
            }
            yh2.K(xq2Var, pnVar, a5);
            yh2.K(xq2Var, pnVar2, l2);
            i61.w(hashCode2, xq2Var, pnVar3, xq2Var, neVar);
            yh2.K(xq2Var, pnVar4, E2);
            d40 d40Var2 = d90.i0;
            l26 a6 = k26.a(duVar, d40Var2, xq2Var, 48);
            int hashCode3 = Long.hashCode(xq2Var.T);
            xv4 l3 = xq2Var.l();
            a74 E3 = E(xq2Var, x64Var3);
            xq2Var.f0();
            if (xq2Var.S) {
                xq2Var.k(iy0Var2);
            } else {
                xq2Var.o0();
            }
            yh2.K(xq2Var, pnVar, a6);
            yh2.K(xq2Var, pnVar2, l3);
            i61.w(hashCode3, xq2Var, pnVar3, xq2Var, neVar);
            yh2.K(xq2Var, pnVar4, E3);
            String a7 = a2.a();
            if (C) {
                j3 = F.g;
            } else {
                j3 = F.h;
            }
            long E4 = hi2.E(13);
            oj2 oj2Var = oj2.d0;
            x37.b(a7, n26Var.b(x64Var3, 1.0f, false), j3, E4, oj2Var, null, 0L, null, 0L, 2, false, 1, 0, null, null, xq2Var, 199680, 3120, 120784);
            if (a2.m == n75.UNOFFICIAL) {
                xq2Var.b0(-727011164);
                gi2.h(xq2Var, dj6.l(x64Var3, 8.0f));
                e(xq2Var, 0);
                xq2Var.p(false);
            } else {
                xq2Var.b0(-726909298);
                xq2Var.p(false);
            }
            if (a2.b()) {
                xq2Var.b0(-726850212);
                gi2.h(xq2Var, dj6.l(x64Var3, 6.0f));
                i13.b(kj2.R(xq2Var, R.drawable.ic_status_warn), yh2.O(xq2Var, R.string.achievement_missable), dj6.i(x64Var3, 13.0f), es7.p, xq2Var, 3464, 0);
                xq2Var.p(false);
            } else {
                xq2Var.b0(-726463890);
                xq2Var.p(false);
            }
            xq2Var.p(true);
            x37.b(a2.g, ge7.S(x64Var3, RecyclerView.B1, 2.0f, RecyclerView.B1, RecyclerView.B1, 13), F.i, hi2.D(11.5d), null, null, 0L, null, hi2.E(16), 2, false, 2, 0, null, null, xq2Var, 3120, 3126, 119792);
            xq2 xq2Var2 = xq2Var;
            if (z) {
                xq2Var2.b0(987614771);
                x64Var = x64Var3;
                x37.b(yh2.O(xq2Var2, R.string.offline_ra_in_ledger_badge), ge7.S(x64Var3, RecyclerView.B1, 3.0f, RecyclerView.B1, RecyclerView.B1, 13), F.l, hi2.E(9), oj2Var, qs7.c, 0L, null, 0L, 0, false, 0, 0, null, null, xq2Var2, 1772592, 0, 130960);
                xq2Var2 = xq2Var2;
                xq2Var2.p(false);
            } else {
                x64Var = x64Var3;
                xq2Var2.b0(987965970);
                xq2Var2.p(false);
            }
            if (vr4Var != null) {
                Object obj = vr4Var.A;
                Object obj2 = vr4Var.B;
                xq2Var2.b0(988057265);
                x64 x64Var4 = x64Var;
                a74 S = ge7.S(x64Var4, RecyclerView.B1, 7.0f, RecyclerView.B1, RecyclerView.B1, 13);
                l26 a8 = k26.a(duVar, d40Var2, xq2Var2, 48);
                int hashCode4 = Long.hashCode(xq2Var2.T);
                xv4 l4 = xq2Var2.l();
                a74 E5 = E(xq2Var2, S);
                xq2Var2.f0();
                if (xq2Var2.S) {
                    iy0Var = iy0Var2;
                    xq2Var2.k(iy0Var);
                } else {
                    iy0Var = iy0Var2;
                    xq2Var2.o0();
                }
                yh2.K(xq2Var2, pnVar, a8);
                yh2.K(xq2Var2, pnVar2, l4);
                i61.w(hashCode4, xq2Var2, pnVar3, xq2Var2, neVar);
                yh2.K(xq2Var2, pnVar4, E5);
                a74 L2 = vy7.L(u24.g(dj6.e(n26Var.b(x64Var4, 1.0f, true), 4.0f), z16.b(2.0f)), F.e, jy2Var);
                e34 d2 = h70.d(d90.L, false);
                int hashCode5 = Long.hashCode(xq2Var2.T);
                xv4 l5 = xq2Var2.l();
                a74 E6 = E(xq2Var2, L2);
                xq2Var2.f0();
                if (xq2Var2.S) {
                    xq2Var2.k(iy0Var);
                } else {
                    xq2Var2.o0();
                }
                yh2.K(xq2Var2, pnVar, d2);
                yh2.K(xq2Var2, pnVar2, l5);
                i61.w(hashCode5, xq2Var2, pnVar3, xq2Var2, neVar);
                yh2.K(xq2Var2, pnVar4, E6);
                Number number = (Number) obj2;
                int intValue = number.intValue();
                float f3 = RecyclerView.B1;
                if (intValue != 0) {
                    f3 = gi2.p(((Number) obj).intValue() / number.floatValue(), RecyclerView.B1, 1.0f);
                }
                h70.a(vy7.L(u24.g(dj6.e(dj6.c(x64Var4, f3), 4.0f), z16.b(2.0f)), F.l, jy2Var), xq2Var2, 0);
                xq2Var2.p(true);
                gi2.h(xq2Var2, dj6.l(x64Var4, 9.0f));
                xq2 xq2Var3 = xq2Var2;
                x64Var2 = x64Var4;
                x37.b(yh2.N(R.string.achievement_progress, new Object[]{obj, obj2}, xq2Var2), null, F.i, hi2.E(9), null, qs7.c, 0L, null, 0L, 0, false, 0, 0, null, null, xq2Var3, 1575936, 0, 130994);
                xq2Var2 = xq2Var3;
                z5 = true;
                xq2Var2.p(true);
                xq2Var2.p(false);
            } else {
                x64Var2 = x64Var;
                z5 = true;
                xq2Var2.b0(989271442);
                xq2Var2.p(false);
            }
            xq2Var2.p(z5);
            gi2.h(xq2Var2, dj6.l(x64Var2, 10.0f));
            xq2 xq2Var4 = xq2Var2;
            x37.b(String.valueOf(a2.h), null, es7.p, hi2.D(10.5d), oj2Var, qs7.c, 0L, null, 0L, 0, false, 0, 0, null, null, xq2Var4, 1772928, 0, 130962);
            xq2Var = xq2Var4;
            xq2Var.p(true);
        } else {
            xq2Var.V();
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new si(a74Var, o6Var, z, on2Var, qn2Var, i2);
        }
    }

    public static final p04 g(Map map, jr6 jr6Var) {
        p04 p04Var = new p04();
        ArrayList arrayList = jr6Var.Z;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            ki0 ki0Var = (ki0) obj;
            Surface surface = (Surface) map.get(new kr6(ki0Var.a));
            if (surface != null) {
                ArrayList arrayList2 = ki0Var.b;
                int size2 = arrayList2.size();
                int i3 = 0;
                while (i3 < size2) {
                    Object obj2 = arrayList2.get(i3);
                    i3++;
                    p04Var.put(new gp4(((ir6) obj2).a), surface);
                }
            }
        }
        return p04Var.b();
    }

    public static final Bitmap h(zh zhVar) {
        if (zhVar instanceof zh) {
            return zhVar.a;
        }
        fa6.h("Unable to obtain android.graphics.Bitmap");
        return null;
    }

    public static final Object j(xg1 xg1Var, on2 on2Var, s41 s41Var) {
        o70 o70Var;
        eg4 e0;
        Object G;
        if0 if0Var;
        if (((z64) xg1Var).A.j0) {
            z64 z64Var = (z64) xg1Var;
            if (!z64Var.A.j0) {
                p53.c("visitAncestors called on an unattached node");
            }
            z64 z64Var2 = z64Var.A.X;
            sm3 f0 = nc1.f0(xg1Var);
            loop0: while (true) {
                o70Var = null;
                if (f0 == null) {
                    break;
                }
                if ((((z64) f0.B0.g).R & 524288) != 0) {
                    while (z64Var2 != null) {
                        if ((z64Var2.L & 524288) != 0) {
                            z64 z64Var3 = z64Var2;
                            ua4 ua4Var = null;
                            while (z64Var3 != null) {
                                if (z64Var3 instanceof o70) {
                                    o70Var = z64Var3;
                                    break loop0;
                                }
                                if ((z64Var3.L & 524288) != 0 && (z64Var3 instanceof zg1)) {
                                    int i2 = 0;
                                    for (z64 z64Var4 = ((zg1) z64Var3).l0; z64Var4 != null; z64Var4 = z64Var4.Y) {
                                        if ((z64Var4.L & 524288) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                z64Var3 = z64Var4;
                                            } else {
                                                if (ua4Var == null) {
                                                    ua4Var = new ua4(new z64[16]);
                                                }
                                                if (z64Var3 != null) {
                                                    ua4Var.b(z64Var3);
                                                    z64Var3 = null;
                                                }
                                                ua4Var.b(z64Var4);
                                            }
                                        }
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                z64Var3 = nc1.A(ua4Var);
                            }
                            continue;
                        }
                        z64Var2 = z64Var2.X;
                    }
                }
                f0 = f0.v();
                if (f0 != null && (if0Var = f0.B0) != null) {
                    z64Var2 = (vy6) if0Var.f;
                } else {
                    z64Var2 = null;
                }
            }
            o70 o70Var2 = o70Var;
            if (o70Var2 != null && (G = o70Var2.G((e0 = nc1.e0(xg1Var)), new le(2, on2Var, e0), s41Var)) == x61.COROUTINE_SUSPENDED) {
                return G;
            }
        }
        return jg7.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final cp4 k(kf0 kf0Var, jr6 jr6Var, Map map) {
        LinkedHashMap linkedHashMap;
        cp4 cp4Var;
        boolean z;
        String str;
        boolean z2;
        String str2;
        Surface surface;
        t23 t23Var;
        ki0 e2;
        kf0Var.getClass();
        String str3 = kf0Var.a;
        LinkedHashMap linkedHashMap2 = jr6Var.R;
        map.getClass();
        ArrayList arrayList = new ArrayList();
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        LinkedHashMap linkedHashMap4 = new LinkedHashMap();
        LinkedHashMap linkedHashMap5 = new LinkedHashMap();
        Iterator it = ((q04) jr6Var.X.entrySet()).iterator();
        do {
            int i2 = 1;
            cp4 cp4Var2 = null;
            if (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                int i3 = ((kr6) entry.getKey()).a;
                t23Var = (t23) entry.getValue();
                e2 = jr6Var.e(i3);
                if (e2 == null) {
                    i.m("Required value was null.");
                    return null;
                }
            } else {
                ArrayList arrayList2 = jr6Var.Z;
                int size = arrayList2.size();
                int i4 = 0;
                while (i4 < size) {
                    Object obj = arrayList2.get(i4);
                    i4++;
                    cp4 cp4Var3 = cp4Var2;
                    ki0 ki0Var = (ki0) obj;
                    ArrayList arrayList3 = ki0Var.b;
                    int i5 = ki0Var.a;
                    ArrayList arrayList4 = arrayList2;
                    if (arrayList3.size() == i2) {
                        Surface surface2 = (Surface) map.get(new kr6(i5));
                        if (surface2 != null) {
                            linkedHashMap4.put(new gp4(((ir6) gt0.b1(arrayList3)).a), surface2);
                        }
                        cp4Var2 = cp4Var3;
                        arrayList2 = arrayList4;
                    } else {
                        int size2 = arrayList3.size();
                        int i6 = 0;
                        while (i6 < size2) {
                            Object obj2 = arrayList3.get(i6);
                            i6++;
                            int i7 = size2;
                            ir6 ir6Var = (ir6) obj2;
                            Object obj3 = linkedHashMap2.get(ir6Var);
                            if (obj3 != null) {
                                LinkedHashMap linkedHashMap6 = linkedHashMap2;
                                OutputConfiguration outputConfiguration = (OutputConfiguration) linkedHashMap5.get((hr6) obj3);
                                if (outputConfiguration != null) {
                                    surface = outputConfiguration.getSurface();
                                } else {
                                    surface = (Surface) map.get(new kr6(i5));
                                }
                                if (surface != null) {
                                    linkedHashMap4.put(new gp4(ir6Var.a), surface);
                                    size = size;
                                }
                                size2 = i7;
                                linkedHashMap2 = linkedHashMap6;
                            } else {
                                i.m("Required value was null.");
                                return cp4Var3;
                            }
                        }
                        cp4Var2 = cp4Var3;
                        arrayList2 = arrayList4;
                        i2 = 1;
                    }
                }
                cp4 cp4Var4 = cp4Var2;
                Iterator it2 = jr6Var.L.iterator();
                cp4 cp4Var5 = cp4Var4;
                while (it2.hasNext()) {
                    hr6 hr6Var = (hr6) it2.next();
                    ArrayList arrayList5 = hr6Var.l;
                    ArrayList arrayList6 = hr6Var.l;
                    List list = hr6Var.k;
                    vs0 vs0Var = hr6Var.f;
                    Integer num = hr6Var.e;
                    Iterator it3 = it2;
                    String str4 = hr6Var.d;
                    ArrayList arrayList7 = new ArrayList();
                    int size3 = arrayList5.size();
                    int i8 = 0;
                    while (i8 < size3) {
                        Object obj4 = arrayList5.get(i8);
                        int i9 = i8 + 1;
                        int i10 = size3;
                        Surface surface3 = (Surface) map.get(new kr6(((ki0) obj4).a));
                        if (surface3 != null) {
                            arrayList7.add(surface3);
                        }
                        i8 = i9;
                        size3 = i10;
                    }
                    OutputConfiguration outputConfiguration2 = (OutputConfiguration) linkedHashMap5.get(hr6Var);
                    LinkedHashMap linkedHashMap7 = linkedHashMap5;
                    if (outputConfiguration2 != null) {
                        if (arrayList7.size() == arrayList5.size()) {
                            arrayList.add(new xi(outputConfiguration2));
                            linkedHashMap = linkedHashMap4;
                            cp4Var = cp4Var5;
                        } else {
                            ArrayList arrayList8 = new ArrayList();
                            int size4 = arrayList5.size();
                            int i11 = 0;
                            while (i11 < size4) {
                                Object obj5 = arrayList5.get(i11);
                                i11++;
                                if (!map.containsKey(new kr6(((ki0) obj5).a))) {
                                    arrayList8.add(obj5);
                                }
                            }
                            throw new IllegalStateException(("Surfaces are not yet available for " + hr6Var + "! Missing surfaces for " + arrayList8 + '!').toString());
                        }
                    } else {
                        int i12 = -1;
                        if (vs0Var != null) {
                            linkedHashMap = linkedHashMap4;
                            cp4Var = cp4Var5;
                            if (arrayList7.size() != arrayList5.size()) {
                                Size size5 = hr6Var.b;
                                rp4 rp4Var = hr6Var.g;
                                qp4 qp4Var = hr6Var.h;
                                sp4 sp4Var = hr6Var.i;
                                if (arrayList6.size() > 1) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                if (num != null) {
                                    i12 = num.intValue();
                                }
                                int i13 = i12;
                                if (!nb3.k(str4, str3)) {
                                    str2 = str4;
                                } else {
                                    str2 = cp4Var4;
                                }
                                xi q = cs1.q(null, null, vs0Var, rp4Var, qp4Var, sp4Var, list, size5, z2, i13, str2, 2);
                                if (q == null) {
                                    Log.w("CXCP", "Failed to create AndroidOutputConfiguration for " + hr6Var);
                                } else {
                                    arrayList.add(q);
                                    int size6 = arrayList5.size();
                                    int i14 = 0;
                                    while (i14 < size6) {
                                        Object obj6 = arrayList5.get(i14);
                                        i14++;
                                        linkedHashMap3.put(new kr6(((ki0) obj6).a), q);
                                    }
                                }
                            }
                        } else {
                            linkedHashMap = linkedHashMap4;
                            cp4Var = cp4Var5;
                        }
                        if (arrayList7.size() == arrayList5.size()) {
                            Surface surface4 = (Surface) gt0.H0(arrayList7);
                            rp4 rp4Var2 = hr6Var.g;
                            qp4 qp4Var2 = hr6Var.h;
                            sp4 sp4Var2 = hr6Var.i;
                            Size size7 = hr6Var.b;
                            if (arrayList6.size() > 1) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (num != null) {
                                i12 = num.intValue();
                            }
                            int i15 = i12;
                            if (!nb3.k(str4, str3)) {
                                str = str4;
                            } else {
                                str = cp4Var4;
                            }
                            xi q2 = cs1.q(surface4, null, null, rp4Var2, qp4Var2, sp4Var2, list, size7, z, i15, str, 6);
                            if (q2 == 0) {
                                Log.w("CXCP", "Failed to create AndroidOutputConfiguration for " + hr6Var);
                            } else {
                                for (Surface surface5 : gt0.D0(arrayList7, 1)) {
                                    q2.a(surface5);
                                }
                                ji0 ji0Var = kf0Var.e;
                                if (ji0Var != null) {
                                    ki0 ki0Var2 = (ki0) jr6Var.B.get(ji0Var);
                                    if (ki0Var2 != null) {
                                        if (cp4Var == null && arrayList5.contains(ki0Var2)) {
                                            cp4Var5 = q2;
                                            it2 = it3;
                                            linkedHashMap5 = linkedHashMap7;
                                            linkedHashMap4 = linkedHashMap;
                                        } else {
                                            arrayList.add(q2);
                                        }
                                    } else {
                                        i.m("Postview Stream in StreamGraph cannot be null for reprocessing request");
                                        return cp4Var4;
                                    }
                                } else {
                                    arrayList.add(q2);
                                }
                                it2 = it3;
                                linkedHashMap5 = linkedHashMap7;
                                linkedHashMap4 = linkedHashMap;
                                cp4Var5 = cp4Var;
                            }
                        } else {
                            ArrayList arrayList9 = new ArrayList();
                            int size8 = arrayList5.size();
                            int i16 = 0;
                            while (i16 < size8) {
                                Object obj7 = arrayList5.get(i16);
                                i16++;
                                if (!map.containsKey(new kr6(((ki0) obj7).a))) {
                                    arrayList9.add(obj7);
                                }
                            }
                            throw new IllegalStateException(("Surfaces are not yet available for " + hr6Var + "! Missing surfaces for " + arrayList9 + '!').toString());
                        }
                    }
                    it2 = it3;
                    linkedHashMap5 = linkedHashMap7;
                    linkedHashMap4 = linkedHashMap;
                    cp4Var5 = cp4Var;
                }
                return new cp4(arrayList, linkedHashMap3, cp4Var5, linkedHashMap4);
            }
        } while (e2.b.size() == 1);
        if (Build.VERSION.SDK_INT < 31) {
            i.h("Cannot configure multiple outputs pre-S!");
            return null;
        }
        gh5.a(ui.class);
        t23Var.getClass();
        throw null;
    }

    public static final boolean l(ArrayList arrayList) {
        List list;
        long j2;
        if (arrayList.size() >= 2) {
            if (arrayList.size() <= 1) {
                list = yt1.A;
            } else {
                ArrayList arrayList2 = new ArrayList();
                Object obj = arrayList.get(0);
                int size = arrayList.size() - 1;
                int i2 = 0;
                while (i2 < size) {
                    i2++;
                    Object obj2 = arrayList.get(i2);
                    xa6 xa6Var = (xa6) obj2;
                    xa6 xa6Var2 = (xa6) obj;
                    arrayList2.add(new jk4((Float.floatToRawIntBits(Math.abs(Float.intBitsToFloat((int) (xa6Var2.g().b() >> 32)) - Float.intBitsToFloat((int) (xa6Var.g().b() >> 32)))) << 32) | (Float.floatToRawIntBits(Math.abs(Float.intBitsToFloat((int) (xa6Var2.g().b() & 4294967295L)) - Float.intBitsToFloat((int) (xa6Var.g().b() & 4294967295L)))) & 4294967295L)));
                    obj = obj2;
                }
                list = arrayList2;
            }
            if (list.size() == 1) {
                j2 = ((jk4) gt0.H0(list)).a;
            } else {
                if (list.isEmpty()) {
                    ex3.c("Empty collection can't be reduced.");
                }
                Object H0 = gt0.H0(list);
                int size2 = list.size() - 1;
                if (1 <= size2) {
                    int i3 = 1;
                    while (true) {
                        H0 = new jk4(jk4.f(((jk4) H0).a, ((jk4) list.get(i3)).a));
                        if (i3 == size2) {
                            break;
                        }
                        i3++;
                    }
                }
                j2 = ((jk4) H0).a;
            }
            if (Float.intBitsToFloat((int) (4294967295L & j2)) >= Float.intBitsToFloat((int) (j2 >> 32))) {
                return false;
            }
        }
        return true;
    }

    public static boolean m(l21 l21Var) {
        m21 m21Var;
        boolean z;
        boolean z2;
        k21 k21Var;
        k21 k21Var2;
        k21[] k21VarArr = l21Var.T;
        k21 k21Var3 = k21VarArr[0];
        k21 k21Var4 = k21VarArr[1];
        l21 l21Var2 = l21Var.U;
        if (l21Var2 != null) {
            m21Var = (m21) l21Var2;
        } else {
            m21Var = null;
        }
        if (m21Var != null) {
            k21 k21Var5 = m21Var.T[0];
            k21 k21Var6 = k21.FIXED;
        }
        if (m21Var != null) {
            k21 k21Var7 = m21Var.T[1];
            k21 k21Var8 = k21.FIXED;
        }
        k21 k21Var9 = k21.FIXED;
        if (k21Var3 != k21Var9 && !l21Var.B() && k21Var3 != k21.WRAP_CONTENT && ((k21Var3 != (k21Var2 = k21.MATCH_CONSTRAINT) || l21Var.r != 0 || l21Var.X != RecyclerView.B1 || !l21Var.u(0)) && (k21Var3 != k21Var2 || l21Var.r != 1 || !l21Var.v(0, l21Var.r())))) {
            z = false;
        } else {
            z = true;
        }
        if (k21Var4 != k21Var9 && !l21Var.C() && k21Var4 != k21.WRAP_CONTENT && ((k21Var4 != (k21Var = k21.MATCH_CONSTRAINT) || l21Var.s != 0 || l21Var.X != RecyclerView.B1 || !l21Var.u(1)) && (k21Var4 != k21Var || l21Var.s != 1 || !l21Var.v(1, l21Var.l())))) {
            z2 = false;
        } else {
            z2 = true;
        }
        if ((l21Var.X <= RecyclerView.B1 || (!z && !z2)) && (!z || !z2)) {
            return false;
        }
        return true;
    }

    public static final byte n(char c2) {
        if (c2 < '~') {
            return mm0.b[c2];
        }
        return (byte) 0;
    }

    public static int o(int i2) {
        int i3 = (i2 & (~(i2 >> 31))) - 255;
        return (i3 & (i3 >> 31)) + 255;
    }

    public static a74 p(a74 a74Var, fo2 fo2Var) {
        return a74Var.d(new nx0(fo2Var));
    }

    public static int r(boolean z, String str, int i2, int i3) {
        boolean z2;
        while (i2 < i3) {
            char charAt = str.charAt(i2);
            if ((charAt >= ' ' || charAt == '\t') && charAt < 127 && (('0' > charAt || charAt >= ':') && (('a' > charAt || charAt >= '{') && (('A' > charAt || charAt >= '[') && charAt != ':')))) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (z2 == (!z)) {
                return i2;
            }
            i2++;
        }
        return i3;
    }

    public static String s(Context context, Uri uri) {
        String substring;
        context.getClass();
        if (uri != null) {
            String uri2 = uri.toString();
            uri2.getClass();
            int t0 = qs6.t0(uri2, "://", 0, false, 6);
            if (t0 == -1) {
                substring = null;
            } else {
                l93 R = gi2.R(0, t0);
                R.getClass();
                substring = uri2.substring(R.A, R.B + 1);
            }
            if (nb3.k(substring, "content")) {
                boolean isDocumentUri = DocumentsContract.isDocumentUri(context, uri);
                try {
                    if (isDocumentUri) {
                        return t(context, uri);
                    }
                    return u(context, DocumentsContract.buildDocumentUriUsingTree(uri, DocumentsContract.getTreeDocumentId(uri)));
                } catch (Exception unused) {
                    if (isDocumentUri) {
                        return zl1.g(context, uri).i();
                    }
                    return zl1.h(context, uri).i();
                }
            } else if (nb3.k(substring, "file")) {
                String uri3 = uri.toString();
                uri3.getClass();
                return uri3.substring(qs6.t0(uri3, "://", 0, false, 6) + 3);
            }
        }
        return null;
    }

    public static String t(Context context, Uri uri) {
        context.getClass();
        uri.getClass();
        try {
            ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r");
            if (openFileDescriptor != null) {
                int fd = openFileDescriptor.getFd();
                String readlink = Os.readlink(new File("/proc/self/fd/" + fd).getAbsolutePath());
                openFileDescriptor.close();
                return readlink;
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0183  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String u(Context context, Uri uri) {
        String str;
        char c2;
        String str2;
        String str3;
        Method method;
        boolean booleanValue;
        boolean z;
        String absolutePath;
        Object[] objArr = null;
        Object[] objArr2 = null;
        if (uri == null) {
            Log.w("FileUtils", "getAbsolutePathFromTreeUri: called with treeUri == null");
            return null;
        }
        String treeDocumentId = DocumentsContract.getTreeDocumentId(uri);
        treeDocumentId.getClass();
        boolean z2 = false;
        String[] strArr = (String[]) qs6.K0(treeDocumentId, new String[]{":"}, 6).toArray(new String[0]);
        if (strArr.length == 0) {
            str = null;
        } else {
            str = strArr[0];
        }
        if (str == null) {
            return null;
        }
        try {
        } catch (Exception e2) {
            e = e2;
            c2 = 1;
        }
        if ("home".equals(str)) {
            Log.v("FileUtils", "getVolumePath: isHomeVolume");
            absolutePath = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOCUMENTS).getAbsolutePath();
        } else if ("downloads".equals(str)) {
            Log.v("FileUtils", "getVolumePath: isDownloadsVolume");
            absolutePath = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).getAbsolutePath();
        } else {
            Object systemService = context.getSystemService(StorageManager.class);
            systemService.getClass();
            StorageManager storageManager = (StorageManager) systemService;
            Class<?> cls = Class.forName("android.os.storage.StorageVolume");
            Method method2 = storageManager.getClass().getMethod("getVolumeList", null);
            Method method3 = cls.getMethod("getUuid", null);
            if (Build.VERSION.SDK_INT >= 30) {
                method = cls.getMethod("getDirectory", null);
            } else {
                method = cls.getMethod("getPath", null);
            }
            Method method4 = cls.getMethod("isPrimary", null);
            Object invoke = method2.invoke(storageManager, null);
            invoke.getClass();
            int length = Array.getLength(invoke);
            int i2 = 0;
            while (i2 < length) {
                Object obj = Array.get(invoke, i2);
                String str4 = (String) method3.invoke(obj, objArr2);
                Object invoke2 = method4.invoke(obj, objArr2);
                invoke2.getClass();
                c2 = 1;
                try {
                    booleanValue = ((Boolean) invoke2).booleanValue();
                    if (booleanValue && "primary".equals(str)) {
                        z = true;
                    } else {
                        z = z2;
                    }
                    if (str4 != null && str4.equals(str)) {
                        z2 = true;
                    }
                } catch (Exception e3) {
                    e = e3;
                    objArr = objArr2;
                }
                try {
                    Log.d("FileUtils", "Found volume with uuid='" + str4 + "', volumeId='" + str + "', primary=" + booleanValue + ", isPrimaryVolume=" + z + ", isExternalVolume=" + z2);
                    if (!z && !z2) {
                        i2++;
                        objArr2 = null;
                        z2 = false;
                    }
                    Log.v("FileUtils", "getVolumePath: isPrimaryVolume || isExternalVolume");
                    if (Build.VERSION.SDK_INT >= 30) {
                        File file = (File) method.invoke(obj, null);
                        if (file != null) {
                            str2 = file.getAbsolutePath();
                        } else {
                            str2 = null;
                        }
                    } else {
                        str2 = (String) method.invoke(obj, null);
                    }
                } catch (Exception e4) {
                    e = e4;
                    objArr = null;
                    Log.w("FileUtils", "getVolumePath exception", e);
                    Log.e("FileUtils", "getVolumePath failed for volumeId='" + str + "'");
                    str2 = objArr;
                    if (str2 != null) {
                    }
                }
                if (str2 != null) {
                    return File.separator;
                }
                String str5 = File.separator;
                str5.getClass();
                boolean Y = xs6.Y(str2, str5, false);
                String str6 = str2;
                if (Y) {
                    str6 = str2.substring(0, str2.length() - 1);
                }
                String treeDocumentId2 = DocumentsContract.getTreeDocumentId(uri);
                treeDocumentId2.getClass();
                String[] strArr2 = (String[]) qs6.K0(treeDocumentId2, new String[]{":"}, 6).toArray(new String[0]);
                if (strArr2.length >= 2) {
                    str3 = strArr2[c2];
                } else {
                    str3 = str5;
                }
                str3.getClass();
                if (xs6.Y(str3, str5, false)) {
                    str3 = str3.substring(0, str3.length() - 1);
                }
                if (str3.length() > 0) {
                    if (xs6.g0(str3, str5, false)) {
                        return str6.concat(str3);
                    }
                    return lb1.m(str6, str5, str3);
                }
                return str6;
            }
            c2 = 1;
            str2 = "/storage/" + str;
            if (str2 != null) {
            }
        }
        c2 = 1;
        str2 = absolutePath;
        if (str2 != null) {
        }
    }

    public static Object v(Future future) {
        boolean isDone = future.isDone();
        np2.A("Future was expected to be done, " + future, isDone);
        return w(future);
    }

    public static Object w(Future future) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    /* JADX WARN: Type inference failed for: r10v16, types: [e30, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v8, types: [e30, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v11, types: [e30, java.lang.Object] */
    public static void y(int i2, p11 p11Var, l21 l21Var, boolean z) {
        boolean z2;
        h11 h11Var;
        h11 h11Var2;
        char c2;
        char c3;
        h11 h11Var3;
        h11 h11Var4;
        if (!l21Var.m) {
            if (!(l21Var instanceof m21) && l21Var.A() && m(l21Var)) {
                m21.W(l21Var, p11Var, new Object());
            }
            h11 j2 = l21Var.j(g11.LEFT);
            h11 j3 = l21Var.j(g11.RIGHT);
            int d2 = j2.d();
            int d3 = j3.d();
            HashSet hashSet = j2.a;
            if (hashSet != null && j2.c) {
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    h11 h11Var5 = (h11) it.next();
                    l21 l21Var2 = h11Var5.d;
                    int i3 = i2 + 1;
                    boolean m = m(l21Var2);
                    h11 h11Var6 = l21Var2.I;
                    h11 h11Var7 = l21Var2.K;
                    if (l21Var2.A() && m) {
                        c2 = 0;
                        m21.W(l21Var2, p11Var, new Object());
                    } else {
                        c2 = 0;
                    }
                    if ((h11Var5 == h11Var6 && (h11Var4 = h11Var7.f) != null && h11Var4.c) || (h11Var5 == h11Var7 && (h11Var3 = h11Var6.f) != null && h11Var3.c)) {
                        c3 = 1;
                    } else {
                        c3 = c2;
                    }
                    k21 k21Var = l21Var2.T[c2];
                    k21 k21Var2 = k21.MATCH_CONSTRAINT;
                    if (k21Var == k21Var2 && !m) {
                        if (k21Var == k21Var2 && l21Var2.v >= 0 && l21Var2.u >= 0 && (l21Var2.h0 == 8 || (l21Var2.r == 0 && l21Var2.X == RecyclerView.B1))) {
                            if (!l21Var2.y() && !l21Var2.F && c3 != 0 && !l21Var2.y()) {
                                O(i3, l21Var, p11Var, l21Var2, z);
                            }
                        }
                    } else if (!l21Var2.A()) {
                        if (h11Var5 == h11Var6 && h11Var7.f == null) {
                            int e2 = h11Var6.e() + d2;
                            l21Var2.K(e2, l21Var2.r() + e2);
                            y(i3, p11Var, l21Var2, z);
                        } else if (h11Var5 == h11Var7 && h11Var6.f == null) {
                            int e3 = d2 - h11Var7.e();
                            l21Var2.K(e3 - l21Var2.r(), e3);
                            y(i3, p11Var, l21Var2, z);
                        } else if (c3 != 0 && !l21Var2.y()) {
                            N(i3, p11Var, l21Var2, z);
                        }
                    }
                }
            }
            if (l21Var instanceof av2) {
                return;
            }
            HashSet hashSet2 = j3.a;
            if (hashSet2 != null && j3.c) {
                Iterator it2 = hashSet2.iterator();
                while (it2.hasNext()) {
                    h11 h11Var8 = (h11) it2.next();
                    l21 l21Var3 = h11Var8.d;
                    int i4 = i2 + 1;
                    boolean m2 = m(l21Var3);
                    h11 h11Var9 = l21Var3.I;
                    h11 h11Var10 = l21Var3.K;
                    if (l21Var3.A() && m2) {
                        m21.W(l21Var3, p11Var, new Object());
                    }
                    if ((h11Var8 == h11Var9 && (h11Var2 = h11Var10.f) != null && h11Var2.c) || (h11Var8 == h11Var10 && (h11Var = h11Var9.f) != null && h11Var.c)) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    k21 k21Var3 = l21Var3.T[0];
                    k21 k21Var4 = k21.MATCH_CONSTRAINT;
                    if (k21Var3 == k21Var4 && !m2) {
                        if (k21Var3 == k21Var4 && l21Var3.v >= 0 && l21Var3.u >= 0) {
                            if (l21Var3.h0 == 8 || (l21Var3.r == 0 && l21Var3.X == RecyclerView.B1)) {
                                if (!l21Var3.y() && !l21Var3.F && z2 && !l21Var3.y()) {
                                    O(i4, l21Var, p11Var, l21Var3, z);
                                }
                            }
                        }
                    } else if (!l21Var3.A()) {
                        if (h11Var8 == h11Var9 && h11Var10.f == null) {
                            int e4 = h11Var9.e() + d3;
                            l21Var3.K(e4, l21Var3.r() + e4);
                            y(i4, p11Var, l21Var3, z);
                        } else if (h11Var8 == h11Var10 && h11Var9.f == null) {
                            int e5 = d3 - h11Var10.e();
                            l21Var3.K(e5 - l21Var3.r(), e5);
                            y(i4, p11Var, l21Var3, z);
                        } else if (z2 && !l21Var3.y()) {
                            N(i4, p11Var, l21Var3, z);
                        }
                    }
                }
            }
            l21Var.m = true;
        }
    }

    public static n33 z(Object obj) {
        if (obj == null) {
            return n33.L;
        }
        return new n33(obj, 0);
    }

    public abstract void i(j36 j36Var, Object obj);

    public abstract String q();

    public void x(e36 e36Var, Object obj) {
        e36Var.getClass();
        if (obj == null) {
            return;
        }
        j36 i0 = e36Var.i0(q());
        try {
            i(i0, obj);
            i0.f0();
            lb4.p(i0, null);
            oi2.D(e36Var);
        } finally {
        }
    }
}
