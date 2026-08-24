package defpackage;

import java.util.Arrays;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: f55  reason: default package */
/* loaded from: classes.dex */
public abstract class f55 {
    public int A;
    public Object B;

    public f55() {
        this.B = new long[8];
        this.A = -1;
    }

    public long h0() {
        int i = this.A;
        if (i == -1) {
            return 19500L;
        }
        return ((long[]) this.B)[i];
    }

    public abstract vu7 k0(vu7 vu7Var, List list);

    public abstract rr6 l0(au7 au7Var, rr6 rr6Var);

    public long m0() {
        int i = this.A;
        if (i == -1) {
            return 19500L;
        }
        this.A = i - 1;
        return ((long[]) this.B)[i];
    }

    public void n0(long j) {
        if (j == 19500) {
            return;
        }
        int i = this.A + 1;
        this.A = i;
        long[] jArr = (long[]) this.B;
        if (i >= jArr.length) {
            this.B = Arrays.copyOf(jArr, jArr.length * 2);
        }
        ((long[]) this.B)[i] = j;
    }

    public f55(int i) {
        this.A = i;
    }

    public void i0(au7 au7Var) {
    }

    public void j0(au7 au7Var) {
    }
}
