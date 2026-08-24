package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.util.Log;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.stormds.emulator.R;
import java.lang.reflect.Method;
import java.util.ArrayList;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: gl0  reason: default package */
/* loaded from: classes.dex */
public final class gl0 extends t44 implements View.OnKeyListener, PopupWindow.OnDismissListener {
    public final Context B;
    public final int L;
    public final int R;
    public final boolean X;
    public final Handler Y;
    public View j0;
    public View k0;
    public int l0;
    public boolean m0;
    public boolean n0;
    public int o0;
    public int p0;
    public boolean r0;
    public a54 s0;
    public ViewTreeObserver t0;
    public PopupWindow.OnDismissListener u0;
    public boolean v0;
    public final ArrayList Z = new ArrayList();
    public final ArrayList d0 = new ArrayList();
    public final wr e0 = new wr(this, 2);
    public final wh f0 = new wh(this, 1);
    public final os0 g0 = new os0(this, 21);
    public int h0 = 0;
    public int i0 = 0;
    public boolean q0 = false;

    public gl0(Context context, View view, int i, boolean z) {
        this.B = context;
        this.j0 = view;
        this.R = i;
        this.X = z;
        this.l0 = view.getLayoutDirection() == 1 ? 0 : 1;
        Resources resources = context.getResources();
        this.L = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.Y = new Handler();
    }

    @Override // defpackage.lh6
    public final boolean a() {
        ArrayList arrayList = this.d0;
        if (arrayList.size() <= 0 || !((fl0) arrayList.get(0)).a.v0.isShowing()) {
            return false;
        }
        return true;
    }

