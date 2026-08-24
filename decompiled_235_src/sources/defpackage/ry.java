package defpackage;

import android.graphics.Rect;
import android.util.Size;
import java.util.UUID;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ry  reason: default package */
/* loaded from: classes.dex */
public final class ry {
    public final UUID a;
    public final int b;
    public final int c;
    public final Rect d;
    public final Size e;
    public final int f;
    public final boolean g;

    public ry(UUID uuid, int i, int i2, Rect rect, Size size, int i3, boolean z) {
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
                u34.x("Null getSize");
                throw null;
            }
            u34.x("Null getCropRect");
            throw null;
        }
        u34.x("Null getUuid");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ry) {
            ry ryVar = (ry) obj;
            if (this.a.equals(ryVar.a) && this.b == ryVar.b && this.c == ryVar.c && this.d.equals(ryVar.d) && this.e.equals(ryVar.e) && this.f == ryVar.f && this.g == ryVar.g) {
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
        StringBuilder sb = new StringBuilder("OutConfig{getUuid=");
        sb.append(this.a);
        sb.append(", getTargets=");
        sb.append(this.b);
        sb.append(", getFormat=");
        sb.append(this.c);
        sb.append(", getCropRect=");
        sb.append(this.d);
        sb.append(", getSize=");
        sb.append(this.e);
        sb.append(", getRotationDegrees=");
        sb.append(this.f);
        sb.append(", isMirroring=");
        return i61.o(sb, this.g, ", shouldRespectInputCropRect=false}");
    }
}
