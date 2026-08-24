package defpackage;

import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: x13  reason: default package */
/* loaded from: classes.dex */
public final class x13 extends gk2 {
    public final /* synthetic */ int R = 1;
    public final Object X;

    public x13(s23 s23Var, y13 y13Var) {
        super(s23Var);
        this.X = new WeakReference(y13Var);
        e(new w13(this, 0));
    }

    @Override // defpackage.gk2, java.lang.AutoCloseable
    public void close() {
        switch (this.R) {
            case 1:
                if (!((AtomicBoolean) this.X).getAndSet(true)) {
                    super.close();
                    return;
                }
                return;
            default:
                super.close();
                return;
        }
    }

    public x13(s23 s23Var) {
        super(s23Var);
        this.X = new AtomicBoolean(false);
    }
}
