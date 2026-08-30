package defpackage;

import android.os.Handler;
import androidx.preference.Preference;
import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: fs4  reason: default package */
/* loaded from: classes.dex */
public final class fs4 implements Runnable {
    public final /* synthetic */ int A = 1;
    public Object B;
    public Object L;
    public Object R;

    public fs4(ih0 ih0Var, sq5 sq5Var, i51 i51Var) {
        this.B = ih0Var;
        this.L = sq5Var;
        this.R = i51Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        int l;
        switch (this.A) {
            case 0:
                String str = (String) this.L;
                Preference preference = (Preference) this.B;
                is4 is4Var = (is4) this.R;
                g65 adapter = is4Var.mList.getAdapter();
                if (!(adapter instanceof rs4)) {
                    if (adapter != null) {
                        i.n("Adapter must implement PreferencePositionCallback");
                        return;
                    }
                    return;
                }
                if (preference != null) {
                    l = ((rs4) adapter).k(preference);
                } else {
                    l = ((rs4) adapter).l(str);
                }
                RecyclerView recyclerView = is4Var.mList;
                if (l != -1) {
                    recyclerView.h0(l);
                    return;
                }
                adapter.a.registerObserver(new hs4((rs4) adapter, recyclerView, preference, str));
                return;
            case 1:
                try {
                    obj = ((ae2) this.B).call();
                } catch (Exception unused) {
                    obj = null;
                }
                ((Handler) this.R).post(new qj2(10, (dn1) this.L, obj));
                return;
            default:
                ih0 ih0Var = (ih0) this.B;
                try {
                    tq5.A(ih0Var.X.T(k45.Y), new qk5((sq5) this.L, ih0Var, (i51) this.R, (j11) null, 2));
                    return;
                } catch (Throwable th) {
                    ih0Var.r(th);
                    return;
                }
        }
    }

    public /* synthetic */ fs4() {
    }

    public fs4(is4 is4Var, Preference preference, String str) {
        this.R = is4Var;
        this.B = preference;
        this.L = str;
    }
}
