package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: l93  reason: default package */
/* loaded from: classes.dex */
public final class l93 extends j93 {
    public static final l93 R = new j93(1, 0, 1);

    @Override // defpackage.j93
    public final boolean equals(Object obj) {
        if (obj instanceof l93) {
            if (!isEmpty() || !((l93) obj).isEmpty()) {
                l93 l93Var = (l93) obj;
                if (this.A == l93Var.A && this.B == l93Var.B) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.j93
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.A * 31) + this.B;
    }

    @Override // defpackage.j93
    public final boolean isEmpty() {
        if (this.A > this.B) {
            return true;
        }
        return false;
    }

    @Override // defpackage.j93
    public final String toString() {
        return this.A + ".." + this.B;
    }
}
