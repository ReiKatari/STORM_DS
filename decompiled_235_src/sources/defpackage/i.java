package defpackage;

import android.view.View;
import com.github.junrar.unpack.ppm.SubAllocator;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.CommonStatusCodes;
import java.io.EOFException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListMap;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: i */
/* loaded from: classes.dex */
public final /* synthetic */ class i implements hu, zk4, tj0, u23, gm1, ph4 {
    public final /* synthetic */ int A;

    public /* synthetic */ i(bt btVar) {
        this.A = 12;
    }

    public static /* synthetic */ void d() {
        throw new RuntimeException();
    }

    public static /* synthetic */ void f(Object obj) {
        throw new IllegalArgumentException(obj.toString());
    }

    public static /* synthetic */ void g(Object obj, Object obj2, String str) {
        throw new IllegalStateException(str + obj + obj2);
    }

    public static /* synthetic */ void h(String str) {
        throw new IllegalArgumentException(str);
    }

    public static /* synthetic */ void i(String str, int i, Object obj) {
        throw new IllegalArgumentException(str + i + obj);
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
        throw new ConcurrentModificationException();
    }

    public static /* synthetic */ void m(String str) {
        throw new IllegalStateException(str);
    }

    public static /* synthetic */ void n() {
        throw new EOFException();
    }

    @Override // defpackage.zk4
    public vu7 U(View view, vu7 vu7Var) {
        view.getClass();
        e83 h = vu7Var.a.h(647);
        h.getClass();
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), h.d);
        return vu7.b;
    }

    @Override // defpackage.hu
    public int a(int i, kk3 kk3Var) {
        float f;
        float f2 = i / 2.0f;
        if (kk3Var == kk3.Ltr) {
            f = -1.0f;
        } else {
            f = 1.0f;
        }
        return Math.round((1.0f + f) * f2);
    }

    @Override // defpackage.u23
    public void b(v23 v23Var) {
        boolean z;
        try {
            s23 a = v23Var.a();
            StringBuilder sb = new StringBuilder("OnImageAvailableListener: mCurrentRequest ID = null, image.isNull = ");
            if (a == null) {
                z = true;
            } else {
                z = false;
            }
            sb.append(z);
            kj2.t("CaptureNode", sb.toString());
            if (a != null) {
                nj2.h();
                kj2.f0("CaptureNode", "Discarding ImageProxy which was inadvertently acquired: " + a);
                a.close();
            }
        } catch (IllegalStateException unused) {
        }
    }

    @Override // defpackage.gm1
    public double c(double d) {
        double d2;
        double d3;
        double d4;
        double d5;
        switch (this.A) {
            case 15:
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
            case 16:
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
            case 17:
                float[] fArr = qt0.a;
                return qt0.b(qt0.c, d);
            case 18:
                float[] fArr2 = qt0.a;
                return qt0.a(qt0.c, d);
            case 19:
                float[] fArr3 = qt0.a;
                return qt0.d(qt0.d, d);
            default:
                float[] fArr4 = qt0.a;
                return qt0.c(qt0.d, d);
        }
    }

    @Override // defpackage.ph4
    public Object e() {
        switch (this.A) {
            case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                return new ArrayList();
            case 22:
                return new ConcurrentHashMap();
            case ConnectionResult.API_DISABLED /* 23 */:
                return new ConcurrentSkipListMap();
            case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                return new LinkedHashSet();
            case 25:
                return new TreeSet();
            case SubAllocator.N4 /* 26 */:
                return new ArrayDeque();
            case 27:
                return new aw3(true);
            case 28:
                return new LinkedHashMap();
            default:
                return new TreeMap();
        }
    }

    public /* synthetic */ i(int i) {
        this.A = i;
    }

    @Override // defpackage.tj0
    public void cancel() {
    }
}
