package defpackage;

import android.util.Size;
import java.util.ArrayList;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: tw  reason: default package */
/* loaded from: classes.dex */
public final class tw {
    public kx2 a;
    public kx2 b;
    public final kx2 c = null;
    public final Size d;
    public final int e;
    public final ArrayList f;
    public final boolean g;
    public final dn1 h;
    public final dn1 i;

    public tw(Size size, int i, ArrayList arrayList, boolean z, dn1 dn1Var, dn1 dn1Var2) {
        if (size != null) {
            this.d = size;
            this.e = i;
            this.f = arrayList;
            this.g = z;
            this.h = dn1Var;
            this.i = dn1Var2;
            return;
        }
        c44.i("Null size");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof tw) {
            tw twVar = (tw) obj;
            if (this.d.equals(twVar.d) && this.e == twVar.e && this.f.equals(twVar.f) && this.g == twVar.g && this.h == twVar.h && this.i == twVar.i) {
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
