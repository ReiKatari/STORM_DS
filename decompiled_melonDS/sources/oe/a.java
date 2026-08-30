package oe;

import android.net.Uri;
import java.util.UUID;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final UUID f10905a;

    /* renamed from: b  reason: collision with root package name */
    public final String f10906b;

    /* renamed from: c  reason: collision with root package name */
    public final Uri f10907c;

    public a(UUID uuid, String str, Uri uri) {
        str.getClass();
        uri.getClass();
        this.f10905a = uuid;
        this.f10906b = str;
        this.f10907c = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (nc.k.a(this.f10905a, aVar.f10905a) && nc.k.a(this.f10906b, aVar.f10906b) && nc.k.a(this.f10907c, aVar.f10907c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        UUID uuid = this.f10905a;
        if (uuid == null) {
            hashCode = 0;
        } else {
            hashCode = uuid.hashCode();
        }
        return this.f10907c.hashCode() + w.d.d(hashCode * 31, 31, this.f10906b);
    }

    public final String toString() {
        return "Background(id=" + this.f10905a + ", name=" + this.f10906b + ", uri=" + this.f10907c + ")";
    }
}
