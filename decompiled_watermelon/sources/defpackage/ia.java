package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ia  reason: default package */
/* loaded from: classes.dex */
public final class ia {
    public final String a;
    public final String b;

    public ia(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ia) {
                ia iaVar = (ia) obj;
                if (!this.a.equals(iaVar.a) || !this.b.equals(iaVar.b)) {
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
        return "ImportResult(id=" + this.a + ", displayName=" + this.b + ")";
    }
}
