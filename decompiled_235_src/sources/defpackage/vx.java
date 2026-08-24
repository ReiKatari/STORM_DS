package defpackage;

import android.util.Size;
import java.util.ArrayList;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: vx  reason: default package */
/* loaded from: classes.dex */
public final class vx {
    public o33 a;
    public o33 b;
    public final o33 c = null;
    public final Size d;
    public final int e;
    public final ArrayList f;
    public final boolean g;
    public final jr1 h;
    public final jr1 i;

    public vx(Size size, int i, ArrayList arrayList, boolean z, jr1 jr1Var, jr1 jr1Var2) {
        if (size != null) {
            this.d = size;
            this.e = i;
            this.f = arrayList;
            this.g = z;
            this.h = jr1Var;
            this.i = jr1Var2;
            return;
        }
        u34.x("Null size");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof vx) {
            vx vxVar = (vx) obj;
            if (this.d.equals(vxVar.d) && this.e == vxVar.e && this.f.equals(vxVar.f) && this.g == vxVar.g && this.h == vxVar.h && this.i == vxVar.i) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = (((((this.d.hashCode() ^ 1000003) * 1000003) ^ this.e) * 1000003) ^ this.f.hashCode()) * 1000003;
        if (this.g) {
            i = 1231;
        } else {
            i = 1237;
        }
        return this.i.hashCode() ^ ((((hashCode ^ i) * 583896283) ^ this.h.hashCode()) * 1000003);
    }

    public final String toString() {
        return "In{size=" + this.d + ", inputFormat=" + this.e + ", outputFormats=" + this.f + ", virtualCamera=" + this.g + ", imageReaderProxyProvider=null, postviewSettings=null, requestEdge=" + this.h + ", errorEdge=" + this.i + "}";
    }
}
