package oe;

import java.util.List;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class q {

    /* renamed from: a  reason: collision with root package name */
    public final Long f10950a;

    /* renamed from: b  reason: collision with root package name */
    public final String f10951b;

    /* renamed from: c  reason: collision with root package name */
    public final String f10952c;

    /* renamed from: d  reason: collision with root package name */
    public final String f10953d;

    /* renamed from: e  reason: collision with root package name */
    public final Object f10954e;

    public q(Long l10, String str, String str2, String str3, List list) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        this.f10950a = l10;
        this.f10951b = str;
        this.f10952c = str2;
        this.f10953d = str3;
        this.f10954e = list;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof q) {
                q qVar = (q) obj;
                if (!nc.k.a(this.f10950a, qVar.f10950a) || !nc.k.a(this.f10951b, qVar.f10951b) || !nc.k.a(this.f10952c, qVar.f10952c) || !nc.k.a(this.f10953d, qVar.f10953d) || !this.f10954e.equals(qVar.f10954e)) {
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
        Long l10 = this.f10950a;
        if (l10 == null) {
            hashCode = 0;
        } else {
            hashCode = l10.hashCode();
        }
        return this.f10954e.hashCode() + w.d.d(w.d.d(w.d.d(hashCode * 31, 31, this.f10951b), 31, this.f10952c), 31, this.f10953d);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Game(id=");
        sb2.append(this.f10950a);
        sb2.append(", name=");
        sb2.append(this.f10951b);
        sb2.append(", gameCode=");
        w.d.B(sb2, this.f10952c, ", gameChecksum=", this.f10953d, ", cheats=");
        sb2.append(this.f10954e);
        sb2.append(")");
        return sb2.toString();
    }
}
