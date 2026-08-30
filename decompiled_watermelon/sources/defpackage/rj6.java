package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: rj6  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class rj6 implements Runnable {
    public final /* synthetic */ int A;
    public final /* synthetic */ vj6 B;

    public /* synthetic */ rj6(vj6 vj6Var, int i) {
        this.A = i;
        this.B = vj6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.A;
        vj6 vj6Var = this.B;
        switch (i) {
            case 0:
                vj6Var.a();
                return;
            case 1:
                vj6Var.b();
                return;
            default:
                ck6 ck6Var = vj6Var.q;
                if (ck6Var != null) {
                    ck6Var.p();
                }
                if (vj6Var.p == null) {
                    vj6Var.o.b();
                }
                vj6Var.p = null;
                return;
        }
    }
}
