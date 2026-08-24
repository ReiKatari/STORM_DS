package androidx.fragment.app;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class r implements android.view.LayoutInflater.Factory2 {
    public final androidx.fragment.app.u A;

    public r(androidx.fragment.app.u r1) {
            r0 = this;
            r0.<init>()
            r0.A = r1
            return
    }

    @Override // android.view.LayoutInflater.Factory2
    public final android.view.View onCreateView(android.view.View r11, java.lang.String r12, android.content.Context r13, android.util.AttributeSet r14) {
            r10 = this;
            java.lang.Class<androidx.fragment.app.FragmentContainerView> r0 = androidx.fragment.app.FragmentContainerView.class
            java.lang.String r0 = r0.getName()
            boolean r0 = r0.equals(r12)
            androidx.fragment.app.u r1 = r10.A
            if (r0 == 0) goto L14
            androidx.fragment.app.FragmentContainerView r10 = new androidx.fragment.app.FragmentContainerView
            r10.<init>(r13, r14, r1)
            return r10
        L14:
            java.lang.String r0 = "fragment"
            boolean r12 = r0.equals(r12)
            r0 = 0
            if (r12 != 0) goto L1f
            goto L1c4
        L1f:
            java.lang.String r12 = "class"
            java.lang.String r12 = r14.getAttributeValue(r0, r12)
            int[] r2 = defpackage.h75.a
            android.content.res.TypedArray r2 = r13.obtainStyledAttributes(r14, r2)
            r3 = 0
            if (r12 != 0) goto L32
            java.lang.String r12 = r2.getString(r3)
        L32:
            r4 = 1
            r5 = -1
            int r6 = r2.getResourceId(r4, r5)
            r7 = 2
            java.lang.String r8 = r2.getString(r7)
            r2.recycle()
            if (r12 == 0) goto L1c4
            java.lang.ClassLoader r2 = r13.getClassLoader()
            java.lang.Class r2 = defpackage.gl2.b(r12, r2)     // Catch: java.lang.ClassNotFoundException -> L51
            java.lang.Class<androidx.fragment.app.o> r9 = androidx.fragment.app.o.class
            boolean r2 = r9.isAssignableFrom(r2)     // Catch: java.lang.ClassNotFoundException -> L51
            goto L52
        L51:
            r2 = r3
        L52:
            if (r2 != 0) goto L56
            goto L1c4
        L56:
            if (r11 == 0) goto L5c
            int r3 = r11.getId()
        L5c:
            if (r3 != r5) goto L81
            if (r6 != r5) goto L81
            if (r8 == 0) goto L63
            goto L81
        L63:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r11 = r14.getPositionDescription()
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r11)
            java.lang.String r11 = ": Must specify unique android:id, android:tag, or have a parent with an id for "
            r13.append(r11)
            r13.append(r12)
            java.lang.String r11 = r13.toString()
            r10.<init>(r11)
            throw r10
        L81:
            if (r6 == r5) goto L88
            androidx.fragment.app.o r2 = r1.C(r6)
            goto L89
        L88:
            r2 = r0
        L89:
            if (r2 != 0) goto L91
            if (r8 == 0) goto L91
            androidx.fragment.app.o r2 = r1.D(r8)
        L91:
            if (r2 != 0) goto L99
            if (r3 == r5) goto L99
            androidx.fragment.app.o r2 = r1.C(r3)
        L99:
            java.lang.String r5 = "Fragment "
            java.lang.String r9 = "FragmentManager"
            if (r2 != 0) goto Lec
            gl2 r2 = r1.H()
            r13.getClassLoader()
            androidx.fragment.app.o r2 = r2.a(r12)
            r2.mFromLayout = r4
            if (r6 == 0) goto Lb0
            r13 = r6
            goto Lb1
        Lb0:
            r13 = r3
        Lb1:
            r2.mFragmentId = r13
            r2.mContainerId = r3
            r2.mTag = r8
            r2.mInLayout = r4
            r2.mFragmentManager = r1
            cl2 r13 = r1.w
            r2.mHost = r13
            jq r13 = r13.B
            android.os.Bundle r3 = r2.mSavedFragmentState
            r2.onInflate(r13, r14, r3)
            androidx.fragment.app.x r13 = r1.a(r2)
            boolean r14 = androidx.fragment.app.u.K(r7)
            if (r14 == 0) goto L126
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>(r5)
            r14.append(r2)
            java.lang.String r1 = " has been inflated via the <fragment> tag: id=0x"
            r14.append(r1)
            java.lang.String r1 = java.lang.Integer.toHexString(r6)
            r14.append(r1)
            java.lang.String r14 = r14.toString()
            android.util.Log.v(r9, r14)
            goto L126
        Lec:
            boolean r13 = r2.mInLayout
            if (r13 != 0) goto L186
            r2.mInLayout = r4
            r2.mFragmentManager = r1
            cl2 r13 = r1.w
            r2.mHost = r13
            jq r13 = r13.B
            android.os.Bundle r3 = r2.mSavedFragmentState
            r2.onInflate(r13, r14, r3)
            androidx.fragment.app.x r13 = r1.g(r2)
            boolean r14 = androidx.fragment.app.u.K(r7)
            if (r14 == 0) goto L126
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            java.lang.String r1 = "Retained Fragment "
            r14.<init>(r1)
            r14.append(r2)
            java.lang.String r1 = " has been re-attached via the <fragment> tag: id=0x"
            r14.append(r1)
            java.lang.String r1 = java.lang.Integer.toHexString(r6)
            r14.append(r1)
            java.lang.String r14 = r14.toString()
            android.util.Log.v(r9, r14)
        L126:
            android.view.ViewGroup r11 = (android.view.ViewGroup) r11
            sl2 r14 = defpackage.tl2.a
            pl2 r14 = new pl2
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "Attempting to use <fragment> tag to add fragment "
            r1.<init>(r3)
            r1.append(r2)
            java.lang.String r3 = " to container "
            r1.append(r3)
            r1.append(r11)
            java.lang.String r1 = r1.toString()
            r14.<init>(r2, r1)
            defpackage.tl2.b(r14)
            sl2 r14 = defpackage.tl2.a(r2)
            r14.getClass()
            rl2 r14 = defpackage.rl2.PENALTY_LOG
            r2.mContainer = r11
            r13.k()
            r13.j()
            android.view.View r11 = r2.mView
            if (r11 == 0) goto L17c
            if (r6 == 0) goto L162
            r11.setId(r6)
        L162:
            android.view.View r11 = r2.mView
            java.lang.Object r11 = r11.getTag()
            if (r11 != 0) goto L16f
            android.view.View r11 = r2.mView
            r11.setTag(r8)
        L16f:
            android.view.View r11 = r2.mView
            androidx.fragment.app.q r12 = new androidx.fragment.app.q
            r12.<init>(r10, r13)
            r11.addOnAttachStateChangeListener(r12)
            android.view.View r10 = r2.mView
            return r10
        L17c:
            java.lang.String r10 = " did not create a view."
            java.lang.String r10 = defpackage.lb1.A(r5, r12, r10)
            defpackage.i.m(r10)
            return r0
        L186:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r11 = r14.getPositionDescription()
            java.lang.String r13 = java.lang.Integer.toHexString(r6)
            java.lang.String r14 = java.lang.Integer.toHexString(r3)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r11)
            java.lang.String r11 = ": Duplicate id 0x"
            r0.append(r11)
            r0.append(r13)
            java.lang.String r11 = ", tag "
            r0.append(r11)
            r0.append(r8)
            java.lang.String r11 = ", or parent id 0x"
            r0.append(r11)
            r0.append(r14)
            java.lang.String r11 = " with another fragment for "
            r0.append(r11)
            r0.append(r12)
            java.lang.String r11 = r0.toString()
            r10.<init>(r11)
            throw r10
        L1c4:
            return r0
    }

    @Override // android.view.LayoutInflater.Factory
    public final android.view.View onCreateView(java.lang.String r2, android.content.Context r3, android.util.AttributeSet r4) {
            r1 = this;
            r0 = 0
            android.view.View r1 = r1.onCreateView(r0, r2, r3, r4)
            return r1
    }
}
