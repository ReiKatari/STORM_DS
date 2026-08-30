package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: nx  reason: default package */
/* loaded from: classes.dex */
public final class nx {
    public final Rect a;
    public final int b;
    public final int c;
    public final boolean d;
    public final Matrix e;
    public final boolean f;

    public nx(Rect rect, int i, int i2, boolean z, Matrix matrix, boolean z2) {
        if (rect != null) {
            this.a = rect;
            this.b = i;
            this.c = i2;
            this.d = z;
            if (matrix != null) {
                this.e = matrix;
                this.f = z2;
                return;
            }
            c44.i("Null getSensorToBufferTransform");
            throw null;
        }
        c44.i("Null getCropRect");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof nx) {
            nx nxVar = (nx) obj;
            if (this.a.equals(nxVar.a) && this.b == nxVar.b && this.c == nxVar.c && this.d == nxVar.d && this.e.equals(nxVar.e) && this.f == nxVar.f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = (((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c) * 1000003;
        int i2 = 1237;
        if (this.d) {
            i = 1231;
        } else {
            i = 1237;
        }
        int hashCode2 = (((hashCode ^ i) * 1000003) ^ this.e.hashCode()) * 1000003;
        if (this.f) {
            i2 = 1231;
        }
        return hashCode2 ^ i2;
    }

    public final String toString() {
        return "TransformationInfo{getCropRect=" + this.a + ", getRotationDegrees=" + this.b + ", getTargetRotation=" + this.c + ", hasCameraTransform=" + this.d + ", getSensorToBufferTransform=" + this.e + ", isMirroring=" + this.f + "}";
    }
}
