package defpackage;

import android.database.SQLException;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: rz4  reason: default package */
/* loaded from: classes.dex */
public final class rz4 implements d97, ud5 {
    public final d90 a;
    public final b01 b;
    public final boolean c;
    public final pu d;
    public volatile boolean e;

    public rz4(d90 d90Var, b01 b01Var, boolean z) {
        d90Var.getClass();
        this.a = d90Var;
        this.b = b01Var;
        this.c = z;
        this.d = new pu();
    }

    @Override // defpackage.d97
    public final Object a(c97 c97Var, eo2 eo2Var, hw6 hw6Var) {
        if (!this.e) {
            l61 l61Var = hw6Var.B;
            l61Var.getClass();
            pz0 pz0Var = (pz0) l61Var.Z(this.a);
            if (pz0Var != null && pz0Var.B == this) {
                return g(c97Var, eo2Var, hw6Var);
            }
            ii2.T(21, "Attempted to use connection on a different coroutine");
            throw null;
        }
        ii2.T(21, "Connection is recycled");
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    @Override // defpackage.jz4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, qn2 qn2Var, s41 s41Var) {
        qz4 qz4Var;
        int i;
        b01 b01Var;
        try {
            if (s41Var instanceof qz4) {
                qz4Var = (qz4) s41Var;
                int i2 = qz4Var.e0;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    qz4Var.e0 = i2 - Integer.MIN_VALUE;
                    Object obj = qz4Var.Z;
                    x61 x61Var = x61.COROUTINE_SUSPENDED;
                    i = qz4Var.e0;
                    if (i == 0) {
                        if (i == 1) {
                            b01 b01Var2 = qz4Var.Y;
                            qn2Var = qz4Var.X;
                            String str2 = qz4Var.R;
                            oi2.Y(obj);
                            b01Var = b01Var2;
                            str = str2;
                        } else {
                            i.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    } else {
                        oi2.Y(obj);
                        if (!this.e) {
                            l61 l61Var = qz4Var.B;
                            l61Var.getClass();
                            pz0 pz0Var = (pz0) l61Var.Z(this.a);
                            if (pz0Var != null && pz0Var.B == this) {
                                b01Var = this.b;
                                qz4Var.R = str;
                                qz4Var.X = qn2Var;
                                qz4Var.Y = b01Var;
                                qz4Var.e0 = 1;
                                if (b01Var.B.e(qz4Var) == x61Var) {
                                    return x61Var;
                                }
                            } else {
                                ii2.T(21, "Attempted to use connection on a different coroutine");
                                throw null;
                            }
                        } else {
                            ii2.T(21, "Connection is recycled");
                            throw null;
                        }
                    }
                    kz4 kz4Var = new kz4(this, this.b.i0(str));
                    Object g = qn2Var.g(kz4Var);
                    lb4.p(kz4Var, null);
                    return g;
                }
            }
            kz4 kz4Var2 = new kz4(this, this.b.i0(str));
            Object g2 = qn2Var.g(kz4Var2);
            lb4.p(kz4Var2, null);
            return g2;
        } finally {
            b01Var.h(null);
        }
        qz4Var = new qz4(this, s41Var);
        Object obj2 = qz4Var.Z;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i = qz4Var.e0;
        if (i == 0) {
        }
    }

    @Override // defpackage.d97
    public final Boolean c(r41 r41Var) {
        boolean z;
        if (!this.e) {
            l61 l61Var = ((s41) r41Var).B;
            l61Var.getClass();
            pz0 pz0Var = (pz0) l61Var.Z(this.a);
            if (pz0Var != null && pz0Var.B == this) {
                if (this.d.isEmpty() && !this.b.A.Y()) {
                    z = false;
                } else {
                    z = true;
                }
                return Boolean.valueOf(z);
            }
            ii2.T(21, "Attempted to use connection on a different coroutine");
            throw null;
        }
        ii2.T(21, "Connection is recycled");
        throw null;
    }

