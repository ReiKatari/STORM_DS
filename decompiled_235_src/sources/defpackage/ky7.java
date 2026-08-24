package defpackage;

import java.io.IOException;
import java.util.GregorianCalendar;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.zip.Inflater;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ky7  reason: default package */
/* loaded from: classes.dex */
public final class ky7 extends db2 {
    public static final lt4 X;
    public final lt4 B;
    public final db2 L;
    public final LinkedHashMap R;

    static {
        String str = lt4.B;
        X = w31.p("/");
    }

    public ky7(lt4 lt4Var, db2 db2Var, LinkedHashMap linkedHashMap) {
        this.B = lt4Var;
        this.L = db2Var;
        this.R = linkedHashMap;
    }

    @Override // defpackage.db2
    public final ai1 D(lt4 lt4Var) {
        Long valueOf;
        Integer num;
        boolean z;
        Long l;
        Integer num2;
        Long l2;
        Integer num3;
        Long l3;
        Long valueOf2;
        Throwable th;
        lt4Var.getClass();
        lt4 lt4Var2 = X;
        lt4Var2.getClass();
        jy7 jy7Var = (jy7) this.R.get(f.b(lt4Var2, lt4Var, true));
        if (jy7Var == null) {
            return null;
        }
        long j = jy7Var.h;
        if (j != -1) {
            wf3 F = this.L.F(this.B);
            try {
                fe5 fe5Var = new fe5(F.e(j));
                jy7Var = vs7.e(fe5Var, jy7Var);
                jy7Var.getClass();
                try {
                    fe5Var.close();
                    th = null;
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                if (F != null) {
                    try {
                        F.close();
                    } catch (Throwable th4) {
                        mb3.q(th3, th4);
                    }
                }
                th = th3;
                jy7Var = null;
            }
            if (th == null) {
                try {
                    F.close();
                    th = null;
                } catch (Throwable th5) {
                    th = th5;
                }
                if (th != null) {
                    throw th;
                }
            } else {
                throw th;
            }
        }
        boolean z2 = jy7Var.b;
        boolean z3 = !z2;
        if (z2) {
            valueOf = null;
        } else {
            valueOf = Long.valueOf(jy7Var.f);
        }
        Long l4 = jy7Var.m;
        if (l4 != null) {
            l = Long.valueOf((l4.longValue() / 10000) - 11644473600000L);
            z = true;
        } else {
            if (jy7Var.p != null) {
                z = true;
                l = Long.valueOf(num.intValue() * 1000);
            } else {
                z = true;
                l = null;
            }
        }
        Long l5 = jy7Var.k;
        if (l5 != null) {
            l2 = Long.valueOf((l5.longValue() / 10000) - 11644473600000L);
        } else {
            if (jy7Var.n != null) {
                l2 = Long.valueOf(num2.intValue() * 1000);
            } else {
                int i = jy7Var.j;
                if (i != -1) {
                    int i2 = jy7Var.i;
                    if (i != -1) {
                        int i3 = (i & 31) << 1;
                        GregorianCalendar gregorianCalendar = new GregorianCalendar();
                        gregorianCalendar.set(14, 0);
                        gregorianCalendar.set(((i2 >> 9) & 127) + 1980, ((i2 >> 5) & 15) - 1, i2 & 31, (i >> 11) & 31, (i >> 5) & 63, i3);
                        l2 = Long.valueOf(gregorianCalendar.getTime().getTime());
                    }
                }
                l2 = null;
            }
        }
        Long l6 = jy7Var.l;
        if (l6 != null) {
            valueOf2 = Long.valueOf((l6.longValue() / 10000) - 11644473600000L);
        } else {
            if (jy7Var.o != null) {
                valueOf2 = Long.valueOf(num3.intValue() * 1000);
            } else {
                l3 = null;
                return new ai1(z3, z2, null, valueOf, l, l2, l3);
            }
        }
        l3 = valueOf2;
        return new ai1(z3, z2, null, valueOf, l, l2, l3);
    }

    @Override // defpackage.db2
    public final wf3 F(lt4 lt4Var) {
        throw new UnsupportedOperationException("not implemented yet!");
    }

    @Override // defpackage.db2
    public final ui6 J(lt4 lt4Var) {
        lt4Var.getClass();
        throw new IOException("zip file systems are read-only");
    }

    @Override // defpackage.db2
    public final in6 N(lt4 lt4Var) {
        Throwable th;
        fe5 fe5Var;
        lt4Var.getClass();
        lt4 lt4Var2 = X;
        lt4Var2.getClass();
        jy7 jy7Var = (jy7) this.R.get(f.b(lt4Var2, lt4Var, true));
        if (jy7Var != null) {
            long j = jy7Var.f;
            wf3 F = this.L.F(this.B);
            try {
                fe5Var = new fe5(F.e(jy7Var.h));
                try {
                    F.close();
                    th = null;
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                if (F != null) {
                    try {
                        F.close();
                    } catch (Throwable th4) {
                        mb3.q(th3, th4);
                    }
                }
                th = th3;
                fe5Var = null;
            }
            if (th == null) {
                fe5Var.getClass();
                vs7.e(fe5Var, null);
                if (jy7Var.g == 0) {
                    return new id2(fe5Var, j, true);
                }
                return new id2(new h53(new fe5(new id2(fe5Var, jy7Var.e, true)), new Inflater(true)), j, false);
            }
            throw th;
        }
        e41.u(lt4Var, "no such file: ");
        return null;
    }

    @Override // defpackage.db2
    public final ui6 e(lt4 lt4Var) {
        lt4Var.getClass();
        throw new IOException("zip file systems are read-only");
    }

    @Override // defpackage.db2
    public final void h(lt4 lt4Var, lt4 lt4Var2) {
        lt4Var.getClass();
        lt4Var2.getClass();
        throw new IOException("zip file systems are read-only");
    }

    @Override // defpackage.db2
    public final void n(lt4 lt4Var) {
        lt4Var.getClass();
        throw new IOException("zip file systems are read-only");
    }

    @Override // defpackage.db2
    public final void r(lt4 lt4Var) {
        lt4Var.getClass();
        throw new IOException("zip file systems are read-only");
    }

    @Override // defpackage.db2
    public final List x(lt4 lt4Var) {
        lt4Var.getClass();
        lt4 lt4Var2 = X;
        lt4Var2.getClass();
        jy7 jy7Var = (jy7) this.R.get(f.b(lt4Var2, lt4Var, true));
        if (jy7Var != null) {
            return gt0.k1(jy7Var.q);
        }
        fa6.d(lt4Var, "not a directory: ");
        return null;
    }
}
