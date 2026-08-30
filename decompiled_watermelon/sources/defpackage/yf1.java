package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: yf1  reason: default package */
/* loaded from: classes.dex */
public final class yf1 extends lf2 {
    public boolean B;
    public final /* synthetic */ gg1 L;
    public final /* synthetic */ zf1 R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yf1(sb6 sb6Var, gg1 gg1Var, zf1 zf1Var) {
        super(sb6Var);
        this.L = gg1Var;
        this.R = zf1Var;
    }

    @Override // defpackage.lf2, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        super.close();
        if (!this.B) {
            this.B = true;
            gg1 gg1Var = this.L;
            zf1 zf1Var = this.R;
            synchronized (gg1Var) {
                int i = zf1Var.h - 1;
                zf1Var.h = i;
                if (i == 0 && zf1Var.f) {
                    gg1Var.J(zf1Var);
                }
            }
        }
    }
}
