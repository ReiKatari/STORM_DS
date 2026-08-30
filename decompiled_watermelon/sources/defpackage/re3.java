package defpackage;

import android.view.GestureDetector;
import android.view.MotionEvent;
import me.magnum.melonds.ui.layouteditor.LayoutEditorView;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: re3  reason: default package */
/* loaded from: classes.dex */
public final class re3 extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ LayoutEditorView a;
    public final /* synthetic */ hd3 b;

    public re3(LayoutEditorView layoutEditorView, hd3 hd3Var) {
        this.a = layoutEditorView;
        this.b = hd3Var;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        motionEvent.getClass();
        int i = LayoutEditorView.l0;
        LayoutEditorView layoutEditorView = this.a;
        hd3 hd3Var = this.b;
        layoutEditorView.u(hd3Var);
        mi2 mi2Var = layoutEditorView.k0;
        if (mi2Var != null) {
            mi2Var.n(layoutEditorView.i(hd3Var));
        }
        hd3Var.a.performClick();
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
        int i = LayoutEditorView.l0;
        LayoutEditorView layoutEditorView = this.a;
        hd3 hd3Var = this.b;
        layoutEditorView.u(hd3Var);
        hd3Var.a.performClick();
        return true;
    }
}
