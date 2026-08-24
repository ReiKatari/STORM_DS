package defpackage;

import android.net.Uri;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: lz5  reason: default package */
/* loaded from: classes.dex */
public final class lz5 {
    public final Uri a;
    public final String b;
    public final String c;
    public final String d;

    public lz5(Uri uri, String str, String str2, String str3) {
        uri.getClass();
        this.a = uri;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof lz5) {
                lz5 lz5Var = (lz5) obj;
                if (!nb3.k(this.a, lz5Var.a) || !this.b.equals(lz5Var.b) || !this.c.equals(lz5Var.c) || !this.d.equals(lz5Var.d)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.d.hashCode() + xg6.d(xg6.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return "RootDirectory(uri=" + this.a + ", docId=" + this.b + ", displayName=" + this.c + ", relativePath=" + this.d + ")";
    }
}
