package defpackage;

import android.util.Log;
import androidx.fragment.app.b0;
import androidx.fragment.app.g;
import androidx.fragment.app.u;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: kf1  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class kf1 implements Runnable {
    public final /* synthetic */ int A;
    public final /* synthetic */ b0 B;
    public final /* synthetic */ g L;

    public /* synthetic */ kf1(b0 b0Var, g gVar, int i) {
        this.A = i;
        this.B = b0Var;
        this.L = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.A;
        g gVar = this.L;
        b0 b0Var = this.B;
        switch (i) {
            case 0:
                if (u.K(2)) {
                    Log.v("FragmentManager", "Transition for operation " + b0Var + " has completed");
                }
                b0Var.c(gVar);
                return;
            default:
                if (u.K(2)) {
                    Log.v("FragmentManager", "Transition for operation " + b0Var + " has completed");
                }
                b0Var.c(gVar);
                return;
        }
    }
}
