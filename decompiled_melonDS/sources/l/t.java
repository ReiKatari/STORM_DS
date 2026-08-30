package l;

import a6.f1;
import a6.n0;
import a6.x0;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import android.widget.PopupWindow;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ViewStubCompat;
import java.util.List;
import java.util.WeakHashMap;
import me.magnum.melonds.R;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class t implements Window.Callback {
    public final Window.Callback A;
    public d0 B;
    public boolean L;
    public boolean R;
    public boolean X;
    public final /* synthetic */ x Y;

    public t(x xVar, Window.Callback callback) {
        this.Y = xVar;
        if (callback != null) {
            this.A = callback;
        } else {
            a0.j.h("Window callback may not be null");
            throw null;
        }
    }

    public final void a(Window.Callback callback) {
        try {
            this.L = true;
            callback.onContentChanged();
        } finally {
            this.L = false;
        }
    }

    public final boolean b(int i2, Menu menu) {
        return this.A.onMenuOpened(i2, menu);
    }

    public final void c(int i2, Menu menu) {
        this.A.onPanelClosed(i2, menu);
    }

    public final void d(List list, Menu menu, int i2) {
        o.l.a(this.A, list, menu, i2);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.A.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z10 = this.R;
        Window.Callback callback = this.A;
        if (z10) {
            return callback.dispatchKeyEvent(keyEvent);
        }
        if (!this.Y.u(keyEvent) && !callback.dispatchKeyEvent(keyEvent)) {
            return false;
        }
        return true;
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        if (!this.A.dispatchKeyShortcutEvent(keyEvent)) {
            int keyCode = keyEvent.getKeyCode();
            x xVar = this.Y;
            xVar.A();
            aj.g gVar = xVar.f8471i0;
            if (gVar == null || !gVar.S(keyCode, keyEvent)) {
                w wVar = xVar.G0;
                if (wVar != null && xVar.F(wVar, keyEvent.getKeyCode(), keyEvent)) {
                    w wVar2 = xVar.G0;
                    if (wVar2 != null) {
                        wVar2.f8458l = true;
                        return true;
                    }
                } else {
                    if (xVar.G0 == null) {
                        w z10 = xVar.z(0);
                        xVar.G(z10, keyEvent);
                        boolean F = xVar.F(z10, keyEvent.getKeyCode(), keyEvent);
                        z10.f8457k = false;
                        if (F) {
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.A.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.A.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.A.dispatchTrackballEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeFinished(ActionMode actionMode) {
        this.A.onActionModeFinished(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeStarted(ActionMode actionMode) {
        this.A.onActionModeStarted(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onAttachedToWindow() {
        this.A.onAttachedToWindow();
    }

    @Override // android.view.Window.Callback
    public final void onContentChanged() {
        if (this.L) {
            this.A.onContentChanged();
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i2, Menu menu) {
        if (i2 == 0 && !(menu instanceof p.l)) {
            return false;
        }
        return this.A.onCreatePanelMenu(i2, menu);
    }

    @Override // android.view.Window.Callback
    public final View onCreatePanelView(int i2) {
        View view;
        d0 d0Var = this.B;
        if (d0Var != null) {
            if (i2 == 0) {
                view = new View(d0Var.A.f8381l.f11964a.getContext());
            } else {
                view = null;
            }
            if (view != null) {
                return view;
            }
        }
        return this.A.onCreatePanelView(i2);
    }

    @Override // android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.A.onDetachedFromWindow();
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuItemSelected(int i2, MenuItem menuItem) {
        return this.A.onMenuItemSelected(i2, menuItem);
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuOpened(int i2, Menu menu) {
        b(i2, menu);
        if (i2 == 108) {
            x xVar = this.Y;
            xVar.A();
            aj.g gVar = xVar.f8471i0;
            if (gVar != null) {
                gVar.r(true);
            }
        }
        return true;
    }

    @Override // android.view.Window.Callback
    public final void onPanelClosed(int i2, Menu menu) {
        if (this.X) {
            this.A.onPanelClosed(i2, menu);
            return;
        }
        c(i2, menu);
        x xVar = this.Y;
        if (i2 == 108) {
            xVar.A();
            aj.g gVar = xVar.f8471i0;
            if (gVar != null) {
                gVar.r(false);
            }
        } else if (i2 == 0) {
            w z10 = xVar.z(i2);
            if (z10.m) {
                xVar.s(z10, false);
            }
        }
    }

    @Override // android.view.Window.Callback
    public final void onPointerCaptureChanged(boolean z10) {
        o.m.a(this.A, z10);
    }

    @Override // android.view.Window.Callback
    public final boolean onPreparePanel(int i2, View view, Menu menu) {
        p.l lVar;
        if (menu instanceof p.l) {
            lVar = (p.l) menu;
        } else {
            lVar = null;
        }
        if (i2 == 0 && lVar == null) {
            return false;
        }
        if (lVar != null) {
            lVar.f11132x = true;
        }
        d0 d0Var = this.B;
        if (d0Var != null && i2 == 0) {
            e0 e0Var = d0Var.A;
            if (!e0Var.f8383o) {
                e0Var.f8381l.f11975l = true;
                e0Var.f8383o = true;
            }
        }
        boolean onPreparePanel = this.A.onPreparePanel(i2, view, menu);
        if (lVar != null) {
            lVar.f11132x = false;
        }
        return onPreparePanel;
    }

    @Override // android.view.Window.Callback
    public final void onProvideKeyboardShortcuts(List list, Menu menu, int i2) {
        p.l lVar = this.Y.z(0).f8454h;
        if (lVar != null) {
            d(list, lVar, i2);
        } else {
            d(list, menu, i2);
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested(SearchEvent searchEvent) {
        return o.k.a(this.A, searchEvent);
    }

    @Override // android.view.Window.Callback
    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.A.onWindowAttributesChanged(layoutParams);
    }

    @Override // android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z10) {
        this.A.onWindowFocusChanged(z10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [o.a, o.d, java.lang.Object, p.j] */
    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i2) {
        boolean z10;
        ViewGroup viewGroup;
        Context context;
        x xVar = this.Y;
        Context context2 = xVar.f8467e0;
        if (i2 != 0) {
            return o.k.b(this.A, callback, i2);
        }
        b9.e eVar = new b9.e(context2, callback);
        o.a aVar = xVar.f8477o0;
        if (aVar != null) {
            aVar.a();
        }
        jb.c cVar = new jb.c(xVar, eVar);
        xVar.A();
        aj.g gVar = xVar.f8471i0;
        if (gVar != null) {
            xVar.f8477o0 = gVar.r0(cVar);
        }
        if (xVar.f8477o0 == null) {
            f1 f1Var = xVar.f8480s0;
            if (f1Var != null) {
                f1Var.b();
            }
            o.a aVar2 = xVar.f8477o0;
            if (aVar2 != null) {
                aVar2.a();
            }
            if (xVar.p0 == null) {
                if (xVar.C0) {
                    TypedValue typedValue = new TypedValue();
                    Resources.Theme theme = context2.getTheme();
                    theme.resolveAttribute(R.attr.actionBarTheme, typedValue, true);
                    if (typedValue.resourceId != 0) {
                        Resources.Theme newTheme = context2.getResources().newTheme();
                        newTheme.setTo(theme);
                        newTheme.applyStyle(typedValue.resourceId, true);
                        o.c cVar2 = new o.c(context2, 0);
                        cVar2.getTheme().setTo(newTheme);
                        context2 = cVar2;
                    }
                    xVar.p0 = new ActionBarContextView(context2, null);
                    PopupWindow popupWindow = new PopupWindow(context2, (AttributeSet) null, (int) R.attr.actionModePopupWindowStyle);
                    xVar.f8478q0 = popupWindow;
                    popupWindow.setWindowLayoutType(2);
                    xVar.f8478q0.setContentView(xVar.p0);
                    xVar.f8478q0.setWidth(-1);
                    context2.getTheme().resolveAttribute(R.attr.actionBarSize, typedValue, true);
                    xVar.p0.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, context2.getResources().getDisplayMetrics()));
                    xVar.f8478q0.setHeight(-2);
                    xVar.f8479r0 = new n(xVar, 1);
                } else {
                    ViewStubCompat viewStubCompat = (ViewStubCompat) xVar.f8482u0.findViewById(R.id.action_mode_bar_stub);
                    if (viewStubCompat != null) {
                        xVar.A();
                        aj.g gVar2 = xVar.f8471i0;
                        if (gVar2 != null) {
                            context = gVar2.E();
                        } else {
                            context = null;
                        }
                        if (context != null) {
                            context2 = context;
                        }
                        viewStubCompat.setLayoutInflater(LayoutInflater.from(context2));
                        xVar.p0 = (ActionBarContextView) viewStubCompat.a();
                    }
                }
            }
            if (xVar.p0 != null) {
                f1 f1Var2 = xVar.f8480s0;
                if (f1Var2 != null) {
                    f1Var2.b();
                }
                xVar.p0.e();
                Context context3 = xVar.p0.getContext();
                ActionBarContextView actionBarContextView = xVar.p0;
                ?? obj = new Object();
                obj.L = context3;
                obj.R = actionBarContextView;
                obj.X = cVar;
                p.l lVar = new p.l(actionBarContextView.getContext());
                lVar.f11121l = 1;
                obj.f10451b0 = lVar;
                lVar.f11114e = obj;
                if (((b9.e) cVar.B).G(obj, lVar)) {
                    obj.i();
                    xVar.p0.c(obj);
                    xVar.f8477o0 = obj;
                    if (xVar.f8481t0 && (viewGroup = xVar.f8482u0) != null && viewGroup.isLaidOut()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    ActionBarContextView actionBarContextView2 = xVar.p0;
                    if (z10) {
                        actionBarContextView2.setAlpha(0.0f);
                        f1 b10 = x0.b(xVar.p0);
                        b10.a(1.0f);
                        xVar.f8480s0 = b10;
                        b10.d(new p(1, xVar));
                    } else {
                        actionBarContextView2.setAlpha(1.0f);
                        xVar.p0.setVisibility(0);
                        if (xVar.p0.getParent() instanceof View) {
                            WeakHashMap weakHashMap = x0.f533a;
                            n0.c((View) xVar.p0.getParent());
                        }
                    }
                    if (xVar.f8478q0 != null) {
                        xVar.f8468f0.getDecorView().post(xVar.f8479r0);
                    }
                } else {
                    xVar.f8477o0 = null;
                }
            }
            xVar.I();
            xVar.f8477o0 = xVar.f8477o0;
        }
        xVar.I();
        o.a aVar3 = xVar.f8477o0;
        if (aVar3 == null) {
            return null;
        }
        return eVar.w(aVar3);
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested() {
        return this.A.onSearchRequested();
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return null;
    }
}
