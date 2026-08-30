package defpackage;

import java.io.IOException;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: c52  reason: default package */
/* loaded from: classes.dex */
public final class c52 extends kf2 {
    public final /* synthetic */ int B = 1;
    public boolean L;
    public final mi2 R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c52(g76 g76Var, mi2 mi2Var) {
        super(g76Var);
        g76Var.getClass();
        this.R = mi2Var;
    }

    @Override // defpackage.kf2, defpackage.g76, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.B) {
            case 0:
                try {
                    super.close();
                    return;
                } catch (IOException e) {
                    this.L = true;
                    this.R.n(e);
                    return;
                }
            default:
                try {
                    super.close();
                    return;
                } catch (IOException e2) {
                    this.L = true;
                    ((j0) this.R).n(e2);
                    return;
                }
        }
    }

    @Override // defpackage.kf2, defpackage.g76, java.io.Flushable
    public final void flush() {
        switch (this.B) {
            case 0:
                if (!this.L) {
                    try {
                        super.flush();
                        return;
                    } catch (IOException e) {
                        this.L = true;
                        this.R.n(e);
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
                    ((j0) this.R).n(e2);
                    return;
                }
        }
    }

    @Override // defpackage.kf2, defpackage.g76
    public final void l(f60 f60Var, long j) {
        int i = this.B;
        mi2 mi2Var = this.R;
        g76 g76Var = this.A;
        switch (i) {
            case 0:
                if (this.L) {
                    f60Var.skip(j);
                    return;
                }
                try {
                    g76Var.l(f60Var, j);
                    return;
                } catch (IOException e) {
                    this.L = true;
                    mi2Var.n(e);
                    return;
                }
            default:
                if (this.L) {
                    f60Var.skip(j);
                    return;
                }
                try {
                    g76Var.l(f60Var, j);
                    return;
                } catch (IOException e2) {
                    this.L = true;
                    ((j0) mi2Var).n(e2);
                    return;
                }
        }
    }

    public c52(g76 g76Var, j0 j0Var) {
        super(g76Var);
        this.R = j0Var;
    }
}
