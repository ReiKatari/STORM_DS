package d;

import androidx.fragment.app.o0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ int A;
    public final /* synthetic */ o0 B;

    public /* synthetic */ b(o0 o0Var, int i2) {
        this.A = i2;
        this.B = o0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.A) {
            case 0:
                k.p(this.B);
                return;
            default:
                this.B.invalidateOptionsMenu();
                return;
        }
    }
}
