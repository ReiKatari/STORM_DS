package defpackage;

import android.net.Uri;
import java.util.UUID;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: n00  reason: default package */
/* loaded from: classes.dex */
public final class n00 {
    public final UUID a;
    public final String b;
    public final Uri c;

    public n00(UUID uuid, String str, Uri uri) {
        str.getClass();
        uri.getClass();
        this.a = uuid;
        this.b = str;
        this.c = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n00)) {
            return false;
        }
        n00 n00Var = (n00) obj;
        if (nb3.k(this.a, n00Var.a) && nb3.k(this.b, n00Var.b) && nb3.k(this.c, n00Var.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        UUID uuid = this.a;
        if (uuid == null) {
            hashCode = 0;
        } else {
            hashCode = uuid.hashCode();
        }
        return this.c.hashCode() + xg6.d(hashCode * 31, 31, this.b);
    }

    public final String toString() {
        return "Background(id=" + this.a + ", name=" + this.b + ", uri=" + this.c + ")";
    }
}
