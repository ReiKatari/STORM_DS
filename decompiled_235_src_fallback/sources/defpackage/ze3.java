package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ze3  reason: default package */
/* loaded from: classes.dex */
public final class ze3 extends defpackage.ee3 {
    public final defpackage.aw3 A;

    public ze3() {
            r2 = this;
            r2.<init>()
            aw3 r0 = new aw3
            zh2 r1 = defpackage.aw3.e0
            r1 = 0
            r0.<init>(r1)
            r2.A = r0
            return
    }

    public final void d(java.lang.String r1, defpackage.ee3 r2) {
            r0 = this;
            if (r2 != 0) goto L4
            ve3 r2 = defpackage.ve3.A
        L4:
            aw3 r0 = r0.A
            r0.put(r1, r2)
            return
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r2 == r1) goto L15
            boolean r0 = r2 instanceof defpackage.ze3
            if (r0 == 0) goto L13
            ze3 r2 = (defpackage.ze3) r2
            aw3 r2 = r2.A
            aw3 r1 = r1.A
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L13
            goto L15
        L13:
            r1 = 0
            return r1
        L15:
            r1 = 1
            return r1
    }

    public final int hashCode() {
            r0 = this;
            aw3 r0 = r0.A
            int r0 = r0.hashCode()
            return r0
    }
}
