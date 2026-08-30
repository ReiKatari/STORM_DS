package q;

import androidx.appcompat.widget.SearchView;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class p2 implements Runnable {
    public final /* synthetic */ int A;
    public final /* synthetic */ SearchView B;

    public /* synthetic */ p2(SearchView searchView, int i2) {
        this.A = i2;
        this.B = searchView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.A) {
            case 0:
                this.B.s();
                return;
            default:
                g6.b bVar = this.B.M0;
                if (bVar instanceof z2) {
                    bVar.b(null);
                    return;
                }
                return;
        }
    }
}
