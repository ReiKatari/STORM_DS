package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: c60  reason: default package */
/* loaded from: classes.dex */
public final class c60 {
    public final float a;
    public final cn6 b;

    public c60(float f, cn6 cn6Var) {
        this.a = f;
        this.b = cn6Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof c60) {
                c60 c60Var = (c60) obj;
                if (!om1.b(this.a, c60Var.a) || !this.b.equals(c60Var.b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "BorderStroke(width=" + ((Object) om1.c(this.a)) + ", brush=" + this.b + ')';
    }
}
