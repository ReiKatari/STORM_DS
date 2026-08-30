package zh;

import android.net.Uri;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class j extends p {

    /* renamed from: a  reason: collision with root package name */
    public final Uri f15129a;

    public j(Uri uri) {
        this.f15129a = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof j) && nc.k.a(this.f15129a, ((j) obj).f15129a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        Uri uri = this.f15129a;
        if (uri == null) {
            return 0;
        }
        return uri.hashCode();
    }

    public final String toString() {
        return "GbaRomPathUpdate(gbaRomPath=" + this.f15129a + ")";
    }
}
