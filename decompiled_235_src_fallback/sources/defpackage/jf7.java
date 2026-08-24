package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: jf7  reason: default package */
/* loaded from: classes.dex */
public final class jf7 {
    public final defpackage.my4 a;
    public final defpackage.d83 b;
    public final defpackage.ko4 c;
    public final java.util.List d;
    public final defpackage.ok3 e;

    public jf7(defpackage.my4 r1, defpackage.d83 r2, defpackage.ko4 r3, java.util.List r4, defpackage.ok3 r5) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            r3.getClass()
            r4.getClass()
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r4
            r0.e = r5
            return
    }

    public static defpackage.jf7 a(defpackage.jf7 r6, defpackage.my4 r7, defpackage.ko4 r8, defpackage.ok3 r9, int r10) {
            r0 = r10 & 1
            if (r0 == 0) goto L6
            my4 r7 = r6.a
        L6:
            r1 = r7
            d83 r2 = r6.b
            r7 = r10 & 4
            if (r7 == 0) goto Lf
            ko4 r8 = r6.c
        Lf:
            r3 = r8
            r7 = r10 & 8
            if (r7 == 0) goto L18
            java.util.List r7 = r6.d
        L16:
            r4 = r7
            goto L1b
        L18:
            yt1 r7 = defpackage.yt1.A
            goto L16
        L1b:
            r7 = r10 & 16
            if (r7 == 0) goto L21
            ok3 r9 = r6.e
        L21:
            r5 = r9
            r6.getClass()
            r1.getClass()
            r2.getClass()
            r3.getClass()
            r4.getClass()
            jf7 r0 = new jf7
            r0.<init>(r1, r2, r3, r4, r5)
            return r0
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L3e
        L3:
            boolean r0 = r3 instanceof defpackage.jf7
            if (r0 != 0) goto L8
            goto L3c
        L8:
            jf7 r3 = (defpackage.jf7) r3
            my4 r0 = r2.a
            my4 r1 = r3.a
            boolean r0 = defpackage.nb3.k(r0, r1)
            if (r0 != 0) goto L15
            goto L3c
        L15:
            d83 r0 = r2.b
            d83 r1 = r3.b
            boolean r0 = defpackage.nb3.k(r0, r1)
            if (r0 != 0) goto L20
            goto L3c
        L20:
            ko4 r0 = r2.c
            ko4 r1 = r3.c
            if (r0 == r1) goto L27
            goto L3c
        L27:
            java.util.List r0 = r2.d
            java.util.List r1 = r3.d
            boolean r0 = defpackage.nb3.k(r0, r1)
            if (r0 != 0) goto L32
            goto L3c
        L32:
            ok3 r2 = r2.e
            ok3 r3 = r3.e
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L3e
        L3c:
            r2 = 0
            return r2
        L3e:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r3 = this;
            my4 r0 = r3.a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            d83 r2 = r3.b
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * r1
            ko4 r0 = r3.c
            int r0 = r0.hashCode()
            int r0 = r0 + r2
            int r0 = r0 * r1
            java.util.List r2 = r3.d
            int r0 = defpackage.i61.b(r0, r2, r1)
            ok3 r3 = r3.e
            int r3 = r3.hashCode()
            int r3 = r3 + r0
            return r3
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "UILayoutVariant(uiSize="
            r0.<init>(r1)
            my4 r1 = r2.a
            r0.append(r1)
            java.lang.String r1 = ", uiInsets="
            r0.append(r1)
            d83 r1 = r2.b
            r0.append(r1)
            java.lang.String r1 = ", orientation="
            r0.append(r1)
            ko4 r1 = r2.c
            r0.append(r1)
            java.lang.String r1 = ", folds="
            r0.append(r1)
            java.util.List r1 = r2.d
            r0.append(r1)
            java.lang.String r1 = ", displays="
            r0.append(r1)
            ok3 r2 = r2.e
            r0.append(r2)
            java.lang.String r2 = ")"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
