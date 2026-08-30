package defpackage;

import android.os.Build;
import android.view.ViewConfiguration;
import androidx.preference.Preference;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: h04  reason: default package */
/* loaded from: classes.dex */
public final class h04 extends w74 {
    public final bq0 f;
    public final q60 g;
    public kd6 h;

    public h04(ax5 ax5Var, bq0 bq0Var, dt0 dt0Var, od1 od1Var) {
        super(ax5Var, dt0Var, od1Var);
        this.f = bq0Var;
        this.g = n40.f(Preference.DEFAULT_ORDER, null, null, 6);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0165 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0166 A[PHI: r16 
      PHI: (r16v1 o27) = (r16v0 o27), (r16v2 o27) binds: [B:22:0x00d0, B:39:0x0163] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Type inference failed for: r1v4, types: [k75, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, n75] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, n75] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(defpackage.h04 r21, defpackage.ax5 r22, defpackage.d04 r23, float r24, float r25, defpackage.k11 r26) {
        /*
            Method dump skipped, instructions count: 359
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h04.c(h04, ax5, d04, float, float, k11):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d(defpackage.h04 r13, defpackage.n75 r14, defpackage.k75 r15, defpackage.ax5 r16, defpackage.n75 r17, long r18, defpackage.k11 r20) {
        /*
            Method dump skipped, instructions count: 208
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h04.d(h04, n75, k75, ax5, n75, long, k11):java.lang.Object");
    }

    public static d04 g(q60 q60Var) {
        d04 d04Var = null;
        c06 W = io2.W(new ue2(new c04(q60Var, 0), null, 2));
        while (W.hasNext()) {
            d04 d04Var2 = (d04) W.next();
            if (d04Var != null) {
                d04Var2 = d04Var.a(d04Var2);
            }
            d04Var = d04Var2;
        }
        return d04Var;
    }

    public final float e(xw5 xw5Var, float f) {
        ax5 ax5Var = this.a;
        long h = ax5Var.h(ax5Var.d(f));
        ax5 ax5Var2 = xw5Var.a;
        return ax5Var.g(ax5Var.e(ax5Var2.c(ax5Var2.k, h, 1)));
    }

    public final boolean f(kp4 kp4Var) {
        float C;
        float C2;
        long j;
        od1 od1Var = this.c;
        ViewConfiguration viewConfiguration = (ViewConfiguration) this.f.B;
        int i = Build.VERSION.SDK_INT;
        if (i > 26) {
            C = cr0.l(viewConfiguration);
        } else {
            C = od1Var.C(64.0f);
        }
        float f = -C;
        if (i > 26) {
            C2 = cr0.i(viewConfiguration);
        } else {
            C2 = od1Var.C(64.0f);
        }
        float f2 = -C2;
        List list = kp4Var.a;
        mb4 mb4Var = new mb4(0L);
        int size = list.size();
        boolean z = false;
        int i2 = 0;
        while (true) {
            j = mb4Var.a;
            if (i2 >= size) {
                break;
            }
            mb4Var = new mb4(mb4.e(j, ((rp4) list.get(i2)).j));
            i2++;
        }
        long floatToRawIntBits = (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j >> 32)) * f2) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) * f) & 4294967295L);
        ax5 ax5Var = this.a;
        float i3 = ax5Var.i(ax5Var.e(floatToRawIntBits));
        if (i3 != RecyclerView.A1) {
            int i4 = (i3 > RecyclerView.A1 ? 1 : (i3 == RecyclerView.A1 ? 0 : -1));
            sw5 sw5Var = ax5Var.a;
            if (i4 > 0) {
                z = sw5Var.c();
            } else {
                z = sw5Var.a();
            }
        }
        if (z) {
            return !(this.g.c(new d04(floatToRawIntBits, ((rp4) tq0.K0(kp4Var.a)).b, false)) instanceof wj0);
        }
        return this.d;
    }
}
