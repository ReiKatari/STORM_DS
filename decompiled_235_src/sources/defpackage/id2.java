package defpackage;

import java.io.IOException;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: id2  reason: default package */
/* loaded from: classes.dex */
public final class id2 extends kk2 {
    public final long B;
    public final boolean L;
    public long R;

    public id2(in6 in6Var, long j, boolean z) {
        super(in6Var);
        this.B = j;
        this.L = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [k80, java.lang.Object] */
    @Override // defpackage.kk2, defpackage.in6
    public final long b0(k80 k80Var, long j) {
        k80Var.getClass();
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
        long b0 = this.A.b0(k80Var, j);
        int i = (b0 > (-1L) ? 1 : (b0 == (-1L) ? 0 : -1));
        if (i != 0) {
            this.R += b0;
        }
        long j5 = this.R;
        int i2 = (j5 > j3 ? 1 : (j5 == j3 ? 0 : -1));
        if ((i2 < 0 && i == 0) || i2 > 0) {
            if (b0 > 0 && i2 > 0) {
                ?? obj = new Object();
                obj.m0(k80Var);
                k80Var.O(obj, k80Var.B - (j5 - j3));
                obj.e();
            }
            StringBuilder s = xg6.s(j3, "expected ", " bytes but got ");
            s.append(this.R);
            throw new IOException(s.toString());
        }
        return b0;
    }
}
