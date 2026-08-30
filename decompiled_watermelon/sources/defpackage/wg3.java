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
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: wg3  reason: default package */
/* loaded from: classes.dex */
public abstract class wg3 extends FrameLayout {
    public static final /* synthetic */ int L = 0;
    public jd3 A;
    public final LinkedHashMap B;

    public wg3(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.B = new LinkedHashMap();
        setLayoutDirection(0);
    }

    public final hd3 a(gr4 gr4Var) {
        jd3 viewBuilderFactory = getViewBuilderFactory();
        vc3 vc3Var = gr4Var.b;
        id3 a = viewBuilderFactory.a(vc3Var);
        Context context = getContext();
        context.getClass();
        View a2 = a.a(context);
        Rect rect = gr4Var.a;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(rect.getWidth(), rect.getHeight());
        layoutParams.leftMargin = rect.getX();
        layoutParams.topMargin = rect.getY();
        a.b();
        hd3 hd3Var = new hd3(a2, vc3Var);
        float f = gr4Var.c;
        hd3Var.c = f;
        a2.setAlpha(f);
        hd3Var.c(false);
        hd3Var.d = gr4Var.d;
        if (vc3Var.isScreen()) {
            addView(a2, 0, layoutParams);
        } else {
            addView(a2, layoutParams);
        }
        f(hd3Var);
        return hd3Var;
    }

    public final void b() {
        this.B.clear();
        removeAllViews();
    }

    public final hd3 c(vc3 vc3Var) {
        vc3Var.getClass();
        return (hd3) this.B.get(vc3Var);
    }

    public void e(k17 k17Var, ug3 ug3Var) {
        List list;
        k17Var.getClass();
        ug3Var.getClass();
        b();
        int i = vg3.a[ug3Var.ordinal()];
        if (i != 1) {
            if (i == 2) {
                list = k17Var.b.c;
            } else {
                i.c();
                return;
            }
        } else {
            list = k17Var.a.c;
        }
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (((gr4) obj).b.isScreen()) {
                    arrayList.add(obj);
                }
            }
            List g1 = tq0.g1(arrayList, new hd2(18));
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : list) {
                if (!((gr4) obj2).b.isScreen()) {
                    arrayList2.add(obj2);
                }
            }
            ArrayList X0 = tq0.X0(g1, arrayList2);
            int size = X0.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj3 = X0.get(i2);
                i2++;
                gr4 gr4Var = (gr4) obj3;
                this.B.put(gr4Var.b, a(gr4Var));
            }
        }
    }

    public final List<vc3> getInstantiatedComponents() {
        return tq0.n1(this.B.keySet());
    }

    public final List<hd3> getLayoutComponentViews() {
        return tq0.n1(this.B.values());
    }

    public final jd3 getViewBuilderFactory() {
        jd3 jd3Var = this.A;
        if (jd3Var != null) {
            return jd3Var;
        }
        b53.g0("viewBuilderFactory");
        throw null;
    }

    public final Map<vc3, hd3> getViews() {
        return this.B;
    }

    public final void setLayoutComponentViewBuilderFactory(jd3 jd3Var) {
        jd3Var.getClass();
        setViewBuilderFactory(jd3Var);
    }

    public final void setViewBuilderFactory(jd3 jd3Var) {
        jd3Var.getClass();
        this.A = jd3Var;
    }

    public void f(hd3 hd3Var) {
    }
}
