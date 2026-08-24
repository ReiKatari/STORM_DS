package defpackage;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Comparator;
import java.util.Set;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: aw3  reason: default package */
/* loaded from: classes.dex */
public final class aw3 extends AbstractMap implements Serializable {
    public static final zh2 e0 = new zh2(20);
    public final boolean B;
    public zv3 L;
    public final zv3 Y;
    public yv3 Z;
    public yv3 d0;
    public int R = 0;
    public int X = 0;
    public final Comparator A = e0;

    public aw3(boolean z) {
        this.B = z;
        this.Y = new zv3(z);
    }

    public final zv3 a(boolean z, Object obj) {
        int i;
        zv3 zv3Var;
        Comparable comparable;
        zv3 zv3Var2;
        zv3 zv3Var3 = this.L;
        zh2 zh2Var = e0;
        Comparator comparator = this.A;
        if (zv3Var3 != null) {
            if (comparator == zh2Var) {
                comparable = (Comparable) obj;
            } else {
                comparable = null;
            }
            while (true) {
                Object obj2 = zv3Var3.Y;
                if (comparable != null) {
                    i = comparable.compareTo(obj2);
                } else {
                    i = comparator.compare(obj, obj2);
                }
                if (i == 0) {
                    return zv3Var3;
                }
                if (i < 0) {
                    zv3Var2 = zv3Var3.B;
                } else {
                    zv3Var2 = zv3Var3.L;
                }
                if (zv3Var2 == null) {
                    break;
                }
                zv3Var3 = zv3Var2;
            }
        } else {
            i = 0;
        }
        zv3 zv3Var4 = zv3Var3;
        if (!z) {
            return null;
        }
        zv3 zv3Var5 = this.Y;
        if (zv3Var4 == null) {
            if (comparator == zh2Var && !(obj instanceof Comparable)) {
                throw new ClassCastException(obj.getClass().getName().concat(" is not Comparable"));
            }
            zv3Var = new zv3(this.B, zv3Var4, obj, zv3Var5, zv3Var5.X);
            this.L = zv3Var;
        } else {
            zv3Var = new zv3(this.B, zv3Var4, obj, zv3Var5, zv3Var5.X);
            if (i < 0) {
                zv3Var4.B = zv3Var;
            } else {
                zv3Var4.L = zv3Var;
            }
            b(zv3Var4, true);
        }
        this.R++;
        this.X++;
        return zv3Var;
    }

    public final void b(zv3 zv3Var, boolean z) {
        int i;
        int i2;
        int i3;
        int i4;
        while (zv3Var != null) {
            zv3 zv3Var2 = zv3Var.B;
            zv3 zv3Var3 = zv3Var.L;
            int i5 = 0;
            if (zv3Var2 != null) {
                i = zv3Var2.e0;
            } else {
                i = 0;
            }
            if (zv3Var3 != null) {
                i2 = zv3Var3.e0;
            } else {
                i2 = 0;
            }
            int i6 = i - i2;
            if (i6 == -2) {
                zv3 zv3Var4 = zv3Var3.B;
                zv3 zv3Var5 = zv3Var3.L;
                if (zv3Var5 != null) {
                    i4 = zv3Var5.e0;
                } else {
                    i4 = 0;
                }
                if (zv3Var4 != null) {
                    i5 = zv3Var4.e0;
                }
                int i7 = i5 - i4;
                if (i7 != -1 && (i7 != 0 || z)) {
                    f(zv3Var3);
                    e(zv3Var);
                } else {
                    e(zv3Var);
                }
                if (z) {
                    return;
                }
            } else if (i6 == 2) {
                zv3 zv3Var6 = zv3Var2.B;
                zv3 zv3Var7 = zv3Var2.L;
                if (zv3Var7 != null) {
                    i3 = zv3Var7.e0;
                } else {
                    i3 = 0;
                }
                if (zv3Var6 != null) {
                    i5 = zv3Var6.e0;
                }
                int i8 = i5 - i3;
                if (i8 != 1 && (i8 != 0 || z)) {
                    e(zv3Var2);
                    f(zv3Var);
                } else {
                    f(zv3Var);
                }
                if (z) {
                    return;
                }
            } else if (i6 == 0) {
                zv3Var.e0 = i + 1;
                if (z) {
                    return;
                }
            } else {
                zv3Var.e0 = Math.max(i, i2) + 1;
                if (!z) {
                    return;
                }
            }
            zv3Var = zv3Var.A;
        }
    }

