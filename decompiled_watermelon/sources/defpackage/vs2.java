package defpackage;

import androidx.preference.Preference;
import java.util.ArrayList;
import java.util.Arrays;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: vs2  reason: default package */
/* loaded from: classes.dex */
public final class vs2 {
    public final f60 a;
    public boolean c;
    public int g;
    public int h;
    public int b = Preference.DEFAULT_ORDER;
    public int d = 4096;
    public tq2[] e = new tq2[8];
    public int f = 7;

    public vs2(f60 f60Var) {
        this.a = f60Var;
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
                tq2 tq2Var = this.e[length];
                tq2Var.getClass();
                i -= tq2Var.c;
                int i4 = this.h;
                tq2 tq2Var2 = this.e[length];
                tq2Var2.getClass();
                this.h = i4 - tq2Var2.c;
                this.g--;
                i3++;
                length--;
            }
            tq2[] tq2VarArr = this.e;
            int i5 = i2 + 1;
            System.arraycopy(tq2VarArr, i5, tq2VarArr, i5 + i3, this.g);
            tq2[] tq2VarArr2 = this.e;
            int i6 = this.f + 1;
            Arrays.fill(tq2VarArr2, i6, i6 + i3, (Object) null);
            this.f += i3;
        }
    }

    public final void b(tq2 tq2Var) {
        int i = tq2Var.c;
        int i2 = this.d;
        if (i > i2) {
            tq2[] tq2VarArr = this.e;
            nu.l0(0, tq2VarArr.length, null, tq2VarArr);
            this.f = this.e.length - 1;
            this.g = 0;
            this.h = 0;
            return;
        }
        a((this.h + i) - i2);
        int i3 = this.g + 1;
        tq2[] tq2VarArr2 = this.e;
        if (i3 > tq2VarArr2.length) {
            tq2[] tq2VarArr3 = new tq2[tq2VarArr2.length * 2];
            System.arraycopy(tq2VarArr2, 0, tq2VarArr3, tq2VarArr2.length, tq2VarArr2.length);
            this.f = this.e.length - 1;
            this.e = tq2VarArr3;
        }
        int i4 = this.f;
        this.f = i4 - 1;
        this.e[i4] = tq2Var;
        this.g++;
        this.h += i;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [f60, java.lang.Object] */
    public final void c(w70 w70Var) {
        w70Var.getClass();
        int[] iArr = iu2.a;
        int d = w70Var.d();
        long j = 0;
        int i = 0;
        long j2 = 0;
        for (int i2 = 0; i2 < d; i2++) {
            byte i3 = w70Var.i(i2);
            byte[] bArr = gk7.a;
            j2 += iu2.b[i3 & 255];
        }
        int i4 = (int) ((j2 + 7) >> 3);
        int d2 = w70Var.d();
        f60 f60Var = this.a;
        if (i4 < d2) {
            ?? obj = new Object();
            int[] iArr2 = iu2.a;
            int d3 = w70Var.d();
            byte b = 0;
            while (i < d3) {
                byte i5 = w70Var.i(i);
                byte[] bArr2 = gk7.a;
                int i6 = i5 & 255;
                int i7 = iu2.a[i6];
                byte b2 = iu2.b[i6];
                j = (j << b2) | i7;
                int i8 = b + b2;
                while (i8 >= 8) {
                    i8 = (i8 == 1 ? 1 : 0) - 8;
                    obj.m0((int) (j >> i8));
                }
                i++;
                b = i8;
            }
            if (b > 0) {
                obj.m0((int) ((j << (8 - b)) | (255 >>> b)));
            }
            w70 r = obj.r(obj.B);
            e(r.d(), 127, 128);
            f60Var.k0(r);
            return;
        }
        e(w70Var.d(), 127, 0);
        f60Var.k0(w70Var);
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
            this.b = Preference.DEFAULT_ORDER;
            e(this.d, 31, 32);
        }
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            tq2 tq2Var = (tq2) arrayList.get(i4);
            w70 q = tq2Var.a.q();
            w70 w70Var = tq2Var.b;
            Integer num = (Integer) ws2.b.get(q);
            if (num != null) {
                int intValue = num.intValue();
                i2 = intValue + 1;
                if (2 <= i2 && i2 < 8) {
                    tq2[] tq2VarArr = ws2.a;
                    if (b53.x(tq2VarArr[intValue].b, w70Var)) {
                        i = i2;
                    } else if (b53.x(tq2VarArr[i2].b, w70Var)) {
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
                    tq2 tq2Var2 = this.e[i5];
                    tq2Var2.getClass();
                    if (b53.x(tq2Var2.a, q)) {
                        tq2 tq2Var3 = this.e[i5];
                        tq2Var3.getClass();
                        if (b53.x(tq2Var3.b, w70Var)) {
                            i2 = ws2.a.length + (i5 - this.f);
                            break;
                        } else if (i == -1) {
                            i = (i5 - this.f) + ws2.a.length;
                        }
                    }
                    i5++;
                }
            }
            if (i2 != -1) {
                e(i2, 127, 128);
            } else if (i == -1) {
                this.a.m0(64);
                c(q);
                c(w70Var);
                b(tq2Var);
            } else {
                w70 w70Var2 = tq2.d;
                q.getClass();
                w70Var2.getClass();
                if (q.m(0, w70Var2, w70Var2.d()) && !b53.x(tq2.i, q)) {
                    e(i, 15, 0);
                    c(w70Var);
                } else {
                    e(i, 63, 64);
                    c(w70Var);
                    b(tq2Var);
                }
            }
        }
    }

    public final void e(int i, int i2, int i3) {
        f60 f60Var = this.a;
        if (i < i2) {
            f60Var.m0(i | i3);
            return;
        }
        f60Var.m0(i3 | i2);
        int i4 = i - i2;
        while (i4 >= 128) {
            f60Var.m0(128 | (i4 & 127));
            i4 >>>= 7;
        }
        f60Var.m0(i4);
    }
}
