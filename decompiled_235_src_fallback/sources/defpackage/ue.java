package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ue  reason: default package */
/* loaded from: classes.dex */
public final class ue extends defpackage.os0 {
    public final /* synthetic */ int Y;
    public final /* synthetic */ defpackage.b2 Z;

    public /* synthetic */ ue(defpackage.b2 r1, int r2) {
            r0 = this;
            r0.Y = r2
            r0.Z = r1
            r1 = 4
            r0.<init>(r1)
            return
    }

    private final defpackage.v2 y0(int r45) {
            r44 = this;
            r0 = r44
            r1 = r45
            b2 r0 = r0.Z
            ze r0 = (defpackage.ze) r0
            android.view.accessibility.AccessibilityManager r2 = r0.Z
            te r3 = r0.R
            mx0 r4 = r3.getComposeViewContext()
            hu3 r4 = r4.c
            ut3 r4 = r4.getLifecycle()
            tt3 r4 = r4.b()
            tt3 r5 = defpackage.tt3.DESTROYED
            if (r4 != r5) goto L33
            boolean r2 = r2.isEnabled()
            if (r2 != 0) goto L2e
            android.view.accessibility.AccessibilityNodeInfo r2 = android.view.accessibility.AccessibilityNodeInfo.obtain()
            v2 r6 = new v2
            r6.<init>(r2)
            goto L2f
        L2e:
            r6 = 0
        L2f:
            r11 = r0
            r4 = r1
            goto Lce7
        L33:
            g93 r4 = r0.s()
            java.lang.Object r4 = r4.b(r1)
            za6 r4 = (defpackage.za6) r4
            if (r4 != 0) goto L4f
            boolean r2 = r2.isEnabled()
            if (r2 != 0) goto L2e
            android.view.accessibility.AccessibilityNodeInfo r2 = android.view.accessibility.AccessibilityNodeInfo.obtain()
            v2 r6 = new v2
            r6.<init>(r2)
            goto L2f
        L4f:
            xa6 r5 = r4.a
            ta6 r7 = r5.k()
            sm3 r8 = r5.c
            fb6 r9 = defpackage.bb6.o
            ja4 r7 = r7.A
            java.lang.Object r7 = r7.g(r9)
            if (r7 != 0) goto L62
            r7 = 0
        L62:
            java.lang.Boolean r9 = java.lang.Boolean.TRUE
            boolean r7 = defpackage.nb3.k(r7, r9)
            r9 = 34
            if (r7 == 0) goto L7d
            int r11 = android.os.Build.VERSION.SDK_INT
            if (r11 < r9) goto L75
            boolean r11 = defpackage.c2.j(r2)
            goto L76
        L75:
            r11 = 1
        L76:
            if (r11 != 0) goto L7d
            r11 = r0
            r4 = r1
            r6 = 0
            goto Lce7
        L7d:
            android.view.accessibility.AccessibilityNodeInfo r11 = android.view.accessibility.AccessibilityNodeInfo.obtain()
            v2 r12 = new v2
            r12.<init>(r11)
            int r13 = android.os.Build.VERSION.SDK_INT
            if (r13 < r9) goto L8e
            defpackage.c2.l(r11, r7)
            goto L93
        L8e:
            r14 = 64
            r12.h(r14, r7)
        L93:
            r7 = -1
            if (r1 != r7) goto La8
            android.view.ViewParent r14 = r3.getParentForAccessibility()
            boolean r15 = r14 instanceof android.view.View
            if (r15 == 0) goto La1
            android.view.View r14 = (android.view.View) r14
            goto La2
        La1:
            r14 = 0
        La2:
            r12.b = r7
            r11.setParent(r14)
            goto Lce
        La8:
            xa6 r14 = r5.l()
            if (r14 == 0) goto Lb5
            int r14 = r14.f
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            goto Lb6
        Lb5:
            r14 = 0
        Lb6:
            if (r14 == 0) goto Lcf8
            int r14 = r14.intValue()
            ab6 r15 = r3.getSemanticsOwner()
            xa6 r15 = r15.a()
            int r15 = r15.f
            if (r14 != r15) goto Lc9
            r14 = r7
        Lc9:
            r12.b = r14
            r11.setParent(r3, r14)
        Lce:
            r12.c = r1
            r11.setSource(r3, r1)
            android.graphics.Rect r4 = r0.k(r4)
            r11.setBoundsInScreen(r4)
            n94 r4 = r0.F0
            un6 r14 = r0.o0
            android.content.Context r15 = r3.getContext()
            android.content.res.Resources r15 = r15.getResources()
            r44 = 0
            java.lang.String r6 = "android.view.View"
            r12.i(r6)
            ta6 r6 = r5.d
            ja4 r10 = r6.A
            fb6 r7 = defpackage.bb6.G
            boolean r7 = r10.c(r7)
            if (r7 == 0) goto Lfe
            java.lang.String r7 = "android.widget.EditText"
            r12.i(r7)
        Lfe:
            fb6 r7 = defpackage.bb6.C
            boolean r7 = r10.c(r7)
            if (r7 == 0) goto L10b
            java.lang.String r7 = "android.widget.TextView"
            r12.i(r7)
        L10b:
            fb6 r7 = defpackage.bb6.z
            java.lang.Object r7 = r10.g(r7)
            if (r7 != 0) goto L115
            r7 = r44
        L115:
            mq5 r7 = (defpackage.mq5) r7
            if (r7 == 0) goto L170
            int r9 = r7.a
            boolean r18 = r5.o()
            if (r18 != 0) goto L131
            r18 = r2
            r2 = 4
            java.util.List r17 = defpackage.xa6.j(r2, r5)
            boolean r17 = r17.isEmpty()
            r19 = r14
            if (r17 == 0) goto L174
            goto L136
        L131:
            r18 = r2
            r2 = 4
            r19 = r14
        L136:
            java.lang.String r14 = "AccessibilityNodeInfo.roleDescription"
            if (r9 != r2) goto L149
            r2 = 2131952713(0x7f130449, float:1.9541877E38)
            java.lang.String r2 = r15.getString(r2)
            android.os.Bundle r9 = r11.getExtras()
            r9.putCharSequence(r14, r2)
            goto L174
        L149:
            r2 = 2
            if (r9 != r2) goto L15b
            r2 = 2131952697(0x7f130439, float:1.9541844E38)
            java.lang.String r2 = r15.getString(r2)
            android.os.Bundle r9 = r11.getExtras()
            r9.putCharSequence(r14, r2)
            goto L174
        L15b:
            java.lang.String r2 = defpackage.ln2.d0(r9)
            r14 = 5
            if (r9 != r14) goto L16c
            boolean r9 = r5.q()
            if (r9 != 0) goto L16c
            boolean r9 = r6.L
            if (r9 == 0) goto L174
        L16c:
            r12.i(r2)
            goto L174
        L170:
            r18 = r2
            r19 = r14
        L174:
            android.content.Context r2 = r3.getContext()
            java.lang.String r2 = r2.getPackageName()
            r11.setPackageName(r2)
            boolean r2 = defpackage.u24.w(r5)
            r11.setImportantForAccessibility(r2)
            r2 = 34
            if (r13 < r2) goto L190
            boolean r2 = defpackage.c2.j(r18)
        L18e:
            r9 = 4
            goto L192
        L190:
            r2 = 1
            goto L18e
        L192:
            java.util.List r13 = defpackage.xa6.j(r9, r5)
            int r9 = r13.size()
            r18 = r2
            r20 = r8
            r2 = 0
            r14 = 0
        L1a0:
            android.view.accessibility.AccessibilityNodeInfo r8 = r12.a
            if (r14 >= r9) goto L212
            java.lang.Object r21 = r13.get(r14)
            r22 = r9
            r9 = r21
            xa6 r9 = (defpackage.xa6) r9
            r21 = r13
            g93 r13 = r0.s()
            r23 = r14
            int r14 = r9.f
            boolean r13 = r13.a(r14)
            if (r13 == 0) goto L20b
            zm r13 = r3.getAndroidViewsHandler$ui()
            java.util.HashMap r13 = r13.getLayoutNodeToHolder()
            sm3 r9 = r9.c
            java.lang.Object r9 = r13.get(r9)
            if (r9 != 0) goto L207
            r9 = -1
            if (r14 != r9) goto L1d2
            goto L20b
        L1d2:
            g93 r9 = r0.s()
            java.lang.Object r9 = r9.b(r14)
            za6 r9 = (defpackage.za6) r9
            if (r9 == 0) goto L1f9
            xa6 r9 = r9.a
            if (r9 == 0) goto L1f9
            ta6 r9 = r9.k()
            fb6 r13 = defpackage.bb6.o
            ja4 r9 = r9.A
            java.lang.Object r9 = r9.g(r13)
            if (r9 != 0) goto L1f2
            r9 = r44
        L1f2:
            java.lang.Boolean r13 = java.lang.Boolean.TRUE
            boolean r9 = defpackage.nb3.k(r9, r13)
            goto L1fa
        L1f9:
            r9 = 0
        L1fa:
            if (r18 != 0) goto L1fe
            if (r9 != 0) goto L201
        L1fe:
            r8.addChild(r3, r14)
        L201:
            r4.f(r14, r2)
            int r2 = r2 + 1
            goto L20b
        L207:
            defpackage.u34.a()
            return r44
        L20b:
            int r14 = r23 + 1
            r13 = r21
            r9 = r22
            goto L1a0
        L212:
            int r2 = r0.g0
            if (r1 != r2) goto L220
            r2 = 1
            r8.setAccessibilityFocused(r2)
            p2 r2 = defpackage.p2.g
            r12.b(r2)
            goto L229
        L220:
            r2 = 0
            r8.setAccessibilityFocused(r2)
            p2 r2 = defpackage.p2.f
            r12.b(r2)
        L229:
            fp r2 = defpackage.n16.B(r5)
            if (r2 == 0) goto L493
            r3.getFontFamilyResolver()
            qh1 r24 = r3.getDensity()
            m44 r9 = r0.B0
            android.text.SpannableString r13 = new android.text.SpannableString
            java.lang.String r14 = r2.B
            r18 = r3
            java.util.List r3 = r2.A
            r13.<init>(r14)
            r27 = r14
            java.util.ArrayList r14 = r2.L
            r28 = r0
            if (r14 == 0) goto L34c
            int r0 = r14.size()
            r29 = r4
            r4 = 0
        L252:
            if (r4 >= r0) goto L33d
            java.lang.Object r21 = r14.get(r4)
            r30 = r0
            r0 = r21
            ep r0 = (defpackage.ep) r0
            r31 = r4
            java.lang.Object r4 = r0.a
            nn6 r4 = (defpackage.nn6) r4
            r32 = r14
            int r14 = r0.b
            int r0 = r0.c
            e37 r1 = r4.a
            r33 = r6
            r34 = r7
            long r6 = r1.b()
            r35 = r10
            r1 = r11
            long r10 = r4.b
            r36 = r1
            oj2 r1 = r4.c
            r37 = r1
            ij2 r1 = r4.d
            r22 = r10
            f37 r10 = r4.j
            gy3 r11 = r4.k
            r38 = r8
            r39 = r9
            long r8 = r4.l
            r40 = r8
            b17 r8 = r4.m
            e37 r4 = r4.a
            r21 = r4
            r9 = r5
            long r4 = r21.b()
            boolean r4 = defpackage.kt0.d(r6, r4)
            r42 = 16
            if (r4 == 0) goto L2a5
            r4 = r21
            goto L2b1
        L2a5:
            int r4 = (r6 > r42 ? 1 : (r6 == r42 ? 0 : -1))
            if (r4 == 0) goto L2af
            st0 r4 = new st0
            r4.<init>(r6)
            goto L2b1
        L2af:
            d37 r4 = defpackage.d37.a
        L2b1:
            long r4 = r4.b()
            defpackage.hi2.M(r13, r4, r14, r0)
            r26 = r0
            r21 = r13
            r25 = r14
            defpackage.hi2.N(r21, r22, r24, r25, r26)
            r0 = r21
            r4 = r25
            r5 = r26
            if (r37 != 0) goto L2cf
            if (r1 == 0) goto L2cc
            goto L2cf
        L2cc:
            r1 = 33
            goto L2ea
        L2cf:
            if (r37 != 0) goto L2d4
            oj2 r6 = defpackage.oj2.Y
            goto L2d6
        L2d4:
            r6 = r37
        L2d6:
            if (r1 == 0) goto L2db
            int r1 = r1.a
            goto L2dc
        L2db:
            r1 = 0
        L2dc:
            android.text.style.StyleSpan r7 = new android.text.style.StyleSpan
            int r1 = defpackage.vy7.j0(r1, r6)
            r7.<init>(r1)
            r1 = 33
            r0.setSpan(r7, r4, r5, r1)
        L2ea:
            if (r8 == 0) goto L306
            int r6 = r8.a
            r7 = r6 | 1
            if (r7 != r6) goto L2fa
            android.text.style.UnderlineSpan r7 = new android.text.style.UnderlineSpan
            r7.<init>()
            r0.setSpan(r7, r4, r5, r1)
        L2fa:
            r7 = r6 | 2
            if (r7 != r6) goto L306
            android.text.style.StrikethroughSpan r6 = new android.text.style.StrikethroughSpan
            r6.<init>()
            r0.setSpan(r6, r4, r5, r1)
        L306:
            if (r10 == 0) goto L312
            android.text.style.ScaleXSpan r6 = new android.text.style.ScaleXSpan
            float r7 = r10.a
            r6.<init>(r7)
            r0.setSpan(r6, r4, r5, r1)
        L312:
            defpackage.hi2.O(r0, r11, r4, r5)
            int r6 = (r40 > r42 ? 1 : (r40 == r42 ? 0 : -1))
            if (r6 == 0) goto L325
            android.text.style.BackgroundColorSpan r6 = new android.text.style.BackgroundColorSpan
            int r7 = defpackage.hv.b0(r40)
            r6.<init>(r7)
            r0.setSpan(r6, r4, r5, r1)
        L325:
            int r4 = r31 + 1
            r1 = r45
            r13 = r0
            r5 = r9
            r0 = r30
            r14 = r32
            r6 = r33
            r7 = r34
            r10 = r35
            r11 = r36
            r8 = r38
            r9 = r39
            goto L252
        L33d:
            r33 = r6
            r34 = r7
            r38 = r8
            r39 = r9
            r35 = r10
            r36 = r11
            r0 = r13
            r9 = r5
            goto L34f
        L34c:
            r29 = r4
            goto L33d
        L34f:
            int r1 = r27.length()
            yt1 r4 = defpackage.yt1.A
            if (r3 == 0) goto L385
            java.util.ArrayList r5 = new java.util.ArrayList
            int r6 = r3.size()
            r5.<init>(r6)
            int r6 = r3.size()
            r7 = 0
        L365:
            if (r7 >= r6) goto L386
            java.lang.Object r8 = r3.get(r7)
            r10 = r8
            ep r10 = (defpackage.ep) r10
            java.lang.Object r11 = r10.a
            boolean r11 = r11 instanceof defpackage.ul7
            if (r11 == 0) goto L382
            int r11 = r10.b
            int r10 = r10.c
            r13 = 0
            boolean r10 = defpackage.gp.b(r13, r1, r11, r10)
            if (r10 == 0) goto L382
            r5.add(r8)
        L382:
            int r7 = r7 + 1
            goto L365
        L385:
            r5 = r4
        L386:
            int r1 = r5.size()
            r6 = 0
        L38b:
            if (r6 >= r1) goto L3b6
            java.lang.Object r7 = r5.get(r6)
            ep r7 = (defpackage.ep) r7
            java.lang.Object r8 = r7.a
            ul7 r8 = (defpackage.ul7) r8
            int r10 = r7.b
            int r7 = r7.c
            boolean r11 = r8 instanceof defpackage.ul7
            if (r11 == 0) goto L3b2
            android.text.style.TtsSpan$VerbatimBuilder r11 = new android.text.style.TtsSpan$VerbatimBuilder
            java.lang.String r8 = r8.a
            r11.<init>(r8)
            android.text.style.TtsSpan r8 = r11.build()
            r11 = 33
            r0.setSpan(r8, r10, r7, r11)
            int r6 = r6 + 1
            goto L38b
        L3b2:
            defpackage.i.d()
            return r44
        L3b6:
            int r1 = r27.length()
            if (r3 == 0) goto L3ea
            java.util.ArrayList r4 = new java.util.ArrayList
            int r5 = r3.size()
            r4.<init>(r5)
            int r5 = r3.size()
            r6 = 0
        L3ca:
            if (r6 >= r5) goto L3ea
            java.lang.Object r7 = r3.get(r6)
            r8 = r7
            ep r8 = (defpackage.ep) r8
            java.lang.Object r10 = r8.a
            boolean r10 = r10 instanceof defpackage.zh7
            if (r10 == 0) goto L3e7
            int r10 = r8.b
            int r8 = r8.c
            r13 = 0
            boolean r8 = defpackage.gp.b(r13, r1, r10, r8)
            if (r8 == 0) goto L3e7
            r4.add(r7)
        L3e7:
            int r6 = r6 + 1
            goto L3ca
        L3ea:
            int r1 = r4.size()
            r3 = 0
        L3ef:
            if (r3 >= r1) goto L421
            java.lang.Object r5 = r4.get(r3)
            ep r5 = (defpackage.ep) r5
            java.lang.Object r6 = r5.a
            zh7 r6 = (defpackage.zh7) r6
            int r7 = r5.b
            int r5 = r5.c
            r8 = r39
            java.lang.Object r10 = r8.B
            java.util.WeakHashMap r10 = (java.util.WeakHashMap) r10
            java.lang.Object r11 = r10.get(r6)
            if (r11 != 0) goto L415
            android.text.style.URLSpan r11 = new android.text.style.URLSpan
            java.lang.String r13 = r6.a
            r11.<init>(r13)
            r10.put(r6, r11)
        L415:
            android.text.style.URLSpan r11 = (android.text.style.URLSpan) r11
            r6 = 33
            r0.setSpan(r11, r7, r5, r6)
            int r3 = r3 + 1
            r39 = r8
            goto L3ef
        L421:
            r8 = r39
            int r1 = r27.length()
            java.util.List r1 = r2.a(r1)
            int r2 = r1.size()
            r3 = 0
        L430:
            if (r3 >= r2) goto L48c
            java.lang.Object r4 = r1.get(r3)
            ep r4 = (defpackage.ep) r4
            int r5 = r4.b
            java.lang.Object r6 = r4.a
            int r7 = r4.c
            if (r5 == r7) goto L487
            r10 = r6
            pv3 r10 = (defpackage.pv3) r10
            boolean r11 = r10 instanceof defpackage.ov3
            if (r11 == 0) goto L46d
            ep r4 = new ep
            r6.getClass()
            ov3 r6 = (defpackage.ov3) r6
            r4.<init>(r6, r5, r7)
            java.lang.Object r10 = r8.L
            java.util.WeakHashMap r10 = (java.util.WeakHashMap) r10
            java.lang.Object r11 = r10.get(r4)
            if (r11 != 0) goto L465
            android.text.style.URLSpan r11 = new android.text.style.URLSpan
            java.lang.String r6 = r6.a
            r11.<init>(r6)
            r10.put(r4, r11)
        L465:
            android.text.style.URLSpan r11 = (android.text.style.URLSpan) r11
            r6 = 33
            r0.setSpan(r11, r5, r7, r6)
            goto L489
        L46d:
            java.lang.Object r6 = r8.R
            java.util.WeakHashMap r6 = (java.util.WeakHashMap) r6
            java.lang.Object r11 = r6.get(r4)
            if (r11 != 0) goto L47f
            qw0 r11 = new qw0
            r11.<init>(r10)
            r6.put(r4, r11)
        L47f:
            android.text.style.ClickableSpan r11 = (android.text.style.ClickableSpan) r11
            r6 = 33
            r0.setSpan(r11, r5, r7, r6)
            goto L489
        L487:
            r6 = 33
        L489:
            int r3 = r3 + 1
            goto L430
        L48c:
            java.lang.CharSequence r0 = defpackage.ze.P(r0)
            android.text.SpannableString r0 = (android.text.SpannableString) r0
            goto L4a6
        L493:
            r28 = r0
            r18 = r3
            r29 = r4
            r9 = r5
            r33 = r6
            r34 = r7
            r38 = r8
            r35 = r10
            r36 = r11
            r0 = r44
        L4a6:
            r12.m(r0)
            fb6 r0 = defpackage.bb6.M
            r1 = r35
            boolean r2 = r1.c(r0)
            if (r2 == 0) goto L4c9
            r2 = r36
            r3 = 1
            r2.setContentInvalid(r3)
            java.lang.Object r0 = r1.g(r0)
            if (r0 != 0) goto L4c1
            r0 = r44
        L4c1:
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r3 = r38
            r3.setError(r0)
            goto L4cd
        L4c9:
            r2 = r36
            r3 = r38
        L4cd:
            java.lang.String r0 = defpackage.n16.A(r9, r15)
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 30
            if (r4 < r5) goto L4db
            defpackage.q2.l(r3, r0)
            goto L4e4
        L4db:
            android.os.Bundle r4 = r3.getExtras()
            java.lang.String r5 = "androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY"
            r4.putCharSequence(r5, r0)
        L4e4:
            boolean r0 = defpackage.n16.z(r9)
            r3.setCheckable(r0)
            fb6 r0 = defpackage.bb6.K
            java.lang.Object r0 = r1.g(r0)
            if (r0 != 0) goto L4f5
            r0 = r44
        L4f5:
            a87 r0 = (defpackage.a87) r0
            if (r0 == 0) goto L50a
            a87 r4 = defpackage.a87.On
            if (r0 != r4) goto L502
            r4 = 1
            r3.setChecked(r4)
            goto L50a
        L502:
            a87 r4 = defpackage.a87.Off
            if (r0 != r4) goto L50a
            r13 = 0
            r3.setChecked(r13)
        L50a:
            fb6 r0 = defpackage.bb6.J
            java.lang.Object r0 = r1.g(r0)
            if (r0 != 0) goto L514
            r0 = r44
        L514:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            if (r0 == 0) goto L533
            boolean r0 = r0.booleanValue()
            if (r34 != 0) goto L522
            r7 = r34
            r5 = 4
            goto L52d
        L522:
            r7 = r34
            int r4 = r7.a
            r5 = 4
            if (r4 != r5) goto L52d
            r2.setSelected(r0)
            goto L530
        L52d:
            r3.setChecked(r0)
        L530:
            r0 = r33
            goto L537
        L533:
            r7 = r34
            r5 = 4
            goto L530
        L537:
            boolean r4 = r0.L
            if (r4 == 0) goto L545
            java.util.List r4 = defpackage.xa6.j(r5, r9)
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L55f
        L545:
            fb6 r4 = defpackage.bb6.a
            java.lang.Object r4 = r1.g(r4)
            if (r4 != 0) goto L54f
            r4 = r44
        L54f:
            java.util.List r4 = (java.util.List) r4
            if (r4 == 0) goto L55a
            java.lang.Object r4 = defpackage.gt0.J0(r4)
            java.lang.String r4 = (java.lang.String) r4
            goto L55c
        L55a:
            r4 = r44
        L55c:
            r3.setContentDescription(r4)
        L55f:
            fb6 r4 = defpackage.bb6.A
            java.lang.Object r4 = r1.g(r4)
            if (r4 != 0) goto L569
            r4 = r44
        L569:
            java.lang.String r4 = (java.lang.String) r4
            if (r4 == 0) goto L592
            r5 = r9
        L56e:
            if (r5 == 0) goto L58c
            ta6 r6 = r5.d
            fb6 r8 = defpackage.cb6.a
            ja4 r10 = r6.A
            boolean r10 = r10.c(r8)
            if (r10 == 0) goto L587
            java.lang.Object r5 = r6.c(r8)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            goto L58d
        L587:
            xa6 r5 = r5.l()
            goto L56e
        L58c:
            r5 = 0
        L58d:
            if (r5 == 0) goto L592
            r2.setViewIdResourceName(r4)
        L592:
            fb6 r4 = defpackage.bb6.h
            java.lang.Object r4 = r1.g(r4)
            if (r4 != 0) goto L59c
            r4 = r44
        L59c:
            jg7 r4 = (defpackage.jg7) r4
            r5 = 28
            if (r4 == 0) goto L5b0
            int r4 = android.os.Build.VERSION.SDK_INT
            if (r4 < r5) goto L5ab
            r4 = 1
            defpackage.j2.A(r3, r4)
            goto L5b0
        L5ab:
            r4 = 1
            r6 = 2
            r12.h(r6, r4)
        L5b0:
            fb6 r4 = defpackage.bb6.i
            java.lang.Object r4 = r1.g(r4)
            if (r4 != 0) goto L5ba
            r4 = r44
        L5ba:
            jg7 r4 = (defpackage.jg7) r4
            r6 = 29
            if (r4 == 0) goto L5ce
            int r4 = android.os.Build.VERSION.SDK_INT
            if (r4 < r6) goto L5c8
            defpackage.l2.d(r2)
            goto L5ce
        L5c8:
            r4 = 8
            r8 = 1
            r12.h(r4, r8)
        L5ce:
            r4 = r45
            r8 = -1
            if (r4 == r8) goto L5e8
            int r10 = r9.f
            r11 = r29
            int r10 = r11.d(r10)
            if (r10 == r8) goto L5e1
            r2.setDrawingOrder(r10)
            goto L5e8
        L5e1:
            java.lang.String r8 = "AccessibilityDelegate"
            java.lang.String r10 = "Drawing order is not available, was AccessibilityNodeInfo requested for a child node before its parent?"
            android.util.Log.w(r8, r10)
        L5e8:
            fb6 r8 = defpackage.bb6.L
            boolean r8 = r1.c(r8)
            r2.setPassword(r8)
            fb6 r8 = defpackage.bb6.O
            java.lang.Object r8 = r1.g(r8)
            if (r8 != 0) goto L5fb
            r8 = r44
        L5fb:
            java.lang.Boolean r10 = java.lang.Boolean.TRUE
            boolean r8 = defpackage.nb3.k(r8, r10)
            r2.setEditable(r8)
            fb6 r8 = defpackage.bb6.P
            java.lang.Object r8 = r1.g(r8)
            if (r8 != 0) goto L60e
            r8 = r44
        L60e:
            java.lang.Integer r8 = (java.lang.Integer) r8
            if (r8 == 0) goto L617
            int r8 = r8.intValue()
            goto L618
        L617:
            r8 = -1
        L618:
            r3.setMaxTextLength(r8)
            boolean r8 = defpackage.n16.i(r9)
            r3.setEnabled(r8)
            fb6 r8 = defpackage.bb6.l
            boolean r11 = r1.c(r8)
            r3.setFocusable(r11)
            boolean r11 = r2.isFocusable()
            if (r11 == 0) goto L655
            java.lang.Object r11 = r0.c(r8)
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            r3.setFocused(r11)
            boolean r11 = r2.isFocused()
            if (r11 == 0) goto L64e
            r11 = 2
            r12.a(r11)
            r11 = r28
            r11.h0 = r4
        L64c:
            r13 = 1
            goto L658
        L64e:
            r11 = r28
            r13 = 1
            r12.a(r13)
            goto L658
        L655:
            r11 = r28
            goto L64c
        L658:
            boolean r14 = defpackage.u24.v(r9)
            r14 = r14 ^ r13
            r3.setVisibleToUser(r14)
            boolean r13 = r9.o()
            if (r13 == 0) goto L66e
            xa6 r13 = r9.l()
            r13.getClass()
            goto L66f
        L66e:
            r13 = r9
        L66f:
            of5 r13 = r13.m()
            boolean r13 = r13.f()
            if (r13 == 0) goto L67d
            r13 = 0
            r3.setVisibleToUser(r13)
        L67d:
            fb6 r13 = defpackage.bb6.k
            java.lang.Object r13 = r1.g(r13)
            if (r13 != 0) goto L687
            r13 = r44
        L687:
            rx3 r13 = (defpackage.rx3) r13
            if (r13 == 0) goto L68f
            r13 = 1
            r2.setLiveRegion(r13)
        L68f:
            r13 = 0
            r3.setClickable(r13)
            fb6 r13 = defpackage.sa6.b
            java.lang.Object r13 = r1.g(r13)
            if (r13 != 0) goto L69d
            r13 = r44
        L69d:
            y1 r13 = (defpackage.y1) r13
            if (r13 == 0) goto L6e8
            fb6 r6 = defpackage.bb6.J
            java.lang.Object r6 = r1.g(r6)
            if (r6 != 0) goto L6ab
            r6 = r44
        L6ab:
            boolean r6 = defpackage.nb3.k(r6, r10)
            if (r7 != 0) goto L6b2
            goto L6b8
        L6b2:
            int r14 = r7.a
            r5 = 4
            if (r14 != r5) goto L6b8
            goto L6c0
        L6b8:
            if (r7 != 0) goto L6bb
            goto L6c2
        L6bb:
            int r5 = r7.a
            r7 = 3
            if (r5 != r7) goto L6c2
        L6c0:
            r5 = 1
            goto L6c3
        L6c2:
            r5 = 0
        L6c3:
            if (r5 == 0) goto L6cc
            if (r5 == 0) goto L6ca
            if (r6 != 0) goto L6ca
            goto L6cc
        L6ca:
            r5 = 0
            goto L6cd
        L6cc:
            r5 = 1
        L6cd:
            r3.setClickable(r5)
            boolean r5 = defpackage.n16.i(r9)
            if (r5 == 0) goto L6e8
            boolean r5 = r2.isClickable()
            if (r5 == 0) goto L6e8
            p2 r5 = new p2
            java.lang.String r6 = r13.a
            r7 = 16
            r5.<init>(r7, r6)
            r12.b(r5)
        L6e8:
            r13 = 0
            r3.setLongClickable(r13)
            fb6 r5 = defpackage.sa6.c
            java.lang.Object r5 = defpackage.xk2.r(r0, r5)
            y1 r5 = (defpackage.y1) r5
            if (r5 == 0) goto L70c
            r13 = 1
            r3.setLongClickable(r13)
            boolean r6 = defpackage.n16.i(r9)
            if (r6 == 0) goto L70c
            p2 r6 = new p2
            r7 = 32
            java.lang.String r5 = r5.a
            r6.<init>(r7, r5)
            r12.b(r6)
        L70c:
            fb6 r5 = defpackage.sa6.q
            java.lang.Object r5 = defpackage.xk2.r(r0, r5)
            y1 r5 = (defpackage.y1) r5
            if (r5 == 0) goto L722
            p2 r6 = new p2
            r7 = 16384(0x4000, float:2.2959E-41)
            java.lang.String r5 = r5.a
            r6.<init>(r7, r5)
            r12.b(r6)
        L722:
            boolean r5 = defpackage.n16.i(r9)
            if (r5 == 0) goto L7a0
            fb6 r5 = defpackage.sa6.k
            java.lang.Object r5 = defpackage.xk2.r(r0, r5)
            y1 r5 = (defpackage.y1) r5
            if (r5 == 0) goto L73e
            p2 r6 = new p2
            r7 = 2097152(0x200000, float:2.938736E-39)
            java.lang.String r5 = r5.a
            r6.<init>(r7, r5)
            r12.b(r6)
        L73e:
            fb6 r5 = defpackage.sa6.p
            java.lang.Object r5 = defpackage.xk2.r(r0, r5)
            y1 r5 = (defpackage.y1) r5
            if (r5 == 0) goto L755
            p2 r6 = new p2
            r7 = 16908372(0x1020054, float:2.3877464E-38)
            java.lang.String r5 = r5.a
            r6.<init>(r7, r5)
            r12.b(r6)
        L755:
            fb6 r5 = defpackage.sa6.r
            java.lang.Object r5 = defpackage.xk2.r(r0, r5)
            y1 r5 = (defpackage.y1) r5
            if (r5 == 0) goto L76b
            p2 r6 = new p2
            r7 = 65536(0x10000, float:9.1835E-41)
            java.lang.String r5 = r5.a
            r6.<init>(r7, r5)
            r12.b(r6)
        L76b:
            fb6 r5 = defpackage.sa6.s
            java.lang.Object r5 = defpackage.xk2.r(r0, r5)
            y1 r5 = (defpackage.y1) r5
            if (r5 == 0) goto L7a0
            boolean r6 = r2.isFocused()
            if (r6 == 0) goto L7a0
            de r6 = r18.getClipboardManager()
            android.content.ClipboardManager r6 = r6.a()
            android.content.ClipDescription r6 = r6.getPrimaryClipDescription()
            if (r6 == 0) goto L790
            java.lang.String r7 = "text/*"
            boolean r6 = r6.hasMimeType(r7)
            goto L791
        L790:
            r6 = 0
        L791:
            if (r6 == 0) goto L7a0
            p2 r6 = new p2
            r7 = 32768(0x8000, float:4.5918E-41)
            java.lang.String r5 = r5.a
            r6.<init>(r7, r5)
            r12.b(r6)
        L7a0:
            java.lang.String r5 = defpackage.ze.t(r9)
            if (r5 == 0) goto L857
            int r5 = r5.length()
            if (r5 != 0) goto L7ae
            goto L857
        L7ae:
            int r5 = r11.r(r9)
            int r6 = r11.q(r9)
            r2.setTextSelection(r5, r6)
            fb6 r5 = defpackage.sa6.j
            java.lang.Object r5 = defpackage.xk2.r(r0, r5)
            y1 r5 = (defpackage.y1) r5
            p2 r6 = new p2
            if (r5 == 0) goto L7c8
            java.lang.String r5 = r5.a
            goto L7ca
        L7c8:
            r5 = r44
        L7ca:
            r7 = 131072(0x20000, float:1.83671E-40)
            r6.<init>(r7, r5)
            r12.b(r6)
            r5 = 256(0x100, float:3.59E-43)
            r12.a(r5)
            r5 = 512(0x200, float:7.17E-43)
            r12.a(r5)
            r5 = 11
            r3.setMovementGranularities(r5)
            fb6 r5 = defpackage.bb6.a
            java.lang.Object r5 = defpackage.xk2.r(r0, r5)
            java.util.List r5 = (java.util.List) r5
            if (r5 == 0) goto L7f1
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L857
        L7f1:
            fb6 r5 = defpackage.sa6.a
            boolean r5 = r1.c(r5)
            if (r5 == 0) goto L857
            fb6 r5 = defpackage.bb6.G
            boolean r5 = r1.c(r5)
            if (r5 == 0) goto L80c
            java.lang.Object r5 = defpackage.xk2.r(r0, r8)
            boolean r5 = defpackage.nb3.k(r5, r10)
            if (r5 != 0) goto L80c
            goto L857
        L80c:
            sm3 r5 = r20.v()
        L810:
            if (r5 == 0) goto L82d
            ta6 r6 = r5.x()
            if (r6 == 0) goto L828
            boolean r7 = r6.L
            r13 = 1
            if (r7 != r13) goto L828
            fb6 r7 = defpackage.bb6.G
            ja4 r6 = r6.A
            boolean r6 = r6.c(r7)
            if (r6 == 0) goto L828
            goto L82f
        L828:
            sm3 r5 = r5.v()
            goto L810
        L82d:
            r5 = r44
        L82f:
            if (r5 == 0) goto L84e
            ta6 r5 = r5.x()
            if (r5 == 0) goto L84a
            fb6 r6 = defpackage.bb6.l
            ja4 r5 = r5.A
            java.lang.Object r5 = r5.g(r6)
            if (r5 != 0) goto L843
            r5 = r44
        L843:
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            boolean r5 = defpackage.nb3.k(r5, r6)
            goto L84b
        L84a:
            r5 = 0
        L84b:
            if (r5 != 0) goto L84e
            goto L857
        L84e:
            int r5 = r2.getMovementGranularities()
            r5 = r5 | 20
            r3.setMovementGranularities(r5)
        L857:
            int r5 = android.os.Build.VERSION.SDK_INT
            r6 = 26
            if (r5 < r6) goto L8b1
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.lang.String r7 = "androidx.compose.ui.semantics.id"
            r5.add(r7)
            java.lang.CharSequence r7 = r12.g()
            if (r7 == 0) goto L881
            int r7 = r7.length()
            if (r7 != 0) goto L874
            goto L881
        L874:
            fb6 r7 = defpackage.sa6.a
            boolean r7 = r1.c(r7)
            if (r7 == 0) goto L881
            java.lang.String r7 = "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY"
            r5.add(r7)
        L881:
            fb6 r7 = defpackage.bb6.A
            boolean r7 = r1.c(r7)
            if (r7 == 0) goto L88e
            java.lang.String r7 = "androidx.compose.ui.semantics.testTag"
            r5.add(r7)
        L88e:
            fb6 r7 = defpackage.bb6.Q
            boolean r7 = r1.c(r7)
            if (r7 == 0) goto L8aa
            java.lang.String r7 = "androidx.compose.ui.semantics.shapeType"
            r5.add(r7)
            java.lang.String r7 = "androidx.compose.ui.semantics.shapeRect"
            r5.add(r7)
            java.lang.String r7 = "androidx.compose.ui.semantics.shapeCorners"
            r5.add(r7)
            java.lang.String r7 = "androidx.compose.ui.semantics.shapeRegion"
            r5.add(r7)
        L8aa:
            int r7 = android.os.Build.VERSION.SDK_INT
            if (r7 < r6) goto L8b1
            defpackage.k2.v(r2, r5)
        L8b1:
            fb6 r5 = defpackage.bb6.c
            java.lang.Object r0 = defpackage.xk2.r(r0, r5)
            x35 r0 = (defpackage.x35) r0
            if (r0 == 0) goto L938
            float r5 = r0.a
            bs0 r6 = r0.b
            fb6 r7 = defpackage.sa6.i
            boolean r1 = r1.c(r7)
            if (r1 == 0) goto L8cd
            java.lang.String r1 = "android.widget.SeekBar"
            r12.i(r1)
            goto L8d2
        L8cd:
            java.lang.String r1 = "android.widget.ProgressBar"
            r12.i(r1)
        L8d2:
            x35 r1 = defpackage.x35.d
            if (r0 == r1) goto L8e2
            float r0 = r6.a
            float r1 = r6.b
            r13 = 1
            android.view.accessibility.AccessibilityNodeInfo$RangeInfo r0 = android.view.accessibility.AccessibilityNodeInfo.RangeInfo.obtain(r13, r0, r1, r5)
            r2.setRangeInfo(r0)
        L8e2:
            ta6 r0 = r9.n()
            ja4 r0 = r0.A
            boolean r0 = r0.c(r7)
            if (r0 == 0) goto L938
            boolean r0 = defpackage.n16.i(r9)
            if (r0 == 0) goto L938
            java.lang.Comparable r0 = r6.a()
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
            java.lang.Comparable r1 = r6.b()
            java.lang.Number r1 = (java.lang.Number) r1
            float r1 = r1.floatValue()
            int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r2 >= 0) goto L90d
            r0 = r1
        L90d:
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 >= 0) goto L916
            p2 r0 = defpackage.p2.h
            r12.b(r0)
        L916:
            java.lang.Comparable r0 = r6.b()
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
            java.lang.Comparable r1 = r6.a()
            java.lang.Number r1 = (java.lang.Number) r1
            float r1 = r1.floatValue()
            int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r2 <= 0) goto L92f
            r0 = r1
        L92f:
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 <= 0) goto L938
            p2 r0 = defpackage.p2.i
            r12.b(r0)
        L938:
            boolean r0 = defpackage.n16.i(r9)
            if (r0 == 0) goto L95d
            ta6 r0 = r9.d
            fb6 r1 = defpackage.sa6.i
            ja4 r0 = r0.A
            java.lang.Object r0 = r0.g(r1)
            if (r0 != 0) goto L94c
            r0 = r44
        L94c:
            y1 r0 = (defpackage.y1) r0
            if (r0 == 0) goto L95d
            p2 r1 = new p2
            r2 = 16908349(0x102003d, float:2.38774E-38)
            java.lang.String r0 = r0.a
            r1.<init>(r2, r0)
            r12.b(r1)
        L95d:
            defpackage.l.L(r12, r9)
            ta6 r0 = r9.k()
            fb6 r1 = defpackage.bb6.g
            ja4 r0 = r0.A
            java.lang.Object r0 = r0.g(r1)
            if (r0 != 0) goto L970
            r0 = r44
        L970:
            if (r0 != 0) goto La28
            xa6 r0 = r9.l()
            if (r0 != 0) goto L97a
            goto La2b
        L97a:
            ta6 r1 = r0.k()
            fb6 r2 = defpackage.bb6.e
            ja4 r1 = r1.A
            java.lang.Object r1 = r1.g(r2)
            if (r1 != 0) goto L98a
            r1 = r44
        L98a:
            if (r1 == 0) goto La2b
            ta6 r1 = r0.k()
            fb6 r2 = defpackage.bb6.f
            ja4 r1 = r1.A
            java.lang.Object r1 = r1.g(r2)
            if (r1 != 0) goto L99c
            r1 = r44
        L99c:
            bt0 r1 = (defpackage.bt0) r1
            if (r1 == 0) goto L9aa
            int r2 = r1.a
            if (r2 < 0) goto La2b
            int r1 = r1.b
            if (r1 >= 0) goto L9aa
            goto La2b
        L9aa:
            ta6 r1 = r9.k()
            fb6 r2 = defpackage.bb6.J
            ja4 r1 = r1.A
            boolean r1 = r1.c(r2)
            if (r1 != 0) goto L9ba
            goto La2b
        L9ba:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r5 = 4
            java.util.List r0 = defpackage.xa6.j(r5, r0)
            int r2 = r0.size()
            r5 = 0
            r6 = 0
        L9ca:
            if (r5 >= r2) goto L9f6
            java.lang.Object r7 = r0.get(r5)
            xa6 r7 = (defpackage.xa6) r7
            ta6 r8 = r7.k()
            fb6 r10 = defpackage.bb6.J
            ja4 r8 = r8.A
            boolean r8 = r8.c(r10)
            if (r8 == 0) goto L9f3
            r1.add(r7)
            sm3 r7 = r7.c
            int r7 = r7.w()
            sm3 r8 = r9.c
            int r8 = r8.w()
            if (r7 >= r8) goto L9f3
            int r6 = r6 + 1
        L9f3:
            int r5 = r5 + 1
            goto L9ca
        L9f6:
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto La2b
            boolean r0 = defpackage.l.l(r1)
            if (r0 == 0) goto La04
            r1 = 0
            goto La05
        La04:
            r1 = r6
        La05:
            if (r0 == 0) goto La08
            goto La09
        La08:
            r6 = 0
        La09:
            ta6 r0 = r9.k()
            fb6 r2 = defpackage.bb6.J
            ja4 r0 = r0.A
            java.lang.Object r0 = r0.g(r2)
            if (r0 != 0) goto La19
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
        La19:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r13 = 1
            u2 r0 = defpackage.u2.b(r0, r1, r13, r6, r13)
            r12.k(r0)
            goto La2b
        La28:
            defpackage.u34.a()
        La2b:
            ta6 r0 = r9.n()
            fb6 r1 = defpackage.bb6.v
            java.lang.Object r0 = defpackage.xk2.r(r0, r1)
            e76 r0 = (defpackage.e76) r0
            ta6 r1 = r9.n()
            fb6 r2 = defpackage.sa6.d
            java.lang.Object r1 = defpackage.xk2.r(r1, r2)
            y1 r1 = (defpackage.y1) r1
            r2 = 0
            if (r0 == 0) goto Lac3
            if (r1 == 0) goto Lac3
            ta6 r5 = r9.k()
            fb6 r6 = defpackage.bb6.f
            ja4 r5 = r5.A
            java.lang.Object r5 = r5.g(r6)
            if (r5 != 0) goto La58
            r5 = r44
        La58:
            if (r5 != 0) goto La72
            ta6 r5 = r9.k()
            fb6 r6 = defpackage.bb6.e
            ja4 r5 = r5.A
            java.lang.Object r5 = r5.g(r6)
            if (r5 != 0) goto La6a
            r5 = r44
        La6a:
            if (r5 == 0) goto La6d
            goto La72
        La6d:
            java.lang.String r5 = "android.widget.HorizontalScrollView"
            r12.i(r5)
        La72:
            on2 r5 = r0.b
            java.lang.Object r5 = r5.c()
            java.lang.Number r5 = (java.lang.Number) r5
            float r5 = r5.floatValue()
            int r5 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r5 <= 0) goto La86
            r13 = 1
            r12.l(r13)
        La86:
            boolean r5 = defpackage.n16.i(r9)
            if (r5 == 0) goto Lac3
            boolean r5 = defpackage.ze.z(r0)
            if (r5 == 0) goto Laa8
            p2 r5 = defpackage.p2.h
            r12.b(r5)
            r5 = r20
            kk3 r6 = r5.v0
            kk3 r7 = defpackage.kk3.Rtl
            if (r6 != r7) goto Laa2
            p2 r6 = defpackage.p2.o
            goto Laa4
        Laa2:
            p2 r6 = defpackage.p2.q
        Laa4:
            r12.b(r6)
            goto Laaa
        Laa8:
            r5 = r20
        Laaa:
            boolean r0 = defpackage.ze.y(r0)
            if (r0 == 0) goto Lac3
            p2 r0 = defpackage.p2.i
            r12.b(r0)
            kk3 r0 = r5.v0
            kk3 r5 = defpackage.kk3.Rtl
            if (r0 != r5) goto Labe
            p2 r0 = defpackage.p2.q
            goto Lac0
        Labe:
            p2 r0 = defpackage.p2.o
        Lac0:
            r12.b(r0)
        Lac3:
            ta6 r0 = r9.n()
            fb6 r5 = defpackage.bb6.w
            java.lang.Object r0 = defpackage.xk2.r(r0, r5)
            e76 r0 = (defpackage.e76) r0
            if (r0 == 0) goto Lb37
            if (r1 == 0) goto Lb37
            ta6 r1 = r9.k()
            fb6 r5 = defpackage.bb6.f
            ja4 r1 = r1.A
            java.lang.Object r1 = r1.g(r5)
            if (r1 != 0) goto Lae3
            r1 = r44
        Lae3:
            if (r1 != 0) goto Lafd
            ta6 r1 = r9.k()
            fb6 r5 = defpackage.bb6.e
            ja4 r1 = r1.A
            java.lang.Object r1 = r1.g(r5)
            if (r1 != 0) goto Laf5
            r1 = r44
        Laf5:
            if (r1 == 0) goto Laf8
            goto Lafd
        Laf8:
            java.lang.String r1 = "android.widget.ScrollView"
            r12.i(r1)
        Lafd:
            on2 r1 = r0.b
            java.lang.Object r1 = r1.c()
            java.lang.Number r1 = (java.lang.Number) r1
            float r1 = r1.floatValue()
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 <= 0) goto Lb11
            r13 = 1
            r12.l(r13)
        Lb11:
            boolean r1 = defpackage.n16.i(r9)
            if (r1 == 0) goto Lb37
            boolean r1 = defpackage.ze.z(r0)
            if (r1 == 0) goto Lb27
            p2 r1 = defpackage.p2.h
            r12.b(r1)
            p2 r1 = defpackage.p2.p
            r12.b(r1)
        Lb27:
            boolean r0 = defpackage.ze.y(r0)
            if (r0 == 0) goto Lb37
            p2 r0 = defpackage.p2.i
            r12.b(r0)
            p2 r0 = defpackage.p2.n
            r12.b(r0)
        Lb37:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto Lb40
            defpackage.lb4.l(r12, r9)
        Lb40:
            ta6 r1 = r9.n()
            fb6 r2 = defpackage.bb6.d
            java.lang.Object r1 = defpackage.xk2.r(r1, r2)
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r2 = 28
            if (r0 < r2) goto Lb54
            defpackage.j2.u(r3, r1)
            goto Lb5d
        Lb54:
            android.os.Bundle r0 = r3.getExtras()
            java.lang.String r2 = "androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY"
            r0.putCharSequence(r2, r1)
        Lb5d:
            boolean r0 = defpackage.n16.i(r9)
            if (r0 == 0) goto Lc95
            ta6 r0 = r9.n()
            fb6 r1 = defpackage.sa6.t
            java.lang.Object r0 = defpackage.xk2.r(r0, r1)
            y1 r0 = (defpackage.y1) r0
            if (r0 == 0) goto Lb7d
            p2 r1 = new p2
            r2 = 262144(0x40000, float:3.67342E-40)
            java.lang.String r0 = r0.a
            r1.<init>(r2, r0)
            r12.b(r1)
        Lb7d:
            ta6 r0 = r9.n()
            fb6 r1 = defpackage.sa6.u
            java.lang.Object r0 = defpackage.xk2.r(r0, r1)
            y1 r0 = (defpackage.y1) r0
            if (r0 == 0) goto Lb97
            p2 r1 = new p2
            r2 = 524288(0x80000, float:7.34684E-40)
            java.lang.String r0 = r0.a
            r1.<init>(r2, r0)
            r12.b(r1)
        Lb97:
            ta6 r0 = r9.n()
            fb6 r1 = defpackage.sa6.v
            java.lang.Object r0 = defpackage.xk2.r(r0, r1)
            y1 r0 = (defpackage.y1) r0
            if (r0 == 0) goto Lbb1
            p2 r1 = new p2
            r2 = 1048576(0x100000, float:1.469368E-39)
            java.lang.String r0 = r0.a
            r1.<init>(r2, r0)
            r12.b(r1)
        Lbb1:
            ta6 r0 = r9.n()
            fb6 r1 = defpackage.sa6.x
            ja4 r0 = r0.A
            boolean r0 = r0.c(r1)
            if (r0 == 0) goto Lc95
            ta6 r0 = r9.n()
            java.lang.Object r0 = r0.c(r1)
            java.util.List r0 = (java.util.List) r0
            int r1 = r0.size()
            o94 r2 = defpackage.ze.J0
            int r5 = r2.b
            if (r1 >= r5) goto Lc82
            un6 r1 = new un6
            r13 = 0
            r1.<init>(r13)
            y94 r5 = defpackage.th4.a()
            r6 = r19
            boolean r7 = r6.A
            if (r7 == 0) goto Lbe6
            defpackage.vy7.I(r6)
        Lbe6:
            int[] r7 = r6.B
            int r8 = r6.R
            int r7 = defpackage.g04.v(r8, r4, r7)
            if (r7 < 0) goto Lbf2
            r7 = 1
            goto Lbf3
        Lbf2:
            r7 = 0
        Lbf3:
            if (r7 == 0) goto Lc67
            java.lang.Object r7 = r6.c(r4)
            y94 r7 = (defpackage.y94) r7
            r8 = 16
            int[] r8 = new int[r8]
            int[] r10 = r2.a
            int r2 = r2.b
            r14 = r8
            r8 = 0
            r13 = 0
        Lc06:
            if (r8 >= r2) goto Lc34
            r17 = r10[r8]
            r19 = r2
            int r2 = r13 + 1
            r20 = r7
            int r7 = r14.length
            if (r7 >= r2) goto Lc26
            int r7 = r14.length
            r24 = 3
            int r7 = r7 * 3
            r16 = 2
            int r7 = r7 / 2
            int r7 = java.lang.Math.max(r2, r7)
            int[] r7 = java.util.Arrays.copyOf(r14, r7)
            r14 = r7
            goto Lc2a
        Lc26:
            r16 = 2
            r24 = 3
        Lc2a:
            r14[r13] = r17
            int r8 = r8 + 1
            r13 = r2
            r2 = r19
            r7 = r20
            goto Lc06
        Lc34:
            r20 = r7
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            int r7 = r0.size()
            if (r7 > 0) goto Lc5b
            int r0 = r2.size()
            if (r0 > 0) goto Lc48
            goto Lc6e
        Lc48:
            r7 = 0
            java.lang.Object r0 = r2.get(r7)
            defpackage.xg6.A(r0)
            if (r13 > 0) goto Lc58
            java.lang.String r0 = "Index must be between 0 and size"
            defpackage.e41.q(r0)
            return r44
        Lc58:
            r0 = r14[r7]
            throw r44
        Lc5b:
            r7 = 0
            java.lang.Object r0 = r0.get(r7)
            defpackage.xg6.A(r0)
            r20.getClass()
            throw r44
        Lc67:
            r7 = 0
            int r8 = r0.size()
            if (r8 > 0) goto Lc77
        Lc6e:
            un6 r0 = r11.n0
            r0.e(r4, r1)
            r6.e(r4, r5)
            goto Lc95
        Lc77:
            java.lang.Object r0 = r0.get(r7)
            defpackage.xg6.A(r0)
            r2.c(r7)
            throw r44
        Lc82:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Can't have more than "
            r0.<init>(r1)
            int r1 = r2.b
            java.lang.String r2 = " custom actions for one widget"
            java.lang.String r0 = defpackage.lb1.o(r0, r1, r2)
            defpackage.i.m(r0)
            return r44
        Lc95:
            boolean r0 = defpackage.n16.j(r9, r15)
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 28
            if (r1 < r2) goto Lca3
            defpackage.j2.v(r3, r0)
            goto Lca7
        Lca3:
            r13 = 1
            r12.h(r13, r0)
        Lca7:
            n94 r0 = r11.x0
            int r0 = r0.d(r4)
            r8 = -1
            if (r0 == r8) goto Lcc4
            zm r1 = r18.getAndroidViewsHandler$ui()
            defpackage.ln2.b0(r1, r0)
            r1 = r18
            r3.setTraversalBefore(r1, r0)
            java.lang.String r0 = r11.z0
            r2 = r44
            r11.j(r4, r12, r0, r2)
            goto Lcc6
        Lcc4:
            r1 = r18
        Lcc6:
            n94 r0 = r11.y0
            int r0 = r0.d(r4)
            if (r0 == r8) goto Lcd5
            zm r1 = r1.getAndroidViewsHandler$ui()
            defpackage.ln2.b0(r1, r0)
        Lcd5:
            ta6 r0 = r9.n()
            fb6 r1 = defpackage.cb6.b
            java.lang.Object r0 = defpackage.xk2.r(r0, r1)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto Lce6
            r12.i(r0)
        Lce6:
            r6 = r12
        Lce7:
            boolean r0 = r11.k0
            if (r0 == 0) goto Lcf7
            int r0 = r11.g0
            if (r4 != r0) goto Lcf1
            r11.i0 = r6
        Lcf1:
            int r0 = r11.h0
            if (r4 != r0) goto Lcf7
            r11.j0 = r6
        Lcf7:
            return r6
        Lcf8:
            r4 = r1
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "semanticsNode "
            r0.<init>(r1)
            r0.append(r4)
            java.lang.String r1 = " has null parent"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            defpackage.p53.d(r0)
            defpackage.e41.c()
            r2 = 0
            return r2
    }

    @Override // defpackage.os0
    public void N(int r2, defpackage.v2 r3, java.lang.String r4, android.os.Bundle r5) {
            r1 = this;
            int r0 = r1.Y
            switch(r0) {
                case 0: goto L6;
                default: goto L5;
            }
        L5:
            return
        L6:
            b2 r1 = r1.Z
            ze r1 = (defpackage.ze) r1
            r1.j(r2, r3, r4, r5)
            return
    }

    @Override // defpackage.os0
    public final defpackage.v2 R(int r2) {
            r1 = this;
            int r0 = r1.Y
            switch(r0) {
                case 0: goto L19;
                default: goto L5;
            }
        L5:
            b2 r1 = r1.Z
            mq0 r1 = (defpackage.mq0) r1
            v2 r1 = r1.n(r2)
            android.view.accessibility.AccessibilityNodeInfo r1 = r1.a
            android.view.accessibility.AccessibilityNodeInfo r1 = android.view.accessibility.AccessibilityNodeInfo.obtain(r1)
            v2 r2 = new v2
            r2.<init>(r1)
            return r2
        L19:
            v2 r1 = r1.y0(r2)
            return r1
    }

    @Override // defpackage.os0
    public final defpackage.v2 X(int r6) {
            r5 = this;
            int r0 = r5.Y
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            b2 r2 = r5.Z
            r3 = 2
            r4 = 0
            switch(r0) {
                case 0: goto L1c;
                default: goto Lb;
            }
        Lb:
            mq0 r2 = (defpackage.mq0) r2
            if (r6 != r3) goto L12
            int r6 = r2.g0
            goto L14
        L12:
            int r6 = r2.h0
        L14:
            if (r6 != r1) goto L17
            goto L1b
        L17:
            v2 r4 = r5.R(r6)
        L1b:
            return r4
        L1c:
            ze r2 = (defpackage.ze) r2
            r0 = 1
            if (r6 == r0) goto L34
            if (r6 != r3) goto L2a
            int r6 = r2.g0
            v2 r4 = r5.R(r6)
            goto L3d
        L2a:
            java.lang.String r5 = "Unknown focus type: "
            java.lang.String r5 = defpackage.lb1.g(r6, r5)
            defpackage.i.h(r5)
            goto L3d
        L34:
            int r6 = r2.h0
            if (r6 != r1) goto L39
            goto L3d
        L39:
            v2 r4 = r5.R(r6)
        L3d:
            return r4
    }

    @Override // defpackage.os0
    public final boolean d0(int r28, int r29, android.os.Bundle r30) {
            r27 = this;
            r0 = r27
            r1 = r28
            r2 = r29
            r3 = r30
            int r4 = r0.Y
            r5 = 32768(0x8000, float:4.5918E-41)
            r6 = 16
            r7 = 128(0x80, float:1.8E-43)
            r8 = 64
            r9 = 2
            r10 = -1
            b2 r0 = r0.Z
            r11 = -2147483648(0xffffffff80000000, float:-0.0)
            r12 = 65536(0x10000, float:9.1835E-41)
            r13 = 1
            r14 = 0
            switch(r4) {
                case 0: goto L95;
                default: goto L20;
            }
        L20:
            mq0 r0 = (defpackage.mq0) r0
            com.google.android.material.chip.Chip r4 = r0.e0
            if (r1 == r10) goto L8e
            if (r2 == r13) goto L89
            if (r2 == r9) goto L84
            if (r2 == r8) goto L5e
            if (r2 == r7) goto L51
            com.google.android.material.chip.Chip r0 = r0.j0
            if (r2 != r6) goto L4f
            if (r1 != 0) goto L39
            boolean r13 = r0.performClick()
            goto L94
        L39:
            if (r1 != r13) goto L4f
            r0.playSoundEffect(r14)
            android.view.View$OnClickListener r1 = r0.g0
            if (r1 == 0) goto L46
            r1.onClick(r0)
            r14 = r13
        L46:
            boolean r1 = r0.r0
            if (r1 == 0) goto L4f
            mq0 r0 = r0.q0
            r0.r(r13, r13)
        L4f:
            r13 = r14
            goto L94
        L51:
            int r2 = r0.g0
            if (r2 != r1) goto L4f
            r0.g0 = r11
            r4.invalidate()
            r0.r(r1, r12)
            goto L94
        L5e:
            android.view.accessibility.AccessibilityManager r2 = r0.d0
            boolean r3 = r2.isEnabled()
            if (r3 == 0) goto L4f
            boolean r2 = r2.isTouchExplorationEnabled()
            if (r2 != 0) goto L6d
            goto L4f
        L6d:
            int r2 = r0.g0
            if (r2 == r1) goto L4f
            if (r2 == r11) goto L7b
            r0.g0 = r11
            r4.invalidate()
            r0.r(r2, r12)
        L7b:
            r0.g0 = r1
            r4.invalidate()
            r0.r(r1, r5)
            goto L94
        L84:
            boolean r13 = r0.j(r1)
            goto L94
        L89:
            boolean r13 = r0.q(r1)
            goto L94
        L8e:
            java.util.WeakHashMap r0 = defpackage.ao7.a
            boolean r13 = r4.performAccessibilityAction(r2, r3)
        L94:
            return r13
        L95:
            ze r0 = (defpackage.ze) r0
            android.view.accessibility.AccessibilityManager r4 = r0.Z
            r27 = 0
            java.lang.Float r15 = java.lang.Float.valueOf(r27)
            te r5 = r0.R
            g93 r12 = r0.s()
            java.lang.Object r12 = r12.b(r1)
            za6 r12 = (defpackage.za6) r12
            if (r12 == 0) goto Lb1
            xa6 r12 = r12.a
            if (r12 != 0) goto Lb5
        Lb1:
            r21 = r14
            goto L934
        Lb5:
            sm3 r11 = r12.c
            int r6 = r12.f
            ta6 r10 = r12.d
            ja4 r14 = r10.A
            fb6 r9 = defpackage.bb6.o
            java.lang.Object r9 = r14.g(r9)
            if (r9 != 0) goto Lc6
            r9 = 0
        Lc6:
            java.lang.Boolean r13 = java.lang.Boolean.TRUE
            boolean r9 = defpackage.nb3.k(r9, r13)
            if (r9 == 0) goto Le0
            int r9 = android.os.Build.VERSION.SDK_INT
            r7 = 34
            if (r9 < r7) goto Ld9
            boolean r7 = defpackage.c2.j(r4)
            goto Lda
        Ld9:
            r7 = 1
        Lda:
            if (r7 != 0) goto Le0
        Ldc:
            r21 = 0
            goto L934
        Le0:
            r7 = 12
            if (r2 == r8) goto L937
            r8 = 128(0x80, float:1.8E-43)
            if (r2 == r8) goto L91d
            r4 = 8
            r8 = 512(0x200, float:7.17E-43)
            r9 = 256(0x100, float:3.59E-43)
            if (r2 == r9) goto L7a3
            if (r2 == r8) goto L7a3
            r8 = 16384(0x4000, float:2.2959E-41)
            if (r2 == r8) goto L782
            r8 = 131072(0x20000, float:1.83671E-40)
            if (r2 == r8) goto L758
            boolean r6 = defpackage.n16.i(r12)
            if (r6 != 0) goto L101
            goto Ldc
        L101:
            r6 = 1
            if (r2 == r6) goto L72e
            r6 = 2
            if (r2 == r6) goto L711
            r4 = 32
            switch(r2) {
                case 16: goto L6e5;
                case 32: goto L6c4;
                case 4096: goto L1ce;
                case 8192: goto L1ce;
                case 32768: goto L4a1;
                case 65536: goto L480;
                case 262144: goto L45f;
                case 524288: goto L43e;
                case 1048576: goto L41d;
                case 2097152: goto L3e9;
                case 16908342: goto L22b;
                case 16908349: goto L1f6;
                case 16908372: goto L1d5;
                default: goto L10c;
            }
        L10c:
            switch(r2) {
                case 16908344: goto L1ce;
                case 16908345: goto L1ce;
                case 16908346: goto L1ce;
                case 16908347: goto L1ce;
                default: goto L10f;
            }
        L10f:
            switch(r2) {
                case 16908358: goto L1ad;
                case 16908359: goto L18c;
                case 16908360: goto L16b;
                case 16908361: goto L14a;
                default: goto L112;
            }
        L112:
            un6 r0 = r0.n0
            java.lang.Object r0 = r0.c(r1)
            un6 r0 = (defpackage.un6) r0
            if (r0 == 0) goto Ldc
            java.lang.Object r0 = r0.c(r2)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            if (r0 != 0) goto L125
            goto Ldc
        L125:
            fb6 r0 = defpackage.sa6.x
            java.lang.Object r0 = r14.g(r0)
            if (r0 != 0) goto L12f
            r13 = 0
            goto L130
        L12f:
            r13 = r0
        L130:
            java.util.List r13 = (java.util.List) r13
            if (r13 != 0) goto L135
            goto Ldc
        L135:
            int r0 = r13.size()
            if (r0 > 0) goto L13c
            goto Ldc
        L13c:
            r0 = 0
            java.lang.Object r1 = r13.get(r0)
            r1.getClass()
            defpackage.u34.a()
            r13 = 0
            goto L961
        L14a:
            fb6 r0 = defpackage.sa6.B
            java.lang.Object r0 = r14.g(r0)
            if (r0 != 0) goto L154
            r13 = 0
            goto L155
        L154:
            r13 = r0
        L155:
            y1 r13 = (defpackage.y1) r13
            if (r13 == 0) goto Ldc
            ao2 r0 = r13.b
            on2 r0 = (defpackage.on2) r0
            if (r0 == 0) goto Ldc
            java.lang.Object r0 = r0.c()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r13 = r0.booleanValue()
            goto L961
        L16b:
            fb6 r0 = defpackage.sa6.z
            java.lang.Object r0 = r14.g(r0)
            if (r0 != 0) goto L175
            r13 = 0
            goto L176
        L175:
            r13 = r0
        L176:
            y1 r13 = (defpackage.y1) r13
            if (r13 == 0) goto Ldc
            ao2 r0 = r13.b
            on2 r0 = (defpackage.on2) r0
            if (r0 == 0) goto Ldc
            java.lang.Object r0 = r0.c()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r13 = r0.booleanValue()
            goto L961
        L18c:
            fb6 r0 = defpackage.sa6.A
            java.lang.Object r0 = r14.g(r0)
            if (r0 != 0) goto L196
            r13 = 0
            goto L197
        L196:
            r13 = r0
        L197:
            y1 r13 = (defpackage.y1) r13
            if (r13 == 0) goto Ldc
            ao2 r0 = r13.b
            on2 r0 = (defpackage.on2) r0
            if (r0 == 0) goto Ldc
            java.lang.Object r0 = r0.c()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r13 = r0.booleanValue()
            goto L961
        L1ad:
            fb6 r0 = defpackage.sa6.y
            java.lang.Object r0 = r14.g(r0)
            if (r0 != 0) goto L1b7
            r13 = 0
            goto L1b8
        L1b7:
            r13 = r0
        L1b8:
            y1 r13 = (defpackage.y1) r13
            if (r13 == 0) goto Ldc
            ao2 r0 = r13.b
            on2 r0 = (defpackage.on2) r0
            if (r0 == 0) goto Ldc
            java.lang.Object r0 = r0.c()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r13 = r0.booleanValue()
            goto L961
        L1ce:
            r16 = 4294967295(0xffffffff, double:2.1219957905E-314)
            goto L4c2
        L1d5:
            fb6 r0 = defpackage.sa6.p
            java.lang.Object r0 = r14.g(r0)
            if (r0 != 0) goto L1df
            r13 = 0
            goto L1e0
        L1df:
            r13 = r0
        L1e0:
            y1 r13 = (defpackage.y1) r13
            if (r13 == 0) goto Ldc
            ao2 r0 = r13.b
            on2 r0 = (defpackage.on2) r0
            if (r0 == 0) goto Ldc
            java.lang.Object r0 = r0.c()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r13 = r0.booleanValue()
            goto L961
        L1f6:
            if (r3 == 0) goto Ldc
            java.lang.String r0 = "android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE"
            boolean r1 = r3.containsKey(r0)
            if (r1 != 0) goto L202
            goto Ldc
        L202:
            fb6 r1 = defpackage.sa6.i
            java.lang.Object r1 = r14.g(r1)
            if (r1 != 0) goto L20c
            r13 = 0
            goto L20d
        L20c:
            r13 = r1
        L20d:
            y1 r13 = (defpackage.y1) r13
            if (r13 == 0) goto Ldc
            ao2 r1 = r13.b
            qn2 r1 = (defpackage.qn2) r1
            if (r1 == 0) goto Ldc
            float r0 = r3.getFloat(r0)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            java.lang.Object r0 = r1.g(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r13 = r0.booleanValue()
            goto L961
        L22b:
            xa6 r0 = r12.l()
            if (r0 == 0) goto L241
            ta6 r1 = r0.d
            fb6 r2 = defpackage.sa6.d
            ja4 r1 = r1.A
            java.lang.Object r1 = r1.g(r2)
            if (r1 != 0) goto L23e
            r1 = 0
        L23e:
            y1 r1 = (defpackage.y1) r1
            goto L242
        L241:
            r1 = 0
        L242:
            if (r1 != 0) goto L25c
            if (r0 == 0) goto L25c
            xa6 r0 = r0.l()
            if (r0 == 0) goto L241
            ta6 r1 = r0.d
            fb6 r2 = defpackage.sa6.d
            ja4 r1 = r1.A
            java.lang.Object r1 = r1.g(r2)
            if (r1 != 0) goto L259
            r1 = 0
        L259:
            y1 r1 = (defpackage.y1) r1
            goto L242
        L25c:
            if (r0 != 0) goto L297
            of5 r0 = r12.g()
            android.graphics.Rect r1 = new android.graphics.Rect
            float r2 = r0.a
            double r2 = (double) r2
            double r2 = java.lang.Math.floor(r2)
            float r2 = (float) r2
            int r2 = (int) r2
            float r3 = r0.b
            double r3 = (double) r3
            double r3 = java.lang.Math.floor(r3)
            float r3 = (float) r3
            int r3 = (int) r3
            float r4 = r0.c
            double r6 = (double) r4
            double r6 = java.lang.Math.ceil(r6)
            float r4 = (float) r6
            int r4 = defpackage.u24.E(r4)
            float r0 = r0.d
            double r6 = (double) r0
            double r6 = java.lang.Math.ceil(r6)
            float r0 = (float) r6
            int r0 = defpackage.u24.E(r0)
            r1.<init>(r2, r3, r4, r0)
            boolean r13 = r5.requestRectangleOnScreen(r1)
            goto L961
        L297:
            r1 = 0
            r5 = r1
            r3 = 0
        L29b:
            if (r0 == 0) goto L3e6
            sm3 r7 = r0.c
            ta6 r10 = r0.d
            ja4 r10 = r10.A
            fb6 r13 = defpackage.sa6.d
            java.lang.Object r13 = r10.g(r13)
            if (r13 != 0) goto L2ac
            r13 = 0
        L2ac:
            y1 r13 = (defpackage.y1) r13
            if (r13 == 0) goto L3d9
            if0 r14 = r7.B0
            java.lang.Object r14 = r14.d
            y53 r14 = (defpackage.y53) r14
            of5 r14 = defpackage.ej2.j(r14)
            if0 r7 = r7.B0
            java.lang.Object r7 = r7.d
            y53 r7 = (defpackage.y53) r7
            jk3 r7 = r7.D()
            if (r7 == 0) goto L2d3
            eg4 r7 = (defpackage.eg4) r7
            long r15 = r7.P(r1)
            r8 = r15
        L2cd:
            r16 = 4294967295(0xffffffff, double:2.1219957905E-314)
            goto L2d5
        L2d3:
            r8 = r1
            goto L2cd
        L2d5:
            of5 r7 = r14.i(r8)
            eg4 r8 = r12.d()
            if (r8 == 0) goto L2f0
            z64 r9 = r8.Y0()
            boolean r9 = r9.j0
            if (r9 == 0) goto L2e8
            goto L2e9
        L2e8:
            r8 = 0
        L2e9:
            if (r8 == 0) goto L2f0
            long r8 = r8.P(r1)
            goto L2f1
        L2f0:
            r8 = r1
        L2f1:
            long r8 = defpackage.jk4.f(r8, r5)
            eg4 r14 = r12.d()
            if (r14 == 0) goto L2fe
            long r14 = r14.L
            goto L2ff
        L2fe:
            r14 = r1
        L2ff:
            long r14 = defpackage.qo2.S(r14)
            of5 r8 = defpackage.kj2.b(r8, r14)
            float r9 = r8.a
            float r14 = r7.a
            float r9 = r9 - r14
            float r14 = r8.c
            float r15 = r7.c
            float r14 = r14 - r15
            float r15 = java.lang.Math.signum(r9)
            float r18 = java.lang.Math.signum(r14)
            int r15 = (r15 > r18 ? 1 : (r15 == r18 ? 0 : -1))
            if (r15 != 0) goto L32c
            float r15 = java.lang.Math.abs(r9)
            float r18 = java.lang.Math.abs(r14)
            int r15 = (r15 > r18 ? 1 : (r15 == r18 ? 0 : -1))
            if (r15 >= 0) goto L32a
            goto L32e
        L32a:
            r9 = r14
            goto L32e
        L32c:
            r9 = r27
        L32e:
            float r14 = r8.b
            float r15 = r7.b
            float r14 = r14 - r15
            float r8 = r8.d
            float r7 = r7.d
            float r8 = r8 - r7
            float r7 = java.lang.Math.signum(r14)
            float r15 = java.lang.Math.signum(r8)
            int r7 = (r7 > r15 ? 1 : (r7 == r15 ? 0 : -1))
            if (r7 != 0) goto L353
            float r7 = java.lang.Math.abs(r14)
            float r15 = java.lang.Math.abs(r8)
            int r7 = (r7 > r15 ? 1 : (r7 == r15 ? 0 : -1))
            if (r7 >= 0) goto L351
            goto L355
        L351:
            r14 = r8
            goto L355
        L353:
            r14 = r27
        L355:
            int r7 = java.lang.Float.floatToRawIntBits(r9)
            long r7 = (long) r7
            int r9 = java.lang.Float.floatToRawIntBits(r14)
            long r14 = (long) r9
            long r7 = r7 << r4
            long r14 = r14 & r16
            long r7 = r7 | r14
            boolean r9 = defpackage.jk4.c(r7, r1)
            if (r9 == 0) goto L36b
            r1 = r7
            goto L3a4
        L36b:
            long r14 = r7 >> r4
            int r9 = (int) r14
            float r9 = java.lang.Float.intBitsToFloat(r9)
            long r14 = r7 & r16
            int r14 = (int) r14
            float r14 = java.lang.Float.intBitsToFloat(r14)
            fb6 r15 = defpackage.bb6.v
            java.lang.Object r15 = r10.g(r15)
            if (r15 != 0) goto L382
            r15 = 0
        L382:
            e76 r15 = (defpackage.e76) r15
            kk3 r15 = r11.v0
            kk3 r1 = defpackage.kk3.Rtl
            if (r15 != r1) goto L38b
            float r9 = -r9
        L38b:
            fb6 r1 = defpackage.bb6.w
            java.lang.Object r1 = r10.g(r1)
            if (r1 != 0) goto L394
            r1 = 0
        L394:
            e76 r1 = (defpackage.e76) r1
            int r1 = java.lang.Float.floatToRawIntBits(r9)
            long r1 = (long) r1
            int r9 = java.lang.Float.floatToRawIntBits(r14)
            long r9 = (long) r9
            long r1 = r1 << r4
            long r9 = r9 & r16
            long r1 = r1 | r9
        L3a4:
            ao2 r9 = r13.b
            eo2 r9 = (defpackage.eo2) r9
            if (r9 == 0) goto L3ce
            long r13 = r1 >> r4
            int r10 = (int) r13
            float r10 = java.lang.Float.intBitsToFloat(r10)
            java.lang.Float r10 = java.lang.Float.valueOf(r10)
            long r1 = r1 & r16
            int r1 = (int) r1
            float r1 = java.lang.Float.intBitsToFloat(r1)
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            java.lang.Object r1 = r9.o(r10, r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            r2 = 1
            if (r1 != r2) goto L3ce
            goto L3d0
        L3ce:
            if (r3 == 0) goto L3d2
        L3d0:
            r1 = 1
            goto L3d3
        L3d2:
            r1 = 0
        L3d3:
            long r5 = defpackage.jk4.e(r5, r7)
            r3 = r1
            goto L3de
        L3d9:
            r16 = 4294967295(0xffffffff, double:2.1219957905E-314)
        L3de:
            xa6 r0 = r0.l()
            r1 = 0
            goto L29b
        L3e6:
            r13 = r3
            goto L961
        L3e9:
            if (r3 == 0) goto L3f2
            java.lang.String r0 = "ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE"
            java.lang.String r0 = r3.getString(r0)
            goto L3f3
        L3f2:
            r0 = 0
        L3f3:
            fb6 r1 = defpackage.sa6.k
            java.lang.Object r1 = r14.g(r1)
            if (r1 != 0) goto L3fd
            r13 = 0
            goto L3fe
        L3fd:
            r13 = r1
        L3fe:
            y1 r13 = (defpackage.y1) r13
            if (r13 == 0) goto Ldc
            ao2 r1 = r13.b
            qn2 r1 = (defpackage.qn2) r1
            if (r1 == 0) goto Ldc
            fp r2 = new fp
            if (r0 != 0) goto L40e
            java.lang.String r0 = ""
        L40e:
            r2.<init>(r0)
            java.lang.Object r0 = r1.g(r2)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r13 = r0.booleanValue()
            goto L961
        L41d:
            fb6 r0 = defpackage.sa6.v
            java.lang.Object r0 = r14.g(r0)
            if (r0 != 0) goto L427
            r13 = 0
            goto L428
        L427:
            r13 = r0
        L428:
            y1 r13 = (defpackage.y1) r13
            if (r13 == 0) goto Ldc
            ao2 r0 = r13.b
            on2 r0 = (defpackage.on2) r0
            if (r0 == 0) goto Ldc
            java.lang.Object r0 = r0.c()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r13 = r0.booleanValue()
            goto L961
        L43e:
            fb6 r0 = defpackage.sa6.u
            java.lang.Object r0 = r14.g(r0)
            if (r0 != 0) goto L448
            r13 = 0
            goto L449
        L448:
            r13 = r0
        L449:
            y1 r13 = (defpackage.y1) r13
            if (r13 == 0) goto Ldc
            ao2 r0 = r13.b
            on2 r0 = (defpackage.on2) r0
            if (r0 == 0) goto Ldc
            java.lang.Object r0 = r0.c()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r13 = r0.booleanValue()
            goto L961
        L45f:
            fb6 r0 = defpackage.sa6.t
            java.lang.Object r0 = r14.g(r0)
            if (r0 != 0) goto L469
            r13 = 0
            goto L46a
        L469:
            r13 = r0
        L46a:
            y1 r13 = (defpackage.y1) r13
            if (r13 == 0) goto Ldc
            ao2 r0 = r13.b
            on2 r0 = (defpackage.on2) r0
            if (r0 == 0) goto Ldc
            java.lang.Object r0 = r0.c()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r13 = r0.booleanValue()
            goto L961
        L480:
            fb6 r0 = defpackage.sa6.r
            java.lang.Object r0 = r14.g(r0)
            if (r0 != 0) goto L48a
            r13 = 0
            goto L48b
        L48a:
            r13 = r0
        L48b:
            y1 r13 = (defpackage.y1) r13
            if (r13 == 0) goto Ldc
            ao2 r0 = r13.b
            on2 r0 = (defpackage.on2) r0
            if (r0 == 0) goto Ldc
            java.lang.Object r0 = r0.c()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r13 = r0.booleanValue()
            goto L961
        L4a1:
            fb6 r0 = defpackage.sa6.s
            java.lang.Object r0 = r14.g(r0)
            if (r0 != 0) goto L4ab
            r13 = 0
            goto L4ac
        L4ab:
            r13 = r0
        L4ac:
            y1 r13 = (defpackage.y1) r13
            if (r13 == 0) goto Ldc
            ao2 r0 = r13.b
            on2 r0 = (defpackage.on2) r0
            if (r0 == 0) goto Ldc
            java.lang.Object r0 = r0.c()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r13 = r0.booleanValue()
            goto L961
        L4c2:
            r0 = 4096(0x1000, float:5.74E-42)
            if (r2 != r0) goto L4c8
            r0 = 1
            goto L4c9
        L4c8:
            r0 = 0
        L4c9:
            r1 = 8192(0x2000, float:1.148E-41)
            if (r2 != r1) goto L4cf
            r1 = 1
            goto L4d0
        L4cf:
            r1 = 0
        L4d0:
            r3 = 16908345(0x1020039, float:2.387739E-38)
            if (r2 != r3) goto L4d7
            r3 = 1
            goto L4d8
        L4d7:
            r3 = 0
        L4d8:
            r5 = 16908347(0x102003b, float:2.3877394E-38)
            if (r2 != r5) goto L4df
            r5 = 1
            goto L4e0
        L4df:
            r5 = 0
        L4e0:
            r6 = 16908344(0x1020038, float:2.3877386E-38)
            if (r2 != r6) goto L4e7
            r6 = 1
            goto L4e8
        L4e7:
            r6 = 0
        L4e8:
            r7 = 16908346(0x102003a, float:2.3877392E-38)
            if (r2 != r7) goto L4ef
            r2 = 1
            goto L4f0
        L4ef:
            r2 = 0
        L4f0:
            if (r3 != 0) goto L4fb
            if (r5 != 0) goto L4fb
            if (r0 != 0) goto L4fb
            if (r1 == 0) goto L4f9
            goto L4fb
        L4f9:
            r7 = 0
            goto L4fc
        L4fb:
            r7 = 1
        L4fc:
            if (r6 != 0) goto L507
            if (r2 != 0) goto L507
            if (r0 != 0) goto L507
            if (r1 == 0) goto L505
            goto L507
        L505:
            r2 = 0
            goto L508
        L507:
            r2 = 1
        L508:
            if (r0 != 0) goto L50c
            if (r1 == 0) goto L565
        L50c:
            fb6 r0 = defpackage.bb6.c
            java.lang.Object r0 = r14.g(r0)
            if (r0 != 0) goto L515
            r0 = 0
        L515:
            x35 r0 = (defpackage.x35) r0
            fb6 r8 = defpackage.sa6.i
            java.lang.Object r8 = r14.g(r8)
            if (r8 != 0) goto L520
            r8 = 0
        L520:
            y1 r8 = (defpackage.y1) r8
            if (r0 == 0) goto L565
            bs0 r9 = r0.b
            if (r8 == 0) goto L565
            float r2 = r9.b
            float r3 = r9.a
            int r4 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r4 >= 0) goto L532
            r4 = r3
            goto L533
        L532:
            r4 = r2
        L533:
            int r5 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r5 <= 0) goto L538
            goto L539
        L538:
            r2 = r3
        L539:
            int r3 = r0.c
            if (r3 <= 0) goto L545
            float r4 = r4 - r2
            r26 = 1
            int r3 = r3 + 1
            float r2 = (float) r3
        L543:
            float r4 = r4 / r2
            goto L549
        L545:
            float r4 = r4 - r2
            r2 = 1101004800(0x41a00000, float:20.0)
            goto L543
        L549:
            if (r1 == 0) goto L54c
            float r4 = -r4
        L54c:
            ao2 r1 = r8.b
            qn2 r1 = (defpackage.qn2) r1
            if (r1 == 0) goto Ldc
            float r0 = r0.a
            float r0 = r0 + r4
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            java.lang.Object r0 = r1.g(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r13 = r0.booleanValue()
            goto L961
        L565:
            if0 r0 = r11.B0
            java.lang.Object r0 = r0.d
            y53 r0 = (defpackage.y53) r0
            of5 r0 = defpackage.ej2.j(r0)
            long r8 = r0.c()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            fb6 r10 = defpackage.sa6.C
            java.lang.Object r10 = r14.g(r10)
            if (r10 != 0) goto L581
            r10 = 0
        L581:
            y1 r10 = (defpackage.y1) r10
            if (r10 == 0) goto L59f
            ao2 r10 = r10.b
            qn2 r10 = (defpackage.qn2) r10
            if (r10 == 0) goto L59f
            java.lang.Object r10 = r10.g(r0)
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L59f
            r10 = 0
            java.lang.Object r0 = r0.get(r10)
            java.lang.Float r0 = (java.lang.Float) r0
            goto L5a0
        L59f:
            r0 = 0
        L5a0:
            fb6 r10 = defpackage.sa6.d
            java.lang.Object r10 = r14.g(r10)
            if (r10 != 0) goto L5a9
            r10 = 0
        L5a9:
            y1 r10 = (defpackage.y1) r10
            if (r10 != 0) goto L5af
            goto Ldc
        L5af:
            ao2 r10 = r10.b
            fb6 r12 = defpackage.bb6.v
            java.lang.Object r12 = r14.g(r12)
            if (r12 != 0) goto L5ba
            r12 = 0
        L5ba:
            e76 r12 = (defpackage.e76) r12
            if (r12 == 0) goto L642
            if (r7 == 0) goto L642
            if (r0 == 0) goto L5cb
            float r4 = r0.floatValue()
            r29 = r0
            r28 = r1
            goto L5d6
        L5cb:
            r29 = r0
            r28 = r1
            long r0 = r8 >> r4
            int r0 = (int) r0
            float r4 = java.lang.Float.intBitsToFloat(r0)
        L5d6:
            if (r3 != 0) goto L5da
            if (r28 == 0) goto L5db
        L5da:
            float r4 = -r4
        L5db:
            kk3 r0 = r11.v0
            kk3 r1 = defpackage.kk3.Rtl
            if (r0 != r1) goto L5e6
            if (r3 != 0) goto L5e5
            if (r5 == 0) goto L5e6
        L5e5:
            float r4 = -r4
        L5e6:
            boolean r0 = defpackage.ze.x(r12, r4)
            if (r0 == 0) goto L646
            fb6 r0 = defpackage.sa6.z
            boolean r1 = r14.c(r0)
            if (r1 != 0) goto L611
            fb6 r1 = defpackage.sa6.B
            boolean r1 = r14.c(r1)
            if (r1 == 0) goto L5fd
            goto L611
        L5fd:
            eo2 r10 = (defpackage.eo2) r10
            if (r10 == 0) goto Ldc
            java.lang.Float r0 = java.lang.Float.valueOf(r4)
            java.lang.Object r0 = r10.o(r0, r15)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r13 = r0.booleanValue()
            goto L961
        L611:
            int r1 = (r4 > r27 ? 1 : (r4 == r27 ? 0 : -1))
            if (r1 <= 0) goto L623
            fb6 r0 = defpackage.sa6.B
            java.lang.Object r0 = r14.g(r0)
            if (r0 != 0) goto L61f
            r13 = 0
            goto L620
        L61f:
            r13 = r0
        L620:
            y1 r13 = (defpackage.y1) r13
            goto L62e
        L623:
            java.lang.Object r0 = r14.g(r0)
            if (r0 != 0) goto L62b
            r13 = 0
            goto L62c
        L62b:
            r13 = r0
        L62c:
            y1 r13 = (defpackage.y1) r13
        L62e:
            if (r13 == 0) goto Ldc
            ao2 r0 = r13.b
            on2 r0 = (defpackage.on2) r0
            if (r0 == 0) goto Ldc
            java.lang.Object r0 = r0.c()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r13 = r0.booleanValue()
            goto L961
        L642:
            r29 = r0
            r28 = r1
        L646:
            fb6 r0 = defpackage.bb6.w
            java.lang.Object r0 = r14.g(r0)
            if (r0 != 0) goto L64f
            r0 = 0
        L64f:
            e76 r0 = (defpackage.e76) r0
            if (r0 == 0) goto Ldc
            if (r2 == 0) goto Ldc
            if (r29 == 0) goto L65c
            float r1 = r29.floatValue()
            goto L663
        L65c:
            long r1 = r8 & r16
            int r1 = (int) r1
            float r1 = java.lang.Float.intBitsToFloat(r1)
        L663:
            if (r6 != 0) goto L667
            if (r28 == 0) goto L668
        L667:
            float r1 = -r1
        L668:
            boolean r0 = defpackage.ze.x(r0, r1)
            if (r0 == 0) goto Ldc
            fb6 r0 = defpackage.sa6.y
            boolean r2 = r14.c(r0)
            if (r2 != 0) goto L693
            fb6 r2 = defpackage.sa6.A
            boolean r2 = r14.c(r2)
            if (r2 == 0) goto L67f
            goto L693
        L67f:
            eo2 r10 = (defpackage.eo2) r10
            if (r10 == 0) goto Ldc
            java.lang.Float r0 = java.lang.Float.valueOf(r1)
            java.lang.Object r0 = r10.o(r15, r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r13 = r0.booleanValue()
            goto L961
        L693:
            int r1 = (r1 > r27 ? 1 : (r1 == r27 ? 0 : -1))
            if (r1 <= 0) goto L6a5
            fb6 r0 = defpackage.sa6.A
            java.lang.Object r0 = r14.g(r0)
            if (r0 != 0) goto L6a1
            r13 = 0
            goto L6a2
        L6a1:
            r13 = r0
        L6a2:
            y1 r13 = (defpackage.y1) r13
            goto L6b0
        L6a5:
            java.lang.Object r0 = r14.g(r0)
            if (r0 != 0) goto L6ad
            r13 = 0
            goto L6ae
        L6ad:
            r13 = r0
        L6ae:
            y1 r13 = (defpackage.y1) r13
        L6b0:
            if (r13 == 0) goto Ldc
            ao2 r0 = r13.b
            on2 r0 = (defpackage.on2) r0
            if (r0 == 0) goto Ldc
            java.lang.Object r0 = r0.c()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r13 = r0.booleanValue()
            goto L961
        L6c4:
            fb6 r0 = defpackage.sa6.c
            java.lang.Object r0 = r14.g(r0)
            if (r0 != 0) goto L6ce
            r13 = 0
            goto L6cf
        L6ce:
            r13 = r0
        L6cf:
            y1 r13 = (defpackage.y1) r13
            if (r13 == 0) goto Ldc
            ao2 r0 = r13.b
            on2 r0 = (defpackage.on2) r0
            if (r0 == 0) goto Ldc
            java.lang.Object r0 = r0.c()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r13 = r0.booleanValue()
            goto L961
        L6e5:
            fb6 r2 = defpackage.sa6.b
            java.lang.Object r2 = r14.g(r2)
            if (r2 != 0) goto L6ee
            r2 = 0
        L6ee:
            y1 r2 = (defpackage.y1) r2
            if (r2 == 0) goto L703
            ao2 r2 = r2.b
            on2 r2 = (defpackage.on2) r2
            if (r2 == 0) goto L703
            java.lang.Object r2 = r2.c()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            r23 = r2
        L700:
            r2 = 1
            r3 = 0
            goto L706
        L703:
            r23 = 0
            goto L700
        L706:
            defpackage.ze.E(r0, r1, r2, r3, r7)
            if (r23 == 0) goto Ldc
            boolean r13 = r23.booleanValue()
            goto L961
        L711:
            fb6 r0 = defpackage.bb6.l
            java.lang.Object r0 = r14.g(r0)
            if (r0 != 0) goto L71a
            r0 = 0
        L71a:
            boolean r0 = defpackage.nb3.k(r0, r13)
            if (r0 == 0) goto Ldc
            ah2 r0 = r5.getFocusOwner()
            eh2 r0 = (defpackage.eh2) r0
            r2 = 1
            r10 = 0
            r0.b(r4, r10, r2)
            r13 = 1
            goto L961
        L72e:
            boolean r0 = r5.isInTouchMode()
            if (r0 == 0) goto L737
            r5.requestFocusFromTouch()
        L737:
            fb6 r0 = defpackage.sa6.w
            java.lang.Object r0 = r14.g(r0)
            if (r0 != 0) goto L741
            r13 = 0
            goto L742
        L741:
            r13 = r0
        L742:
            y1 r13 = (defpackage.y1) r13
            if (r13 == 0) goto Ldc
            ao2 r0 = r13.b
            on2 r0 = (defpackage.on2) r0
            if (r0 == 0) goto Ldc
            java.lang.Object r0 = r0.c()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r13 = r0.booleanValue()
            goto L961
        L758:
            if (r3 == 0) goto L764
            java.lang.String r1 = "ACTION_ARGUMENT_SELECTION_START_INT"
            r2 = -1
            int r20 = r3.getInt(r1, r2)
            r1 = r20
            goto L766
        L764:
            r2 = -1
            r1 = r2
        L766:
            if (r3 == 0) goto L770
            java.lang.String r4 = "ACTION_ARGUMENT_SELECTION_END_INT"
            int r10 = r3.getInt(r4, r2)
        L76e:
            r2 = 0
            goto L772
        L770:
            r10 = -1
            goto L76e
        L772:
            boolean r13 = r0.K(r12, r1, r10, r2)
            if (r13 == 0) goto L961
            int r1 = r0.A(r6)
            r3 = 0
            defpackage.ze.E(r0, r1, r2, r3, r7)
            goto L961
        L782:
            fb6 r0 = defpackage.sa6.q
            java.lang.Object r0 = r14.g(r0)
            if (r0 != 0) goto L78c
            r13 = 0
            goto L78d
        L78c:
            r13 = r0
        L78d:
            y1 r13 = (defpackage.y1) r13
            if (r13 == 0) goto Ldc
            ao2 r0 = r13.b
            on2 r0 = (defpackage.on2) r0
            if (r0 == 0) goto Ldc
            java.lang.Object r0 = r0.c()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r13 = r0.booleanValue()
            goto L961
        L7a3:
            if (r3 == 0) goto Ldc
            java.lang.String r1 = "ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT"
            int r1 = r3.getInt(r1)
            java.lang.String r7 = "ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN"
            boolean r3 = r3.getBoolean(r7)
            if (r2 != r9) goto L7b5
            r2 = 1
            goto L7b6
        L7b5:
            r2 = 0
        L7b6:
            java.lang.Integer r7 = r0.q0
            if (r7 != 0) goto L7bc
        L7ba:
            r7 = -1
            goto L7c3
        L7bc:
            int r7 = r7.intValue()
            if (r6 == r7) goto L7cb
            goto L7ba
        L7c3:
            r0.p0 = r7
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r0.q0 = r6
        L7cb:
            java.lang.String r6 = defpackage.ze.t(r12)
            if (r6 == 0) goto Ldc
            int r7 = r6.length()
            if (r7 != 0) goto L7d9
            goto Ldc
        L7d9:
            java.lang.String r7 = defpackage.ze.t(r12)
            if (r7 == 0) goto L7f5
            int r11 = r7.length()
            if (r11 != 0) goto L7e6
            goto L7f5
        L7e6:
            r11 = 1
            if (r1 == r11) goto L87b
            r11 = 2
            if (r1 == r11) goto L852
            r5 = 4
            if (r1 == r5) goto L80d
            if (r1 == r4) goto L7f8
            r4 = 16
            if (r1 == r4) goto L80d
        L7f5:
            r13 = 0
            goto L8a3
        L7f8:
            h2 r4 = defpackage.h2.c
            if (r4 != 0) goto L804
            h2 r4 = new h2
            r10 = 0
            r4.<init>(r10)
            defpackage.h2.c = r4
        L804:
            h2 r13 = defpackage.h2.c
            r13.getClass()
            r13.a = r7
            goto L8a3
        L80d:
            fb6 r4 = defpackage.sa6.a
            boolean r4 = r14.c(r4)
            if (r4 != 0) goto L816
            goto L7f5
        L816:
            a47 r4 = defpackage.ln2.E(r10)
            if (r4 != 0) goto L81d
            goto L7f5
        L81d:
            if (r1 != r5) goto L835
            f2 r5 = defpackage.f2.d
            if (r5 != 0) goto L82b
            f2 r5 = new f2
            r10 = 0
            r5.<init>(r10)
            defpackage.f2.d = r5
        L82b:
            f2 r13 = defpackage.f2.d
            r13.getClass()
            r13.a = r7
            r13.c = r4
            goto L8a3
        L835:
            g2 r5 = defpackage.g2.e
            if (r5 != 0) goto L846
            g2 r5 = new g2
            r10 = 0
            r5.<init>(r10)
            android.graphics.Rect r10 = new android.graphics.Rect
            r10.<init>()
            defpackage.g2.e = r5
        L846:
            g2 r13 = defpackage.g2.e
            r13.getClass()
            r13.a = r7
            r13.c = r4
            r13.d = r12
            goto L8a3
        L852:
            android.content.Context r4 = r5.getContext()
            android.content.res.Resources r4 = r4.getResources()
            android.content.res.Configuration r4 = r4.getConfiguration()
            java.util.Locale r4 = r4.locale
            e2 r5 = defpackage.e2.f
            if (r5 != 0) goto L872
            e2 r5 = new e2
            r11 = 1
            r5.<init>(r11)
            java.text.BreakIterator r4 = java.text.BreakIterator.getWordInstance(r4)
            r5.d = r4
            defpackage.e2.f = r5
        L872:
            e2 r13 = defpackage.e2.f
            r13.getClass()
            r13.s(r7)
            goto L8a3
        L87b:
            android.content.Context r4 = r5.getContext()
            android.content.res.Resources r4 = r4.getResources()
            android.content.res.Configuration r4 = r4.getConfiguration()
            java.util.Locale r4 = r4.locale
            e2 r5 = defpackage.e2.e
            if (r5 != 0) goto L89b
            e2 r5 = new e2
            r10 = 0
            r5.<init>(r10)
            java.text.BreakIterator r4 = java.text.BreakIterator.getCharacterInstance(r4)
            r5.d = r4
            defpackage.e2.e = r5
        L89b:
            e2 r13 = defpackage.e2.e
            r13.getClass()
            r13.s(r7)
        L8a3:
            if (r13 != 0) goto L8a7
            goto Ldc
        L8a7:
            int r4 = r0.q(r12)
            r7 = -1
            if (r4 != r7) goto L8b6
            if (r2 == 0) goto L8b2
            r4 = 0
            goto L8b6
        L8b2:
            int r4 = r6.length()
        L8b6:
            if (r2 == 0) goto L8bd
            int[] r4 = r13.f(r4)
            goto L8c1
        L8bd:
            int[] r4 = r13.q(r4)
        L8c1:
            if (r4 != 0) goto L8c5
            goto Ldc
        L8c5:
            r21 = 0
            r22 = r4[r21]
            r26 = 1
            r23 = r4[r26]
            if (r3 == 0) goto L8f5
            fb6 r3 = defpackage.bb6.a
            boolean r3 = r14.c(r3)
            if (r3 != 0) goto L8f5
            fb6 r3 = defpackage.bb6.G
            boolean r3 = r14.c(r3)
            if (r3 == 0) goto L8f5
            int r3 = r0.r(r12)
            r7 = -1
            if (r3 != r7) goto L8ed
            if (r2 == 0) goto L8eb
            r3 = r22
            goto L8ed
        L8eb:
            r3 = r23
        L8ed:
            if (r2 == 0) goto L8f2
            r4 = r23
            goto L8fd
        L8f2:
            r4 = r22
            goto L8fd
        L8f5:
            if (r2 == 0) goto L8fa
            r3 = r23
            goto L8fc
        L8fa:
            r3 = r22
        L8fc:
            r4 = r3
        L8fd:
            if (r2 == 0) goto L902
            r20 = r9
            goto L904
        L902:
            r20 = r8
        L904:
            ve r18 = new ve
            long r24 = android.os.SystemClock.uptimeMillis()
            r21 = r1
            r19 = r12
            r18.<init>(r19, r20, r21, r22, r23, r24)
            r2 = r18
            r1 = r19
            r0.u0 = r2
            r2 = 1
            r0.K(r1, r3, r4, r2)
        L91b:
            r13 = r2
            goto L961
        L91d:
            r2 = 1
            r21 = 0
            int r3 = r0.g0
            if (r3 != r1) goto L934
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r0.g0 = r3
            r3 = 0
            r0.i0 = r3
            r5.invalidate()
            r6 = 65536(0x10000, float:9.1835E-41)
            defpackage.ze.E(r0, r1, r6, r3, r7)
            goto L91b
        L934:
            r13 = r21
            goto L961
        L937:
            r2 = 1
            r3 = 0
            r6 = 65536(0x10000, float:9.1835E-41)
            r21 = 0
            boolean r8 = r4.isEnabled()
            if (r8 == 0) goto L934
            boolean r4 = r4.isTouchExplorationEnabled()
            if (r4 == 0) goto L934
            int r4 = r0.g0
            if (r4 != r1) goto L94e
            goto L934
        L94e:
            r8 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r4 == r8) goto L955
            defpackage.ze.E(r0, r4, r6, r3, r7)
        L955:
            r0.g0 = r1
            r5.invalidate()
            r4 = 32768(0x8000, float:4.5918E-41)
            defpackage.ze.E(r0, r1, r4, r3, r7)
            goto L91b
        L961:
            return r13
    }
}
