package wg;

import p7.t;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class a extends c {

    /* renamed from: a  reason: collision with root package name */
    public final t f14215a;

    public a(t tVar) {
        this.f14215a = tVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof a) || !this.f14215a.equals(((a) obj).f14215a)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        return this.f14215a.hashCode();
    }

    public final String toString() {
        return "Firmware(result=" + this.f14215a + ")";
    }
}
