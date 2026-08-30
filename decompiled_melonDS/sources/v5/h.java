package v5;

import android.os.Process;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class h extends Thread {
    public final int A;

    public h(Runnable runnable) {
        super(runnable, "fonts-androidx");
        this.A = 10;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(this.A);
        super.run();
    }
}
