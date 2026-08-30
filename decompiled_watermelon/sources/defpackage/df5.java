package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: df5  reason: default package */
/* loaded from: classes.dex */
public final class df5 {
    public final String a;
    public final String b;
    public final long c;
    public final long d;
    public final long e;
    public final int f;
    public final String g;

    public df5(String str, String str2, long j, long j2, long j3, int i, String str3) {
        this.a = str;
        this.b = str2;
        this.c = j;
        this.d = j2;
        this.e = j3;
        this.f = i;
        this.g = str3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof df5) {
                df5 df5Var = (df5) obj;
                if (!this.a.equals(df5Var.a) || !b53.x(this.b, df5Var.b) || this.c != df5Var.c || this.d != df5Var.d || this.e != df5Var.e || this.f != df5Var.f || !b53.x(this.g, df5Var.g)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.a.hashCode() * 31;
        int i = 0;
        String str = this.b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int a = wh1.a(this.f, b31.c(this.e, b31.c(this.d, b31.c(this.c, (hashCode2 + hashCode) * 31, 31), 31), 31), 31);
        String str2 = this.g;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return a + i;
    }

    public final String toString() {
        StringBuilder v = b31.v("ShaderLibraryManifest(sourceUrl=", this.a, ", remoteLastModified=", this.b, ", remoteContentLength=");
        v.append(this.c);
        ej6.k(v, ", installedAtMillis=", this.d, ", installedBytes=");
        v.append(this.e);
        v.append(", fileCount=");
        v.append(this.f);
        v.append(", rootSubdirectory=");
        v.append(this.g);
        v.append(")");
        return v.toString();
    }
}
