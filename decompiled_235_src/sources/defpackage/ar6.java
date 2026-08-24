package defpackage;

import java.util.Set;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ar6  reason: default package */
/* loaded from: classes.dex */
public final class ar6 implements Runnable {
    public final o35 A;
    public final jp6 B;
    public final boolean L;
    public final int R;

    public ar6(o35 o35Var, jp6 jp6Var, boolean z, int i) {
        o35Var.getClass();
        jp6Var.getClass();
        this.A = o35Var;
        this.B = jp6Var;
        this.L = z;
        this.R = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean d;
        rx7 b;
        boolean z = this.L;
        o35 o35Var = this.A;
        jp6 jp6Var = this.B;
        if (z) {
            int i = this.R;
            o35Var.getClass();
            String str = jp6Var.a.a;
            synchronized (o35Var.k) {
                b = o35Var.b(str);
            }
            d = o35.d(str, b, i);
        } else {
            int i2 = this.R;
            o35Var.getClass();
            String str2 = jp6Var.a.a;
            synchronized (o35Var.k) {
                try {
                    if (o35Var.f.get(str2) != null) {
                        ga0.f().b(o35.l, "Ignored stopWork. WorkerWrapper " + str2 + " is in foreground");
                    } else {
                        Set set = (Set) o35Var.h.get(str2);
                        if (set != null && set.contains(jp6Var)) {
                            d = o35.d(str2, o35Var.b(str2), i2);
                        }
                    }
                    d = false;
                } finally {
                }
            }
        }
        ga0.f().b(ga0.h("StopWorkRunnable"), "StopWorkRunnable for " + this.B.a.a + "; Processor.stopWork = " + d);
    }
}
