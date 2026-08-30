package d9;

import android.graphics.drawable.BitmapDrawable;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    public final BitmapDrawable f4020a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f4021b;

    public g(BitmapDrawable bitmapDrawable, boolean z10) {
        this.f4020a = bitmapDrawable;
        this.f4021b = z10;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof g) {
                g gVar = (g) obj;
                if (this.f4020a.equals(gVar.f4020a) && this.f4021b == gVar.f4021b) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f4021b) + (this.f4020a.hashCode() * 31);
    }
}
