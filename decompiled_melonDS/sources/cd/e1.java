package cd;

import java.util.Arrays;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public class e1 extends dd.b implements w0, h, dd.s {
    public final int X;
    public final int Y;
    public final bd.a Z;

    /* renamed from: b0  reason: collision with root package name */
    public Object[] f2824b0;

    /* renamed from: c0  reason: collision with root package name */
    public long f2825c0;

    /* renamed from: d0  reason: collision with root package name */
    public long f2826d0;

    /* renamed from: e0  reason: collision with root package name */
    public int f2827e0;

    /* renamed from: f0  reason: collision with root package name */
    public int f2828f0;

    public e1(int i2, int i10, bd.a aVar) {
        this.X = i2;
        this.Y = i10;
        this.Z = aVar;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|(3:(6:(1:(1:11)(2:46|47))(1:48)|12|13|14|15|(2:16|(3:38|39|(2:41|42)(2:43|37))(4:18|(1:23)|32|(1:34)(2:36|37))))(4:49|50|51|52)|30|31)(5:58|59|60|(1:62)|65)|53|54|15|(3:16|(0)(0)|37)))|68|6|(0)(0)|53|54|15|(3:16|(0)(0)|37)) */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0078, code lost:
        if (((cd.t1) r9).b(r0) == r1) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00a9, code lost:
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00aa, code lost:
        r5 = r8;
        r8 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00ba, code lost:
        throw r2.B();
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
    public static dc.a k(cd.e1 r8, cd.i r9, cc.c r10) {
        /*
            Method dump skipped, instructions count: 208
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cd.e1.k(cd.e1, cd.i, cc.c):dc.a");
    }

    @Override // cd.w0, cd.i
    public final Object a(Object obj, cc.c cVar) {
        Throwable th2;
        cc.c[] o5;
        b1 b1Var;
        if (p(obj)) {
            return yb.y.f14813a;
        }
        zc.h hVar = new zc.h(1, pc.a.A(cVar));
        hVar.v();
        cc.c[] cVarArr = dd.c.f4035a;
        synchronized (this) {
            try {
                if (s(obj)) {
                    try {
                        hVar.h(yb.y.f14813a);
                        o5 = o(cVarArr);
                        b1Var = null;
                    } catch (Throwable th3) {
                        th2 = th3;
                        throw th2;
                    }
                } else {
                    try {
                        b1 b1Var2 = new b1(this, q() + this.f2827e0 + this.f2828f0, obj, hVar);
                        n(b1Var2);
                        this.f2828f0++;
                        if (this.Y == 0) {
                            cVarArr = o(cVarArr);
                        }
                        o5 = cVarArr;
                        b1Var = b1Var2;
                    } catch (Throwable th4) {
                        th = th4;
                        th2 = th;
                        throw th2;
                    }
                }
                if (b1Var != null) {
                    hVar.y(new zc.e(2, b1Var));
                }
                for (cc.c cVar2 : o5) {
                    if (cVar2 != null) {
                        cVar2.h(yb.y.f14813a);
                    }
                }
                Object u4 = hVar.u();
                dc.a aVar = dc.a.COROUTINE_SUSPENDED;
                if (u4 != aVar) {
                    u4 = yb.y.f14813a;
                }
                if (u4 == aVar) {
                    return u4;
                }
                return yb.y.f14813a;
            } catch (Throwable th5) {
                th = th5;
            }
        }
    }

    @Override // dd.s
    public final h b(cc.g gVar, int i2, bd.a aVar) {
        return q.u(this, gVar, i2, aVar);
    }

    @Override // cd.h
    public final Object c(i iVar, cc.c cVar) {
        return k(this, iVar, cVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [dd.d, cd.f1, java.lang.Object] */
    @Override // dd.b
    public final dd.d e() {
        ?? obj = new Object();
        obj.f2829a = -1L;
        return obj;
    }

    @Override // dd.b
    public final dd.d[] f() {
        return new f1[2];
    }

    public final Object i(f1 f1Var, d1 d1Var) {
        zc.h hVar = new zc.h(1, pc.a.A(d1Var));
        hVar.v();
        synchronized (this) {
            try {
                if (t(f1Var) < 0) {
                    f1Var.f2830b = hVar;
                } else {
                    hVar.h(yb.y.f14813a);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        Object u4 = hVar.u();
        if (u4 == dc.a.COROUTINE_SUSPENDED) {
            return u4;
        }
        return yb.y.f14813a;
    }

    public final void j() {
        if (this.Y != 0 || this.f2828f0 > 1) {
            Object[] objArr = this.f2824b0;
            objArr.getClass();
            while (this.f2828f0 > 0) {
                long q10 = q();
                int i2 = this.f2827e0;
                int i10 = this.f2828f0;
                if (objArr[((int) ((q10 + (i2 + i10)) - 1)) & (objArr.length - 1)] == q.f2855b) {
                    this.f2828f0 = i10 - 1;
                    q.f(objArr, q() + this.f2827e0 + this.f2828f0, null);
                } else {
                    return;
                }
            }
        }
    }

    public final void l() {
        dd.d[] dVarArr;
        Object[] objArr = this.f2824b0;
        objArr.getClass();
        q.f(objArr, q(), null);
        this.f2827e0--;
        long q10 = q() + 1;
        if (this.f2825c0 < q10) {
            this.f2825c0 = q10;
        }
        if (this.f2826d0 < q10) {
            if (this.B != 0 && (dVarArr = this.A) != null) {
                for (dd.d dVar : dVarArr) {
                    if (dVar != null) {
                        f1 f1Var = (f1) dVar;
                        long j2 = f1Var.f2829a;
                        if (j2 >= 0 && j2 < q10) {
                            f1Var.f2829a = q10;
                        }
                    }
                }
            }
            this.f2826d0 = q10;
        }
    }

    @Override // cd.w0
    public final void m() {
        synchronized (this) {
            try {
                try {
                    v(q() + this.f2827e0, this.f2826d0, q() + this.f2827e0, q() + this.f2827e0 + this.f2828f0);
                } catch (Throwable th2) {
                    th = th2;
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }
    }

    public final void n(Object obj) {
        int i2 = this.f2827e0 + this.f2828f0;
        Object[] objArr = this.f2824b0;
        if (objArr == null) {
            objArr = r(null, 0, 2);
        } else if (i2 >= objArr.length) {
            objArr = r(objArr, i2, objArr.length * 2);
        }
        q.f(objArr, q() + i2, obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final cc.c[] o(cc.c[] cVarArr) {
        dd.d[] dVarArr;
        f1 f1Var;
        zc.h hVar;
        int length = cVarArr.length;
        if (this.B != 0 && (dVarArr = this.A) != null) {
            int length2 = dVarArr.length;
            int i2 = 0;
            cVarArr = cVarArr;
            while (i2 < length2) {
                dd.d dVar = dVarArr[i2];
                if (dVar != null && (hVar = (f1Var = (f1) dVar).f2830b) != null && t(f1Var) >= 0) {
                    int length3 = cVarArr.length;
                    cVarArr = cVarArr;
                    if (length >= length3) {
                        cVarArr = Arrays.copyOf(cVarArr, Math.max(2, cVarArr.length * 2));
                    }
                    cVarArr[length] = hVar;
                    f1Var.f2830b = null;
                    length++;
                }
                i2++;
                cVarArr = cVarArr;
            }
        }
        return cVarArr;
    }

    @Override // cd.w0
    public final boolean p(Object obj) {
        int i2;
        boolean z10;
        cc.c[] cVarArr = dd.c.f4035a;
        synchronized (this) {
            if (s(obj)) {
                cVarArr = o(cVarArr);
                z10 = true;
            } else {
                z10 = false;
            }
        }
        for (cc.c cVar : cVarArr) {
            if (cVar != null) {
                cVar.h(yb.y.f14813a);
            }
        }
        return z10;
    }

    public final long q() {
        return Math.min(this.f2826d0, this.f2825c0);
    }

    public final Object[] r(Object[] objArr, int i2, int i10) {
        if (i10 > 0) {
            Object[] objArr2 = new Object[i10];
            this.f2824b0 = objArr2;
            if (objArr != null) {
                long q10 = q();
                for (int i11 = 0; i11 < i2; i11++) {
                    long j2 = i11 + q10;
                    q.f(objArr2, j2, objArr[((int) j2) & (objArr.length - 1)]);
                }
            }
            return objArr2;
        }
        a0.j.p("Buffer size overflow");
        return null;
    }

    public final boolean s(Object obj) {
        int i2 = this.B;
        int i10 = this.X;
        if (i2 == 0) {
            if (i10 != 0) {
                n(obj);
                int i11 = this.f2827e0 + 1;
                this.f2827e0 = i11;
                if (i11 > i10) {
                    l();
                }
                this.f2826d0 = q() + this.f2827e0;
                return true;
            }
        } else {
            int i12 = this.f2827e0;
            int i13 = this.Y;
            if (i12 >= i13 && this.f2826d0 <= this.f2825c0) {
                int i14 = c1.f2819a[this.Z.ordinal()];
                if (i14 != 1) {
                    if (i14 != 2) {
                        if (i14 != 3) {
                            m9.o.o();
                            return false;
                        }
                    }
                } else {
                    return false;
                }
            }
            n(obj);
            int i15 = this.f2827e0 + 1;
            this.f2827e0 = i15;
            if (i15 > i13) {
                l();
            }
            long q10 = q() + this.f2827e0;
            long j2 = this.f2825c0;
            if (((int) (q10 - j2)) > i10) {
                v(1 + j2, this.f2826d0, q() + this.f2827e0, q() + this.f2827e0 + this.f2828f0);
            }
        }
        return true;
    }

    public final long t(f1 f1Var) {
        long j2 = f1Var.f2829a;
        if (j2 >= q() + this.f2827e0) {
            if (this.Y > 0 || j2 > q() || this.f2828f0 == 0) {
                return -1L;
            }
            return j2;
        }
        return j2;
    }

    public final Object u(f1 f1Var) {
        Object obj;
        cc.c[] cVarArr = dd.c.f4035a;
        synchronized (this) {
            try {
                long t5 = t(f1Var);
                if (t5 < 0) {
                    obj = q.f2855b;
                } else {
                    long j2 = f1Var.f2829a;
                    Object[] objArr = this.f2824b0;
                    objArr.getClass();
                    Object obj2 = objArr[((int) t5) & (objArr.length - 1)];
                    if (obj2 instanceof b1) {
                        obj2 = ((b1) obj2).L;
                    }
                    f1Var.f2829a = t5 + 1;
                    Object obj3 = obj2;
                    cVarArr = w(j2);
                    obj = obj3;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        for (cc.c cVar : cVarArr) {
            if (cVar != null) {
                cVar.h(yb.y.f14813a);
            }
        }
        return obj;
    }

    public final void v(long j2, long j10, long j11, long j12) {
        long min = Math.min(j10, j2);
        for (long q10 = q(); q10 < min; q10++) {
            Object[] objArr = this.f2824b0;
            objArr.getClass();
            q.f(objArr, q10, null);
        }
        this.f2825c0 = j2;
        this.f2826d0 = j10;
        this.f2827e0 = (int) (j11 - min);
        this.f2828f0 = (int) (j12 - j11);
    }

    public final cc.c[] w(long j2) {
        long j10;
        long j11;
        long j12;
        cc.c[] cVarArr;
        long j13;
        cc.c[] cVarArr2;
        dd.d[] dVarArr;
        a0.c cVar = q.f2855b;
        cc.c[] cVarArr3 = dd.c.f4035a;
        if (j2 <= this.f2826d0) {
            long q10 = q();
            long j14 = this.f2827e0 + q10;
            int i2 = this.Y;
            if (i2 == 0 && this.f2828f0 > 0) {
                j14++;
            }
            int i10 = 0;
            if (this.B != 0 && (dVarArr = this.A) != null) {
                for (dd.d dVar : dVarArr) {
                    if (dVar != null) {
                        long j15 = ((f1) dVar).f2829a;
                        if (j15 >= 0 && j15 < j14) {
                            j14 = j15;
                        }
                    }
                }
            }
            if (j14 > this.f2826d0) {
                long q11 = q() + this.f2827e0;
                int i11 = this.B;
                int i12 = this.f2828f0;
                if (i11 > 0) {
                    j10 = 1;
                    i12 = Math.min(i12, i2 - ((int) (q11 - j14)));
                } else {
                    j10 = 1;
                }
                long j16 = this.f2828f0 + q11;
                if (i12 > 0) {
                    Object[] objArr = this.f2824b0;
                    objArr.getClass();
                    j11 = q10;
                    cc.c[] cVarArr4 = new cc.c[i12];
                    long j17 = q11;
                    while (true) {
                        if (q11 < j16) {
                            cVarArr2 = cVarArr4;
                            Object obj = objArr[((int) q11) & (objArr.length - 1)];
                            if (obj != cVar) {
                                obj.getClass();
                                b1 b1Var = (b1) obj;
                                j12 = j14;
                                int i13 = i10 + 1;
                                cVarArr2[i10] = b1Var.R;
                                q.f(objArr, q11, cVar);
                                q.f(objArr, j17, b1Var.L);
                                j17 += j10;
                                if (i13 >= i12) {
                                    break;
                                }
                                i10 = i13;
                            } else {
                                j12 = j14;
                            }
                            q11 += j10;
                            cVarArr4 = cVarArr2;
                            j14 = j12;
                        } else {
                            cVarArr2 = cVarArr4;
                            j12 = j14;
                            break;
                        }
                    }
                    q11 = j17;
                    cVarArr = cVarArr2;
                } else {
                    j11 = q10;
                    j12 = j14;
                    cVarArr = cVarArr3;
                }
                int i14 = (int) (q11 - j11);
                if (this.B == 0) {
                    j13 = q11;
                } else {
                    j13 = j12;
                }
                long max = Math.max(this.f2825c0, q11 - Math.min(this.X, i14));
                if (i2 == 0 && max < j16) {
                    Object[] objArr2 = this.f2824b0;
                    objArr2.getClass();
                    if (nc.k.a(objArr2[((int) max) & (objArr2.length - 1)], cVar)) {
                        q11 += j10;
                        max += j10;
                    }
                }
                v(max, j13, q11, j16);
                j();
                if (cVarArr.length == 0) {
                    return cVarArr;
                }
                return o(cVarArr);
            }
        }
        return cVarArr3;
    }
}
