package defpackage;

import android.util.Log;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: x90  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class x90 implements mi2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ ca0 B;

    public /* synthetic */ x90(ca0 ca0Var, int i) {
        this.A = i;
        this.B = ca0Var;
    }

    @Override // defpackage.mi2
    public final Object n(Object obj) {
        boolean z;
        int i = this.A;
        ca0 ca0Var = this.B;
        switch (i) {
            case 0:
                Throwable th = (Throwable) obj;
                synchronized (ca0Var.q) {
                    ca0Var.s = oc0.t;
                    Log.d("CXCP", ca0Var + " is closed");
                }
                p90 p90Var = ca0Var.o;
                Log.d("CXCP", ca0Var + " finalized");
                synchronized (p90Var.f) {
                    p90Var.g.remove(ca0Var);
                }
                gs0 gs0Var = ca0Var.x;
                o27 o27Var = o27.a;
                gs0Var.c0(o27Var);
                iq2.f(ca0Var.a, null);
                return o27Var;
            default:
                ((o27) obj).getClass();
                synchronized (ca0Var.q) {
                    z = ca0Var.r;
                }
                return Boolean.valueOf(z);
        }
    }
}
