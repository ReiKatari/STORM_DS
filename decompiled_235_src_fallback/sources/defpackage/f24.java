package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: f24  reason: default package */
/* loaded from: classes.dex */
public final class f24<S> extends defpackage.xw4 {
    public int B;
    public defpackage.fb0 L;
    public defpackage.i74 R;
    public defpackage.f24.a X;
    public defpackage.u63 Y;
    public androidx.recyclerview.widget.RecyclerView Z;
    public androidx.recyclerview.widget.RecyclerView d0;
    public android.view.View e0;
    public android.view.View f0;
    public android.view.View g0;
    public android.view.View h0;
    public com.google.android.material.button.MaterialButton i0;
    public android.view.accessibility.AccessibilityManager j0;

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    /* renamed from: f24$a */
    /* loaded from: classes.dex */
    public enum a extends java.lang.Enum {
        private static final /* synthetic */ defpackage.f24.a[] $VALUES = null;
        public static final defpackage.f24.a DAY = null;
        public static final defpackage.f24.a YEAR = null;

        private static /* synthetic */ defpackage.f24.a[] $values() {
                f24$a r0 = defpackage.f24.a.DAY
                f24$a r1 = defpackage.f24.a.YEAR
                f24$a[] r0 = new defpackage.f24.a[]{r0, r1}
                return r0
        }

        static {
                f24$a r0 = new f24$a
                java.lang.String r1 = "DAY"
                r2 = 0
                r0.<init>(r1, r2)
                defpackage.f24.a.DAY = r0
                f24$a r0 = new f24$a
                java.lang.String r1 = "YEAR"
                r2 = 1
                r0.<init>(r1, r2)
                defpackage.f24.a.YEAR = r0
                f24$a[] r0 = $values()
                defpackage.f24.a.$VALUES = r0
                return
        }

        a(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static defpackage.f24.a valueOf(java.lang.String r1) {
                java.lang.Class<f24$a> r0 = defpackage.f24.a.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                f24$a r1 = (defpackage.f24.a) r1
                return r1
        }

        public static defpackage.f24.a[] values() {
                f24$a[] r0 = defpackage.f24.a.$VALUES
                java.lang.Object r0 = r0.clone()
                f24$a[] r0 = (defpackage.f24.a[]) r0
                return r0
        }
    }

    public f24() {
            r0 = this;
            r0.<init>()
            return
    }

    public final void h(defpackage.i74 r7) {
            r6 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r6.d0
            wf5 r0 = r0.getAdapter()
            com.google.android.material.datepicker.c r0 = (com.google.android.material.datepicker.c) r0
            fb0 r1 = r0.d
            i74 r1 = r1.A
            int r1 = r1.d(r7)
            android.view.accessibility.AccessibilityManager r2 = r6.j0
            if (r2 == 0) goto L22
            boolean r2 = r2.isEnabled()
            if (r2 == 0) goto L22
            r6.R = r7
            androidx.recyclerview.widget.RecyclerView r7 = r6.d0
            r7.h0(r1)
            goto L72
        L22:
            i74 r2 = r6.R
            fb0 r0 = r0.d
            i74 r0 = r0.A
            int r0 = r0.d(r2)
            int r0 = r1 - r0
            int r2 = java.lang.Math.abs(r0)
            r3 = 0
            r4 = 1
            r5 = 3
            if (r2 <= r5) goto L39
            r2 = r4
            goto L3a
        L39:
            r2 = r3
        L3a:
            if (r0 <= 0) goto L3d
            r3 = r4
        L3d:
            r6.R = r7
            r7 = 2
            if (r2 == 0) goto L56
            if (r3 == 0) goto L56
            androidx.recyclerview.widget.RecyclerView r0 = r6.d0
            int r2 = r1 + (-3)
            r0.h0(r2)
            androidx.recyclerview.widget.RecyclerView r0 = r6.d0
            ub0 r2 = new ub0
            r2.<init>(r6, r1, r7)
            r0.post(r2)
            goto L72
        L56:
            androidx.recyclerview.widget.RecyclerView r0 = r6.d0
            if (r2 == 0) goto L6a
            int r2 = r1 + 3
            r0.h0(r2)
            androidx.recyclerview.widget.RecyclerView r0 = r6.d0
            ub0 r2 = new ub0
            r2.<init>(r6, r1, r7)
            r0.post(r2)
            goto L72
        L6a:
            ub0 r2 = new ub0
            r2.<init>(r6, r1, r7)
            r0.post(r2)
        L72:
            r6.j(r1)
            return
    }

