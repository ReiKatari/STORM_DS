package defpackage;

import android.net.Uri;
import java.util.Date;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: oq5  reason: default package */
/* loaded from: classes.dex */
public final class oq5 {
    public static final int h = 8;
    @gc6("a")
    private final String a;
    @gc6("b")
    private final String b;
    @gc6("c")
    private final Uri c;
    @gc6("d")
    private final Uri d;
    @gc6("e")
    private final it5 e;
    @gc6("f")
    private final Date f;
    @gc6("g")
    private final boolean g;

    public oq5(String str, String str2, Uri uri, Uri uri2, it5 it5Var, Date date, boolean z) {
        str.getClass();
        str2.getClass();
        uri.getClass();
        uri2.getClass();
        it5Var.getClass();
        this.a = str;
        this.b = str2;
        this.c = uri;
        this.d = uri2;
        this.e = it5Var;
        this.f = date;
        this.g = z;
    }

    public static /* synthetic */ oq5 i(oq5 oq5Var, String str, String str2, Uri uri, Uri uri2, it5 it5Var, Date date, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = oq5Var.a;
        }
        if ((i & 2) != 0) {
            str2 = oq5Var.b;
        }
        if ((i & 4) != 0) {
            uri = oq5Var.c;
        }
        if ((i & 8) != 0) {
            uri2 = oq5Var.d;
        }
        if ((i & 16) != 0) {
            it5Var = oq5Var.e;
        }
        if ((i & 32) != 0) {
            date = oq5Var.f;
        }
        if ((i & 64) != 0) {
            z = oq5Var.g;
        }
        Date date2 = date;
        boolean z2 = z;
        it5 it5Var2 = it5Var;
        Uri uri3 = uri;
        return oq5Var.h(str, str2, uri3, uri2, it5Var2, date2, z2);
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final Uri c() {
        return this.c;
    }

    public final Uri d() {
        return this.d;
    }

    public final it5 e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oq5)) {
            return false;
        }
        oq5 oq5Var = (oq5) obj;
        if (nb3.k(this.a, oq5Var.a) && nb3.k(this.b, oq5Var.b) && nb3.k(this.c, oq5Var.c) && nb3.k(this.d, oq5Var.d) && nb3.k(this.e, oq5Var.e) && nb3.k(this.f, oq5Var.f) && this.g == oq5Var.g) {
            return true;
        }
        return false;
    }

    public final Date f() {
        return this.f;
    }

    public final boolean g() {
        return this.g;
    }

    public final oq5 h(String str, String str2, Uri uri, Uri uri2, it5 it5Var, Date date, boolean z) {
        str.getClass();
        str2.getClass();
        uri.getClass();
        uri2.getClass();
        it5Var.getClass();
        return new oq5(str, str2, uri, uri2, it5Var, date, z);
    }

    public int hashCode() {
        int hashCode;
        int d = xg6.d(this.a.hashCode() * 31, 31, this.b);
        int hashCode2 = this.d.hashCode();
        int hashCode3 = (this.e.hashCode() + ((hashCode2 + ((this.c.hashCode() + d) * 31)) * 31)) * 31;
        Date date = this.f;
        if (date == null) {
            hashCode = 0;
        } else {
            hashCode = date.hashCode();
        }
        return Boolean.hashCode(this.g) + ((hashCode3 + hashCode) * 31);
    }

    public final it5 j() {
        return this.e;
    }

    public final String k() {
        return this.b;
    }

    public final Date l() {
        return this.f;
    }

    public final String m() {
        return this.a;
    }

    public final Uri n() {
        return this.d;
    }

    public final Uri o() {
        return this.c;
    }

    public final boolean p() {
        return this.g;
    }

    public String toString() {
        String str = this.a;
        String str2 = this.b;
        Uri uri = this.c;
        Uri uri2 = this.d;
        it5 it5Var = this.e;
        Date date = this.f;
        boolean z = this.g;
        StringBuilder u = i61.u("Rom22(name=", str, ", fileName=", str2, ", uri=");
        u.append(uri);
        u.append(", parentTreeUri=");
        u.append(uri2);
        u.append(", config=");
        u.append(it5Var);
        u.append(", lastPlayed=");
        u.append(date);
        u.append(", isDsiWareTitle=");
        return i61.o(u, z, ")");
    }

    public /* synthetic */ oq5(String str, String str2, Uri uri, Uri uri2, it5 it5Var, Date date, boolean z, int i, id1 id1Var) {
        this(str, str2, uri, uri2, it5Var, (i & 32) != 0 ? null : date, z);
    }
}
