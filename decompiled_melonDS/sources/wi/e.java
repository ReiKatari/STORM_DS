package wi;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: d  reason: collision with root package name */
    public static final fj.h f14227d;

    /* renamed from: e  reason: collision with root package name */
    public static final fj.h f14228e;

    /* renamed from: f  reason: collision with root package name */
    public static final fj.h f14229f;

    /* renamed from: g  reason: collision with root package name */
    public static final fj.h f14230g;

    /* renamed from: h  reason: collision with root package name */
    public static final fj.h f14231h;

    /* renamed from: i  reason: collision with root package name */
    public static final fj.h f14232i;

    /* renamed from: a  reason: collision with root package name */
    public final fj.h f14233a;

    /* renamed from: b  reason: collision with root package name */
    public final fj.h f14234b;

    /* renamed from: c  reason: collision with root package name */
    public final int f14235c;

    static {
        fj.h hVar = fj.h.R;
        f14227d = na.f.h(":");
        f14228e = na.f.h(":status");
        f14229f = na.f.h(":method");
        f14230g = na.f.h(":path");
        f14231h = na.f.h(":scheme");
        f14232i = na.f.h(":authority");
    }

    public e(fj.h hVar, fj.h hVar2) {
        hVar.getClass();
        hVar2.getClass();
        this.f14233a = hVar;
        this.f14234b = hVar2;
        this.f14235c = hVar2.d() + hVar.d() + 32;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (nc.k.a(this.f14233a, eVar.f14233a) && nc.k.a(this.f14234b, eVar.f14234b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f14234b.hashCode() + (this.f14233a.hashCode() * 31);
    }

    public final String toString() {
        return this.f14233a.r() + ": " + this.f14234b.r();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public e(String str, String str2) {
        this(na.f.h(str), na.f.h(str2));
        fj.h hVar = fj.h.R;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public e(fj.h hVar, String str) {
        this(hVar, na.f.h(str));
        hVar.getClass();
        str.getClass();
        fj.h hVar2 = fj.h.R;
    }
}
