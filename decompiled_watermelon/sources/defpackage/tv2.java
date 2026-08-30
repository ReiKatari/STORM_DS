package defpackage;

import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: tv2  reason: default package */
/* loaded from: classes.dex */
public final class tv2 extends hf2 {
    public final /* synthetic */ int R = 1;
    public final Object X;

    public tv2(ow2 ow2Var, uv2 uv2Var) {
        super(ow2Var);
        this.X = new WeakReference(uv2Var);
        d(new sv2(0, this));
    }

    @Override // defpackage.hf2, java.lang.AutoCloseable
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

    public tv2(ow2 ow2Var) {
        super(ow2Var);
        this.X = new AtomicBoolean(false);
    }
}
