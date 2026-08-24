package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: nl3  reason: default package */
/* loaded from: classes.dex */
public final class nl3 extends android.view.GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ me.magnum.melonds.ui.layouteditor.LayoutEditorView a;
    public final /* synthetic */ defpackage.zj3 b;

    public nl3(me.magnum.melonds.ui.layouteditor.LayoutEditorView r1, defpackage.zj3 r2) {
            r0 = this;
            r0.a = r1
            r0.b = r2
            r0.<init>()
            return
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(android.view.MotionEvent r2) {
            r1 = this;
            r2.getClass()
            int r2 = me.magnum.melonds.ui.layouteditor.LayoutEditorView.p0
            me.magnum.melonds.ui.layouteditor.LayoutEditorView r2 = r1.a
            zj3 r1 = r1.b
            r2.v(r1)
            qn2 r0 = r2.l0
            if (r0 == 0) goto L17
            uj3 r2 = r2.i(r1)
            r0.g(r2)
        L17:
            android.view.View r1 = r1.a
            r1.performClick()
            r1 = 1
            return r1
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(android.view.MotionEvent r1) {
            r0 = this;
            r1.getClass()
            r0 = 1
            return r0
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(android.view.MotionEvent r1) {
            r0 = this;
            r1.getClass()
            int r1 = me.magnum.melonds.ui.layouteditor.LayoutEditorView.p0
            me.magnum.melonds.ui.layouteditor.LayoutEditorView r1 = r0.a
            zj3 r0 = r0.b
            r1.v(r0)
            android.view.View r0 = r0.a
            r0.performClick()
            r0 = 1
            return r0
    }
}
