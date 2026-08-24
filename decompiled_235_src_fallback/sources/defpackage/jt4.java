package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: jt4  reason: default package */
/* loaded from: classes.dex */
public final class jt4 implements defpackage.wq7 {
    @Override // defpackage.wq7
    public final defpackage.p97 a(defpackage.fp r3) {
            r2 = this;
            p97 r2 = new p97
            fp r0 = new fp
            r1 = 8226(0x2022, float:1.1527E-41)
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r3 = r3.B
            int r3 = r3.length()
            java.lang.String r3 = defpackage.xs6.c0(r3, r1)
            r0.<init>(r3)
            jd1 r3 = defpackage.lk4.a
            r2.<init>(r0, r3)
            return r2
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            r0 = 1
            if (r1 != r2) goto L4
            return r0
        L4:
            boolean r1 = r2 instanceof defpackage.jt4
            if (r1 != 0) goto La
            r1 = 0
            return r1
        La:
            return r0
    }

    public final int hashCode() {
            r0 = this;
            r0 = 8226(0x2022, float:1.1527E-41)
            int r0 = java.lang.Character.hashCode(r0)
            return r0
    }
}
