package me.magnum.melonds.ui.layouteditor;

import ah.f;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import b7.s;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import m9.o;
import mc.l;
import mc.t;
import oe.a0;
import oe.b0;
import og.i;
import og.n;
import q8.r;
import rh.v;
import sh.d;
import ve.c;
import ve.j;
import zb.m;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class LayoutEditorView extends n {

    /* renamed from: i0  reason: collision with root package name */
    public static final /* synthetic */ int f9528i0 = 0;
    public t R;

    /* renamed from: b0  reason: collision with root package name */
    public l f9529b0;

    /* renamed from: c0  reason: collision with root package name */
    public View.OnClickListener f9530c0;

    /* renamed from: d0  reason: collision with root package name */
    public final yb.n f9531d0;

    /* renamed from: e0  reason: collision with root package name */
    public final yb.n f9532e0;

    /* renamed from: f0  reason: collision with root package name */
    public i f9533f0;

    /* renamed from: g0  reason: collision with root package name */
    public a f9534g0;

    /* renamed from: h0  reason: collision with root package name */
    public boolean f9535h0;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
    /* loaded from: classes.dex */
    public static final class a {
        private static final /* synthetic */ fc.a $ENTRIES;
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
            $ENTRIES = r.x($values);
        }

        private a(String str, int i2) {
        }

        public static fc.a getEntries() {
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
        this.f9531d0 = new yb.n(new s(context, 1));
        this.f9532e0 = new yb.n(new s(context, 2));
        this.f9534g0 = a.TOP_LEFT;
        super.setOnClickListener(new f(6, this));
    }

    public static final void g(LayoutEditorView layoutEditorView, i iVar) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        a aVar = a.TOP_LEFT;
        double d4 = 2;
        linkedHashMap.put(aVar, Double.valueOf(Math.pow(iVar.a().f10909b, d4) + Math.pow(iVar.a().f10908a, d4)));
        a aVar2 = a.TOP_RIGHT;
        int width = layoutEditorView.getWidth();
        int i2 = iVar.a().f10908a;
        View view = iVar.f11005a;
        linkedHashMap.put(aVar2, Double.valueOf(Math.pow(iVar.a().f10909b, d4) + Math.pow(width - (view.getWidth() + i2), d4)));
        linkedHashMap.put(a.BOTTOM_LEFT, Double.valueOf(Math.pow(layoutEditorView.getHeight() - (view.getHeight() + iVar.a().f10909b), d4) + Math.pow(iVar.a().f10908a, d4)));
        linkedHashMap.put(a.BOTTOM_RIGHT, Double.valueOf(Math.pow(layoutEditorView.getHeight() - (view.getHeight() + iVar.a().f10909b), d4) + Math.pow(layoutEditorView.getWidth() - (view.getWidth() + iVar.a().f10908a), d4)));
        double d10 = Double.MAX_VALUE;
        for (a aVar3 : linkedHashMap.keySet()) {
            Object obj = linkedHashMap.get(aVar3);
            obj.getClass();
            if (((Number) obj).doubleValue() < d10) {
                Object obj2 = linkedHashMap.get(aVar3);
                obj2.getClass();
                d10 = ((Number) obj2).doubleValue();
                aVar = aVar3;
            }
        }
        layoutEditorView.f9534g0 = aVar;
        layoutEditorView.f9533f0 = iVar;
        float width2 = (view.getWidth() - layoutEditorView.getMinComponentSize()) / (layoutEditorView.getWidth() - layoutEditorView.getMinComponentSize());
        float height = (view.getHeight() - layoutEditorView.getMinComponentSize()) / (layoutEditorView.getHeight() - layoutEditorView.getMinComponentSize());
        t tVar = layoutEditorView.R;
        if (tVar != null) {
            tVar.d(iVar, Float.valueOf(width2), Float.valueOf(height), Integer.valueOf(layoutEditorView.getWidth()), Integer.valueOf(layoutEditorView.getHeight()), Integer.valueOf(layoutEditorView.getMinComponentSize()));
        }
    }

    private final int getDefaultComponentWidth() {
        return ((Number) this.f9531d0.getValue()).intValue();
    }

    private final int getMinComponentSize() {
        return ((Number) this.f9532e0.getValue()).intValue();
    }

    private final void setupDragHandler(i iVar) {
        iVar.f11005a.setOnTouchListener(new v(this, iVar));
    }

    @Override // og.n
    public final void e(ve.n nVar, d dVar) {
        nVar.getClass();
        dVar.getClass();
        super.e(nVar, dVar);
        this.f9535h0 = false;
    }

    @Override // og.n
    public final void f(i iVar) {
        setupDragHandler(iVar);
        View view = iVar.f11005a;
        view.setAlpha(0.5f);
        view.setSelected(false);
    }

    public final void h(c cVar) {
        cVar.getClass();
        getViews().put(cVar, a(new j(new b0(0, 0, getDefaultComponentWidth(), (int) (getDefaultComponentWidth() / getViewBuilderFactory().a(cVar).b())), cVar, 1.0f, false)));
        this.f9535h0 = true;
    }

    public final ArrayList i() {
        Collection<i> values = getViews().values();
        ArrayList arrayList = new ArrayList(m.G(values, 10));
        for (i iVar : values) {
            arrayList.add(new j(iVar.b(), iVar.f11006b, iVar.f11007c, iVar.f11008d));
        }
        return arrayList;
    }

    public final void j() {
        i iVar = this.f9533f0;
        if (iVar != null) {
            View view = iVar.f11005a;
            view.setAlpha(0.5f);
            view.setSelected(false);
            l lVar = this.f9529b0;
            if (lVar != null) {
                lVar.k(iVar);
            }
        }
        this.f9533f0 = null;
    }

    public final void k(i iVar, float f8, float f10) {
        a0 a10 = iVar.a();
        float max = Math.max(a10.f10908a + f8, 0.0f);
        View view = iVar.f11005a;
        float min = Math.min(max, getWidth() - view.getWidth());
        float min2 = Math.min(Math.max(a10.f10909b + f10, 0.0f), getHeight() - view.getHeight());
        int i2 = (int) min;
        int i10 = (int) min2;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.leftMargin = i2;
            layoutParams2.topMargin = i10;
            view.setLayoutParams(layoutParams2);
            this.f9535h0 = true;
            return;
        }
        o.i("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
    }

    public final void l(float f8) {
        if (getWidth() > getHeight()) {
            m(((getHeight() - getMinComponentSize()) * f8) / (getWidth() - getMinComponentSize()), f8);
        } else {
            m(f8, ((getWidth() - getMinComponentSize()) * f8) / (getHeight() - getMinComponentSize()));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0099, code lost:
        if (r0 < 0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x009b, code lost:
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00af, code lost:
        if (r0 < 0) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m(float r7, float r8) {
        /*
            r6 = this;
            og.i r0 = r6.f9533f0
            if (r0 != 0) goto L5
            return
        L5:
            android.view.View r1 = r0.f11005a
            int r2 = r6.getWidth()
            int r3 = r6.getMinComponentSize()
            int r2 = r2 - r3
            float r2 = (float) r2
            float r2 = r2 * r7
            int r7 = r6.getMinComponentSize()
            float r7 = (float) r7
            float r2 = r2 + r7
            int r7 = pc.a.M(r2)
            int r2 = r6.getHeight()
            int r3 = r6.getMinComponentSize()
            int r2 = r2 - r3
            float r2 = (float) r2
            float r2 = r2 * r8
            int r8 = r6.getMinComponentSize()
            float r8 = (float) r8
            float r2 = r2 + r8
            int r8 = pc.a.M(r2)
            oe.a0 r0 = r0.a()
            me.magnum.melonds.ui.layouteditor.LayoutEditorView$a r2 = r6.f9534g0
            me.magnum.melonds.ui.layouteditor.LayoutEditorView$a r3 = me.magnum.melonds.ui.layouteditor.LayoutEditorView.a.TOP_LEFT
            if (r2 != r3) goto L5a
            int r2 = r0.f10908a
            int r0 = r0.f10909b
            int r3 = r2 + r7
            int r4 = r6.getWidth()
            if (r3 <= r4) goto L4c
            int r2 = r6.getWidth()
            int r2 = r2 - r7
        L4c:
            int r3 = r0 + r8
            int r4 = r6.getHeight()
            if (r3 <= r4) goto Lb2
            int r0 = r6.getHeight()
        L58:
            int r0 = r0 - r8
            goto Lb2
        L5a:
            me.magnum.melonds.ui.layouteditor.LayoutEditorView$a r3 = me.magnum.melonds.ui.layouteditor.LayoutEditorView.a.TOP_RIGHT
            r4 = 0
            if (r2 != r3) goto L7b
            int r2 = r0.f10908a
            int r3 = r1.getWidth()
            int r3 = r3 + r2
            int r3 = r3 - r7
            int r0 = r0.f10909b
            if (r3 >= 0) goto L6d
            r2 = r4
            goto L6e
        L6d:
            r2 = r3
        L6e:
            int r3 = r0 + r8
            int r4 = r6.getHeight()
            if (r3 <= r4) goto Lb2
            int r0 = r6.getHeight()
            goto L58
        L7b:
            me.magnum.melonds.ui.layouteditor.LayoutEditorView$a r3 = me.magnum.melonds.ui.layouteditor.LayoutEditorView.a.BOTTOM_LEFT
            int r5 = r0.f10908a
            if (r2 != r3) goto L9d
            int r0 = r0.f10909b
            int r2 = r1.getHeight()
            int r2 = r2 + r0
            int r0 = r2 - r8
            int r2 = r5 + r7
            int r3 = r6.getWidth()
            if (r2 <= r3) goto L98
            int r2 = r6.getWidth()
            int r2 = r2 - r7
            goto L99
        L98:
            r2 = r5
        L99:
            if (r0 >= 0) goto Lb2
        L9b:
            r0 = r4
            goto Lb2
        L9d:
            int r2 = r1.getWidth()
            int r2 = r2 + r5
            int r2 = r2 - r7
            int r0 = r0.f10909b
            int r3 = r1.getHeight()
            int r3 = r3 + r0
            int r0 = r3 - r8
            if (r2 >= 0) goto Laf
            r2 = r4
        Laf:
            if (r0 >= 0) goto Lb2
            goto L9b
        Lb2:
            android.view.ViewGroup$LayoutParams r3 = r1.getLayoutParams()
            if (r3 == 0) goto Lc9
            android.widget.FrameLayout$LayoutParams r3 = (android.widget.FrameLayout.LayoutParams) r3
            r3.width = r7
            r3.height = r8
            r3.leftMargin = r2
            r3.topMargin = r0
            r1.setLayoutParams(r3)
            r7 = 1
            r6.f9535h0 = r7
            return
        Lc9:
            java.lang.String r7 = "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams"
            m9.o.i(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: me.magnum.melonds.ui.layouteditor.LayoutEditorView.m(float, float):void");
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f9530c0 = onClickListener;
    }

    public final void setOnViewDeselectedListener(l lVar) {
        lVar.getClass();
        this.f9529b0 = lVar;
    }

    public final void setOnViewSelectedListener(t tVar) {
        tVar.getClass();
        this.R = tVar;
    }

    public final void setSelectedScreenOnTop(boolean z10) {
        i iVar = this.f9533f0;
        if (iVar != null) {
            iVar.f11008d = z10;
            i iVar2 = getViews().get(c.TOP_SCREEN);
            i iVar3 = getViews().get(c.BOTTOM_SCREEN);
            if (iVar2 != null) {
                View view = iVar2.f11005a;
                if (iVar3 != null) {
                    View view2 = iVar3.f11005a;
                    removeView(view);
                    removeView(view2);
                    if (iVar2.f11008d) {
                        addView(view2, 0);
                        addView(view, 0);
                    } else if (iVar3.f11008d) {
                        addView(view, 0);
                        addView(view2, 0);
                    } else {
                        addView(view2, 0);
                        addView(view, 0);
                    }
                }
            }
            this.f9535h0 = true;
        }
    }

    public final void setSelectedViewAlpha(float f8) {
        i iVar = this.f9533f0;
        if (iVar != null) {
            iVar.f11007c = f8;
            iVar.f11005a.setAlpha(f8);
            this.f9535h0 = true;
        }
    }
}
