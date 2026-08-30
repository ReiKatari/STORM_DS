package defpackage;

import android.view.View;
import java.io.EOFException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListMap;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: i */
/* loaded from: classes.dex */
public final /* synthetic */ class i implements pt, bc4, kh0, qw2, bi1, y84 {
    public final /* synthetic */ int A;

    public /* synthetic */ i(os osVar) {
        this.A = 11;
    }

    public static /* synthetic */ void c() {
        throw new RuntimeException();
    }

    public static /* synthetic */ void f(int i, Object obj, String str) {
        throw new IllegalArgumentException(str + i + obj);
    }

    public static /* synthetic */ void g(Object obj) {
        throw new IllegalArgumentException(obj.toString());
    }

    public static /* synthetic */ void h(Object obj, Object obj2, String str) {
        throw new IllegalStateException(str + obj + obj2);
    }

    public static /* synthetic */ void i(String str) {
        throw new IllegalArgumentException(str);
    }

    public static /* synthetic */ void j(StringBuilder sb, Object obj) {
        sb.append(obj);
        throw new IllegalArgumentException(sb.toString());
    }

    public static /* synthetic */ void k(StringBuilder sb, Object obj, Object obj2) {
        sb.append(obj);
        sb.append(obj2);
        throw new IllegalStateException(sb.toString().toString());
    }

    public static /* synthetic */ void l() {
        throw new EOFException();
    }

    public static /* synthetic */ void m(Object obj, Object obj2, String str) {
        throw new IllegalStateException((str + obj + obj2).toString());
    }

    public static /* synthetic */ void n(String str) {
        throw new IllegalStateException(str);
    }

    @Override // defpackage.bc4
    public vf7 G(View view, vf7 vf7Var) {
        view.getClass();
        x13 h = vf7Var.a.h(647);
        h.getClass();
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), h.d);
        return vf7.b;
    }

    @Override // defpackage.bi1
    public double a(double d) {
        double d2;
        double d3;
        double d4;
        double d5;
        switch (this.A) {
            case 14:
                if (d < 0.0d) {
                    d2 = -d;
                } else {
                    d2 = d;
                }
                if (d2 >= 0.0031308049535603718d) {
                    d3 = (Math.pow(d2, 0.4166666666666667d) - 0.05213270142180095d) / 0.9478672985781991d;
                } else {
                    d3 = d2 / 0.07739938080495357d;
                }
                return Math.copySign(d3, d);
            case ig7.e /* 15 */:
                if (d < 0.0d) {
                    d4 = -d;
                } else {
                    d4 = d;
                }
                if (d4 >= 0.04045d) {
                    d5 = Math.pow((0.9478672985781991d * d4) + 0.05213270142180095d, 2.4d);
                } else {
                    d5 = d4 * 0.07739938080495357d;
                }
                return Math.copySign(d5, d);
            case 16:
                float[] fArr = dr0.a;
                return dr0.b(dr0.c, d);
            case 17:
                float[] fArr2 = dr0.a;
                return dr0.a(dr0.c, d);
            case 18:
                float[] fArr3 = dr0.a;
                return dr0.d(dr0.d, d);
            default:
                float[] fArr4 = dr0.a;
                return dr0.c(dr0.d, d);
        }
    }

    @Override // defpackage.qw2
    public void b(rw2 rw2Var) {
        boolean z;
        try {
            ow2 b = rw2Var.b();
            StringBuilder sb = new StringBuilder("OnImageAvailableListener: mCurrentRequest ID = null, image.isNull = ");
            if (b == null) {
                z = true;
            } else {
                z = false;
            }
            sb.append(z);
            ve2.v("CaptureNode", sb.toString());
            if (b != null) {
                nk2.s();
                ve2.c0("CaptureNode", "Discarding ImageProxy which was inadvertently acquired: " + b);
                b.close();
            }
        } catch (IllegalStateException unused) {
        }
    }

    @Override // defpackage.y84
    public Object d() {
        switch (this.A) {
            case 20:
                return new ArrayList();
            case 21:
                return new ConcurrentHashMap();
            case 22:
                return new ConcurrentSkipListMap();
            case 23:
                return new LinkedHashSet();
            case 24:
                return new TreeSet();
            case 25:
                return new ArrayDeque();
            case 26:
                return new yo3(true);
            case 27:
                return new LinkedHashMap();
            default:
                return new TreeMap();
        }
    }

    @Override // defpackage.pt
    public int e(int i, sd3 sd3Var) {
        float f;
        float f2 = i / 2.0f;
        if (sd3Var == sd3.Ltr) {
            f = -1.0f;
        } else {
            f = 1.0f;
        }
        return Math.round((1.0f + f) * f2);
    }

    public /* synthetic */ i(int i) {
        this.A = i;
    }

    @Override // defpackage.kh0
    public void cancel() {
    }
}
