package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: af5  reason: default package */
/* loaded from: classes.dex */
public final class af5 {
    public final long a;
    public final String b;

    public af5(long j, String str) {
        this.a = j;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof af5)) {
            return false;
        }
        af5 af5Var = (af5) obj;
        if (this.a == af5Var.a && b53.x(this.b, af5Var.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = Long.hashCode(this.a) * 31;
        String str = this.b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final String toString() {
        return "RemoteShaderPackage(contentLength=" + this.a + ", lastModified=" + this.b + ")";
    }
}
