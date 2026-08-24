package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: l11  reason: default package */
/* loaded from: classes.dex */
public abstract class l11 extends android.view.View {
    public int[] A;
    public int B;
    public android.content.Context L;
    public defpackage.gx2 R;
    public java.lang.String d0;
    public java.lang.String e0;
    public java.util.HashMap f0;

    public l11(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r1.<init>(r2, r3)
            r0 = 32
            int[] r0 = new int[r0]
            r1.A = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.f0 = r0
            r1.L = r2
            r1.h(r3)
            return
    }

    public final void a(java.lang.String r4) {
            r3 = this;
            int r0 = r4.length()
            if (r0 != 0) goto L7
            goto Lb
        L7:
            android.content.Context r0 = r3.L
            if (r0 != 0) goto Lc
        Lb:
            return
        Lc:
            java.lang.String r4 = r4.trim()
            int r0 = r3.g(r4)
            if (r0 == 0) goto L23
            java.util.HashMap r1 = r3.f0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            r1.put(r2, r4)
            r3.b(r0)
            return
        L23:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r0 = "Could not find id of \""
            r3.<init>(r0)
            r3.append(r4)
            java.lang.String r4 = "\""
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "ConstraintHelper"
            android.util.Log.w(r4, r3)
            return
    }

    public final void b(int r4) {
            r3 = this;
            int r0 = r3.getId()
            if (r4 != r0) goto L7
            return
        L7:
            int r0 = r3.B
            int r0 = r0 + 1
            int[] r1 = r3.A
            int r2 = r1.length
            if (r0 <= r2) goto L19
            int r0 = r1.length
            int r0 = r0 * 2
            int[] r0 = java.util.Arrays.copyOf(r1, r0)
            r3.A = r0
        L19:
            int[] r0 = r3.A
            int r1 = r3.B
            r0[r1] = r4
            int r1 = r1 + 1
            r3.B = r1
            return
    }

    public final void c(java.lang.String r8) {
            r7 = this;
            int r0 = r8.length()
            if (r0 != 0) goto L8
            goto L78
        L8:
            android.content.Context r0 = r7.L
            if (r0 != 0) goto Ld
            goto L78
        Ld:
            java.lang.String r8 = r8.trim()
            android.view.ViewParent r0 = r7.getParent()
            boolean r0 = r0 instanceof androidx.constraintlayout.widget.ConstraintLayout
            if (r0 == 0) goto L20
            android.view.ViewParent r0 = r7.getParent()
            androidx.constraintlayout.widget.ConstraintLayout r0 = (androidx.constraintlayout.widget.ConstraintLayout) r0
            goto L21
        L20:
            r0 = 0
        L21:
            java.lang.String r1 = "ConstraintHelper"
            if (r0 != 0) goto L2b
            java.lang.String r7 = "Parent not a ConstraintLayout"
            android.util.Log.w(r1, r7)
            return
        L2b:
            int r2 = r0.getChildCount()
            r3 = 0
        L30:
            if (r3 >= r2) goto L78
            android.view.View r4 = r0.getChildAt(r3)
            android.view.ViewGroup$LayoutParams r5 = r4.getLayoutParams()
            boolean r6 = r5 instanceof defpackage.o11
            if (r6 == 0) goto L75
            o11 r5 = (defpackage.o11) r5
            java.lang.String r5 = r5.Y
            boolean r5 = r8.equals(r5)
            if (r5 == 0) goto L75
            int r5 = r4.getId()
            r6 = -1
            if (r5 != r6) goto L6e
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "to use ConstraintTag view "
            r5.<init>(r6)
            java.lang.Class r4 = r4.getClass()
            java.lang.String r4 = r4.getSimpleName()
            r5.append(r4)
            java.lang.String r4 = " must have an ID"
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            android.util.Log.w(r1, r4)
            goto L75
        L6e:
            int r4 = r4.getId()
            r7.b(r4)
        L75:
            int r3 = r3 + 1
            goto L30
        L78:
            return
    }

