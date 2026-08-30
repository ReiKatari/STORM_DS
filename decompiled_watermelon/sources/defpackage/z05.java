package defpackage;

import java.net.URL;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: z05  reason: default package */
/* loaded from: classes.dex */
public final class z05 {
    public final String a;
    public final URL b;
    public final String c;

    public z05(String str, URL url, String str2) {
        str.getClass();
        this.a = str;
        this.b = url;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof z05) {
                z05 z05Var = (z05) obj;
                if (!b53.x(this.a, z05Var.a) || !this.b.equals(z05Var.b) || !b53.x(this.c, z05Var.c)) {
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
        return b31.q(sb, this.c, ")");
    }
}
