package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: a24  reason: default package */
/* loaded from: classes.dex */
public final class a24 {
    public final com.google.android.material.button.MaterialButton a;
    public defpackage.me6 b;
    public defpackage.xp6 c;
    public defpackage.go6 d;
    public defpackage.h61 e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public android.graphics.PorterDuff.Mode l;
    public android.content.res.ColorStateList m;
    public android.content.res.ColorStateList n;
    public android.content.res.ColorStateList o;
    public defpackage.p24 p;
    public boolean q;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u;
    public android.graphics.drawable.RippleDrawable v;
    public int w;

    public a24(com.google.android.material.button.MaterialButton r2, defpackage.me6 r3) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.q = r0
            r1.r = r0
            r1.s = r0
            r0 = 1
            r1.u = r0
            r1.a = r2
            r1.b = r3
            return
    }

    public final defpackage.p24 a(boolean r2) {
            r1 = this;
            android.graphics.drawable.RippleDrawable r0 = r1.v
            if (r0 == 0) goto L22
            int r0 = r0.getNumberOfLayers()
            if (r0 <= 0) goto L22
            android.graphics.drawable.RippleDrawable r1 = r1.v
            r0 = 0
            android.graphics.drawable.Drawable r1 = r1.getDrawable(r0)
            android.graphics.drawable.InsetDrawable r1 = (android.graphics.drawable.InsetDrawable) r1
            android.graphics.drawable.Drawable r1 = r1.getDrawable()
            android.graphics.drawable.LayerDrawable r1 = (android.graphics.drawable.LayerDrawable) r1
            r2 = r2 ^ 1
            android.graphics.drawable.Drawable r1 = r1.getDrawable(r2)
            p24 r1 = (defpackage.p24) r1
            return r1
        L22:
            r1 = 0
            return r1
    }

    public final void b(int r9, int r10) {
            r8 = this;
            com.google.android.material.button.MaterialButton r0 = r8.a
            int r1 = r0.getPaddingStart()
            int r2 = r0.getPaddingTop()
            int r3 = r0.getPaddingEnd()
            int r4 = r0.getPaddingBottom()
            int r5 = r8.h
            int r6 = r8.i
            r8.i = r10
            r8.h = r9
            boolean r7 = r8.r
            if (r7 != 0) goto L21
            r8.c()
        L21:
            int r2 = r2 + r9
            int r2 = r2 - r5
            int r4 = r4 + r10
            int r4 = r4 - r6
            r0.setPaddingRelative(r1, r2, r3, r4)
            return
    }

    public final void c() {
            r12 = this;
            p24 r0 = new p24
            me6 r1 = r12.b
            r0.<init>(r1)
            xp6 r1 = r12.c
            if (r1 == 0) goto Le
            r0.o(r1)
        Le:
            go6 r1 = r12.d
            if (r1 == 0) goto L15
            r0.l(r1)
        L15:
            h61 r1 = r12.e
            if (r1 == 0) goto L1b
            r0.z0 = r1
        L1b:
            com.google.android.material.button.MaterialButton r1 = r12.a
            android.content.Context r2 = r1.getContext()
            r0.k(r2)
            android.content.res.ColorStateList r2 = r12.m
            r0.setTintList(r2)
            android.graphics.PorterDuff$Mode r2 = r12.l
            if (r2 == 0) goto L30
            r0.setTintMode(r2)
        L30:
            int r2 = r12.k
            float r2 = (float) r2
            android.content.res.ColorStateList r3 = r12.n
            n24 r4 = r0.B
            r4.k = r2
            r0.invalidateSelf()
            n24 r2 = r0.B
            android.content.res.ColorStateList r4 = r2.e
            if (r4 == r3) goto L4b
            r2.e = r3
            int[] r2 = r0.getState()
            r0.onStateChange(r2)
        L4b:
            p24 r2 = new p24
            me6 r3 = r12.b
            r2.<init>(r3)
            xp6 r3 = r12.c
            if (r3 == 0) goto L59
            r2.o(r3)
        L59:
            go6 r3 = r12.d
            if (r3 == 0) goto L60
            r2.l(r3)
        L60:
            r3 = 0
            r2.setTint(r3)
            int r4 = r12.k
            float r4 = (float) r4
            boolean r5 = r12.q
            if (r5 == 0) goto L73
            r5 = 2130968890(0x7f04013a, float:1.7546446E38)
            int r5 = defpackage.mp2.B(r1, r5)
            goto L74
        L73:
            r5 = r3
        L74:
            n24 r6 = r2.B
            r6.k = r4
            r2.invalidateSelf()
            android.content.res.ColorStateList r4 = android.content.res.ColorStateList.valueOf(r5)
            n24 r5 = r2.B
            android.content.res.ColorStateList r6 = r5.e
            if (r6 == r4) goto L8e
            r5.e = r4
            int[] r4 = r2.getState()
            r2.onStateChange(r4)
        L8e:
            p24 r4 = new p24
            me6 r5 = r12.b
            r4.<init>(r5)
            r12.p = r4
            xp6 r5 = r12.c
            if (r5 == 0) goto L9e
            r4.o(r5)
        L9e:
            go6 r4 = r12.d
            if (r4 == 0) goto La7
            p24 r5 = r12.p
            r5.l(r4)
        La7:
            p24 r4 = r12.p
            r5 = -1
            r4.setTint(r5)
            android.graphics.drawable.RippleDrawable r4 = new android.graphics.drawable.RippleDrawable
            android.content.res.ColorStateList r5 = r12.o
            android.content.res.ColorStateList r5 = defpackage.lq5.a(r5)
            android.graphics.drawable.LayerDrawable r7 = new android.graphics.drawable.LayerDrawable
            r6 = 2
            android.graphics.drawable.Drawable[] r6 = new android.graphics.drawable.Drawable[r6]
            r6[r3] = r2
            r2 = 1
            r6[r2] = r0
            r7.<init>(r6)
            android.graphics.drawable.InsetDrawable r6 = new android.graphics.drawable.InsetDrawable
            int r8 = r12.f
            int r9 = r12.h
            int r10 = r12.g
            int r11 = r12.i
            r6.<init>(r7, r8, r9, r10, r11)
            p24 r0 = r12.p
            r4.<init>(r5, r6, r0)
            r12.v = r4
            r1.setInternalBackground(r4)
            p24 r0 = r12.a(r3)
            if (r0 == 0) goto Lec
            int r12 = r12.w
            float r12 = (float) r12
            r0.m(r12)
            int[] r12 = r1.getDrawableState()
            r0.setState(r12)
        Lec:
            return
    }

    public final void d() {
            r4 = this;
            r0 = 0
            p24 r0 = r4.a(r0)
            if (r0 == 0) goto L1b
            xp6 r1 = r4.c
            if (r1 == 0) goto Lf
            r0.o(r1)
            goto L14
        Lf:
            me6 r1 = r4.b
            r0.setShapeAppearanceModel(r1)
        L14:
            go6 r1 = r4.d
            if (r1 == 0) goto L1b
            r0.l(r1)
        L1b:
            r0 = 1
            p24 r1 = r4.a(r0)
            if (r1 == 0) goto L36
            xp6 r2 = r4.c
            if (r2 == 0) goto L2a
            r1.o(r2)
            goto L2f
        L2a:
            me6 r2 = r4.b
            r1.setShapeAppearanceModel(r2)
        L2f:
            go6 r2 = r4.d
            if (r2 == 0) goto L36
            r1.l(r2)
        L36:
            android.graphics.drawable.RippleDrawable r1 = r4.v
            if (r1 == 0) goto L59
            int r1 = r1.getNumberOfLayers()
            if (r1 <= r0) goto L59
            android.graphics.drawable.RippleDrawable r1 = r4.v
            int r1 = r1.getNumberOfLayers()
            android.graphics.drawable.RippleDrawable r2 = r4.v
            r3 = 2
            if (r1 <= r3) goto L52
            android.graphics.drawable.Drawable r0 = r2.getDrawable(r3)
            xe6 r0 = (defpackage.xe6) r0
            goto L5a
        L52:
            android.graphics.drawable.Drawable r0 = r2.getDrawable(r0)
            xe6 r0 = (defpackage.xe6) r0
            goto L5a
        L59:
            r0 = 0
        L5a:
            if (r0 == 0) goto L75
            me6 r1 = r4.b
            r0.setShapeAppearanceModel(r1)
            boolean r1 = r0 instanceof defpackage.p24
            if (r1 == 0) goto L75
            p24 r0 = (defpackage.p24) r0
            xp6 r1 = r4.c
            if (r1 == 0) goto L6e
            r0.o(r1)
        L6e:
            go6 r4 = r4.d
            if (r4 == 0) goto L75
            r0.l(r4)
        L75:
            return
    }

    public final void e() {
            r6 = this;
            r0 = 0
            p24 r1 = r6.a(r0)
            r2 = 1
            p24 r2 = r6.a(r2)
            if (r1 == 0) goto L53
            int r3 = r6.k
            float r3 = (float) r3
            android.content.res.ColorStateList r4 = r6.n
            n24 r5 = r1.B
            r5.k = r3
            r1.invalidateSelf()
            n24 r3 = r1.B
            android.content.res.ColorStateList r5 = r3.e
            if (r5 == r4) goto L27
            r3.e = r4
            int[] r3 = r1.getState()
            r1.onStateChange(r3)
        L27:
            if (r2 == 0) goto L53
            int r1 = r6.k
            float r1 = (float) r1
            boolean r3 = r6.q
            if (r3 == 0) goto L39
            com.google.android.material.button.MaterialButton r6 = r6.a
            r0 = 2130968890(0x7f04013a, float:1.7546446E38)
            int r0 = defpackage.mp2.B(r6, r0)
        L39:
            n24 r6 = r2.B
            r6.k = r1
            r2.invalidateSelf()
            android.content.res.ColorStateList r6 = android.content.res.ColorStateList.valueOf(r0)
            n24 r0 = r2.B
            android.content.res.ColorStateList r1 = r0.e
            if (r1 == r6) goto L53
            r0.e = r6
            int[] r6 = r2.getState()
            r2.onStateChange(r6)
        L53:
            return
    }
}
