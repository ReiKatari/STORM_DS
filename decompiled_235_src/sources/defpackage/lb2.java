package defpackage;

import android.net.Uri;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: lb2  reason: default package */
/* loaded from: classes.dex */
public final class lb2 {
    public final Uri a;
    public final Uri b;
    public final long c;
    public final long d;
    public final zl1 e;

    public lb2(Uri uri, Uri uri2, long j, long j2, zl1 zl1Var) {
        this.a = uri;
        this.b = uri2;
        this.c = j;
        this.d = j2;
        this.e = zl1Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof lb2) {
                lb2 lb2Var = (lb2) obj;
                if (!this.a.equals(lb2Var.a) || !this.b.equals(lb2Var.b) || this.c != lb2Var.c || this.d != lb2Var.d || !this.e.equals(lb2Var.e)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        return this.e.hashCode() + i61.c(this.d, i61.c(this.c, (hashCode + (this.a.hashCode() * 31)) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DirectoryFileState(uri=");
        sb.append(this.a);
        sb.append(", parentUri=");
        sb.append(this.b);
        sb.append(", lastModified=");
        sb.append(this.c);
        xg6.B(sb, ", size=", this.d, ", documentFile=");
        sb.append(this.e);
        sb.append(")");
        return sb.toString();
    }
}
