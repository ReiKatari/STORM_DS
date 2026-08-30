package zh;

import android.net.Uri;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class k extends p {

    /* renamed from: a  reason: collision with root package name */
    public final Uri f15130a;

    public k(Uri uri) {
        this.f15130a = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof k) && nc.k.a(this.f15130a, ((k) obj).f15130a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        Uri uri = this.f15130a;
        if (uri == null) {
            return 0;
        }
        return uri.hashCode();
    }

    public final String toString() {
        return "GbaSavePathUpdate(gbaSavePath=" + this.f15130a + ")";
    }
}
