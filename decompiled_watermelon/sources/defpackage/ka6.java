package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ka6  reason: default package */
/* loaded from: classes.dex */
public final class ka6 implements Iterable, f93 {
    public static final ka6 X = new ka6(0, 0, 0, null);
    public final long A;
    public final long B;
    public final long L;
    public final long[] R;

    public ka6(long j, long j2, long j3, long[] jArr) {
        this.A = j;
        this.B = j2;
        this.L = j3;
        this.R = jArr;
    }

    public final ka6 b(ka6 ka6Var) {
        long[] jArr;
        ka6 ka6Var2 = this;
        ka6 ka6Var3 = X;
        if (ka6Var == ka6Var3) {
            return ka6Var2;
        }
        if (ka6Var2 == ka6Var3) {
            return ka6Var3;
        }
        long j = ka6Var.L;
        long j2 = ka6Var.L;
        long[] jArr2 = ka6Var.R;
        long j3 = ka6Var.B;
        long j4 = ka6Var.A;
        long j5 = ka6Var2.L;
        if (j == j5 && jArr2 == (jArr = ka6Var2.R)) {
            return new ka6(ka6Var2.A & (~j4), ka6Var2.B & (~j3), j5, jArr);
        }
        if (jArr2 != null) {
            for (long j6 : jArr2) {
                ka6Var2 = ka6Var2.c(j6);
            }
        }
        if (j3 != 0) {
            for (int i = 0; i < 64; i++) {
                if (((1 << i) & j3) != 0) {
                    ka6Var2 = ka6Var2.c(i + j2);
                }
            }
        }
        if (j4 != 0) {
            for (int i2 = 0; i2 < 64; i2++) {
                if (((1 << i2) & j4) != 0) {
                    ka6Var2 = ka6Var2.c(i2 + j2 + 64);
                }
            }
        }
        return ka6Var2;
    }

    public final ka6 c(long j) {
        long[] jArr;
        int l;
        long[] jArr2;
        long j2 = j - this.L;
        if (b53.F(j2, 0L) >= 0 && b53.F(j2, 64L) < 0) {
            long j3 = 1 << ((int) j2);
            long j4 = this.B;
            if ((j4 & j3) != 0) {
                return new ka6(this.A, j4 & (~j3), this.L, this.R);
            }
        } else if (b53.F(j2, 64L) >= 0 && b53.F(j2, 128L) < 0) {
            long j5 = 1 << (((int) j2) - 64);
            long j6 = this.A;
            if ((j6 & j5) != 0) {
                return new ka6(j6 & (~j5), this.B, this.L, this.R);
            }
        } else if (b53.F(j2, 0L) < 0 && (jArr = this.R) != null && (l = ep2.l(jArr, j)) >= 0) {
            int length = jArr.length;
            int i = length - 1;
            if (i == 0) {
                jArr2 = null;
            } else {
                long[] jArr3 = new long[i];
                if (l > 0) {
                    nu.e0(jArr, jArr3, 0, 0, l);
                }
                if (l < i) {
                    nu.e0(jArr, jArr3, l, l + 1, length);
                }
                jArr2 = jArr3;
            }
            return new ka6(this.A, this.B, this.L, jArr2);
        }
        return this;
    }

    public final boolean d(long j) {
        long[] jArr;
        long j2 = j - this.L;
        if (b53.F(j2, 0L) >= 0 && b53.F(j2, 64L) < 0) {
            if (((1 << ((int) j2)) & this.B) != 0) {
                return true;
            }
            return false;
        } else if (b53.F(j2, 64L) >= 0 && b53.F(j2, 128L) < 0) {
            if (((1 << (((int) j2) - 64)) & this.A) != 0) {
                return true;
            }
            return false;
        } else if (b53.F(j2, 0L) <= 0 && (jArr = this.R) != null && ep2.l(jArr, j) >= 0) {
            return true;
        } else {
            return false;
        }
    }

