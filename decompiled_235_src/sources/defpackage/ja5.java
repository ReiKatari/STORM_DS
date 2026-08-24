package defpackage;

import java.net.URL;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ja5  reason: default package */
/* loaded from: classes.dex */
public final class ja5 {
    public final String a;
    public final URL b;
    public final String c;

    public ja5(String str, URL url, String str2) {
        str.getClass();
        this.a = str;
        this.b = url;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ja5) {
                ja5 ja5Var = (ja5) obj;
                if (!nb3.k(this.a, ja5Var.a) || !this.b.equals(ja5Var.b) || !nb3.k(this.c, ja5Var.c)) {
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
        int hashCode2 = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        String str = this.c;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RAGameSummary(title=");
        sb.append(this.a);
        sb.append(", icon=");
        sb.append(this.b);
        sb.append(", richPresencePatch=");
        return i61.n(sb, this.c, ")");
    }
}
