package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Shader;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.MaterialToolbar;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.UUID;
import java.util.WeakHashMap;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import me.magnum.melonds.impl.emulator.debug.RendererDebugBridge;
import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: iq2  reason: default package */
/* loaded from: classes.dex */
public abstract class iq2 {
    public static final int[] a = {16842755, 16843041, 16843093, 16843097, 16843551, 16843754, 16843771, 16843778, 16843779};
    public static final int[] b = {16842755, 16843189, 16843190, 16843556, 16843557, 16843558, 16843866, 16843867};
    public static final int[] c = {16842755, 16843780, 16843781, 16843782, 16843783, 16843784, 16843785, 16843786, 16843787, 16843788, 16843789, 16843979, 16843980, 16844062};
    public static final int[] d = {16842755, 16843781};
    public static final et0 e = new et0(-1656469621, false, new xk0(21));
    public static final byte[] f = new byte[0];
    public static final is2 g = new is2(2);
    public static final o36 h = new o36(1);
    public static final so5 i = new so5(11);
    public static ax2 j;
    public static final /* synthetic */ int k = 0;
    public static final /* synthetic */ int l = 0;

    public static final int A(gy5 gy5Var, int i2) {
        int i3;
        int[] iArr = gy5Var.Y;
        int i4 = i2 + 1;
        int length = gy5Var.X.length;
        iArr.getClass();
        int i5 = length - 1;
        int i6 = 0;
        while (true) {
            if (i6 <= i5) {
                i3 = (i6 + i5) >>> 1;
                int i7 = iArr[i3];
                if (i7 < i4) {
                    i6 = i3 + 1;
                } else if (i7 <= i4) {
                    break;
                } else {
                    i5 = i3 - 1;
                }
            } else {
                i3 = (-i6) - 1;
                break;
            }
        }
        if (i3 >= 0) {
            return i3;
        }
        return ~i3;
    }

    public static boolean B(byte[] bArr, byte[] bArr2) {
        if (bArr2 != null && bArr.length >= bArr2.length) {
            for (int i2 = 0; i2 < bArr2.length; i2++) {
                if (bArr[i2] == bArr2[i2]) {
                }
            }
            return true;
        }
        return false;
    }

    public static final Shader.TileMode C(int i2) {
        Shader.TileMode tileMode;
        if (i2 == 0) {
            return Shader.TileMode.CLAMP;
        }
        if (i2 == 1) {
            return Shader.TileMode.REPEAT;
        }
        if (i2 == 2) {
            return Shader.TileMode.MIRROR;
        }
        if (i2 == 3) {
            if (Build.VERSION.SDK_INT >= 31) {
                tileMode = Shader.TileMode.DECAL;
                return tileMode;
            }
            return Shader.TileMode.CLAMP;
        }
        return Shader.TileMode.CLAMP;
    }

    public static String D(int i2) {
        if (i2 == 0) {
            return "Clear";
        }
        if (i2 == 1) {
            return "Src";
        }
        if (i2 == 2) {
            return "Dst";
        }
        if (i2 == 3) {
            return "SrcOver";
        }
        if (i2 == 4) {
            return "DstOver";
        }
        if (i2 == 5) {
            return "SrcIn";
        }
        if (i2 == 6) {
            return "DstIn";
        }
        if (i2 == 7) {
            return "SrcOut";
        }
        if (i2 == 8) {
            return "DstOut";
        }
        if (i2 == 9) {
            return "SrcAtop";
        }
        if (i2 == 10) {
            return "DstAtop";
        }
        if (i2 == 11) {
            return "Xor";
        }
        if (i2 == 12) {
            return "Plus";
        }
        if (i2 == 13) {
            return "Modulate";
        }
        if (i2 == 14) {
            return "Screen";
        }
        if (i2 == 15) {
            return "Overlay";
        }
        if (i2 == 16) {
            return "Darken";
        }
        if (i2 == 17) {
            return "Lighten";
        }
        if (i2 == 18) {
            return "ColorDodge";
        }
        if (i2 == 19) {
            return "ColorBurn";
        }
        if (i2 == 20) {
            return "HardLight";
        }
        if (i2 == 21) {
            return "Softlight";
        }
        if (i2 == 22) {
            return "Difference";
        }
        if (i2 == 23) {
            return "Exclusion";
        }
        if (i2 == 24) {
            return "Multiply";
        }
        if (i2 == 25) {
            return "Hue";
        }
        if (i2 == 26) {
            return "Saturation";
        }
        if (i2 == 27) {
            return "Color";
        }
        if (i2 == 28) {
            return "Luminosity";
        }
        return "Unknown";
    }

