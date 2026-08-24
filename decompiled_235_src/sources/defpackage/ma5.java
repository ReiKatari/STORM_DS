package defpackage;

import java.net.URL;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ma5  reason: default package */
/* loaded from: classes.dex */
public final class ma5 extends ra5 {
    public final URL a;
    public final int b;
    public final int c;

    public ma5(URL url, int i, int i2) {
        this.a = url;
        this.b = i;
        this.c = i2;
    }

    @Override // defpackage.ra5
    public final URL a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ma5)) {
            return false;
        }
        ma5 ma5Var = (ma5) obj;
        if (nb3.k(this.a, ma5Var.a) && this.b == ma5Var.b && this.c == ma5Var.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        URL url = this.a;
        if (url == null) {
            hashCode = 0;
        } else {
            hashCode = url.hashCode();
        }
        return Integer.hashCode(this.c) + lb1.a(this.b, hashCode * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Loaded(icon=");
        sb.append(this.a);
        sb.append(", unlockedAchievements=");
        sb.append(this.b);
        sb.append(", totalAchievements=");
        return lb1.o(sb, this.c, ")");
    }
}
