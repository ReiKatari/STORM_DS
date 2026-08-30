package vg;

import nc.k;
import p7.o;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class b extends o {

    /* renamed from: c  reason: collision with root package name */
    public final ze.a f13830c;

    public b(ze.a aVar) {
        aVar.getClass();
        this.f13830c = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof b) && k.a(this.f13830c, ((b) obj).f13830c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f13830c.hashCode();
    }

    public final String toString() {
        return "ValidatingRom(rom=" + this.f13830c + ")";
    }
}
