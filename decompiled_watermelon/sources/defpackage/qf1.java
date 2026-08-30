package defpackage;

import java.util.concurrent.Executor;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: qf1  reason: default package */
/* loaded from: classes.dex */
public final class qf1 implements Executor {
    public static volatile qf1 B;
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
