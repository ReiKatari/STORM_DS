package me.magnum.melonds.ui.layouteditor;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import me.magnum.melonds.domain.model.Rect;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* loaded from: classes.dex */
public final class LayoutEditorView extends wg3 {
    public static final /* synthetic */ int l0 = 0;
    public ej2 R;
    public mi2 c0;
    public View.OnClickListener d0;
    public final il6 e0;
    public final il6 f0;
    public hd3 g0;
    public a h0;
    public boolean i0;
    public bj2 j0;
    public mi2 k0;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
    /* loaded from: classes.dex */
    public static final class a {
        private static final /* synthetic */ e12 $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a TOP_LEFT = new a("TOP_LEFT", 0);
        public static final a TOP_RIGHT = new a("TOP_RIGHT", 1);
        public static final a BOTTOM_LEFT = new a("BOTTOM_LEFT", 2);
        public static final a BOTTOM_RIGHT = new a("BOTTOM_RIGHT", 3);

        private static final /* synthetic */ a[] $values() {
            return new a[]{TOP_LEFT, TOP_RIGHT, BOTTOM_LEFT, BOTTOM_RIGHT};
        }

        static {
            a[] $values = $values();
            $VALUES = $values;
            $ENTRIES = l.C($values);
        }

        private a(String str, int i) {
        }

        public static e12 getEntries() {
            return $ENTRIES;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LayoutEditorView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        this.e0 = new il6(new vg0(context, 3));
        this.f0 = new il6(new vg0(context, 4));
        this.h0 = a.TOP_LEFT;
        super.setOnClickListener(new xo0(2, this));
    }

    private final int getDefaultComponentWidth() {
        return ((Number) this.e0.getValue()).intValue();
    }

    private final int getMinComponentSize() {
        return ((Number) this.f0.getValue()).intValue();
    }

    private final void setupDragHandler(hd3 hd3Var) {
        hd3Var.a.setOnTouchListener(new qe3(this, hd3Var, new GestureDetector(getContext(), new re3(this, hd3Var))));
    }

    @Override // defpackage.wg3
    public final void e(k17 k17Var, ug3 ug3Var) {
        k17Var.getClass();
        ug3Var.getClass();
        this.g0 = null;
        super.e(k17Var, ug3Var);
        this.i0 = false;
        o();
    }

    @Override // defpackage.wg3
    public final void f(hd3 hd3Var) {
        setupDragHandler(hd3Var);
        hd3Var.a.setAlpha(0.5f);
        hd3Var.c(false);
    }

    public final void g(vc3 vc3Var) {
        vc3Var.getClass();
        getViews().put(vc3Var, a(new gr4(new Rect(0, 0, getDefaultComponentWidth(), (int) (getDefaultComponentWidth() / getViewBuilderFactory().a(vc3Var).b())), vc3Var, 1.0f, false)));
        this.i0 = true;
        o();
    }

    public final vc3 getSelectedComponent() {
        hd3 hd3Var = this.g0;
        if (hd3Var != null) {
            return hd3Var.b;
        }
        return null;
    }

    public final ArrayList h() {
        Collection<hd3> values = getViews().values();
        ArrayList arrayList = new ArrayList(uq0.y0(values, 10));
        for (hd3 hd3Var : values) {
            arrayList.add(new gr4(hd3Var.b(), hd3Var.b, hd3Var.c, hd3Var.d));
        }
        return arrayList;
    }

    public final cd3 i(hd3 hd3Var) {
        ip4 a2 = hd3Var.a();
        vc3 vc3Var = hd3Var.b;
        int i = a2.a;
        int i2 = a2.b;
        int width = getWidth();
        View view = hd3Var.a;
        return new cd3(vc3Var, i, i2, Math.max(width - view.getWidth(), 0), Math.max(getHeight() - view.getHeight(), 0));
    }

    public final void j() {
        hd3 hd3Var = this.g0;
        if (hd3Var == null) {
            return;
        }
        View view = hd3Var.a;
        int width = (getWidth() - view.getWidth()) / 2;
        int i = hd3Var.a().b;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.leftMargin = width;
            layoutParams2.topMargin = i;
            view.setLayoutParams(layoutParams2);
            this.i0 = true;
            o();
            return;
        }
        c44.i("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
    }

    public final void k() {
        hd3 hd3Var = this.g0;
        if (hd3Var == null) {
            return;
        }
        View view = hd3Var.a;
        int height = (getHeight() - view.getHeight()) / 2;
        int i = hd3Var.a().a;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.leftMargin = i;
            layoutParams2.topMargin = height;
            view.setLayoutParams(layoutParams2);
            this.i0 = true;
            o();
            return;
        }
        c44.i("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
    }

