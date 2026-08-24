package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.stormds.emulator.R;
import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: m45  reason: default package */
/* loaded from: classes.dex */
public final class m45 extends FrameLayout {
    public static final Object L = new Object();
    public final ArrayList A;
    public l45 B;

    public m45(Context context, List list) {
        super(context);
        this.A = new ArrayList();
        setProtections(list);
    }

    private hx6 getOrInstallSystemBarStateMonitor() {
        ViewGroup viewGroup = (ViewGroup) getRootView();
        Object tag = viewGroup.getTag(R.id.tag_system_bar_state_monitor);
        if (tag instanceof hx6) {
            return (hx6) tag;
        }
        hx6 hx6Var = new hx6(viewGroup);
        viewGroup.setTag(R.id.tag_system_bar_state_monitor, hx6Var);
        return hx6Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b3 A[LOOP:0: B:7:0x0028->B:27:0x00b3, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00bc A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        int i;
        int i2;
        int i3;
        ArrayList arrayList = this.A;
        if (arrayList.isEmpty()) {
            b();
            return;
        }
        hx6 orInstallSystemBarStateMonitor = getOrInstallSystemBarStateMonitor();
        b();
        this.B = new l45(orInstallSystemBarStateMonitor, arrayList);
        int childCount = getChildCount();
        int size = this.B.a.size();
        for (int i4 = 0; i4 < size; i4++) {
            mt0 mt0Var = (mt0) this.B.a.get(i4);
            Context context = getContext();
            int i5 = i4 + childCount;
            k45 k45Var = mt0Var.b;
            int i6 = mt0Var.a;
            int i7 = 8;
            int i8 = -1;
            if (i6 != 1) {
                if (i6 != 2) {
                    if (i6 != 4) {
                        if (i6 == 8) {
                            i3 = k45Var.b;
                            i2 = 80;
                        } else {
                            i.h(lb1.g(i6, "Unexpected side: "));
                            return;
                        }
                    } else {
                        i = k45Var.a;
                        i2 = 5;
                    }
                } else {
                    i3 = k45Var.b;
                    i2 = 48;
                }
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i8, i3, i2);
                e83 e83Var = k45Var.c;
                layoutParams.leftMargin = e83Var.a;
                layoutParams.topMargin = e83Var.b;
                layoutParams.rightMargin = e83Var.c;
                layoutParams.bottomMargin = e83Var.d;
                View view = new View(context);
                view.setTag(L);
                view.setTranslationX(k45Var.f);
                view.setTranslationY(k45Var.g);
                view.setAlpha(k45Var.h);
                if (k45Var.d) {
                    i7 = 0;
                }
                view.setVisibility(i7);
                view.setBackground(k45Var.e);
                ap3 ap3Var = new ap3(18, layoutParams, view);
                if (k45Var.i != null) {
                    k45Var.i = ap3Var;
                    addView(view, i5, layoutParams);
                } else {
                    i.m("Trying to overwrite the existing callback. Did you send one protection to multiple ProtectionLayouts?");
                    return;
                }
            } else {
                i = k45Var.a;
                i2 = 3;
            }
            i8 = i;
            i3 = -1;
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(i8, i3, i2);
            e83 e83Var2 = k45Var.c;
            layoutParams2.leftMargin = e83Var2.a;
            layoutParams2.topMargin = e83Var2.b;
            layoutParams2.rightMargin = e83Var2.c;
            layoutParams2.bottomMargin = e83Var2.d;
            View view2 = new View(context);
            view2.setTag(L);
            view2.setTranslationX(k45Var.f);
            view2.setTranslationY(k45Var.g);
            view2.setAlpha(k45Var.h);
            if (k45Var.d) {
            }
            view2.setVisibility(i7);
            view2.setBackground(k45Var.e);
            ap3 ap3Var2 = new ap3(18, layoutParams2, view2);
            if (k45Var.i != null) {
            }
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        int i2;
        if (view != null && view.getTag() != L) {
            l45 l45Var = this.B;
            if (l45Var != null) {
                i2 = l45Var.a.size();
            } else {
                i2 = 0;
            }
            int childCount = getChildCount() - i2;
            if (i > childCount || i < 0) {
                i = childCount;
            }
        }
        super.addView(view, i, layoutParams);
    }

    public final void b() {
        l45 l45Var;
        if (this.B != null) {
            removeViews(getChildCount() - this.B.a.size(), this.B.a.size());
            int size = this.B.a.size();
            int i = 0;
            while (true) {
                l45Var = this.B;
                if (i >= size) {
                    break;
                }
                ((mt0) l45Var.a.get(i)).b.i = null;
                i++;
            }
            ArrayList arrayList = l45Var.a;
            if (!l45Var.f) {
                l45Var.f = true;
                l45Var.b.b.remove(l45Var);
                for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                    ((mt0) arrayList.get(size2)).e = null;
                }
                arrayList.clear();
            }
            this.B = null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a();
        requestApplyInsets();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b();
        ViewGroup viewGroup = (ViewGroup) getRootView();
        Object tag = viewGroup.getTag(R.id.tag_system_bar_state_monitor);
        if (tag instanceof hx6) {
            hx6 hx6Var = (hx6) tag;
            if (!hx6Var.b.isEmpty()) {
                return;
            }
            hx6Var.a.post(new rk3(hx6Var, 14));
            viewGroup.setTag(R.id.tag_system_bar_state_monitor, null);
        }
    }

    public void setProtections(List<mt0> list) {
        ArrayList arrayList = this.A;
        arrayList.clear();
        arrayList.addAll(list);
        if (isAttachedToWindow()) {
            a();
            requestApplyInsets();
        }
    }
}
