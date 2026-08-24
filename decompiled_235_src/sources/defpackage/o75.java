package defpackage;

import java.net.URL;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: o75  reason: default package */
/* loaded from: classes.dex */
public final class o75 {
    public final long a;
    public final long b;
    public final long c;
    public final Integer d;
    public final Integer e;
    public final String f;
    public final String g;
    public final int h;
    public final int i;
    public final URL j;
    public final URL k;
    public final String l;
    public final n75 m;

    public o75(long j, long j2, long j3, Integer num, Integer num2, String str, String str2, int i, int i2, URL url, URL url2, String str3, n75 n75Var) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        n75Var.getClass();
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = num;
        this.e = num2;
        this.f = str;
        this.g = str2;
        this.h = i;
        this.i = i2;
        this.j = url;
        this.k = url2;
        this.l = str3;
        this.m = n75Var;
    }

    public final String a() {
        return qs6.T0(qs6.E0(this.f, "[m]")).toString();
    }

    public final boolean b() {
        return xs6.Y(this.f, "[m]", false);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof o75) {
                o75 o75Var = (o75) obj;
                if (this.a == o75Var.a && ga5.a(this.b, o75Var.b) && this.c == o75Var.c && nb3.k(this.d, o75Var.d) && nb3.k(this.e, o75Var.e) && nb3.k(this.f, o75Var.f) && nb3.k(this.g, o75Var.g) && this.h == o75Var.h && this.i == o75Var.i && this.j.equals(o75Var.j) && this.k.equals(o75Var.k) && nb3.k(this.l, o75Var.l) && this.m == o75Var.m) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int c = i61.c(this.c, i61.c(this.b, Long.hashCode(this.a) * 31, 31), 31);
        int i = 0;
        Integer num = this.d;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i2 = (c + hashCode) * 31;
        Integer num2 = this.e;
        if (num2 != null) {
            i = num2.hashCode();
        }
        return this.m.hashCode() + xg6.d((this.k.hashCode() + ((this.j.hashCode() + lb1.a(this.i, lb1.a(this.h, xg6.d(xg6.d((i2 + i) * 31, 31, this.f), 31, this.g), 31), 31)) * 31)) * 31, 31, this.l);
    }

    public final String toString() {
        String b = ga5.b(this.b);
        String a0 = mp2.a0(this.c);
        return "RAAchievement(id=" + this.a + ", gameId=" + b + ", setId=" + a0 + ", totalAwardsCasual=" + this.d + ", totalAwardsHardcore=" + this.e + ", title=" + this.f + ", description=" + this.g + ", points=" + this.h + ", displayOrder=" + this.i + ", badgeUrlUnlocked=" + this.j + ", badgeUrlLocked=" + this.k + ", memoryAddress=" + this.l + ", type=" + this.m + ")";
    }
}