    public final void c(zv3 zv3Var, boolean z) {
        zv3 zv3Var2;
        zv3 zv3Var3;
        int i;
        if (z) {
            zv3 zv3Var4 = zv3Var.X;
            zv3Var4.R = zv3Var.R;
            zv3Var.R.X = zv3Var4;
        }
        zv3 zv3Var5 = zv3Var.B;
        zv3 zv3Var6 = zv3Var.L;
        zv3 zv3Var7 = zv3Var.A;
        int i2 = 0;
        if (zv3Var5 != null && zv3Var6 != null) {
            if (zv3Var5.e0 > zv3Var6.e0) {
                zv3 zv3Var8 = zv3Var5.L;
                while (true) {
                    zv3 zv3Var9 = zv3Var8;
                    zv3Var3 = zv3Var5;
                    zv3Var5 = zv3Var9;
                    if (zv3Var5 == null) {
                        break;
                    }
                    zv3Var8 = zv3Var5.L;
                }
            } else {
                zv3 zv3Var10 = zv3Var6.B;
                while (true) {
                    zv3Var2 = zv3Var6;
                    zv3Var6 = zv3Var10;
                    if (zv3Var6 == null) {
                        break;
                    }
                    zv3Var10 = zv3Var6.B;
                }
                zv3Var3 = zv3Var2;
            }
            c(zv3Var3, false);
            zv3 zv3Var11 = zv3Var.B;
            if (zv3Var11 != null) {
                i = zv3Var11.e0;
                zv3Var3.B = zv3Var11;
                zv3Var11.A = zv3Var3;
                zv3Var.B = null;
            } else {
                i = 0;
            }
            zv3 zv3Var12 = zv3Var.L;
            if (zv3Var12 != null) {
                i2 = zv3Var12.e0;
                zv3Var3.L = zv3Var12;
                zv3Var12.A = zv3Var3;
                zv3Var.L = null;
            }
            zv3Var3.e0 = Math.max(i, i2) + 1;
            d(zv3Var, zv3Var3);
            return;
        }
        if (zv3Var5 != null) {
            d(zv3Var, zv3Var5);
            zv3Var.B = null;
        } else if (zv3Var6 != null) {
            d(zv3Var, zv3Var6);
            zv3Var.L = null;
        } else {
            d(zv3Var, null);
        }
        b(zv3Var7, false);
        this.R--;
        this.X++;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.L = null;
        this.R = 0;
        this.X++;
        zv3 zv3Var = this.Y;
        zv3Var.X = zv3Var;
        zv3Var.R = zv3Var;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        zv3 zv3Var = null;
        if (obj != null) {
            try {
                zv3Var = a(false, obj);
            } catch (ClassCastException unused) {
            }
        }
        if (zv3Var == null) {
            return false;
        }
        return true;
    }

    public final void d(zv3 zv3Var, zv3 zv3Var2) {
        zv3 zv3Var3 = zv3Var.A;
        zv3Var.A = null;
        if (zv3Var2 != null) {
            zv3Var2.A = zv3Var3;
        }
        if (zv3Var3 != null) {
            if (zv3Var3.B == zv3Var) {
                zv3Var3.B = zv3Var2;
                return;
            } else {
                zv3Var3.L = zv3Var2;
                return;
            }
        }
        this.L = zv3Var2;
    }

    public final void e(zv3 zv3Var) {
        int i;
        int i2;
        zv3 zv3Var2 = zv3Var.B;
        zv3 zv3Var3 = zv3Var.L;
        zv3 zv3Var4 = zv3Var3.B;
        zv3 zv3Var5 = zv3Var3.L;
        zv3Var.L = zv3Var4;
        if (zv3Var4 != null) {
            zv3Var4.A = zv3Var;
        }
        d(zv3Var, zv3Var3);
        zv3Var3.B = zv3Var;
        zv3Var.A = zv3Var3;
        int i3 = 0;
        if (zv3Var2 != null) {
            i = zv3Var2.e0;
        } else {
            i = 0;
        }
        if (zv3Var4 != null) {
            i2 = zv3Var4.e0;
        } else {
            i2 = 0;
        }
        int max = Math.max(i, i2) + 1;
        zv3Var.e0 = max;
        if (zv3Var5 != null) {
            i3 = zv3Var5.e0;
        }
        zv3Var3.e0 = Math.max(max, i3) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        yv3 yv3Var = this.Z;
        if (yv3Var == null) {
            yv3 yv3Var2 = new yv3(0, this);
            this.Z = yv3Var2;
            return yv3Var2;
        }
        return yv3Var;
    }

    public final void f(zv3 zv3Var) {
        int i;
        int i2;
        zv3 zv3Var2 = zv3Var.B;
        zv3 zv3Var3 = zv3Var.L;
        zv3 zv3Var4 = zv3Var2.B;
        zv3 zv3Var5 = zv3Var2.L;
        zv3Var.B = zv3Var5;
        if (zv3Var5 != null) {
            zv3Var5.A = zv3Var;
        }
        d(zv3Var, zv3Var2);
        zv3Var2.L = zv3Var;
        zv3Var.A = zv3Var2;
        int i3 = 0;
        if (zv3Var3 != null) {
            i = zv3Var3.e0;
        } else {
            i = 0;
        }
        if (zv3Var5 != null) {
            i2 = zv3Var5.e0;
        } else {
            i2 = 0;
        }
        int max = Math.max(i, i2) + 1;
        zv3Var.e0 = max;
        if (zv3Var4 != null) {
            i3 = zv3Var4.e0;
        }
        zv3Var2.e0 = Math.max(max, i3) + 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x000f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x000c  */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object get(Object obj) {
        zv3 zv3Var;
        if (obj != null) {
            try {
                zv3Var = a(false, obj);
            } catch (ClassCastException unused) {
            }
            if (zv3Var != null) {
                return null;
            }
            return zv3Var.d0;
        }
        zv3Var = null;
        if (zv3Var != null) {
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        yv3 yv3Var = this.d0;
        if (yv3Var == null) {
            yv3 yv3Var2 = new yv3(1, this);
            this.d0 = yv3Var2;
            return yv3Var2;
        }
        return yv3Var;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        if (obj != null) {
            if (obj2 == null && !this.B) {
                u34.x("value == null");
                return null;
            }
            zv3 a = a(true, obj);
            Object obj3 = a.d0;
            a.d0 = obj2;
            return obj3;
        }
        u34.x("key == null");
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0012  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0015 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x000c  */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object remove(Object obj) {
        zv3 zv3Var;
        if (obj != null) {
            try {
                zv3Var = a(false, obj);
            } catch (ClassCastException unused) {
            }
            if (zv3Var != null) {
                c(zv3Var, true);
            }
            if (zv3Var != null) {
                return null;
            }
            return zv3Var.d0;
        }
        zv3Var = null;
        if (zv3Var != null) {
        }
        if (zv3Var != null) {
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.R;
    }
}
