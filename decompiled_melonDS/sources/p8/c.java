package p8;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class c implements ThreadFactory {

    /* renamed from: a  reason: collision with root package name */
    public final AtomicInteger f11464a = new AtomicInteger(0);

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ boolean f11465b;

    public c(boolean z10) {
        this.f11465b = z10;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        String str;
        runnable.getClass();
        if (this.f11465b) {
            str = "WM.task-";
        } else {
            str = "androidx.work-";
        }
        StringBuilder t5 = w.d.t(str);
        t5.append(this.f11464a.incrementAndGet());
        return new Thread(runnable, t5.toString());
    }
}
