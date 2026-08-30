package defpackage;

import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
@n06
/* renamed from: v85  reason: default package */
/* loaded from: classes.dex */
public final class v85 {
    public static final u85 Companion = new Object();
    public static final gh3[] j = {null, null, null, null, null, null, null, null, yf2.H(wk3.PUBLICATION, new vq3(22))};
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final boolean g;
    public final boolean h;
    public final List i;

    public /* synthetic */ v85(int i, String str, String str2, String str3, String str4, String str5, String str6, boolean z, boolean z2, List list) {
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
            this.i = pp1.A;
        } else {
            this.i = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v85)) {
            return false;
        }
        v85 v85Var = (v85) obj;
        if (b53.x(this.a, v85Var.a) && b53.x(this.b, v85Var.b) && b53.x(this.c, v85Var.c) && b53.x(this.d, v85Var.d) && b53.x(this.e, v85Var.e) && b53.x(this.f, v85Var.f) && this.g == v85Var.g && this.h == v85Var.h && b53.x(this.i, v85Var.i)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int b = ej6.b(ej6.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        int i = 0;
        String str = this.d;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (b + hashCode) * 31;
        String str2 = this.e;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return this.i.hashCode() + ej6.c(ej6.c(ej6.b((i2 + i) * 31, 31, this.f), this.g, 31), this.h, 31);
    }

    public final String toString() {
        StringBuilder v = b31.v("ReleaseDto(tagName=", this.a, ", name=", this.b, ", body=");
        b31.B(v, this.c, ", createdAt=", this.d, ", publishedAt=");
        b31.B(v, this.e, ", htmlUrl=", this.f, ", draft=");
        v.append(this.g);
        v.append(", prerelease=");
        v.append(this.h);
        v.append(", assets=");
        v.append(this.i);
        v.append(")");
        return v.toString();
    }
}
