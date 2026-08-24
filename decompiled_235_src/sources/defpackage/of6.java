package defpackage;

import java.util.Arrays;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: of6  reason: default package */
/* loaded from: classes.dex */
public class of6 extends t1 implements na4, le2, ro2 {
    public final int X;
    public final int Y;
    public final m80 Z;
    public Object[] d0;
    public long e0;
    public long f0;
    public int g0;
    public int h0;

    public of6(int i, int i2, m80 m80Var) {
        this.X = i;
        this.Y = i2;
        this.Z = m80Var;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|(3:(6:(1:(1:11)(2:46|47))(1:48)|12|13|14|15|(2:16|(3:38|39|(2:41|42)(2:43|37))(4:18|(1:23)|32|(1:34)(2:36|37))))(4:49|50|51|52)|30|31)(5:58|59|60|(1:62)|65)|53|54|15|(3:16|(0)(0)|37)))|68|6|(0)(0)|53|54|15|(3:16|(0)(0)|37)) */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0078, code lost:
        if (((defpackage.ut6) r9).b(r0) == r1) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00a9, code lost:
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00aa, code lost:
        r5 = r8;
        r8 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00ba, code lost:
        throw r2.v();
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
    */
    public static x61 m(of6 of6Var, ne2 ne2Var, r41 r41Var) {
        nf6 nf6Var;
        int i;
        of6 of6Var2;
        Throwable th;
        qf6 qf6Var;
        ne2 ne2Var2;
        rc3 rc3Var;
        Object u;
        rc3 rc3Var2;
        ne2 ne2Var3;
        if (r41Var instanceof nf6) {
            nf6Var = (nf6) r41Var;
            int i2 = nf6Var.f0;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                nf6Var.f0 = i2 - Integer.MIN_VALUE;
                Object obj = nf6Var.d0;
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                i = nf6Var.f0;
                if (i == 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i == 3) {
                                rc3Var2 = nf6Var.Z;
                                qf6Var = nf6Var.Y;
                                ne2Var3 = nf6Var.X;
                                of6Var2 = nf6Var.R;
                            } else {
                                i.m("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                        } else {
                            rc3Var2 = nf6Var.Z;
                            qf6Var = nf6Var.Y;
                            ne2Var3 = nf6Var.X;
                            of6Var2 = nf6Var.R;
                        }
                        try {
                            oi2.Y(obj);
                            ne2Var2 = ne2Var3;
                            rc3Var = rc3Var2;
                            of6Var = of6Var2;
                            while (true) {
                                u = of6Var.u(qf6Var);
                                if (u == pf6.a) {
                                    nf6Var.R = of6Var;
                                    nf6Var.X = ne2Var2;
                                    nf6Var.Y = qf6Var;
                                    nf6Var.Z = rc3Var;
                                    nf6Var.f0 = 2;
                                    if (of6Var.j(qf6Var, nf6Var) == x61Var) {
                                        break;
                                    }
                                } else {
                                    if (rc3Var != null && !rc3Var.e()) {
                                        break;
                                    }
                                    nf6Var.R = of6Var;
                                    nf6Var.X = ne2Var2;
                                    nf6Var.Y = qf6Var;
                                    nf6Var.Z = rc3Var;
                                    nf6Var.f0 = 3;
                                    if (ne2Var2.a(u, nf6Var) == x61Var) {
                                        break;
                                    }
                                }
                            }
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    } else {
                        qf6Var = nf6Var.Y;
                        ne2 ne2Var4 = nf6Var.X;
                        of6 of6Var3 = nf6Var.R;
                        try {
                            oi2.Y(obj);
                            ne2Var2 = ne2Var4;
                            of6Var = of6Var3;
                        } catch (Throwable th3) {
                            th = th3;
                            of6Var2 = of6Var3;
                        }
                    }
                    of6Var2.g(qf6Var);
                    throw th;
                }
                oi2.Y(obj);
                qf6 qf6Var2 = (qf6) of6Var.d();
                try {
                    if (ne2Var instanceof ut6) {
                        nf6Var.R = of6Var;
                        nf6Var.X = ne2Var;
                        nf6Var.Y = qf6Var2;
                        nf6Var.f0 = 1;
                    }
                    ne2Var2 = ne2Var;
                    qf6Var = qf6Var2;
                } catch (Throwable th4) {
                    of6Var2 = of6Var;
                    th = th4;
                    qf6Var = qf6Var2;
                }
                l61 l61Var = nf6Var.B;
                l61Var.getClass();
                rc3Var = (rc3) l61Var.Z(vs0.h0);
                while (true) {
                    u = of6Var.u(qf6Var);
                    if (u == pf6.a) {
                    }
                }
            }
        }
        nf6Var = new nf6(of6Var, r41Var);
        Object obj2 = nf6Var.d0;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i = nf6Var.f0;
        if (i == 0) {
        }
        l61 l61Var2 = nf6Var.B;
        l61Var2.getClass();
        rc3Var = (rc3) l61Var2.Z(vs0.h0);
        while (true) {
            u = of6Var.u(qf6Var);
            if (u == pf6.a) {
            }
        }
    }

    @Override // defpackage.na4, defpackage.ne2
    public final Object a(Object obj, r41 r41Var) {
        of6 of6Var;
        Throwable th;
        r41[] p;
        lf6 lf6Var;
        if (k(obj)) {
            return jg7.a;
        }
        rj0 rj0Var = new rj0(1, np2.V(r41Var));
        rj0Var.v();
        r41[] r41VarArr = q60.a;
        synchronized (this) {
            try {
                if (s(obj)) {
                    try {
                        rj0Var.i(jg7.a);
                        p = p(r41VarArr);
                        lf6Var = null;
                        of6Var = this;
                    } catch (Throwable th2) {
                        th = th2;
                        of6Var = this;
                        throw th;
                    }
                } else {
                    try {
                        of6Var = this;
                        try {
                            lf6 lf6Var2 = new lf6(of6Var, q() + this.g0 + this.h0, obj, rj0Var);
                            of6Var.o(lf6Var2);
                            of6Var.h0++;
                            if (of6Var.Y == 0) {
                                r41VarArr = of6Var.p(r41VarArr);
                            }
                            p = r41VarArr;
                            lf6Var = lf6Var2;
                        } catch (Throwable th3) {
                            th = th3;
                            th = th;
                            throw th;
                        }
                    } catch (Throwable th4) {
                        of6Var = this;
                        th = th4;
                        throw th;
                    }
                }
                if (lf6Var != null) {
                    rj0Var.A(new kj0(lf6Var, 2));
                }
                for (r41 r41Var2 : p) {
                    if (r41Var2 != null) {
                        r41Var2.i(jg7.a);
                    }
                }
                Object s = rj0Var.s();
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                if (s != x61Var) {
                    s = jg7.a;
                }
                if (s == x61Var) {
                    return s;
                }
                return jg7.a;
            } catch (Throwable th5) {
                th = th5;
                of6Var = this;
            }
        }
    }

    @Override // defpackage.le2
    public final Object b(ne2 ne2Var, r41 r41Var) {
        return m(this, ne2Var, r41Var);
    }

    @Override // defpackage.ro2
    public final le2 c(l61 l61Var, int i, m80 m80Var) {
        return pf6.d(this, l61Var, i, m80Var);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [qf6, java.lang.Object, u1] */
    @Override // defpackage.t1
    public final u1 e() {
        ?? obj = new Object();
        obj.a = -1L;
        return obj;
    }

    @Override // defpackage.t1
    public final u1[] f() {
        return new qf6[2];
    }

    @Override // defpackage.na4
    public final void h() {
        of6 of6Var;
        synchronized (this) {
            try {
                of6Var = this;
                try {
                    of6Var.v(q() + this.g0, this.f0, q() + this.g0, q() + this.g0 + this.h0);
                } catch (Throwable th) {
                    th = th;
                    Throwable th2 = th;
                    throw th2;
                }
            } catch (Throwable th3) {
                th = th3;
                of6Var = this;
            }
        }
    }

    public final Object j(qf6 qf6Var, nf6 nf6Var) {
        rj0 rj0Var = new rj0(1, np2.V(nf6Var));
        rj0Var.v();
        synchronized (this) {
            try {
                if (t(qf6Var) < 0) {
                    qf6Var.b = rj0Var;
                } else {
                    rj0Var.i(jg7.a);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Object s = rj0Var.s();
        if (s == x61.COROUTINE_SUSPENDED) {
            return s;
        }
        return jg7.a;
    }

    @Override // defpackage.na4
    public final boolean k(Object obj) {
        int i;
        boolean z;
        r41[] r41VarArr = q60.a;
        synchronized (this) {
            if (s(obj)) {
                r41VarArr = p(r41VarArr);
                z = true;
            } else {
                z = false;
            }
        }
        for (r41 r41Var : r41VarArr) {
            if (r41Var != null) {
                r41Var.i(jg7.a);
            }
        }
        return z;
    }

    public final void l() {
        if (this.Y != 0 || this.h0 > 1) {
            Object[] objArr = this.d0;
            objArr.getClass();
            while (this.h0 > 0) {
                long q = q();
                int i = this.g0;
                int i2 = this.h0;
                if (objArr[((int) ((q + (i + i2)) - 1)) & (objArr.length - 1)] == pf6.a) {
                    this.h0 = i2 - 1;
                    pf6.c(objArr, q() + this.g0 + this.h0, null);
                } else {
                    return;
                }
            }
        }
    }

    public final void n() {
        u1[] u1VarArr;
        Object[] objArr = this.d0;
        objArr.getClass();
        pf6.c(objArr, q(), null);
        this.g0--;
        long q = q() + 1;
        if (this.e0 < q) {
            this.e0 = q;
        }
        if (this.f0 < q) {
            if (this.B != 0 && (u1VarArr = this.A) != null) {
                for (u1 u1Var : u1VarArr) {
                    if (u1Var != null) {
                        qf6 qf6Var = (qf6) u1Var;
                        long j = qf6Var.a;
                        if (j >= 0 && j < q) {
                            qf6Var.a = q;
                        }
                    }
                }
            }
            this.f0 = q;
        }
    }

    public final void o(Object obj) {
        int i = this.g0 + this.h0;
        Object[] objArr = this.d0;
        if (objArr == null) {
            objArr = r(null, 0, 2);
        } else if (i >= objArr.length) {
            objArr = r(objArr, i, objArr.length * 2);
        }
        pf6.c(objArr, q() + i, obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final r41[] p(r41[] r41VarArr) {
        u1[] u1VarArr;
        qf6 qf6Var;
        rj0 rj0Var;
        int length = r41VarArr.length;
        if (this.B != 0 && (u1VarArr = this.A) != null) {
            int length2 = u1VarArr.length;
            int i = 0;
            r41VarArr = r41VarArr;
            while (i < length2) {
                u1 u1Var = u1VarArr[i];
                if (u1Var != null && (rj0Var = (qf6Var = (qf6) u1Var).b) != null && t(qf6Var) >= 0) {
                    int length3 = r41VarArr.length;
                    r41VarArr = r41VarArr;
                    if (length >= length3) {
                        r41VarArr = Arrays.copyOf(r41VarArr, Math.max(2, r41VarArr.length * 2));
                    }
                    r41VarArr[length] = rj0Var;
                    qf6Var.b = null;
                    length++;
                }
                i++;
                r41VarArr = r41VarArr;
            }
        }
        return r41VarArr;
    }

    public final long q() {
        return Math.min(this.f0, this.e0);
    }

    public final Object[] r(Object[] objArr, int i, int i2) {
        if (i2 > 0) {
            Object[] objArr2 = new Object[i2];
            this.d0 = objArr2;
            if (objArr != null) {
                long q = q();
                for (int i3 = 0; i3 < i; i3++) {
                    long j = i3 + q;
                    pf6.c(objArr2, j, objArr[((int) j) & (objArr.length - 1)]);
                }
            }
            return objArr2;
        }
        i.m("Buffer size overflow");
        return null;
    }

    public final boolean s(Object obj) {
        int i = this.B;
        int i2 = this.X;
        if (i == 0) {
            if (i2 != 0) {
                o(obj);
                int i3 = this.g0 + 1;
                this.g0 = i3;
                if (i3 > i2) {
                    n();
                }
                this.f0 = q() + this.g0;
                return true;
            }
        } else {
            int i4 = this.g0;
            int i5 = this.Y;
            if (i4 >= i5 && this.f0 <= this.e0) {
                int i6 = mf6.a[this.Z.ordinal()];
                if (i6 != 1) {
                    if (i6 != 2) {
                        if (i6 != 3) {
                            i.d();
                            return false;
                        }
                    }
                } else {
                    return false;
                }
            }
            o(obj);
            int i7 = this.g0 + 1;
            this.g0 = i7;
            if (i7 > i5) {
                n();
            }
            long q = q() + this.g0;
            long j = this.e0;
            if (((int) (q - j)) > i2) {
                v(1 + j, this.f0, q() + this.g0, q() + this.g0 + this.h0);
            }
        }
        return true;
    }

    public final long t(qf6 qf6Var) {
        long j = qf6Var.a;
        if (j >= q() + this.g0 && (this.Y > 0 || j > q() || this.h0 == 0)) {
            return -1L;
        }
        return j;
    }

    public final Object u(qf6 qf6Var) {
        Object obj;
        r41[] r41VarArr = q60.a;
        synchronized (this) {
            try {
                long t = t(qf6Var);
                if (t < 0) {
                    obj = pf6.a;
                } else {
                    long j = qf6Var.a;
                    Object[] objArr = this.d0;
                    objArr.getClass();
                    Object obj2 = objArr[((int) t) & (objArr.length - 1)];
                    if (obj2 instanceof lf6) {
                        obj2 = ((lf6) obj2).L;
                    }
                    qf6Var.a = t + 1;
                    Object obj3 = obj2;
                    r41VarArr = w(j);
                    obj = obj3;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        for (r41 r41Var : r41VarArr) {
            if (r41Var != null) {
                r41Var.i(jg7.a);
            }
        }
        return obj;
    }

    public final void v(long j, long j2, long j3, long j4) {
        long min = Math.min(j2, j);
        for (long q = q(); q < min; q++) {
            Object[] objArr = this.d0;
            objArr.getClass();
            pf6.c(objArr, q, null);
        }
        this.e0 = j;
        this.f0 = j2;
        this.g0 = (int) (j3 - min);
        this.h0 = (int) (j4 - j3);
    }

    public final r41[] w(long j) {
        long j2;
        long j3;
        long j4;
        r41[] r41VarArr;
        long j5;
        r41[] r41VarArr2;
        u1[] u1VarArr;
        r41[] r41VarArr3 = q60.a;
        if (j <= this.f0) {
            long q = q();
            long j6 = this.g0 + q;
            int i = this.Y;
            if (i == 0 && this.h0 > 0) {
                j6++;
            }
            int i2 = 0;
            if (this.B != 0 && (u1VarArr = this.A) != null) {
                for (u1 u1Var : u1VarArr) {
                    if (u1Var != null) {
                        long j7 = ((qf6) u1Var).a;
                        if (j7 >= 0 && j7 < j6) {
                            j6 = j7;
                        }
                    }
                }
            }
            if (j6 > this.f0) {
                long q2 = q() + this.g0;
                int i3 = this.B;
                int i4 = this.h0;
                if (i3 > 0) {
                    i4 = Math.min(i4, i - ((int) (q2 - j6)));
                }
                long j8 = this.h0 + q2;
                gr1 gr1Var = pf6.a;
                if (i4 > 0) {
                    j4 = 1;
                    Object[] objArr = this.d0;
                    objArr.getClass();
                    j2 = q;
                    r41[] r41VarArr4 = new r41[i4];
                    long j9 = q2;
                    while (true) {
                        if (q2 < j8) {
                            r41VarArr2 = r41VarArr4;
                            Object obj = objArr[(objArr.length - 1) & ((int) q2)];
                            if (obj != gr1Var) {
                                obj.getClass();
                                lf6 lf6Var = (lf6) obj;
                                int i5 = i2 + 1;
                                j3 = j6;
                                r41VarArr2[i2] = lf6Var.R;
                                pf6.c(objArr, q2, gr1Var);
                                pf6.c(objArr, j9, lf6Var.L);
                                j9++;
                                if (i5 >= i4) {
                                    break;
                                }
                                i2 = i5;
                            } else {
                                j3 = j6;
                            }
                            q2++;
                            r41VarArr4 = r41VarArr2;
                            j6 = j3;
                        } else {
                            r41VarArr2 = r41VarArr4;
                            j3 = j6;
                            break;
                        }
                    }
                    q2 = j9;
                    r41VarArr = r41VarArr2;
                } else {
                    j2 = q;
                    j3 = j6;
                    j4 = 1;
                    r41VarArr = r41VarArr3;
                }
                int i6 = (int) (q2 - j2);
                if (this.B == 0) {
                    j5 = q2;
                } else {
                    j5 = j3;
                }
                long max = Math.max(this.e0, q2 - Math.min(this.X, i6));
                if (i == 0 && max < j8) {
                    Object[] objArr2 = this.d0;
                    objArr2.getClass();
                    if (nb3.k(objArr2[((int) max) & (objArr2.length - 1)], gr1Var)) {
                        q2 += j4;
                        max += j4;
                    }
                }
                v(max, j5, q2, j8);
                l();
                if (r41VarArr.length == 0) {
                    return r41VarArr;
                }
                return p(r41VarArr);
            }
        }
        return r41VarArr3;
    }
}
