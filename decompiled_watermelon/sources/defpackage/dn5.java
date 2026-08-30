package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: dn5  reason: default package */
/* loaded from: classes.dex */
public final class dn5 extends hn5 {
    public final yf2 a;

    public dn5(yf2 yf2Var) {
        this.a = yf2Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof dn5) || !this.a.equals(((dn5) obj).a)) {
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
        return "DSiWareTitleValidationFailed(reason=" + this.a + ")";
    }
}
