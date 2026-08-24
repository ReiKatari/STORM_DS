package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: yp7  reason: default package */
/* loaded from: classes.dex */
public final class yp7 {
    public int a;
    public int b;
    public boolean c;
    public int d;
    public int e;
    public final defpackage.yg3 f;
    public final defpackage.u11 g;
    public int h;
    public int i;
    public int j;
    public java.lang.String k;
    public int l;
    public java.lang.String m;
    public int n;
    public final android.content.Context o;
    public int p;
    public int q;
    public int r;
    public int s;
    public int t;
    public int u;

    public yp7(android.content.Context r6, android.content.res.XmlResourceParser r7) {
            r5 = this;
            java.lang.String r0 = "Error parsing XML resource"
            java.lang.String r1 = "ViewTransition"
            r5.<init>()
            r2 = -1
            r5.b = r2
            r3 = 0
            r5.c = r3
            r5.d = r3
            r5.h = r2
            r5.i = r2
            r5.l = r3
            r3 = 0
            r5.m = r3
            r5.n = r2
            r5.p = r2
            r5.q = r2
            r5.r = r2
            r5.s = r2
            r5.t = r2
            r5.u = r2
            r5.o = r6
            int r2 = r7.getEventType()     // Catch: java.io.IOException -> L43 org.xmlpull.v1.XmlPullParserException -> L46
        L2c:
            r3 = 1
            if (r2 == r3) goto Ld7
            r3 = 2
            if (r2 == r3) goto L49
            r3 = 3
            if (r2 == r3) goto L37
            goto Lca
        L37:
            java.lang.String r2 = r7.getName()     // Catch: java.io.IOException -> L43 org.xmlpull.v1.XmlPullParserException -> L46
            boolean r2 = r1.equals(r2)     // Catch: java.io.IOException -> L43 org.xmlpull.v1.XmlPullParserException -> L46
            if (r2 == 0) goto Lca
            goto Ld7
        L43:
            r5 = move-exception
            goto Ld0
        L46:
            r5 = move-exception
            goto Ld4
        L49:
            java.lang.String r2 = r7.getName()     // Catch: java.io.IOException -> L43 org.xmlpull.v1.XmlPullParserException -> L46
            int r3 = r2.hashCode()     // Catch: java.io.IOException -> L43 org.xmlpull.v1.XmlPullParserException -> L46
            switch(r3) {
                case -1962203927: goto L88;
                case -1239391468: goto L78;
                case 61998586: goto L6e;
                case 366511058: goto L5e;
                case 1791837707: goto L55;
                default: goto L54;
            }     // Catch: java.io.IOException -> L43 org.xmlpull.v1.XmlPullParserException -> L46
        L54:
            goto L97
        L55:
            java.lang.String r3 = "CustomAttribute"
            boolean r3 = r2.equals(r3)     // Catch: java.io.IOException -> L43 org.xmlpull.v1.XmlPullParserException -> L46
            if (r3 == 0) goto L97
            goto L66
        L5e:
            java.lang.String r3 = "CustomMethod"
            boolean r3 = r2.equals(r3)     // Catch: java.io.IOException -> L43 org.xmlpull.v1.XmlPullParserException -> L46
            if (r3 == 0) goto L97
        L66:
            u11 r2 = r5.g     // Catch: java.io.IOException -> L43 org.xmlpull.v1.XmlPullParserException -> L46
            java.util.HashMap r2 = r2.g     // Catch: java.io.IOException -> L43 org.xmlpull.v1.XmlPullParserException -> L46
            defpackage.j11.d(r6, r7, r2)     // Catch: java.io.IOException -> L43 org.xmlpull.v1.XmlPullParserException -> L46
            goto Lca
        L6e:
            boolean r3 = r2.equals(r1)     // Catch: java.io.IOException -> L43 org.xmlpull.v1.XmlPullParserException -> L46
            if (r3 == 0) goto L97
            r5.d(r6, r7)     // Catch: java.io.IOException -> L43 org.xmlpull.v1.XmlPullParserException -> L46
            goto Lca
        L78:
            java.lang.String r3 = "KeyFrameSet"
            boolean r3 = r2.equals(r3)     // Catch: java.io.IOException -> L43 org.xmlpull.v1.XmlPullParserException -> L46
            if (r3 == 0) goto L97
            yg3 r2 = new yg3     // Catch: java.io.IOException -> L43 org.xmlpull.v1.XmlPullParserException -> L46
            r2.<init>(r6, r7)     // Catch: java.io.IOException -> L43 org.xmlpull.v1.XmlPullParserException -> L46
            r5.f = r2     // Catch: java.io.IOException -> L43 org.xmlpull.v1.XmlPullParserException -> L46
            goto Lca
        L88:
            java.lang.String r3 = "ConstraintOverride"
            boolean r3 = r2.equals(r3)     // Catch: java.io.IOException -> L43 org.xmlpull.v1.XmlPullParserException -> L46
            if (r3 == 0) goto L97
            u11 r2 = defpackage.z11.d(r6, r7)     // Catch: java.io.IOException -> L43 org.xmlpull.v1.XmlPullParserException -> L46
            r5.g = r2     // Catch: java.io.IOException -> L43 org.xmlpull.v1.XmlPullParserException -> L46
            goto Lca
        L97:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L43 org.xmlpull.v1.XmlPullParserException -> L46
            r3.<init>()     // Catch: java.io.IOException -> L43 org.xmlpull.v1.XmlPullParserException -> L46
            java.lang.String r4 = defpackage.lb4.v()     // Catch: java.io.IOException -> L43 org.xmlpull.v1.XmlPullParserException -> L46
            r3.append(r4)     // Catch: java.io.IOException -> L43 org.xmlpull.v1.XmlPullParserException -> L46
            java.lang.String r4 = " unknown tag "
            r3.append(r4)     // Catch: java.io.IOException -> L43 org.xmlpull.v1.XmlPullParserException -> L46
            r3.append(r2)     // Catch: java.io.IOException -> L43 org.xmlpull.v1.XmlPullParserException -> L46
            java.lang.String r2 = r3.toString()     // Catch: java.io.IOException -> L43 org.xmlpull.v1.XmlPullParserException -> L46
            android.util.Log.e(r1, r2)     // Catch: java.io.IOException -> L43 org.xmlpull.v1.XmlPullParserException -> L46
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L43 org.xmlpull.v1.XmlPullParserException -> L46
            r2.<init>()     // Catch: java.io.IOException -> L43 org.xmlpull.v1.XmlPullParserException -> L46
            java.lang.String r3 = ".xml:"
            r2.append(r3)     // Catch: java.io.IOException -> L43 org.xmlpull.v1.XmlPullParserException -> L46
            int r3 = r7.getLineNumber()     // Catch: java.io.IOException -> L43 org.xmlpull.v1.XmlPullParserException -> L46
            r2.append(r3)     // Catch: java.io.IOException -> L43 org.xmlpull.v1.XmlPullParserException -> L46
            java.lang.String r2 = r2.toString()     // Catch: java.io.IOException -> L43 org.xmlpull.v1.XmlPullParserException -> L46
            android.util.Log.e(r1, r2)     // Catch: java.io.IOException -> L43 org.xmlpull.v1.XmlPullParserException -> L46
        Lca:
            int r2 = r7.next()     // Catch: java.io.IOException -> L43 org.xmlpull.v1.XmlPullParserException -> L46
            goto L2c
        Ld0:
            android.util.Log.e(r1, r0, r5)
            goto Ld7
        Ld4:
            android.util.Log.e(r1, r0, r5)
        Ld7:
            return
    }

