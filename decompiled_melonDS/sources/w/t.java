package w;

import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class t implements Runnable {
    public final /* synthetic */ int A;
    public final /* synthetic */ p1.c1 B;

    public /* synthetic */ t(p1.c1 c1Var, int i2) {
        this.A = i2;
        this.B = c1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.A) {
            case 0:
                p1.c1 c1Var = this.B;
                if (!((AtomicBoolean) c1Var.B).getAndSet(true)) {
                    ((x) ((p1.a0) c1Var.L).L).L.execute(new t(c1Var, 1));
                    return;
                }
                return;
            default:
                p1.c1 c1Var2 = this.B;
                u uVar = ((x) ((p1.a0) c1Var2.L).L).X;
                u uVar2 = u.OPENING;
                p1.a0 a0Var = (p1.a0) c1Var2.L;
                if (uVar != uVar2) {
                    ((x) a0Var.L).v("Camera skip reopen at state: " + ((x) ((p1.a0) c1Var2.L).L).X, null);
                    return;
                }
                ((x) a0Var.L).v("Camera onError timeout, reopen it.", null);
                ((x) ((p1.a0) c1Var2.L).L).F(u.REOPENING);
                ((x) ((p1.a0) c1Var2.L).L).f14065c0.b();
                return;
        }
    }
}
