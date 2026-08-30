package bg;

import nc.k;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: e  reason: collision with root package name */
    public static final int f2225e = 0;
    @va.b("runtimeConsoleType")

    /* renamed from: a  reason: collision with root package name */
    private final af.f f2226a;
    @va.b("runtimeMicSource")

    /* renamed from: b  reason: collision with root package name */
    private final af.h f2227b;
    @va.b("layoutId")

    /* renamed from: c  reason: collision with root package name */
    private final String f2228c;
    @va.b("gbaSlotConfig")

    /* renamed from: d  reason: collision with root package name */
    private final h f2229d;

    public e(af.f fVar, af.h hVar, String str, h hVar2) {
        fVar.getClass();
        hVar.getClass();
        hVar2.getClass();
        this.f2226a = fVar;
        this.f2227b = hVar;
        this.f2228c = str;
        this.f2229d = hVar2;
    }

    public static /* synthetic */ e f(e eVar, af.f fVar, af.h hVar, String str, h hVar2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            fVar = eVar.f2226a;
        }
        if ((i2 & 2) != 0) {
            hVar = eVar.f2227b;
        }
        if ((i2 & 4) != 0) {
            str = eVar.f2228c;
        }
        if ((i2 & 8) != 0) {
            hVar2 = eVar.f2229d;
        }
        return eVar.e(fVar, hVar, str, hVar2);
    }

    public final af.f a() {
        return this.f2226a;
    }

    public final af.h b() {
        return this.f2227b;
    }

    public final String c() {
        return this.f2228c;
    }

    public final h d() {
        return this.f2229d;
    }

    public final e e(af.f fVar, af.h hVar, String str, h hVar2) {
        fVar.getClass();
        hVar.getClass();
        hVar2.getClass();
        return new e(fVar, hVar, str, hVar2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (this.f2226a == eVar.f2226a && this.f2227b == eVar.f2227b && k.a(this.f2228c, eVar.f2228c) && k.a(this.f2229d, eVar.f2229d)) {
            return true;
        }
        return false;
    }

    public final h g() {
        return this.f2229d;
    }

    public final String h() {
        return this.f2228c;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = (this.f2227b.hashCode() + (this.f2226a.hashCode() * 31)) * 31;
        String str = this.f2228c;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return this.f2229d.hashCode() + ((hashCode2 + hashCode) * 31);
    }

    public final af.f i() {
        return this.f2226a;
    }

    public final af.h j() {
        return this.f2227b;
    }

    public String toString() {
        af.f fVar = this.f2226a;
        af.h hVar = this.f2227b;
        String str = this.f2228c;
        h hVar2 = this.f2229d;
        return "RomConfigDto31(runtimeConsoleType=" + fVar + ", runtimeMicSource=" + hVar + ", layoutId=" + str + ", gbaSlotConfig=" + hVar2 + ")";
    }
}
