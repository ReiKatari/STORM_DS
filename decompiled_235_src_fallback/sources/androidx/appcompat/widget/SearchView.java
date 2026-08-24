package androidx.appcompat.widget;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class SearchView extends defpackage.dv3 implements defpackage.zs0 {
    public static final defpackage.f74 e1 = null;
    public final int[] A0;
    public final int[] B0;
    public final android.widget.ImageView C0;
    public final android.graphics.drawable.Drawable D0;
    public final int E0;
    public final int F0;
    public final android.content.Intent G0;
    public final android.content.Intent H0;
    public final java.lang.CharSequence I0;
    public defpackage.t86 J0;
    public android.view.View.OnFocusChangeListener K0;
    public android.view.View.OnClickListener L0;
    public boolean M0;
    public boolean N0;
    public defpackage.z71 O0;
    public boolean P0;
    public java.lang.CharSequence Q0;
    public boolean R0;
    public boolean S0;
    public int T0;
    public boolean U0;
    public java.lang.String V0;
    public java.lang.CharSequence W0;
    public boolean X0;
    public int Y0;
    public android.app.SearchableInfo Z0;
    public android.os.Bundle a1;
    public final defpackage.p86 b1;
    public final defpackage.p86 c1;
    public final java.util.WeakHashMap d1;
    public final androidx.appcompat.widget.SearchView.SearchAutoComplete o0;
    public final android.view.View p0;
    public final android.view.View q0;
    public final android.view.View r0;
    public final android.widget.ImageView s0;
    public final android.widget.ImageView t0;
    public final android.widget.ImageView u0;
    public final android.widget.ImageView v0;
    public final android.view.View w0;
    public defpackage.w86 x0;
    public final android.graphics.Rect y0;
    public final android.graphics.Rect z0;

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    /* loaded from: classes.dex */
    public static class SearchAutoComplete extends defpackage.kq {
        public int d0;
        public androidx.appcompat.widget.SearchView e0;
        public boolean f0;
        public final androidx.appcompat.widget.d g0;

        public SearchAutoComplete(android.content.Context r1, android.util.AttributeSet r2) {
                r0 = this;
                r0.<init>(r1, r2)
                androidx.appcompat.widget.d r1 = new androidx.appcompat.widget.d
                r1.<init>(r0)
                r0.g0 = r1
                int r1 = r0.getThreshold()
                r0.d0 = r1
                return
        }

        private int getSearchViewTextMinWidthDp() {
                r3 = this;
                android.content.res.Resources r3 = r3.getResources()
                android.content.res.Configuration r3 = r3.getConfiguration()
                int r0 = r3.screenWidthDp
                int r1 = r3.screenHeightDp
                r2 = 960(0x3c0, float:1.345E-42)
                if (r0 < r2) goto L1c
                r2 = 720(0x2d0, float:1.009E-42)
                if (r1 < r2) goto L1c
                int r3 = r3.orientation
                r2 = 2
                if (r3 != r2) goto L1c
                r3 = 256(0x100, float:3.59E-43)
                return r3
            L1c:
                r3 = 600(0x258, float:8.41E-43)
                if (r0 >= r3) goto L2c
                r3 = 640(0x280, float:8.97E-43)
                if (r0 < r3) goto L29
                r3 = 480(0x1e0, float:6.73E-43)
                if (r1 < r3) goto L29
                goto L2c
            L29:
                r3 = 160(0xa0, float:2.24E-43)
                return r3
            L2c:
                r3 = 192(0xc0, float:2.69E-43)
                return r3
        }

        public final void a() {
                r2 = this;
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 29
                if (r0 < r1) goto L14
                r0 = 1
                androidx.appcompat.widget.c.b(r2, r0)
                boolean r0 = r2.enoughToFilter()
                if (r0 == 0) goto L29
                r2.showDropDown()
                return
            L14:
                f74 r0 = androidx.appcompat.widget.SearchView.e1
                r0.getClass()
                defpackage.f74.a()
                java.lang.reflect.Method r0 = r0.c
                if (r0 == 0) goto L29
                java.lang.Boolean r1 = java.lang.Boolean.TRUE     // Catch: java.lang.Exception -> L29
                java.lang.Object[] r1 = new java.lang.Object[]{r1}     // Catch: java.lang.Exception -> L29
                r0.invoke(r2, r1)     // Catch: java.lang.Exception -> L29
            L29:
                return
        }

        @Override // android.widget.AutoCompleteTextView
        public final boolean enoughToFilter() {
                r1 = this;
                int r0 = r1.d0
                if (r0 <= 0) goto Ld
                boolean r1 = super.enoughToFilter()
                if (r1 == 0) goto Lb
                goto Ld
            Lb:
                r1 = 0
                return r1
            Ld:
                r1 = 1
                return r1
        }

        @Override // defpackage.kq, android.widget.TextView, android.view.View
        public final android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo r2) {
                r1 = this;
                android.view.inputmethod.InputConnection r2 = super.onCreateInputConnection(r2)
                boolean r0 = r1.f0
                if (r0 == 0) goto L10
                androidx.appcompat.widget.d r0 = r1.g0
                r1.removeCallbacks(r0)
                r1.post(r0)
            L10:
                return r2
        }

        @Override // android.view.View
        public final void onFinishInflate() {
                r3 = this;
                super.onFinishInflate()
                android.content.res.Resources r0 = r3.getResources()
                android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
                int r1 = r3.getSearchViewTextMinWidthDp()
                float r1 = (float) r1
                r2 = 1
                float r0 = android.util.TypedValue.applyDimension(r2, r1, r0)
                int r0 = (int) r0
                r3.setMinWidth(r0)
                return
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final void onFocusChanged(boolean r1, int r2, android.graphics.Rect r3) {
                r0 = this;
                super.onFocusChanged(r1, r2, r3)
                androidx.appcompat.widget.SearchView r0 = r0.e0
                boolean r1 = r0.N0
                r0.w(r1)
                p86 r1 = r0.b1
                r0.post(r1)
                androidx.appcompat.widget.SearchView$SearchAutoComplete r1 = r0.o0
                boolean r1 = r1.hasFocus()
                if (r1 == 0) goto L1a
                r0.l()
            L1a:
                return
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final boolean onKeyPreIme(int r3, android.view.KeyEvent r4) {
                r2 = this;
                r0 = 4
                if (r3 != r0) goto L3f
                int r0 = r4.getAction()
                r1 = 1
                if (r0 != 0) goto L1a
                int r0 = r4.getRepeatCount()
                if (r0 != 0) goto L1a
                android.view.KeyEvent$DispatcherState r3 = r2.getKeyDispatcherState()
                if (r3 == 0) goto L19
                r3.startTracking(r4, r2)
            L19:
                return r1
            L1a:
                int r0 = r4.getAction()
                if (r0 != r1) goto L3f
                android.view.KeyEvent$DispatcherState r0 = r2.getKeyDispatcherState()
                if (r0 == 0) goto L29
                r0.handleUpEvent(r4)
            L29:
                boolean r0 = r4.isTracking()
                if (r0 == 0) goto L3f
                boolean r0 = r4.isCanceled()
                if (r0 != 0) goto L3f
                androidx.appcompat.widget.SearchView r3 = r2.e0
                r3.clearFocus()
                r3 = 0
                r2.setImeVisibility(r3)
                return r1
            L3f:
                boolean r2 = super.onKeyPreIme(r3, r4)
                return r2
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final void onWindowFocusChanged(boolean r2) {
                r1 = this;
                super.onWindowFocusChanged(r2)
                if (r2 == 0) goto L2c
                androidx.appcompat.widget.SearchView r2 = r1.e0
                boolean r2 = r2.hasFocus()
                if (r2 == 0) goto L2c
                int r2 = r1.getVisibility()
                if (r2 != 0) goto L2c
                r2 = 1
                r1.f0 = r2
                android.content.Context r2 = r1.getContext()
                f74 r0 = androidx.appcompat.widget.SearchView.e1
                android.content.res.Resources r2 = r2.getResources()
                android.content.res.Configuration r2 = r2.getConfiguration()
                int r2 = r2.orientation
                r0 = 2
                if (r2 != r0) goto L2c
                r1.a()
            L2c:
                return
        }

        @Override // android.widget.AutoCompleteTextView
        public final void performCompletion() {
                r0 = this;
                return
        }

        @Override // android.widget.AutoCompleteTextView
        public final void replaceText(java.lang.CharSequence r1) {
                r0 = this;
                return
        }

        public void setImeVisibility(boolean r4) {
                r3 = this;
                android.content.Context r0 = r3.getContext()
                java.lang.String r1 = "input_method"
                java.lang.Object r0 = r0.getSystemService(r1)
                android.view.inputmethod.InputMethodManager r0 = (android.view.inputmethod.InputMethodManager) r0
                androidx.appcompat.widget.d r1 = r3.g0
                r2 = 0
                if (r4 != 0) goto L1e
                r3.f0 = r2
                r3.removeCallbacks(r1)
                android.os.IBinder r3 = r3.getWindowToken()
                r0.hideSoftInputFromWindow(r3, r2)
                return
            L1e:
                boolean r4 = r0.isActive(r3)
                if (r4 == 0) goto L2d
                r3.f0 = r2
                r3.removeCallbacks(r1)
                r0.showSoftInput(r3, r2)
                return
            L2d:
                r4 = 1
                r3.f0 = r4
                return
        }

        public void setSearchView(androidx.appcompat.widget.SearchView r1) {
                r0 = this;
                r0.e0 = r1
                return
        }

        @Override // android.widget.AutoCompleteTextView
        public void setThreshold(int r1) {
                r0 = this;
                super.setThreshold(r1)
                r0.d0 = r1
                return
        }
    }

    static {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            r2 = 0
            if (r0 >= r1) goto L40
            f74 r0 = new f74
            java.lang.Class<android.widget.AutoCompleteTextView> r1 = android.widget.AutoCompleteTextView.class
            r0.<init>()
            r0.a = r2
            r0.b = r2
            r0.c = r2
            defpackage.f74.a()
            r3 = 1
            java.lang.String r4 = "doBeforeTextChanged"
            java.lang.reflect.Method r4 = r1.getDeclaredMethod(r4, r2)     // Catch: java.lang.NoSuchMethodException -> L23
            r0.a = r4     // Catch: java.lang.NoSuchMethodException -> L23
            r4.setAccessible(r3)     // Catch: java.lang.NoSuchMethodException -> L23
        L23:
            java.lang.String r4 = "doAfterTextChanged"
            java.lang.reflect.Method r2 = r1.getDeclaredMethod(r4, r2)     // Catch: java.lang.NoSuchMethodException -> L2e
            r0.b = r2     // Catch: java.lang.NoSuchMethodException -> L2e
            r2.setAccessible(r3)     // Catch: java.lang.NoSuchMethodException -> L2e
        L2e:
            java.lang.String r2 = "ensureImeVisible"
            java.lang.Class r4 = java.lang.Boolean.TYPE     // Catch: java.lang.NoSuchMethodException -> L3f
            java.lang.Class[] r4 = new java.lang.Class[]{r4}     // Catch: java.lang.NoSuchMethodException -> L3f
            java.lang.reflect.Method r1 = r1.getMethod(r2, r4)     // Catch: java.lang.NoSuchMethodException -> L3f
            r0.c = r1     // Catch: java.lang.NoSuchMethodException -> L3f
            r1.setAccessible(r3)     // Catch: java.lang.NoSuchMethodException -> L3f
        L3f:
            r2 = r0
        L40:
            androidx.appcompat.widget.SearchView.e1 = r2
            return
    }

    public SearchView(android.content.Context r19) {
            r18 = this;
            r0 = r18
            r1 = r19
            r3 = 0
            r5 = 2130969712(0x7f040470, float:1.7548114E38)
            r0.<init>(r1, r3, r5)
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            r0.y0 = r2
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            r0.z0 = r2
            r6 = 2
            int[] r2 = new int[r6]
            r0.A0 = r2
            int[] r2 = new int[r6]
            r0.B0 = r2
            p86 r2 = new p86
            r7 = 0
            r2.<init>(r0, r7)
            r0.b1 = r2
            p86 r2 = new p86
            r8 = 1
            r2.<init>(r0, r8)
            r0.c1 = r2
            java.util.WeakHashMap r2 = new java.util.WeakHashMap
            r2.<init>()
            r0.d1 = r2
            androidx.appcompat.widget.a r9 = new androidx.appcompat.widget.a
            r9.<init>(r0)
            androidx.appcompat.widget.b r10 = new androidx.appcompat.widget.b
            r10.<init>(r0)
            r86 r11 = new r86
            r11.<init>(r0)
            as r12 = new as
            r12.<init>(r0, r6)
            np1 r13 = new np1
            r2 = 3
            r13.<init>(r0, r2)
            o86 r14 = new o86
            r14.<init>(r0)
            m44 r15 = new m44
            int[] r2 = defpackage.m75.u
            android.content.res.TypedArray r4 = r1.obtainStyledAttributes(r3, r2, r5, r7)
            r15.<init>(r1, r4)
            defpackage.ao7.m(r0, r1, r2, r3, r4, r5)
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r19)
            r2 = 19
            r3 = 2131623961(0x7f0e0019, float:1.8875088E38)
            int r2 = r4.getResourceId(r2, r3)
            r1.inflate(r2, r0, r8)
            r1 = 2131427869(0x7f0b021d, float:1.8477366E38)
            android.view.View r1 = r0.findViewById(r1)
            androidx.appcompat.widget.SearchView$SearchAutoComplete r1 = (androidx.appcompat.widget.SearchView.SearchAutoComplete) r1
            r0.o0 = r1
            r1.setSearchView(r0)
            r2 = 2131427865(0x7f0b0219, float:1.8477358E38)
            android.view.View r2 = r0.findViewById(r2)
            r0.p0 = r2
            r2 = 2131427868(0x7f0b021c, float:1.8477364E38)
            android.view.View r2 = r0.findViewById(r2)
            r0.q0 = r2
            r3 = 2131427925(0x7f0b0255, float:1.847748E38)
            android.view.View r3 = r0.findViewById(r3)
            r0.r0 = r3
            r5 = 2131427863(0x7f0b0217, float:1.8477354E38)
            android.view.View r5 = r0.findViewById(r5)
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            r0.s0 = r5
            r6 = 2131427866(0x7f0b021a, float:1.847736E38)
            android.view.View r6 = r0.findViewById(r6)
            android.widget.ImageView r6 = (android.widget.ImageView) r6
            r0.t0 = r6
            r8 = 2131427864(0x7f0b0218, float:1.8477356E38)
            android.view.View r8 = r0.findViewById(r8)
            android.widget.ImageView r8 = (android.widget.ImageView) r8
            r0.u0 = r8
            r7 = 2131427870(0x7f0b021e, float:1.8477368E38)
            android.view.View r7 = r0.findViewById(r7)
            android.widget.ImageView r7 = (android.widget.ImageView) r7
            r0.v0 = r7
            r16 = r10
            r10 = 2131427867(0x7f0b021b, float:1.8477362E38)
            android.view.View r10 = r0.findViewById(r10)
            android.widget.ImageView r10 = (android.widget.ImageView) r10
            r0.C0 = r10
            r17 = r13
            r13 = 20
            android.graphics.drawable.Drawable r13 = r15.k(r13)
            r2.setBackground(r13)
            r2 = 25
            android.graphics.drawable.Drawable r2 = r15.k(r2)
            r3.setBackground(r2)
            r2 = 23
            android.graphics.drawable.Drawable r3 = r15.k(r2)
            r5.setImageDrawable(r3)
            r3 = 15
            android.graphics.drawable.Drawable r3 = r15.k(r3)
            r6.setImageDrawable(r3)
            r3 = 12
            android.graphics.drawable.Drawable r3 = r15.k(r3)
            r8.setImageDrawable(r3)
            r3 = 28
            android.graphics.drawable.Drawable r3 = r15.k(r3)
            r7.setImageDrawable(r3)
            android.graphics.drawable.Drawable r2 = r15.k(r2)
            r10.setImageDrawable(r2)
            r2 = 22
            android.graphics.drawable.Drawable r2 = r15.k(r2)
            r0.D0 = r2
            android.content.res.Resources r2 = r0.getResources()
            r3 = 2131951637(0x7f130015, float:1.9539694E38)
            java.lang.String r2 = r2.getString(r3)
            defpackage.bl2.R(r5, r2)
            r2 = 26
            r3 = 2131623960(0x7f0e0018, float:1.8875086E38)
            int r2 = r4.getResourceId(r2, r3)
            r0.E0 = r2
            r2 = 13
            r3 = 0
            int r2 = r4.getResourceId(r2, r3)
            r0.F0 = r2
            r5.setOnClickListener(r9)
            r8.setOnClickListener(r9)
            r6.setOnClickListener(r9)
            r7.setOnClickListener(r9)
            r1.setOnClickListener(r9)
            r1.addTextChangedListener(r14)
            r1.setOnEditorActionListener(r11)
            r1.setOnItemClickListener(r12)
            r2 = r17
            r1.setOnItemSelectedListener(r2)
            r2 = r16
            r1.setOnKeyListener(r2)
            q86 r2 = new q86
            r2.<init>(r0)
            r1.setOnFocusChangeListener(r2)
            r2 = 18
            r3 = 1
            boolean r2 = r4.getBoolean(r2, r3)
            r0.setIconifiedByDefault(r2)
            r2 = -1
            r3 = 2
            int r3 = r4.getDimensionPixelSize(r3, r2)
            if (r3 == r2) goto L180
            r0.setMaxWidth(r3)
        L180:
            r3 = 14
            java.lang.CharSequence r3 = r4.getText(r3)
            r0.I0 = r3
            r3 = 21
            java.lang.CharSequence r3 = r4.getText(r3)
            r0.Q0 = r3
            r3 = 6
            int r3 = r4.getInt(r3, r2)
            if (r3 == r2) goto L19a
            r0.setImeOptions(r3)
        L19a:
            r3 = 5
            int r3 = r4.getInt(r3, r2)
            if (r3 == r2) goto L1a4
            r0.setInputType(r3)
        L1a4:
            r3 = 1
            boolean r2 = r4.getBoolean(r3, r3)
            r0.setFocusable(r2)
            r15.D()
            android.content.Intent r2 = new android.content.Intent
            java.lang.String r3 = "android.speech.action.WEB_SEARCH"
            r2.<init>(r3)
            r0.G0 = r2
            r3 = 268435456(0x10000000, float:2.524355E-29)
            r2.addFlags(r3)
            java.lang.String r4 = "android.speech.extra.LANGUAGE_MODEL"
            java.lang.String r5 = "web_search"
            r2.putExtra(r4, r5)
            android.content.Intent r2 = new android.content.Intent
            java.lang.String r4 = "android.speech.action.RECOGNIZE_SPEECH"
            r2.<init>(r4)
            r0.H0 = r2
            r2.addFlags(r3)
            int r1 = r1.getDropDownAnchor()
            android.view.View r1 = r0.findViewById(r1)
            r0.w0 = r1
            if (r1 == 0) goto L1e5
            d60 r2 = new d60
            r3 = 1
            r2.<init>(r0, r3)
            r1.addOnLayoutChangeListener(r2)
        L1e5:
            boolean r1 = r0.M0
            r0.w(r1)
            r0.t()
            return
    }

    private int getPreferredHeight() {
            r1 = this;
            android.content.Context r1 = r1.getContext()
            android.content.res.Resources r1 = r1.getResources()
            r0 = 2131165238(0x7f070036, float:1.7944687E38)
            int r1 = r1.getDimensionPixelSize(r0)
            return r1
    }

    private int getPreferredWidth() {
            r1 = this;
            android.content.Context r1 = r1.getContext()
            android.content.res.Resources r1 = r1.getResources()
            r0 = 2131165239(0x7f070037, float:1.794469E38)
            int r1 = r1.getDimensionPixelSize(r0)
            return r1
    }

    private void setQuery(java.lang.CharSequence r2) {
            r1 = this;
            androidx.appcompat.widget.SearchView$SearchAutoComplete r1 = r1.o0
            r1.setText(r2)
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 == 0) goto Ld
            r2 = 0
            goto L11
        Ld:
            int r2 = r2.length()
        L11:
            r1.setSelection(r2)
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void clearFocus() {
            r2 = this;
            r0 = 1
            r2.S0 = r0
            super.clearFocus()
            androidx.appcompat.widget.SearchView$SearchAutoComplete r0 = r2.o0
            r0.clearFocus()
            r1 = 0
            r0.setImeVisibility(r1)
            r2.S0 = r1
            return
    }

    public int getImeOptions() {
            r0 = this;
            androidx.appcompat.widget.SearchView$SearchAutoComplete r0 = r0.o0
            int r0 = r0.getImeOptions()
            return r0
    }

    public int getInputType() {
            r0 = this;
            androidx.appcompat.widget.SearchView$SearchAutoComplete r0 = r0.o0
            int r0 = r0.getInputType()
            return r0
    }

    public int getMaxWidth() {
            r0 = this;
            int r0 = r0.T0
            return r0
    }

    public java.lang.CharSequence getQuery() {
            r0 = this;
            androidx.appcompat.widget.SearchView$SearchAutoComplete r0 = r0.o0
            android.text.Editable r0 = r0.getText()
            return r0
    }

    public java.lang.CharSequence getQueryHint() {
            r1 = this;
            java.lang.CharSequence r0 = r1.Q0
            if (r0 == 0) goto L5
            return r0
        L5:
            android.app.SearchableInfo r0 = r1.Z0
            if (r0 == 0) goto L1e
            int r0 = r0.getHintId()
            if (r0 == 0) goto L1e
            android.content.Context r0 = r1.getContext()
            android.app.SearchableInfo r1 = r1.Z0
            int r1 = r1.getHintId()
            java.lang.CharSequence r1 = r0.getText(r1)
            return r1
        L1e:
            java.lang.CharSequence r1 = r1.I0
            return r1
    }

    public int getSuggestionCommitIconResId() {
            r0 = this;
            int r0 = r0.F0
            return r0
    }

    public int getSuggestionRowLayout() {
            r0 = this;
            int r0 = r0.E0
            return r0
    }

    public defpackage.z71 getSuggestionsAdapter() {
            r0 = this;
            z71 r0 = r0.O0
            return r0
    }

    public final android.content.Intent j(android.net.Uri r2, java.lang.String r3, java.lang.String r4, java.lang.String r5) {
            r1 = this;
            android.content.Intent r0 = new android.content.Intent
            r0.<init>(r3)
            r3 = 268435456(0x10000000, float:2.524355E-29)
            r0.addFlags(r3)
            if (r2 == 0) goto Lf
            r0.setData(r2)
        Lf:
            java.lang.String r2 = "user_query"
            java.lang.CharSequence r3 = r1.W0
            r0.putExtra(r2, r3)
            if (r5 == 0) goto L1d
            java.lang.String r2 = "query"
            r0.putExtra(r2, r5)
        L1d:
            if (r4 == 0) goto L24
            java.lang.String r2 = "intent_extra_data_key"
            r0.putExtra(r2, r4)
        L24:
            android.os.Bundle r2 = r1.a1
            if (r2 == 0) goto L2d
            java.lang.String r3 = "app_data"
            r0.putExtra(r3, r2)
        L2d:
            android.app.SearchableInfo r1 = r1.Z0
            android.content.ComponentName r1 = r1.getSearchActivity()
            r0.setComponent(r1)
            return r0
    }

    public final android.content.Intent k(android.content.Intent r8, android.app.SearchableInfo r9) {
            r7 = this;
            android.content.ComponentName r0 = r9.getSearchActivity()
            android.content.Intent r1 = new android.content.Intent
            java.lang.String r2 = "android.intent.action.SEARCH"
            r1.<init>(r2)
            r1.setComponent(r0)
            android.content.Context r2 = r7.getContext()
            r3 = 0
            r4 = 1107296256(0x42000000, float:32.0)
            android.app.PendingIntent r1 = android.app.PendingIntent.getActivity(r2, r3, r1, r4)
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            android.os.Bundle r3 = r7.a1
            if (r3 == 0) goto L27
            java.lang.String r4 = "app_data"
            r2.putParcelable(r4, r3)
        L27:
            android.content.Intent r3 = new android.content.Intent
            r3.<init>(r8)
            android.content.res.Resources r7 = r7.getResources()
            int r8 = r9.getVoiceLanguageModeId()
            if (r8 == 0) goto L3f
            int r8 = r9.getVoiceLanguageModeId()
            java.lang.String r8 = r7.getString(r8)
            goto L41
        L3f:
            java.lang.String r8 = "free_form"
        L41:
            int r4 = r9.getVoicePromptTextId()
            r5 = 0
            if (r4 == 0) goto L51
            int r4 = r9.getVoicePromptTextId()
            java.lang.String r4 = r7.getString(r4)
            goto L52
        L51:
            r4 = r5
        L52:
            int r6 = r9.getVoiceLanguageId()
            if (r6 == 0) goto L61
            int r6 = r9.getVoiceLanguageId()
            java.lang.String r7 = r7.getString(r6)
            goto L62
        L61:
            r7 = r5
        L62:
            int r6 = r9.getVoiceMaxResults()
            if (r6 == 0) goto L6d
            int r9 = r9.getVoiceMaxResults()
            goto L6e
        L6d:
            r9 = 1
        L6e:
            java.lang.String r6 = "android.speech.extra.LANGUAGE_MODEL"
            r3.putExtra(r6, r8)
            java.lang.String r8 = "android.speech.extra.PROMPT"
            r3.putExtra(r8, r4)
            java.lang.String r8 = "android.speech.extra.LANGUAGE"
            r3.putExtra(r8, r7)
            java.lang.String r7 = "android.speech.extra.MAX_RESULTS"
            r3.putExtra(r7, r9)
            if (r0 != 0) goto L85
            goto L89
        L85:
            java.lang.String r5 = r0.flattenToShortString()
        L89:
            java.lang.String r7 = "calling_package"
            r3.putExtra(r7, r5)
            java.lang.String r7 = "android.speech.extra.RESULTS_PENDINGINTENT"
            r3.putExtra(r7, r1)
            java.lang.String r7 = "android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE"
            r3.putExtra(r7, r2)
            return r3
    }

    public final void l() {
            r3 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            androidx.appcompat.widget.SearchView$SearchAutoComplete r3 = r3.o0
            if (r0 < r1) goto Lc
            androidx.appcompat.widget.c.a(r3)
            return
        Lc:
            f74 r0 = androidx.appcompat.widget.SearchView.e1
            r0.getClass()
            defpackage.f74.a()
            java.lang.reflect.Method r1 = r0.a
            r2 = 0
            if (r1 == 0) goto L1c
            r1.invoke(r3, r2)     // Catch: java.lang.Exception -> L1c
        L1c:
            r0.getClass()
            defpackage.f74.a()
            java.lang.reflect.Method r0 = r0.b
            if (r0 == 0) goto L29
            r0.invoke(r3, r2)     // Catch: java.lang.Exception -> L29
        L29:
            return
    }

    public final void m() {
            r3 = this;
            androidx.appcompat.widget.SearchView$SearchAutoComplete r0 = r3.o0
            android.text.Editable r1 = r0.getText()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            r2 = 1
            if (r1 == 0) goto L18
            boolean r0 = r3.M0
            if (r0 == 0) goto L17
            r3.clearFocus()
            r3.w(r2)
        L17:
            return
        L18:
            java.lang.String r3 = ""
            r0.setText(r3)
            r0.requestFocus()
            r0.setImeVisibility(r2)
            return
    }

    public final void n(int r7) {
            r6 = this;
            java.lang.String r0 = "SearchView"
            z71 r1 = r6.O0
            android.database.Cursor r1 = r1.L
            if (r1 == 0) goto Lbc
            boolean r7 = r1.moveToPosition(r7)
            if (r7 == 0) goto Lbc
            r7 = 0
            int r2 = defpackage.du6.t0     // Catch: java.lang.RuntimeException -> L24
            java.lang.String r2 = "suggest_intent_action"
            int r2 = r1.getColumnIndex(r2)     // Catch: java.lang.RuntimeException -> L24
            java.lang.String r2 = defpackage.du6.h(r1, r2)     // Catch: java.lang.RuntimeException -> L24
            if (r2 != 0) goto L26
            android.app.SearchableInfo r2 = r6.Z0     // Catch: java.lang.RuntimeException -> L24
            java.lang.String r2 = r2.getSuggestIntentAction()     // Catch: java.lang.RuntimeException -> L24
            goto L26
        L24:
            r2 = move-exception
            goto L83
        L26:
            if (r2 != 0) goto L2a
            java.lang.String r2 = "android.intent.action.SEARCH"
        L2a:
            java.lang.String r3 = "suggest_intent_data"
            int r3 = r1.getColumnIndex(r3)     // Catch: java.lang.RuntimeException -> L24
            java.lang.String r3 = defpackage.du6.h(r1, r3)     // Catch: java.lang.RuntimeException -> L24
            if (r3 != 0) goto L3c
            android.app.SearchableInfo r3 = r6.Z0     // Catch: java.lang.RuntimeException -> L24
            java.lang.String r3 = r3.getSuggestIntentData()     // Catch: java.lang.RuntimeException -> L24
        L3c:
            if (r3 == 0) goto L62
            java.lang.String r4 = "suggest_intent_data_id"
            int r4 = r1.getColumnIndex(r4)     // Catch: java.lang.RuntimeException -> L24
            java.lang.String r4 = defpackage.du6.h(r1, r4)     // Catch: java.lang.RuntimeException -> L24
            if (r4 == 0) goto L62
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.RuntimeException -> L24
            r5.<init>()     // Catch: java.lang.RuntimeException -> L24
            r5.append(r3)     // Catch: java.lang.RuntimeException -> L24
            java.lang.String r3 = "/"
            r5.append(r3)     // Catch: java.lang.RuntimeException -> L24
            java.lang.String r3 = android.net.Uri.encode(r4)     // Catch: java.lang.RuntimeException -> L24
            r5.append(r3)     // Catch: java.lang.RuntimeException -> L24
            java.lang.String r3 = r5.toString()     // Catch: java.lang.RuntimeException -> L24
        L62:
            if (r3 != 0) goto L66
            r3 = r7
            goto L6a
        L66:
            android.net.Uri r3 = android.net.Uri.parse(r3)     // Catch: java.lang.RuntimeException -> L24
        L6a:
            java.lang.String r4 = "suggest_intent_query"
            int r4 = r1.getColumnIndex(r4)     // Catch: java.lang.RuntimeException -> L24
            java.lang.String r4 = defpackage.du6.h(r1, r4)     // Catch: java.lang.RuntimeException -> L24
            java.lang.String r5 = "suggest_intent_extra_data"
            int r5 = r1.getColumnIndex(r5)     // Catch: java.lang.RuntimeException -> L24
            java.lang.String r5 = defpackage.du6.h(r1, r5)     // Catch: java.lang.RuntimeException -> L24
            android.content.Intent r7 = r6.j(r3, r2, r5, r4)     // Catch: java.lang.RuntimeException -> L24
            goto L9f
        L83:
            int r1 = r1.getPosition()     // Catch: java.lang.RuntimeException -> L88
            goto L89
        L88:
            r1 = -1
        L89:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Search suggestions cursor at row "
            r3.<init>(r4)
            r3.append(r1)
            java.lang.String r1 = " returned exception."
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            android.util.Log.w(r0, r1, r2)
        L9f:
            if (r7 != 0) goto La2
            goto Lbc
        La2:
            android.content.Context r1 = r6.getContext()     // Catch: java.lang.RuntimeException -> Laa
            r1.startActivity(r7)     // Catch: java.lang.RuntimeException -> Laa
            goto Lbc
        Laa:
            r1 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Failed launch activity: "
            r2.<init>(r3)
            r2.append(r7)
            java.lang.String r7 = r2.toString()
            android.util.Log.e(r0, r7, r1)
        Lbc:
            r7 = 0
            androidx.appcompat.widget.SearchView$SearchAutoComplete r6 = r6.o0
            r6.setImeVisibility(r7)
            r6.dismissDropDown()
            return
    }

    public final void o(int r3) {
            r2 = this;
            androidx.appcompat.widget.SearchView$SearchAutoComplete r0 = r2.o0
            android.text.Editable r0 = r0.getText()
            z71 r1 = r2.O0
            android.database.Cursor r1 = r1.L
            if (r1 != 0) goto Ld
            goto L26
        Ld:
            boolean r3 = r1.moveToPosition(r3)
            if (r3 == 0) goto L23
            z71 r3 = r2.O0
            java.lang.String r3 = r3.c(r1)
            if (r3 == 0) goto L1f
            r2.setQuery(r3)
            goto L26
        L1f:
            r2.setQuery(r0)
            goto L26
        L23:
            r2.setQuery(r0)
        L26:
            return
    }

    @Override // defpackage.zs0
    public final void onActionViewCollapsed() {
            r3 = this;
            androidx.appcompat.widget.SearchView$SearchAutoComplete r0 = r3.o0
            java.lang.String r1 = ""
            r0.setText(r1)
            int r2 = r0.length()
            r0.setSelection(r2)
            r3.W0 = r1
            r3.clearFocus()
            r1 = 1
            r3.w(r1)
            int r1 = r3.Y0
            r0.setImeOptions(r1)
            r0 = 0
            r3.X0 = r0
            return
    }

    @Override // defpackage.zs0
    public final void onActionViewExpanded() {
            r3 = this;
            boolean r0 = r3.X0
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            r3.X0 = r0
            androidx.appcompat.widget.SearchView$SearchAutoComplete r0 = r3.o0
            int r1 = r0.getImeOptions()
            r3.Y0 = r1
            r2 = 33554432(0x2000000, float:9.403955E-38)
            r1 = r1 | r2
            r0.setImeOptions(r1)
            java.lang.String r1 = ""
            r0.setText(r1)
            r0 = 0
            r3.setIconified(r0)
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
            r1 = this;
            p86 r0 = r1.b1
            r1.removeCallbacks(r0)
            p86 r0 = r1.c1
            r1.post(r0)
            super.onDetachedFromWindow()
            return
    }

    @Override // defpackage.dv3, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean r5, int r6, int r7, int r8, int r9) {
            r4 = this;
            super.onLayout(r5, r6, r7, r8, r9)
            if (r5 == 0) goto L5a
            androidx.appcompat.widget.SearchView$SearchAutoComplete r5 = r4.o0
            int[] r6 = r4.A0
            r5.getLocationInWindow(r6)
            int[] r8 = r4.B0
            r4.getLocationInWindow(r8)
            r0 = 1
            r1 = r6[r0]
            r0 = r8[r0]
            int r1 = r1 - r0
            r0 = 0
            r6 = r6[r0]
            r8 = r8[r0]
            int r6 = r6 - r8
            int r8 = r5.getWidth()
            int r8 = r8 + r6
            int r2 = r5.getHeight()
            int r2 = r2 + r1
            android.graphics.Rect r3 = r4.y0
            r3.set(r6, r1, r8, r2)
            int r6 = r3.left
            int r8 = r3.right
            int r9 = r9 - r7
            android.graphics.Rect r7 = r4.z0
            r7.set(r6, r0, r8, r9)
            w86 r6 = r4.x0
            if (r6 != 0) goto L45
            w86 r6 = new w86
            r6.<init>(r5, r7, r3)
            r4.x0 = r6
            r4.setTouchDelegate(r6)
            return
        L45:
            android.graphics.Rect r4 = r6.b
            r4.set(r7)
            android.graphics.Rect r4 = r6.d
            r4.set(r7)
            int r5 = r6.e
            int r5 = -r5
            r4.inset(r5, r5)
            android.graphics.Rect r4 = r6.c
            r4.set(r3)
        L5a:
            return
    }

    @Override // defpackage.dv3, android.view.View
    public final void onMeasure(int r4, int r5) {
            r3 = this;
            boolean r0 = r3.N0
            if (r0 == 0) goto L8
            super.onMeasure(r4, r5)
            return
        L8:
            int r0 = android.view.View.MeasureSpec.getMode(r4)
            int r4 = android.view.View.MeasureSpec.getSize(r4)
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = 1073741824(0x40000000, float:2.0)
            if (r0 == r1) goto L2e
            if (r0 == 0) goto L24
            if (r0 == r2) goto L1b
            goto L3f
        L1b:
            int r0 = r3.T0
            if (r0 <= 0) goto L3f
            int r4 = java.lang.Math.min(r0, r4)
            goto L3f
        L24:
            int r4 = r3.T0
            if (r4 <= 0) goto L29
            goto L3f
        L29:
            int r4 = r3.getPreferredWidth()
            goto L3f
        L2e:
            int r0 = r3.T0
            if (r0 <= 0) goto L37
            int r4 = java.lang.Math.min(r0, r4)
            goto L3f
        L37:
            int r0 = r3.getPreferredWidth()
            int r4 = java.lang.Math.min(r0, r4)
        L3f:
            int r0 = android.view.View.MeasureSpec.getMode(r5)
            int r5 = android.view.View.MeasureSpec.getSize(r5)
            if (r0 == r1) goto L51
            if (r0 == 0) goto L4c
            goto L59
        L4c:
            int r5 = r3.getPreferredHeight()
            goto L59
        L51:
            int r0 = r3.getPreferredHeight()
            int r5 = java.lang.Math.min(r0, r5)
        L59:
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r2)
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r2)
            super.onMeasure(r4, r5)
            return
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(android.os.Parcelable r2) {
            r1 = this;
            boolean r0 = r2 instanceof defpackage.v86
            if (r0 != 0) goto L8
            super.onRestoreInstanceState(r2)
            return
        L8:
            v86 r2 = (defpackage.v86) r2
            android.os.Parcelable r0 = r2.A
            super.onRestoreInstanceState(r0)
            boolean r2 = r2.L
            r1.w(r2)
            r1.requestLayout()
            return
    }

    @Override // android.view.View
    public final android.os.Parcelable onSaveInstanceState() {
            r2 = this;
            android.os.Parcelable r0 = super.onSaveInstanceState()
            v86 r1 = new v86
            r1.<init>(r0)
            boolean r2 = r2.N0
            r1.L = r2
            return r1
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean r1) {
            r0 = this;
            super.onWindowFocusChanged(r1)
            p86 r1 = r0.b1
            r0.post(r1)
            return
    }

    public final void p(java.lang.CharSequence r1) {
            r0 = this;
            r0.setQuery(r1)
            return
    }

    public final void q() {
            r4 = this;
            androidx.appcompat.widget.SearchView$SearchAutoComplete r0 = r4.o0
            android.text.Editable r1 = r0.getText()
            if (r1 == 0) goto L33
            int r2 = android.text.TextUtils.getTrimmedLength(r1)
            if (r2 <= 0) goto L33
            t86 r2 = r4.J0
            if (r2 == 0) goto L16
            r1.toString()
            return
        L16:
            android.app.SearchableInfo r2 = r4.Z0
            if (r2 == 0) goto L2c
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "android.intent.action.SEARCH"
            r3 = 0
            android.content.Intent r1 = r4.j(r3, r2, r3, r1)
            android.content.Context r4 = r4.getContext()
            r4.startActivity(r1)
        L2c:
            r4 = 0
            r0.setImeVisibility(r4)
            r0.dismissDropDown()
        L33:
            return
    }

    public final void r() {
            r2 = this;
            androidx.appcompat.widget.SearchView$SearchAutoComplete r0 = r2.o0
            android.text.Editable r0 = r0.getText()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L18
            boolean r1 = r2.M0
            if (r1 == 0) goto L15
            boolean r1 = r2.X0
            if (r1 != 0) goto L15
            goto L18
        L15:
            r1 = 8
            goto L19
        L18:
            r1 = 0
        L19:
            android.widget.ImageView r2 = r2.u0
            r2.setVisibility(r1)
            android.graphics.drawable.Drawable r2 = r2.getDrawable()
            if (r2 == 0) goto L2e
            if (r0 != 0) goto L29
            int[] r0 = android.view.ViewGroup.ENABLED_STATE_SET
            goto L2b
        L29:
            int[] r0 = android.view.ViewGroup.EMPTY_STATE_SET
        L2b:
            r2.setState(r0)
        L2e:
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int r3, android.graphics.Rect r4) {
            r2 = this;
            boolean r0 = r2.S0
            r1 = 0
            if (r0 == 0) goto L6
            goto Lc
        L6:
            boolean r0 = r2.isFocusable()
            if (r0 != 0) goto Ld
        Lc:
            return r1
        Ld:
            boolean r0 = r2.N0
            if (r0 != 0) goto L1d
            androidx.appcompat.widget.SearchView$SearchAutoComplete r0 = r2.o0
            boolean r3 = r0.requestFocus(r3, r4)
            if (r3 == 0) goto L1c
            r2.w(r1)
        L1c:
            return r3
        L1d:
            boolean r2 = super.requestFocus(r3, r4)
            return r2
    }

    public final void s() {
            r2 = this;
            androidx.appcompat.widget.SearchView$SearchAutoComplete r0 = r2.o0
            boolean r0 = r0.hasFocus()
            if (r0 == 0) goto Lb
            int[] r0 = android.view.ViewGroup.FOCUSED_STATE_SET
            goto Ld
        Lb:
            int[] r0 = android.view.ViewGroup.EMPTY_STATE_SET
        Ld:
            android.view.View r1 = r2.q0
            android.graphics.drawable.Drawable r1 = r1.getBackground()
            if (r1 == 0) goto L18
            r1.setState(r0)
        L18:
            android.view.View r1 = r2.r0
            android.graphics.drawable.Drawable r1 = r1.getBackground()
            if (r1 == 0) goto L23
            r1.setState(r0)
        L23:
            r2.invalidate()
            return
    }

    public void setAppSearchData(android.os.Bundle r1) {
            r0 = this;
            r0.a1 = r1
            return
    }

    public void setIconified(boolean r2) {
            r1 = this;
            if (r2 == 0) goto L6
            r1.m()
            return
        L6:
            r2 = 0
            r1.w(r2)
            androidx.appcompat.widget.SearchView$SearchAutoComplete r2 = r1.o0
            r2.requestFocus()
            r0 = 1
            r2.setImeVisibility(r0)
            android.view.View$OnClickListener r2 = r1.L0
            if (r2 == 0) goto L1a
            r2.onClick(r1)
        L1a:
            return
    }

    public void setIconifiedByDefault(boolean r2) {
            r1 = this;
            boolean r0 = r1.M0
            if (r0 != r2) goto L5
            return
        L5:
            r1.M0 = r2
            r1.w(r2)
            r1.t()
            return
    }

    public void setImeOptions(int r1) {
            r0 = this;
            androidx.appcompat.widget.SearchView$SearchAutoComplete r0 = r0.o0
            r0.setImeOptions(r1)
            return
    }

    public void setInputType(int r1) {
            r0 = this;
            androidx.appcompat.widget.SearchView$SearchAutoComplete r0 = r0.o0
            r0.setInputType(r1)
            return
    }

    public void setMaxWidth(int r1) {
            r0 = this;
            r0.T0 = r1
            r0.requestLayout()
            return
    }

    public void setOnCloseListener(defpackage.s86 r1) {
            r0 = this;
            return
    }

    public void setOnQueryTextFocusChangeListener(android.view.View.OnFocusChangeListener r1) {
            r0 = this;
            r0.K0 = r1
            return
    }

    public void setOnQueryTextListener(defpackage.t86 r1) {
            r0 = this;
            r0.J0 = r1
            return
    }

    public void setOnSearchClickListener(android.view.View.OnClickListener r1) {
            r0 = this;
            r0.L0 = r1
            return
    }

    public void setOnSuggestionListener(defpackage.u86 r1) {
            r0 = this;
            return
    }

    public void setQueryHint(java.lang.CharSequence r1) {
            r0 = this;
            r0.Q0 = r1
            r0.t()
            return
    }

    public void setQueryRefinementEnabled(boolean r2) {
            r1 = this;
            r1.R0 = r2
            z71 r1 = r1.O0
            boolean r0 = r1 instanceof defpackage.du6
            if (r0 == 0) goto L11
            du6 r1 = (defpackage.du6) r1
            if (r2 == 0) goto Le
            r2 = 2
            goto Lf
        Le:
            r2 = 1
        Lf:
            r1.l0 = r2
        L11:
            return
    }

    public void setSearchableInfo(android.app.SearchableInfo r7) {
            r6 = this;
            r6.Z0 = r7
            r0 = 0
            r1 = 1
            androidx.appcompat.widget.SearchView$SearchAutoComplete r2 = r6.o0
            if (r7 == 0) goto L65
            int r7 = r7.getSuggestThreshold()
            r2.setThreshold(r7)
            android.app.SearchableInfo r7 = r6.Z0
            int r7 = r7.getImeOptions()
            r2.setImeOptions(r7)
            android.app.SearchableInfo r7 = r6.Z0
            int r7 = r7.getInputType()
            r3 = r7 & 15
            if (r3 != r1) goto L31
            r3 = -65537(0xfffffffffffeffff, float:NaN)
            r7 = r7 & r3
            android.app.SearchableInfo r3 = r6.Z0
            java.lang.String r3 = r3.getSuggestAuthority()
            if (r3 == 0) goto L31
            r3 = 589824(0x90000, float:8.2652E-40)
            r7 = r7 | r3
        L31:
            r2.setInputType(r7)
            z71 r7 = r6.O0
            if (r7 == 0) goto L3b
            r7.b(r0)
        L3b:
            android.app.SearchableInfo r7 = r6.Z0
            java.lang.String r7 = r7.getSuggestAuthority()
            if (r7 == 0) goto L62
            du6 r7 = new du6
            android.content.Context r3 = r6.getContext()
            android.app.SearchableInfo r4 = r6.Z0
            java.util.WeakHashMap r5 = r6.d1
            r7.<init>(r3, r6, r4, r5)
            r6.O0 = r7
            r2.setAdapter(r7)
            z71 r7 = r6.O0
            du6 r7 = (defpackage.du6) r7
            boolean r3 = r6.R0
            if (r3 == 0) goto L5f
            r3 = 2
            goto L60
        L5f:
            r3 = r1
        L60:
            r7.l0 = r3
        L62:
            r6.t()
        L65:
            android.app.SearchableInfo r7 = r6.Z0
            r3 = 0
            if (r7 == 0) goto L98
            boolean r7 = r7.getVoiceSearchEnabled()
            if (r7 == 0) goto L98
            android.app.SearchableInfo r7 = r6.Z0
            boolean r7 = r7.getVoiceSearchLaunchWebSearch()
            if (r7 == 0) goto L7b
            android.content.Intent r0 = r6.G0
            goto L85
        L7b:
            android.app.SearchableInfo r7 = r6.Z0
            boolean r7 = r7.getVoiceSearchLaunchRecognizer()
            if (r7 == 0) goto L85
            android.content.Intent r0 = r6.H0
        L85:
            if (r0 == 0) goto L98
            android.content.Context r7 = r6.getContext()
            android.content.pm.PackageManager r7 = r7.getPackageManager()
            r4 = 65536(0x10000, float:9.1835E-41)
            android.content.pm.ResolveInfo r7 = r7.resolveActivity(r0, r4)
            if (r7 == 0) goto L98
            goto L99
        L98:
            r1 = r3
        L99:
            r6.U0 = r1
            if (r1 == 0) goto La2
            java.lang.String r7 = "nm"
            r2.setPrivateImeOptions(r7)
        La2:
            boolean r7 = r6.N0
            r6.w(r7)
            return
    }

    public void setSubmitButtonEnabled(boolean r1) {
            r0 = this;
            r0.P0 = r1
            boolean r1 = r0.N0
            r0.w(r1)
            return
    }

    public void setSuggestionsAdapter(defpackage.z71 r1) {
            r0 = this;
            r0.O0 = r1
            androidx.appcompat.widget.SearchView$SearchAutoComplete r0 = r0.o0
            r0.setAdapter(r1)
            return
    }

    public final void t() {
            r7 = this;
            java.lang.CharSequence r0 = r7.getQueryHint()
            if (r0 != 0) goto L8
            java.lang.String r0 = ""
        L8:
            boolean r1 = r7.M0
            androidx.appcompat.widget.SearchView$SearchAutoComplete r2 = r7.o0
            if (r1 == 0) goto L37
            android.graphics.drawable.Drawable r7 = r7.D0
            if (r7 != 0) goto L13
            goto L37
        L13:
            float r1 = r2.getTextSize()
            double r3 = (double) r1
            r5 = 4608308318706860032(0x3ff4000000000000, double:1.25)
            double r3 = r3 * r5
            int r1 = (int) r3
            r3 = 0
            r7.setBounds(r3, r3, r1, r1)
            android.text.SpannableStringBuilder r1 = new android.text.SpannableStringBuilder
            java.lang.String r3 = "   "
            r1.<init>(r3)
            android.text.style.ImageSpan r3 = new android.text.style.ImageSpan
            r3.<init>(r7)
            r7 = 2
            r4 = 33
            r5 = 1
            r1.setSpan(r3, r5, r7, r4)
            r1.append(r0)
            r0 = r1
        L37:
            r2.setHint(r0)
            return
    }

    public final void u() {
            r1 = this;
            boolean r0 = r1.P0
            if (r0 != 0) goto L8
            boolean r0 = r1.U0
            if (r0 == 0) goto L1e
        L8:
            boolean r0 = r1.N0
            if (r0 != 0) goto L1e
            android.widget.ImageView r0 = r1.t0
            int r0 = r0.getVisibility()
            if (r0 == 0) goto L1c
            android.widget.ImageView r0 = r1.v0
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L1e
        L1c:
            r0 = 0
            goto L20
        L1e:
            r0 = 8
        L20:
            android.view.View r1 = r1.r0
            r1.setVisibility(r0)
            return
    }

    public final void v(boolean r2) {
            r1 = this;
            boolean r0 = r1.P0
            if (r0 == 0) goto L1c
            if (r0 != 0) goto La
            boolean r0 = r1.U0
            if (r0 == 0) goto L1c
        La:
            boolean r0 = r1.N0
            if (r0 != 0) goto L1c
            boolean r0 = r1.hasFocus()
            if (r0 == 0) goto L1c
            if (r2 != 0) goto L1a
            boolean r2 = r1.U0
            if (r2 != 0) goto L1c
        L1a:
            r2 = 0
            goto L1e
        L1c:
            r2 = 8
        L1e:
            android.widget.ImageView r1 = r1.t0
            r1.setVisibility(r2)
            return
    }

    public final void w(boolean r7) {
            r6 = this;
            r6.N0 = r7
            r0 = 8
            r1 = 0
            if (r7 == 0) goto L9
            r2 = r1
            goto La
        L9:
            r2 = r0
        La:
            androidx.appcompat.widget.SearchView$SearchAutoComplete r3 = r6.o0
            android.text.Editable r3 = r3.getText()
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            r4 = r3 ^ 1
            android.widget.ImageView r5 = r6.s0
            r5.setVisibility(r2)
            r6.v(r4)
            if (r7 == 0) goto L22
            r7 = r0
            goto L23
        L22:
            r7 = r1
        L23:
            android.view.View r2 = r6.p0
            r2.setVisibility(r7)
            android.widget.ImageView r7 = r6.C0
            android.graphics.drawable.Drawable r2 = r7.getDrawable()
            if (r2 == 0) goto L37
            boolean r2 = r6.M0
            if (r2 == 0) goto L35
            goto L37
        L35:
            r2 = r1
            goto L38
        L37:
            r2 = r0
        L38:
            r7.setVisibility(r2)
            r6.r()
            boolean r7 = r6.U0
            if (r7 == 0) goto L4e
            boolean r7 = r6.N0
            if (r7 != 0) goto L4e
            if (r3 == 0) goto L4e
            android.widget.ImageView r7 = r6.t0
            r7.setVisibility(r0)
            r0 = r1
        L4e:
            android.widget.ImageView r7 = r6.v0
            r7.setVisibility(r0)
            r6.u()
            return
    }
}
