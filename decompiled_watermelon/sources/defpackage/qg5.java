package defpackage;

import android.net.Uri;
import java.util.Date;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: qg5  reason: default package */
/* loaded from: classes.dex */
public final class qg5 {
    public static final int h = 8;
    @r06("a")
    private final String a;
    @r06("b")
    private final String b;
    @r06("c")
    private final Uri c;
    @r06("d")
    private final Uri d;
    @r06("e")
    private final si5 e;
    @r06("f")
    private final Date f;
    @r06("g")
    private final boolean g;

    public qg5(String str, String str2, Uri uri, Uri uri2, si5 si5Var, Date date, boolean z) {
        str.getClass();
        str2.getClass();
        uri.getClass();
        uri2.getClass();
        si5Var.getClass();
        this.a = str;
        this.b = str2;
        this.c = uri;
        this.d = uri2;
        this.e = si5Var;
        this.f = date;
        this.g = z;
    }

    public static /* synthetic */ qg5 i(qg5 qg5Var, String str, String str2, Uri uri, Uri uri2, si5 si5Var, Date date, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = qg5Var.a;
        }
        if ((i & 2) != 0) {
            str2 = qg5Var.b;
        }
        if ((i & 4) != 0) {
            uri = qg5Var.c;
        }
        if ((i & 8) != 0) {
            uri2 = qg5Var.d;
        }
        if ((i & 16) != 0) {
            si5Var = qg5Var.e;
        }
        if ((i & 32) != 0) {
            date = qg5Var.f;
        }
        if ((i & 64) != 0) {
            z = qg5Var.g;
        }
        Date date2 = date;
        boolean z2 = z;
        si5 si5Var2 = si5Var;
        Uri uri3 = uri;
        return qg5Var.h(str, str2, uri3, uri2, si5Var2, date2, z2);
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

    public final si5 e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qg5)) {
            return false;
        }
        qg5 qg5Var = (qg5) obj;
        if (b53.x(this.a, qg5Var.a) && b53.x(this.b, qg5Var.b) && b53.x(this.c, qg5Var.c) && b53.x(this.d, qg5Var.d) && b53.x(this.e, qg5Var.e) && b53.x(this.f, qg5Var.f) && this.g == qg5Var.g) {
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

    public final qg5 h(String str, String str2, Uri uri, Uri uri2, si5 si5Var, Date date, boolean z) {
        str.getClass();
        str2.getClass();
        uri.getClass();
        uri2.getClass();
        si5Var.getClass();
        return new qg5(str, str2, uri, uri2, si5Var, date, z);
    }

    public int hashCode() {
        int hashCode;
        int b = ej6.b(this.a.hashCode() * 31, 31, this.b);
        int hashCode2 = this.d.hashCode();
        int hashCode3 = (this.e.hashCode() + ((hashCode2 + ((this.c.hashCode() + b) * 31)) * 31)) * 31;
        Date date = this.f;
        if (date == null) {
            hashCode = 0;
        } else {
            hashCode = date.hashCode();
        }
        return Boolean.hashCode(this.g) + ((hashCode3 + hashCode) * 31);
    }

    public final si5 j() {
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
        si5 si5Var = this.e;
        Date date = this.f;
        boolean z = this.g;
        StringBuilder v = b31.v("Rom22(name=", str, ", fileName=", str2, ", uri=");
        v.append(uri);
        v.append(", parentTreeUri=");
        v.append(uri2);
        v.append(", config=");
        v.append(si5Var);
        v.append(", lastPlayed=");
        v.append(date);
        v.append(", isDsiWareTitle=");
        v.append(z);
        v.append(")");
        return v.toString();
    }

    public /* synthetic */ qg5(String str, String str2, Uri uri, Uri uri2, si5 si5Var, Date date, boolean z, int i, n91 n91Var) {
        this(str, str2, uri, uri2, si5Var, (i & 32) != 0 ? null : date, z);
    }
}
