package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.view.Display;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Map;
import javax.net.ssl.SSLSocket;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: iq0  reason: default package */
/* loaded from: classes.dex */
public final class iq0 implements x40, t11, d31, yx2, in6, p40, lx3, kc1, nw6, s01 {
    public static c55 L;
    public static z45 p0;
    public final /* synthetic */ int A;
    public static final iq0 B = new iq0(0);
    public static final iq0 R = new iq0(1);
    public static final iq0 X = new iq0(2);
    public static final iq0 Y = new iq0(3);
    public static final iq0 Z = new iq0(4);
    public static final iq0 c0 = new iq0(5);
    public static final /* synthetic */ iq0 d0 = new iq0(6);
    public static final iq0 e0 = new iq0(7);
    public static final /* synthetic */ iq0 f0 = new iq0(8);
    public static final iq0 g0 = new iq0(9);
    public static final iq0 h0 = new iq0(10);
    public static final iq0 i0 = new iq0(11);
    public static final iq0 j0 = new iq0(12);
    public static final te4 k0 = new te4(1);
    public static final te4 l0 = new te4(0);
    public static final iq0 m0 = new iq0(14);
    public static final iq0 n0 = new iq0(15);
    public static final iq0 o0 = new iq0(16);
    public static final iq0 q0 = new iq0(17);
    public static final vd6 r0 = new vd6(4);
    public static final vd6 s0 = new vd6(5);
    public static final vd6 t0 = new vd6(17);

