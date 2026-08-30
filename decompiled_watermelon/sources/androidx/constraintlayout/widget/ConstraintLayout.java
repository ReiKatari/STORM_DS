package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.preference.Preference;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {
    public static o56 n0;
    public final SparseArray A;
    public final ArrayList B;
    public final hz0 L;
    public int R;
    public int c0;
    public int d0;
    public int e0;
    public boolean f0;
    public int g0;
    public uy0 h0;
    public ny0 i0;
    public int j0;
    public HashMap k0;
    public final SparseArray l0;
    public final ky0 m0;

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A = new SparseArray();
        this.B = new ArrayList(4);
        this.L = new hz0();
        this.R = 0;
        this.c0 = 0;
        this.d0 = Preference.DEFAULT_ORDER;
        this.e0 = Preference.DEFAULT_ORDER;
        this.f0 = true;
        this.g0 = 257;
        this.h0 = null;
        this.i0 = null;
        this.j0 = -1;
        this.k0 = new HashMap();
        this.l0 = new SparseArray();
        this.m0 = new ky0(this, this);
        i(attributeSet, 0);
    }

    private int getPaddingWidth() {
        int max = Math.max(0, getPaddingRight()) + Math.max(0, getPaddingLeft());
        int max2 = Math.max(0, getPaddingEnd()) + Math.max(0, getPaddingStart());
        if (max2 > 0) {
            return max2;
        }
        return max;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [o56, java.lang.Object] */
    public static o56 getSharedValues() {
        if (n0 == null) {
            ?? obj = new Object();
            new SparseIntArray();
            obj.a = new HashMap();
            n0 = obj;
        }
        return n0;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof jy0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList arrayList = this.B;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i = 0; i < size; i++) {
                ((gy0) arrayList.get(i)).getClass();
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            float width = getWidth();
            float height = getHeight();
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] split = ((String) tag).split(",");
                    if (split.length == 4) {
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        int parseInt3 = Integer.parseInt(split[2]);
                        int i3 = (int) ((parseInt / 1080.0f) * width);
                        int i4 = (int) ((parseInt2 / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f = i3;
                        float f2 = i4;
                        float f3 = i3 + ((int) ((parseInt3 / 1080.0f) * width));
                        canvas.drawLine(f, f2, f3, f2, paint);
                        float parseInt4 = i4 + ((int) ((Integer.parseInt(split[3]) / 1920.0f) * height));
                        canvas.drawLine(f3, f2, f3, parseInt4, paint);
                        canvas.drawLine(f3, parseInt4, f, parseInt4, paint);
                        canvas.drawLine(f, parseInt4, f, f2, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f, f2, f3, parseInt4, paint);
                        canvas.drawLine(f, parseInt4, f3, f2, paint);
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public final void forceLayout() {
        this.f0 = true;
        super.forceLayout();
    }

    /* JADX WARN: Removed duplicated region for block: B:75:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0181  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:148:0x02a9 -> B:149:0x02aa). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(boolean r15, android.view.View r16, defpackage.gz0 r17, defpackage.jy0 r18, android.util.SparseArray r19) {
        /*
            Method dump skipped, instructions count: 790
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.g(boolean, android.view.View, gz0, jy0, android.util.SparseArray):void");
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new jy0();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [jy0, android.view.ViewGroup$LayoutParams, android.view.ViewGroup$MarginLayoutParams, java.lang.Object] */
    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        ?? marginLayoutParams = new ViewGroup.MarginLayoutParams(context, attributeSet);
        marginLayoutParams.a = -1;
        marginLayoutParams.b = -1;
        marginLayoutParams.c = -1.0f;
        marginLayoutParams.d = true;
        marginLayoutParams.e = -1;
        marginLayoutParams.f = -1;
        marginLayoutParams.g = -1;
        marginLayoutParams.h = -1;
        marginLayoutParams.i = -1;
        marginLayoutParams.j = -1;
        marginLayoutParams.k = -1;
        marginLayoutParams.l = -1;
        marginLayoutParams.m = -1;
        marginLayoutParams.n = -1;
        marginLayoutParams.o = -1;
        marginLayoutParams.p = -1;
        marginLayoutParams.q = 0;
        marginLayoutParams.r = RecyclerView.A1;
        marginLayoutParams.s = -1;
        marginLayoutParams.t = -1;
        marginLayoutParams.u = -1;
        marginLayoutParams.v = -1;
        marginLayoutParams.w = Integer.MIN_VALUE;
        marginLayoutParams.x = Integer.MIN_VALUE;
        marginLayoutParams.y = Integer.MIN_VALUE;
        marginLayoutParams.z = Integer.MIN_VALUE;
        marginLayoutParams.A = Integer.MIN_VALUE;
        marginLayoutParams.B = Integer.MIN_VALUE;
        marginLayoutParams.C = Integer.MIN_VALUE;
        marginLayoutParams.D = 0;
        marginLayoutParams.E = 0.5f;
        marginLayoutParams.F = 0.5f;
        marginLayoutParams.G = null;
        marginLayoutParams.H = -1.0f;
        marginLayoutParams.I = -1.0f;
        marginLayoutParams.J = 0;
        marginLayoutParams.K = 0;
        marginLayoutParams.L = 0;
        marginLayoutParams.M = 0;
        marginLayoutParams.N = 0;
        marginLayoutParams.O = 0;
        marginLayoutParams.P = 0;
        marginLayoutParams.Q = 0;
        marginLayoutParams.R = 1.0f;
        marginLayoutParams.S = 1.0f;
        marginLayoutParams.T = -1;
        marginLayoutParams.U = -1;
        marginLayoutParams.V = -1;
        marginLayoutParams.W = false;
        marginLayoutParams.X = false;
        marginLayoutParams.Y = null;
        marginLayoutParams.Z = 0;
        marginLayoutParams.a0 = true;
        marginLayoutParams.b0 = true;
        marginLayoutParams.c0 = false;
        marginLayoutParams.d0 = false;
        marginLayoutParams.e0 = false;
        marginLayoutParams.f0 = -1;
        marginLayoutParams.g0 = -1;
        marginLayoutParams.h0 = -1;
        marginLayoutParams.i0 = -1;
        marginLayoutParams.j0 = Integer.MIN_VALUE;
        marginLayoutParams.k0 = Integer.MIN_VALUE;
        marginLayoutParams.l0 = 0.5f;
        marginLayoutParams.p0 = new gz0();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, tx4.b);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            int i2 = iy0.a.get(index);
            switch (i2) {
                case 1:
                    marginLayoutParams.V = obtainStyledAttributes.getInt(index, marginLayoutParams.V);
                    break;
                case 2:
                    int resourceId = obtainStyledAttributes.getResourceId(index, marginLayoutParams.p);
                    marginLayoutParams.p = resourceId;
                    if (resourceId == -1) {
                        marginLayoutParams.p = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    marginLayoutParams.q = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.q);
                    break;
                case 4:
                    float f = obtainStyledAttributes.getFloat(index, marginLayoutParams.r) % 360.0f;
                    marginLayoutParams.r = f;
                    if (f < RecyclerView.A1) {
                        marginLayoutParams.r = (360.0f - f) % 360.0f;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    marginLayoutParams.a = obtainStyledAttributes.getDimensionPixelOffset(index, marginLayoutParams.a);
                    break;
                case ig7.b /* 6 */:
                    marginLayoutParams.b = obtainStyledAttributes.getDimensionPixelOffset(index, marginLayoutParams.b);
                    break;
                case 7:
                    marginLayoutParams.c = obtainStyledAttributes.getFloat(index, marginLayoutParams.c);
                    break;
                case 8:
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.e);
                    marginLayoutParams.e = resourceId2;
                    if (resourceId2 == -1) {
                        marginLayoutParams.e = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    int resourceId3 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.f);
                    marginLayoutParams.f = resourceId3;
                    if (resourceId3 == -1) {
                        marginLayoutParams.f = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 10:
                    int resourceId4 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.g);
                    marginLayoutParams.g = resourceId4;
                    if (resourceId4 == -1) {
                        marginLayoutParams.g = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    int resourceId5 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.h);
                    marginLayoutParams.h = resourceId5;
                    if (resourceId5 == -1) {
                        marginLayoutParams.h = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case mj2.L /* 12 */:
                    int resourceId6 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.i);
                    marginLayoutParams.i = resourceId6;
                    if (resourceId6 == -1) {
                        marginLayoutParams.i = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    int resourceId7 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.j);
                    marginLayoutParams.j = resourceId7;
                    if (resourceId7 == -1) {
                        marginLayoutParams.j = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    int resourceId8 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.k);
                    marginLayoutParams.k = resourceId8;
                    if (resourceId8 == -1) {
                        marginLayoutParams.k = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case ig7.e /* 15 */:
                    int resourceId9 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.l);
                    marginLayoutParams.l = resourceId9;
                    if (resourceId9 == -1) {
                        marginLayoutParams.l = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    int resourceId10 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.m);
                    marginLayoutParams.m = resourceId10;
                    if (resourceId10 == -1) {
                        marginLayoutParams.m = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    int resourceId11 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.s);
                    marginLayoutParams.s = resourceId11;
                    if (resourceId11 == -1) {
                        marginLayoutParams.s = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 18:
                    int resourceId12 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.t);
                    marginLayoutParams.t = resourceId12;
                    if (resourceId12 == -1) {
                        marginLayoutParams.t = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 19:
                    int resourceId13 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.u);
                    marginLayoutParams.u = resourceId13;
                    if (resourceId13 == -1) {
                        marginLayoutParams.u = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 20:
                    int resourceId14 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.v);
                    marginLayoutParams.v = resourceId14;
                    if (resourceId14 == -1) {
                        marginLayoutParams.v = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 21:
                    marginLayoutParams.w = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.w);
                    break;
                case 22:
                    marginLayoutParams.x = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.x);
                    break;
                case 23:
                    marginLayoutParams.y = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.y);
                    break;
                case 24:
                    marginLayoutParams.z = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.z);
                    break;
                case 25:
                    marginLayoutParams.A = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.A);
                    break;
                case 26:
                    marginLayoutParams.B = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.B);
                    break;
                case 27:
                    marginLayoutParams.W = obtainStyledAttributes.getBoolean(index, marginLayoutParams.W);
                    break;
                case 28:
                    marginLayoutParams.X = obtainStyledAttributes.getBoolean(index, marginLayoutParams.X);
                    break;
                case 29:
                    marginLayoutParams.E = obtainStyledAttributes.getFloat(index, marginLayoutParams.E);
                    break;
                case 30:
                    marginLayoutParams.F = obtainStyledAttributes.getFloat(index, marginLayoutParams.F);
                    break;
                case 31:
                    int i3 = obtainStyledAttributes.getInt(index, 0);
                    marginLayoutParams.L = i3;
                    if (i3 == 1) {
                        Log.e("ConstraintLayout", "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                        break;
                    } else {
                        break;
                    }
                case 32:
                    int i4 = obtainStyledAttributes.getInt(index, 0);
                    marginLayoutParams.M = i4;
                    if (i4 == 1) {
                        Log.e("ConstraintLayout", "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                        break;
                    } else {
                        break;
                    }
                case 33:
                    try {
                        marginLayoutParams.N = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.N);
                        break;
                    } catch (Exception unused) {
                        if (obtainStyledAttributes.getInt(index, marginLayoutParams.N) == -2) {
                            marginLayoutParams.N = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 34:
                    try {
                        marginLayoutParams.P = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.P);
                        break;
                    } catch (Exception unused2) {
                        if (obtainStyledAttributes.getInt(index, marginLayoutParams.P) == -2) {
                            marginLayoutParams.P = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 35:
                    marginLayoutParams.R = Math.max((float) RecyclerView.A1, obtainStyledAttributes.getFloat(index, marginLayoutParams.R));
                    marginLayoutParams.L = 2;
                    break;
                case 36:
                    try {
                        marginLayoutParams.O = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.O);
                        break;
                    } catch (Exception unused3) {
                        if (obtainStyledAttributes.getInt(index, marginLayoutParams.O) == -2) {
                            marginLayoutParams.O = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 37:
                    try {
                        marginLayoutParams.Q = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.Q);
                        break;
                    } catch (Exception unused4) {
                        if (obtainStyledAttributes.getInt(index, marginLayoutParams.Q) == -2) {
                            marginLayoutParams.Q = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 38:
                    marginLayoutParams.S = Math.max((float) RecyclerView.A1, obtainStyledAttributes.getFloat(index, marginLayoutParams.S));
                    marginLayoutParams.M = 2;
                    break;
                default:
                    switch (i2) {
                        case 44:
                            uy0.n(marginLayoutParams, obtainStyledAttributes.getString(index));
                            continue;
                        case 45:
                            marginLayoutParams.H = obtainStyledAttributes.getFloat(index, marginLayoutParams.H);
                            continue;
                        case 46:
                            marginLayoutParams.I = obtainStyledAttributes.getFloat(index, marginLayoutParams.I);
                            continue;
                        case 47:
                            marginLayoutParams.J = obtainStyledAttributes.getInt(index, 0);
                            continue;
                        case 48:
                            marginLayoutParams.K = obtainStyledAttributes.getInt(index, 0);
                            continue;
                        case 49:
                            marginLayoutParams.T = obtainStyledAttributes.getDimensionPixelOffset(index, marginLayoutParams.T);
                            continue;
                        case 50:
                            marginLayoutParams.U = obtainStyledAttributes.getDimensionPixelOffset(index, marginLayoutParams.U);
                            continue;
                        case 51:
                            marginLayoutParams.Y = obtainStyledAttributes.getString(index);
                            continue;
                        case 52:
                            int resourceId15 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.n);
                            marginLayoutParams.n = resourceId15;
                            if (resourceId15 == -1) {
                                marginLayoutParams.n = obtainStyledAttributes.getInt(index, -1);
                                break;
                            } else {
                                continue;
                            }
                        case 53:
                            int resourceId16 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.o);
                            marginLayoutParams.o = resourceId16;
                            if (resourceId16 == -1) {
                                marginLayoutParams.o = obtainStyledAttributes.getInt(index, -1);
                                break;
                            } else {
                                continue;
                            }
                        case 54:
                            marginLayoutParams.D = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.D);
                            continue;
                        case 55:
                            marginLayoutParams.C = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.C);
                            continue;
                        default:
                            switch (i2) {
                                case 64:
                                    uy0.m(marginLayoutParams, obtainStyledAttributes, index, 0);
                                    continue;
                                case 65:
                                    uy0.m(marginLayoutParams, obtainStyledAttributes, index, 1);
                                    continue;
                                case 66:
                                    marginLayoutParams.Z = obtainStyledAttributes.getInt(index, marginLayoutParams.Z);
                                    continue;
                                case 67:
                                    marginLayoutParams.d = obtainStyledAttributes.getBoolean(index, marginLayoutParams.d);
                                    continue;
                                    continue;
                            }
                    }
            }
        }
        obtainStyledAttributes.recycle();
        marginLayoutParams.a();
        return marginLayoutParams;
    }

    public int getMaxHeight() {
        return this.e0;
    }

    public int getMaxWidth() {
        return this.d0;
    }

    public int getMinHeight() {
        return this.c0;
    }

    public int getMinWidth() {
        return this.R;
    }

    public int getOptimizationLevel() {
        return this.L.G0;
    }

    public String getSceneString() {
        int id;
        StringBuilder sb = new StringBuilder();
        hz0 hz0Var = this.L;
        if (hz0Var.j == null) {
            int id2 = getId();
            if (id2 != -1) {
                hz0Var.j = getContext().getResources().getResourceEntryName(id2);
            } else {
                hz0Var.j = "parent";
            }
        }
        if (hz0Var.j0 == null) {
            hz0Var.j0 = hz0Var.j;
            Log.v("ConstraintLayout", " setDebugName " + hz0Var.j0);
        }
        ArrayList arrayList = hz0Var.t0;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            gz0 gz0Var = (gz0) obj;
            View view = gz0Var.g0;
            if (view != null) {
                if (gz0Var.j == null && (id = view.getId()) != -1) {
                    gz0Var.j = getContext().getResources().getResourceEntryName(id);
                }
                if (gz0Var.j0 == null) {
                    gz0Var.j0 = gz0Var.j;
                    Log.v("ConstraintLayout", " setDebugName " + gz0Var.j0);
                }
            }
        }
        hz0Var.o(sb);
        return sb.toString();
    }

    public final gz0 h(View view) {
        if (view == this) {
            return this.L;
        }
        if (view != null) {
            if (view.getLayoutParams() instanceof jy0) {
                return ((jy0) view.getLayoutParams()).p0;
            }
            view.setLayoutParams(generateLayoutParams(view.getLayoutParams()));
            if (view.getLayoutParams() instanceof jy0) {
                return ((jy0) view.getLayoutParams()).p0;
            }
            return null;
        }
        return null;
    }

    public final void i(AttributeSet attributeSet, int i) {
        hz0 hz0Var = this.L;
        hz0Var.g0 = this;
        ky0 ky0Var = this.m0;
        hz0Var.x0 = ky0Var;
        hz0Var.v0.h = ky0Var;
        this.A.put(getId(), this);
        this.h0 = null;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, tx4.b, i, 0);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                if (index == 16) {
                    this.R = obtainStyledAttributes.getDimensionPixelOffset(index, this.R);
                } else if (index == 17) {
                    this.c0 = obtainStyledAttributes.getDimensionPixelOffset(index, this.c0);
                } else if (index == 14) {
                    this.d0 = obtainStyledAttributes.getDimensionPixelOffset(index, this.d0);
                } else if (index == 15) {
                    this.e0 = obtainStyledAttributes.getDimensionPixelOffset(index, this.e0);
                } else if (index == 113) {
                    this.g0 = obtainStyledAttributes.getInt(index, this.g0);
                } else if (index == 56) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            k(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.i0 = null;
                        }
                    }
                } else if (index == 34) {
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, 0);
                    try {
                        uy0 uy0Var = new uy0();
                        this.h0 = uy0Var;
                        uy0Var.j(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.h0 = null;
                    }
                    this.j0 = resourceId2;
                }
            }
            obtainStyledAttributes.recycle();
        }
        hz0Var.G0 = this.g0;
        ho3.q = hz0Var.X(512);
    }

    public final boolean j() {
        if ((getContext().getApplicationInfo().flags & 4194304) != 0 && 1 == getLayoutDirection()) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0087, code lost:
        continue;
     */
    /* JADX WARN: Type inference failed for: r0v0, types: [ny0, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void k(int r9) {
        /*
            r8 = this;
            ny0 r0 = new ny0
            android.content.Context r1 = r8.getContext()
            r0.<init>()
            r2 = -1
            r0.a = r2
            r0.b = r2
            android.util.SparseArray r2 = new android.util.SparseArray
            r2.<init>()
            r0.d = r2
            android.util.SparseArray r2 = new android.util.SparseArray
            r2.<init>()
            r0.e = r2
            r0.c = r8
            java.lang.String r2 = "Error parsing resource: "
            java.lang.String r3 = "ConstraintLayoutStates"
            android.content.res.Resources r4 = r1.getResources()
            android.content.res.XmlResourceParser r4 = r4.getXml(r9)
            int r5 = r4.getEventType()     // Catch: java.io.IOException -> L57 org.xmlpull.v1.XmlPullParserException -> L59
            r6 = 0
        L2f:
            r7 = 1
            if (r5 == r7) goto Lab
            r7 = 2
            if (r5 == r7) goto L36
            goto L87
        L36:
            java.lang.String r5 = r4.getName()     // Catch: java.io.IOException -> L57 org.xmlpull.v1.XmlPullParserException -> L59
            int r7 = r5.hashCode()     // Catch: java.io.IOException -> L57 org.xmlpull.v1.XmlPullParserException -> L59
            switch(r7) {
                case -1349929691: goto L7c;
                case 80204913: goto L64;
                case 1382829617: goto L5e;
                case 1657696882: goto L5b;
                case 1901439077: goto L42;
                default: goto L41;
            }     // Catch: java.io.IOException -> L57 org.xmlpull.v1.XmlPullParserException -> L59
        L41:
            goto L87
        L42:
            java.lang.String r7 = "Variant"
            boolean r5 = r5.equals(r7)     // Catch: java.io.IOException -> L57 org.xmlpull.v1.XmlPullParserException -> L59
            if (r5 == 0) goto L87
            my0 r5 = new my0     // Catch: java.io.IOException -> L57 org.xmlpull.v1.XmlPullParserException -> L59
            r5.<init>(r1, r4)     // Catch: java.io.IOException -> L57 org.xmlpull.v1.XmlPullParserException -> L59
            if (r6 == 0) goto L87
            java.util.ArrayList r7 = r6.b     // Catch: java.io.IOException -> L57 org.xmlpull.v1.XmlPullParserException -> L59
            r7.add(r5)     // Catch: java.io.IOException -> L57 org.xmlpull.v1.XmlPullParserException -> L59
            goto L87
        L57:
            r1 = move-exception
            goto L8c
        L59:
            r1 = move-exception
            goto L9c
        L5b:
            java.lang.String r7 = "layoutDescription"
            goto L60
        L5e:
            java.lang.String r7 = "StateSet"
        L60:
            r5.equals(r7)     // Catch: java.io.IOException -> L57 org.xmlpull.v1.XmlPullParserException -> L59
            goto L87
        L64:
            java.lang.String r7 = "State"
            boolean r5 = r5.equals(r7)     // Catch: java.io.IOException -> L57 org.xmlpull.v1.XmlPullParserException -> L59
            if (r5 == 0) goto L87
            ly0 r5 = new ly0     // Catch: java.io.IOException -> L57 org.xmlpull.v1.XmlPullParserException -> L59
            r5.<init>(r1, r4)     // Catch: java.io.IOException -> L57 org.xmlpull.v1.XmlPullParserException -> L59
            java.lang.Cloneable r6 = r0.d     // Catch: java.io.IOException -> L57 org.xmlpull.v1.XmlPullParserException -> L59
            android.util.SparseArray r6 = (android.util.SparseArray) r6     // Catch: java.io.IOException -> L57 org.xmlpull.v1.XmlPullParserException -> L59
            int r7 = r5.a     // Catch: java.io.IOException -> L57 org.xmlpull.v1.XmlPullParserException -> L59
            r6.put(r7, r5)     // Catch: java.io.IOException -> L57 org.xmlpull.v1.XmlPullParserException -> L59
            r6 = r5
            goto L87
        L7c:
            java.lang.String r7 = "ConstraintSet"
            boolean r5 = r5.equals(r7)     // Catch: java.io.IOException -> L57 org.xmlpull.v1.XmlPullParserException -> L59
            if (r5 == 0) goto L87
            r0.b(r1, r4)     // Catch: java.io.IOException -> L57 org.xmlpull.v1.XmlPullParserException -> L59
        L87:
            int r5 = r4.next()     // Catch: java.io.IOException -> L57 org.xmlpull.v1.XmlPullParserException -> L59
            goto L2f
        L8c:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r2)
            r4.append(r9)
            java.lang.String r9 = r4.toString()
            android.util.Log.e(r3, r9, r1)
            goto Lab
        L9c:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r2)
            r4.append(r9)
            java.lang.String r9 = r4.toString()
            android.util.Log.e(r3, r9, r1)
        Lab:
            r8.i0 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.k(int):void");
    }

    public final void l(int i, int i2, int i3, int i4, boolean z, boolean z2) {
        ky0 ky0Var = this.m0;
        int i5 = ky0Var.e;
        int resolveSizeAndState = View.resolveSizeAndState(i3 + ky0Var.d, i, 0);
        int min = Math.min(this.d0, resolveSizeAndState & 16777215);
        int min2 = Math.min(this.e0, View.resolveSizeAndState(i4 + i5, i2, 0) & 16777215);
        if (z) {
            min |= 16777216;
        }
        if (z2) {
            min2 |= 16777216;
        }
        setMeasuredDimension(min, min2);
    }

    public final void m(hz0 hz0Var, int i, int i2, int i3) {
        fz0 fz0Var;
        fz0 fz0Var2;
        int i4;
        int i5;
        int max;
        int i6;
        boolean z;
        int i7;
        boolean z2;
        boolean z3;
        boolean z4;
        ArrayList arrayList;
        ky0 ky0Var;
        int i8;
        boolean z5;
        boolean z6;
        boolean z7;
        int i9;
        ky0 ky0Var2;
        int i10;
        boolean z8;
        boolean z9;
        boolean z10;
        ky0 ky0Var3;
        int i11;
        boolean z11;
        boolean z12;
        ks2 ks2Var;
        m87 m87Var;
        boolean z13;
        int i12;
        int i13;
        boolean z14;
        boolean z15;
        int i14;
        int i15;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i3);
        int max2 = Math.max(0, getPaddingTop());
        int max3 = Math.max(0, getPaddingBottom());
        int i16 = max2 + max3;
        int paddingWidth = getPaddingWidth();
        ky0 ky0Var4 = this.m0;
        ky0Var4.b = max2;
        ky0Var4.c = max3;
        ky0Var4.d = paddingWidth;
        ky0Var4.e = i16;
        ky0Var4.f = i2;
        ky0Var4.g = i3;
        int max4 = Math.max(0, getPaddingStart());
        int max5 = Math.max(0, getPaddingEnd());
        if (max4 <= 0 && max5 <= 0) {
            max4 = Math.max(0, getPaddingLeft());
        } else if (j()) {
            max4 = max5;
        }
        int i17 = size - paddingWidth;
        int i18 = size2 - i16;
        int i19 = ky0Var4.e;
        int i20 = ky0Var4.d;
        fz0 fz0Var3 = fz0.FIXED;
        int childCount = getChildCount();
        if (mode != Integer.MIN_VALUE) {
            if (mode != 0) {
                if (mode != 1073741824) {
                    i5 = 0;
                } else {
                    i5 = Math.min(this.d0 - i20, i17);
                }
                i4 = Integer.MIN_VALUE;
                fz0Var2 = fz0Var3;
            } else {
                fz0Var = fz0.WRAP_CONTENT;
                if (childCount == 0) {
                    max = Math.max(0, this.R);
                    int i21 = max;
                    fz0Var2 = fz0Var;
                    i5 = i21;
                    i4 = Integer.MIN_VALUE;
                } else {
                    i5 = 0;
                    i4 = Integer.MIN_VALUE;
                    fz0Var2 = fz0Var;
                }
            }
        } else {
            fz0Var = fz0.WRAP_CONTENT;
            if (childCount == 0) {
                max = Math.max(0, this.R);
                int i212 = max;
                fz0Var2 = fz0Var;
                i5 = i212;
                i4 = Integer.MIN_VALUE;
            } else {
                fz0Var2 = fz0Var;
                i4 = Integer.MIN_VALUE;
                i5 = i17;
            }
        }
        if (mode2 != i4) {
            if (mode2 != 0) {
                if (mode2 == 1073741824) {
                    i6 = Math.min(this.e0 - i19, i18);
                }
                i6 = 0;
            } else {
                fz0Var3 = fz0.WRAP_CONTENT;
                if (childCount == 0) {
                    i6 = Math.max(0, this.c0);
                }
                i6 = 0;
            }
        } else {
            fz0Var3 = fz0.WRAP_CONTENT;
            if (childCount == 0) {
                i6 = Math.max(0, this.c0);
            } else {
                i6 = i18;
            }
        }
        int r = hz0Var.r();
        wd1 wd1Var = hz0Var.v0;
        if (i5 != r || i6 != hz0Var.l()) {
            wd1Var.c = true;
        }
        hz0Var.Z = 0;
        hz0Var.a0 = 0;
        int[] iArr = hz0Var.C;
        iArr[0] = this.d0 - i20;
        iArr[1] = this.e0 - i19;
        hz0Var.c0 = 0;
        hz0Var.d0 = 0;
        hz0Var.N(fz0Var2);
        hz0Var.P(i5);
        hz0Var.O(fz0Var3);
        hz0Var.M(i6);
        int i22 = this.R - i20;
        if (i22 < 0) {
            hz0Var.c0 = 0;
        } else {
            hz0Var.c0 = i22;
        }
        int i23 = this.c0 - i19;
        if (i23 < 0) {
            hz0Var.d0 = 0;
        } else {
            hz0Var.d0 = i23;
        }
        hz0Var.A0 = max4;
        hz0Var.B0 = max2;
        os osVar = hz0Var.u0;
        hz0 hz0Var2 = (hz0) osVar.R;
        ArrayList arrayList2 = (ArrayList) osVar.B;
        ky0 ky0Var5 = hz0Var.x0;
        int size3 = hz0Var.t0.size();
        int r2 = hz0Var.r();
        int l = hz0Var.l();
        boolean B = a53.B(i, 128);
        if (!B && !a53.B(i, 64)) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            int i24 = 0;
            while (i24 < size3) {
                boolean z20 = z;
                gz0 gz0Var = (gz0) hz0Var.t0.get(i24);
                i7 = size3;
                fz0[] fz0VarArr = gz0Var.T;
                fz0 fz0Var4 = fz0VarArr[0];
                int i25 = i24;
                fz0 fz0Var5 = fz0.MATCH_CONSTRAINT;
                if (fz0Var4 == fz0Var5) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                if (fz0VarArr[1] == fz0Var5) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                if (z17 && z18 && gz0Var.X > RecyclerView.A1) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                if ((gz0Var.y() && z19) || ((gz0Var.z() && z19) || (gz0Var instanceof pc7) || gz0Var.y() || gz0Var.z())) {
                    z2 = false;
                    break;
                }
                i24 = i25 + 1;
                z = z20;
                size3 = i7;
            }
        }
        i7 = size3;
        z2 = z;
        if ((mode == 1073741824 && mode2 == 1073741824) || B) {
            z3 = true;
        } else {
            z3 = false;
        }
        boolean z21 = z2 & z3;
        if (z21) {
            int min = Math.min(hz0Var.C[0], i17);
            int min2 = Math.min(hz0Var.C[1], i18);
            if (mode == 1073741824 && hz0Var.r() != min) {
                hz0Var.P(min);
                z13 = true;
                wd1Var.b = true;
            } else {
                z13 = true;
            }
            if (mode2 == 1073741824 && hz0Var.l() != min2) {
                hz0Var.M(min2);
                wd1Var.b = z13;
            }
            if (mode == 1073741824 && mode2 == 1073741824) {
                ArrayList arrayList3 = (ArrayList) wd1Var.f;
                hz0 hz0Var3 = (hz0) wd1Var.d;
                if (!wd1Var.b && !wd1Var.c) {
                    z4 = z21;
                    i14 = 0;
                } else {
                    ArrayList arrayList4 = hz0Var3.t0;
                    int size4 = arrayList4.size();
                    z4 = z21;
                    int i26 = 0;
                    while (i26 < size4) {
                        Object obj = arrayList4.get(i26);
                        int i27 = i26 + 1;
                        gz0 gz0Var2 = (gz0) obj;
                        gz0Var2.i();
                        gz0Var2.a = false;
                        gz0Var2.d.n();
                        gz0Var2.e.m();
                        arrayList4 = arrayList4;
                        i26 = i27;
                    }
                    hz0Var3.i();
                    i14 = 0;
                    hz0Var3.a = false;
                    hz0Var3.d.n();
                    hz0Var3.e.m();
                    wd1Var.c = false;
                }
                wd1Var.c((hz0) wd1Var.e);
                hz0Var3.Z = i14;
                hz0Var3.a0 = i14;
                fz0 k = hz0Var3.k(i14);
                fz0 k2 = hz0Var3.k(1);
                if (wd1Var.b) {
                    wd1Var.d();
                }
                int s = hz0Var3.s();
                ky0Var = ky0Var5;
                int t = hz0Var3.t();
                arrayList = arrayList2;
                hz0Var3.d.h.d(s);
                hz0Var3.e.h.d(t);
                wd1Var.i();
                fz0 fz0Var6 = fz0.WRAP_CONTENT;
                if (k != fz0Var6 && k2 != fz0Var6) {
                    i15 = t;
                } else {
                    if (B) {
                        int size5 = arrayList3.size();
                        i15 = t;
                        int i28 = 0;
                        while (true) {
                            if (i28 >= size5) {
                                break;
                            }
                            Object obj2 = arrayList3.get(i28);
                            i28++;
                            if (!((be7) obj2).k()) {
                                B = false;
                                break;
                            }
                        }
                    } else {
                        i15 = t;
                    }
                    if (B && k == fz0.WRAP_CONTENT) {
                        hz0Var3.N(fz0.FIXED);
                        hz0Var3.P(wd1Var.e(hz0Var3, 0));
                        hz0Var3.d.e.d(hz0Var3.r());
                    }
                    if (B && k2 == fz0.WRAP_CONTENT) {
                        hz0Var3.O(fz0.FIXED);
                        hz0Var3.M(wd1Var.e(hz0Var3, 1));
                        hz0Var3.e.e.d(hz0Var3.l());
                    }
                }
                fz0 fz0Var7 = hz0Var3.T[0];
                fz0 fz0Var8 = fz0.FIXED;
                if (fz0Var7 != fz0Var8 && fz0Var7 != fz0.MATCH_PARENT) {
                    z16 = false;
                } else {
                    int r3 = hz0Var3.r() + s;
                    hz0Var3.d.i.d(r3);
                    hz0Var3.d.e.d(r3 - s);
                    wd1Var.i();
                    fz0 fz0Var9 = hz0Var3.T[1];
                    if (fz0Var9 == fz0Var8 || fz0Var9 == fz0.MATCH_PARENT) {
                        int l2 = hz0Var3.l() + i15;
                        hz0Var3.e.i.d(l2);
                        hz0Var3.e.e.d(l2 - i15);
                    }
                    wd1Var.i();
                    z16 = true;
                }
                int size6 = arrayList3.size();
                int i29 = 0;
                while (i29 < size6) {
                    Object obj3 = arrayList3.get(i29);
                    i29++;
                    be7 be7Var = (be7) obj3;
                    if (be7Var.b != hz0Var3 || be7Var.g) {
                        be7Var.e();
                    }
                }
                int size7 = arrayList3.size();
                int i30 = 0;
                while (i30 < size7) {
                    Object obj4 = arrayList3.get(i30);
                    i30++;
                    be7 be7Var2 = (be7) obj4;
                    if (z16 || be7Var2.b != hz0Var3) {
                        if (!be7Var2.h.j || ((!be7Var2.i.j && !(be7Var2 instanceof zo2)) || (!be7Var2.e.j && !(be7Var2 instanceof bj0) && !(be7Var2 instanceof zo2)))) {
                            z5 = false;
                            break;
                        }
                    }
                }
                z5 = true;
                hz0Var3.N(k);
                hz0Var3.O(k2);
                i8 = 2;
                i13 = 1073741824;
            } else {
                z4 = z21;
                arrayList = arrayList2;
                ky0Var = ky0Var5;
                hz0 hz0Var4 = (hz0) wd1Var.d;
                if (wd1Var.b) {
                    ArrayList arrayList5 = hz0Var4.t0;
                    int size8 = arrayList5.size();
                    int i31 = 0;
                    while (i31 < size8) {
                        Object obj5 = arrayList5.get(i31);
                        i31++;
                        gz0 gz0Var3 = (gz0) obj5;
                        gz0Var3.i();
                        gz0Var3.a = false;
                        ks2 ks2Var2 = gz0Var3.d;
                        ArrayList arrayList6 = arrayList5;
                        ks2Var2.e.j = false;
                        ks2Var2.g = false;
                        ks2Var2.n();
                        m87 m87Var2 = gz0Var3.e;
                        m87Var2.e.j = false;
                        m87Var2.g = false;
                        m87Var2.m();
                        arrayList5 = arrayList6;
                    }
                    i12 = 0;
                    hz0Var4.i();
                    hz0Var4.a = false;
                    ks2 ks2Var3 = hz0Var4.d;
                    ks2Var3.e.j = false;
                    ks2Var3.g = false;
                    ks2Var3.n();
                    m87 m87Var3 = hz0Var4.e;
                    m87Var3.e.j = false;
                    m87Var3.g = false;
                    m87Var3.m();
                    wd1Var.d();
                } else {
                    i12 = 0;
                }
                wd1Var.c((hz0) wd1Var.e);
                hz0Var4.Z = i12;
                hz0Var4.a0 = i12;
                hz0Var4.d.h.d(i12);
                hz0Var4.e.h.d(i12);
                i13 = 1073741824;
                if (mode == 1073741824) {
                    z5 = hz0Var.U(i12, B);
                    i8 = 1;
                } else {
                    i8 = 0;
                    z5 = true;
                }
                if (mode2 == 1073741824) {
                    z5 &= hz0Var.U(1, B);
                    i8++;
                }
            }
            if (z5) {
                if (mode == i13) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (mode2 == i13) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                hz0Var.Q(z14, z15);
            }
        } else {
            z4 = z21;
            arrayList = arrayList2;
            ky0Var = ky0Var5;
            i8 = 0;
            z5 = false;
        }
        if (z5 && i8 == 2) {
            return;
        }
        int i32 = hz0Var.G0;
        if (i7 > 0) {
            int size9 = hz0Var.t0.size();
            boolean X = hz0Var.X(64);
            ky0 ky0Var6 = hz0Var.x0;
            for (int i33 = 0; i33 < size9; i33++) {
                gz0 gz0Var4 = (gz0) hz0Var.t0.get(i33);
                if (!(gz0Var4 instanceof yo2) && !(gz0Var4 instanceof j00) && !gz0Var4.F && (!X || (ks2Var = gz0Var4.d) == null || (m87Var = gz0Var4.e) == null || !ks2Var.e.j || !m87Var.e.j)) {
                    fz0 k3 = gz0Var4.k(0);
                    fz0 k4 = gz0Var4.k(1);
                    fz0 fz0Var10 = fz0.MATCH_CONSTRAINT;
                    if (k3 == fz0Var10 && gz0Var4.r != 1 && k4 == fz0Var10 && gz0Var4.s != 1) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (!z12 && hz0Var.X(1) && !(gz0Var4 instanceof pc7)) {
                        if (k3 == fz0Var10 && gz0Var4.r == 0 && k4 != fz0Var10 && !gz0Var4.y()) {
                            z12 = true;
                        }
                        if (k4 == fz0Var10 && gz0Var4.s == 0 && k3 != fz0Var10 && !gz0Var4.y()) {
                            z12 = true;
                        }
                        if ((k3 == fz0Var10 || k4 == fz0Var10) && gz0Var4.X > RecyclerView.A1) {
                            z12 = true;
                        }
                    }
                    if (!z12) {
                        osVar.J(0, ky0Var6, gz0Var4);
                    }
                }
            }
            ConstraintLayout constraintLayout = ky0Var6.a;
            int childCount2 = constraintLayout.getChildCount();
            ArrayList arrayList7 = constraintLayout.B;
            for (int i34 = 0; i34 < childCount2; i34++) {
                constraintLayout.getChildAt(i34);
            }
            int size10 = arrayList7.size();
            if (size10 > 0) {
                for (int i35 = 0; i35 < size10; i35++) {
                    ((gy0) arrayList7.get(i35)).getClass();
                }
            }
        }
        osVar.S(hz0Var);
        int size11 = arrayList.size();
        if (i7 > 0) {
            osVar.R(hz0Var, 0, r2, l);
        }
        if (size11 > 0) {
            fz0[] fz0VarArr2 = hz0Var.T;
            fz0 fz0Var11 = fz0VarArr2[0];
            fz0 fz0Var12 = fz0.WRAP_CONTENT;
            if (fz0Var11 == fz0Var12) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (fz0VarArr2[1] == fz0Var12) {
                z7 = true;
            } else {
                z7 = false;
            }
            int max6 = Math.max(hz0Var.r(), hz0Var2.c0);
            int max7 = Math.max(hz0Var.l(), hz0Var2.d0);
            int i36 = 0;
            boolean z22 = false;
            while (i36 < size11) {
                ArrayList arrayList8 = arrayList;
                gz0 gz0Var5 = (gz0) arrayList8.get(i36);
                if (!(gz0Var5 instanceof pc7)) {
                    z9 = z7;
                    z10 = z6;
                    ky0Var3 = ky0Var;
                } else {
                    int r4 = gz0Var5.r();
                    int l3 = gz0Var5.l();
                    z9 = z7;
                    z10 = z6;
                    ky0Var3 = ky0Var;
                    boolean J = z22 | osVar.J(1, ky0Var3, gz0Var5);
                    int r5 = gz0Var5.r();
                    int l4 = gz0Var5.l();
                    if (r5 != r4) {
                        gz0Var5.P(r5);
                        if (z10 && gz0Var5.s() + gz0Var5.V > max6) {
                            max6 = Math.max(max6, gz0Var5.j(by0.RIGHT).e() + gz0Var5.s() + gz0Var5.V);
                        }
                        i11 = max6;
                        z11 = true;
                    } else {
                        i11 = max6;
                        z11 = J;
                    }
                    if (l4 != l3) {
                        gz0Var5.M(l4);
                        if (z9 && gz0Var5.t() + gz0Var5.W > max7) {
                            max7 = Math.max(max7, gz0Var5.j(by0.BOTTOM).e() + gz0Var5.t() + gz0Var5.W);
                        }
                        z11 = true;
                    }
                    boolean z23 = ((pc7) gz0Var5).B0 | z11;
                    max6 = i11;
                    z22 = z23;
                }
                i36++;
                z6 = z10;
                ky0Var = ky0Var3;
                arrayList = arrayList8;
                z7 = z9;
            }
            boolean z24 = z7;
            boolean z25 = z6;
            ArrayList arrayList9 = arrayList;
            int i37 = 0;
            while (true) {
                ky0 ky0Var7 = ky0Var;
                if (i37 >= 2) {
                    break;
                }
                int i38 = 0;
                while (i38 < size11) {
                    gz0 gz0Var6 = (gz0) arrayList9.get(i38);
                    if (((gz0Var6 instanceof fr2) && !(gz0Var6 instanceof pc7)) || (gz0Var6 instanceof yo2) || gz0Var6.h0 == 8 || ((z4 && gz0Var6.d.e.j && gz0Var6.e.e.j) || (gz0Var6 instanceof pc7))) {
                        i9 = size11;
                        ky0Var2 = ky0Var7;
                        i10 = i37;
                    } else {
                        int r6 = gz0Var6.r();
                        int l5 = gz0Var6.l();
                        i9 = size11;
                        int i39 = gz0Var6.b0;
                        boolean z26 = z22;
                        int i40 = 1;
                        if (i37 == 1) {
                            i40 = 2;
                        }
                        boolean J2 = z26 | osVar.J(i40, ky0Var7, gz0Var6);
                        ky0Var2 = ky0Var7;
                        int r7 = gz0Var6.r();
                        i10 = i37;
                        int l6 = gz0Var6.l();
                        if (r7 != r6) {
                            gz0Var6.P(r7);
                            if (z25 && gz0Var6.s() + gz0Var6.V > max6) {
                                max6 = Math.max(max6, gz0Var6.j(by0.RIGHT).e() + gz0Var6.s() + gz0Var6.V);
                            }
                            z8 = true;
                        } else {
                            z8 = J2;
                        }
                        if (l6 != l5) {
                            gz0Var6.M(l6);
                            if (z24 && gz0Var6.t() + gz0Var6.W > max7) {
                                max7 = Math.max(max7, gz0Var6.j(by0.BOTTOM).e() + gz0Var6.t() + gz0Var6.W);
                            }
                            z8 = true;
                        }
                        if (gz0Var6.E && i39 != gz0Var6.b0) {
                            z22 = true;
                        } else {
                            z22 = z8;
                        }
                    }
                    i38++;
                    size11 = i9;
                    ky0Var7 = ky0Var2;
                    i37 = i10;
                }
                int i41 = size11;
                ky0Var = ky0Var7;
                int i42 = i37;
                if (!z22) {
                    break;
                }
                i37 = i42 + 1;
                osVar.R(hz0Var, i37, r2, l);
                size11 = i41;
                z22 = false;
            }
        }
        hz0Var.G0 = i32;
        ho3.q = hz0Var.X(512);
    }

    public final void n(gz0 gz0Var, jy0 jy0Var, SparseArray sparseArray, int i, by0 by0Var) {
        View view = (View) this.A.get(i);
        gz0 gz0Var2 = (gz0) sparseArray.get(i);
        if (gz0Var2 != null && view != null && (view.getLayoutParams() instanceof jy0)) {
            jy0Var.c0 = true;
            by0 by0Var2 = by0.BASELINE;
            if (by0Var == by0Var2) {
                jy0 jy0Var2 = (jy0) view.getLayoutParams();
                jy0Var2.c0 = true;
                jy0Var2.p0.E = true;
            }
            gz0Var.j(by0Var2).b(gz0Var2.j(by0Var), jy0Var.D, jy0Var.C, true);
            gz0Var.E = true;
            gz0Var.j(by0.TOP).j();
            gz0Var.j(by0.BOTTOM).j();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            jy0 jy0Var = (jy0) childAt.getLayoutParams();
            gz0 gz0Var = jy0Var.p0;
            if (childAt.getVisibility() != 8 || jy0Var.d0 || jy0Var.e0 || isInEditMode) {
                int s = gz0Var.s();
                int t = gz0Var.t();
                childAt.layout(s, t, gz0Var.r() + s, gz0Var.l() + t);
            }
        }
        ArrayList arrayList = this.B;
        int size = arrayList.size();
        if (size > 0) {
            for (int i6 = 0; i6 < size; i6++) {
                ((gy0) arrayList.get(i6)).getClass();
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        boolean z;
        String str;
        int f;
        String resourceName;
        int id;
        gz0 gz0Var;
        String str2;
        boolean z2 = this.f0;
        this.f0 = z2;
        if (!z2) {
            int childCount = getChildCount();
            int i3 = 0;
            while (true) {
                if (i3 >= childCount) {
                    break;
                } else if (getChildAt(i3).isLayoutRequested()) {
                    this.f0 = true;
                    break;
                } else {
                    i3++;
                }
            }
        }
        boolean j = j();
        hz0 hz0Var = this.L;
        hz0Var.y0 = j;
        if (this.f0) {
            this.f0 = false;
            int childCount2 = getChildCount();
            int i4 = 0;
            while (true) {
                if (i4 < childCount2) {
                    if (getChildAt(i4).isLayoutRequested()) {
                        z = true;
                        break;
                    }
                    i4++;
                } else {
                    z = false;
                    break;
                }
            }
            if (z) {
                boolean isInEditMode = isInEditMode();
                int childCount3 = getChildCount();
                for (int i5 = 0; i5 < childCount3; i5++) {
                    gz0 h = h(getChildAt(i5));
                    if (h != null) {
                        h.D();
                    }
                }
                Object obj = null;
                SparseArray sparseArray = this.A;
                if (isInEditMode) {
                    for (int i6 = 0; i6 < childCount3; i6++) {
                        View childAt = getChildAt(i6);
                        try {
                            resourceName = getResources().getResourceName(childAt.getId());
                            Integer valueOf = Integer.valueOf(childAt.getId());
                            if (resourceName != null) {
                                if (this.k0 == null) {
                                    this.k0 = new HashMap();
                                }
                                int indexOf = resourceName.indexOf("/");
                                if (indexOf != -1) {
                                    str2 = resourceName.substring(indexOf + 1);
                                } else {
                                    str2 = resourceName;
                                }
                                this.k0.put(str2, valueOf);
                            }
                            int indexOf2 = resourceName.indexOf(47);
                            if (indexOf2 != -1) {
                                resourceName = resourceName.substring(indexOf2 + 1);
                            }
                            id = childAt.getId();
                        } catch (Resources.NotFoundException unused) {
                        }
                        if (id != 0) {
                            View view = (View) sparseArray.get(id);
                            if (view == null && (view = findViewById(id)) != null && view != this && view.getParent() == this) {
                                onViewAdded(view);
                            }
                            if (view != this) {
                                if (view == null) {
                                    gz0Var = null;
                                } else {
                                    gz0Var = ((jy0) view.getLayoutParams()).p0;
                                }
                                gz0Var.j0 = resourceName;
                            }
                        }
                        gz0Var = hz0Var;
                        gz0Var.j0 = resourceName;
                    }
                }
                if (this.j0 != -1) {
                    for (int i7 = 0; i7 < childCount3; i7++) {
                        getChildAt(i7).getId();
                    }
                }
                uy0 uy0Var = this.h0;
                if (uy0Var != null) {
                    uy0Var.c(this);
                }
                hz0Var.t0.clear();
                ArrayList arrayList = this.B;
                int size = arrayList.size();
                if (size > 0) {
                    int i8 = 0;
                    while (i8 < size) {
                        gy0 gy0Var = (gy0) arrayList.get(i8);
                        HashMap hashMap = gy0Var.e0;
                        if (gy0Var.isInEditMode()) {
                            gy0Var.setIds(gy0Var.c0);
                        }
                        fr2 fr2Var = gy0Var.R;
                        if (fr2Var != null) {
                            fr2Var.u0 = 0;
                            Arrays.fill(fr2Var.t0, obj);
                            for (int i9 = 0; i9 < gy0Var.B; i9++) {
                                int i10 = gy0Var.A[i9];
                                View view2 = (View) sparseArray.get(i10);
                                if (view2 == null && (f = gy0Var.f(this, (str = (String) hashMap.get(Integer.valueOf(i10))))) != 0) {
                                    gy0Var.A[i9] = f;
                                    hashMap.put(Integer.valueOf(f), str);
                                    view2 = (View) sparseArray.get(f);
                                }
                                if (view2 != null) {
                                    gy0Var.R.S(h(view2));
                                }
                            }
                            gy0Var.R.U();
                        }
                        i8++;
                        obj = null;
                    }
                }
                for (int i11 = 0; i11 < childCount3; i11++) {
                    getChildAt(i11);
                }
                SparseArray sparseArray2 = this.l0;
                sparseArray2.clear();
                sparseArray2.put(0, hz0Var);
                sparseArray2.put(getId(), hz0Var);
                for (int i12 = 0; i12 < childCount3; i12++) {
                    View childAt2 = getChildAt(i12);
                    sparseArray2.put(childAt2.getId(), h(childAt2));
                }
                for (int i13 = 0; i13 < childCount3; i13++) {
                    View childAt3 = getChildAt(i13);
                    gz0 h2 = h(childAt3);
                    if (h2 != null) {
                        jy0 jy0Var = (jy0) childAt3.getLayoutParams();
                        hz0Var.t0.add(h2);
                        gz0 gz0Var2 = h2.U;
                        if (gz0Var2 != null) {
                            ((hz0) gz0Var2).t0.remove(h2);
                            h2.D();
                        }
                        h2.U = hz0Var;
                        g(isInEditMode, childAt3, h2, jy0Var, sparseArray2);
                    }
                }
            }
            if (z) {
                hz0Var.u0.S(hz0Var);
            }
        }
        hz0Var.z0.getClass();
        m(hz0Var, this.g0, i, i2);
        l(i, i2, hz0Var.r(), hz0Var.l(), hz0Var.H0, hz0Var.I0);
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        gz0 h = h(view);
        if ((view instanceof xo2) && !(h instanceof yo2)) {
            jy0 jy0Var = (jy0) view.getLayoutParams();
            yo2 yo2Var = new yo2();
            jy0Var.p0 = yo2Var;
            jy0Var.d0 = true;
            yo2Var.T(jy0Var.V);
        }
        if (view instanceof gy0) {
            gy0 gy0Var = (gy0) view;
            gy0Var.k();
            ((jy0) view.getLayoutParams()).e0 = true;
            ArrayList arrayList = this.B;
            if (!arrayList.contains(gy0Var)) {
                arrayList.add(gy0Var);
            }
        }
        this.A.put(view.getId(), view);
        this.f0 = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.A.remove(view.getId());
        gz0 h = h(view);
        this.L.t0.remove(h);
        h.D();
        this.B.remove(view);
        this.f0 = true;
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        this.f0 = true;
        super.requestLayout();
    }

    public void setConstraintSet(uy0 uy0Var) {
        this.h0 = uy0Var;
    }

    @Override // android.view.View
    public void setId(int i) {
        int id = getId();
        SparseArray sparseArray = this.A;
        sparseArray.remove(id);
        super.setId(i);
        sparseArray.put(getId(), this);
    }

    public void setMaxHeight(int i) {
        if (i == this.e0) {
            return;
        }
        this.e0 = i;
        requestLayout();
    }

    public void setMaxWidth(int i) {
        if (i == this.d0) {
            return;
        }
        this.d0 = i;
        requestLayout();
    }

    public void setMinHeight(int i) {
        if (i == this.c0) {
            return;
        }
        this.c0 = i;
        requestLayout();
    }

    public void setMinWidth(int i) {
        if (i == this.R) {
            return;
        }
        this.R = i;
        requestLayout();
    }

    public void setOnConstraintsChanged(mz0 mz0Var) {
        ny0 ny0Var = this.i0;
        if (ny0Var != null) {
            ny0Var.getClass();
        }
    }

    public void setOptimizationLevel(int i) {
        this.g0 = i;
        hz0 hz0Var = this.L;
        hz0Var.G0 = i;
        ho3.q = hz0Var.X(512);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A = new SparseArray();
        this.B = new ArrayList(4);
        this.L = new hz0();
        this.R = 0;
        this.c0 = 0;
        this.d0 = Preference.DEFAULT_ORDER;
        this.e0 = Preference.DEFAULT_ORDER;
        this.f0 = true;
        this.g0 = 257;
        this.h0 = null;
        this.i0 = null;
        this.j0 = -1;
        this.k0 = new HashMap();
        this.l0 = new SparseArray();
        this.m0 = new ky0(this, this);
        i(attributeSet, i);
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [jy0, android.view.ViewGroup$LayoutParams, android.view.ViewGroup$MarginLayoutParams] */
    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        ?? marginLayoutParams = new ViewGroup.MarginLayoutParams(layoutParams);
        marginLayoutParams.a = -1;
        marginLayoutParams.b = -1;
        marginLayoutParams.c = -1.0f;
        marginLayoutParams.d = true;
        marginLayoutParams.e = -1;
        marginLayoutParams.f = -1;
        marginLayoutParams.g = -1;
        marginLayoutParams.h = -1;
        marginLayoutParams.i = -1;
        marginLayoutParams.j = -1;
        marginLayoutParams.k = -1;
        marginLayoutParams.l = -1;
        marginLayoutParams.m = -1;
        marginLayoutParams.n = -1;
        marginLayoutParams.o = -1;
        marginLayoutParams.p = -1;
        marginLayoutParams.q = 0;
        marginLayoutParams.r = RecyclerView.A1;
        marginLayoutParams.s = -1;
        marginLayoutParams.t = -1;
        marginLayoutParams.u = -1;
        marginLayoutParams.v = -1;
        marginLayoutParams.w = Integer.MIN_VALUE;
        marginLayoutParams.x = Integer.MIN_VALUE;
        marginLayoutParams.y = Integer.MIN_VALUE;
        marginLayoutParams.z = Integer.MIN_VALUE;
        marginLayoutParams.A = Integer.MIN_VALUE;
        marginLayoutParams.B = Integer.MIN_VALUE;
        marginLayoutParams.C = Integer.MIN_VALUE;
        marginLayoutParams.D = 0;
        marginLayoutParams.E = 0.5f;
        marginLayoutParams.F = 0.5f;
        marginLayoutParams.G = null;
        marginLayoutParams.H = -1.0f;
        marginLayoutParams.I = -1.0f;
        marginLayoutParams.J = 0;
        marginLayoutParams.K = 0;
        marginLayoutParams.L = 0;
        marginLayoutParams.M = 0;
        marginLayoutParams.N = 0;
        marginLayoutParams.O = 0;
        marginLayoutParams.P = 0;
        marginLayoutParams.Q = 0;
        marginLayoutParams.R = 1.0f;
        marginLayoutParams.S = 1.0f;
        marginLayoutParams.T = -1;
        marginLayoutParams.U = -1;
        marginLayoutParams.V = -1;
        marginLayoutParams.W = false;
        marginLayoutParams.X = false;
        marginLayoutParams.Y = null;
        marginLayoutParams.Z = 0;
        marginLayoutParams.a0 = true;
        marginLayoutParams.b0 = true;
        marginLayoutParams.c0 = false;
        marginLayoutParams.d0 = false;
        marginLayoutParams.e0 = false;
        marginLayoutParams.f0 = -1;
        marginLayoutParams.g0 = -1;
        marginLayoutParams.h0 = -1;
        marginLayoutParams.i0 = -1;
        marginLayoutParams.j0 = Integer.MIN_VALUE;
        marginLayoutParams.k0 = Integer.MIN_VALUE;
        marginLayoutParams.l0 = 0.5f;
        marginLayoutParams.p0 = new gz0();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams;
            ((ViewGroup.MarginLayoutParams) marginLayoutParams).leftMargin = marginLayoutParams2.leftMargin;
            ((ViewGroup.MarginLayoutParams) marginLayoutParams).rightMargin = marginLayoutParams2.rightMargin;
            ((ViewGroup.MarginLayoutParams) marginLayoutParams).topMargin = marginLayoutParams2.topMargin;
            ((ViewGroup.MarginLayoutParams) marginLayoutParams).bottomMargin = marginLayoutParams2.bottomMargin;
            marginLayoutParams.setMarginStart(marginLayoutParams2.getMarginStart());
            marginLayoutParams.setMarginEnd(marginLayoutParams2.getMarginEnd());
        }
        if (layoutParams instanceof jy0) {
            jy0 jy0Var = (jy0) layoutParams;
            marginLayoutParams.a = jy0Var.a;
            marginLayoutParams.b = jy0Var.b;
            marginLayoutParams.c = jy0Var.c;
            marginLayoutParams.d = jy0Var.d;
            marginLayoutParams.e = jy0Var.e;
            marginLayoutParams.f = jy0Var.f;
            marginLayoutParams.g = jy0Var.g;
            marginLayoutParams.h = jy0Var.h;
            marginLayoutParams.i = jy0Var.i;
            marginLayoutParams.j = jy0Var.j;
            marginLayoutParams.k = jy0Var.k;
            marginLayoutParams.l = jy0Var.l;
            marginLayoutParams.m = jy0Var.m;
            marginLayoutParams.n = jy0Var.n;
            marginLayoutParams.o = jy0Var.o;
            marginLayoutParams.p = jy0Var.p;
            marginLayoutParams.q = jy0Var.q;
            marginLayoutParams.r = jy0Var.r;
            marginLayoutParams.s = jy0Var.s;
            marginLayoutParams.t = jy0Var.t;
            marginLayoutParams.u = jy0Var.u;
            marginLayoutParams.v = jy0Var.v;
            marginLayoutParams.w = jy0Var.w;
            marginLayoutParams.x = jy0Var.x;
            marginLayoutParams.y = jy0Var.y;
            marginLayoutParams.z = jy0Var.z;
            marginLayoutParams.A = jy0Var.A;
            marginLayoutParams.B = jy0Var.B;
            marginLayoutParams.C = jy0Var.C;
            marginLayoutParams.D = jy0Var.D;
            marginLayoutParams.E = jy0Var.E;
            marginLayoutParams.F = jy0Var.F;
            marginLayoutParams.G = jy0Var.G;
            marginLayoutParams.H = jy0Var.H;
            marginLayoutParams.I = jy0Var.I;
            marginLayoutParams.J = jy0Var.J;
            marginLayoutParams.K = jy0Var.K;
            marginLayoutParams.W = jy0Var.W;
            marginLayoutParams.X = jy0Var.X;
            marginLayoutParams.L = jy0Var.L;
            marginLayoutParams.M = jy0Var.M;
            marginLayoutParams.N = jy0Var.N;
            marginLayoutParams.P = jy0Var.P;
            marginLayoutParams.O = jy0Var.O;
            marginLayoutParams.Q = jy0Var.Q;
            marginLayoutParams.R = jy0Var.R;
            marginLayoutParams.S = jy0Var.S;
            marginLayoutParams.T = jy0Var.T;
            marginLayoutParams.U = jy0Var.U;
            marginLayoutParams.V = jy0Var.V;
            marginLayoutParams.a0 = jy0Var.a0;
            marginLayoutParams.b0 = jy0Var.b0;
            marginLayoutParams.c0 = jy0Var.c0;
            marginLayoutParams.d0 = jy0Var.d0;
            marginLayoutParams.f0 = jy0Var.f0;
            marginLayoutParams.g0 = jy0Var.g0;
            marginLayoutParams.h0 = jy0Var.h0;
            marginLayoutParams.i0 = jy0Var.i0;
            marginLayoutParams.j0 = jy0Var.j0;
            marginLayoutParams.k0 = jy0Var.k0;
            marginLayoutParams.l0 = jy0Var.l0;
            marginLayoutParams.Y = jy0Var.Y;
            marginLayoutParams.Z = jy0Var.Z;
            marginLayoutParams.p0 = jy0Var.p0;
            return marginLayoutParams;
        }
        return marginLayoutParams;
    }
}
