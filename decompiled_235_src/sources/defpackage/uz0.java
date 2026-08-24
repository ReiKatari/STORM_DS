package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: uz0  reason: default package */
/* loaded from: classes.dex */
public final class uz0 implements qz0 {
    public final iz4 A;
    public final iz4 B;
    public final d90 L;
    public final ThreadLocal R;
    public volatile boolean X;
    public final long Y;
    public final int Z;

    public uz0(final u63 u63Var, final String str, int i) {
        str.getClass();
        this.L = new d90(29);
        this.R = new ThreadLocal();
        jd1 jd1Var = oq1.B;
        this.Y = n16.L(30, uq1.SECONDS);
        this.Z = 2;
        if (i > 0) {
            this.A = new iz4(i, new on2() { // from class: rz0
                @Override // defpackage.on2
                public final Object c() {
                    int i2 = r3;
                    String str2 = str;
                    u63 u63Var2 = u63Var;
                    switch (i2) {
                        case 0:
                            e36 f = u63Var2.f(str2);
                            ii2.s(f, "PRAGMA query_only = 1");
                            return f;
                        default:
                            return u63Var2.f(str2);
                    }
                }
            });
            this.B = new iz4(1, new on2() { // from class: rz0
                @Override // defpackage.on2
                public final Object c() {
                    int i2 = r3;
                    String str2 = str;
                    u63 u63Var2 = u63Var;
                    switch (i2) {
                        case 0:
                            e36 f = u63Var2.f(str2);
                            ii2.s(f, "PRAGMA query_only = 1");
                            return f;
                        default:
                            return u63Var2.f(str2);
                    }
                }
            });
            return;
        }
        i.h("Maximum number of readers must be greater than 0");
        throw null;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (!this.X) {
            this.X = true;
            this.A.c();
            this.B.c();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x014b A[Catch: all -> 0x01a6, TRY_LEAVE, TryCatch #1 {all -> 0x01a6, blocks: (B:64:0x0124, B:69:0x0140, B:71:0x014b, B:86:0x01aa, B:87:0x01b1), top: B:109:0x0124 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01aa A[Catch: all -> 0x01a6, TRY_ENTER, TryCatch #1 {all -> 0x01a6, blocks: (B:64:0x0124, B:69:0x0140, B:71:0x014b, B:86:0x01aa, B:87:0x01b1), top: B:109:0x0124 }] */
    /* JADX WARN: Type inference failed for: r6v1, types: [dh5, java.lang.Object] */
    @Override // defpackage.qz0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object s(boolean z, eo2 eo2Var, s41 s41Var) {
        tz0 tz0Var;
        int i;
        iz4 iz4Var;
        Throwable th;
        iz4 iz4Var2;
        l61 l61Var;
        eo2 eo2Var2;
        d90 d90Var;
        iz4 iz4Var3;
        dh5 dh5Var;
        dh5 dh5Var2;
        dh5 dh5Var3;
        boolean z2;
        Object obj;
        dh5 dh5Var4;
        dh5 dh5Var5;
        rz4 rz4Var;
        boolean z3 = z;
        try {
            if (s41Var instanceof tz0) {
                tz0Var = (tz0) s41Var;
                int i2 = tz0Var.i0;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    tz0Var.i0 = i2 - Integer.MIN_VALUE;
                    Object obj2 = tz0Var.g0;
                    x61 x61Var = x61.COROUTINE_SUSPENDED;
                    i = tz0Var.i0;
                    if (i == 0) {
                        if (i != 1) {
                            if (i != 2) {
                                if (i != 3) {
                                    if (i == 4) {
                                        dh5Var4 = (dh5) tz0Var.Y;
                                        iz4Var2 = (iz4) tz0Var.X;
                                        try {
                                            oi2.Y(obj2);
                                            rz4Var = (rz4) dh5Var4.A;
                                            if (rz4Var != null) {
                                                if (!rz4Var.e) {
                                                    rz4Var.e = true;
                                                    if (rz4Var.b.A.Y()) {
                                                        ii2.s(rz4Var.b, "ROLLBACK TRANSACTION");
                                                    }
                                                }
                                                b01 b01Var = rz4Var.b;
                                                b01Var.L = null;
                                                b01Var.R = null;
                                                iz4Var2.e(b01Var);
                                            }
                                            return obj2;
                                        } catch (Throwable th2) {
                                            dh5Var5 = dh5Var4;
                                            th = th2;
                                            try {
                                                throw th;
                                            } catch (Throwable th3) {
                                                try {
                                                    rz4 rz4Var2 = (rz4) dh5Var5.A;
                                                    if (rz4Var2 != null) {
                                                        if (!rz4Var2.e) {
                                                            rz4Var2.e = true;
                                                            if (rz4Var2.b.A.Y()) {
                                                                ii2.s(rz4Var2.b, "ROLLBACK TRANSACTION");
                                                            }
                                                        }
                                                        b01 b01Var2 = rz4Var2.b;
                                                        b01Var2.L = null;
                                                        b01Var2.R = null;
                                                        iz4Var2.e(b01Var2);
                                                    }
                                                } catch (Throwable th4) {
                                                    mb3.q(th, th4);
                                                }
                                                throw th3;
                                            }
                                        }
                                    }
                                    i.m("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                z3 = tz0Var.R;
                                d90Var = tz0Var.f0;
                                dh5 dh5Var6 = tz0Var.e0;
                                l61 l61Var2 = tz0Var.d0;
                                dh5 dh5Var7 = tz0Var.Z;
                                iz4Var3 = (iz4) tz0Var.Y;
                                eo2Var2 = (eo2) tz0Var.X;
                                try {
                                    oi2.Y(obj2);
                                    dh5Var = dh5Var6;
                                    dh5Var3 = dh5Var7;
                                    l61Var = l61Var2;
                                } catch (Throwable th5) {
                                    th = th5;
                                    dh5Var2 = dh5Var7;
                                    iz4Var2 = iz4Var3;
                                    dh5Var5 = dh5Var2;
                                    throw th;
                                }
                            } else {
                                oi2.Y(obj2);
                                return obj2;
                            }
                        } else {
                            oi2.Y(obj2);
                            return obj2;
                        }
                    } else {
                        oi2.Y(obj2);
                        if (!this.X) {
                            rz4 rz4Var3 = (rz4) this.R.get();
                            if (rz4Var3 == null) {
                                l61 l61Var3 = tz0Var.B;
                                l61Var3.getClass();
                                pz0 pz0Var = (pz0) l61Var3.Z(this.L);
                                if (pz0Var != null) {
                                    rz4Var3 = pz0Var.B;
                                } else {
                                    rz4Var3 = null;
                                }
                            }
                            if (rz4Var3 != null) {
                                if (!z3 && rz4Var3.c) {
                                    ii2.T(1, "Cannot upgrade connection from reader to writer");
                                    throw null;
                                }
                                l61 l61Var4 = tz0Var.B;
                                l61Var4.getClass();
                                if (l61Var4.Z(this.L) == null) {
                                    pz0 pz0Var2 = new pz0(this.L, rz4Var3);
                                    ThreadLocal threadLocal = this.R;
                                    threadLocal.getClass();
                                    l61 y = jw2.y(pz0Var2, new l57(rz4Var3, threadLocal));
                                    z zVar = new z(eo2Var, rz4Var3, null, 24);
                                    tz0Var.i0 = 1;
                                    Object d0 = hv.d0(y, zVar, tz0Var);
                                    if (d0 != x61Var) {
                                        return d0;
                                    }
                                } else {
                                    tz0Var.i0 = 2;
                                    Object o = eo2Var.o(rz4Var3, tz0Var);
                                    if (o != x61Var) {
                                        return o;
                                    }
                                }
                            } else {
                                if (z3) {
                                    iz4Var = this.A;
                                } else {
                                    iz4Var = this.B;
                                }
                                ?? obj3 = new Object();
                                try {
                                    l61Var = tz0Var.B;
                                    l61Var.getClass();
                                    d90 d90Var2 = this.L;
                                    long j = this.Y;
                                    sz0 sz0Var = new sz0(this, z3);
                                    tz0Var.X = eo2Var;
                                    tz0Var.Y = iz4Var;
                                    tz0Var.Z = obj3;
                                    tz0Var.d0 = l61Var;
                                    tz0Var.e0 = obj3;
                                    tz0Var.f0 = d90Var2;
                                    tz0Var.R = z3;
                                    tz0Var.i0 = 3;
                                    Object b = iz4Var.b(j, sz0Var, tz0Var);
                                    if (b != x61Var) {
                                        eo2Var2 = eo2Var;
                                        d90Var = d90Var2;
                                        iz4Var3 = iz4Var;
                                        obj2 = b;
                                        dh5Var = obj3;
                                        dh5Var3 = obj3;
                                    }
                                } catch (Throwable th6) {
                                    th = th6;
                                    iz4Var2 = iz4Var;
                                    dh5Var5 = obj3;
                                    throw th;
                                }
                            }
                            return x61Var;
                        }
                        ii2.T(21, "Connection pool is closed");
                        throw null;
                    }
                    b01 b01Var3 = (b01) obj2;
                    b01Var3.getClass();
                    l61Var.getClass();
                    b01Var3.L = l61Var;
                    b01Var3.R = new Throwable();
                    if (this.A == this.B && z3) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    dh5Var.A = new rz4(d90Var, b01Var3, z2);
                    obj = dh5Var3.A;
                    if (obj == null) {
                        rz4 rz4Var4 = (rz4) obj;
                        pz0 pz0Var3 = new pz0(this.L, rz4Var4);
                        ThreadLocal threadLocal2 = this.R;
                        threadLocal2.getClass();
                        l61 y2 = jw2.y(pz0Var3, new l57(rz4Var4, threadLocal2));
                        z zVar2 = new z(eo2Var2, dh5Var3, null, 25);
                        tz0Var.X = iz4Var3;
                        tz0Var.Y = dh5Var3;
                        tz0Var.Z = null;
                        tz0Var.d0 = null;
                        tz0Var.e0 = null;
                        tz0Var.f0 = null;
                        tz0Var.i0 = 4;
                        obj2 = hv.d0(y2, zVar2, tz0Var);
                        if (obj2 != x61Var) {
                            dh5Var4 = dh5Var3;
                            iz4Var2 = iz4Var3;
                            rz4Var = (rz4) dh5Var4.A;
                            if (rz4Var != null) {
                            }
                            return obj2;
                        }
                        return x61Var;
                    }
                    throw new IllegalArgumentException("Required value was null.");
                }
            }
            b01 b01Var32 = (b01) obj2;
            b01Var32.getClass();
            l61Var.getClass();
            b01Var32.L = l61Var;
            b01Var32.R = new Throwable();
            if (this.A == this.B) {
            }
            z2 = false;
            dh5Var.A = new rz4(d90Var, b01Var32, z2);
            obj = dh5Var3.A;
            if (obj == null) {
            }
        } catch (Throwable th7) {
            th = th7;
            dh5Var2 = dh5Var3;
            iz4Var2 = iz4Var3;
            dh5Var5 = dh5Var2;
            throw th;
        }
        tz0Var = new tz0(this, s41Var);
        Object obj22 = tz0Var.g0;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i = tz0Var.i0;
        if (i == 0) {
        }
    }

    public uz0(u63 u63Var) {
        this.L = new d90(29);
        this.R = new ThreadLocal();
        jd1 jd1Var = oq1.B;
        this.Y = n16.L(30, uq1.SECONDS);
        this.Z = 2;
        iz4 iz4Var = new iz4(1, new a5(u63Var, 18));
        this.A = iz4Var;
        this.B = iz4Var;
    }
}
