package defpackage;

import android.util.Range;
import android.util.Size;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: px  reason: default package */
/* loaded from: classes.dex */
public final class px {
    public final jv6 a;
    public final int b;
    public final Size c;
    public final yq1 d;
    public final List e;
    public final yy0 f;
    public final int g;
    public final Range h;
    public final boolean i;
    public final int j;

    public px(jv6 jv6Var, int i, Size size, yq1 yq1Var, List list, yy0 yy0Var, int i2, Range range, boolean z, int i3) {
        this.a = jv6Var;
        this.b = i;
        this.c = size;
        if (yq1Var != null) {
            this.d = yq1Var;
            this.e = list;
            this.f = yy0Var;
            this.g = i2;
            if (range != null) {
                this.h = range;
                this.i = z;
                this.j = i3;
                return;
            }
            u34.x("Null targetFrameRate");
            throw null;
        }
        u34.x("Null dynamicRange");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof px) {
                px pxVar = (px) obj;
                if (this.a.equals(pxVar.a) && this.b == pxVar.b && this.c.equals(pxVar.c) && this.d.equals(pxVar.d) && this.e.equals(pxVar.e)) {
                    yy0 yy0Var = pxVar.f;
                    yy0 yy0Var2 = this.f;
                    if (yy0Var2 == null) {
                        if (yy0Var != null) {
                            return false;
                        }
                    } else if (!yy0Var2.equals(yy0Var)) {
                        return false;
                    }
                    if (this.g == pxVar.g && this.h.equals(pxVar.h) && this.i == pxVar.i && this.j == pxVar.j) {
                        return true;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int i;
        int hashCode2 = (((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003;
        yy0 yy0Var = this.f;
        if (yy0Var == null) {
            hashCode = 0;
        } else {
            hashCode = yy0Var.hashCode();
        }
        int hashCode3 = (((((hashCode2 ^ hashCode) * 1000003) ^ this.g) * 1000003) ^ this.h.hashCode()) * 1000003;
        if (this.i) {
            i = 1231;
        } else {
            i = 1237;
        }
        return this.j ^ ((hashCode3 ^ i) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AttachedSurfaceInfo{surfaceConfig=");
        sb.append(this.a);
        sb.append(", imageFormat=");
        sb.append(this.b);
        sb.append(", size=");
        sb.append(this.c);
        sb.append(", dynamicRange=");
        sb.append(this.d);
        sb.append(", captureTypes=");
        sb.append(this.e);
        sb.append(", implementationOptions=");
        sb.append(this.f);
        sb.append(", sessionType=");
        sb.append(this.g);
        sb.append(", targetFrameRate=");
        sb.append(this.h);
        sb.append(", strictFrameRateRequired=");
        sb.append(this.i);
        sb.append(", customMaxFrameRate=");
        return lb1.o(sb, this.j, "}");
    }
}
