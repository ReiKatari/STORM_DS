package d0;

import android.graphics.Rect;
import android.util.Size;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public final Size f3388a;

    /* renamed from: b  reason: collision with root package name */
    public final Rect f3389b;

    /* renamed from: c  reason: collision with root package name */
    public final j0.d0 f3390c;

    /* renamed from: d  reason: collision with root package name */
    public final int f3391d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f3392e;

    public h(Size size, Rect rect, j0.d0 d0Var, int i2, boolean z10) {
        if (size != null) {
            this.f3388a = size;
            if (rect != null) {
                this.f3389b = rect;
                this.f3390c = d0Var;
                this.f3391d = i2;
                this.f3392e = z10;
                return;
            }
            m9.o.i("Null inputCropRect");
            throw null;
        }
        m9.o.i("Null inputSize");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (this.f3388a.equals(hVar.f3388a) && this.f3389b.equals(hVar.f3389b)) {
                j0.d0 d0Var = hVar.f3390c;
                j0.d0 d0Var2 = this.f3390c;
                if (d0Var2 != null ? d0Var2.equals(d0Var) : d0Var == null) {
                    if (this.f3391d == hVar.f3391d && this.f3392e == hVar.f3392e) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i2;
        int hashCode2 = (((this.f3388a.hashCode() ^ 1000003) * 1000003) ^ this.f3389b.hashCode()) * 1000003;
        j0.d0 d0Var = this.f3390c;
        if (d0Var == null) {
            hashCode = 0;
        } else {
            hashCode = d0Var.hashCode();
        }
        int i10 = (((hashCode2 ^ hashCode) * 1000003) ^ this.f3391d) * 1000003;
        if (this.f3392e) {
            i2 = 1231;
        } else {
            i2 = 1237;
        }
        return i10 ^ i2;
    }

    public final String toString() {
        return "CameraInputInfo{inputSize=" + this.f3388a + ", inputCropRect=" + this.f3389b + ", cameraInternal=" + this.f3390c + ", rotationDegrees=" + this.f3391d + ", mirroring=" + this.f3392e + "}";
    }
}
