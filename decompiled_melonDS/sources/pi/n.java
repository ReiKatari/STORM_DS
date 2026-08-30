package pi;

import java.text.DateFormat;
import java.util.Date;
import java.util.regex.Pattern;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class n {

    /* renamed from: k  reason: collision with root package name */
    public static final Pattern f11761k = Pattern.compile("(\\d{2,4})[^\\d]*");

    /* renamed from: l  reason: collision with root package name */
    public static final Pattern f11762l = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");
    public static final Pattern m = Pattern.compile("(\\d{1,2})[^\\d]*");

    /* renamed from: n  reason: collision with root package name */
    public static final Pattern f11763n = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* renamed from: a  reason: collision with root package name */
    public final String f11764a;

    /* renamed from: b  reason: collision with root package name */
    public final String f11765b;

    /* renamed from: c  reason: collision with root package name */
    public final long f11766c;

    /* renamed from: d  reason: collision with root package name */
    public final String f11767d;

    /* renamed from: e  reason: collision with root package name */
    public final String f11768e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f11769f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f11770g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f11771h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f11772i;

    /* renamed from: j  reason: collision with root package name */
    public final String f11773j;

    public n(String str, String str2, long j2, String str3, String str4, boolean z10, boolean z11, boolean z12, boolean z13, String str5) {
        this.f11764a = str;
        this.f11765b = str2;
        this.f11766c = j2;
        this.f11767d = str3;
        this.f11768e = str4;
        this.f11769f = z10;
        this.f11770g = z11;
        this.f11771h = z12;
        this.f11772i = z13;
        this.f11773j = str5;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof n) {
            n nVar = (n) obj;
            if (nVar.f11764a.equals(this.f11764a) && nVar.f11765b.equals(this.f11765b) && nVar.f11766c == this.f11766c && nVar.f11767d.equals(this.f11767d) && nVar.f11768e.equals(this.f11768e) && nVar.f11769f == this.f11769f && nVar.f11770g == this.f11770g && nVar.f11771h == this.f11771h && nVar.f11772i == this.f11772i && nc.k.a(nVar.f11773j, this.f11773j)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int i2;
        int e6 = w.d.e(w.d.e(w.d.e(w.d.e(w.d.d(w.d.d(w.d.f(this.f11766c, w.d.d(w.d.d(527, 31, this.f11764a), 31, this.f11765b), 31), 31, this.f11767d), 31, this.f11768e), this.f11769f, 31), this.f11770g, 31), this.f11771h, 31), this.f11772i, 31);
        String str = this.f11773j;
        if (str != null) {
            i2 = str.hashCode();
        } else {
            i2 = 0;
        }
        return e6 + i2;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f11764a);
        sb2.append('=');
        sb2.append(this.f11765b);
        if (this.f11771h) {
            long j2 = this.f11766c;
            if (j2 == Long.MIN_VALUE) {
                sb2.append("; max-age=0");
            } else {
                sb2.append("; expires=");
                String format = ((DateFormat) ui.c.f13553a.get()).format(new Date(j2));
                format.getClass();
                sb2.append(format);
            }
        }
        if (!this.f11772i) {
            sb2.append("; domain=");
            sb2.append(this.f11767d);
        }
        sb2.append("; path=");
        sb2.append(this.f11768e);
        if (this.f11769f) {
            sb2.append("; secure");
        }
        if (this.f11770g) {
            sb2.append("; httponly");
        }
        String str = this.f11773j;
        if (str != null) {
            sb2.append("; samesite=");
            sb2.append(str);
        }
        return sb2.toString();
    }
}
