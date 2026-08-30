package i0;

import android.util.Size;
import d0.p1;
import java.util.ArrayList;
import m9.o;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public p1 f6594a;

    /* renamed from: b  reason: collision with root package name */
    public p1 f6595b;

    /* renamed from: c  reason: collision with root package name */
    public final p1 f6596c = null;

    /* renamed from: d  reason: collision with root package name */
    public final Size f6597d;

    /* renamed from: e  reason: collision with root package name */
    public final int f6598e;

    /* renamed from: f  reason: collision with root package name */
    public final ArrayList f6599f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f6600g;

    /* renamed from: h  reason: collision with root package name */
    public final r0.e f6601h;

    /* renamed from: i  reason: collision with root package name */
    public final r0.e f6602i;

    public a(Size size, int i2, ArrayList arrayList, boolean z10, r0.e eVar, r0.e eVar2) {
        if (size != null) {
            this.f6597d = size;
            this.f6598e = i2;
            this.f6599f = arrayList;
            this.f6600g = z10;
            this.f6601h = eVar;
            this.f6602i = eVar2;
            return;
        }
        o.i("Null size");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (this.f6597d.equals(aVar.f6597d) && this.f6598e == aVar.f6598e && this.f6599f.equals(aVar.f6599f) && this.f6600g == aVar.f6600g && this.f6601h.equals(aVar.f6601h) && this.f6602i.equals(aVar.f6602i)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i2;
        int hashCode = (((((this.f6597d.hashCode() ^ 1000003) * 1000003) ^ this.f6598e) * 1000003) ^ this.f6599f.hashCode()) * 1000003;
        if (this.f6600g) {
            i2 = 1231;
        } else {
            i2 = 1237;
        }
        return ((((hashCode ^ i2) * 583896283) ^ this.f6601h.hashCode()) * 1000003) ^ this.f6602i.hashCode();
    }

    public final String toString() {
        return "In{size=" + this.f6597d + ", inputFormat=" + this.f6598e + ", outputFormats=" + this.f6599f + ", virtualCamera=" + this.f6600g + ", imageReaderProxyProvider=null, postviewSettings=null, requestEdge=" + this.f6601h + ", errorEdge=" + this.f6602i + "}";
    }
}
