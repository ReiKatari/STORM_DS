package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: fq6  reason: default package */
/* loaded from: classes.dex */
public abstract class fq6 implements eq6 {
    public final vw A = new AtomicInteger(0);

    public final boolean e(int i) {
        if ((this.A.get() & i) != 0) {
            return true;
        }
        return false;
    }

    public final void g(int i) {
        vw vwVar;
        int i2;
        do {
            vwVar = this.A;
            i2 = vwVar.get();
            if ((i2 & i) != 0) {
                return;
            }
        } while (!vwVar.compareAndSet(i2, i2 | i));
    }
}
