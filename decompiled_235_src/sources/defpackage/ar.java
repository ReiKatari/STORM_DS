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
import com.stormds.emulator.R;
import java.util.List;
import java.util.WeakHashMap;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ar  reason: default package */
/* loaded from: classes.dex */
public final class ar implements Window.Callback {
    public final Window.Callback A;
    public h87 B;
    public boolean L;
    public boolean R;
    public boolean X;
    public final /* synthetic */ fr Y;

    public ar(fr frVar, Window.Callback callback) {
        this.Y = frVar;
        if (callback != null) {
            this.A = callback;
        } else {
            i.h("Window callback may not be null");
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
        it7.a(this.A, list, menu, i);
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
        if (!this.Y.x(keyEvent) && !callback.dispatchKeyEvent(keyEvent)) {
            return false;
        }
        return true;
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        if (!this.A.dispatchKeyShortcutEvent(keyEvent)) {
            int keyCode = keyEvent.getKeyCode();
            fr frVar = this.Y;
            frVar.D();
            ak7 ak7Var = frVar.j0;
            if (ak7Var == null || !ak7Var.r0(keyCode, keyEvent)) {
                er erVar = frVar.H0;
                if (erVar != null && frVar.J(erVar, keyEvent.getKeyCode(), keyEvent)) {
                    er erVar2 = frVar.H0;
                    if (erVar2 != null) {
                        erVar2.l = true;
                        return true;
                    }
                } else {
                    if (frVar.H0 == null) {
                        er C = frVar.C(0);
                        frVar.K(C, keyEvent);
                        boolean J = frVar.J(C, keyEvent.getKeyCode(), keyEvent);
                        C.k = false;
                        if (J) {
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
        if (i == 0 && !(menu instanceof i44)) {
            return false;
        }
        return this.A.onCreatePanelMenu(i, menu);
    }

    @Override // android.view.Window.Callback
    public final View onCreatePanelView(int i) {
        View view;
        h87 h87Var = this.B;
        if (h87Var != null) {
            if (i == 0) {
                view = new View(h87Var.A.l.a.getContext());
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
            fr frVar = this.Y;
            frVar.D();
            ak7 ak7Var = frVar.j0;
            if (ak7Var != null) {
                ak7Var.P(true);
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
        fr frVar = this.Y;
        if (i == 108) {
            frVar.D();
            ak7 ak7Var = frVar.j0;
            if (ak7Var != null) {
                ak7Var.P(false);
            }
        } else if (i == 0) {
            er C = frVar.C(i);
            if (C.m) {
                frVar.v(C, false);
            }
        }
    }

    @Override // android.view.Window.Callback
    public final void onPointerCaptureChanged(boolean z) {
        jt7.a(this.A, z);
    }

    @Override // android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        i44 i44Var;
        if (menu instanceof i44) {
            i44Var = (i44) menu;
        } else {
            i44Var = null;
        }
        if (i == 0 && i44Var == null) {
            return false;
        }
        if (i44Var != null) {
            i44Var.x = true;
        }
        h87 h87Var = this.B;
        if (h87Var != null && i == 0) {
            i87 i87Var = h87Var.A;
            if (!i87Var.o) {
                i87Var.l.l = true;
                i87Var.o = true;
            }
        }
        boolean onPreparePanel = this.A.onPreparePanel(i, view, menu);
        if (i44Var != null) {
            i44Var.x = false;
        }
        return onPreparePanel;
    }

    @Override // android.view.Window.Callback
    public final void onProvideKeyboardShortcuts(List list, Menu menu, int i) {
        i44 i44Var = this.Y.C(0).h;
        if (i44Var != null) {
            d(list, i44Var, i);
        } else {
            d(list, menu, i);
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested(SearchEvent searchEvent) {
        return ht7.a(this.A, searchEvent);
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
    /* JADX WARN: Type inference failed for: r9v10, types: [zo6, g44, java.lang.Object, k8] */
    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
        boolean z;
        ViewGroup viewGroup;
        Context context;
        fr frVar = this.Y;
        Context context2 = frVar.g0;
        if (i != 0) {
            return ht7.b(this.A, callback, i);
        }
        eb ebVar = new eb(context2, callback);
        k8 k8Var = frVar.p0;
        if (k8Var != null) {
            k8Var.a();
        }
        u63 u63Var = new u63(8, frVar, ebVar, false);
        frVar.D();
        ak7 ak7Var = frVar.j0;
        if (ak7Var != null) {
            frVar.p0 = ak7Var.G0(u63Var);
        }
        if (frVar.p0 == null) {
            ip7 ip7Var = frVar.t0;
            if (ip7Var != null) {
                ip7Var.b();
            }
            k8 k8Var2 = frVar.p0;
            if (k8Var2 != null) {
                k8Var2.a();
            }
            if (frVar.q0 == null) {
                if (frVar.D0) {
                    TypedValue typedValue = new TypedValue();
                    Resources.Theme theme = context2.getTheme();
                    theme.resolveAttribute(R.attr.actionBarTheme, typedValue, true);
                    if (typedValue.resourceId != 0) {
                        Resources.Theme newTheme = context2.getResources().newTheme();
                        newTheme.setTo(theme);
                        newTheme.applyStyle(typedValue.resourceId, true);
                        p41 p41Var = new p41(context2, 0);
                        p41Var.getTheme().setTo(newTheme);
                        context2 = p41Var;
                    }
                    frVar.q0 = new ActionBarContextView(context2, null);
                    PopupWindow popupWindow = new PopupWindow(context2, (AttributeSet) null, (int) R.attr.actionModePopupWindowStyle);
                    frVar.r0 = popupWindow;
                    popupWindow.setWindowLayoutType(2);
                    frVar.r0.setContentView(frVar.q0);
                    frVar.r0.setWidth(-1);
                    context2.getTheme().resolveAttribute(R.attr.actionBarSize, typedValue, true);
                    frVar.q0.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, context2.getResources().getDisplayMetrics()));
                    frVar.r0.setHeight(-2);
                    frVar.s0 = new uq(frVar, 1);
                } else {
                    ViewStubCompat viewStubCompat = (ViewStubCompat) frVar.v0.findViewById(R.id.action_mode_bar_stub);
                    if (viewStubCompat != null) {
                        frVar.D();
                        ak7 ak7Var2 = frVar.j0;
                        if (ak7Var2 != null) {
                            context = ak7Var2.f0();
                        } else {
                            context = null;
                        }
                        if (context != null) {
                            context2 = context;
                        }
                        viewStubCompat.setLayoutInflater(LayoutInflater.from(context2));
                        frVar.q0 = (ActionBarContextView) viewStubCompat.a();
                    }
                }
            }
            if (frVar.q0 != null) {
                ip7 ip7Var2 = frVar.t0;
                if (ip7Var2 != null) {
                    ip7Var2.b();
                }
                frVar.q0.e();
                Context context3 = frVar.q0.getContext();
                ActionBarContextView actionBarContextView = frVar.q0;
                ?? obj = new Object();
                obj.L = context3;
                obj.R = actionBarContextView;
                obj.X = u63Var;
                i44 i44Var = new i44(actionBarContextView.getContext());
                i44Var.l = 1;
                obj.d0 = i44Var;
                i44Var.e = obj;
                if (((eb) u63Var.B).K(obj, i44Var)) {
                    obj.g();
                    frVar.q0.c(obj);
                    frVar.p0 = obj;
                    if (frVar.u0 && (viewGroup = frVar.v0) != null && viewGroup.isLaidOut()) {
                        z = true;
                    } else {
                        z = false;
                    }
                    ActionBarContextView actionBarContextView2 = frVar.q0;
                    if (z) {
                        actionBarContextView2.setAlpha(RecyclerView.B1);
                        ip7 b = ao7.b(frVar.q0);
                        b.a(1.0f);
                        frVar.t0 = b;
                        b.d(new wq(frVar, 1));
                    } else {
                        actionBarContextView2.setAlpha(1.0f);
                        frVar.q0.setVisibility(0);
                        if (frVar.q0.getParent() instanceof View) {
                            WeakHashMap weakHashMap = ao7.a;
                            ((View) frVar.q0.getParent()).requestApplyInsets();
                        }
                    }
                    if (frVar.r0 != null) {
                        frVar.h0.getDecorView().post(frVar.s0);
                    }
                } else {
                    frVar.p0 = null;
                }
            }
            frVar.M();
            frVar.p0 = frVar.p0;
        }
        frVar.M();
        k8 k8Var3 = frVar.p0;
        if (k8Var3 == null) {
            return null;
        }
        return ebVar.C(k8Var3);
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
