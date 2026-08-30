package nf;

import oe.b0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class f {
    @va.b("rect")

    /* renamed from: a  reason: collision with root package name */
    private final g f10422a;
    @va.b("component")

    /* renamed from: b  reason: collision with root package name */
    private final String f10423b;
    @va.b("alpha")

    /* renamed from: c  reason: collision with root package name */
    private final Float f10424c;
    @va.b("onTop")

    /* renamed from: d  reason: collision with root package name */
    private final Boolean f10425d;

    /* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
    /* loaded from: classes.dex */
    public static final class a {
    }

    public f(g gVar, String str, Float f8, Boolean bool) {
        str.getClass();
        this.f10422a = gVar;
        this.f10423b = str;
        this.f10424c = f8;
        this.f10425d = bool;
    }

    public final ve.j a() {
        float f8;
        boolean z10;
        b0 a10 = this.f10422a.a();
        ve.c cVar = (ve.c) pc.a.t(this.f10423b, ve.c.values());
        Float f10 = this.f10424c;
        if (f10 != null) {
            f8 = f10.floatValue();
        } else {
            f8 = 1.0f;
        }
        Boolean bool = this.f10425d;
        if (bool != null) {
            z10 = bool.booleanValue();
        } else {
            z10 = false;
        }
        return new ve.j(a10, cVar, f8, z10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (nc.k.a(this.f10422a, fVar.f10422a) && nc.k.a(this.f10423b, fVar.f10423b) && nc.k.a(this.f10424c, fVar.f10424c) && nc.k.a(this.f10425d, fVar.f10425d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int d4 = w.d.d(this.f10422a.hashCode() * 31, 31, this.f10423b);
        Float f8 = this.f10424c;
        int i2 = 0;
        if (f8 == null) {
            hashCode = 0;
        } else {
            hashCode = f8.hashCode();
        }
        int i10 = (d4 + hashCode) * 31;
        Boolean bool = this.f10425d;
        if (bool != null) {
            i2 = bool.hashCode();
        }
        return i10 + i2;
    }

    public final String toString() {
        g gVar = this.f10422a;
        String str = this.f10423b;
        Float f8 = this.f10424c;
        Boolean bool = this.f10425d;
        return "PositionedLayoutComponentDto(rect=" + gVar + ", component=" + str + ", alpha=" + f8 + ", onTop=" + bool + ")";
    }
}
