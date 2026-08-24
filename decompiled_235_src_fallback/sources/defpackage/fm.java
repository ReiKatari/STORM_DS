package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: fm  reason: default package */
/* loaded from: classes.dex */
public final class fm {
    public final defpackage.gm a;
    public final defpackage.dm b;
    public final defpackage.dm c;
    public final android.view.View d;

    public fm(defpackage.gm r1, defpackage.dm r2, defpackage.dm r3, android.view.View r4) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r4
            return
    }

    public final boolean a(android.view.Menu r17) {
            r16 = this;
            r0 = r16
            r1 = r17
            dm r2 = r0.b
            java.lang.Object r2 = r2.c()
            l07 r2 = (defpackage.l07) r2
            r3 = 0
            boolean r3 = defpackage.nb3.k(r2, r3)
            r4 = 0
            if (r3 == 0) goto L15
            return r4
        L15:
            r1.clear()
            java.util.List r2 = r2.a
            int r3 = r2.size()
            r5 = 1
            r6 = r4
            r7 = r5
            r8 = r7
        L22:
            if (r6 >= r3) goto L10a
            java.lang.Object r9 = r2.get(r6)
            k07 r9 = (defpackage.k07) r9
            boolean r10 = r9 instanceof defpackage.s07
            r11 = 2
            if (r10 == 0) goto L86
            int r10 = r7 + 1
            java.lang.Object r12 = r9.a
            java.lang.Object r13 = defpackage.nc1.i
            boolean r13 = defpackage.nb3.k(r12, r13)
            if (r13 == 0) goto L3f
            r12 = 16908320(0x1020020, float:2.387732E-38)
            goto L70
        L3f:
            java.lang.Object r13 = defpackage.nc1.j
            boolean r13 = defpackage.nb3.k(r12, r13)
            if (r13 == 0) goto L4b
            r12 = 16908321(0x1020021, float:2.3877321E-38)
            goto L70
        L4b:
            java.lang.Object r13 = defpackage.nc1.k
            boolean r13 = defpackage.nb3.k(r12, r13)
            if (r13 == 0) goto L57
            r12 = 16908322(0x1020022, float:2.3877324E-38)
            goto L70
        L57:
            java.lang.Object r13 = defpackage.nc1.l
            boolean r13 = defpackage.nb3.k(r12, r13)
            if (r13 == 0) goto L63
            r12 = 16908319(0x102001f, float:2.3877316E-38)
            goto L70
        L63:
            java.lang.Object r13 = defpackage.nc1.m
            boolean r12 = defpackage.nb3.k(r12, r13)
            if (r12 == 0) goto L6f
            r12 = 16908355(0x1020043, float:2.3877417E-38)
            goto L70
        L6f:
            r12 = r7
        L70:
            s07 r9 = (defpackage.s07) r9
            java.lang.String r13 = r9.b
            android.view.MenuItem r7 = r1.add(r8, r12, r7, r13)
            r7.setShowAsAction(r11)
            em r11 = new em
            r11.<init>(r4, r9, r0)
            r7.setOnMenuItemClickListener(r11)
        L83:
            r7 = r10
            goto L105
        L86:
            boolean r10 = r9 instanceof defpackage.y07
            if (r10 == 0) goto Lff
            int r10 = android.os.Build.VERSION.SDK_INT
            r12 = 28
            if (r10 < r12) goto L105
            int r10 = r7 + 1
            android.view.View r12 = r0.d
            android.content.Context r12 = r12.getContext()
            y07 r9 = (defpackage.y07) r9
            android.view.textclassifier.TextClassification r13 = r9.b
            int r9 = r9.c
            r14 = 16908353(0x1020041, float:2.387741E-38)
            if (r9 >= 0) goto Lbe
            java.lang.CharSequence r9 = defpackage.q66.m(r13)
            android.view.MenuItem r7 = r1.add(r14, r14, r7, r9)
            r7.setShowAsAction(r11)
            android.graphics.drawable.Drawable r9 = defpackage.q66.h(r13)
            r7.setIcon(r9)
            em r9 = new em
            r9.<init>(r5, r12, r13)
            r7.setOnMenuItemClickListener(r9)
            goto L83
        Lbe:
            if (r9 != 0) goto Lc2
            r15 = r5
            goto Lc3
        Lc2:
            r15 = r4
        Lc3:
            java.util.List r13 = defpackage.o05.i(r13)
            java.lang.Object r9 = r13.get(r9)
            android.app.RemoteAction r9 = defpackage.q66.d(r9)
            if (r15 == 0) goto Ld3
            r13 = r14
            goto Ld4
        Ld3:
            r13 = r4
        Ld4:
            java.lang.CharSequence r4 = defpackage.q66.l(r9)
            android.view.MenuItem r4 = r1.add(r14, r13, r7, r4)
            if (r15 == 0) goto Ldf
            goto Le0
        Ldf:
            r11 = 0
        Le0:
            r4.setShowAsAction(r11)
            if (r15 != 0) goto Leb
            boolean r7 = defpackage.o05.v(r9)
            if (r7 == 0) goto Lf6
        Leb:
            android.graphics.drawable.Icon r7 = defpackage.q66.A(r9)
            android.graphics.drawable.Drawable r7 = r7.loadDrawable(r12)
            r4.setIcon(r7)
        Lf6:
            v47 r7 = new v47
            r7.<init>(r9)
            r4.setOnMenuItemClickListener(r7)
            goto L83
        Lff:
            boolean r4 = r9 instanceof defpackage.w07
            if (r4 == 0) goto L105
            int r8 = r8 + 1
        L105:
            int r6 = r6 + 1
            r4 = 0
            goto L22
        L10a:
            return r5
    }
}
