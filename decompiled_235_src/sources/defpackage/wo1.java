package defpackage;

import android.graphics.drawable.Drawable;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: wo1  reason: default package */
/* loaded from: classes.dex */
public final class wo1 extends ja2 {
    public final Drawable a;
    public final boolean b;
    public final zb1 c;

    public wo1(Drawable drawable, boolean z, zb1 zb1Var) {
        this.a = drawable;
        this.b = z;
        this.c = zb1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof wo1) {
            wo1 wo1Var = (wo1) obj;
            if (nb3.k(this.a, wo1Var.a) && this.b == wo1Var.b && this.c == wo1Var.c) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + xg6.e(this.a.hashCode() * 31, this.b, 31);
    }
}
