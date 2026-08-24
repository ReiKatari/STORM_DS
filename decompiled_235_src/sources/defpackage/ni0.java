package defpackage;

import android.util.Log;
import android.view.Surface;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ni0  reason: default package */
/* loaded from: classes.dex */
public final class ni0 implements AutoCloseable {
    public final Surface A;
    public final int B;
    public final sw L;
    public final /* synthetic */ oi0 R;

    public ni0(oi0 oi0Var, Surface surface) {
        surface.getClass();
        this.R = oi0Var;
        this.A = surface;
        uw uwVar = oi0.d;
        uwVar.getClass();
        this.B = uw.b.incrementAndGet(uwVar);
        this.L = g04.s(false);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        Surface surface;
        List<jj7> list;
        if (this.L.a()) {
            oi0 oi0Var = this.R;
            synchronized (oi0Var.a) {
                surface = this.A;
                Integer num = (Integer) oi0Var.b.get(surface);
                if (num != null) {
                    int intValue = num.intValue() - 1;
                    oi0Var.b.put(surface, Integer.valueOf(intValue));
                    if (intValue == 0) {
                        list = gt0.k1(oi0Var.c);
                        oi0Var.b.remove(surface);
                    } else {
                        list = null;
                    }
                } else {
                    throw new IllegalStateException(("Surface " + surface + " (" + this + ") has no use count").toString());
                }
            }
            if (list != null) {
                for (jj7 jj7Var : list) {
                    jj7Var.getClass();
                    surface.getClass();
                    synchronized (jj7Var.e) {
                        try {
                            ig1 ig1Var = (ig1) jj7Var.g.remove(surface);
                            if (ig1Var != null) {
                                if (kj2.F("CXCP")) {
                                    Log.d("CXCP", "SurfaceInactive " + ig1Var + " in " + jj7Var);
                                }
                                jj7Var.c.k(ig1Var);
                                try {
                                    ig1Var.b();
                                } catch (IllegalStateException e) {
                                    if (kj2.L()) {
                                        Log.w("CXCP", "Error when " + surface + " going to decrease the use count.", e);
                                    }
                                }
                                jj7Var.e();
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
