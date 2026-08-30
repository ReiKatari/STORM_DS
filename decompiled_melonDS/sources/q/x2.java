package q;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class x2 extends TouchDelegate {

    /* renamed from: a  reason: collision with root package name */
    public final View f12053a;

    /* renamed from: b  reason: collision with root package name */
    public final Rect f12054b;

    /* renamed from: c  reason: collision with root package name */
    public final Rect f12055c;

    /* renamed from: d  reason: collision with root package name */
    public final Rect f12056d;

    /* renamed from: e  reason: collision with root package name */
    public final int f12057e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f12058f;

    public x2(View view, Rect rect, Rect rect2) {
        super(rect, view);
        int scaledTouchSlop = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        this.f12057e = scaledTouchSlop;
        Rect rect3 = new Rect();
        this.f12054b = rect3;
        Rect rect4 = new Rect();
        this.f12056d = rect4;
        Rect rect5 = new Rect();
        this.f12055c = rect5;
        rect3.set(rect);
        rect4.set(rect);
        int i2 = -scaledTouchSlop;
        rect4.inset(i2, i2);
        rect5.set(rect2);
        this.f12053a = view;
    }

    @Override // android.view.TouchDelegate
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        boolean z11;
        int x9 = (int) motionEvent.getX();
        int y10 = (int) motionEvent.getY();
        int action = motionEvent.getAction();
        boolean z12 = true;
        if (action != 0) {
            if (action != 1 && action != 2) {
                if (action == 3) {
                    z11 = this.f12058f;
                    this.f12058f = false;
                }
                z10 = true;
                z12 = false;
            } else {
                z11 = this.f12058f;
                if (z11 && !this.f12056d.contains(x9, y10)) {
                    z12 = z11;
                    z10 = false;
                }
            }
            z12 = z11;
            z10 = true;
        } else {
            if (this.f12054b.contains(x9, y10)) {
                this.f12058f = true;
                z10 = true;
            }
            z10 = true;
            z12 = false;
        }
        if (!z12) {
            return false;
        }
        Rect rect = this.f12055c;
        View view = this.f12053a;
        if (z10 && !rect.contains(x9, y10)) {
            motionEvent.setLocation(view.getWidth() / 2, view.getHeight() / 2);
        } else {
            motionEvent.setLocation(x9 - rect.left, y10 - rect.top);
        }
        return view.dispatchTouchEvent(motionEvent);
    }
}
