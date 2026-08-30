package defpackage;

import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: bj4  reason: default package */
/* loaded from: classes.dex */
public final class bj4 implements po {
    public final int a;
    public final int b;
    public final long c;
    public final sq6 d;
    public final qo4 e;
    public final vn3 f;
    public final int g;
    public final int h;
    public final tr6 i;

    public bj4(int i, int i2, long j, sq6 sq6Var, qo4 qo4Var, vn3 vn3Var, int i3, int i4, tr6 tr6Var) {
        this.a = i;
        this.b = i2;
        this.c = j;
        this.d = sq6Var;
        this.e = qo4Var;
        this.f = vn3Var;
        this.g = i3;
        this.h = i4;
        this.i = tr6Var;
        if (!is6.a(j, is6.c) && is6.c(j) < RecyclerView.A1) {
            nz2.c("lineHeight can't be negative (" + is6.c(j) + ')');
        }
    }

    public final bj4 a(bj4 bj4Var) {
        if (bj4Var == null) {
            return this;
        }
        return cj4.a(this, bj4Var.a, bj4Var.b, bj4Var.c, bj4Var.d, bj4Var.e, bj4Var.f, bj4Var.g, bj4Var.h, bj4Var.i);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof bj4) {
                bj4 bj4Var = (bj4) obj;
                if (this.a == bj4Var.a && this.b == bj4Var.b && is6.a(this.c, bj4Var.c) && b53.x(this.d, bj4Var.d) && b53.x(this.e, bj4Var.e) && b53.x(this.f, bj4Var.f) && this.g == bj4Var.g && this.h == bj4Var.h && b53.x(this.i, bj4Var.i)) {
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
        int a = wh1.a(this.b, Integer.hashCode(this.a) * 31, 31);
        js6[] js6VarArr = is6.b;
        int c = b31.c(this.c, a, 31);
        int i4 = 0;
        sq6 sq6Var = this.d;
        if (sq6Var != null) {
            i = sq6Var.hashCode();
        } else {
            i = 0;
        }
        int i5 = (c + i) * 31;
        qo4 qo4Var = this.e;
        if (qo4Var != null) {
            i2 = qo4Var.hashCode();
        } else {
            i2 = 0;
        }
        int i6 = (i5 + i2) * 31;
        vn3 vn3Var = this.f;
        if (vn3Var != null) {
            i3 = vn3Var.hashCode();
        } else {
            i3 = 0;
        }
        int a2 = wh1.a(this.h, wh1.a(this.g, (i6 + i3) * 31, 31), 31);
        tr6 tr6Var = this.i;
        if (tr6Var != null) {
            i4 = tr6Var.hashCode();
        }
        return a2 + i4;
    }

    public final String toString() {
        return "ParagraphStyle(textAlign=" + ((Object) kn6.a(this.a)) + ", textDirection=" + ((Object) to6.a(this.b)) + ", lineHeight=" + ((Object) is6.d(this.c)) + ", textIndent=" + this.d + ", platformStyle=" + this.e + ", lineHeightStyle=" + this.f + ", lineBreak=" + ((Object) qn3.a(this.g)) + ", hyphens=" + ((Object) pu2.a(this.h)) + ", textMotion=" + this.i + ')';
    }

    public bj4(long j, sq6 sq6Var) {
        this(0, 0, j, sq6Var, null, null, 0, 0, null);
    }
}
