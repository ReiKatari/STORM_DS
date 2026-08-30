package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: yr4  reason: default package */
/* loaded from: classes.dex */
public final class yr4 {
    public final String a;
    public final Long b;

    public yr4(Long l, String str) {
        this.a = str;
        this.b = l;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof yr4) {
                yr4 yr4Var = (yr4) obj;
                if (!this.a.equals(yr4Var.a) || !this.b.equals(yr4Var.b)) {
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
        return "Preference(key=" + this.a + ", value=" + this.b + ')';
    }
}
