package defpackage;

import android.view.Choreographer;
import java.util.concurrent.Executor;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: dr6  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class dr6 implements Executor {
    public final /* synthetic */ int A;
    public final /* synthetic */ Object B;

    public /* synthetic */ dr6(int i, Object obj) {
        this.A = i;
        this.B = obj;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        int i = this.A;
        Object obj = this.B;
        switch (i) {
            case 0:
                ((Choreographer) obj).postFrameCallback(new bo(1, runnable));
                return;
            default:
                n57 n57Var = (n57) obj;
                n57Var.c.execute(new xc4(10, n57Var, runnable));
                return;
        }
    }
}
