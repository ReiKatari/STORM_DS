package defpackage;

import java.io.IOException;
import java.util.GregorianCalendar;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.zip.Inflater;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: rj7  reason: default package */
/* loaded from: classes.dex */
public final class rj7 extends j62 {
    public static final jk4 X;
    public final jk4 B;
    public final j62 L;
    public final LinkedHashMap R;

    static {
        String str = jk4.B;
        X = hm1.o("/");
    }

    public rj7(jk4 jk4Var, j62 j62Var, LinkedHashMap linkedHashMap) {
        this.B = jk4Var;
        this.L = j62Var;
        this.R = linkedHashMap;
    }

    @Override // defpackage.j62
    public final List D(jk4 jk4Var) {
        jk4Var.getClass();
        jk4 jk4Var2 = X;
        jk4Var2.getClass();
        qj7 qj7Var = (qj7) this.R.get(f.b(jk4Var2, jk4Var, true));
        if (qj7Var != null) {
            return tq0.n1(qj7Var.q);
        }
        vd6.d(jk4Var, "not a directory: ");
        return null;
    }

    @Override // defpackage.j62
    public final wd1 I(jk4 jk4Var) {
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
        jk4Var.getClass();
        jk4 jk4Var2 = X;
        jk4Var2.getClass();
        qj7 qj7Var = (qj7) this.R.get(f.b(jk4Var2, jk4Var, true));
        if (qj7Var == null) {
            return null;
        }
        long j = qj7Var.h;
        if (j != -1) {
            c93 J = this.L.J(this.B);
            try {
                s45 s45Var = new s45(J.d(j));
                qj7Var = uj7.g(s45Var, qj7Var);
                qj7Var.getClass();
                try {
                    s45Var.close();
                    th = null;
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                if (J != null) {
                    try {
                        J.close();
                    } catch (Throwable th4) {
                        pu.k(th3, th4);
                    }
                }
                th = th3;
                qj7Var = null;
            }
            if (th == null) {
                try {
                    J.close();
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
        boolean z2 = qj7Var.b;
        boolean z3 = !z2;
        if (z2) {
            valueOf = null;
        } else {
            valueOf = Long.valueOf(qj7Var.f);
        }
        Long l4 = qj7Var.m;
        if (l4 != null) {
            l = Long.valueOf((l4.longValue() / 10000) - 11644473600000L);
            z = true;
        } else {
            if (qj7Var.p != null) {
                z = true;
                l = Long.valueOf(num.intValue() * 1000);
            } else {
                z = true;
                l = null;
            }
        }
        Long l5 = qj7Var.k;
        if (l5 != null) {
            l2 = Long.valueOf((l5.longValue() / 10000) - 11644473600000L);
        } else {
            if (qj7Var.n != null) {
                l2 = Long.valueOf(num2.intValue() * 1000);
            } else {
                int i = qj7Var.j;
                if (i != -1) {
                    int i2 = qj7Var.i;
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
        Long l6 = qj7Var.l;
        if (l6 != null) {
            valueOf2 = Long.valueOf((l6.longValue() / 10000) - 11644473600000L);
        } else {
            if (qj7Var.o != null) {
                valueOf2 = Long.valueOf(num3.intValue() * 1000);
            } else {
                l3 = null;
                return new wd1(z3, z2, null, valueOf, l, l2, l3);
            }
        }
        l3 = valueOf2;
        return new wd1(z3, z2, null, valueOf, l, l2, l3);
    }

    @Override // defpackage.j62
    public final c93 J(jk4 jk4Var) {
        throw new UnsupportedOperationException("not implemented yet!");
    }

    @Override // defpackage.j62
    public final g76 K(jk4 jk4Var) {
        jk4Var.getClass();
        throw new IOException("zip file systems are read-only");
    }

    @Override // defpackage.j62
    public final sb6 N(jk4 jk4Var) {
        Throwable th;
        s45 s45Var;
        jk4Var.getClass();
        jk4 jk4Var2 = X;
        jk4Var2.getClass();
        qj7 qj7Var = (qj7) this.R.get(f.b(jk4Var2, jk4Var, true));
        if (qj7Var != null) {
            long j = qj7Var.f;
            c93 J = this.L.J(this.B);
            try {
                s45Var = new s45(J.d(qj7Var.h));
                try {
                    J.close();
                    th = null;
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                if (J != null) {
                    try {
                        J.close();
                    } catch (Throwable th4) {
                        pu.k(th3, th4);
                    }
                }
                th = th3;
                s45Var = null;
            }
            if (th == null) {
                s45Var.getClass();
                uj7.g(s45Var, null);
                if (qj7Var.g == 0) {
                    return new q82(s45Var, j, true);
                }
                return new q82(new ez2(new s45(new q82(s45Var, qj7Var.e, true)), new Inflater(true)), j, false);
            }
            throw th;
        }
        f81.v(jk4Var, "no such file: ");
        return null;
    }

    @Override // defpackage.j62
    public final g76 d(jk4 jk4Var) {
        jk4Var.getClass();
        throw new IOException("zip file systems are read-only");
    }

    @Override // defpackage.j62
    public final void i(jk4 jk4Var, jk4 jk4Var2) {
        jk4Var.getClass();
        jk4Var2.getClass();
        throw new IOException("zip file systems are read-only");
    }

    @Override // defpackage.j62
    public final void w(jk4 jk4Var) {
        jk4Var.getClass();
        throw new IOException("zip file systems are read-only");
    }

    @Override // defpackage.j62
    public final void x(jk4 jk4Var) {
        jk4Var.getClass();
        throw new IOException("zip file systems are read-only");
    }
}
