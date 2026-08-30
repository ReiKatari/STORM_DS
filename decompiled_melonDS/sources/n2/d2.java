package n2;

import java.util.ArrayList;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class d2 {

    /* renamed from: a  reason: collision with root package name */
    public final e2 f9886a;

    /* renamed from: b  reason: collision with root package name */
    public final int[] f9887b;

    /* renamed from: c  reason: collision with root package name */
    public final int f9888c;

    /* renamed from: d  reason: collision with root package name */
    public Object[] f9889d;

    /* renamed from: e  reason: collision with root package name */
    public final int f9890e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f9891f;

    /* renamed from: g  reason: collision with root package name */
    public int f9892g;

    /* renamed from: h  reason: collision with root package name */
    public int f9893h;

    /* renamed from: i  reason: collision with root package name */
    public int f9894i;

    /* renamed from: j  reason: collision with root package name */
    public final a4.w f9895j;

    /* renamed from: k  reason: collision with root package name */
    public int f9896k;

    /* renamed from: l  reason: collision with root package name */
    public int f9897l;
    public int m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f9898n;

    public d2(e2 e2Var) {
        this.f9886a = e2Var;
        this.f9887b = e2Var.A;
        int i2 = e2Var.B;
        this.f9888c = i2;
        this.f9889d = e2Var.L;
        this.f9890e = e2Var.R;
        this.f9893h = i2;
        this.f9894i = -1;
        this.f9895j = new a4.w();
    }

    public final a a(int i2) {
        ArrayList arrayList = this.f9886a.f9900c0;
        int d4 = g2.d(arrayList, i2, this.f9888c);
        if (d4 < 0) {
            a aVar = new a(i2);
            arrayList.add(-(d4 + 1), aVar);
            return aVar;
        }
        return (a) arrayList.get(d4);
    }

    public final Object b(int[] iArr, int i2) {
        int bitCount;
        int i10 = i2 * 5;
        int i11 = iArr[i10 + 1];
        if ((268435456 & i11) != 0) {
            Object[] objArr = this.f9889d;
            if (i10 >= iArr.length) {
                bitCount = iArr.length;
            } else {
                bitCount = iArr[i10 + 4] + Integer.bitCount(i11 >> 29);
            }
            return objArr[bitCount];
        }
        return l.f9953a;
    }

    public final void c() {
        e2 e2Var;
        this.f9891f = true;
        if (this.f9886a.X <= 0) {
            t.a("Unexpected reader close()");
        }
        e2Var.X--;
        this.f9889d = new Object[0];
    }

    public final boolean d(int i2) {
        if ((this.f9887b[(i2 * 5) + 1] & 67108864) != 0) {
            return true;
        }
        return false;
    }

    public final void e() {
        int i2;
        int i10;
        if (this.f9896k == 0) {
            if (this.f9892g != this.f9893h) {
                t.a("endGroup() not called at the end of a group");
            }
            int[] iArr = this.f9887b;
            int i11 = iArr[(this.f9894i * 5) + 2];
            this.f9894i = i11;
            int i12 = this.f9888c;
            if (i11 < 0) {
                i2 = i12;
            } else {
                i2 = iArr[(i11 * 5) + 3] + i11;
            }
            this.f9893h = i2;
            int b10 = this.f9895j.b();
            if (b10 < 0) {
                this.f9897l = 0;
                this.m = 0;
                return;
            }
            this.f9897l = b10;
            if (i11 >= i12 - 1) {
                i10 = this.f9890e;
            } else {
                i10 = iArr[((i11 + 1) * 5) + 4];
            }
            this.m = i10;
        }
    }

    public final Object f() {
        int i2 = this.f9892g;
        if (i2 < this.f9893h) {
            return b(this.f9887b, i2);
        }
        return 0;
    }

    public final int g() {
        int i2 = this.f9892g;
        if (i2 < this.f9893h) {
            return this.f9887b[i2 * 5];
        }
        return 0;
    }

    public final Object h(int i2, int i10) {
        int i11;
        int[] iArr = this.f9887b;
        int b10 = g2.b(iArr, i2);
        int i12 = i2 + 1;
        if (i12 < this.f9888c) {
            i11 = iArr[(i12 * 5) + 4];
        } else {
            i11 = this.f9890e;
        }
        int i13 = b10 + i10;
        if (i13 < i11) {
            return this.f9889d[i13];
        }
        return l.f9953a;
    }

    public final int i(int i2) {
        return this.f9887b[i2 * 5];
    }

    public final boolean j(int i2) {
        if ((this.f9887b[(i2 * 5) + 1] & 134217728) != 0) {
            return true;
        }
        return false;
    }

    public final boolean k(int i2) {
        if ((this.f9887b[(i2 * 5) + 1] & 536870912) != 0) {
            return true;
        }
        return false;
    }

    public final boolean l(int i2) {
        if ((this.f9887b[(i2 * 5) + 1] & 1073741824) != 0) {
            return true;
        }
        return false;
    }

    public final Object m() {
        int i2;
        if (this.f9896k <= 0 && (i2 = this.f9897l) < this.m) {
            this.f9898n = true;
            Object[] objArr = this.f9889d;
            this.f9897l = i2 + 1;
            return objArr[i2];
        }
        this.f9898n = false;
        return l.f9953a;
    }

    public final Object n(int i2) {
        int i10 = i2 * 5;
        int[] iArr = this.f9887b;
        int i11 = iArr[i10 + 1] & 1073741824;
        if (i11 != 0) {
            if (i11 != 0) {
                return this.f9889d[iArr[i10 + 4]];
            }
            return l.f9953a;
        }
        return null;
    }

    public final int o(int i2) {
        return this.f9887b[(i2 * 5) + 1] & 67108863;
    }

    public final Object p(int[] iArr, int i2) {
        int i10 = i2 * 5;
        int i11 = iArr[i10 + 1];
        if ((536870912 & i11) != 0) {
            return this.f9889d[Integer.bitCount(i11 >> 30) + iArr[i10 + 4]];
        }
        return null;
    }

    public final int q(int i2) {
        return this.f9887b[(i2 * 5) + 2];
    }

    public final void r(int i2) {
        int i10;
        if (this.f9896k != 0) {
            t.a("Cannot reposition while in an empty region");
        }
        this.f9892g = i2;
        int[] iArr = this.f9887b;
        int i11 = this.f9888c;
        if (i2 < i11) {
            i10 = iArr[(i2 * 5) + 2];
        } else {
            i10 = -1;
        }
        if (i10 != this.f9894i) {
            this.f9894i = i10;
            if (i10 < 0) {
                this.f9893h = i11;
            } else {
                this.f9893h = iArr[(i10 * 5) + 3] + i10;
            }
            this.f9897l = 0;
            this.m = 0;
        }
    }

    public final int s() {
        int i2;
        if (this.f9896k != 0) {
            t.a("Cannot skip while in an empty region");
        }
        int i10 = this.f9892g;
        int i11 = i10 * 5;
        int[] iArr = this.f9887b;
        int i12 = iArr[i11 + 1];
        if ((1073741824 & i12) != 0) {
            i2 = 1;
        } else {
            i2 = i12 & 67108863;
        }
        this.f9892g = iArr[i11 + 3] + i10;
        return i2;
    }

    public final void t() {
        boolean z10;
        if (this.f9896k == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            t.a("Cannot skip the enclosing group while in an empty region");
        }
        this.f9892g = this.f9893h;
        this.f9897l = 0;
        this.m = 0;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SlotReader(current=");
        sb2.append(this.f9892g);
        sb2.append(", key=");
        sb2.append(g());
        sb2.append(", parent=");
        sb2.append(this.f9894i);
        sb2.append(", end=");
        return w.d.p(sb2, this.f9893h, ')');
    }

    public final void u() {
        int i2;
        if (this.f9896k <= 0) {
            int i10 = this.f9894i;
            int i11 = this.f9892g;
            int i12 = i11 * 5;
            int[] iArr = this.f9887b;
            if (iArr[i12 + 2] != i10) {
                l1.a("Invalid slot table detected");
            }
            int i13 = this.f9897l;
            int i14 = this.m;
            a4.w wVar = this.f9895j;
            if (i13 == 0 && i14 == 0) {
                wVar.c(-1);
            } else {
                wVar.c(i13);
            }
            this.f9894i = i11;
            this.f9893h = iArr[i12 + 3] + i11;
            int i15 = i11 + 1;
            this.f9892g = i15;
            this.f9897l = g2.b(iArr, i11);
            if (i11 >= this.f9888c - 1) {
                i2 = this.f9890e;
            } else {
                i2 = iArr[(i15 * 5) + 4];
            }
            this.m = i2;
        }
    }
}
