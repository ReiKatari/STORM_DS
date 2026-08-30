package defpackage;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: kx5  reason: default package */
/* loaded from: classes.dex */
public final class kx5 extends TouchDelegate {
    public final View a;
    public final Rect b;
    public final Rect c;
    public final Rect d;
    public final int e;
    public boolean f;

    public kx5(View view, Rect rect, Rect rect2) {
        super(rect, view);
        int scaledTouchSlop = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        this.e = scaledTouchSlop;
        Rect rect3 = new Rect();
        this.b = rect3;
        Rect rect4 = new Rect();
        this.d = rect4;
        Rect rect5 = new Rect();
        this.c = rect5;
        rect3.set(rect);
        rect4.set(rect);
        int i = -scaledTouchSlop;
        rect4.inset(i, i);
        rect5.set(rect2);
        this.a = view;
    }

    @Override // android.view.TouchDelegate
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        int action = motionEvent.getAction();
        boolean z3 = true;
        if (action != 0) {
            if (action != 1 && action != 2) {
                if (action == 3) {
                    z2 = this.f;
                    this.f = false;
                }
                z = true;
                z3 = false;
            } else {
                z2 = this.f;
                if (z2 && !this.d.contains(x, y)) {
                    z3 = z2;
                    z = false;
                }
            }
            z3 = z2;
            z = true;
        } else {
            if (this.b.contains(x, y)) {
                this.f = true;
                z = true;
            }
            z = true;
            z3 = false;
        }
        if (!z3) {
            return false;
        }
        Rect rect = this.c;
        View view = this.a;
        if (z && !rect.contains(x, y)) {
            motionEvent.setLocation(view.getWidth() / 2, view.getHeight() / 2);
        } else {
            motionEvent.setLocation(x - rect.left, y - rect.top);
        }
        return view.dispatchTouchEvent(motionEvent);
    }
}
