package p;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import b4.v2;
import java.util.ArrayList;
import l.i0;
import me.magnum.melonds.R;
import q.f2;
import q.i2;
import q.r1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class f extends t implements View.OnKeyListener, PopupWindow.OnDismissListener {
    public final Context B;
    public final int L;
    public final int R;
    public final boolean X;
    public final Handler Y;

    /* renamed from: h0  reason: collision with root package name */
    public View f11097h0;

    /* renamed from: i0  reason: collision with root package name */
    public View f11098i0;

    /* renamed from: j0  reason: collision with root package name */
    public int f11099j0;

    /* renamed from: k0  reason: collision with root package name */
    public boolean f11100k0;

    /* renamed from: l0  reason: collision with root package name */
    public boolean f11101l0;

    /* renamed from: m0  reason: collision with root package name */
    public int f11102m0;

    /* renamed from: n0  reason: collision with root package name */
    public int f11103n0;
    public boolean p0;

    /* renamed from: q0  reason: collision with root package name */
    public w f11105q0;

    /* renamed from: r0  reason: collision with root package name */
    public ViewTreeObserver f11106r0;

    /* renamed from: s0  reason: collision with root package name */
    public PopupWindow.OnDismissListener f11107s0;

    /* renamed from: t0  reason: collision with root package name */
    public boolean f11108t0;
    public final ArrayList Z = new ArrayList();

    /* renamed from: b0  reason: collision with root package name */
    public final ArrayList f11091b0 = new ArrayList();

    /* renamed from: c0  reason: collision with root package name */
    public final d f11092c0 = new d(0, this);

    /* renamed from: d0  reason: collision with root package name */
    public final v2 f11093d0 = new v2(3, this);

    /* renamed from: e0  reason: collision with root package name */
    public final i0 f11094e0 = new i0(16, this);

    /* renamed from: f0  reason: collision with root package name */
    public int f11095f0 = 0;

    /* renamed from: g0  reason: collision with root package name */
    public int f11096g0 = 0;

    /* renamed from: o0  reason: collision with root package name */
    public boolean f11104o0 = false;

    public f(Context context, View view, int i2, boolean z10) {
        this.B = context;
        this.f11097h0 = view;
        this.R = i2;
        this.X = z10;
        this.f11099j0 = view.getLayoutDirection() != 1 ? 1 : 0;
        Resources resources = context.getResources();
        this.L = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.Y = new Handler();
    }

    @Override // p.x
    public final void a(l lVar, boolean z10) {
        int i2;
        ArrayList arrayList = this.f11091b0;
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 < size) {
                if (lVar == ((e) arrayList.get(i10)).f11089b) {
                    break;
                }
                i10++;
            } else {
                i10 = -1;
                break;
            }
        }
        if (i10 >= 0) {
            int i11 = i10 + 1;
            if (i11 < arrayList.size()) {
                ((e) arrayList.get(i11)).f11089b.c(false);
            }
            e eVar = (e) arrayList.remove(i10);
            l lVar2 = eVar.f11089b;
            i2 i2Var = eVar.f11088a;
            q.y yVar = i2Var.f11882t0;
            lVar2.r(this);
            if (this.f11108t0) {
                f2.b(yVar, null);
                yVar.setAnimationStyle(0);
            }
            i2Var.dismiss();
            int size2 = arrayList.size();
            if (size2 > 0) {
                this.f11099j0 = ((e) arrayList.get(size2 - 1)).f11090c;
            } else {
                if (this.f11097h0.getLayoutDirection() == 1) {
                    i2 = 0;
                } else {
                    i2 = 1;
                }
                this.f11099j0 = i2;
            }
            if (size2 == 0) {
                dismiss();
                w wVar = this.f11105q0;
                if (wVar != null) {
                    wVar.a(lVar, true);
                }
                ViewTreeObserver viewTreeObserver = this.f11106r0;
                if (viewTreeObserver != null) {
                    if (viewTreeObserver.isAlive()) {
                        this.f11106r0.removeGlobalOnLayoutListener(this.f11092c0);
                    }
                    this.f11106r0 = null;
                }
                this.f11098i0.removeOnAttachStateChangeListener(this.f11093d0);
                this.f11107s0.onDismiss();
            } else if (z10) {
                ((e) arrayList.get(0)).f11089b.c(false);
            }
        }
    }

    @Override // p.b0
    public final boolean b() {
        ArrayList arrayList = this.f11091b0;
        if (arrayList.size() <= 0 || !((e) arrayList.get(0)).f11088a.f11882t0.isShowing()) {
            return false;
        }
        return true;
    }

    @Override // p.b0
    public final void c() {
        if (!b()) {
            ArrayList arrayList = this.Z;
            int size = arrayList.size();
            boolean z10 = false;
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                u((l) obj);
            }
            arrayList.clear();
            View view = this.f11097h0;
            this.f11098i0 = view;
            if (view != null) {
                if (this.f11106r0 == null) {
                    z10 = true;
                }
                ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                this.f11106r0 = viewTreeObserver;
                if (z10) {
                    viewTreeObserver.addOnGlobalLayoutListener(this.f11092c0);
                }
                this.f11098i0.addOnAttachStateChangeListener(this.f11093d0);
            }
        }
    }

    @Override // p.x
    public final void d() {
        ArrayList arrayList = this.f11091b0;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            ListAdapter adapter = ((e) obj).f11088a.L.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((i) adapter).notifyDataSetChanged();
        }
    }

    @Override // p.b0
    public final void dismiss() {
        ArrayList arrayList = this.f11091b0;
        int size = arrayList.size();
        if (size > 0) {
            e[] eVarArr = (e[]) arrayList.toArray(new e[size]);
            for (int i2 = size - 1; i2 >= 0; i2--) {
                e eVar = eVarArr[i2];
                if (eVar.f11088a.f11882t0.isShowing()) {
                    eVar.f11088a.dismiss();
                }
            }
        }
    }

    @Override // p.b0
    public final r1 e() {
        ArrayList arrayList = this.f11091b0;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((e) arrayList.get(arrayList.size() - 1)).f11088a.L;
    }

    @Override // p.x
    public final boolean f(d0 d0Var) {
        ArrayList arrayList = this.f11091b0;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            e eVar = (e) obj;
            if (d0Var == eVar.f11089b) {
                eVar.f11088a.L.requestFocus();
                return true;
            }
        }
        if (!d0Var.hasVisibleItems()) {
            return false;
        }
        l(d0Var);
        w wVar = this.f11105q0;
        if (wVar != null) {
            wVar.l(d0Var);
        }
        return true;
    }

    @Override // p.x
    public final boolean i() {
        return false;
    }

    @Override // p.x
    public final void j(w wVar) {
        this.f11105q0 = wVar;
    }

    @Override // p.t
    public final void l(l lVar) {
        lVar.b(this, this.B);
        if (b()) {
            u(lVar);
        } else {
            this.Z.add(lVar);
        }
    }

    @Override // p.t
    public final void n(View view) {
        if (this.f11097h0 != view) {
            this.f11097h0 = view;
            this.f11096g0 = Gravity.getAbsoluteGravity(this.f11095f0, view.getLayoutDirection());
        }
    }

    @Override // p.t
    public final void o(boolean z10) {
        this.f11104o0 = z10;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        e eVar;
        ArrayList arrayList = this.f11091b0;
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            if (i2 < size) {
                eVar = (e) arrayList.get(i2);
                if (!eVar.f11088a.f11882t0.isShowing()) {
                    break;
                }
                i2++;
            } else {
                eVar = null;
                break;
            }
        }
        if (eVar != null) {
            eVar.f11089b.c(false);
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i2, KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1 && i2 == 82) {
            dismiss();
            return true;
        }
        return false;
    }

    @Override // p.t
    public final void p(int i2) {
        if (this.f11095f0 != i2) {
            this.f11095f0 = i2;
            this.f11096g0 = Gravity.getAbsoluteGravity(i2, this.f11097h0.getLayoutDirection());
        }
    }

    @Override // p.t
    public final void q(int i2) {
        this.f11100k0 = true;
        this.f11102m0 = i2;
    }

    @Override // p.t
    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.f11107s0 = onDismissListener;
    }

    @Override // p.t
    public final void s(boolean z10) {
        this.p0 = z10;
    }

    @Override // p.t
    public final void t(int i2) {
        this.f11101l0 = true;
        this.f11103n0 = i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:55:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01db  */
    /* JADX WARN: Type inference failed for: r16v10 */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r16v7 */
    /* JADX WARN: Type inference failed for: r16v9 */
    /* JADX WARN: Type inference failed for: r8v3, types: [q.i2, q.d2] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void u(p.l r18) {
        /*
            Method dump skipped, instructions count: 568
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p.f.u(p.l):void");
    }
}
