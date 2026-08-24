package defpackage;

import android.util.Log;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: fc0  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class fc0 implements qn2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ kc0 B;

    public /* synthetic */ fc0(kc0 kc0Var, int i) {
        this.A = i;
        this.B = kc0Var;
    }

    @Override // defpackage.qn2
    public final Object g(Object obj) {
        boolean z;
        int i = this.A;
        kc0 kc0Var = this.B;
        switch (i) {
            case 0:
                Throwable th = (Throwable) obj;
                synchronized (kc0Var.q) {
                    kc0Var.s = xe0.u;
                    Log.d("CXCP", kc0Var + " is closed");
                }
                xb0 xb0Var = kc0Var.o;
                Log.d("CXCP", kc0Var + " finalized");
                synchronized (xb0Var.f) {
                    xb0Var.g.remove(kc0Var);
                }
                tu0 tu0Var = kc0Var.x;
                jg7 jg7Var = jg7.a;
                tu0Var.b0(jg7Var);
                g04.x(kc0Var.a, null);
                return jg7Var;
            default:
                ((jg7) obj).getClass();
                synchronized (kc0Var.q) {
                    z = kc0Var.r;
                }
                return Boolean.valueOf(z);
        }
    }
}
