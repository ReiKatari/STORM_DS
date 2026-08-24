package defpackage;

import me.magnum.melonds.domain.model.Rect;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: j05  reason: default package */
/* loaded from: classes.dex */
public final class j05 {
    public final Rect a;
    public final nj3 b;
    public final float c;
    public final boolean d;

    public j05(Rect rect, nj3 nj3Var, float f, boolean z) {
        nj3Var.getClass();
        this.a = rect;
        this.b = nj3Var;
        this.c = f;
        this.d = z;
    }

    public static j05 a(j05 j05Var, Rect rect) {
        nj3 nj3Var = j05Var.b;
        float f = j05Var.c;
        boolean z = j05Var.d;
        j05Var.getClass();
        rect.getClass();
        nj3Var.getClass();
        return new j05(rect, nj3Var, f, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j05)) {
            return false;
        }
        j05 j05Var = (j05) obj;
        if (nb3.k(this.a, j05Var.a) && this.b == j05Var.b && Float.compare(this.c, j05Var.c) == 0 && this.d == j05Var.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        return Boolean.hashCode(this.d) + xg6.a(this.c, (hashCode + (this.a.hashCode() * 31)) * 31, 31);
    }

    public final String toString() {
        return "PositionedLayoutComponent(rect=" + this.a + ", component=" + this.b + ", alpha=" + this.c + ", onTop=" + this.d + ")";
    }
}
