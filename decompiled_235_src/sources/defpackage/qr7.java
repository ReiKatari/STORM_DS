package defpackage;

import android.app.Application;
import android.content.Context;
import android.os.Build;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: qr7  reason: default package */
/* loaded from: classes.dex */
public final class qr7 extends ym {
    public final kd6 b;
    public final jm4 c;
    public final u63 d;
    public final tp6 e;
    public final de5 f;

    public qr7(Application application, kd6 kd6Var, jm4 jm4Var) {
        kd6Var.getClass();
        jm4Var.getClass();
        this.b = kd6Var;
        this.c = jm4Var;
        this.d = new u63(application, kd6Var);
        na naVar = na.NON_ADRENO;
        sr7 sr7Var = sr7.SYSTEM;
        zt1 zt1Var = zt1.A;
        yt1 yt1Var = yt1.A;
        tp6 a = up6.a(new pr7(false, "", naVar, sr7Var, null, yt1Var, yt1Var, null, zt1Var, null, null));
        this.e = a;
        this.f = new de5(a);
        f();
    }

    public final void e(hm4 hm4Var) {
        Object value;
        hm4Var.getClass();
        tp6 tp6Var = this.e;
        if (((pr7) tp6Var.getValue()).j != null) {
            return;
        }
        do {
            value = tp6Var.getValue();
        } while (!tp6Var.j(value, pr7.a((pr7) value, false, null, null, null, null, null, null, null, null, hm4Var.a, lb1.A("Скачивание ", hm4Var.b, "..."), 511)));
        hv.L(to7.a(this), null, null, new bf4(this, hm4Var, null, 27), 3);
    }

    public final void f() {
        String str;
        String A;
        tp6 tp6Var;
        Object value;
        boolean N = q60.N((Context) this.d.B);
        na H = q60.H();
        String V = q60.V();
        if (!qs6.v0(V)) {
            A = qs6.T0(V).toString();
        } else {
            if (Build.VERSION.SDK_INT >= 31) {
                str = Build.SOC_MODEL;
                str = (str == null || qs6.v0(str)) ? null : null;
                if (str == null) {
                    str = Build.HARDWARE;
                }
            } else {
                str = Build.HARDWARE;
            }
            String str2 = Build.HARDWARE;
            str2.getClass();
            if (!qs6.j0(str2, "qcom", true) && !q60.M()) {
                A = lb1.n("GPU: ", str, " (", Build.BOARD, ")");
            } else {
                A = lb1.A("Qualcomm Adreno (", str, ")");
            }
        }
        String str3 = A;
        ng6 ng6Var = (ng6) this.b;
        sr7 A2 = ng6Var.A();
        String x = ng6Var.x();
        List n = ng6Var.n();
        jm4 jm4Var = this.c;
        List a = jm4Var.a(H);
        hm4 b = jm4Var.b(H);
        do {
            tp6Var = this.e;
            value = tp6Var.getValue();
        } while (!tp6Var.j(value, pr7.a((pr7) value, N, str3, H, A2, x, n, a, b, null, null, null, 1792)));
    }

    public final void g(String str) {
        str.getClass();
        ng6 ng6Var = (ng6) this.b;
        ng6Var.O(str);
        ng6Var.P(sr7.CUSTOM);
        f();
    }
}
