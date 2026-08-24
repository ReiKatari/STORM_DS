package defpackage;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.opengl.Matrix;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import android.view.KeyEvent;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.view.animation.PathInterpolator;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CancellationException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: kj2  reason: default package */
/* loaded from: classes.dex */
public abstract class kj2 {
    public static final /* synthetic */ int a = 0;
    public static final /* synthetic */ int b = 0;
    public static int c = 3;
    public static e33 d;
    public static final /* synthetic */ int e = 0;
    public static e33 f;
    public static e33 g;
    public static e33 h;

    public static float A(String[] strArr, int i) {
        float parseFloat = Float.parseFloat(strArr[i]);
        if (parseFloat >= RecyclerView.B1 && parseFloat <= 1.0f) {
            return parseFloat;
        }
        throw new IllegalArgumentException("Motion easing control point value must be between 0 and 1; instead got: " + parseFloat);
    }

    public static final e33 B() {
        e33 e33Var = d;
        if (e33Var != null) {
            return e33Var;
        }
        d33 d33Var = new d33("AutoMirrored.Filled.OpenInNew", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, true, 96);
        int i = el7.a;
        cn6 cn6Var = new cn6(kt0.b);
        ww2 ww2Var = new ww2(1, (byte) 0);
        ww2Var.o(19.0f, 19.0f);
        ww2Var.k(5.0f);
        ww2Var.t(5.0f);
        ww2Var.l(7.0f);
        ww2Var.t(3.0f);
        ww2Var.k(5.0f);
        ww2Var.i(-1.11f, RecyclerView.B1, -2.0f, 0.9f, -2.0f, 2.0f);
        ww2Var.u(14.0f);
        ww2Var.i(RecyclerView.B1, 1.1f, 0.89f, 2.0f, 2.0f, 2.0f);
        ww2Var.l(14.0f);
        ww2Var.i(1.1f, RecyclerView.B1, 2.0f, -0.9f, 2.0f, -2.0f);
        ww2Var.u(-7.0f);
        ww2Var.l(-2.0f);
        ww2Var.u(7.0f);
        ww2Var.g();
        ww2Var.o(14.0f, 3.0f);
        ww2Var.u(2.0f);
        ww2Var.l(3.59f);
        ww2Var.n(-9.83f, 9.83f);
        ww2Var.n(1.41f, 1.41f);
        ww2Var.m(19.0f, 6.41f);
        ww2Var.t(10.0f);
        ww2Var.l(2.0f);
        ww2Var.t(3.0f);
        ww2Var.l(-7.0f);
        ww2Var.g();
        d33.a(d33Var, ww2Var.b, 0, cn6Var);
        e33 b2 = d33Var.b();
        d = b2;
        return b2;
    }

