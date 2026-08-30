package nf;

import ve.n;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class j {
    @va.b("mainScreenLayoutDto")

    /* renamed from: a  reason: collision with root package name */
    private final i f10436a;
    @va.b("secondaryScreenLayoutDto")

    /* renamed from: b  reason: collision with root package name */
    private final i f10437b;

    /* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
    /* loaded from: classes.dex */
    public static final class a {
    }

    public j(i iVar, i iVar2) {
        this.f10436a = iVar;
        this.f10437b = iVar2;
    }

    public final n a() {
        return new n(this.f10436a.a(), this.f10437b.a());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        if (nc.k.a(this.f10436a, jVar.f10436a) && nc.k.a(this.f10437b, jVar.f10437b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f10437b.hashCode() + (this.f10436a.hashCode() * 31);
    }

    public final String toString() {
        i iVar = this.f10436a;
        i iVar2 = this.f10437b;
        return "UILayoutDto(mainScreenLayout=" + iVar + ", secondaryScreenLayout=" + iVar2 + ")";
    }
}
