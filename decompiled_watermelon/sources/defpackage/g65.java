package defpackage;

import android.database.Observable;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: g65  reason: default package */
/* loaded from: classes.dex */
public abstract class g65 {
    public final h65 a = new Observable();
    public boolean b = false;
    public final f65 c = f65.ALLOW;

    public abstract int a();

    public long b(int i) {
        return -1L;
    }

    public int c(int i) {
        return 0;
    }

    public abstract void e(g75 g75Var, int i);

    public abstract g75 f(ViewGroup viewGroup, int i);

    public final void g(boolean z) {
        if (!this.a.a()) {
            this.b = z;
        } else {
            i.n("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        }
    }

    public void d(RecyclerView recyclerView) {
    }
}
