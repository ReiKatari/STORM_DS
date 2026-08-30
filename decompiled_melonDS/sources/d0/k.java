package d0;

import android.graphics.Matrix;
import android.graphics.Rect;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: a  reason: collision with root package name */
    public final Rect f3408a;

    /* renamed from: b  reason: collision with root package name */
    public final int f3409b;

    /* renamed from: c  reason: collision with root package name */
    public final int f3410c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f3411d;

    /* renamed from: e  reason: collision with root package name */
    public final Matrix f3412e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f3413f;

    public k(Rect rect, int i2, int i10, boolean z10, Matrix matrix, boolean z11) {
        if (rect != null) {
            this.f3408a = rect;
            this.f3409b = i2;
            this.f3410c = i10;
            this.f3411d = z10;
            if (matrix != null) {
                this.f3412e = matrix;
                this.f3413f = z11;
                return;
            }
            m9.o.i("Null getSensorToBufferTransform");
            throw null;
        }
        m9.o.i("Null getCropRect");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof k) {
            k kVar = (k) obj;
            if (this.f3408a.equals(kVar.f3408a) && this.f3409b == kVar.f3409b && this.f3410c == kVar.f3410c && this.f3411d == kVar.f3411d && this.f3412e.equals(kVar.f3412e) && this.f3413f == kVar.f3413f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i2;
        int hashCode = (((((this.f3408a.hashCode() ^ 1000003) * 1000003) ^ this.f3409b) * 1000003) ^ this.f3410c) * 1000003;
        int i10 = 1237;
        if (this.f3411d) {
            i2 = 1231;
        } else {
            i2 = 1237;
        }
        int hashCode2 = (((hashCode ^ i2) * 1000003) ^ this.f3412e.hashCode()) * 1000003;
        if (this.f3413f) {
            i10 = 1231;
        }
        return hashCode2 ^ i10;
    }

    public final String toString() {
        return "TransformationInfo{getCropRect=" + this.f3408a + ", getRotationDegrees=" + this.f3409b + ", getTargetRotation=" + this.f3410c + ", hasCameraTransform=" + this.f3411d + ", getSensorToBufferTransform=" + this.f3412e + ", isMirroring=" + this.f3413f + "}";
    }
}
