package defpackage;

import java.net.URL;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: dy4  reason: default package */
/* loaded from: classes.dex */
public final class dy4 {
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
    public final cy4 m;

    public dy4(long j, long j2, long j3, Integer num, Integer num2, String str, String str2, int i, int i2, URL url, URL url2, String str3, cy4 cy4Var) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        cy4Var.getClass();
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
        this.m = cy4Var;
    }

    public final String a() {
        return zg6.Z0(zg6.K0(this.f, "[m]")).toString();
    }

    public final boolean b() {
        return gh6.f0(this.f, "[m]", false);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof dy4) {
                dy4 dy4Var = (dy4) obj;
                if (this.a == dy4Var.a && w05.a(this.b, dy4Var.b) && this.c == dy4Var.c && b53.x(this.d, dy4Var.d) && b53.x(this.e, dy4Var.e) && b53.x(this.f, dy4Var.f) && b53.x(this.g, dy4Var.g) && this.h == dy4Var.h && this.i == dy4Var.i && this.j.equals(dy4Var.j) && this.k.equals(dy4Var.k) && b53.x(this.l, dy4Var.l) && this.m == dy4Var.m) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int c = b31.c(this.c, b31.c(this.b, Long.hashCode(this.a) * 31, 31), 31);
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
        return this.m.hashCode() + ej6.b((this.k.hashCode() + ((this.j.hashCode() + wh1.a(this.i, wh1.a(this.h, ej6.b(ej6.b((i2 + i) * 31, 31, this.f), 31, this.g), 31), 31)) * 31)) * 31, 31, this.l);
    }

    public final String toString() {
        String b = w05.b(this.b);
        String b0 = nk2.b0(this.c);
        return "RAAchievement(id=" + this.a + ", gameId=" + b + ", setId=" + b0 + ", totalAwardsCasual=" + this.d + ", totalAwardsHardcore=" + this.e + ", title=" + this.f + ", description=" + this.g + ", points=" + this.h + ", displayOrder=" + this.i + ", badgeUrlUnlocked=" + this.j + ", badgeUrlLocked=" + this.k + ", memoryAddress=" + this.l + ", type=" + this.m + ")";
    }
}
