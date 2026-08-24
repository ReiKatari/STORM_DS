package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: gs3  reason: default package */
/* loaded from: classes.dex */
public final class gs3 implements defpackage.js3 {
    public final defpackage.y85 a;
    public final defpackage.ls3 b;

    public gs3(defpackage.y85 r6) {
            r5 = this;
            r6.getClass()
            r5.<init>()
            r5.a = r6
            ls3 r0 = new ls3
            long r1 = r6.a
            long r3 = r6.b
            r0.<init>(r1, r3)
            r5.b = r0
            return
    }

    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = 1
            if (r3 != r4) goto L4
            return r0
        L4:
            boolean r1 = r4 instanceof defpackage.gs3
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            gs3 r4 = (defpackage.gs3) r4
            y85 r3 = r3.a
            y85 r4 = r4.a
            boolean r3 = defpackage.nb3.k(r3, r4)
            if (r3 != 0) goto L17
            return r2
        L17:
            return r0
    }

    @Override // defpackage.js3
    public final defpackage.ls3 getKey() {
            r0 = this;
            ls3 r0 = r0.b
            return r0
    }

    public final int hashCode() {
            r0 = this;
            y85 r0 = r0.a
            int r0 = r0.hashCode()
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Started(event="
            r0.<init>(r1)
            y85 r2 = r2.a
            r0.append(r2)
            java.lang.String r2 = ")"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
