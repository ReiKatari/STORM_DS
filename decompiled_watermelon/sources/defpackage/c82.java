package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: c82  reason: default package */
/* loaded from: classes.dex */
public final class c82 extends g82 {
    public final hw0 a;

    public c82(hw0 hw0Var) {
        this.a = hw0Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof c82) || !this.a.equals(((c82) obj).a)) {
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
