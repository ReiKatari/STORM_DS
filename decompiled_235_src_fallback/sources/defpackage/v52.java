package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: v52  reason: default package */
/* loaded from: classes.dex */
public final class v52 implements defpackage.gg3 {
    public final java.lang.Enum[] a;
    public final defpackage.ex6 b;

    public v52(java.lang.String r2, java.lang.Enum[] r3) {
            r1 = this;
            r3.getClass()
            r1.<init>()
            r1.a = r3
            q6 r3 = new q6
            r0 = 29
            r3.<init>(r0, r1, r2)
            ex6 r2 = new ex6
            r2.<init>(r3)
            r1.b = r2
            return
    }

    @Override // defpackage.gg3
    public final java.lang.Object c(defpackage.sc1 r4) {
            r3 = this;
            wb6 r0 = r3.e()
            int r4 = r4.J(r0)
            java.lang.Enum[] r0 = r3.a
            if (r4 < 0) goto L12
            int r1 = r0.length
            if (r4 >= r1) goto L12
            r3 = r0[r4]
            return r3
        L12:
            fc6 r1 = new fc6
            wb6 r3 = r3.e()
            java.lang.String r3 = r3.a()
            int r0 = r0.length
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r4)
            java.lang.String r4 = " is not among valid "
            r2.append(r4)
            r2.append(r3)
            java.lang.String r3 = " enum values, values size is "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r3 = r2.toString()
            r1.<init>(r3)
            throw r1
    }

    @Override // defpackage.gg3
    public final void d(defpackage.x32 r4, java.lang.Object r5) {
            r3 = this;
            java.lang.Enum r5 = (java.lang.Enum) r5
            r5.getClass()
            java.lang.Enum[] r0 = r3.a
            int r1 = defpackage.fv.K0(r0, r5)
            r2 = -1
            if (r1 == r2) goto L16
            wb6 r3 = r3.e()
            r4.K(r3, r1)
            return
        L16:
            fc6 r4 = new fc6
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r5)
            wb6 r3 = r3.e()
            java.lang.String r3 = r3.a()
            java.lang.String r5 = java.util.Arrays.toString(r0)
            r5.getClass()
            java.lang.String r0 = " is not a valid enum "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r3 = ", must be one of "
            r1.append(r3)
            r1.append(r5)
            java.lang.String r3 = r1.toString()
            r4.<init>(r3)
            throw r4
    }

    @Override // defpackage.gg3
    public final defpackage.wb6 e() {
            r0 = this;
            ex6 r0 = r0.b
            java.lang.Object r0 = r0.getValue()
            wb6 r0 = (defpackage.wb6) r0
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "kotlinx.serialization.internal.EnumSerializer<"
            r0.<init>(r1)
            wb6 r2 = r2.e()
            java.lang.String r2 = r2.a()
            r0.append(r2)
            r2 = 62
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
