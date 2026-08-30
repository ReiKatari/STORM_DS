package na;

import android.graphics.RectF;
import java.util.Arrays;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class c implements d {

    /* renamed from: a  reason: collision with root package name */
    public final float f10136a;

    public c(float f8) {
        this.f10136a = f8;
    }

    @Override // na.d
    public final float a(RectF rectF) {
        float min = Math.min(rectF.width() / 2.0f, rectF.height() / 2.0f);
        float f8 = this.f10136a;
        if (f8 < 0.0f) {
            return 0.0f;
        }
        if (f8 > min) {
            return min;
        }
        return f8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof c) && this.f10136a == ((c) obj).f10136a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f10136a)});
    }
}
