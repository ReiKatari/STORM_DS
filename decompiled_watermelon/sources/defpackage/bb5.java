package defpackage;

import android.os.Process;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: bb5  reason: default package */
/* loaded from: classes.dex */
public final class bb5 extends Thread {
    public final int A;

    public bb5(Runnable runnable) {
        super(runnable, "fonts-androidx");
        this.A = 10;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(this.A);
        super.run();
    }
}
