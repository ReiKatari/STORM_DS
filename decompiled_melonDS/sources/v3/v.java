package v3;

import java.util.ArrayList;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class v {

    /* renamed from: a  reason: collision with root package name */
    public final long f13708a;

    /* renamed from: b  reason: collision with root package name */
    public final long f13709b;

    /* renamed from: c  reason: collision with root package name */
    public final long f13710c;

    /* renamed from: d  reason: collision with root package name */
    public final long f13711d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f13712e;

    /* renamed from: f  reason: collision with root package name */
    public final float f13713f;

    /* renamed from: g  reason: collision with root package name */
    public final int f13714g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f13715h;

    /* renamed from: i  reason: collision with root package name */
    public final ArrayList f13716i;

    /* renamed from: j  reason: collision with root package name */
    public final long f13717j;

    /* renamed from: k  reason: collision with root package name */
    public final long f13718k;

    public v(long j2, long j10, long j11, long j12, boolean z10, float f8, int i2, boolean z11, ArrayList arrayList, long j13, long j14) {
        this.f13708a = j2;
        this.f13709b = j10;
        this.f13710c = j11;
        this.f13711d = j12;
        this.f13712e = z10;
        this.f13713f = f8;
        this.f13714g = i2;
        this.f13715h = z11;
        this.f13716i = arrayList;
        this.f13717j = j13;
        this.f13718k = j14;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof v) {
                v vVar = (v) obj;
                if (s.e(this.f13708a, vVar.f13708a) && this.f13709b == vVar.f13709b && h3.b.b(this.f13710c, vVar.f13710c) && h3.b.b(this.f13711d, vVar.f13711d) && this.f13712e == vVar.f13712e && Float.compare(this.f13713f, vVar.f13713f) == 0 && this.f13714g == vVar.f13714g && this.f13715h == vVar.f13715h && this.f13716i.equals(vVar.f13716i) && h3.b.b(this.f13717j, vVar.f13717j) && h3.b.b(this.f13718k, vVar.f13718k)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int e6 = w.d.e(w.d.c(this.f13714g, w.d.b(this.f13713f, w.d.e(w.d.f(this.f13711d, w.d.f(this.f13710c, w.d.f(this.f13709b, Long.hashCode(this.f13708a) * 31, 31), 31), 31), this.f13712e, 31), 31), 31), this.f13715h, 31);
        return Long.hashCode(this.f13718k) + w.d.f(this.f13717j, (this.f13716i.hashCode() + e6) * 31, 31);
    }

    public final String toString() {
        return "PointerInputEventData(id=" + ((Object) s.i(this.f13708a)) + ", uptime=" + this.f13709b + ", positionOnScreen=" + ((Object) h3.b.g(this.f13710c)) + ", position=" + ((Object) h3.b.g(this.f13711d)) + ", down=" + this.f13712e + ", pressure=" + this.f13713f + ", type=" + ((Object) y.a(this.f13714g)) + ", activeHover=" + this.f13715h + ", historical=" + this.f13716i + ", scrollDelta=" + ((Object) h3.b.g(this.f13717j)) + ", originalEventPosition=" + ((Object) h3.b.g(this.f13718k)) + ')';
    }
}
