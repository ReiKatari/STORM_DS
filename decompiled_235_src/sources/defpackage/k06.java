package defpackage;

import android.net.Uri;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: k06  reason: default package */
/* loaded from: classes.dex */
public final class k06 {
    public final Uri a;
    public final String b;

    public k06(Uri uri, String str) {
        str.getClass();
        this.a = uri;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof k06) {
                k06 k06Var = (k06) obj;
                if (!this.a.equals(k06Var.a) || !nb3.k(this.b, k06Var.b)) {
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
        return "SharedSaveFile(uri=" + this.a + ", fileName=" + this.b + ")";
    }
}
