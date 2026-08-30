package defpackage;

import android.net.Uri;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: p62  reason: default package */
/* loaded from: classes.dex */
public final class p62 {
    public final Uri a;
    public final long b;
    public final long c;

    public p62(Uri uri, long j, long j2) {
        uri.getClass();
        this.a = uri;
        this.b = j;
        this.c = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p62)) {
            return false;
        }
        p62 p62Var = (p62) obj;
        if (b53.x(this.a, p62Var.a) && this.b == p62Var.b && this.c == p62Var.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + b31.c(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DirectoryCacheFile(uri=");
        sb.append(this.a);
        sb.append(", lastModified=");
        sb.append(this.b);
        return wh1.p(sb, ", size=", this.c, ")");
    }
}