    public final void i(defpackage.f24.a r5) {
            r4 = this;
            r4.X = r5
            f24$a r0 = defpackage.f24.a.YEAR
            r1 = 8
            r2 = 0
            if (r5 != r0) goto L3c
            androidx.recyclerview.widget.RecyclerView r5 = r4.Z
            gg5 r5 = r5.getLayoutManager()
            androidx.recyclerview.widget.RecyclerView r0 = r4.Z
            wf5 r0 = r0.getAdapter()
            hy7 r0 = (defpackage.hy7) r0
            i74 r3 = r4.R
            int r3 = r3.L
            f24 r0 = r0.d
            fb0 r0 = r0.L
            i74 r0 = r0.A
            int r0 = r0.L
            int r3 = r3 - r0
            r5.q0(r3)
            android.view.View r5 = r4.g0
            r5.setVisibility(r2)
            android.view.View r5 = r4.h0
            r5.setVisibility(r1)
            android.view.View r5 = r4.e0
            r5.setVisibility(r1)
            android.view.View r4 = r4.f0
            r4.setVisibility(r1)
            return
        L3c:
            f24$a r0 = defpackage.f24.a.DAY
            if (r5 != r0) goto L59
            android.view.View r5 = r4.g0
            r5.setVisibility(r1)
            android.view.View r5 = r4.h0
            r5.setVisibility(r2)
            android.view.View r5 = r4.e0
            r5.setVisibility(r2)
            android.view.View r5 = r4.f0
            r5.setVisibility(r2)
            i74 r5 = r4.R
            r4.h(r5)
        L59:
            return
    }

    public final void j(int r6) {
            r5 = this;
            android.view.View r0 = r5.f0
            int r1 = r6 + 1
            androidx.recyclerview.widget.RecyclerView r2 = r5.d0
            wf5 r2 = r2.getAdapter()
            int r2 = r2.a()
            r3 = 0
            r4 = 1
            if (r1 >= r2) goto L14
            r1 = r4
            goto L15
        L14:
            r1 = r3
        L15:
            r0.setEnabled(r1)
            android.view.View r5 = r5.e0
            int r6 = r6 - r4
            if (r6 < 0) goto L1e
            r3 = r4
        L1e:
            r5.setEnabled(r3)
            return
    }

    @Override // androidx.fragment.app.o
    public final void onCreate(android.os.Bundle r2) {
            r1 = this;
            super.onCreate(r2)
            if (r2 != 0) goto L9
            android.os.Bundle r2 = r1.getArguments()
        L9:
            java.lang.String r0 = "THEME_RES_ID_KEY"
            int r0 = r2.getInt(r0)
            r1.B = r0
            java.lang.String r0 = "GRID_SELECTOR_KEY"
            android.os.Parcelable r0 = r2.getParcelable(r0)
            if (r0 != 0) goto L3a
            java.lang.String r0 = "CALENDAR_CONSTRAINTS_KEY"
            android.os.Parcelable r0 = r2.getParcelable(r0)
            fb0 r0 = (defpackage.fb0) r0
            r1.L = r0
            java.lang.String r0 = "DAY_VIEW_DECORATOR_KEY"
            android.os.Parcelable r0 = r2.getParcelable(r0)
            if (r0 != 0) goto L36
            java.lang.String r0 = "CURRENT_MONTH_KEY"
            android.os.Parcelable r2 = r2.getParcelable(r0)
            i74 r2 = (defpackage.i74) r2
            r1.R = r2
            return
        L36:
            defpackage.u34.a()
            return
        L3a:
            defpackage.u34.a()
            return
    }

