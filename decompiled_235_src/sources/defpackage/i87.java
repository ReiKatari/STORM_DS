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
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: i87  reason: default package */
/* loaded from: classes.dex */
public final class i87 extends ak7 {
    public final l87 l;
    public final Window.Callback m;
    public final h87 n;
    public boolean o;
    public boolean p;
    public boolean q;
    public final ArrayList r = new ArrayList();
    public final g15 s = new g15(this, 25);

    public i87(Toolbar toolbar, CharSequence charSequence, ar arVar) {
        h87 h87Var = new h87(this);
        l87 l87Var = new l87(toolbar, false);
        this.l = l87Var;
        arVar.getClass();
        this.m = arVar;
        l87Var.k = arVar;
        toolbar.setOnMenuItemClickListener(h87Var);
        if (!l87Var.g) {
            l87Var.h = charSequence;
            if ((l87Var.b & 8) != 0) {
                toolbar.setTitle(charSequence);
                if (l87Var.g) {
                    ao7.o(toolbar.getRootView(), charSequence);
                }
            }
        }
        this.n = new h87(this);
    }

    @Override // defpackage.ak7
    public final void B0(boolean z) {
        l87 l87Var = this.l;
        l87Var.a((l87Var.b & (-5)) | 4);
    }

    @Override // defpackage.ak7
    public final void D0(String str) {
        l87 l87Var = this.l;
        l87Var.g = true;
        Toolbar toolbar = l87Var.a;
        l87Var.h = str;
        if ((l87Var.b & 8) != 0) {
            toolbar.setTitle(str);
            if (l87Var.g) {
                ao7.o(toolbar.getRootView(), str);
            }
        }
    }

    @Override // defpackage.ak7
    public final void E0(CharSequence charSequence) {
        l87 l87Var = this.l;
        if (!l87Var.g) {
            Toolbar toolbar = l87Var.a;
            l87Var.h = charSequence;
            if ((l87Var.b & 8) != 0) {
                toolbar.setTitle(charSequence);
                if (l87Var.g) {
                    ao7.o(toolbar.getRootView(), charSequence);
                }
            }
        }
    }

    @Override // defpackage.ak7
    public final boolean L() {
        g8 g8Var;
        ActionMenuView actionMenuView = this.l.a.A;
        if (actionMenuView != null && (g8Var = actionMenuView.s0) != null && g8Var.e()) {
            return true;
        }
        return false;
    }

    public final Menu L0() {
        boolean z = this.p;
        l87 l87Var = this.l;
        if (!z) {
            g60 g60Var = new g60(this, (byte) 0);
            h87 h87Var = new h87(this);
            Toolbar toolbar = l87Var.a;
            toolbar.M0 = g60Var;
            toolbar.N0 = h87Var;
            ActionMenuView actionMenuView = toolbar.A;
            if (actionMenuView != null) {
                actionMenuView.t0 = g60Var;
                actionMenuView.u0 = h87Var;
            }
            this.p = true;
        }
        return l87Var.a.getMenu();
    }

    @Override // defpackage.ak7
    public final boolean M() {
        o44 o44Var;
        d87 d87Var = this.l.a.L0;
        if (d87Var != null && (o44Var = d87Var.B) != null) {
            if (d87Var == null) {
                o44Var = null;
            }
            if (o44Var != null) {
                o44Var.collapseActionView();
                return true;
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.ak7
    public final void P(boolean z) {
        if (z != this.q) {
            this.q = z;
            ArrayList arrayList = this.r;
            if (arrayList.size() <= 0) {
                return;
            }
            arrayList.get(0).getClass();
            u34.a();
        }
    }

    @Override // defpackage.ak7
    public final int V() {
        return this.l.b;
    }

    @Override // defpackage.ak7
    public final Context f0() {
        return this.l.a.getContext();
    }

    @Override // defpackage.ak7
    public final CharSequence h0() {
        return this.l.a.getTitle();
    }

    @Override // defpackage.ak7
    public final void j0() {
        this.l.a.setVisibility(8);
    }

    @Override // defpackage.ak7
    public final boolean k0() {
        l87 l87Var = this.l;
        Toolbar toolbar = l87Var.a;
        g15 g15Var = this.s;
        toolbar.removeCallbacks(g15Var);
        Toolbar toolbar2 = l87Var.a;
        WeakHashMap weakHashMap = ao7.a;
        toolbar2.postOnAnimation(g15Var);
        return true;
    }

    @Override // defpackage.ak7
    public final void q0() {
        this.l.a.removeCallbacks(this.s);
    }

    @Override // defpackage.ak7
    public final boolean r0(int i, KeyEvent keyEvent) {
        Menu L0 = L0();
        if (L0 == null) {
            return false;
        }
        boolean z = true;
        if (KeyCharacterMap.load(keyEvent.getDeviceId()).getKeyboardType() == 1) {
            z = false;
        }
        L0.setQwertyMode(z);
        return L0.performShortcut(i, keyEvent, 0);
    }

    @Override // defpackage.ak7
    public final boolean s0(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            t0();
        }
        return true;
    }

    @Override // defpackage.ak7
    public final boolean t0() {
        return this.l.a.w();
    }

    @Override // defpackage.ak7
    public final void p0() {
    }

    @Override // defpackage.ak7
    public final void A0(boolean z) {
    }

    @Override // defpackage.ak7
    public final void C0(boolean z) {
    }
}
