package defpackage;

import android.net.Uri;
import defpackage.xi5;
import java.util.Date;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: xl5  reason: default package */
/* loaded from: classes.dex */
public final class xl5 {
    @r06("name")
    private final String a;
    @r06("developerName")
    private final String b;
    @r06("fileName")
    private final String c;
    @r06("uri")
    private final String d;
    @r06("parentTreeUri")
    private final String e;
    @r06("config")
    private xi5 f;
    @r06("lastPlayed")
    private Date g;
    @r06("isDsiWareTitle")
    private final boolean h;
    @r06("retroAchievementsHash")
    private final String i;
    @r06("totalPlayTime")
    private final long j;
    @r06("isFavorite")
    private final boolean k;

    /* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
    /* renamed from: xl5$a */
    /* loaded from: classes.dex */
    public static final class a {
        public static xl5 a(rg5 rg5Var) {
            String str;
            rg5Var.getClass();
            String str2 = rg5Var.a;
            String str3 = rg5Var.b;
            String str4 = rg5Var.c;
            String uri = rg5Var.d.toString();
            uri.getClass();
            Uri uri2 = rg5Var.e;
            if (uri2 != null) {
                str = uri2.toString();
            } else {
                str = null;
            }
            return new xl5(str2, str3, str4, uri, str, xi5.a.a(rg5Var.f), rg5Var.g, rg5Var.h, rg5Var.i, im1.e(rg5Var.j), rg5Var.k);
        }
    }

    public xl5(String str, String str2, String str3, String str4, String str5, xi5 xi5Var, Date date, boolean z, String str6, long j, boolean z2) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str6.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = xi5Var;
        this.g = date;
        this.h = z;
        this.i = str6;
        this.j = j;
        this.k = z2;
    }

    public static xl5 a(xl5 xl5Var, xi5 xi5Var) {
        String str = xl5Var.a;
        String str2 = xl5Var.b;
        String str3 = xl5Var.c;
        String str4 = xl5Var.d;
        String str5 = xl5Var.e;
        Date date = xl5Var.g;
        boolean z = xl5Var.h;
        String str6 = xl5Var.i;
        long j = xl5Var.j;
        boolean z2 = xl5Var.k;
        xl5Var.getClass();
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        str6.getClass();
        return new xl5(str, str2, str3, str4, str5, xi5Var, date, z, str6, j, z2);
    }

    public final xi5 b() {
        return this.f;
    }

    public final boolean c() {
        return this.h;
    }

    public final rg5 d() {
        Uri uri;
        String str = this.a;
        String str2 = this.b;
        String str3 = this.c;
        Uri parse = Uri.parse(this.d);
        String str4 = this.e;
        if (str4 != null) {
            uri = Uri.parse(str4);
        } else {
            uri = null;
        }
        ti5 b = this.f.b();
        Date date = this.g;
        boolean z = this.h;
        String str5 = this.i;
        hm1 hm1Var = im1.B;
        return new rg5(str, str2, str3, parse, uri, b, date, z, str5, b53.l0(this.j, om1.MILLISECONDS), this.k, null, null, 6144);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xl5)) {
            return false;
        }
        xl5 xl5Var = (xl5) obj;
        if (b53.x(this.a, xl5Var.a) && b53.x(this.b, xl5Var.b) && b53.x(this.c, xl5Var.c) && b53.x(this.d, xl5Var.d) && b53.x(this.e, xl5Var.e) && b53.x(this.f, xl5Var.f) && b53.x(this.g, xl5Var.g) && this.h == xl5Var.h && b53.x(this.i, xl5Var.i) && this.j == xl5Var.j && this.k == xl5Var.k) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int b = ej6.b(ej6.b(ej6.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
        String str = this.e;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int hashCode2 = (this.f.hashCode() + ((b + hashCode) * 31)) * 31;
        Date date = this.g;
        if (date != null) {
            i = date.hashCode();
        }
        return Boolean.hashCode(this.k) + b31.c(this.j, ej6.b(ej6.c((hashCode2 + i) * 31, this.h, 31), 31, this.i), 31);
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.b;
        String str3 = this.c;
        String str4 = this.d;
        String str5 = this.e;
        xi5 xi5Var = this.f;
        Date date = this.g;
        boolean z = this.h;
        String str6 = this.i;
        long j = this.j;
        boolean z2 = this.k;
        StringBuilder v = b31.v("RomDto(name=", str, ", developerName=", str2, ", fileName=");
        b31.B(v, str3, ", uri=", str4, ", parentTreeUri=");
        v.append(str5);
        v.append(", config=");
        v.append(xi5Var);
        v.append(", lastPlayed=");
        v.append(date);
        v.append(", isDsiWareTitle=");
        v.append(z);
        v.append(", retroAchievementsHash=");
        v.append(str6);
        v.append(", totalPlayTime=");
        v.append(j);
        v.append(", isFavorite=");
        v.append(z2);
        v.append(")");
        return v.toString();
    }
}
