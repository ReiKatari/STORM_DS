package yc;

import java.io.Serializable;
import p7.l;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class a implements Comparable, Serializable {
    public static final a L = new a(0, 0);
    public final long A;
    public final long B;

    public a(long j2, long j10) {
        this.A = j2;
        this.B = j10;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        a aVar = (a) obj;
        aVar.getClass();
        long j2 = aVar.A;
        long j10 = this.A;
        if (j10 != j2) {
            return Long.compare(j10 ^ Long.MIN_VALUE, j2 ^ Long.MIN_VALUE);
        }
        return Long.compare(this.B ^ Long.MIN_VALUE, aVar.B ^ Long.MIN_VALUE);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.A == aVar.A && this.B == aVar.B) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.A ^ this.B);
    }

    public final String toString() {
        byte[] bArr = new byte[36];
        l.j(this.A, bArr, 0, 0, 4);
        bArr[8] = 45;
        l.j(this.A, bArr, 9, 4, 6);
        bArr[13] = 45;
        l.j(this.A, bArr, 14, 6, 8);
        bArr[18] = 45;
        l.j(this.B, bArr, 19, 0, 2);
        bArr[23] = 45;
        l.j(this.B, bArr, 24, 2, 8);
        return new String(bArr, vc.a.f13781a);
    }
}
