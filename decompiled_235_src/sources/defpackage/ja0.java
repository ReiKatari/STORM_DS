package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ja0  reason: default package */
/* loaded from: classes.dex */
public final class ja0 extends jk2 {
    public final /* synthetic */ la0 B;
    public final /* synthetic */ ka0 L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ja0(la0 la0Var, ka0 ka0Var, ui6 ui6Var) {
        super(ui6Var);
        this.B = la0Var;
        this.L = ka0Var;
    }

    @Override // defpackage.jk2, defpackage.ui6, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        la0 la0Var = this.B;
        ka0 ka0Var = this.L;
        synchronized (la0Var) {
            if (ka0Var.a) {
                return;
            }
            ka0Var.a = true;
            super.close();
            ((bk1) this.L.b).d();
        }
    }
}
