package l;

import a6.x0;
import android.content.Context;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.Window;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
import java.util.WeakHashMap;
import q.h3;
import q.m3;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class e0 extends aj.g {

    /* renamed from: l  reason: collision with root package name */
    public final m3 f8381l;
    public final Window.Callback m;

    /* renamed from: n  reason: collision with root package name */
    public final d0 f8382n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f8383o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f8384p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f8385q;

    /* renamed from: r  reason: collision with root package name */
    public final ArrayList f8386r = new ArrayList();

    /* renamed from: s  reason: collision with root package name */
    public final ad.g f8387s = new ad.g(7, this);

    public e0(Toolbar toolbar, CharSequence charSequence, t tVar) {
        d0 d0Var = new d0(this);
        m3 m3Var = new m3(toolbar, false);
        this.f8381l = m3Var;
        tVar.getClass();
        this.m = tVar;
        m3Var.f11974k = tVar;
        toolbar.setOnMenuItemClickListener(d0Var);
        if (!m3Var.f11970g) {
            m3Var.f11971h = charSequence;
            if ((m3Var.f11965b & 8) != 0) {
                toolbar.setTitle(charSequence);
                if (m3Var.f11970g) {
                    x0.p(toolbar.getRootView(), charSequence);
                }
            }
        }
        this.f8382n = new d0(this);
    }

    @Override // aj.g
    public final int A() {
        return this.f8381l.f11965b;
    }

    public final Menu C0() {
        boolean z10 = this.f8384p;
        m3 m3Var = this.f8381l;
        if (!z10) {
            a0.l lVar = new a0.l(this, (byte) 0);
            d0 d0Var = new d0(this);
            Toolbar toolbar = m3Var.f11964a;
            toolbar.K0 = lVar;
            toolbar.L0 = d0Var;
            ActionMenuView actionMenuView = toolbar.A;
            if (actionMenuView != null) {
                actionMenuView.f952r0 = lVar;
                actionMenuView.f953s0 = d0Var;
            }
            this.f8384p = true;
        }
        return m3Var.f11964a.getMenu();
    }

    @Override // aj.g
    public final Context E() {
        return this.f8381l.f11964a.getContext();
    }

    @Override // aj.g
    public final boolean J() {
        m3 m3Var = this.f8381l;
        Toolbar toolbar = m3Var.f11964a;
        ad.g gVar = this.f8387s;
        toolbar.removeCallbacks(gVar);
        Toolbar toolbar2 = m3Var.f11964a;
        WeakHashMap weakHashMap = x0.f533a;
        toolbar2.postOnAnimation(gVar);
        return true;
    }

    @Override // aj.g
    public final void R() {
        this.f8381l.f11964a.removeCallbacks(this.f8387s);
    }

    @Override // aj.g
    public final boolean S(int i2, KeyEvent keyEvent) {
        Menu C0 = C0();
        if (C0 == null) {
            return false;
        }
        boolean z10 = true;
        if (KeyCharacterMap.load(keyEvent.getDeviceId()).getKeyboardType() == 1) {
            z10 = false;
        }
        C0.setQwertyMode(z10);
        return C0.performShortcut(i2, keyEvent, 0);
    }

    @Override // aj.g
    public final boolean T(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            U();
        }
        return true;
    }

    @Override // aj.g
    public final boolean U() {
        return this.f8381l.f11964a.w();
    }

    @Override // aj.g
    public final void h0(boolean z10) {
        m3 m3Var = this.f8381l;
        m3Var.a((m3Var.f11965b & (-5)) | 4);
    }

    @Override // aj.g
    public final boolean m() {
        q.j jVar;
        ActionMenuView actionMenuView = this.f8381l.f11964a.A;
        if (actionMenuView != null && (jVar = actionMenuView.f951q0) != null && jVar.c()) {
            return true;
        }
        return false;
    }

    @Override // aj.g
    public final boolean n() {
        p.n nVar;
        h3 h3Var = this.f8381l.f11964a.J0;
        if (h3Var != null && (nVar = h3Var.B) != null) {
            if (h3Var == null) {
                nVar = null;
            }
            if (nVar != null) {
                nVar.collapseActionView();
                return true;
            }
            return true;
        }
        return false;
    }

    @Override // aj.g
    public final void o0(String str) {
        m3 m3Var = this.f8381l;
        m3Var.f11970g = true;
        Toolbar toolbar = m3Var.f11964a;
        m3Var.f11971h = str;
        if ((m3Var.f11965b & 8) != 0) {
            toolbar.setTitle(str);
            if (m3Var.f11970g) {
                x0.p(toolbar.getRootView(), str);
            }
        }
    }

    @Override // aj.g
    public final void p0(CharSequence charSequence) {
        m3 m3Var = this.f8381l;
        if (!m3Var.f11970g) {
            Toolbar toolbar = m3Var.f11964a;
            m3Var.f11971h = charSequence;
            if ((m3Var.f11965b & 8) != 0) {
                toolbar.setTitle(charSequence);
                if (m3Var.f11970g) {
                    x0.p(toolbar.getRootView(), charSequence);
                }
            }
        }
    }

    @Override // aj.g
    public final void r(boolean z10) {
        if (z10 != this.f8385q) {
            this.f8385q = z10;
            ArrayList arrayList = this.f8386r;
            if (arrayList.size() <= 0) {
                return;
            }
            arrayList.get(0).getClass();
            m9.o.b();
        }
    }

    @Override // aj.g
    public final void Q() {
    }

    @Override // aj.g
    public final void g0(boolean z10) {
    }

    @Override // aj.g
    public final void m0(boolean z10) {
    }
}
