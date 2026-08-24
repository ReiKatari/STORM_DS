package defpackage;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: uq  reason: default package */
/* loaded from: classes.dex */
public final class uq implements Runnable {
    public final /* synthetic */ int A;
    public final /* synthetic */ fr B;

    public /* synthetic */ uq(fr frVar, int i) {
        this.A = i;
        this.B = frVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewGroup viewGroup;
        int i = this.A;
        fr frVar = this.B;
        switch (i) {
            case 0:
                if ((frVar.U0 & 1) != 0) {
                    frVar.y(0);
                }
                if ((frVar.U0 & 4096) != 0) {
                    frVar.y(108);
                }
                frVar.T0 = false;
                frVar.U0 = 0;
                return;
            default:
                frVar.r0.showAtLocation(frVar.q0, 55, 0, 0);
                ip7 ip7Var = frVar.t0;
                if (ip7Var != null) {
                    ip7Var.b();
                }
                if (frVar.u0 && (viewGroup = frVar.v0) != null && viewGroup.isLaidOut()) {
                    frVar.q0.setAlpha(RecyclerView.B1);
                    ip7 b = ao7.b(frVar.q0);
                    b.a(1.0f);
                    frVar.t0 = b;
                    b.d(new wq(this, 0));
                    return;
                }
                frVar.q0.setAlpha(1.0f);
                frVar.q0.setVisibility(0);
                return;
        }
    }
}
