package defpackage;

import java.util.Locale;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: wc0  reason: default package */
/* loaded from: classes.dex */
public final class wc0 implements ThreadFactory {
    public final /* synthetic */ int a;
    public final AtomicInteger b;

    public wc0(int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = new AtomicInteger(0);
                return;
            case 2:
                this.b = new AtomicInteger(0);
                return;
            default:
                this.b = new AtomicInteger(0);
                return;
        }
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        int i = this.a;
        AtomicInteger atomicInteger = this.b;
        switch (i) {
            case 0:
                Thread thread = new Thread(new m0(9, runnable));
                thread.setPriority(7);
                Locale locale = Locale.US;
                int andIncrement = atomicInteger.getAndIncrement();
                thread.setName("CameraX-core_camera_" + andIncrement);
                return thread;
            case 1:
                Thread thread2 = new Thread(runnable);
                thread2.setName("arch_disk_io_" + atomicInteger.getAndIncrement());
                return thread2;
            default:
                Thread thread3 = new Thread(runnable);
                Locale locale2 = Locale.US;
                int andIncrement2 = atomicInteger.getAndIncrement();
                thread3.setName("CameraX-camerax_io_" + andIncrement2);
                return thread3;
        }
    }
}
