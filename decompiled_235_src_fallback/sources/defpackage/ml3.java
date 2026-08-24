package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ml3  reason: default package */
/* loaded from: classes.dex */
public final class ml3 implements android.view.View.OnTouchListener {
    public boolean A;
    public float B;
    public float L;
    public final /* synthetic */ me.magnum.melonds.ui.layouteditor.LayoutEditorView R;
    public final /* synthetic */ defpackage.zj3 X;
    public final /* synthetic */ android.view.GestureDetector Y;

    public ml3(me.magnum.melonds.ui.layouteditor.LayoutEditorView r1, defpackage.zj3 r2, android.view.GestureDetector r3) {
            r0 = this;
            r0.<init>()
            r0.R = r1
            r0.X = r2
            r0.Y = r3
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0.B = r1
            r0.L = r1
            return
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View r9, android.view.MotionEvent r10) {
            r8 = this;
            r0 = 0
            if (r9 == 0) goto Lba
            if (r10 != 0) goto L7
            goto Lba
        L7:
            int r1 = r10.getAction()
            me.magnum.melonds.ui.layouteditor.LayoutEditorView r2 = r8.R
            android.view.GestureDetector r3 = r8.Y
            zj3 r4 = r8.X
            r5 = 1
            if (r1 == 0) goto L99
            r6 = 1056964608(0x3f000000, float:0.5)
            if (r1 == r5) goto L77
            r7 = 2
            if (r1 == r7) goto L30
            r2 = 3
            if (r1 == r2) goto L20
            goto Lba
        L20:
            r3.onTouchEvent(r10)
            boolean r10 = r8.A
            if (r10 == 0) goto L98
            r9.setAlpha(r6)
            r4.c(r0)
            r8.A = r0
            return r5
        L30:
            boolean r9 = r8.A
            if (r9 != 0) goto L60
            float r9 = r10.getX()
            float r0 = r8.B
            float r9 = r9 - r0
            double r0 = (double) r9
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r0 = java.lang.Math.pow(r0, r6)
            float r9 = (float) r0
            float r0 = r10.getY()
            float r1 = r8.L
            float r0 = r0 - r1
            double r0 = (double) r0
            double r0 = java.lang.Math.pow(r0, r6)
            float r0 = (float) r0
            float r9 = r9 + r0
            double r0 = (double) r9
            double r0 = java.lang.Math.sqrt(r0)
            float r9 = (float) r0
            r0 = 1103626240(0x41c80000, float:25.0)
            int r9 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r9 < 0) goto L73
            r8.A = r5
            goto L73
        L60:
            float r9 = r10.getX()
            float r0 = r8.B
            float r9 = r9 - r0
            float r0 = r10.getY()
            float r8 = r8.L
            float r0 = r0 - r8
            int r8 = me.magnum.melonds.ui.layouteditor.LayoutEditorView.p0
            r2.o(r4, r9, r0)
        L73:
            r3.onTouchEvent(r10)
            return r5
        L77:
            boolean r1 = r8.A
            if (r1 != 0) goto L80
            boolean r10 = r3.onTouchEvent(r10)
            goto L81
        L80:
            r10 = r0
        L81:
            boolean r1 = r8.A
            if (r1 == 0) goto L8e
            r9.setAlpha(r6)
            r4.c(r0)
            r8.A = r0
            return r5
        L8e:
            if (r10 != 0) goto L98
            int r8 = me.magnum.melonds.ui.layouteditor.LayoutEditorView.p0
            r2.v(r4)
            r9.performClick()
        L98:
            return r5
        L99:
            zj3 r0 = r2.h0
            if (r0 == 0) goto La2
            if (r0 == r4) goto La2
            r2.n()
        La2:
            float r0 = r10.getX()
            r8.B = r0
            float r0 = r10.getY()
            r8.L = r0
            r8 = 1065353216(0x3f800000, float:1.0)
            r9.setAlpha(r8)
            r4.c(r5)
            r3.onTouchEvent(r10)
            return r5
        Lba:
            return r0
    }
}
