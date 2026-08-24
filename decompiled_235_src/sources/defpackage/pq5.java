package defpackage;

import android.net.Uri;
import java.util.Arrays;
import java.util.Date;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: pq5  reason: default package */
/* loaded from: classes.dex */
public final class pq5 {
    public final String a;
    public final String b;
    public final String c;
    public final Uri d;
    public final Uri e;
    public jt5 f;
    public Date g;
    public final boolean h;
    public final String i;
    public final long j;
    public final boolean k;
    public final Long l;
    public final byte[] m;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public pq5(String str, String str2, String str3, Uri uri, Uri uri2, jt5 jt5Var, Date date, boolean z, String str4, long j, boolean z2, Long l, byte[] bArr, int i) {
        this(str, str2, str3, uri, uri2, jt5Var, date, z, str4, r13, r15, r16, r17);
        long j2;
        boolean z3;
        Long l2;
        byte[] bArr2;
        if ((i & 512) != 0) {
            jd1 jd1Var = oq1.B;
            j2 = 0;
        } else {
            j2 = j;
        }
        if ((i & 1024) != 0) {
            z3 = false;
        } else {
            z3 = z2;
        }
        if ((i & 2048) != 0) {
            l2 = null;
        } else {
            l2 = l;
        }
        if ((i & 4096) != 0) {
            bArr2 = null;
        } else {
            bArr2 = bArr;
        }
    }

    public static pq5 a(pq5 pq5Var, String str, String str2, jt5 jt5Var, Date date, boolean z, String str3, long j, boolean z2, Long l, int i) {
        String str4;
        String str5;
        jt5 jt5Var2;
        Date date2;
        boolean z3;
        String str6;
        long j2;
        boolean z4;
        Long l2;
        if ((i & 1) != 0) {
            str4 = pq5Var.a;
        } else {
            str4 = str;
        }
        if ((i & 2) != 0) {
            str5 = pq5Var.b;
        } else {
            str5 = str2;
        }
        String str7 = pq5Var.c;
        Uri uri = pq5Var.d;
        Uri uri2 = pq5Var.e;
        if ((i & 32) != 0) {
            jt5Var2 = pq5Var.f;
        } else {
            jt5Var2 = jt5Var;
        }
        if ((i & 64) != 0) {
            date2 = pq5Var.g;
        } else {
            date2 = date;
        }
        if ((i & 128) != 0) {
            z3 = pq5Var.h;
        } else {
            z3 = z;
        }
        if ((i & 256) != 0) {
            str6 = pq5Var.i;
        } else {
            str6 = str3;
        }
        if ((i & 512) != 0) {
            j2 = pq5Var.j;
        } else {
            j2 = j;
        }
        if ((i & 1024) != 0) {
            z4 = pq5Var.k;
        } else {
            z4 = z2;
        }
        if ((i & 2048) != 0) {
            l2 = pq5Var.l;
        } else {
            l2 = l;
        }
        byte[] bArr = pq5Var.m;
        pq5Var.getClass();
        str4.getClass();
        str5.getClass();
        str7.getClass();
        uri.getClass();
        jt5Var2.getClass();
        str6.getClass();
        return new pq5(str4, str5, str7, uri, uri2, jt5Var2, date2, z3, str6, j2, z4, l2, bArr);
    }

    public final boolean b(pq5 pq5Var) {
        pq5Var.getClass();
        return nb3.k(this.d, pq5Var.d);
    }

    public final boolean c() {
        if (this.l != null) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pq5)) {
            return false;
        }
        pq5 pq5Var = (pq5) obj;
        if (nb3.k(this.a, pq5Var.a) && nb3.k(this.b, pq5Var.b) && nb3.k(this.c, pq5Var.c) && nb3.k(this.d, pq5Var.d) && nb3.k(this.e, pq5Var.e) && nb3.k(this.f, pq5Var.f) && nb3.k(this.g, pq5Var.g) && this.h == pq5Var.h && nb3.k(this.i, pq5Var.i) && oq1.d(this.j, pq5Var.j) && this.k == pq5Var.k && nb3.k(this.l, pq5Var.l) && nb3.k(this.m, pq5Var.m)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4 = (this.d.hashCode() + xg6.d(xg6.d(this.a.hashCode() * 31, 31, this.b), 31, this.c)) * 31;
        int i = 0;
        Uri uri = this.e;
        if (uri == null) {
            hashCode = 0;
        } else {
            hashCode = uri.hashCode();
        }
        int hashCode5 = (this.f.hashCode() + ((hashCode4 + hashCode) * 31)) * 31;
        Date date = this.g;
        if (date == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = date.hashCode();
        }
        int d = xg6.d(xg6.e((hashCode5 + hashCode2) * 31, this.h, 31), 31, this.i);
        jd1 jd1Var = oq1.B;
        int e = xg6.e(i61.c(this.j, d, 31), this.k, 31);
        Long l = this.l;
        if (l == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = l.hashCode();
        }
        int i2 = (e + hashCode3) * 31;
        byte[] bArr = this.m;
        if (bArr != null) {
            i = Arrays.hashCode(bArr);
        }
        return i2 + i;
    }

    public final String toString() {
        jt5 jt5Var = this.f;
        Date date = this.g;
        String l = oq1.l(this.j);
        String arrays = Arrays.toString(this.m);
        StringBuilder u = i61.u("Rom(name=", this.a, ", developerName=", this.b, ", fileName=");
        u.append(this.c);
        u.append(", uri=");
        u.append(this.d);
        u.append(", parentTreeUri=");
        u.append(this.e);
        u.append(", config=");
        u.append(jt5Var);
        u.append(", lastPlayed=");
        u.append(date);
        u.append(", isDsiWareTitle=");
        u.append(this.h);
        u.append(", retroAchievementsHash=");
        i61.B(u, this.i, ", totalPlayTime=", l, ", isFavorite=");
        u.append(this.k);
        u.append(", installedDsiWareTitleId=");
        u.append(this.l);
        u.append(", installedDsiWareIcon=");
        return i61.n(u, arrays, ")");
    }

    public pq5(String str, String str2, String str3, Uri uri, Uri uri2, jt5 jt5Var, Date date, boolean z, String str4, long j, boolean z2, Long l, byte[] bArr) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        uri.getClass();
        jt5Var.getClass();
        str4.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = uri;
        this.e = uri2;
        this.f = jt5Var;
        this.g = date;
        this.h = z;
        this.i = str4;
        this.j = j;
        this.k = z2;
        this.l = l;
        this.m = bArr;
    }
}
