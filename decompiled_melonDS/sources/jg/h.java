package jg;

import nd.a1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
@jd.g
/* loaded from: classes.dex */
public final class h extends k0.d {
    public static final g Companion = new Object();

    /* renamed from: e  reason: collision with root package name */
    public final String f7870e;

    public h(int i2, String str) {
        if (1 == (i2 & 1)) {
            this.f7870e = str;
        } else {
            a1.j(i2, 1, f.f7869a.e());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof h) && nc.k.a(this.f7870e, ((h) obj).f7870e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f7870e;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return kc.a.g("FolderCheats(folderName=", this.f7870e, ")");
    }

    public h(String str) {
        this.f7870e = str;
    }
}
