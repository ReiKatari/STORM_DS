package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: zo5  reason: default package */
/* loaded from: classes.dex */
public final class zo5 {
    public final String a;
    public final String b;
    public final long c;
    public final long d;
    public final long e;
    public final int f;
    public final String g;

    public zo5(String str, String str2, long j, long j2, long j3, int i, String str3) {
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
            if (obj instanceof zo5) {
                zo5 zo5Var = (zo5) obj;
                if (!this.a.equals(zo5Var.a) || !nb3.k(this.b, zo5Var.b) || this.c != zo5Var.c || this.d != zo5Var.d || this.e != zo5Var.e || this.f != zo5Var.f || !nb3.k(this.g, zo5Var.g)) {
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
        int a = lb1.a(this.f, i61.c(this.e, i61.c(this.d, i61.c(this.c, (hashCode2 + hashCode) * 31, 31), 31), 31), 31);
        String str2 = this.g;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return a + i;
    }

    public final String toString() {
        StringBuilder u = i61.u("ShaderLibraryManifest(sourceUrl=", this.a, ", remoteLastModified=", this.b, ", remoteContentLength=");
        u.append(this.c);
        xg6.B(u, ", installedAtMillis=", this.d, ", installedBytes=");
        u.append(this.e);
        u.append(", fileCount=");
        u.append(this.f);
        u.append(", rootSubdirectory=");
        u.append(this.g);
        u.append(")");
        return u.toString();
    }
}
