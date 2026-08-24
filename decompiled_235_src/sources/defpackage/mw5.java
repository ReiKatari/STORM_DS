package defpackage;

import android.net.Uri;
import defpackage.mt5;
import java.util.Date;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: mw5  reason: default package */
/* loaded from: classes.dex */
public final class mw5 {
    @gc6("name")
    private final String a;
    @gc6("developerName")
    private final String b;
    @gc6("fileName")
    private final String c;
    @gc6("uri")
    private final String d;
    @gc6("parentTreeUri")
    private final String e;
    @gc6("config")
    private mt5 f;
    @gc6("lastPlayed")
    private Date g;
    @gc6("isDsiWareTitle")
    private final boolean h;
    @gc6("retroAchievementsHash")
    private final String i;
    @gc6("totalPlayTime")
    private final long j;
    @gc6("isFavorite")
    private final boolean k;

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    /* renamed from: mw5$a */
    /* loaded from: classes.dex */
    public static final class a {
        public static mw5 a(pq5 pq5Var) {
            String str;
            pq5Var.getClass();
            String str2 = pq5Var.a;
            String str3 = pq5Var.b;
            String str4 = pq5Var.c;
            String uri = pq5Var.d.toString();
            uri.getClass();
            Uri uri2 = pq5Var.e;
            if (uri2 != null) {
                str = uri2.toString();
            } else {
                str = null;
            }
            return new mw5(str2, str3, str4, uri, str, mt5.a.a(pq5Var.f), pq5Var.g, pq5Var.h, pq5Var.i, oq1.e(pq5Var.j), pq5Var.k);
        }
    }

    public mw5(String str, String str2, String str3, String str4, String str5, mt5 mt5Var, Date date, boolean z, String str6, long j, boolean z2) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str6.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = mt5Var;
        this.g = date;
        this.h = z;
        this.i = str6;
        this.j = j;
        this.k = z2;
    }

    public static mw5 a(mw5 mw5Var, mt5 mt5Var) {
        String str = mw5Var.a;
        String str2 = mw5Var.b;
        String str3 = mw5Var.c;
        String str4 = mw5Var.d;
        String str5 = mw5Var.e;
        Date date = mw5Var.g;
        boolean z = mw5Var.h;
        String str6 = mw5Var.i;
        long j = mw5Var.j;
        boolean z2 = mw5Var.k;
        mw5Var.getClass();
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        str6.getClass();
        return new mw5(str, str2, str3, str4, str5, mt5Var, date, z, str6, j, z2);
    }

    public final mt5 b() {
        return this.f;
    }

    public final boolean c() {
        return this.h;
    }

    public final pq5 d() {
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
        jt5 b = this.f.b();
        Date date = this.g;
        boolean z = this.h;
        String str5 = this.i;
        jd1 jd1Var = oq1.B;
        return new pq5(str, str2, str3, parse, uri, b, date, z, str5, n16.M(this.j, uq1.MILLISECONDS), this.k, null, null, 6144);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mw5)) {
            return false;
        }
        mw5 mw5Var = (mw5) obj;
        if (nb3.k(this.a, mw5Var.a) && nb3.k(this.b, mw5Var.b) && nb3.k(this.c, mw5Var.c) && nb3.k(this.d, mw5Var.d) && nb3.k(this.e, mw5Var.e) && nb3.k(this.f, mw5Var.f) && nb3.k(this.g, mw5Var.g) && this.h == mw5Var.h && nb3.k(this.i, mw5Var.i) && this.j == mw5Var.j && this.k == mw5Var.k) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int d = xg6.d(xg6.d(xg6.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
        String str = this.e;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int hashCode2 = (this.f.hashCode() + ((d + hashCode) * 31)) * 31;
        Date date = this.g;
        if (date != null) {
            i = date.hashCode();
        }
        return Boolean.hashCode(this.k) + i61.c(this.j, xg6.d(xg6.e((hashCode2 + i) * 31, this.h, 31), 31, this.i), 31);
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.b;
        String str3 = this.c;
        String str4 = this.d;
        String str5 = this.e;
        mt5 mt5Var = this.f;
        Date date = this.g;
        boolean z = this.h;
        String str6 = this.i;
        long j = this.j;
        boolean z2 = this.k;
        StringBuilder u = i61.u("RomDto(name=", str, ", developerName=", str2, ", fileName=");
        i61.B(u, str3, ", uri=", str4, ", parentTreeUri=");
        u.append(str5);
        u.append(", config=");
        u.append(mt5Var);
        u.append(", lastPlayed=");
        u.append(date);
        u.append(", isDsiWareTitle=");
        u.append(z);
        u.append(", retroAchievementsHash=");
        u.append(str6);
        u.append(", totalPlayTime=");
        u.append(j);
        u.append(", isFavorite=");
        u.append(z2);
        u.append(")");
        return u.toString();
    }
}
