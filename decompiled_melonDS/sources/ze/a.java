package ze;

import android.net.Uri;
import java.util.Date;
import nc.k;
import w.d;
import wc.b;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final String f15053a;

    /* renamed from: b  reason: collision with root package name */
    public final String f15054b;

    /* renamed from: c  reason: collision with root package name */
    public final String f15055c;

    /* renamed from: d  reason: collision with root package name */
    public final Uri f15056d;

    /* renamed from: e  reason: collision with root package name */
    public final Uri f15057e;

    /* renamed from: f  reason: collision with root package name */
    public af.a f15058f;

    /* renamed from: g  reason: collision with root package name */
    public Date f15059g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f15060h;

    /* renamed from: i  reason: collision with root package name */
    public final String f15061i;

    /* renamed from: j  reason: collision with root package name */
    public final long f15062j;

    public a(String str, String str2, String str3, Uri uri, Uri uri2, af.a aVar, Date date, boolean z10, String str4, long j2) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        uri.getClass();
        aVar.getClass();
        str4.getClass();
        this.f15053a = str;
        this.f15054b = str2;
        this.f15055c = str3;
        this.f15056d = uri;
        this.f15057e = uri2;
        this.f15058f = aVar;
        this.f15059g = date;
        this.f15060h = z10;
        this.f15061i = str4;
        this.f15062j = j2;
    }

    public static a a(a aVar, String str, String str2, af.a aVar2, boolean z10, String str3, long j2, int i2) {
        String str4;
        af.a aVar3;
        boolean z11;
        String str5;
        long j10;
        if ((i2 & 1) != 0) {
            str = aVar.f15053a;
        }
        String str6 = str;
        if ((i2 & 2) != 0) {
            str4 = aVar.f15054b;
        } else {
            str4 = str2;
        }
        String str7 = aVar.f15055c;
        Uri uri = aVar.f15056d;
        Uri uri2 = aVar.f15057e;
        if ((i2 & 32) != 0) {
            aVar3 = aVar.f15058f;
        } else {
            aVar3 = aVar2;
        }
        Date date = aVar.f15059g;
        if ((i2 & 128) != 0) {
            z11 = aVar.f15060h;
        } else {
            z11 = z10;
        }
        if ((i2 & 256) != 0) {
            str5 = aVar.f15061i;
        } else {
            str5 = str3;
        }
        if ((i2 & 512) != 0) {
            j10 = aVar.f15062j;
        } else {
            j10 = j2;
        }
        aVar.getClass();
        str6.getClass();
        str4.getClass();
        str7.getClass();
        uri.getClass();
        aVar3.getClass();
        str5.getClass();
        return new a(str6, str4, str7, uri, uri2, aVar3, date, z11, str5, j10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (k.a(this.f15053a, aVar.f15053a) && k.a(this.f15054b, aVar.f15054b) && k.a(this.f15055c, aVar.f15055c) && k.a(this.f15056d, aVar.f15056d) && k.a(this.f15057e, aVar.f15057e) && k.a(this.f15058f, aVar.f15058f) && k.a(this.f15059g, aVar.f15059g) && this.f15060h == aVar.f15060h && k.a(this.f15061i, aVar.f15061i)) {
                long j2 = aVar.f15062j;
                l7.a aVar2 = b.B;
                if (this.f15062j == j2) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.f15056d.hashCode() + d.d(d.d(this.f15053a.hashCode() * 31, 31, this.f15054b), 31, this.f15055c)) * 31;
        int i2 = 0;
        Uri uri = this.f15057e;
        if (uri == null) {
            hashCode = 0;
        } else {
            hashCode = uri.hashCode();
        }
        int hashCode3 = (this.f15058f.hashCode() + ((hashCode2 + hashCode) * 31)) * 31;
        Date date = this.f15059g;
        if (date != null) {
            i2 = date.hashCode();
        }
        int d4 = d.d(d.e((hashCode3 + i2) * 31, this.f15060h, 31), 31, this.f15061i);
        l7.a aVar = b.B;
        return Long.hashCode(this.f15062j) + d4;
    }

    public final String toString() {
        af.a aVar = this.f15058f;
        Date date = this.f15059g;
        String k10 = b.k(this.f15062j);
        StringBuilder k11 = kc.a.k("Rom(name=", this.f15053a, ", developerName=", this.f15054b, ", fileName=");
        k11.append(this.f15055c);
        k11.append(", uri=");
        k11.append(this.f15056d);
        k11.append(", parentTreeUri=");
        k11.append(this.f15057e);
        k11.append(", config=");
        k11.append(aVar);
        k11.append(", lastPlayed=");
        k11.append(date);
        k11.append(", isDsiWareTitle=");
        k11.append(this.f15060h);
        k11.append(", retroAchievementsHash=");
        k11.append(this.f15061i);
        k11.append(", totalPlayTime=");
        k11.append(k10);
        k11.append(")");
        return k11.toString();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(String str, String str2, String str3, Uri uri, Uri uri2, af.a aVar, Date date, boolean z10, String str4) {
        this(str, str2, str3, uri, uri2, aVar, date, z10, str4, 0L);
        l7.a aVar2 = b.B;
    }
}
