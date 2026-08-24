package defpackage;

import android.os.Trace;
import java.util.Iterator;
import java.util.Set;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: jb1  reason: default package */
/* loaded from: classes.dex */
public final class jb1 {
    public Object a;
    public Object b;
    public final Object c;
    public Object d;
    public Object e;
    public final Object f;
    public final Object g;
    public Object h;
    public Object i;
    public Object j;
    public Object k;

    public jb1(nb1 nb1Var, pa paVar) {
        this.b = nb1Var;
        this.a = paVar;
        this.c = em1.a(new fb1(nb1Var, 1, 1, this));
        this.d = em1.a(new fb1(nb1Var, 2, 1, this));
        this.g = new fb1(nb1Var, 4, 1, this);
        this.h = new fb1(nb1Var, 5, 1, this);
        this.i = new fb1(nb1Var, 6, 1, this);
        this.j = new fb1(nb1Var, 7, 1, this);
        this.k = new fb1(nb1Var, 8, 1, this);
        this.e = em1.a(new fb1(nb1Var, 3, 1, this));
        this.f = em1.a(new fb1(nb1Var, 0, 1, this));
    }

    public static final boolean f(br2 br2Var, ua4 ua4Var) {
        Object[] objArr = ua4Var.A;
        int i = ua4Var.L;
        for (int i2 = 0; i2 < i; i2++) {
            bj5 bj5Var = ((br2) objArr[i2]).a;
            if (bj5Var instanceof uu4) {
                ua4 ua4Var2 = ((uu4) bj5Var).B;
                if (ua4Var2.j(br2Var) || f(br2Var, ua4Var2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public void a() {
        this.a = null;
        this.b = null;
        ua4 ua4Var = (ua4) this.c;
        ua4Var.g();
        ((ka4) this.d).b();
        this.e = ua4Var;
        ((ua4) this.f).g();
        ((ua4) this.g).g();
        this.h = null;
        this.i = null;
        this.j = null;
    }

    public void b() {
        Set set = (Set) this.a;
        if (set != null && !set.isEmpty()) {
            Trace.beginSection("Compose:abandons");
            try {
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    it.remove();
                    ((bj5) it.next()).a();
                }
            } finally {
                Trace.endSection();
            }
        }
    }

    public void c() {
        ua4 ua4Var = (ua4) this.c;
        ua4 ua4Var2 = (ua4) this.f;
        Set set = (Set) this.a;
        if (set != null) {
            this.k = null;
            if (ua4Var2.L != 0) {
                Trace.beginSection("Compose:onForgotten");
                try {
                    ka4 ka4Var = (ka4) this.h;
                    int i = ua4Var2.L;
                    while (true) {
                        i--;
                        if (-1 >= i) {
                            break;
                        }
                        Object obj = ua4Var2.A[i];
                        if (obj instanceof br2) {
                            bj5 bj5Var = ((br2) obj).a;
                            set.remove(bj5Var);
                            bj5Var.b();
                        }
                        if (obj instanceof ww0) {
                            if (ka4Var != null && ka4Var.c(obj)) {
                                ((ww0) obj).a();
                            } else {
                                ((ww0) obj).b();
                            }
                        }
                    }
                } finally {
                    Trace.endSection();
                }
            }
            if (ua4Var.L != 0) {
                Trace.beginSection("Compose:onRemembered");
                try {
                    Set set2 = (Set) this.a;
                    if (set2 != null) {
                        Object[] objArr = ua4Var.A;
                        int i2 = ua4Var.L;
                        for (int i3 = 0; i3 < i2; i3++) {
                            bj5 bj5Var2 = ((br2) objArr[i3]).a;
                            set2.remove(bj5Var2);
                            bj5Var2.c();
                        }
                    }
                } finally {
                }
            }
        }
    }

    public void d() {
        ua4 ua4Var = (ua4) this.g;
        if (ua4Var.L != 0) {
            Trace.beginSection("Compose:sideeffects");
            try {
                Object[] objArr = ua4Var.A;
                int i = ua4Var.L;
                for (int i2 = 0; i2 < i; i2++) {
                    ((on2) objArr[i2]).c();
                }
                ua4Var.g();
            } finally {
                Trace.endSection();
            }
        }
    }

    public void e(br2 br2Var) {
        ua4 ua4Var = (ua4) this.c;
        if (((ka4) this.d).c(br2Var)) {
            ((ka4) this.d).l(br2Var);
            if (!((ua4) this.e).j(br2Var) && !ua4Var.j(br2Var)) {
                f(br2Var, ua4Var);
            }
            Set set = (Set) this.a;
            if (set != null) {
                set.add(br2Var.a);
                return;
            }
            return;
        }
        ka4 ka4Var = (ka4) this.k;
        if (ka4Var != null && ka4Var.c(br2Var)) {
            return;
        }
        ((ua4) this.f).b(br2Var);
    }

    public void g(Set set, cy0 cy0Var) {
        a();
        this.a = set;
        this.b = cy0Var;
    }

    public jb1() {
        ua4 ua4Var = new ua4(new br2[16]);
        this.c = ua4Var;
        ka4 ka4Var = c66.a;
        this.d = new ka4();
        this.e = ua4Var;
        this.f = new ua4(new Object[16]);
        this.g = new ua4(new on2[16]);
    }
}
