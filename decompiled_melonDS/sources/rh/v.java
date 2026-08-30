package rh;

import android.view.MotionEvent;
import android.view.View;
import me.magnum.melonds.ui.layouteditor.LayoutEditorView;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class v implements View.OnTouchListener {
    public boolean A;
    public float B = -1.0f;
    public float L = -1.0f;
    public final /* synthetic */ LayoutEditorView R;
    public final /* synthetic */ og.i X;

    public v(LayoutEditorView layoutEditorView, og.i iVar) {
        this.R = layoutEditorView;
        this.X = iVar;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        Integer num;
        og.i iVar = this.X;
        View view2 = iVar.f11005a;
        if (view != null) {
            LayoutEditorView layoutEditorView = this.R;
            if (layoutEditorView.f9533f0 != null) {
                layoutEditorView.j();
            }
            if (motionEvent != null) {
                num = Integer.valueOf(motionEvent.getAction());
            } else {
                num = null;
            }
            if (num != null && num.intValue() == 0) {
                this.B = motionEvent.getX();
                this.L = motionEvent.getY();
                view.setAlpha(1.0f);
                view2.setSelected(true);
                return true;
            } else if (num != null && num.intValue() == 2) {
                if (!this.A) {
                    double d4 = 2.0f;
                    if (((float) Math.sqrt(((float) Math.pow(motionEvent.getX() - this.B, d4)) + ((float) Math.pow(motionEvent.getY() - this.L, d4)))) >= 25.0f) {
                        this.A = true;
                    }
                    return true;
                }
                layoutEditorView.k(iVar, motionEvent.getX() - this.B, motionEvent.getY() - this.L);
                return true;
            } else if ((num != null && num.intValue() == 3) || (num != null && num.intValue() == 1)) {
                if (!this.A) {
                    LayoutEditorView.g(layoutEditorView, iVar);
                    return true;
                }
                view.setAlpha(0.5f);
                view2.setSelected(false);
                this.A = false;
                return true;
            }
        }
        return false;
    }
}
