package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: fk3  reason: default package */
/* loaded from: classes.dex */
public final class fk3 {
    public static final java.util.UUID h = null;
    public final java.util.UUID a;
    public final java.lang.String b;
    public final defpackage.dk3 c;
    public final defpackage.ck3 d;
    public final boolean e;
    public final int f;
    public final java.util.Map g;

    static {
            java.util.UUID r0 = new java.util.UUID
            r1 = 0
            r0.<init>(r1, r1)
            defpackage.fk3.h = r0
            return
    }

    public fk3(java.util.UUID r1, java.lang.String r2, defpackage.dk3 r3, defpackage.ck3 r4, boolean r5, int r6, java.util.Map r7) {
            r0 = this;
            r3.getClass()
            r4.getClass()
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r4
            r0.e = r5
            r0.f = r6
            r0.g = r7
            return
    }

    public static defpackage.fk3 a(defpackage.fk3 r8, java.util.UUID r9, java.lang.String r10, defpackage.dk3 r11, defpackage.ck3 r12, boolean r13, int r14, java.util.Map r15, int r16) {
            r0 = r16 & 1
            if (r0 == 0) goto L6
            java.util.UUID r9 = r8.a
        L6:
            r1 = r9
            r9 = r16 & 2
            if (r9 == 0) goto Ld
            java.lang.String r10 = r8.b
        Ld:
            r2 = r10
            r9 = r16 & 4
            if (r9 == 0) goto L14
            dk3 r11 = r8.c
        L14:
            r3 = r11
            r9 = r16 & 8
            if (r9 == 0) goto L1b
            ck3 r12 = r8.d
        L1b:
            r4 = r12
            r9 = r16 & 16
            if (r9 == 0) goto L22
            boolean r13 = r8.e
        L22:
            r5 = r13
            r9 = r16 & 32
            if (r9 == 0) goto L29
            int r14 = r8.f
        L29:
            r6 = r14
            r9 = r16 & 64
            if (r9 == 0) goto L30
            java.util.Map r15 = r8.g
        L30:
            r7 = r15
            r3.getClass()
            r4.getClass()
            fk3 r0 = new fk3
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r0
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L48
        L3:
            boolean r0 = r3 instanceof defpackage.fk3
            if (r0 != 0) goto L8
            goto L46
        L8:
            fk3 r3 = (defpackage.fk3) r3
            java.util.UUID r0 = r2.a
            java.util.UUID r1 = r3.a
            boolean r0 = defpackage.nb3.k(r0, r1)
            if (r0 != 0) goto L15
            goto L46
        L15:
            java.lang.String r0 = r2.b
            java.lang.String r1 = r3.b
            boolean r0 = defpackage.nb3.k(r0, r1)
            if (r0 != 0) goto L20
            goto L46
        L20:
            dk3 r0 = r2.c
            dk3 r1 = r3.c
            if (r0 == r1) goto L27
            goto L46
        L27:
            ck3 r0 = r2.d
            ck3 r1 = r3.d
            if (r0 == r1) goto L2e
            goto L46
        L2e:
            boolean r0 = r2.e
            boolean r1 = r3.e
            if (r0 == r1) goto L35
            goto L46
        L35:
            int r0 = r2.f
            int r1 = r3.f
            if (r0 == r1) goto L3c
            goto L46
        L3c:
            java.util.Map r2 = r2.g
            java.util.Map r3 = r3.g
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L48
        L46:
            r2 = 0
            return r2
        L48:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r4 = this;
            r0 = 0
            java.util.UUID r1 = r4.a
            if (r1 != 0) goto L7
            r1 = r0
            goto Lb
        L7:
            int r1 = r1.hashCode()
        Lb:
            r2 = 31
            int r1 = r1 * r2
            java.lang.String r3 = r4.b
            if (r3 != 0) goto L13
            goto L17
        L13:
            int r0 = r3.hashCode()
        L17:
            int r1 = r1 + r0
            int r1 = r1 * r2
            dk3 r0 = r4.c
            int r0 = r0.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * r2
            ck3 r1 = r4.d
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * r2
            boolean r0 = r4.e
            int r0 = defpackage.xg6.e(r1, r0, r2)
            int r1 = r4.f
            int r0 = defpackage.lb1.a(r1, r0, r2)
            java.util.Map r4 = r4.g
            int r4 = r4.hashCode()
            int r4 = r4 + r0
            return r4
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "LayoutConfiguration(id="
            r0.<init>(r1)
            java.util.UUID r1 = r2.a
            r0.append(r1)
            java.lang.String r1 = ", name="
            r0.append(r1)
            java.lang.String r1 = r2.b
            r0.append(r1)
            java.lang.String r1 = ", type="
            r0.append(r1)
            dk3 r1 = r2.c
            r0.append(r1)
            java.lang.String r1 = ", orientation="
            r0.append(r1)
            ck3 r1 = r2.d
            r0.append(r1)
            java.lang.String r1 = ", useCustomOpacity="
            r0.append(r1)
            boolean r1 = r2.e
            r0.append(r1)
            java.lang.String r1 = ", opacity="
            r0.append(r1)
            int r1 = r2.f
            r0.append(r1)
            java.lang.String r1 = ", layoutVariants="
            r0.append(r1)
            java.util.Map r2 = r2.g
            r0.append(r2)
            java.lang.String r2 = ")"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
