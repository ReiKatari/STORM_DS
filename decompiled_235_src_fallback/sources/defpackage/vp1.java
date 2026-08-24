package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: vp1  reason: default package */
/* loaded from: classes.dex */
public final class vp1 extends defpackage.o42 {
    public final int e;
    public final int f;
    public final android.animation.TimeInterpolator g;
    public android.widget.AutoCompleteTextView h;
    public final defpackage.hr0 i;
    public final defpackage.ir0 j;
    public final defpackage.up1 k;
    public boolean l;
    public boolean m;
    public boolean n;
    public long o;
    public android.view.accessibility.AccessibilityManager p;
    public android.animation.ValueAnimator q;
    public android.animation.ValueAnimator r;

    public vp1(defpackage.n42 r4) {
            r3 = this;
            r3.<init>(r4)
            hr0 r0 = new hr0
            r1 = 1
            r0.<init>(r3, r1)
            r3.i = r0
            ir0 r0 = new ir0
            r0.<init>(r3, r1)
            r3.j = r0
            up1 r0 = new up1
            r0.<init>(r3)
            r3.k = r0
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r3.o = r0
            android.content.Context r0 = r4.getContext()
            r1 = 67
            r2 = 2130969532(0x7f0403bc, float:1.7547749E38)
            int r0 = defpackage.kj2.W(r0, r2, r1)
            r3.f = r0
            android.content.Context r0 = r4.getContext()
            r1 = 50
            int r0 = defpackage.kj2.W(r0, r2, r1)
            r3.e = r0
            android.content.Context r4 = r4.getContext()
            r0 = 2130969541(0x7f0403c5, float:1.7547767E38)
            android.view.animation.LinearInterpolator r1 = defpackage.vo.a
            android.animation.TimeInterpolator r4 = defpackage.kj2.X(r4, r0, r1)
            r3.g = r4
            return
    }

    @Override // defpackage.o42
    public final void a() {
            r3 = this;
            android.view.accessibility.AccessibilityManager r0 = r3.p
            boolean r0 = r0.isTouchExplorationEnabled()
            if (r0 == 0) goto L1d
            android.widget.AutoCompleteTextView r0 = r3.h
            int r0 = r0.getInputType()
            if (r0 == 0) goto L1d
            com.google.android.material.internal.CheckableImageButton r0 = r3.d
            boolean r0 = r0.hasFocus()
            if (r0 != 0) goto L1d
            android.widget.AutoCompleteTextView r0 = r3.h
            r0.dismissDropDown()
        L1d:
            android.widget.AutoCompleteTextView r0 = r3.h
            n0 r1 = new n0
            r2 = 19
            r1.<init>(r3, r2)
            r0.post(r1)
            return
    }

    @Override // defpackage.o42
    public final int c() {
            r0 = this;
            r0 = 2131951961(0x7f130159, float:1.9540351E38)
            return r0
    }

    @Override // defpackage.o42
    public final int d() {
            r0 = this;
            r0 = 2131231027(0x7f080133, float:1.8078123E38)
            return r0
    }

    @Override // defpackage.o42
    public final android.view.View.OnFocusChangeListener e() {
            r0 = this;
            ir0 r0 = r0.j
            return r0
    }

    @Override // defpackage.o42
    public final android.view.View.OnClickListener f() {
            r0 = this;
            hr0 r0 = r0.i
            return r0
    }

    @Override // defpackage.o42
    public final android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener h() {
            r0 = this;
            up1 r0 = r0.k
            return r0
    }

    @Override // defpackage.o42
    public final boolean i(int r1) {
            r0 = this;
            if (r1 == 0) goto L4
            r0 = 1
            return r0
        L4:
            r0 = 0
            return r0
    }

    @Override // defpackage.o42
    public final boolean k() {
            r0 = this;
            boolean r0 = r0.n
            return r0
    }

    @Override // defpackage.o42
    public final void l(android.widget.EditText r4) {
            r3 = this;
            boolean r0 = r4 instanceof android.widget.AutoCompleteTextView
            if (r0 == 0) goto L41
            r0 = r4
            android.widget.AutoCompleteTextView r0 = (android.widget.AutoCompleteTextView) r0
            r3.h = r0
            sp1 r1 = new sp1
            r2 = 0
            r1.<init>(r3, r2)
            r0.setOnTouchListener(r1)
            android.widget.AutoCompleteTextView r0 = r3.h
            tp1 r1 = new tp1
            r1.<init>(r3)
            r0.setOnDismissListener(r1)
            android.widget.AutoCompleteTextView r0 = r3.h
            r0.setThreshold(r2)
            r0 = 0
            com.google.android.material.textfield.TextInputLayout r1 = r3.a
            r1.setErrorIconDrawable(r0)
            int r4 = r4.getInputType()
            if (r4 == 0) goto L2e
            goto L3c
        L2e:
            android.view.accessibility.AccessibilityManager r4 = r3.p
            boolean r4 = r4.isTouchExplorationEnabled()
            if (r4 == 0) goto L3c
            com.google.android.material.internal.CheckableImageButton r3 = r3.d
            r4 = 2
            r3.setImportantForAccessibility(r4)
        L3c:
            r3 = 1
            r1.setEndIconVisible(r3)
            return
        L41:
            java.lang.String r3 = "EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used."
            defpackage.u34.j(r3)
            return
    }

