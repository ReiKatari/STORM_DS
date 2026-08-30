package d0;

import android.graphics.Matrix;
import j0.h2;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class g implements t0 {

    /* renamed from: a  reason: collision with root package name */
    public final h2 f3376a;

    /* renamed from: b  reason: collision with root package name */
    public final long f3377b;

    /* renamed from: c  reason: collision with root package name */
    public final int f3378c;

    /* renamed from: d  reason: collision with root package name */
    public final Matrix f3379d;

    /* renamed from: e  reason: collision with root package name */
    public final int f3380e;

    public g(h2 h2Var, long j2, int i2, Matrix matrix, int i10) {
        if (h2Var != null) {
            this.f3376a = h2Var;
            this.f3377b = j2;
            this.f3378c = i2;
            this.f3379d = matrix;
            this.f3380e = i10;
            return;
        }
        m9.o.i("Null tagBundle");
        throw null;
    }

    @Override // d0.t0
    public final h2 a() {
        return this.f3376a;
    }

    @Override // d0.t0
    public final int b() {
        return this.f3380e;
    }

    @Override // d0.t0
    public final long c() {
        return this.f3377b;
    }

    @Override // d0.t0
    public final int d() {
        return this.f3378c;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof g) {
                g gVar = (g) obj;
                if (this.f3376a.equals(gVar.f3376a) && this.f3377b == gVar.f3377b && this.f3378c == gVar.f3378c && this.f3379d.equals(gVar.f3379d) && this.f3380e == gVar.f3380e) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j2 = this.f3377b;
        return ((((((((this.f3376a.hashCode() ^ 1000003) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.f3378c) * 1000003) ^ this.f3379d.hashCode()) * 1000003) ^ this.f3380e;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ImmutableImageInfo{tagBundle=");
        sb2.append(this.f3376a);
        sb2.append(", timestamp=");
        sb2.append(this.f3377b);
        sb2.append(", rotationDegrees=");
        sb2.append(this.f3378c);
        sb2.append(", sensorToBufferTransformMatrix=");
        sb2.append(this.f3379d);
        sb2.append(", flashState=");
        return w.d.q(sb2, this.f3380e, "}");
    }
}