    @Override // defpackage.b54
    public final boolean b(it6 it6Var) {
        ArrayList arrayList = this.d0;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            fl0 fl0Var = (fl0) obj;
            if (it6Var == fl0Var.b) {
                fl0Var.a.L.requestFocus();
                return true;
            }
        }
        if (!it6Var.hasVisibleItems()) {
            return false;
        }
        l(it6Var);
        a54 a54Var = this.s0;
        if (a54Var != null) {
            a54Var.M(it6Var);
        }
        return true;
    }

    @Override // defpackage.b54
    public final boolean c() {
        return false;
    }

    @Override // defpackage.b54
    public final void d(i44 i44Var, boolean z) {
        int i;
        ArrayList arrayList = this.d0;
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            if (i2 < size) {
                if (i44Var == ((fl0) arrayList.get(i2)).b) {
                    break;
                }
                i2++;
            } else {
                i2 = -1;
                break;
            }
        }
        if (i2 >= 0) {
            int i3 = i2 + 1;
            if (i3 < arrayList.size()) {
                ((fl0) arrayList.get(i3)).b.c(false);
            }
            fl0 fl0Var = (fl0) arrayList.remove(i2);
            i44 i44Var2 = fl0Var.b;
            z44 z44Var = fl0Var.a;
            pr prVar = z44Var.v0;
            i44Var2.r(this);
            if (this.v0) {
                w44.b(prVar, null);
                prVar.setAnimationStyle(0);
            }
            z44Var.dismiss();
            int size2 = arrayList.size();
            if (size2 > 0) {
                this.l0 = ((fl0) arrayList.get(size2 - 1)).c;
            } else {
                if (this.j0.getLayoutDirection() == 1) {
                    i = 0;
                } else {
                    i = 1;
                }
                this.l0 = i;
            }
            if (size2 == 0) {
                dismiss();
                a54 a54Var = this.s0;
                if (a54Var != null) {
                    a54Var.d(i44Var, true);
                }
                ViewTreeObserver viewTreeObserver = this.t0;
                if (viewTreeObserver != null) {
                    if (viewTreeObserver.isAlive()) {
                        this.t0.removeGlobalOnLayoutListener(this.e0);
                    }
                    this.t0 = null;
                }
                this.k0.removeOnAttachStateChangeListener(this.f0);
                this.u0.onDismiss();
            } else if (z) {
                ((fl0) arrayList.get(0)).b.c(false);
            }
        }
    }

    @Override // defpackage.lh6
    public final void dismiss() {
        ArrayList arrayList = this.d0;
        int size = arrayList.size();
        if (size > 0) {
            fl0[] fl0VarArr = (fl0[]) arrayList.toArray(new fl0[size]);
            for (int i = size - 1; i >= 0; i--) {
                fl0 fl0Var = fl0VarArr[i];
                if (fl0Var.a.v0.isShowing()) {
                    fl0Var.a.dismiss();
                }
            }
        }
    }

    @Override // defpackage.lh6
    public final void e() {
        if (!a()) {
            ArrayList arrayList = this.Z;
            int size = arrayList.size();
            boolean z = false;
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                u((i44) obj);
            }
            arrayList.clear();
            View view = this.j0;
            this.k0 = view;
            if (view != null) {
                if (this.t0 == null) {
                    z = true;
                }
                ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                this.t0 = viewTreeObserver;
                if (z) {
                    viewTreeObserver.addOnGlobalLayoutListener(this.e0);
                }
                this.k0.addOnAttachStateChangeListener(this.f0);
            }
        }
    }

    @Override // defpackage.b54
    public final void g(a54 a54Var) {
        this.s0 = a54Var;
    }

    @Override // defpackage.b54
    public final void i() {
        ArrayList arrayList = this.d0;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ListAdapter adapter = ((fl0) obj).a.L.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((f44) adapter).notifyDataSetChanged();
        }
    }

    @Override // defpackage.lh6
    public final mp1 j() {
        ArrayList arrayList = this.d0;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((fl0) arrayList.get(arrayList.size() - 1)).a.L;
    }

    @Override // defpackage.t44
    public final void l(i44 i44Var) {
        i44Var.b(this, this.B);
        if (a()) {
            u(i44Var);
        } else {
            this.Z.add(i44Var);
        }
    }

    @Override // defpackage.t44
    public final void n(View view) {
        if (this.j0 != view) {
            this.j0 = view;
            this.i0 = Gravity.getAbsoluteGravity(this.h0, view.getLayoutDirection());
        }
    }

    @Override // defpackage.t44
    public final void o(boolean z) {
        this.q0 = z;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        fl0 fl0Var;
        ArrayList arrayList = this.d0;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i < size) {
                fl0Var = (fl0) arrayList.get(i);
                if (!fl0Var.a.v0.isShowing()) {
                    break;
                }
                i++;
            } else {
                fl0Var = null;
                break;
            }
        }
        if (fl0Var != null) {
            fl0Var.b.c(false);
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1 && i == 82) {
            dismiss();
            return true;
        }
        return false;
    }

    @Override // defpackage.t44
    public final void p(int i) {
        if (this.h0 != i) {
            this.h0 = i;
            this.i0 = Gravity.getAbsoluteGravity(i, this.j0.getLayoutDirection());
        }
    }

    @Override // defpackage.t44
    public final void q(int i) {
        this.m0 = true;
        this.o0 = i;
    }

    @Override // defpackage.t44
    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.u0 = onDismissListener;
    }

    @Override // defpackage.t44
    public final void s(boolean z) {
        this.r0 = z;
    }

    @Override // defpackage.t44
    public final void t(int i) {
        this.n0 = true;
        this.p0 = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01cd  */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v6 */
    /* JADX WARN: Type inference failed for: r17v7 */
    /* JADX WARN: Type inference failed for: r17v8 */
    /* JADX WARN: Type inference failed for: r8v3, types: [z44, ax3] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void u(i44 i44Var) {
        boolean z;
        ?? r17;
        View view;
        fl0 fl0Var;
        Rect rect;
        int i;
        boolean z2;
        int i2;
        int i3;
        int width;
        MenuItem menuItem;
        f44 f44Var;
        int i4;
        int firstVisiblePosition;
        Context context = this.B;
        LayoutInflater from = LayoutInflater.from(context);
        f44 f44Var2 = new f44(i44Var, from, this.X, R.layout.abc_cascading_menu_item_layout);
        if (!a() && this.q0) {
            f44Var2.L = true;
        } else if (a()) {
            int size = i44Var.f.size();
            int i5 = 0;
            while (true) {
                if (i5 < size) {
                    MenuItem item = i44Var.getItem(i5);
                    if (item.isVisible() && item.getIcon() != null) {
                        z = true;
                        break;
                    }
                    i5++;
                } else {
                    z = false;
                    break;
                }
            }
            f44Var2.L = z;
        }
        int m = t44.m(f44Var2, context, this.L);
        ?? ax3Var = new ax3(context, null, this.R, 0);
        ax3Var.y0 = this.g0;
        ax3Var.l0 = this;
        pr prVar = ax3Var.v0;
        prVar.setOnDismissListener(this);
        ax3Var.k0 = this.j0;
        ax3Var.h0 = this.i0;
        ax3Var.u0 = true;
        prVar.setFocusable(true);
        prVar.setInputMethodMode(2);
        ax3Var.n(f44Var2);
        ax3Var.q(m);
        ax3Var.h0 = this.i0;
        ArrayList arrayList = this.d0;
        if (arrayList.size() > 0) {
            fl0Var = (fl0) arrayList.get(arrayList.size() - 1);
            i44 i44Var2 = fl0Var.b;
            int size2 = i44Var2.f.size();
            int i6 = 0;
            while (true) {
                if (i6 < size2) {
                    menuItem = i44Var2.getItem(i6);
                    if (menuItem.hasSubMenu() && i44Var == menuItem.getSubMenu()) {
                        break;
                    }
                    i6++;
                } else {
                    menuItem = null;
                    break;
                }
            }
            if (menuItem == null) {
                r17 = 0;
                view = null;
            } else {
                mp1 mp1Var = fl0Var.a.L;
                ListAdapter adapter = mp1Var.getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    i4 = headerViewListAdapter.getHeadersCount();
                    f44Var = (f44) headerViewListAdapter.getWrappedAdapter();
                } else {
                    f44Var = (f44) adapter;
                    i4 = 0;
                }
                int count = f44Var.getCount();
                int i7 = 0;
                boolean z3 = false;
                while (true) {
                    if (i7 < count) {
                        if (menuItem == f44Var.getItem(i7)) {
                            break;
                        }
                        i7++;
                    } else {
                        i7 = -1;
                        break;
                    }
                }
                if (i7 == -1 || (firstVisiblePosition = (i7 + i4) - mp1Var.getFirstVisiblePosition()) < 0 || firstVisiblePosition >= mp1Var.getChildCount()) {
                    view = null;
                    r17 = z3;
                } else {
                    view = mp1Var.getChildAt(firstVisiblePosition);
                    r17 = z3;
                }
            }
        } else {
            r17 = 0;
            view = null;
            fl0Var = null;
        }
        if (view != null) {
            if (Build.VERSION.SDK_INT <= 28) {
                Method method = z44.z0;
                if (method != null) {
                    try {
                        Object[] objArr = new Object[1];
                        objArr[r17] = Boolean.FALSE;
                        method.invoke(prVar, objArr);
                    } catch (Exception unused) {
                        Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
                    }
                }
            } else {
                x44.a(prVar, r17);
            }
            w44.a(prVar, null);
            mp1 mp1Var2 = ((fl0) arrayList.get(arrayList.size() - 1)).a.L;
            int[] iArr = new int[2];
            mp1Var2.getLocationOnScreen(iArr);
            Rect rect2 = new Rect();
            this.k0.getWindowVisibleDisplayFrame(rect2);
            if (this.l0 == 1) {
                if (mp1Var2.getWidth() + iArr[0] + m > rect2.right) {
                    i = 0;
                    if (i != 1) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    this.l0 = i;
                    if (Build.VERSION.SDK_INT < 26) {
                        ax3Var.k0 = view;
                        i2 = 0;
                        i3 = 0;
                    } else {
                        int[] iArr2 = new int[2];
                        this.j0.getLocationOnScreen(iArr2);
                        int[] iArr3 = new int[2];
                        view.getLocationOnScreen(iArr3);
                        if ((this.i0 & 7) == 5) {
                            iArr2[0] = this.j0.getWidth() + iArr2[0];
                            iArr3[0] = view.getWidth() + iArr3[0];
                        }
                        i2 = iArr3[1] - iArr2[1];
                        i3 = iArr3[0] - iArr2[0];
                    }
                    if ((this.i0 & 5) != 5) {
                        if (z2) {
                            width = i3 + m;
                            ax3Var.Y = width;
                            ax3Var.g0 = true;
                            ax3Var.f0 = true;
                            ax3Var.i(i2);
                        } else {
                            m = view.getWidth();
                            width = i3 - m;
                            ax3Var.Y = width;
                            ax3Var.g0 = true;
                            ax3Var.f0 = true;
                            ax3Var.i(i2);
                        }
                    } else {
                        if (z2) {
                            width = i3 + view.getWidth();
                            ax3Var.Y = width;
                            ax3Var.g0 = true;
                            ax3Var.f0 = true;
                            ax3Var.i(i2);
                        }
                        width = i3 - m;
                        ax3Var.Y = width;
                        ax3Var.g0 = true;
                        ax3Var.f0 = true;
                        ax3Var.i(i2);
                    }
                }
                i = 1;
                if (i != 1) {
                }
                this.l0 = i;
                if (Build.VERSION.SDK_INT < 26) {
                }
                if ((this.i0 & 5) != 5) {
                }
            } else {
                if (iArr[0] - m >= 0) {
                    i = 0;
                    if (i != 1) {
                    }
                    this.l0 = i;
                    if (Build.VERSION.SDK_INT < 26) {
                    }
                    if ((this.i0 & 5) != 5) {
                    }
                }
                i = 1;
                if (i != 1) {
                }
                this.l0 = i;
                if (Build.VERSION.SDK_INT < 26) {
                }
                if ((this.i0 & 5) != 5) {
                }
            }
        } else {
            if (this.m0) {
                ax3Var.Y = this.o0;
            }
            if (this.n0) {
                ax3Var.i(this.p0);
            }
            Rect rect3 = this.A;
            if (rect3 != null) {
                rect = new Rect(rect3);
            } else {
                rect = null;
            }
            ax3Var.t0 = rect;
        }
        arrayList.add(new fl0(ax3Var, i44Var, this.l0));
        ax3Var.e();
        mp1 mp1Var3 = ax3Var.L;
        mp1Var3.setOnKeyListener(this);
        if (fl0Var == null && this.r0 && i44Var.m != null) {
            FrameLayout frameLayout = (FrameLayout) from.inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) mp1Var3, false);
            frameLayout.setEnabled(false);
            ((TextView) frameLayout.findViewById(16908310)).setText(i44Var.m);
            mp1Var3.addHeaderView(frameLayout, null, false);
            ax3Var.e();
        }
    }
}
