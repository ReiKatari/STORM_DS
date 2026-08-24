package defpackage;

import java.util.Iterator;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ta6  reason: default package */
/* loaded from: classes.dex */
public final class ta6 implements gb6, Iterable, zf3 {
    public final ja4 A;
    public b14 B;
    public boolean L;
    public boolean R;

    public ta6() {
        long[] jArr = b66.a;
        this.A = new ja4();
    }

    @Override // defpackage.gb6
    public final void a(fb6 fb6Var, Object obj) {
        boolean z = obj instanceof y1;
        ja4 ja4Var = this.A;
        if (z && ja4Var.c(fb6Var)) {
            Object g = ja4Var.g(fb6Var);
            g.getClass();
            y1 y1Var = (y1) g;
            y1 y1Var2 = (y1) obj;
            String str = y1Var2.a;
            if (str == null) {
                str = y1Var.a;
            }
            ao2 ao2Var = y1Var2.b;
            if (ao2Var == null) {
                ao2Var = y1Var.b;
            }
            ja4Var.m(fb6Var, new y1(str, ao2Var));
        } else {
            ja4Var.m(fb6Var, obj);
        }
        fb6Var.getClass();
    }

    public final ta6 b() {
        ta6 ta6Var = new ta6();
        ta6Var.L = this.L;
        ta6Var.R = this.R;
        ja4 ja4Var = ta6Var.A;
        ja4Var.getClass();
        ja4 ja4Var2 = this.A;
        ja4Var2.getClass();
        Object[] objArr = ja4Var2.b;
        Object[] objArr2 = ja4Var2.c;
        long[] jArr = ja4Var2.a;
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
                            ja4Var.m(objArr[i4], objArr2[i4]);
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
        return ta6Var;
    }

    public final Object c(fb6 fb6Var) {
        Object g = this.A.g(fb6Var);
        if (g != null) {
            return g;
        }
        e41.o(fb6Var, " - consider getOrElse or getOrNull", "Key not present: ");
        return null;
    }

    public final void d(ta6 ta6Var) {
        ja4 ja4Var = ta6Var.A;
        Object[] objArr = ja4Var.b;
        Object[] objArr2 = ja4Var.c;
        long[] jArr = ja4Var.a;
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
                            fb6 fb6Var = (fb6) obj;
                            ja4 ja4Var2 = this.A;
                            Object g = ja4Var2.g(fb6Var);
                            fb6Var.getClass();
                            Object o = fb6Var.b.o(g, obj2);
                            if (o != null) {
                                ja4Var2.m(fb6Var, o);
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

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ta6) {
                ta6 ta6Var = (ta6) obj;
                if (!nb3.k(this.A, ta6Var.A) || this.L != ta6Var.L || this.R != ta6Var.R) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.R) + xg6.e(this.A.hashCode() * 31, this.L, 31);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        b14 b14Var = this.B;
        if (b14Var == null) {
            ja4 ja4Var = this.A;
            ja4Var.getClass();
            b14 b14Var2 = new b14(ja4Var);
            this.B = b14Var2;
            b14Var = b14Var2;
        }
        return ((q52) b14Var.entrySet()).iterator();
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
        ja4 ja4Var = this.A;
        Object[] objArr = ja4Var.b;
        Object[] objArr2 = ja4Var.c;
        long[] jArr = ja4Var.a;
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
                            sb.append(((fb6) obj).a);
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
        return ej2.U(this) + "{ " + ((Object) sb) + " }";
    }
}
