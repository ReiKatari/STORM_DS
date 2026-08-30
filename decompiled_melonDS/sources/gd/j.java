package gd;

import zc.x;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class j extends i {
    public final Runnable L;

    public j(Runnable runnable, long j2, boolean z10) {
        super(j2, z10);
        this.L = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.L.run();
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("Task[");
        Runnable runnable = this.L;
        sb2.append(runnable.getClass().getSimpleName());
        sb2.append('@');
        sb2.append(x.n(runnable));
        sb2.append(", ");
        sb2.append(this.A);
        sb2.append(", ");
        if (this.B) {
            str = "Blocking";
        } else {
            str = "Non-blocking";
        }
        return w.d.r(sb2, str, ']');
    }
}
