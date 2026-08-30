package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: u62  reason: default package */
/* loaded from: classes.dex */
public final class u62 {
    public final xi5 a;

    public u62(xi5 xi5Var) {
        this.a = xi5Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof u62) || !this.a.equals(((u62) obj).a)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode() + (Integer.hashCode(1) * 31);
    }

    public final String toString() {
        return "RomOptionsDto(version=1, config=" + this.a + ")";
    }
}
