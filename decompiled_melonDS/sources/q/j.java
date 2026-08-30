package q;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.ActionMenuView;
import java.util.ArrayList;
import me.magnum.melonds.R;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class j implements p.x {
    public final Context A;
    public Context B;
    public p.l L;
    public final LayoutInflater R;
    public p.w X;

    /* renamed from: b0  reason: collision with root package name */
    public p.z f11913b0;

    /* renamed from: c0  reason: collision with root package name */
    public i f11914c0;

    /* renamed from: d0  reason: collision with root package name */
    public Drawable f11915d0;

    /* renamed from: e0  reason: collision with root package name */
    public boolean f11916e0;

    /* renamed from: f0  reason: collision with root package name */
    public boolean f11917f0;

    /* renamed from: g0  reason: collision with root package name */
    public boolean f11918g0;

    /* renamed from: h0  reason: collision with root package name */
    public int f11919h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f11920i0;

    /* renamed from: j0  reason: collision with root package name */
    public int f11921j0;

    /* renamed from: k0  reason: collision with root package name */
    public boolean f11922k0;

    /* renamed from: m0  reason: collision with root package name */
    public f f11924m0;

    /* renamed from: n0  reason: collision with root package name */
    public f f11925n0;

    /* renamed from: o0  reason: collision with root package name */
    public h f11926o0;
    public g p0;
    public final int Y = R.layout.abc_action_menu_layout;
    public final int Z = R.layout.abc_action_menu_item_layout;

    /* renamed from: l0  reason: collision with root package name */
    public final SparseBooleanArray f11923l0 = new SparseBooleanArray();

    /* renamed from: q0  reason: collision with root package name */
    public final l.i0 f11927q0 = new l.i0(24, this);

    public j(Context context) {
        this.A = context;
        this.R = LayoutInflater.from(context);
    }

    @Override // p.x
    public final void a(p.l lVar, boolean z10) {
        c();
        f fVar = this.f11925n0;
        if (fVar != null && fVar.b()) {
            fVar.f11172i.dismiss();
        }
        p.w wVar = this.X;
        if (wVar != null) {
            wVar.a(lVar, z10);
        }
    }

    public final View b(p.n nVar, View view, ViewGroup viewGroup) {
        p.y yVar;
        View actionView = nVar.getActionView();
        int i2 = 0;
        if (actionView == null || nVar.e()) {
            if (view instanceof p.y) {
                yVar = (p.y) view;
            } else {
                yVar = (p.y) this.R.inflate(this.Z, viewGroup, false);
            }
            yVar.b(nVar);
            ActionMenuItemView actionMenuItemView = (ActionMenuItemView) yVar;
            actionMenuItemView.setItemInvoker((ActionMenuView) this.f11913b0);
            if (this.p0 == null) {
                this.p0 = new g(this);
            }
            actionMenuItemView.setPopupCallback(this.p0);
            actionView = (View) yVar;
        }
        if (nVar.C) {
            i2 = 8;
        }
        actionView.setVisibility(i2);
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        ((ActionMenuView) viewGroup).getClass();
        if (!(layoutParams instanceof l)) {
            actionView.setLayoutParams(ActionMenuView.k(layoutParams));
        }
        return actionView;
    }

    public final boolean c() {
        p.z zVar;
        h hVar = this.f11926o0;
        if (hVar != null && (zVar = this.f11913b0) != null) {
            ((View) zVar).removeCallbacks(hVar);
            this.f11926o0 = null;
            return true;
        }
        f fVar = this.f11924m0;
        if (fVar != null) {
            if (fVar.b()) {
                fVar.f11172i.dismiss();
            }
            return true;
        }
        return false;
    }

    @Override // p.x
    public final void d() {
        int i2;
        p.n nVar;
        ViewGroup viewGroup = (ViewGroup) this.f11913b0;
        ArrayList arrayList = null;
        boolean z10 = false;
        if (viewGroup != null) {
            p.l lVar = this.L;
            if (lVar != null) {
                lVar.i();
                ArrayList l10 = this.L.l();
                int size = l10.size();
                i2 = 0;
                for (int i10 = 0; i10 < size; i10++) {
                    p.n nVar2 = (p.n) l10.get(i10);
                    if ((nVar2.f11155x & 32) == 32) {
                        View childAt = viewGroup.getChildAt(i2);
                        if (childAt instanceof p.y) {
                            nVar = ((p.y) childAt).getItemData();
                        } else {
                            nVar = null;
                        }
                        View b10 = b(nVar2, childAt, viewGroup);
                        if (nVar2 != nVar) {
                            b10.setPressed(false);
                            b10.jumpDrawablesToCurrentState();
                        }
                        if (b10 != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) b10.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(b10);
                            }
                            ((ViewGroup) this.f11913b0).addView(b10, i2);
                        }
                        i2++;
                    }
                }
            } else {
                i2 = 0;
            }
            while (i2 < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i2) == this.f11914c0) {
                    i2++;
                } else {
                    viewGroup.removeViewAt(i2);
                }
            }
        }
        ((View) this.f11913b0).requestLayout();
        p.l lVar2 = this.L;
        if (lVar2 != null) {
            lVar2.i();
            ArrayList arrayList2 = lVar2.f11118i;
            int size2 = arrayList2.size();
            for (int i11 = 0; i11 < size2; i11++) {
                p.o oVar = ((p.n) arrayList2.get(i11)).A;
            }
        }
        p.l lVar3 = this.L;
        if (lVar3 != null) {
            lVar3.i();
            arrayList = lVar3.f11119j;
        }
        if (this.f11917f0 && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z10 = !((p.n) arrayList.get(0)).C;
            } else if (size3 > 0) {
                z10 = true;
            }
        }
        i iVar = this.f11914c0;
        if (z10) {
            if (iVar == null) {
                this.f11914c0 = new i(this, this.A);
            }
            ViewGroup viewGroup3 = (ViewGroup) this.f11914c0.getParent();
            if (viewGroup3 != this.f11913b0) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.f11914c0);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f11913b0;
                i iVar2 = this.f11914c0;
                actionMenuView.getClass();
                l j2 = ActionMenuView.j();
                j2.f11942a = true;
                actionMenuView.addView(iVar2, j2);
            }
        } else if (iVar != null) {
            ViewParent parent = iVar.getParent();
            p.z zVar = this.f11913b0;
            if (parent == zVar) {
                ((ViewGroup) zVar).removeView(this.f11914c0);
            }
        }
        ((ActionMenuView) this.f11913b0).setOverflowReserved(this.f11917f0);
    }

    public final boolean e() {
        f fVar = this.f11924m0;
        if (fVar != null && fVar.b()) {
            return true;
        }
        return false;
    }

    @Override // p.x
    public final boolean f(p.d0 d0Var) {
        boolean z10;
        if (d0Var.hasVisibleItems()) {
            p.d0 d0Var2 = d0Var;
            while (true) {
                p.l lVar = d0Var2.f11087z;
                if (lVar == this.L) {
                    break;
                }
                d0Var2 = (p.d0) lVar;
            }
            p.n nVar = d0Var2.A;
            ViewGroup viewGroup = (ViewGroup) this.f11913b0;
            View view = null;
            if (viewGroup != null) {
                int childCount = viewGroup.getChildCount();
                int i2 = 0;
                while (true) {
                    if (i2 >= childCount) {
                        break;
                    }
                    View childAt = viewGroup.getChildAt(i2);
                    if ((childAt instanceof p.y) && ((p.y) childAt).getItemData() == nVar) {
                        view = childAt;
                        break;
                    }
                    i2++;
                }
            }
            if (view != null) {
                d0Var.A.getClass();
                int size = d0Var.f11115f.size();
                int i10 = 0;
                while (true) {
                    if (i10 < size) {
                        MenuItem item = d0Var.getItem(i10);
                        if (item.isVisible() && item.getIcon() != null) {
                            z10 = true;
                            break;
                        }
                        i10++;
                    } else {
                        z10 = false;
                        break;
                    }
                }
                f fVar = new f(this, this.B, d0Var, view);
                this.f11925n0 = fVar;
                fVar.f11170g = z10;
                p.t tVar = fVar.f11172i;
                if (tVar != null) {
                    tVar.o(z10);
                }
                f fVar2 = this.f11925n0;
                if (!fVar2.b()) {
                    if (fVar2.f11168e != null) {
                        fVar2.d(0, 0, false, false);
                    } else {
                        a0.j.p("MenuPopupHelper cannot be used without an anchor");
                        return false;
                    }
                }
                p.w wVar = this.X;
                if (wVar != null) {
                    wVar.l(d0Var);
                }
                return true;
            }
        }
        return false;
    }

    @Override // p.x
    public final void g(Context context, p.l lVar) {
        this.B = context;
        LayoutInflater.from(context);
        this.L = lVar;
        Resources resources = context.getResources();
        if (!this.f11918g0) {
            this.f11917f0 = true;
        }
        int i2 = 2;
        this.f11919h0 = context.getResources().getDisplayMetrics().widthPixels / 2;
        Configuration configuration = context.getResources().getConfiguration();
        int i10 = configuration.screenWidthDp;
        int i11 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp <= 600 && i10 <= 600 && ((i10 <= 960 || i11 <= 720) && (i10 <= 720 || i11 <= 960))) {
            if (i10 < 500 && ((i10 <= 640 || i11 <= 480) && (i10 <= 480 || i11 <= 640))) {
                if (i10 >= 360) {
                    i2 = 3;
                }
            } else {
                i2 = 4;
            }
        } else {
            i2 = 5;
        }
        this.f11921j0 = i2;
        int i12 = this.f11919h0;
        if (this.f11917f0) {
            if (this.f11914c0 == null) {
                i iVar = new i(this, this.A);
                this.f11914c0 = iVar;
                if (this.f11916e0) {
                    iVar.setImageDrawable(this.f11915d0);
                    this.f11915d0 = null;
                    this.f11916e0 = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f11914c0.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i12 -= this.f11914c0.getMeasuredWidth();
        } else {
            this.f11914c0 = null;
        }
        this.f11920i0 = i12;
        float f8 = resources.getDisplayMetrics().density;
    }

    @Override // p.x
    public final boolean h(p.n nVar) {
        return false;
    }

    @Override // p.x
    public final boolean i() {
        int i2;
        ArrayList arrayList;
        int i10;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        j jVar = this;
        p.l lVar = jVar.L;
        if (lVar != null) {
            arrayList = lVar.l();
            i2 = arrayList.size();
        } else {
            i2 = 0;
            arrayList = null;
        }
        int i11 = jVar.f11921j0;
        int i12 = jVar.f11920i0;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) jVar.f11913b0;
        int i13 = 0;
        boolean z14 = false;
        int i14 = 0;
        int i15 = 0;
        while (true) {
            i10 = 2;
            z10 = true;
            if (i13 >= i2) {
                break;
            }
            p.n nVar = (p.n) arrayList.get(i13);
            int i16 = nVar.f11156y;
            if ((i16 & 2) == 2) {
                i14++;
            } else if ((i16 & 1) == 1) {
                i15++;
            } else {
                z14 = true;
            }
            if (jVar.f11922k0 && nVar.C) {
                i11 = 0;
            }
            i13++;
        }
        if (jVar.f11917f0 && (z14 || i15 + i14 > i11)) {
            i11--;
        }
        int i17 = i11 - i14;
        SparseBooleanArray sparseBooleanArray = jVar.f11923l0;
        sparseBooleanArray.clear();
        int i18 = 0;
        int i19 = 0;
        while (i18 < i2) {
            p.n nVar2 = (p.n) arrayList.get(i18);
            int i20 = nVar2.f11156y;
            if ((i20 & 2) == i10) {
                z11 = z10;
            } else {
                z11 = false;
            }
            int i21 = nVar2.f11134b;
            if (z11) {
                View b10 = jVar.b(nVar2, null, viewGroup);
                b10.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredWidth = b10.getMeasuredWidth();
                i12 -= measuredWidth;
                if (i19 == 0) {
                    i19 = measuredWidth;
                }
                if (i21 != 0) {
                    sparseBooleanArray.put(i21, z10);
                }
                nVar2.f(z10);
            } else if ((i20 & 1) == z10) {
                boolean z15 = sparseBooleanArray.get(i21);
                if ((i17 > 0 || z15) && i12 > 0) {
                    z12 = z10;
                } else {
                    z12 = false;
                }
                if (z12) {
                    View b11 = jVar.b(nVar2, null, viewGroup);
                    b11.measure(makeMeasureSpec, makeMeasureSpec);
                    int measuredWidth2 = b11.getMeasuredWidth();
                    i12 -= measuredWidth2;
                    if (i19 == 0) {
                        i19 = measuredWidth2;
                    }
                    if (i12 + i19 > 0) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    z12 &= z13;
                }
                if (z12 && i21 != 0) {
                    sparseBooleanArray.put(i21, true);
                } else if (z15) {
                    sparseBooleanArray.put(i21, false);
                    for (int i22 = 0; i22 < i18; i22++) {
                        p.n nVar3 = (p.n) arrayList.get(i22);
                        if (nVar3.f11134b == i21) {
                            if ((nVar3.f11155x & 32) == 32) {
                                i17++;
                            }
                            nVar3.f(false);
                        }
                    }
                }
                if (z12) {
                    i17--;
                }
                nVar2.f(z12);
            } else {
                nVar2.f(false);
                i18++;
                i10 = 2;
                jVar = this;
                z10 = true;
            }
            i18++;
            i10 = 2;
            jVar = this;
            z10 = true;
        }
        return z10;
    }

    @Override // p.x
    public final void j(p.w wVar) {
        throw null;
    }

    @Override // p.x
    public final boolean k(p.n nVar) {
        return false;
    }

    public final boolean l() {
        p.l lVar;
        if (this.f11917f0 && !e() && (lVar = this.L) != null && this.f11913b0 != null && this.f11926o0 == null) {
            lVar.i();
            if (!lVar.f11119j.isEmpty()) {
                h hVar = new h(this, new f(this, this.B, this.L, this.f11914c0));
                this.f11926o0 = hVar;
                ((View) this.f11913b0).post(hVar);
                return true;
            }
            return false;
        }
        return false;
    }
}
