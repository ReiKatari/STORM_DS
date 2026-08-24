package defpackage;

import android.graphics.drawable.Drawable;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: b62  reason: default package */
/* loaded from: classes.dex */
public final class b62 extends a33 {
    public final Drawable a;
    public final z23 b;
    public final Throwable c;

    public b62(Drawable drawable, z23 z23Var, Throwable th) {
        this.a = drawable;
        this.b = z23Var;
        this.c = th;
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
        if (this != obj) {
            if (obj instanceof b62) {
                b62 b62Var = (b62) obj;
                if (nb3.k(this.a, b62Var.a) && nb3.k(this.b, b62Var.b) && this.c.equals(b62Var.c)) {
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
        Drawable drawable = this.a;
        if (drawable != null) {
            i = drawable.hashCode();
        } else {
            i = 0;
        }
        int hashCode = this.b.hashCode();
        return this.c.hashCode() + ((hashCode + (i * 31)) * 31);
    }
}
