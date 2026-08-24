package androidx.constraintlayout.motion.widget;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class b {
    public final androidx.constraintlayout.motion.widget.MotionLayout a;
    public final defpackage.zb b;
    public defpackage.b84 c;
    public final java.util.ArrayList d;
    public final defpackage.b84 e;
    public final java.util.ArrayList f;
    public final android.util.SparseArray g;
    public final java.util.HashMap h;
    public final android.util.SparseIntArray i;
    public int j;
    public int k;
    public android.view.MotionEvent l;
    public boolean m;
    public boolean n;
    public defpackage.os0 o;
    public boolean p;
    public final defpackage.pa q;
    public float r;
    public float s;

    public b(android.content.Context r11, androidx.constraintlayout.motion.widget.MotionLayout r12, int r13) {
            r10 = this;
            r10.<init>()
            r0 = 0
            r10.b = r0
            r10.c = r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r10.d = r1
            r10.e = r0
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r10.f = r2
            android.util.SparseArray r2 = new android.util.SparseArray
            r2.<init>()
            r10.g = r2
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            r10.h = r2
            android.util.SparseIntArray r2 = new android.util.SparseIntArray
            r2.<init>()
            r10.i = r2
            r2 = 400(0x190, float:5.6E-43)
            r10.j = r2
            r2 = 0
            r10.k = r2
            r10.m = r2
            r10.n = r2
            r10.a = r12
            pa r2 = new pa
            r2.<init>(r12)
            r10.q = r2
            java.lang.String r2 = "Error parsing resource: "
            java.lang.String r3 = "MotionScene"
            android.content.res.Resources r4 = r11.getResources()
            android.content.res.XmlResourceParser r4 = r4.getXml(r13)
            int r5 = r4.getEventType()     // Catch: java.io.IOException -> L71 org.xmlpull.v1.XmlPullParserException -> L74
            r6 = r0
        L52:
            r7 = 1
            if (r5 == r7) goto L1a0
            r7 = 2
            if (r5 == r7) goto L5a
            goto L17b
        L5a:
            java.lang.String r5 = r4.getName()     // Catch: java.io.IOException -> L71 org.xmlpull.v1.XmlPullParserException -> L74
            int r7 = r5.hashCode()     // Catch: java.io.IOException -> L71 org.xmlpull.v1.XmlPullParserException -> L74
            switch(r7) {
                case -1349929691: goto L170;
                case -1239391468: goto L15b;
                case -687739768: goto L14f;
                case 61998586: goto L127;
                case 269306229: goto Lf1;
                case 312750793: goto Ld5;
                case 327855227: goto L93;
                case 793277014: goto L88;
                case 1382829617: goto L77;
                case 1942574248: goto L67;
                default: goto L65;
            }     // Catch: java.io.IOException -> L71 org.xmlpull.v1.XmlPullParserException -> L74
        L65:
            goto L17b
        L67:
            java.lang.String r7 = "include"
            boolean r5 = r5.equals(r7)     // Catch: java.io.IOException -> L71 org.xmlpull.v1.XmlPullParserException -> L74
            if (r5 == 0) goto L17b
            goto L157
        L71:
            r11 = move-exception
            goto L181
        L74:
            r11 = move-exception
            goto L191
        L77:
            java.lang.String r7 = "StateSet"
            boolean r5 = r5.equals(r7)     // Catch: java.io.IOException -> L71 org.xmlpull.v1.XmlPullParserException -> L74
            if (r5 == 0) goto L17b
            zb r5 = new zb     // Catch: java.io.IOException -> L71 org.xmlpull.v1.XmlPullParserException -> L74
            r5.<init>(r11, r4)     // Catch: java.io.IOException -> L71 org.xmlpull.v1.XmlPullParserException -> L74
            r10.b = r5     // Catch: java.io.IOException -> L71 org.xmlpull.v1.XmlPullParserException -> L74
            goto L17b
        L88:
            boolean r5 = r5.equals(r3)     // Catch: java.io.IOException -> L71 org.xmlpull.v1.XmlPullParserException -> L74
            if (r5 == 0) goto L17b
            r10.k(r11, r4)     // Catch: java.io.IOException -> L71 org.xmlpull.v1.XmlPullParserException -> L74
            goto L17b
        L93:
            java.lang.String r7 = "OnSwipe"
            boolean r5 = r5.equals(r7)     // Catch: java.io.IOException -> L71 org.xmlpull.v1.XmlPullParserException -> L74
            if (r5 == 0) goto L17b
            if (r6 != 0) goto Lca
            android.content.res.Resources r5 = r11.getResources()     // Catch: java.io.IOException -> L71 org.xmlpull.v1.XmlPullParserException -> L74
            java.lang.String r5 = r5.getResourceEntryName(r13)     // Catch: java.io.IOException -> L71 org.xmlpull.v1.XmlPullParserException -> L74
            int r7 = r4.getLineNumber()     // Catch: java.io.IOException -> L71 org.xmlpull.v1.XmlPullParserException -> L74
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L71 org.xmlpull.v1.XmlPullParserException -> L74
            r8.<init>()     // Catch: java.io.IOException -> L71 org.xmlpull.v1.XmlPullParserException -> L74
            java.lang.String r9 = " OnSwipe ("
            r8.append(r9)     // Catch: java.io.IOException -> L71 org.xmlpull.v1.XmlPullParserException -> L74
            r8.append(r5)     // Catch: java.io.IOException -> L71 org.xmlpull.v1.XmlPullParserException -> L74
            java.lang.String r5 = ".xml:"
            r8.append(r5)     // Catch: java.io.IOException -> L71 org.xmlpull.v1.XmlPullParserException -> L74
            r8.append(r7)     // Catch: java.io.IOException -> L71 org.xmlpull.v1.XmlPullParserException -> L74
            java.lang.String r5 = ")"
            r8.append(r5)     // Catch: java.io.IOException -> L71 org.xmlpull.v1.XmlPullParserException -> L74
            java.lang.String r5 = r8.toString()     // Catch: java.io.IOException -> L71 org.xmlpull.v1.XmlPullParserException -> L74
            android.util.Log.v(r3, r5)     // Catch: java.io.IOException -> L71 org.xmlpull.v1.XmlPullParserException -> L74
        Lca:
            if (r6 == 0) goto L17b
            androidx.constraintlayout.motion.widget.c r5 = new androidx.constraintlayout.motion.widget.c     // Catch: java.io.IOException -> L71 org.xmlpull.v1.XmlPullParserException -> L74
            r5.<init>(r11, r12, r4)     // Catch: java.io.IOException -> L71 org.xmlpull.v1.XmlPullParserException -> L74
            r6.l = r5     // Catch: java.io.IOException -> L71 org.xmlpull.v1.XmlPullParserException -> L74
            goto L17b
        Ld5:
            java.lang.String r7 = "OnClick"
            boolean r5 = r5.equals(r7)     // Catch: java.io.IOException -> L71 org.xmlpull.v1.XmlPullParserException -> L74
            if (r5 == 0) goto L17b
            if (r6 == 0) goto L17b
            boolean r5 = r12.isInEditMode()     // Catch: java.io.IOException -> L71 org.xmlpull.v1.XmlPullParserException -> L74
            if (r5 != 0) goto L17b
            java.util.ArrayList r5 = r6.m     // Catch: java.io.IOException -> L71 org.xmlpull.v1.XmlPullParserException -> L74
            a84 r7 = new a84     // Catch: java.io.IOException -> L71 org.xmlpull.v1.XmlPullParserException -> L74
            r7.<init>(r11, r6, r4)     // Catch: java.io.IOException -> L71 org.xmlpull.v1.XmlPullParserException -> L74
            r5.add(r7)     // Catch: java.io.IOException -> L71 org.xmlpull.v1.XmlPullParserException -> L74
            goto L17b
        Lf1:
            java.lang.String r7 = "Transition"
            boolean r5 = r5.equals(r7)     // Catch: java.io.IOException -> L71 org.xmlpull.v1.XmlPullParserException -> L74
            if (r5 == 0) goto L17b
            b84 r6 = new b84     // Catch: java.io.IOException -> L71 org.xmlpull.v1.XmlPullParserException -> L74
            r6.<init>(r10, r11, r4)     // Catch: java.io.IOException -> L71 org.xmlpull.v1.XmlPullParserException -> L74
            boolean r5 = r6.b     // Catch: java.io.IOException -> L71 org.xmlpull.v1.XmlPullParserException -> L74
            r1.add(r6)     // Catch: java.io.IOException -> L71 org.xmlpull.v1.XmlPullParserException -> L74
            b84 r7 = r10.c     // Catch: java.io.IOException -> L71 org.xmlpull.v1.XmlPullParserException -> L74
            if (r7 != 0) goto L114
            if (r5 != 0) goto L114
            r10.c = r6     // Catch: java.io.IOException -> L71 org.xmlpull.v1.XmlPullParserException -> L74
            androidx.constraintlayout.motion.widget.c r7 = r6.l     // Catch: java.io.IOException -> L71 org.xmlpull.v1.XmlPullParserException -> L74
            if (r7 == 0) goto L114
            boolean r8 = r10.p     // Catch: java.io.IOException -> L71 org.xmlpull.v1.XmlPullParserException -> L74
            r7.c(r8)     // Catch: java.io.IOException -> L71 org.xmlpull.v1.XmlPullParserException -> L74
        L114:
            if (r5 == 0) goto L17b
            int r5 = r6.c     // Catch: java.io.IOException -> L71 org.xmlpull.v1.XmlPullParserException -> L74
            r7 = -1
            if (r5 != r7) goto L11e
            r10.e = r6     // Catch: java.io.IOException -> L71 org.xmlpull.v1.XmlPullParserException -> L74
            goto L123
        L11e:
            java.util.ArrayList r5 = r10.f     // Catch: java.io.IOException -> L71 org.xmlpull.v1.XmlPullParserException -> L74
            r5.add(r6)     // Catch: java.io.IOException -> L71 org.xmlpull.v1.XmlPullParserException -> L74
        L123:
            r1.remove(r6)     // Catch: java.io.IOException -> L71 org.xmlpull.v1.XmlPullParserException -> L74
            goto L17b
        L127:
            java.lang.String r7 = "ViewTransition"
            boolean r5 = r5.equals(r7)     // Catch: java.io.IOException -> L71 org.xmlpull.v1.XmlPullParserException -> L74
            if (r5 == 0) goto L17b
            yp7 r5 = new yp7     // Catch: java.io.IOException -> L71 org.xmlpull.v1.XmlPullParserException -> L74
            r5.<init>(r11, r4)     // Catch: java.io.IOException -> L71 org.xmlpull.v1.XmlPullParserException -> L74
            pa r7 = r10.q     // Catch: java.io.IOException -> L71 org.xmlpull.v1.XmlPullParserException -> L74
            java.lang.Object r8 = r7.L     // Catch: java.io.IOException -> L71 org.xmlpull.v1.XmlPullParserException -> L74
            java.util.ArrayList r8 = (java.util.ArrayList) r8     // Catch: java.io.IOException -> L71 org.xmlpull.v1.XmlPullParserException -> L74
            r8.add(r5)     // Catch: java.io.IOException -> L71 org.xmlpull.v1.XmlPullParserException -> L74
            r7.R = r0     // Catch: java.io.IOException -> L71 org.xmlpull.v1.XmlPullParserException -> L74
            int r7 = r5.b     // Catch: java.io.IOException -> L71 org.xmlpull.v1.XmlPullParserException -> L74
            r8 = 4
            if (r7 != r8) goto L148
            defpackage.pa.n(r5)     // Catch: java.io.IOException -> L71 org.xmlpull.v1.XmlPullParserException -> L74
            goto L17b
        L148:
            r8 = 5
            if (r7 != r8) goto L17b
            defpackage.pa.n(r5)     // Catch: java.io.IOException -> L71 org.xmlpull.v1.XmlPullParserException -> L74
            goto L17b
        L14f:
            java.lang.String r7 = "Include"
            boolean r5 = r5.equals(r7)     // Catch: java.io.IOException -> L71 org.xmlpull.v1.XmlPullParserException -> L74
            if (r5 == 0) goto L17b
        L157:
            r10.j(r11, r4)     // Catch: java.io.IOException -> L71 org.xmlpull.v1.XmlPullParserException -> L74
            goto L17b
        L15b:
            java.lang.String r7 = "KeyFrameSet"
            boolean r5 = r5.equals(r7)     // Catch: java.io.IOException -> L71 org.xmlpull.v1.XmlPullParserException -> L74
            if (r5 == 0) goto L17b
            yg3 r5 = new yg3     // Catch: java.io.IOException -> L71 org.xmlpull.v1.XmlPullParserException -> L74
            r5.<init>(r11, r4)     // Catch: java.io.IOException -> L71 org.xmlpull.v1.XmlPullParserException -> L74
            if (r6 == 0) goto L17b
            java.util.ArrayList r7 = r6.k     // Catch: java.io.IOException -> L71 org.xmlpull.v1.XmlPullParserException -> L74
            r7.add(r5)     // Catch: java.io.IOException -> L71 org.xmlpull.v1.XmlPullParserException -> L74
            goto L17b
        L170:
            java.lang.String r7 = "ConstraintSet"
            boolean r5 = r5.equals(r7)     // Catch: java.io.IOException -> L71 org.xmlpull.v1.XmlPullParserException -> L74
            if (r5 == 0) goto L17b
            r10.h(r11, r4)     // Catch: java.io.IOException -> L71 org.xmlpull.v1.XmlPullParserException -> L74
        L17b:
            int r5 = r4.next()     // Catch: java.io.IOException -> L71 org.xmlpull.v1.XmlPullParserException -> L74
            goto L52
        L181:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>(r2)
            r12.append(r13)
            java.lang.String r12 = r12.toString()
            android.util.Log.e(r3, r12, r11)
            goto L1a0
        L191:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>(r2)
            r12.append(r13)
            java.lang.String r12 = r12.toString()
            android.util.Log.e(r3, r12, r11)
        L1a0:
            android.util.SparseArray r11 = r10.g
            z11 r12 = new z11
            r12.<init>()
            r13 = 2131427726(0x7f0b018e, float:1.8477076E38)
            r11.put(r13, r12)
            java.util.HashMap r10 = r10.h
            java.lang.String r11 = "motion_base"
            java.lang.Integer r12 = java.lang.Integer.valueOf(r13)
            r10.put(r11, r12)
            return
    }

    public static int c(android.content.Context r5, java.lang.String r6) {
            java.lang.String r0 = "/"
            boolean r0 = r6.contains(r0)
            r1 = 1
            r2 = -1
            if (r0 == 0) goto L24
            r0 = 47
            int r0 = r6.indexOf(r0)
            int r0 = r0 + r1
            java.lang.String r0 = r6.substring(r0)
            android.content.res.Resources r3 = r5.getResources()
            java.lang.String r4 = "id"
            java.lang.String r5 = r5.getPackageName()
            int r5 = r3.getIdentifier(r0, r4, r5)
            goto L25
        L24:
            r5 = r2
        L25:
            if (r5 != r2) goto L3d
            int r0 = r6.length()
            if (r0 <= r1) goto L36
            java.lang.String r5 = r6.substring(r1)
            int r5 = java.lang.Integer.parseInt(r5)
            return r5
        L36:
            java.lang.String r6 = "MotionScene"
            java.lang.String r0 = "error in parsing id"
            android.util.Log.e(r6, r0)
        L3d:
            return r5
    }

    public final boolean a(int r10, androidx.constraintlayout.motion.widget.MotionLayout r11) {
            r9 = this;
            os0 r0 = r9.o
            r1 = 0
            if (r0 == 0) goto L7
            goto La3
        L7:
            java.util.ArrayList r0 = r9.d
            int r2 = r0.size()
            r3 = r1
        Le:
            if (r3 >= r2) goto La3
            java.lang.Object r4 = r0.get(r3)
            int r3 = r3 + 1
            b84 r4 = (defpackage.b84) r4
            int r5 = r4.n
            if (r5 != 0) goto L1d
            goto Le
        L1d:
            b84 r6 = r9.c
            r7 = 2
            if (r6 != r4) goto L28
            int r6 = r6.r
            r6 = r6 & r7
            if (r6 == 0) goto L28
            goto Le
        L28:
            int r6 = r4.d
            r8 = 1
            if (r10 != r6) goto L68
            r6 = 4
            if (r5 == r6) goto L32
            if (r5 != r7) goto L68
        L32:
            androidx.constraintlayout.motion.widget.MotionLayout$a r9 = androidx.constraintlayout.motion.widget.MotionLayout.a.FINISHED
            r11.setState(r9)
            r11.setTransition(r4)
            int r10 = r4.n
            r0 = 1065353216(0x3f800000, float:1.0)
            if (r10 != r6) goto L51
            r11.p(r0)
            r9 = 0
            r11.k1 = r9
            androidx.constraintlayout.motion.widget.MotionLayout$a r9 = androidx.constraintlayout.motion.widget.MotionLayout.a.SETUP
            r11.setState(r9)
            androidx.constraintlayout.motion.widget.MotionLayout$a r9 = androidx.constraintlayout.motion.widget.MotionLayout.a.MOVING
            r11.setState(r9)
            return r8
        L51:
            r11.setProgress(r0)
            r11.r(r8)
            androidx.constraintlayout.motion.widget.MotionLayout$a r10 = androidx.constraintlayout.motion.widget.MotionLayout.a.SETUP
            r11.setState(r10)
            androidx.constraintlayout.motion.widget.MotionLayout$a r10 = androidx.constraintlayout.motion.widget.MotionLayout.a.MOVING
            r11.setState(r10)
            r11.setState(r9)
            r11.u()
            return r8
        L68:
            int r6 = r4.c
            if (r10 != r6) goto Le
            r6 = 3
            if (r5 == r6) goto L71
            if (r5 != r8) goto Le
        L71:
            androidx.constraintlayout.motion.widget.MotionLayout$a r9 = androidx.constraintlayout.motion.widget.MotionLayout.a.FINISHED
            r11.setState(r9)
            r11.setTransition(r4)
            int r10 = r4.n
            r0 = 0
            if (r10 != r6) goto L8c
            r11.p(r0)
            androidx.constraintlayout.motion.widget.MotionLayout$a r9 = androidx.constraintlayout.motion.widget.MotionLayout.a.SETUP
            r11.setState(r9)
            androidx.constraintlayout.motion.widget.MotionLayout$a r9 = androidx.constraintlayout.motion.widget.MotionLayout.a.MOVING
            r11.setState(r9)
            return r8
        L8c:
            r11.setProgress(r0)
            r11.r(r8)
            androidx.constraintlayout.motion.widget.MotionLayout$a r10 = androidx.constraintlayout.motion.widget.MotionLayout.a.SETUP
            r11.setState(r10)
            androidx.constraintlayout.motion.widget.MotionLayout$a r10 = androidx.constraintlayout.motion.widget.MotionLayout.a.MOVING
            r11.setState(r10)
            r11.setState(r9)
            r11.u()
            return r8
        La3:
            return r1
    }

    public final defpackage.z11 b(int r4) {
            r3 = this;
            zb r0 = r3.b
            if (r0 == 0) goto Lc
            int r0 = r0.C(r4)
            r1 = -1
            if (r0 == r1) goto Lc
            r4 = r0
        Lc:
            android.util.SparseArray r0 = r3.g
            java.lang.Object r1 = r0.get(r4)
            if (r1 != 0) goto L42
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Warning could not find ConstraintSet id/"
            r1.<init>(r2)
            androidx.constraintlayout.motion.widget.MotionLayout r3 = r3.a
            android.content.Context r3 = r3.getContext()
            java.lang.String r3 = defpackage.lb4.x(r3, r4)
            r1.append(r3)
            java.lang.String r3 = " In MotionScene"
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            java.lang.String r4 = "MotionScene"
            android.util.Log.e(r4, r3)
            r3 = 0
            int r3 = r0.keyAt(r3)
            java.lang.Object r3 = r0.get(r3)
            z11 r3 = (defpackage.z11) r3
            return r3
        L42:
            java.lang.Object r3 = r0.get(r4)
            z11 r3 = (defpackage.z11) r3
            return r3
    }

    public final android.view.animation.Interpolator d() {
            r3 = this;
            b84 r0 = r3.c
            int r1 = r0.e
            r2 = -2
            if (r1 == r2) goto L4d
            r3 = -1
            r2 = 1
            if (r1 == r3) goto L41
            if (r1 == 0) goto L3b
            if (r1 == r2) goto L35
            r3 = 2
            if (r1 == r3) goto L2f
            r3 = 4
            if (r1 == r3) goto L29
            r3 = 5
            if (r1 == r3) goto L23
            r3 = 6
            if (r1 == r3) goto L1d
            r3 = 0
            return r3
        L1d:
            android.view.animation.AnticipateInterpolator r3 = new android.view.animation.AnticipateInterpolator
            r3.<init>()
            return r3
        L23:
            android.view.animation.OvershootInterpolator r3 = new android.view.animation.OvershootInterpolator
            r3.<init>()
            return r3
        L29:
            android.view.animation.BounceInterpolator r3 = new android.view.animation.BounceInterpolator
            r3.<init>()
            return r3
        L2f:
            android.view.animation.DecelerateInterpolator r3 = new android.view.animation.DecelerateInterpolator
            r3.<init>()
            return r3
        L35:
            android.view.animation.AccelerateInterpolator r3 = new android.view.animation.AccelerateInterpolator
            r3.<init>()
            return r3
        L3b:
            android.view.animation.AccelerateDecelerateInterpolator r3 = new android.view.animation.AccelerateDecelerateInterpolator
            r3.<init>()
            return r3
        L41:
            java.lang.String r3 = r0.f
            gr1 r3 = defpackage.gr1.c(r3)
            l74 r0 = new l74
            r0.<init>(r3, r2)
            return r0
        L4d:
            androidx.constraintlayout.motion.widget.MotionLayout r0 = r3.a
            android.content.Context r0 = r0.getContext()
            b84 r3 = r3.c
            int r3 = r3.g
            android.view.animation.Interpolator r3 = android.view.animation.AnimationUtils.loadInterpolator(r0, r3)
            return r3
    }

    public final void e(defpackage.m74 r4) {
            r3 = this;
            b84 r0 = r3.c
            r1 = 0
            if (r0 != 0) goto L1d
            b84 r3 = r3.e
            if (r3 == 0) goto L31
            java.util.ArrayList r3 = r3.k
            int r0 = r3.size()
        Lf:
            if (r1 >= r0) goto L31
            java.lang.Object r2 = r3.get(r1)
            int r1 = r1 + 1
            yg3 r2 = (defpackage.yg3) r2
            r2.a(r4)
            goto Lf
        L1d:
            java.util.ArrayList r3 = r0.k
            int r0 = r3.size()
        L23:
            if (r1 >= r0) goto L31
            java.lang.Object r2 = r3.get(r1)
            int r1 = r1 + 1
            yg3 r2 = (defpackage.yg3) r2
            r2.a(r4)
            goto L23
        L31:
            return
    }

    public final float f() {
            r0 = this;
            b84 r0 = r0.c
            if (r0 == 0) goto Lb
            androidx.constraintlayout.motion.widget.c r0 = r0.l
            if (r0 == 0) goto Lb
            float r0 = r0.t
            return r0
        Lb:
            r0 = 0
            return r0
    }

    public final int g() {
            r0 = this;
            b84 r0 = r0.c
            if (r0 != 0) goto L6
            r0 = -1
            return r0
        L6:
            int r0 = r0.d
            return r0
    }

    public final int h(android.content.Context r14, android.content.res.XmlResourceParser r15) {
            r13 = this;
            z11 r0 = new z11
            r0.<init>()
            r1 = 0
            r0.f = r1
            int r2 = r15.getAttributeCount()
            r3 = -1
            r4 = r1
            r5 = r3
            r6 = r5
        L10:
            if (r4 >= r2) goto Lfc
            java.lang.String r7 = r15.getAttributeName(r4)
            java.lang.String r8 = r15.getAttributeValue(r4)
            r7.getClass()
            int r9 = r7.hashCode()
            r10 = 3
            r11 = 2
            r12 = 1
            switch(r9) {
                case -1496482599: goto L4a;
                case -1153153640: goto L3f;
                case 3355: goto L34;
                case 973381616: goto L29;
                default: goto L27;
            }
        L27:
            r7 = r3
            goto L54
        L29:
            java.lang.String r9 = "stateLabels"
            boolean r7 = r7.equals(r9)
            if (r7 != 0) goto L32
            goto L27
        L32:
            r7 = r10
            goto L54
        L34:
            java.lang.String r9 = "id"
            boolean r7 = r7.equals(r9)
            if (r7 != 0) goto L3d
            goto L27
        L3d:
            r7 = r11
            goto L54
        L3f:
            java.lang.String r9 = "constraintRotate"
            boolean r7 = r7.equals(r9)
            if (r7 != 0) goto L48
            goto L27
        L48:
            r7 = r12
            goto L54
        L4a:
            java.lang.String r9 = "deriveConstraintsFrom"
            boolean r7 = r7.equals(r9)
            if (r7 != 0) goto L53
            goto L27
        L53:
            r7 = r1
        L54:
            switch(r7) {
                case 0: goto Lf4;
                case 1: goto L96;
                case 2: goto L72;
                case 3: goto L59;
                default: goto L57;
            }
        L57:
            goto Lf8
        L59:
            java.lang.String r7 = ","
            java.lang.String[] r7 = r8.split(r7)
            r0.c = r7
            r7 = r1
        L62:
            java.lang.String[] r8 = r0.c
            int r9 = r8.length
            if (r7 >= r9) goto Lf8
            r9 = r8[r7]
            java.lang.String r9 = r9.trim()
            r8[r7] = r9
            int r7 = r7 + 1
            goto L62
        L72:
            int r5 = c(r14, r8)
            r7 = 47
            int r7 = r8.indexOf(r7)
            if (r7 >= 0) goto L7f
            goto L85
        L7f:
            int r7 = r7 + 1
            java.lang.String r8 = r8.substring(r7)
        L85:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r5)
            java.util.HashMap r9 = r13.h
            r9.put(r8, r7)
            java.lang.String r7 = defpackage.lb4.x(r14, r5)
            r0.a = r7
            goto Lf8
        L96:
            int r7 = java.lang.Integer.parseInt(r8)     // Catch: java.lang.NumberFormatException -> L9e
            r0.d = r7     // Catch: java.lang.NumberFormatException -> L9e
            goto Lf8
        L9e:
            r8.getClass()
            int r7 = r8.hashCode()
            r9 = 4
            switch(r7) {
                case -768416914: goto Ld7;
                case 3317767: goto Lcc;
                case 3387192: goto Lc1;
                case 108511772: goto Lb6;
                case 1954540437: goto Lab;
                default: goto La9;
            }
        La9:
            r7 = r3
            goto Le1
        Lab:
            java.lang.String r7 = "x_right"
            boolean r7 = r8.equals(r7)
            if (r7 != 0) goto Lb4
            goto La9
        Lb4:
            r7 = r9
            goto Le1
        Lb6:
            java.lang.String r7 = "right"
            boolean r7 = r8.equals(r7)
            if (r7 != 0) goto Lbf
            goto La9
        Lbf:
            r7 = r10
            goto Le1
        Lc1:
            java.lang.String r7 = "none"
            boolean r7 = r8.equals(r7)
            if (r7 != 0) goto Lca
            goto La9
        Lca:
            r7 = r11
            goto Le1
        Lcc:
            java.lang.String r7 = "left"
            boolean r7 = r8.equals(r7)
            if (r7 != 0) goto Ld5
            goto La9
        Ld5:
            r7 = r12
            goto Le1
        Ld7:
            java.lang.String r7 = "x_left"
            boolean r7 = r8.equals(r7)
            if (r7 != 0) goto Le0
            goto La9
        Le0:
            r7 = r1
        Le1:
            switch(r7) {
                case 0: goto Lf1;
                case 1: goto Lee;
                case 2: goto Leb;
                case 3: goto Le8;
                case 4: goto Le5;
                default: goto Le4;
            }
        Le4:
            goto Lf8
        Le5:
            r0.d = r10
            goto Lf8
        Le8:
            r0.d = r12
            goto Lf8
        Leb:
            r0.d = r1
            goto Lf8
        Lee:
            r0.d = r11
            goto Lf8
        Lf1:
            r0.d = r9
            goto Lf8
        Lf4:
            int r6 = c(r14, r8)
        Lf8:
            int r4 = r4 + 1
            goto L10
        Lfc:
            if (r5 == r3) goto L111
            androidx.constraintlayout.motion.widget.MotionLayout r1 = r13.a
            int r1 = r1.I0
            r0.k(r14, r15)
            if (r6 == r3) goto L10c
            android.util.SparseIntArray r14 = r13.i
            r14.put(r5, r6)
        L10c:
            android.util.SparseArray r13 = r13.g
            r13.put(r5, r0)
        L111:
            return r5
    }

    public final int i(android.content.Context r7, int r8) {
            r6 = this;
            java.lang.String r0 = "Error parsing resource: "
            java.lang.String r1 = "MotionScene"
            android.content.res.Resources r2 = r7.getResources()
            android.content.res.XmlResourceParser r2 = r2.getXml(r8)
            int r3 = r2.getEventType()     // Catch: java.io.IOException -> L27 org.xmlpull.v1.XmlPullParserException -> L29
        L10:
            r4 = 1
            if (r3 == r4) goto L4f
            java.lang.String r4 = r2.getName()     // Catch: java.io.IOException -> L27 org.xmlpull.v1.XmlPullParserException -> L29
            r5 = 2
            if (r5 != r3) goto L2b
            java.lang.String r3 = "ConstraintSet"
            boolean r3 = r3.equals(r4)     // Catch: java.io.IOException -> L27 org.xmlpull.v1.XmlPullParserException -> L29
            if (r3 == 0) goto L2b
            int r6 = r6.h(r7, r2)     // Catch: java.io.IOException -> L27 org.xmlpull.v1.XmlPullParserException -> L29
            return r6
        L27:
            r6 = move-exception
            goto L30
        L29:
            r6 = move-exception
            goto L40
        L2b:
            int r3 = r2.next()     // Catch: java.io.IOException -> L27 org.xmlpull.v1.XmlPullParserException -> L29
            goto L10
        L30:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>(r0)
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            android.util.Log.e(r1, r7, r6)
            goto L4f
        L40:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>(r0)
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            android.util.Log.e(r1, r7, r6)
        L4f:
            r6 = -1
            return r6
    }

    public final void j(android.content.Context r5, android.content.res.XmlResourceParser r6) {
            r4 = this;
            android.util.AttributeSet r6 = android.util.Xml.asAttributeSet(r6)
            int[] r0 = defpackage.e75.w
            android.content.res.TypedArray r6 = r5.obtainStyledAttributes(r6, r0)
            int r0 = r6.getIndexCount()
            r1 = 0
        Lf:
            if (r1 >= r0) goto L22
            int r2 = r6.getIndex(r1)
            if (r2 != 0) goto L1f
            r3 = -1
            int r2 = r6.getResourceId(r2, r3)
            r4.i(r5, r2)
        L1f:
            int r1 = r1 + 1
            goto Lf
        L22:
            r6.recycle()
            return
    }

    public final void k(android.content.Context r5, android.content.res.XmlResourceParser r6) {
            r4 = this;
            android.util.AttributeSet r6 = android.util.Xml.asAttributeSet(r6)
            int[] r0 = defpackage.e75.m
            android.content.res.TypedArray r5 = r5.obtainStyledAttributes(r6, r0)
            int r6 = r5.getIndexCount()
            r0 = 0
            r1 = r0
        L10:
            if (r1 >= r6) goto L33
            int r2 = r5.getIndex(r1)
            if (r2 != 0) goto L27
            int r3 = r4.j
            int r2 = r5.getInt(r2, r3)
            r4.j = r2
            r3 = 8
            if (r2 >= r3) goto L30
            r4.j = r3
            goto L30
        L27:
            r3 = 1
            if (r2 != r3) goto L30
            int r2 = r5.getInteger(r2, r0)
            r4.k = r2
        L30:
            int r1 = r1 + 1
            goto L10
        L33:
            r5.recycle()
            return
    }

    public final void l(int r12, androidx.constraintlayout.motion.widget.MotionLayout r13) {
            r11 = this;
            android.util.SparseArray r0 = r11.g
            java.lang.Object r1 = r0.get(r12)
            z11 r1 = (defpackage.z11) r1
            java.lang.String r2 = r1.a
            java.util.HashMap r3 = r1.g
            r1.b = r2
            android.util.SparseIntArray r2 = r11.i
            int r12 = r2.get(r12)
            if (r12 <= 0) goto Lf8
            r11.l(r12, r13)
            java.lang.Object r13 = r0.get(r12)
            z11 r13 = (defpackage.z11) r13
            if (r13 != 0) goto L3f
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r0 = "ERROR! invalid deriveConstraintsFrom: @id/"
            r13.<init>(r0)
            androidx.constraintlayout.motion.widget.MotionLayout r11 = r11.a
            android.content.Context r11 = r11.getContext()
            java.lang.String r11 = defpackage.lb4.x(r11, r12)
            r13.append(r11)
            java.lang.String r11 = r13.toString()
            java.lang.String r12 = "MotionScene"
            android.util.Log.e(r12, r11)
            return
        L3f:
            java.util.HashMap r11 = r13.g
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r0 = r1.b
            r12.append(r0)
            java.lang.String r0 = "/"
            r12.append(r0)
            java.lang.String r13 = r13.b
            r12.append(r13)
            java.lang.String r12 = r12.toString()
            r1.b = r12
            java.util.Set r12 = r11.keySet()
            java.util.Iterator r12 = r12.iterator()
        L63:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto L1f2
            java.lang.Object r13 = r12.next()
            java.lang.Integer r13 = (java.lang.Integer) r13
            r13.getClass()
            java.lang.Object r0 = r11.get(r13)
            u11 r0 = (defpackage.u11) r0
            boolean r2 = r3.containsKey(r13)
            if (r2 != 0) goto L86
            u11 r2 = new u11
            r2.<init>()
            r3.put(r13, r2)
        L86:
            java.lang.Object r13 = r3.get(r13)
            u11 r13 = (defpackage.u11) r13
            if (r13 != 0) goto L8f
            goto L63
        L8f:
            v11 r2 = r13.e
            boolean r4 = r2.b
            if (r4 != 0) goto L9a
            v11 r4 = r0.e
            r2.a(r4)
        L9a:
            x11 r2 = r13.c
            boolean r4 = r2.a
            if (r4 != 0) goto Lb6
            x11 r4 = r0.c
            boolean r5 = r4.a
            r2.a = r5
            int r5 = r4.b
            r2.b = r5
            float r5 = r4.d
            r2.d = r5
            float r5 = r4.e
            r2.e = r5
            int r4 = r4.c
            r2.c = r4
        Lb6:
            y11 r2 = r13.f
            boolean r4 = r2.a
            if (r4 != 0) goto Lc1
            y11 r4 = r0.f
            r2.a(r4)
        Lc1:
            w11 r2 = r13.d
            boolean r4 = r2.a
            if (r4 != 0) goto Lcc
            w11 r4 = r0.d
            r2.a(r4)
        Lcc:
            java.util.HashMap r2 = r0.g
            java.util.Set r2 = r2.keySet()
            java.util.Iterator r2 = r2.iterator()
        Ld6:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L63
            java.lang.Object r4 = r2.next()
            java.lang.String r4 = (java.lang.String) r4
            java.util.HashMap r5 = r13.g
            boolean r5 = r5.containsKey(r4)
            if (r5 != 0) goto Ld6
            java.util.HashMap r5 = r13.g
            java.util.HashMap r6 = r0.g
            java.lang.Object r6 = r6.get(r4)
            j11 r6 = (defpackage.j11) r6
            r5.put(r4, r6)
            goto Ld6
        Lf8:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = r1.b
            java.lang.String r0 = "  layout"
            java.lang.String r11 = defpackage.i61.n(r11, r12, r0)
            r1.b = r11
            int r11 = r13.getChildCount()
            r12 = 0
        L10c:
            if (r12 >= r11) goto L1f2
            android.view.View r0 = r13.getChildAt(r12)
            android.view.ViewGroup$LayoutParams r2 = r0.getLayoutParams()
            o11 r2 = (defpackage.o11) r2
            int r4 = r0.getId()
            boolean r5 = r1.f
            if (r5 == 0) goto L12a
            r5 = -1
            if (r4 == r5) goto L124
            goto L12a
        L124:
            java.lang.String r11 = "All children of ConstraintLayout must have ids to use ConstraintSet"
            defpackage.u34.j(r11)
            return
        L12a:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            boolean r5 = r3.containsKey(r5)
            if (r5 != 0) goto L140
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            u11 r6 = new u11
            r6.<init>()
            r3.put(r5, r6)
        L140:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            java.lang.Object r5 = r3.get(r5)
            u11 r5 = (defpackage.u11) r5
            if (r5 != 0) goto L14e
            goto L1ee
        L14e:
            x11 r6 = r5.c
            v11 r7 = r5.e
            y11 r8 = r5.f
            boolean r9 = r7.b
            r10 = 1
            if (r9 != 0) goto L184
            defpackage.u11.a(r5, r4, r2)
            boolean r2 = r0 instanceof defpackage.l11
            if (r2 == 0) goto L182
            r2 = r0
            l11 r2 = (defpackage.l11) r2
            int[] r2 = r2.getReferencedIds()
            r7.j0 = r2
            boolean r2 = r0 instanceof androidx.constraintlayout.widget.Barrier
            if (r2 == 0) goto L182
            r2 = r0
            androidx.constraintlayout.widget.Barrier r2 = (androidx.constraintlayout.widget.Barrier) r2
            boolean r4 = r2.getAllowsGoneWidget()
            r7.o0 = r4
            int r4 = r2.getType()
            r7.g0 = r4
            int r2 = r2.getMargin()
            r7.h0 = r2
        L182:
            r7.b = r10
        L184:
            boolean r2 = r6.a
            if (r2 != 0) goto L196
            int r2 = r0.getVisibility()
            r6.b = r2
            float r2 = r0.getAlpha()
            r6.d = r2
            r6.a = r10
        L196:
            boolean r2 = r8.a
            if (r2 != 0) goto L1ee
            r8.a = r10
            float r2 = r0.getRotation()
            r8.b = r2
            float r2 = r0.getRotationX()
            r8.c = r2
            float r2 = r0.getRotationY()
            r8.d = r2
            float r2 = r0.getScaleX()
            r8.e = r2
            float r2 = r0.getScaleY()
            r8.f = r2
            float r2 = r0.getPivotX()
            float r4 = r0.getPivotY()
            double r5 = (double) r2
            r9 = 0
            int r5 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r5 != 0) goto L1ce
            double r5 = (double) r4
            int r5 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r5 == 0) goto L1d2
        L1ce:
            r8.g = r2
            r8.h = r4
        L1d2:
            float r2 = r0.getTranslationX()
            r8.j = r2
            float r2 = r0.getTranslationY()
            r8.k = r2
            float r2 = r0.getTranslationZ()
            r8.l = r2
            boolean r2 = r8.m
            if (r2 == 0) goto L1ee
            float r0 = r0.getElevation()
            r8.n = r0
        L1ee:
            int r12 = r12 + 1
            goto L10c
        L1f2:
            java.util.Collection r11 = r3.values()
            java.util.Iterator r11 = r11.iterator()
        L1fa:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L259
            java.lang.Object r12 = r11.next()
            u11 r12 = (defpackage.u11) r12
            t11 r13 = r12.h
            if (r13 != 0) goto L20b
            goto L1fa
        L20b:
            java.lang.String r13 = r12.b
            if (r13 != 0) goto L21b
            int r13 = r12.a
            u11 r13 = r1.i(r13)
            t11 r12 = r12.h
            r12.e(r13)
            goto L1fa
        L21b:
            java.util.Set r13 = r3.keySet()
            java.util.Iterator r13 = r13.iterator()
        L223:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L1fa
            java.lang.Object r0 = r13.next()
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            u11 r0 = r1.i(r0)
            v11 r2 = r0.e
            java.lang.String r2 = r2.l0
            if (r2 != 0) goto L23e
            goto L223
        L23e:
            java.lang.String r4 = r12.b
            boolean r2 = r4.matches(r2)
            if (r2 == 0) goto L223
            t11 r2 = r12.h
            r2.e(r0)
            java.util.HashMap r2 = r12.g
            java.lang.Object r2 = r2.clone()
            java.util.HashMap r2 = (java.util.HashMap) r2
            java.util.HashMap r0 = r0.g
            r0.putAll(r2)
            goto L223
        L259:
            return
    }

    public final void m(int r11, int r12) {
            r10 = this;
            r0 = -1
            zb r1 = r10.b
            if (r1 == 0) goto L16
            int r2 = r1.C(r11)
            if (r2 == r0) goto Lc
            goto Ld
        Lc:
            r2 = r11
        Ld:
            int r1 = r1.C(r12)
            if (r1 == r0) goto L14
            goto L18
        L14:
            r1 = r12
            goto L18
        L16:
            r2 = r11
            goto L14
        L18:
            b84 r3 = r10.c
            if (r3 == 0) goto L25
            int r4 = r3.c
            if (r4 != r12) goto L25
            int r3 = r3.d
            if (r3 != r11) goto L25
            goto L50
        L25:
            java.util.ArrayList r3 = r10.d
            int r4 = r3.size()
            r5 = 0
            r6 = r5
        L2d:
            if (r6 >= r4) goto L51
            java.lang.Object r7 = r3.get(r6)
            int r6 = r6 + 1
            b84 r7 = (defpackage.b84) r7
            int r8 = r7.c
            if (r8 != r1) goto L3f
            int r9 = r7.d
            if (r9 == r2) goto L45
        L3f:
            if (r8 != r12) goto L2d
            int r8 = r7.d
            if (r8 != r11) goto L2d
        L45:
            r10.c = r7
            androidx.constraintlayout.motion.widget.c r11 = r7.l
            if (r11 == 0) goto L50
            boolean r10 = r10.p
            r11.c(r10)
        L50:
            return
        L51:
            java.util.ArrayList r11 = r10.f
            int r4 = r11.size()
            b84 r6 = r10.e
        L59:
            if (r5 >= r4) goto L69
            java.lang.Object r7 = r11.get(r5)
            int r5 = r5 + 1
            b84 r7 = (defpackage.b84) r7
            int r8 = r7.c
            if (r8 != r12) goto L59
            r6 = r7
            goto L59
        L69:
            b84 r11 = new b84
            r11.<init>(r10, r6)
            r11.d = r2
            r11.c = r1
            if (r2 == r0) goto L77
            r3.add(r11)
        L77:
            r10.c = r11
            return
    }

    public final boolean n() {
            r6 = this;
            java.util.ArrayList r0 = r6.d
            int r1 = r0.size()
            r2 = 0
            r3 = r2
        L8:
            r4 = 1
            if (r3 >= r1) goto L18
            java.lang.Object r5 = r0.get(r3)
            int r3 = r3 + 1
            b84 r5 = (defpackage.b84) r5
            androidx.constraintlayout.motion.widget.c r5 = r5.l
            if (r5 == 0) goto L8
            return r4
        L18:
            b84 r6 = r6.c
            if (r6 == 0) goto L21
            androidx.constraintlayout.motion.widget.c r6 = r6.l
            if (r6 == 0) goto L21
            return r4
        L21:
            return r2
    }
}
