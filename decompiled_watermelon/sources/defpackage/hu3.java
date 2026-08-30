package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: hu3  reason: default package */
/* loaded from: classes.dex */
public final class hu3 {
    public final String a;
    public final d33 b;

    public hu3(String str, d33 d33Var) {
        this.a = str;
        this.b = d33Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof hu3) {
                hu3 hu3Var = (hu3) obj;
                if (!this.a.equals(hu3Var.a) || !this.b.equals(hu3Var.b)) {
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
        return "MatchGroup(value=" + this.a + ", range=" + this.b + ')';
    }
}
