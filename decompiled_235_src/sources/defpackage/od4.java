package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: od4  reason: default package */
/* loaded from: classes.dex */
public final class od4 extends nj2 {
    public final hd4 i;

    public od4(hd4 hd4Var) {
        hd4Var.getClass();
        this.i = hd4Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && od4.class == obj.getClass() && nb3.k(this.i, ((od4) obj).i)) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.i.hashCode() - 31;
    }

    public final String toString() {
        return "InProgress(latestEvent=" + this.i + ", direction=-1)";
    }
}
