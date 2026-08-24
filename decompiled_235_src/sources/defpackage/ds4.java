package defpackage;

import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ds4  reason: default package */
/* loaded from: classes.dex */
public final class ds4 implements bp {
    public final int a;
    public final int b;
    public final long c;
    public final g37 d;
    public final ux4 e;
    public final xu3 f;
    public final int g;
    public final int h;
    public final i47 i;

    public ds4(int i, int i2, long j, g37 g37Var, ux4 ux4Var, xu3 xu3Var, int i3, int i4, i47 i47Var) {
        this.a = i;
        this.b = i2;
        this.c = j;
        this.d = g37Var;
        this.e = ux4Var;
        this.f = xu3Var;
        this.g = i3;
        this.h = i4;
        this.i = i47Var;
        if (!x47.a(j, x47.c) && x47.c(j) < RecyclerView.B1) {
            q53.c("lineHeight can't be negative (" + x47.c(j) + ')');
        }
    }

    public final ds4 a(ds4 ds4Var) {
        if (ds4Var == null) {
            return this;
        }
        return es4.a(this, ds4Var.a, ds4Var.b, ds4Var.c, ds4Var.d, ds4Var.e, ds4Var.f, ds4Var.g, ds4Var.h, ds4Var.i);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ds4) {
                ds4 ds4Var = (ds4) obj;
                if (this.a == ds4Var.a && this.b == ds4Var.b && x47.a(this.c, ds4Var.c) && nb3.k(this.d, ds4Var.d) && nb3.k(this.e, ds4Var.e) && nb3.k(this.f, ds4Var.f) && this.g == ds4Var.g && this.h == ds4Var.h && nb3.k(this.i, ds4Var.i)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int a = lb1.a(this.b, Integer.hashCode(this.a) * 31, 31);
        y47[] y47VarArr = x47.b;
        int c = i61.c(this.c, a, 31);
        int i4 = 0;
        g37 g37Var = this.d;
        if (g37Var != null) {
            i = g37Var.hashCode();
        } else {
            i = 0;
        }
        int i5 = (c + i) * 31;
        ux4 ux4Var = this.e;
        if (ux4Var != null) {
            i2 = ux4Var.hashCode();
        } else {
            i2 = 0;
        }
        int i6 = (i5 + i2) * 31;
        xu3 xu3Var = this.f;
        if (xu3Var != null) {
            i3 = xu3Var.hashCode();
        } else {
            i3 = 0;
        }
        int a2 = lb1.a(this.h, lb1.a(this.g, (i6 + i3) * 31, 31), 31);
        i47 i47Var = this.i;
        if (i47Var != null) {
            i4 = i47Var.hashCode();
        }
        return a2 + i4;
    }

    public final String toString() {
        return "ParagraphStyle(textAlign=" + ((Object) wz6.a(this.a)) + ", textDirection=" + ((Object) e17.a(this.b)) + ", lineHeight=" + ((Object) x47.d(this.c)) + ", textIndent=" + this.d + ", platformStyle=" + this.e + ", lineHeightStyle=" + this.f + ", lineBreak=" + ((Object) su3.a(this.g)) + ", hyphens=" + ((Object) q03.a(this.h)) + ", textMotion=" + this.i + ')';
    }

    public ds4(long j, g37 g37Var) {
        this(0, 0, j, g37Var, null, null, 0, 0, null);
    }
}
