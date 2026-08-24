package defpackage;

import java.util.concurrent.Callable;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: mv2  reason: default package */
/* loaded from: classes.dex */
public final class mv2 implements Callable {
    public final /* synthetic */ Runnable a;

    public mv2(Runnable runnable) {
        this.a = runnable;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        this.a.run();
        return null;
    }
}
