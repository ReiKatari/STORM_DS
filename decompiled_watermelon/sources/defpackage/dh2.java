package defpackage;

import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.app.o;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: dh2  reason: default package */
/* loaded from: classes.dex */
public abstract class dh2 {
    public static void f(List list, View view) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (list.get(i) == view) {
                return;
            }
        }
        WeakHashMap weakHashMap = aa7.a;
        if (view.getTransitionName() != null) {
            list.add(view);
        }
        for (int i2 = size; i2 < list.size(); i2++) {
            View view2 = (View) list.get(i2);
            if (view2 instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view2;
                int childCount = viewGroup.getChildCount();
                for (int i3 = 0; i3 < childCount; i3++) {
                    View childAt = viewGroup.getChildAt(i3);
                    int i4 = 0;
                    while (true) {
                        if (i4 < size) {
                            if (list.get(i4) == childAt) {
                                break;
                            }
                            i4++;
                        } else if (childAt.getTransitionName() != null) {
                            list.add(childAt);
                        }
                    }
                }
            }
        }
    }

    public static void j(View view, Rect rect) {
        if (!view.isAttachedToWindow()) {
            return;
        }
        RectF rectF = new RectF();
        rectF.set(RecyclerView.A1, RecyclerView.A1, view.getWidth(), view.getHeight());
        view.getMatrix().mapRect(rectF);
        rectF.offset(view.getLeft(), view.getTop());
        ViewParent parent = view.getParent();
        while (parent instanceof View) {
            View view2 = (View) parent;
            rectF.offset(-view2.getScrollX(), -view2.getScrollY());
            view2.getMatrix().mapRect(rectF);
            rectF.offset(view2.getLeft(), view2.getTop());
            parent = view2.getParent();
        }
        int[] iArr = new int[2];
        view.getRootView().getLocationOnScreen(iArr);
        rectF.offset(iArr[0], iArr[1]);
        rect.set(Math.round(rectF.left), Math.round(rectF.top), Math.round(rectF.right), Math.round(rectF.bottom));
    }

    public static boolean k(List list) {
        if (list != null && !list.isEmpty()) {
            return false;
        }
        return true;
    }

    public abstract void a(View view, Object obj);

    public abstract void b(Object obj, ArrayList arrayList);

    public abstract void e(ViewGroup viewGroup, Object obj);

    public abstract boolean g(Object obj);

    public abstract Object h(Object obj);

    public Object i(ViewGroup viewGroup, Object obj) {
        return null;
    }

    public abstract boolean l();

    public abstract boolean m(Object obj);

    public abstract Object n(Object obj, Object obj2, Object obj3);

    public abstract Object o(Object obj, Object obj2);

    public abstract void p(Object obj, View view, ArrayList arrayList);

    public abstract void q(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2);

    public abstract void s(View view, Object obj);

    public abstract void t(Object obj, Rect rect);

    public abstract void u(o oVar, Object obj, lh0 lh0Var, Runnable runnable);

    public void v(Object obj, lh0 lh0Var, m0 m0Var, Runnable runnable) {
        ((mb1) runnable).run();
    }

    public abstract void w(Object obj, View view, ArrayList arrayList);

    public abstract void x(Object obj, ArrayList arrayList, ArrayList arrayList2);

    public abstract Object y(Object obj);

    public void c(Object obj) {
    }

    public void d(Object obj, we weVar) {
    }

    public void r(Object obj, float f) {
    }
}
