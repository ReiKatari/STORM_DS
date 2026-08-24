package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: fi5  reason: default package */
/* loaded from: classes.dex */
public final class fi5 extends yh2 {
    public final yh2 d;
    public final int e;

    public fi5(yh2 yh2Var, int i) {
        this.d = yh2Var;
        this.e = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof fi5) {
            fi5 fi5Var = (fi5) obj;
            if (fi5Var.d.equals(this.d) && fi5Var.e == this.e) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.d.hashCode() + (this.e * 31);
    }
}
