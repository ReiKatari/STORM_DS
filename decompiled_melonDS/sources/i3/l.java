package i3;

import android.graphics.ColorFilter;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class l {

    /* renamed from: a  reason: collision with root package name */
    public final ColorFilter f6653a;

    /* renamed from: b  reason: collision with root package name */
    public final long f6654b;

    /* renamed from: c  reason: collision with root package name */
    public final int f6655c;

    public l(int i2, long j2) {
        ColorFilter porterDuffColorFilter;
        if (Build.VERSION.SDK_INT >= 29) {
            a.d();
            porterDuffColorFilter = a.c(z.y(j2), z.v(i2));
        } else {
            porterDuffColorFilter = new PorterDuffColorFilter(z.y(j2), z.C(i2));
        }
        this.f6653a = porterDuffColorFilter;
        this.f6654b = j2;
        this.f6655c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        if (s.c(this.f6654b, lVar.f6654b) && this.f6655c == lVar.f6655c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i2 = s.f6688i;
        return Integer.hashCode(this.f6655c) + (Long.hashCode(this.f6654b) * 31);
    }

    public final String toString() {
        return "BlendModeColorFilter(color=" + ((Object) s.i(this.f6654b)) + ", blendMode=" + ((Object) z.D(this.f6655c)) + ')';
    }
}
