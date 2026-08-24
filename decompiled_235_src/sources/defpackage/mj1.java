package defpackage;

import android.content.Context;
import android.os.Build;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import com.stormds.emulator.R;
import java.util.UUID;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: mj1  reason: default package */
/* loaded from: classes.dex */
public final class mj1 extends qv0 {
    public on2 X;
    public jj1 Y;
    public final View Z;
    public final gj1 d0;
    public boolean e0;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public mj1(on2 on2Var, jj1 jj1Var, View view, kk3 kk3Var, qh1 qh1Var, UUID uuid) {
        super(new ContextThemeWrapper(r1, r2), 0);
        int i;
        Context context = view.getContext();
        if (jj1Var.e) {
            i = R.style.DialogWindowTheme;
        } else {
            i = R.style.FloatingDialogWindowTheme;
        }
        this.X = on2Var;
        this.Y = jj1Var;
        this.Z = view;
        Window window = getWindow();
        if (window != null) {
            jj1 jj1Var2 = this.Y;
            Window window2 = getWindow();
            if (window2 != null) {
                WindowManager.LayoutParams attributes = window2.getAttributes();
                attributes.type = jj1Var2.g;
                window2.setAttributes(attributes);
            }
            window.requestFeature(1);
            window.setBackgroundDrawableResource(17170445);
            kt7.a(window, this.Y.e);
            window.setGravity(17);
            if (!this.Y.e) {
                window.addFlags(65792);
                WindowManager.LayoutParams attributes2 = window.getAttributes();
                int i2 = Build.VERSION.SDK_INT;
                if (i2 >= 28) {
                    qp.a.a(attributes2);
                }
                if (i2 >= 30) {
                    sp spVar = sp.a;
                    spVar.b(attributes2, 0);
                    spVar.c(attributes2, 0);
                }
                window.setAttributes(attributes2);
            }
            gj1 gj1Var = new gj1(getContext(), window);
            setTitle(this.Y.f);
            gj1Var.setTag(R.id.compose_view_saveable_id_tag, "Dialog:" + uuid);
            gj1Var.setClipChildren(false);
            gj1Var.setElevation(qh1Var.e0(8.0f));
            gj1Var.setOutlineProvider(new kj1(0));
            this.d0 = gj1Var;
            View decorView = window.getDecorView();
            ViewGroup viewGroup = decorView instanceof ViewGroup ? (ViewGroup) decorView : null;
            if (viewGroup != null) {
                f(viewGroup);
            }
            setContentView(gj1Var);
            gj1Var.setTag(R.id.view_tree_lifecycle_owner, bl2.B(view));
            gj1Var.setTag(R.id.view_tree_view_model_store_owner, ln2.r(view));
            gj1Var.setTag(R.id.view_tree_saved_state_registry_owner, kn2.C(view));
            g(this.X, this.Y, kk3Var);
            il4 b = b();
            hg hgVar = new hg(this, 1);
            b.getClass();
            b.a(this, new d00(hgVar, false, 4));
            return;
        }
        i.m("Dialog has no window");
        throw null;
    }

    public static final void f(ViewGroup viewGroup) {
        ViewGroup viewGroup2;
        viewGroup.setClipChildren(false);
        if (!(viewGroup instanceof gj1)) {
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt instanceof ViewGroup) {
                    viewGroup2 = (ViewGroup) childAt;
                } else {
                    viewGroup2 = null;
                }
                if (viewGroup2 != null) {
                    f(viewGroup2);
                }
            }
        }
    }

    public final void g(on2 on2Var, jj1 jj1Var, kk3 kk3Var) {
        int i;
        int i2;
        boolean z;
        int i3;
        this.X = on2Var;
        this.Y = jj1Var;
        y86 y86Var = jj1Var.c;
        boolean b = ak.b(this.Z);
        int i4 = z86.a[y86Var.ordinal()];
        int i5 = 0;
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 != 3) {
                    i.d();
                    return;
                }
            } else {
                b = true;
            }
        } else {
            b = false;
        }
        Window window = getWindow();
        window.getClass();
        if (b) {
            i = 8192;
        } else {
            i = -8193;
        }
        window.setFlags(i, 8192);
        int i6 = lj1.a[kk3Var.ordinal()];
        if (i6 != 1) {
            if (i6 == 2) {
                i2 = 1;
            } else {
                i.d();
                return;
            }
        } else {
            i2 = 0;
        }
        gj1 gj1Var = this.d0;
        gj1Var.setLayoutDirection(i2);
        boolean z2 = jj1Var.e;
        boolean z3 = jj1Var.d;
        Window window2 = gj1Var.i0;
        if (gj1Var.m0 && z3 == gj1Var.k0 && z2 == gj1Var.l0) {
            z = false;
        } else {
            z = true;
        }
        gj1Var.k0 = z3;
        gj1Var.l0 = z2;
        if (z) {
            WindowManager.LayoutParams attributes = window2.getAttributes();
            if (z3) {
                i3 = -2;
            } else {
                i3 = -1;
            }
            if (i3 != attributes.width || !gj1Var.m0) {
                window2.setLayout(i3, -2);
                gj1Var.m0 = true;
            }
        }
        setCanceledOnTouchOutside(jj1Var.b);
        Window window3 = getWindow();
        if (window3 != null) {
            if (!z2) {
                if (Build.VERSION.SDK_INT < 31) {
                    i5 = 16;
                } else {
                    i5 = 48;
                }
            }
            window3.setSoftInputMode(i5);
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (this.Y.a && keyEvent.isTracking() && !keyEvent.isCanceled() && i == 111) {
            this.X.c();
            return true;
        }
        return super.onKeyUp(i, keyEvent);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0066, code lost:
        if (r5 <= r1) goto L29;
     */
    @Override // android.app.Dialog
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        View childAt;
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        if (this.Y.b) {
            gj1 gj1Var = this.d0;
            gj1Var.getClass();
            if (Math.abs(motionEvent.getX()) <= Float.MAX_VALUE && Math.abs(motionEvent.getY()) <= Float.MAX_VALUE && (childAt = gj1Var.getChildAt(0)) != null) {
                int left = childAt.getLeft() + gj1Var.getLeft();
                int width = childAt.getWidth() + left;
                int top = childAt.getTop() + gj1Var.getTop();
                int height = childAt.getHeight() + top;
                int E = u24.E(motionEvent.getX());
                if (left <= E) {
                    if (E <= width) {
                        int E2 = u24.E(motionEvent.getY());
                        if (top <= E2) {
                        }
                    }
                }
            }
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked == 3) {
                        this.e0 = false;
                        return onTouchEvent;
                    }
                } else if (this.e0) {
                    this.X.c();
                    this.e0 = false;
                    return true;
                }
                return onTouchEvent;
            }
            this.e0 = true;
            return true;
        }
        int actionMasked2 = motionEvent.getActionMasked();
        if (actionMasked2 == 0 || actionMasked2 == 1 || actionMasked2 == 3) {
            this.e0 = false;
            return onTouchEvent;
        }
        return onTouchEvent;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
    }
}
