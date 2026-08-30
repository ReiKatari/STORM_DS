package defpackage;

import java.util.Arrays;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: r27  reason: default package */
/* loaded from: classes.dex */
public final class r27 {
    public static final r27 f = new r27(0, new int[0], new Object[0], false);
    public int a;
    public int[] b;
    public Object[] c;
    public int d = -1;
    public boolean e;

    public r27(int i, int[] iArr, Object[] objArr, boolean z) {
        this.a = i;
        this.b = iArr;
        this.c = objArr;
        this.e = z;
    }

    public static r27 b() {
        return new r27(0, new int[8], new Object[8], true);
    }

    public final int a() {
        int h;
        int j;
        int d;
        int i = this.d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.a; i3++) {
            int i4 = this.b[i3];
            int i5 = i4 >>> 3;
            int i6 = i4 & 7;
            if (i6 != 0) {
                if (i6 != 1) {
                    if (i6 != 2) {
                        if (i6 != 3) {
                            if (i6 == 5) {
                                ((Integer) this.c[i3]).getClass();
                                d = zp0.c(i5);
                            } else {
                                throw new IllegalStateException(i53.b());
                            }
                        } else {
                            h = zp0.h(i5) * 2;
                            j = ((r27) this.c[i3]).a();
                        }
                    } else {
                        d = zp0.a(i5, (x70) this.c[i3]);
                    }
                } else {
                    ((Long) this.c[i3]).getClass();
                    d = zp0.d(i5);
                }
                i2 = d + i2;
            } else {
                long longValue = ((Long) this.c[i3]).longValue();
                h = zp0.h(i5);
                j = zp0.j(longValue);
            }
            i2 = j + h + i2;
        }
        this.d = i2;
        return i2;
    }

    public final void c(int i, Object obj) {
        int i2;
        if (this.e) {
            int i3 = this.a;
            int[] iArr = this.b;
            if (i3 == iArr.length) {
                if (i3 < 4) {
                    i2 = 8;
                } else {
                    i2 = i3 >> 1;
                }
                int i4 = i3 + i2;
                this.b = Arrays.copyOf(iArr, i4);
                this.c = Arrays.copyOf(this.c, i4);
            }
            int[] iArr2 = this.b;
            int i5 = this.a;
            iArr2[i5] = i;
            this.c[i5] = obj;
            this.a = i5 + 1;
            return;
        }
        throw new UnsupportedOperationException();
    }

    public final void d(bq0 bq0Var) {
        if (this.a != 0) {
            bq0Var.getClass();
            gj7 gj7Var = gj7.ASCENDING;
            for (int i = 0; i < this.a; i++) {
                int i2 = this.b[i];
                Object obj = this.c[i];
                int i3 = i2 >>> 3;
                int i4 = i2 & 7;
                if (i4 != 0) {
                    if (i4 != 1) {
                        if (i4 != 2) {
                            if (i4 != 3) {
                                if (i4 == 5) {
                                    bq0Var.j0(i3, ((Integer) obj).intValue());
                                } else {
                                    throw new RuntimeException(i53.b());
                                }
                            } else {
                                zp0 zp0Var = (zp0) bq0Var.B;
                                gj7 gj7Var2 = gj7.ASCENDING;
                                zp0Var.r(i3, 3);
                                ((r27) obj).d(bq0Var);
                                zp0Var.r(i3, 4);
                            }
                        } else {
                            bq0Var.g0(i3, (x70) obj);
                        }
                    } else {
                        bq0Var.k0(i3, ((Long) obj).longValue());
                    }
                } else {
                    bq0Var.o0(i3, ((Long) obj).longValue());
                }
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof r27)) {
            return false;
        }
        r27 r27Var = (r27) obj;
        int i = this.a;
        if (i == r27Var.a) {
            int[] iArr = this.b;
            int[] iArr2 = r27Var.b;
            int i2 = 0;
            while (true) {
                if (i2 < i) {
                    if (iArr[i2] != iArr2[i2]) {
                        break;
                    }
                    i2++;
                } else {
                    Object[] objArr = this.c;
                    Object[] objArr2 = r27Var.c;
                    int i3 = this.a;
                    for (int i4 = 0; i4 < i3; i4++) {
                        if (objArr[i4].equals(objArr2[i4])) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.a;
        int i2 = (527 + i) * 31;
        int[] iArr = this.b;
        int i3 = 17;
        int i4 = 17;
        for (int i5 = 0; i5 < i; i5++) {
            i4 = (i4 * 31) + iArr[i5];
        }
        int i6 = (i2 + i4) * 31;
        Object[] objArr = this.c;
        int i7 = this.a;
        for (int i8 = 0; i8 < i7; i8++) {
            i3 = (i3 * 31) + objArr[i8].hashCode();
        }
        return i6 + i3;
    }
}
