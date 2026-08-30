package defpackage;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Comparator;
import java.util.Set;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: yo3  reason: default package */
/* loaded from: classes.dex */
public final class yo3 extends AbstractMap implements Serializable {
    public static final hd2 d0 = new hd2(19);
    public final boolean B;
    public xo3 L;
    public final xo3 Y;
    public wo3 Z;
    public wo3 c0;
    public int R = 0;
    public int X = 0;
    public final Comparator A = d0;

    public yo3(boolean z) {
        this.B = z;
        this.Y = new xo3(z);
    }

    public final xo3 a(boolean z, Object obj) {
        int i;
        xo3 xo3Var;
        Comparable comparable;
        xo3 xo3Var2;
        xo3 xo3Var3 = this.L;
        hd2 hd2Var = d0;
        Comparator comparator = this.A;
        if (xo3Var3 != null) {
            if (comparator == hd2Var) {
                comparable = (Comparable) obj;
            } else {
                comparable = null;
            }
            while (true) {
                Object obj2 = xo3Var3.Y;
                if (comparable != null) {
                    i = comparable.compareTo(obj2);
                } else {
                    i = comparator.compare(obj, obj2);
                }
                if (i == 0) {
                    return xo3Var3;
                }
                if (i < 0) {
                    xo3Var2 = xo3Var3.B;
                } else {
                    xo3Var2 = xo3Var3.L;
                }
                if (xo3Var2 == null) {
                    break;
                }
                xo3Var3 = xo3Var2;
            }
        } else {
            i = 0;
        }
        xo3 xo3Var4 = xo3Var3;
        if (!z) {
            return null;
        }
        xo3 xo3Var5 = this.Y;
        if (xo3Var4 == null) {
            if (comparator == hd2Var && !(obj instanceof Comparable)) {
                throw new ClassCastException(obj.getClass().getName().concat(" is not Comparable"));
            }
            xo3Var = new xo3(this.B, xo3Var4, obj, xo3Var5, xo3Var5.X);
            this.L = xo3Var;
        } else {
            xo3Var = new xo3(this.B, xo3Var4, obj, xo3Var5, xo3Var5.X);
            if (i < 0) {
                xo3Var4.B = xo3Var;
            } else {
                xo3Var4.L = xo3Var;
            }
            b(xo3Var4, true);
        }
        this.R++;
        this.X++;
        return xo3Var;
    }

    public final void b(xo3 xo3Var, boolean z) {
        int i;
        int i2;
        int i3;
        int i4;
        while (xo3Var != null) {
            xo3 xo3Var2 = xo3Var.B;
            xo3 xo3Var3 = xo3Var.L;
            int i5 = 0;
            if (xo3Var2 != null) {
                i = xo3Var2.d0;
            } else {
                i = 0;
            }
            if (xo3Var3 != null) {
                i2 = xo3Var3.d0;
            } else {
                i2 = 0;
            }
            int i6 = i - i2;
            if (i6 == -2) {
                xo3 xo3Var4 = xo3Var3.B;
                xo3 xo3Var5 = xo3Var3.L;
                if (xo3Var5 != null) {
                    i4 = xo3Var5.d0;
                } else {
                    i4 = 0;
                }
                if (xo3Var4 != null) {
                    i5 = xo3Var4.d0;
                }
                int i7 = i5 - i4;
                if (i7 != -1 && (i7 != 0 || z)) {
                    f(xo3Var3);
                    e(xo3Var);
                } else {
                    e(xo3Var);
                }
                if (z) {
                    return;
                }
            } else if (i6 == 2) {
                xo3 xo3Var6 = xo3Var2.B;
                xo3 xo3Var7 = xo3Var2.L;
                if (xo3Var7 != null) {
                    i3 = xo3Var7.d0;
                } else {
                    i3 = 0;
                }
                if (xo3Var6 != null) {
                    i5 = xo3Var6.d0;
                }
                int i8 = i5 - i3;
                if (i8 != 1 && (i8 != 0 || z)) {
                    e(xo3Var2);
                    f(xo3Var);
                } else {
                    f(xo3Var);
                }
                if (z) {
                    return;
                }
            } else if (i6 == 0) {
                xo3Var.d0 = i + 1;
                if (z) {
                    return;
                }
            } else {
                xo3Var.d0 = Math.max(i, i2) + 1;
                if (!z) {
                    return;
                }
            }
            xo3Var = xo3Var.A;
        }
    }

