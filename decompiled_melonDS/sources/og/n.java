package og;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import oe.b0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class n extends FrameLayout {
    public static final /* synthetic */ int L = 0;
    public k A;
    public final LinkedHashMap B;

    public n(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.B = new LinkedHashMap();
        setLayoutDirection(0);
    }

    public final i a(ve.j jVar) {
        k viewBuilderFactory = getViewBuilderFactory();
        ve.c cVar = jVar.f13812b;
        j a10 = viewBuilderFactory.a(cVar);
        Context context = getContext();
        context.getClass();
        View a11 = a10.a(context);
        b0 b0Var = jVar.f13811a;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(b0Var.f10914c, b0Var.f10915d);
        layoutParams.leftMargin = b0Var.f10912a;
        layoutParams.topMargin = b0Var.f10913b;
        a10.b();
        i iVar = new i(a11, cVar);
        float f8 = jVar.f13813c;
        iVar.f11007c = f8;
        a11.setAlpha(f8);
        a11.setSelected(false);
        iVar.f11008d = jVar.f13814d;
        if (cVar.isScreen()) {
            addView(a11, 0, layoutParams);
        } else {
            addView(a11, layoutParams);
        }
        f(iVar);
        return iVar;
    }

    public final void b() {
        this.B.clear();
        removeAllViews();
    }

    public final i c(ve.c cVar) {
        cVar.getClass();
        return (i) this.B.get(cVar);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.Comparator] */
    public void e(ve.n nVar, sh.d dVar) {
        List list;
        nVar.getClass();
        dVar.getClass();
        b();
        int i2 = l.f11009a[dVar.ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                list = nVar.f13822b.f13820c;
            } else {
                m9.o.o();
                return;
            }
        } else {
            list = nVar.f13821a.f13820c;
        }
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (((ve.j) obj).f13812b.isScreen()) {
                    arrayList.add(obj);
                }
            }
            List l02 = zb.l.l0(arrayList, new Object());
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : list) {
                if (!((ve.j) obj2).f13812b.isScreen()) {
                    arrayList2.add(obj2);
                }
            }
            ArrayList e02 = zb.l.e0(l02, arrayList2);
            int size = e02.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj3 = e02.get(i10);
                i10++;
                ve.j jVar = (ve.j) obj3;
                this.B.put(jVar.f13812b, a(jVar));
            }
        }
    }

    public final List<ve.c> getInstantiatedComponents() {
        return zb.l.p0(this.B.keySet());
    }

    public final List<i> getLayoutComponentViews() {
        return zb.l.p0(this.B.values());
    }

    public final k getViewBuilderFactory() {
        k kVar = this.A;
        if (kVar != null) {
            return kVar;
        }
        nc.k.f("viewBuilderFactory");
        throw null;
    }

    public final Map<ve.c, i> getViews() {
        return this.B;
    }

    public final void setLayoutComponentViewBuilderFactory(k kVar) {
        kVar.getClass();
        setViewBuilderFactory(kVar);
    }

    public final void setViewBuilderFactory(k kVar) {
        kVar.getClass();
        this.A = kVar;
    }

    public void f(i iVar) {
    }
}