    public final void d(androidx.constraintlayout.widget.ConstraintLayout r6) {
            r5 = this;
            int r0 = r5.getVisibility()
            float r1 = r5.getElevation()
            r2 = 0
        L9:
            int r3 = r5.B
            if (r2 >= r3) goto L2e
            int[] r3 = r5.A
            r3 = r3[r2]
            android.util.SparseArray r4 = r6.A
            java.lang.Object r3 = r4.get(r3)
            android.view.View r3 = (android.view.View) r3
            if (r3 == 0) goto L2b
            r3.setVisibility(r0)
            r4 = 0
            int r4 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r4 <= 0) goto L2b
            float r4 = r3.getTranslationZ()
            float r4 = r4 + r1
            r3.setTranslationZ(r4)
        L2b:
            int r2 = r2 + 1
            goto L9
        L2e:
            return
    }

    public void e(androidx.constraintlayout.widget.ConstraintLayout r1) {
            r0 = this;
            return
    }

    public final int f(androidx.constraintlayout.widget.ConstraintLayout r7, java.lang.String r8) {
            r6 = this;
            r0 = 0
            if (r8 == 0) goto L36
            android.content.Context r6 = r6.L
            android.content.res.Resources r6 = r6.getResources()
            if (r6 != 0) goto Lc
            goto L36
        Lc:
            int r1 = r7.getChildCount()
            r2 = r0
        L11:
            if (r2 >= r1) goto L36
            android.view.View r3 = r7.getChildAt(r2)
            int r4 = r3.getId()
            r5 = -1
            if (r4 == r5) goto L33
            int r4 = r3.getId()     // Catch: android.content.res.Resources.NotFoundException -> L27
            java.lang.String r4 = r6.getResourceEntryName(r4)     // Catch: android.content.res.Resources.NotFoundException -> L27
            goto L28
        L27:
            r4 = 0
        L28:
            boolean r4 = r8.equals(r4)
            if (r4 == 0) goto L33
            int r6 = r3.getId()
            return r6
        L33:
            int r2 = r2 + 1
            goto L11
        L36:
            return r0
    }

    public final int g(java.lang.String r6) {
            r5 = this;
            android.content.Context r0 = r5.L
            android.view.ViewParent r1 = r5.getParent()
            boolean r1 = r1 instanceof androidx.constraintlayout.widget.ConstraintLayout
            r2 = 0
            if (r1 == 0) goto L12
            android.view.ViewParent r1 = r5.getParent()
            androidx.constraintlayout.widget.ConstraintLayout r1 = (androidx.constraintlayout.widget.ConstraintLayout) r1
            goto L13
        L12:
            r1 = r2
        L13:
            boolean r3 = r5.isInEditMode()
            if (r3 == 0) goto L3a
            if (r1 == 0) goto L3a
            if (r6 == 0) goto L2e
            java.util.HashMap r3 = r1.l0
            if (r3 == 0) goto L2e
            boolean r3 = r3.containsKey(r6)
            if (r3 == 0) goto L2e
            java.util.HashMap r3 = r1.l0
            java.lang.Object r3 = r3.get(r6)
            goto L2f
        L2e:
            r3 = r2
        L2f:
            boolean r4 = r3 instanceof java.lang.Integer
            if (r4 == 0) goto L3a
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            goto L3b
        L3a:
            r3 = 0
        L3b:
            if (r3 != 0) goto L43
            if (r1 == 0) goto L43
            int r3 = r5.f(r1, r6)
        L43:
            if (r3 != 0) goto L4f
            java.lang.Class<z65> r5 = defpackage.z65.class
            java.lang.reflect.Field r5 = r5.getField(r6)     // Catch: java.lang.Exception -> L4f
            int r3 = r5.getInt(r2)     // Catch: java.lang.Exception -> L4f
        L4f:
            if (r3 != 0) goto L5f
            android.content.res.Resources r5 = r0.getResources()
            java.lang.String r1 = "id"
            java.lang.String r0 = r0.getPackageName()
            int r3 = r5.getIdentifier(r6, r1, r0)
        L5f:
            return r3
    }

    public int[] getReferencedIds() {
            r1 = this;
            int[] r0 = r1.A
            int r1 = r1.B
            int[] r1 = java.util.Arrays.copyOf(r0, r1)
            return r1
    }

    public void h(android.util.AttributeSet r5) {
            r4 = this;
            if (r5 == 0) goto L38
            android.content.Context r0 = r4.getContext()
            int[] r1 = defpackage.e75.b
            android.content.res.TypedArray r5 = r0.obtainStyledAttributes(r5, r1)
            int r0 = r5.getIndexCount()
            r1 = 0
        L11:
            if (r1 >= r0) goto L35
            int r2 = r5.getIndex(r1)
            r3 = 35
            if (r2 != r3) goto L25
            java.lang.String r2 = r5.getString(r2)
            r4.d0 = r2
            r4.setIds(r2)
            goto L32
        L25:
            r3 = 36
            if (r2 != r3) goto L32
            java.lang.String r2 = r5.getString(r2)
            r4.e0 = r2
            r4.setReferenceTags(r2)
        L32:
            int r1 = r1 + 1
            goto L11
        L35:
            r5.recycle()
        L38:
            return
    }

    public void i(defpackage.u11 r8, defpackage.gx2 r9, defpackage.o21 r10, android.util.SparseArray r11) {
            r7 = this;
            v11 r8 = r8.e
            int[] r10 = r8.j0
            r0 = 0
            r1 = 0
            if (r10 == 0) goto Lc
            r7.setReferencedIds(r10)
            goto L46
        Lc:
            java.lang.String r10 = r8.k0
            if (r10 == 0) goto L46
            int r10 = r10.length()
            if (r10 <= 0) goto L44
            java.lang.String r10 = r8.k0
            java.lang.String r2 = ","
            java.lang.String[] r10 = r10.split(r2)
            int r2 = r10.length
            int[] r2 = new int[r2]
            r3 = r1
            r4 = r3
        L23:
            int r5 = r10.length
            if (r3 >= r5) goto L3a
            r5 = r10[r3]
            java.lang.String r5 = r5.trim()
            int r5 = r7.g(r5)
            if (r5 == 0) goto L37
            int r6 = r4 + 1
            r2[r4] = r5
            r4 = r6
        L37:
            int r3 = r3 + 1
            goto L23
        L3a:
            int r7 = r10.length
            if (r4 == r7) goto L41
            int[] r2 = java.util.Arrays.copyOf(r2, r4)
        L41:
            r8.j0 = r2
            goto L46
        L44:
            r8.j0 = r0
        L46:
            r9.u0 = r1
            l21[] r7 = r9.t0
            java.util.Arrays.fill(r7, r0)
            int[] r7 = r8.j0
            if (r7 == 0) goto L66
        L51:
            int[] r7 = r8.j0
            int r10 = r7.length
            if (r1 >= r10) goto L66
            r7 = r7[r1]
            java.lang.Object r7 = r11.get(r7)
            l21 r7 = (defpackage.l21) r7
            if (r7 == 0) goto L63
            r9.S(r7)
        L63:
            int r1 = r1 + 1
            goto L51
        L66:
            return
    }

    public abstract void j(defpackage.l21 r1, boolean r2);

    public final void k() {
            r2 = this;
            gx2 r0 = r2.R
            if (r0 != 0) goto L5
            goto L13
        L5:
            android.view.ViewGroup$LayoutParams r0 = r2.getLayoutParams()
            boolean r1 = r0 instanceof defpackage.o11
            if (r1 == 0) goto L13
            o11 r0 = (defpackage.o11) r0
            gx2 r2 = r2.R
            r0.p0 = r2
        L13:
            return
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
            r1 = this;
            super.onAttachedToWindow()
            java.lang.String r0 = r1.d0
            if (r0 == 0) goto La
            r1.setIds(r0)
        La:
            java.lang.String r0 = r1.e0
            if (r0 == 0) goto L11
            r1.setReferenceTags(r0)
        L11:
            return
    }

    @Override // android.view.View
    public final void onDraw(android.graphics.Canvas r1) {
            r0 = this;
            return
    }

    @Override // android.view.View
    public void onMeasure(int r1, int r2) {
            r0 = this;
            r1 = 0
            r0.setMeasuredDimension(r1, r1)
            return
    }

    public void setIds(java.lang.String r4) {
            r3 = this;
            r3.d0 = r4
            if (r4 != 0) goto L5
            return
        L5:
            r0 = 0
            r3.B = r0
        L8:
            r1 = 44
            int r1 = r4.indexOf(r1, r0)
            r2 = -1
            if (r1 != r2) goto L19
            java.lang.String r4 = r4.substring(r0)
            r3.a(r4)
            return
        L19:
            java.lang.String r0 = r4.substring(r0, r1)
            r3.a(r0)
            int r0 = r1 + 1
            goto L8
    }

    public void setReferenceTags(java.lang.String r4) {
            r3 = this;
            r3.e0 = r4
            if (r4 != 0) goto L5
            return
        L5:
            r0 = 0
            r3.B = r0
        L8:
            r1 = 44
            int r1 = r4.indexOf(r1, r0)
            r2 = -1
            if (r1 != r2) goto L19
            java.lang.String r4 = r4.substring(r0)
            r3.c(r4)
            return
        L19:
            java.lang.String r0 = r4.substring(r0, r1)
            r3.c(r0)
            int r0 = r1 + 1
            goto L8
    }

    public void setReferencedIds(int[] r3) {
            r2 = this;
            r0 = 0
            r2.d0 = r0
            r0 = 0
            r2.B = r0
        L6:
            int r1 = r3.length
            if (r0 >= r1) goto L11
            r1 = r3[r0]
            r2.b(r1)
            int r0 = r0 + 1
            goto L6
        L11:
            return
    }

    @Override // android.view.View
    public final void setTag(int r1, java.lang.Object r2) {
            r0 = this;
            super.setTag(r1, r2)
            if (r2 != 0) goto Lc
            java.lang.String r2 = r0.d0
            if (r2 != 0) goto Lc
            r0.b(r1)
        Lc:
            return
    }
}
