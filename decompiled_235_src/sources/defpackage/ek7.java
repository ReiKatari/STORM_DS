package defpackage;

import java.io.Serializable;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ek7  reason: default package */
/* loaded from: classes.dex */
public final class ek7 implements Comparable, Serializable {
    public static final ek7 L = new ek7(0, 0);
    public final long A;
    public final long B;

    public ek7(long j, long j2) {
        this.A = j;
        this.B = j2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        ek7 ek7Var = (ek7) obj;
        ek7Var.getClass();
        long j = ek7Var.A;
        long j2 = this.A;
        if (j2 != j) {
            return Long.compare(j2 ^ Long.MIN_VALUE, j ^ Long.MIN_VALUE);
        }
        return Long.compare(this.B ^ Long.MIN_VALUE, ek7Var.B ^ Long.MIN_VALUE);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ek7)) {
            return false;
        }
        ek7 ek7Var = (ek7) obj;
        if (this.A == ek7Var.A && this.B == ek7Var.B) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.A ^ this.B);
    }

    public final String toString() {
        byte[] bArr = new byte[36];
        xk2.i(this.A, bArr, 0, 0, 4);
        bArr[8] = 45;
        xk2.i(this.A, bArr, 9, 4, 6);
        bArr[13] = 45;
        xk2.i(this.A, bArr, 14, 6, 8);
        bArr[18] = 45;
        xk2.i(this.B, bArr, 19, 0, 2);
        bArr[23] = 45;
        xk2.i(this.B, bArr, 24, 2, 8);
        return new String(bArr, qm0.a);
    }
}