    public final void c(xo3 xo3Var, boolean z) {
        xo3 xo3Var2;
        xo3 xo3Var3;
        int i;
        if (z) {
            xo3 xo3Var4 = xo3Var.X;
            xo3Var4.R = xo3Var.R;
            xo3Var.R.X = xo3Var4;
        }
        xo3 xo3Var5 = xo3Var.B;
        xo3 xo3Var6 = xo3Var.L;
        xo3 xo3Var7 = xo3Var.A;
        int i2 = 0;
        if (xo3Var5 != null && xo3Var6 != null) {
            if (xo3Var5.d0 > xo3Var6.d0) {
                xo3 xo3Var8 = xo3Var5.L;
                while (true) {
                    xo3 xo3Var9 = xo3Var8;
                    xo3Var3 = xo3Var5;
                    xo3Var5 = xo3Var9;
                    if (xo3Var5 == null) {
                        break;
                    }
                    xo3Var8 = xo3Var5.L;
                }
            } else {
                xo3 xo3Var10 = xo3Var6.B;
                while (true) {
                    xo3Var2 = xo3Var6;
                    xo3Var6 = xo3Var10;
                    if (xo3Var6 == null) {
                        break;
                    }
                    xo3Var10 = xo3Var6.B;
                }
                xo3Var3 = xo3Var2;
            }
            c(xo3Var3, false);
            xo3 xo3Var11 = xo3Var.B;
            if (xo3Var11 != null) {
                i = xo3Var11.d0;
                xo3Var3.B = xo3Var11;
                xo3Var11.A = xo3Var3;
                xo3Var.B = null;
            } else {
                i = 0;
            }
            xo3 xo3Var12 = xo3Var.L;
            if (xo3Var12 != null) {
                i2 = xo3Var12.d0;
                xo3Var3.L = xo3Var12;
                xo3Var12.A = xo3Var3;
                xo3Var.L = null;
            }
            xo3Var3.d0 = Math.max(i, i2) + 1;
            d(xo3Var, xo3Var3);
            return;
        }
        if (xo3Var5 != null) {
            d(xo3Var, xo3Var5);
            xo3Var.B = null;
        } else if (xo3Var6 != null) {
            d(xo3Var, xo3Var6);
            xo3Var.L = null;
        } else {
            d(xo3Var, null);
        }
        b(xo3Var7, false);
        this.R--;
        this.X++;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.L = null;
        this.R = 0;
        this.X++;
        xo3 xo3Var = this.Y;
        xo3Var.X = xo3Var;
        xo3Var.R = xo3Var;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        xo3 xo3Var = null;
        if (obj != null) {
            try {
                xo3Var = a(false, obj);
            } catch (ClassCastException unused) {
            }
        }
        if (xo3Var == null) {
            return false;
        }
        return true;
    }

    public final void d(xo3 xo3Var, xo3 xo3Var2) {
        xo3 xo3Var3 = xo3Var.A;
        xo3Var.A = null;
        if (xo3Var2 != null) {
            xo3Var2.A = xo3Var3;
        }
        if (xo3Var3 != null) {
            if (xo3Var3.B == xo3Var) {
                xo3Var3.B = xo3Var2;
                return;
            } else {
                xo3Var3.L = xo3Var2;
                return;
            }
        }
        this.L = xo3Var2;
    }

