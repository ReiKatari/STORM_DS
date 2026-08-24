package defpackage;

import java.util.ArrayList;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xp3  reason: default package */
/* loaded from: classes.dex */
public final class xp3 extends z64 implements mo1 {
    public zp3 k0;

    @Override // defpackage.z64
    public final void J0() {
        this.k0.getClass();
    }

    @Override // defpackage.z64
    public final void K0() {
        zp3 zp3Var = this.k0;
        zp3Var.g();
        zp3Var.b = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof xp3) && nb3.k(this.k0, ((xp3) obj).k0)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.k0.hashCode();
    }

    @Override // defpackage.mo1
    public final void m0(um3 um3Var) {
        ArrayList arrayList = (ArrayList) this.k0.h;
        if (arrayList.size() <= 0) {
            um3Var.b();
        } else {
            xg6.A(arrayList.get(0));
            throw null;
        }
    }

    public final String toString() {
        return "DisplayingDisappearingItemsNode(animator=" + this.k0 + ')';
    }
}
