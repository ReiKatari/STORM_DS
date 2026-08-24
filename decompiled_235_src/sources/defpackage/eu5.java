package defpackage;

import android.net.Uri;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: eu5  reason: default package */
/* loaded from: classes.dex */
public final class eu5 extends tu5 {
    public final Uri a;

    public eu5(Uri uri) {
        this.a = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof eu5) && nb3.k(this.a, ((eu5) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        Uri uri = this.a;
        if (uri == null) {
            return 0;
        }
        return uri.hashCode();
    }

    public final String toString() {
        return "GbaRomPathUpdate(gbaRomPath=" + this.a + ")";
    }
}
