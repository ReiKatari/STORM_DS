package defpackage;

import java.util.Arrays;
import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: yv4  reason: default package */
/* loaded from: classes.dex */
public abstract class yv4 {
    public int A;
    public Object B;

    public yv4() {
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

    public abstract vf7 k0(vf7 vf7Var, List list);

    public abstract wv6 l0(ze7 ze7Var, wv6 wv6Var);

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

    public yv4(int i) {
        this.A = i;
    }

    public void i0(ze7 ze7Var) {
    }

    public void j0(ze7 ze7Var) {
    }
}
