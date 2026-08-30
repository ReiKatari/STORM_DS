package d3;

import d2.t;
import nc.k;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final int f3805a;

    /* renamed from: b  reason: collision with root package name */
    public final long f3806b;

    /* renamed from: c  reason: collision with root package name */
    public final g f3807c;

    /* renamed from: d  reason: collision with root package name */
    public final t f3808d;

    public f(int i2, long j2, g gVar, t tVar) {
        this.f3805a = i2;
        this.f3806b = j2;
        this.f3807c = gVar;
        this.f3808d = tVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (this.f3805a == fVar.f3805a && this.f3806b == fVar.f3806b && this.f3807c == fVar.f3807c && k.a(this.f3808d, fVar.f3808d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.f3807c.hashCode() + w.d.f(this.f3806b, Integer.hashCode(this.f3805a) * 31, 31)) * 31;
        t tVar = this.f3808d;
        if (tVar == null) {
            hashCode = 0;
        } else {
            hashCode = tVar.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final String toString() {
        return "ContentCaptureEvent(id=" + this.f3805a + ", timestamp=" + this.f3806b + ", type=" + this.f3807c + ", structureCompat=" + this.f3808d + ')';
    }
}