    public final void e(xo3 xo3Var) {
        int i;
        int i2;
        xo3 xo3Var2 = xo3Var.B;
        xo3 xo3Var3 = xo3Var.L;
        xo3 xo3Var4 = xo3Var3.B;
        xo3 xo3Var5 = xo3Var3.L;
        xo3Var.L = xo3Var4;
        if (xo3Var4 != null) {
            xo3Var4.A = xo3Var;
        }
        d(xo3Var, xo3Var3);
        xo3Var3.B = xo3Var;
        xo3Var.A = xo3Var3;
        int i3 = 0;
        if (xo3Var2 != null) {
            i = xo3Var2.d0;
        } else {
            i = 0;
        }
        if (xo3Var4 != null) {
            i2 = xo3Var4.d0;
        } else {
            i2 = 0;
        }
        int max = Math.max(i, i2) + 1;
        xo3Var.d0 = max;
        if (xo3Var5 != null) {
            i3 = xo3Var5.d0;
        }
        xo3Var3.d0 = Math.max(max, i3) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        wo3 wo3Var = this.Z;
        if (wo3Var == null) {
            wo3 wo3Var2 = new wo3(0, this);
            this.Z = wo3Var2;
            return wo3Var2;
        }
        return wo3Var;
    }

    public final void f(xo3 xo3Var) {
        int i;
        int i2;
        xo3 xo3Var2 = xo3Var.B;
        xo3 xo3Var3 = xo3Var.L;
        xo3 xo3Var4 = xo3Var2.B;
        xo3 xo3Var5 = xo3Var2.L;
        xo3Var.B = xo3Var5;
        if (xo3Var5 != null) {
            xo3Var5.A = xo3Var;
        }
        d(xo3Var, xo3Var2);
        xo3Var2.L = xo3Var;
        xo3Var.A = xo3Var2;
        int i3 = 0;
        if (xo3Var3 != null) {
            i = xo3Var3.d0;
        } else {
            i = 0;
        }
        if (xo3Var5 != null) {
            i2 = xo3Var5.d0;
        } else {
            i2 = 0;
        }
        int max = Math.max(i, i2) + 1;
        xo3Var.d0 = max;
        if (xo3Var4 != null) {
            i3 = xo3Var4.d0;
        }
        xo3Var2.d0 = Math.max(max, i3) + 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x000f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x000c  */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object get(java.lang.Object r3) {
        /*
            r2 = this;
            r0 = 0
            if (r3 == 0) goto L9
            r1 = 0
            xo3 r2 = r2.a(r1, r3)     // Catch: java.lang.ClassCastException -> L9
            goto La
        L9:
            r2 = r0
        La:
            if (r2 == 0) goto Lf
            java.lang.Object r2 = r2.c0
            return r2
        Lf:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yo3.get(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        wo3 wo3Var = this.c0;
        if (wo3Var == null) {
            wo3 wo3Var2 = new wo3(1, this);
            this.c0 = wo3Var2;
            return wo3Var2;
        }
        return wo3Var;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        if (obj != null) {
            if (obj2 == null && !this.B) {
                c44.i("value == null");
                return null;
            }
            xo3 a = a(true, obj);
            Object obj3 = a.c0;
            a.c0 = obj2;
            return obj3;
        }
        c44.i("key == null");
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0012  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0015 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x000c  */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object remove(java.lang.Object r3) {
        /*
            r2 = this;
            r0 = 0
            if (r3 == 0) goto L9
            r1 = 0
            xo3 r3 = r2.a(r1, r3)     // Catch: java.lang.ClassCastException -> L9
            goto La
        L9:
            r3 = r0
        La:
            if (r3 == 0) goto L10
            r1 = 1
            r2.c(r3, r1)
        L10:
            if (r3 == 0) goto L15
            java.lang.Object r2 = r3.c0
            return r2
        L15:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yo3.remove(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.R;
    }
}
