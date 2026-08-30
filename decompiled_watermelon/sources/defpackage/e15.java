package defpackage;

import java.net.URL;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: e15  reason: default package */
/* loaded from: classes.dex */
public final class e15 extends h15 {
    public final URL a;

    public e15(URL url) {
        this.a = url;
    }

    @Override // defpackage.h15
    public final URL a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof e15) && b53.x(this.a, ((e15) obj).a)) {
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
        return "LoginExpired(icon=" + this.a + ")";
    }
}
