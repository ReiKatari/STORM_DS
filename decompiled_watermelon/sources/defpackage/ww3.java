package defpackage;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ww3  reason: default package */
/* loaded from: classes.dex */
public final class ww3 implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, lx3 {
    public rh6 A;
    public tb B;
    public sp3 L;

    @Override // defpackage.lx3
    public final boolean M(uw3 uw3Var) {
        return false;
    }

    @Override // defpackage.lx3
    public final void f(uw3 uw3Var, boolean z) {
        tb tbVar;
        if ((z || uw3Var == this.A) && (tbVar = this.B) != null) {
            tbVar.dismiss();
        }
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        rh6 rh6Var = this.A;
        sp3 sp3Var = this.L;
        if (sp3Var.Y == null) {
            sp3Var.Y = new rp3(sp3Var);
        }
        rh6Var.q(sp3Var.Y.getItem(i), null, 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        this.L.f(this.A, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        rh6 rh6Var = this.A;
        if (i == 82 || i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.B.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.B.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                rh6Var.c(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return rh6Var.performShortcut(i, keyEvent, 0);
    }
}
