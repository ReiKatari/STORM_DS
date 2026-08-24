package defpackage;

import java.io.IOException;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: v92  reason: default package */
/* loaded from: classes.dex */
public final class v92 extends jk2 {
    public final /* synthetic */ int B = 1;
    public boolean L;
    public final qn2 R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v92(ui6 ui6Var, qn2 qn2Var) {
        super(ui6Var);
        ui6Var.getClass();
        this.R = qn2Var;
    }

    @Override // defpackage.jk2, defpackage.ui6
    public final void O(k80 k80Var, long j) {
        int i = this.B;
        qn2 qn2Var = this.R;
        ui6 ui6Var = this.A;
        switch (i) {
            case 0:
                if (this.L) {
                    k80Var.skip(j);
                    return;
                }
                try {
                    ui6Var.O(k80Var, j);
                    return;
                } catch (IOException e) {
                    this.L = true;
                    qn2Var.g(e);
                    return;
                }
            default:
                if (this.L) {
                    k80Var.skip(j);
                    return;
                }
                try {
                    ui6Var.O(k80Var, j);
                    return;
                } catch (IOException e2) {
                    this.L = true;
                    ((k0) qn2Var).g(e2);
                    return;
                }
        }
    }

    @Override // defpackage.jk2, defpackage.ui6, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.B) {
            case 0:
                try {
                    super.close();
                    return;
                } catch (IOException e) {
                    this.L = true;
                    this.R.g(e);
                    return;
                }
            default:
                try {
                    super.close();
                    return;
                } catch (IOException e2) {
                    this.L = true;
                    ((k0) this.R).g(e2);
                    return;
                }
        }
    }

    @Override // defpackage.jk2, defpackage.ui6, java.io.Flushable
    public final void flush() {
        switch (this.B) {
            case 0:
                if (!this.L) {
                    try {
                        super.flush();
                        return;
                    } catch (IOException e) {
                        this.L = true;
                        this.R.g(e);
                        return;
                    }
                }
                return;
            default:
                try {
                    super.flush();
                    return;
                } catch (IOException e2) {
                    this.L = true;
                    ((k0) this.R).g(e2);
                    return;
                }
        }
    }

    public v92(ui6 ui6Var, k0 k0Var) {
        super(ui6Var);
        this.R = k0Var;
    }
}
