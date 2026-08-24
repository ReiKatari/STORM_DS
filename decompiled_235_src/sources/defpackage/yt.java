package defpackage;

import java.util.concurrent.Executor;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: yt  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class yt implements Executor {
    public final /* synthetic */ int A;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.A) {
            case 0:
                zt.l0().e.f.execute(runnable);
                return;
            default:
                runnable.run();
                return;
        }
    }
}