    public static final void a(j3 j3Var, tu0 tu0Var, int i2) {
        int i3;
        boolean z;
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.Z(-1852700408);
        if (sk2Var.h(j3Var)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i4 = i3 | i2;
        if ((i4 & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        if (sk2Var.O(i4 & 1, z)) {
            boolean h2 = sk2Var.h(j3Var);
            Object L = sk2Var.L();
            if (h2 || L == su0.a) {
                L = new a6(j3Var, null, 0);
                sk2Var.h0(L);
            }
            l.g(sk2Var, (aj2) L, j3Var);
            pu.a(b53.X(wy3.a, 8.0f), j3Var.a.j, j3Var.e, null, ct3.H0(-315922898, new km4(2, j3Var), sk2Var), sk2Var, 24582, 8);
        } else {
            sk2Var.R();
        }
        m55 r = sk2Var.r();
        if (r != null) {
            r.d = new z5(i2, 0, j3Var);
        }
    }

    public static final void b(pn0 pn0Var, tq5 tq5Var, tu0 tu0Var, int i2) {
        int i3;
        int i4;
        boolean z;
        int i5;
        pn0 pn0Var2 = pn0Var;
        tq5 tq5Var2 = tq5Var;
        pn0Var2.getClass();
        tq5Var2.getClass();
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.Z(1723248195);
        if (sk2Var.h(pn0Var2)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i6 = i2 | i3;
        if (sk2Var.f(tq5Var2)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i7 = i6 | i4;
        if ((i7 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (sk2Var.O(i7 & 1, z)) {
            String X = me2.X(sk2Var, R.string.enabled_cheats);
            l44 Q = ln2.Q(new k54[0], sk2Var);
            k24 l2 = me2.l(new o45(Q.b.z), null, null, sk2Var, 48, 2);
            boolean f2 = sk2Var.f((l34) l2.getValue());
            Object L = sk2Var.L();
            Object obj = su0.a;
            if (f2 || L == obj) {
                L = me2.q(new f4(l2, 13));
                sk2Var.h0(L);
            }
            ae6 ae6Var = (ae6) L;
            boolean f3 = sk2Var.f((l34) l2.getValue());
            Object L2 = sk2Var.L();
            if (f3 || L2 == obj) {
                L2 = me2.q(new p6(17, X, l2));
                sk2Var.h0(L2);
            }
            ae6 ae6Var2 = (ae6) L2;
            Resources resources = (Resources) sk2Var.j(ue.c);
            Object L3 = sk2Var.L();
            if (L3 == obj) {
                L3 = new r96();
                sk2Var.h0(L3);
            }
            r96 r96Var = (r96) L3;
            tu5 d2 = ru5.d(r96Var, sk2Var, 1);
            Object L4 = sk2Var.L();
            if (L4 == obj) {
                L4 = l.A(sk2Var);
                sk2Var.h0(L4);
            }
            o31 o31Var = (o31) L4;
            boolean h2 = sk2Var.h(Q) | sk2Var.h(pn0Var2);
            Object L5 = sk2Var.L();
            if (h2 || L5 == obj) {
                L5 = new p6(18, Q, pn0Var2);
                sk2Var.h0(L5);
            }
            ki2 ki2Var = (ki2) L5;
            boolean h3 = sk2Var.h(pn0Var2) | sk2Var.h(Q);
            Object L6 = sk2Var.L();
            if (h3 || L6 == obj) {
                L6 = new dn0(pn0Var2, Q, null, 0);
                sk2Var.h0(L6);
            }
            o27 o27Var = o27.a;
            l.g(sk2Var, (aj2) L6, o27Var);
            boolean h4 = sk2Var.h(pn0Var2) | sk2Var.h(Q);
            Object L7 = sk2Var.L();
            if (h4 || L7 == obj) {
                L7 = new dn0(pn0Var2, Q, null, 1);
                sk2Var.h0(L7);
            }
            l.g(sk2Var, (aj2) L7, o27Var);
            boolean h5 = sk2Var.h(pn0Var2) | sk2Var.h(Q);
            Object L8 = sk2Var.L();
            if (h5 || L8 == obj) {
                L8 = new dn0(pn0Var2, Q, null, 2);
                sk2Var.h0(L8);
            }
            l.g(sk2Var, (aj2) L8, o27Var);
            boolean h6 = sk2Var.h(pn0Var2) | sk2Var.h(Q);
            Object L9 = sk2Var.L();
            if (h6 || L9 == obj) {
                L9 = new dn0(pn0Var2, Q, null, 3);
                sk2Var.h0(L9);
            }
            l.g(sk2Var, (aj2) L9, o27Var);
            boolean f4 = sk2Var.f(ki2Var);
            Object L10 = sk2Var.L();
            if (!f4 && L10 != obj) {
                i5 = 1;
            } else {
                i5 = 1;
                L10 = new w7(1, ki2Var);
                sk2Var.h0(L10);
            }
            b53.d(false, (ki2) L10, sk2Var, 0, i5);
            s72 s72Var = o76.c;
            long j2 = mj2.C(sk2Var).b;
            WeakHashMap weakHashMap = dg7.w;
            tq5Var2 = tq5Var;
            pn0Var2 = pn0Var;
            ru5.b(hm1.n(sk2Var).l, s72Var, d2, ct3.H0(-1680009411, new p4(ki2Var, pn0Var2, ae6Var2, ae6Var, 2), sk2Var), dk7.a, null, null, 0, false, null, RecyclerView.A1, 0L, 0L, 0L, j2, 0L, ct3.H0(47562212, new qz(Q, tq5Var, pn0Var, o31Var, resources, r96Var, 1), sk2Var), sk2Var, 27696, 100663296, 196576);
            sk2Var = sk2Var;
        } else {
            sk2Var.R();
        }
        m55 r = sk2Var.r();
        if (r != null) {
            r.d = new s4(i2, 5, pn0Var2, tq5Var2);
        }
    }

    public static final g11 c(e31 e31Var) {
        if (e31Var.I(k45.d0) == null) {
            e31Var = e31Var.C(ln2.h());
        }
        return new g11(e31Var);
    }

    public static final void d(ki2 ki2Var, ff1 ff1Var, et0 et0Var, tu0 tu0Var, int i2) {
        int i3;
        boolean z;
        ff1 ff1Var2;
        int i4;
        int i5;
        ki2Var.getClass();
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.Z(1926476888);
        if ((i2 & 6) == 0) {
            if (sk2Var.h(ki2Var)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i3 = i5 | i2;
        } else {
            i3 = i2;
        }
        int i6 = i3 | 48;
        if ((i2 & RendererDebugBridge.CAPTURE_HEIGHT) == 0) {
            if (sk2Var.h(et0Var)) {
                i4 = 256;
            } else {
                i4 = 128;
            }
            i6 |= i4;
        }
        if ((i6 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (sk2Var.O(i6 & 1, z)) {
            ff1Var2 = new ff1(7);
            View view = (View) sk2Var.j(ue.f);
            qk2 k0 = dt3.k0(sk2Var);
            k24 L = me2.L(et0Var, sk2Var);
            k24 L2 = me2.L(ki2Var, sk2Var);
            Object[] objArr = new Object[0];
            Object L3 = sk2Var.L();
            sn1 sn1Var = su0.a;
            if (L3 == sn1Var) {
                L3 = new d5(27);
                sk2Var.h0(L3);
            }
            UUID uuid = (UUID) jk2.M(objArr, (ki2) L3, sk2Var, 48);
            Object L4 = sk2Var.L();
            ke1 ke1Var = L4;
            if (L4 == sn1Var) {
                uuid.getClass();
                ke1 ke1Var2 = new ke1(view, ff1Var2, uuid);
                et0 et0Var2 = new et0(-1782407382, true, new e4(L, 2));
                ke1Var2.setParentCompositionContext(k0);
                ke1Var2.m0.setValue(et0Var2);
                ke1Var2.l0 = true;
                ke1Var2.k0 = (ki2) L2.getValue();
                sk2Var.h0(ke1Var2);
                ke1Var = ke1Var2;
            }
            ke1 ke1Var3 = (ke1) ke1Var;
            boolean h2 = sk2Var.h(ke1Var3);
            Object L5 = sk2Var.L();
            if (h2 || L5 == sn1Var) {
                L5 = new he1(ke1Var3, 0);
                sk2Var.h0(L5);
            }
            l.d(ke1Var3, (mi2) L5, sk2Var);
        } else {
            sk2Var.R();
            ff1Var2 = ff1Var;
        }
        m55 r = sk2Var.r();
        if (r != null) {
            r.d = new fl(ki2Var, ff1Var2, et0Var, i2, 9);
        }
    }

    public static final void e(t2 t2Var, iz5 iz5Var) {
        ez5 ez5Var = iz5Var.d;
        d24 d24Var = ez5Var.A;
        Object g2 = ez5Var.A.g(mz5.z);
        w1 w1Var = null;
        if (g2 == null) {
            g2 = null;
        }
        og5 og5Var = (og5) g2;
        if (a53.k(iz5Var)) {
            if (og5Var == null || og5Var.a != 8) {
                Object g3 = d24Var.g(dz5.y);
                if (g3 == null) {
                    g3 = null;
                }
                w1 w1Var2 = (w1) g3;
                if (w1Var2 != null) {
                    t2Var.b(new n2(16908358, w1Var2.a));
                }
                Object g4 = d24Var.g(dz5.A);
                if (g4 == null) {
                    g4 = null;
                }
                w1 w1Var3 = (w1) g4;
                if (w1Var3 != null) {
                    t2Var.b(new n2(16908359, w1Var3.a));
                }
                Object g5 = d24Var.g(dz5.z);
                if (g5 == null) {
                    g5 = null;
                }
                w1 w1Var4 = (w1) g5;
                if (w1Var4 != null) {
                    t2Var.b(new n2(16908360, w1Var4.a));
                }
                Object g6 = d24Var.g(dz5.B);
                if (g6 != null) {
                    w1Var = g6;
                }
                w1 w1Var5 = w1Var;
                if (w1Var5 != null) {
                    t2Var.b(new n2(16908361, w1Var5.a));
                }
            }
        }
    }

    public static final void f(o31 o31Var, CancellationException cancellationException) {
        c63 c63Var = (c63) o31Var.w().I(k45.d0);
        if (c63Var != null) {
            c63Var.i(cancellationException);
        } else {
            f81.p(o31Var, "Scope cannot be cancelled because it does not have a job: ");
        }
    }

    public static void g(int i2) {
        if (2 <= i2 && i2 < 37) {
            return;
        }
        i.j(wh1.s("radix ", i2, " was not in valid range "), new b33(2, 36, 1));
    }

    public static final void h(AutoCloseable autoCloseable, Throwable th) {
        boolean isTerminated;
        if (autoCloseable != null) {
            if (th == null) {
                if (autoCloseable instanceof AutoCloseable) {
                    autoCloseable.close();
                    return;
                } else if (autoCloseable instanceof ExecutorService) {
                    ExecutorService executorService = (ExecutorService) autoCloseable;
                    if (executorService != ForkJoinPool.commonPool() && !(isTerminated = executorService.isTerminated())) {
                        executorService.shutdown();
                        boolean z = false;
                        while (!isTerminated) {
                            try {
                                isTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                            } catch (InterruptedException unused) {
                                if (!z) {
                                    executorService.shutdownNow();
                                    z = true;
                                }
                            }
                        }
                        if (z) {
                            Thread.currentThread().interrupt();
                            return;
                        }
                        return;
                    }
                    return;
                } else if (autoCloseable instanceof TypedArray) {
                    ((TypedArray) autoCloseable).recycle();
                    return;
                } else if (autoCloseable instanceof MediaMetadataRetriever) {
                    ((MediaMetadataRetriever) autoCloseable).release();
                    return;
                } else if (autoCloseable instanceof MediaDrm) {
                    ((MediaDrm) autoCloseable).release();
                    return;
                } else {
                    c44.r();
                    return;
                }
            }
            try {
                ej6.i(autoCloseable);
            } catch (Throwable th2) {
                pu.k(th, th2);
            }
        }
    }

    public static int i(Comparable comparable, Comparable comparable2) {
        if (comparable == comparable2) {
            return 0;
        }
        if (comparable == null) {
            return -1;
        }
        if (comparable2 == null) {
            return 1;
        }
        return comparable.compareTo(comparable2);
    }

    public static long[] j(Serializable serializable) {
        if (serializable instanceof int[]) {
            int[] iArr = (int[]) serializable;
            long[] jArr = new long[iArr.length];
            for (int i2 = 0; i2 < iArr.length; i2++) {
                jArr[i2] = iArr[i2];
            }
            return jArr;
        } else if (serializable instanceof long[]) {
            return (long[]) serializable;
        } else {
            return null;
        }
    }

    public static final Object k(aj2 aj2Var, j11 j11Var) {
        fv5 fv5Var = new fv5(j11Var, j11Var.a());
        Object T = ln2.T(fv5Var, true, fv5Var, aj2Var);
        p31 p31Var = p31.COROUTINE_SUSPENDED;
        return T;
    }

    public static qf1 l() {
        if (qf1.B != null) {
            return qf1.B;
        }
        synchronized (qf1.class) {
            try {
                if (qf1.B == null) {
                    qf1.B = new qf1(0);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return qf1.B;
    }

    public static final boolean m(char c2, char c3, boolean z) {
        if (c2 == c3) {
            return true;
        }
        if (!z) {
            return false;
        }
        char upperCase = Character.toUpperCase(c2);
        char upperCase2 = Character.toUpperCase(c3);
        if (upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2)) {
            return true;
        }
        return false;
    }

    public static ColorStateList n(Drawable drawable) {
        ColorStateList colorStateList;
        if (drawable instanceof ColorDrawable) {
            return ColorStateList.valueOf(((ColorDrawable) drawable).getColor());
        }
        if (Build.VERSION.SDK_INT >= 29 && v11.t(drawable)) {
            colorStateList = v11.e(drawable).getColorStateList();
            return colorStateList;
        }
        return null;
    }

    public static float o(tu0 tu0Var) {
        sk2 sk2Var = (sk2) tu0Var;
        long j2 = ((xq0) sk2Var.j(e01.a)).a;
        if (((hr0) sk2Var.j(ir0.a)).k()) {
            if (mh7.V(j2) > 0.5d) {
                return 1.0f;
            }
            return 0.87f;
        } else if (mh7.V(j2) < 0.5d) {
            return 1.0f;
        } else {
            return 0.87f;
        }
    }

    public static final Object p(mv3 mv3Var) {
        ff3 ff3Var;
        Object l2 = mv3Var.l();
        if (l2 instanceof ff3) {
            ff3Var = (ff3) l2;
        } else {
            ff3Var = null;
        }
        if (ff3Var == null) {
            return null;
        }
        return ff3Var.j0;
    }

    public static ArrayList q(MaterialToolbar materialToolbar, CharSequence charSequence) {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < materialToolbar.getChildCount(); i2++) {
            View childAt = materialToolbar.getChildAt(i2);
            if (childAt instanceof TextView) {
                TextView textView = (TextView) childAt;
                if (TextUtils.equals(textView.getText(), charSequence)) {
                    arrayList.add(textView);
                }
            }
        }
        return arrayList;
    }

    public static kr2 r() {
        if (kr2.L != null) {
            return kr2.L;
        }
        synchronized (kr2.class) {
            try {
                if (kr2.L == null) {
                    kr2.L = new kr2();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return kr2.L;
    }

    public static l22 s() {
        if (l22.L != null) {
            return l22.L;
        }
        synchronized (l22.class) {
            try {
                if (l22.L == null) {
                    l22.L = new l22();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return l22.L;
    }

    public static final boolean t(o31 o31Var) {
        c63 c63Var = (c63) o31Var.w().I(k45.d0);
        if (c63Var != null) {
            return c63Var.d();
        }
        return true;
    }

    public static boolean u(String str) {
        if (!"Connection".equalsIgnoreCase(str) && !"Keep-Alive".equalsIgnoreCase(str) && !"Proxy-Authenticate".equalsIgnoreCase(str) && !"Proxy-Authorization".equalsIgnoreCase(str) && !"TE".equalsIgnoreCase(str) && !"Trailers".equalsIgnoreCase(str) && !"Transfer-Encoding".equalsIgnoreCase(str) && !"Upgrade".equalsIgnoreCase(str)) {
            return true;
        }
        return false;
    }

    public static boolean v(char c2) {
        if (!Character.isWhitespace(c2) && !Character.isSpaceChar(c2)) {
            return false;
        }
        return true;
    }

    public static final zy3 w(String str) {
        return new ef3(str);
    }

    public static np2 x() {
        if (dt3.A != null) {
            return dt3.A;
        }
        synchronized (dt3.class) {
            try {
                if (dt3.A == null) {
                    dt3.A = new np2(new Handler(Looper.getMainLooper()));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return dt3.A;
    }

    public static final zy3 y(zy3 zy3Var, mi2 mi2Var) {
        return zy3Var.f(new xb2(mi2Var));
    }

    public static final zy3 z(zy3 zy3Var, mi2 mi2Var) {
        return zy3Var.f(new vc4(mi2Var));
    }
}
