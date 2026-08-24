package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: t15  reason: default package */
/* loaded from: classes.dex */
public final class t15 extends defpackage.wf5 implements defpackage.w05 {
    public final androidx.preference.PreferenceGroup d;
    public java.util.ArrayList e;
    public java.util.ArrayList f;
    public final java.util.ArrayList g;
    public final android.os.Handler h;
    public final defpackage.g15 i;

    public t15(androidx.preference.PreferenceScreen r3) {
            r2 = this;
            r2.<init>()
            g15 r0 = new g15
            r1 = 19
            r0.<init>(r2, r1)
            r2.i = r0
            r2.d = r3
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            r2.h = r0
            r3.setOnPreferenceChangeInternalListener(r2)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.e = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.f = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.g = r0
            boolean r3 = r3.Z
            r2.g(r3)
            r2.m()
            return
    }

    @Override // defpackage.wf5
    public final int a() {
            r0 = this;
            java.util.ArrayList r0 = r0.f
            int r0 = r0.size()
            return r0
    }

    @Override // defpackage.wf5
    public final long b(int r2) {
            r1 = this;
            boolean r0 = r1.b
            if (r0 != 0) goto L7
            r1 = -1
            return r1
        L7:
            androidx.preference.Preference r1 = r1.j(r2)
            long r1 = r1.getId()
            return r1
    }

    @Override // defpackage.wf5
    public final int c(int r3) {
            r2 = this;
            androidx.preference.Preference r3 = r2.j(r3)
            s15 r0 = new s15
            r0.<init>(r3)
            java.util.ArrayList r2 = r2.g
            int r3 = r2.indexOf(r0)
            r1 = -1
            if (r3 == r1) goto L13
            return r3
        L13:
            int r3 = r2.size()
            r2.add(r0)
            return r3
    }

