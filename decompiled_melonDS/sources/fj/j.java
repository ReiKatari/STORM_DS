package fj;

import d0.y0;
import j0.c1;
import j0.d1;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.NoSuchElementException;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class j implements c1, j3.i, t.a {
    public final /* synthetic */ int A;

    public /* synthetic */ j(a4.n nVar) {
        this.A = 12;
    }

    public static /* synthetic */ void b() {
        throw new IllegalArgumentException();
    }

    public static /* synthetic */ void d(Object obj, Object obj2) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(obj);
        sb2.append(obj2);
        throw new IllegalArgumentException(sb2.toString().toString());
    }

    public static /* synthetic */ void e(Object obj, Object obj2, Object obj3, Throwable th2) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(obj);
        sb2.append(obj2);
        sb2.append(obj3);
        throw new IllegalStateException(sb2.toString(), th2);
    }

    public static /* synthetic */ void f(Object obj, Object obj2, String str) {
        throw new IllegalStateException((str + obj + obj2).toString());
    }

    public static /* synthetic */ void g(Object obj, String str) {
        throw new FileNotFoundException(str + obj);
    }

    public static /* synthetic */ void h(String str) {
        throw new IOException(str);
    }

    public static /* synthetic */ void i(String str, Object obj, Object obj2, Object obj3) {
        throw new IllegalArgumentException((str + obj + obj2 + obj3).toString());
    }

    public static /* synthetic */ void j(String str, Object obj, Object obj2, Object obj3, Object obj4) {
        throw new IllegalStateException((str + obj + obj2 + obj3 + obj4).toString());
    }

    public static /* synthetic */ void k(StringBuilder sb2, Object obj, Object obj2) {
        sb2.append(obj);
        sb2.append(obj2);
        throw new IllegalArgumentException(sb2.toString());
    }

    public static /* synthetic */ void l() {
        throw new NoSuchElementException();
    }

    public static /* synthetic */ void m(Object obj, Object obj2, String str) {
        throw new IllegalArgumentException((str + obj + obj2).toString());
    }

    public static /* synthetic */ void n(Object obj, String str) {
        throw new IOException(str + obj);
    }

    public static /* synthetic */ void o(String str, Object obj, Object obj2, Object obj3) {
        throw new IOException(str + obj + obj2 + obj3);
    }

    public static /* synthetic */ void p(String str, Object obj, Object obj2, Object obj3, Object obj4) {
        throw new IllegalArgumentException((str + obj + obj2 + obj3 + obj4).toString());
    }

    public static /* synthetic */ void q(Object obj, Object obj2, String str) {
        throw new IllegalArgumentException(str + obj + obj2);
    }

    public static /* synthetic */ void r(Object obj, String str) {
        throw new IllegalArgumentException(str + obj);
    }

    public static /* synthetic */ void s(String str, Object obj, Object obj2, Object obj3) {
        throw new IllegalArgumentException(str + obj + obj2 + obj3);
    }

    public static /* synthetic */ void t(Object obj, String str) {
        throw new IllegalArgumentException((str + obj).toString());
    }

    public static /* synthetic */ void u(Object obj, String str) {
        throw new IllegalStateException((str + obj).toString());
    }

    @Override // j3.i
    public double a(double d4) {
        double d10;
        double d11;
        double d12;
        double d13;
        switch (this.A) {
            case 14:
                if (d4 < 0.0d) {
                    d10 = -d4;
                } else {
                    d10 = d4;
                }
                if (d10 >= 0.0031308049535603718d) {
                    d11 = (Math.pow(d10, 0.4166666666666667d) - 0.05213270142180095d) / 0.9478672985781991d;
                } else {
                    d11 = d10 / 0.07739938080495357d;
                }
                return Math.copySign(d11, d4);
            case l1.c.f8512h /* 15 */:
                if (d4 < 0.0d) {
                    d12 = -d4;
                } else {
                    d12 = d4;
                }
                if (d12 >= 0.04045d) {
                    d13 = Math.pow((0.9478672985781991d * d12) + 0.05213270142180095d, 2.4d);
                } else {
                    d13 = d12 * 0.07739938080495357d;
                }
                return Math.copySign(d13, d4);
            case 16:
                float[] fArr = j3.d.f7349a;
                return j3.d.b(j3.d.f7351c, d4);
            case 17:
                float[] fArr2 = j3.d.f7349a;
                return j3.d.a(j3.d.f7351c, d4);
            case 18:
                float[] fArr3 = j3.d.f7349a;
                return j3.d.d(j3.d.f7352d, d4);
            case 19:
                float[] fArr4 = j3.d.f7349a;
                return j3.d.c(j3.d.f7352d, d4);
            default:
                return d4;
        }
    }

    @Override // j0.c1
    public void c(d1 d1Var) {
        try {
            y0 e6 = d1Var.e();
            if (e6 != null) {
                l0.f.e();
                aj.g.y0("CaptureNode", "Discarding ImageProxy which was inadvertently acquired: " + e6);
                e6.close();
            }
        } catch (IllegalStateException unused) {
        }
    }

    public /* synthetic */ j(int i2) {
        this.A = i2;
    }

    @Override // t.a
    public Object apply(Object obj) {
        return obj;
    }
}
