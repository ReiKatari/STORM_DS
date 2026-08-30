package j7;

import android.database.Observable;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class k0 {

    /* renamed from: a  reason: collision with root package name */
    public final l0 f7619a = new Observable();

    /* renamed from: b  reason: collision with root package name */
    public boolean f7620b = false;

    /* renamed from: c  reason: collision with root package name */
    public final j0 f7621c = j0.ALLOW;

    public abstract int a();

    public long b(int i2) {
        return -1L;
    }

    public int c(int i2) {
        return 0;
    }

    public abstract void e(j1 j1Var, int i2);

    public abstract j1 f(ViewGroup viewGroup, int i2);

    public final void h(boolean z10) {
        if (!this.f7619a.a()) {
            this.f7620b = z10;
        } else {
            a0.j.p("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        }
    }

    public void d(RecyclerView recyclerView) {
    }

    public void g(j1 j1Var) {
    }
}
