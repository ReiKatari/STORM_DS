package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: bn5  reason: default package */
/* loaded from: classes.dex */
public final class bn5 extends hn5 {
    public final hw0 a;

    public bn5(hw0 hw0Var) {
        this.a = hw0Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof bn5) || !this.a.equals(((bn5) obj).a)) {
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
