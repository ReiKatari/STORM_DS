package defpackage;

import android.util.Size;
import java.util.LinkedHashMap;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ox  reason: default package */
/* loaded from: classes.dex */
public final class ox {
    public final Size a;
    public final LinkedHashMap b;
    public final Size c;
    public final LinkedHashMap d;
    public final Size e;
    public final LinkedHashMap f;
    public final LinkedHashMap g;
    public final LinkedHashMap h;
    public final LinkedHashMap i;

    public ox(Size size, LinkedHashMap linkedHashMap, Size size2, LinkedHashMap linkedHashMap2, Size size3, LinkedHashMap linkedHashMap3, LinkedHashMap linkedHashMap4, LinkedHashMap linkedHashMap5, LinkedHashMap linkedHashMap6) {
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
        c44.i("Null analysisSize");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof ox) {
                ox oxVar = (ox) obj;
                if (this.a.equals(oxVar.a) && this.b.equals(oxVar.b) && this.c.equals(oxVar.c) && this.d.equals(oxVar.d) && this.e.equals(oxVar.e) && this.f.equals(oxVar.f) && this.g.equals(oxVar.g) && this.h.equals(oxVar.h) && this.i.equals(oxVar.i)) {
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
