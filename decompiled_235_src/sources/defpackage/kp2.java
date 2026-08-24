package defpackage;

import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: kp2  reason: default package */
/* loaded from: classes.dex */
public final class kp2 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final List e;

    public kp2(String str, String str2, String str3, String str4, List list) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = list;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof kp2) {
                kp2 kp2Var = (kp2) obj;
                if (!this.a.equals(kp2Var.a) || !this.b.equals(kp2Var.b) || !this.c.equals(kp2Var.c) || !this.d.equals(kp2Var.d) || !this.e.equals(kp2Var.e)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.e.hashCode() + xg6.d(xg6.d(xg6.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder u = i61.u("WordEntry(original=", this.a, ", reading=", this.b, ", romaji=");
        i61.B(u, this.c, ", partOfSpeech=", this.d, ", definitions=");
        u.append(this.e);
        u.append(")");
        return u.toString();
    }
}
