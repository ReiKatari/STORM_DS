package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: g8  reason: default package */
/* loaded from: classes.dex */
public final class g8 implements defpackage.b54 {
    public final android.content.Context A;
    public android.content.Context B;
    public defpackage.i44 L;
    public final android.view.LayoutInflater R;
    public defpackage.a54 X;
    public final int Y;
    public final int Z;
    public defpackage.d54 d0;
    public defpackage.f8 e0;
    public android.graphics.drawable.Drawable f0;
    public boolean g0;
    public boolean h0;
    public boolean i0;
    public int j0;
    public int k0;
    public int l0;
    public boolean m0;
    public final android.util.SparseBooleanArray n0;
    public defpackage.d8 o0;
    public defpackage.d8 p0;
    public defpackage.uo2 q0;
    public defpackage.e8 r0;
    public final defpackage.os0 s0;

    public g8(android.content.Context r2) {
            r1 = this;
            r1.<init>()
            r1.A = r2
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r2)
            r1.R = r2
            r2 = 2131623939(0x7f0e0003, float:1.8875044E38)
            r1.Y = r2
            r2 = 2131623938(0x7f0e0002, float:1.8875042E38)
            r1.Z = r2
            android.util.SparseBooleanArray r2 = new android.util.SparseBooleanArray
            r2.<init>()
            r1.n0 = r2
            os0 r2 = new os0
            r0 = 5
            r2.<init>(r1, r0)
            r1.s0 = r2
            return
    }

    public final android.view.View a(defpackage.o44 r4, android.view.View r5, android.view.ViewGroup r6) {
            r3 = this;
            android.view.View r0 = r4.getActionView()
            r1 = 0
            if (r0 == 0) goto Ld
            boolean r2 = r4.e()
            if (r2 == 0) goto L3e
        Ld:
            boolean r0 = r5 instanceof defpackage.c54
            if (r0 == 0) goto L14
            c54 r5 = (defpackage.c54) r5
            goto L1e
        L14:
            android.view.LayoutInflater r5 = r3.R
            int r0 = r3.Z
            android.view.View r5 = r5.inflate(r0, r6, r1)
            c54 r5 = (defpackage.c54) r5
        L1e:
            r5.c(r4)
            d54 r0 = r3.d0
            androidx.appcompat.widget.ActionMenuView r0 = (androidx.appcompat.widget.ActionMenuView) r0
            r2 = r5
            androidx.appcompat.view.menu.ActionMenuItemView r2 = (androidx.appcompat.view.menu.ActionMenuItemView) r2
            r2.setItemInvoker(r0)
            e8 r0 = r3.r0
            if (r0 != 0) goto L36
            e8 r0 = new e8
            r0.<init>(r3)
            r3.r0 = r0
        L36:
            e8 r3 = r3.r0
            r2.setPopupCallback(r3)
            r0 = r5
            android.view.View r0 = (android.view.View) r0
        L3e:
            boolean r3 = r4.C
            if (r3 == 0) goto L44
            r1 = 8
        L44:
            r0.setVisibility(r1)
            androidx.appcompat.widget.ActionMenuView r6 = (androidx.appcompat.widget.ActionMenuView) r6
            android.view.ViewGroup$LayoutParams r3 = r0.getLayoutParams()
            r6.getClass()
            boolean r4 = r3 instanceof defpackage.i8
            if (r4 != 0) goto L5b
            i8 r3 = androidx.appcompat.widget.ActionMenuView.k(r3)
            r0.setLayoutParams(r3)
        L5b:
            return r0
    }

    @Override // defpackage.b54
    public final boolean b(defpackage.it6 r9) {
            r8 = this;
            boolean r0 = r9.hasVisibleItems()
            r1 = 0
            if (r0 != 0) goto L8
            goto L3c
        L8:
            r0 = r9
        L9:
            i44 r2 = r0.z
            i44 r3 = r8.L
            if (r2 == r3) goto L13
            r0 = r2
            it6 r0 = (defpackage.it6) r0
            goto L9
        L13:
            o44 r0 = r0.A
            d54 r2 = r8.d0
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r3 = 0
            if (r2 != 0) goto L1d
            goto L3a
        L1d:
            int r4 = r2.getChildCount()
            r5 = r1
        L22:
            if (r5 >= r4) goto L3a
            android.view.View r6 = r2.getChildAt(r5)
            boolean r7 = r6 instanceof defpackage.c54
            if (r7 == 0) goto L37
            r7 = r6
            c54 r7 = (defpackage.c54) r7
            o44 r7 = r7.getItemData()
            if (r7 != r0) goto L37
            r3 = r6
            goto L3a
        L37:
            int r5 = r5 + 1
            goto L22
        L3a:
            if (r3 != 0) goto L3d
        L3c:
            return r1
        L3d:
            o44 r0 = r9.A
            r0.getClass()
            java.util.ArrayList r0 = r9.f
            int r0 = r0.size()
            r2 = r1
        L49:
            r4 = 1
            if (r2 >= r0) goto L61
            android.view.MenuItem r5 = r9.getItem(r2)
            boolean r6 = r5.isVisible()
            if (r6 == 0) goto L5e
            android.graphics.drawable.Drawable r5 = r5.getIcon()
            if (r5 == 0) goto L5e
            r0 = r4
            goto L62
        L5e:
            int r2 = r2 + 1
            goto L49
        L61:
            r0 = r1
        L62:
            d8 r2 = new d8
            android.content.Context r5 = r8.B
            r2.<init>(r8, r5, r9, r3)
            r8.p0 = r2
            r2.g = r0
            t44 r2 = r2.i
            if (r2 == 0) goto L74
            r2.o(r0)
        L74:
            d8 r0 = r8.p0
            boolean r2 = r0.b()
            if (r2 == 0) goto L7d
            goto L84
        L7d:
            android.view.View r2 = r0.e
            if (r2 == 0) goto L8c
            r0.d(r1, r1, r1, r1)
        L84:
            a54 r8 = r8.X
            if (r8 == 0) goto L8b
            r8.M(r9)
        L8b:
            return r4
        L8c:
            java.lang.String r8 = "MenuPopupHelper cannot be used without an anchor"
            defpackage.i.m(r8)
            return r1
    }

    @Override // defpackage.b54
    public final boolean c() {
            r17 = this;
            r0 = r17
            i44 r1 = r0.L
            r3 = 0
            if (r1 == 0) goto L10
            java.util.ArrayList r1 = r1.l()
            int r4 = r1.size()
            goto L12
        L10:
            r4 = r3
            r1 = 0
        L12:
            int r5 = r0.l0
            int r6 = r0.k0
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r3)
            d54 r8 = r0.d0
            android.view.ViewGroup r8 = (android.view.ViewGroup) r8
            r9 = r3
            r10 = r9
            r11 = r10
            r12 = r11
        L22:
            r13 = 2
            r14 = 1
            if (r9 >= r4) goto L4a
            java.lang.Object r15 = r1.get(r9)
            o44 r15 = (defpackage.o44) r15
            int r3 = r15.y
            r2 = r3 & 2
            if (r2 != r13) goto L35
            int r11 = r11 + 1
            goto L3d
        L35:
            r2 = r3 & 1
            if (r2 != r14) goto L3c
            int r12 = r12 + 1
            goto L3d
        L3c:
            r10 = r14
        L3d:
            boolean r2 = r0.m0
            if (r2 == 0) goto L46
            boolean r2 = r15.C
            if (r2 == 0) goto L46
            r5 = 0
        L46:
            int r9 = r9 + 1
            r3 = 0
            goto L22
        L4a:
            boolean r2 = r0.h0
            if (r2 == 0) goto L55
            if (r10 != 0) goto L53
            int r12 = r12 + r11
            if (r12 <= r5) goto L55
        L53:
            int r5 = r5 + (-1)
        L55:
            int r5 = r5 - r11
            android.util.SparseBooleanArray r2 = r0.n0
            r2.clear()
            r3 = 0
            r9 = 0
        L5d:
            if (r3 >= r4) goto Lfb
            java.lang.Object r10 = r1.get(r3)
            o44 r10 = (defpackage.o44) r10
            int r11 = r10.y
            r12 = r11 & 2
            if (r12 != r13) goto L6d
            r12 = r14
            goto L6e
        L6d:
            r12 = 0
        L6e:
            int r15 = r10.b
            if (r12 == 0) goto L8d
            r12 = 0
            android.view.View r11 = r0.a(r10, r12, r8)
            r11.measure(r7, r7)
            int r11 = r11.getMeasuredWidth()
            int r6 = r6 - r11
            if (r9 != 0) goto L82
            r9 = r11
        L82:
            if (r15 == 0) goto L87
            r2.put(r15, r14)
        L87:
            r10.f(r14)
        L8a:
            r0 = 0
            goto Lf3
        L8d:
            r11 = r11 & 1
            if (r11 != r14) goto Lef
            boolean r11 = r2.get(r15)
            if (r5 > 0) goto L99
            if (r11 == 0) goto L9d
        L99:
            if (r6 <= 0) goto L9d
            r12 = r14
            goto L9e
        L9d:
            r12 = 0
        L9e:
            r13 = 0
            if (r12 == 0) goto Lb8
            android.view.View r14 = r0.a(r10, r13, r8)
            r14.measure(r7, r7)
            int r14 = r14.getMeasuredWidth()
            int r6 = r6 - r14
            if (r9 != 0) goto Lb0
            r9 = r14
        Lb0:
            int r14 = r6 + r9
            if (r14 <= 0) goto Lb6
            r14 = 1
            goto Lb7
        Lb6:
            r14 = 0
        Lb7:
            r12 = r12 & r14
        Lb8:
            if (r12 == 0) goto Lc1
            if (r15 == 0) goto Lc1
            r14 = 1
            r2.put(r15, r14)
            goto Le7
        Lc1:
            if (r11 == 0) goto Le7
            r11 = 0
            r2.put(r15, r11)
            r11 = 0
        Lc8:
            if (r11 >= r3) goto Le7
            java.lang.Object r14 = r1.get(r11)
            o44 r14 = (defpackage.o44) r14
            int r13 = r14.b
            if (r13 != r15) goto Le1
            int r13 = r14.x
            r0 = 32
            r13 = r13 & r0
            if (r13 != r0) goto Ldd
            int r5 = r5 + 1
        Ldd:
            r0 = 0
            r14.f(r0)
        Le1:
            int r11 = r11 + 1
            r13 = 0
            r0 = r17
            goto Lc8
        Le7:
            if (r12 == 0) goto Leb
            int r5 = r5 + (-1)
        Leb:
            r10.f(r12)
            goto L8a
        Lef:
            r0 = 0
            r10.f(r0)
        Lf3:
            int r3 = r3 + 1
            r13 = 2
            r0 = r17
            r14 = 1
            goto L5d
        Lfb:
            r16 = r14
            return r16
    }

    @Override // defpackage.b54
    public final void d(defpackage.i44 r3, boolean r4) {
            r2 = this;
            r2.e()
            d8 r0 = r2.p0
            if (r0 == 0) goto L12
            boolean r1 = r0.b()
            if (r1 == 0) goto L12
            t44 r0 = r0.i
            r0.dismiss()
        L12:
            a54 r2 = r2.X
            if (r2 == 0) goto L19
            r2.d(r3, r4)
        L19:
            return
    }

    public final boolean e() {
            r3 = this;
            uo2 r0 = r3.q0
            r1 = 1
            if (r0 == 0) goto L12
            d54 r2 = r3.d0
            if (r2 == 0) goto L12
            android.view.View r2 = (android.view.View) r2
            r2.removeCallbacks(r0)
            r0 = 0
            r3.q0 = r0
            return r1
        L12:
            d8 r3 = r3.o0
            if (r3 == 0) goto L22
            boolean r0 = r3.b()
            if (r0 == 0) goto L21
            t44 r3 = r3.i
            r3.dismiss()
        L21:
            return r1
        L22:
            r3 = 0
            return r3
    }

    @Override // defpackage.b54
    public final boolean f(defpackage.o44 r1) {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // defpackage.b54
    public final void g(defpackage.a54 r1) {
            r0 = this;
            r0 = 0
            throw r0
    }

    @Override // defpackage.b54
    public final boolean h(defpackage.o44 r1) {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // defpackage.b54
    public final void i() {
            r11 = this;
            d54 r0 = r11.d0
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r1 = 0
            r2 = 0
            if (r0 != 0) goto La
            goto L78
        La:
            i44 r3 = r11.L
            if (r3 == 0) goto L62
            r3.i()
            i44 r3 = r11.L
            java.util.ArrayList r3 = r3.l()
            int r4 = r3.size()
            r5 = r2
            r6 = r5
        L1d:
            if (r5 >= r4) goto L63
            java.lang.Object r7 = r3.get(r5)
            o44 r7 = (defpackage.o44) r7
            int r8 = r7.x
            r9 = 32
            r8 = r8 & r9
            if (r8 != r9) goto L5f
            android.view.View r8 = r0.getChildAt(r6)
            boolean r9 = r8 instanceof defpackage.c54
            if (r9 == 0) goto L3c
            r9 = r8
            c54 r9 = (defpackage.c54) r9
            o44 r9 = r9.getItemData()
            goto L3d
        L3c:
            r9 = r1
        L3d:
            android.view.View r10 = r11.a(r7, r8, r0)
            if (r7 == r9) goto L49
            r10.setPressed(r2)
            r10.jumpDrawablesToCurrentState()
        L49:
            if (r10 == r8) goto L5d
            android.view.ViewParent r7 = r10.getParent()
            android.view.ViewGroup r7 = (android.view.ViewGroup) r7
            if (r7 == 0) goto L56
            r7.removeView(r10)
        L56:
            d54 r7 = r11.d0
            android.view.ViewGroup r7 = (android.view.ViewGroup) r7
            r7.addView(r10, r6)
        L5d:
            int r6 = r6 + 1
        L5f:
            int r5 = r5 + 1
            goto L1d
        L62:
            r6 = r2
        L63:
            int r3 = r0.getChildCount()
            if (r6 >= r3) goto L78
            android.view.View r3 = r0.getChildAt(r6)
            f8 r4 = r11.e0
            if (r3 != r4) goto L74
            int r6 = r6 + 1
            goto L63
        L74:
            r0.removeViewAt(r6)
            goto L63
        L78:
            d54 r0 = r11.d0
            android.view.View r0 = (android.view.View) r0
            r0.requestLayout()
            i44 r0 = r11.L
            if (r0 == 0) goto L9a
            r0.i()
            java.util.ArrayList r0 = r0.i
            int r3 = r0.size()
            r4 = r2
        L8d:
            if (r4 >= r3) goto L9a
            java.lang.Object r5 = r0.get(r4)
            o44 r5 = (defpackage.o44) r5
            p44 r5 = r5.A
            int r4 = r4 + 1
            goto L8d
        L9a:
            i44 r0 = r11.L
            if (r0 == 0) goto La3
            r0.i()
            java.util.ArrayList r1 = r0.j
        La3:
            boolean r0 = r11.h0
            r3 = 1
            if (r0 == 0) goto Lbe
            if (r1 == 0) goto Lbe
            int r0 = r1.size()
            if (r0 != r3) goto Lbb
            java.lang.Object r0 = r1.get(r2)
            o44 r0 = (defpackage.o44) r0
            boolean r0 = r0.C
            r2 = r0 ^ 1
            goto Lbe
        Lbb:
            if (r0 <= 0) goto Lbe
            r2 = r3
        Lbe:
            f8 r0 = r11.e0
            if (r2 == 0) goto Lf3
            if (r0 != 0) goto Lcd
            f8 r0 = new f8
            android.content.Context r1 = r11.A
            r0.<init>(r11, r1)
            r11.e0 = r0
        Lcd:
            f8 r0 = r11.e0
            android.view.ViewParent r0 = r0.getParent()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            d54 r1 = r11.d0
            if (r0 == r1) goto L104
            if (r0 == 0) goto Le0
            f8 r1 = r11.e0
            r0.removeView(r1)
        Le0:
            d54 r0 = r11.d0
            androidx.appcompat.widget.ActionMenuView r0 = (androidx.appcompat.widget.ActionMenuView) r0
            f8 r1 = r11.e0
            r0.getClass()
            i8 r2 = androidx.appcompat.widget.ActionMenuView.j()
            r2.a = r3
            r0.addView(r1, r2)
            goto L104
        Lf3:
            if (r0 == 0) goto L104
            android.view.ViewParent r0 = r0.getParent()
            d54 r1 = r11.d0
            if (r0 != r1) goto L104
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            f8 r0 = r11.e0
            r1.removeView(r0)
        L104:
            d54 r0 = r11.d0
            androidx.appcompat.widget.ActionMenuView r0 = (androidx.appcompat.widget.ActionMenuView) r0
            boolean r11 = r11.h0
            r0.setOverflowReserved(r11)
            return
    }

    public final boolean j() {
            r0 = this;
            d8 r0 = r0.o0
            if (r0 == 0) goto Lc
            boolean r0 = r0.b()
            if (r0 == 0) goto Lc
            r0 = 1
            return r0
        Lc:
            r0 = 0
            return r0
    }

    @Override // defpackage.b54
    public final void k(android.content.Context r5, defpackage.i44 r6) {
            r4 = this;
            r4.B = r5
            android.view.LayoutInflater.from(r5)
            r4.L = r6
            android.content.res.Resources r6 = r5.getResources()
            boolean r0 = r4.i0
            if (r0 != 0) goto L12
            r0 = 1
            r4.h0 = r0
        L12:
            android.content.res.Resources r0 = r5.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            int r0 = r0.widthPixels
            r1 = 2
            int r0 = r0 / r1
            r4.j0 = r0
            android.content.res.Resources r5 = r5.getResources()
            android.content.res.Configuration r5 = r5.getConfiguration()
            int r0 = r5.screenWidthDp
            int r2 = r5.screenHeightDp
            int r5 = r5.smallestScreenWidthDp
            r3 = 600(0x258, float:8.41E-43)
            if (r5 > r3) goto L5a
            if (r0 > r3) goto L5a
            r5 = 720(0x2d0, float:1.009E-42)
            r3 = 960(0x3c0, float:1.345E-42)
            if (r0 <= r3) goto L3c
            if (r2 > r5) goto L5a
        L3c:
            if (r0 <= r5) goto L41
            if (r2 <= r3) goto L41
            goto L5a
        L41:
            r5 = 500(0x1f4, float:7.0E-43)
            if (r0 >= r5) goto L58
            r5 = 480(0x1e0, float:6.73E-43)
            r3 = 640(0x280, float:8.97E-43)
            if (r0 <= r3) goto L4d
            if (r2 > r5) goto L58
        L4d:
            if (r0 <= r5) goto L52
            if (r2 <= r3) goto L52
            goto L58
        L52:
            r5 = 360(0x168, float:5.04E-43)
            if (r0 < r5) goto L5b
            r1 = 3
            goto L5b
        L58:
            r1 = 4
            goto L5b
        L5a:
            r1 = 5
        L5b:
            r4.l0 = r1
            int r5 = r4.j0
            boolean r0 = r4.h0
            r1 = 0
            if (r0 == 0) goto L90
            f8 r0 = r4.e0
            if (r0 != 0) goto L88
            f8 r0 = new f8
            android.content.Context r2 = r4.A
            r0.<init>(r4, r2)
            r4.e0 = r0
            boolean r2 = r4.g0
            r3 = 0
            if (r2 == 0) goto L7f
            android.graphics.drawable.Drawable r2 = r4.f0
            r0.setImageDrawable(r2)
            r4.f0 = r1
            r4.g0 = r3
        L7f:
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r3)
            f8 r1 = r4.e0
            r1.measure(r0, r0)
        L88:
            f8 r0 = r4.e0
            int r0 = r0.getMeasuredWidth()
            int r5 = r5 - r0
            goto L92
        L90:
            r4.e0 = r1
        L92:
            r4.k0 = r5
            android.util.DisplayMetrics r4 = r6.getDisplayMetrics()
            float r4 = r4.density
            return
    }

    public final boolean l() {
            r5 = this;
            boolean r0 = r5.h0
            r1 = 0
            if (r0 == 0) goto L3d
            boolean r0 = r5.j()
            if (r0 != 0) goto L3d
            i44 r0 = r5.L
            if (r0 == 0) goto L3d
            d54 r2 = r5.d0
            if (r2 == 0) goto L3d
            uo2 r2 = r5.q0
            if (r2 != 0) goto L3d
            r0.i()
            java.util.ArrayList r0 = r0.j
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L3d
            d8 r0 = new d8
            android.content.Context r2 = r5.B
            i44 r3 = r5.L
            f8 r4 = r5.e0
            r0.<init>(r5, r2, r3, r4)
            uo2 r2 = new uo2
            r3 = 1
            r2.<init>(r3, r5, r0, r1)
            r5.q0 = r2
            d54 r5 = r5.d0
            android.view.View r5 = (android.view.View) r5
            r5.post(r2)
            return r3
        L3d:
            return r1
    }
}
