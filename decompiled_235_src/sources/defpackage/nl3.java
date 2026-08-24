package defpackage;

import android.view.GestureDetector;
import android.view.MotionEvent;
import me.magnum.melonds.ui.layouteditor.LayoutEditorView;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: nl3  reason: default package */
/* loaded from: classes.dex */
public final class nl3 extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ LayoutEditorView a;
    public final /* synthetic */ zj3 b;

    public nl3(LayoutEditorView layoutEditorView, zj3 zj3Var) {
        this.a = layoutEditorView;
        this.b = zj3Var;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        motionEvent.getClass();
        int i = LayoutEditorView.p0;
        LayoutEditorView layoutEditorView = this.a;
        zj3 zj3Var = this.b;
        layoutEditorView.v(zj3Var);
        qn2 qn2Var = layoutEditorView.l0;
        if (qn2Var != null) {
            qn2Var.g(layoutEditorView.i(zj3Var));
        }
        zj3Var.a.performClick();
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        motionEvent.getClass();
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        motionEvent.getClass();
        int i = LayoutEditorView.p0;
        LayoutEditorView layoutEditorView = this.a;
        zj3 zj3Var = this.b;
        layoutEditorView.v(zj3Var);
        zj3Var.a.performClick();
        return true;
    }
}
