package defpackage;

import java.util.List;
import java.util.Map;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: pr7  reason: default package */
/* loaded from: classes.dex */
public final class pr7 {
    public final boolean a;
    public final String b;
    public final na c;
    public final sr7 d;
    public final String e;
    public final List f;
    public final List g;
    public final hm4 h;
    public final Map i;
    public final String j;
    public final String k;

    public pr7(boolean z, String str, na naVar, sr7 sr7Var, String str2, List list, List list2, hm4 hm4Var, Map map, String str3, String str4) {
        naVar.getClass();
        sr7Var.getClass();
        list.getClass();
        list2.getClass();
        map.getClass();
        this.a = z;
        this.b = str;
        this.c = naVar;
        this.d = sr7Var;
        this.e = str2;
        this.f = list;
        this.g = list2;
        this.h = hm4Var;
        this.i = map;
        this.j = str3;
        this.k = str4;
    }

    public static pr7 a(pr7 pr7Var, boolean z, String str, na naVar, sr7 sr7Var, String str2, List list, List list2, hm4 hm4Var, Map map, String str3, String str4, int i) {
        sr7 sr7Var2;
        String str5;
        List list3;
        List list4;
        hm4 hm4Var2;
        Map map2;
        String str6;
        String str7;
        if ((i & 1) != 0) {
            z = pr7Var.a;
        }
        boolean z2 = z;
        if ((i & 2) != 0) {
            str = pr7Var.b;
        }
        String str8 = str;
        if ((i & 4) != 0) {
            naVar = pr7Var.c;
        }
        na naVar2 = naVar;
        if ((i & 8) != 0) {
            sr7Var2 = pr7Var.d;
        } else {
            sr7Var2 = sr7Var;
        }
        if ((i & 16) != 0) {
            str5 = pr7Var.e;
        } else {
            str5 = str2;
        }
        if ((i & 32) != 0) {
            list3 = pr7Var.f;
        } else {
            list3 = list;
        }
        if ((i & 64) != 0) {
            list4 = pr7Var.g;
        } else {
            list4 = list2;
        }
        if ((i & 128) != 0) {
            hm4Var2 = pr7Var.h;
        } else {
            hm4Var2 = hm4Var;
        }
        if ((i & 256) != 0) {
            map2 = pr7Var.i;
        } else {
            map2 = map;
        }
        if ((i & 512) != 0) {
            str6 = pr7Var.j;
        } else {
            str6 = str3;
        }
        if ((i & 1024) != 0) {
            str7 = pr7Var.k;
        } else {
            str7 = str4;
        }
        pr7Var.getClass();
        str8.getClass();
        naVar2.getClass();
        sr7Var2.getClass();
        list3.getClass();
        list4.getClass();
        map2.getClass();
        return new pr7(z2, str8, naVar2, sr7Var2, str5, list3, list4, hm4Var2, map2, str6, str7);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof pr7) {
                pr7 pr7Var = (pr7) obj;
                if (this.a != pr7Var.a || !this.b.equals(pr7Var.b) || this.c != pr7Var.c || this.d != pr7Var.d || !nb3.k(this.e, pr7Var.e) || !nb3.k(this.f, pr7Var.f) || !nb3.k(this.g, pr7Var.g) || !nb3.k(this.h, pr7Var.h) || !nb3.k(this.i, pr7Var.i) || !nb3.k(this.j, pr7Var.j) || !nb3.k(this.k, pr7Var.k)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4 = (this.d.hashCode() + ((this.c.hashCode() + xg6.d(Boolean.hashCode(this.a) * 31, 31, this.b)) * 31)) * 31;
        int i = 0;
        String str = this.e;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int b = i61.b(i61.b((hashCode4 + hashCode) * 31, this.f, 31), this.g, 31);
        hm4 hm4Var = this.h;
        if (hm4Var == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = hm4Var.hashCode();
        }
        int hashCode5 = (this.i.hashCode() + ((b + hashCode2) * 31)) * 31;
        String str2 = this.j;
        if (str2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str2.hashCode();
        }
        int i2 = (hashCode5 + hashCode3) * 31;
        String str3 = this.k;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return i2 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UiState(isSupported=");
        sb.append(this.a);
        sb.append(", gpuDescription=");
        sb.append(this.b);
        sb.append(", gpuSeries=");
        sb.append(this.c);
        sb.append(", driverMode=");
        sb.append(this.d);
        sb.append(", selectedDriverId=");
        sb.append(this.e);
        sb.append(", installedDrivers=");
        sb.append(this.f);
        sb.append(", onlineDrivers=");
        sb.append(this.g);
        sb.append(", recommendedDriver=");
        sb.append(this.h);
        sb.append(", downloadProgress=");
        sb.append(this.i);
        sb.append(", activeDownloadingId=");
        sb.append(this.j);
        sb.append(", message=");
        return i61.n(sb, this.k, ")");
    }
}
