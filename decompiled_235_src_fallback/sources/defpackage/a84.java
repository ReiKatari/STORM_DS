package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: a84  reason: default package */
/* loaded from: classes.dex */
public final class a84 implements android.view.View.OnClickListener {
    public final defpackage.b84 A;
    public final int B;
    public final int L;

    public a84(android.content.Context r3, defpackage.b84 r4, android.content.res.XmlResourceParser r5) {
            r2 = this;
            r2.<init>()
            r0 = -1
            r2.B = r0
            r0 = 17
            r2.L = r0
            r2.A = r4
            android.util.AttributeSet r4 = android.util.Xml.asAttributeSet(r5)
            int[] r5 = defpackage.e75.n
            android.content.res.TypedArray r3 = r3.obtainStyledAttributes(r4, r5)
            int r4 = r3.getIndexCount()
            r5 = 0
        L1b:
            if (r5 >= r4) goto L3a
            int r0 = r3.getIndex(r5)
            r1 = 1
            if (r0 != r1) goto L2d
            int r1 = r2.B
            int r0 = r3.getResourceId(r0, r1)
            r2.B = r0
            goto L37
        L2d:
            if (r0 != 0) goto L37
            int r1 = r2.L
            int r0 = r3.getInt(r0, r1)
            r2.L = r0
        L37:
            int r5 = r5 + 1
            goto L1b
        L3a:
            r3.recycle()
            return
    }

    public final void a(androidx.constraintlayout.motion.widget.MotionLayout r8, int r9, defpackage.b84 r10) {
            r7 = this;
            int r0 = r7.B
            r1 = -1
            if (r0 != r1) goto L6
            goto La
        L6:
            android.view.View r8 = r8.findViewById(r0)
        La:
            if (r8 != 0) goto L20
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "OnClick could not find id "
            r7.<init>(r8)
            r7.append(r0)
            java.lang.String r7 = r7.toString()
            java.lang.String r8 = "MotionScene"
            android.util.Log.e(r8, r7)
            return
        L20:
            int r0 = r10.d
            int r10 = r10.c
            if (r0 != r1) goto L2a
            r8.setOnClickListener(r7)
            return
        L2a:
            int r1 = r7.L
            r2 = r1 & 1
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L36
            if (r9 != r0) goto L36
            r5 = r4
            goto L37
        L36:
            r5 = r3
        L37:
            r6 = r1 & 256(0x100, float:3.59E-43)
            if (r6 == 0) goto L3f
            if (r9 != r0) goto L3f
            r6 = r4
            goto L40
        L3f:
            r6 = r3
        L40:
            r5 = r5 | r6
            if (r2 == 0) goto L47
            if (r9 != r0) goto L47
            r0 = r4
            goto L48
        L47:
            r0 = r3
        L48:
            r0 = r0 | r5
            r2 = r1 & 16
            if (r2 == 0) goto L51
            if (r9 != r10) goto L51
            r2 = r4
            goto L52
        L51:
            r2 = r3
        L52:
            r0 = r0 | r2
            r1 = r1 & 4096(0x1000, float:5.74E-42)
            if (r1 == 0) goto L5a
            if (r9 != r10) goto L5a
            r3 = r4
        L5a:
            r9 = r0 | r3
            if (r9 == 0) goto L61
            r8.setOnClickListener(r7)
        L61:
            return
    }

    public final void b(androidx.constraintlayout.motion.widget.MotionLayout r2) {
            r1 = this;
            r0 = -1
            int r1 = r1.B
            if (r1 != r0) goto L6
            return
        L6:
            android.view.View r2 = r2.findViewById(r1)
            if (r2 != 0) goto L20
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r0 = " (*)  could not find id "
            r2.<init>(r0)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            java.lang.String r2 = "MotionScene"
            android.util.Log.e(r2, r1)
            return
        L20:
            r1 = 0
            r2.setOnClickListener(r1)
            return
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View r13) {
            r12 = this;
            b84 r13 = r12.A
            androidx.constraintlayout.motion.widget.b r0 = r13.j
            androidx.constraintlayout.motion.widget.MotionLayout r1 = r0.a
            boolean r2 = r1.y0
            if (r2 != 0) goto Lc
            goto Lb4
        Lc:
            int r2 = r13.d
            r3 = 0
            r4 = 1065353216(0x3f800000, float:1.0)
            r5 = -1
            if (r2 != r5) goto L34
            int r12 = r1.getCurrentState()
            if (r12 != r5) goto L20
            int r12 = r13.c
            r1.z(r12)
            return
        L20:
            b84 r2 = new b84
            r2.<init>(r0, r13)
            r2.d = r12
            int r12 = r13.c
            r2.c = r12
            r1.setTransition(r2)
            r1.p(r4)
            r1.k1 = r3
            return
        L34:
            b84 r0 = r0.c
            int r12 = r12.L
            r2 = r12 & 1
            r6 = 0
            r7 = 1
            if (r2 != 0) goto L45
            r8 = r12 & 256(0x100, float:3.59E-43)
            if (r8 == 0) goto L43
            goto L45
        L43:
            r8 = r6
            goto L46
        L45:
            r8 = r7
        L46:
            r9 = r12 & 16
            if (r9 != 0) goto L50
            r10 = r12 & 4096(0x1000, float:5.74E-42)
            if (r10 == 0) goto L4f
            goto L50
        L4f:
            r7 = r6
        L50:
            if (r8 == 0) goto L6f
            if (r7 == 0) goto L6f
            if (r0 == r13) goto L59
            r1.setTransition(r13)
        L59:
            int r10 = r1.getCurrentState()
            int r11 = r1.getEndState()
            if (r10 == r11) goto L70
            float r10 = r1.getProgress()
            r11 = 1056964608(0x3f000000, float:0.5)
            int r10 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
            if (r10 <= 0) goto L6e
            goto L70
        L6e:
            r7 = r6
        L6f:
            r6 = r8
        L70:
            if (r13 != r0) goto L73
            goto L82
        L73:
            int r0 = r13.c
            int r8 = r13.d
            int r10 = r1.u0
            if (r8 != r5) goto L7e
            if (r10 == r0) goto Lb4
            goto L82
        L7e:
            if (r10 == r8) goto L82
            if (r10 != r0) goto Lb4
        L82:
            if (r6 == 0) goto L8f
            if (r2 == 0) goto L8f
            r1.setTransition(r13)
            r1.p(r4)
            r1.k1 = r3
            return
        L8f:
            r0 = 0
            if (r7 == 0) goto L9b
            if (r9 == 0) goto L9b
            r1.setTransition(r13)
            r1.p(r0)
            return
        L9b:
            if (r6 == 0) goto La8
            r2 = r12 & 256(0x100, float:3.59E-43)
            if (r2 == 0) goto La8
            r1.setTransition(r13)
            r1.setProgress(r4)
            return
        La8:
            if (r7 == 0) goto Lb4
            r12 = r12 & 4096(0x1000, float:5.74E-42)
            if (r12 == 0) goto Lb4
            r1.setTransition(r13)
            r1.setProgress(r0)
        Lb4:
            return
    }
}
