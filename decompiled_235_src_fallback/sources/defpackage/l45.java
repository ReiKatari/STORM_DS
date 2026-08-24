package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: l45  reason: default package */
/* loaded from: classes.dex */
public final class l45 {
    public final java.util.ArrayList a;
    public final defpackage.hx6 b;
    public defpackage.e83 c;
    public defpackage.e83 d;
    public int e;
    public boolean f;

    public l45(defpackage.hx6 r2, java.util.ArrayList r3) {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.a = r0
            e83 r0 = defpackage.e83.e
            r1.c = r0
            r1.d = r0
            r0 = 0
            r1.a(r3, r0)
            r0 = 1
            r1.a(r3, r0)
            java.util.ArrayList r3 = r2.b
            boolean r0 = r3.contains(r1)
            if (r0 == 0) goto L21
            goto L34
        L21:
            r3.add(r1)
            e83 r3 = r2.c
            e83 r0 = r2.d
            r1.c = r3
            r1.d = r0
            r1.c()
            int r3 = r2.e
            r1.b(r3)
        L34:
            r1.b = r2
            return
    }

    public final void a(java.util.List r6, boolean r7) {
            r5 = this;
            int r0 = r6.size()
            r1 = 0
        L5:
            if (r1 >= r0) goto L55
            java.lang.Object r2 = r6.get(r1)
            mt0 r2 = (defpackage.mt0) r2
            r2.getClass()
            r3 = 1
            if (r3 == r7) goto L14
            goto L1f
        L14:
            l45 r4 = r2.e
            if (r4 != 0) goto L22
            r2.e = r5
            java.util.ArrayList r3 = r5.a
            r3.add(r2)
        L1f:
            int r1 = r1 + 1
            goto L5
        L22:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r2)
            int r1 = r1 + r3
            java.lang.String r2 = " ("
            r7.append(r2)
            r7.append(r1)
            java.lang.String r1 = "/"
            r7.append(r1)
            r7.append(r0)
            java.lang.String r0 = ") is already controlled by "
            r7.append(r0)
            r7.append(r4)
            java.lang.String r0 = " but is still added to "
            r7.append(r0)
            r7.append(r5)
            java.lang.String r5 = r7.toString()
            r6.<init>(r5)
            throw r6
        L55:
            return
    }

    public final void b(int r5) {
            r4 = this;
            java.util.ArrayList r4 = r4.a
            int r0 = r4.size()
            int r0 = r0 + (-1)
        L8:
            if (r0 < 0) goto L31
            java.lang.Object r1 = r4.get(r0)
            mt0 r1 = (defpackage.mt0) r1
            boolean r2 = r1.g
            if (r2 != 0) goto L2e
            android.graphics.drawable.ColorDrawable r2 = r1.f
            int r3 = r1.h
            if (r3 == r5) goto L2e
            r1.h = r5
            r2.setColor(r5)
            k45 r1 = r1.b
            r1.e = r2
            ap3 r1 = r1.i
            if (r1 == 0) goto L2e
            java.lang.Object r1 = r1.L
            android.view.View r1 = (android.view.View) r1
            r1.setBackground(r2)
        L2e:
            int r0 = r0 + (-1)
            goto L8
        L31:
            return
    }

    public final void c() {
            r13 = this;
            java.util.ArrayList r0 = r13.a
            int r1 = r0.size()
            r2 = 1
            int r1 = r1 - r2
            e83 r3 = defpackage.e83.e
            r4 = r3
        Lb:
            if (r1 < 0) goto L11a
            java.lang.Object r5 = r0.get(r1)
            mt0 r5 = (defpackage.mt0) r5
            e83 r6 = r13.c
            e83 r7 = r13.d
            r5.c = r6
            k45 r6 = r5.b
            r5.d = r7
            e83 r7 = r6.c
            boolean r7 = r7.equals(r4)
            if (r7 != 0) goto L46
            r6.c = r4
            ap3 r7 = r6.i
            if (r7 == 0) goto L46
            java.lang.Object r8 = r7.B
            android.widget.FrameLayout$LayoutParams r8 = (android.widget.FrameLayout.LayoutParams) r8
            int r9 = r4.a
            r8.leftMargin = r9
            int r9 = r4.b
            r8.topMargin = r9
            int r9 = r4.c
            r8.rightMargin = r9
            int r9 = r4.d
            r8.bottomMargin = r9
            java.lang.Object r7 = r7.L
            android.view.View r7 = (android.view.View) r7
            r7.setLayoutParams(r8)
        L46:
            int r7 = r5.a
            r8 = 8
            r9 = 0
            if (r7 == r2) goto Lc5
            r10 = 2
            if (r7 == r10) goto La1
            r10 = 4
            if (r7 == r10) goto L7d
            if (r7 == r8) goto L59
            r10 = r3
            r7 = r9
            goto Le8
        L59:
            e83 r7 = r5.c
            int r7 = r7.d
            e83 r10 = r5.d
            int r10 = r10.d
            int r11 = r6.b
            if (r11 == r10) goto L78
            r6.b = r10
            ap3 r11 = r6.i
            if (r11 == 0) goto L78
            java.lang.Object r12 = r11.B
            android.widget.FrameLayout$LayoutParams r12 = (android.widget.FrameLayout.LayoutParams) r12
            r12.height = r10
            java.lang.Object r10 = r11.L
            android.view.View r10 = (android.view.View) r10
            r10.setLayoutParams(r12)
        L78:
            e83 r10 = defpackage.e83.c(r9, r9, r9, r7)
            goto Le8
        L7d:
            e83 r7 = r5.c
            int r7 = r7.c
            e83 r10 = r5.d
            int r10 = r10.c
            int r11 = r6.a
            if (r11 == r10) goto L9c
            r6.a = r10
            ap3 r11 = r6.i
            if (r11 == 0) goto L9c
            java.lang.Object r12 = r11.B
            android.widget.FrameLayout$LayoutParams r12 = (android.widget.FrameLayout.LayoutParams) r12
            r12.width = r10
            java.lang.Object r10 = r11.L
            android.view.View r10 = (android.view.View) r10
            r10.setLayoutParams(r12)
        L9c:
            e83 r10 = defpackage.e83.c(r9, r9, r7, r9)
            goto Le8
        La1:
            e83 r7 = r5.c
            int r7 = r7.b
            e83 r10 = r5.d
            int r10 = r10.b
            int r11 = r6.b
            if (r11 == r10) goto Lc0
            r6.b = r10
            ap3 r11 = r6.i
            if (r11 == 0) goto Lc0
            java.lang.Object r12 = r11.B
            android.widget.FrameLayout$LayoutParams r12 = (android.widget.FrameLayout.LayoutParams) r12
            r12.height = r10
            java.lang.Object r10 = r11.L
            android.view.View r10 = (android.view.View) r10
            r10.setLayoutParams(r12)
        Lc0:
            e83 r10 = defpackage.e83.c(r9, r7, r9, r9)
            goto Le8
        Lc5:
            e83 r7 = r5.c
            int r7 = r7.a
            e83 r10 = r5.d
            int r10 = r10.a
            int r11 = r6.a
            if (r11 == r10) goto Le4
            r6.a = r10
            ap3 r11 = r6.i
            if (r11 == 0) goto Le4
            java.lang.Object r12 = r11.B
            android.widget.FrameLayout$LayoutParams r12 = (android.widget.FrameLayout.LayoutParams) r12
            r12.width = r10
            java.lang.Object r10 = r11.L
            android.view.View r10 = (android.view.View) r10
            r10.setLayoutParams(r12)
        Le4:
            e83 r10 = defpackage.e83.c(r7, r9, r9, r9)
        Le8:
            if (r7 <= 0) goto Lec
            r11 = r2
            goto Led
        Lec:
            r11 = r9
        Led:
            boolean r12 = r6.d
            if (r12 == r11) goto L101
            r6.d = r11
            ap3 r6 = r6.i
            if (r6 == 0) goto L101
            java.lang.Object r6 = r6.L
            android.view.View r6 = (android.view.View) r6
            if (r11 == 0) goto Lfe
            r8 = r9
        Lfe:
            r6.setVisibility(r8)
        L101:
            r6 = 0
            r8 = 1065353216(0x3f800000, float:1.0)
            if (r7 <= 0) goto L108
            r9 = r8
            goto L109
        L108:
            r9 = r6
        L109:
            r5.a(r9)
            if (r7 <= 0) goto L10f
            r6 = r8
        L10f:
            r5.b(r6)
            e83 r4 = defpackage.e83.a(r4, r10)
            int r1 = r1 + (-1)
            goto Lb
        L11a:
            return
    }
}
