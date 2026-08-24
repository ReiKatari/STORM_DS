package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: c35  reason: default package */
/* loaded from: classes.dex */
public final class c35 extends defpackage.yu {
    public defpackage.en6[] f;
    public defpackage.en6[] g;
    public int h;
    public defpackage.ap3 i;

    @Override // defpackage.yu
    public final defpackage.en6 d(boolean[] r10) {
            r9 = this;
            r0 = -1
            r1 = 0
            r2 = r0
        L3:
            int r3 = r9.h
            if (r1 >= r3) goto L51
            en6[] r3 = r9.f
            r4 = r3[r1]
            int r5 = r4.B
            boolean r5 = r10[r5]
            if (r5 == 0) goto L12
            goto L4e
        L12:
            ap3 r5 = r9.i
            r5.B = r4
            r4 = 8
            if (r2 != r0) goto L32
        L1a:
            if (r4 < 0) goto L4e
            java.lang.Object r3 = r5.B
            en6 r3 = (defpackage.en6) r3
            float[] r3 = r3.d0
            r3 = r3[r4]
            r6 = 0
            int r7 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r7 <= 0) goto L2a
            goto L4e
        L2a:
            int r3 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r3 >= 0) goto L2f
            goto L4d
        L2f:
            int r4 = r4 + (-1)
            goto L1a
        L32:
            r3 = r3[r2]
        L34:
            if (r4 < 0) goto L4e
            float[] r6 = r3.d0
            r6 = r6[r4]
            java.lang.Object r7 = r5.B
            en6 r7 = (defpackage.en6) r7
            float[] r7 = r7.d0
            r7 = r7[r4]
            int r8 = (r7 > r6 ? 1 : (r7 == r6 ? 0 : -1))
            if (r8 != 0) goto L49
            int r4 = r4 + (-1)
            goto L34
        L49:
            int r3 = (r7 > r6 ? 1 : (r7 == r6 ? 0 : -1))
            if (r3 >= 0) goto L4e
        L4d:
            r2 = r1
        L4e:
            int r1 = r1 + 1
            goto L3
        L51:
            if (r2 != r0) goto L55
            r9 = 0
            return r9
        L55:
            en6[] r9 = r9.f
            r9 = r9[r2]
            return r9
    }

    @Override // defpackage.yu
    public final boolean e() {
            r0 = this;
            int r0 = r0.h
            if (r0 != 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    @Override // defpackage.yu
    public final void i(defpackage.jv3 r19, defpackage.yu r20, boolean r21) {
            r18 = this;
            r0 = r18
            r1 = r20
            en6 r2 = r1.a
            if (r2 != 0) goto L9
            return
        L9:
            float[] r3 = r2.d0
            qu r4 = r1.d
            int r5 = r4.d()
            r7 = 0
        L12:
            if (r7 >= r5) goto L97
            en6 r8 = r4.e(r7)
            float r9 = r4.f(r7)
            ap3 r10 = r0.i
            r10.B = r8
            boolean r11 = r8.A
            r12 = 953267991(0x38d1b717, float:1.0E-4)
            r13 = 9
            r14 = 0
            if (r11 == 0) goto L61
            r8 = 1
            r11 = 0
        L2c:
            if (r11 >= r13) goto L53
            java.lang.Object r15 = r10.B
            en6 r15 = (defpackage.en6) r15
            float[] r15 = r15.d0
            r16 = r15[r11]
            r17 = r3[r11]
            float r17 = r17 * r9
            float r17 = r17 + r16
            r15[r11] = r17
            float r15 = java.lang.Math.abs(r17)
            int r15 = (r15 > r12 ? 1 : (r15 == r12 ? 0 : -1))
            if (r15 >= 0) goto L4f
            java.lang.Object r15 = r10.B
            en6 r15 = (defpackage.en6) r15
            float[] r15 = r15.d0
            r15[r11] = r14
            goto L50
        L4f:
            r8 = 0
        L50:
            int r11 = r11 + 1
            goto L2c
        L53:
            if (r8 == 0) goto L8b
            java.lang.Object r8 = r10.L
            c35 r8 = (defpackage.c35) r8
            java.lang.Object r10 = r10.B
            en6 r10 = (defpackage.en6) r10
            r8.k(r10)
            goto L8b
        L61:
            r11 = 0
        L62:
            if (r11 >= r13) goto L88
            r15 = r3[r11]
            int r16 = (r15 > r14 ? 1 : (r15 == r14 ? 0 : -1))
            if (r16 == 0) goto L7d
            float r15 = r15 * r9
            float r16 = java.lang.Math.abs(r15)
            int r16 = (r16 > r12 ? 1 : (r16 == r12 ? 0 : -1))
            if (r16 >= 0) goto L74
            r15 = r14
        L74:
            java.lang.Object r6 = r10.B
            en6 r6 = (defpackage.en6) r6
            float[] r6 = r6.d0
            r6[r11] = r15
            goto L85
        L7d:
            java.lang.Object r6 = r10.B
            en6 r6 = (defpackage.en6) r6
            float[] r6 = r6.d0
            r6[r11] = r14
        L85:
            int r11 = r11 + 1
            goto L62
        L88:
            r0.j(r8)
        L8b:
            float r6 = r0.b
            float r8 = r1.b
            float r8 = r8 * r9
            float r8 = r8 + r6
            r0.b = r8
            int r7 = r7 + 1
            goto L12
        L97:
            r0.k(r2)
            return
    }

    public final void j(defpackage.en6 r7) {
            r6 = this;
            int r0 = r6.h
            r1 = 1
            int r0 = r0 + r1
            en6[] r2 = r6.f
            int r3 = r2.length
            if (r0 <= r3) goto L1f
            int r0 = r2.length
            int r0 = r0 * 2
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r2, r0)
            en6[] r0 = (defpackage.en6[]) r0
            r6.f = r0
            int r2 = r0.length
            int r2 = r2 * 2
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r2)
            en6[] r0 = (defpackage.en6[]) r0
            r6.g = r0
        L1f:
            en6[] r0 = r6.f
            int r2 = r6.h
            r0[r2] = r7
            int r3 = r2 + 1
            r6.h = r3
            if (r3 <= r1) goto L5d
            r0 = r0[r2]
            int r0 = r0.B
            int r2 = r7.B
            if (r0 <= r2) goto L5d
            r0 = 0
            r2 = r0
        L35:
            int r3 = r6.h
            en6[] r4 = r6.g
            if (r2 >= r3) goto L44
            en6[] r3 = r6.f
            r3 = r3[r2]
            r4[r2] = r3
            int r2 = r2 + 1
            goto L35
        L44:
            zh2 r2 = new zh2
            r5 = 26
            r2.<init>(r5)
            java.util.Arrays.sort(r4, r0, r3, r2)
        L4e:
            int r2 = r6.h
            if (r0 >= r2) goto L5d
            en6[] r2 = r6.f
            en6[] r3 = r6.g
            r3 = r3[r0]
            r2[r0] = r3
            int r0 = r0 + 1
            goto L4e
        L5d:
            r7.A = r1
            r7.a(r6)
            return
    }

    public final void k(defpackage.en6 r6) {
            r5 = this;
            r0 = 0
            r1 = r0
        L2:
            int r2 = r5.h
            if (r1 >= r2) goto L26
            en6[] r2 = r5.f
            r2 = r2[r1]
            if (r2 != r6) goto L23
        Lc:
            int r2 = r5.h
            int r3 = r2 + (-1)
            if (r1 >= r3) goto L1c
            en6[] r2 = r5.f
            int r3 = r1 + 1
            r4 = r2[r3]
            r2[r1] = r4
            r1 = r3
            goto Lc
        L1c:
            int r2 = r2 + (-1)
            r5.h = r2
            r6.A = r0
            return
        L23:
            int r1 = r1 + 1
            goto L2
        L26:
            return
    }

    @Override // defpackage.yu
    public final java.lang.String toString() {
            r4 = this;
            ap3 r0 = r4.i
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = " goal -> ("
            r1.<init>(r2)
            float r2 = r4.b
            r1.append(r2)
            java.lang.String r2 = ") : "
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r2 = 0
        L18:
            int r3 = r4.h
            if (r2 >= r3) goto L39
            en6[] r3 = r4.f
            r3 = r3[r2]
            r0.B = r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r1)
            r3.append(r0)
            java.lang.String r1 = " "
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            int r2 = r2 + 1
            goto L18
        L39:
            return r1
    }
}
