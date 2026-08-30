package defpackage;

import java.util.Set;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: lf6  reason: default package */
/* loaded from: classes.dex */
public final class lf6 implements Runnable {
    public final ku4 A;
    public final td6 B;
    public final boolean L;
    public final int R;

    public lf6(ku4 ku4Var, td6 td6Var, boolean z, int i) {
        ku4Var.getClass();
        td6Var.getClass();
        this.A = ku4Var;
        this.B = td6Var;
        this.L = z;
        this.R = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean d;
        ui7 b;
        boolean z = this.L;
        ku4 ku4Var = this.A;
        td6 td6Var = this.B;
        if (z) {
            int i = this.R;
            ku4Var.getClass();
            String str = td6Var.a.a;
            synchronized (ku4Var.k) {
                b = ku4Var.b(str);
            }
            d = ku4.d(str, b, i);
        } else {
            int i2 = this.R;
            ku4Var.getClass();
            String str2 = td6Var.a.a;
            synchronized (ku4Var.k) {
                try {
                    if (ku4Var.f.get(str2) != null) {
                        y70.f().b(ku4.l, "Ignored stopWork. WorkerWrapper " + str2 + " is in foreground");
                    } else {
                        Set set = (Set) ku4Var.h.get(str2);
                        if (set != null && set.contains(td6Var)) {
                            d = ku4.d(str2, ku4Var.b(str2), i2);
                        }
                    }
                    d = false;
                } finally {
                }
            }
        }
        y70.f().b(y70.h("StopWorkRunnable"), "StopWorkRunnable for " + this.B.a.a + "; Processor.stopWork = " + d);
    }
}
