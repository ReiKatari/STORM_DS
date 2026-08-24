package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ei  reason: default package */
/* loaded from: classes.dex */
public final class ei implements defpackage.dx6 {
    public final /* synthetic */ int A;
    public int B;
    public java.lang.Object L;
    public java.lang.Object R;

    public ei() {
            r2 = this;
            r0 = 4
            r2.A = r0
            r2.<init>()
            ua4 r0 = new ua4
            r1 = 16
            bb3[] r1 = new defpackage.bb3[r1]
            r0.<init>(r1)
            r2.L = r0
            return
    }

    public /* synthetic */ ei(int r1) {
            r0 = this;
            r0.A = r1
            r0.<init>()
            return
    }

    public ei(android.widget.ImageView r2) {
            r1 = this;
            r0 = 1
            r1.A = r0
            r1.<init>()
            r0 = 0
            r1.B = r0
            r1.L = r2
            return
    }

    public ei(defpackage.fo7 r2) {
            r1 = this;
            r0 = 2
            r1.A = r0
            r1.<init>()
            r1.L = r2
            return
    }

    public /* synthetic */ ei(java.lang.Object r1, int r2, int r3, java.lang.Object r4) {
            r0 = this;
            r0.A = r3
            r0.L = r1
            r0.R = r4
            r0.B = r2
            r0.<init>()
            return
    }

    public ei(java.util.ArrayList r2, int r3, android.view.MotionEvent r4) {
            r1 = this;
            r0 = 0
            r1.A = r0
            r1.<init>()
            r1.L = r2
            r1.B = r3
            r1.R = r4
            boolean r1 = r2.isEmpty()
            if (r1 != 0) goto L13
            return
        L13:
            java.lang.String r1 = "changes cannot be empty"
            defpackage.i.h(r1)
            r1 = 0
            throw r1
    }

    public ei(defpackage.k55 r2, int r3, java.lang.String r4) {
            r1 = this;
            r0 = 8
            r1.A = r0
            r2.getClass()
            r1.<init>()
            r1.L = r2
            r1.B = r3
            r1.R = r4
            return
    }

    public ei(defpackage.l93 r13, defpackage.uj2 r14) {
            r12 = this;
            r0 = 5
            r12.A = r0
            r12.<init>()
            ei r14 = r14.J()
            int r0 = r13.A
            if (r0 < 0) goto Lf
            goto L14
        Lf:
            java.lang.String r1 = "negative nearestRange.first"
            defpackage.s53.c(r1)
        L14:
            int r13 = r13.B
            int r1 = r14.B
            int r1 = r1 + (-1)
            int r13 = java.lang.Math.min(r13, r1)
            if (r13 >= r0) goto L30
            y94 r13 = defpackage.th4.a
            r13.getClass()
            r12.L = r13
            r13 = 0
            java.lang.Object[] r14 = new java.lang.Object[r13]
            r12.R = r14
            r12.B = r13
            goto Lee
        L30:
            int r1 = r13 - r0
            int r1 = r1 + 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r12.R = r2
            r12.B = r0
            y94 r2 = new y94
            r2.<init>(r1)
            java.lang.Object r1 = r14.L
            ua4 r1 = (defpackage.ua4) r1
            java.lang.String r3 = ", size "
            java.lang.String r4 = "Index "
            if (r0 < 0) goto L4e
            int r5 = r14.B
            if (r0 >= r5) goto L4e
            goto L5e
        L4e:
            java.lang.StringBuilder r5 = defpackage.xg6.t(r4, r0, r3)
            int r6 = r14.B
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            defpackage.s53.e(r5)
        L5e:
            if (r13 < 0) goto L65
            int r5 = r14.B
            if (r13 >= r5) goto L65
            goto L75
        L65:
            java.lang.StringBuilder r3 = defpackage.xg6.t(r4, r13, r3)
            int r14 = r14.B
            r3.append(r14)
            java.lang.String r14 = r3.toString()
            defpackage.s53.e(r14)
        L75:
            if (r13 < r0) goto L78
            goto L96
        L78:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            java.lang.String r3 = "toIndex ("
            r14.<init>(r3)
            r14.append(r13)
            java.lang.String r3 = ") should be not smaller than fromIndex ("
            r14.append(r3)
            r14.append(r0)
            r3 = 41
            r14.append(r3)
            java.lang.String r14 = r14.toString()
            defpackage.s53.a(r14)
        L96:
            int r14 = defpackage.mp2.f(r0, r1)
            java.lang.Object[] r3 = r1.A
            r3 = r3[r14]
            bb3 r3 = (defpackage.bb3) r3
            int r3 = r3.a
        La2:
            if (r3 > r13) goto Lec
            java.lang.Object[] r4 = r1.A
            r4 = r4[r14]
            bb3 r4 = (defpackage.bb3) r4
            vp3 r5 = r4.c
            qn2 r5 = r5.getKey()
            int r6 = r4.a
            int r7 = java.lang.Math.max(r0, r6)
            int r8 = r4.b
            int r8 = r8 + r6
            int r8 = r8 + (-1)
            int r8 = java.lang.Math.min(r13, r8)
            if (r7 > r8) goto Le6
        Lc1:
            if (r5 == 0) goto Lcf
            int r9 = r7 - r6
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            java.lang.Object r9 = r5.g(r9)
            if (r9 != 0) goto Ld4
        Lcf:
            pe1 r9 = new pe1
            r9.<init>(r7)
        Ld4:
            r2.g(r7, r9)
            java.lang.Object r10 = r12.R
            java.lang.Object[] r10 = (java.lang.Object[]) r10
            int r11 = r12.B
            int r11 = r7 - r11
            r10[r11] = r9
            if (r7 == r8) goto Le6
            int r7 = r7 + 1
            goto Lc1
        Le6:
            int r4 = r4.b
            int r3 = r3 + r4
            int r14 = r14 + 1
            goto La2
        Lec:
            r12.L = r2
        Lee:
            return
    }

