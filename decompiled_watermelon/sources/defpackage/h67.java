package defpackage;

import java.io.Serializable;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: h67  reason: default package */
/* loaded from: classes.dex */
public final class h67 implements Comparable, Serializable {
    public static final h67 L = new h67(0, 0);
    public final long A;
    public final long B;

    public h67(long j, long j2) {
        this.A = j;
        this.B = j2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        h67 h67Var = (h67) obj;
        h67Var.getClass();
        long j = h67Var.A;
        long j2 = this.A;
        if (j2 != j) {
            return Long.compare(j2 ^ Long.MIN_VALUE, j ^ Long.MIN_VALUE);
        }
        return Long.compare(this.B ^ Long.MIN_VALUE, h67Var.B ^ Long.MIN_VALUE);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h67)) {
            return false;
        }
        h67 h67Var = (h67) obj;
        if (this.A == h67Var.A && this.B == h67Var.B) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.A ^ this.B);
    }

    public final String toString() {
        byte[] bArr = new byte[36];
        gk2.K(this.A, bArr, 0, 0, 4);
        bArr[8] = 45;
        gk2.K(this.A, bArr, 9, 4, 6);
        bArr[13] = 45;
        gk2.K(this.A, bArr, 14, 6, 8);
        bArr[18] = 45;
        gk2.K(this.B, bArr, 19, 0, 2);
        bArr[23] = 45;
        gk2.K(this.B, bArr, 24, 2, 8);
        return new String(bArr, hk0.a);
    }
}
