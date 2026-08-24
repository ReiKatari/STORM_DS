package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: gu  reason: default package */
/* loaded from: classes.dex */
public final class gu implements defpackage.fu, defpackage.iu {
    public final float A;
    public final boolean B;
    public final defpackage.hu L;
    public final float R;

    public gu(float r1, boolean r2, defpackage.hu r3) {
            r0 = this;
            r0.<init>()
            r0.A = r1
            r0.B = r2
            r0.L = r3
            r0.R = r1
            return
    }

    @Override // defpackage.fu, defpackage.iu
    public final float a() {
            r0 = this;
            float r0 = r0.R
            return r0
    }

    @Override // defpackage.fu
    public final void d(defpackage.qh1 r10, int r11, int[] r12, defpackage.kk3 r13, int[] r14) {
            r9 = this;
            int r0 = r12.length
            if (r0 != 0) goto L5
            goto L79
        L5:
            float r0 = r9.A
            int r10 = r10.r0(r0)
            boolean r0 = r9.B
            r1 = 0
            if (r0 == 0) goto L16
            kk3 r0 = defpackage.kk3.Rtl
            if (r13 != r0) goto L16
            r0 = 1
            goto L17
        L16:
            r0 = r1
        L17:
            if (r0 == 0) goto L37
            int r2 = r12.length
            r3 = r1
            r4 = r3
            r5 = r4
        L1d:
            if (r3 >= r2) goto L35
            r4 = r12[r3]
            int r6 = r5 + 1
            int r11 = r11 - r4
            int r11 = java.lang.Math.max(r1, r11)
            r14[r5] = r11
            int r4 = java.lang.Math.min(r10, r11)
            r11 = r14[r5]
            int r11 = r11 - r4
            int r3 = r3 + 1
            r5 = r6
            goto L1d
        L35:
            int r11 = r11 + r4
            goto L5f
        L37:
            int r2 = r12.length
            r3 = r1
            r4 = r3
            r5 = r4
            r6 = r5
        L3c:
            if (r3 >= r2) goto L5d
            r5 = r12[r3]
            int r7 = r6 + 1
            int r8 = r11 - r5
            int r4 = java.lang.Math.min(r4, r8)
            r14[r6] = r4
            int r4 = r11 - r4
            int r4 = r4 - r5
            int r4 = java.lang.Math.min(r10, r4)
            r6 = r14[r6]
            int r6 = r6 + r5
            int r5 = r6 + r4
            int r3 = r3 + 1
            r6 = r5
            r5 = r4
            r4 = r6
            r6 = r7
            goto L3c
        L5d:
            int r4 = r4 - r5
            int r11 = r11 - r4
        L5f:
            hu r9 = r9.L
            if (r9 == 0) goto L79
            if (r11 <= 0) goto L79
            int r9 = r9.a(r11, r13)
            if (r0 == 0) goto L6c
            int r9 = r9 - r11
        L6c:
            if (r9 == 0) goto L79
            int r10 = r14.length
        L6f:
            if (r1 >= r10) goto L79
            r11 = r14[r1]
            int r11 = r11 + r9
            r14[r1] = r11
            int r1 = r1 + 1
            goto L6f
        L79:
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L28
        L3:
            boolean r0 = r3 instanceof defpackage.gu
            if (r0 != 0) goto L8
            goto L26
        L8:
            gu r3 = (defpackage.gu) r3
            float r0 = r2.A
            float r1 = r3.A
            boolean r0 = defpackage.om1.b(r0, r1)
            if (r0 != 0) goto L15
            goto L26
        L15:
            boolean r0 = r2.B
            boolean r1 = r3.B
            if (r0 == r1) goto L1c
            goto L26
        L1c:
            hu r2 = r2.L
            hu r3 = r3.L
            boolean r2 = defpackage.nb3.k(r2, r3)
            if (r2 != 0) goto L28
        L26:
            r2 = 0
            return r2
        L28:
            r2 = 1
            return r2
    }

    @Override // defpackage.iu
    public final void g(defpackage.qh1 r7, int r8, int[] r9, int[] r10) {
            r6 = this;
            kk3 r4 = defpackage.kk3.Ltr
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r5 = r10
            r0.d(r1, r2, r3, r4, r5)
            return
    }

    public final int hashCode() {
            r3 = this;
            float r0 = r3.A
            int r0 = java.lang.Float.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            boolean r2 = r3.B
            int r0 = defpackage.xg6.e(r0, r2, r1)
            hu r3 = r3.L
            if (r3 != 0) goto L15
            r3 = 0
            goto L19
        L15:
            int r3 = r3.hashCode()
        L19:
            int r0 = r0 + r3
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            boolean r1 = r2.B
            if (r1 == 0) goto Lc
            java.lang.String r1 = ""
            goto Le
        Lc:
            java.lang.String r1 = "Absolute"
        Le:
            r0.append(r1)
            java.lang.String r1 = "Arrangement#spacedAligned("
            r0.append(r1)
            float r1 = r2.A
            java.lang.String r1 = defpackage.om1.c(r1)
            r0.append(r1)
            java.lang.String r1 = ", "
            r0.append(r1)
            hu r2 = r2.L
            r0.append(r2)
            r2 = 41
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
