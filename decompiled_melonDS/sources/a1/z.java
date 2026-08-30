package a1;

import java.util.Arrays;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class z {

    /* renamed from: a  reason: collision with root package name */
    public long[] f119a;

    /* renamed from: b  reason: collision with root package name */
    public int f120b;

    public z(int i2) {
        long[] jArr;
        if (i2 == 0) {
            jArr = p.f87a;
        } else {
            jArr = new long[i2];
        }
        this.f119a = jArr;
    }

    public final void a(long j2) {
        int i2 = this.f120b + 1;
        long[] jArr = this.f119a;
        if (jArr.length < i2) {
            this.f119a = Arrays.copyOf(jArr, Math.max(i2, (jArr.length * 3) / 2));
        }
        long[] jArr2 = this.f119a;
        int i10 = this.f120b;
        jArr2[i10] = j2;
        this.f120b = i10 + 1;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof z) {
            z zVar = (z) obj;
            int i2 = zVar.f120b;
            int i10 = this.f120b;
            if (i2 == i10) {
                long[] jArr = this.f119a;
                long[] jArr2 = zVar.f119a;
                sc.d L = p7.j.L(0, i10);
                int i11 = L.A;
                int i12 = L.B;
                if (i11 <= i12) {
                    while (jArr[i11] == jArr2[i11]) {
                        if (i11 != i12) {
                            i11++;
                        } else {
                            return true;
                        }
                    }
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long[] jArr = this.f119a;
        int i2 = this.f120b;
        int i10 = 0;
        for (int i11 = 0; i11 < i2; i11++) {
            i10 += Long.hashCode(jArr[i11]) * 31;
        }
        return i10;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) "[");
        long[] jArr = this.f119a;
        int i2 = this.f120b;
        int i10 = 0;
        while (true) {
            if (i10 < i2) {
                long j2 = jArr[i10];
                if (i10 == -1) {
                    sb2.append((CharSequence) "...");
                    break;
                }
                if (i10 != 0) {
                    sb2.append((CharSequence) ", ");
                }
                sb2.append(j2);
                i10++;
            } else {
                sb2.append((CharSequence) "]");
                break;
            }
        }
        return sb2.toString();
    }
}
