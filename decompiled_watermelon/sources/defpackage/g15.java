package defpackage;

import java.net.URL;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: g15  reason: default package */
/* loaded from: classes.dex */
public final class g15 extends h15 {
    public final URL a;
    public final String b;
    public final boolean c;

    public g15(URL url, String str, boolean z) {
        this.a = url;
        this.b = str;
        this.c = z;
    }

    @Override // defpackage.h15
    public final URL a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof g15) {
                g15 g15Var = (g15) obj;
                if (!b53.x(this.a, g15Var.a) || !this.b.equals(g15Var.b) || this.c != g15Var.c) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        URL url = this.a;
        if (url == null) {
            hashCode = 0;
        } else {
            hashCode = url.hashCode();
        }
        return Boolean.hashCode(this.c) + ej6.b(hashCode * 31, 31, this.b);
    }

    public final String toString() {
        return "Welcome(icon=" + this.a + ", username=" + this.b + ", hardcore=" + this.c + ")";
    }
}
