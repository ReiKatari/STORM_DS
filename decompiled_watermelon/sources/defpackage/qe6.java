package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: qe6  reason: default package */
/* loaded from: classes.dex */
public abstract class qe6 implements pe6 {
    public final dw A = new AtomicInteger(0);

    public final boolean f(int i) {
        if ((this.A.get() & i) != 0) {
            return true;
        }
        return false;
    }

    public final void g(int i) {
        dw dwVar;
        int i2;
        do {
            dwVar = this.A;
            i2 = dwVar.get();
            if ((i2 & i) != 0) {
                return;
            }
        } while (!dwVar.compareAndSet(i2, i2 | i));
    }
}
