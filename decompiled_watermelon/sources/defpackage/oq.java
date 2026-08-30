package defpackage;

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
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import java.util.WeakHashMap;
import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: oq  reason: default package */
/* loaded from: classes.dex */
public final class oq implements Window.Callback {
    public final Window.Callback A;
    public tv6 B;
    public boolean L;
    public boolean R;
    public boolean X;
    public final /* synthetic */ tq Y;

    public oq(tq tqVar, Window.Callback callback) {
        this.Y = tqVar;
        if (callback != null) {
            this.A = callback;
        } else {
            i.i("Window callback may not be null");
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

    public final boolean b(int i, Menu menu) {
        return this.A.onMenuOpened(i, menu);
    }

    public final void c(int i, Menu menu) {
        this.A.onPanelClosed(i, menu);
    }

    public final void d(List list, Menu menu, int i) {
        ge7.a(this.A, list, menu, i);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.A.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z = this.R;
        Window.Callback callback = this.A;
        if (z) {
            return callback.dispatchKeyEvent(keyEvent);
        }
        if (!this.Y.s(keyEvent) && !callback.dispatchKeyEvent(keyEvent)) {
            return false;
        }
        return true;
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        if (!this.A.dispatchKeyShortcutEvent(keyEvent)) {
            int keyCode = keyEvent.getKeyCode();
            tq tqVar = this.Y;
            tqVar.z();
            ct3 ct3Var = tqVar.i0;
            if (ct3Var == null || !ct3Var.B0(keyCode, keyEvent)) {
                sq sqVar = tqVar.G0;
                if (sqVar != null && tqVar.F(sqVar, keyEvent.getKeyCode(), keyEvent)) {
                    sq sqVar2 = tqVar.G0;
                    if (sqVar2 != null) {
                        sqVar2.l = true;
                        return true;
                    }
                } else {
                    if (tqVar.G0 == null) {
                        sq y = tqVar.y(0);
                        tqVar.G(y, keyEvent);
                        boolean F = tqVar.F(y, keyEvent.getKeyCode(), keyEvent);
                        y.k = false;
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
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        if (i == 0 && !(menu instanceof uw3)) {
            return false;
        }
        return this.A.onCreatePanelMenu(i, menu);
    }

    @Override // android.view.Window.Callback
    public final View onCreatePanelView(int i) {
        View view;
        tv6 tv6Var = this.B;
        if (tv6Var != null) {
            if (i == 0) {
                view = new View(tv6Var.A.o0.a.getContext());
            } else {
                view = null;
            }
            if (view != null) {
                return view;
            }
        }
        return this.A.onCreatePanelView(i);
    }

    @Override // android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.A.onDetachedFromWindow();
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        return this.A.onMenuItemSelected(i, menuItem);
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuOpened(int i, Menu menu) {
        b(i, menu);
        if (i == 108) {
            tq tqVar = this.Y;
            tqVar.z();
            ct3 ct3Var = tqVar.i0;
            if (ct3Var != null) {
                ct3Var.Y(true);
            }
        }
        return true;
    }

    @Override // android.view.Window.Callback
    public final void onPanelClosed(int i, Menu menu) {
        if (this.X) {
            this.A.onPanelClosed(i, menu);
            return;
        }
        c(i, menu);
        tq tqVar = this.Y;
        if (i == 108) {
            tqVar.z();
            ct3 ct3Var = tqVar.i0;
            if (ct3Var != null) {
                ct3Var.Y(false);
            }
        } else if (i == 0) {
            sq y = tqVar.y(i);
            if (y.m) {
                tqVar.q(y, false);
            }
        }
    }

    @Override // android.view.Window.Callback
    public final void onPointerCaptureChanged(boolean z) {
        he7.a(this.A, z);
    }

    @Override // android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        uw3 uw3Var;
        if (menu instanceof uw3) {
            uw3Var = (uw3) menu;
        } else {
            uw3Var = null;
        }
        if (i == 0 && uw3Var == null) {
            return false;
        }
        if (uw3Var != null) {
            uw3Var.x = true;
        }
        tv6 tv6Var = this.B;
        if (tv6Var != null && i == 0) {
            uv6 uv6Var = tv6Var.A;
            if (!uv6Var.r0) {
                uv6Var.o0.l = true;
                uv6Var.r0 = true;
            }
        }
        boolean onPreparePanel = this.A.onPreparePanel(i, view, menu);
        if (uw3Var != null) {
            uw3Var.x = false;
        }
        return onPreparePanel;
    }

    @Override // android.view.Window.Callback
    public final void onProvideKeyboardShortcuts(List list, Menu menu, int i) {
        uw3 uw3Var = this.Y.y(0).h;
        if (uw3Var != null) {
            d(list, uw3Var, i);
        } else {
            d(list, menu, i);
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested(SearchEvent searchEvent) {
        return fe7.a(this.A, searchEvent);
    }

    @Override // android.view.Window.Callback
    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.A.onWindowAttributesChanged(layoutParams);
    }

    @Override // android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        this.A.onWindowFocusChanged(z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v10, types: [java.lang.Object, jd6, sw3, j8] */
    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
        boolean z;
        ViewGroup viewGroup;
        Context context;
        tq tqVar = this.Y;
        Context context2 = tqVar.f0;
        if (i != 0) {
            return fe7.b(this.A, callback, i);
        }
        q9 q9Var = new q9(context2, callback);
        j8 j8Var = tqVar.o0;
        if (j8Var != null) {
            j8Var.a();
        }
        q03 q03Var = new q03(8, tqVar, q9Var, false);
        tqVar.z();
        ct3 ct3Var = tqVar.i0;
        if (ct3Var != null) {
            tqVar.o0 = ct3Var.Q0(q03Var);
        }
        if (tqVar.o0 == null) {
            hb7 hb7Var = tqVar.s0;
            if (hb7Var != null) {
                hb7Var.b();
            }
            j8 j8Var2 = tqVar.o0;
            if (j8Var2 != null) {
                j8Var2.a();
            }
            if (tqVar.p0 == null) {
                if (tqVar.C0) {
                    TypedValue typedValue = new TypedValue();
                    Resources.Theme theme = context2.getTheme();
                    theme.resolveAttribute(R.attr.actionBarTheme, typedValue, true);
                    if (typedValue.resourceId != 0) {
                        Resources.Theme newTheme = context2.getResources().newTheme();
                        newTheme.setTo(theme);
                        newTheme.applyStyle(typedValue.resourceId, true);
                        h11 h11Var = new h11(context2, 0);
                        h11Var.getTheme().setTo(newTheme);
                        context2 = h11Var;
                    }
                    tqVar.p0 = new ActionBarContextView(context2, null);
                    PopupWindow popupWindow = new PopupWindow(context2, (AttributeSet) null, (int) R.attr.actionModePopupWindowStyle);
                    tqVar.q0 = popupWindow;
                    popupWindow.setWindowLayoutType(2);
                    tqVar.q0.setContentView(tqVar.p0);
                    tqVar.q0.setWidth(-1);
                    context2.getTheme().resolveAttribute(R.attr.actionBarSize, typedValue, true);
                    tqVar.p0.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, context2.getResources().getDisplayMetrics()));
                    tqVar.q0.setHeight(-2);
                    tqVar.r0 = new iq(tqVar, 1);
                } else {
                    ViewStubCompat viewStubCompat = (ViewStubCompat) tqVar.u0.findViewById(R.id.action_mode_bar_stub);
                    if (viewStubCompat != null) {
                        tqVar.z();
                        ct3 ct3Var2 = tqVar.i0;
                        if (ct3Var2 != null) {
                            context = ct3Var2.p0();
                        } else {
                            context = null;
                        }
                        if (context != null) {
                            context2 = context;
                        }
                        viewStubCompat.setLayoutInflater(LayoutInflater.from(context2));
                        tqVar.p0 = (ActionBarContextView) viewStubCompat.a();
                    }
                }
            }
            if (tqVar.p0 != null) {
                hb7 hb7Var2 = tqVar.s0;
                if (hb7Var2 != null) {
                    hb7Var2.b();
                }
                tqVar.p0.e();
                Context context3 = tqVar.p0.getContext();
                ActionBarContextView actionBarContextView = tqVar.p0;
                ?? obj = new Object();
                obj.L = context3;
                obj.R = actionBarContextView;
                obj.X = q03Var;
                uw3 uw3Var = new uw3(actionBarContextView.getContext());
                uw3Var.l = 1;
                obj.c0 = uw3Var;
                uw3Var.e = obj;
                if (((q9) q03Var.B).J(obj, uw3Var)) {
                    obj.g();
                    tqVar.p0.c(obj);
                    tqVar.o0 = obj;
                    if (tqVar.t0 && (viewGroup = tqVar.u0) != null && viewGroup.isLaidOut()) {
                        z = true;
                    } else {
                        z = false;
                    }
                    ActionBarContextView actionBarContextView2 = tqVar.p0;
                    if (z) {
                        actionBarContextView2.setAlpha(RecyclerView.A1);
                        hb7 b = aa7.b(tqVar.p0);
                        b.a(1.0f);
                        tqVar.s0 = b;
                        b.d(new kq(1, tqVar));
                    } else {
                        actionBarContextView2.setAlpha(1.0f);
                        tqVar.p0.setVisibility(0);
                        if (tqVar.p0.getParent() instanceof View) {
                            WeakHashMap weakHashMap = aa7.a;
                            ((View) tqVar.p0.getParent()).requestApplyInsets();
                        }
                    }
                    if (tqVar.q0 != null) {
                        tqVar.g0.getDecorView().post(tqVar.r0);
                    }
                } else {
                    tqVar.o0 = null;
                }
            }
            tqVar.I();
            tqVar.o0 = tqVar.o0;
        }
        tqVar.I();
        j8 j8Var3 = tqVar.o0;
        if (j8Var3 == null) {
            return null;
        }
        return q9Var.B(j8Var3);
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
