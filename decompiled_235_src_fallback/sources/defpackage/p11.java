package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: p11  reason: default package */
/* loaded from: classes.dex */
public final class p11 {
    public final androidx.constraintlayout.widget.ConstraintLayout a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public final /* synthetic */ androidx.constraintlayout.widget.ConstraintLayout h;

    public p11(androidx.constraintlayout.widget.ConstraintLayout r1, androidx.constraintlayout.widget.ConstraintLayout r2) {
            r0 = this;
            r0.<init>()
            r0.h = r1
            r0.a = r2
            return
    }

    public static boolean a(int r2, int r3, int r4) {
            if (r2 != r3) goto L3
            goto L1b
        L3:
            int r2 = android.view.View.MeasureSpec.getMode(r2)
            int r0 = android.view.View.MeasureSpec.getMode(r3)
            int r3 = android.view.View.MeasureSpec.getSize(r3)
            r1 = 1073741824(0x40000000, float:2.0)
            if (r0 != r1) goto L1d
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r2 == r0) goto L19
            if (r2 != 0) goto L1d
        L19:
            if (r4 != r3) goto L1d
        L1b:
            r2 = 1
            return r2
        L1d:
            r2 = 0
            return r2
    }

    public final void b(defpackage.l21 r18, defpackage.e30 r19) {
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            if (r1 != 0) goto La
            goto L1cd
        La:
            h11 r3 = r1.K
            h11 r4 = r1.I
            int r5 = r1.h0
            r6 = 8
            r7 = 0
            if (r5 != r6) goto L1c
            r2.e = r7
            r2.f = r7
            r2.g = r7
            return
        L1c:
            l21 r5 = r1.U
            if (r5 != 0) goto L22
            goto L1cd
        L22:
            bh6 r5 = androidx.constraintlayout.widget.ConstraintLayout.o0
            k21 r5 = r2.a
            k21 r6 = r2.b
            int r8 = r2.c
            int r9 = r2.d
            int r10 = r0.b
            int r11 = r0.c
            int r10 = r10 + r11
            int r11 = r0.d
            android.view.View r12 = r1.g0
            int[] r13 = defpackage.m11.a
            int r14 = r5.ordinal()
            r14 = r13[r14]
            r15 = 2
            r7 = 1
            if (r14 == r7) goto La4
            if (r14 == r15) goto L9c
            r8 = 3
            if (r14 == r8) goto L88
            r8 = 4
            if (r14 == r8) goto L4b
            r8 = 0
            goto Laa
        L4b:
            int r8 = r0.f
            r14 = -2
            int r8 = android.view.ViewGroup.getChildMeasureSpec(r8, r11, r14)
            int r11 = r1.r
            if (r11 != r7) goto L58
            r11 = r7
            goto L59
        L58:
            r11 = 0
        L59:
            int r14 = r2.j
            if (r14 == r7) goto L5f
            if (r14 != r15) goto Laa
        L5f:
            int r14 = r12.getMeasuredHeight()
            int r7 = r1.l()
            if (r14 != r7) goto L6b
            r7 = 1
            goto L6c
        L6b:
            r7 = 0
        L6c:
            int r14 = r2.j
            if (r14 == r15) goto L7c
            if (r11 == 0) goto L7c
            if (r11 == 0) goto L76
            if (r7 != 0) goto L7c
        L76:
            boolean r7 = r1.B()
            if (r7 == 0) goto Laa
        L7c:
            int r7 = r1.r()
            r8 = 1073741824(0x40000000, float:2.0)
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r8)
        L86:
            r8 = r7
            goto Laa
        L88:
            int r7 = r0.f
            if (r4 == 0) goto L8f
            int r8 = r4.g
            goto L90
        L8f:
            r8 = 0
        L90:
            if (r3 == 0) goto L95
            int r14 = r3.g
            int r8 = r8 + r14
        L95:
            int r11 = r11 + r8
            r8 = -1
            int r7 = android.view.ViewGroup.getChildMeasureSpec(r7, r11, r8)
            goto L86
        L9c:
            int r7 = r0.f
            r14 = -2
            int r7 = android.view.ViewGroup.getChildMeasureSpec(r7, r11, r14)
            goto L86
        La4:
            r7 = 1073741824(0x40000000, float:2.0)
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r7)
        Laa:
            int r7 = r6.ordinal()
            r7 = r13[r7]
            r11 = 1
            if (r7 == r11) goto L11b
            if (r7 == r15) goto L113
            r9 = 3
            if (r7 == r9) goto Lfa
            r9 = 4
            if (r7 == r9) goto Lbe
            r3 = 0
            goto L121
        Lbe:
            int r3 = r0.g
            r14 = -2
            int r3 = android.view.ViewGroup.getChildMeasureSpec(r3, r10, r14)
            int r4 = r1.s
            if (r4 != r11) goto Lcb
            r4 = r11
            goto Lcc
        Lcb:
            r4 = 0
        Lcc:
            int r7 = r2.j
            if (r7 == r11) goto Ld2
            if (r7 != r15) goto L121
        Ld2:
            int r7 = r12.getMeasuredWidth()
            int r9 = r1.r()
            if (r7 != r9) goto Lde
            r7 = 1
            goto Ldf
        Lde:
            r7 = 0
        Ldf:
            int r9 = r2.j
            if (r9 == r15) goto Lef
            if (r4 == 0) goto Lef
            if (r4 == 0) goto Le9
            if (r7 != 0) goto Lef
        Le9:
            boolean r4 = r1.C()
            if (r4 == 0) goto L121
        Lef:
            int r3 = r1.l()
            r7 = 1073741824(0x40000000, float:2.0)
            int r3 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r7)
            goto L121
        Lfa:
            int r7 = r0.g
            if (r4 == 0) goto L103
            h11 r4 = r1.J
            int r4 = r4.g
            goto L104
        L103:
            r4 = 0
        L104:
            if (r3 == 0) goto L10b
            h11 r3 = r1.L
            int r3 = r3.g
            int r4 = r4 + r3
        L10b:
            int r10 = r10 + r4
            r3 = -1
            int r4 = android.view.ViewGroup.getChildMeasureSpec(r7, r10, r3)
            r3 = r4
            goto L121
        L113:
            int r3 = r0.g
            r14 = -2
            int r3 = android.view.ViewGroup.getChildMeasureSpec(r3, r10, r14)
            goto L121
        L11b:
            r7 = 1073741824(0x40000000, float:2.0)
            int r3 = android.view.View.MeasureSpec.makeMeasureSpec(r9, r7)
        L121:
            l21 r4 = r1.U
            m21 r4 = (defpackage.m21) r4
            androidx.constraintlayout.widget.ConstraintLayout r0 = r0.h
            if (r4 == 0) goto L192
            int r7 = r0.h0
            r9 = 256(0x100, float:3.59E-43)
            boolean r7 = defpackage.n16.v(r7, r9)
            if (r7 == 0) goto L192
            int r7 = r12.getMeasuredWidth()
            int r9 = r1.r()
            if (r7 != r9) goto L192
            int r7 = r12.getMeasuredWidth()
            int r9 = r4.r()
            if (r7 >= r9) goto L192
            int r7 = r12.getMeasuredHeight()
            int r9 = r1.l()
            if (r7 != r9) goto L192
            int r7 = r12.getMeasuredHeight()
            int r4 = r4.l()
            if (r7 >= r4) goto L192
            int r4 = r12.getBaseline()
            int r7 = r1.b0
            if (r4 != r7) goto L192
            boolean r4 = r1.A()
            if (r4 != 0) goto L192
            int r4 = r1.G
            int r7 = r1.r()
            boolean r4 = a(r4, r8, r7)
            if (r4 == 0) goto L192
            int r4 = r1.H
            int r7 = r1.l()
            boolean r4 = a(r4, r3, r7)
            if (r4 == 0) goto L192
            int r0 = r1.r()
            r2.e = r0
            int r0 = r1.l()
            r2.f = r0
            int r0 = r1.b0
            r2.g = r0
            return
        L192:
            k21 r4 = defpackage.k21.MATCH_CONSTRAINT
            if (r5 != r4) goto L198
            r7 = 1
            goto L199
        L198:
            r7 = 0
        L199:
            if (r6 != r4) goto L19d
            r4 = 1
            goto L19e
        L19d:
            r4 = 0
        L19e:
            k21 r9 = defpackage.k21.MATCH_PARENT
            if (r6 == r9) goto L1a9
            k21 r10 = defpackage.k21.FIXED
            if (r6 != r10) goto L1a7
            goto L1a9
        L1a7:
            r11 = 0
            goto L1aa
        L1a9:
            r11 = 1
        L1aa:
            if (r5 == r9) goto L1b3
            k21 r6 = defpackage.k21.FIXED
            if (r5 != r6) goto L1b1
            goto L1b3
        L1b1:
            r5 = 0
            goto L1b4
        L1b3:
            r5 = 1
        L1b4:
            r6 = 0
            if (r7 == 0) goto L1bf
            float r9 = r1.X
            int r9 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r9 <= 0) goto L1bf
            r9 = 1
            goto L1c0
        L1bf:
            r9 = 0
        L1c0:
            if (r4 == 0) goto L1ca
            float r10 = r1.X
            int r6 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r6 <= 0) goto L1ca
            r6 = 1
            goto L1cb
        L1ca:
            r6 = 0
        L1cb:
            if (r12 != 0) goto L1ce
        L1cd:
            return
        L1ce:
            android.view.ViewGroup$LayoutParams r10 = r12.getLayoutParams()
            o11 r10 = (defpackage.o11) r10
            int r13 = r2.j
            r14 = 1
            if (r13 == r14) goto L1ef
            if (r13 == r15) goto L1ef
            if (r7 == 0) goto L1ef
            int r7 = r1.r
            if (r7 != 0) goto L1ef
            if (r4 == 0) goto L1ef
            int r4 = r1.s
            if (r4 == 0) goto L1e8
            goto L1ef
        L1e8:
            r3 = -1
            r4 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            goto L293
        L1ef:
            boolean r4 = r12 instanceof defpackage.qq7
            if (r4 == 0) goto L201
            boolean r4 = r1 instanceof defpackage.rq7
            if (r4 == 0) goto L201
            r4 = r1
            rq7 r4 = (defpackage.rq7) r4
            r7 = r12
            qq7 r7 = (defpackage.qq7) r7
            r7.l(r4, r8, r3)
            goto L204
        L201:
            r12.measure(r8, r3)
        L204:
            r1.G = r8
            r1.H = r3
            r4 = 0
            r1.g = r4
            int r4 = r12.getMeasuredWidth()
            int r7 = r12.getMeasuredHeight()
            int r13 = r12.getBaseline()
            int r14 = r1.u
            if (r14 <= 0) goto L220
            int r14 = java.lang.Math.max(r14, r4)
            goto L221
        L220:
            r14 = r4
        L221:
            int r15 = r1.v
            if (r15 <= 0) goto L229
            int r14 = java.lang.Math.min(r15, r14)
        L229:
            int r15 = r1.x
            if (r15 <= 0) goto L234
            int r15 = java.lang.Math.max(r15, r7)
        L231:
            r16 = r3
            goto L236
        L234:
            r15 = r7
            goto L231
        L236:
            int r3 = r1.y
            if (r3 <= 0) goto L23e
            int r15 = java.lang.Math.min(r3, r15)
        L23e:
            int r0 = r0.h0
            r3 = 1
            boolean r0 = defpackage.n16.v(r0, r3)
            if (r0 != 0) goto L260
            r0 = 1056964608(0x3f000000, float:0.5)
            if (r9 == 0) goto L255
            if (r11 == 0) goto L255
            float r3 = r1.X
            float r5 = (float) r15
            float r5 = r5 * r3
            float r5 = r5 + r0
            int r0 = (int) r5
            r14 = r0
            goto L260
        L255:
            if (r6 == 0) goto L260
            if (r5 == 0) goto L260
            float r3 = r1.X
            float r5 = (float) r14
            float r5 = r5 / r3
            float r5 = r5 + r0
            int r0 = (int) r5
            r15 = r0
        L260:
            if (r4 != r14) goto L268
            if (r7 == r15) goto L265
            goto L268
        L265:
            r3 = -1
            r4 = 0
            goto L293
        L268:
            r0 = 1073741824(0x40000000, float:2.0)
            if (r4 == r14) goto L270
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r14, r0)
        L270:
            if (r7 == r15) goto L277
            int r3 = android.view.View.MeasureSpec.makeMeasureSpec(r15, r0)
            goto L279
        L277:
            r3 = r16
        L279:
            r12.measure(r8, r3)
            r1.G = r8
            r1.H = r3
            r4 = 0
            r1.g = r4
            int r0 = r12.getMeasuredWidth()
            int r3 = r12.getMeasuredHeight()
            int r5 = r12.getBaseline()
            r14 = r0
            r15 = r3
            r13 = r5
            r3 = -1
        L293:
            if (r13 == r3) goto L297
            r11 = 1
            goto L298
        L297:
            r11 = r4
        L298:
            int r0 = r2.c
            if (r14 != r0) goto L2a3
            int r0 = r2.d
            if (r15 == r0) goto L2a1
            goto L2a3
        L2a1:
            r7 = r4
            goto L2a4
        L2a3:
            r7 = 1
        L2a4:
            r2.i = r7
            boolean r0 = r10.c0
            if (r0 == 0) goto L2ab
            r11 = 1
        L2ab:
            if (r11 == 0) goto L2b7
            r3 = -1
            if (r13 == r3) goto L2b7
            int r0 = r1.b0
            if (r0 == r13) goto L2b7
            r3 = 1
            r2.i = r3
        L2b7:
            r2.e = r14
            r2.f = r15
            r2.h = r11
            r2.g = r13
            return
    }
}
