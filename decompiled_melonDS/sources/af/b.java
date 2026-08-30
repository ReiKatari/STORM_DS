package af;

import android.net.Uri;
import nc.k;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class b extends a.a {

    /* renamed from: b  reason: collision with root package name */
    public final Uri f712b;

    /* renamed from: c  reason: collision with root package name */
    public final Uri f713c;

    public b(Uri uri, Uri uri2) {
        this.f712b = uri;
        this.f713c = uri2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (k.a(this.f712b, bVar.f712b) && k.a(this.f713c, bVar.f713c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i2 = 0;
        Uri uri = this.f712b;
        if (uri == null) {
            hashCode = 0;
        } else {
            hashCode = uri.hashCode();
        }
        int i10 = hashCode * 31;
        Uri uri2 = this.f713c;
        if (uri2 != null) {
            i2 = uri2.hashCode();
        }
        return i10 + i2;
    }

    public final String toString() {
        return "GbaRom(romPath=" + this.f712b + ", savePath=" + this.f713c + ")";
    }
}