    public /* synthetic */ iq0(int i) {
        this.A = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x007a, code lost:
        r6 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.w70 n(java.lang.String r14) {
        /*
            Method dump skipped, instructions count: 215
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iq0.n(java.lang.String):w70");
    }

    public static w70 o(String str) {
        if (str.length() % 2 == 0) {
            int length = str.length() / 2;
            byte[] bArr = new byte[length];
            for (int i = 0; i < length; i++) {
                int i2 = i * 2;
                bArr[i] = (byte) (se.f(str.charAt(i2 + 1)) + (se.f(str.charAt(i2)) << 4));
            }
            return new w70(bArr);
        }
        i.g("Unexpected hex string: ".concat(str));
        return null;
    }

    public static w70 p(String str) {
        str.getClass();
        byte[] bytes = str.getBytes(hk0.a);
        bytes.getClass();
        w70 w70Var = new w70(bytes);
        w70Var.L = str;
        return w70Var;
    }

    public static long q(float f, float f2, float f3) {
        int i = xq0.i;
        eg5 eg5Var = dr0.e;
        if (RecyclerView.A1 > f || f > 360.0f || RecyclerView.A1 > f2 || f2 > 1.0f || RecyclerView.A1 > f3 || f3 > 1.0f) {
            lz2.a("HSL (" + f + ", " + f2 + ", " + f3 + ") must be in range (0..360, 0..1, 0..1)");
        }
        return mh7.b(r(f, f2, f3, 0), r(f, f2, f3, 8), r(f, f2, f3, 4), 1.0f, eg5Var);
    }

    public static float r(float f, float f2, float f3, int i) {
        float f4 = ((f / 30.0f) + i) % 12.0f;
        return f3 - (Math.max(-1.0f, Math.min(f4 - 3.0f, Math.min(9.0f - f4, 1.0f))) * (Math.min(f3, 1.0f - f3) * f2));
    }

    public static final c55 s(Context context) {
        c55 c55Var = L;
        if (c55Var == null) {
            synchronized (B) {
                c55 c55Var2 = L;
                if (c55Var2 != null) {
                    return c55Var2;
                }
                context.getApplicationContext();
                c55 e = new ka(context).e();
                L = e;
                return e;
            }
        }
        return c55Var;
    }

    public static w70 t(byte[] bArr) {
        w70 w70Var = w70.R;
        int length = bArr.length;
        a53.q(bArr.length, 0L, length);
        return new w70(nu.j0(bArr, 0, length));
    }

    @Override // defpackage.lx3
    public boolean M(uw3 uw3Var) {
        return false;
    }

    @Override // defpackage.kc1
    public boolean a(SSLSocket sSLSocket) {
        return gh6.n0(sSLSocket.getClass().getName(), "com.google.android.gms.org.conscrypt.", false);
    }

    @Override // defpackage.in6
    public Map b(jb5 jb5Var) {
        return qp1.A;
    }

    @Override // defpackage.kc1
    public db6 c(SSLSocket sSLSocket) {
        Class<?> cls = sSLSocket.getClass();
        Class<?> cls2 = cls;
        while (!cls2.getSimpleName().equals("OpenSSLSocketImpl")) {
            cls2 = cls2.getSuperclass();
            if (cls2 == null) {
                throw new AssertionError("No OpenSSLSocketImpl superclass of socket of type " + cls);
            }
        }
        return new pl(cls2);
    }

    @Override // defpackage.s01
    public long d(long j, long j2) {
        float j3 = a53.j(j, j2);
        long floatToRawIntBits = (Float.floatToRawIntBits(j3) << 32) | (Float.floatToRawIntBits(j3) & 4294967295L);
        int i = vu5.a;
        return floatToRawIntBits;
    }

    @Override // defpackage.x40
    public Rect h(Activity activity) {
        int i;
        Rect rect = new Rect();
        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        defaultDisplay.getRectSize(rect);
        if (!activity.isInMultiWindowMode()) {
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            Resources resources = activity.getResources();
            int identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android");
            if (identifier > 0) {
                i = resources.getDimensionPixelSize(identifier);
            } else {
                i = 0;
            }
            int i2 = rect.bottom + i;
            if (i2 == point.y) {
                rect.bottom = i2;
                return rect;
            }
            int i3 = rect.right + i;
            if (i3 == point.x) {
                rect.right = i3;
            }
        }
        return rect;
    }

    @Override // defpackage.yx2
    public void i(int i, hc1 hc1Var, jd0 jd0Var) {
        hc1Var.getClass();
    }

    @Override // defpackage.p40
    public long j(int i, yp0 yp0Var) {
        String str = ((lr6) yp0Var.e).a.a.B;
        return ve2.g(io2.t(i, str), io2.s(i, str));
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Type inference failed for: r4v3, types: [f60, java.lang.Object, t60] */
    @Override // defpackage.t11
    public Object k(Object obj) {
        switch (this.A) {
            case 3:
                gc5 gc5Var = (gc5) obj;
                try {
                    ?? obj2 = new Object();
                    gc5Var.p().S(obj2);
                    fc5 fc5Var = new fc5(gc5Var.i(), gc5Var.d(), obj2);
                    gc5Var.close();
                    return fc5Var;
                } catch (Throwable th) {
                    gc5Var.close();
                    throw th;
                }
            default:
                ((gc5) obj).close();
                return null;
        }
    }

    public void l(Drawable drawable, tu0 tu0Var, int i) {
        int i2;
        boolean z;
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.Z(257732500);
        if (sk2Var.h(drawable)) {
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
            zy3 h = o76.h(wy3.a, d11.e);
            boolean h2 = sk2Var.h(drawable);
            Object L2 = sk2Var.L();
            if (h2 || L2 == su0.a) {
                L2 = new n95(18, drawable);
                sk2Var.h0(L2);
            }
            d50.a(l07.E(h, (mi2) L2), sk2Var, 0);
        } else {
            sk2Var.R();
        }
        m55 r = sk2Var.r();
        if (r != null) {
            r.d = new i15(i, 8, this, drawable);
        }
    }

    public void m(final Icon icon, tu0 tu0Var, final int i) {
        int i2;
        boolean z;
        m55 r;
        aj2 aj2Var;
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.Z(2116504409);
        if (sk2Var.h(icon)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i3 = i2 | i;
        if ((i3 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (sk2Var.O(i3 & 1, z)) {
            Context context = (Context) sk2Var.j(ue.b);
            boolean f = sk2Var.f(icon) | sk2Var.f(context);
            Object L2 = sk2Var.L();
            if (f || L2 == su0.a) {
                L2 = icon.loadDrawable(context);
                sk2Var.h0(L2);
            }
            Drawable drawable = (Drawable) L2;
            if (drawable == null) {
                r = sk2Var.r();
                if (r != null) {
                    aj2Var = new aj2(this, icon, i, 0) { // from class: go6
                        public final /* synthetic */ int A;
                        public final /* synthetic */ iq0 B;
                        public final /* synthetic */ Icon L;

                        {
                            this.A = r4;
                            this.B = this;
                        }

                        @Override // defpackage.aj2
                        public final Object j(Object obj, Object obj2) {
                            int i4 = this.A;
                            o27 o27Var = o27.a;
                            Icon icon2 = this.L;
                            iq0 iq0Var = this.B;
                            tu0 tu0Var2 = (tu0) obj;
                            ((Integer) obj2).getClass();
                            switch (i4) {
                                case 0:
                                    iq0Var.m(icon2, tu0Var2, ep2.I(49));
                                    return o27Var;
                                default:
                                    iq0Var.m(icon2, tu0Var2, ep2.I(49));
                                    return o27Var;
                            }
                        }
                    };
                    r.d = aj2Var;
                }
                return;
            }
            l(drawable, sk2Var, 48);
        } else {
            sk2Var.R();
        }
        r = sk2Var.r();
        if (r != null) {
            aj2Var = new aj2(this, icon, i, 1) { // from class: go6
                public final /* synthetic */ int A;
                public final /* synthetic */ iq0 B;
                public final /* synthetic */ Icon L;

                {
                    this.A = r4;
                    this.B = this;
                }

                @Override // defpackage.aj2
                public final Object j(Object obj, Object obj2) {
                    int i4 = this.A;
                    o27 o27Var = o27.a;
                    Icon icon2 = this.L;
                    iq0 iq0Var = this.B;
                    tu0 tu0Var2 = (tu0) obj;
                    ((Integer) obj2).getClass();
                    switch (i4) {
                        case 0:
                            iq0Var.m(icon2, tu0Var2, ep2.I(49));
                            return o27Var;
                        default:
                            iq0Var.m(icon2, tu0Var2, ep2.I(49));
                            return o27Var;
                    }
                }
            };
            r.d = aj2Var;
        }
    }

    @Override // defpackage.yx2
    public void e() {
    }

    @Override // defpackage.yx2
    public void g(hc1 hc1Var) {
    }

    @Override // defpackage.lx3
    public void f(uw3 uw3Var, boolean z) {
    }
}
