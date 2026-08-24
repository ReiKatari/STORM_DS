package com.google.android.material.button;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class MaterialButtonToggleGroup extends defpackage.z14 {
    public static final /* synthetic */ int p0 = 0;
    public final java.util.LinkedHashSet j0;
    public boolean k0;
    public boolean l0;
    public boolean m0;
    public final int n0;
    public java.util.HashSet o0;

    public MaterialButtonToggleGroup(android.content.Context r8, android.util.AttributeSet r9) {
            r7 = this;
            r0 = 2132018392(0x7f1404d8, float:1.967509E38)
            r4 = 2130969442(0x7f040362, float:1.7547566E38)
            android.content.Context r8 = defpackage.q60.e0(r8, r9, r4, r0)
            r7.<init>(r8, r9)
            java.util.LinkedHashSet r8 = new java.util.LinkedHashSet
            r8.<init>()
            r7.j0 = r8
            r8 = 0
            r7.k0 = r8
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r7.o0 = r0
            android.content.Context r1 = r7.getContext()
            r5 = 2132018392(0x7f1404d8, float:1.967509E38)
            int[] r6 = new int[r8]
            int[] r3 = defpackage.a75.l
            r2 = r9
            android.content.res.TypedArray r9 = defpackage.f04.K(r1, r2, r3, r4, r5, r6)
            r0 = 7
            boolean r0 = r9.getBoolean(r0, r8)
            r7.setSingleSelection(r0)
            r0 = 2
            r1 = -1
            int r0 = r9.getResourceId(r0, r1)
            r7.n0 = r0
            r0 = 4
            boolean r0 = r9.getBoolean(r0, r8)
            r7.m0 = r0
            wp6 r0 = r7.e0
            if (r0 != 0) goto L55
            t r0 = new t
            r1 = 0
            r0.<init>(r1)
            wp6 r0 = defpackage.wp6.b(r0)
            r7.e0 = r0
        L55:
            r0 = 1
            boolean r8 = r9.getBoolean(r8, r0)
            r7.setEnabled(r8)
            r9.recycle()
            r7.setImportantForAccessibility(r0)
            return
    }

    private java.lang.String getChildrenA11yClassName() {
            r0 = this;
            boolean r0 = r0.l0
            if (r0 == 0) goto Lb
            java.lang.Class<android.widget.RadioButton> r0 = android.widget.RadioButton.class
        L6:
            java.lang.String r0 = r0.getName()
            return r0
        Lb:
            java.lang.Class<android.widget.ToggleButton> r0 = android.widget.ToggleButton.class
            goto L6
    }

    private int getVisibleButtonCount() {
            r4 = this;
            r0 = 0
            r1 = r0
        L2:
            int r2 = r4.getChildCount()
            if (r0 >= r2) goto L21
            android.view.View r2 = r4.getChildAt(r0)
            boolean r2 = r2 instanceof com.google.android.material.button.MaterialButton
            if (r2 == 0) goto L1e
            android.view.View r2 = r4.getChildAt(r0)
            int r2 = r2.getVisibility()
            r3 = 8
            if (r2 == r3) goto L1e
            int r1 = r1 + 1
        L1e:
            int r0 = r0 + 1
            goto L2
        L21:
            return r1
    }

    private void setupButtonChild(com.google.android.material.button.MaterialButton r3) {
            r2 = this;
            r0 = 1
            r3.setMaxLines(r0)
            android.text.TextUtils$TruncateAt r1 = android.text.TextUtils.TruncateAt.END
            r3.setEllipsize(r1)
            r3.setCheckable(r0)
            java.lang.String r2 = r2.getChildrenA11yClassName()
            r3.setA11yClassName(r2)
            return
    }

    @Override // defpackage.z14, android.view.ViewGroup
    public final void addView(android.view.View r2, int r3, android.view.ViewGroup.LayoutParams r4) {
            r1 = this;
            boolean r0 = r2 instanceof com.google.android.material.button.MaterialButton
            if (r0 != 0) goto Lc
            java.lang.String r1 = "MButtonToggleGroup"
            java.lang.String r2 = "Child views must be of type MaterialButton."
            android.util.Log.e(r1, r2)
            return
        Lc:
            super.addView(r2, r3, r4)
            com.google.android.material.button.MaterialButton r2 = (com.google.android.material.button.MaterialButton) r2
            r1.setupButtonChild(r2)
            int r3 = r2.getId()
            boolean r4 = r2.n0
            r1.f(r3, r4)
            l60 r3 = new l60
            r4 = 2
            r3.<init>(r1, r4)
            defpackage.ao7.n(r2, r3)
            return
    }

    public final void f(int r3, boolean r4) {
            r2 = this;
            r0 = -1
            if (r3 != r0) goto L17
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r4 = "Button ID is not valid: "
            r2.<init>(r4)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "MButtonToggleGroup"
            android.util.Log.e(r3, r2)
            return
        L17:
            java.util.HashSet r0 = new java.util.HashSet
            java.util.HashSet r1 = r2.o0
            r0.<init>(r1)
            if (r4 == 0) goto L3f
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            boolean r1 = r0.contains(r1)
            if (r1 != 0) goto L3f
            boolean r4 = r2.l0
            if (r4 == 0) goto L37
            boolean r4 = r0.isEmpty()
            if (r4 != 0) goto L37
            r0.clear()
        L37:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r0.add(r3)
            goto L5d
        L3f:
            if (r4 != 0) goto L60
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            boolean r4 = r0.contains(r4)
            if (r4 == 0) goto L60
            boolean r4 = r2.m0
            if (r4 == 0) goto L56
            int r4 = r0.size()
            r1 = 1
            if (r4 <= r1) goto L5d
        L56:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r0.remove(r3)
        L5d:
            r2.g(r0)
        L60:
            return
    }

    public final void g(java.util.Set r8) {
            r7 = this;
            java.util.HashSet r0 = r7.o0
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>(r8)
            r7.o0 = r1
            r1 = 0
            r2 = r1
        Lb:
            int r3 = r7.getChildCount()
            if (r2 >= r3) goto L67
            android.view.View r3 = r7.getChildAt(r2)
            com.google.android.material.button.MaterialButton r3 = (com.google.android.material.button.MaterialButton) r3
            int r3 = r3.getId()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            boolean r4 = r8.contains(r4)
            android.view.View r5 = r7.findViewById(r3)
            boolean r6 = r5 instanceof com.google.android.material.button.MaterialButton
            if (r6 == 0) goto L35
            r6 = 1
            r7.k0 = r6
            com.google.android.material.button.MaterialButton r5 = (com.google.android.material.button.MaterialButton) r5
            r5.setChecked(r4)
            r7.k0 = r1
        L35:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            boolean r4 = r0.contains(r4)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r3)
            boolean r5 = r8.contains(r5)
            if (r4 == r5) goto L64
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r8.contains(r3)
            java.util.LinkedHashSet r3 = r7.j0
            java.util.Iterator r3 = r3.iterator()
        L54:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L64
            java.lang.Object r4 = r3.next()
            com.google.android.material.timepicker.e r4 = (com.google.android.material.timepicker.e) r4
            r4.a()
            goto L54
        L64:
            int r2 = r2 + 1
            goto Lb
        L67:
            r7.invalidate()
            return
    }

    public int getCheckedButtonId() {
            r1 = this;
            boolean r0 = r1.l0
            if (r0 == 0) goto L1d
            java.util.HashSet r0 = r1.o0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L1d
            java.util.HashSet r1 = r1.o0
            java.util.Iterator r1 = r1.iterator()
            java.lang.Object r1 = r1.next()
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            return r1
        L1d:
            r1 = -1
            return r1
    }

    public java.util.List<java.lang.Integer> getCheckedButtonIds() {
            r5 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
        L6:
            int r2 = r5.getChildCount()
            if (r1 >= r2) goto L2c
            android.view.View r2 = r5.getChildAt(r1)
            com.google.android.material.button.MaterialButton r2 = (com.google.android.material.button.MaterialButton) r2
            int r2 = r2.getId()
            java.util.HashSet r3 = r5.o0
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)
            boolean r3 = r3.contains(r4)
            if (r3 == 0) goto L29
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.add(r2)
        L29:
            int r1 = r1 + 1
            goto L6
        L2c:
            return r0
    }

    @Override // android.view.View
    public final void onFinishInflate() {
            r2 = this;
            super.onFinishInflate()
            r0 = -1
            int r1 = r2.n0
            if (r1 == r0) goto L13
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            java.util.Set r0 = java.util.Collections.singleton(r0)
            r2.g(r0)
        L13:
            return
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo r4) {
            r3 = this;
            super.onInitializeAccessibilityNodeInfo(r4)
            int r0 = r3.getVisibleButtonCount()
            boolean r3 = r3.l0
            r1 = 1
            if (r3 == 0) goto Le
            r3 = r1
            goto Lf
        Le:
            r3 = 2
        Lf:
            r2 = 0
            android.view.accessibility.AccessibilityNodeInfo$CollectionInfo r3 = android.view.accessibility.AccessibilityNodeInfo.CollectionInfo.obtain(r1, r0, r2, r3)
            r4.setCollectionInfo(r3)
            return
    }

    public void setSelectionRequired(boolean r1) {
            r0 = this;
            r0.m0 = r1
            return
    }

    public void setSingleSelection(int r2) {
            r1 = this;
            android.content.res.Resources r0 = r1.getResources()
            boolean r2 = r0.getBoolean(r2)
            r1.setSingleSelection(r2)
            return
    }

    public void setSingleSelection(boolean r3) {
            r2 = this;
            boolean r0 = r2.l0
            if (r0 == r3) goto Le
            r2.l0 = r3
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>()
            r2.g(r3)
        Le:
            java.lang.String r3 = r2.getChildrenA11yClassName()
            r0 = 0
        L13:
            int r1 = r2.getChildCount()
            if (r0 >= r1) goto L25
            android.view.View r1 = r2.getChildAt(r0)
            com.google.android.material.button.MaterialButton r1 = (com.google.android.material.button.MaterialButton) r1
            r1.setA11yClassName(r3)
            int r0 = r0 + 1
            goto L13
        L25:
            return
    }
}
