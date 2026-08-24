package defpackage;

import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
@cc6
/* renamed from: ki5  reason: default package */
/* loaded from: classes.dex */
public final class ki5 {
    public static final ji5 Companion = new Object();
    public static final go3[] j = {null, null, null, null, null, null, null, null, kj2.M(xr3.PUBLICATION, new pi3(28))};
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final boolean g;
    public final boolean h;
    public final List i;

    public /* synthetic */ ki5(int i, String str, String str2, String str3, String str4, String str5, String str6, boolean z, boolean z2, List list) {
        if ((i & 1) == 0) {
            this.a = "";
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = "";
        } else {
            this.c = str3;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str4;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str5;
        }
        if ((i & 32) == 0) {
            this.f = "";
        } else {
            this.f = str6;
        }
        if ((i & 64) == 0) {
            this.g = false;
        } else {
            this.g = z;
        }
        if ((i & 128) == 0) {
            this.h = false;
        } else {
            this.h = z2;
        }
        if ((i & 256) == 0) {
            this.i = yt1.A;
        } else {
            this.i = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ki5)) {
            return false;
        }
        ki5 ki5Var = (ki5) obj;
        if (nb3.k(this.a, ki5Var.a) && nb3.k(this.b, ki5Var.b) && nb3.k(this.c, ki5Var.c) && nb3.k(this.d, ki5Var.d) && nb3.k(this.e, ki5Var.e) && nb3.k(this.f, ki5Var.f) && this.g == ki5Var.g && this.h == ki5Var.h && nb3.k(this.i, ki5Var.i)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int d = xg6.d(xg6.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        int i = 0;
        String str = this.d;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (d + hashCode) * 31;
        String str2 = this.e;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return this.i.hashCode() + xg6.e(xg6.e(xg6.d((i2 + i) * 31, 31, this.f), this.g, 31), this.h, 31);
    }

    public final String toString() {
        StringBuilder u = i61.u("ReleaseDto(tagName=", this.a, ", name=", this.b, ", body=");
        i61.B(u, this.c, ", createdAt=", this.d, ", publishedAt=");
        i61.B(u, this.e, ", htmlUrl=", this.f, ", draft=");
        u.append(this.g);
        u.append(", prerelease=");
        u.append(this.h);
        u.append(", assets=");
        u.append(this.i);
        u.append(")");
        return u.toString();
    }
}
