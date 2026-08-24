package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: iw6  reason: default package */
/* loaded from: classes.dex */
public final class iw6 extends defpackage.e74 {
    public final java.lang.Object a;
    public final java.lang.Object b;
    public final java.lang.Object[] c;
    public final androidx.compose.ui.input.pointer.PointerInputEventHandler d;

    public iw6(java.lang.Object r3, java.lang.Object r4, java.lang.Object[] r5, androidx.compose.ui.input.pointer.PointerInputEventHandler r6, int r7) {
            r2 = this;
            r0 = r7 & 1
            r1 = 0
            if (r0 == 0) goto L6
            r3 = r1
        L6:
            r0 = r7 & 2
            if (r0 == 0) goto Lb
            r4 = r1
        Lb:
            r7 = r7 & 4
            if (r7 == 0) goto L10
            r5 = r1
        L10:
            r2.<init>()
            r2.a = r3
            r2.b = r4
            r2.c = r5
            r2.d = r6
            return
    }

    @Override // defpackage.e74
    public final defpackage.z64 e() {
            r4 = this;
            ow6 r0 = new ow6
            java.lang.Object[] r1 = r4.c
            androidx.compose.ui.input.pointer.PointerInputEventHandler r2 = r4.d
            java.lang.Object r3 = r4.a
            java.lang.Object r4 = r4.b
            r0.<init>(r3, r4, r1, r2)
            return r0
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof defpackage.iw6
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            iw6 r5 = (defpackage.iw6) r5
            java.lang.Object r1 = r5.a
            java.lang.Object r3 = r4.a
            boolean r1 = defpackage.nb3.k(r3, r1)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.lang.Object r1 = r4.b
            java.lang.Object r3 = r5.b
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            java.lang.Object[] r1 = r5.c
            java.lang.Object[] r3 = r4.c
            if (r3 == 0) goto L32
            if (r1 != 0) goto L2b
            return r2
        L2b:
            boolean r1 = java.util.Arrays.equals(r3, r1)
            if (r1 != 0) goto L35
            return r2
        L32:
            if (r1 == 0) goto L35
            return r2
        L35:
            androidx.compose.ui.input.pointer.PointerInputEventHandler r4 = r4.d
            androidx.compose.ui.input.pointer.PointerInputEventHandler r5 = r5.d
            if (r4 != r5) goto L3c
            return r0
        L3c:
            return r2
    }

    @Override // defpackage.e74
    public final void g(defpackage.z64 r5) {
            r4 = this;
            ow6 r5 = (defpackage.ow6) r5
            java.lang.Object r0 = r5.k0
            java.lang.Object r1 = r4.a
            boolean r0 = defpackage.nb3.k(r0, r1)
            r2 = 1
            r0 = r0 ^ r2
            r5.k0 = r1
            java.lang.Object r1 = r5.l0
            java.lang.Object r3 = r4.b
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L19
            r0 = r2
        L19:
            r5.l0 = r3
            java.lang.Object[] r1 = r5.m0
            java.lang.Object[] r3 = r4.c
            if (r1 == 0) goto L24
            if (r3 != 0) goto L24
            r0 = r2
        L24:
            if (r1 != 0) goto L29
            if (r3 == 0) goto L29
            r0 = r2
        L29:
            if (r1 == 0) goto L34
            if (r3 == 0) goto L34
            boolean r1 = java.util.Arrays.equals(r3, r1)
            if (r1 != 0) goto L34
            r0 = r2
        L34:
            r5.m0 = r3
            androidx.compose.ui.input.pointer.PointerInputEventHandler r1 = r5.n0
            java.lang.Class r1 = r1.getClass()
            androidx.compose.ui.input.pointer.PointerInputEventHandler r4 = r4.d
            java.lang.Class r3 = r4.getClass()
            if (r1 == r3) goto L45
            goto L46
        L45:
            r2 = r0
        L46:
            if (r2 == 0) goto L4b
            r5.T0()
        L4b:
            r5.n0 = r4
            return
    }

    public final int hashCode() {
            r3 = this;
            r0 = 0
            java.lang.Object r1 = r3.a
            if (r1 == 0) goto La
            int r1 = r1.hashCode()
            goto Lb
        La:
            r1 = r0
        Lb:
            int r1 = r1 * 31
            java.lang.Object r2 = r3.b
            if (r2 == 0) goto L16
            int r2 = r2.hashCode()
            goto L17
        L16:
            r2 = r0
        L17:
            int r1 = r1 + r2
            int r1 = r1 * 31
            java.lang.Object[] r2 = r3.c
            if (r2 == 0) goto L22
            int r0 = java.util.Arrays.hashCode(r2)
        L22:
            int r1 = r1 + r0
            int r1 = r1 * 31
            androidx.compose.ui.input.pointer.PointerInputEventHandler r3 = r3.d
            int r3 = r3.hashCode()
            int r3 = r3 + r1
            return r3
    }
}
