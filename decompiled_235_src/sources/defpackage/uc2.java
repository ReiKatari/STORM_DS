package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: uc2  reason: default package */
/* loaded from: classes.dex */
public final class uc2 extends yc2 {
    public final dz0 a;

    public uc2(dz0 dz0Var) {
        this.a = dz0Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof uc2) || !this.a.equals(((uc2) obj).a)) {
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
