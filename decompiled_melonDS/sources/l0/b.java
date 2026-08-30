package l0;

import java.util.concurrent.Callable;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class b implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Runnable f8488a;

    public b(Runnable runnable) {
        this.f8488a = runnable;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        this.f8488a.run();
        return null;
    }
}
