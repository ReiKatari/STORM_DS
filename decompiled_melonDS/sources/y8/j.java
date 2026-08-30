package y8;

import java.util.Set;
import p8.v;
import q8.b0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class j implements Runnable {
    public final q8.d A;
    public final q8.j B;
    public final boolean L;
    public final int R;

    public j(q8.d dVar, q8.j jVar, boolean z10, int i2) {
        dVar.getClass();
        jVar.getClass();
        this.A = dVar;
        this.B = jVar;
        this.L = z10;
        this.R = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean d4;
        b0 b10;
        boolean z10 = this.L;
        q8.d dVar = this.A;
        q8.j jVar = this.B;
        if (z10) {
            int i2 = this.R;
            dVar.getClass();
            String str = jVar.f12355a.f14391a;
            synchronized (dVar.f12351k) {
                b10 = dVar.b(str);
            }
            d4 = q8.d.d(str, b10, i2);
        } else {
            int i10 = this.R;
            dVar.getClass();
            String str2 = jVar.f12355a.f14391a;
            synchronized (dVar.f12351k) {
                try {
                    if (dVar.f12346f.get(str2) != null) {
                        v.e().a(q8.d.f12340l, "Ignored stopWork. WorkerWrapper " + str2 + " is in foreground");
                    } else {
                        Set set = (Set) dVar.f12348h.get(str2);
                        if (set != null && set.contains(jVar)) {
                            d4 = q8.d.d(str2, dVar.b(str2), i10);
                        }
                    }
                    d4 = false;
                } finally {
                }
            }
        }
        v.e().a(v.g("StopWorkRunnable"), "StopWorkRunnable for " + this.B.f12355a.f14391a + "; Processor.stopWork = " + d4);
    }
}
