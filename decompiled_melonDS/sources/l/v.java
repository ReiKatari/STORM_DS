package l;

import android.view.KeyEvent;
import android.view.MotionEvent;
import androidx.appcompat.widget.ContentFrameLayout;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class v extends ContentFrameLayout {

    /* renamed from: f0  reason: collision with root package name */
    public final /* synthetic */ x f8446f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(x xVar, o.c cVar) {
        super(cVar, null);
        this.f8446f0 = xVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.f8446f0.u(keyEvent) && !super.dispatchKeyEvent(keyEvent)) {
            return false;
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            int x9 = (int) motionEvent.getX();
            int y10 = (int) motionEvent.getY();
            if (x9 < -5 || y10 < -5 || x9 > getWidth() + 5 || y10 > getHeight() + 5) {
                x xVar = this.f8446f0;
                xVar.s(xVar.z(0), true);
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i2) {
        setBackgroundDrawable(k7.w.p(getContext(), i2));
    }
}
