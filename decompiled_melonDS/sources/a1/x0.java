package a1;

import android.content.res.ColorStateList;
import java.util.Arrays;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class x0 implements Cloneable {
    public /* synthetic */ boolean A;
    public /* synthetic */ int[] B;
    public /* synthetic */ Object[] L;
    public /* synthetic */ int R;

    public x0(int i2) {
        int i10;
        int i11 = 4;
        while (true) {
            i10 = 40;
            if (i11 >= 32) {
                break;
            }
            int i12 = (1 << i11) - 12;
            if (40 <= i12) {
                i10 = i12;
                break;
            }
            i11++;
        }
        int i13 = i10 / 4;
        this.B = new int[i13];
        this.L = new Object[i13];
    }

    public final void a(int i2, ColorStateList colorStateList) {
        int i10 = this.R;
        if (i10 != 0 && i2 <= this.B[i10 - 1]) {
            f(i2, colorStateList);
            return;
        }
        if (this.A && i10 >= this.B.length) {
            r.a(this);
        }
        int i11 = this.R;
        if (i11 >= this.B.length) {
            int i12 = (i11 + 1) * 4;
            int i13 = 4;
            while (true) {
                if (i13 >= 32) {
                    break;
                }
                int i14 = (1 << i13) - 12;
                if (i12 <= i14) {
                    i12 = i14;
                    break;
                }
                i13++;
            }
            int i15 = i12 / 4;
            this.B = Arrays.copyOf(this.B, i15);
            this.L = Arrays.copyOf(this.L, i15);
        }
        this.B[i11] = i2;
        this.L[i11] = colorStateList;
        this.R = i11 + 1;
    }

    /* renamed from: b */
    public final x0 clone() {
        Object clone = super.clone();
        clone.getClass();
        x0 x0Var = (x0) clone;
        x0Var.B = (int[]) this.B.clone();
        x0Var.L = (Object[]) this.L.clone();
        return x0Var;
    }

    public final Object c(int i2) {
        Object obj;
        int a10 = b1.a.a(this.R, i2, this.B);
        if (a10 >= 0 && (obj = this.L[a10]) != r.f91c) {
            return obj;
        }
        return null;
    }

    public final int e(int i2) {
        if (this.A) {
            r.a(this);
        }
        return this.B[i2];
    }

    public final void f(int i2, Object obj) {
        int a10 = b1.a.a(this.R, i2, this.B);
        if (a10 >= 0) {
            this.L[a10] = obj;
            return;
        }
        int i10 = ~a10;
        int i11 = this.R;
        if (i10 < i11) {
            Object[] objArr = this.L;
            if (objArr[i10] == r.f91c) {
                this.B[i10] = i2;
                objArr[i10] = obj;
                return;
            }
        }
        if (this.A && i11 >= this.B.length) {
            r.a(this);
            i10 = ~b1.a.a(this.R, i2, this.B);
        }
        int i12 = this.R;
        if (i12 >= this.B.length) {
            int i13 = (i12 + 1) * 4;
            int i14 = 4;
            while (true) {
                if (i14 >= 32) {
                    break;
                }
                int i15 = (1 << i14) - 12;
                if (i13 <= i15) {
                    i13 = i15;
                    break;
                }
                i14++;
            }
            int i16 = i13 / 4;
            this.B = Arrays.copyOf(this.B, i16);
            this.L = Arrays.copyOf(this.L, i16);
        }
        int i17 = this.R;
        if (i17 - i10 != 0) {
            int[] iArr = this.B;
            int i18 = i10 + 1;
            zb.k.g(i18, i10, i17, iArr, iArr);
            Object[] objArr2 = this.L;
            zb.k.i(objArr2, objArr2, i18, i10, this.R);
        }
        this.B[i10] = i2;
        this.L[i10] = obj;
        this.R++;
    }

    public final int g() {
        if (this.A) {
            r.a(this);
        }
        return this.R;
    }

    public final Object h(int i2) {
        if (this.A) {
            r.a(this);
        }
        Object[] objArr = this.L;
        if (i2 < objArr.length) {
            return objArr[i2];
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public final String toString() {
        if (g() <= 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.R * 28);
        sb2.append('{');
        int i2 = this.R;
        for (int i10 = 0; i10 < i2; i10++) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            sb2.append(e(i10));
            sb2.append('=');
            Object h2 = h(i10);
            if (h2 != this) {
                sb2.append(h2);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        return sb2.toString();
    }
}
