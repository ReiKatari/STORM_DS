package t0;

import android.graphics.Rect;
import android.util.Size;
import java.util.UUID;
import m9.o;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final UUID f13045a;

    /* renamed from: b  reason: collision with root package name */
    public final int f13046b;

    /* renamed from: c  reason: collision with root package name */
    public final int f13047c;

    /* renamed from: d  reason: collision with root package name */
    public final Rect f13048d;

    /* renamed from: e  reason: collision with root package name */
    public final Size f13049e;

    /* renamed from: f  reason: collision with root package name */
    public final int f13050f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f13051g;

    public b(UUID uuid, int i2, int i10, Rect rect, Size size, int i11, boolean z10) {
        if (uuid != null) {
            this.f13045a = uuid;
            this.f13046b = i2;
            this.f13047c = i10;
            if (rect != null) {
                this.f13048d = rect;
                if (size != null) {
                    this.f13049e = size;
                    this.f13050f = i11;
                    this.f13051g = z10;
                    return;
                }
                o.i("Null getSize");
                throw null;
            }
            o.i("Null getCropRect");
            throw null;
        }
        o.i("Null getUuid");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f13045a.equals(bVar.f13045a) && this.f13046b == bVar.f13046b && this.f13047c == bVar.f13047c && this.f13048d.equals(bVar.f13048d) && this.f13049e.equals(bVar.f13049e) && this.f13050f == bVar.f13050f && this.f13051g == bVar.f13051g) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int i2;
        int hashCode = (((((((((((this.f13045a.hashCode() ^ 1000003) * 1000003) ^ this.f13046b) * 1000003) ^ this.f13047c) * 1000003) ^ this.f13048d.hashCode()) * 1000003) ^ this.f13049e.hashCode()) * 1000003) ^ this.f13050f) * 1000003;
        if (this.f13051g) {
            i2 = 1231;
        } else {
            i2 = 1237;
        }
        return ((hashCode ^ i2) * 1000003) ^ 1237;
    }

    public final String toString() {
        return "OutConfig{getUuid=" + this.f13045a + ", getTargets=" + this.f13046b + ", getFormat=" + this.f13047c + ", getCropRect=" + this.f13048d + ", getSize=" + this.f13049e + ", getRotationDegrees=" + this.f13050f + ", isMirroring=" + this.f13051g + ", shouldRespectInputCropRect=false}";
    }
}
