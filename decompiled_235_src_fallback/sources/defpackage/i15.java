package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: i15  reason: default package */
/* loaded from: classes.dex */
public final class i15 extends defpackage.dg5 {
    public android.graphics.drawable.Drawable a;
    public int b;
    public boolean c;
    public final /* synthetic */ defpackage.k15 d;

    public i15(defpackage.k15 r1) {
            r0 = this;
            r0.<init>()
            r0.d = r1
            r1 = 1
            r0.c = r1
            return
    }

    @Override // defpackage.dg5
    public final void a(android.graphics.Rect r1, android.view.View r2, androidx.recyclerview.widget.RecyclerView r3, defpackage.sg5 r4) {
            r0 = this;
            boolean r2 = r0.d(r2, r3)
            if (r2 == 0) goto La
            int r0 = r0.b
            r1.bottom = r0
        La:
            return
    }

    @Override // defpackage.dg5
    public final void c(android.graphics.Canvas r8, androidx.recyclerview.widget.RecyclerView r9) {
            r7 = this;
            android.graphics.drawable.Drawable r0 = r7.a
            if (r0 != 0) goto L5
            goto L35
        L5:
            int r0 = r9.getChildCount()
            int r1 = r9.getWidth()
            r2 = 0
            r3 = r2
        Lf:
            if (r3 >= r0) goto L35
            android.view.View r4 = r9.getChildAt(r3)
            boolean r5 = r7.d(r4, r9)
            if (r5 == 0) goto L32
            float r5 = r4.getY()
            int r5 = (int) r5
            int r4 = r4.getHeight()
            int r4 = r4 + r5
            android.graphics.drawable.Drawable r5 = r7.a
            int r6 = r7.b
            int r6 = r6 + r4
            r5.setBounds(r2, r4, r1, r6)
            android.graphics.drawable.Drawable r4 = r7.a
            r4.draw(r8)
        L32:
            int r3 = r3 + 1
            goto Lf
        L35:
            return
    }

    public final boolean d(android.view.View r3, androidx.recyclerview.widget.RecyclerView r4) {
            r2 = this;
            wg5 r0 = r4.M(r3)
            boolean r1 = r0 instanceof defpackage.x15
            if (r1 == 0) goto L31
            x15 r0 = (defpackage.x15) r0
            boolean r0 = r0.y
            if (r0 == 0) goto L31
            boolean r2 = r2.c
            int r3 = r4.indexOfChild(r3)
            int r0 = r4.getChildCount()
            r1 = 1
            int r0 = r0 - r1
            if (r3 >= r0) goto L30
            int r3 = r3 + r1
            android.view.View r2 = r4.getChildAt(r3)
            wg5 r2 = r4.M(r2)
            boolean r3 = r2 instanceof defpackage.x15
            if (r3 == 0) goto L31
            x15 r2 = (defpackage.x15) r2
            boolean r2 = r2.x
            if (r2 == 0) goto L31
            return r1
        L30:
            return r2
        L31:
            r2 = 0
            return r2
    }
}
