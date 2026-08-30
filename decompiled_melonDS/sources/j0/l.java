package j0;

import android.util.Size;
import java.util.HashMap;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class l {

    /* renamed from: a  reason: collision with root package name */
    public final Size f7246a;

    /* renamed from: b  reason: collision with root package name */
    public final HashMap f7247b;

    /* renamed from: c  reason: collision with root package name */
    public final Size f7248c;

    /* renamed from: d  reason: collision with root package name */
    public final HashMap f7249d;

    /* renamed from: e  reason: collision with root package name */
    public final Size f7250e;

    /* renamed from: f  reason: collision with root package name */
    public final HashMap f7251f;

    /* renamed from: g  reason: collision with root package name */
    public final HashMap f7252g;

    /* renamed from: h  reason: collision with root package name */
    public final HashMap f7253h;

    /* renamed from: i  reason: collision with root package name */
    public final HashMap f7254i;

    public l(Size size, HashMap hashMap, Size size2, HashMap hashMap2, Size size3, HashMap hashMap3, HashMap hashMap4, HashMap hashMap5, HashMap hashMap6) {
        if (size != null) {
            this.f7246a = size;
            this.f7247b = hashMap;
            if (size2 != null) {
                this.f7248c = size2;
                this.f7249d = hashMap2;
                if (size3 != null) {
                    this.f7250e = size3;
                    this.f7251f = hashMap3;
                    this.f7252g = hashMap4;
                    this.f7253h = hashMap5;
                    this.f7254i = hashMap6;
                    return;
                }
                m9.o.i("Null recordSize");
                throw null;
            }
            m9.o.i("Null previewSize");
            throw null;
        }
        m9.o.i("Null analysisSize");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof l) {
                l lVar = (l) obj;
                if (this.f7246a.equals(lVar.f7246a) && this.f7247b.equals(lVar.f7247b) && this.f7248c.equals(lVar.f7248c) && this.f7249d.equals(lVar.f7249d) && this.f7250e.equals(lVar.f7250e) && this.f7251f.equals(lVar.f7251f) && this.f7252g.equals(lVar.f7252g) && this.f7253h.equals(lVar.f7253h) && this.f7254i.equals(lVar.f7254i)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((((((((((((((this.f7246a.hashCode() ^ 1000003) * 1000003) ^ this.f7247b.hashCode()) * 1000003) ^ this.f7248c.hashCode()) * 1000003) ^ this.f7249d.hashCode()) * 1000003) ^ this.f7250e.hashCode()) * 1000003) ^ this.f7251f.hashCode()) * 1000003) ^ this.f7252g.hashCode()) * 1000003) ^ this.f7253h.hashCode()) * 1000003) ^ this.f7254i.hashCode();
    }

    public final String toString() {
        return "SurfaceSizeDefinition{analysisSize=" + this.f7246a + ", s720pSizeMap=" + this.f7247b + ", previewSize=" + this.f7248c + ", s1440pSizeMap=" + this.f7249d + ", recordSize=" + this.f7250e + ", maximumSizeMap=" + this.f7251f + ", maximum4x3SizeMap=" + this.f7252g + ", maximum16x9SizeMap=" + this.f7253h + ", ultraMaximumSizeMap=" + this.f7254i + "}";
    }
}
