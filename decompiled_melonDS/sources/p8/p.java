package p8;

import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class p implements Runnable {
    public final /* synthetic */ int A;
    public final /* synthetic */ AtomicBoolean B;
    public final /* synthetic */ b5.i L;
    public final /* synthetic */ mc.a R;

    public /* synthetic */ p(AtomicBoolean atomicBoolean, b5.i iVar, mc.a aVar, int i2) {
        this.A = i2;
        this.B = atomicBoolean;
        this.L = iVar;
        this.R = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.A) {
            case 0:
                b5.i iVar = this.L;
                mc.a aVar = this.R;
                if (!this.B.get()) {
                    try {
                        iVar.b(aVar.b());
                        return;
                    } catch (Throwable th2) {
                        iVar.c(th2);
                        return;
                    }
                }
                return;
            default:
                b5.i iVar2 = this.L;
                mc.a aVar2 = this.R;
                if (!this.B.get()) {
                    try {
                        iVar2.b(aVar2.b());
                        return;
                    } catch (Throwable th3) {
                        iVar2.c(th3);
                        return;
                    }
                }
                return;
        }
    }
}
