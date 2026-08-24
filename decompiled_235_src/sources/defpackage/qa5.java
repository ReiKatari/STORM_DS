package defpackage;

import java.net.URL;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: qa5  reason: default package */
/* loaded from: classes.dex */
public final class qa5 extends ra5 {
    public final URL a;
    public final String b;
    public final boolean c;

    public qa5(URL url, String str, boolean z) {
        this.a = url;
        this.b = str;
        this.c = z;
    }

    @Override // defpackage.ra5
    public final URL a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof qa5) {
                qa5 qa5Var = (qa5) obj;
                if (!nb3.k(this.a, qa5Var.a) || !this.b.equals(qa5Var.b) || this.c != qa5Var.c) {
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
        return Boolean.hashCode(this.c) + xg6.d(hashCode * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Welcome(icon=");
        sb.append(this.a);
        sb.append(", username=");
        sb.append(this.b);
        sb.append(", hardcore=");
        return i61.o(sb, this.c, ")");
    }
}
