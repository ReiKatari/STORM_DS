package q;

import androidx.appcompat.widget.Toolbar;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class e3 implements Runnable {
    public final /* synthetic */ int A;
    public final /* synthetic */ Toolbar B;

    public /* synthetic */ e3(Toolbar toolbar, int i2) {
        this.A = i2;
        this.B = toolbar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p.n nVar;
        switch (this.A) {
            case 0:
                h3 h3Var = this.B.J0;
                if (h3Var == null) {
                    nVar = null;
                } else {
                    nVar = h3Var.B;
                }
                if (nVar != null) {
                    nVar.collapseActionView();
                    return;
                }
                return;
            default:
                this.B.o();
                return;
        }
    }
}
