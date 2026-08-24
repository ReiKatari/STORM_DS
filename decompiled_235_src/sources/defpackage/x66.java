package defpackage;

import me.magnum.melonds.domain.model.Rect;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: x66  reason: default package */
/* loaded from: classes.dex */
public final class x66 {
    public final ko4 a;
    public final w66 b;
    public final Rect c;

    public x66(ko4 ko4Var, w66 w66Var, Rect rect) {
        ko4Var.getClass();
        w66Var.getClass();
        this.a = ko4Var;
        this.b = w66Var;
        this.c = rect;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof x66) {
                x66 x66Var = (x66) obj;
                if (this.a != x66Var.a || this.b != x66Var.b || !this.c.equals(x66Var.c)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        return this.c.hashCode() + ((hashCode + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "ScreenFold(orientation=" + this.a + ", type=" + this.b + ", foldBounds=" + this.c + ")";
    }
}
