package kg;

import nc.k;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final String f8295a;

    /* renamed from: b  reason: collision with root package name */
    public final String f8296b;

    /* renamed from: c  reason: collision with root package name */
    public final String f8297c;

    public e(String str, String str2, String str3) {
        str.getClass();
        str2.getClass();
        this.f8295a = str;
        this.f8296b = str2;
        this.f8297c = str3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof e) {
                e eVar = (e) obj;
                if (!k.a(this.f8295a, eVar.f8295a) || !k.a(this.f8296b, eVar.f8296b) || !this.f8297c.equals(eVar.f8297c)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f8297c.hashCode() + w.d.d(this.f8295a.hashCode() * 31, 31, this.f8296b);
    }

    public final String toString() {
        return w.d.s(kc.a.k("CheatSubmissionForm(name=", this.f8295a, ", description=", this.f8296b, ", code="), this.f8297c, ")");
    }
}
