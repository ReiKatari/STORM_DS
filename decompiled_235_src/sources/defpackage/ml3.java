package defpackage;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import me.magnum.melonds.ui.layouteditor.LayoutEditorView;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ml3  reason: default package */
/* loaded from: classes.dex */
public final class ml3 implements View.OnTouchListener {
    public boolean A;
    public float B = -1.0f;
    public float L = -1.0f;
    public final /* synthetic */ LayoutEditorView R;
    public final /* synthetic */ zj3 X;
    public final /* synthetic */ GestureDetector Y;

    public ml3(LayoutEditorView layoutEditorView, zj3 zj3Var, GestureDetector gestureDetector) {
        this.R = layoutEditorView;
        this.X = zj3Var;
        this.Y = gestureDetector;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z;
        if (view != null && motionEvent != null) {
            int action = motionEvent.getAction();
            LayoutEditorView layoutEditorView = this.R;
            GestureDetector gestureDetector = this.Y;
            zj3 zj3Var = this.X;
            if (action != 0) {
                if (action != 1) {
                    if (action != 2) {
                        if (action == 3) {
                            gestureDetector.onTouchEvent(motionEvent);
                            if (this.A) {
                                view.setAlpha(0.5f);
                                zj3Var.c(false);
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
                            int i = LayoutEditorView.p0;
                            layoutEditorView.o(zj3Var, x, y);
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
                        zj3Var.c(false);
                        this.A = false;
                        return true;
                    } else if (!z) {
                        int i2 = LayoutEditorView.p0;
                        layoutEditorView.v(zj3Var);
                        view.performClick();
                    }
                }
                return true;
            }
            zj3 zj3Var2 = layoutEditorView.h0;
            if (zj3Var2 != null && zj3Var2 != zj3Var) {
                layoutEditorView.n();
            }
            this.B = motionEvent.getX();
            this.L = motionEvent.getY();
            view.setAlpha(1.0f);
            zj3Var.c(true);
            gestureDetector.onTouchEvent(motionEvent);
            return true;
        }
        return false;
    }
}
