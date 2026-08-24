package me.magnum.melonds.ui.layouteditor;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Rect;
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
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class LayoutEditorView extends un3 {
    public static final /* synthetic */ int p0 = 0;
    public io2 R;
    public qn2 d0;
    public View.OnClickListener e0;
    public final ex6 f0;
    public final ex6 g0;
    public zj3 h0;
    public a i0;
    public boolean j0;
    public fo2 k0;
    public qn2 l0;
    public Rect m0;
    public final Paint n0;
    public final Paint o0;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    /* loaded from: classes.dex */
    public static final class a {
        private static final /* synthetic */ t52 $ENTRIES;
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
            $ENTRIES = nc1.L($values);
        }

        private a(String str, int i) {
        }

        public static t52 getEntries() {
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
        this.f0 = new ex6(new ej0(context, 3));
        this.g0 = new ex6(new ej0(context, 4));
        this.i0 = a.TOP_LEFT;
        this.m0 = new Rect(0, 0, 0, 0);
        Paint paint = new Paint(1);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setStrokeWidth(1.0f);
        paint.setColor(Color.parseColor("#15FFFFFF"));
        this.n0 = paint;
        Paint paint2 = new Paint(1);
        paint2.setStyle(style);
        paint2.setStrokeWidth(1.5f);
        paint2.setColor(Color.parseColor("#3300E5FF"));
        paint2.setPathEffect(new DashPathEffect(new float[]{10.0f, 10.0f}, RecyclerView.B1));
        this.o0 = paint2;
        setWillNotDraw(false);
        super.setOnClickListener(new hr0(this, 2));
    }

    private final int getDefaultComponentWidth() {
        return ((Number) this.f0.getValue()).intValue();
    }

    private final int getMinComponentSize() {
        return ((Number) this.g0.getValue()).intValue();
    }

    private final void setupDragHandler(zj3 zj3Var) {
        zj3Var.a.setOnTouchListener(new ml3(this, zj3Var, new GestureDetector(getContext(), new nl3(this, zj3Var))));
    }

    @Override // defpackage.un3
    public final void e(ff7 ff7Var, sn3 sn3Var) {
        ff7Var.getClass();
        sn3Var.getClass();
        this.h0 = null;
        super.e(ff7Var, sn3Var);
        this.j0 = false;
        p();
    }

    @Override // defpackage.un3
    public final void f(zj3 zj3Var) {
        setupDragHandler(zj3Var);
        zj3Var.a.setAlpha(0.5f);
        zj3Var.c(false);
    }

    public final void g(nj3 nj3Var) {
        float K;
        int width;
        nj3Var.getClass();
        switch (ll3.a[nj3Var.ordinal()]) {
            case 1:
            case 2:
                Context context = getContext();
                context.getClass();
                K = np2.K(context, 140.0f);
                width = (int) K;
                break;
            case 3:
            case 4:
                Context context2 = getContext();
                context2.getClass();
                K = np2.K(context2, 56.0f);
                width = (int) K;
                break;
            case 5:
            case 6:
                Context context3 = getContext();
                context3.getClass();
                K = np2.K(context3, 54.0f);
                width = (int) K;
                break;
            case 7:
            case 8:
                width = (int) (getWidth() * 0.5f);
                int defaultComponentWidth = getDefaultComponentWidth();
                if (width < defaultComponentWidth) {
                    width = defaultComponentWidth;
                    break;
                }
                break;
            default:
                Context context4 = getContext();
                context4.getClass();
                K = np2.K(context4, 40.0f);
                width = (int) K;
                break;
        }
        int b = (int) (width / getViewBuilderFactory().a(nj3Var).b());
        int minComponentSize = getMinComponentSize();
        if (b < minComponentSize) {
            b = minComponentSize;
        }
        int width2 = (getWidth() - width) / 2;
        if (width2 < 0) {
            width2 = 0;
        }
        int height = (getHeight() - b) / 2;
        if (height < 0) {
            height = 0;
        }
        getViews().put(nj3Var, a(new j05(new me.magnum.melonds.domain.model.Rect(width2, height, width, b), nj3Var, 1.0f, false)));
        this.j0 = true;
        p();
    }

    public final Rect getSafeAreaInsets() {
        return this.m0;
    }

    public final nj3 getSelectedComponent() {
        zj3 zj3Var = this.h0;
        if (zj3Var != null) {
            return zj3Var.b;
        }
        return null;
    }

    public final ArrayList h() {
        Collection<zj3> values = getViews().values();
        ArrayList arrayList = new ArrayList(ht0.v0(values, 10));
        for (zj3 zj3Var : values) {
            arrayList.add(new j05(zj3Var.b(), zj3Var.b, zj3Var.c, zj3Var.d));
        }
        return arrayList;
    }

    public final uj3 i(zj3 zj3Var) {
        my4 a2 = zj3Var.a();
        nj3 nj3Var = zj3Var.b;
        int i = a2.a;
        int i2 = a2.b;
        int width = getWidth();
        View view = zj3Var.a;
        return new uj3(nj3Var, i, i2, Math.max(width - view.getWidth(), 0), Math.max(getHeight() - view.getHeight(), 0));
    }

    public final void j() {
        zj3 zj3Var = this.h0;
        if (zj3Var == null) {
            return;
        }
        View view = zj3Var.a;
        int width = getWidth();
        Rect rect = this.m0;
        int i = rect.left;
        int width2 = ((((width - i) - rect.right) - view.getWidth()) / 2) + i;
        int i2 = zj3Var.a().b;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.leftMargin = width2;
            layoutParams2.topMargin = i2;
            view.setLayoutParams(layoutParams2);
            this.j0 = true;
            p();
            return;
        }
        u34.x("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
    }

    public final void k() {
        zj3 zj3Var = this.h0;
        if (zj3Var == null) {
            return;
        }
        View view = zj3Var.a;
        int height = getHeight();
        Rect rect = this.m0;
        int i = rect.top;
        int height2 = ((((height - i) - rect.bottom) - view.getHeight()) / 2) + i;
        int i2 = zj3Var.a().a;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.leftMargin = i2;
            layoutParams2.topMargin = height2;
            view.setLayoutParams(layoutParams2);
            this.j0 = true;
            p();
            return;
        }
        u34.x("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
    }

    public final boolean l(boolean z) {
        int i;
        int size;
        List k1 = gt0.k1(getViews().values());
        if (k1.isEmpty()) {
            return false;
        }
        zj3 zj3Var = this.h0;
        int i2 = -1;
        if (zj3Var != null) {
            i = k1.indexOf(zj3Var);
        } else {
            i = -1;
        }
        if (i < 0) {
            if (z) {
                size = 0;
            } else {
                size = k1.size() - 1;
            }
        } else {
            if (z) {
                i2 = 1;
            }
            size = (k1.size() + (i + i2)) % k1.size();
        }
        zj3 zj3Var2 = (zj3) k1.get(size);
        zj3 zj3Var3 = this.h0;
        if (zj3Var3 != null) {
            if (zj3Var3 == zj3Var2) {
                zj3Var3 = null;
            }
            if (zj3Var3 != null) {
                zj3Var3.a.setAlpha(0.5f);
                zj3Var3.c(false);
            }
        }
        v(zj3Var2);
        zj3Var2.a.setAlpha(1.0f);
        zj3Var2.c(true);
        return true;
    }

    public final void m() {
        zj3 zj3Var = this.h0;
        if (zj3Var == null) {
            return;
        }
        removeView(zj3Var.a);
        getViews().remove(zj3Var.b);
        n();
        this.j0 = true;
        p();
    }

    public final void n() {
        zj3 zj3Var = this.h0;
        if (zj3Var != null) {
            zj3Var.a.setAlpha(0.5f);
            zj3Var.c(false);
            qn2 qn2Var = this.d0;
            if (qn2Var != null) {
                qn2Var.g(zj3Var);
            }
        }
        this.h0 = null;
    }

    public final void o(zj3 zj3Var, float f, float f2) {
        my4 a2 = zj3Var.a();
        int width = getWidth();
        View view = zj3Var.a;
        float max = Math.max((float) RecyclerView.B1, width - view.getWidth());
        float max2 = Math.max((float) RecyclerView.B1, getHeight() - view.getHeight());
        int min = (int) Math.min(Math.max(a2.a + f, (float) RecyclerView.B1), max);
        int min2 = (int) Math.min(Math.max(a2.b + f2, (float) RecyclerView.B1), max2);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.leftMargin = min;
            layoutParams2.topMargin = min2;
            view.setLayoutParams(layoutParams2);
            this.j0 = true;
            p();
            return;
        }
        u34.x("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Paint paint;
        canvas.getClass();
        super.onDraw(canvas);
        float width = getWidth();
        float height = getHeight();
        if (width > RecyclerView.B1 && height > RecyclerView.B1) {
            float f = width / 2.0f;
            float f2 = height / 2.0f;
            Paint paint2 = this.o0;
            canvas.drawLine(f, RecyclerView.B1, f, height, paint2);
            canvas.drawLine(RecyclerView.B1, f2, width, f2, paint2);
            Context context = getContext();
            context.getClass();
            float K = np2.K(context, 32.0f);
            if (K > RecyclerView.B1) {
                float f3 = K;
                while (true) {
                    int i = (f3 > width ? 1 : (f3 == width ? 0 : -1));
                    paint = this.n0;
                    if (i >= 0) {
                        break;
                    }
                    if (Math.abs(f3 - f) > 4.0f) {
                        canvas.drawLine(f3, RecyclerView.B1, f3, height, paint);
                    }
                    f3 += K;
                }
                for (float f4 = K; f4 < height; f4 += K) {
                    if (Math.abs(f4 - f2) > 4.0f) {
                        canvas.drawLine(RecyclerView.B1, f4, width, f4, paint);
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i > 0 && i2 > 0) {
            if (i != i3 || i2 != i4) {
                p();
            }
        }
    }

    public final void p() {
        if (getWidth() > 0 && getHeight() > 0) {
            ArrayList h = h();
            fo2 fo2Var = this.k0;
            if (fo2Var != null) {
                fo2Var.e(h, Integer.valueOf(getWidth()), Integer.valueOf(getHeight()));
            }
        }
    }

    public final boolean q(nj3 nj3Var, float f) {
        zj3 zj3Var = getViews().get(nj3Var);
        if (zj3Var == null) {
            return false;
        }
        View view = zj3Var.a;
        float width = view.getWidth();
        float minComponentSize = getMinComponentSize();
        if (width < minComponentSize) {
            width = minComponentSize;
        }
        float height = view.getHeight();
        float minComponentSize2 = getMinComponentSize();
        if (height < minComponentSize2) {
            height = minComponentSize2;
        }
        float f2 = width / height;
        float min = Math.min(getWidth(), getHeight()) - getMinComponentSize();
        if (min < 1.0f) {
            min = 1.0f;
        }
        float minComponentSize3 = (min * f) + getMinComponentSize();
        float minComponentSize4 = getMinComponentSize();
        if (minComponentSize3 < minComponentSize4) {
            minComponentSize3 = minComponentSize4;
        }
        return r(nj3Var, gi2.p((gi2.p(f2 * minComponentSize3, getMinComponentSize(), getWidth() - getMinComponentSize()) - getMinComponentSize()) / (getWidth() - getMinComponentSize()), RecyclerView.B1, 1.0f), gi2.p((minComponentSize3 - getMinComponentSize()) / (getHeight() - getMinComponentSize()), RecyclerView.B1, 1.0f));
    }

    public final boolean r(nj3 nj3Var, float f, float f2) {
        zj3 zj3Var = getViews().get(nj3Var);
        if (zj3Var == null) {
            return false;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        a aVar = a.TOP_LEFT;
        linkedHashMap.put(aVar, Double.valueOf(Math.pow(zj3Var.a().b, 2.0d) + Math.pow(zj3Var.a().a, 2.0d)));
        a aVar2 = a.TOP_RIGHT;
        int width = getWidth();
        int i = zj3Var.a().a;
        View view = zj3Var.a;
        linkedHashMap.put(aVar2, Double.valueOf(Math.pow(zj3Var.a().b, 2.0d) + Math.pow(width - (view.getWidth() + i), 2.0d)));
        linkedHashMap.put(a.BOTTOM_LEFT, Double.valueOf(Math.pow(getHeight() - (view.getHeight() + zj3Var.a().b), 2.0d) + Math.pow(zj3Var.a().a, 2.0d)));
        linkedHashMap.put(a.BOTTOM_RIGHT, Double.valueOf(Math.pow(getHeight() - (view.getHeight() + zj3Var.a().b), 2.0d) + Math.pow(getWidth() - (view.getWidth() + zj3Var.a().a), 2.0d)));
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
        return s(nj3Var, f, f2, aVar);
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
    */
    public final boolean s(nj3 nj3Var, float f, float f2, a aVar) {
        int width;
        int height;
        int height2;
        ViewGroup.LayoutParams layoutParams;
        zj3 zj3Var = getViews().get(nj3Var);
        if (zj3Var == null) {
            return false;
        }
        View view = zj3Var.a;
        int E = u24.E(((getWidth() - getMinComponentSize()) * f) + getMinComponentSize());
        int E2 = u24.E(((getHeight() - getMinComponentSize()) * f2) + getMinComponentSize());
        my4 a2 = zj3Var.a();
        if (aVar == a.TOP_LEFT) {
            width = a2.a;
            height = a2.b;
            if (width + E > getWidth()) {
                width = getWidth() - E;
            }
            if (height + E2 > getHeight()) {
                height2 = getHeight();
                height = height2 - E2;
            }
            layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                layoutParams2.width = E;
                layoutParams2.height = E2;
                layoutParams2.leftMargin = width;
                layoutParams2.topMargin = height;
                view.setLayoutParams(layoutParams2);
                this.j0 = true;
                p();
                return true;
            }
            u34.x("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            return false;
        }
        if (aVar == a.TOP_RIGHT) {
            int width2 = (view.getWidth() + a2.a) - E;
            height = a2.b;
            if (width2 < 0) {
                width = 0;
            } else {
                width = width2;
            }
            if (height + E2 > getHeight()) {
                height2 = getHeight();
                height = height2 - E2;
            }
        } else {
            a aVar2 = a.BOTTOM_LEFT;
            int i = a2.a;
            if (aVar == aVar2) {
                height = (view.getHeight() + a2.b) - E2;
                if (i + E > getWidth()) {
                    width = getWidth() - E;
                } else {
                    width = i;
                }
            } else {
                width = (view.getWidth() + i) - E;
                height = (view.getHeight() + a2.b) - E2;
                if (width < 0) {
                    width = 0;
                }
            }
        }
        layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
        }
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.e0 = onClickListener;
    }

    public final void setOnLayoutChangedListener(fo2 fo2Var) {
        this.k0 = fo2Var;
    }

    public final void setOnViewDeselectedListener(qn2 qn2Var) {
        qn2Var.getClass();
        this.d0 = qn2Var;
    }

    public final void setOnViewPositionEditRequestedListener(qn2 qn2Var) {
        this.l0 = qn2Var;
    }

    public final void setOnViewSelectedListener(io2 io2Var) {
        io2Var.getClass();
        this.R = io2Var;
    }

    public final void setSafeAreaInsets(Rect rect) {
        rect.getClass();
        this.m0 = rect;
        invalidate();
    }

    public final void setSelectedScreenOnTop(boolean z) {
        zj3 zj3Var = this.h0;
        if (zj3Var != null) {
            zj3Var.d = z;
            zj3 zj3Var2 = getViews().get(nj3.TOP_SCREEN);
            zj3 zj3Var3 = getViews().get(nj3.BOTTOM_SCREEN);
            if (zj3Var2 != null) {
                View view = zj3Var2.a;
                if (zj3Var3 != null) {
                    View view2 = zj3Var3.a;
                    removeView(view);
                    removeView(view2);
                    if (zj3Var2.d) {
                        addView(view2, 0);
                        addView(view, 0);
                    } else if (zj3Var3.d) {
                        addView(view, 0);
                        addView(view2, 0);
                    } else {
                        addView(view2, 0);
                        addView(view, 0);
                    }
                }
            }
            this.j0 = true;
            p();
        }
    }

    public final void setSelectedViewAlpha(float f) {
        zj3 zj3Var = this.h0;
        if (zj3Var != null) {
            zj3Var.c = f;
            zj3Var.a.setAlpha(f);
            this.j0 = true;
            p();
        }
    }

    public final void t(float f) {
        zj3 zj3Var = this.h0;
        if (zj3Var == null) {
            return;
        }
        View view = zj3Var.a;
        float width = view.getWidth();
        float minComponentSize = getMinComponentSize();
        if (width < minComponentSize) {
            width = minComponentSize;
        }
        float height = view.getHeight();
        float minComponentSize2 = getMinComponentSize();
        if (height < minComponentSize2) {
            height = minComponentSize2;
        }
        float f2 = width / height;
        float min = Math.min(getWidth(), getHeight()) - getMinComponentSize();
        if (min < 1.0f) {
            min = 1.0f;
        }
        float minComponentSize3 = (min * f) + getMinComponentSize();
        float minComponentSize4 = getMinComponentSize();
        if (minComponentSize3 < minComponentSize4) {
            minComponentSize3 = minComponentSize4;
        }
        u(gi2.p((gi2.p(f2 * minComponentSize3, getMinComponentSize(), getWidth() - getMinComponentSize()) - getMinComponentSize()) / (getWidth() - getMinComponentSize()), RecyclerView.B1, 1.0f), gi2.p((minComponentSize3 - getMinComponentSize()) / (getHeight() - getMinComponentSize()), RecyclerView.B1, 1.0f));
    }

    public final void u(float f, float f2) {
        zj3 zj3Var = this.h0;
        if (zj3Var == null) {
            return;
        }
        s(zj3Var.b, f, f2, this.i0);
    }

    public final void v(zj3 zj3Var) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        a aVar = a.TOP_LEFT;
        linkedHashMap.put(aVar, Double.valueOf(Math.pow(zj3Var.a().b, 2.0d) + Math.pow(zj3Var.a().a, 2.0d)));
        a aVar2 = a.TOP_RIGHT;
        int width = getWidth();
        int i = zj3Var.a().a;
        View view = zj3Var.a;
        linkedHashMap.put(aVar2, Double.valueOf(Math.pow(zj3Var.a().b, 2.0d) + Math.pow(width - (view.getWidth() + i), 2.0d)));
        linkedHashMap.put(a.BOTTOM_LEFT, Double.valueOf(Math.pow(getHeight() - (view.getHeight() + zj3Var.a().b), 2.0d) + Math.pow(zj3Var.a().a, 2.0d)));
        linkedHashMap.put(a.BOTTOM_RIGHT, Double.valueOf(Math.pow(getHeight() - (view.getHeight() + zj3Var.a().b), 2.0d) + Math.pow(getWidth() - (view.getWidth() + zj3Var.a().a), 2.0d)));
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
        this.i0 = aVar;
        this.h0 = zj3Var;
        float width2 = (view.getWidth() - getMinComponentSize()) / (getWidth() - getMinComponentSize());
        float height = (view.getHeight() - getMinComponentSize()) / (getHeight() - getMinComponentSize());
        io2 io2Var = this.R;
        if (io2Var != null) {
            io2Var.n(zj3Var, Float.valueOf(width2), Float.valueOf(height), Integer.valueOf(getWidth()), Integer.valueOf(getHeight()), Integer.valueOf(getMinComponentSize()));
        }
    }
}
