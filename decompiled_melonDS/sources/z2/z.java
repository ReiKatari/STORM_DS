package z2;

import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class z implements y {
    public final v2.a A = new AtomicInteger(0);

    public final boolean e(int i2) {
        if ((i2 & this.A.get()) != 0) {
            return true;
        }
        return false;
    }

    public final void f(int i2) {
        v2.a aVar;
        int i10;
        do {
            aVar = this.A;
            i10 = aVar.get();
            if ((i10 & i2) != 0) {
                return;
            }
        } while (!aVar.compareAndSet(i10, i10 | i2));
    }
}
