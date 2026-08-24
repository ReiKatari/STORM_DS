package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: j92  reason: default package */
/* loaded from: classes.dex */
public final class j92 {
    public final Object a;
    public final zv0 b;

    public j92(el6 el6Var, zv0 zv0Var) {
        this.a = el6Var;
        this.b = zv0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof j92) {
            j92 j92Var = (j92) obj;
            if (nb3.k(this.a, j92Var.a) && this.b == j92Var.b) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        Object obj = this.a;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        return this.b.hashCode() + (hashCode * 31);
    }

    public final String toString() {
        return "FadeInFadeOutAnimationItem(key=" + this.a + ", transition=" + this.b + ')';
    }
}
