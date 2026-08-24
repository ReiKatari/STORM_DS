package defpackage;

import android.content.res.ColorStateList;
import java.util.Arrays;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: un6  reason: default package */
/* loaded from: classes.dex */
public final class un6 implements Cloneable {
    public /* synthetic */ boolean A;
    public /* synthetic */ int[] B;
    public /* synthetic */ Object[] L;
    public /* synthetic */ int R;

    public un6(int i) {
        int i2;
        int i3 = 4;
        while (true) {
            i2 = 40;
            if (i3 >= 32) {
                break;
            }
            int i4 = (1 << i3) - 12;
            if (40 <= i4) {
                i2 = i4;
                break;
            }
            i3++;
        }
        int i5 = i2 / 4;
        this.B = new int[i5];
        this.L = new Object[i5];
    }

    public final void a(int i, ColorStateList colorStateList) {
        int i2 = this.R;
        if (i2 != 0 && i <= this.B[i2 - 1]) {
            e(i, colorStateList);
            return;
        }
        if (this.A && i2 >= this.B.length) {
            vy7.I(this);
        }
        int i3 = this.R;
        if (i3 >= this.B.length) {
            int i4 = (i3 + 1) * 4;
            int i5 = 4;
            while (true) {
                if (i5 >= 32) {
                    break;
                }
                int i6 = (1 << i5) - 12;
                if (i4 <= i6) {
                    i4 = i6;
                    break;
                }
                i5++;
            }
            int i7 = i4 / 4;
            this.B = Arrays.copyOf(this.B, i7);
            this.L = Arrays.copyOf(this.L, i7);
        }
        this.B[i3] = i;
        this.L[i3] = colorStateList;
        this.R = i3 + 1;
    }

    /* renamed from: b */
    public final un6 clone() {
        Object clone = super.clone();
        clone.getClass();
        un6 un6Var = (un6) clone;
        un6Var.B = (int[]) this.B.clone();
        un6Var.L = (Object[]) this.L.clone();
        return un6Var;
    }

    public final Object c(int i) {
        Object obj;
        int v = g04.v(this.R, i, this.B);
        if (v >= 0 && (obj = this.L[v]) != vy7.d0) {
            return obj;
        }
        return null;
    }

    public final int d(int i) {
        if (this.A) {
            vy7.I(this);
        }
        return this.B[i];
    }

    public final void e(int i, Object obj) {
        int v = g04.v(this.R, i, this.B);
        if (v >= 0) {
            this.L[v] = obj;
            return;
        }
        int i2 = ~v;
        int i3 = this.R;
        if (i2 < i3) {
            Object[] objArr = this.L;
            if (objArr[i2] == vy7.d0) {
                this.B[i2] = i;
                objArr[i2] = obj;
                return;
            }
        }
        if (this.A && i3 >= this.B.length) {
            vy7.I(this);
            i2 = ~g04.v(this.R, i, this.B);
        }
        int i4 = this.R;
        if (i4 >= this.B.length) {
            int i5 = (i4 + 1) * 4;
            int i6 = 4;
            while (true) {
                if (i6 >= 32) {
                    break;
                }
                int i7 = (1 << i6) - 12;
                if (i5 <= i7) {
                    i5 = i7;
                    break;
                }
                i6++;
            }
            int i8 = i5 / 4;
            this.B = Arrays.copyOf(this.B, i8);
            this.L = Arrays.copyOf(this.L, i8);
        }
        int i9 = this.R;
        if (i9 - i2 != 0) {
            int[] iArr = this.B;
            int i10 = i2 + 1;
            fv.r0(i10, i2, i9, iArr, iArr);
            Object[] objArr2 = this.L;
            fv.t0(objArr2, objArr2, i10, i2, this.R);
        }
        this.B[i2] = i;
        this.L[i2] = obj;
        this.R++;
    }

    public final int f() {
        if (this.A) {
            vy7.I(this);
        }
        return this.R;
    }

    public final Object g(int i) {
        if (this.A) {
            vy7.I(this);
        }
        Object[] objArr = this.L;
        if (i < objArr.length) {
            return objArr[i];
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public final String toString() {
        if (f() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.R * 28);
        sb.append('{');
        int i = this.R;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            sb.append(d(i2));
            sb.append('=');
            Object g = g(i2);
            if (g != this) {
                sb.append(g);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
