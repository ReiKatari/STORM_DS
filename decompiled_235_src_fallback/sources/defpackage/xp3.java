package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xp3  reason: default package */
/* loaded from: classes.dex */
public final class xp3 extends defpackage.z64 implements defpackage.mo1 {
    public defpackage.zp3 k0;

    @Override // defpackage.z64
    public final void J0() {
            r0 = this;
            zp3 r0 = r0.k0
            r0.getClass()
            return
    }

    @Override // defpackage.z64
    public final void K0() {
            r1 = this;
            zp3 r1 = r1.k0
            r1.g()
            r0 = 0
            r1.b = r0
            return
    }

    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = 1
            if (r3 != r4) goto L4
            return r0
        L4:
            boolean r1 = r4 instanceof defpackage.xp3
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            xp3 r4 = (defpackage.xp3) r4
            zp3 r3 = r3.k0
            zp3 r4 = r4.k0
            boolean r3 = defpackage.nb3.k(r3, r4)
            if (r3 != 0) goto L17
            return r2
        L17:
            return r0
    }

    public final int hashCode() {
            r0 = this;
            zp3 r0 = r0.k0
            int r0 = r0.hashCode()
            return r0
    }

    @Override // defpackage.mo1
    public final void m0(defpackage.um3 r2) {
            r1 = this;
            zp3 r1 = r1.k0
            java.lang.Object r1 = r1.h
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            int r0 = r1.size()
            if (r0 > 0) goto L10
            r2.b()
            return
        L10:
            r2 = 0
            java.lang.Object r1 = r1.get(r2)
            defpackage.xg6.A(r1)
            r1 = 0
            throw r1
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "DisplayingDisappearingItemsNode(animator="
            r0.<init>(r1)
            zp3 r2 = r2.k0
            r0.append(r2)
            r2 = 41
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
