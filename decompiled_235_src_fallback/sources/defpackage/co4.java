package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: co4  reason: default package */
/* loaded from: classes.dex */
public final class co4 extends defpackage.kn2 {
    public defpackage.ao4[] c;
    public int d;
    public int[] e;
    public int f;
    public java.lang.Object[] g;
    public int h;

    public co4() {
            r2 = this;
            r2.<init>()
            r0 = 16
            ao4[] r1 = new defpackage.ao4[r0]
            r2.c = r1
            int[] r1 = new int[r0]
            r2.e = r1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r2.g = r0
            return
    }

    public final void e0() {
            r4 = this;
            r0 = 0
            r4.d = r0
            r4.f = r0
            java.lang.Object[] r1 = r4.g
            r2 = 0
            int r3 = r4.h
            java.util.Arrays.fill(r1, r0, r3, r2)
            r4.h = r0
            return
    }

    public final void f0(defpackage.nt r9, defpackage.pk6 r10, defpackage.jb1 r11, defpackage.bo4 r12) {
            r8 = this;
            int r0 = r8.d
            if (r0 == 0) goto L52
            ls0 r2 = new ls0
            r2.<init>(r8)
            java.lang.Object r0 = r2.e
            co4 r0 = (defpackage.co4) r0
        Ld:
            ao4[] r1 = r0.c
            int r3 = r2.b
            r1 = r1[r3]
            sq2 r7 = r1.d(r2)
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            r1.c(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L42
            int r9 = r2.b
            int r10 = r0.d
            if (r9 < r10) goto L25
            goto L52
        L25:
            ao4[] r11 = r0.c
            r11 = r11[r9]
            int r12 = r2.c
            int r1 = r11.b
            int r12 = r12 + r1
            r2.c = r12
            int r12 = r2.d
            int r11 = r11.c
            int r12 = r12 + r11
            r2.d = r12
            int r9 = r9 + 1
            r2.b = r9
            if (r9 >= r10) goto L52
            r9 = r3
            r10 = r4
            r11 = r5
            r12 = r6
            goto Ld
        L42:
            r0 = move-exception
            r8 = r0
            if (r6 != 0) goto L47
            goto L51
        L47:
            u6 r9 = new u6
            r10 = 15
            r9.<init>(r7, r4, r6, r10)
            defpackage.nw7.s0(r8, r9)
        L51:
            throw r8
        L52:
            r8.e0()
            return
    }

    public final boolean g0() {
            r0 = this;
            int r0 = r0.d
            if (r0 != 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    public final void h0(defpackage.ao4 r8) {
            r7 = this;
            int r0 = r7.d
            ao4[] r1 = r7.c
            int r2 = r1.length
            r3 = 1024(0x400, float:1.435E-42)
            r4 = 0
            if (r0 != r2) goto L17
            if (r0 <= r3) goto Le
            r2 = r3
            goto Lf
        Le:
            r2 = r0
        Lf:
            int r2 = r2 + r0
            ao4[] r2 = new defpackage.ao4[r2]
            java.lang.System.arraycopy(r1, r4, r2, r4, r0)
            r7.c = r2
        L17:
            int r0 = r7.f
            int r1 = r8.b
            int r2 = r8.c
            int r0 = r0 + r1
            int[] r1 = r7.e
            int r5 = r1.length
            if (r0 <= r5) goto L34
            if (r5 <= r3) goto L27
            r6 = r3
            goto L28
        L27:
            r6 = r5
        L28:
            int r6 = r6 + r5
            if (r6 >= r0) goto L2c
            goto L2d
        L2c:
            r0 = r6
        L2d:
            int[] r0 = new int[r0]
            defpackage.fv.r0(r4, r4, r5, r1, r0)
            r7.e = r0
        L34:
            int r0 = r7.h
            int r0 = r0 + r2
            java.lang.Object[] r1 = r7.g
            int r5 = r1.length
            if (r0 <= r5) goto L4c
            if (r5 <= r3) goto L3f
            goto L40
        L3f:
            r3 = r5
        L40:
            int r3 = r3 + r5
            if (r3 >= r0) goto L44
            goto L45
        L44:
            r0 = r3
        L45:
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.System.arraycopy(r1, r4, r0, r4, r5)
            r7.g = r0
        L4c:
            ao4[] r0 = r7.c
            int r1 = r7.d
            int r3 = r1 + 1
            r7.d = r3
            r0[r1] = r8
            int r0 = r7.f
            int r8 = r8.b
            int r0 = r0 + r8
            r7.f = r0
            int r8 = r7.h
            int r8 = r8 + r2
            r7.h = r8
            return
    }
}
