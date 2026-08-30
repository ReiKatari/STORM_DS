package defpackage;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: jw0  reason: default package */
/* loaded from: classes.dex */
public final class jw0 implements ThreadFactory {
    public final AtomicInteger a = new AtomicInteger(0);
    public final /* synthetic */ boolean b;

    public jw0(boolean z) {
        this.b = z;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        String str;
        runnable.getClass();
        if (this.b) {
            str = "WM.task-";
        } else {
            str = "androidx.work-";
        }
        StringBuilder r = wh1.r(str);
        r.append(this.a.incrementAndGet());
        return new Thread(runnable, r.toString());
    }
}
