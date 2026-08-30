package defpackage;

import android.graphics.Rect;
import android.util.Size;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: kx  reason: default package */
/* loaded from: classes.dex */
public final class kx {
    public final Size a;
    public final Rect b;
    public final vd0 c;
    public final int d;
    public final boolean e;

    public kx(Size size, Rect rect, vd0 vd0Var, int i, boolean z) {
        if (size != null) {
            this.a = size;
            if (rect != null) {
                this.b = rect;
                this.c = vd0Var;
                this.d = i;
                this.e = z;
                return;
            }
            c44.i("Null inputCropRect");
            throw null;
        }
        c44.i("Null inputSize");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof kx) {
            kx kxVar = (kx) obj;
            if (this.a.equals(kxVar.a) && this.b.equals(kxVar.b)) {
                vd0 vd0Var = kxVar.c;
                vd0 vd0Var2 = this.c;
                if (vd0Var2 != null ? vd0Var2.equals(vd0Var) : vd0Var == null) {
                    if (this.d == kxVar.d && this.e == kxVar.e) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i;
        int hashCode2 = (((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        vd0 vd0Var = this.c;
        if (vd0Var == null) {
            hashCode = 0;
        } else {
            hashCode = vd0Var.hashCode();
        }
        int i2 = (((hashCode2 ^ hashCode) * 1000003) ^ this.d) * 1000003;
        if (this.e) {
            i = 1231;
        } else {
            i = 1237;
        }
        return i ^ i2;
    }

    public final String toString() {
        return "CameraInputInfo{inputSize=" + this.a + ", inputCropRect=" + this.b + ", cameraInternal=" + this.c + ", rotationDegrees=" + this.d + ", mirroring=" + this.e + "}";
    }
}
