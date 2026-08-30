package r0;

import j0.u0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class h implements Runnable {
    public final /* synthetic */ int A;
    public final /* synthetic */ u0 B;

    public /* synthetic */ h(u0 u0Var, int i2) {
        this.A = i2;
        this.B = u0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.A) {
            case 0:
                this.B.a();
                return;
            default:
                this.B.b();
                return;
        }
    }
}
