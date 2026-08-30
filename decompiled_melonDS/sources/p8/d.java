package p8;

import android.net.Uri;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final Uri f11466a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f11467b;

    public d(boolean z10, Uri uri) {
        this.f11466a = uri;
        this.f11467b = z10;
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this != obj) {
            if (obj != null) {
                cls = obj.getClass();
            } else {
                cls = null;
            }
            if (d.class.equals(cls)) {
                obj.getClass();
                d dVar = (d) obj;
                if (!this.f11466a.equals(dVar.f11466a) || this.f11467b != dVar.f11467b) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f11467b) + (this.f11466a.hashCode() * 31);
    }
}
