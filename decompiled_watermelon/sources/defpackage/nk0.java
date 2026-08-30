package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: nk0  reason: default package */
/* loaded from: classes.dex */
public final class nk0 {
    public final Long a;
    public final String b;

    public nk0(Long l, String str) {
        str.getClass();
        this.a = l;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof nk0) {
                nk0 nk0Var = (nk0) obj;
                if (!this.a.equals(nk0Var.a) || !b53.x(this.b, nk0Var.b)) {
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
        return "CheatDatabase(id=" + this.a + ", name=" + this.b + ")";
    }
}
