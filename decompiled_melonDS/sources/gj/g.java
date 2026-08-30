package gj;

import fj.g0;
import fj.n;
import java.io.IOException;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class g extends n {
    public final long B;
    public final boolean L;
    public long R;

    public g(g0 g0Var, long j2, boolean z10) {
        super(g0Var);
        this.B = j2;
        this.L = z10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [fj.e, java.lang.Object] */
    @Override // fj.n, fj.g0
    public final long k(fj.e eVar, long j2) {
        eVar.getClass();
        long j10 = this.R;
        long j11 = this.B;
        if (j10 > j11) {
            j2 = 0;
        } else if (this.L) {
            long j12 = j11 - j10;
            if (j12 == 0) {
                return -1L;
            }
            j2 = Math.min(j2, j12);
        }
        long k10 = this.A.k(eVar, j2);
        int i2 = (k10 > (-1L) ? 1 : (k10 == (-1L) ? 0 : -1));
        if (i2 != 0) {
            this.R += k10;
        }
        long j13 = this.R;
        int i10 = (j13 > j11 ? 1 : (j13 == j11 ? 0 : -1));
        if ((i10 < 0 && i2 == 0) || i10 > 0) {
            if (k10 > 0 && i10 > 0) {
                ?? obj = new Object();
                obj.d0(eVar);
                eVar.A(obj, eVar.B - (j13 - j11));
                obj.t();
            }
            throw new IOException("expected " + j11 + " bytes but got " + this.R);
        }
        return k10;
    }
}
