package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import me.magnum.melonds.domain.model.Rect;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: un3  reason: default package */
/* loaded from: classes.dex */
public abstract class un3 extends FrameLayout {
    public static final /* synthetic */ int L = 0;
    public bk3 A;
    public final LinkedHashMap B;

    public un3(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.B = new LinkedHashMap();
        setLayoutDirection(0);
    }

    public final zj3 a(j05 j05Var) {
        bk3 viewBuilderFactory = getViewBuilderFactory();
        nj3 nj3Var = j05Var.b;
        ak3 a = viewBuilderFactory.a(nj3Var);
        Context context = getContext();
        context.getClass();
        View a2 = a.a(context);
        Rect rect = j05Var.a;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(rect.getWidth(), rect.getHeight());
        layoutParams.leftMargin = rect.getX();
        layoutParams.topMargin = rect.getY();
        a.b();
        zj3 zj3Var = new zj3(a2, nj3Var);
        float f = j05Var.c;
        zj3Var.c = f;
        a2.setAlpha(f);
        zj3Var.c(false);
        zj3Var.d = j05Var.d;
        if (nj3Var.isScreen()) {
            addView(a2, 0, layoutParams);
        } else {
            addView(a2, layoutParams);
        }
        f(zj3Var);
        return zj3Var;
    }

    public final void b() {
        this.B.clear();
        removeAllViews();
    }

    public final zj3 d(nj3 nj3Var) {
        nj3Var.getClass();
        return (zj3) this.B.get(nj3Var);
    }

    public void e(ff7 ff7Var, sn3 sn3Var) {
        List list;
        ff7Var.getClass();
        sn3Var.getClass();
        b();
        int i = tn3.a[sn3Var.ordinal()];
        if (i != 1) {
            if (i == 2) {
                list = ff7Var.b.c;
            } else {
                i.d();
                return;
            }
        } else {
            list = ff7Var.a.c;
        }
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (((j05) obj).b.isScreen()) {
                    arrayList.add(obj);
                }
            }
            List d1 = gt0.d1(arrayList, new zh2(19));
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : list) {
                if (!((j05) obj2).b.isScreen()) {
                    arrayList2.add(obj2);
                }
            }
            ArrayList V0 = gt0.V0(d1, arrayList2);
            int size = V0.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj3 = V0.get(i2);
                i2++;
                j05 j05Var = (j05) obj3;
                this.B.put(j05Var.b, a(j05Var));
            }
        }
    }

    public final List<nj3> getInstantiatedComponents() {
        return gt0.k1(this.B.keySet());
    }

    public final List<zj3> getLayoutComponentViews() {
        return gt0.k1(this.B.values());
    }

    public final bk3 getViewBuilderFactory() {
        bk3 bk3Var = this.A;
        if (bk3Var != null) {
            return bk3Var;
        }
        nb3.a0("viewBuilderFactory");
        throw null;
    }

    public final Map<nj3, zj3> getViews() {
        return this.B;
    }

    public final void setLayoutComponentViewBuilderFactory(bk3 bk3Var) {
        bk3Var.getClass();
        setViewBuilderFactory(bk3Var);
    }

    public final void setViewBuilderFactory(bk3 bk3Var) {
        bk3Var.getClass();
        this.A = bk3Var;
    }

    public void f(zj3 zj3Var) {
    }
}
