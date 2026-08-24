package defpackage;

import java.net.URL;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: s95  reason: default package */
/* loaded from: classes.dex */
public final class s95 extends ca5 {
    public final String a;
    public final URL b;
    public final String c;
    public final oq1 d;
    public final boolean e;

    public s95(String str, URL url, String str2, oq1 oq1Var, boolean z) {
        this.a = str;
        this.b = url;
        this.c = str2;
        this.d = oq1Var;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof s95) {
                s95 s95Var = (s95) obj;
                if (!this.a.equals(s95Var.a) || !this.b.equals(s95Var.b) || !nb3.k(this.c, s95Var.c) || !nb3.k(this.d, s95Var.d) || this.e != s95Var.e) {
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
        int i = 0;
        String str = this.c;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (hashCode2 + hashCode) * 31;
        oq1 oq1Var = this.d;
        if (oq1Var != null) {
            i = Long.hashCode(oq1Var.A);
        }
        return Boolean.hashCode(this.e) + ((i2 + i) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GameMastered(gameTitle=");
        sb.append(this.a);
        sb.append(", gameIcon=");
        sb.append(this.b);
        sb.append(", userName=");
        sb.append(this.c);
        sb.append(", playTime=");
        sb.append(this.d);
        sb.append(", forHardcodeMode=");
        return i61.o(sb, this.e, ")");
    }
}
