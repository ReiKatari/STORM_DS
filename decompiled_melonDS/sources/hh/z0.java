package hh;

import java.net.URL;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class z0 extends a1 {

    /* renamed from: a  reason: collision with root package name */
    public final URL f6590a;

    public z0(URL url) {
        this.f6590a = url;
    }

    @Override // hh.a1
    public final URL a() {
        return this.f6590a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof z0) && nc.k.a(this.f6590a, ((z0) obj).f6590a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        URL url = this.f6590a;
        if (url == null) {
            return 0;
        }
        return url.hashCode();
    }

    public final String toString() {
        return "LoadedNoAchievements(icon=" + this.f6590a + ")";
    }
}
