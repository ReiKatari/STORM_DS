package defpackage;

import android.app.ActionBar;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.ExtractedText;
import android.window.BackEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.github.junrar.unpack.decode.Compress;
import com.stormds.emulator.R;
import java.lang.annotation.Annotation;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;
import me.magnum.melonds.impl.emulator.debug.RendererDebugBridge;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: uj2  reason: default package */
/* loaded from: classes.dex */
public abstract class uj2 implements kp7 {
    public static boolean a = false;
    public static Method b = null;
    public static boolean c = false;
    public static Field d;
    public static e33 e;
    public static final /* synthetic */ int f = 0;
    public static e33 g;

    public static final int A(int i, List list) {
        char c2;
        int size = list.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) >>> 1;
            yr4 yr4Var = (yr4) list.get(i3);
            if (yr4Var.d > i) {
                c2 = 1;
            } else if (yr4Var.e <= i) {
                c2 = 65535;
            } else {
                c2 = 0;
            }
            if (c2 < 0) {
                i2 = i3 + 1;
            } else if (c2 > 0) {
                size = i3 - 1;
            } else {
                return i3;
            }
        }
        return -(i2 + 1);
    }

    public static final int B(ArrayList arrayList, float f2) {
        char c2;
        if (f2 <= RecyclerView.B1) {
            return 0;
        }
        if (f2 >= ((yr4) gt0.Q0(arrayList)).g) {
            return arrayList.size() - 1;
        }
        int size = arrayList.size() - 1;
        int i = 0;
        while (i <= size) {
            int i2 = (i + size) >>> 1;
            yr4 yr4Var = (yr4) arrayList.get(i2);
            if (yr4Var.f > f2) {
                c2 = 1;
            } else if (yr4Var.g <= f2) {
                c2 = 65535;
            } else {
                c2 = 0;
            }
            if (c2 < 0) {
                i = i2 + 1;
            } else if (c2 > 0) {
                size = i2 - 1;
            } else {
                return i2;
            }
        }
        return -(i + 1);
    }

    public static final void C(ArrayList arrayList, long j, qn2 qn2Var) {
        int size = arrayList.size();
        for (int z = z(k47.f(j), arrayList); z < size; z++) {
            yr4 yr4Var = (yr4) arrayList.get(z);
            if (yr4Var.b < k47.e(j)) {
                if (yr4Var.b != yr4Var.c) {
                    qn2Var.g(yr4Var);
                }
            } else {
                return;
            }
        }
    }

    public static final boolean D(int i, ln lnVar, vh2 vh2Var, of5 of5Var) {
        if (b0(i, lnVar, vh2Var, of5Var)) {
            return true;
        }
        Boolean bool = (Boolean) nb3.X(vh2Var, i, new am4(((eh2) ((te) nc1.g0(vh2Var)).getFocusOwner()).f(), vh2Var, of5Var, i, lnVar, 1));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static final ArrayList G(eb3 eb3Var) {
        List m;
        eb3Var.getClass();
        sm3 F0 = ((kz3) eb3Var).F0();
        boolean V = V(F0);
        aa4 aa4Var = (aa4) F0.o();
        ua4 ua4Var = (ua4) aa4Var.B;
        ArrayList arrayList = new ArrayList(ua4Var.L);
        int i = ua4Var.L;
        for (int i2 = 0; i2 < i; i2++) {
            sm3 sm3Var = (sm3) aa4Var.get(i2);
            if (V) {
                m = sm3Var.l();
            } else {
                m = sm3Var.m();
            }
            arrayList.add(m);
        }
        return arrayList;
    }

    public static final int I(Bundle bundle, String str) {
        str.getClass();
        int i = bundle.getInt(str, Integer.MIN_VALUE);
        if (i == Integer.MIN_VALUE && bundle.getInt(str, Integer.MAX_VALUE) == Integer.MAX_VALUE) {
            xk2.B(str);
            throw null;
        }
        return i;
    }

    public static final e33 L() {
        e33 e33Var = e;
        if (e33Var != null) {
            return e33Var;
        }
        d33 d33Var = new d33("AutoMirrored.Filled.Logout", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, true, 96);
        int i = el7.a;
        cn6 cn6Var = new cn6(kt0.b);
        ww2 ww2Var = new ww2(1, (byte) 0);
        ww2Var.o(17.0f, 7.0f);
        ww2Var.n(-1.41f, 1.41f);
        ww2Var.m(18.17f, 11.0f);
        ww2Var.k(8.0f);
        ww2Var.u(2.0f);
        ww2Var.l(10.17f);
        ww2Var.n(-2.58f, 2.58f);
        ww2Var.m(17.0f, 17.0f);
        ww2Var.n(5.0f, -5.0f);
        ww2Var.g();
        ww2Var.o(4.0f, 5.0f);
        ww2Var.l(8.0f);
        ww2Var.t(3.0f);
        ww2Var.k(4.0f);
        ww2Var.i(-1.1f, RecyclerView.B1, -2.0f, 0.9f, -2.0f, 2.0f);
        ww2Var.u(14.0f);
        ww2Var.i(RecyclerView.B1, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        ww2Var.l(8.0f);
        ww2Var.u(-2.0f);
        ww2Var.k(4.0f);
        ww2Var.t(5.0f);
        ww2Var.g();
        d33.a(d33Var, ww2Var.b, 0, cn6Var);
        e33 b2 = d33Var.b();
        e = b2;
        return b2;
    }

    public static final Bundle N(Bundle bundle, String str) {
        Bundle bundle2 = bundle.getBundle(str);
        if (bundle2 != null) {
            return bundle2;
        }
        xk2.B(str);
        throw null;
    }

    public static final ArrayList O(Bundle bundle, String str) {
        ArrayList parcelableArrayList;
        Class cls = gh5.a(Bundle.class).a;
        cls.getClass();
        if (Build.VERSION.SDK_INT >= 34) {
            parcelableArrayList = r2.d(bundle, str, cls);
        } else {
            parcelableArrayList = bundle.getParcelableArrayList(str);
        }
        if (parcelableArrayList != null) {
            return parcelableArrayList;
        }
        xk2.B(str);
        throw null;
    }

    public static final String P(Bundle bundle, String str) {
        str.getClass();
        String string = bundle.getString(str);
        if (string != null) {
            return string;
        }
        xk2.B(str);
        throw null;
    }

    public static final String[] Q(Bundle bundle, String str) {
        str.getClass();
        String[] stringArray = bundle.getStringArray(str);
        if (stringArray != null) {
            return stringArray;
        }
        xk2.B(str);
        throw null;
    }

    public static final int R(int i, int i2) {
        return (i >> i2) & 31;
    }

    public static final boolean S(of5 of5Var, of5 of5Var2, of5 of5Var3, int i) {
        if (T(i, of5Var, of5Var3)) {
            if (T(i, of5Var2, of5Var3) && !p(of5Var3, of5Var, of5Var2, i)) {
                if (!p(of5Var3, of5Var2, of5Var, i) && U(i, of5Var3, of5Var) < U(i, of5Var3, of5Var2)) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public static final boolean T(int i, of5 of5Var, of5 of5Var2) {
        if (i == 3) {
            float f2 = of5Var2.c;
            float f3 = of5Var2.a;
            float f4 = of5Var.c;
            if ((f2 <= f4 && f3 < f4) || f3 <= of5Var.a) {
                return false;
            }
            return true;
        } else if (i == 4) {
            float f5 = of5Var2.a;
            float f6 = of5Var2.c;
            float f7 = of5Var.a;
            if ((f5 >= f7 && f6 > f7) || f6 >= of5Var.c) {
                return false;
            }
            return true;
        } else if (i == 5) {
            float f8 = of5Var2.d;
            float f9 = of5Var2.b;
            float f10 = of5Var.d;
            if ((f8 <= f10 && f9 < f10) || f9 <= of5Var.b) {
                return false;
            }
            return true;
        } else if (i == 6) {
            float f11 = of5Var2.b;
            float f12 = of5Var2.d;
            float f13 = of5Var.b;
            if ((f11 >= f13 && f12 > f13) || f12 >= of5Var.d) {
                return false;
            }
            return true;
        } else {
            i.m("This function should only be used for 2-D focus search");
            return false;
        }
    }

    public static final long U(int i, of5 of5Var, of5 of5Var2) {
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        if (i == 3) {
            f2 = of5Var.a;
            f3 = of5Var2.c;
        } else if (i == 4) {
            f2 = of5Var2.a;
            f3 = of5Var.c;
        } else if (i == 5) {
            f2 = of5Var.b;
            f3 = of5Var2.d;
        } else if (i == 6) {
            f2 = of5Var2.b;
            f3 = of5Var.d;
        } else {
            i.m("This function should only be used for 2-D focus search");
            return 0L;
        }
        float f7 = f2 - f3;
        if (f7 < RecyclerView.B1) {
            f7 = 0.0f;
        }
        long j = f7;
        if (i == 3 || i == 4) {
            float f8 = of5Var.b;
            f4 = ((of5Var.d - f8) / 2.0f) + f8;
            f5 = of5Var2.b;
            f6 = of5Var2.d;
        } else if (i == 5 || i == 6) {
            float f9 = of5Var.a;
            f4 = ((of5Var.c - f9) / 2.0f) + f9;
            f5 = of5Var2.a;
            f6 = of5Var2.c;
        } else {
            i.m("This function should only be used for 2-D focus search");
            return 0L;
        }
        long j2 = f4 - (((f6 - f5) / 2.0f) + f5);
        return (j2 * j2) + (13 * j * j);
    }

    public static final boolean V(sm3 sm3Var) {
        int i = h34.a[sm3Var.C0.d.ordinal()];
        if (i == 1 || i == 2) {
            return true;
        }
        if (i != 3 && i != 4) {
            if (i == 5) {
                sm3 v = sm3Var.v();
                if (v != null) {
                    return V(v);
                }
                i.h("no parent for idle node");
                return false;
            }
            i.d();
        }
        return false;
    }

    public static final boolean W(float f2, float f3, hj hjVar) {
        of5 of5Var = new of5(f2 - 0.005f, f3 - 0.005f, f2 + 0.005f, f3 + 0.005f);
        hj a2 = lj.a();
        hj.b(a2, of5Var);
        hj a3 = lj.a();
        a3.f(hjVar, a2, 1);
        boolean isEmpty = a3.a.isEmpty();
        a3.g();
        a2.g();
        return !isEmpty;
    }

    public static final boolean X(Bundle bundle, String str) {
        str.getClass();
        if (bundle.containsKey(str) && bundle.get(str) == null) {
            return true;
        }
        return false;
    }

    public static final boolean Z(float f2, float f3, float f4, float f5, long j) {
        float f6 = f2 - f4;
        float f7 = f3 - f5;
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        if (((f7 * f7) / (intBitsToFloat2 * intBitsToFloat2)) + ((f6 * f6) / (intBitsToFloat * intBitsToFloat)) <= 1.0f) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [hl5, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0, types: [qx3, s94] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, qb0] */
    public static final xd5 a0(xd5 xd5Var, String str, Executor executor, on2 on2Var) {
        xd5Var.getClass();
        executor.getClass();
        ?? qx3Var = new qx3(xd5.l0);
        ?? obj = new Object();
        obj.c = new Object();
        tb0 tb0Var = new tb0(obj);
        obj.b = tb0Var;
        obj.a = i61.class;
        try {
            executor.execute(new q30(xd5Var, str, on2Var, qx3Var, obj));
            jg7 jg7Var = jg7.a;
            if (jg7Var != null) {
                obj.a = jg7Var;
            }
        } catch (Exception e2) {
            tb0Var.b(e2);
        }
        return new xd5(13);
    }

    public static final boolean b0(int i, ln lnVar, vh2 vh2Var, of5 of5Var) {
        vh2 x;
        ua4 ua4Var = new ua4(new vh2[16]);
        if (!vh2Var.A.j0) {
            p53.c("visitChildren called on an unattached node");
        }
        ua4 ua4Var2 = new ua4(new z64[16]);
        z64 z64Var = vh2Var.A;
        z64 z64Var2 = z64Var.Y;
        if (z64Var2 == null) {
            nc1.z(ua4Var2, z64Var);
        } else {
            ua4Var2.b(z64Var2);
        }
        while (true) {
            int i2 = ua4Var2.L;
            if (i2 == 0) {
                break;
            }
            z64 z64Var3 = (z64) ua4Var2.l(i2 - 1);
            if ((z64Var3.R & 1024) == 0) {
                nc1.z(ua4Var2, z64Var3);
            } else {
                while (true) {
                    if (z64Var3 == null) {
                        break;
                    } else if ((z64Var3.L & 1024) != 0) {
                        ua4 ua4Var3 = null;
                        while (z64Var3 != null) {
                            if (z64Var3 instanceof vh2) {
                                vh2 vh2Var2 = (vh2) z64Var3;
                                if (vh2Var2.j0) {
                                    ua4Var.b(vh2Var2);
                                }
                            } else if ((z64Var3.L & 1024) != 0 && (z64Var3 instanceof zg1)) {
                                int i3 = 0;
                                for (z64 z64Var4 = ((zg1) z64Var3).l0; z64Var4 != null; z64Var4 = z64Var4.Y) {
                                    if ((z64Var4.L & 1024) != 0) {
                                        i3++;
                                        if (i3 == 1) {
                                            z64Var3 = z64Var4;
                                        } else {
                                            if (ua4Var3 == null) {
                                                ua4Var3 = new ua4(new z64[16]);
                                            }
                                            if (z64Var3 != null) {
                                                ua4Var3.b(z64Var3);
                                                z64Var3 = null;
                                            }
                                            ua4Var3.b(z64Var4);
                                        }
                                    }
                                }
                                if (i3 == 1) {
                                }
                            }
                            z64Var3 = nc1.A(ua4Var3);
                        }
                    } else {
                        z64Var3 = z64Var3.Y;
                    }
                }
            }
        }
        while (ua4Var.L != 0 && (x = x(ua4Var, of5Var, i)) != null) {
            if (x.T0().a) {
                return ((Boolean) lnVar.g(x)).booleanValue();
            }
            if (D(i, lnVar, x, of5Var)) {
                return true;
            }
            ua4Var.j(x);
        }
        return false;
    }

    public static final ExtractedText c0(c37 c37Var) {
        ExtractedText extractedText = new ExtractedText();
        String str = c37Var.a.B;
        extractedText.text = str;
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = str.length();
        extractedText.partialStartOffset = -1;
        long j = c37Var.b;
        extractedText.selectionStart = k47.f(j);
        extractedText.selectionEnd = k47.e(j);
        extractedText.flags = !qs6.k0(c37Var.a.B, '\n') ? 1 : 0;
        return extractedText;
    }

    public static zh d(int i, int i2, int i3, int i4) {
        Bitmap createBitmap;
        if ((i4 & 4) != 0) {
            i3 = 0;
        }
        cq5 cq5Var = qt0.e;
        Bitmap.Config R = l.R(i3);
        if (Build.VERSION.SDK_INT >= 26) {
            createBitmap = Bitmap.createBitmap((DisplayMetrics) null, i, i2, l.R(i3), true, pt0.a(cq5Var));
        } else {
            createBitmap = Bitmap.createBitmap((DisplayMetrics) null, i, i2, R);
            createBitmap.setHasAlpha(true);
        }
        return new zh(createBitmap);
    }

    public static String d0(int i) {
        if (i == 0) {
            return "Clamp";
        }
        if (i == 1) {
            return "Repeated";
        }
        if (i == 2) {
            return "Mirror";
        }
        if (i == 3) {
            return "Decal";
        }
        return "Unknown";
    }

    public static final hd4 e(BackEvent backEvent) {
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
        return new hd4(progress, touchX, touchY, swipeEdge, j);
    }

    public static final Boolean e0(int i, ln lnVar, vh2 vh2Var, of5 of5Var) {
        sh2 W0 = vh2Var.W0();
        int[] iArr = uc7.a;
        int i2 = iArr[W0.ordinal()];
        if (i2 != 1) {
            if (i2 != 2 && i2 != 3) {
                if (i2 == 4) {
                    if (vh2Var.T0().a) {
                        return (Boolean) lnVar.g(vh2Var);
                    }
                    if (of5Var == null) {
                        return Boolean.valueOf(y(vh2Var, i, lnVar));
                    }
                    return Boolean.valueOf(b0(i, lnVar, vh2Var, of5Var));
                }
                i.d();
                return null;
            }
            return Boolean.valueOf(y(vh2Var, i, lnVar));
        }
        vh2 t = yh2.t(vh2Var);
        if (t != null) {
            int i3 = iArr[t.W0().ordinal()];
            if (i3 != 1) {
                if (i3 != 2 && i3 != 3) {
                    if (i3 != 4) {
                        i.d();
                        return null;
                    }
                    i.m("ActiveParent must have a focusedChild");
                    return null;
                }
                if (of5Var == null) {
                    of5Var = yh2.r(t);
                }
                return Boolean.valueOf(D(i, lnVar, vh2Var, of5Var));
            }
            Boolean e0 = e0(i, lnVar, t, of5Var);
            if (!nb3.k(e0, Boolean.FALSE)) {
                return e0;
            }
            if (of5Var == null) {
                if (t.W0() == sh2.ActiveParent) {
                    vh2 q = yh2.q(t);
                    if (q != null) {
                        of5Var = yh2.r(q);
                    } else {
                        i.m("ActiveParent must have a focusedChild");
                        return null;
                    }
                } else {
                    i.m("Searching for active node in inactive hierarchy");
                    return null;
                }
            }
            return Boolean.valueOf(D(i, lnVar, vh2Var, of5Var));
        }
        i.m("ActiveParent must have a focusedChild");
        return null;
    }

    public static final void f(a74 a74Var, lq4 lq4Var, oi4 oi4Var, on2 on2Var, px0 px0Var, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z;
        a74Var.getClass();
        lq4Var.getClass();
        oi4Var.getClass();
        on2Var.getClass();
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(843875199);
        if (xq2Var.f(a74Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i6 = i | i2;
        if (xq2Var.f(lq4Var)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i7 = i6 | i3;
        if (xq2Var.f(oi4Var)) {
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
            z = true;
        } else {
            z = false;
        }
        if (xq2Var.S(i9 & 1, z)) {
            a74 W = nb3.W(a74Var, nb3.U(xq2Var), true);
            nq6 nq6Var = ky0.n;
            a74 S = ge7.S(W, ge7.r(lq4Var, (kk3) xq2Var.j(nq6Var)), RecyclerView.B1, ge7.q(lq4Var, (kk3) xq2Var.j(nq6Var)), RecyclerView.B1, 10);
            yt0 a2 = wt0.a(ju.c, d90.k0, xq2Var, 0);
            int hashCode = Long.hashCode(xq2Var.T);
            xv4 l = xq2Var.l();
            a74 E = l.E(xq2Var, S);
            jx0.i.getClass();
            iy0 iy0Var = ix0.b;
            xq2Var.f0();
            if (xq2Var.S) {
                xq2Var.k(iy0Var);
            } else {
                xq2Var.o0();
            }
            yh2.K(xq2Var, ix0.f, a2);
            yh2.K(xq2Var, ix0.e, l);
            yh2.K(xq2Var, ix0.g, Integer.valueOf(hashCode));
            yh2.F(xq2Var, ix0.h);
            yh2.K(xq2Var, ix0.d, E);
            x64 x64Var = x64.a;
            int i10 = i9 >> 3;
            q60.h(dj6.c(x64Var, 1.0f), oi4Var, on2Var, xq2Var, (i10 & 896) | (i10 & 112) | 6);
            gi2.h(xq2Var, dj6.e(x64Var, lq4Var.a() + 16.0f));
            xq2Var.p(true);
        } else {
            xq2Var.V();
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new p4(a74Var, lq4Var, oi4Var, on2Var, i, 11);
        }
    }

    public static final of5 f0(jk3 jk3Var) {
        of5 k = ej2.k(jk3Var, true);
        long A = jk3Var.A(k.d());
        long A2 = jk3Var.A((Float.floatToRawIntBits(k.c) << 32) | (Float.floatToRawIntBits(k.d) & 4294967295L));
        return new of5(Float.intBitsToFloat((int) (A >> 32)), Float.intBitsToFloat((int) (A & 4294967295L)), Float.intBitsToFloat((int) (A2 >> 32)), Float.intBitsToFloat((int) (A2 & 4294967295L)));
    }

    public static final void g(String str, boolean z, qn2 qn2Var, float f2, px0 px0Var, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z2;
        boolean z3;
        boolean z4;
        str.getClass();
        qn2Var.getClass();
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(1457840675);
        if (xq2Var.f(str)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i6 = i | i2;
        if (xq2Var.g(z)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i7 = i6 | i3;
        if (xq2Var.h(qn2Var)) {
            i4 = 256;
        } else {
            i4 = 128;
        }
        int i8 = i7 | i4;
        if (xq2Var.c(f2)) {
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
            x64 x64Var = x64.a;
            a74 c2 = dj6.c(x64Var, 1.0f);
            if ((i9 & 896) == 256) {
                z3 = true;
            } else {
                z3 = false;
            }
            if ((i9 & 112) == 32) {
                z4 = true;
            } else {
                z4 = false;
            }
            boolean z5 = z4 | z3;
            Object P = xq2Var.P();
            if (z5 || P == ox0.a) {
                P = new q01(qn2Var, z, 2);
                xq2Var.l0(P);
            }
            a74 R = ge7.R(dj6.f(nw7.f0(mb3.u(c2, false, null, (on2) P, 15), false, null, 3), 48.0f, RecyclerView.B1, 2), f2, 8.0f, f2, 8.0f);
            l26 a2 = k26.a(ju.a, d90.i0, xq2Var, 48);
            int hashCode = Long.hashCode(xq2Var.T);
            xv4 l = xq2Var.l();
            a74 E = l.E(xq2Var, R);
            jx0.i.getClass();
            iy0 iy0Var = ix0.b;
            xq2Var.f0();
            if (xq2Var.S) {
                xq2Var.k(iy0Var);
            } else {
                xq2Var.o0();
            }
            yh2.K(xq2Var, ix0.f, a2);
            yh2.K(xq2Var, ix0.e, l);
            yh2.K(xq2Var, ix0.g, Integer.valueOf(hashCode));
            yh2.F(xq2Var, ix0.h);
            yh2.K(xq2Var, ix0.d, E);
            x37.b(str, new vn3(1.0f, true), 0L, 0L, null, null, 0L, null, 0L, 2, false, 1, 0, null, ((xe7) xq2Var.j(ye7.b)).i, xq2Var, i9 & 14, 3120, 55292);
            gi2.h(xq2Var, dj6.l(x64Var, 16.0f));
            Resources.Theme theme = ((Context) xq2Var.j(kf.b)).getTheme();
            ThreadLocal threadLocal = sl5.a;
            bx6.a(z, null, null, false, nj2.i(0L, 0L, hv.b(((Resources) xq2Var.j(kf.c)).getColor(R.color.switchThumbUnselected, theme)), 0L, xq2Var, 1015), xq2Var, ((i9 >> 3) & 14) | 48, 28);
            xq2Var.p(true);
        } else {
            xq2Var.V();
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new cq1(str, z, qn2Var, f2, i);
        }
    }

    public static final void h(final a74 a74Var, eo2 eo2Var, eo2 eo2Var2, fo2 fo2Var, final eo2 eo2Var3, final eo2 eo2Var4, final boolean z, final float f2, lq4 lq4Var, px0 px0Var, final int i) {
        int i2;
        boolean z2;
        eo2 eo2Var5;
        fo2 fo2Var2;
        boolean z3;
        boolean z4;
        boolean z5;
        e40 e40Var;
        kk3 kk3Var;
        boolean z6;
        boolean z7;
        e40 e40Var2;
        boolean z8;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        final eo2 eo2Var6 = eo2Var;
        final lq4 lq4Var2 = lq4Var;
        e40 e40Var3 = d90.L;
        e40 e40Var4 = d90.Z;
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(-1595074580);
        if ((i & 6) == 0) {
            if (xq2Var.f(a74Var)) {
                i11 = 4;
            } else {
                i11 = 2;
            }
            i2 = i11 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (xq2Var.h(eo2Var6)) {
                i10 = 32;
            } else {
                i10 = 16;
            }
            i2 |= i10;
        }
        if ((i & RendererDebugBridge.CAPTURE_HEIGHT) == 0) {
            if (xq2Var.h(eo2Var2)) {
                i9 = 256;
            } else {
                i9 = 128;
            }
            i2 |= i9;
        }
        if ((i & 3072) == 0) {
            if (xq2Var.h(fo2Var)) {
                i8 = 2048;
            } else {
                i8 = 1024;
            }
            i2 |= i8;
        }
        if ((i & 24576) == 0) {
            if (xq2Var.h(eo2Var3)) {
                i7 = 16384;
            } else {
                i7 = 8192;
            }
            i2 |= i7;
        }
        if ((196608 & i) == 0) {
            if (xq2Var.h(eo2Var4)) {
                i6 = 131072;
            } else {
                i6 = 65536;
            }
            i2 |= i6;
        }
        if ((1572864 & i) == 0) {
            if (xq2Var.g(z)) {
                i5 = 1048576;
            } else {
                i5 = 524288;
            }
            i2 |= i5;
        }
        if ((12582912 & i) == 0) {
            if (xq2Var.c(f2)) {
                i4 = 8388608;
            } else {
                i4 = Compress.MAXWINSIZE;
            }
            i2 |= i4;
        }
        if ((100663296 & i) == 0) {
            if (xq2Var.f(lq4Var2)) {
                i3 = 67108864;
            } else {
                i3 = 33554432;
            }
            i2 |= i3;
        }
        if ((38347923 & i2) != 38347922) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (xq2Var.S(i2 & 1, z2)) {
            if ((3670016 & i2) == 1048576) {
                z3 = true;
            } else {
                z3 = false;
            }
            if ((29360128 & i2) == 8388608) {
                z4 = true;
            } else {
                z4 = false;
            }
            boolean z9 = z4 | z3;
            if ((234881024 & i2) == 67108864) {
                z5 = true;
            } else {
                z5 = false;
            }
            boolean z10 = z9 | z5;
            Object P = xq2Var.P();
            if (z10 || P == ox0.a) {
                P = new a27(z, f2, lq4Var2);
                xq2Var.l0(P);
            }
            a27 a27Var = (a27) P;
            kk3 kk3Var2 = (kk3) xq2Var.j(ky0.n);
            int B = ge7.B(xq2Var);
            xv4 l = xq2Var.l();
            a74 E = l.E(xq2Var, a74Var);
            jx0.i.getClass();
            iy0 iy0Var = ix0.b;
            xq2Var.f0();
            int i12 = i2;
            if (xq2Var.S) {
                xq2Var.k(iy0Var);
            } else {
                xq2Var.o0();
            }
            pn pnVar = ix0.f;
            yh2.K(xq2Var, pnVar, a27Var);
            pn pnVar2 = ix0.e;
            yh2.K(xq2Var, pnVar2, l);
            pn pnVar3 = ix0.g;
            if (xq2Var.S || !nb3.k(xq2Var.P(), Integer.valueOf(B))) {
                i61.v(B, xq2Var, B, pnVar3);
            }
            pn pnVar4 = ix0.d;
            yh2.K(xq2Var, pnVar4, E);
            m64 m64Var = m64.a;
            x64 x64Var = x64.a;
            if (eo2Var3 != null) {
                xq2Var.b0(-1444611617);
                a74 D = lb4.D(x64Var, "Leading");
                nq6 nq6Var = u93.a;
                a74 d2 = D.d(m64Var);
                e40Var = e40Var3;
                e34 d3 = h70.d(e40Var4, false);
                int B2 = ge7.B(xq2Var);
                xv4 l2 = xq2Var.l();
                a74 E2 = l.E(xq2Var, d2);
                xq2Var.f0();
                kk3Var = kk3Var2;
                if (xq2Var.S) {
                    xq2Var.k(iy0Var);
                } else {
                    xq2Var.o0();
                }
                yh2.K(xq2Var, pnVar, d3);
                yh2.K(xq2Var, pnVar2, l2);
                if (xq2Var.S || !nb3.k(xq2Var.P(), Integer.valueOf(B2))) {
                    i61.v(B2, xq2Var, B2, pnVar3);
                }
                yh2.K(xq2Var, pnVar4, E2);
                eo2Var3.o(xq2Var, Integer.valueOf((i12 >> 12) & 14));
                xq2Var.p(true);
                z6 = false;
                xq2Var.p(false);
            } else {
                e40Var = e40Var3;
                kk3Var = kk3Var2;
                z6 = false;
                xq2Var.b0(-1444365601);
                xq2Var.p(false);
            }
            if (eo2Var4 != null) {
                xq2Var.b0(-1444322883);
                a74 D2 = lb4.D(x64Var, "Trailing");
                nq6 nq6Var2 = u93.a;
                a74 d4 = D2.d(m64Var);
                e34 d5 = h70.d(e40Var4, z6);
                int B3 = ge7.B(xq2Var);
                xv4 l3 = xq2Var.l();
                a74 E3 = l.E(xq2Var, d4);
                xq2Var.f0();
                if (xq2Var.S) {
                    xq2Var.k(iy0Var);
                } else {
                    xq2Var.o0();
                }
                yh2.K(xq2Var, pnVar, d5);
                yh2.K(xq2Var, pnVar2, l3);
                if (xq2Var.S || !nb3.k(xq2Var.P(), Integer.valueOf(B3))) {
                    i61.v(B3, xq2Var, B3, pnVar3);
                }
                yh2.K(xq2Var, pnVar4, E3);
                eo2Var4.o(xq2Var, Integer.valueOf((i12 >> 15) & 14));
                xq2Var.p(true);
                xq2Var.p(false);
            } else {
                xq2Var.b0(-1444074945);
                xq2Var.p(z6);
            }
            lq4Var2 = lq4Var;
            kk3 kk3Var3 = kk3Var;
            float r = ge7.r(lq4Var2, kk3Var3);
            float q = ge7.q(lq4Var2, kk3Var3);
            if (eo2Var3 != null) {
                r -= 12.0f;
                if (r < RecyclerView.B1) {
                    r = 0.0f;
                }
            }
            float f3 = r;
            if (eo2Var4 != null) {
                q -= 12.0f;
                if (q < RecyclerView.B1) {
                    q = 0.0f;
                }
            }
            a74 S = ge7.S(x64Var, f3, RecyclerView.B1, q, RecyclerView.B1, 10);
            if (fo2Var != null) {
                xq2Var.b0(-1443222972);
                fo2Var2 = fo2Var;
                fo2Var2.e(lb4.D(x64Var, "Hint").d(S), xq2Var, Integer.valueOf((i12 >> 6) & 112));
                z7 = false;
                xq2Var.p(false);
            } else {
                fo2Var2 = fo2Var;
                z7 = false;
                xq2Var.b0(-1443135521);
                xq2Var.p(false);
            }
            if (eo2Var2 != null) {
                xq2Var.b0(-1443101018);
                a74 d6 = lb4.D(x64Var, "Label").d(S);
                e40Var2 = e40Var;
                e34 d7 = h70.d(e40Var2, z7);
                int B4 = ge7.B(xq2Var);
                xv4 l4 = xq2Var.l();
                a74 E4 = l.E(xq2Var, d6);
                xq2Var.f0();
                if (xq2Var.S) {
                    xq2Var.k(iy0Var);
                } else {
                    xq2Var.o0();
                }
                yh2.K(xq2Var, pnVar, d7);
                yh2.K(xq2Var, pnVar2, l4);
                if (xq2Var.S || !nb3.k(xq2Var.P(), Integer.valueOf(B4))) {
                    i61.v(B4, xq2Var, B4, pnVar3);
                }
                yh2.K(xq2Var, pnVar4, E4);
                eo2Var5 = eo2Var2;
                eo2Var5.o(xq2Var, Integer.valueOf((i12 >> 6) & 14));
                z8 = true;
                xq2Var.p(true);
                xq2Var.p(false);
            } else {
                eo2Var5 = eo2Var2;
                boolean z11 = z7;
                e40Var2 = e40Var;
                z8 = true;
                xq2Var.b0(-1443015489);
                xq2Var.p(z11);
            }
            a74 d8 = lb4.D(x64Var, "TextField").d(S);
            e34 d9 = h70.d(e40Var2, z8);
            int B5 = ge7.B(xq2Var);
            xv4 l5 = xq2Var.l();
            a74 E5 = l.E(xq2Var, d8);
            xq2Var.f0();
            if (xq2Var.S) {
                xq2Var.k(iy0Var);
            } else {
                xq2Var.o0();
            }
            yh2.K(xq2Var, pnVar, d9);
            yh2.K(xq2Var, pnVar2, l5);
            if (xq2Var.S || !nb3.k(xq2Var.P(), Integer.valueOf(B5))) {
                i61.v(B5, xq2Var, B5, pnVar3);
            }
            yh2.K(xq2Var, pnVar4, E5);
            eo2Var6 = eo2Var;
            eo2Var6.o(xq2Var, Integer.valueOf((i12 >> 3) & 14));
            xq2Var.p(true);
            xq2Var.p(true);
        } else {
            eo2Var5 = eo2Var2;
            fo2Var2 = fo2Var;
            xq2Var.V();
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            final eo2 eo2Var7 = eo2Var5;
            final fo2 fo2Var3 = fo2Var2;
            t.d = new eo2() { // from class: x17
                @Override // defpackage.eo2
                public final Object o(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    uj2.h(a74.this, eo2Var6, eo2Var7, fo2Var3, eo2Var3, eo2Var4, z, f2, lq4Var2, (px0) obj, ii2.a0(i | 1));
                    return jg7.a;
                }
            };
        }
    }

    public static final int i(kz3 kz3Var, ey2 ey2Var) {
        long I0;
        kz3 z0 = kz3Var.z0();
        if (z0 == null) {
            p53.c("Child of " + kz3Var + " cannot be null when calculating alignment line");
        }
        if (kz3Var.G0().b().containsKey(ey2Var)) {
            Integer num = (Integer) kz3Var.G0().b().get(ey2Var);
            if (num != null) {
                return num.intValue();
            }
        } else {
            int X = z0.X(ey2Var);
            if (X != Integer.MIN_VALUE) {
                z0.f0 = true;
                kz3Var.g0 = true;
                kz3Var.M0();
                z0.f0 = false;
                kz3Var.g0 = false;
                if (ey2Var instanceof ey2) {
                    I0 = z0.I0() & 4294967295L;
                } else {
                    I0 = z0.I0() >> 32;
                }
                return X + ((int) I0);
            }
        }
        return Integer.MIN_VALUE;
    }

    public static final int j(int i, boolean z, int i2, int i3, int i4, int i5, long j, float f2, lq4 lq4Var) {
        float f3;
        float f4 = 2.0f * f2;
        float d2 = lq4Var.d() * f2;
        float a2 = lq4Var.a() * f2;
        int max = Math.max(i, i5);
        if (z) {
            f3 = i2 + f4 + max + a2;
        } else {
            f3 = d2 + max + a2;
        }
        return s21.f(Math.max(u24.E(f3), Math.max(i3, i4)), j);
    }

    public static final e55 k(e55 e55Var, long j) {
        r90 d2;
        if (j == 19500) {
            d2 = e55Var.e();
        } else {
            d2 = e55Var.d();
        }
        return new e55(d2);
    }

    public static final void m(qo7 qo7Var, d56 d56Var, ut3 ut3Var) {
        d56Var.getClass();
        ut3Var.getClass();
        w46 w46Var = (w46) qo7Var.c("androidx.lifecycle.savedstate.vm.tag");
        if (w46Var != null && !w46Var.L) {
            w46Var.e(ut3Var, d56Var);
            tt3 b2 = ut3Var.b();
            if (b2 != tt3.INITIALIZED && !b2.isAtLeast(tt3.STARTED)) {
                ut3Var.a(new se1(ut3Var, d56Var));
            } else {
                d56Var.d();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0068  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x005a -> B:21:0x005d). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object n(mw6 mw6Var, py4 py4Var, d20 d20Var) {
        sj2 sj2Var;
        int i;
        int size;
        int i2;
        if (d20Var instanceof sj2) {
            sj2 sj2Var2 = (sj2) d20Var;
            int i3 = sj2Var2.Z;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                sj2Var2.Z = i3 - Integer.MIN_VALUE;
                sj2Var = sj2Var2;
                Object obj = sj2Var.Y;
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                i = sj2Var.Z;
                if (i == 0) {
                    if (i == 1) {
                        py4 py4Var2 = sj2Var.X;
                        mw6 mw6Var2 = sj2Var.R;
                        oi2.Y(obj);
                        py4Var = py4Var2;
                        mw6Var = mw6Var2;
                        List list = ((oy4) obj).a;
                        size = list.size();
                        i2 = 0;
                        while (i2 < size) {
                            if (((vy4) list.get(i2)).d) {
                                sj2Var.R = mw6Var;
                                sj2Var.X = py4Var;
                                sj2Var.Z = 1;
                                obj = mw6Var.c(py4Var, sj2Var);
                                if (obj == x61Var) {
                                    return x61Var;
                                }
                                List list2 = ((oy4) obj).a;
                                size = list2.size();
                                i2 = 0;
                                while (i2 < size) {
                                }
                            } else {
                                i2++;
                            }
                        }
                        return jg7.a;
                    }
                    i.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                oi2.Y(obj);
                List list3 = mw6Var.Y.p0.a;
                int size2 = list3.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    if (((vy4) list3.get(i4)).d) {
                        sj2Var.R = mw6Var;
                        sj2Var.X = py4Var;
                        sj2Var.Z = 1;
                        obj = mw6Var.c(py4Var, sj2Var);
                        if (obj == x61Var) {
                        }
                        List list22 = ((oy4) obj).a;
                        size = list22.size();
                        i2 = 0;
                        while (i2 < size) {
                        }
                        return jg7.a;
                    }
                }
                return jg7.a;
            }
        }
        sj2Var = new s41(d20Var);
        Object obj2 = sj2Var.Y;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i = sj2Var.Z;
        if (i == 0) {
        }
    }

    public static final Object o(zy4 zy4Var, eo2 eo2Var, r41 r41Var) {
        Object R0 = ((ow6) zy4Var).R0(new tj2(r41Var.b(), eo2Var, null, 0), r41Var);
        if (R0 == x61.COROUTINE_SUSPENDED) {
            return R0;
        }
        return jg7.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0033, code lost:
        if (r11 >= r2) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003a, code lost:
        if (r10 <= r7) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0041, code lost:
        if (r9 >= r6) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0048, code lost:
        if (r8 <= r5) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004a, code lost:
        if (r21 != 3) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004d, code lost:
        if (r21 != 4) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x004f, code lost:
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0050, code lost:
        if (r21 != 3) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0052, code lost:
        r1 = r11 - r19.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0057, code lost:
        if (r21 != 4) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0059, code lost:
        r1 = r19.a - r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x005d, code lost:
        if (r21 != 5) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x005f, code lost:
        r1 = r9 - r19.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0064, code lost:
        if (r21 != 6) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0066, code lost:
        r1 = r19.b - r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x006d, code lost:
        if (r1 >= androidx.recyclerview.widget.RecyclerView.B1) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x006f, code lost:
        r1 = 0.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0071, code lost:
        if (r21 != 3) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0073, code lost:
        r11 = r11 - r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0075, code lost:
        if (r21 != 4) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0077, code lost:
        r11 = r2 - r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x007a, code lost:
        if (r21 != 5) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x007c, code lost:
        r11 = r9 - r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x007f, code lost:
        if (r21 != 6) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0081, code lost:
        r11 = r6 - r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0087, code lost:
        if (r11 >= 1.0f) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0089, code lost:
        r11 = 1.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x008c, code lost:
        if (r1 >= r11) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x008e, code lost:
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x008f, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0090, code lost:
        defpackage.i.m("This function should only be used for 2-D focus search");
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0093, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0094, code lost:
        defpackage.i.m("This function should only be used for 2-D focus search");
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0097, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0098, code lost:
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean p(of5 of5Var, of5 of5Var2, of5 of5Var3, int i) {
        boolean q = q(i, of5Var3, of5Var);
        float f2 = of5Var3.b;
        float f3 = of5Var3.d;
        float f4 = of5Var3.a;
        float f5 = of5Var3.c;
        float f6 = of5Var.d;
        float f7 = of5Var.b;
        float f8 = of5Var.c;
        float f9 = of5Var.a;
        if (!q && q(i, of5Var2, of5Var)) {
            if (i != 3) {
                if (i != 4) {
                    if (i != 5) {
                        if (i != 6) {
                            i.m("This function should only be used for 2-D focus search");
                        }
                    }
                }
            }
        }
        return false;
    }

    public static final boolean q(int i, of5 of5Var, of5 of5Var2) {
        if (i == 3 || i == 4) {
            if (of5Var.d <= of5Var2.b || of5Var.b >= of5Var2.d) {
                return false;
            }
            return true;
        } else if (i == 5 || i == 6) {
            if (of5Var.c <= of5Var2.a || of5Var.a >= of5Var2.c) {
                return false;
            }
            return true;
        } else {
            i.m("This function should only be used for 2-D focus search");
            return false;
        }
    }

    public static final String r(id3 id3Var, wb6 wb6Var) {
        wb6Var.getClass();
        id3Var.getClass();
        for (Annotation annotation : wb6Var.getAnnotations()) {
            if (annotation instanceof sd3) {
                return ((sd3) annotation).discriminator();
            }
        }
        return id3Var.a.d;
    }

    public static final void s(vh2 vh2Var, ua4 ua4Var) {
        if (!vh2Var.A.j0) {
            p53.c("visitChildren called on an unattached node");
        }
        ua4 ua4Var2 = new ua4(new z64[16]);
        z64 z64Var = vh2Var.A;
        z64 z64Var2 = z64Var.Y;
        if (z64Var2 == null) {
            nc1.z(ua4Var2, z64Var);
        } else {
            ua4Var2.b(z64Var2);
        }
        while (true) {
            int i = ua4Var2.L;
            if (i != 0) {
                z64 z64Var3 = (z64) ua4Var2.l(i - 1);
                if ((z64Var3.R & 1024) == 0) {
                    nc1.z(ua4Var2, z64Var3);
                } else {
                    while (true) {
                        if (z64Var3 == null) {
                            break;
                        } else if ((z64Var3.L & 1024) != 0) {
                            ua4 ua4Var3 = null;
                            while (z64Var3 != null) {
                                if (z64Var3 instanceof vh2) {
                                    vh2 vh2Var2 = (vh2) z64Var3;
                                    if (vh2Var2.j0 && !nc1.f0(vh2Var2).K0) {
                                        if (vh2Var2.T0().a) {
                                            ua4Var.b(vh2Var2);
                                        } else {
                                            s(vh2Var2, ua4Var);
                                        }
                                    }
                                } else if ((z64Var3.L & 1024) != 0 && (z64Var3 instanceof zg1)) {
                                    int i2 = 0;
                                    for (z64 z64Var4 = ((zg1) z64Var3).l0; z64Var4 != null; z64Var4 = z64Var4.Y) {
                                        if ((z64Var4.L & 1024) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                z64Var3 = z64Var4;
                                            } else {
                                                if (ua4Var3 == null) {
                                                    ua4Var3 = new ua4(new z64[16]);
                                                }
                                                if (z64Var3 != null) {
                                                    ua4Var3.b(z64Var3);
                                                    z64Var3 = null;
                                                }
                                                ua4Var3.b(z64Var4);
                                            }
                                        }
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                z64Var3 = nc1.A(ua4Var3);
                            }
                        } else {
                            z64Var3 = z64Var3.Y;
                        }
                    }
                }
            } else {
                return;
            }
        }
    }

    public static StaticLayout t(CharSequence charSequence, TextPaint textPaint, int i, int i2, TextDirectionHeuristic textDirectionHeuristic, Layout.Alignment alignment, int i3, TextUtils.TruncateAt truncateAt, int i4, int i5, boolean z, int i6, int i7, int i8, int i9) {
        if (i2 < 0) {
            q53.a("invalid start value");
        }
        int length = charSequence.length();
        if (i2 < 0 || i2 > length) {
            q53.a("invalid end value");
        }
        if (i3 < 0) {
            q53.a("invalid maxLines value");
        }
        if (i < 0) {
            q53.a("invalid width value");
        }
        if (i4 < 0) {
            q53.a("invalid ellipsizedWidth value");
        }
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, 0, i2, textPaint, i);
        obtain.setTextDirection(textDirectionHeuristic);
        obtain.setAlignment(alignment);
        obtain.setMaxLines(i3);
        obtain.setEllipsize(truncateAt);
        obtain.setEllipsizedWidth(i4);
        obtain.setLineSpacing(RecyclerView.B1, 1.0f);
        obtain.setIncludePad(z);
        obtain.setBreakStrategy(i6);
        obtain.setHyphenationFrequency(i9);
        obtain.setIndents(null, null);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 26) {
            obtain.setJustificationMode(i5);
        }
        if (i10 >= 28) {
            obtain.setUseLineSpacingFromFallbacks(true);
        }
        if (i10 >= 33) {
            a81.n(obtain, a81.e(a81.t(a81.d(a81.c(), i7), i8)));
        }
        if (i10 >= 35) {
            obtain.setUseBoundsForWidth(false);
        }
        return obtain.build();
    }

    public static Handler u(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return pp.b(looper);
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (IllegalAccessException e2) {
            e = e2;
            Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (InstantiationException e3) {
            e = e3;
            Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (NoSuchMethodException e4) {
            e = e4;
            Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (InvocationTargetException e5) {
            Throwable cause = e5.getCause();
            if (!(cause instanceof RuntimeException)) {
                if (cause instanceof Error) {
                    throw ((Error) cause);
                }
                throw new RuntimeException(cause);
            }
            throw ((RuntimeException) cause);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [zn7, java.lang.Object] */
    public static boolean v(View view, KeyEvent keyEvent) {
        ArrayList arrayList;
        int size;
        int indexOfKey;
        WeakHashMap weakHashMap = ao7.a;
        if (Build.VERSION.SDK_INT < 28) {
            ArrayList arrayList2 = zn7.d;
            zn7 zn7Var = (zn7) view.getTag(R.id.tag_unhandled_key_event_manager);
            WeakReference weakReference = null;
            zn7 zn7Var2 = zn7Var;
            if (zn7Var == null) {
                ?? obj = new Object();
                obj.a = null;
                obj.b = null;
                obj.c = null;
                view.setTag(R.id.tag_unhandled_key_event_manager, obj);
                zn7Var2 = obj;
            }
            WeakReference weakReference2 = zn7Var2.c;
            if (weakReference2 == null || weakReference2.get() != keyEvent) {
                zn7Var2.c = new WeakReference(keyEvent);
                if (zn7Var2.b == null) {
                    zn7Var2.b = new SparseArray();
                }
                SparseArray sparseArray = zn7Var2.b;
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
                    u34.a();
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
    */
    public static boolean w(xg3 xg3Var, View view, Window.Callback callback, KeyEvent keyEvent) {
        DialogInterface.OnKeyListener onKeyListener;
        Window window;
        boolean z = false;
        if (xg3Var != null) {
            if (Build.VERSION.SDK_INT >= 28) {
                return xg3Var.j(keyEvent);
            }
            KeyEvent.DispatcherState dispatcherState = null;
            if (callback instanceof Activity) {
                Activity activity = (Activity) callback;
                activity.onUserInteraction();
                Window window2 = activity.getWindow();
                if (window2.hasFeature(8)) {
                    ActionBar actionBar = activity.getActionBar();
                    if (keyEvent.getKeyCode() == 82 && actionBar != null) {
                        if (!a) {
                            try {
                                b = actionBar.getClass().getMethod("onMenuKeyEvent", KeyEvent.class);
                            } catch (NoSuchMethodException unused) {
                            }
                            a = true;
                        }
                        Method method = b;
                        if (method != null) {
                            try {
                                Object invoke = method.invoke(actionBar, keyEvent);
                                if (invoke != null) {
                                    z = ((Boolean) invoke).booleanValue();
                                }
                            } catch (IllegalAccessException | InvocationTargetException unused2) {
                            }
                        }
                        if (z) {
                            return true;
                        }
                    }
                }
                if (window2.superDispatchKeyEvent(keyEvent)) {
                    return true;
                }
                View decorView = window2.getDecorView();
                if (ao7.d(decorView, keyEvent)) {
                    return true;
                }
                if (decorView != null) {
                    dispatcherState = decorView.getKeyDispatcherState();
                }
                return keyEvent.dispatch(activity, dispatcherState, activity);
            } else if (callback instanceof Dialog) {
                Dialog dialog = (Dialog) callback;
                if (!c) {
                    try {
                        Field declaredField = Dialog.class.getDeclaredField("mOnKeyListener");
                        d = declaredField;
                        declaredField.setAccessible(true);
                    } catch (NoSuchFieldException unused3) {
                    }
                    c = true;
                }
                Field field = d;
                if (field != null) {
                    try {
                        onKeyListener = (DialogInterface.OnKeyListener) field.get(dialog);
                    } catch (IllegalAccessException unused4) {
                    }
                    if (onKeyListener == null && onKeyListener.onKey(dialog, keyEvent.getKeyCode(), keyEvent)) {
                        return true;
                    }
                    window = dialog.getWindow();
                    if (!window.superDispatchKeyEvent(keyEvent)) {
                        return true;
                    }
                    View decorView2 = window.getDecorView();
                    if (ao7.d(decorView2, keyEvent)) {
                        return true;
                    }
                    if (decorView2 != null) {
                        dispatcherState = decorView2.getKeyDispatcherState();
                    }
                    return keyEvent.dispatch(dialog, dispatcherState, dialog);
                }
                onKeyListener = null;
                if (onKeyListener == null) {
                }
                window = dialog.getWindow();
                if (!window.superDispatchKeyEvent(keyEvent)) {
                }
            } else if ((view != null && ao7.d(view, keyEvent)) || xg3Var.j(keyEvent)) {
                return true;
            }
        }
        return false;
    }

    public static final vh2 x(ua4 ua4Var, of5 of5Var, int i) {
        of5 h;
        vh2 vh2Var = null;
        if (i == 3) {
            h = of5Var.h((of5Var.c - of5Var.a) + 1.0f, RecyclerView.B1);
        } else if (i == 4) {
            h = of5Var.h(-((of5Var.c - of5Var.a) + 1.0f), RecyclerView.B1);
        } else if (i == 5) {
            h = of5Var.h(RecyclerView.B1, (of5Var.d - of5Var.b) + 1.0f);
        } else if (i == 6) {
            h = of5Var.h(RecyclerView.B1, -((of5Var.d - of5Var.b) + 1.0f));
        } else {
            i.m("This function should only be used for 2-D focus search");
            return null;
        }
        Object[] objArr = ua4Var.A;
        int i2 = ua4Var.L;
        for (int i3 = 0; i3 < i2; i3++) {
            vh2 vh2Var2 = (vh2) objArr[i3];
            if (yh2.A(vh2Var2)) {
                of5 r = yh2.r(vh2Var2);
                if (S(r, h, of5Var, i)) {
                    vh2Var = vh2Var2;
                    h = r;
                }
            }
        }
        return vh2Var;
    }

    public static final boolean y(vh2 vh2Var, int i, qn2 qn2Var) {
        of5 of5Var;
        Object obj;
        ua4 ua4Var = new ua4(new vh2[16]);
        s(vh2Var, ua4Var);
        int i2 = ua4Var.L;
        if (i2 <= 1) {
            if (i2 == 0) {
                obj = null;
            } else {
                obj = ua4Var.A[0];
            }
            vh2 vh2Var2 = (vh2) obj;
            if (vh2Var2 != null) {
                return ((Boolean) qn2Var.g(vh2Var2)).booleanValue();
            }
        } else {
            if (i == 7) {
                i = 4;
            }
            if (i == 4 || i == 6) {
                of5 r = yh2.r(vh2Var);
                float f2 = r.a;
                float f3 = r.b;
                of5Var = new of5(f2, f3, f2, f3);
            } else if (i == 3 || i == 5) {
                of5 r2 = yh2.r(vh2Var);
                float f4 = r2.c;
                float f5 = r2.d;
                of5Var = new of5(f4, f5, f4, f5);
            } else {
                i.m("This function should only be used for 2-D focus search");
                return false;
            }
            vh2 x = x(ua4Var, of5Var, i);
            if (x != null) {
                return ((Boolean) qn2Var.g(x)).booleanValue();
            }
        }
        return false;
    }

    public static final int z(int i, List list) {
        int i2;
        char c2;
        int i3 = ((yr4) gt0.Q0(list)).c;
        if (i > ((yr4) gt0.Q0(list)).c) {
            q53.a("Index " + i + " should be less or equal than last line's end " + i3);
        }
        int size = list.size() - 1;
        int i4 = 0;
        while (true) {
            if (i4 <= size) {
                i2 = (i4 + size) >>> 1;
                yr4 yr4Var = (yr4) list.get(i2);
                if (yr4Var.b > i) {
                    c2 = 1;
                } else if (yr4Var.c <= i) {
                    c2 = 65535;
                } else {
                    c2 = 0;
                }
                if (c2 < 0) {
                    i4 = i2 + 1;
                } else if (c2 <= 0) {
                    break;
                } else {
                    size = i2 - 1;
                }
            } else {
                i2 = -(i4 + 1);
                break;
            }
        }
        if (i2 >= 0 && i2 < list.size()) {
            return i2;
        }
        StringBuilder t = xg6.t("Found paragraph index ", i2, " should be in range [0, ");
        t.append(list.size());
        t.append(").\nDebug info: index=");
        t.append(i);
        t.append(", paragraphs=[");
        t.append(ex3.a(31, new x84(0), null, list));
        t.append(']');
        q53.a(t.toString());
        return i2;
    }

    public abstract Method E(Class cls, Field field);

    public abstract Constructor F(Class cls);

    public Object H(int i) {
        bb3 d2 = J().d(i);
        return d2.c.a().g(Integer.valueOf(i - d2.a));
    }

    public abstract ei J();

    public Object K(int i) {
        Object g2;
        bb3 d2 = J().d(i);
        int i2 = i - d2.a;
        qn2 key = d2.c.getKey();
        if (key != null && (g2 = key.g(Integer.valueOf(i2))) != null) {
            return g2;
        }
        return new pe1(i);
    }

    public abstract String[] M(Class cls);

    public abstract boolean Y(Class cls);

    public abstract void l(ok5 ok5Var, Object obj);

    @Override // defpackage.kp7
    public void a() {
    }

    @Override // defpackage.kp7
    public void b() {
    }
}