    @Override // defpackage.wf5
    public final void e(defpackage.wg5 r4, int r5) {
            r3 = this;
            x15 r4 = (defpackage.x15) r4
            androidx.preference.Preference r3 = r3.j(r5)
            android.content.res.ColorStateList r5 = r4.v
            android.view.View r0 = r4.a
            android.graphics.drawable.Drawable r1 = r0.getBackground()
            android.graphics.drawable.Drawable r2 = r4.u
            if (r1 == r2) goto L17
            java.util.WeakHashMap r1 = defpackage.ao7.a
            r0.setBackground(r2)
        L17:
            r0 = 16908310(0x1020016, float:2.387729E-38)
            android.view.View r0 = r4.q(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            if (r0 == 0) goto L31
            if (r5 == 0) goto L31
            android.content.res.ColorStateList r1 = r0.getTextColors()
            boolean r1 = r1.equals(r5)
            if (r1 != 0) goto L31
            r0.setTextColor(r5)
        L31:
            r3.onBindViewHolder(r4)
            return
    }

    @Override // defpackage.wf5
    public final defpackage.wg5 f(android.view.ViewGroup r5, int r6) {
            r4 = this;
            java.util.ArrayList r4 = r4.g
            java.lang.Object r4 = r4.get(r6)
            s15 r4 = (defpackage.s15) r4
            android.content.Context r6 = r5.getContext()
            android.view.LayoutInflater r6 = android.view.LayoutInflater.from(r6)
            android.content.Context r0 = r5.getContext()
            r1 = 0
            int[] r2 = defpackage.i75.a
            android.content.res.TypedArray r0 = r0.obtainStyledAttributes(r1, r2)
            r1 = 0
            android.graphics.drawable.Drawable r2 = r0.getDrawable(r1)
            if (r2 != 0) goto L2d
            android.content.Context r2 = r5.getContext()
            r3 = 17301602(0x1080062, float:2.497953E-38)
            android.graphics.drawable.Drawable r2 = defpackage.hf.S(r2, r3)
        L2d:
            r0.recycle()
            int r0 = r4.a
            android.view.View r5 = r6.inflate(r0, r5, r1)
            android.graphics.drawable.Drawable r0 = r5.getBackground()
            if (r0 != 0) goto L41
            java.util.WeakHashMap r0 = defpackage.ao7.a
            r5.setBackground(r2)
        L41:
            r0 = 16908312(0x1020018, float:2.3877296E-38)
            android.view.View r0 = r5.findViewById(r0)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            if (r0 == 0) goto L59
            int r4 = r4.b
            if (r4 == 0) goto L54
            r6.inflate(r4, r0)
            goto L59
        L54:
            r4 = 8
            r0.setVisibility(r4)
        L59:
            x15 r4 = new x15
            r4.<init>(r5)
            return r4
    }

    public final java.util.ArrayList h(androidx.preference.PreferenceGroup r15) {
            r14 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.ArrayList r2 = r15.B
            int r2 = r2.size()
            r3 = 0
            r4 = r3
            r5 = r4
        L13:
            r6 = 0
            r7 = 2147483647(0x7fffffff, float:NaN)
            if (r4 >= r2) goto L76
            androidx.preference.Preference r8 = r15.g(r4)
            boolean r9 = r8.isVisible()
            if (r9 != 0) goto L24
            goto L73
        L24:
            int r9 = r15.Y
            if (r9 == r7) goto L2f
            if (r5 >= r9) goto L2b
            goto L2f
        L2b:
            r1.add(r8)
            goto L32
        L2f:
            r0.add(r8)
        L32:
            boolean r9 = r8 instanceof androidx.preference.PreferenceGroup
            if (r9 != 0) goto L39
            int r5 = r5 + 1
            goto L73
        L39:
            androidx.preference.PreferenceGroup r8 = (androidx.preference.PreferenceGroup) r8
            boolean r9 = r8 instanceof androidx.preference.PreferenceScreen
            if (r9 == 0) goto L40
            goto L73
        L40:
            int r9 = r15.Y
            if (r9 == r7) goto L4f
            int r9 = r8.Y
            if (r9 != r7) goto L49
            goto L4f
        L49:
            java.lang.String r14 = "Nesting an expandable group inside of another expandable group is not supported!"
            defpackage.i.m(r14)
            return r6
        L4f:
            java.util.ArrayList r6 = r14.h(r8)
            int r8 = r6.size()
            r9 = r3
        L58:
            if (r9 >= r8) goto L73
            java.lang.Object r10 = r6.get(r9)
            int r9 = r9 + 1
            androidx.preference.Preference r10 = (androidx.preference.Preference) r10
            int r11 = r15.Y
            if (r11 == r7) goto L6d
            if (r5 >= r11) goto L69
            goto L6d
        L69:
            r1.add(r10)
            goto L70
        L6d:
            r0.add(r10)
        L70:
            int r5 = r5 + 1
            goto L58
        L73:
            int r4 = r4 + 1
            goto L13
        L76:
            int r2 = r15.Y
            if (r2 == r7) goto L10a
            if (r5 <= r2) goto L10a
            a82 r2 = new a82
            android.content.Context r4 = r15.getContext()
            long r7 = r15.getId()
            r2.<init>(r4, r6)
            r4 = 2131623999(0x7f0e003f, float:1.8875165E38)
            r2.setLayoutResource(r4)
            r4 = 2131230928(0x7f0800d0, float:1.8077923E38)
            r2.setIcon(r4)
            r4 = 2131951960(0x7f130158, float:1.954035E38)
            r2.setTitle(r4)
            r4 = 999(0x3e7, float:1.4E-42)
            r2.setOrder(r4)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            int r5 = r1.size()
            r9 = r3
        Laa:
            if (r9 >= r5) goto Lf4
            java.lang.Object r10 = r1.get(r9)
            int r9 = r9 + 1
            androidx.preference.Preference r10 = (androidx.preference.Preference) r10
            java.lang.CharSequence r11 = r10.getTitle()
            boolean r12 = r10 instanceof androidx.preference.PreferenceGroup
            if (r12 == 0) goto Lc8
            boolean r13 = android.text.TextUtils.isEmpty(r11)
            if (r13 != 0) goto Lc8
            r13 = r10
            androidx.preference.PreferenceGroup r13 = (androidx.preference.PreferenceGroup) r13
            r4.add(r13)
        Lc8:
            androidx.preference.PreferenceGroup r13 = r10.getParent()
            boolean r13 = r4.contains(r13)
            if (r13 == 0) goto Lda
            if (r12 == 0) goto Laa
            androidx.preference.PreferenceGroup r10 = (androidx.preference.PreferenceGroup) r10
            r4.add(r10)
            goto Laa
        Lda:
            boolean r10 = android.text.TextUtils.isEmpty(r11)
            if (r10 != 0) goto Laa
            if (r6 != 0) goto Le4
            r6 = r11
            goto Laa
        Le4:
            android.content.Context r10 = r2.getContext()
            r12 = 2131952694(0x7f130436, float:1.9541838E38)
            java.lang.Object[] r6 = new java.lang.Object[]{r6, r11}
            java.lang.String r6 = r10.getString(r12, r6)
            goto Laa
        Lf4:
            r2.setSummary(r6)
            r4 = 1000000(0xf4240, double:4.940656E-318)
            long r7 = r7 + r4
            r2.A = r7
            ap3 r1 = new ap3
            r4 = 16
            r1.<init>(r4, r14, r15, r3)
            r2.setOnPreferenceClickListener(r1)
            r0.add(r2)
        L10a:
            return r0
    }

    public final void i(java.util.ArrayList r6, androidx.preference.PreferenceGroup r7) {
            r5 = this;
            monitor-enter(r7)
            java.util.ArrayList r0 = r7.B     // Catch: java.lang.Throwable -> L3e
            java.util.Collections.sort(r0)     // Catch: java.lang.Throwable -> L3e
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L3e
            java.util.ArrayList r0 = r7.B
            int r0 = r0.size()
            r1 = 0
        Le:
            if (r1 >= r0) goto L3d
            androidx.preference.Preference r2 = r7.g(r1)
            r6.add(r2)
            s15 r3 = new s15
            r3.<init>(r2)
            java.util.ArrayList r4 = r5.g
            boolean r4 = r4.contains(r3)
            if (r4 != 0) goto L29
            java.util.ArrayList r4 = r5.g
            r4.add(r3)
        L29:
            boolean r3 = r2 instanceof androidx.preference.PreferenceGroup
            if (r3 == 0) goto L37
            r3 = r2
            androidx.preference.PreferenceGroup r3 = (androidx.preference.PreferenceGroup) r3
            boolean r4 = r3 instanceof androidx.preference.PreferenceScreen
            if (r4 != 0) goto L37
            r5.i(r6, r3)
        L37:
            r2.setOnPreferenceChangeInternalListener(r5)
            int r1 = r1 + 1
            goto Le
        L3d:
            return
        L3e:
            r5 = move-exception
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L3e
            throw r5
    }

    public final androidx.preference.Preference j(int r2) {
            r1 = this;
            if (r2 < 0) goto L14
            java.util.ArrayList r0 = r1.f
            int r0 = r0.size()
            if (r2 < r0) goto Lb
            goto L14
        Lb:
            java.util.ArrayList r1 = r1.f
            java.lang.Object r1 = r1.get(r2)
            androidx.preference.Preference r1 = (androidx.preference.Preference) r1
            return r1
        L14:
            r1 = 0
            return r1
    }

    public final int k(androidx.preference.Preference r4) {
            r3 = this;
            java.util.ArrayList r0 = r3.f
            int r0 = r0.size()
            r1 = 0
        L7:
            if (r1 >= r0) goto L1d
            java.util.ArrayList r2 = r3.f
            java.lang.Object r2 = r2.get(r1)
            androidx.preference.Preference r2 = (androidx.preference.Preference) r2
            if (r2 == 0) goto L1a
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L1a
            return r1
        L1a:
            int r1 = r1 + 1
            goto L7
        L1d:
            r3 = -1
            return r3
    }

    public final int l(java.lang.String r4) {
            r3 = this;
            java.util.ArrayList r0 = r3.f
            int r0 = r0.size()
            r1 = 0
        L7:
            if (r1 >= r0) goto L1f
            java.util.ArrayList r2 = r3.f
            java.lang.Object r2 = r2.get(r1)
            androidx.preference.Preference r2 = (androidx.preference.Preference) r2
            java.lang.String r2 = r2.getKey()
            boolean r2 = android.text.TextUtils.equals(r4, r2)
            if (r2 == 0) goto L1c
            return r1
        L1c:
            int r1 = r1 + 1
            goto L7
        L1f:
            r3 = -1
            return r3
    }

    public final void m() {
            r6 = this;
            java.util.ArrayList r0 = r6.e
            int r1 = r0.size()
            r2 = 0
            r3 = r2
        L8:
            if (r3 >= r1) goto L17
            java.lang.Object r4 = r0.get(r3)
            int r3 = r3 + 1
            androidx.preference.Preference r4 = (androidx.preference.Preference) r4
            r5 = 0
            r4.setOnPreferenceChangeInternalListener(r5)
            goto L8
        L17:
            java.util.ArrayList r0 = r6.e
            int r0 = r0.size()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r0)
            r6.e = r1
            androidx.preference.PreferenceGroup r0 = r6.d
            r6.i(r1, r0)
            java.util.ArrayList r1 = r6.h(r0)
            r6.f = r1
            r0.getPreferenceManager()
            xf5 r0 = r6.a
            r0.b()
            java.util.ArrayList r6 = r6.e
            int r0 = r6.size()
        L3d:
            if (r2 >= r0) goto L4b
            java.lang.Object r1 = r6.get(r2)
            int r2 = r2 + 1
            androidx.preference.Preference r1 = (androidx.preference.Preference) r1
            r1.clearWasDetached()
            goto L3d
        L4b:
            return
    }
}
