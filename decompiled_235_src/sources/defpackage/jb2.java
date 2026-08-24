package defpackage;

import android.net.Uri;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: jb2  reason: default package */
/* loaded from: classes.dex */
public final class jb2 {
    public final Uri a;
    public final long b;
    public final long c;

    public jb2(Uri uri, long j, long j2) {
        uri.getClass();
        this.a = uri;
        this.b = j;
        this.c = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jb2)) {
            return false;
        }
        jb2 jb2Var = (jb2) obj;
        if (nb3.k(this.a, jb2Var.a) && this.b == jb2Var.b && this.c == jb2Var.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + i61.c(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DirectoryCacheFile(uri=");
        sb.append(this.a);
        sb.append(", lastModified=");
        sb.append(this.b);
        return lb1.r(sb, ", size=", this.c, ")");
    }
}
