package g9;

import android.graphics.drawable.Drawable;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class d extends e {

    /* renamed from: a  reason: collision with root package name */
    public final Drawable f5611a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f5612b;

    /* renamed from: c  reason: collision with root package name */
    public final d9.f f5613c;

    public d(Drawable drawable, boolean z10, d9.f fVar) {
        this.f5611a = drawable;
        this.f5612b = z10;
        this.f5613c = fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            if (nc.k.a(this.f5611a, dVar.f5611a) && this.f5612b == dVar.f5612b && this.f5613c == dVar.f5613c) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.f5613c.hashCode() + w.d.e(this.f5611a.hashCode() * 31, this.f5612b, 31);
    }
}
