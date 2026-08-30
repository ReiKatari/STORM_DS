package defpackage;

import android.util.Log;
import android.view.Surface;
import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: eg0  reason: default package */
/* loaded from: classes.dex */
public final class eg0 implements AutoCloseable {
    public final Surface A;
    public final int B;
    public final aw L;
    public final /* synthetic */ fg0 R;

    public eg0(fg0 fg0Var, Surface surface) {
        surface.getClass();
        this.R = fg0Var;
        this.A = surface;
        cw cwVar = fg0.d;
        cwVar.getClass();
        this.B = cw.b.incrementAndGet(cwVar);
        this.L = w81.e(false);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        Surface surface;
        List<m57> list;
        if (this.L.a()) {
            fg0 fg0Var = this.R;
            synchronized (fg0Var.a) {
                surface = this.A;
                Integer num = (Integer) fg0Var.b.get(surface);
                if (num != null) {
                    int intValue = num.intValue() - 1;
                    fg0Var.b.put(surface, Integer.valueOf(intValue));
                    if (intValue == 0) {
                        list = tq0.n1(fg0Var.c);
                        fg0Var.b.remove(surface);
                    } else {
                        list = null;
                    }
                } else {
                    throw new IllegalStateException(("Surface " + surface + " (" + this + ") has no use count").toString());
                }
            }
            if (list != null) {
                for (m57 m57Var : list) {
                    m57Var.getClass();
                    surface.getClass();
                    synchronized (m57Var.e) {
                        try {
                            hc1 hc1Var = (hc1) m57Var.g.remove(surface);
                            if (hc1Var != null) {
                                if (ve2.D("CXCP")) {
                                    Log.d("CXCP", "SurfaceInactive " + hc1Var + " in " + m57Var);
                                }
                                m57Var.c.g(hc1Var);
                                try {
                                    hc1Var.b();
                                } catch (IllegalStateException e) {
                                    if (ve2.I()) {
                                        Log.w("CXCP", "Error when " + surface + " going to decrease the use count.", e);
                                    }
                                }
                                m57Var.e();
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            }
        }
    }

    public final String toString() {
        return "SurfaceToken-" + this.B;
    }
}
