package defpackage;

import android.os.Process;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: tk5  reason: default package */
/* loaded from: classes.dex */
public final class tk5 extends Thread {
    public final int A;

    public tk5(Runnable runnable) {
        super(runnable, "fonts-androidx");
        this.A = 10;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(this.A);
        super.run();
    }
}
