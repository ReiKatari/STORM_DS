package defpackage;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import me.magnum.melonds.ui.layouteditor.LayoutEditorView;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: qe3  reason: default package */
/* loaded from: classes.dex */
public final class qe3 implements View.OnTouchListener {
    public boolean A;
    public float B = -1.0f;
    public float L = -1.0f;
    public final /* synthetic */ LayoutEditorView R;
    public final /* synthetic */ hd3 X;
    public final /* synthetic */ GestureDetector Y;

    public qe3(LayoutEditorView layoutEditorView, hd3 hd3Var, GestureDetector gestureDetector) {
        this.R = layoutEditorView;
        this.X = hd3Var;
        this.Y = gestureDetector;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z;
        if (view != null && motionEvent != null) {
            int action = motionEvent.getAction();
            LayoutEditorView layoutEditorView = this.R;
            GestureDetector gestureDetector = this.Y;
            hd3 hd3Var = this.X;
            if (action != 0) {
                if (action != 1) {
                    if (action != 2) {
                        if (action == 3) {
                            gestureDetector.onTouchEvent(motionEvent);
                            if (this.A) {
                                view.setAlpha(0.5f);
                                hd3Var.c(false);
                                this.A = false;
                                return true;
                            }
                        }
                    } else {
                        if (!this.A) {
                            if (((float) Math.sqrt(((float) Math.pow(motionEvent.getX() - this.B, 2.0d)) + ((float) Math.pow(motionEvent.getY() - this.L, 2.0d)))) >= 25.0f) {
                                this.A = true;
                            }
                        } else {
                            float x = motionEvent.getX() - this.B;
                            float y = motionEvent.getY() - this.L;
                            int i = LayoutEditorView.l0;
                            layoutEditorView.n(hd3Var, x, y);
                        }
                        gestureDetector.onTouchEvent(motionEvent);
                        return true;
                    }
                } else {
                    if (!this.A) {
                        z = gestureDetector.onTouchEvent(motionEvent);
                    } else {
                        z = false;
                    }
                    if (this.A) {
                        view.setAlpha(0.5f);
                        hd3Var.c(false);
                        this.A = false;
                        return true;
                    } else if (!z) {
                        int i2 = LayoutEditorView.l0;
                        layoutEditorView.u(hd3Var);
                        view.performClick();
                    }
                }
                return true;
            }
            hd3 hd3Var2 = layoutEditorView.g0;
            if (hd3Var2 != null && hd3Var2 != hd3Var) {
                layoutEditorView.m();
            }
            this.B = motionEvent.getX();
            this.L = motionEvent.getY();
            view.setAlpha(1.0f);
            hd3Var.c(true);
            gestureDetector.onTouchEvent(motionEvent);
            return true;
        }
        return false;
    }
}
