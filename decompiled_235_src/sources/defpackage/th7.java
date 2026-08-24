package defpackage;

import android.os.SystemClock;
import android.view.View;
import java.util.WeakHashMap;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: th7  reason: default package */
/* loaded from: classes.dex */
public final class th7 implements wr0, i71, k61 {
    public static final bn b(int i, String str) {
        WeakHashMap weakHashMap = dv7.w;
        return new bn(i, str);
    }

    public static final ok7 c(int i, String str) {
        WeakHashMap weakHashMap = dv7.w;
        return new ok7(new p83(0, 0, 0, 0), str);
    }

    public static dv7 d(px0 px0Var) {
        xq2 xq2Var = (xq2) px0Var;
        View view = (View) xq2Var.j(kf.f);
        dv7 e = e(view);
        boolean h = xq2Var.h(e) | xq2Var.h(view);
        Object P = xq2Var.P();
        if (h || P == ox0.a) {
            P = new ja7(8, e, view);
            xq2Var.l0(P);
        }
        mb3.d(e, (qn2) P, xq2Var);
        return e;
    }

    public static dv7 e(View view) {
        dv7 dv7Var;
        WeakHashMap weakHashMap = dv7.w;
        synchronized (weakHashMap) {
            try {
                Object obj = weakHashMap.get(view);
                if (obj == null) {
                    obj = new dv7(view);
                    weakHashMap.put(view, obj);
                }
                dv7Var = (dv7) obj;
            } catch (Throwable th) {
                throw th;
            }
        }
        return dv7Var;
    }

    @Override // defpackage.wr0
    public long a() {
        return SystemClock.elapsedRealtime();
    }
}
