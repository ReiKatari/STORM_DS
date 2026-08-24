package defpackage;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: k44  reason: default package */
/* loaded from: classes.dex */
public final class k44 implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, a54 {
    public it6 A;
    public ac B;
    public uw3 L;

    @Override // defpackage.a54
    public final boolean M(i44 i44Var) {
        return false;
    }

    @Override // defpackage.a54
    public final void d(i44 i44Var, boolean z) {
        ac acVar;
        if ((z || i44Var == this.A) && (acVar = this.B) != null) {
            acVar.dismiss();
        }
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        it6 it6Var = this.A;
        uw3 uw3Var = this.L;
        if (uw3Var.Y == null) {
            uw3Var.Y = new tw3(uw3Var);
        }
        it6Var.q(uw3Var.Y.getItem(i), null, 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        this.L.d(this.A, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        it6 it6Var = this.A;
        if (i == 82 || i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.B.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.B.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                it6Var.c(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return it6Var.performShortcut(i, keyEvent, 0);
    }
}
