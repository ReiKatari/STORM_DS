package defpackage;

import android.os.Handler;
import androidx.preference.Preference;
import androidx.recyclerview.widget.RecyclerView;
import java.util.logging.Logger;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: h15  reason: default package */
/* loaded from: classes.dex */
public final class h15 implements Runnable {
    public final /* synthetic */ int A;
    public Object B;
    public Object L;
    public Object R;

    public h15(k15 k15Var, Preference preference, String str) {
        this.A = 0;
        this.R = k15Var;
        this.B = preference;
        this.L = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        int l;
        switch (this.A) {
            case 0:
                String str = (String) this.L;
                Preference preference = (Preference) this.B;
                k15 k15Var = (k15) this.R;
                wf5 adapter = k15Var.mList.getAdapter();
                if (!(adapter instanceof t15)) {
                    if (adapter != null) {
                        i.m("Adapter must implement PreferencePositionCallback");
                        return;
                    }
                    return;
                }
                if (preference != null) {
                    l = ((t15) adapter).k(preference);
                } else {
                    l = ((t15) adapter).l(str);
                }
                RecyclerView recyclerView = k15Var.mList;
                if (l != -1) {
                    recyclerView.h0(l);
                    return;
                }
                adapter.a.registerObserver(new j15((t15) adapter, recyclerView, preference, str));
                return;
            case 1:
                ye1 ye1Var = (ye1) this.B;
                fz fzVar = (fz) this.L;
                String str2 = fzVar.a;
                hy hyVar = (hy) this.R;
                Logger logger = ye1.f;
                try {
                    pb7 a = ye1Var.c.a(str2);
                    if (a == null) {
                        String str3 = "Transport backend '" + str2 + "' is not registered";
                        logger.warning(str3);
                        new IllegalArgumentException(str3);
                    } else {
                        ye1Var.e.n(new bt(ye1Var, fzVar, ((hl0) a).a(hyVar), 14));
                    }
                    return;
                } catch (Exception e) {
                    logger.warning("Error scheduling event " + e.getMessage());
                    return;
                }
            case 2:
                try {
                    obj = ((xi2) this.B).call();
                } catch (Exception unused) {
                    obj = null;
                }
                ((Handler) this.R).post(new uo2(13, (jr1) this.L, obj));
                return;
            default:
                rj0 rj0Var = (rj0) this.B;
                try {
                    hv.V(rj0Var.X.D(d90.r0), new kp5((m16) this.L, rj0Var, (w81) this.R, null, 4));
                    return;
                } catch (Throwable th) {
                    rj0Var.w(th);
                    return;
                }
        }
    }

    public /* synthetic */ h15(Object obj, Object obj2, Object obj3, int i) {
        this.A = i;
        this.B = obj;
        this.L = obj2;
        this.R = obj3;
    }

    public /* synthetic */ h15() {
        this.A = 2;
    }
}