    public static final e33 C() {
        e33 e33Var = f;
        if (e33Var != null) {
            return e33Var;
        }
        d33 d33Var = new d33("Filled.Save", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = el7.a;
        cn6 cn6Var = new cn6(kt0.b);
        ww2 ww2Var = new ww2(1, (byte) 0);
        ww2Var.o(17.0f, 3.0f);
        ww2Var.m(5.0f, 3.0f);
        ww2Var.i(-1.11f, RecyclerView.B1, -2.0f, 0.9f, -2.0f, 2.0f);
        ww2Var.u(14.0f);
        ww2Var.i(RecyclerView.B1, 1.1f, 0.89f, 2.0f, 2.0f, 2.0f);
        ww2Var.l(14.0f);
        ww2Var.i(1.1f, RecyclerView.B1, 2.0f, -0.9f, 2.0f, -2.0f);
        ww2Var.m(21.0f, 7.0f);
        ww2Var.n(-4.0f, -4.0f);
        ww2Var.g();
        ww2Var.o(12.0f, 19.0f);
        ww2Var.i(-1.66f, RecyclerView.B1, -3.0f, -1.34f, -3.0f, -3.0f);
        ww2Var.q(1.34f, -3.0f, 3.0f, -3.0f);
        ww2Var.q(3.0f, 1.34f, 3.0f, 3.0f);
        ww2Var.q(-1.34f, 3.0f, -3.0f, 3.0f);
        ww2Var.g();
        ww2Var.o(15.0f, 9.0f);
        ww2Var.m(5.0f, 9.0f);
        ww2Var.m(5.0f, 5.0f);
        ww2Var.l(10.0f);
        ww2Var.u(4.0f);
        ww2Var.g();
        d33.a(d33Var, ww2Var.b, 0, cn6Var);
        e33 b2 = d33Var.b();
        f = b2;
        return b2;
    }

    public static final e33 D() {
        e33 e33Var = g;
        if (e33Var != null) {
            return e33Var;
        }
        d33 d33Var = new d33("Filled.Star", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = el7.a;
        cn6 cn6Var = new cn6(kt0.b);
        ww2 ww2Var = new ww2(1, (byte) 0);
        ww2Var.o(12.0f, 17.27f);
        ww2Var.m(18.18f, 21.0f);
        ww2Var.n(-1.64f, -7.03f);
        ww2Var.m(22.0f, 9.24f);
        ww2Var.n(-7.19f, -0.61f);
        ww2Var.m(12.0f, 2.0f);
        ww2Var.m(9.19f, 8.63f);
        ww2Var.m(2.0f, 9.24f);
        ww2Var.n(5.46f, 4.73f);
        ww2Var.m(5.82f, 21.0f);
        ww2Var.g();
        d33.a(d33Var, ww2Var.b, 0, cn6Var);
        e33 b2 = d33Var.b();
        g = b2;
        return b2;
    }

    public static void E(String str, String str2) {
        String c0 = c0(str);
        if (J(4, c0)) {
            Log.i(c0, str2);
        }
    }

    public static boolean F(String str) {
        return J(3, c0(str));
    }

    public static boolean G() {
        return J(6, c0("CXCP"));
    }

    public static boolean H() {
        return J(4, c0("CXCP"));
    }

    public static boolean I(String str, String str2) {
        if (str.startsWith(str2.concat("(")) && str.endsWith(")")) {
            return true;
        }
        return false;
    }

    public static boolean J(int i, String str) {
        if (c > i && !Log.isLoggable(str, i)) {
            return false;
        }
        return true;
    }

    public static boolean K(byte b2) {
        if (b2 > -65) {
            return true;
        }
        return false;
    }

    public static boolean L() {
        return J(5, c0("CXCP"));
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [u36, java.lang.Object, go3] */
    /* JADX WARN: Type inference failed for: r2v6, types: [bh7, java.lang.Object, go3] */
    public static go3 M(xr3 xr3Var, on2 on2Var) {
        xd5 xd5Var = xd5.u0;
        xr3Var.getClass();
        int i = mp3.a[xr3Var.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    ?? obj = new Object();
                    obj.A = on2Var;
                    obj.B = xd5Var;
                    return obj;
                }
                i.d();
                return null;
            }
            ?? obj2 = new Object();
            obj2.A = on2Var;
            obj2.B = xd5Var;
            return obj2;
        }
        return new ex6(on2Var);
    }

    public static ex6 N(on2 on2Var) {
        on2Var.getClass();
        return new ex6(on2Var);
    }

    public static final ge6 O(ge6 ge6Var, ge6 ge6Var2, float f2) {
        return new ge6(oi2.L(ge6Var.c, ge6Var2.c, f2), hv.M(f2, ge6Var.a, ge6Var2.a), gi2.J(f2, ge6Var.b, ge6Var2.b));
    }

    /* JADX WARN: Code restructure failed: missing block: B:82:0x0166, code lost:
        if (r3 == r9) goto L66;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00bd A[Catch: all -> 0x0055, TryCatch #1 {all -> 0x0055, blocks: (B:21:0x0051, B:44:0x00b5, B:46:0x00bd, B:48:0x00c9, B:50:0x00d5, B:41:0x009b), top: B:99:0x002d }] */
    /* JADX WARN: Type inference failed for: r2v8, types: [zg5, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object P(mw6 mw6Var, ci ciVar, ei eiVar, oy4 oy4Var, d20 d20Var) {
        ia6 ia6Var;
        int i;
        fa6 fa6Var;
        boolean z;
        jt3 jt3Var;
        fa6 fa6Var2;
        boolean z2;
        zg5 zg5Var;
        mw6 mw6Var2 = mw6Var;
        ci ciVar2 = ciVar;
        u34 u34Var = xd5.o0;
        try {
            try {
                if (d20Var instanceof ia6) {
                    ia6 ia6Var2 = (ia6) d20Var;
                    int i2 = ia6Var2.d0;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        ia6Var2.d0 = i2 - Integer.MIN_VALUE;
                        ia6Var = ia6Var2;
                        ia6 ia6Var3 = ia6Var;
                        Object obj = ia6Var3.Z;
                        x61 x61Var = x61.COROUTINE_SUSPENDED;
                        i = ia6Var3.d0;
                        int i3 = 0;
                        if (i == 0) {
                            if (i != 1) {
                                if (i == 2) {
                                    zg5 zg5Var2 = ia6Var3.Y;
                                    ciVar2 = ia6Var3.X;
                                    mw6 mw6Var3 = ia6Var3.R;
                                    oi2.Y(obj);
                                    zg5Var = zg5Var2;
                                    mw6Var2 = mw6Var3;
                                    if (((Boolean) obj).booleanValue() && zg5Var.A) {
                                        List list = mw6Var2.Y.p0.a;
                                        int size = list.size();
                                        while (i3 < size) {
                                            vy4 vy4Var = (vy4) list.get(i3);
                                            if (ej2.o(vy4Var)) {
                                                vy4Var.a();
                                            }
                                            i3++;
                                        }
                                    }
                                    ciVar2.n();
                                    return jg7.a;
                                }
                                i.m("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            ciVar2 = ia6Var3.X;
                            mw6Var2 = ia6Var3.R;
                            oi2.Y(obj);
                            if (((Boolean) obj).booleanValue()) {
                                List list2 = mw6Var2.Y.p0.a;
                                int size2 = list2.size();
                                while (i3 < size2) {
                                    vy4 vy4Var2 = (vy4) list2.get(i3);
                                    if (ej2.o(vy4Var2)) {
                                        vy4Var2.a();
                                    }
                                    i3++;
                                }
                            }
                            return jg7.a;
                        }
                        oi2.Y(obj);
                        vy4 vy4Var3 = (vy4) oy4Var.a.get(0);
                        if ((oy4Var.e & 1) != 0) {
                            long j = vy4Var3.c;
                            p27 p27Var = (p27) ciVar2.R;
                            jt3 jt3Var2 = p27Var.d;
                            if (jt3Var2 != null && jt3Var2.d() != null && p27Var.k()) {
                                p27Var.t = -1;
                                nh2 nh2Var = p27Var.l;
                                if (nh2Var != null) {
                                    nh2.a(nh2Var);
                                }
                                ciVar2.q(p27Var.n(), j, false, xd5.o0);
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (z2) {
                                vy4Var3.a();
                                long j2 = vy4Var3.a;
                                ro5 ro5Var = new ro5(ciVar2, 9);
                                ia6Var3.R = mw6Var2;
                                ia6Var3.X = ciVar2;
                                ia6Var3.d0 = 1;
                                obj = sn1.e(mw6Var2, j2, ro5Var, ia6Var3);
                                if (obj == x61Var) {
                                    return x61Var;
                                }
                                if (((Boolean) obj).booleanValue()) {
                                }
                            }
                            return jg7.a;
                        }
                        int i4 = eiVar.B;
                        if (i4 != 1) {
                            if (i4 != 2) {
                                fa6Var2 = xd5.q0;
                            } else {
                                fa6Var2 = xd5.p0;
                            }
                            fa6Var = fa6Var2;
                        } else {
                            fa6Var = u34Var;
                        }
                        long j3 = vy4Var3.c;
                        p27 p27Var2 = (p27) ciVar2.R;
                        if (p27Var2.k() && p27Var2.n().a.B.length() != 0 && (jt3Var = p27Var2.d) != null && jt3Var.d() != null) {
                            nh2 nh2Var2 = p27Var2.l;
                            if (nh2Var2 != null) {
                                nh2.a(nh2Var2);
                            }
                            p27Var2.o = j3;
                            p27Var2.t = -1;
                            p27Var2.h(true);
                            long q = ciVar2.q(p27Var2.n(), p27Var2.o, true, fa6Var);
                            if (i4 >= 2) {
                                ciVar2.B = true;
                                ciVar2.L = new k47(q);
                            }
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z) {
                            ?? obj2 = new Object();
                            obj2.A = !fa6Var.equals(u34Var);
                            long j4 = vy4Var3.a;
                            t00 t00Var = new t00(ciVar2, fa6Var, (Object) obj2, 24);
                            ia6Var3.R = mw6Var2;
                            ia6Var3.X = ciVar2;
                            ia6Var3.Y = obj2;
                            ia6Var3.d0 = 2;
                            obj = sn1.e(mw6Var2, j4, t00Var, ia6Var3);
                            zg5Var = obj2;
                        }
                        return jg7.a;
                    }
                }
                if (i == 0) {
                }
            } finally {
            }
        } finally {
        }
        ia6Var = new s41(d20Var);
        ia6 ia6Var32 = ia6Var;
        Object obj3 = ia6Var32.Z;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i = ia6Var32.d0;
        int i32 = 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static List Q(pk6 pk6Var, int i, pk6 pk6Var2, boolean z, boolean z2, boolean z3) {
        boolean z4;
        yt1 yt1Var;
        boolean z5;
        boolean z6;
        int i2;
        int i3;
        int i4;
        int u = pk6Var.u(i);
        int i5 = i + u;
        int f2 = pk6Var.f(i);
        int f3 = pk6Var.f(i5);
        int i6 = f3 - f2;
        if (i >= 0 && (pk6Var.b[(pk6Var.r(i) * 5) + 1] & 201326592) != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        pk6Var2.w(u);
        pk6Var2.x(i6, pk6Var2.t);
        if (pk6Var.g < i5) {
            pk6Var.B(i5);
        }
        if (pk6Var.k < f3) {
            pk6Var.C(f3, i5);
        }
        int[] iArr = pk6Var2.b;
        int i7 = pk6Var2.t;
        int i8 = i7 * 5;
        fv.r0(i8, i * 5, i5 * 5, pk6Var.b, iArr);
        Object[] objArr = pk6Var2.c;
        int i9 = pk6Var2.i;
        System.arraycopy(pk6Var.c, f2, objArr, i9, i6);
        int i10 = pk6Var2.v;
        iArr[i8 + 2] = i10;
        int i11 = i7 - i;
        int i12 = i7 + u;
        int g2 = i9 - pk6Var2.g(iArr, i7);
        int i13 = pk6Var2.m;
        int i14 = pk6Var2.l;
        int length = objArr.length;
        boolean z7 = z4;
        int i15 = i13;
        int i16 = i7;
        while (i16 < i12) {
            if (i16 != i7) {
                int i17 = (i16 * 5) + 2;
                iArr[i17] = iArr[i17] + i11;
            }
            int[] iArr2 = iArr;
            int g3 = pk6Var2.g(iArr, i16) + g2;
            if (i15 < i16) {
                i3 = i7;
                i4 = 0;
            } else {
                i3 = i7;
                i4 = pk6Var2.k;
            }
            iArr2[(i16 * 5) + 4] = pk6.i(g3, i4, i14, length);
            if (i16 == i15) {
                i15++;
            }
            i16++;
            i7 = i3;
            iArr = iArr2;
        }
        int[] iArr3 = iArr;
        pk6Var2.m = i15;
        int a2 = ok6.a(pk6Var.d, i, pk6Var.p());
        int a3 = ok6.a(pk6Var.d, i5, pk6Var.p());
        if (a2 < a3) {
            ArrayList arrayList = pk6Var.d;
            ArrayList arrayList2 = new ArrayList(a3 - a2);
            for (int i18 = a2; i18 < a3; i18++) {
                sq2 sq2Var = (sq2) arrayList.get(i18);
                sq2Var.a += i11;
                arrayList2.add(sq2Var);
            }
            pk6Var2.d.addAll(ok6.a(pk6Var2.d, pk6Var2.t, pk6Var2.p()), arrayList2);
            arrayList.subList(a2, a3).clear();
            yt1Var = arrayList2;
        } else {
            yt1Var = yt1.A;
        }
        if (!yt1Var.isEmpty()) {
            HashMap hashMap = pk6Var.e;
            HashMap hashMap2 = pk6Var2.e;
            if (hashMap != null && hashMap2 != null) {
                int size = yt1Var.size();
                for (int i19 = 0; i19 < size; i19++) {
                    zq2 zq2Var = (zq2) hashMap.get((sq2) yt1Var.get(i19));
                }
            }
        }
        int i20 = pk6Var2.v;
        pk6Var2.O(i10);
        int E = pk6Var.E(pk6Var.b, i);
        if (!z3) {
            z5 = false;
        } else if (z) {
            if (E >= 0) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (z6) {
                pk6Var.P();
                pk6Var.a(E - pk6Var.t);
                pk6Var.P();
            }
            pk6Var.a(i - pk6Var.t);
            boolean H = pk6Var.H();
            if (z6) {
                pk6Var.M();
                pk6Var.j();
                pk6Var.M();
                pk6Var.j();
            }
            z5 = H;
        } else {
            boolean I = pk6Var.I(i, u);
            pk6Var.J(f2, i6, i - 1);
            z5 = I;
        }
        if (z5) {
            tx0.a("Unexpectedly removed anchors");
        }
        int i21 = pk6Var2.o;
        int i22 = iArr3[i8 + 1];
        if ((1073741824 & i22) != 0) {
            i2 = 1;
        } else {
            i2 = i22 & 67108863;
        }
        pk6Var2.o = i21 + i2;
        if (z2) {
            pk6Var2.t = i12;
            pk6Var2.i = i9 + i6;
        }
        if (z7) {
            pk6Var2.T(i10);
        }
        return yt1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:137:0x0372  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0396  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x03df  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x03e4  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x03fc  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0402  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x040c  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0427  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x042d  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0435  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0445  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0448  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x044e  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0239  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final sr4 R(px0 px0Var, int i) {
        TypedValue typedValue;
        f33 f33Var;
        xq2 xq2Var;
        boolean z;
        long j;
        int i2;
        int i3;
        f33 f33Var2;
        int eventType;
        String str;
        xq2 xq2Var2;
        int i4;
        String str2;
        String str3;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        Shader shader;
        Resources resources;
        f80 cn6Var;
        Shader shader2;
        f80 cn6Var2;
        f80 f80Var;
        int i10;
        String str4;
        xq2 xq2Var3 = (xq2) px0Var;
        Context context = (Context) xq2Var3.j(kf.b);
        Resources resources2 = (Resources) xq2Var3.j(kf.c);
        ml5 ml5Var = (ml5) xq2Var3.j(kf.e);
        synchronized (ml5Var) {
            typedValue = (TypedValue) ml5Var.a.b(i);
            if (typedValue == null) {
                typedValue = new TypedValue();
                resources2.getValue(i, typedValue, true);
                p94 p94Var = ml5Var.a;
                int d2 = p94Var.d(i);
                Object[] objArr = p94Var.c;
                Object obj = objArr[d2];
                p94Var.b[d2] = i;
                objArr[d2] = typedValue;
            }
        }
        CharSequence charSequence = typedValue.string;
        if (charSequence != null && qs6.l0(charSequence, ".xml")) {
            xq2Var3.b0(-1771798434);
            Resources.Theme theme = context.getTheme();
            int i11 = typedValue.changingConfigurations;
            h33 h33Var = (h33) xq2Var3.j(kf.d);
            g33 g33Var = new g33(theme, i);
            WeakReference weakReference = (WeakReference) h33Var.a.get(g33Var);
            if (weakReference != null) {
                f33Var = (f33) weakReference.get();
            } else {
                f33Var = null;
            }
            if (f33Var == null) {
                XmlResourceParser xml = resources2.getXml(i);
                int next = xml.next();
                while (next != 2 && next != 1) {
                    next = xml.next();
                }
                if (next == 2) {
                    if (nb3.k(xml.getName(), "vector")) {
                        String str5 = "ImageVector.Builder is single use, create a new instance to create a new ImageVector";
                        AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
                        wm wmVar = new wm(xml);
                        XmlPullParser xmlPullParser = wmVar.a;
                        TypedArray D = xk2.D(resources2, theme, asAttributeSet, mb3.a);
                        wmVar.b(D.getChangingConfigurations());
                        if (!xk2.v(xml, "autoMirrored")) {
                            z = false;
                        } else {
                            z = D.getBoolean(5, false);
                        }
                        wmVar.b(D.getChangingConfigurations());
                        float a2 = wmVar.a(D, "viewportWidth", 7, RecyclerView.B1);
                        float a3 = wmVar.a(D, "viewportHeight", 8, RecyclerView.B1);
                        if (a2 > RecyclerView.B1) {
                            if (a3 > RecyclerView.B1) {
                                float dimension = D.getDimension(3, RecyclerView.B1);
                                wmVar.b(D.getChangingConfigurations());
                                float dimension2 = D.getDimension(2, RecyclerView.B1);
                                wmVar.b(D.getChangingConfigurations());
                                if (D.hasValue(1)) {
                                    TypedValue typedValue2 = new TypedValue();
                                    D.getValue(1, typedValue2);
                                    if (typedValue2.type == 2) {
                                        j = kt0.h;
                                    } else {
                                        ColorStateList p = xk2.p(D, xml, theme);
                                        wmVar.b(D.getChangingConfigurations());
                                        if (p != null) {
                                            j = hv.b(p.getDefaultColor());
                                        } else {
                                            j = kt0.h;
                                        }
                                    }
                                } else {
                                    j = kt0.h;
                                }
                                long j2 = j;
                                int i12 = D.getInt(6, -1);
                                wmVar.b(D.getChangingConfigurations());
                                if (i12 != -1) {
                                    if (i12 != 3) {
                                        if (i12 != 5) {
                                            if (i12 != 9) {
                                                switch (i12) {
                                                    case 14:
                                                        i2 = 13;
                                                        break;
                                                    case 15:
                                                        i2 = 14;
                                                        break;
                                                    case 16:
                                                        i2 = 12;
                                                        break;
                                                }
                                            } else {
                                                i2 = 9;
                                            }
                                        }
                                    } else {
                                        i2 = 3;
                                    }
                                    D.recycle();
                                    d33 d33Var = new d33(null, dimension / resources2.getDisplayMetrics().density, dimension2 / resources2.getDisplayMetrics().density, a2, a3, j2, i2, z, 1);
                                    ArrayList arrayList = d33Var.i;
                                    i3 = 0;
                                    while (xml.getEventType() != 1 && (xml.getDepth() >= 1 || xml.getEventType() != 3)) {
                                        List list = yt1.A;
                                        t9 t9Var = wmVar.c;
                                        XmlResourceParser xmlResourceParser = xml;
                                        eventType = xmlPullParser.getEventType();
                                        int i13 = i11;
                                        if (eventType == 2) {
                                            if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                                                int i14 = i3 + 1;
                                                for (int i15 = 0; i15 < i14; i15++) {
                                                    if (d33Var.k) {
                                                        p53.c(str5);
                                                    }
                                                    c33 c33Var = (c33) arrayList.remove(arrayList.size() - 1);
                                                    ((c33) arrayList.get(arrayList.size() - 1)).j.add(new dl7(c33Var.a, c33Var.b, c33Var.c, c33Var.d, c33Var.e, c33Var.f, c33Var.g, c33Var.h, c33Var.i, c33Var.j));
                                                }
                                                xq2Var2 = xq2Var3;
                                                str = str5;
                                                i4 = 0;
                                                xmlResourceParser.next();
                                                xq2Var3 = xq2Var2;
                                                xml = xmlResourceParser;
                                                i11 = i13;
                                                str5 = str;
                                                i3 = i4;
                                            }
                                        } else {
                                            String name = xmlPullParser.getName();
                                            if (name != null) {
                                                int hashCode = name.hashCode();
                                                str = str5;
                                                if (hashCode != -1649314686) {
                                                    i4 = i3;
                                                    if (hashCode != 3433509) {
                                                        if (hashCode == 98629247 && name.equals("group")) {
                                                            TypedArray D2 = xk2.D(resources2, theme, asAttributeSet, mb3.b);
                                                            wmVar.b(D2.getChangingConfigurations());
                                                            float a4 = wmVar.a(D2, "rotation", 5, RecyclerView.B1);
                                                            float f2 = D2.getFloat(1, RecyclerView.B1);
                                                            wmVar.b(D2.getChangingConfigurations());
                                                            float f3 = D2.getFloat(2, RecyclerView.B1);
                                                            wmVar.b(D2.getChangingConfigurations());
                                                            float a5 = wmVar.a(D2, "scaleX", 3, 1.0f);
                                                            float a6 = wmVar.a(D2, "scaleY", 4, 1.0f);
                                                            float a7 = wmVar.a(D2, "translateX", 6, RecyclerView.B1);
                                                            float a8 = wmVar.a(D2, "translateY", 7, RecyclerView.B1);
                                                            String string = D2.getString(0);
                                                            wmVar.b(D2.getChangingConfigurations());
                                                            if (string == null) {
                                                                str4 = "";
                                                            } else {
                                                                str4 = string;
                                                            }
                                                            D2.recycle();
                                                            int i16 = el7.a;
                                                            if (d33Var.k) {
                                                                p53.c(str);
                                                            }
                                                            arrayList.add(new c33(str4, a4, f2, f3, a5, a6, a7, a8, list, 512));
                                                        }
                                                    } else if (name.equals("path")) {
                                                        TypedArray D3 = xk2.D(resources2, theme, asAttributeSet, mb3.c);
                                                        wmVar.b(D3.getChangingConfigurations());
                                                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
                                                            String string2 = D3.getString(0);
                                                            wmVar.b(D3.getChangingConfigurations());
                                                            if (string2 == null) {
                                                                str3 = "";
                                                            } else {
                                                                str3 = string2;
                                                            }
                                                            String string3 = D3.getString(2);
                                                            wmVar.b(D3.getChangingConfigurations());
                                                            if (string3 == null) {
                                                                int i17 = el7.a;
                                                            } else {
                                                                list = t9.a(t9Var, string3);
                                                            }
                                                            List list2 = list;
                                                            ei q = xk2.q(D3, xmlPullParser, theme, "fillColor", 1);
                                                            wmVar.b(D3.getChangingConfigurations());
                                                            float a9 = wmVar.a(D3, "fillAlpha", 12, 1.0f);
                                                            if (!xk2.v(xmlPullParser, "strokeLineCap")) {
                                                                i5 = -1;
                                                            } else {
                                                                i5 = D3.getInt(8, -1);
                                                            }
                                                            wmVar.b(D3.getChangingConfigurations());
                                                            if (i5 != 0) {
                                                                if (i5 != 1) {
                                                                    if (i5 == 2) {
                                                                        i6 = 2;
                                                                    }
                                                                } else {
                                                                    i6 = 1;
                                                                }
                                                                if (xk2.v(xmlPullParser, "strokeLineJoin")) {
                                                                    i7 = -1;
                                                                } else {
                                                                    i7 = D3.getInt(9, -1);
                                                                }
                                                                wmVar.b(D3.getChangingConfigurations());
                                                                if (i7 != 0) {
                                                                    if (i7 != 1) {
                                                                        if (i7 == 2) {
                                                                            i8 = 2;
                                                                        }
                                                                    } else {
                                                                        i8 = 1;
                                                                    }
                                                                    float a10 = wmVar.a(D3, "strokeMiterLimit", 10, 4.0f);
                                                                    ei q2 = xk2.q(D3, xmlPullParser, theme, "strokeColor", 3);
                                                                    wmVar.b(D3.getChangingConfigurations());
                                                                    float a11 = wmVar.a(D3, "strokeAlpha", 11, 1.0f);
                                                                    float a12 = wmVar.a(D3, "strokeWidth", 4, 1.0f);
                                                                    float a13 = wmVar.a(D3, "trimPathEnd", 6, 1.0f);
                                                                    xq2Var2 = xq2Var3;
                                                                    float a14 = wmVar.a(D3, "trimPathOffset", 7, RecyclerView.B1);
                                                                    float a15 = wmVar.a(D3, "trimPathStart", 5, RecyclerView.B1);
                                                                    if (!xk2.v(xmlPullParser, "fillType")) {
                                                                        i9 = 0;
                                                                    } else {
                                                                        i9 = D3.getInt(13, 0);
                                                                    }
                                                                    wmVar.b(D3.getChangingConfigurations());
                                                                    D3.recycle();
                                                                    shader = (Shader) q.L;
                                                                    if (shader != null || q.B != 0) {
                                                                        if (shader != null) {
                                                                            resources = resources2;
                                                                            cn6Var = new g80(shader);
                                                                        } else {
                                                                            resources = resources2;
                                                                            cn6Var = new cn6(hv.b(q.B));
                                                                        }
                                                                    } else {
                                                                        resources = resources2;
                                                                        cn6Var = null;
                                                                    }
                                                                    shader2 = (Shader) q2.L;
                                                                    if (shader2 != null || q2.B != 0) {
                                                                        if (shader2 == null) {
                                                                            cn6Var2 = new g80(shader2);
                                                                        } else {
                                                                            cn6Var2 = new cn6(hv.b(q2.B));
                                                                        }
                                                                        f80Var = cn6Var2;
                                                                    } else {
                                                                        f80Var = null;
                                                                    }
                                                                    if (i9 == 0) {
                                                                        i10 = 0;
                                                                    } else {
                                                                        i10 = 1;
                                                                    }
                                                                    if (d33Var.k) {
                                                                        p53.c(str);
                                                                    }
                                                                    ((c33) arrayList.get(arrayList.size() - 1)).j.add(new hl7(str3, list2, i10, cn6Var, a9, f80Var, a11, a12, i6, i8, a10, a15, a13, a14));
                                                                    resources2 = resources;
                                                                }
                                                                i8 = 0;
                                                                float a102 = wmVar.a(D3, "strokeMiterLimit", 10, 4.0f);
                                                                ei q22 = xk2.q(D3, xmlPullParser, theme, "strokeColor", 3);
                                                                wmVar.b(D3.getChangingConfigurations());
                                                                float a112 = wmVar.a(D3, "strokeAlpha", 11, 1.0f);
                                                                float a122 = wmVar.a(D3, "strokeWidth", 4, 1.0f);
                                                                float a132 = wmVar.a(D3, "trimPathEnd", 6, 1.0f);
                                                                xq2Var2 = xq2Var3;
                                                                float a142 = wmVar.a(D3, "trimPathOffset", 7, RecyclerView.B1);
                                                                float a152 = wmVar.a(D3, "trimPathStart", 5, RecyclerView.B1);
                                                                if (!xk2.v(xmlPullParser, "fillType")) {
                                                                }
                                                                wmVar.b(D3.getChangingConfigurations());
                                                                D3.recycle();
                                                                shader = (Shader) q.L;
                                                                if (shader != null) {
                                                                    resources = resources2;
                                                                    cn6Var = null;
                                                                    shader2 = (Shader) q22.L;
                                                                    if (shader2 != null) {
                                                                        f80Var = null;
                                                                        if (i9 == 0) {
                                                                        }
                                                                        if (d33Var.k) {
                                                                        }
                                                                        ((c33) arrayList.get(arrayList.size() - 1)).j.add(new hl7(str3, list2, i10, cn6Var, a9, f80Var, a112, a122, i6, i8, a102, a152, a132, a142));
                                                                        resources2 = resources;
                                                                    }
                                                                    if (shader2 == null) {
                                                                    }
                                                                    f80Var = cn6Var2;
                                                                    if (i9 == 0) {
                                                                    }
                                                                    if (d33Var.k) {
                                                                    }
                                                                    ((c33) arrayList.get(arrayList.size() - 1)).j.add(new hl7(str3, list2, i10, cn6Var, a9, f80Var, a112, a122, i6, i8, a102, a152, a132, a142));
                                                                    resources2 = resources;
                                                                }
                                                                if (shader != null) {
                                                                }
                                                                shader2 = (Shader) q22.L;
                                                                if (shader2 != null) {
                                                                }
                                                                if (shader2 == null) {
                                                                }
                                                                f80Var = cn6Var2;
                                                                if (i9 == 0) {
                                                                }
                                                                if (d33Var.k) {
                                                                }
                                                                ((c33) arrayList.get(arrayList.size() - 1)).j.add(new hl7(str3, list2, i10, cn6Var, a9, f80Var, a112, a122, i6, i8, a102, a152, a132, a142));
                                                                resources2 = resources;
                                                            }
                                                            i6 = 0;
                                                            if (xk2.v(xmlPullParser, "strokeLineJoin")) {
                                                            }
                                                            wmVar.b(D3.getChangingConfigurations());
                                                            if (i7 != 0) {
                                                            }
                                                            i8 = 0;
                                                            float a1022 = wmVar.a(D3, "strokeMiterLimit", 10, 4.0f);
                                                            ei q222 = xk2.q(D3, xmlPullParser, theme, "strokeColor", 3);
                                                            wmVar.b(D3.getChangingConfigurations());
                                                            float a1122 = wmVar.a(D3, "strokeAlpha", 11, 1.0f);
                                                            float a1222 = wmVar.a(D3, "strokeWidth", 4, 1.0f);
                                                            float a1322 = wmVar.a(D3, "trimPathEnd", 6, 1.0f);
                                                            xq2Var2 = xq2Var3;
                                                            float a1422 = wmVar.a(D3, "trimPathOffset", 7, RecyclerView.B1);
                                                            float a1522 = wmVar.a(D3, "trimPathStart", 5, RecyclerView.B1);
                                                            if (!xk2.v(xmlPullParser, "fillType")) {
                                                            }
                                                            wmVar.b(D3.getChangingConfigurations());
                                                            D3.recycle();
                                                            shader = (Shader) q.L;
                                                            if (shader != null) {
                                                            }
                                                            if (shader != null) {
                                                            }
                                                            shader2 = (Shader) q222.L;
                                                            if (shader2 != null) {
                                                            }
                                                            if (shader2 == null) {
                                                            }
                                                            f80Var = cn6Var2;
                                                            if (i9 == 0) {
                                                            }
                                                            if (d33Var.k) {
                                                            }
                                                            ((c33) arrayList.get(arrayList.size() - 1)).j.add(new hl7(str3, list2, i10, cn6Var, a9, f80Var, a1122, a1222, i6, i8, a1022, a1522, a1322, a1422));
                                                            resources2 = resources;
                                                        } else {
                                                            xq2Var = xq2Var3;
                                                            i.h("No path data available");
                                                            f33Var2 = null;
                                                            h33Var.a.put(g33Var, new WeakReference(f33Var2));
                                                            f33Var = f33Var2;
                                                        }
                                                    }
                                                    xq2Var2 = xq2Var3;
                                                } else {
                                                    xq2Var2 = xq2Var3;
                                                    Resources resources3 = resources2;
                                                    i4 = i3;
                                                    if (!name.equals("clip-path")) {
                                                        resources2 = resources3;
                                                    } else {
                                                        resources2 = resources3;
                                                        TypedArray D4 = xk2.D(resources2, theme, asAttributeSet, mb3.d);
                                                        wmVar.b(D4.getChangingConfigurations());
                                                        String string4 = D4.getString(0);
                                                        wmVar.b(D4.getChangingConfigurations());
                                                        if (string4 == null) {
                                                            str2 = "";
                                                        } else {
                                                            str2 = string4;
                                                        }
                                                        String string5 = D4.getString(1);
                                                        wmVar.b(D4.getChangingConfigurations());
                                                        if (string5 == null) {
                                                            int i18 = el7.a;
                                                        } else {
                                                            list = t9.a(t9Var, string5);
                                                        }
                                                        List list3 = list;
                                                        D4.recycle();
                                                        if (d33Var.k) {
                                                            p53.c(str);
                                                        }
                                                        arrayList.add(new c33(str2, RecyclerView.B1, RecyclerView.B1, RecyclerView.B1, 1.0f, 1.0f, RecyclerView.B1, RecyclerView.B1, list3, 512));
                                                        i4++;
                                                    }
                                                }
                                                xmlResourceParser.next();
                                                xq2Var3 = xq2Var2;
                                                xml = xmlResourceParser;
                                                i11 = i13;
                                                str5 = str;
                                                i3 = i4;
                                            }
                                        }
                                        xq2Var2 = xq2Var3;
                                        str = str5;
                                        i4 = i3;
                                        xmlResourceParser.next();
                                        xq2Var3 = xq2Var2;
                                        xml = xmlResourceParser;
                                        i11 = i13;
                                        str5 = str;
                                        i3 = i4;
                                    }
                                    xq2Var = xq2Var3;
                                    f33Var2 = new f33(d33Var.b(), i11 | wmVar.b);
                                    h33Var.a.put(g33Var, new WeakReference(f33Var2));
                                    f33Var = f33Var2;
                                }
                                i2 = 5;
                                D.recycle();
                                d33 d33Var2 = new d33(null, dimension / resources2.getDisplayMetrics().density, dimension2 / resources2.getDisplayMetrics().density, a2, a3, j2, i2, z, 1);
                                ArrayList arrayList2 = d33Var2.i;
                                i3 = 0;
                                while (xml.getEventType() != 1) {
                                    List list4 = yt1.A;
                                    t9 t9Var2 = wmVar.c;
                                    XmlResourceParser xmlResourceParser2 = xml;
                                    eventType = xmlPullParser.getEventType();
                                    int i132 = i11;
                                    if (eventType == 2) {
                                    }
                                    xq2Var2 = xq2Var3;
                                    str = str5;
                                    i4 = i3;
                                    xmlResourceParser2.next();
                                    xq2Var3 = xq2Var2;
                                    xml = xmlResourceParser2;
                                    i11 = i132;
                                    str5 = str;
                                    i3 = i4;
                                }
                                xq2Var = xq2Var3;
                                f33Var2 = new f33(d33Var2.b(), i11 | wmVar.b);
                                h33Var.a.put(g33Var, new WeakReference(f33Var2));
                                f33Var = f33Var2;
                            } else {
                                throw new XmlPullParserException(D.getPositionDescription() + "<VectorGraphic> tag requires viewportHeight > 0");
                            }
                        } else {
                            throw new XmlPullParserException(D.getPositionDescription() + "<VectorGraphic> tag requires viewportWidth > 0");
                        }
                    } else {
                        i.h("Only VectorDrawables and rasterized asset types are supported ex. PNG, JPG, WEBP");
                        return null;
                    }
                } else {
                    throw new XmlPullParserException("No start tag found");
                }
            } else {
                xq2Var = xq2Var3;
            }
            xq2 xq2Var4 = xq2Var;
            gl7 Z = kn2.Z(f33Var.a, xq2Var4);
            xq2Var4.p(false);
            return Z;
        }
        xq2Var3.b0(-1771643000);
        boolean f4 = xq2Var3.f(context.getTheme()) | xq2Var3.f(charSequence) | xq2Var3.d(i);
        Object P = xq2Var3.P();
        if (f4 || P == ox0.a) {
            try {
                Drawable drawable = resources2.getDrawable(i, null);
                drawable.getClass();
                P = new zh(((BitmapDrawable) drawable).getBitmap());
                xq2Var3.l0(P);
            } catch (Exception e2) {
                throw new RuntimeException("Error attempting to load resource: " + ((Object) charSequence), e2);
            }
        }
        w40 w40Var = new w40((zh) P);
        xq2Var3.p(false);
        return w40Var;
    }

    public static a74 S(a74 a74Var, sj sjVar) {
        return a74Var.d(new ry4(sjVar));
    }

    public static void T(float f2, float[] fArr) {
        Matrix.translateM(fArr, 0, 0.5f, 0.5f, RecyclerView.B1);
        Matrix.rotateM(fArr, 0, f2, RecyclerView.B1, RecyclerView.B1, 1.0f);
        Matrix.translateM(fArr, 0, -0.5f, -0.5f, RecyclerView.B1);
    }

    public static void U(float[] fArr) {
        Matrix.translateM(fArr, 0, RecyclerView.B1, 0.5f, RecyclerView.B1);
        Matrix.scaleM(fArr, 0, 1.0f, -1.0f, 1.0f);
        Matrix.translateM(fArr, 0, -0.0f, -0.5f, RecyclerView.B1);
    }

    public static void V(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (checkableImageButton.getDrawable() != null && colorStateList != null && colorStateList.isStateful()) {
            int[] drawableState = textInputLayout.getDrawableState();
            int[] drawableState2 = checkableImageButton.getDrawableState();
            int length = drawableState.length;
            int[] copyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
            System.arraycopy(drawableState2, 0, copyOf, length, drawableState2.length);
            int colorForState = colorStateList.getColorForState(copyOf, colorStateList.getDefaultColor());
            Drawable mutate = drawable.mutate();
            mutate.setTintList(ColorStateList.valueOf(colorForState));
            checkableImageButton.setImageDrawable(mutate);
        }
    }

    public static int W(Context context, int i, int i2) {
        TypedValue M = qo2.M(context, i);
        if (M != null && M.type == 16) {
            return M.data;
        }
        return i2;
    }

    public static TimeInterpolator X(Context context, int i, TimeInterpolator timeInterpolator) {
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i, typedValue, true)) {
            return timeInterpolator;
        }
        if (typedValue.type == 3) {
            String valueOf = String.valueOf(typedValue.string);
            if (!I(valueOf, "cubic-bezier") && !I(valueOf, "path")) {
                return AnimationUtils.loadInterpolator(context, typedValue.resourceId);
            }
            if (I(valueOf, "cubic-bezier")) {
                String[] split = valueOf.substring(13, valueOf.length() - 1).split(",");
                if (split.length == 4) {
                    return new PathInterpolator(A(split, 0), A(split, 1), A(split, 2), A(split, 3));
                }
                e41.n(split.length, "Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: ");
                return null;
            } else if (I(valueOf, "path")) {
                String substring = valueOf.substring(5, valueOf.length() - 1);
                Path path = new Path();
                try {
                    iu4.b(kn2.B(substring), path);
                    return new PathInterpolator(path);
                } catch (RuntimeException e2) {
                    u34.p("Error in parsing ".concat(substring), e2);
                    return null;
                }
            } else {
                i.h("Invalid motion easing type: ".concat(valueOf));
                return null;
            }
        }
        i.h("Motion easing theme attribute must be an @interpolator resource for ?attr/motionEasing*Interpolator attributes or a string for ?attr/motionEasing* attributes.");
        return null;
    }

    public static void Y(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        boolean z;
        boolean hasOnClickListeners = checkableImageButton.hasOnClickListeners();
        boolean z2 = false;
        int i = 1;
        if (onLongClickListener != null) {
            z = true;
        } else {
            z = false;
        }
        if (hasOnClickListeners || z) {
            z2 = true;
        }
        checkableImageButton.setFocusable(z2);
        checkableImageButton.setClickable(hasOnClickListeners);
        checkableImageButton.setPressable(hasOnClickListeners);
        checkableImageButton.setLongClickable(z);
        if (!z2) {
            i = 2;
        }
        checkableImageButton.setImportantForAccessibility(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0039 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object Z(int i, Object obj, ll5 ll5Var, oj2 oj2Var, int i2) {
        Object[] objArr;
        Object[] objArr2;
        int i3;
        Typeface create;
        Object[] objArr3;
        if (!(obj instanceof Typeface)) {
            return obj;
        }
        boolean z = false;
        int i4 = 0;
        z = false;
        if ((i & 1) != 0 && !nb3.k(ll5Var.b, oj2Var)) {
            oj2 oj2Var2 = oj2.R;
            if (oj2Var.compareTo(oj2Var2) >= 0 && nb3.p(ll5Var.b.A, oj2Var2.A) < 0) {
                objArr = 1;
                if ((i & 2) != 0) {
                    ll5Var.getClass();
                    if (i2 != 0) {
                        objArr2 = 1;
                        if (objArr2 != null && objArr == null) {
                            return obj;
                        }
                        if (Build.VERSION.SDK_INT < 28) {
                            if (objArr2 != null && i2 == 1) {
                                objArr3 = 1;
                            } else {
                                objArr3 = null;
                            }
                            if (objArr3 != null && objArr != null) {
                                i4 = 3;
                            } else if (objArr != null) {
                                i4 = 1;
                            } else if (objArr3 != null) {
                                i4 = 2;
                            }
                            return Typeface.create((Typeface) obj, i4);
                        }
                        if (objArr != null) {
                            i3 = oj2Var.A;
                        } else {
                            i3 = ll5Var.b.A;
                        }
                        if (objArr2 != null) {
                            if (i2 == 1) {
                                z = true;
                            }
                        } else {
                            ll5Var.getClass();
                        }
                        create = Typeface.create((Typeface) obj, i3, z);
                        return create;
                    }
                }
                objArr2 = null;
                if (objArr2 != null) {
                }
                if (Build.VERSION.SDK_INT < 28) {
                }
            }
        }
        objArr = null;
        if ((i & 2) != 0) {
        }
        objArr2 = null;
        if (objArr2 != null) {
        }
        if (Build.VERSION.SDK_INT < 28) {
        }
    }

    public static final void a(r3 r3Var, px0 px0Var, int i) {
        int i2;
        boolean z;
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(1372074852);
        if (xq2Var.h(r3Var)) {
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
        if (xq2Var.S(i3 & 1, z)) {
            f04.a(ge7.O(x64.a, 8.0f), r3Var.c, r3Var.e, null, n16.I(759418494, new ov4(r3Var, 8), xq2Var), xq2Var, 24582, 8);
        } else {
            xq2Var.V();
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new z5(r3Var, i, 17);
        }
    }

    public static final vr4 a0(Object obj, Object obj2) {
        return new vr4(obj, obj2);
    }

    public static final of5 b(long j, long j2) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        return new of5(Float.intBitsToFloat(i), Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j2 >> 32)) + Float.intBitsToFloat(i), Float.intBitsToFloat((int) (j2 & 4294967295L)) + Float.intBitsToFloat(i2));
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x009e, code lost:
        if (r15 == r1) goto L42;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0067 A[Catch: CancellationException -> 0x0031, TryCatch #0 {CancellationException -> 0x0031, blocks: (B:13:0x002c, B:36:0x00a1, B:38:0x00a9, B:40:0x00b5, B:42:0x00c1, B:43:0x00c4, B:44:0x00c7, B:45:0x00cb, B:20:0x0040, B:26:0x0063, B:28:0x0067, B:33:0x0086, B:23:0x004a), top: B:50:0x0022 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b0(mw6 mw6Var, g17 g17Var, oy4 oy4Var, d20 d20Var) {
        ja6 ja6Var;
        int i;
        vy4 vy4Var;
        vy4 vy4Var2;
        boolean z;
        try {
            if (d20Var instanceof ja6) {
                ja6 ja6Var2 = (ja6) d20Var;
                int i2 = ja6Var2.d0;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    ja6Var2.d0 = i2 - Integer.MIN_VALUE;
                    ja6Var = ja6Var2;
                    Object obj = ja6Var.Z;
                    x61 x61Var = x61.COROUTINE_SUSPENDED;
                    i = ja6Var.d0;
                    if (i == 0) {
                        if (i != 1) {
                            if (i == 2) {
                                g17Var = ja6Var.X;
                                mw6Var = ja6Var.R;
                                oi2.Y(obj);
                                if (((Boolean) obj).booleanValue()) {
                                    List list = mw6Var.Y.p0.a;
                                    int size = list.size();
                                    for (int i3 = 0; i3 < size; i3++) {
                                        vy4 vy4Var3 = (vy4) list.get(i3);
                                        if (ej2.o(vy4Var3)) {
                                            vy4Var3.a();
                                        }
                                    }
                                    g17Var.b();
                                } else {
                                    g17Var.onCancel();
                                }
                                return jg7.a;
                            }
                            i.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        vy4 vy4Var4 = ja6Var.Y;
                        g17Var = ja6Var.X;
                        mw6 mw6Var2 = ja6Var.R;
                        oi2.Y(obj);
                        vy4Var = vy4Var4;
                        mw6Var = mw6Var2;
                    } else {
                        oi2.Y(obj);
                        vy4Var = (vy4) gt0.H0(oy4Var.a);
                        long j = vy4Var.a;
                        ja6Var.R = mw6Var;
                        ja6Var.X = g17Var;
                        ja6Var.Y = vy4Var;
                        ja6Var.d0 = 1;
                        obj = sn1.b(mw6Var, j, ja6Var);
                        if (obj == x61Var) {
                            return x61Var;
                        }
                    }
                    vy4Var2 = (vy4) obj;
                    if (vy4Var2 != null) {
                        long j2 = vy4Var2.c;
                        if (jk4.d(jk4.e(vy4Var.c, j2)) < sn1.g(mw6Var.f(), vy4Var.i)) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z) {
                            g17Var.a(j2, ma6.a);
                            long j3 = vy4Var2.a;
                            cz3 cz3Var = new cz3(g17Var, 1);
                            ja6Var.R = mw6Var;
                            ja6Var.X = g17Var;
                            ja6Var.Y = null;
                            ja6Var.d0 = 2;
                            obj = sn1.e(mw6Var, j3, cz3Var, ja6Var);
                        }
                    }
                    return jg7.a;
                }
            }
            if (i == 0) {
            }
            vy4Var2 = (vy4) obj;
            if (vy4Var2 != null) {
            }
            return jg7.a;
        } catch (CancellationException e2) {
            g17Var.onCancel();
            throw e2;
        }
        ja6Var = new s41(d20Var);
        Object obj2 = ja6Var.Z;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i = ja6Var.d0;
    }

    public static final void c(String str, on2 on2Var, eo2 eo2Var, px0 px0Var, int i) {
        int i2;
        int i3;
        boolean z;
        boolean z2;
        int i4;
        int i5;
        on2Var.getClass();
        eo2Var.getClass();
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(1397612710);
        if ((i & 6) == 0) {
            if (xq2Var.f(str)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i2 = i | i5;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (xq2Var.h(on2Var)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i2 |= i4;
        }
        if (xq2Var.h(eo2Var)) {
            i3 = 256;
        } else {
            i3 = 128;
        }
        int i6 = i2 | i3;
        if ((i6 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (xq2Var.S(i6 & 1, z)) {
            Object[] objArr = new Object[0];
            if ((i6 & 14) == 4) {
                z2 = true;
            } else {
                z2 = false;
            }
            Object P = xq2Var.P();
            vs0 vs0Var = ox0.a;
            if (z2 || P == vs0Var) {
                P = new lc4(str, 1);
                xq2Var.l0(P);
            }
            qa4 qa4Var = (qa4) qo2.I(objArr, (on2) P, xq2Var, 0);
            Object P2 = xq2Var.P();
            if (P2 == vs0Var) {
                P2 = np2.Y("");
                xq2Var.l0(P2);
            }
            nw7.o(on2Var, new jj1(3, false, false), n16.I(1384474927, new jn5(qa4Var, (qa4) P2, on2Var, eo2Var, 1), xq2Var), xq2Var, ((i6 >> 3) & 14) | 432, 0);
        } else {
            xq2Var.V();
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new rl(str, on2Var, eo2Var, i, 16);
        }
    }

    public static String c0(String str) {
        if (Build.VERSION.SDK_INT <= 25 && 23 < str.length()) {
            return str.substring(0, 23);
        }
        return str;
    }

    public static void d(byte b2, byte b3, byte b4, byte b5, char[] cArr, int i) {
        if (!K(b3)) {
            if ((((b3 + 112) + (b2 << 28)) >> 30) == 0 && !K(b4) && !K(b5)) {
                int i2 = ((b2 & 7) << 18) | ((b3 & 63) << 12) | ((b4 & 63) << 6) | (b5 & 63);
                cArr[i] = (char) ((i2 >>> 10) + 55232);
                cArr[i + 1] = (char) ((i2 & 1023) + 56320);
                return;
            }
        }
        throw ub3.a();
    }

    public static final void d0(so soVar, uo uoVar) {
        uoVar.B.setValue(soVar.e.getValue());
        ap apVar = uoVar.L;
        ap apVar2 = soVar.f;
        int b2 = apVar.b();
        for (int i = 0; i < b2; i++) {
            apVar.e(i, apVar2.a(i));
        }
        uoVar.X = soVar.h;
        uoVar.R = soVar.g;
        uoVar.Y = ((Boolean) soVar.i.getValue()).booleanValue();
    }

    public static void e(byte b2, byte b3, char[] cArr, int i) {
        if (b2 >= -62 && !K(b3)) {
            cArr[i] = (char) (((b2 & 31) << 6) | (b3 & 63));
            return;
        }
        throw ub3.a();
    }

    public static boolean e0(k21 k21Var, k21 k21Var2, k21 k21Var3, k21 k21Var4) {
        boolean z;
        boolean z2;
        k21 k21Var5;
        k21 k21Var6;
        k21 k21Var7 = k21.FIXED;
        if (k21Var3 != k21Var7 && k21Var3 != (k21Var6 = k21.WRAP_CONTENT) && (k21Var3 != k21.MATCH_PARENT || k21Var == k21Var6)) {
            z = false;
        } else {
            z = true;
        }
        if (k21Var4 != k21Var7 && k21Var4 != (k21Var5 = k21.WRAP_CONTENT) && (k21Var4 != k21.MATCH_PARENT || k21Var2 == k21Var5)) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z || z2) {
            return true;
        }
        return false;
    }

    public static void f(byte b2, byte b3, byte b4, char[] cArr, int i) {
        if (!K(b3) && ((b2 != -32 || b3 >= -96) && ((b2 != -19 || b3 < -96) && !K(b4)))) {
            cArr[i] = (char) (((b2 & 15) << 12) | ((b3 & 63) << 6) | (b4 & 63));
            return;
        }
        throw ub3.a();
    }

    public static void f0(String str, String str2) {
        String c0 = c0(str);
        if (J(5, c0)) {
            Log.w(c0, str2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x003d -> B:18:0x0040). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object g(mw6 mw6Var, d20 d20Var) {
        ha6 ha6Var;
        int i;
        int size;
        int i2;
        if (d20Var instanceof ha6) {
            ha6 ha6Var2 = (ha6) d20Var;
            int i3 = ha6Var2.Y;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                ha6Var2.Y = i3 - Integer.MIN_VALUE;
                ha6Var = ha6Var2;
                Object obj = ha6Var.X;
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                i = ha6Var.Y;
                if (i == 0) {
                    if (i == 1) {
                        mw6 mw6Var2 = ha6Var.R;
                        oi2.Y(obj);
                        mw6Var = mw6Var2;
                        oy4 oy4Var = (oy4) obj;
                        List list = oy4Var.a;
                        size = list.size();
                        i2 = 0;
                        while (i2 < size) {
                            if (!ej2.m((vy4) list.get(i2))) {
                                py4 py4Var = py4.Main;
                                ha6Var.R = mw6Var;
                                ha6Var.Y = 1;
                                obj = mw6Var.c(py4Var, ha6Var);
                                mw6Var = mw6Var;
                                if (obj == x61Var) {
                                    return x61Var;
                                }
                                oy4 oy4Var2 = (oy4) obj;
                                List list2 = oy4Var2.a;
                                size = list2.size();
                                i2 = 0;
                                while (i2 < size) {
                                }
                            } else {
                                i2++;
                            }
                        }
                        return oy4Var2;
                    }
                    i.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                oi2.Y(obj);
                py4 py4Var2 = py4.Main;
                ha6Var.R = mw6Var;
                ha6Var.Y = 1;
                obj = mw6Var.c(py4Var2, ha6Var);
                mw6Var = mw6Var;
                if (obj == x61Var) {
                }
                oy4 oy4Var22 = (oy4) obj;
                List list22 = oy4Var22.a;
                size = list22.size();
                i2 = 0;
                while (i2 < size) {
                }
                return oy4Var22;
            }
        }
        ha6Var = new s41(d20Var);
        Object obj2 = ha6Var.X;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i = ha6Var.Y;
        if (i == 0) {
        }
    }

    public static void g0(String str, String str2, Throwable th) {
        String c0 = c0(str);
        if (J(5, c0)) {
            Log.w(c0, str2, th);
        }
    }

    public static final boolean h(int i, KeyEvent keyEvent) {
        if (((int) (xk2.m(keyEvent) >> 32)) == i) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x00c1, code lost:
        if (r15 == r1) goto L51;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0095 A[Catch: CancellationException -> 0x0032, TryCatch #0 {CancellationException -> 0x0032, blocks: (B:13:0x002d, B:49:0x00c4, B:51:0x00cc, B:53:0x00d9, B:55:0x00e5, B:56:0x00e8, B:57:0x00eb, B:59:0x00ef, B:32:0x0091, B:34:0x0095, B:35:0x0097, B:37:0x009b, B:39:0x009f, B:41:0x00a3, B:43:0x00a7, B:45:0x00ab, B:46:0x00b0, B:25:0x0051, B:27:0x005f, B:29:0x0064, B:28:0x0062), top: B:63:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x009b A[Catch: CancellationException -> 0x0032, TryCatch #0 {CancellationException -> 0x0032, blocks: (B:13:0x002d, B:49:0x00c4, B:51:0x00cc, B:53:0x00d9, B:55:0x00e5, B:56:0x00e8, B:57:0x00eb, B:59:0x00ef, B:32:0x0091, B:34:0x0095, B:35:0x0097, B:37:0x009b, B:39:0x009f, B:41:0x00a3, B:43:0x00a7, B:45:0x00ab, B:46:0x00b0, B:25:0x0051, B:27:0x005f, B:29:0x0064, B:28:0x0062), top: B:63:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009f A[Catch: CancellationException -> 0x0032, TryCatch #0 {CancellationException -> 0x0032, blocks: (B:13:0x002d, B:49:0x00c4, B:51:0x00cc, B:53:0x00d9, B:55:0x00e5, B:56:0x00e8, B:57:0x00eb, B:59:0x00ef, B:32:0x0091, B:34:0x0095, B:35:0x0097, B:37:0x009b, B:39:0x009f, B:41:0x00a3, B:43:0x00a7, B:45:0x00ab, B:46:0x00b0, B:25:0x0051, B:27:0x005f, B:29:0x0064, B:28:0x0062), top: B:63:0x0023 }] */
    /* JADX WARN: Type inference failed for: r13v6, types: [ch5, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object i(mw6 mw6Var, g17 g17Var, oy4 oy4Var, int i, d20 d20Var) {
        ka6 ka6Var;
        int i2;
        long j;
        fa6 fa6Var;
        ch5 ch5Var;
        im1 im1Var;
        try {
            if (d20Var instanceof ka6) {
                ka6 ka6Var2 = (ka6) d20Var;
                int i3 = ka6Var2.e0;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    ka6Var2.e0 = i3 - Integer.MIN_VALUE;
                    ka6Var = ka6Var2;
                    Object obj = ka6Var.d0;
                    x61 x61Var = x61.COROUTINE_SUSPENDED;
                    i2 = ka6Var.e0;
                    jg7 jg7Var = jg7.a;
                    if (i2 == 0) {
                        if (i2 != 1) {
                            if (i2 == 2) {
                                g17Var = ka6Var.X;
                                mw6Var = ka6Var.R;
                                oi2.Y(obj);
                                if (((Boolean) obj).booleanValue()) {
                                    List list = mw6Var.Y.p0.a;
                                    int size = list.size();
                                    for (int i4 = 0; i4 < size; i4++) {
                                        vy4 vy4Var = (vy4) list.get(i4);
                                        if (ej2.o(vy4Var)) {
                                            vy4Var.a();
                                        }
                                    }
                                    g17Var.b();
                                    return jg7Var;
                                }
                                g17Var.onCancel();
                                return jg7Var;
                            }
                            i.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        long j2 = ka6Var.Z;
                        ch5 ch5Var2 = ka6Var.Y;
                        g17 g17Var2 = ka6Var.X;
                        mw6 mw6Var2 = ka6Var.R;
                        try {
                            oi2.Y(obj);
                            j = j2;
                            g17Var = g17Var2;
                            mw6Var = mw6Var2;
                            ch5Var = ch5Var2;
                        } catch (CancellationException e2) {
                            e = e2;
                            g17Var = g17Var2;
                            g17Var.onCancel();
                            throw e;
                        }
                    } else {
                        oi2.Y(obj);
                        vy4 vy4Var2 = (vy4) gt0.H0(oy4Var.a);
                        j = vy4Var2.a;
                        long j3 = vy4Var2.c;
                        if (i > 2) {
                            fa6Var = xd5.q0;
                        } else {
                            fa6Var = xd5.p0;
                        }
                        g17Var.a(j3, fa6Var);
                        ?? obj2 = new Object();
                        obj2.A = 9205357640488583168L;
                        long b2 = mw6Var.f().b();
                        la6 la6Var = new la6(j, obj2, null);
                        ka6Var.R = mw6Var;
                        ka6Var.X = g17Var;
                        ka6Var.Y = obj2;
                        ka6Var.Z = j;
                        ka6Var.e0 = 1;
                        obj = mw6Var.l(b2, la6Var, ka6Var);
                        ch5Var = obj2;
                        if (obj == x61Var) {
                            return x61Var;
                        }
                    }
                    im1Var = (im1) obj;
                    if (im1Var == null) {
                        im1Var = im1.Timeout;
                    }
                    if (im1Var != im1.Cancel) {
                        g17Var.onCancel();
                        return jg7Var;
                    } else if (im1Var == im1.Up) {
                        g17Var.b();
                        return jg7Var;
                    } else {
                        if (im1Var == im1.Drag) {
                            g17Var.e(ch5Var.A);
                        }
                        cz3 cz3Var = new cz3(g17Var, 2);
                        ka6Var.R = mw6Var;
                        ka6Var.X = g17Var;
                        ka6Var.Y = null;
                        ka6Var.e0 = 2;
                        obj = sn1.e(mw6Var, j, cz3Var, ka6Var);
                    }
                }
            }
            if (i2 == 0) {
            }
            im1Var = (im1) obj;
            if (im1Var == null) {
            }
            if (im1Var != im1.Cancel) {
            }
        } catch (CancellationException e3) {
            e = e3;
        }
        ka6Var = new s41(d20Var);
        Object obj3 = ka6Var.d0;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i2 = ka6Var.e0;
        jg7 jg7Var2 = jg7.a;
    }

    public static final Object j(float f2, float f3, float f4, to toVar, eo2 eo2Var, s41 s41Var) {
        wc7 wc7Var = nw7.e0;
        Float f5 = new Float(f2);
        Float f6 = new Float(f3);
        Float f7 = new Float(f4);
        qn2 qn2Var = wc7Var.a;
        ap apVar = (ap) qn2Var.g(f7);
        if (apVar == null) {
            apVar = ((ap) qn2Var.g(f5)).c();
        }
        ap apVar2 = apVar;
        Object k = k(new uo(wc7Var, f5, apVar2, 56), new jz6(toVar, wc7Var, f5, f6, apVar2), Long.MIN_VALUE, new ro5(eo2Var, 15), s41Var);
        x61 x61Var = x61.COROUTINE_SUSPENDED;
        jg7 jg7Var = jg7.a;
        if (k != x61Var) {
            k = jg7Var;
        }
        if (k == x61Var) {
            return k;
        }
        return jg7Var;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:1|(2:3|(8:5|6|7|(3:(1:(1:11)(2:53|54))(1:55)|12|13)(8:56|(11:66|67|68|69|70|71|72|73|(2:75|(1:77)(2:80|81))(1:82)|(1:79)|29)(7:58|59|60|61|15|16|(7:18|19|20|21|22|23|(1:34)(2:25|(1:27)(2:31|32)))(2:47|48))|65|38|(1:40)|41|(1:45)|46)|14|15|16|(0)(0)))|91|6|7|(0)(0)|14|15|16|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0183, code lost:
        if (r1 == r10) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x018c, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x018d, code lost:
        r2 = r1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0121 A[Catch: CancellationException -> 0x018c, TRY_LEAVE, TryCatch #4 {CancellationException -> 0x018c, blocks: (B:50:0x010c, B:52:0x0121), top: B:91:0x010c }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01aa  */
    /* JADX WARN: Type inference failed for: r1v5, types: [dh5, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:64:0x0183 -> B:38:0x00c7). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object k(uo uoVar, lo loVar, long j, final qn2 qn2Var, s41 s41Var) {
        gw6 gw6Var;
        int i;
        final uo uoVar2;
        dh5 dh5Var;
        uo uoVar3;
        qn2 qn2Var2;
        Object a2;
        qn2 qn2Var3;
        dh5 dh5Var2;
        dh5 dh5Var3;
        so soVar;
        so soVar2;
        Object obj;
        final qn2 qn2Var4;
        final dh5 dh5Var4;
        final lo loVar2;
        final uo uoVar4;
        Object a3;
        final lo loVar3 = loVar;
        d90 d90Var = d90.u0;
        if (s41Var instanceof gw6) {
            gw6 gw6Var2 = (gw6) s41Var;
            int i2 = gw6Var2.e0;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                gw6Var2.e0 = i2 - Integer.MIN_VALUE;
                gw6Var = gw6Var2;
                gw6 gw6Var3 = gw6Var;
                l61 l61Var = gw6Var3.B;
                Object obj2 = gw6Var3.d0;
                Object obj3 = x61.COROUTINE_SUSPENDED;
                i = gw6Var3.e0;
                if (i == 0) {
                    if (i != 1) {
                        if (i == 2) {
                            dh5Var2 = gw6Var3.Z;
                            qn2Var3 = gw6Var3.Y;
                            loVar3 = gw6Var3.X;
                            uoVar3 = gw6Var3.R;
                        } else {
                            i.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    } else {
                        dh5Var2 = gw6Var3.Z;
                        qn2Var3 = gw6Var3.Y;
                        loVar3 = gw6Var3.X;
                        uoVar3 = gw6Var3.R;
                    }
                    try {
                        oi2.Y(obj2);
                    } catch (CancellationException e2) {
                        e = e2;
                    }
                } else {
                    oi2.Y(obj2);
                    final Object g2 = loVar3.g(0L);
                    final ap d2 = loVar3.d(0L);
                    final ?? obj4 = new Object();
                    if (j == Long.MIN_VALUE) {
                        try {
                            l61Var.getClass();
                            final float y = y(l61Var);
                            uoVar2 = uoVar;
                            try {
                                qn2Var2 = new qn2() { // from class: dw6
                                    @Override // defpackage.qn2
                                    public final Object g(Object obj5) {
                                        long longValue = ((Long) obj5).longValue();
                                        lo loVar4 = loVar3;
                                        wc7 c2 = loVar4.c();
                                        Object h2 = loVar4.h();
                                        uo uoVar5 = uoVar2;
                                        so soVar3 = new so(g2, c2, d2, longValue, h2, longValue, new ew6(1, uoVar5));
                                        kj2.u(soVar3, longValue, y, loVar4, uoVar5, qn2Var);
                                        dh5.this.A = soVar3;
                                        return jg7.a;
                                    }
                                };
                                dh5Var = obj4;
                            } catch (CancellationException e3) {
                                e = e3;
                                dh5Var = obj4;
                                uoVar3 = uoVar2;
                                dh5Var2 = dh5Var;
                                soVar = (so) dh5Var2.A;
                                if (soVar != null) {
                                }
                                soVar2 = (so) dh5Var2.A;
                                if (soVar2 != null) {
                                    uoVar3.Y = false;
                                }
                                throw e;
                            }
                        } catch (CancellationException e4) {
                            e = e4;
                            uoVar2 = uoVar;
                        }
                        try {
                            gw6Var3.R = uoVar2;
                            gw6Var3.X = loVar3;
                            gw6Var3.Y = qn2Var;
                            gw6Var3.Z = dh5Var;
                            gw6Var3.e0 = 1;
                            if (loVar3.a()) {
                                if (gw6Var3.b().Z(d90Var) == null) {
                                    a2 = ii2.x(gw6Var3.b()).a(qn2Var2, gw6Var3);
                                } else {
                                    throw new ClassCastException();
                                }
                            } else {
                                a2 = ii2.x(gw6Var3.b()).a(new y00(26, qn2Var2), gw6Var3);
                            }
                            if (a2 != obj3) {
                                uoVar3 = uoVar2;
                                qn2Var3 = qn2Var;
                                dh5Var2 = dh5Var;
                            }
                            return obj3;
                        } catch (CancellationException e5) {
                            e = e5;
                            uoVar3 = uoVar2;
                            dh5Var2 = dh5Var;
                            soVar = (so) dh5Var2.A;
                            if (soVar != null) {
                            }
                            soVar2 = (so) dh5Var2.A;
                            if (soVar2 != null) {
                            }
                            throw e;
                        }
                    }
                    dh5Var = obj4;
                    try {
                        so soVar3 = new so(g2, loVar3.c(), d2, j, loVar3.h(), j, new ew6(0, uoVar));
                        l61Var.getClass();
                        u(soVar3, j, y(l61Var), loVar3, uoVar, qn2Var);
                        dh5Var.A = soVar3;
                        uoVar3 = uoVar;
                        loVar3 = loVar;
                        qn2Var3 = qn2Var;
                        dh5Var3 = dh5Var;
                        obj = dh5Var3.A;
                        obj.getClass();
                        if (((Boolean) ((so) obj).i.getValue()).booleanValue()) {
                            try {
                                l61 l61Var2 = gw6Var3.B;
                                l61Var2.getClass();
                                final float y2 = y(l61Var2);
                                qn2 qn2Var5 = new qn2() { // from class: fw6
                                    @Override // defpackage.qn2
                                    public final Object g(Object obj5) {
                                        long longValue = ((Long) obj5).longValue();
                                        Object obj6 = dh5.this.A;
                                        obj6.getClass();
                                        kj2.u((so) obj6, longValue, y2, loVar2, uoVar4, qn2Var4);
                                        return jg7.a;
                                    }
                                };
                                dh5Var2 = dh5Var4;
                                loVar3 = loVar2;
                                uoVar3 = uoVar4;
                                qn2Var3 = qn2Var4;
                                gw6Var3.R = uoVar3;
                                gw6Var3.X = loVar3;
                                gw6Var3.Y = qn2Var3;
                                gw6Var3.Z = dh5Var2;
                                gw6Var3.e0 = 2;
                                if (loVar3.a()) {
                                    if (gw6Var3.b().Z(d90Var) == null) {
                                        a3 = ii2.x(gw6Var3.b()).a(qn2Var5, gw6Var3);
                                    } else {
                                        throw new ClassCastException();
                                    }
                                } else {
                                    a3 = ii2.x(gw6Var3.b()).a(new y00(26, qn2Var5), gw6Var3);
                                }
                            } catch (CancellationException e6) {
                                e = e6;
                                dh5Var2 = dh5Var4;
                                uoVar3 = uoVar4;
                            }
                            qn2Var4 = qn2Var3;
                            dh5Var4 = dh5Var3;
                            loVar2 = loVar3;
                            uoVar4 = uoVar3;
                        } else {
                            return jg7.a;
                        }
                    } catch (CancellationException e7) {
                        e = e7;
                        uoVar3 = uoVar;
                    }
                    dh5Var2 = dh5Var;
                    soVar = (so) dh5Var2.A;
                    if (soVar != null) {
                        soVar.i.setValue(Boolean.FALSE);
                    }
                    soVar2 = (so) dh5Var2.A;
                    if (soVar2 != null && soVar2.g == uoVar3.R) {
                        uoVar3.Y = false;
                    }
                    throw e;
                }
                dh5Var3 = dh5Var2;
                obj = dh5Var3.A;
                obj.getClass();
                if (((Boolean) ((so) obj).i.getValue()).booleanValue()) {
                }
            }
        }
        gw6Var = new s41(s41Var);
        gw6 gw6Var32 = gw6Var;
        l61 l61Var3 = gw6Var32.B;
        Object obj22 = gw6Var32.d0;
        Object obj32 = x61.COROUTINE_SUSPENDED;
        i = gw6Var32.e0;
        if (i == 0) {
        }
        dh5Var3 = dh5Var2;
        obj = dh5Var3.A;
        obj.getClass();
        if (((Boolean) ((so) obj).i.getValue()).booleanValue()) {
        }
    }

    public static /* synthetic */ Object l(float f2, float f3, to toVar, eo2 eo2Var, s41 s41Var, int i) {
        if ((i & 8) != 0) {
            toVar = ge7.U(RecyclerView.B1, RecyclerView.B1, null, 7);
        }
        return j(f2, f3, RecyclerView.B1, toVar, eo2Var, s41Var);
    }

    public static final Object m(uo uoVar, oc1 oc1Var, boolean z, qn2 qn2Var, s41 s41Var) {
        long j;
        qa qaVar = new qa(oc1Var, uoVar.A, uoVar.B.getValue(), uoVar.L);
        if (z) {
            j = uoVar.R;
        } else {
            j = Long.MIN_VALUE;
        }
        Object k = k(uoVar, qaVar, j, qn2Var, s41Var);
        if (k == x61.COROUTINE_SUSPENDED) {
            return k;
        }
        return jg7.a;
    }

    public static final Object n(uo uoVar, Float f2, to toVar, boolean z, qn2 qn2Var, s41 s41Var) {
        long j;
        jz6 jz6Var = new jz6(toVar, uoVar.A, uoVar.B.getValue(), f2, uoVar.L);
        if (z) {
            j = uoVar.R;
        } else {
            j = Long.MIN_VALUE;
        }
        Object k = k(uoVar, jz6Var, j, qn2Var, s41Var);
        if (k == x61.COROUTINE_SUSPENDED) {
            return k;
        }
        return jg7.a;
    }

    public static /* synthetic */ Object o(uo uoVar, Float f2, io6 io6Var, boolean z, qn2 qn2Var, s41 s41Var, int i) {
        if ((i & 2) != 0) {
            io6Var = ge7.U(RecyclerView.B1, RecyclerView.B1, null, 7);
        }
        io6 io6Var2 = io6Var;
        if ((i & 8) != 0) {
            qn2Var = new r76(15);
        }
        return n(uoVar, f2, io6Var2, z, qn2Var, s41Var);
    }

    public static void p(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList, PorterDuff.Mode mode) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null) {
            drawable = drawable.mutate();
            if (colorStateList != null && colorStateList.isStateful()) {
                int[] drawableState = textInputLayout.getDrawableState();
                int[] drawableState2 = checkableImageButton.getDrawableState();
                int length = drawableState.length;
                int[] copyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
                System.arraycopy(drawableState2, 0, copyOf, length, drawableState2.length);
                drawable.setTintList(ColorStateList.valueOf(colorStateList.getColorForState(copyOf, colorStateList.getDefaultColor())));
            } else {
                drawable.setTintList(colorStateList);
            }
            if (mode != null) {
                drawable.setTintMode(mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object q(r35 r35Var, on2 on2Var, r41 r41Var) {
        p35 p35Var;
        int i;
        try {
            if (r41Var instanceof p35) {
                p35 p35Var2 = (p35) r41Var;
                int i2 = p35Var2.Y;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    p35Var2.Y = i2 - Integer.MIN_VALUE;
                    p35Var = p35Var2;
                    Object obj = p35Var.X;
                    x61 x61Var = x61.COROUTINE_SUSPENDED;
                    i = p35Var.Y;
                    if (i == 0) {
                        if (i == 1) {
                            on2Var = p35Var.R;
                            oi2.Y(obj);
                        } else {
                            i.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    } else {
                        oi2.Y(obj);
                        l61 l61Var = p35Var.B;
                        l61Var.getClass();
                        if (l61Var.Z(vs0.h0) == r35Var) {
                            p35Var.R = on2Var;
                            p35Var.Y = 1;
                            rj0 rj0Var = new rj0(1, np2.V(p35Var));
                            rj0Var.v();
                            r35Var.Y.D(new rp2(rj0Var, 1));
                            if (rj0Var.s() == x61Var) {
                                return x61Var;
                            }
                        } else {
                            i.m("awaitClose() can only be invoked from the producer context");
                            return null;
                        }
                    }
                    on2Var.c();
                    return jg7.a;
                }
            }
            if (i == 0) {
            }
            on2Var.c();
            return jg7.a;
        } catch (Throwable th) {
            on2Var.c();
            throw th;
        }
        p35Var = new s41(r41Var);
        Object obj2 = p35Var.X;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i = p35Var.Y;
    }

    public static ImageView.ScaleType r(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 5) {
                            if (i != 6) {
                                return ImageView.ScaleType.CENTER;
                            }
                            return ImageView.ScaleType.CENTER_INSIDE;
                        }
                        return ImageView.ScaleType.CENTER_CROP;
                    }
                    return ImageView.ScaleType.FIT_END;
                }
                return ImageView.ScaleType.FIT_CENTER;
            }
            return ImageView.ScaleType.FIT_START;
        }
        return ImageView.ScaleType.FIT_XY;
    }

    public static final long s() {
        return Thread.currentThread().getId();
    }

    public static void t(String str, String str2) {
        String c0 = c0(str);
        if (J(3, c0)) {
            Log.d(c0, str2);
        }
    }

    public static final void u(so soVar, long j, float f2, lo loVar, uo uoVar, qn2 qn2Var) {
        long j2;
        if (f2 == RecyclerView.B1) {
            j2 = loVar.b();
        } else {
            j2 = ((float) (j - soVar.c)) / f2;
        }
        soVar.g = j;
        soVar.e.setValue(loVar.g(j2));
        soVar.f = loVar.d(j2);
        if (loVar.e(j2)) {
            soVar.h = soVar.g;
            soVar.i.setValue(Boolean.FALSE);
        }
        d0(soVar, uoVar);
        qn2Var.g(soVar);
    }

    public static void v(String str, String str2) {
        String c0 = c0(str);
        if (J(6, c0)) {
            Log.e(c0, str2);
        }
    }

    public static void w(String str, String str2, Throwable th) {
        String c0 = c0(str);
        if (J(6, c0)) {
            Log.e(c0, str2, th);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v5, types: [java.lang.Object, zs7] */
    /* JADX WARN: Type inference failed for: r10v6 */
    public static zs7 x(l21 l21Var, int i, ArrayList arrayList, zs7 zs7Var) {
        int i2;
        int i3;
        if (i == 0) {
            i2 = l21Var.r0;
        } else {
            i2 = l21Var.s0;
        }
        int i4 = 0;
        if (i2 != -1 && (zs7Var == 0 || i2 != zs7Var.b)) {
            int i5 = 0;
            while (true) {
                if (i5 >= arrayList.size()) {
                    break;
                }
                zs7 zs7Var2 = (zs7) arrayList.get(i5);
                if (zs7Var2.b == i2) {
                    if (zs7Var != 0) {
                        zs7Var.c(i, zs7Var2);
                        arrayList.remove(zs7Var);
                    }
                    zs7Var = zs7Var2;
                } else {
                    i5++;
                }
            }
        } else if (i2 != -1) {
            return zs7Var;
        }
        zs7 zs7Var3 = zs7Var;
        if (zs7Var == null) {
            if (l21Var instanceof gx2) {
                gx2 gx2Var = (gx2) l21Var;
                int i6 = 0;
                while (true) {
                    if (i6 < gx2Var.u0) {
                        l21 l21Var2 = gx2Var.t0[i6];
                        if ((i == 0 && (i3 = l21Var2.r0) != -1) || (i == 1 && (i3 = l21Var2.s0) != -1)) {
                            break;
                        }
                        i6++;
                    } else {
                        i3 = -1;
                        break;
                    }
                }
                if (i3 != -1) {
                    int i7 = 0;
                    while (true) {
                        if (i7 >= arrayList.size()) {
                            break;
                        }
                        zs7 zs7Var4 = (zs7) arrayList.get(i7);
                        if (zs7Var4.b == i3) {
                            zs7Var = zs7Var4;
                            break;
                        }
                        i7++;
                    }
                }
            }
            if (zs7Var == 0) {
                zs7Var = new Object();
                zs7Var.a = new ArrayList();
                zs7Var.d = null;
                zs7Var.e = -1;
                int i8 = zs7.f;
                zs7.f = i8 + 1;
                zs7Var.b = i8;
                zs7Var.c = i;
            }
            arrayList.add(zs7Var);
            zs7Var3 = zs7Var;
        }
        ArrayList arrayList2 = zs7Var3.a;
        if (arrayList2.contains(l21Var)) {
            return zs7Var3;
        }
        arrayList2.add(l21Var);
        if (l21Var instanceof av2) {
            av2 av2Var = (av2) l21Var;
            h11 h11Var = av2Var.w0;
            if (av2Var.x0 == 0) {
                i4 = 1;
            }
            h11Var.c(i4, zs7Var3, arrayList);
        }
        int i9 = zs7Var3.b;
        if (i == 0) {
            l21Var.r0 = i9;
            l21Var.I.c(i, zs7Var3, arrayList);
            l21Var.K.c(i, zs7Var3, arrayList);
        } else {
            l21Var.s0 = i9;
            l21Var.J.c(i, zs7Var3, arrayList);
            l21Var.M.c(i, zs7Var3, arrayList);
            l21Var.L.c(i, zs7Var3, arrayList);
        }
        l21Var.P.c(i, zs7Var3, arrayList);
        return zs7Var3;
    }

    public static final float y(l61 l61Var) {
        float f2;
        n74 n74Var = (n74) l61Var.Z(cs1.f0);
        if (n74Var != null) {
            f2 = n74Var.F();
        } else {
            f2 = 1.0f;
        }
        if (f2 >= RecyclerView.B1) {
            return f2;
        }
        t05.b("negative scale factor");
        return f2;
    }

    public static final Class z(ar0 ar0Var) {
        ar0Var.getClass();
        Class a2 = ar0Var.a();
        if (!a2.isPrimitive()) {
            return a2;
        }
        String name = a2.getName();
        switch (name.hashCode()) {
            case -1325958191:
                if (name.equals("double")) {
                    return Double.class;
                }
                return a2;
            case 104431:
                if (name.equals("int")) {
                    return Integer.class;
                }
                return a2;
            case 3039496:
                if (name.equals("byte")) {
                    return Byte.class;
                }
                return a2;
            case 3052374:
                if (name.equals("char")) {
                    return Character.class;
                }
                return a2;
            case 3327612:
                if (name.equals("long")) {
                    return Long.class;
                }
                return a2;
            case 3625364:
                if (name.equals("void")) {
                    return Void.class;
                }
                return a2;
            case 64711720:
                if (name.equals("boolean")) {
                    return Boolean.class;
                }
                return a2;
            case 97526364:
                if (name.equals("float")) {
                    return Float.class;
                }
                return a2;
            case 109413500:
                if (name.equals("short")) {
                    return Short.class;
                }
                return a2;
            default:
                return a2;
        }
    }
}
