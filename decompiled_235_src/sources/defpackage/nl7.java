package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: nl7  reason: default package */
/* loaded from: classes.dex */
public final class nl7 {
    public final ap a;
    public final hr1 b;

    public nl7(ap apVar, hr1 hr1Var) {
        this.a = apVar;
        this.b = hr1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof nl7) {
            nl7 nl7Var = (nl7) obj;
            if (nb3.k(this.a, nl7Var.a) && nb3.k(this.b, nl7Var.b)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        return Integer.hashCode(0) + ((hashCode + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "VectorizedKeyframeSpecElementInfo(vectorValue=" + this.a + ", easing=" + this.b + ", arcMode=ArcMode(value=0))";
    }
}
