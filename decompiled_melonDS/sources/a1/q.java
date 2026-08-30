package a1;

import java.util.Arrays;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class q implements Cloneable {
    public /* synthetic */ boolean A;
    public /* synthetic */ long[] B;
    public /* synthetic */ Object[] L;
    public /* synthetic */ int R;

    public q(int i2) {
        if (i2 == 0) {
            this.B = b1.a.f1740b;
            this.L = b1.a.f1741c;
            return;
        }
        int i10 = i2 * 8;
        int i11 = 4;
        while (true) {
            if (i11 >= 32) {
                break;
            }
            int i12 = (1 << i11) - 12;
            if (i10 <= i12) {
                i10 = i12;
                break;
            }
            i11++;
        }
        int i13 = i10 / 8;
        this.B = new long[i13];
        this.L = new Object[i13];
    }

    public final void a() {
        int i2 = this.R;
        Object[] objArr = this.L;
        for (int i10 = 0; i10 < i2; i10++) {
            objArr[i10] = null;
        }
        this.R = 0;
        this.A = false;
    }

    public final Object b(long j2) {
        Object obj;
        int b10 = b1.a.b(this.B, this.R, j2);
        if (b10 >= 0 && (obj = this.L[b10]) != r.f89a) {
            return obj;
        }
        return null;
    }

    public final int c(long j2) {
        if (this.A) {
            int i2 = this.R;
            long[] jArr = this.B;
            Object[] objArr = this.L;
            int i10 = 0;
            for (int i11 = 0; i11 < i2; i11++) {
                Object obj = objArr[i11];
                if (obj != r.f89a) {
                    if (i11 != i10) {
                        jArr[i10] = jArr[i11];
                        objArr[i10] = obj;
                        objArr[i11] = null;
                    }
                    i10++;
                }
            }
            this.A = false;
            this.R = i10;
        }
        return b1.a.b(this.B, this.R, j2);
    }

    public final Object clone() {
        Object clone = super.clone();
        clone.getClass();
        q qVar = (q) clone;
        qVar.B = (long[]) this.B.clone();
        qVar.L = (Object[]) this.L.clone();
        return qVar;
    }

    public final boolean e() {
        if (j() == 0) {
            return true;
        }
        return false;
    }

    public final long f(int i2) {
        int i10;
        if (i2 >= 0 && i2 < (i10 = this.R)) {
            if (this.A) {
                long[] jArr = this.B;
                Object[] objArr = this.L;
                int i11 = 0;
                for (int i12 = 0; i12 < i10; i12++) {
                    Object obj = objArr[i12];
                    if (obj != r.f89a) {
                        if (i12 != i11) {
                            jArr[i11] = jArr[i12];
                            objArr[i11] = obj;
                            objArr[i12] = null;
                        }
                        i11++;
                    }
                }
                this.A = false;
                this.R = i11;
            }
            return this.B[i2];
        }
        a0.j.h(w.d.l(i2, "Expected index to be within 0..size()-1, but was "));
        return 0L;
    }

    public final void g(long j2, Object obj) {
        Object obj2 = r.f89a;
        int b10 = b1.a.b(this.B, this.R, j2);
        if (b10 >= 0) {
            this.L[b10] = obj;
            return;
        }
        int i2 = ~b10;
        int i10 = this.R;
        if (i2 < i10) {
            Object[] objArr = this.L;
            if (objArr[i2] == obj2) {
                this.B[i2] = j2;
                objArr[i2] = obj;
                return;
            }
        }
        if (this.A) {
            long[] jArr = this.B;
            if (i10 >= jArr.length) {
                Object[] objArr2 = this.L;
                int i11 = 0;
                for (int i12 = 0; i12 < i10; i12++) {
                    Object obj3 = objArr2[i12];
                    if (obj3 != obj2) {
                        if (i12 != i11) {
                            jArr[i11] = jArr[i12];
                            objArr2[i11] = obj3;
                            objArr2[i12] = null;
                        }
                        i11++;
                    }
                }
                this.A = false;
                this.R = i11;
                i2 = ~b1.a.b(this.B, i11, j2);
            }
        }
        int i13 = this.R;
        if (i13 >= this.B.length) {
            int i14 = (i13 + 1) * 8;
            int i15 = 4;
            while (true) {
                if (i15 >= 32) {
                    break;
                }
                int i16 = (1 << i15) - 12;
                if (i14 <= i16) {
                    i14 = i16;
                    break;
                }
                i15++;
            }
            int i17 = i14 / 8;
            this.B = Arrays.copyOf(this.B, i17);
            this.L = Arrays.copyOf(this.L, i17);
        }
        int i18 = this.R;
        if (i18 - i2 != 0) {
            long[] jArr2 = this.B;
            int i19 = i2 + 1;
            zb.k.h(jArr2, jArr2, i19, i2, i18);
            Object[] objArr3 = this.L;
            zb.k.i(objArr3, objArr3, i19, i2, this.R);
        }
        this.B[i2] = j2;
        this.L[i2] = obj;
        this.R++;
    }

    public final void h(long j2) {
        int b10 = b1.a.b(this.B, this.R, j2);
        if (b10 >= 0) {
            Object[] objArr = this.L;
            Object obj = objArr[b10];
            Object obj2 = r.f89a;
            if (obj != obj2) {
                objArr[b10] = obj2;
                this.A = true;
            }
        }
    }

    public final int j() {
        if (this.A) {
            int i2 = this.R;
            long[] jArr = this.B;
            Object[] objArr = this.L;
            int i10 = 0;
            for (int i11 = 0; i11 < i2; i11++) {
                Object obj = objArr[i11];
                if (obj != r.f89a) {
                    if (i11 != i10) {
                        jArr[i10] = jArr[i11];
                        objArr[i10] = obj;
                        objArr[i11] = null;
                    }
                    i10++;
                }
            }
            this.A = false;
            this.R = i10;
        }
        return this.R;
    }

    public final Object k(int i2) {
        int i10;
        if (i2 >= 0 && i2 < (i10 = this.R)) {
            if (this.A) {
                long[] jArr = this.B;
                Object[] objArr = this.L;
                int i11 = 0;
                for (int i12 = 0; i12 < i10; i12++) {
                    Object obj = objArr[i12];
                    if (obj != r.f89a) {
                        if (i12 != i11) {
                            jArr[i11] = jArr[i12];
                            objArr[i11] = obj;
                            objArr[i12] = null;
                        }
                        i11++;
                    }
                }
                this.A = false;
                this.R = i11;
            }
            return this.L[i2];
        }
        a0.j.h(w.d.l(i2, "Expected index to be within 0..size()-1, but was "));
        return null;
    }

    public final String toString() {
        if (j() <= 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.R * 28);
        sb2.append('{');
        int i2 = this.R;
        for (int i10 = 0; i10 < i2; i10++) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            sb2.append(f(i10));
            sb2.append('=');
            Object k10 = k(i10);
            if (k10 != sb2) {
                sb2.append(k10);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        return sb2.toString();
    }

    public /* synthetic */ q(Object obj) {
        this(10);
    }
}
