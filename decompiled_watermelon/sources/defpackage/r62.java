package defpackage;

import android.net.Uri;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: r62  reason: default package */
/* loaded from: classes.dex */
public final class r62 {
    public final Uri a;
    public final Uri b;
    public final long c;
    public final long d;
    public final uh1 e;

    public r62(Uri uri, Uri uri2, long j, long j2, uh1 uh1Var) {
        this.a = uri;
        this.b = uri2;
        this.c = j;
        this.d = j2;
        this.e = uh1Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof r62) {
                r62 r62Var = (r62) obj;
                if (!this.a.equals(r62Var.a) || !this.b.equals(r62Var.b) || this.c != r62Var.c || this.d != r62Var.d || !this.e.equals(r62Var.e)) {
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
        return this.e.hashCode() + b31.c(this.d, b31.c(this.c, (hashCode + (this.a.hashCode() * 31)) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DirectoryFileState(uri=");
        sb.append(this.a);
        sb.append(", parentUri=");
        sb.append(this.b);
        sb.append(", lastModified=");
        sb.append(this.c);
        ej6.k(sb, ", size=", this.d, ", documentFile=");
        sb.append(this.e);
        sb.append(")");
        return sb.toString();
    }
}
