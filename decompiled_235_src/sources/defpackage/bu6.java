package defpackage;

import android.graphics.drawable.Drawable;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: bu6  reason: default package */
/* loaded from: classes.dex */
public final class bu6 extends a33 {
    public final Drawable a;
    public final z23 b;
    public final zb1 c;
    public final c44 d;
    public final String e;
    public final boolean f;
    public final boolean g;

    public bu6(Drawable drawable, z23 z23Var, zb1 zb1Var, c44 c44Var, String str, boolean z, boolean z2) {
        this.a = drawable;
        this.b = z23Var;
        this.c = zb1Var;
        this.d = c44Var;
        this.e = str;
        this.f = z;
        this.g = z2;
    }

    @Override // defpackage.a33
    public final Drawable a() {
        return this.a;
    }

    @Override // defpackage.a33
    public final z23 b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof bu6) {
            bu6 bu6Var = (bu6) obj;
            if (nb3.k(this.a, bu6Var.a) && nb3.k(this.b, bu6Var.b) && this.c == bu6Var.c && nb3.k(this.d, bu6Var.d) && nb3.k(this.e, bu6Var.e) && this.f == bu6Var.f && this.g == bu6Var.g) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31;
        int i2 = 0;
        c44 c44Var = this.d;
        if (c44Var != null) {
            i = c44Var.hashCode();
        } else {
            i = 0;
        }
        int i3 = (hashCode + i) * 31;
        String str = this.e;
        if (str != null) {
            i2 = str.hashCode();
        }
        return Boolean.hashCode(this.g) + xg6.e((i3 + i2) * 31, this.f, 31);
    }
}
