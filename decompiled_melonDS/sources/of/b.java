package of;

import af.d;
import af.e;
import af.f;
import af.h;
import android.net.Uri;
import java.util.Date;
import java.util.UUID;
import m9.o;
import nc.k;
import of.c;
import wc.j;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class b {
    @va.b("name")

    /* renamed from: a  reason: collision with root package name */
    private final String f10972a;
    @va.b("developerName")

    /* renamed from: b  reason: collision with root package name */
    private final String f10973b;
    @va.b("fileName")

    /* renamed from: c  reason: collision with root package name */
    private final String f10974c;
    @va.b("uri")

    /* renamed from: d  reason: collision with root package name */
    private final String f10975d;
    @va.b("parentTreeUri")

    /* renamed from: e  reason: collision with root package name */
    private final String f10976e;
    @va.b("config")

    /* renamed from: f  reason: collision with root package name */
    private of.a f10977f;
    @va.b("lastPlayed")

    /* renamed from: g  reason: collision with root package name */
    private Date f10978g;
    @va.b("isDsiWareTitle")

    /* renamed from: h  reason: collision with root package name */
    private final boolean f10979h;
    @va.b("retroAchievementsHash")

    /* renamed from: i  reason: collision with root package name */
    private final String f10980i;
    @va.b("totalPlayTime")

    /* renamed from: j  reason: collision with root package name */
    private final long f10981j;

    /* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
    /* loaded from: classes.dex */
    public static final class a {
        public static b a(ze.a aVar) {
            String str;
            String str2;
            c.b bVar;
            String str3;
            af.b bVar2;
            String str4;
            af.b bVar3;
            String str5;
            Uri uri;
            Uri uri2;
            aVar.getClass();
            String str6 = aVar.f15053a;
            String str7 = aVar.f15054b;
            String str8 = aVar.f15055c;
            String uri3 = aVar.f15056d.toString();
            uri3.getClass();
            Uri uri4 = aVar.f15057e;
            if (uri4 != null) {
                str = uri4.toString();
            } else {
                str = null;
            }
            af.a aVar2 = aVar.f15058f;
            aVar2.getClass();
            f fVar = aVar2.f707a;
            h hVar = aVar2.f708b;
            UUID uuid = aVar2.f709c;
            if (uuid != null) {
                str2 = uuid.toString();
            } else {
                str2 = null;
            }
            a.a aVar3 = aVar2.f710d;
            aVar3.getClass();
            if (aVar3.equals(d.f715b)) {
                bVar = c.b.None;
            } else if (aVar3 instanceof af.b) {
                bVar = c.b.GbaRom;
            } else if (aVar3.equals(e.f716b)) {
                bVar = c.b.RumblePak;
            } else if (aVar3.equals(af.c.f714b)) {
                bVar = c.b.MemoryExpansion;
            } else {
                o.o();
                return null;
            }
            boolean z10 = aVar3 instanceof af.b;
            if (z10) {
                str3 = str6;
                bVar2 = (af.b) aVar3;
            } else {
                str3 = str6;
                bVar2 = null;
            }
            if (bVar2 != null && (uri2 = bVar2.f712b) != null) {
                str4 = uri2.toString();
            } else {
                str4 = null;
            }
            if (z10) {
                bVar3 = (af.b) aVar3;
            } else {
                bVar3 = null;
            }
            if (bVar3 != null && (uri = bVar3.f713c) != null) {
                str5 = uri.toString();
            } else {
                str5 = null;
            }
            return new b(str3, str7, str8, uri3, str, new of.a(fVar, hVar, str2, new c(bVar, str4, str5), aVar2.f711e), aVar.f15059g, aVar.f15060h, aVar.f15061i, wc.b.d(aVar.f15062j));
        }
    }

    public b(String str, String str2, String str3, String str4, String str5, of.a aVar, Date date, boolean z10, String str6, long j2) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str6.getClass();
        this.f10972a = str;
        this.f10973b = str2;
        this.f10974c = str3;
        this.f10975d = str4;
        this.f10976e = str5;
        this.f10977f = aVar;
        this.f10978g = date;
        this.f10979h = z10;
        this.f10980i = str6;
        this.f10981j = j2;
    }

    public static b a(b bVar, of.a aVar) {
        String str = bVar.f10972a;
        String str2 = bVar.f10973b;
        String str3 = bVar.f10974c;
        String str4 = bVar.f10975d;
        String str5 = bVar.f10976e;
        Date date = bVar.f10978g;
        boolean z10 = bVar.f10979h;
        String str6 = bVar.f10980i;
        long j2 = bVar.f10981j;
        bVar.getClass();
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        str6.getClass();
        return new b(str, str2, str3, str4, str5, aVar, date, z10, str6, j2);
    }

    public final of.a b() {
        return this.f10977f;
    }

    public final boolean c() {
        return this.f10979h;
    }

    public final ze.a d() {
        Uri uri;
        String str = this.f10972a;
        String str2 = this.f10973b;
        String str3 = this.f10974c;
        Uri parse = Uri.parse(this.f10975d);
        String str4 = this.f10976e;
        if (str4 != null) {
            uri = Uri.parse(str4);
        } else {
            uri = null;
        }
        af.a b10 = this.f10977f.b();
        Date date = this.f10978g;
        boolean z10 = this.f10979h;
        String str5 = this.f10980i;
        l7.a aVar = wc.b.B;
        return new ze.a(str, str2, str3, parse, uri, b10, date, z10, str5, j.m(this.f10981j, wc.e.MILLISECONDS));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (k.a(this.f10972a, bVar.f10972a) && k.a(this.f10973b, bVar.f10973b) && k.a(this.f10974c, bVar.f10974c) && k.a(this.f10975d, bVar.f10975d) && k.a(this.f10976e, bVar.f10976e) && k.a(this.f10977f, bVar.f10977f) && k.a(this.f10978g, bVar.f10978g) && this.f10979h == bVar.f10979h && k.a(this.f10980i, bVar.f10980i) && this.f10981j == bVar.f10981j) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int d4 = w.d.d(w.d.d(w.d.d(this.f10972a.hashCode() * 31, 31, this.f10973b), 31, this.f10974c), 31, this.f10975d);
        String str = this.f10976e;
        int i2 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int hashCode2 = (this.f10977f.hashCode() + ((d4 + hashCode) * 31)) * 31;
        Date date = this.f10978g;
        if (date != null) {
            i2 = date.hashCode();
        }
        return Long.hashCode(this.f10981j) + w.d.d(w.d.e((hashCode2 + i2) * 31, this.f10979h, 31), 31, this.f10980i);
    }

    public final String toString() {
        String str = this.f10972a;
        String str2 = this.f10973b;
        String str3 = this.f10974c;
        String str4 = this.f10975d;
        String str5 = this.f10976e;
        of.a aVar = this.f10977f;
        Date date = this.f10978g;
        boolean z10 = this.f10979h;
        String str6 = this.f10980i;
        long j2 = this.f10981j;
        StringBuilder k10 = kc.a.k("RomDto(name=", str, ", developerName=", str2, ", fileName=");
        w.d.B(k10, str3, ", uri=", str4, ", parentTreeUri=");
        k10.append(str5);
        k10.append(", config=");
        k10.append(aVar);
        k10.append(", lastPlayed=");
        k10.append(date);
        k10.append(", isDsiWareTitle=");
        k10.append(z10);
        k10.append(", retroAchievementsHash=");
        k10.append(str6);
        k10.append(", totalPlayTime=");
        k10.append(j2);
        k10.append(")");
        return k10.toString();
    }
}
