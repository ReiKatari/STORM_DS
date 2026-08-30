package defpackage;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: iq  reason: default package */
/* loaded from: classes.dex */
public final class iq implements Runnable {
    public final /* synthetic */ int A;
    public final /* synthetic */ tq B;

    public /* synthetic */ iq(tq tqVar, int i) {
        this.A = i;
        this.B = tqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewGroup viewGroup;
        int i = this.A;
        tq tqVar = this.B;
        switch (i) {
            case 0:
                if ((tqVar.T0 & 1) != 0) {
                    tqVar.u(0);
                }
                if ((tqVar.T0 & 4096) != 0) {
                    tqVar.u(108);
                }
                tqVar.S0 = false;
                tqVar.T0 = 0;
                return;
            default:
                tqVar.q0.showAtLocation(tqVar.p0, 55, 0, 0);
                hb7 hb7Var = tqVar.s0;
                if (hb7Var != null) {
                    hb7Var.b();
                }
                if (tqVar.t0 && (viewGroup = tqVar.u0) != null && viewGroup.isLaidOut()) {
                    tqVar.p0.setAlpha(RecyclerView.A1);
                    hb7 b = aa7.b(tqVar.p0);
                    b.a(1.0f);
                    tqVar.s0 = b;
                    b.d(new kq(0, this));
                    return;
                }
                tqVar.p0.setAlpha(1.0f);
                tqVar.p0.setVisibility(0);
                return;
        }
    }
}