    public final boolean l(boolean z) {
        int i;
        int size;
        List n1 = tq0.n1(getViews().values());
        if (n1.isEmpty()) {
            return false;
        }
        hd3 hd3Var = this.g0;
        int i2 = -1;
        if (hd3Var != null) {
            i = n1.indexOf(hd3Var);
        } else {
            i = -1;
        }
        if (i < 0) {
            if (z) {
                size = 0;
            } else {
                size = n1.size() - 1;
            }
        } else {
            if (z) {
                i2 = 1;
            }
            size = (n1.size() + (i + i2)) % n1.size();
        }
        hd3 hd3Var2 = (hd3) n1.get(size);
        hd3 hd3Var3 = this.g0;
        if (hd3Var3 != null) {
            if (hd3Var3 == hd3Var2) {
                hd3Var3 = null;
            }
            if (hd3Var3 != null) {
                hd3Var3.a.setAlpha(0.5f);
                hd3Var3.c(false);
            }
        }
        u(hd3Var2);
        hd3Var2.a.setAlpha(1.0f);
        hd3Var2.c(true);
        return true;
    }

    public final void m() {
        hd3 hd3Var = this.g0;
        if (hd3Var != null) {
            hd3Var.a.setAlpha(0.5f);
            hd3Var.c(false);
            mi2 mi2Var = this.c0;
            if (mi2Var != null) {
                mi2Var.n(hd3Var);
            }
        }
        this.g0 = null;
    }

    public final void n(hd3 hd3Var, float f, float f2) {
        ip4 a2 = hd3Var.a();
        float max = Math.max(a2.a + f, (float) RecyclerView.A1);
        View view = hd3Var.a;
        float min = Math.min(max, getWidth() - view.getWidth());
        float min2 = Math.min(Math.max(a2.b + f2, (float) RecyclerView.A1), getHeight() - view.getHeight());
        int i = (int) min;
        int i2 = (int) min2;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.leftMargin = i;
            layoutParams2.topMargin = i2;
            view.setLayoutParams(layoutParams2);
            this.i0 = true;
            o();
            return;
        }
        c44.i("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
    }

    public final void o() {
        if (getWidth() > 0 && getHeight() > 0) {
            ArrayList h = h();
            bj2 bj2Var = this.j0;
            if (bj2Var != null) {
                bj2Var.i(h, Integer.valueOf(getWidth()), Integer.valueOf(getHeight()));
            }
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i > 0 && i2 > 0) {
            if (i != i3 || i2 != i4) {
                o();
            }
        }
    }

    public final boolean p(vc3 vc3Var, float f) {
        if (getWidth() > getHeight()) {
            return q(vc3Var, ((getHeight() - getMinComponentSize()) * f) / (getWidth() - getMinComponentSize()), f);
        }
        return q(vc3Var, f, ((getWidth() - getMinComponentSize()) * f) / (getHeight() - getMinComponentSize()));
    }

