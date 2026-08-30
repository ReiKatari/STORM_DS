package oe;

import java.util.ArrayList;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final Long f10916a;

    /* renamed from: b  reason: collision with root package name */
    public final String f10917b;

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList f10918c;

    public c(Long l10, String str, ArrayList arrayList) {
        str.getClass();
        this.f10916a = l10;
        this.f10917b = str;
        this.f10918c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof c) {
                c cVar = (c) obj;
                if (!nc.k.a(this.f10916a, cVar.f10916a) || !nc.k.a(this.f10917b, cVar.f10917b) || !this.f10918c.equals(cVar.f10918c)) {
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
        Long l10 = this.f10916a;
        if (l10 == null) {
            hashCode = 0;
        } else {
            hashCode = l10.hashCode();
        }
        return this.f10918c.hashCode() + w.d.d(hashCode * 31, 31, this.f10917b);
    }

    public final String toString() {
        return "CheatFolder(id=" + this.f10916a + ", name=" + this.f10917b + ", cheats=" + this.f10918c + ")";
    }
}
