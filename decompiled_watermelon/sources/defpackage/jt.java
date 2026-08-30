package defpackage;

import java.util.concurrent.Executor;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: jt  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class jt implements Executor {
    public final /* synthetic */ int A;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.A) {
            case 0:
                kt.L().h.i.execute(runnable);
                return;
            default:
                runnable.run();
                return;
        }
    }
}