    public final boolean q(vc3 vc3Var, float f, float f2) {
        hd3 hd3Var = getViews().get(vc3Var);
        if (hd3Var == null) {
            return false;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        a aVar = a.TOP_LEFT;
        linkedHashMap.put(aVar, Double.valueOf(Math.pow(hd3Var.a().b, 2.0d) + Math.pow(hd3Var.a().a, 2.0d)));
        a aVar2 = a.TOP_RIGHT;
        int width = getWidth();
        int i = hd3Var.a().a;
        View view = hd3Var.a;
        linkedHashMap.put(aVar2, Double.valueOf(Math.pow(hd3Var.a().b, 2.0d) + Math.pow(width - (view.getWidth() + i), 2.0d)));
        linkedHashMap.put(a.BOTTOM_LEFT, Double.valueOf(Math.pow(getHeight() - (view.getHeight() + hd3Var.a().b), 2.0d) + Math.pow(hd3Var.a().a, 2.0d)));
        linkedHashMap.put(a.BOTTOM_RIGHT, Double.valueOf(Math.pow(getHeight() - (view.getHeight() + hd3Var.a().b), 2.0d) + Math.pow(getWidth() - (view.getWidth() + hd3Var.a().a), 2.0d)));
        double d = Double.MAX_VALUE;
        for (a aVar3 : linkedHashMap.keySet()) {
            Object obj = linkedHashMap.get(aVar3);
            obj.getClass();
            if (((Number) obj).doubleValue() < d) {
                Object obj2 = linkedHashMap.get(aVar3);
                obj2.getClass();
                d = ((Number) obj2).doubleValue();
                aVar = aVar3;
            }
        }
        return r(vc3Var, f, f2, aVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x009f, code lost:
        if (r5 < 0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a1, code lost:
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00b5, code lost:
        if (r5 < 0) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean r(defpackage.vc3 r5, float r6, float r7, me.magnum.melonds.ui.layouteditor.LayoutEditorView.a r8) {
        /*
            r4 = this;
            java.util.Map r0 = r4.getViews()
            java.lang.Object r5 = r0.get(r5)
            hd3 r5 = (defpackage.hd3) r5
            r0 = 0
            if (r5 != 0) goto Le
            return r0
        Le:
            android.view.View r1 = r5.a
            int r2 = r4.getWidth()
            int r3 = r4.getMinComponentSize()
            int r2 = r2 - r3
            float r2 = (float) r2
            float r2 = r2 * r6
            int r6 = r4.getMinComponentSize()
            float r6 = (float) r6
            float r2 = r2 + r6
            int r6 = defpackage.jv3.X(r2)
            int r2 = r4.getHeight()
            int r3 = r4.getMinComponentSize()
            int r2 = r2 - r3
            float r2 = (float) r2
            float r2 = r2 * r7
            int r7 = r4.getMinComponentSize()
            float r7 = (float) r7
            float r2 = r2 + r7
            int r7 = defpackage.jv3.X(r2)
            ip4 r5 = r5.a()
            me.magnum.melonds.ui.layouteditor.LayoutEditorView$a r2 = me.magnum.melonds.ui.layouteditor.LayoutEditorView.a.TOP_LEFT
            if (r8 != r2) goto L61
            int r8 = r5.a
            int r5 = r5.b
            int r2 = r8 + r6
            int r3 = r4.getWidth()
            if (r2 <= r3) goto L53
            int r8 = r4.getWidth()
            int r8 = r8 - r6
        L53:
            int r2 = r5 + r7
            int r3 = r4.getHeight()
            if (r2 <= r3) goto Lb8
            int r5 = r4.getHeight()
        L5f:
            int r5 = r5 - r7
            goto Lb8
        L61:
            me.magnum.melonds.ui.layouteditor.LayoutEditorView$a r2 = me.magnum.melonds.ui.layouteditor.LayoutEditorView.a.TOP_RIGHT
            if (r8 != r2) goto L81
            int r8 = r5.a
            int r2 = r1.getWidth()
            int r2 = r2 + r8
            int r2 = r2 - r6
            int r5 = r5.b
            if (r2 >= 0) goto L73
            r8 = r0
            goto L74
        L73:
            r8 = r2
        L74:
            int r2 = r5 + r7
            int r3 = r4.getHeight()
            if (r2 <= r3) goto Lb8
            int r5 = r4.getHeight()
            goto L5f
        L81:
            me.magnum.melonds.ui.layouteditor.LayoutEditorView$a r2 = me.magnum.melonds.ui.layouteditor.LayoutEditorView.a.BOTTOM_LEFT
            int r3 = r5.a
            if (r8 != r2) goto La3
            int r5 = r5.b
            int r8 = r1.getHeight()
            int r8 = r8 + r5
            int r5 = r8 - r7
            int r8 = r3 + r6
            int r2 = r4.getWidth()
            if (r8 <= r2) goto L9e
            int r8 = r4.getWidth()
            int r8 = r8 - r6
            goto L9f
        L9e:
            r8 = r3
        L9f:
            if (r5 >= 0) goto Lb8
        La1:
            r5 = r0
            goto Lb8
        La3:
            int r8 = r1.getWidth()
            int r8 = r8 + r3
            int r8 = r8 - r6
            int r5 = r5.b
            int r2 = r1.getHeight()
            int r2 = r2 + r5
            int r5 = r2 - r7
            if (r8 >= 0) goto Lb5
            r8 = r0
        Lb5:
            if (r5 >= 0) goto Lb8
            goto La1
        Lb8:
            android.view.ViewGroup$LayoutParams r2 = r1.getLayoutParams()
            if (r2 == 0) goto Ld2
            android.widget.FrameLayout$LayoutParams r2 = (android.widget.FrameLayout.LayoutParams) r2
            r2.width = r6
            r2.height = r7
            r2.leftMargin = r8
            r2.topMargin = r5
            r1.setLayoutParams(r2)
            r5 = 1
            r4.i0 = r5
            r4.o()
            return r5
        Ld2:
            java.lang.String r4 = "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams"
            defpackage.c44.i(r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: me.magnum.melonds.ui.layouteditor.LayoutEditorView.r(vc3, float, float, me.magnum.melonds.ui.layouteditor.LayoutEditorView$a):boolean");
    }

    public final void s(float f) {
        if (getWidth() > getHeight()) {
            t(((getHeight() - getMinComponentSize()) * f) / (getWidth() - getMinComponentSize()), f);
        } else {
            t(f, ((getWidth() - getMinComponentSize()) * f) / (getHeight() - getMinComponentSize()));
        }
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.d0 = onClickListener;
    }

    public final void setOnLayoutChangedListener(bj2 bj2Var) {
        this.j0 = bj2Var;
    }

    public final void setOnViewDeselectedListener(mi2 mi2Var) {
        mi2Var.getClass();
        this.c0 = mi2Var;
    }

    public final void setOnViewPositionEditRequestedListener(mi2 mi2Var) {
        this.k0 = mi2Var;
    }

    public final void setOnViewSelectedListener(ej2 ej2Var) {
        ej2Var.getClass();
        this.R = ej2Var;
    }

    public final void setSelectedScreenOnTop(boolean z) {
        hd3 hd3Var = this.g0;
        if (hd3Var != null) {
            hd3Var.d = z;
            hd3 hd3Var2 = getViews().get(vc3.TOP_SCREEN);
            hd3 hd3Var3 = getViews().get(vc3.BOTTOM_SCREEN);
            if (hd3Var2 != null) {
                View view = hd3Var2.a;
                if (hd3Var3 != null) {
                    View view2 = hd3Var3.a;
                    removeView(view);
                    removeView(view2);
                    if (hd3Var2.d) {
                        addView(view2, 0);
                        addView(view, 0);
                    } else if (hd3Var3.d) {
                        addView(view, 0);
                        addView(view2, 0);
                    } else {
                        addView(view2, 0);
                        addView(view, 0);
                    }
                }
            }
            this.i0 = true;
            o();
        }
    }

    public final void setSelectedViewAlpha(float f) {
        hd3 hd3Var = this.g0;
        if (hd3Var != null) {
            hd3Var.c = f;
            hd3Var.a.setAlpha(f);
            this.i0 = true;
            o();
        }
    }

    public final void t(float f, float f2) {
        hd3 hd3Var = this.g0;
        if (hd3Var == null) {
            return;
        }
        r(hd3Var.b, f, f2, this.h0);
    }

    public final void u(hd3 hd3Var) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        a aVar = a.TOP_LEFT;
        linkedHashMap.put(aVar, Double.valueOf(Math.pow(hd3Var.a().b, 2.0d) + Math.pow(hd3Var.a().a, 2.0d)));
        a aVar2 = a.TOP_RIGHT;
        int width = getWidth();
        int i = hd3Var.a().a;
        View view = hd3Var.a;
        linkedHashMap.put(aVar2, Double.valueOf(Math.pow(hd3Var.a().b, 2.0d) + Math.pow(width - (view.getWidth() + i), 2.0d)));
        linkedHashMap.put(a.BOTTOM_LEFT, Double.valueOf(Math.pow(getHeight() - (view.getHeight() + hd3Var.a().b), 2.0d) + Math.pow(hd3Var.a().a, 2.0d)));
        linkedHashMap.put(a.BOTTOM_RIGHT, Double.valueOf(Math.pow(getHeight() - (view.getHeight() + hd3Var.a().b), 2.0d) + Math.pow(getWidth() - (view.getWidth() + hd3Var.a().a), 2.0d)));
        double d = Double.MAX_VALUE;
        for (a aVar3 : linkedHashMap.keySet()) {
            Object obj = linkedHashMap.get(aVar3);
            obj.getClass();
            if (((Number) obj).doubleValue() < d) {
                Object obj2 = linkedHashMap.get(aVar3);
                obj2.getClass();
                d = ((Number) obj2).doubleValue();
                aVar = aVar3;
            }
        }
        this.h0 = aVar;
        this.g0 = hd3Var;
        float width2 = (view.getWidth() - getMinComponentSize()) / (getWidth() - getMinComponentSize());
        float height = (view.getHeight() - getMinComponentSize()) / (getHeight() - getMinComponentSize());
        ej2 ej2Var = this.R;
        if (ej2Var != null) {
            ej2Var.h(hd3Var, Float.valueOf(width2), Float.valueOf(height), Integer.valueOf(getWidth()), Integer.valueOf(getHeight()), Integer.valueOf(getMinComponentSize()));
        }
    }
}
