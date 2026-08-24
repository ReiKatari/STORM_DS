package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ds4  reason: default package */
/* loaded from: classes.dex */
public final class ds4 implements defpackage.bp {
    public final int a;
    public final int b;
    public final long c;
    public final defpackage.g37 d;
    public final defpackage.ux4 e;
    public final defpackage.xu3 f;
    public final int g;
    public final int h;
    public final defpackage.i47 i;

    public ds4(int r1, int r2, long r3, defpackage.g37 r5, defpackage.ux4 r6, defpackage.xu3 r7, int r8, int r9, defpackage.i47 r10) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r5
            r0.e = r6
            r0.f = r7
            r0.g = r8
            r0.h = r9
            r0.i = r10
            long r0 = defpackage.x47.c
            boolean r0 = defpackage.x47.a(r3, r0)
            if (r0 != 0) goto L41
            float r0 = defpackage.x47.c(r3)
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto L27
            goto L41
        L27:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "lineHeight can't be negative ("
            r0.<init>(r1)
            float r1 = defpackage.x47.c(r3)
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            defpackage.q53.c(r0)
        L41:
            return
    }

    public ds4(long r12, defpackage.g37 r14) {
            r11 = this;
            r8 = 0
            r9 = 0
            r1 = 0
            r2 = 0
            r6 = 0
            r7 = 0
            r10 = 0
            r0 = r11
            r3 = r12
            r5 = r14
            r0.<init>(r1, r2, r3, r5, r6, r7, r8, r9, r10)
            return
    }

    public final defpackage.ds4 a(defpackage.ds4 r12) {
            r11 = this;
            if (r12 != 0) goto L3
            return r11
        L3:
            int r1 = r12.a
            int r2 = r12.b
            long r3 = r12.c
            g37 r5 = r12.d
            ux4 r6 = r12.e
            xu3 r7 = r12.f
            int r8 = r12.g
            int r9 = r12.h
            i47 r10 = r12.i
            r0 = r11
            ds4 r11 = defpackage.es4.a(r0, r1, r2, r3, r5, r6, r7, r8, r9, r10)
            return r11
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            if (r4 != r5) goto L3
            goto L59
        L3:
            boolean r0 = r5 instanceof defpackage.ds4
            if (r0 != 0) goto L8
            goto L5b
        L8:
            ds4 r5 = (defpackage.ds4) r5
            int r0 = r5.a
            int r1 = r4.a
            if (r1 != r0) goto L5b
            int r0 = r4.b
            int r1 = r5.b
            if (r0 != r1) goto L5b
            long r0 = r4.c
            long r2 = r5.c
            boolean r0 = defpackage.x47.a(r0, r2)
            if (r0 != 0) goto L21
            goto L5b
        L21:
            g37 r0 = r4.d
            g37 r1 = r5.d
            boolean r0 = defpackage.nb3.k(r0, r1)
            if (r0 != 0) goto L2c
            goto L5b
        L2c:
            ux4 r0 = r4.e
            ux4 r1 = r5.e
            boolean r0 = defpackage.nb3.k(r0, r1)
            if (r0 != 0) goto L37
            goto L5b
        L37:
            xu3 r0 = r4.f
            xu3 r1 = r5.f
            boolean r0 = defpackage.nb3.k(r0, r1)
            if (r0 != 0) goto L42
            goto L5b
        L42:
            int r0 = r4.g
            int r1 = r5.g
            if (r0 != r1) goto L5b
            int r0 = r4.h
            int r1 = r5.h
            if (r0 != r1) goto L5b
            i47 r4 = r4.i
            i47 r5 = r5.i
            boolean r4 = defpackage.nb3.k(r4, r5)
            if (r4 != 0) goto L59
            goto L5b
        L59:
            r4 = 1
            return r4
        L5b:
            r4 = 0
            return r4
    }

    public final int hashCode() {
            r4 = this;
            int r0 = r4.a
            int r0 = java.lang.Integer.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            int r2 = r4.b
            int r0 = defpackage.lb1.a(r2, r0, r1)
            y47[] r2 = defpackage.x47.b
            long r2 = r4.c
            int r0 = defpackage.i61.c(r2, r0, r1)
            r2 = 0
            g37 r3 = r4.d
            if (r3 == 0) goto L21
            int r3 = r3.hashCode()
            goto L22
        L21:
            r3 = r2
        L22:
            int r0 = r0 + r3
            int r0 = r0 * r1
            ux4 r3 = r4.e
            if (r3 == 0) goto L2d
            int r3 = r3.hashCode()
            goto L2e
        L2d:
            r3 = r2
        L2e:
            int r0 = r0 + r3
            int r0 = r0 * r1
            xu3 r3 = r4.f
            if (r3 == 0) goto L39
            int r3 = r3.hashCode()
            goto L3a
        L39:
            r3 = r2
        L3a:
            int r0 = r0 + r3
            int r0 = r0 * r1
            int r3 = r4.g
            int r0 = defpackage.lb1.a(r3, r0, r1)
            int r3 = r4.h
            int r0 = defpackage.lb1.a(r3, r0, r1)
            i47 r4 = r4.i
            if (r4 == 0) goto L50
            int r2 = r4.hashCode()
        L50:
            int r0 = r0 + r2
            return r0
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "ParagraphStyle(textAlign="
            r0.<init>(r1)
            int r1 = r3.a
            java.lang.String r1 = defpackage.wz6.a(r1)
            r0.append(r1)
            java.lang.String r1 = ", textDirection="
            r0.append(r1)
            int r1 = r3.b
            java.lang.String r1 = defpackage.e17.a(r1)
            r0.append(r1)
            java.lang.String r1 = ", lineHeight="
            r0.append(r1)
            long r1 = r3.c
            java.lang.String r1 = defpackage.x47.d(r1)
            r0.append(r1)
            java.lang.String r1 = ", textIndent="
            r0.append(r1)
            g37 r1 = r3.d
            r0.append(r1)
            java.lang.String r1 = ", platformStyle="
            r0.append(r1)
            ux4 r1 = r3.e
            r0.append(r1)
            java.lang.String r1 = ", lineHeightStyle="
            r0.append(r1)
            xu3 r1 = r3.f
            r0.append(r1)
            java.lang.String r1 = ", lineBreak="
            r0.append(r1)
            int r1 = r3.g
            java.lang.String r1 = defpackage.su3.a(r1)
            r0.append(r1)
            java.lang.String r1 = ", hyphens="
            r0.append(r1)
            int r1 = r3.h
            java.lang.String r1 = defpackage.q03.a(r1)
            r0.append(r1)
            java.lang.String r1 = ", textMotion="
            r0.append(r1)
            i47 r3 = r3.i
            r0.append(r3)
            r3 = 41
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }
}
