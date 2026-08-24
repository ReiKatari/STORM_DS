package defpackage;

import android.database.SQLException;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ft4  reason: default package */
/* loaded from: classes.dex */
public final class ft4 implements d97, ud5 {
    public final eo2 a;
    public final e36 b;
    public final AtomicInteger c;
    public c97 d;

    public ft4(eo2 eo2Var, e36 e36Var) {
        e36Var.getClass();
        this.a = eo2Var;
        this.b = e36Var;
        this.c = new AtomicInteger(0);
    }

    @Override // defpackage.d97
    public final Object a(c97 c97Var, eo2 eo2Var, hw6 hw6Var) {
        Object o = this.a.o(new ad(this, c97Var, eo2Var, null, 2), hw6Var);
        x61 x61Var = x61.COROUTINE_SUSPENDED;
        return o;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0048, code lost:
        if (r13 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006b  */
    @Override // defpackage.jz4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, qn2 qn2Var, s41 s41Var) {
        et4 et4Var;
        Object obj;
        int i;
        if (s41Var instanceof et4) {
            et4Var = (et4) s41Var;
            int i2 = et4Var.d0;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                et4Var.d0 = i2 - Integer.MIN_VALUE;
                obj = et4Var.Y;
                Object obj2 = x61.COROUTINE_SUSPENDED;
                i = et4Var.d0;
                if (i == 0) {
                    if (i != 1) {
                        if (i == 2) {
                            oi2.Y(obj);
                            return obj;
                        }
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qn2Var = et4Var.X;
                    str = et4Var.R;
                    oi2.Y(obj);
                } else {
                    oi2.Y(obj);
                    et4Var.R = str;
                    et4Var.X = qn2Var;
                    et4Var.d0 = 1;
                    obj = c(et4Var);
                }
                String str2 = str;
                qn2 qn2Var2 = qn2Var;
                if (!((Boolean) obj).booleanValue()) {
                    yh0 yh0Var = new yh0(this, str2, qn2Var2, null, 1);
                    et4Var.R = null;
                    et4Var.X = null;
                    et4Var.d0 = 2;
                    Object o = this.a.o(yh0Var, et4Var);
                    if (o == obj2) {
                        return obj2;
                    }
                    return o;
                }
                j36 i0 = this.b.i0(str2);
                try {
                    Object g = qn2Var2.g(i0);
                    lb4.p(i0, null);
                    return g;
                } finally {
                }
            }
        }
        et4Var = new et4(this, s41Var);
        obj = et4Var.Y;
        Object obj22 = x61.COROUTINE_SUSPENDED;
        i = et4Var.d0;
        if (i == 0) {
        }
        String str22 = str;
        qn2 qn2Var22 = qn2Var;
        if (!((Boolean) obj).booleanValue()) {
        }
    }

    @Override // defpackage.d97
    public final Boolean c(r41 r41Var) {
        boolean z;
        if (this.d == null && !this.b.Y()) {
            z = false;
        } else {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.ud5
    public final e36 d() {
        return this.b;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0089  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(c97 c97Var, eo2 eo2Var, s41 s41Var) {
        dt4 dt4Var;
        int i;
        AtomicInteger atomicInteger;
        int i2;
        e36 e36Var;
        try {
            if (s41Var instanceof dt4) {
                dt4Var = (dt4) s41Var;
                int i3 = dt4Var.Z;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    dt4Var.Z = i3 - Integer.MIN_VALUE;
                    Object obj = dt4Var.X;
                    Object obj2 = x61.COROUTINE_SUSPENDED;
                    i = dt4Var.Z;
                    atomicInteger = this.c;
                    i2 = 1;
                    e36Var = this.b;
                    if (i == 0) {
                        if (i == 1) {
                            i2 = dt4Var.R;
                            oi2.Y(obj);
                        } else {
                            i.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    } else {
                        oi2.Y(obj);
                        int i4 = ct4.a[c97Var.ordinal()];
                        if (i4 != 1) {
                            if (i4 != 2) {
                                if (i4 == 3) {
                                    ii2.s(e36Var, "BEGIN EXCLUSIVE TRANSACTION");
                                } else {
                                    i.d();
                                    return null;
                                }
                            } else {
                                ii2.s(e36Var, "BEGIN IMMEDIATE TRANSACTION");
                            }
                        } else {
                            ii2.s(e36Var, "BEGIN DEFERRED TRANSACTION");
                        }
                        if (atomicInteger.incrementAndGet() > 0) {
                            this.d = c97Var;
                        }
                        Object bt4Var = new bt4(this, 0);
                        dt4Var.R = 1;
                        dt4Var.Z = 1;
                        obj = eo2Var.o(bt4Var, dt4Var);
                        if (obj == obj2) {
                            return obj2;
                        }
                    }
                    if (atomicInteger.decrementAndGet() == 0) {
                        this.d = null;
                    }
                    if (i2 == 0) {
                        ii2.s(e36Var, "END TRANSACTION");
                        return obj;
                    }
                    ii2.s(e36Var, "ROLLBACK TRANSACTION");
                    return obj;
                }
            }
            if (i == 0) {
            }
            if (atomicInteger.decrementAndGet() == 0) {
            }
            if (i2 == 0) {
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                try {
                    if (atomicInteger.decrementAndGet() == 0) {
                        this.d = null;
                    }
                    ii2.s(e36Var, "ROLLBACK TRANSACTION");
                } catch (SQLException e) {
                    mb3.q(th, e);
                }
                throw th2;
            }
        }
        dt4Var = new dt4(this, s41Var);
        Object obj3 = dt4Var.X;
        Object obj22 = x61.COROUTINE_SUSPENDED;
        i = dt4Var.Z;
        atomicInteger = this.c;
        i2 = 1;
        e36Var = this.b;
    }
}
