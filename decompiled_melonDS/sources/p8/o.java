package p8;

import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class o implements Runnable {
    public final /* synthetic */ int A;
    public final /* synthetic */ AtomicBoolean B;

    public /* synthetic */ o(AtomicBoolean atomicBoolean, int i2) {
        this.A = i2;
        this.B = atomicBoolean;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.A) {
            case 0:
                this.B.set(true);
                return;
            default:
                this.B.set(true);
                return;
        }
    }
}
