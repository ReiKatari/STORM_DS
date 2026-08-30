package hh;

import android.net.Uri;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class d0 extends pc.a {

    /* renamed from: d  reason: collision with root package name */
    public final Uri f6514d;

    public d0(Uri uri) {
        this.f6514d = uri;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof d0) || !this.f6514d.equals(((d0) obj).f6514d)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        return this.f6514d.hashCode();
    }

    public final String toString() {
        return "RomUri(uri=" + this.f6514d + ")";
    }
}