    @Override // defpackage.ud5
    public final e36 d() {
        return this.b;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0055 A[Catch: all -> 0x006b, TryCatch #0 {all -> 0x006b, blocks: (B:18:0x004d, B:20:0x0055, B:26:0x0065, B:34:0x0093, B:29:0x006d, B:30:0x0072, B:31:0x0073, B:32:0x0079, B:33:0x007f), top: B:39:0x004d }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007f A[Catch: all -> 0x006b, TryCatch #0 {all -> 0x006b, blocks: (B:18:0x004d, B:20:0x0055, B:26:0x0065, B:34:0x0093, B:29:0x006d, B:30:0x0072, B:31:0x0073, B:32:0x0079, B:33:0x007f), top: B:39:0x004d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(c97 c97Var, s41 s41Var) {
        nz4 nz4Var;
        int i;
        b01 b01Var;
        pu puVar = this.d;
        try {
            if (s41Var instanceof nz4) {
                nz4Var = (nz4) s41Var;
                int i2 = nz4Var.d0;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    nz4Var.d0 = i2 - Integer.MIN_VALUE;
                    Object obj = nz4Var.Y;
                    x61 x61Var = x61.COROUTINE_SUSPENDED;
                    i = nz4Var.d0;
                    b01 b01Var2 = this.b;
                    if (i == 0) {
                        if (i == 1) {
                            b01 b01Var3 = nz4Var.X;
                            c97 c97Var2 = nz4Var.R;
                            oi2.Y(obj);
                            b01Var = b01Var3;
                            c97Var = c97Var2;
                        } else {
                            i.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    } else {
                        oi2.Y(obj);
                        nz4Var.R = c97Var;
                        nz4Var.X = b01Var2;
                        nz4Var.d0 = 1;
                        if (b01Var2.B.e(nz4Var) == x61Var) {
                            return x61Var;
                        }
                        b01Var = b01Var2;
                    }
                    int i3 = puVar.L;
                    if (!puVar.isEmpty()) {
                        int i4 = mz4.a[c97Var.ordinal()];
                        if (i4 != 1) {
                            if (i4 != 2) {
                                if (i4 == 3) {
                                    ii2.s(b01Var2, "BEGIN EXCLUSIVE TRANSACTION");
                                } else {
                                    throw new RuntimeException();
                                }
                            } else {
                                ii2.s(b01Var2, "BEGIN IMMEDIATE TRANSACTION");
                            }
                        } else {
                            ii2.s(b01Var2, "BEGIN DEFERRED TRANSACTION");
                        }
                    } else {
                        ii2.s(b01Var2, "SAVEPOINT '" + i3 + '\'');
                    }
                    puVar.addLast(new lz4(i3));
                    jg7 jg7Var = jg7.a;
                    b01Var.h(null);
                    return jg7Var;
                }
            }
            int i32 = puVar.L;
            if (!puVar.isEmpty()) {
            }
            puVar.addLast(new lz4(i32));
            jg7 jg7Var2 = jg7.a;
            b01Var.h(null);
            return jg7Var2;
        } catch (Throwable th) {
            b01Var.h(null);
            throw th;
        }
        nz4Var = new nz4(this, s41Var);
        Object obj2 = nz4Var.Y;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i = nz4Var.d0;
        b01 b01Var22 = this.b;
        if (i == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0053 A[Catch: all -> 0x006c, TryCatch #0 {all -> 0x006c, blocks: (B:18:0x004d, B:20:0x0053, B:22:0x005d, B:24:0x0066, B:32:0x00a3, B:27:0x006e, B:28:0x0083, B:30:0x0089, B:31:0x008f, B:35:0x00a9, B:36:0x00b0), top: B:39:0x004d }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a9 A[Catch: all -> 0x006c, TRY_ENTER, TryCatch #0 {all -> 0x006c, blocks: (B:18:0x004d, B:20:0x0053, B:22:0x005d, B:24:0x0066, B:32:0x00a3, B:27:0x006e, B:28:0x0083, B:30:0x0089, B:31:0x008f, B:35:0x00a9, B:36:0x00b0), top: B:39:0x004d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(boolean z, s41 s41Var) {
        oz4 oz4Var;
        int i;
        b01 b01Var;
        pu puVar = this.d;
        try {
            if (s41Var instanceof oz4) {
                oz4Var = (oz4) s41Var;
                int i2 = oz4Var.d0;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    oz4Var.d0 = i2 - Integer.MIN_VALUE;
                    Object obj = oz4Var.Y;
                    x61 x61Var = x61.COROUTINE_SUSPENDED;
                    i = oz4Var.d0;
                    b01 b01Var2 = this.b;
                    if (i == 0) {
                        if (i == 1) {
                            z = oz4Var.R;
                            b01Var = oz4Var.X;
                            oi2.Y(obj);
                        } else {
                            i.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    } else {
                        oi2.Y(obj);
                        oz4Var.X = b01Var2;
                        oz4Var.R = z;
                        oz4Var.d0 = 1;
                        if (b01Var2.B.e(oz4Var) == x61Var) {
                            return x61Var;
                        }
                        b01Var = b01Var2;
                    }
                    if (puVar.isEmpty()) {
                        lz4 lz4Var = (lz4) gt0.Y0(puVar);
                        if (z) {
                            lz4Var.getClass();
                            if (puVar.isEmpty()) {
                                ii2.s(b01Var2, "END TRANSACTION");
                            } else {
                                ii2.s(b01Var2, "RELEASE SAVEPOINT '" + lz4Var.a + '\'');
                            }
                        } else if (puVar.isEmpty()) {
                            ii2.s(b01Var2, "ROLLBACK TRANSACTION");
                        } else {
                            ii2.s(b01Var2, "ROLLBACK TRANSACTION TO SAVEPOINT '" + lz4Var.a + '\'');
                        }
                        jg7 jg7Var = jg7.a;
                        b01Var.h(null);
                        return jg7Var;
                    }
                    throw new IllegalStateException("Not in a transaction");
                }
            }
            if (puVar.isEmpty()) {
            }
        } catch (Throwable th) {
            b01Var.h(null);
            throw th;
        }
        oz4Var = new oz4(this, s41Var);
        Object obj2 = oz4Var.Y;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i = oz4Var.d0;
        b01 b01Var22 = this.b;
        if (i == 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x006b, code lost:
        if (e(r11, r0) == r1) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x008f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(c97 c97Var, eo2 eo2Var, s41 s41Var) {
        pz4 pz4Var;
        Object obj;
        Object obj2;
        int i;
        SQLException e;
        Throwable th;
        int i2;
        try {
            if (s41Var instanceof pz4) {
                pz4Var = (pz4) s41Var;
                int i3 = pz4Var.e0;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    pz4Var.e0 = i3 - Integer.MIN_VALUE;
                    obj = pz4Var.Z;
                    obj2 = x61.COROUTINE_SUSPENDED;
                    i = pz4Var.e0;
                    boolean z = false;
                    if (i == 0) {
                        if (i != 1) {
                            if (i != 2) {
                                if (i != 3 && i != 4) {
                                    if (i != 5) {
                                        i.m("call to 'resume' before 'invoke' with coroutine");
                                        return null;
                                    }
                                    th = pz4Var.X;
                                    th = (Throwable) pz4Var.R;
                                    try {
                                        oi2.Y(obj);
                                        throw th;
                                    } catch (SQLException e2) {
                                        e = e2;
                                        if (th == null) {
                                        }
                                    }
                                } else {
                                    Object obj3 = pz4Var.R;
                                    oi2.Y(obj);
                                    return obj3;
                                }
                            } else {
                                i2 = pz4Var.Y;
                                oi2.Y(obj);
                                if (i2 != 0) {
                                    z = true;
                                }
                                pz4Var.R = obj;
                                pz4Var.e0 = 3;
                                if (f(z, pz4Var) == obj2) {
                                    return obj;
                                }
                                return obj2;
                            }
                        } else {
                            eo2Var = (eo2) pz4Var.R;
                            oi2.Y(obj);
                        }
                    } else {
                        oi2.Y(obj);
                        if (c97Var == null) {
                            c97Var = c97.DEFERRED;
                        }
                        pz4Var.R = eo2Var;
                        pz4Var.e0 = 1;
                    }
                    bt4 bt4Var = new bt4(this, 1);
                    pz4Var.R = null;
                    pz4Var.Y = 1;
                    pz4Var.e0 = 2;
                    obj = eo2Var.o(bt4Var, pz4Var);
                    if (obj != obj2) {
                        i2 = 1;
                        if (i2 != 0) {
                        }
                        pz4Var.R = obj;
                        pz4Var.e0 = 3;
                        if (f(z, pz4Var) == obj2) {
                        }
                    }
                    return obj2;
                }
            }
            if (i == 0) {
            }
            bt4 bt4Var2 = new bt4(this, 1);
            pz4Var.R = null;
            pz4Var.Y = 1;
            pz4Var.e0 = 2;
            obj = eo2Var.o(bt4Var2, pz4Var);
            if (obj != obj2) {
            }
            return obj2;
        } catch (Throwable th2) {
            th = th2;
            try {
                throw th;
            } catch (Throwable th3) {
                try {
                    pz4Var.R = th;
                    pz4Var.X = th3;
                    pz4Var.e0 = 5;
                    if (f(false, pz4Var) != obj2) {
                        throw th3;
                    }
                } catch (SQLException e3) {
                    e = e3;
                    th = th3;
                    if (th == null) {
                        mb3.q(th, e);
                        throw th;
                    }
                    throw e;
                }
            }
        }
        pz4Var = new pz4(this, s41Var);
        obj = pz4Var.Z;
        obj2 = x61.COROUTINE_SUSPENDED;
        i = pz4Var.e0;
        boolean z2 = false;
    }
}
