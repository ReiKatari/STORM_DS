package defpackage;

import java.net.URL;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: la5  reason: default package */
/* loaded from: classes.dex */
public final class la5 extends ra5 {
    public final URL a;

    public la5(URL url) {
        this.a = url;
    }

    @Override // defpackage.ra5
    public final URL a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof la5) && nb3.k(this.a, ((la5) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        URL url = this.a;
        if (url == null) {
            return 0;
        }
        return url.hashCode();
    }

    public final String toString() {
        return "Failed(icon=" + this.a + ")";
    }
}
