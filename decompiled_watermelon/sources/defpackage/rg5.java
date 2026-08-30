package defpackage;

import android.net.Uri;
import java.util.Arrays;
import java.util.Date;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: rg5  reason: default package */
/* loaded from: classes.dex */
public final class rg5 {
    public final String a;
    public final String b;
    public final String c;
    public final Uri d;
    public final Uri e;
    public ti5 f;
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
        To view partially-correct add '--show-bad-code' argument
    */
    public rg5(java.lang.String r19, java.lang.String r20, java.lang.String r21, android.net.Uri r22, android.net.Uri r23, defpackage.ti5 r24, java.util.Date r25, boolean r26, java.lang.String r27, long r28, boolean r30, java.lang.Long r31, byte[] r32, int r33) {
        /*
            r18 = this;
            r0 = r33
            r1 = r0 & 512(0x200, float:7.17E-43)
            if (r1 == 0) goto Lc
            hm1 r1 = defpackage.im1.B
            r1 = 0
            r13 = r1
            goto Le
        Lc:
            r13 = r28
        Le:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L15
            r1 = 0
            r15 = r1
            goto L17
        L15:
            r15 = r30
        L17:
            r1 = r0 & 2048(0x800, float:2.87E-42)
            r2 = 0
            if (r1 == 0) goto L1f
            r16 = r2
            goto L21
        L1f:
            r16 = r31
        L21:
            r0 = r0 & 4096(0x1000, float:5.74E-42)
            if (r0 == 0) goto L3c
            r17 = r2
        L27:
            r3 = r18
            r4 = r19
            r5 = r20
            r6 = r21
            r7 = r22
            r8 = r23
            r9 = r24
            r10 = r25
            r11 = r26
            r12 = r27
            goto L3f
        L3c:
            r17 = r32
            goto L27
        L3f:
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r15, r16, r17)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rg5.<init>(java.lang.String, java.lang.String, java.lang.String, android.net.Uri, android.net.Uri, ti5, java.util.Date, boolean, java.lang.String, long, boolean, java.lang.Long, byte[], int):void");
    }

    public static rg5 a(rg5 rg5Var, String str, String str2, ti5 ti5Var, Date date, boolean z, String str3, long j, boolean z2, int i) {
        String str4;
        String str5;
        ti5 ti5Var2;
        Date date2;
        boolean z3;
        String str6;
        long j2;
        boolean z4;
        if ((i & 1) != 0) {
            str4 = rg5Var.a;
        } else {
            str4 = str;
        }
        if ((i & 2) != 0) {
            str5 = rg5Var.b;
        } else {
            str5 = str2;
        }
        String str7 = rg5Var.c;
        Uri uri = rg5Var.d;
        Uri uri2 = rg5Var.e;
        if ((i & 32) != 0) {
            ti5Var2 = rg5Var.f;
        } else {
            ti5Var2 = ti5Var;
        }
        if ((i & 64) != 0) {
            date2 = rg5Var.g;
        } else {
            date2 = date;
        }
        if ((i & 128) != 0) {
            z3 = rg5Var.h;
        } else {
            z3 = z;
        }
        if ((i & 256) != 0) {
            str6 = rg5Var.i;
        } else {
            str6 = str3;
        }
        if ((i & 512) != 0) {
            j2 = rg5Var.j;
        } else {
            j2 = j;
        }
        if ((i & 1024) != 0) {
            z4 = rg5Var.k;
        } else {
            z4 = z2;
        }
        Long l = rg5Var.l;
        byte[] bArr = rg5Var.m;
        rg5Var.getClass();
        str4.getClass();
        str5.getClass();
        str7.getClass();
        uri.getClass();
        ti5Var2.getClass();
        str6.getClass();
        return new rg5(str4, str5, str7, uri, uri2, ti5Var2, date2, z3, str6, j2, z4, l, bArr);
    }

    public final boolean b(rg5 rg5Var) {
        rg5Var.getClass();
        return b53.x(this.d, rg5Var.d);
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
        if (!(obj instanceof rg5)) {
            return false;
        }
        rg5 rg5Var = (rg5) obj;
        if (b53.x(this.a, rg5Var.a) && b53.x(this.b, rg5Var.b) && b53.x(this.c, rg5Var.c) && b53.x(this.d, rg5Var.d) && b53.x(this.e, rg5Var.e) && b53.x(this.f, rg5Var.f) && b53.x(this.g, rg5Var.g) && this.h == rg5Var.h && b53.x(this.i, rg5Var.i) && im1.d(this.j, rg5Var.j) && this.k == rg5Var.k && b53.x(this.l, rg5Var.l) && b53.x(this.m, rg5Var.m)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4 = (this.d.hashCode() + ej6.b(ej6.b(this.a.hashCode() * 31, 31, this.b), 31, this.c)) * 31;
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
        int b = ej6.b(ej6.c((hashCode5 + hashCode2) * 31, this.h, 31), 31, this.i);
        hm1 hm1Var = im1.B;
        int c = ej6.c(b31.c(this.j, b, 31), this.k, 31);
        Long l = this.l;
        if (l == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = l.hashCode();
        }
        int i2 = (c + hashCode3) * 31;
        byte[] bArr = this.m;
        if (bArr != null) {
            i = Arrays.hashCode(bArr);
        }
        return i2 + i;
    }

    public final String toString() {
        ti5 ti5Var = this.f;
        Date date = this.g;
        String l = im1.l(this.j);
        String arrays = Arrays.toString(this.m);
        StringBuilder v = b31.v("Rom(name=", this.a, ", developerName=", this.b, ", fileName=");
        v.append(this.c);
        v.append(", uri=");
        v.append(this.d);
        v.append(", parentTreeUri=");
        v.append(this.e);
        v.append(", config=");
        v.append(ti5Var);
        v.append(", lastPlayed=");
        v.append(date);
        v.append(", isDsiWareTitle=");
        v.append(this.h);
        v.append(", retroAchievementsHash=");
        b31.B(v, this.i, ", totalPlayTime=", l, ", isFavorite=");
        v.append(this.k);
        v.append(", installedDsiWareTitleId=");
        v.append(this.l);
        v.append(", installedDsiWareIcon=");
        return b31.q(v, arrays, ")");
    }

    public rg5(String str, String str2, String str3, Uri uri, Uri uri2, ti5 ti5Var, Date date, boolean z, String str4, long j, boolean z2, Long l, byte[] bArr) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        uri.getClass();
        ti5Var.getClass();
        str4.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = uri;
        this.e = uri2;
        this.f = ti5Var;
        this.g = date;
        this.h = z;
        this.i = str4;
        this.j = j;
        this.k = z2;
        this.l = l;
        this.m = bArr;
    }
}
