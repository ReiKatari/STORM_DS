package defpackage;

import java.io.IOException;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: q82  reason: default package */
/* loaded from: classes.dex */
public final class q82 extends lf2 {
    public final long B;
    public final boolean L;
    public long R;

    public q82(sb6 sb6Var, long j, boolean z) {
        super(sb6Var);
        this.B = j;
        this.L = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [f60, java.lang.Object] */
    @Override // defpackage.lf2, defpackage.sb6
    public final long L(f60 f60Var, long j) {
        f60Var.getClass();
        long j2 = this.R;
        long j3 = this.B;
        if (j2 > j3) {
            j = 0;
        } else if (this.L) {
            long j4 = j3 - j2;
            if (j4 == 0) {
                return -1L;
            }
            j = Math.min(j, j4);
        }
        long L = this.A.L(f60Var, j);
        int i = (L > (-1L) ? 1 : (L == (-1L) ? 0 : -1));
        if (i != 0) {
            this.R += L;
        }
        long j5 = this.R;
        int i2 = (j5 > j3 ? 1 : (j5 == j3 ? 0 : -1));
        if ((i2 < 0 && i == 0) || i2 > 0) {
            if (L > 0 && i2 > 0) {
                ?? obj = new Object();
                obj.l0(f60Var);
                f60Var.l(obj, f60Var.B - (j5 - j3));
                obj.w();
            }
            StringBuilder q = wh1.q(j3, "expected ", " bytes but got ");
            q.append(this.R);
            throw new IOException(q.toString());
        }
        return L;
    }
}
