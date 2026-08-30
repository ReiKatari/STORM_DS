package androidx.preference;

import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class x implements Runnable {
    public final /* synthetic */ Preference A;
    public final /* synthetic */ String B;
    public final /* synthetic */ a0 L;

    public x(a0 a0Var, Preference preference, String str) {
        this.L = a0Var;
        this.A = preference;
        this.B = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int m;
        a0 a0Var = this.L;
        j7.k0 adapter = a0Var.mList.getAdapter();
        if (!(adapter instanceof d0)) {
            if (adapter == null) {
                return;
            }
            a0.j.p("Adapter must implement PreferencePositionCallback");
            return;
        }
        String str = this.B;
        Preference preference = this.A;
        if (preference != null) {
            m = ((d0) adapter).l(preference);
        } else {
            m = ((d0) adapter).m(str);
        }
        RecyclerView recyclerView = a0Var.mList;
        if (m != -1) {
            recyclerView.h0(m);
            return;
        }
        adapter.f7619a.registerObserver(new z((d0) adapter, recyclerView, preference, str));
    }
}
