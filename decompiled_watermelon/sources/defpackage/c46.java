package defpackage;

import java.util.Arrays;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: c46  reason: default package */
/* loaded from: classes.dex */
public class c46 extends s1 implements h24, u92, nj2 {
    public final int X;
    public final int Y;
    public final h60 Z;
    public Object[] c0;
    public long d0;
    public long e0;
    public int f0;
    public int g0;

    public c46(int i, int i2, h60 h60Var) {
        this.X = i;
        this.Y = i2;
        this.Z = h60Var;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|(3:(6:(1:(1:11)(2:46|47))(1:48)|12|13|14|15|(2:16|(3:38|39|(2:41|42)(2:43|37))(4:18|(1:23)|32|(1:34)(2:36|37))))(4:49|50|51|52)|30|31)(5:58|59|60|(1:62)|65)|53|54|15|(3:16|(0)(0)|37)))|68|6|(0)(0)|53|54|15|(3:16|(0)(0)|37)) */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0078, code lost:
        if (((defpackage.di6) r9).a(r0) == r1) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00a9, code lost:
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00aa, code lost:
        r5 = r8;
        r8 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00ba, code lost:
        throw r2.K();
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00cb, code lost:
        return r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ad A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0098 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.p31 l(defpackage.c46 r8, defpackage.w92 r9, defpackage.j11 r10) {
        /*
            Method dump skipped, instructions count: 208
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c46.l(c46, w92, j11):p31");
    }

    @Override // defpackage.u92
    public final Object a(w92 w92Var, j11 j11Var) {
        return l(this, w92Var, j11Var);
    }

    @Override // defpackage.h24, defpackage.w92
    public final Object b(Object obj, j11 j11Var) {
        c46 c46Var;
        Throwable th;
        j11[] o;
        z36 z36Var;
        if (p(obj)) {
            return o27.a;
        }
        ih0 ih0Var = new ih0(1, nk2.J(j11Var));
        ih0Var.x();
        j11[] j11VarArr = pu.a;
        synchronized (this) {
            try {
                if (s(obj)) {
                    try {
                        ih0Var.k(o27.a);
                        o = o(j11VarArr);
                        z36Var = null;
                        c46Var = this;
                    } catch (Throwable th2) {
                        th = th2;
                        c46Var = this;
                        throw th;
                    }
                } else {
                    try {
                        c46Var = this;
                        try {
                            z36 z36Var2 = new z36(c46Var, q() + this.f0 + this.g0, obj, ih0Var);
                            c46Var.n(z36Var2);
                            c46Var.g0++;
                            if (c46Var.Y == 0) {
                                j11VarArr = c46Var.o(j11VarArr);
                            }
                            o = j11VarArr;
                            z36Var = z36Var2;
                        } catch (Throwable th3) {
                            th = th3;
                            th = th;
                            throw th;
                        }
                    } catch (Throwable th4) {
                        c46Var = this;
                        th = th4;
                        throw th;
                    }
                }
                if (z36Var != null) {
                    ih0Var.A(new bh0(2, z36Var));
                }
                for (j11 j11Var2 : o) {
                    if (j11Var2 != null) {
                        j11Var2.k(o27.a);
                    }
                }
                Object v = ih0Var.v();
                p31 p31Var = p31.COROUTINE_SUSPENDED;
                if (v != p31Var) {
                    v = o27.a;
                }
                if (v == p31Var) {
                    return v;
                }
                return o27.a;
            } catch (Throwable th5) {
                th = th5;
                c46Var = this;
            }
        }
    }

    @Override // defpackage.nj2
    public final u92 c(e31 e31Var, int i, h60 h60Var) {
        return d46.d(this, e31Var, i, h60Var);
    }

    @Override // defpackage.h24
    public final void d() {
        c46 c46Var;
        synchronized (this) {
            try {
                c46Var = this;
                try {
                    c46Var.v(q() + this.f0, this.e0, q() + this.f0, q() + this.f0 + this.g0);
                } catch (Throwable th) {
                    th = th;
                    Throwable th2 = th;
                    throw th2;
                }
            } catch (Throwable th3) {
                th = th3;
                c46Var = this;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [e46, java.lang.Object, t1] */
    @Override // defpackage.s1
    public final t1 f() {
        ?? obj = new Object();
        obj.a = -1L;
        return obj;
    }

    @Override // defpackage.s1
    public final t1[] g() {
        return new e46[2];
    }

    public final Object j(e46 e46Var, b46 b46Var) {
        ih0 ih0Var = new ih0(1, nk2.J(b46Var));
        ih0Var.x();
        synchronized (this) {
            try {
                if (t(e46Var) < 0) {
                    e46Var.b = ih0Var;
                } else {
                    ih0Var.k(o27.a);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Object v = ih0Var.v();
        if (v == p31.COROUTINE_SUSPENDED) {
            return v;
        }
        return o27.a;
    }

    public final void k() {
        if (this.Y != 0 || this.g0 > 1) {
            Object[] objArr = this.c0;
            objArr.getClass();
            while (this.g0 > 0) {
                long q = q();
                int i = this.f0;
                int i2 = this.g0;
                if (objArr[((int) ((q + (i + i2)) - 1)) & (objArr.length - 1)] == d46.a) {
                    this.g0 = i2 - 1;
                    d46.c(objArr, q() + this.f0 + this.g0, null);
                } else {
                    return;
                }
            }
        }
    }

    public final void m() {
        t1[] t1VarArr;
        Object[] objArr = this.c0;
        objArr.getClass();
        d46.c(objArr, q(), null);
        this.f0--;
        long q = q() + 1;
        if (this.d0 < q) {
            this.d0 = q;
        }
        if (this.e0 < q) {
            if (this.B != 0 && (t1VarArr = this.A) != null) {
                for (t1 t1Var : t1VarArr) {
                    if (t1Var != null) {
                        e46 e46Var = (e46) t1Var;
                        long j = e46Var.a;
                        if (j >= 0 && j < q) {
                            e46Var.a = q;
                        }
                    }
                }
            }
            this.e0 = q;
        }
    }

    public final void n(Object obj) {
        int i = this.f0 + this.g0;
        Object[] objArr = this.c0;
        if (objArr == null) {
            objArr = r(null, 0, 2);
        } else if (i >= objArr.length) {
            objArr = r(objArr, i, objArr.length * 2);
        }
        d46.c(objArr, q() + i, obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final j11[] o(j11[] j11VarArr) {
        t1[] t1VarArr;
        e46 e46Var;
        ih0 ih0Var;
        int length = j11VarArr.length;
        if (this.B != 0 && (t1VarArr = this.A) != null) {
            int length2 = t1VarArr.length;
            int i = 0;
            j11VarArr = j11VarArr;
            while (i < length2) {
                t1 t1Var = t1VarArr[i];
                if (t1Var != null && (ih0Var = (e46Var = (e46) t1Var).b) != null && t(e46Var) >= 0) {
                    int length3 = j11VarArr.length;
                    j11VarArr = j11VarArr;
                    if (length >= length3) {
                        j11VarArr = Arrays.copyOf(j11VarArr, Math.max(2, j11VarArr.length * 2));
                    }
                    j11VarArr[length] = ih0Var;
                    e46Var.b = null;
                    length++;
                }
                i++;
                j11VarArr = j11VarArr;
            }
        }
        return j11VarArr;
    }

    @Override // defpackage.h24
    public final boolean p(Object obj) {
        int i;
        boolean z;
        j11[] j11VarArr = pu.a;
        synchronized (this) {
            if (s(obj)) {
                j11VarArr = o(j11VarArr);
                z = true;
            } else {
                z = false;
            }
        }
        for (j11 j11Var : j11VarArr) {
            if (j11Var != null) {
                j11Var.k(o27.a);
            }
        }
        return z;
    }

    public final long q() {
        return Math.min(this.e0, this.d0);
    }

    public final Object[] r(Object[] objArr, int i, int i2) {
        if (i2 > 0) {
            Object[] objArr2 = new Object[i2];
            this.c0 = objArr2;
            if (objArr != null) {
                long q = q();
                for (int i3 = 0; i3 < i; i3++) {
                    long j = i3 + q;
                    d46.c(objArr2, j, objArr[((int) j) & (objArr.length - 1)]);
                }
            }
            return objArr2;
        }
        i.n("Buffer size overflow");
        return null;
    }

    public final boolean s(Object obj) {
        int i = this.B;
        int i2 = this.X;
        if (i == 0) {
            if (i2 != 0) {
                n(obj);
                int i3 = this.f0 + 1;
                this.f0 = i3;
                if (i3 > i2) {
                    m();
                }
                this.e0 = q() + this.f0;
                return true;
            }
        } else {
            int i4 = this.f0;
            int i5 = this.Y;
            if (i4 >= i5 && this.e0 <= this.d0) {
                int i6 = a46.a[this.Z.ordinal()];
                if (i6 != 1) {
                    if (i6 != 2) {
                        if (i6 != 3) {
                            i.c();
                            return false;
                        }
                    }
                } else {
                    return false;
                }
            }
            n(obj);
            int i7 = this.f0 + 1;
            this.f0 = i7;
            if (i7 > i5) {
                m();
            }
            long q = q() + this.f0;
            long j = this.d0;
            if (((int) (q - j)) > i2) {
                v(1 + j, this.e0, q() + this.f0, q() + this.f0 + this.g0);
            }
        }
        return true;
    }

    public final long t(e46 e46Var) {
        long j = e46Var.a;
        if (j >= q() + this.f0 && (this.Y > 0 || j > q() || this.g0 == 0)) {
            return -1L;
        }
        return j;
    }

    public final Object u(e46 e46Var) {
        Object obj;
        j11[] j11VarArr = pu.a;
        synchronized (this) {
            try {
                long t = t(e46Var);
                if (t < 0) {
                    obj = d46.a;
                } else {
                    long j = e46Var.a;
                    Object[] objArr = this.c0;
                    objArr.getClass();
                    Object obj2 = objArr[((int) t) & (objArr.length - 1)];
                    if (obj2 instanceof z36) {
                        obj2 = ((z36) obj2).L;
                    }
                    e46Var.a = t + 1;
                    Object obj3 = obj2;
                    j11VarArr = w(j);
                    obj = obj3;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        for (j11 j11Var : j11VarArr) {
            if (j11Var != null) {
                j11Var.k(o27.a);
            }
        }
        return obj;
    }

    public final void v(long j, long j2, long j3, long j4) {
        long min = Math.min(j2, j);
        for (long q = q(); q < min; q++) {
            Object[] objArr = this.c0;
            objArr.getClass();
            d46.c(objArr, q, null);
        }
        this.d0 = j;
        this.e0 = j2;
        this.f0 = (int) (j3 - min);
        this.g0 = (int) (j4 - j3);
    }

    public final j11[] w(long j) {
        long j2;
        long j3;
        long j4;
        j11[] j11VarArr;
        long j5;
        j11[] j11VarArr2;
        t1[] t1VarArr;
        j11[] j11VarArr3 = pu.a;
        if (j <= this.e0) {
            long q = q();
            long j6 = this.f0 + q;
            int i = this.Y;
            if (i == 0 && this.g0 > 0) {
                j6++;
            }
            int i2 = 0;
            if (this.B != 0 && (t1VarArr = this.A) != null) {
                for (t1 t1Var : t1VarArr) {
                    if (t1Var != null) {
                        long j7 = ((e46) t1Var).a;
                        if (j7 >= 0 && j7 < j6) {
                            j6 = j7;
                        }
                    }
                }
            }
            if (j6 > this.e0) {
                long q2 = q() + this.f0;
                int i3 = this.B;
                int i4 = this.g0;
                if (i3 > 0) {
                    i4 = Math.min(i4, i - ((int) (q2 - j6)));
                }
                long j8 = this.g0 + q2;
                an1 an1Var = d46.a;
                if (i4 > 0) {
                    j4 = 1;
                    Object[] objArr = this.c0;
                    objArr.getClass();
                    j2 = q;
                    j11[] j11VarArr4 = new j11[i4];
                    long j9 = q2;
                    while (true) {
                        if (q2 < j8) {
                            j11VarArr2 = j11VarArr4;
                            Object obj = objArr[(objArr.length - 1) & ((int) q2)];
                            if (obj != an1Var) {
                                obj.getClass();
                                z36 z36Var = (z36) obj;
                                int i5 = i2 + 1;
                                j3 = j6;
                                j11VarArr2[i2] = z36Var.R;
                                d46.c(objArr, q2, an1Var);
                                d46.c(objArr, j9, z36Var.L);
                                j9++;
                                if (i5 >= i4) {
                                    break;
                                }
                                i2 = i5;
                            } else {
                                j3 = j6;
                            }
                            q2++;
                            j11VarArr4 = j11VarArr2;
                            j6 = j3;
                        } else {
                            j11VarArr2 = j11VarArr4;
                            j3 = j6;
                            break;
                        }
                    }
                    q2 = j9;
                    j11VarArr = j11VarArr2;
                } else {
                    j2 = q;
                    j3 = j6;
                    j4 = 1;
                    j11VarArr = j11VarArr3;
                }
                int i6 = (int) (q2 - j2);
                if (this.B == 0) {
                    j5 = q2;
                } else {
                    j5 = j3;
                }
                long max = Math.max(this.d0, q2 - Math.min(this.X, i6));
                if (i == 0 && max < j8) {
                    Object[] objArr2 = this.c0;
                    objArr2.getClass();
                    if (b53.x(objArr2[((int) max) & (objArr2.length - 1)], an1Var)) {
                        q2 += j4;
                        max += j4;
                    }
                }
                v(max, j5, q2, j8);
                k();
                if (j11VarArr.length == 0) {
                    return j11VarArr;
                }
                return o(j11VarArr);
            }
        }
        return j11VarArr3;
    }
}