    public final ka6 i(ka6 ka6Var) {
        ka6 ka6Var2;
        long[] jArr;
        ka6 ka6Var3 = this;
        ka6 ka6Var4 = X;
        if (ka6Var == ka6Var4) {
            return ka6Var3;
        }
        if (ka6Var3 == ka6Var4) {
            return ka6Var;
        }
        long j = ka6Var.L;
        long j2 = ka6Var.L;
        long[] jArr2 = ka6Var.R;
        long j3 = ka6Var.B;
        long j4 = ka6Var.A;
        long j5 = ka6Var3.L;
        int i = (j > j5 ? 1 : (j == j5 ? 0 : -1));
        long j6 = ka6Var3.B;
        long j7 = ka6Var3.A;
        if (i == 0 && jArr2 == (jArr = ka6Var3.R)) {
            return new ka6(j7 | j4, j6 | j3, j5, jArr);
        }
        int i2 = 0;
        long[] jArr3 = ka6Var3.R;
        if (jArr3 == null) {
            if (jArr3 != null) {
                ka6Var2 = ka6Var;
                for (long j8 : jArr3) {
                    ka6Var2 = ka6Var2.j(j8);
                }
            } else {
                ka6Var2 = ka6Var;
            }
            int i3 = (j6 > 0L ? 1 : (j6 == 0L ? 0 : -1));
            long j9 = ka6Var3.L;
            if (i3 != 0) {
                for (int i4 = 0; i4 < 64; i4++) {
                    if (((1 << i4) & j6) != 0) {
                        ka6Var2 = ka6Var2.j(i4 + j9);
                    }
                }
            }
            if (j7 != 0) {
                while (i2 < 64) {
                    if (((1 << i2) & j7) != 0) {
                        ka6Var2 = ka6Var2.j(i2 + j9 + 64);
                    }
                    i2++;
                }
            }
            return ka6Var2;
        }
        if (jArr2 != null) {
            for (long j10 : jArr2) {
                ka6Var3 = ka6Var3.j(j10);
            }
        }
        if (j3 != 0) {
            for (int i5 = 0; i5 < 64; i5++) {
                if (((1 << i5) & j3) != 0) {
                    ka6Var3 = ka6Var3.j(i5 + j2);
                }
            }
        }
        if (j4 != 0) {
            while (i2 < 64) {
                if (((1 << i2) & j4) != 0) {
                    ka6Var3 = ka6Var3.j(i2 + j2 + 64);
                }
                i2++;
            }
        }
        return ka6Var3;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return io2.W(new ja6(this, null));
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x0130, code lost:
        if (r5 == null) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0132, code lost:
        r0 = (defpackage.n14) r5.A;
        r3 = r0.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0138, code lost:
        if (r3 != 0) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x013a, code lost:
        r0 = r29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x013d, code lost:
        r4 = new long[r3];
        r0 = r0.a;
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0142, code lost:
        if (r6 >= r3) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0144, code lost:
        r4[r6] = r0[r6];
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x014b, code lost:
        r0 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x014c, code lost:
        if (r0 != null) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x014f, code lost:
        r28 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0152, code lost:
        r28 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x015d, code lost:
        return new defpackage.ka6(r22, r24, r26, r28).j(r30);
     */
    /* JADX WARN: Type inference failed for: r5v10, types: [java.lang.Object, dz4] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.ka6 j(long r30) {
        /*
            Method dump skipped, instructions count: 415
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ka6.j(long):ka6");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(" [");
        ArrayList arrayList = new ArrayList(uq0.y0(this, 10));
        Iterator it = iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(((Number) it.next()).longValue()));
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) "");
        int size = arrayList.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = arrayList.get(i2);
            boolean z = true;
            i++;
            if (i > 1) {
                sb2.append((CharSequence) ", ");
            }
            if (obj != null) {
                z = obj instanceof CharSequence;
            }
            if (z) {
                sb2.append((CharSequence) obj);
            } else if (obj instanceof Character) {
                sb2.append(((Character) obj).charValue());
            } else {
                sb2.append((CharSequence) obj.toString());
            }
        }
        sb2.append((CharSequence) "");
        sb.append(sb2.toString());
        sb.append(']');
        return sb.toString();
    }
}
