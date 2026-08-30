package e9;

import fj.e0;
import fj.m;
import java.io.IOException;
import mc.l;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class f extends m {
    public final /* synthetic */ int B = 0;
    public boolean L;
    public final l R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(e0 e0Var, l lVar) {
        super(e0Var);
        e0Var.getClass();
        this.R = lVar;
    }

    @Override // fj.m, fj.e0
    public final void A(fj.e eVar, long j2) {
        switch (this.B) {
            case 0:
                if (this.L) {
                    eVar.skip(j2);
                    return;
                }
                try {
                    this.A.A(eVar, j2);
                    return;
                } catch (IOException e6) {
                    this.L = true;
                    ((a2.c) this.R).k(e6);
                    return;
                }
            default:
                if (this.L) {
                    eVar.skip(j2);
                    return;
                }
                try {
                    this.A.A(eVar, j2);
                    return;
                } catch (IOException e10) {
                    this.L = true;
                    this.R.k(e10);
                    return;
                }
        }
    }

    @Override // fj.m, fj.e0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.B) {
            case 0:
                try {
                    super.close();
                    return;
                } catch (IOException e6) {
                    this.L = true;
                    ((a2.c) this.R).k(e6);
                    return;
                }
            default:
                try {
                    super.close();
                    return;
                } catch (IOException e10) {
                    this.L = true;
                    this.R.k(e10);
                    return;
                }
        }
    }

    @Override // fj.m, fj.e0, java.io.Flushable
    public final void flush() {
        switch (this.B) {
            case 0:
                try {
                    super.flush();
                    return;
                } catch (IOException e6) {
                    this.L = true;
                    ((a2.c) this.R).k(e6);
                    return;
                }
            default:
                if (!this.L) {
                    try {
                        super.flush();
                        return;
                    } catch (IOException e10) {
                        this.L = true;
                        this.R.k(e10);
                        return;
                    }
                }
                return;
        }
    }

    public f(e0 e0Var, a2.c cVar) {
        super(e0Var);
        this.R = cVar;
    }
}
