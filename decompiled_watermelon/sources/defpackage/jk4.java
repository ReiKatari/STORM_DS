package defpackage;

import java.io.File;
import java.util.ArrayList;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: jk4  reason: default package */
/* loaded from: classes.dex */
public final class jk4 implements Comparable {
    public static final String B;
    public final w70 A;

    static {
        String str = File.separator;
        str.getClass();
        B = str;
    }

    public jk4(w70 w70Var) {
        w70Var.getClass();
        this.A = w70Var;
    }

    public final ArrayList a() {
        ArrayList arrayList = new ArrayList();
        int a = f.a(this);
        w70 w70Var = this.A;
        if (a == -1) {
            a = 0;
        } else if (a < w70Var.d() && w70Var.i(a) == 92) {
            a++;
        }
        int d = w70Var.d();
        int i = a;
        while (a < d) {
            if (w70Var.i(a) == 47 || w70Var.i(a) == 92) {
                arrayList.add(w70Var.o(i, a));
                i = a + 1;
            }
            a++;
        }
        if (i < w70Var.d()) {
            arrayList.add(w70Var.o(i, w70Var.d()));
        }
        return arrayList;
    }

    public final jk4 b() {
        w70 w70Var = f.d;
        w70 w70Var2 = this.A;
        if (!b53.x(w70Var2, w70Var)) {
            w70 w70Var3 = f.a;
            if (!b53.x(w70Var2, w70Var3)) {
                w70 w70Var4 = f.b;
                if (!b53.x(w70Var2, w70Var4)) {
                    w70 w70Var5 = f.e;
                    w70Var2.getClass();
                    w70Var5.getClass();
                    int d = w70Var2.d();
                    byte[] bArr = w70Var5.A;
                    if (!w70Var2.m(d - bArr.length, w70Var5, bArr.length) || (w70Var2.d() != 2 && !w70Var2.m(w70Var2.d() - 3, w70Var3, 1) && !w70Var2.m(w70Var2.d() - 3, w70Var4, 1))) {
                        int k = w70.k(w70Var2, w70Var3);
                        if (k == -1) {
                            k = w70.k(w70Var2, w70Var4);
                        }
                        if (k == 2 && e() != null) {
                            if (w70Var2.d() != 3) {
                                return new jk4(w70.p(w70Var2, 0, 3, 1));
                            }
                            return null;
                        }
                        if (k == 1) {
                            w70Var4.getClass();
                            if (w70Var2.m(0, w70Var4, w70Var4.d())) {
                                return null;
                            }
                        }
                        if (k == -1 && e() != null) {
                            if (w70Var2.d() != 2) {
                                return new jk4(w70.p(w70Var2, 0, 2, 1));
                            }
                            return null;
                        } else if (k == -1) {
                            return new jk4(w70Var);
                        } else {
                            if (k == 0) {
                                return new jk4(w70.p(w70Var2, 0, 1, 1));
                            }
                            return new jk4(w70.p(w70Var2, 0, k, 1));
                        }
                    }
                    return null;
                }
                return null;
            }
            return null;
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [f60, java.lang.Object] */
    public final jk4 c(jk4 jk4Var) {
        jk4 jk4Var2;
        jk4 jk4Var3;
        jk4Var.getClass();
        w70 w70Var = jk4Var.A;
        int a = f.a(this);
        w70 w70Var2 = this.A;
        if (a == -1) {
            jk4Var2 = null;
        } else {
            jk4Var2 = new jk4(w70Var2.o(0, a));
        }
        int a2 = f.a(jk4Var);
        if (a2 == -1) {
            jk4Var3 = null;
        } else {
            jk4Var3 = new jk4(w70Var.o(0, a2));
        }
        if (b53.x(jk4Var2, jk4Var3)) {
            ArrayList a3 = a();
            ArrayList a4 = jk4Var.a();
            int min = Math.min(a3.size(), a4.size());
            int i = 0;
            while (i < min && b53.x(a3.get(i), a4.get(i))) {
                i++;
            }
            if (i == min && w70Var2.d() == w70Var.d()) {
                return hm1.o(".");
            }
            if (a4.subList(i, a4.size()).indexOf(f.e) == -1) {
                if (b53.x(w70Var, f.d)) {
                    return this;
                }
                ?? obj = new Object();
                w70 c = f.c(jk4Var);
                if (c == null && (c = f.c(this)) == null) {
                    c = f.f(B);
                }
                int size = a4.size();
                for (int i2 = i; i2 < size; i2++) {
                    obj.k0(f.e);
                    obj.k0(c);
                }
                int size2 = a3.size();
                while (i < size2) {
                    obj.k0((w70) a3.get(i));
                    obj.k0(c);
                    i++;
                }
                return f.d(obj, false);
            }
            c44.v("Impossible relative path to resolve: ", this, " and ", jk4Var);
            return null;
        }
        c44.v("Paths of different roots cannot be relative to each other: ", this, " and ", jk4Var);
        return null;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        jk4 jk4Var = (jk4) obj;
        jk4Var.getClass();
        return this.A.compareTo(jk4Var.A);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [f60, java.lang.Object] */
    public final jk4 d(String str) {
        str.getClass();
        ?? obj = new Object();
        obj.s0(str);
        return f.b(this, f.d(obj, false), false);
    }

    public final Character e() {
        w70 w70Var = f.a;
        w70 w70Var2 = this.A;
        if (w70.g(w70Var2, w70Var) == -1 && w70Var2.d() >= 2 && w70Var2.i(1) == 58) {
            char i = (char) w70Var2.i(0);
            if (('a' <= i && i < '{') || ('A' <= i && i < '[')) {
                return Character.valueOf(i);
            }
            return null;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof jk4) && b53.x(((jk4) obj).A, this.A)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.A.hashCode();
    }

    public final File toFile() {
        return new File(this.A.r());
    }

    public final String toString() {
        return this.A.r();
    }
}