    @Override // defpackage.o42
    public final void m(defpackage.v2 r4) {
            r3 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r4.a
            android.widget.AutoCompleteTextView r3 = r3.h
            int r3 = r3.getInputType()
            if (r3 == 0) goto Lb
            goto L14
        Lb:
            java.lang.Class<android.widget.Spinner> r3 = android.widget.Spinner.class
            java.lang.String r3 = r3.getName()
            r4.i(r3)
        L14:
            int r3 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r3 < r1) goto L1f
            boolean r4 = defpackage.k2.y(r0)
            goto L24
        L1f:
            r2 = 4
            boolean r4 = r4.e(r2)
        L24:
            if (r4 == 0) goto L36
            r4 = 0
            if (r3 < r1) goto L2d
            defpackage.k2.u(r0, r4)
            return
        L2d:
            android.os.Bundle r3 = r0.getExtras()
            java.lang.String r0 = "androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY"
            r3.putCharSequence(r0, r4)
        L36:
            return
    }

    @Override // defpackage.o42
    public final void n(android.view.accessibility.AccessibilityEvent r4) {
            r3 = this;
            android.view.accessibility.AccessibilityManager r0 = r3.p
            boolean r0 = r0.isEnabled()
            if (r0 == 0) goto L45
            android.widget.AutoCompleteTextView r0 = r3.h
            int r0 = r0.getInputType()
            if (r0 == 0) goto L11
            return
        L11:
            int r0 = r4.getEventType()
            r1 = 32768(0x8000, float:4.5918E-41)
            r2 = 1
            if (r0 == r1) goto L23
            int r0 = r4.getEventType()
            r1 = 8
            if (r0 != r1) goto L31
        L23:
            boolean r0 = r3.n
            if (r0 == 0) goto L31
            android.widget.AutoCompleteTextView r0 = r3.h
            boolean r0 = r0.isPopupShowing()
            if (r0 != 0) goto L31
            r0 = r2
            goto L32
        L31:
            r0 = 0
        L32:
            int r4 = r4.getEventType()
            if (r4 == r2) goto L3a
            if (r0 == 0) goto L45
        L3a:
            r3.t()
            r3.m = r2
            long r0 = android.os.SystemClock.uptimeMillis()
            r3.o = r0
        L45:
            return
    }

    @Override // defpackage.o42
    public final void q() {
            r5 = this;
            r0 = 2
            float[] r1 = new float[r0]
            r1 = {x0052: FILL_ARRAY_DATA  , data: [0, 1065353216} // fill-array
            android.animation.ValueAnimator r1 = android.animation.ValueAnimator.ofFloat(r1)
            android.animation.TimeInterpolator r2 = r5.g
            r1.setInterpolator(r2)
            int r3 = r5.f
            long r3 = (long) r3
            r1.setDuration(r3)
            rp1 r3 = new rp1
            r3.<init>(r5)
            r1.addUpdateListener(r3)
            r5.r = r1
            float[] r0 = new float[r0]
            r0 = {x005a: FILL_ARRAY_DATA  , data: [1065353216, 0} // fill-array
            android.animation.ValueAnimator r0 = android.animation.ValueAnimator.ofFloat(r0)
            r0.setInterpolator(r2)
            int r1 = r5.e
            long r1 = (long) r1
            r0.setDuration(r1)
            rp1 r1 = new rp1
            r1.<init>(r5)
            r0.addUpdateListener(r1)
            r5.q = r0
            s7 r1 = new s7
            r2 = 3
            r1.<init>(r5, r2)
            r0.addListener(r1)
            android.content.Context r0 = r5.c
            java.lang.String r1 = "accessibility"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.view.accessibility.AccessibilityManager r0 = (android.view.accessibility.AccessibilityManager) r0
            r5.p = r0
            return
    }

    @Override // defpackage.o42
    public final void r() {
            r2 = this;
            android.widget.AutoCompleteTextView r0 = r2.h
            if (r0 == 0) goto Ld
            r1 = 0
            r0.setOnTouchListener(r1)
            android.widget.AutoCompleteTextView r2 = r2.h
            r2.setOnDismissListener(r1)
        Ld:
            return
    }

    public final void s(boolean r2) {
            r1 = this;
            boolean r0 = r1.n
            if (r0 == r2) goto L10
            r1.n = r2
            android.animation.ValueAnimator r2 = r1.r
            r2.cancel()
            android.animation.ValueAnimator r1 = r1.q
            r1.start()
        L10:
            return
    }

    public final void t() {
            r6 = this;
            android.widget.AutoCompleteTextView r0 = r6.h
            if (r0 != 0) goto L5
            return
        L5:
            long r0 = android.os.SystemClock.uptimeMillis()
            long r2 = r6.o
            long r0 = r0 - r2
            r2 = 0
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r3 = 0
            if (r2 < 0) goto L19
            r4 = 300(0x12c, double:1.48E-321)
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 <= 0) goto L1b
        L19:
            r6.m = r3
        L1b:
            boolean r0 = r6.m
            if (r0 != 0) goto L39
            boolean r0 = r6.n
            r0 = r0 ^ 1
            r6.s(r0)
            boolean r0 = r6.n
            android.widget.AutoCompleteTextView r1 = r6.h
            if (r0 == 0) goto L35
            r1.requestFocus()
            android.widget.AutoCompleteTextView r6 = r6.h
            r6.showDropDown()
            return
        L35:
            r1.dismissDropDown()
            return
        L39:
            r6.m = r3
            return
    }
}
