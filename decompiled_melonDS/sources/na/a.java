package na;

import android.graphics.RectF;
import java.util.Arrays;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class a implements d {

    /* renamed from: a  reason: collision with root package name */
    public final float f10116a;

    public a(float f8) {
        this.f10116a = f8;
    }

    @Override // na.d
    public final float a(RectF rectF) {
        return this.f10116a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof a) && this.f10116a == ((a) obj).f10116a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f10116a)});
    }

    public final String toString() {
        return this.f10116a + "px";
    }
}