    public final void a(defpackage.pa r23, androidx.constraintlayout.motion.widget.MotionLayout r24, int r25, defpackage.z11 r26, android.view.View... r27) {
            r22 = this;
            r0 = r22
            r1 = r24
            r2 = r25
            r3 = r26
            r4 = r27
            r5 = -1
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
            boolean r7 = r0.c
            if (r7 == 0) goto L14
            return
        L14:
            int r7 = r0.e
            yg3 r9 = r0.f
            r10 = 2
            r11 = 0
            r12 = 1
            if (r7 != r10) goto L1b6
            r2 = r4[r11]
            m74 r15 = new m74
            r15.<init>(r2)
            y74 r3 = r15.f
            r4 = 0
            r3.L = r4
            r3.R = r4
            r15.H = r12
            float r7 = r2.getX()
            float r11 = r2.getY()
            int r13 = r2.getWidth()
            float r13 = (float) r13
            int r14 = r2.getHeight()
            float r14 = (float) r14
            r3.d(r7, r11, r13, r14)
            float r3 = r2.getX()
            float r7 = r2.getY()
            int r11 = r2.getWidth()
            float r11 = (float) r11
            int r13 = r2.getHeight()
            float r13 = (float) r13
            y74 r14 = r15.g
            r14.d(r3, r7, r11, r13)
            k74 r3 = r15.h
            r3.getClass()
            r2.getX()
            r2.getY()
            r2.getWidth()
            r2.getHeight()
            int r7 = r2.getVisibility()
            r3.L = r7
            int r7 = r2.getVisibility()
            if (r7 == 0) goto L78
            r7 = r4
            goto L7c
        L78:
            float r7 = r2.getAlpha()
        L7c:
            r3.X = r7
            float r7 = r2.getElevation()
            r3.Y = r7
            float r7 = r2.getRotation()
            r3.Z = r7
            float r7 = r2.getRotationX()
            r3.d0 = r7
            float r7 = r2.getRotationY()
            r3.A = r7
            float r7 = r2.getScaleX()
            r3.e0 = r7
            float r7 = r2.getScaleY()
            r3.f0 = r7
            float r7 = r2.getPivotX()
            r3.g0 = r7
            float r7 = r2.getPivotY()
            r3.h0 = r7
            float r7 = r2.getTranslationX()
            r3.i0 = r7
            float r7 = r2.getTranslationY()
            r3.j0 = r7
            float r7 = r2.getTranslationZ()
            r3.k0 = r7
            k74 r3 = r15.i
            r3.getClass()
            r2.getX()
            r2.getY()
            r2.getWidth()
            r2.getHeight()
            int r7 = r2.getVisibility()
            r3.L = r7
            int r7 = r2.getVisibility()
            if (r7 == 0) goto Lde
            goto Le2
        Lde:
            float r4 = r2.getAlpha()
        Le2:
            r3.X = r4
            float r4 = r2.getElevation()
            r3.Y = r4
            float r4 = r2.getRotation()
            r3.Z = r4
            float r4 = r2.getRotationX()
            r3.d0 = r4
            float r4 = r2.getRotationY()
            r3.A = r4
            float r4 = r2.getScaleX()
            r3.e0 = r4
            float r4 = r2.getScaleY()
            r3.f0 = r4
            float r4 = r2.getPivotX()
            r3.g0 = r4
            float r4 = r2.getPivotY()
            r3.h0 = r4
            float r4 = r2.getTranslationX()
            r3.i0 = r4
            float r4 = r2.getTranslationY()
            r3.j0 = r4
            float r2 = r2.getTranslationZ()
            r3.k0 = r2
            java.util.HashMap r2 = r9.a
            java.lang.Object r2 = r2.get(r6)
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            if (r2 == 0) goto L135
            java.util.ArrayList r3 = r15.w
            r3.addAll(r2)
        L135:
            int r2 = r1.getWidth()
            int r3 = r1.getHeight()
            long r6 = java.lang.System.nanoTime()
            r15.g(r6, r2, r3)
            xp7 r13 = new xp7
            int r2 = r0.h
            int r3 = r0.i
            int r4 = r0.b
            android.content.Context r1 = r1.getContext()
            int r6 = r0.l
            r7 = -2
            if (r6 == r7) goto L19b
            if (r6 == r5) goto L18f
            if (r6 == 0) goto L189
            if (r6 == r12) goto L183
            if (r6 == r10) goto L17d
            r1 = 4
            if (r6 == r1) goto L177
            r1 = 5
            if (r6 == r1) goto L171
            r1 = 6
            if (r6 == r1) goto L169
            r19 = 0
            goto L1a2
        L169:
            android.view.animation.AnticipateInterpolator r8 = new android.view.animation.AnticipateInterpolator
            r8.<init>()
        L16e:
            r19 = r8
            goto L1a2
        L171:
            android.view.animation.OvershootInterpolator r8 = new android.view.animation.OvershootInterpolator
            r8.<init>()
            goto L16e
        L177:
            android.view.animation.BounceInterpolator r8 = new android.view.animation.BounceInterpolator
            r8.<init>()
            goto L16e
        L17d:
            android.view.animation.DecelerateInterpolator r8 = new android.view.animation.DecelerateInterpolator
            r8.<init>()
            goto L16e
        L183:
            android.view.animation.AccelerateInterpolator r8 = new android.view.animation.AccelerateInterpolator
            r8.<init>()
            goto L16e
        L189:
            android.view.animation.AccelerateDecelerateInterpolator r8 = new android.view.animation.AccelerateDecelerateInterpolator
            r8.<init>()
            goto L16e
        L18f:
            java.lang.String r1 = r0.m
            gr1 r1 = defpackage.gr1.c(r1)
            l74 r8 = new l74
            r8.<init>(r1, r10)
            goto L16e
        L19b:
            int r5 = r0.n
            android.view.animation.Interpolator r8 = android.view.animation.AnimationUtils.loadInterpolator(r1, r5)
            goto L16e
        L1a2:
            int r1 = r0.p
            int r0 = r0.q
            r14 = r23
            r21 = r0
            r20 = r1
            r16 = r2
            r17 = r3
            r18 = r4
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21)
            return
        L1b6:
            u11 r10 = r0.g
            if (r7 != r12) goto L1f7
            int[] r7 = r1.getConstraintSetIds()
            r12 = r11
        L1bf:
            int r13 = r7.length
            if (r12 >= r13) goto L1f7
            r13 = r7[r12]
            if (r13 != r2) goto L1c7
            goto L1f3
        L1c7:
            androidx.constraintlayout.motion.widget.b r14 = r1.p0
            if (r14 != 0) goto L1cd
            r13 = 0
            goto L1d1
        L1cd:
            z11 r13 = r14.b(r13)
        L1d1:
            int r14 = r4.length
            r15 = r11
        L1d3:
            if (r15 >= r14) goto L1f3
            r16 = r4[r15]
            int r8 = r16.getId()
            u11 r8 = r13.i(r8)
            if (r10 == 0) goto L1ef
            t11 r11 = r10.h
            if (r11 == 0) goto L1e8
            r11.e(r8)
        L1e8:
            java.util.HashMap r8 = r8.g
            java.util.HashMap r11 = r10.g
            r8.putAll(r11)
        L1ef:
            int r15 = r15 + 1
            r11 = 0
            goto L1d3
        L1f3:
            int r12 = r12 + 1
            r11 = 0
            goto L1bf
        L1f7:
            z11 r7 = new z11
            r7.<init>()
            java.util.HashMap r8 = r7.g
            r8.clear()
            java.util.HashMap r11 = r3.g
            java.util.Set r11 = r11.keySet()
            java.util.Iterator r11 = r11.iterator()
        L20b:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L22a
            java.lang.Object r12 = r11.next()
            java.lang.Integer r12 = (java.lang.Integer) r12
            java.util.HashMap r13 = r3.g
            java.lang.Object r13 = r13.get(r12)
            u11 r13 = (defpackage.u11) r13
            if (r13 != 0) goto L222
            goto L20b
        L222:
            u11 r13 = r13.c()
            r8.put(r12, r13)
            goto L20b
        L22a:
            int r8 = r4.length
            r11 = 0
        L22c:
            if (r11 >= r8) goto L24b
            r12 = r4[r11]
            int r12 = r12.getId()
            u11 r12 = r7.i(r12)
            if (r10 == 0) goto L248
            t11 r13 = r10.h
            if (r13 == 0) goto L241
            r13.e(r12)
        L241:
            java.util.HashMap r12 = r12.g
            java.util.HashMap r13 = r10.g
            r12.putAll(r13)
        L248:
            int r11 = r11 + 1
            goto L22c
        L24b:
            r1.A(r2, r7)
            r7 = 2131428073(0x7f0b02e9, float:1.847778E38)
            r1.A(r7, r3)
            r1.w(r7)
            b84 r3 = new b84
            androidx.constraintlayout.motion.widget.b r7 = r1.p0
            r3.<init>(r7, r2)
            int r2 = r4.length
            r7 = 0
        L260:
            if (r7 >= r2) goto L2bb
            r8 = r4[r7]
            int r10 = r0.h
            if (r10 == r5) goto L270
            r11 = 8
            int r10 = java.lang.Math.max(r10, r11)
            r3.h = r10
        L270:
            int r10 = r0.d
            r3.p = r10
            int r10 = r0.l
            java.lang.String r11 = r0.m
            int r12 = r0.n
            r3.e = r10
            r3.f = r11
            r3.g = r12
            int r8 = r8.getId()
            if (r9 == 0) goto L2b8
            java.util.HashMap r10 = r9.a
            java.lang.Object r10 = r10.get(r6)
            java.util.ArrayList r10 = (java.util.ArrayList) r10
            yg3 r11 = new yg3
            r11.<init>()
            java.util.HashMap r12 = new java.util.HashMap
            r12.<init>()
            r11.a = r12
            int r12 = r10.size()
            r13 = 0
        L29f:
            if (r13 >= r12) goto L2b3
            java.lang.Object r14 = r10.get(r13)
            int r13 = r13 + 1
            jg3 r14 = (defpackage.jg3) r14
            jg3 r14 = r14.b()
            r14.b = r8
            r11.b(r14)
            goto L29f
        L2b3:
            java.util.ArrayList r8 = r3.k
            r8.add(r11)
        L2b8:
            int r7 = r7 + 1
            goto L260
        L2bb:
            r1.setTransition(r3)
            q64 r2 = new q64
            r3 = 13
            r2.<init>(r3, r0, r4)
            r0 = 1065353216(0x3f800000, float:1.0)
            r1.p(r0)
            r1.k1 = r2
            return
    }

    public final boolean b(android.view.View r5) {
            r4 = this;
            int r0 = r4.r
            r1 = 0
            r2 = 1
            r3 = -1
            if (r0 != r3) goto L9
        L7:
            r0 = r2
            goto L11
        L9:
            java.lang.Object r0 = r5.getTag(r0)
            if (r0 == 0) goto L10
            goto L7
        L10:
            r0 = r1
        L11:
            int r4 = r4.s
            if (r4 != r3) goto L17
        L15:
            r4 = r2
            goto L1f
        L17:
            java.lang.Object r4 = r5.getTag(r4)
            if (r4 != 0) goto L1e
            goto L15
        L1e:
            r4 = r1
        L1f:
            if (r0 == 0) goto L24
            if (r4 == 0) goto L24
            return r2
        L24:
            return r1
    }

    public final boolean c(android.view.View r5) {
            r4 = this;
            r0 = 0
            if (r5 != 0) goto L4
            return r0
        L4:
            int r1 = r4.j
            r2 = -1
            if (r1 != r2) goto Le
            java.lang.String r1 = r4.k
            if (r1 != 0) goto Le
            return r0
        Le:
            boolean r1 = r4.b(r5)
            if (r1 != 0) goto L15
            return r0
        L15:
            int r1 = r5.getId()
            int r2 = r4.j
            r3 = 1
            if (r1 != r2) goto L1f
            return r3
        L1f:
            java.lang.String r1 = r4.k
            if (r1 != 0) goto L24
            return r0
        L24:
            android.view.ViewGroup$LayoutParams r1 = r5.getLayoutParams()
            boolean r1 = r1 instanceof defpackage.o11
            if (r1 == 0) goto L3f
            android.view.ViewGroup$LayoutParams r5 = r5.getLayoutParams()
            o11 r5 = (defpackage.o11) r5
            java.lang.String r5 = r5.Y
            if (r5 == 0) goto L3f
            java.lang.String r4 = r4.k
            boolean r4 = r5.matches(r4)
            if (r4 == 0) goto L3f
            return r3
        L3f:
            return r0
    }

    public final void d(android.content.Context r8, android.content.res.XmlResourceParser r9) {
            r7 = this;
            android.util.AttributeSet r9 = android.util.Xml.asAttributeSet(r9)
            int[] r0 = defpackage.e75.v
            android.content.res.TypedArray r8 = r8.obtainStyledAttributes(r9, r0)
            int r9 = r8.getIndexCount()
            r0 = 0
        Lf:
            if (r0 >= r9) goto L134
            int r1 = r8.getIndex(r0)
            if (r1 != 0) goto L21
            int r2 = r7.a
            int r1 = r8.getResourceId(r1, r2)
            r7.a = r1
            goto L130
        L21:
            r2 = 8
            r3 = 3
            r4 = -1
            if (r1 != r2) goto L57
            boolean r2 = androidx.constraintlayout.motion.widget.MotionLayout.t1
            if (r2 == 0) goto L3d
            int r2 = r7.j
            int r2 = r8.getResourceId(r1, r2)
            r7.j = r2
            if (r2 != r4) goto L130
            java.lang.String r1 = r8.getString(r1)
            r7.k = r1
            goto L130
        L3d:
            android.util.TypedValue r2 = r8.peekValue(r1)
            int r2 = r2.type
            if (r2 != r3) goto L4d
            java.lang.String r1 = r8.getString(r1)
            r7.k = r1
            goto L130
        L4d:
            int r2 = r7.j
            int r1 = r8.getResourceId(r1, r2)
            r7.j = r1
            goto L130
        L57:
            r2 = 9
            if (r1 != r2) goto L65
            int r2 = r7.b
            int r1 = r8.getInt(r1, r2)
            r7.b = r1
            goto L130
        L65:
            r2 = 12
            if (r1 != r2) goto L73
            boolean r2 = r7.c
            boolean r1 = r8.getBoolean(r1, r2)
            r7.c = r1
            goto L130
        L73:
            r2 = 10
            if (r1 != r2) goto L81
            int r2 = r7.d
            int r1 = r8.getInt(r1, r2)
            r7.d = r1
            goto L130
        L81:
            r2 = 4
            if (r1 != r2) goto L8e
            int r2 = r7.h
            int r1 = r8.getInt(r1, r2)
            r7.h = r1
            goto L130
        L8e:
            r2 = 13
            if (r1 != r2) goto L9c
            int r2 = r7.i
            int r1 = r8.getInt(r1, r2)
            r7.i = r1
            goto L130
        L9c:
            r2 = 14
            if (r1 != r2) goto Laa
            int r2 = r7.e
            int r1 = r8.getInt(r1, r2)
            r7.e = r1
            goto L130
        Laa:
            r2 = 7
            r5 = 1
            if (r1 != r2) goto Lea
            android.util.TypedValue r2 = r8.peekValue(r1)
            int r2 = r2.type
            r6 = -2
            if (r2 != r5) goto Lc3
            int r1 = r8.getResourceId(r1, r4)
            r7.n = r1
            if (r1 == r4) goto L130
            r7.l = r6
            goto L130
        Lc3:
            if (r2 != r3) goto Le1
            java.lang.String r2 = r8.getString(r1)
            r7.m = r2
            if (r2 == 0) goto Lde
            java.lang.String r3 = "/"
            int r2 = r2.indexOf(r3)
            if (r2 <= 0) goto Lde
            int r1 = r8.getResourceId(r1, r4)
            r7.n = r1
            r7.l = r6
            goto L130
        Lde:
            r7.l = r4
            goto L130
        Le1:
            int r2 = r7.l
            int r1 = r8.getInteger(r1, r2)
            r7.l = r1
            goto L130
        Lea:
            r2 = 11
            if (r1 != r2) goto Lf7
            int r2 = r7.p
            int r1 = r8.getResourceId(r1, r2)
            r7.p = r1
            goto L130
        Lf7:
            if (r1 != r3) goto L102
            int r2 = r7.q
            int r1 = r8.getResourceId(r1, r2)
            r7.q = r1
            goto L130
        L102:
            r2 = 6
            if (r1 != r2) goto L10e
            int r2 = r7.r
            int r1 = r8.getResourceId(r1, r2)
            r7.r = r1
            goto L130
        L10e:
            r2 = 5
            if (r1 != r2) goto L11a
            int r2 = r7.s
            int r1 = r8.getResourceId(r1, r2)
            r7.s = r1
            goto L130
        L11a:
            r2 = 2
            if (r1 != r2) goto L126
            int r2 = r7.u
            int r1 = r8.getResourceId(r1, r2)
            r7.u = r1
            goto L130
        L126:
            if (r1 != r5) goto L130
            int r2 = r7.t
            int r1 = r8.getInteger(r1, r2)
            r7.t = r1
        L130:
            int r0 = r0 + 1
            goto Lf
        L134:
            r8.recycle()
            return
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "ViewTransition("
            r0.<init>(r1)
            android.content.Context r1 = r2.o
            int r2 = r2.a
            java.lang.String r2 = defpackage.lb4.x(r1, r2)
            r0.append(r2)
            java.lang.String r2 = ")"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
