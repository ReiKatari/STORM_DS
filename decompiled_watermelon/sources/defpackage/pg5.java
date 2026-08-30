package defpackage;

import android.net.Uri;
import java.util.Date;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: pg5  reason: default package */
/* loaded from: classes.dex */
public final class pg5 {
    public static final int f = 8;
    private final String a;
    private final Uri b;
    private final Uri c;
    private si5 d;
    private Date e;

    public pg5(String str, Uri uri, Uri uri2, si5 si5Var, Date date) {
        str.getClass();
        uri.getClass();
        uri2.getClass();
        si5Var.getClass();
        this.a = str;
        this.b = uri;
        this.c = uri2;
        this.d = si5Var;
        this.e = date;
    }

    public static /* synthetic */ pg5 g(pg5 pg5Var, String str, Uri uri, Uri uri2, si5 si5Var, Date date, int i, Object obj) {
        if ((i & 1) != 0) {
            str = pg5Var.a;
        }
        if ((i & 2) != 0) {
            uri = pg5Var.b;
        }
        if ((i & 4) != 0) {
            uri2 = pg5Var.c;
        }
        if ((i & 8) != 0) {
            si5Var = pg5Var.d;
        }
        if ((i & 16) != 0) {
            date = pg5Var.e;
        }
        Date date2 = date;
        Uri uri3 = uri2;
        return pg5Var.f(str, uri, uri3, si5Var, date2);
    }

    public final String a() {
        return this.a;
    }

    public final Uri b() {
        return this.b;
    }

    public final Uri c() {
        return this.c;
    }

    public final si5 d() {
        return this.d;
    }

    public final Date e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pg5)) {
            return false;
        }
        pg5 pg5Var = (pg5) obj;
        if (b53.x(this.a, pg5Var.a) && b53.x(this.b, pg5Var.b) && b53.x(this.c, pg5Var.c) && b53.x(this.d, pg5Var.d) && b53.x(this.e, pg5Var.e)) {
            return true;
        }
        return false;
    }

    public final pg5 f(String str, Uri uri, Uri uri2, si5 si5Var, Date date) {
        str.getClass();
        uri.getClass();
        uri2.getClass();
        si5Var.getClass();
        return new pg5(str, uri, uri2, si5Var, date);
    }

    public final si5 h() {
        return this.d;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = this.b.hashCode();
        int hashCode3 = this.c.hashCode();
        int hashCode4 = (this.d.hashCode() + ((hashCode3 + ((hashCode2 + (this.a.hashCode() * 31)) * 31)) * 31)) * 31;
        Date date = this.e;
        if (date == null) {
            hashCode = 0;
        } else {
            hashCode = date.hashCode();
        }
        return hashCode4 + hashCode;
    }

    public final Date i() {
        return this.e;
    }

    public final String j() {
        return this.a;
    }

    public final Uri k() {
        return this.c;
    }

    public final Uri l() {
        return this.b;
    }

    public final void m(si5 si5Var) {
        si5Var.getClass();
        this.d = si5Var;
    }

    public final void n(Date date) {
        this.e = date;
    }

    public String toString() {
        String str = this.a;
        Uri uri = this.b;
        Uri uri2 = this.c;
        si5 si5Var = this.d;
        Date date = this.e;
        return "Rom21(name=" + str + ", uri=" + uri + ", parentTreeUri=" + uri2 + ", config=" + si5Var + ", lastPlayed=" + date + ")";
    }

    public /* synthetic */ pg5(String str, Uri uri, Uri uri2, si5 si5Var, Date date, int i, n91 n91Var) {
        this(str, uri, uri2, si5Var, (i & 16) != 0 ? null : date);
    }
}
