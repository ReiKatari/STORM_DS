package defpackage;

import java.util.concurrent.Callable;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: lp2  reason: default package */
/* loaded from: classes.dex */
public final class lp2 implements Callable {
    public final /* synthetic */ Runnable a;

    public lp2(Runnable runnable) {
        this.a = runnable;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        this.a.run();
        return null;
    }
}
