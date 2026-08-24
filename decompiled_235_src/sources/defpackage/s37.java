package defpackage;

import android.view.Choreographer;
import java.util.concurrent.Executor;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: s37  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class s37 implements Executor {
    public final /* synthetic */ int A;
    public final /* synthetic */ Object B;

    public /* synthetic */ s37(Object obj, int i) {
        this.A = i;
        this.B = obj;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        int i = this.A;
        Object obj = this.B;
        switch (i) {
            case 0:
                ((Choreographer) obj).postFrameCallback(new oo(runnable, 1));
                return;
            default:
                kj7 kj7Var = (kj7) obj;
                kj7Var.c.execute(new q64(12, kj7Var, runnable));
                return;
        }
    }
}
