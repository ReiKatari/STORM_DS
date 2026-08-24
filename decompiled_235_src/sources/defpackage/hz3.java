package defpackage;

import java.util.Arrays;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: hz3  reason: default package */
/* loaded from: classes.dex */
public final class hz3 implements Cloneable {
    public /* synthetic */ boolean A;
    public /* synthetic */ long[] B;
    public /* synthetic */ Object[] L;
    public /* synthetic */ int R;

    public hz3(int i) {
        if (i == 0) {
            this.B = g04.h;
            this.L = g04.i;
            return;
        }
        int i2 = i * 8;
        int i3 = 4;
        while (true) {
            if (i3 >= 32) {
                break;
            }
            int i4 = (1 << i3) - 12;
            if (i2 <= i4) {
                i2 = i4;
                break;
            }
            i3++;
        }
        int i5 = i2 / 8;
        this.B = new long[i5];
        this.L = new Object[i5];
    }

    public final void a() {
        int i = this.R;
        Object[] objArr = this.L;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.R = 0;
        this.A = false;
    }

    public final Object b(long j) {
        Object obj;
        int w = g04.w(this.B, this.R, j);
        if (w >= 0 && (obj = this.L[w]) != hv.h) {
            return obj;
        }
        return null;
    }

    public final int c(long j) {
        if (this.A) {
            int i = this.R;
            long[] jArr = this.B;
            Object[] objArr = this.L;
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                Object obj = objArr[i3];
                if (obj != hv.h) {
                    if (i3 != i2) {
                        jArr[i2] = jArr[i3];
                        objArr[i2] = obj;
                        objArr[i3] = null;
                    }
                    i2++;
                }
            }
            this.A = false;
            this.R = i2;
        }
        return g04.w(this.B, this.R, j);
    }

    public final Object clone() {
        Object clone = super.clone();
        clone.getClass();
        hz3 hz3Var = (hz3) clone;
        hz3Var.B = (long[]) this.B.clone();
        hz3Var.L = (Object[]) this.L.clone();
        return hz3Var;
    }

    public final boolean d() {
        if (i() == 0) {
            return true;
        }
        return false;
    }

    public final long e(int i) {
        int i2;
        if (i >= 0 && i < (i2 = this.R)) {
            if (this.A) {
                long[] jArr = this.B;
                Object[] objArr = this.L;
                int i3 = 0;
                for (int i4 = 0; i4 < i2; i4++) {
                    Object obj = objArr[i4];
                    if (obj != hv.h) {
                        if (i4 != i3) {
                            jArr[i3] = jArr[i4];
                            objArr[i3] = obj;
                            objArr[i4] = null;
                        }
                        i3++;
                    }
                }
                this.A = false;
                this.R = i3;
            }
            return this.B[i];
        }
        i.h(lb1.g(i, "Expected index to be within 0..size()-1, but was "));
        return 0L;
    }

    public final void f(long j, Object obj) {
        Object obj2 = hv.h;
        int w = g04.w(this.B, this.R, j);
        if (w >= 0) {
            this.L[w] = obj;
            return;
        }
        int i = ~w;
        int i2 = this.R;
        if (i < i2) {
            Object[] objArr = this.L;
            if (objArr[i] == obj2) {
                this.B[i] = j;
                objArr[i] = obj;
                return;
            }
        }
        if (this.A) {
            long[] jArr = this.B;
            if (i2 >= jArr.length) {
                Object[] objArr2 = this.L;
                int i3 = 0;
                for (int i4 = 0; i4 < i2; i4++) {
                    Object obj3 = objArr2[i4];
                    if (obj3 != obj2) {
                        if (i4 != i3) {
                            jArr[i3] = jArr[i4];
                            objArr2[i3] = obj3;
                            objArr2[i4] = null;
                        }
                        i3++;
                    }
                }
                this.A = false;
                this.R = i3;
                i = ~g04.w(this.B, i3, j);
            }
        }
        int i5 = this.R;
        if (i5 >= this.B.length) {
            int i6 = (i5 + 1) * 8;
            int i7 = 4;
            while (true) {
                if (i7 >= 32) {
                    break;
                }
                int i8 = (1 << i7) - 12;
                if (i6 <= i8) {
                    i6 = i8;
                    break;
                }
                i7++;
            }
            int i9 = i6 / 8;
            this.B = Arrays.copyOf(this.B, i9);
            this.L = Arrays.copyOf(this.L, i9);
        }
        int i10 = this.R;
        if (i10 - i != 0) {
            long[] jArr2 = this.B;
            int i11 = i + 1;
            fv.s0(jArr2, jArr2, i11, i, i10);
            Object[] objArr3 = this.L;
            fv.t0(objArr3, objArr3, i11, i, this.R);
        }
        this.B[i] = j;
        this.L[i] = obj;
        this.R++;
    }

    public final void g(long j) {
        int w = g04.w(this.B, this.R, j);
        if (w >= 0) {
            Object[] objArr = this.L;
            Object obj = objArr[w];
            Object obj2 = hv.h;
            if (obj != obj2) {
                objArr[w] = obj2;
                this.A = true;
            }
        }
    }

    public final int i() {
        if (this.A) {
            int i = this.R;
            long[] jArr = this.B;
            Object[] objArr = this.L;
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                Object obj = objArr[i3];
                if (obj != hv.h) {
                    if (i3 != i2) {
                        jArr[i2] = jArr[i3];
                        objArr[i2] = obj;
                        objArr[i3] = null;
                    }
                    i2++;
                }
            }
            this.A = false;
            this.R = i2;
        }
        return this.R;
    }

    public final Object j(int i) {
        int i2;
        if (i >= 0 && i < (i2 = this.R)) {
            if (this.A) {
                long[] jArr = this.B;
                Object[] objArr = this.L;
                int i3 = 0;
                for (int i4 = 0; i4 < i2; i4++) {
                    Object obj = objArr[i4];
                    if (obj != hv.h) {
                        if (i4 != i3) {
                            jArr[i3] = jArr[i4];
                            objArr[i3] = obj;
                            objArr[i4] = null;
                        }
                        i3++;
                    }
                }
                this.A = false;
                this.R = i3;
            }
            return this.L[i];
        }
        i.h(lb1.g(i, "Expected index to be within 0..size()-1, but was "));
        return null;
    }

    public final String toString() {
        if (i() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.R * 28);
        sb.append('{');
        int i = this.R;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            sb.append(e(i2));
            sb.append('=');
            Object j = j(i2);
            if (j != sb) {
                sb.append(j);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public /* synthetic */ hz3(Object obj) {
        this(10);
    }
}
