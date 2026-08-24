package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: z37  reason: default package */
/* loaded from: classes.dex */
public final class z37 {
    public final defpackage.fp a;
    public final defpackage.s47 b;
    public final java.util.List c;
    public final int d;
    public final boolean e;
    public final int f;
    public final defpackage.qh1 g;
    public final defpackage.kk3 h;
    public final defpackage.ki2 i;
    public final long j;

    public z37(defpackage.fp r1, defpackage.s47 r2, java.util.List r3, int r4, boolean r5, int r6, defpackage.qh1 r7, defpackage.kk3 r8, defpackage.ki2 r9, long r10) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r4
            r0.e = r5
            r0.f = r6
            r0.g = r7
            r0.h = r8
            r0.i = r9
            r0.j = r10
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L4
            goto L69
        L4:
            boolean r0 = r3 instanceof defpackage.z37
            if (r0 != 0) goto La
            goto L6b
        La:
            z37 r3 = (defpackage.z37) r3
            fp r0 = r3.a
            fp r1 = r2.a
            boolean r0 = defpackage.nb3.k(r1, r0)
            if (r0 != 0) goto L17
            goto L6b
        L17:
            s47 r0 = r2.b
            s47 r1 = r3.b
            boolean r0 = defpackage.nb3.k(r0, r1)
            if (r0 != 0) goto L22
            goto L6b
        L22:
            java.util.List r0 = r2.c
            java.util.List r1 = r3.c
            boolean r0 = defpackage.nb3.k(r0, r1)
            if (r0 != 0) goto L2d
            goto L6b
        L2d:
            int r0 = r2.d
            int r1 = r3.d
            if (r0 == r1) goto L34
            goto L6b
        L34:
            boolean r0 = r2.e
            boolean r1 = r3.e
            if (r0 == r1) goto L3b
            goto L6b
        L3b:
            int r0 = r2.f
            int r1 = r3.f
            if (r0 != r1) goto L6b
            qh1 r0 = r2.g
            qh1 r1 = r3.g
            boolean r0 = defpackage.nb3.k(r0, r1)
            if (r0 != 0) goto L4c
            goto L6b
        L4c:
            kk3 r0 = r2.h
            kk3 r1 = r3.h
            if (r0 == r1) goto L53
            goto L6b
        L53:
            ki2 r0 = r2.i
            ki2 r1 = r3.i
            boolean r0 = defpackage.nb3.k(r0, r1)
            if (r0 != 0) goto L5e
            goto L6b
        L5e:
            long r0 = r2.j
            long r2 = r3.j
            boolean r2 = defpackage.q21.b(r0, r2)
            if (r2 != 0) goto L69
            goto L6b
        L69:
            r2 = 1
            return r2
        L6b:
            r2 = 0
            return r2
    }

    public final int hashCode() {
            r3 = this;
            fp r0 = r3.a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            s47 r2 = r3.b
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * r1
            java.util.List r0 = r3.c
            int r0 = defpackage.i61.b(r2, r0, r1)
            int r2 = r3.d
            int r0 = r0 + r2
            int r0 = r0 * r1
            boolean r2 = r3.e
            int r0 = defpackage.xg6.e(r0, r2, r1)
            int r2 = r3.f
            int r0 = defpackage.lb1.a(r2, r0, r1)
            qh1 r2 = r3.g
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * r1
            kk3 r0 = r3.h
            int r0 = r0.hashCode()
            int r0 = r0 + r2
            int r0 = r0 * r1
            ki2 r2 = r3.i
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * r1
            long r0 = r3.j
            int r3 = java.lang.Long.hashCode(r0)
            int r3 = r3 + r2
            return r3
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "TextLayoutInput(text="
            r0.<init>(r1)
            fp r1 = r3.a
            r0.append(r1)
            java.lang.String r1 = ", style="
            r0.append(r1)
            s47 r1 = r3.b
            r0.append(r1)
            java.lang.String r1 = ", placeholders="
            r0.append(r1)
            java.util.List r1 = r3.c
            r0.append(r1)
            java.lang.String r1 = ", maxLines="
            r0.append(r1)
            int r1 = r3.d
            r0.append(r1)
            java.lang.String r1 = ", softWrap="
            r0.append(r1)
            boolean r1 = r3.e
            r0.append(r1)
            java.lang.String r1 = ", overflow="
            r0.append(r1)
            r1 = 1
            int r2 = r3.f
            if (r2 != r1) goto L41
            java.lang.String r1 = "Clip"
            goto L5b
        L41:
            r1 = 2
            if (r2 != r1) goto L47
            java.lang.String r1 = "Ellipsis"
            goto L5b
        L47:
            r1 = 5
            if (r2 != r1) goto L4d
            java.lang.String r1 = "MiddleEllipsis"
            goto L5b
        L4d:
            r1 = 3
            if (r2 != r1) goto L53
            java.lang.String r1 = "Visible"
            goto L5b
        L53:
            r1 = 4
            if (r2 != r1) goto L59
            java.lang.String r1 = "StartEllipsis"
            goto L5b
        L59:
            java.lang.String r1 = "Invalid"
        L5b:
            r0.append(r1)
            java.lang.String r1 = ", density="
            r0.append(r1)
            qh1 r1 = r3.g
            r0.append(r1)
            java.lang.String r1 = ", layoutDirection="
            r0.append(r1)
            kk3 r1 = r3.h
            r0.append(r1)
            java.lang.String r1 = ", fontFamilyResolver="
            r0.append(r1)
            ki2 r1 = r3.i
            r0.append(r1)
            java.lang.String r1 = ", constraints="
            r0.append(r1)
            long r1 = r3.j
            java.lang.String r3 = defpackage.q21.k(r1)
            r0.append(r3)
            r3 = 41
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }
}
