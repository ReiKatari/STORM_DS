package defpackage;

import java.io.File;
import java.util.ArrayList;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: lt4  reason: default package */
/* loaded from: classes.dex */
public final class lt4 implements Comparable {
    public static final String B;
    public final da0 A;

    static {
        String str = File.separator;
        str.getClass();
        B = str;
    }

    public lt4(da0 da0Var) {
        da0Var.getClass();
        this.A = da0Var;
    }

    public final ArrayList a() {
        ArrayList arrayList = new ArrayList();
        int a = f.a(this);
        da0 da0Var = this.A;
        if (a == -1) {
            a = 0;
        } else if (a < da0Var.d() && da0Var.i(a) == 92) {
            a++;
        }
        int d = da0Var.d();
        int i = a;
        while (a < d) {
            if (da0Var.i(a) == 47 || da0Var.i(a) == 92) {
                arrayList.add(da0Var.o(i, a));
                i = a + 1;
            }
            a++;
        }
        if (i < da0Var.d()) {
            arrayList.add(da0Var.o(i, da0Var.d()));
        }
        return arrayList;
    }

    public final lt4 b() {
        da0 da0Var = f.d;
        da0 da0Var2 = this.A;
        if (!nb3.k(da0Var2, da0Var)) {
            da0 da0Var3 = f.a;
            if (!nb3.k(da0Var2, da0Var3)) {
                da0 da0Var4 = f.b;
                if (!nb3.k(da0Var2, da0Var4)) {
                    da0 da0Var5 = f.e;
                    da0Var2.getClass();
                    da0Var5.getClass();
                    int d = da0Var2.d();
                    byte[] bArr = da0Var5.A;
                    if (!da0Var2.l(d - bArr.length, da0Var5, bArr.length) || (da0Var2.d() != 2 && !da0Var2.l(da0Var2.d() - 3, da0Var3, 1) && !da0Var2.l(da0Var2.d() - 3, da0Var4, 1))) {
                        int k = da0.k(da0Var2, da0Var3);
                        if (k == -1) {
                            k = da0.k(da0Var2, da0Var4);
                        }
                        if (k == 2 && e() != null) {
                            if (da0Var2.d() != 3) {
                                return new lt4(da0.p(da0Var2, 0, 3, 1));
                            }
                            return null;
                        }
                        if (k == 1) {
                            da0Var4.getClass();
                            if (da0Var2.l(0, da0Var4, da0Var4.d())) {
                                return null;
                            }
                        }
                        if (k == -1 && e() != null) {
                            if (da0Var2.d() != 2) {
                                return new lt4(da0.p(da0Var2, 0, 2, 1));
                            }
                            return null;
                        } else if (k == -1) {
                            return new lt4(da0Var);
                        } else {
                            if (k == 0) {
                                return new lt4(da0.p(da0Var2, 0, 1, 1));
                            }
                            return new lt4(da0.p(da0Var2, 0, k, 1));
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

    /* JADX WARN: Type inference failed for: r0v4, types: [k80, java.lang.Object] */
    public final lt4 c(lt4 lt4Var) {
        lt4 lt4Var2;
        lt4 lt4Var3;
        lt4Var.getClass();
        da0 da0Var = lt4Var.A;
        int a = f.a(this);
        da0 da0Var2 = this.A;
        if (a == -1) {
            lt4Var2 = null;
        } else {
            lt4Var2 = new lt4(da0Var2.o(0, a));
        }
        int a2 = f.a(lt4Var);
        if (a2 == -1) {
            lt4Var3 = null;
        } else {
            lt4Var3 = new lt4(da0Var.o(0, a2));
        }
        if (nb3.k(lt4Var2, lt4Var3)) {
            ArrayList a3 = a();
            ArrayList a4 = lt4Var.a();
            int min = Math.min(a3.size(), a4.size());
            int i = 0;
            while (i < min && nb3.k(a3.get(i), a4.get(i))) {
                i++;
            }
            if (i == min && da0Var2.d() == da0Var.d()) {
                return w31.p(".");
            }
            if (a4.subList(i, a4.size()).indexOf(f.e) == -1) {
                if (nb3.k(da0Var, f.d)) {
                    return this;
                }
                ?? obj = new Object();
                da0 c = f.c(lt4Var);
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
                    obj.k0((da0) a3.get(i));
                    obj.k0(c);
                    i++;
                }
                return f.d(obj, false);
            }
            u34.y("Impossible relative path to resolve: ", this, " and ", lt4Var);
            return null;
        }
        u34.y("Paths of different roots cannot be relative to each other: ", this, " and ", lt4Var);
        return null;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        lt4 lt4Var = (lt4) obj;
        lt4Var.getClass();
        return this.A.compareTo(lt4Var.A);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [k80, java.lang.Object] */
    public final lt4 d(String str) {
        str.getClass();
        ?? obj = new Object();
        obj.t0(str);
        return f.b(this, f.d(obj, false), false);
    }

    public final Character e() {
        da0 da0Var = f.a;
        da0 da0Var2 = this.A;
        if (da0.g(da0Var2, da0Var) == -1 && da0Var2.d() >= 2 && da0Var2.i(1) == 58) {
            char i = (char) da0Var2.i(0);
            if (('a' <= i && i < '{') || ('A' <= i && i < '[')) {
                return Character.valueOf(i);
            }
            return null;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof lt4) && nb3.k(((lt4) obj).A, this.A)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.A.hashCode();
    }

    public final File toFile() {
        return new File(this.A.s());
    }

    public final String toString() {
        return this.A.s();
    }
}
