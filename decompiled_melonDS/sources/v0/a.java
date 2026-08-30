package v0;

import android.graphics.Rect;
import android.util.Size;
import nc.k;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final Rect f13574a;

    /* renamed from: b  reason: collision with root package name */
    public final Size f13575b;

    /* renamed from: c  reason: collision with root package name */
    public final Size f13576c;

    public a(Rect rect, Size size, Size size2) {
        size.getClass();
        size2.getClass();
        this.f13574a = rect;
        this.f13575b = size;
        this.f13576c = size2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (!this.f13574a.equals(aVar.f13574a) || !k.a(this.f13575b, aVar.f13575b) || !k.a(this.f13576c, aVar.f13576c)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.f13575b.hashCode();
        return this.f13576c.hashCode() + ((hashCode + (this.f13574a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "PreferredChildSize(cropRectBeforeScaling=" + this.f13574a + ", childSizeToScale=" + this.f13575b + ", originalSelectedChildSize=" + this.f13576c + ')';
    }
}
