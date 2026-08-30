package defpackage;

import android.graphics.Rect;
import android.util.Size;
import java.util.UUID;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: fx  reason: default package */
/* loaded from: classes.dex */
public final class fx {
    public final UUID a;
    public final int b;
    public final int c;
    public final Rect d;
    public final Size e;
    public final int f;
    public final boolean g;

    public fx(UUID uuid, int i, int i2, Rect rect, Size size, int i3, boolean z) {
        if (uuid != null) {
            this.a = uuid;
            this.b = i;
            this.c = i2;
            if (rect != null) {
                this.d = rect;
                if (size != null) {
                    this.e = size;
                    this.f = i3;
                    this.g = z;
                    return;
                }
                c44.i("Null getSize");
                throw null;
            }
            c44.i("Null getCropRect");
            throw null;
        }
        c44.i("Null getUuid");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof fx) {
            fx fxVar = (fx) obj;
            if (this.a.equals(fxVar.a) && this.b == fxVar.b && this.c == fxVar.c && this.d.equals(fxVar.d) && this.e.equals(fxVar.e) && this.f == fxVar.f && this.g == fxVar.g) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = (((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f) * 1000003;
        if (this.g) {
            i = 1231;
        } else {
            i = 1237;
        }
        return ((i ^ hashCode) * 1000003) ^ 1237;
    }

    public final String toString() {
        return "OutConfig{getUuid=" + this.a + ", getTargets=" + this.b + ", getFormat=" + this.c + ", getCropRect=" + this.d + ", getSize=" + this.e + ", getRotationDegrees=" + this.f + ", isMirroring=" + this.g + ", shouldRespectInputCropRect=false}";
    }
}
