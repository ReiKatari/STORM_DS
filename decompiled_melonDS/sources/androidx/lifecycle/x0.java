package androidx.lifecycle;

import java.util.concurrent.Executor;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class x0 implements Runnable {
    public final /* synthetic */ int A;
    public boolean B;
    public final Object L;
    public final Object R;

    public x0(z zVar, p pVar) {
        this.A = 0;
        zVar.getClass();
        pVar.getClass();
        this.L = zVar;
        this.R = pVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.A) {
            case 0:
                if (!this.B) {
                    ((z) this.L).f((p) this.R);
                    this.B = true;
                    return;
                }
                return;
            default:
                ((Executor) this.L).execute(new r0.b(7, this));
                return;
        }
    }

    public x0(w.w wVar, l0.h hVar) {
        this.A = 1;
        this.R = wVar;
        this.B = false;
        this.L = hVar;
    }
}
