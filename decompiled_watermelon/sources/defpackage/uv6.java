package defpackage;

import android.content.Context;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.Window;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
import java.util.WeakHashMap;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: uv6  reason: default package */
/* loaded from: classes.dex */
public final class uv6 extends ct3 {
    public final yv6 o0;
    public final Window.Callback p0;
    public final tv6 q0;
    public boolean r0;
    public boolean s0;
    public boolean t0;
    public final ArrayList u0 = new ArrayList();
    public final es4 v0 = new es4(26, this);

    public uv6(Toolbar toolbar, CharSequence charSequence, oq oqVar) {
        tv6 tv6Var = new tv6(this);
        yv6 yv6Var = new yv6(toolbar, false);
        this.o0 = yv6Var;
        oqVar.getClass();
        this.p0 = oqVar;
        yv6Var.k = oqVar;
        toolbar.setOnMenuItemClickListener(tv6Var);
        if (!yv6Var.g) {
            yv6Var.h = charSequence;
            if ((yv6Var.b & 8) != 0) {
                toolbar.setTitle(charSequence);
                if (yv6Var.g) {
                    aa7.o(toolbar.getRootView(), charSequence);
                }
            }
        }
        this.q0 = new tv6(this);
    }

    @Override // defpackage.ct3
    public final void A0() {
        this.o0.a.removeCallbacks(this.v0);
    }

    @Override // defpackage.ct3
    public final boolean B0(int i, KeyEvent keyEvent) {
        Menu Y0 = Y0();
        if (Y0 == null) {
            return false;
        }
        boolean z = true;
        if (KeyCharacterMap.load(keyEvent.getDeviceId()).getKeyboardType() == 1) {
            z = false;
        }
        Y0.setQwertyMode(z);
        return Y0.performShortcut(i, keyEvent, 0);
    }

    @Override // defpackage.ct3
    public final boolean C0(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            D0();
        }
        return true;
    }

    @Override // defpackage.ct3
    public final boolean D0() {
        return this.o0.a.w();
    }

    @Override // defpackage.ct3
    public final void K0(boolean z) {
        yv6 yv6Var = this.o0;
        yv6Var.a((yv6Var.b & (-5)) | 4);
    }

    @Override // defpackage.ct3
    public final void M0(String str) {
        yv6 yv6Var = this.o0;
        yv6Var.g = true;
        Toolbar toolbar = yv6Var.a;
        yv6Var.h = str;
        if ((yv6Var.b & 8) != 0) {
            toolbar.setTitle(str);
            if (yv6Var.g) {
                aa7.o(toolbar.getRootView(), str);
            }
        }
    }

    @Override // defpackage.ct3
    public final boolean N() {
        f8 f8Var;
        ActionMenuView actionMenuView = this.o0.a.A;
        if (actionMenuView != null && (f8Var = actionMenuView.r0) != null && f8Var.c()) {
            return true;
        }
        return false;
    }

    @Override // defpackage.ct3
    public final void N0(CharSequence charSequence) {
        yv6 yv6Var = this.o0;
        if (!yv6Var.g) {
            Toolbar toolbar = yv6Var.a;
            yv6Var.h = charSequence;
            if ((yv6Var.b & 8) != 0) {
                toolbar.setTitle(charSequence);
                if (yv6Var.g) {
                    aa7.o(toolbar.getRootView(), charSequence);
                }
            }
        }
    }

    @Override // defpackage.ct3
    public final void O0() {
        this.o0.a.setVisibility(0);
    }

    @Override // defpackage.ct3
    public final boolean P() {
        zw3 zw3Var;
        pv6 pv6Var = this.o0.a.K0;
        if (pv6Var != null && (zw3Var = pv6Var.B) != null) {
            if (pv6Var == null) {
                zw3Var = null;
            }
            if (zw3Var != null) {
                zw3Var.collapseActionView();
                return true;
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.ct3
    public final void Y(boolean z) {
        if (z != this.t0) {
            this.t0 = z;
            ArrayList arrayList = this.u0;
            if (arrayList.size() <= 0) {
                return;
            }
            arrayList.get(0).getClass();
            c44.b();
        }
    }

    public final Menu Y0() {
        boolean z = this.s0;
        yv6 yv6Var = this.o0;
        if (!z) {
            i40 i40Var = new i40(this, (byte) 0);
            tv6 tv6Var = new tv6(this);
            Toolbar toolbar = yv6Var.a;
            toolbar.L0 = i40Var;
            toolbar.M0 = tv6Var;
            ActionMenuView actionMenuView = toolbar.A;
            if (actionMenuView != null) {
                actionMenuView.s0 = i40Var;
                actionMenuView.t0 = tv6Var;
            }
            this.s0 = true;
        }
        return yv6Var.a.getMenu();
    }

    @Override // defpackage.ct3
    public final int j0() {
        return this.o0.b;
    }

    @Override // defpackage.ct3
    public final Context p0() {
        return this.o0.a.getContext();
    }

    @Override // defpackage.ct3
    public final CharSequence q0() {
        return this.o0.a.getTitle();
    }

    @Override // defpackage.ct3
    public final void s0() {
        this.o0.a.setVisibility(8);
    }

    @Override // defpackage.ct3
    public final boolean u0() {
        yv6 yv6Var = this.o0;
        Toolbar toolbar = yv6Var.a;
        es4 es4Var = this.v0;
        toolbar.removeCallbacks(es4Var);
        Toolbar toolbar2 = yv6Var.a;
        WeakHashMap weakHashMap = aa7.a;
        toolbar2.postOnAnimation(es4Var);
        return true;
    }

    @Override // defpackage.ct3
    public final void z0() {
    }

    @Override // defpackage.ct3
    public final void J0(boolean z) {
    }

    @Override // defpackage.ct3
    public final void L0(boolean z) {
    }
}
