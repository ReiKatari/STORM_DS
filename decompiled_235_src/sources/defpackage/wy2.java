package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: wy2  reason: default package */
/* loaded from: classes.dex */
public final class wy2 {
    public final k80 a;
    public boolean c;
    public int g;
    public int h;
    public int b = Integer.MAX_VALUE;
    public int d = 4096;
    public uw2[] e = new uw2[8];
    public int f = 7;

    public wy2(k80 k80Var) {
        this.a = k80Var;
    }

    public final void a(int i) {
        int i2;
        if (i > 0) {
            int length = this.e.length - 1;
            int i3 = 0;
            while (true) {
                i2 = this.f;
                if (length < i2 || i <= 0) {
                    break;
                }
                uw2 uw2Var = this.e[length];
                uw2Var.getClass();
                i -= uw2Var.c;
                int i4 = this.h;
                uw2 uw2Var2 = this.e[length];
                uw2Var2.getClass();
                this.h = i4 - uw2Var2.c;
                this.g--;
                i3++;
                length--;
            }
            uw2[] uw2VarArr = this.e;
            int i5 = i2 + 1;
            System.arraycopy(uw2VarArr, i5, uw2VarArr, i5 + i3, this.g);
            uw2[] uw2VarArr2 = this.e;
            int i6 = this.f + 1;
            Arrays.fill(uw2VarArr2, i6, i6 + i3, (Object) null);
            this.f += i3;
        }
    }

    public final void b(uw2 uw2Var) {
        int i = uw2Var.c;
        int i2 = this.d;
        if (i > i2) {
            uw2[] uw2VarArr = this.e;
            fv.z0(0, uw2VarArr.length, null, uw2VarArr);
            this.f = this.e.length - 1;
            this.g = 0;
            this.h = 0;
            return;
        }
        a((this.h + i) - i2);
        int i3 = this.g + 1;
        uw2[] uw2VarArr2 = this.e;
        if (i3 > uw2VarArr2.length) {
            uw2[] uw2VarArr3 = new uw2[uw2VarArr2.length * 2];
            System.arraycopy(uw2VarArr2, 0, uw2VarArr3, uw2VarArr2.length, uw2VarArr2.length);
            this.f = this.e.length - 1;
            this.e = uw2VarArr3;
        }
        int i4 = this.f;
        this.f = i4 - 1;
        this.e[i4] = uw2Var;
        this.g++;
        this.h += i;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [k80, java.lang.Object] */
    public final void c(da0 da0Var) {
        da0Var.getClass();
        int[] iArr = j03.a;
        int d = da0Var.d();
        long j = 0;
        int i = 0;
        long j2 = 0;
        for (int i2 = 0; i2 < d; i2++) {
            byte i3 = da0Var.i(i2);
            byte[] bArr = yy7.a;
            j2 += j03.b[i3 & 255];
        }
        int i4 = (int) ((j2 + 7) >> 3);
        int d2 = da0Var.d();
        k80 k80Var = this.a;
        if (i4 < d2) {
            ?? obj = new Object();
            int[] iArr2 = j03.a;
            int d3 = da0Var.d();
            byte b = 0;
            while (i < d3) {
                byte i5 = da0Var.i(i);
                byte[] bArr2 = yy7.a;
                int i6 = i5 & 255;
                int i7 = j03.a[i6];
                byte b2 = j03.b[i6];
                j = (j << b2) | i7;
                int i8 = b + b2;
                while (i8 >= 8) {
                    i8 = (i8 == 1 ? 1 : 0) - 8;
                    obj.n0((int) (j >> i8));
                }
                i++;
                b = i8;
            }
            if (b > 0) {
                obj.n0((int) ((j << (8 - b)) | (255 >>> b)));
            }
            da0 l = obj.l(obj.B);
            e(l.d(), 127, 128);
            k80Var.k0(l);
            return;
        }
        e(da0Var.d(), 127, 0);
        k80Var.k0(da0Var);
    }

    public final void d(ArrayList arrayList) {
        int i;
        int i2;
        if (this.c) {
            int i3 = this.b;
            if (i3 < this.d) {
                e(i3, 31, 32);
            }
            this.c = false;
            this.b = Integer.MAX_VALUE;
            e(this.d, 31, 32);
        }
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            uw2 uw2Var = (uw2) arrayList.get(i4);
            da0 q = uw2Var.a.q();
            da0 da0Var = uw2Var.b;
            Integer num = (Integer) xy2.b.get(q);
            if (num != null) {
                int intValue = num.intValue();
                i2 = intValue + 1;
                if (2 <= i2 && i2 < 8) {
                    uw2[] uw2VarArr = xy2.a;
                    if (nb3.k(uw2VarArr[intValue].b, da0Var)) {
                        i = i2;
                    } else if (nb3.k(uw2VarArr[i2].b, da0Var)) {
                        i2 = intValue + 2;
                        i = i2;
                    }
                }
                i = i2;
                i2 = -1;
            } else {
                i = -1;
                i2 = -1;
            }
            if (i2 == -1) {
                int i5 = this.f + 1;
                int length = this.e.length;
                while (true) {
                    if (i5 >= length) {
                        break;
                    }
                    uw2 uw2Var2 = this.e[i5];
                    uw2Var2.getClass();
                    if (nb3.k(uw2Var2.a, q)) {
                        uw2 uw2Var3 = this.e[i5];
                        uw2Var3.getClass();
                        if (nb3.k(uw2Var3.b, da0Var)) {
                            i2 = xy2.a.length + (i5 - this.f);
                            break;
                        } else if (i == -1) {
                            i = (i5 - this.f) + xy2.a.length;
                        }
                    }
                    i5++;
                }
            }
            if (i2 != -1) {
                e(i2, 127, 128);
            } else if (i == -1) {
                this.a.n0(64);
                c(q);
                c(da0Var);
                b(uw2Var);
            } else {
                da0 da0Var2 = uw2.d;
                q.getClass();
                da0Var2.getClass();
                if (q.l(0, da0Var2, da0Var2.d()) && !nb3.k(uw2.i, q)) {
                    e(i, 15, 0);
                    c(da0Var);
                } else {
                    e(i, 63, 64);
                    c(da0Var);
                    b(uw2Var);
                }
            }
        }
    }

    public final void e(int i, int i2, int i3) {
        k80 k80Var = this.a;
        if (i < i2) {
            k80Var.n0(i | i3);
            return;
        }
        k80Var.n0(i3 | i2);
        int i4 = i - i2;
        while (i4 >= 128) {
            k80Var.n0(128 | (i4 & 127));
            i4 >>>= 7;
        }
        k80Var.n0(i4);
    }
}
