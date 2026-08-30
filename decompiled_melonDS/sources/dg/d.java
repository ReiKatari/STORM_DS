package dg;

import nc.k;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: c  reason: collision with root package name */
    public static final int f4085c = 0;
    @va.b("a")

    /* renamed from: a  reason: collision with root package name */
    private final e f4086a;
    @va.b("b")

    /* renamed from: b  reason: collision with root package name */
    private final String f4087b;

    public d(e eVar, String str) {
        eVar.getClass();
        str.getClass();
        this.f4086a = eVar;
        this.f4087b = str;
    }

    public static /* synthetic */ d d(d dVar, e eVar, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            eVar = dVar.f4086a;
        }
        if ((i2 & 2) != 0) {
            str = dVar.f4087b;
        }
        return dVar.c(eVar, str);
    }

    public final e a() {
        return this.f4086a;
    }

    public final String b() {
        return this.f4087b;
    }

    public final d c(e eVar, String str) {
        eVar.getClass();
        str.getClass();
        return new d(eVar, str);
    }

    public final String e() {
        return this.f4087b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (k.a(this.f4086a, dVar.f4086a) && k.a(this.f4087b, dVar.f4087b)) {
            return true;
        }
        return false;
    }

    public final e f() {
        return this.f4086a;
    }

    public int hashCode() {
        return this.f4087b.hashCode() + (this.f4086a.hashCode() * 31);
    }

    public String toString() {
        e eVar = this.f4086a;
        String str = this.f4087b;
        return "PositionedLayoutComponent25(rect=" + eVar + ", component=" + str + ")";
    }
}
