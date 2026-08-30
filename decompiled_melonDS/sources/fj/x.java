package fj;

import java.io.File;
import java.util.ArrayList;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class x implements Comparable {
    public static final String B;
    public final h A;

    static {
        String str = File.separator;
        str.getClass();
        B = str;
    }

    public x(h hVar) {
        hVar.getClass();
        this.A = hVar;
    }

    public final ArrayList a() {
        ArrayList arrayList = new ArrayList();
        int a10 = gj.c.a(this);
        h hVar = this.A;
        if (a10 == -1) {
            a10 = 0;
        } else if (a10 < hVar.d() && hVar.i(a10) == 92) {
            a10++;
        }
        int d4 = hVar.d();
        int i2 = a10;
        while (a10 < d4) {
            if (hVar.i(a10) == 47 || hVar.i(a10) == 92) {
                arrayList.add(hVar.o(i2, a10));
                i2 = a10 + 1;
            }
            a10++;
        }
        if (i2 < hVar.d()) {
            arrayList.add(hVar.o(i2, hVar.d()));
        }
        return arrayList;
    }

    public final x b() {
        h hVar = gj.c.f5687d;
        h hVar2 = this.A;
        if (!nc.k.a(hVar2, hVar)) {
            h hVar3 = gj.c.f5684a;
            if (!nc.k.a(hVar2, hVar3)) {
                h hVar4 = gj.c.f5685b;
                if (!nc.k.a(hVar2, hVar4)) {
                    h hVar5 = gj.c.f5688e;
                    hVar2.getClass();
                    hVar5.getClass();
                    int d4 = hVar2.d();
                    byte[] bArr = hVar5.A;
                    if (!hVar2.l(d4 - bArr.length, hVar5, bArr.length) || (hVar2.d() != 2 && !hVar2.l(hVar2.d() - 3, hVar3, 1) && !hVar2.l(hVar2.d() - 3, hVar4, 1))) {
                        int k10 = h.k(hVar2, hVar3);
                        if (k10 == -1) {
                            k10 = h.k(hVar2, hVar4);
                        }
                        if (k10 == 2 && e() != null) {
                            if (hVar2.d() != 3) {
                                return new x(h.p(hVar2, 0, 3, 1));
                            }
                            return null;
                        }
                        if (k10 == 1) {
                            hVar4.getClass();
                            if (hVar2.l(0, hVar4, hVar4.d())) {
                                return null;
                            }
                        }
                        if (k10 == -1 && e() != null) {
                            if (hVar2.d() != 2) {
                                return new x(h.p(hVar2, 0, 2, 1));
                            }
                            return null;
                        } else if (k10 == -1) {
                            return new x(hVar);
                        } else {
                            if (k10 == 0) {
                                return new x(h.p(hVar2, 0, 1, 1));
                            }
                            return new x(h.p(hVar2, 0, k10, 1));
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

    /* JADX WARN: Type inference failed for: r0v4, types: [fj.e, java.lang.Object] */
    public final x c(x xVar) {
        x xVar2;
        xVar.getClass();
        h hVar = xVar.A;
        int a10 = gj.c.a(this);
        h hVar2 = this.A;
        x xVar3 = null;
        if (a10 == -1) {
            xVar2 = null;
        } else {
            xVar2 = new x(hVar2.o(0, a10));
        }
        int a11 = gj.c.a(xVar);
        if (a11 != -1) {
            xVar3 = new x(hVar.o(0, a11));
        }
        if (nc.k.a(xVar2, xVar3)) {
            ArrayList a12 = a();
            ArrayList a13 = xVar.a();
            int min = Math.min(a12.size(), a13.size());
            int i2 = 0;
            while (i2 < min && nc.k.a(a12.get(i2), a13.get(i2))) {
                i2++;
            }
            if (i2 == min && hVar2.d() == hVar.d()) {
                return x8.e.l(".");
            }
            if (a13.subList(i2, a13.size()).indexOf(gj.c.f5688e) == -1) {
                if (nc.k.a(hVar, gj.c.f5687d)) {
                    return this;
                }
                ?? obj = new Object();
                h c4 = gj.c.c(xVar);
                if (c4 == null && (c4 = gj.c.c(this)) == null) {
                    c4 = gj.c.f(B);
                }
                int size = a13.size();
                for (int i10 = i2; i10 < size; i10++) {
                    obj.c0(gj.c.f5688e);
                    obj.c0(c4);
                }
                int size2 = a12.size();
                while (i2 < size2) {
                    obj.c0((h) a12.get(i2));
                    obj.c0(c4);
                    i2++;
                }
                return gj.c.d(obj, false);
            }
            j.i("Impossible relative path to resolve: ", this, " and ", xVar);
            return null;
        }
        j.i("Paths of different roots cannot be relative to each other: ", this, " and ", xVar);
        return null;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        x xVar = (x) obj;
        xVar.getClass();
        return this.A.compareTo(xVar.A);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [fj.e, java.lang.Object] */
    public final x d(String str) {
        str.getClass();
        ?? obj = new Object();
        obj.k0(str);
        return gj.c.b(this, gj.c.d(obj, false), false);
    }

    public final Character e() {
        h hVar = gj.c.f5684a;
        h hVar2 = this.A;
        if (h.g(hVar2, hVar) == -1 && hVar2.d() >= 2 && hVar2.i(1) == 58) {
            char i2 = (char) hVar2.i(0);
            if (('a' <= i2 && i2 < '{') || ('A' <= i2 && i2 < '[')) {
                return Character.valueOf(i2);
            }
            return null;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof x) && nc.k.a(((x) obj).A, this.A)) {
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
