package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: po2  reason: default package */
/* loaded from: classes.dex */
public class po2 extends defpackage.lb0 implements defpackage.oo2, defpackage.yf3, defpackage.ao2 {
    public final int Z;

    public po2(int r9, java.lang.Class r10, java.lang.String r11, java.lang.String r12, int r13) {
            r8 = this;
            kb0 r2 = defpackage.kb0.A
            r7 = 0
            r0 = r8
            r1 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
    }

    public po2(int r7, java.lang.Object r8, java.lang.Class r9, java.lang.String r10, java.lang.String r11, int r12, int r13) {
            r6 = this;
            r13 = 1
            r12 = r12 & r13
            if (r12 != r13) goto Lb
        L4:
            r0 = r6
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r13
            goto Ld
        Lb:
            r13 = 0
            goto L4
        Ld:
            r0.<init>(r1, r2, r3, r4, r5)
            r0.Z = r7
            return
    }

    @Override // defpackage.lb0
    public final defpackage.yf3 a() {
            r1 = this;
            lh5 r0 = defpackage.gh5.a
            r0.getClass()
            return r1
    }

    @Override // defpackage.oo2
    public final int d() {
            r0 = this;
            int r0 = r0.Z
            return r0
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r3 != r2) goto L3
            goto L35
        L3:
            boolean r0 = r3 instanceof defpackage.po2
            if (r0 == 0) goto L37
            po2 r3 = (defpackage.po2) r3
            java.lang.String r0 = r2.R
            java.lang.String r1 = r3.R
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L4b
            java.lang.String r0 = r2.X
            java.lang.String r1 = r3.X
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L4b
            java.lang.Object r0 = r2.B
            java.lang.Object r1 = r3.B
            boolean r0 = defpackage.nb3.k(r0, r1)
            if (r0 == 0) goto L4b
            yq0 r2 = r2.b()
            yq0 r3 = r3.b()
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L4b
        L35:
            r2 = 1
            return r2
        L37:
            boolean r0 = r3 instanceof defpackage.po2
            if (r0 == 0) goto L4b
            yf3 r0 = r2.A
            if (r0 != 0) goto L45
            r2.a()
            r2.A = r2
            goto L46
        L45:
            r2 = r0
        L46:
            boolean r2 = r3.equals(r2)
            return r2
        L4b:
            r2 = 0
            return r2
    }

    public final int hashCode() {
            r3 = this;
            r3.b()
            yq0 r0 = r3.b()
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r3.R
            int r0 = defpackage.xg6.d(r0, r1, r2)
            java.lang.String r3 = r3.X
            int r3 = r3.hashCode()
            int r3 = r3 + r0
            return r3
    }

    public final java.lang.String toString() {
            r2 = this;
            yf3 r0 = r2.A
            if (r0 != 0) goto La
            r2.a()
            r2.A = r2
            r0 = r2
        La:
            if (r0 == r2) goto L11
            java.lang.String r2 = r0.toString()
            return r2
        L11:
            java.lang.String r0 = "<init>"
            java.lang.String r2 = r2.R
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L1e
            java.lang.String r2 = "constructor (Kotlin reflection is not available)"
            return r2
        L1e:
            java.lang.String r0 = "function "
            java.lang.String r1 = " (Kotlin reflection is not available)"
            java.lang.String r2 = defpackage.lb1.A(r0, r2, r1)
            return r2
    }
}
