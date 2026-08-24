package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: l87  reason: default package */
/* loaded from: classes.dex */
public final class l87 implements defpackage.tc1 {
    public final androidx.appcompat.widget.Toolbar a;
    public int b;
    public final android.view.View c;
    public android.graphics.drawable.Drawable d;
    public android.graphics.drawable.Drawable e;
    public final android.graphics.drawable.Drawable f;
    public boolean g;
    public java.lang.CharSequence h;
    public final java.lang.CharSequence i;
    public final java.lang.CharSequence j;
    public android.view.Window.Callback k;
    public boolean l;
    public defpackage.g8 m;
    public final int n;
    public final android.graphics.drawable.Drawable o;

    public l87(androidx.appcompat.widget.Toolbar r8, boolean r9) {
            r7 = this;
            r7.<init>()
            r0 = 0
            r7.n = r0
            r7.a = r8
            java.lang.CharSequence r1 = r8.getTitle()
            r7.h = r1
            java.lang.CharSequence r1 = r8.getSubtitle()
            r7.i = r1
            java.lang.CharSequence r1 = r7.h
            r2 = 1
            if (r1 == 0) goto L1b
            r1 = r2
            goto L1c
        L1b:
            r1 = r0
        L1c:
            r7.g = r1
            android.graphics.drawable.Drawable r1 = r8.getNavigationIcon()
            r7.f = r1
            android.content.Context r1 = r8.getContext()
            int[] r3 = defpackage.m75.a
            r4 = 2130968584(0x7f040008, float:1.7545826E38)
            r5 = 0
            m44 r1 = defpackage.m44.A(r1, r5, r3, r4)
            java.lang.Object r3 = r1.L
            android.content.res.TypedArray r3 = (android.content.res.TypedArray) r3
            r4 = 15
            android.graphics.drawable.Drawable r6 = r1.k(r4)
            r7.o = r6
            if (r9 == 0) goto L150
            r9 = 27
            java.lang.CharSequence r9 = r3.getText(r9)
            boolean r4 = android.text.TextUtils.isEmpty(r9)
            if (r4 != 0) goto L64
            r7.g = r2
            r7.h = r9
            int r2 = r7.b
            r2 = r2 & 8
            if (r2 == 0) goto L64
            r8.setTitle(r9)
            boolean r2 = r7.g
            if (r2 == 0) goto L64
            android.view.View r2 = r8.getRootView()
            defpackage.ao7.o(r2, r9)
        L64:
            r9 = 25
            java.lang.CharSequence r9 = r3.getText(r9)
            boolean r2 = android.text.TextUtils.isEmpty(r9)
            if (r2 != 0) goto L7b
            r7.i = r9
            int r2 = r7.b
            r2 = r2 & 8
            if (r2 == 0) goto L7b
            r8.setSubtitle(r9)
        L7b:
            r9 = 20
            android.graphics.drawable.Drawable r9 = r1.k(r9)
            if (r9 == 0) goto L88
            r7.e = r9
            r7.c()
        L88:
            r9 = 17
            android.graphics.drawable.Drawable r9 = r1.k(r9)
            if (r9 == 0) goto L95
            r7.d = r9
            r7.c()
        L95:
            android.graphics.drawable.Drawable r9 = r7.f
            if (r9 != 0) goto Lac
            android.graphics.drawable.Drawable r9 = r7.o
            if (r9 == 0) goto Lac
            r7.f = r9
            int r2 = r7.b
            r2 = r2 & 4
            if (r2 == 0) goto La9
            r8.setNavigationIcon(r9)
            goto Lac
        La9:
            r8.setNavigationIcon(r5)
        Lac:
            r9 = 10
            int r9 = r3.getInt(r9, r0)
            r7.a(r9)
            r9 = 9
            int r9 = r3.getResourceId(r9, r0)
            if (r9 == 0) goto Lea
            android.content.Context r2 = r8.getContext()
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r2)
            android.view.View r9 = r2.inflate(r9, r8, r0)
            android.view.View r2 = r7.c
            if (r2 == 0) goto Ld6
            int r4 = r7.b
            r4 = r4 & 16
            if (r4 == 0) goto Ld6
            r8.removeView(r2)
        Ld6:
            r7.c = r9
            if (r9 == 0) goto Le3
            int r2 = r7.b
            r2 = r2 & 16
            if (r2 == 0) goto Le3
            r8.addView(r9)
        Le3:
            int r9 = r7.b
            r9 = r9 | 16
            r7.a(r9)
        Lea:
            r9 = 13
            int r9 = r3.getLayoutDimension(r9, r0)
            if (r9 <= 0) goto Lfb
            android.view.ViewGroup$LayoutParams r2 = r8.getLayoutParams()
            r2.height = r9
            r8.setLayoutParams(r2)
        Lfb:
            r9 = 7
            r2 = -1
            int r9 = r3.getDimensionPixelOffset(r9, r2)
            r4 = 3
            int r2 = r3.getDimensionPixelOffset(r4, r2)
            if (r9 >= 0) goto L10a
            if (r2 < 0) goto L11a
        L10a:
            int r9 = java.lang.Math.max(r9, r0)
            int r2 = java.lang.Math.max(r2, r0)
            r8.d()
            o26 r4 = r8.s0
            r4.a(r9, r2)
        L11a:
            r9 = 28
            int r9 = r3.getResourceId(r9, r0)
            if (r9 == 0) goto L12f
            android.content.Context r2 = r8.getContext()
            r8.k0 = r9
            qs r4 = r8.B
            if (r4 == 0) goto L12f
            r4.setTextAppearance(r2, r9)
        L12f:
            r9 = 26
            int r9 = r3.getResourceId(r9, r0)
            if (r9 == 0) goto L144
            android.content.Context r2 = r8.getContext()
            r8.l0 = r9
            qs r4 = r8.L
            if (r4 == 0) goto L144
            r4.setTextAppearance(r2, r9)
        L144:
            r9 = 22
            int r9 = r3.getResourceId(r9, r0)
            if (r9 == 0) goto L161
            r8.setPopupTheme(r9)
            goto L161
        L150:
            android.graphics.drawable.Drawable r9 = r8.getNavigationIcon()
            if (r9 == 0) goto L15d
            android.graphics.drawable.Drawable r9 = r8.getNavigationIcon()
            r7.o = r9
            goto L15f
        L15d:
            r4 = 11
        L15f:
            r7.b = r4
        L161:
            r1.D()
            int r9 = r7.n
            r0 = 2131951617(0x7f130001, float:1.9539654E38)
            if (r0 != r9) goto L16c
            goto L18a
        L16c:
            r7.n = r0
            java.lang.CharSequence r9 = r8.getNavigationContentDescription()
            boolean r9 = android.text.TextUtils.isEmpty(r9)
            if (r9 == 0) goto L18a
            int r9 = r7.n
            if (r9 != 0) goto L17d
            goto L185
        L17d:
            android.content.Context r0 = r8.getContext()
            java.lang.String r5 = r0.getString(r9)
        L185:
            r7.j = r5
            r7.b()
        L18a:
            java.lang.CharSequence r9 = r8.getNavigationContentDescription()
            r7.j = r9
            b24 r9 = new b24
            r9.<init>(r7)
            r8.setNavigationOnClickListener(r9)
            return
    }

    public final void a(int r5) {
            r4 = this;
            int r0 = r4.b
            r0 = r0 ^ r5
            r4.b = r5
            if (r0 == 0) goto L5c
            r1 = r0 & 4
            r2 = 0
            androidx.appcompat.widget.Toolbar r3 = r4.a
            if (r1 == 0) goto L29
            r1 = r5 & 4
            if (r1 == 0) goto L15
            r4.b()
        L15:
            int r1 = r4.b
            r1 = r1 & 4
            if (r1 == 0) goto L26
            android.graphics.drawable.Drawable r1 = r4.f
            if (r1 == 0) goto L20
            goto L22
        L20:
            android.graphics.drawable.Drawable r1 = r4.o
        L22:
            r3.setNavigationIcon(r1)
            goto L29
        L26:
            r3.setNavigationIcon(r2)
        L29:
            r1 = r0 & 3
            if (r1 == 0) goto L30
            r4.c()
        L30:
            r1 = r0 & 8
            if (r1 == 0) goto L49
            r1 = r5 & 8
            if (r1 == 0) goto L43
            java.lang.CharSequence r1 = r4.h
            r3.setTitle(r1)
            java.lang.CharSequence r1 = r4.i
            r3.setSubtitle(r1)
            goto L49
        L43:
            r3.setTitle(r2)
            r3.setSubtitle(r2)
        L49:
            r0 = r0 & 16
            if (r0 == 0) goto L5c
            android.view.View r4 = r4.c
            if (r4 == 0) goto L5c
            r5 = r5 & 16
            if (r5 == 0) goto L59
            r3.addView(r4)
            return
        L59:
            r3.removeView(r4)
        L5c:
            return
    }

    public final void b() {
            r3 = this;
            int r0 = r3.b
            r0 = r0 & 4
            if (r0 == 0) goto L19
            java.lang.CharSequence r0 = r3.j
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            androidx.appcompat.widget.Toolbar r2 = r3.a
            if (r1 == 0) goto L16
            int r3 = r3.n
            r2.setNavigationContentDescription(r3)
            return
        L16:
            r2.setNavigationContentDescription(r0)
        L19:
            return
    }

    public final void c() {
            r2 = this;
            int r0 = r2.b
            r1 = r0 & 2
            if (r1 == 0) goto L15
            r0 = r0 & 1
            if (r0 == 0) goto L12
            android.graphics.drawable.Drawable r0 = r2.e
            if (r0 == 0) goto Lf
            goto L16
        Lf:
            android.graphics.drawable.Drawable r0 = r2.d
            goto L16
        L12:
            android.graphics.drawable.Drawable r0 = r2.d
            goto L16
        L15:
            r0 = 0
        L16:
            androidx.appcompat.widget.Toolbar r2 = r2.a
            r2.setLogo(r0)
            return
    }
}
