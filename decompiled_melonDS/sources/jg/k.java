package jg;

import nd.a1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
@jd.g
/* loaded from: classes.dex */
public final class k extends k0.d {
    public static final j Companion = new Object();

    /* renamed from: e  reason: collision with root package name */
    public final String f7872e;

    public k(int i2, String str) {
        if (1 == (i2 & 1)) {
            this.f7872e = str;
        } else {
            a1.j(i2, 1, i.f7871a.e());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof k) && nc.k.a(this.f7872e, ((k) obj).f7872e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f7872e;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return kc.a.g("GameFolders(gameName=", this.f7872e, ")");
    }

    public k(String str) {
        this.f7872e = str;
    }
}
