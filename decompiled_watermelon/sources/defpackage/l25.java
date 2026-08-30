package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: l25  reason: default package */
/* loaded from: classes.dex */
public final class l25 {
    public final o25 a;
    public final String b;

    public l25(o25 o25Var, String str) {
        o25Var.getClass();
        this.a = o25Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l25)) {
            return false;
        }
        l25 l25Var = (l25) obj;
        if (this.a == l25Var.a && b53.x(this.b, l25Var.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.a.hashCode() * 31;
        String str = this.b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final String toString() {
        return "RaInGameLogoutCommitFailure(stage=" + this.a + ", errorType=" + this.b + ")";
    }
}
