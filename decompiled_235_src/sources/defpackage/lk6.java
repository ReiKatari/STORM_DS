package defpackage;

import java.util.ArrayList;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: lk6  reason: default package */
/* loaded from: classes.dex */
public final class lk6 {
    public final mk6 a;
    public final int[] b;
    public final int c;
    public Object[] d;
    public final int e;
    public boolean f;
    public int g;
    public int h;
    public int i;
    public final r93 j;
    public int k;
    public int l;
    public int m;
    public boolean n;

    public lk6(mk6 mk6Var) {
        this.a = mk6Var;
        this.b = mk6Var.A;
        int i = mk6Var.B;
        this.c = i;
        this.d = mk6Var.L;
        this.e = mk6Var.R;
        this.h = i;
        this.i = -1;
        this.j = new r93();
    }

    public final sq2 a(int i) {
        ArrayList arrayList = this.a.e0;
        int e = ok6.e(arrayList, i, this.c);
        if (e < 0) {
            sq2 sq2Var = new sq2(i);
            arrayList.add(-(e + 1), sq2Var);
            return sq2Var;
        }
        return (sq2) arrayList.get(e);
    }

    public final Object b(int[] iArr, int i) {
        int bitCount;
        int i2 = i * 5;
        int i3 = iArr[i2 + 1];
        if ((268435456 & i3) != 0) {
            Object[] objArr = this.d;
            if (i2 >= iArr.length) {
                bitCount = iArr.length;
            } else {
                bitCount = iArr[i2 + 4] + Integer.bitCount(i3 >> 29);
            }
            return objArr[bitCount];
        }
        return ox0.a;
    }

    public final void c() {
        mk6 mk6Var;
        this.f = true;
        if (this.a.X <= 0) {
            tx0.a("Unexpected reader close()");
        }
        mk6Var.X--;
        this.d = new Object[0];
    }

    public final boolean d(int i) {
        if ((this.b[(i * 5) + 1] & 67108864) != 0) {
            return true;
        }
        return false;
    }

    public final void e() {
        int i;
        int i2;
        if (this.k == 0) {
            if (this.g != this.h) {
                tx0.a("endGroup() not called at the end of a group");
            }
            int[] iArr = this.b;
            int i3 = iArr[(this.i * 5) + 2];
            this.i = i3;
            int i4 = this.c;
            if (i3 < 0) {
                i = i4;
            } else {
                i = iArr[(i3 * 5) + 3] + i3;
            }
            this.h = i;
            int b = this.j.b();
            if (b < 0) {
                this.l = 0;
                this.m = 0;
                return;
            }
            this.l = b;
            if (i3 >= i4 - 1) {
                i2 = this.e;
            } else {
                i2 = iArr[((i3 + 1) * 5) + 4];
            }
            this.m = i2;
        }
    }

    public final Object f() {
        int i = this.g;
        if (i < this.h) {
            return b(this.b, i);
        }
        return 0;
    }

    public final int g() {
        int i = this.g;
        if (i < this.h) {
            return this.b[i * 5];
        }
        return 0;
    }

    public final Object h(int i, int i2) {
        int i3;
        int[] iArr = this.b;
        int b = ok6.b(iArr, i);
        int i4 = i + 1;
        if (i4 < this.c) {
            i3 = iArr[(i4 * 5) + 4];
        } else {
            i3 = this.e;
        }
        int i5 = b + i2;
        if (i5 < i3) {
            return this.d[i5];
        }
        return ox0.a;
    }

    public final int i(int i) {
        return this.b[i * 5];
    }

    public final boolean j(int i) {
        if ((this.b[(i * 5) + 1] & 134217728) != 0) {
            return true;
        }
        return false;
    }

    public final boolean k(int i) {
        if ((this.b[(i * 5) + 1] & 536870912) != 0) {
            return true;
        }
        return false;
    }

    public final boolean l(int i) {
        if ((this.b[(i * 5) + 1] & 1073741824) != 0) {
            return true;
        }
        return false;
    }

    public final Object m() {
        int i;
        if (this.k <= 0 && (i = this.l) < this.m) {
            this.n = true;
            Object[] objArr = this.d;
            this.l = i + 1;
            return objArr[i];
        }
        this.n = false;
        return ox0.a;
    }

    public final Object n(int i) {
        int i2 = i * 5;
        int[] iArr = this.b;
        int i3 = iArr[i2 + 1] & 1073741824;
        if (i3 != 0) {
            if (i3 != 0) {
                return this.d[iArr[i2 + 4]];
            }
            return ox0.a;
        }
        return null;
    }

    public final int o(int i) {
        return this.b[(i * 5) + 1] & 67108863;
    }

    public final Object p(int[] iArr, int i) {
        int i2 = i * 5;
        int i3 = iArr[i2 + 1];
        if ((536870912 & i3) != 0) {
            return this.d[Integer.bitCount(i3 >> 30) + iArr[i2 + 4]];
        }
        return null;
    }

    public final int q(int i) {
        return this.b[(i * 5) + 2];
    }

    public final void r(int i) {
        int i2;
        if (this.k != 0) {
            tx0.a("Cannot reposition while in an empty region");
        }
        this.g = i;
        int[] iArr = this.b;
        int i3 = this.c;
        if (i < i3) {
            i2 = iArr[(i * 5) + 2];
        } else {
            i2 = -1;
        }
        if (i2 != this.i) {
            this.i = i2;
            if (i2 < 0) {
                this.h = i3;
            } else {
                this.h = iArr[(i2 * 5) + 3] + i2;
            }
            this.l = 0;
            this.m = 0;
        }
    }

    public final int s() {
        int i;
        if (this.k != 0) {
            tx0.a("Cannot skip while in an empty region");
        }
        int i2 = this.g;
        int i3 = i2 * 5;
        int[] iArr = this.b;
        int i4 = iArr[i3 + 1];
        if ((1073741824 & i4) != 0) {
            i = 1;
        } else {
            i = i4 & 67108863;
        }
        this.g = iArr[i3 + 3] + i2;
        return i;
    }

    public final void t() {
        boolean z;
        if (this.k == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            tx0.a("Cannot skip the enclosing group while in an empty region");
        }
        this.g = this.h;
        this.l = 0;
        this.m = 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SlotReader(current=");
        sb.append(this.g);
        sb.append(", key=");
        sb.append(g());
        sb.append(", parent=");
        sb.append(this.i);
        sb.append(", end=");
        return xg6.q(sb, this.h, ')');
    }

    public final void u() {
        int i;
        if (this.k <= 0) {
            int i2 = this.i;
            int i3 = this.g;
            int i4 = i3 * 5;
            int[] iArr = this.b;
            if (iArr[i4 + 2] != i2) {
                r05.a("Invalid slot table detected");
            }
            int i5 = this.l;
            int i6 = this.m;
            r93 r93Var = this.j;
            if (i5 == 0 && i6 == 0) {
                r93Var.c(-1);
            } else {
                r93Var.c(i5);
            }
            this.i = i3;
            this.h = iArr[i4 + 3] + i3;
            int i7 = i3 + 1;
            this.g = i7;
            this.l = ok6.b(iArr, i3);
            if (i3 >= this.c - 1) {
                i = this.e;
            } else {
                i = iArr[(i7 * 5) + 4];
            }
            this.m = i;
        }
    }
}
