package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: p84  reason: default package */
/* loaded from: classes.dex */
public final class p84 {
    public final b63 a;
    public final my4 b;
    public final float c;

    public p84(b63 b63Var, my4 my4Var, float f) {
        b63Var.getClass();
        this.a = b63Var;
        this.b = my4Var;
        this.c = f;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof p84) {
                p84 p84Var = (p84) obj;
                if (this.a != p84Var.a || !this.b.equals(p84Var.b) || Float.compare(this.c, p84Var.c) != 0) {
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
        return Float.hashCode(this.c) + ((hashCode + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "ButtonCircle(input=" + this.a + ", center=" + this.b + ", radiusSquared=" + this.c + ")";
    }
}
