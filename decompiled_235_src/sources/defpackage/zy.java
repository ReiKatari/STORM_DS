package defpackage;

import android.graphics.Rect;
import android.util.Size;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: zy  reason: default package */
/* loaded from: classes.dex */
public final class zy {
    public final Size a;
    public final Rect b;
    public final eg0 c;
    public final int d;
    public final boolean e;

    public zy(Size size, Rect rect, eg0 eg0Var, int i, boolean z) {
        if (size != null) {
            this.a = size;
            if (rect != null) {
                this.b = rect;
                this.c = eg0Var;
                this.d = i;
                this.e = z;
                return;
            }
            u34.x("Null inputCropRect");
            throw null;
        }
        u34.x("Null inputSize");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zy) {
            zy zyVar = (zy) obj;
            if (this.a.equals(zyVar.a) && this.b.equals(zyVar.b)) {
                eg0 eg0Var = zyVar.c;
                eg0 eg0Var2 = this.c;
                if (eg0Var2 != null ? eg0Var2.equals(eg0Var) : eg0Var == null) {
                    if (this.d == zyVar.d && this.e == zyVar.e) {
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
        eg0 eg0Var = this.c;
        if (eg0Var == null) {
            hashCode = 0;
        } else {
            hashCode = eg0Var.hashCode();
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
        StringBuilder sb = new StringBuilder("CameraInputInfo{inputSize=");
        sb.append(this.a);
        sb.append(", inputCropRect=");
        sb.append(this.b);
        sb.append(", cameraInternal=");
        sb.append(this.c);
        sb.append(", rotationDegrees=");
        sb.append(this.d);
        sb.append(", mirroring=");
        return i61.o(sb, this.e, "}");
    }
}
