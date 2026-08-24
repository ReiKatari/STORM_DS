package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ck1  reason: default package */
/* loaded from: classes.dex */
public final class ck1 extends kk2 {
    public boolean B;
    public final /* synthetic */ kk1 L;
    public final /* synthetic */ dk1 R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ck1(in6 in6Var, kk1 kk1Var, dk1 dk1Var) {
        super(in6Var);
        this.L = kk1Var;
        this.R = dk1Var;
    }

    @Override // defpackage.kk2, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        super.close();
        if (!this.B) {
            this.B = true;
            kk1 kk1Var = this.L;
            dk1 dk1Var = this.R;
            synchronized (kk1Var) {
                int i = dk1Var.h - 1;
                dk1Var.h = i;
                if (i == 0 && dk1Var.f) {
                    kk1Var.F(dk1Var);
                }
            }
        }
    }
}
