package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: o77  reason: default package */
/* loaded from: classes.dex */
public final class o77 {
    public final oo a;
    public final bn1 b;

    public o77(oo ooVar, bn1 bn1Var) {
        this.a = ooVar;
        this.b = bn1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof o77) {
            o77 o77Var = (o77) obj;
            if (b53.x(this.a, o77Var.a) && b53.x(this.b, o77Var.b)) {
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
