package g9;

import d9.p;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class m extends e {

    /* renamed from: a  reason: collision with root package name */
    public final p f5627a;

    /* renamed from: b  reason: collision with root package name */
    public final String f5628b;

    /* renamed from: c  reason: collision with root package name */
    public final d9.f f5629c;

    public m(p pVar, String str, d9.f fVar) {
        this.f5627a = pVar;
        this.f5628b = str;
        this.f5629c = fVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof m) {
                m mVar = (m) obj;
                if (this.f5627a.equals(mVar.f5627a) && nc.k.a(this.f5628b, mVar.f5628b) && this.f5629c == mVar.f5629c) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i2;
        int hashCode = this.f5627a.hashCode() * 31;
        String str = this.f5628b;
        if (str != null) {
            i2 = str.hashCode();
        } else {
            i2 = 0;
        }
        return this.f5629c.hashCode() + ((hashCode + i2) * 31);
    }
}
