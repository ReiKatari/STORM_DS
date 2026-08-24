package defpackage;

import android.database.Observable;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: wf5  reason: default package */
/* loaded from: classes.dex */
public abstract class wf5 {
    public final xf5 a = new Observable();
    public boolean b = false;
    public final vf5 c = vf5.ALLOW;

    public abstract int a();

    public long b(int i) {
        return -1L;
    }

    public int c(int i) {
        return 0;
    }

    public abstract void e(wg5 wg5Var, int i);

    public abstract wg5 f(ViewGroup viewGroup, int i);

    public final void g(boolean z) {
        if (!this.a.a()) {
            this.b = z;
        } else {
            i.m("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        }
    }

    public void d(RecyclerView recyclerView) {
    }
}
