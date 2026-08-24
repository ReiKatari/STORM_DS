package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: qx5  reason: default package */
/* loaded from: classes.dex */
public final class qx5 extends wx5 {
    public final dz0 a;

    public qx5(dz0 dz0Var) {
        this.a = dz0Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof qx5) || !this.a.equals(((qx5) obj).a)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "BiosConfigurationIncorrect(configurationDirectoryResult=" + this.a + ")";
    }
}
