package defpackage;

import java.util.Iterator;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ez5  reason: default package */
/* loaded from: classes.dex */
public final class ez5 implements rz5, Iterable, f93 {
    public final d24 A;
    public yt3 B;
    public boolean L;
    public boolean R;

    public ez5() {
        long[] jArr = wu5.a;
        this.A = new d24();
    }

    @Override // defpackage.rz5
    public final void b(qz5 qz5Var, Object obj) {
        boolean z = obj instanceof w1;
        d24 d24Var = this.A;
        if (z && d24Var.c(qz5Var)) {
            Object g = d24Var.g(qz5Var);
            g.getClass();
            w1 w1Var = (w1) g;
            w1 w1Var2 = (w1) obj;
            String str = w1Var2.a;
            if (str == null) {
                str = w1Var.a;
            }
            wi2 wi2Var = w1Var2.b;
            if (wi2Var == null) {
                wi2Var = w1Var.b;
            }
            d24Var.m(qz5Var, new w1(str, wi2Var));
        } else {
            d24Var.m(qz5Var, obj);
        }
        qz5Var.getClass();
    }

    public final ez5 c() {
        ez5 ez5Var = new ez5();
        ez5Var.L = this.L;
        ez5Var.R = this.R;
        d24 d24Var = ez5Var.A;
        d24Var.getClass();
        d24 d24Var2 = this.A;
        d24Var2.getClass();
        Object[] objArr = d24Var2.b;
        Object[] objArr2 = d24Var2.c;
        long[] jArr = d24Var2.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            d24Var.m(objArr[i4], objArr2[i4]);
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        return ez5Var;
    }

    public final Object d(qz5 qz5Var) {
        Object g = this.A.g(qz5Var);
        if (g != null) {
            return g;
        }
        f81.h(qz5Var, " - consider getOrElse or getOrNull", "Key not present: ");
        return null;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ez5) {
                ez5 ez5Var = (ez5) obj;
                if (!b53.x(this.A, ez5Var.A) || this.L != ez5Var.L || this.R != ez5Var.R) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.R) + ej6.c(this.A.hashCode() * 31, this.L, 31);
    }

    public final void i(ez5 ez5Var) {
        d24 d24Var = ez5Var.A;
        Object[] objArr = d24Var.b;
        Object[] objArr2 = d24Var.c;
        long[] jArr = d24Var.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            Object obj = objArr[i4];
                            Object obj2 = objArr2[i4];
                            qz5 qz5Var = (qz5) obj;
                            d24 d24Var2 = this.A;
                            Object g = d24Var2.g(qz5Var);
                            qz5Var.getClass();
                            Object j2 = qz5Var.b.j(g, obj2);
                            if (j2 != null) {
                                d24Var2.m(qz5Var, j2);
                            }
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        return;
                    }
                }
                if (i != length) {
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        yt3 yt3Var = this.B;
        if (yt3Var == null) {
            d24 d24Var = this.A;
            d24Var.getClass();
            yt3 yt3Var2 = new yt3(d24Var);
            this.B = yt3Var2;
            yt3Var = yt3Var2;
        }
        return ((b12) yt3Var.entrySet()).iterator();
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        if (this.L) {
            sb.append("mergeDescendants=true");
            str = ", ";
        } else {
            str = "";
        }
        if (this.R) {
            sb.append(str);
            sb.append("isClearingSemantics=true");
            str = ", ";
        }
        d24 d24Var = this.A;
        Object[] objArr = d24Var.b;
        Object[] objArr2 = d24Var.c;
        long[] jArr = d24Var.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            Object obj = objArr[i4];
                            Object obj2 = objArr2[i4];
                            sb.append(str);
                            sb.append(((qz5) obj).a);
                            sb.append(" : ");
                            sb.append(obj2);
                            str = ", ";
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        return me2.T(this) + "{ " + ((Object) sb) + " }";
    }
}
