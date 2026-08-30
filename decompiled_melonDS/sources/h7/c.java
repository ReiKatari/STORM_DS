package h7;

import java.util.concurrent.Executor;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements Executor {
    public final /* synthetic */ int A;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.A) {
            case 0:
                runnable.run();
                return;
            default:
                r.a.D().f12557b.f12559c.execute(runnable);
                return;
        }
    }
}
