package defpackage;

import java.util.concurrent.Executor;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: uj1  reason: default package */
/* loaded from: classes.dex */
public final class uj1 implements Executor {
    public static volatile uj1 B;
    public final /* synthetic */ int A;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.A) {
            case 0:
                runnable.run();
                return;
            default:
                new Thread(runnable).start();
                return;
        }
    }
}
