package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: we1  reason: default package */
/* loaded from: classes.dex */
public final class we1 {
    public final n61 a;
    public final n61 b;
    public final n61 c;
    public final n61 d;
    public final x97 e;
    public final n05 f;
    public final Bitmap.Config g;
    public final boolean h;
    public final boolean i;
    public final Drawable j;
    public final Drawable k;
    public final Drawable l;
    public final ra0 m;
    public final ra0 n;
    public final ra0 o;

    public we1(n61 n61Var, n61 n61Var2, n61 n61Var3, n61 n61Var4, x97 x97Var, n05 n05Var, Bitmap.Config config, boolean z, boolean z2, Drawable drawable, Drawable drawable2, Drawable drawable3, ra0 ra0Var, ra0 ra0Var2, ra0 ra0Var3) {
        this.a = n61Var;
        this.b = n61Var2;
        this.c = n61Var3;
        this.d = n61Var4;
        this.e = x97Var;
        this.f = n05Var;
        this.g = config;
        this.h = z;
        this.i = z2;
        this.j = drawable;
        this.k = drawable2;
        this.l = drawable3;
        this.m = ra0Var;
        this.n = ra0Var2;
        this.o = ra0Var3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof we1) {
            we1 we1Var = (we1) obj;
            if (nb3.k(this.a, we1Var.a) && nb3.k(this.b, we1Var.b) && nb3.k(this.c, we1Var.c) && nb3.k(this.d, we1Var.d) && nb3.k(this.e, we1Var.e) && this.f == we1Var.f && this.g == we1Var.g && this.h == we1Var.h && this.i == we1Var.i && nb3.k(this.j, we1Var.j) && nb3.k(this.k, we1Var.k) && nb3.k(this.l, we1Var.l) && this.m == we1Var.m && this.n == we1Var.n && this.o == we1Var.o) {
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
        int e = xg6.e(xg6.e((this.g.hashCode() + ((this.f.hashCode() + ((hashCode4 + ((hashCode3 + ((hashCode2 + ((hashCode + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31, this.h, 31), this.i, 31);
        int i3 = 0;
        Drawable drawable = this.j;
        if (drawable != null) {
            i = drawable.hashCode();
        } else {
            i = 0;
        }
        int i4 = (e + i) * 31;
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
