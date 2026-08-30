package qi;

import java.util.concurrent.ThreadFactory;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class f implements ThreadFactory {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f12550a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ boolean f12551b;

    public /* synthetic */ f(String str, boolean z10) {
        this.f12550a = str;
        this.f12551b = z10;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable, this.f12550a);
        thread.setDaemon(this.f12551b);
        return thread;
    }
}
