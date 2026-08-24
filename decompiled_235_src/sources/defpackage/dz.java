package defpackage;

import android.util.Size;
import java.util.LinkedHashMap;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: dz  reason: default package */
/* loaded from: classes.dex */
public final class dz {
    public final Size a;
    public final LinkedHashMap b;
    public final Size c;
    public final LinkedHashMap d;
    public final Size e;
    public final LinkedHashMap f;
    public final LinkedHashMap g;
    public final LinkedHashMap h;
    public final LinkedHashMap i;

    public dz(Size size, LinkedHashMap linkedHashMap, Size size2, LinkedHashMap linkedHashMap2, Size size3, LinkedHashMap linkedHashMap3, LinkedHashMap linkedHashMap4, LinkedHashMap linkedHashMap5, LinkedHashMap linkedHashMap6) {
        if (size != null) {
            this.a = size;
            this.b = linkedHashMap;
            this.c = size2;
            this.d = linkedHashMap2;
            this.e = size3;
            this.f = linkedHashMap3;
            this.g = linkedHashMap4;
            this.h = linkedHashMap5;
            this.i = linkedHashMap6;
            return;
        }
        u34.x("Null analysisSize");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof dz) {
                dz dzVar = (dz) obj;
                if (this.a.equals(dzVar.a) && this.b.equals(dzVar.b) && this.c.equals(dzVar.c) && this.d.equals(dzVar.d) && this.e.equals(dzVar.e) && this.f.equals(dzVar.f) && this.g.equals(dzVar.g) && this.h.equals(dzVar.h) && this.i.equals(dzVar.i)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.i.hashCode() ^ ((((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode()) * 1000003);
    }

    public final String toString() {
        return "SurfaceSizeDefinition{analysisSize=" + this.a + ", s720pSizeMap=" + this.b + ", previewSize=" + this.c + ", s1440pSizeMap=" + this.d + ", recordSize=" + this.e + ", maximumSizeMap=" + this.f + ", maximum4x3SizeMap=" + this.g + ", maximum16x9SizeMap=" + this.h + ", ultraMaximumSizeMap=" + this.i + "}";
    }
}
