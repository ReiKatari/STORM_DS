package defpackage;

import android.content.res.ColorStateList;
import java.util.Arrays;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ec6  reason: default package */
/* loaded from: classes.dex */
public final class ec6 implements Cloneable {
    public /* synthetic */ boolean A;
    public /* synthetic */ int[] B;
    public /* synthetic */ Object[] L;
    public /* synthetic */ int R;

    public ec6(int i) {
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
            f(i, colorStateList);
            return;
        }
        if (this.A && i2 >= this.B.length) {
            jv3.j(this);
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
    public final ec6 clone() {
        Object clone = super.clone();
        clone.getClass();
        ec6 ec6Var = (ec6) clone;
        ec6Var.B = (int[]) this.B.clone();
        ec6Var.L = (Object[]) this.L.clone();
        return ec6Var;
    }

    public final Object c(int i) {
        Object obj;
        int l = pu.l(this.R, i, this.B);
        if (l >= 0 && (obj = this.L[l]) != jv3.j) {
            return obj;
        }
        return null;
    }

    public final int e(int i) {
        if (this.A) {
            jv3.j(this);
        }
        return this.B[i];
    }

    public final void f(int i, Object obj) {
        int l = pu.l(this.R, i, this.B);
        if (l >= 0) {
            this.L[l] = obj;
            return;
        }
        int i2 = ~l;
        int i3 = this.R;
        if (i2 < i3) {
            Object[] objArr = this.L;
            if (objArr[i2] == jv3.j) {
                this.B[i2] = i;
                objArr[i2] = obj;
                return;
            }
        }
        if (this.A && i3 >= this.B.length) {
            jv3.j(this);
            i2 = ~pu.l(this.R, i, this.B);
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
            nu.d0(i10, i2, i9, iArr, iArr);
            Object[] objArr2 = this.L;
            nu.f0(objArr2, objArr2, i10, i2, this.R);
        }
        this.B[i2] = i;
        this.L[i2] = obj;
        this.R++;
    }

    public final int g() {
        if (this.A) {
            jv3.j(this);
        }
        return this.R;
    }

    public final Object h(int i) {
        if (this.A) {
            jv3.j(this);
        }
        Object[] objArr = this.L;
        if (i < objArr.length) {
            return objArr[i];
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public final String toString() {
        if (g() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.R * 28);
        sb.append('{');
        int i = this.R;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            sb.append(e(i2));
            sb.append('=');
            Object h = h(i2);
            if (h != this) {
                sb.append(h);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
