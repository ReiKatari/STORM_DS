package defpackage;

import android.net.Uri;
import java.util.Date;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: nq5  reason: default package */
/* loaded from: classes.dex */
public final class nq5 {
    public static final int f = 8;
    private final String a;
    private final Uri b;
    private final Uri c;
    private it5 d;
    private Date e;

    public nq5(String str, Uri uri, Uri uri2, it5 it5Var, Date date) {
        str.getClass();
        uri.getClass();
        uri2.getClass();
        it5Var.getClass();
        this.a = str;
        this.b = uri;
        this.c = uri2;
        this.d = it5Var;
        this.e = date;
    }

    public static /* synthetic */ nq5 g(nq5 nq5Var, String str, Uri uri, Uri uri2, it5 it5Var, Date date, int i, Object obj) {
        if ((i & 1) != 0) {
            str = nq5Var.a;
        }
        if ((i & 2) != 0) {
            uri = nq5Var.b;
        }
        if ((i & 4) != 0) {
            uri2 = nq5Var.c;
        }
        if ((i & 8) != 0) {
            it5Var = nq5Var.d;
        }
        if ((i & 16) != 0) {
            date = nq5Var.e;
        }
        Date date2 = date;
        Uri uri3 = uri2;
        return nq5Var.f(str, uri, uri3, it5Var, date2);
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

    public final it5 d() {
        return this.d;
    }

    public final Date e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nq5)) {
            return false;
        }
        nq5 nq5Var = (nq5) obj;
        if (nb3.k(this.a, nq5Var.a) && nb3.k(this.b, nq5Var.b) && nb3.k(this.c, nq5Var.c) && nb3.k(this.d, nq5Var.d) && nb3.k(this.e, nq5Var.e)) {
            return true;
        }
        return false;
    }

    public final nq5 f(String str, Uri uri, Uri uri2, it5 it5Var, Date date) {
        str.getClass();
        uri.getClass();
        uri2.getClass();
        it5Var.getClass();
        return new nq5(str, uri, uri2, it5Var, date);
    }

    public final it5 h() {
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

    public final void m(it5 it5Var) {
        it5Var.getClass();
        this.d = it5Var;
    }

    public final void n(Date date) {
        this.e = date;
    }

    public String toString() {
        String str = this.a;
        Uri uri = this.b;
        Uri uri2 = this.c;
        it5 it5Var = this.d;
        Date date = this.e;
        return "Rom21(name=" + str + ", uri=" + uri + ", parentTreeUri=" + uri2 + ", config=" + it5Var + ", lastPlayed=" + date + ")";
    }

    public /* synthetic */ nq5(String str, Uri uri, Uri uri2, it5 it5Var, Date date, int i, id1 id1Var) {
        this(str, uri, uri2, it5Var, (i & 16) != 0 ? null : date);
    }
}
