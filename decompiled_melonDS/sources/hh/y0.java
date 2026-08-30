package hh;

import java.net.URL;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class y0 extends a1 {

    /* renamed from: a  reason: collision with root package name */
    public final URL f6587a;

    /* renamed from: b  reason: collision with root package name */
    public final int f6588b;

    /* renamed from: c  reason: collision with root package name */
    public final int f6589c;

    public y0(URL url, int i2, int i10) {
        this.f6587a = url;
        this.f6588b = i2;
        this.f6589c = i10;
    }

    @Override // hh.a1
    public final URL a() {
        return this.f6587a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y0)) {
            return false;
        }
        y0 y0Var = (y0) obj;
        if (nc.k.a(this.f6587a, y0Var.f6587a) && this.f6588b == y0Var.f6588b && this.f6589c == y0Var.f6589c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        URL url = this.f6587a;
        if (url == null) {
            hashCode = 0;
        } else {
            hashCode = url.hashCode();
        }
        return Integer.hashCode(this.f6589c) + w.d.c(this.f6588b, hashCode * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Loaded(icon=");
        sb2.append(this.f6587a);
        sb2.append(", unlockedAchievements=");
        sb2.append(this.f6588b);
        sb2.append(", totalAchievements=");
        return w.d.q(sb2, this.f6589c, ")");
    }
}