    @Override // androidx.fragment.app.o
    public final android.view.View onCreateView(android.view.LayoutInflater r11, android.view.ViewGroup r12, android.os.Bundle r13) {
            r10 = this;
            android.view.ContextThemeWrapper r13 = new android.view.ContextThemeWrapper
            android.content.Context r0 = r10.getContext()
            int r1 = r10.B
            r13.<init>(r0, r1)
            u63 r0 = new u63
            r0.<init>(r13)
            r10.Y = r0
            android.view.LayoutInflater r11 = r11.cloneInContext(r13)
            android.content.Context r0 = r10.requireContext()
            java.lang.String r1 = "accessibility"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.view.accessibility.AccessibilityManager r0 = (android.view.accessibility.AccessibilityManager) r0
            r10.j0 = r0
            fb0 r0 = r10.L
            i74 r0 = r0.A
            r1 = 16843277(0x101020d, float:2.369503E-38)
            boolean r2 = defpackage.k24.k(r13, r1)
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L38
            r2 = 2131624047(0x7f0e006f, float:1.8875263E38)
            r5 = r4
            goto L3c
        L38:
            r2 = 2131624042(0x7f0e006a, float:1.8875253E38)
            r5 = r3
        L3c:
            android.view.View r11 = r11.inflate(r2, r12, r3)
            android.content.Context r12 = r10.requireContext()
            android.content.res.Resources r12 = r12.getResources()
            r2 = 2131166066(0x7f070372, float:1.7946367E38)
            int r2 = r12.getDimensionPixelSize(r2)
            r6 = 2131166067(0x7f070373, float:1.7946369E38)
            int r6 = r12.getDimensionPixelOffset(r6)
            int r6 = r6 + r2
            r2 = 2131166065(0x7f070371, float:1.7946365E38)
            int r2 = r12.getDimensionPixelOffset(r2)
            int r2 = r2 + r6
            r6 = 2131166050(0x7f070362, float:1.7946334E38)
            int r6 = r12.getDimensionPixelSize(r6)
            int r7 = defpackage.j74.R
            r8 = 2131166045(0x7f07035d, float:1.7946324E38)
            int r8 = r12.getDimensionPixelSize(r8)
            int r8 = r8 * r7
            int r7 = r7 - r4
            r9 = 2131166064(0x7f070370, float:1.7946363E38)
            int r9 = r12.getDimensionPixelOffset(r9)
            int r9 = r9 * r7
            int r9 = r9 + r8
            r7 = 2131166042(0x7f07035a, float:1.7946318E38)
            int r12 = r12.getDimensionPixelOffset(r7)
            int r2 = r2 + r6
            int r2 = r2 + r9
            int r2 = r2 + r12
            r11.setMinimumHeight(r2)
            r12 = 2131427728(0x7f0b0190, float:1.847708E38)
            android.view.View r12 = r11.findViewById(r12)
            android.widget.GridView r12 = (android.widget.GridView) r12
            c24 r2 = new c24
            r2.<init>(r3)
            defpackage.ao7.n(r12, r2)
            fb0 r2 = r10.L
            int r2 = r2.X
            ec1 r6 = new ec1
            if (r2 <= 0) goto La4
            r6.<init>(r2)
            goto La7
        La4:
            r6.<init>()
        La7:
            r12.setAdapter(r6)
            int r0 = r0.R
            r12.setNumColumns(r0)
            r12.setEnabled(r3)
            r12 = 2131427731(0x7f0b0193, float:1.8477087E38)
            android.view.View r12 = r11.findViewById(r12)
            androidx.recyclerview.widget.RecyclerView r12 = (androidx.recyclerview.widget.RecyclerView) r12
            r10.d0 = r12
            d24 r12 = new d24
            r10.getContext()
            r12.<init>(r10, r5, r5)
            androidx.recyclerview.widget.RecyclerView r0 = r10.d0
            r0.setLayoutManager(r12)
            androidx.recyclerview.widget.RecyclerView r12 = r10.d0
            java.lang.String r0 = "MONTHS_VIEW_GROUP_TAG"
            r12.setTag(r0)
            com.google.android.material.datepicker.c r12 = new com.google.android.material.datepicker.c
            fb0 r0 = r10.L
            s63 r2 = new s63
            r5 = 17
            r2.<init>(r10, r5)
            r12.<init>(r13, r0, r2)
            androidx.recyclerview.widget.RecyclerView r0 = r10.d0
            r0.setAdapter(r12)
            android.content.res.Resources r0 = r13.getResources()
            r2 = 2131492920(0x7f0c0038, float:1.8609306E38)
            int r0 = r0.getInteger(r2)
            r2 = 2131427734(0x7f0b0196, float:1.8477093E38)
            android.view.View r5 = r11.findViewById(r2)
            androidx.recyclerview.widget.RecyclerView r5 = (androidx.recyclerview.widget.RecyclerView) r5
            r10.Z = r5
            if (r5 == 0) goto L11d
            r5.setHasFixedSize(r4)
            androidx.recyclerview.widget.RecyclerView r5 = r10.Z
            androidx.recyclerview.widget.GridLayoutManager r6 = new androidx.recyclerview.widget.GridLayoutManager
            r6.<init>(r0)
            r5.setLayoutManager(r6)
            androidx.recyclerview.widget.RecyclerView r0 = r10.Z
            hy7 r5 = new hy7
            r5.<init>(r10)
            r0.setAdapter(r5)
            androidx.recyclerview.widget.RecyclerView r0 = r10.Z
            rr1 r5 = new rr1
            r5.<init>(r10)
            r0.i(r5)
        L11d:
            r0 = 2131427722(0x7f0b018a, float:1.8477068E38)
            android.view.View r5 = r11.findViewById(r0)
            fb0 r6 = r12.d
            if (r5 == 0) goto L1ae
            android.view.View r0 = r11.findViewById(r0)
            com.google.android.material.button.MaterialButton r0 = (com.google.android.material.button.MaterialButton) r0
            r10.i0 = r0
            java.lang.String r5 = "SELECTOR_TOGGLE_TAG"
            r0.setTag(r5)
            com.google.android.material.button.MaterialButton r0 = r10.i0
            l60 r5 = new l60
            r7 = 3
            r5.<init>(r10, r7)
            defpackage.ao7.n(r0, r5)
            r0 = 2131427724(0x7f0b018c, float:1.8477072E38)
            android.view.View r0 = r11.findViewById(r0)
            r10.e0 = r0
            java.lang.String r5 = "NAVIGATION_PREV_TAG"
            r0.setTag(r5)
            r0 = 2131427723(0x7f0b018b, float:1.847707E38)
            android.view.View r0 = r11.findViewById(r0)
            r10.f0 = r0
            java.lang.String r5 = "NAVIGATION_NEXT_TAG"
            r0.setTag(r5)
            android.view.View r0 = r11.findViewById(r2)
            r10.g0 = r0
            r0 = 2131427727(0x7f0b018f, float:1.8477078E38)
            android.view.View r0 = r11.findViewById(r0)
            r10.h0 = r0
            f24$a r0 = defpackage.f24.a.DAY
            r10.i(r0)
            com.google.android.material.button.MaterialButton r0 = r10.i0
            i74 r2 = r10.R
            java.lang.String r2 = r2.c()
            r0.setText(r2)
            androidx.recyclerview.widget.RecyclerView r0 = r10.d0
            e24 r2 = new e24
            r2.<init>(r10, r12)
            r0.j(r2)
            com.google.android.material.button.MaterialButton r0 = r10.i0
            r7 r2 = new r7
            r2.<init>(r10, r7)
            r0.setOnClickListener(r2)
            android.view.View r0 = r10.f0
            b24 r2 = new b24
            r2.<init>(r10, r12, r4)
            r0.setOnClickListener(r2)
            android.view.View r0 = r10.e0
            b24 r2 = new b24
            r2.<init>(r10, r12, r3)
            r0.setOnClickListener(r2)
            i74 r12 = r10.R
            i74 r0 = r6.A
            int r12 = r0.d(r12)
            r10.j(r12)
        L1ae:
            boolean r12 = defpackage.k24.k(r13, r1)
            if (r12 != 0) goto L1ff
            hr4 r12 = new hr4
            r12.<init>()
            androidx.recyclerview.widget.RecyclerView r13 = r10.d0
            androidx.recyclerview.widget.RecyclerView r0 = r12.a
            if (r0 != r13) goto L1c0
            goto L1ff
        L1c0:
            r1 = 0
            ul6 r2 = r12.b
            if (r0 == 0) goto L1d1
            java.util.ArrayList r0 = r0.f1
            if (r0 == 0) goto L1cc
            r0.remove(r2)
        L1cc:
            androidx.recyclerview.widget.RecyclerView r0 = r12.a
            r0.setOnFlingListener(r1)
        L1d1:
            r12.a = r13
            if (r13 == 0) goto L1ff
            ig5 r13 = r13.getOnFlingListener()
            if (r13 != 0) goto L1f9
            androidx.recyclerview.widget.RecyclerView r13 = r12.a
            r13.j(r2)
            androidx.recyclerview.widget.RecyclerView r13 = r12.a
            r13.setOnFlingListener(r12)
            android.widget.Scroller r13 = new android.widget.Scroller
            androidx.recyclerview.widget.RecyclerView r0 = r12.a
            android.content.Context r0 = r0.getContext()
            android.view.animation.DecelerateInterpolator r1 = new android.view.animation.DecelerateInterpolator
            r1.<init>()
            r13.<init>(r0, r1)
            r12.f()
            goto L1ff
        L1f9:
            java.lang.String r10 = "An instance of OnFlingListener already set."
            defpackage.i.m(r10)
            return r1
        L1ff:
            androidx.recyclerview.widget.RecyclerView r12 = r10.d0
            i74 r13 = r10.R
            i74 r0 = r6.A
            int r13 = r0.d(r13)
            r12.h0(r13)
            androidx.recyclerview.widget.RecyclerView r10 = r10.d0
            c24 r12 = new c24
            r12.<init>(r4)
            defpackage.ao7.n(r10, r12)
            return r11
    }

    @Override // androidx.fragment.app.o
    public final void onSaveInstanceState(android.os.Bundle r4) {
            r3 = this;
            java.lang.String r0 = "THEME_RES_ID_KEY"
            int r1 = r3.B
            r4.putInt(r0, r1)
            java.lang.String r0 = "GRID_SELECTOR_KEY"
            r1 = 0
            r4.putParcelable(r0, r1)
            java.lang.String r0 = "CALENDAR_CONSTRAINTS_KEY"
            fb0 r2 = r3.L
            r4.putParcelable(r0, r2)
            java.lang.String r0 = "DAY_VIEW_DECORATOR_KEY"
            r4.putParcelable(r0, r1)
            java.lang.String r0 = "CURRENT_MONTH_KEY"
            i74 r3 = r3.R
            r4.putParcelable(r0, r3)
            return
    }
}
