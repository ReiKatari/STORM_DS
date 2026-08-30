package dg;

import java.util.List;
import nc.k;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: d  reason: collision with root package name */
    public static final int f4097d = 8;
    @va.b("backgroundId")

    /* renamed from: a  reason: collision with root package name */
    private final String f4098a;
    @va.b("backgroundMode")

    /* renamed from: b  reason: collision with root package name */
    private final String f4099b;
    @va.b("components")

    /* renamed from: c  reason: collision with root package name */
    private final List<nf.f> f4100c;

    public g(String str, String str2, List<nf.f> list) {
        str2.getClass();
        this.f4098a = str;
        this.f4099b = str2;
        this.f4100c = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ g e(g gVar, String str, String str2, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = gVar.f4098a;
        }
        if ((i2 & 2) != 0) {
            str2 = gVar.f4099b;
        }
        if ((i2 & 4) != 0) {
            list = gVar.f4100c;
        }
        return gVar.d(str, str2, list);
    }

    public final String a() {
        return this.f4098a;
    }

    public final String b() {
        return this.f4099b;
    }

    public final List<nf.f> c() {
        return this.f4100c;
    }

    public final g d(String str, String str2, List<nf.f> list) {
        str2.getClass();
        return new g(str, str2, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (k.a(this.f4098a, gVar.f4098a) && k.a(this.f4099b, gVar.f4099b) && k.a(this.f4100c, gVar.f4100c)) {
            return true;
        }
        return false;
    }

    public final String f() {
        return this.f4098a;
    }

    public final String g() {
        return this.f4099b;
    }

    public final List<nf.f> h() {
        return this.f4100c;
    }

    public int hashCode() {
        int hashCode;
        String str = this.f4098a;
        int i2 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int d4 = w.d.d(hashCode * 31, 31, this.f4099b);
        List<nf.f> list = this.f4100c;
        if (list != null) {
            i2 = list.hashCode();
        }
        return d4 + i2;
    }

    public String toString() {
        String str = this.f4098a;
        String str2 = this.f4099b;
        List<nf.f> list = this.f4100c;
        StringBuilder k10 = kc.a.k("UILayoutDto35(backgroundId=", str, ", backgroundMode=", str2, ", components=");
        k10.append(list);
        k10.append(")");
        return k10.toString();
    }
}
