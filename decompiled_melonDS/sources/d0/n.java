package d0;

import java.util.Locale;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class n implements ThreadFactory {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f3429a;

    /* renamed from: b  reason: collision with root package name */
    public final AtomicInteger f3430b;

    public n(int i2) {
        this.f3429a = i2;
        switch (i2) {
            case DSiCameraSource.FrontCamera /* 1 */:
                this.f3430b = new AtomicInteger(0);
                return;
            case 2:
                this.f3430b = new AtomicInteger(0);
                return;
            default:
                this.f3430b = new AtomicInteger(0);
                return;
        }
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.f3429a) {
            case 0:
                Thread thread = new Thread(new a8.f(7, runnable));
                thread.setPriority(7);
                Locale locale = Locale.US;
                int andIncrement = this.f3430b.getAndIncrement();
                thread.setName("CameraX-core_camera_" + andIncrement);
                return thread;
            case DSiCameraSource.FrontCamera /* 1 */:
                Thread thread2 = new Thread(runnable);
                Locale locale2 = Locale.US;
                int andIncrement2 = this.f3430b.getAndIncrement();
                thread2.setName("CameraX-camerax_io_" + andIncrement2);
                return thread2;
            default:
                Thread thread3 = new Thread(runnable);
                thread3.setName("arch_disk_io_" + this.f3430b.getAndIncrement());
                return thread3;
        }
    }
}
