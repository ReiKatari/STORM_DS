package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ab1  reason: default package */
/* loaded from: classes.dex */
public final class ab1 {
    public final g31 a;
    public final g31 b;
    public final g31 c;
    public final g31 d;
    public final bx6 e;
    public final kr4 f;
    public final Bitmap.Config g;
    public final boolean h;
    public final boolean i;
    public final Drawable j;
    public final Drawable k;
    public final Drawable l;
    public final j80 m;
    public final j80 n;
    public final j80 o;

    public ab1(g31 g31Var, g31 g31Var2, g31 g31Var3, g31 g31Var4, bx6 bx6Var, kr4 kr4Var, Bitmap.Config config, boolean z, boolean z2, Drawable drawable, Drawable drawable2, Drawable drawable3, j80 j80Var, j80 j80Var2, j80 j80Var3) {
        this.a = g31Var;
        this.b = g31Var2;
        this.c = g31Var3;
        this.d = g31Var4;
        this.e = bx6Var;
        this.f = kr4Var;
        this.g = config;
        this.h = z;
        this.i = z2;
        this.j = drawable;
        this.k = drawable2;
        this.l = drawable3;
        this.m = j80Var;
        this.n = j80Var2;
        this.o = j80Var3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ab1) {
            ab1 ab1Var = (ab1) obj;
            if (b53.x(this.a, ab1Var.a) && b53.x(this.b, ab1Var.b) && b53.x(this.c, ab1Var.c) && b53.x(this.d, ab1Var.d) && b53.x(this.e, ab1Var.e) && this.f == ab1Var.f && this.g == ab1Var.g && this.h == ab1Var.h && this.i == ab1Var.i && b53.x(this.j, ab1Var.j) && b53.x(this.k, ab1Var.k) && b53.x(this.l, ab1Var.l) && this.m == ab1Var.m && this.n == ab1Var.n && this.o == ab1Var.o) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2;
        int hashCode = this.b.hashCode();
        int hashCode2 = this.c.hashCode();
        int hashCode3 = this.d.hashCode();
        int hashCode4 = this.e.hashCode();
        int c = ej6.c(ej6.c((this.g.hashCode() + ((this.f.hashCode() + ((hashCode4 + ((hashCode3 + ((hashCode2 + ((hashCode + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31, this.h, 31), this.i, 31);
        int i3 = 0;
        Drawable drawable = this.j;
        if (drawable != null) {
            i = drawable.hashCode();
        } else {
            i = 0;
        }
        int i4 = (c + i) * 31;
        Drawable drawable2 = this.k;
        if (drawable2 != null) {
            i2 = drawable2.hashCode();
        } else {
            i2 = 0;
        }
        int i5 = (i4 + i2) * 31;
        Drawable drawable3 = this.l;
        if (drawable3 != null) {
            i3 = drawable3.hashCode();
        }
        int hashCode5 = this.m.hashCode();
        return this.o.hashCode() + ((this.n.hashCode() + ((hashCode5 + ((i5 + i3) * 31)) * 31)) * 31);
    }
}
