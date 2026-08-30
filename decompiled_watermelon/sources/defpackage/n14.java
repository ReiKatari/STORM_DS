package defpackage;

import java.util.Arrays;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: n14  reason: default package */
/* loaded from: classes.dex */
public final class n14 {
    public long[] a;
    public int b;

    public n14(int i) {
        long[] jArr;
        if (i == 0) {
            jArr = bs3.a;
        } else {
            jArr = new long[i];
        }
        this.a = jArr;
    }

    public final void a(long j) {
        int i = this.b + 1;
        long[] jArr = this.a;
        if (jArr.length < i) {
            this.a = Arrays.copyOf(jArr, Math.max(i, (jArr.length * 3) / 2));
        }
        long[] jArr2 = this.a;
        int i2 = this.b;
        jArr2[i2] = j;
        this.b = i2 + 1;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof n14) {
            n14 n14Var = (n14) obj;
            int i = n14Var.b;
            int i2 = this.b;
            if (i == i2) {
                long[] jArr = this.a;
                long[] jArr2 = n14Var.a;
                d33 t0 = io2.t0(0, i2);
                int i3 = t0.A;
                int i4 = t0.B;
                if (i3 <= i4) {
                    while (jArr[i3] == jArr2[i3]) {
                        if (i3 != i4) {
                            i3++;
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
        long[] jArr = this.a;
        int i = this.b;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += Long.hashCode(jArr[i3]) * 31;
        }
        return i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "[");
        long[] jArr = this.a;
        int i = this.b;
        int i2 = 0;
        while (true) {
            if (i2 < i) {
                long j = jArr[i2];
                if (i2 == -1) {
                    sb.append((CharSequence) "...");
                    break;
                }
                if (i2 != 0) {
                    sb.append((CharSequence) ", ");
                }
                sb.append(j);
                i2++;
            } else {
                sb.append((CharSequence) "]");
                break;
            }
        }
        return sb.toString();
    }

    public /* synthetic */ n14() {
        this(16);
    }
}