    public static defpackage.ei c(android.content.res.Resources r28, int r29, android.content.res.Resources.Theme r30) {
            r0 = r28
            r1 = r30
            android.content.res.XmlResourceParser r2 = r28.getXml(r29)
            android.util.AttributeSet r3 = android.util.Xml.asAttributeSet(r2)
        Lc:
            int r4 = r2.next()
            r5 = 1
            r6 = 2
            if (r4 == r6) goto L17
            if (r4 == r5) goto L17
            goto Lc
        L17:
            if (r4 != r6) goto L282
            java.lang.String r4 = r2.getName()
            r4.getClass()
            java.lang.String r7 = "gradient"
            boolean r8 = r4.equals(r7)
            r9 = 3
            r10 = 0
            if (r8 != 0) goto L5e
            java.lang.String r5 = "selector"
            boolean r5 = r4.equals(r5)
            if (r5 == 0) goto L40
            android.content.res.ColorStateList r0 = defpackage.rt0.b(r0, r2, r3, r1)
            ei r1 = new ei
            int r2 = r0.getDefaultColor()
            r1.<init>(r10, r2, r9, r0)
            return r1
        L40:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r1 = r2.getPositionDescription()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            java.lang.String r1 = ": unsupported complex color tag "
            r2.append(r1)
            r2.append(r4)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            throw r0
        L5e:
            java.lang.String r4 = r2.getName()
            boolean r7 = r4.equals(r7)
            if (r7 == 0) goto L262
            int[] r4 = defpackage.g75.e
            android.content.res.TypedArray r4 = defpackage.xk2.D(r0, r1, r3, r4)
            java.lang.String r7 = "http://schemas.android.com/apk/res/android"
            java.lang.String r8 = "startX"
            java.lang.String r8 = r2.getAttributeValue(r7, r8)
            r11 = 0
            if (r8 == 0) goto L81
            r8 = 8
            float r8 = r4.getFloat(r8, r11)
            r13 = r8
            goto L82
        L81:
            r13 = r11
        L82:
            java.lang.String r8 = "startY"
            java.lang.String r8 = r2.getAttributeValue(r7, r8)
            if (r8 == 0) goto L92
            r8 = 9
            float r8 = r4.getFloat(r8, r11)
            r14 = r8
            goto L93
        L92:
            r14 = r11
        L93:
            java.lang.String r8 = "endX"
            java.lang.String r8 = r2.getAttributeValue(r7, r8)
            if (r8 == 0) goto La3
            r8 = 10
            float r8 = r4.getFloat(r8, r11)
            r15 = r8
            goto La4
        La3:
            r15 = r11
        La4:
            java.lang.String r8 = "endY"
            java.lang.String r8 = r2.getAttributeValue(r7, r8)
            if (r8 == 0) goto Lb5
            r8 = 11
            float r8 = r4.getFloat(r8, r11)
            r16 = r8
            goto Lb7
        Lb5:
            r16 = r11
        Lb7:
            java.lang.String r8 = "centerX"
            java.lang.String r8 = r2.getAttributeValue(r7, r8)
            if (r8 == 0) goto Lc4
            float r8 = r4.getFloat(r9, r11)
            goto Lc5
        Lc4:
            r8 = r11
        Lc5:
            java.lang.String r12 = "centerY"
            java.lang.String r12 = r2.getAttributeValue(r7, r12)
            if (r12 == 0) goto Ld3
            r12 = 4
            float r12 = r4.getFloat(r12, r11)
            goto Ld4
        Ld3:
            r12 = r11
        Ld4:
            java.lang.String r10 = "type"
            java.lang.String r10 = r2.getAttributeValue(r7, r10)
            r9 = 0
            if (r10 == 0) goto Le2
            int r10 = r4.getInt(r6, r9)
            goto Le3
        Le2:
            r10 = r9
        Le3:
            java.lang.String r6 = "startColor"
            java.lang.String r6 = r2.getAttributeValue(r7, r6)
            if (r6 == 0) goto Lf0
            int r6 = r4.getColor(r9, r9)
            goto Lf1
        Lf0:
            r6 = r9
        Lf1:
            java.lang.String r11 = "centerColor"
            java.lang.String r19 = r2.getAttributeValue(r7, r11)
            if (r19 == 0) goto Lfc
            r19 = r5
            goto Lfe
        Lfc:
            r19 = r9
        Lfe:
            java.lang.String r11 = r2.getAttributeValue(r7, r11)
            if (r11 == 0) goto L10a
            r11 = 7
            int r11 = r4.getColor(r11, r9)
            goto L10b
        L10a:
            r11 = r9
        L10b:
            java.lang.String r5 = "endColor"
            java.lang.String r5 = r2.getAttributeValue(r7, r5)
            if (r5 == 0) goto L11b
            r5 = 1
            int r21 = r4.getColor(r5, r9)
            r5 = r21
            goto L11c
        L11b:
            r5 = r9
        L11c:
            java.lang.String r9 = "tileMode"
            java.lang.String r9 = r2.getAttributeValue(r7, r9)
            if (r9 == 0) goto L12e
            r9 = 6
            r21 = r13
            r13 = 0
            int r9 = r4.getInt(r9, r13)
            r13 = r9
            goto L131
        L12e:
            r21 = r13
            r13 = 0
        L131:
            java.lang.String r9 = "gradientRadius"
            java.lang.String r7 = r2.getAttributeValue(r7, r9)
            if (r7 == 0) goto L141
            r7 = 5
            r9 = 0
            float r7 = r4.getFloat(r7, r9)
            r9 = r7
            goto L142
        L141:
            r9 = 0
        L142:
            r4.recycle()
            int r4 = r2.getDepth()
            r7 = 1
            int r4 = r4 + r7
            java.util.ArrayList r7 = new java.util.ArrayList
            r22 = r2
            r2 = 20
            r7.<init>(r2)
            r23 = r9
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>(r2)
        L15b:
            int r2 = r22.next()
            r24 = r14
            r14 = 1
            if (r2 == r14) goto L1d1
            int r14 = r22.getDepth()
            r25 = r15
            if (r14 >= r4) goto L16f
            r15 = 3
            if (r2 == r15) goto L1d3
        L16f:
            r15 = 2
            if (r2 == r15) goto L177
        L172:
            r14 = r24
            r15 = r25
            goto L15b
        L177:
            if (r14 > r4) goto L172
            java.lang.String r2 = r22.getName()
            java.lang.String r14 = "item"
            boolean r2 = r2.equals(r14)
            if (r2 != 0) goto L186
            goto L172
        L186:
            int[] r2 = defpackage.g75.f
            android.content.res.TypedArray r2 = defpackage.xk2.D(r0, r1, r3, r2)
            r14 = 0
            boolean r15 = r2.hasValue(r14)
            r14 = 1
            boolean r20 = r2.hasValue(r14)
            if (r15 == 0) goto L1b6
            if (r20 == 0) goto L1b6
            r15 = 0
            int r26 = r2.getColor(r15, r15)
            r15 = 0
            float r27 = r2.getFloat(r14, r15)
            r2.recycle()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r26)
            r9.add(r2)
            java.lang.Float r2 = java.lang.Float.valueOf(r27)
            r7.add(r2)
            goto L172
        L1b6:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r1 = r22.getPositionDescription()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            java.lang.String r1 = ": <item> tag requires a 'color' attribute and a 'offset' attribute!"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            throw r0
        L1d1:
            r25 = r15
        L1d3:
            int r0 = r9.size()
            if (r0 <= 0) goto L1df
            bb0 r0 = new bb0
            r0.<init>(r9, r7)
            goto L1e0
        L1df:
            r0 = 0
        L1e0:
            if (r0 == 0) goto L1e4
        L1e2:
            r14 = 1
            goto L1f2
        L1e4:
            if (r19 == 0) goto L1ec
            bb0 r0 = new bb0
            r0.<init>(r6, r11, r5)
            goto L1e2
        L1ec:
            bb0 r0 = new bb0
            r0.<init>(r6, r5)
            goto L1e2
        L1f2:
            if (r10 == r14) goto L225
            r15 = 2
            if (r10 == r15) goto L21a
            android.graphics.LinearGradient r12 = new android.graphics.LinearGradient
            int[] r1 = r0.a
            float[] r0 = r0.b
            if (r13 == r14) goto L213
            if (r13 == r15) goto L210
            android.graphics.Shader$TileMode r2 = android.graphics.Shader.TileMode.CLAMP
        L203:
            r18 = r0
            r17 = r1
            r19 = r2
            r13 = r21
            r14 = r24
            r15 = r25
            goto L216
        L210:
            android.graphics.Shader$TileMode r2 = android.graphics.Shader.TileMode.MIRROR
            goto L203
        L213:
            android.graphics.Shader$TileMode r2 = android.graphics.Shader.TileMode.REPEAT
            goto L203
        L216:
            r12.<init>(r13, r14, r15, r16, r17, r18, r19)
            goto L251
        L21a:
            android.graphics.SweepGradient r1 = new android.graphics.SweepGradient
            int[] r2 = r0.a
            float[] r0 = r0.b
            r1.<init>(r8, r12, r2, r0)
            r12 = r1
            goto L251
        L225:
            r18 = 0
            int r1 = (r23 > r18 ? 1 : (r23 == r18 ? 0 : -1))
            if (r1 <= 0) goto L25a
            r15 = 2
            android.graphics.RadialGradient r17 = new android.graphics.RadialGradient
            int[] r1 = r0.a
            float[] r0 = r0.b
            r14 = 1
            if (r13 == r14) goto L249
            if (r13 == r15) goto L246
            android.graphics.Shader$TileMode r2 = android.graphics.Shader.TileMode.CLAMP
        L239:
            r22 = r0
            r21 = r1
            r18 = r8
            r19 = r12
            r20 = r23
            r23 = r2
            goto L24c
        L246:
            android.graphics.Shader$TileMode r2 = android.graphics.Shader.TileMode.MIRROR
            goto L239
        L249:
            android.graphics.Shader$TileMode r2 = android.graphics.Shader.TileMode.REPEAT
            goto L239
        L24c:
            r17.<init>(r18, r19, r20, r21, r22, r23)
            r12 = r17
        L251:
            ei r0 = new ei
            r1 = 0
            r13 = 0
            r15 = 3
            r0.<init>(r12, r13, r15, r1)
            return r0
        L25a:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r1 = "<gradient> tag requires 'gradientRadius' attribute with radial type"
            r0.<init>(r1)
            throw r0
        L262:
            r22 = r2
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r1 = r22.getPositionDescription()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            java.lang.String r1 = ": invalid gradient color tag "
            r2.append(r1)
            r2.append(r4)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            throw r0
        L282:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r1 = "No start tag found"
            r0.<init>(r1)
            throw r0
    }

    public static /* synthetic */ void h(defpackage.ei r12, int r13, int r14, int r15, int r16, int r17, int r18, boolean r19, boolean r20, boolean r21, int r22) {
            r0 = r22 & 32
            if (r0 == 0) goto L7
            r0 = -1
            r7 = r0
            goto L9
        L7:
            r7 = r18
        L9:
            r11 = -1
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            r8 = r19
            r9 = r20
            r10 = r21
            r1.g(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
    }

    public void a(int r3, defpackage.vp3 r4) {
            r2 = this;
            if (r3 < 0) goto L3
            goto L8
        L3:
            java.lang.String r0 = "size should be >=0"
            defpackage.s53.a(r0)
        L8:
            if (r3 != 0) goto Lb
            return
        Lb:
            bb3 r0 = new bb3
            int r1 = r2.B
            r0.<init>(r1, r3, r4)
            int r4 = r2.B
            int r4 = r4 + r3
            r2.B = r4
            java.lang.Object r2 = r2.L
            ua4 r2 = (defpackage.ua4) r2
            r2.b(r0)
            return
    }

    public void b() {
            r2 = this;
            java.lang.Object r0 = r2.L
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            android.graphics.drawable.Drawable r1 = r0.getDrawable()
            if (r1 == 0) goto Ld
            defpackage.bp1.a(r1)
        Ld:
            if (r1 == 0) goto L1c
            java.lang.Object r2 = r2.R
            wz0 r2 = (defpackage.wz0) r2
            if (r2 == 0) goto L1c
            int[] r0 = r0.getDrawableState()
            defpackage.ir.e(r1, r2, r0)
        L1c:
            return
    }

    public defpackage.bb3 d(int r4) {
            r3 = this;
            if (r4 < 0) goto L7
            int r0 = r3.B
            if (r4 >= r0) goto L7
            goto L1b
        L7:
            java.lang.String r0 = "Index "
            java.lang.String r1 = ", size "
            java.lang.StringBuilder r0 = defpackage.xg6.t(r0, r4, r1)
            int r1 = r3.B
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            defpackage.s53.e(r0)
        L1b:
            java.lang.Object r0 = r3.R
            bb3 r0 = (defpackage.bb3) r0
            if (r0 == 0) goto L2b
            int r1 = r0.a
            int r2 = r0.b
            int r2 = r2 + r1
            if (r4 >= r2) goto L2b
            if (r1 > r4) goto L2b
            return r0
        L2b:
            java.lang.Object r0 = r3.L
            ua4 r0 = (defpackage.ua4) r0
            int r4 = defpackage.mp2.f(r4, r0)
            java.lang.Object[] r0 = r0.A
            r4 = r0[r4]
            bb3 r4 = (defpackage.bb3) r4
            r3.R = r4
            return r4
    }

    public int e(java.lang.Object r1) {
            r0 = this;
            java.lang.Object r0 = r0.L
            y94 r0 = (defpackage.y94) r0
            int r1 = r0.d(r1)
            if (r1 < 0) goto Lf
            int[] r0 = r0.c
            r0 = r0[r1]
            return r0
        Lf:
            r0 = -1
            return r0
    }

    public java.lang.Object f(int r2) {
            r1 = this;
            java.lang.Object r0 = r1.R
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            int r1 = r1.B
            int r2 = r2 - r1
            if (r2 < 0) goto Lf
            int r1 = r0.length
            if (r2 >= r1) goto Lf
            r1 = r0[r2]
            return r1
        Lf:
            r1 = 0
            return r1
    }

    public void g(int r10, int r11, int r12, int r13, int r14, int r15, boolean r16, boolean r17, boolean r18, int r19) {
            r9 = this;
            java.lang.Object r0 = r9.L
            long[] r0 = (long[]) r0
            int r1 = r9.B
            int r2 = r1 + 3
            r9.B = r2
            int r3 = r0.length
            if (r3 > r2) goto L23
            int r3 = r3 * 2
            int r2 = java.lang.Math.max(r3, r2)
            long[] r0 = java.util.Arrays.copyOf(r0, r2)
            r9.L = r0
            java.lang.Object r0 = r9.R
            long[] r0 = (long[]) r0
            long[] r0 = java.util.Arrays.copyOf(r0, r2)
            r9.R = r0
        L23:
            java.lang.Object r9 = r9.L
            long[] r9 = (long[]) r9
            long r2 = (long) r11
            r11 = 32
            long r2 = r2 << r11
            long r4 = (long) r12
            r6 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r4 = r4 & r6
            long r2 = r2 | r4
            r9[r1] = r2
            int r12 = r1 + 1
            long r2 = (long) r13
            long r2 = r2 << r11
            long r4 = (long) r14
            long r4 = r4 & r6
            long r2 = r2 | r4
            r9[r12] = r2
            int r11 = r1 + 2
            r12 = r18
            long r2 = (long) r12
            r12 = 63
            long r2 = r2 << r12
            r12 = r17
            long r4 = (long) r12
            r12 = 62
            long r4 = r4 << r12
            long r2 = r2 | r4
            r12 = r16
            long r4 = (long) r12
            r12 = 61
            long r4 = r4 << r12
            long r2 = r2 | r4
            r4 = 1152921504606846976(0x1000000000000000, double:1.2882297539194267E-231)
            long r2 = r2 | r4
            r12 = 0
            r0 = 1023(0x3ff, float:1.434E-42)
            int r12 = java.lang.Math.min(r12, r0)
            long r4 = (long) r12
            r12 = 50
            long r4 = r4 << r12
            long r2 = r2 | r4
            r4 = 33554431(0x1ffffff, float:9.403954E-38)
            r5 = r15 & r4
            long r6 = (long) r5
            r8 = 25
            long r6 = r6 << r8
            long r2 = r2 | r6
            r10 = r10 & r4
            long r6 = (long) r10
            long r2 = r2 | r6
            r9[r11] = r2
            if (r15 >= 0) goto L75
            goto La0
        L75:
            r10 = -1
            r11 = r19
            if (r11 == r10) goto L7c
            r10 = r11
            goto L7e
        L7c:
            int r10 = r1 + (-3)
        L7e:
            if (r10 < 0) goto La0
            int r11 = r10 + 2
            r2 = r9[r11]
            int r6 = (int) r2
            r6 = r6 & r4
            if (r6 != r5) goto L9d
            int r1 = r1 - r10
            int r1 = r1 / 3
            int r10 = defpackage.qf5.b
            r4 = -1151795604700004353(0xf003ffffffffffff, double:-3.8812952307517716E231)
            long r2 = r2 & r4
            int r10 = java.lang.Math.min(r1, r0)
            long r0 = (long) r10
            long r0 = r0 << r12
            long r0 = r0 | r2
            r9[r11] = r0
            return
        L9d:
            int r10 = r10 + (-3)
            goto L7e
        La0:
            return
    }

    public boolean i() {
            r1 = this;
            java.lang.Object r0 = r1.L
            android.graphics.Shader r0 = (android.graphics.Shader) r0
            if (r0 != 0) goto L14
            java.lang.Object r1 = r1.R
            android.content.res.ColorStateList r1 = (android.content.res.ColorStateList) r1
            if (r1 == 0) goto L14
            boolean r1 = r1.isStateful()
            if (r1 == 0) goto L14
            r1 = 1
            return r1
        L14:
            r1 = 0
            return r1
    }

    public void j(android.util.AttributeSet r8, int r9) {
            r7 = this;
            java.lang.Object r7 = r7.L
            r0 = r7
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            android.content.Context r7 = r0.getContext()
            int[] r2 = defpackage.m75.f
            m44 r7 = defpackage.m44.A(r7, r8, r2, r9)
            java.lang.Object r1 = r7.L
            r6 = r1
            android.content.res.TypedArray r6 = (android.content.res.TypedArray) r6
            android.content.Context r1 = r0.getContext()
            java.lang.Object r3 = r7.L
            r4 = r3
            android.content.res.TypedArray r4 = (android.content.res.TypedArray) r4
            r3 = r8
            r5 = r9
            defpackage.ao7.m(r0, r1, r2, r3, r4, r5)
            android.graphics.drawable.Drawable r8 = r0.getDrawable()     // Catch: java.lang.Throwable -> L3e
            r9 = -1
            if (r8 != 0) goto L41
            r1 = 1
            int r1 = r6.getResourceId(r1, r9)     // Catch: java.lang.Throwable -> L3e
            if (r1 == r9) goto L41
            android.content.Context r8 = r0.getContext()     // Catch: java.lang.Throwable -> L3e
            android.graphics.drawable.Drawable r8 = defpackage.hf.S(r8, r1)     // Catch: java.lang.Throwable -> L3e
            if (r8 == 0) goto L41
            r0.setImageDrawable(r8)     // Catch: java.lang.Throwable -> L3e
            goto L41
        L3e:
            r0 = move-exception
            r8 = r0
            goto L6b
        L41:
            if (r8 == 0) goto L46
            defpackage.bp1.a(r8)     // Catch: java.lang.Throwable -> L3e
        L46:
            r8 = 2
            boolean r1 = r6.hasValue(r8)     // Catch: java.lang.Throwable -> L3e
            if (r1 == 0) goto L54
            android.content.res.ColorStateList r8 = r7.g(r8)     // Catch: java.lang.Throwable -> L3e
            r0.setImageTintList(r8)     // Catch: java.lang.Throwable -> L3e
        L54:
            r8 = 3
            boolean r1 = r6.hasValue(r8)     // Catch: java.lang.Throwable -> L3e
            if (r1 == 0) goto L67
            int r8 = r6.getInt(r8, r9)     // Catch: java.lang.Throwable -> L3e
            r9 = 0
            android.graphics.PorterDuff$Mode r8 = defpackage.bp1.c(r8, r9)     // Catch: java.lang.Throwable -> L3e
            r0.setImageTintMode(r8)     // Catch: java.lang.Throwable -> L3e
        L67:
            r7.D()
            return
        L6b:
            r7.D()
            throw r8
    }

    public void k(int r9, boolean r10) {
            r8 = this;
            r0 = 33554431(0x1ffffff, float:9.403954E-38)
            r9 = r9 & r0
            java.lang.Object r1 = r8.L
            long[] r1 = (long[]) r1
            int r8 = r8.B
            r2 = 0
        Lb:
            int r3 = r1.length
            int r3 = r3 + (-2)
            if (r2 >= r3) goto L2f
            if (r2 >= r8) goto L2f
            int r3 = r2 + 2
            r4 = r1[r3]
            int r6 = (int) r4
            r6 = r6 & r0
            if (r6 != r9) goto L2c
            r8 = 8070450532247928831(0x6fffffffffffffff, double:3.1050361846014175E231)
            long r8 = r8 & r4
            long r4 = (long) r10
            r6 = 1152921504606846976(0x1000000000000000, double:1.2882297539194267E-231)
            long r6 = r6 * r4
            long r8 = r8 | r6
            r6 = -9223372036854775808
            long r4 = r4 * r6
            long r8 = r8 | r4
            r1[r3] = r8
            return
        L2c:
            int r2 = r2 + 3
            goto Lb
        L2f:
            return
    }

    public void l(long r23, int r25, int r26) {
            r22 = this;
            r0 = r22
            java.lang.Object r1 = r0.L
            long[] r1 = (long[]) r1
            java.lang.Object r2 = r0.R
            long[] r2 = (long[]) r2
            r3 = 0
            r2[r3] = r23
            r3 = 1
        Le:
            if (r3 <= 0) goto Lb0
            int r3 = r3 + (-1)
            r4 = r2[r3]
            int r6 = (int) r4
            r7 = 33554431(0x1ffffff, float:9.403954E-38)
            r6 = r6 & r7
            r8 = 25
            long r9 = r4 >> r8
            int r9 = (int) r9
            r9 = r9 & r7
            r10 = 50
            long r4 = r4 >> r10
            int r4 = (int) r4
            r5 = 1023(0x3ff, float:1.434E-42)
            r4 = r4 & r5
            if (r4 != r5) goto L2b
            int r4 = r0.B
            goto L2e
        L2b:
            int r4 = r4 * 3
            int r4 = r4 + r9
        L2e:
            if (r9 < 0) goto Lb0
        L30:
            int r11 = r1.length
            int r11 = r11 + (-2)
            if (r9 >= r11) goto Le
            if (r9 >= r4) goto Le
            int r11 = r9 + 2
            r12 = r1[r11]
            long r14 = r12 >> r8
            int r14 = (int) r14
            r14 = r14 & r7
            if (r14 != r6) goto La1
            r14 = r1[r9]
            int r16 = r9 + 1
            r23 = r7
            r24 = r8
            r7 = r1[r16]
            r17 = 32
            r18 = r10
            r19 = r11
            long r10 = r14 >> r17
            int r10 = (int) r10
            int r10 = r10 + r25
            int r11 = (int) r14
            int r11 = r11 + r26
            long r14 = (long) r10
            long r14 = r14 << r17
            long r10 = (long) r11
            r20 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r10 = r10 & r20
            long r10 = r10 | r14
            r1[r9] = r10
            long r10 = r7 >> r17
            int r10 = (int) r10
            int r10 = r10 + r25
            int r7 = (int) r7
            int r7 = r7 + r26
            long r10 = (long) r10
            long r10 = r10 << r17
            long r7 = (long) r7
            long r7 = r7 & r20
            long r7 = r7 | r10
            r1[r16] = r7
            r7 = 63
            long r7 = r12 >> r7
            r10 = 1
            long r7 = r7 & r10
            r10 = 60
            long r7 = r7 << r10
            long r7 = r7 | r12
            r1[r19] = r7
            long r7 = r12 >> r18
            int r7 = (int) r7
            r7 = r7 & r5
            if (r7 <= 0) goto La7
            int r7 = r3 + 1
            int r8 = r9 + 3
            int r10 = defpackage.qf5.b
            r10 = -1125899873288193(0xfffc000001ffffff, double:NaN)
            long r10 = r10 & r12
            r8 = r8 & r23
            long r12 = (long) r8
            long r12 = r12 << r24
            long r10 = r10 | r12
            r2[r3] = r10
            r3 = r7
            goto La7
        La1:
            r23 = r7
            r24 = r8
            r18 = r10
        La7:
            int r9 = r9 + 3
            r7 = r23
            r8 = r24
            r10 = r18
            goto L30
        Lb0:
            return
    }

    public void m(int r7, defpackage.go2 r8) {
            r6 = this;
            r0 = 33554431(0x1ffffff, float:9.403954E-38)
            r7 = r7 & r0
            java.lang.Object r1 = r6.L
            long[] r1 = (long[]) r1
            int r6 = r6.B
            r2 = 0
        Lb:
            int r3 = r1.length
            int r3 = r3 + (-2)
            if (r2 >= r3) goto L41
            if (r2 >= r6) goto L41
            int r3 = r2 + 2
            r3 = r1[r3]
            int r3 = (int) r3
            r3 = r3 & r0
            if (r3 != r7) goto L3e
            r6 = r1[r2]
            int r2 = r2 + 1
            r0 = r1[r2]
            r2 = 32
            long r3 = r6 >> r2
            int r3 = (int) r3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            int r6 = (int) r6
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            long r4 = r0 >> r2
            int r7 = (int) r4
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            int r0 = (int) r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r8.l(r3, r6, r7, r0)
            return
        L3e:
            int r2 = r2 + 3
            goto Lb
        L41:
            return
    }

    @Override // defpackage.dx6
    public java.lang.Object n() {
            r3 = this;
            java.lang.Object r0 = r3.L
            p87 r0 = (defpackage.p87) r0
            java.lang.Object r1 = r3.R
            fz r1 = (defpackage.fz) r1
            int r3 = r3.B
            java.lang.Object r0 = r0.d
            bt r0 = (defpackage.bt) r0
            int r3 = r3 + 1
            r2 = 0
            r0.U(r1, r3, r2)
            r3 = 0
            return r3
    }

    public java.lang.String toString() {
            r3 = this;
            int r0 = r3.A
            switch(r0) {
                case 8: goto La;
                default: goto L5;
            }
        L5:
            java.lang.String r3 = super.toString()
            return r3
        La:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Object r1 = r3.L
            k55 r1 = (defpackage.k55) r1
            k55 r2 = defpackage.k55.HTTP_1_0
            if (r1 != r2) goto L1d
            java.lang.String r1 = "HTTP/1.0"
            r0.append(r1)
            goto L22
        L1d:
            java.lang.String r1 = "HTTP/1.1"
            r0.append(r1)
        L22:
            r1 = 32
            r0.append(r1)
            int r2 = r3.B
            r0.append(r2)
            r0.append(r1)
            java.lang.Object r3 = r3.R
            java.lang.String r3 = (java.lang.String) r3
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }
}
