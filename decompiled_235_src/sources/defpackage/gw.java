package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: gw  reason: default package */
/* loaded from: classes.dex */
public final class gw extends hw {
    public final sr4 a;
    public final bu6 b;

    public gw(sr4 sr4Var, bu6 bu6Var) {
        this.a = sr4Var;
        this.b = bu6Var;
    }

    @Override // defpackage.hw
    public final sr4 a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof gw) {
                gw gwVar = (gw) obj;
                if (!this.a.equals(gwVar.a) || !this.b.equals(gwVar.b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Success(painter=" + this.a + ", result=" + this.b + ')';
    }
}
