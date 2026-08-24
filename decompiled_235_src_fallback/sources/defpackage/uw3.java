package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: uw3  reason: default package */
/* loaded from: classes.dex */
public final class uw3 implements defpackage.b54, android.widget.AdapterView.OnItemClickListener {
    public android.content.Context A;
    public android.view.LayoutInflater B;
    public defpackage.i44 L;
    public androidx.appcompat.view.menu.ExpandedMenuView R;
    public defpackage.a54 X;
    public defpackage.tw3 Y;

    public uw3(android.content.ContextWrapper r1) {
            r0 = this;
            r0.<init>()
            r0.A = r1
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r1)
            r0.B = r1
            return
    }

    @Override // defpackage.b54
    public final boolean b(defpackage.it6 r7) {
            r6 = this;
            boolean r0 = r7.hasVisibleItems()
            android.content.Context r1 = r7.a
            if (r0 != 0) goto La
            r6 = 0
            return r6
        La:
            k44 r0 = new k44
            r0.<init>()
            r0.A = r7
            zb r2 = new zb
            r2.<init>(r1)
            uw3 r3 = new uw3
            java.lang.Object r4 = r2.L
            wb r4 = (defpackage.wb) r4
            android.view.ContextThemeWrapper r5 = r4.a
            r3.<init>(r5)
            r0.L = r3
            r3.X = r0
            r7.b(r3, r1)
            uw3 r1 = r0.L
            tw3 r3 = r1.Y
            if (r3 != 0) goto L35
            tw3 r3 = new tw3
            r3.<init>(r1)
            r1.Y = r3
        L35:
            tw3 r1 = r1.Y
            r4.r = r1
            r4.s = r0
            android.view.View r1 = r7.o
            if (r1 == 0) goto L42
            r4.e = r1
            goto L4a
        L42:
            android.graphics.drawable.Drawable r1 = r7.n
            r4.c = r1
            java.lang.CharSequence r1 = r7.m
            r4.d = r1
        L4a:
            r4.p = r0
            ac r1 = r2.l()
            r0.B = r1
            r1.setOnDismissListener(r0)
            ac r1 = r0.B
            android.view.Window r1 = r1.getWindow()
            android.view.WindowManager$LayoutParams r1 = r1.getAttributes()
            r2 = 1003(0x3eb, float:1.406E-42)
            r1.type = r2
            int r2 = r1.flags
            r3 = 131072(0x20000, float:1.83671E-40)
            r2 = r2 | r3
            r1.flags = r2
            ac r0 = r0.B
            r0.show()
            a54 r6 = r6.X
            if (r6 == 0) goto L76
            r6.M(r7)
        L76:
            r6 = 1
            return r6
    }

    @Override // defpackage.b54
    public final boolean c() {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // defpackage.b54
    public final void d(defpackage.i44 r1, boolean r2) {
            r0 = this;
            a54 r0 = r0.X
            if (r0 == 0) goto L7
            r0.d(r1, r2)
        L7:
            return
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
            r0 = this;
            tw3 r0 = r0.Y
            if (r0 == 0) goto L7
            r0.notifyDataSetChanged()
        L7:
            return
    }

    @Override // defpackage.b54
    public final void k(android.content.Context r2, defpackage.i44 r3) {
            r1 = this;
            android.content.Context r0 = r1.A
            if (r0 == 0) goto L10
            r1.A = r2
            android.view.LayoutInflater r0 = r1.B
            if (r0 != 0) goto L10
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r2)
            r1.B = r2
        L10:
            r1.L = r3
            tw3 r1 = r1.Y
            if (r1 == 0) goto L19
            r1.notifyDataSetChanged()
        L19:
            return
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(android.widget.AdapterView r1, android.view.View r2, int r3, long r4) {
            r0 = this;
            i44 r1 = r0.L
            tw3 r2 = r0.Y
            o44 r2 = r2.b(r3)
            r3 = 0
            r1.q(r2, r0, r3)
            return
    }
}
