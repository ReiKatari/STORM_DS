package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: b80  reason: default package */
/* loaded from: classes.dex */
public final class b80 extends kf2 {
    public final /* synthetic */ d80 B;
    public final /* synthetic */ c80 L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b80(d80 d80Var, c80 c80Var, g76 g76Var) {
        super(g76Var);
        this.B = d80Var;
        this.L = c80Var;
    }

    @Override // defpackage.kf2, defpackage.g76, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        d80 d80Var = this.B;
        c80 c80Var = this.L;
        synchronized (d80Var) {
            if (c80Var.a) {
                return;
            }
            c80Var.a = true;
            super.close();
            ((xf1) this.L.b).e();
        }
    }
}
