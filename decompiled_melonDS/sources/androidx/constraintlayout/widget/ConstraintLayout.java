package androidx.constraintlayout.widget;

import a4.n;
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
import e5.a;
import e5.h;
import e5.l;
import f5.m;
import f5.p;
import f5.t;
import i5.c;
import i5.e;
import i5.f;
import i5.g;
import i5.j;
import i5.q;
import i5.s;
import i5.v;
import i5.w;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {

    /* renamed from: m0  reason: collision with root package name */
    public static w f1155m0;
    public final SparseArray A;
    public final ArrayList B;
    public final h L;
    public int R;

    /* renamed from: b0  reason: collision with root package name */
    public int f1156b0;

    /* renamed from: c0  reason: collision with root package name */
    public int f1157c0;

    /* renamed from: d0  reason: collision with root package name */
    public int f1158d0;

    /* renamed from: e0  reason: collision with root package name */
    public boolean f1159e0;

    /* renamed from: f0  reason: collision with root package name */
    public int f1160f0;

    /* renamed from: g0  reason: collision with root package name */
    public q f1161g0;

    /* renamed from: h0  reason: collision with root package name */
    public j f1162h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f1163i0;

    /* renamed from: j0  reason: collision with root package name */
    public HashMap f1164j0;

    /* renamed from: k0  reason: collision with root package name */
    public final SparseArray f1165k0;

    /* renamed from: l0  reason: collision with root package name */
    public final g f1166l0;

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A = new SparseArray();
        this.B = new ArrayList(4);
        this.L = new h();
        this.R = 0;
        this.f1156b0 = 0;
        this.f1157c0 = Preference.DEFAULT_ORDER;
        this.f1158d0 = Preference.DEFAULT_ORDER;
        this.f1159e0 = true;
        this.f1160f0 = 257;
        this.f1161g0 = null;
        this.f1162h0 = null;
        this.f1163i0 = -1;
        this.f1164j0 = new HashMap();
        this.f1165k0 = new SparseArray();
        this.f1166l0 = new g(this, this);
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

    /* JADX WARN: Type inference failed for: r0v2, types: [i5.w, java.lang.Object] */
    public static w getSharedValues() {
        if (f1155m0 == null) {
            ?? obj = new Object();
            new SparseIntArray();
            obj.f7015a = new HashMap();
            f1155m0 = obj;
        }
        return f1155m0;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof f;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList arrayList = this.B;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i2 = 0; i2 < size; i2++) {
                ((c) arrayList.get(i2)).getClass();
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            float width = getWidth();
            float height = getHeight();
            int childCount = getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = getChildAt(i10);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] split = ((String) tag).split(",");
                    if (split.length == 4) {
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        int parseInt3 = Integer.parseInt(split[2]);
                        int i11 = (int) ((parseInt / 1080.0f) * width);
                        int i12 = (int) ((parseInt2 / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f8 = i11;
                        float f10 = i12;
                        float f11 = i11 + ((int) ((parseInt3 / 1080.0f) * width));
                        canvas.drawLine(f8, f10, f11, f10, paint);
                        float parseInt4 = i12 + ((int) ((Integer.parseInt(split[3]) / 1920.0f) * height));
                        canvas.drawLine(f11, f10, f11, parseInt4, paint);
                        canvas.drawLine(f11, parseInt4, f8, parseInt4, paint);
                        canvas.drawLine(f8, parseInt4, f8, f10, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f8, f10, f11, parseInt4, paint);
                        canvas.drawLine(f8, parseInt4, f11, f10, paint);
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public final void forceLayout() {
        this.f1159e0 = true;
        super.forceLayout();
    }

    /* JADX WARN: Removed duplicated region for block: B:75:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0181  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:148:0x02a9 -> B:149:0x02aa). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(boolean r15, android.view.View r16, e5.g r17, i5.f r18, android.util.SparseArray r19) {
        /*
            Method dump skipped, instructions count: 790
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.g(boolean, android.view.View, e5.g, i5.f, android.util.SparseArray):void");
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new f();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [i5.f, android.view.ViewGroup$LayoutParams, android.view.ViewGroup$MarginLayoutParams, java.lang.Object] */
    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        ?? marginLayoutParams = new ViewGroup.MarginLayoutParams(context, attributeSet);
        marginLayoutParams.f6827a = -1;
        marginLayoutParams.f6829b = -1;
        marginLayoutParams.f6831c = -1.0f;
        marginLayoutParams.f6833d = true;
        marginLayoutParams.f6835e = -1;
        marginLayoutParams.f6837f = -1;
        marginLayoutParams.f6839g = -1;
        marginLayoutParams.f6841h = -1;
        marginLayoutParams.f6843i = -1;
        marginLayoutParams.f6845j = -1;
        marginLayoutParams.f6847k = -1;
        marginLayoutParams.f6849l = -1;
        marginLayoutParams.m = -1;
        marginLayoutParams.f6852n = -1;
        marginLayoutParams.f6854o = -1;
        marginLayoutParams.f6856p = -1;
        marginLayoutParams.f6857q = 0;
        marginLayoutParams.f6858r = 0.0f;
        marginLayoutParams.f6859s = -1;
        marginLayoutParams.f6860t = -1;
        marginLayoutParams.f6861u = -1;
        marginLayoutParams.f6862v = -1;
        marginLayoutParams.f6863w = Integer.MIN_VALUE;
        marginLayoutParams.f6864x = Integer.MIN_VALUE;
        marginLayoutParams.f6865y = Integer.MIN_VALUE;
        marginLayoutParams.f6866z = Integer.MIN_VALUE;
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
        marginLayoutParams.f6828a0 = true;
        marginLayoutParams.f6830b0 = true;
        marginLayoutParams.f6832c0 = false;
        marginLayoutParams.f6834d0 = false;
        marginLayoutParams.f6836e0 = false;
        marginLayoutParams.f6838f0 = -1;
        marginLayoutParams.f6840g0 = -1;
        marginLayoutParams.f6842h0 = -1;
        marginLayoutParams.f6844i0 = -1;
        marginLayoutParams.f6846j0 = Integer.MIN_VALUE;
        marginLayoutParams.f6848k0 = Integer.MIN_VALUE;
        marginLayoutParams.f6850l0 = 0.5f;
        marginLayoutParams.p0 = new e5.g();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, v.f6994b);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = obtainStyledAttributes.getIndex(i2);
            int i10 = e.f6826a.get(index);
            switch (i10) {
                case DSiCameraSource.FrontCamera /* 1 */:
                    marginLayoutParams.V = obtainStyledAttributes.getInt(index, marginLayoutParams.V);
                    break;
                case 2:
                    int resourceId = obtainStyledAttributes.getResourceId(index, marginLayoutParams.f6856p);
                    marginLayoutParams.f6856p = resourceId;
                    if (resourceId == -1) {
                        marginLayoutParams.f6856p = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    marginLayoutParams.f6857q = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.f6857q);
                    break;
                case 4:
                    float f8 = obtainStyledAttributes.getFloat(index, marginLayoutParams.f6858r) % 360.0f;
                    marginLayoutParams.f6858r = f8;
                    if (f8 < 0.0f) {
                        marginLayoutParams.f6858r = (360.0f - f8) % 360.0f;
                        break;
                    } else {
                        break;
                    }
                case l1.c.f8511g /* 5 */:
                    marginLayoutParams.f6827a = obtainStyledAttributes.getDimensionPixelOffset(index, marginLayoutParams.f6827a);
                    break;
                case l1.c.f8509e /* 6 */:
                    marginLayoutParams.f6829b = obtainStyledAttributes.getDimensionPixelOffset(index, marginLayoutParams.f6829b);
                    break;
                case 7:
                    marginLayoutParams.f6831c = obtainStyledAttributes.getFloat(index, marginLayoutParams.f6831c);
                    break;
                case 8:
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.f6835e);
                    marginLayoutParams.f6835e = resourceId2;
                    if (resourceId2 == -1) {
                        marginLayoutParams.f6835e = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case l1.c.f8508d /* 9 */:
                    int resourceId3 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.f6837f);
                    marginLayoutParams.f6837f = resourceId3;
                    if (resourceId3 == -1) {
                        marginLayoutParams.f6837f = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case l1.c.f8510f /* 10 */:
                    int resourceId4 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.f6839g);
                    marginLayoutParams.f6839g = resourceId4;
                    if (resourceId4 == -1) {
                        marginLayoutParams.f6839g = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    int resourceId5 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.f6841h);
                    marginLayoutParams.f6841h = resourceId5;
                    if (resourceId5 == -1) {
                        marginLayoutParams.f6841h = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    int resourceId6 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.f6843i);
                    marginLayoutParams.f6843i = resourceId6;
                    if (resourceId6 == -1) {
                        marginLayoutParams.f6843i = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    int resourceId7 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.f6845j);
                    marginLayoutParams.f6845j = resourceId7;
                    if (resourceId7 == -1) {
                        marginLayoutParams.f6845j = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    int resourceId8 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.f6847k);
                    marginLayoutParams.f6847k = resourceId8;
                    if (resourceId8 == -1) {
                        marginLayoutParams.f6847k = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case l1.c.f8512h /* 15 */:
                    int resourceId9 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.f6849l);
                    marginLayoutParams.f6849l = resourceId9;
                    if (resourceId9 == -1) {
                        marginLayoutParams.f6849l = obtainStyledAttributes.getInt(index, -1);
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
                    int resourceId11 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.f6859s);
                    marginLayoutParams.f6859s = resourceId11;
                    if (resourceId11 == -1) {
                        marginLayoutParams.f6859s = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 18:
                    int resourceId12 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.f6860t);
                    marginLayoutParams.f6860t = resourceId12;
                    if (resourceId12 == -1) {
                        marginLayoutParams.f6860t = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 19:
                    int resourceId13 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.f6861u);
                    marginLayoutParams.f6861u = resourceId13;
                    if (resourceId13 == -1) {
                        marginLayoutParams.f6861u = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 20:
                    int resourceId14 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.f6862v);
                    marginLayoutParams.f6862v = resourceId14;
                    if (resourceId14 == -1) {
                        marginLayoutParams.f6862v = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 21:
                    marginLayoutParams.f6863w = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.f6863w);
                    break;
                case 22:
                    marginLayoutParams.f6864x = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.f6864x);
                    break;
                case 23:
                    marginLayoutParams.f6865y = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.f6865y);
                    break;
                case 24:
                    marginLayoutParams.f6866z = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.f6866z);
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
                    int i11 = obtainStyledAttributes.getInt(index, 0);
                    marginLayoutParams.L = i11;
                    if (i11 == 1) {
                        Log.e("ConstraintLayout", "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                        break;
                    } else {
                        break;
                    }
                case 32:
                    int i12 = obtainStyledAttributes.getInt(index, 0);
                    marginLayoutParams.M = i12;
                    if (i12 == 1) {
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
                    marginLayoutParams.R = Math.max(0.0f, obtainStyledAttributes.getFloat(index, marginLayoutParams.R));
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
                    marginLayoutParams.S = Math.max(0.0f, obtainStyledAttributes.getFloat(index, marginLayoutParams.S));
                    marginLayoutParams.M = 2;
                    break;
                default:
                    switch (i10) {
                        case 44:
                            q.n(marginLayoutParams, obtainStyledAttributes.getString(index));
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
                            int resourceId15 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.f6852n);
                            marginLayoutParams.f6852n = resourceId15;
                            if (resourceId15 == -1) {
                                marginLayoutParams.f6852n = obtainStyledAttributes.getInt(index, -1);
                                break;
                            } else {
                                continue;
                            }
                        case 53:
                            int resourceId16 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.f6854o);
                            marginLayoutParams.f6854o = resourceId16;
                            if (resourceId16 == -1) {
                                marginLayoutParams.f6854o = obtainStyledAttributes.getInt(index, -1);
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
                            switch (i10) {
                                case 64:
                                    q.m(marginLayoutParams, obtainStyledAttributes, index, 0);
                                    continue;
                                case 65:
                                    q.m(marginLayoutParams, obtainStyledAttributes, index, 1);
                                    continue;
                                case 66:
                                    marginLayoutParams.Z = obtainStyledAttributes.getInt(index, marginLayoutParams.Z);
                                    continue;
                                case 67:
                                    marginLayoutParams.f6833d = obtainStyledAttributes.getBoolean(index, marginLayoutParams.f6833d);
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
        return this.f1158d0;
    }

    public int getMaxWidth() {
        return this.f1157c0;
    }

    public int getMinHeight() {
        return this.f1156b0;
    }

    public int getMinWidth() {
        return this.R;
    }

    public int getOptimizationLevel() {
        return this.L.G0;
    }

    public String getSceneString() {
        int id2;
        StringBuilder sb2 = new StringBuilder();
        h hVar = this.L;
        if (hVar.f4306j == null) {
            int id3 = getId();
            if (id3 != -1) {
                hVar.f4306j = getContext().getResources().getResourceEntryName(id3);
            } else {
                hVar.f4306j = "parent";
            }
        }
        if (hVar.f4307j0 == null) {
            hVar.f4307j0 = hVar.f4306j;
            Log.v("ConstraintLayout", " setDebugName " + hVar.f4307j0);
        }
        ArrayList arrayList = hVar.f4331t0;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            e5.g gVar = (e5.g) obj;
            View view = gVar.f4301g0;
            if (view != null) {
                if (gVar.f4306j == null && (id2 = view.getId()) != -1) {
                    gVar.f4306j = getContext().getResources().getResourceEntryName(id2);
                }
                if (gVar.f4307j0 == null) {
                    gVar.f4307j0 = gVar.f4306j;
                    Log.v("ConstraintLayout", " setDebugName " + gVar.f4307j0);
                }
            }
        }
        hVar.o(sb2);
        return sb2.toString();
    }

    public final e5.g h(View view) {
        if (view == this) {
            return this.L;
        }
        if (view != null) {
            if (view.getLayoutParams() instanceof f) {
                return ((f) view.getLayoutParams()).p0;
            }
            view.setLayoutParams(generateLayoutParams(view.getLayoutParams()));
            if (view.getLayoutParams() instanceof f) {
                return ((f) view.getLayoutParams()).p0;
            }
            return null;
        }
        return null;
    }

    public final void i(AttributeSet attributeSet, int i2) {
        h hVar = this.L;
        hVar.f4301g0 = this;
        g gVar = this.f1166l0;
        hVar.f4335x0 = gVar;
        hVar.f4333v0.f4861h = gVar;
        this.A.put(getId(), this);
        this.f1161g0 = null;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, v.f6994b, i2, 0);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == 16) {
                    this.R = obtainStyledAttributes.getDimensionPixelOffset(index, this.R);
                } else if (index == 17) {
                    this.f1156b0 = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1156b0);
                } else if (index == 14) {
                    this.f1157c0 = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1157c0);
                } else if (index == 15) {
                    this.f1158d0 = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1158d0);
                } else if (index == 113) {
                    this.f1160f0 = obtainStyledAttributes.getInt(index, this.f1160f0);
                } else if (index == 56) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            k(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.f1162h0 = null;
                        }
                    }
                } else if (index == 34) {
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, 0);
                    try {
                        q qVar = new q();
                        this.f1161g0 = qVar;
                        qVar.j(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.f1161g0 = null;
                    }
                    this.f1163i0 = resourceId2;
                }
            }
            obtainStyledAttributes.recycle();
        }
        hVar.G0 = this.f1160f0;
        c5.c.f2588q = hVar.X(512);
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
    /* JADX WARN: Type inference failed for: r0v0, types: [i5.j, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void k(int r9) {
        /*
            r8 = this;
            i5.j r0 = new i5.j
            android.content.Context r1 = r8.getContext()
            r0.<init>()
            r2 = -1
            r0.f6885a = r2
            r0.f6886b = r2
            android.util.SparseArray r2 = new android.util.SparseArray
            r2.<init>()
            r0.f6888d = r2
            android.util.SparseArray r2 = new android.util.SparseArray
            r2.<init>()
            r0.f6889e = r2
            r0.f6887c = r8
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
            i5.i r5 = new i5.i     // Catch: java.io.IOException -> L57 org.xmlpull.v1.XmlPullParserException -> L59
            r5.<init>(r1, r4)     // Catch: java.io.IOException -> L57 org.xmlpull.v1.XmlPullParserException -> L59
            if (r6 == 0) goto L87
            java.util.ArrayList r7 = r6.f6876b     // Catch: java.io.IOException -> L57 org.xmlpull.v1.XmlPullParserException -> L59
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
            i5.h r5 = new i5.h     // Catch: java.io.IOException -> L57 org.xmlpull.v1.XmlPullParserException -> L59
            r5.<init>(r1, r4)     // Catch: java.io.IOException -> L57 org.xmlpull.v1.XmlPullParserException -> L59
            java.lang.Cloneable r6 = r0.f6888d     // Catch: java.io.IOException -> L57 org.xmlpull.v1.XmlPullParserException -> L59
            android.util.SparseArray r6 = (android.util.SparseArray) r6     // Catch: java.io.IOException -> L57 org.xmlpull.v1.XmlPullParserException -> L59
            int r7 = r5.f6875a     // Catch: java.io.IOException -> L57 org.xmlpull.v1.XmlPullParserException -> L59
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
            r8.f1162h0 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.k(int):void");
    }

    public final void l(int i2, int i10, int i11, int i12, boolean z10, boolean z11) {
        g gVar = this.f1166l0;
        int i13 = gVar.f6871e;
        int resolveSizeAndState = View.resolveSizeAndState(i11 + gVar.f6870d, i2, 0);
        int min = Math.min(this.f1157c0, resolveSizeAndState & 16777215);
        int min2 = Math.min(this.f1158d0, View.resolveSizeAndState(i12 + i13, i10, 0) & 16777215);
        if (z10) {
            min |= 16777216;
        }
        if (z11) {
            min2 |= 16777216;
        }
        setMeasuredDimension(min, min2);
    }

    public final void m(h hVar, int i2, int i10, int i11) {
        e5.f fVar;
        e5.f fVar2;
        int i12;
        int i13;
        int max;
        int i14;
        boolean z10;
        int i15;
        boolean z11;
        boolean z12;
        boolean z13;
        ArrayList arrayList;
        g gVar;
        int i16;
        boolean z14;
        boolean z15;
        boolean z16;
        int i17;
        g gVar2;
        int i18;
        boolean z17;
        boolean z18;
        g gVar3;
        boolean z19;
        m mVar;
        p pVar;
        boolean z20;
        int i19;
        int i20;
        boolean z21;
        boolean z22;
        int i21;
        int i22;
        boolean z23;
        boolean z24;
        boolean z25;
        boolean z26;
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        int size2 = View.MeasureSpec.getSize(i11);
        int max2 = Math.max(0, getPaddingTop());
        int max3 = Math.max(0, getPaddingBottom());
        int i23 = max2 + max3;
        int paddingWidth = getPaddingWidth();
        g gVar4 = this.f1166l0;
        gVar4.f6868b = max2;
        gVar4.f6869c = max3;
        gVar4.f6870d = paddingWidth;
        gVar4.f6871e = i23;
        gVar4.f6872f = i10;
        gVar4.f6873g = i11;
        int max4 = Math.max(0, getPaddingStart());
        int max5 = Math.max(0, getPaddingEnd());
        if (max4 <= 0 && max5 <= 0) {
            max4 = Math.max(0, getPaddingLeft());
        } else if (j()) {
            max4 = max5;
        }
        int i24 = size - paddingWidth;
        int i25 = size2 - i23;
        int i26 = gVar4.f6871e;
        int i27 = gVar4.f6870d;
        e5.f fVar3 = e5.f.FIXED;
        int childCount = getChildCount();
        if (mode != Integer.MIN_VALUE) {
            if (mode != 0) {
                if (mode != 1073741824) {
                    i13 = 0;
                } else {
                    i13 = Math.min(this.f1157c0 - i27, i24);
                }
                i12 = Integer.MIN_VALUE;
                fVar2 = fVar3;
            } else {
                fVar = e5.f.WRAP_CONTENT;
                if (childCount == 0) {
                    max = Math.max(0, this.R);
                    int i28 = max;
                    fVar2 = fVar;
                    i13 = i28;
                    i12 = Integer.MIN_VALUE;
                } else {
                    i13 = 0;
                    i12 = Integer.MIN_VALUE;
                    fVar2 = fVar;
                }
            }
        } else {
            fVar = e5.f.WRAP_CONTENT;
            if (childCount == 0) {
                max = Math.max(0, this.R);
                int i282 = max;
                fVar2 = fVar;
                i13 = i282;
                i12 = Integer.MIN_VALUE;
            } else {
                fVar2 = fVar;
                i12 = Integer.MIN_VALUE;
                i13 = i24;
            }
        }
        if (mode2 != i12) {
            if (mode2 != 0) {
                if (mode2 == 1073741824) {
                    i14 = Math.min(this.f1158d0 - i26, i25);
                }
                i14 = 0;
            } else {
                fVar3 = e5.f.WRAP_CONTENT;
                if (childCount == 0) {
                    i14 = Math.max(0, this.f1156b0);
                }
                i14 = 0;
            }
        } else {
            fVar3 = e5.f.WRAP_CONTENT;
            if (childCount == 0) {
                i14 = Math.max(0, this.f1156b0);
            } else {
                i14 = i25;
            }
        }
        int r5 = hVar.r();
        f5.e eVar = hVar.f4333v0;
        if (i13 != r5 || i14 != hVar.l()) {
            eVar.f4856c = true;
        }
        hVar.Z = 0;
        hVar.f4289a0 = 0;
        int[] iArr = hVar.C;
        iArr[0] = this.f1157c0 - i27;
        iArr[1] = this.f1158d0 - i26;
        hVar.f4293c0 = 0;
        hVar.f4295d0 = 0;
        hVar.N(fVar2);
        hVar.P(i13);
        hVar.O(fVar3);
        hVar.M(i14);
        int i29 = this.R - i27;
        if (i29 < 0) {
            hVar.f4293c0 = 0;
        } else {
            hVar.f4293c0 = i29;
        }
        int i30 = this.f1156b0 - i26;
        if (i30 < 0) {
            hVar.f4295d0 = 0;
        } else {
            hVar.f4295d0 = i30;
        }
        hVar.A0 = max4;
        hVar.B0 = max2;
        n nVar = hVar.f4332u0;
        h hVar2 = (h) nVar.R;
        ArrayList arrayList2 = (ArrayList) nVar.B;
        g gVar5 = hVar.f4335x0;
        int size3 = hVar.f4331t0.size();
        int r10 = hVar.r();
        int l10 = hVar.l();
        boolean c4 = e5.n.c(i2, 128);
        if (!c4 && !e5.n.c(i2, 64)) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            int i31 = 0;
            while (i31 < size3) {
                boolean z27 = z10;
                e5.g gVar6 = (e5.g) hVar.f4331t0.get(i31);
                int i32 = i31;
                e5.f[] fVarArr = gVar6.T;
                e5.f fVar4 = fVarArr[0];
                i15 = size3;
                e5.f fVar5 = e5.f.MATCH_CONSTRAINT;
                if (fVar4 == fVar5) {
                    z24 = true;
                } else {
                    z24 = false;
                }
                if (fVarArr[1] == fVar5) {
                    z25 = true;
                } else {
                    z25 = false;
                }
                if (z24 && z25 && gVar6.X > 0.0f) {
                    z26 = true;
                } else {
                    z26 = false;
                }
                if ((gVar6.y() && z26) || ((gVar6.z() && z26) || (gVar6 instanceof e5.p) || gVar6.y() || gVar6.z())) {
                    z11 = false;
                    break;
                }
                i31 = i32 + 1;
                z10 = z27;
                size3 = i15;
            }
        }
        i15 = size3;
        z11 = z10;
        if ((mode == 1073741824 && mode2 == 1073741824) || c4) {
            z12 = true;
        } else {
            z12 = false;
        }
        boolean z28 = z11 & z12;
        if (z28) {
            int min = Math.min(hVar.C[0], i24);
            int min2 = Math.min(hVar.C[1], i25);
            if (mode == 1073741824 && hVar.r() != min) {
                hVar.P(min);
                z20 = true;
                eVar.f4855b = true;
            } else {
                z20 = true;
            }
            if (mode2 == 1073741824 && hVar.l() != min2) {
                hVar.M(min2);
                eVar.f4855b = z20;
            }
            if (mode == 1073741824 && mode2 == 1073741824) {
                ArrayList arrayList3 = (ArrayList) eVar.f4859f;
                h hVar3 = (h) eVar.f4857d;
                if (!eVar.f4855b && !eVar.f4856c) {
                    z13 = z28;
                    i21 = 0;
                } else {
                    ArrayList arrayList4 = hVar3.f4331t0;
                    int size4 = arrayList4.size();
                    z13 = z28;
                    int i33 = 0;
                    while (i33 < size4) {
                        Object obj = arrayList4.get(i33);
                        int i34 = i33 + 1;
                        e5.g gVar7 = (e5.g) obj;
                        gVar7.i();
                        gVar7.f4288a = false;
                        gVar7.f4294d.n();
                        gVar7.f4296e.m();
                        arrayList4 = arrayList4;
                        i33 = i34;
                    }
                    hVar3.i();
                    i21 = 0;
                    hVar3.f4288a = false;
                    hVar3.f4294d.n();
                    hVar3.f4296e.m();
                    eVar.f4856c = false;
                }
                eVar.c((h) eVar.f4858e);
                hVar3.Z = i21;
                hVar3.f4289a0 = i21;
                e5.f k10 = hVar3.k(i21);
                e5.f k11 = hVar3.k(1);
                if (eVar.f4855b) {
                    eVar.d();
                }
                int s10 = hVar3.s();
                gVar = gVar5;
                int t5 = hVar3.t();
                arrayList = arrayList2;
                hVar3.f4294d.f4897h.d(s10);
                hVar3.f4296e.f4897h.d(t5);
                eVar.i();
                e5.f fVar6 = e5.f.WRAP_CONTENT;
                if (k10 != fVar6 && k11 != fVar6) {
                    i22 = s10;
                } else {
                    if (c4) {
                        int size5 = arrayList3.size();
                        i22 = s10;
                        int i35 = 0;
                        while (true) {
                            if (i35 >= size5) {
                                break;
                            }
                            Object obj2 = arrayList3.get(i35);
                            i35++;
                            if (!((t) obj2).k()) {
                                c4 = false;
                                break;
                            }
                        }
                    } else {
                        i22 = s10;
                    }
                    if (c4 && k10 == e5.f.WRAP_CONTENT) {
                        hVar3.N(e5.f.FIXED);
                        hVar3.P(eVar.e(hVar3, 0));
                        hVar3.f4294d.f4894e.d(hVar3.r());
                    }
                    if (c4 && k11 == e5.f.WRAP_CONTENT) {
                        hVar3.O(e5.f.FIXED);
                        hVar3.M(eVar.e(hVar3, 1));
                        hVar3.f4296e.f4894e.d(hVar3.l());
                    }
                }
                e5.f fVar7 = hVar3.T[0];
                e5.f fVar8 = e5.f.FIXED;
                if (fVar7 != fVar8 && fVar7 != e5.f.MATCH_PARENT) {
                    z23 = false;
                } else {
                    int r11 = hVar3.r() + i22;
                    hVar3.f4294d.f4898i.d(r11);
                    hVar3.f4294d.f4894e.d(r11 - i22);
                    eVar.i();
                    e5.f fVar9 = hVar3.T[1];
                    if (fVar9 == fVar8 || fVar9 == e5.f.MATCH_PARENT) {
                        int l11 = hVar3.l() + t5;
                        hVar3.f4296e.f4898i.d(l11);
                        hVar3.f4296e.f4894e.d(l11 - t5);
                    }
                    eVar.i();
                    z23 = true;
                }
                int size6 = arrayList3.size();
                int i36 = 0;
                while (i36 < size6) {
                    Object obj3 = arrayList3.get(i36);
                    i36++;
                    t tVar = (t) obj3;
                    if (tVar.f4891b != hVar3 || tVar.f4896g) {
                        tVar.e();
                    }
                }
                int size7 = arrayList3.size();
                int i37 = 0;
                while (i37 < size7) {
                    Object obj4 = arrayList3.get(i37);
                    i37++;
                    t tVar2 = (t) obj4;
                    if (z23 || tVar2.f4891b != hVar3) {
                        if (!tVar2.f4897h.f4872j || ((!tVar2.f4898i.f4872j && !(tVar2 instanceof f5.j)) || (!tVar2.f4894e.f4872j && !(tVar2 instanceof f5.c) && !(tVar2 instanceof f5.j)))) {
                            z14 = false;
                            break;
                        }
                    }
                }
                z14 = true;
                hVar3.N(k10);
                hVar3.O(k11);
                i16 = 2;
                i20 = 1073741824;
            } else {
                z13 = z28;
                arrayList = arrayList2;
                gVar = gVar5;
                h hVar4 = (h) eVar.f4857d;
                if (eVar.f4855b) {
                    ArrayList arrayList5 = hVar4.f4331t0;
                    int size8 = arrayList5.size();
                    int i38 = 0;
                    while (i38 < size8) {
                        Object obj5 = arrayList5.get(i38);
                        i38++;
                        e5.g gVar8 = (e5.g) obj5;
                        gVar8.i();
                        gVar8.f4288a = false;
                        m mVar2 = gVar8.f4294d;
                        ArrayList arrayList6 = arrayList5;
                        mVar2.f4894e.f4872j = false;
                        mVar2.f4896g = false;
                        mVar2.n();
                        p pVar2 = gVar8.f4296e;
                        pVar2.f4894e.f4872j = false;
                        pVar2.f4896g = false;
                        pVar2.m();
                        arrayList5 = arrayList6;
                    }
                    i19 = 0;
                    hVar4.i();
                    hVar4.f4288a = false;
                    m mVar3 = hVar4.f4294d;
                    mVar3.f4894e.f4872j = false;
                    mVar3.f4896g = false;
                    mVar3.n();
                    p pVar3 = hVar4.f4296e;
                    pVar3.f4894e.f4872j = false;
                    pVar3.f4896g = false;
                    pVar3.m();
                    eVar.d();
                } else {
                    i19 = 0;
                }
                eVar.c((h) eVar.f4858e);
                hVar4.Z = i19;
                hVar4.f4289a0 = i19;
                hVar4.f4294d.f4897h.d(i19);
                hVar4.f4296e.f4897h.d(i19);
                i20 = 1073741824;
                if (mode == 1073741824) {
                    z14 = hVar.U(i19, c4);
                    i16 = 1;
                } else {
                    i16 = 0;
                    z14 = true;
                }
                if (mode2 == 1073741824) {
                    z14 &= hVar.U(1, c4);
                    i16++;
                }
            }
            if (z14) {
                if (mode == i20) {
                    z21 = true;
                } else {
                    z21 = false;
                }
                if (mode2 == i20) {
                    z22 = true;
                } else {
                    z22 = false;
                }
                hVar.Q(z21, z22);
            }
        } else {
            z13 = z28;
            arrayList = arrayList2;
            gVar = gVar5;
            i16 = 0;
            z14 = false;
        }
        if (z14 && i16 == 2) {
            return;
        }
        int i39 = hVar.G0;
        if (i15 > 0) {
            int size9 = hVar.f4331t0.size();
            boolean X = hVar.X(64);
            g gVar9 = hVar.f4335x0;
            for (int i40 = 0; i40 < size9; i40++) {
                e5.g gVar10 = (e5.g) hVar.f4331t0.get(i40);
                if (!(gVar10 instanceof l) && !(gVar10 instanceof a) && !gVar10.F && (!X || (mVar = gVar10.f4294d) == null || (pVar = gVar10.f4296e) == null || !mVar.f4894e.f4872j || !pVar.f4894e.f4872j)) {
                    e5.f k12 = gVar10.k(0);
                    e5.f k13 = gVar10.k(1);
                    e5.f fVar10 = e5.f.MATCH_CONSTRAINT;
                    if (k12 == fVar10 && gVar10.f4320r != 1 && k13 == fVar10 && gVar10.f4322s != 1) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    if (!z19 && hVar.X(1) && !(gVar10 instanceof e5.p)) {
                        if (k12 == fVar10 && gVar10.f4320r == 0 && k13 != fVar10 && !gVar10.y()) {
                            z19 = true;
                        }
                        if (k13 == fVar10 && gVar10.f4322s == 0 && k12 != fVar10 && !gVar10.y()) {
                            z19 = true;
                        }
                        if ((k12 == fVar10 || k13 == fVar10) && gVar10.X > 0.0f) {
                            z19 = true;
                        }
                    }
                    if (!z19) {
                        nVar.A(0, gVar10, gVar9);
                    }
                }
            }
            ConstraintLayout constraintLayout = gVar9.f6867a;
            int childCount2 = constraintLayout.getChildCount();
            ArrayList arrayList7 = constraintLayout.B;
            for (int i41 = 0; i41 < childCount2; i41++) {
                constraintLayout.getChildAt(i41);
            }
            int size10 = arrayList7.size();
            if (size10 > 0) {
                for (int i42 = 0; i42 < size10; i42++) {
                    ((c) arrayList7.get(i42)).getClass();
                }
            }
        }
        nVar.N(hVar);
        int size11 = arrayList.size();
        if (i15 > 0) {
            nVar.K(hVar, 0, r10, l10);
        }
        if (size11 > 0) {
            e5.f[] fVarArr2 = hVar.T;
            e5.f fVar11 = fVarArr2[0];
            e5.f fVar12 = e5.f.WRAP_CONTENT;
            if (fVar11 == fVar12) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (fVarArr2[1] == fVar12) {
                z16 = true;
            } else {
                z16 = false;
            }
            int max6 = Math.max(hVar.r(), hVar2.f4293c0);
            int max7 = Math.max(hVar.l(), hVar2.f4295d0);
            int i43 = 0;
            boolean z29 = false;
            while (i43 < size11) {
                ArrayList arrayList8 = arrayList;
                e5.g gVar11 = (e5.g) arrayList8.get(i43);
                if (!(gVar11 instanceof e5.p)) {
                    z17 = z16;
                    z18 = z15;
                    gVar3 = gVar;
                } else {
                    int r12 = gVar11.r();
                    int l12 = gVar11.l();
                    z17 = z16;
                    z18 = z15;
                    gVar3 = gVar;
                    boolean A = z29 | nVar.A(1, gVar11, gVar3);
                    int r13 = gVar11.r();
                    boolean z30 = A;
                    int l13 = gVar11.l();
                    if (r13 != r12) {
                        gVar11.P(r13);
                        if (z18 && gVar11.s() + gVar11.V > max6) {
                            max6 = Math.max(max6, gVar11.j(e5.c.RIGHT).e() + gVar11.s() + gVar11.V);
                        }
                        z30 = true;
                    }
                    if (l13 != l12) {
                        gVar11.M(l13);
                        if (z17 && gVar11.t() + gVar11.W > max7) {
                            max7 = Math.max(max7, gVar11.j(e5.c.BOTTOM).e() + gVar11.t() + gVar11.W);
                        }
                        z30 = true;
                    }
                    z29 = z30 | ((e5.p) gVar11).B0;
                }
                i43++;
                z15 = z18;
                gVar = gVar3;
                arrayList = arrayList8;
                z16 = z17;
            }
            boolean z31 = z16;
            boolean z32 = z15;
            g gVar12 = gVar;
            ArrayList arrayList9 = arrayList;
            int i44 = 0;
            while (i44 < 2) {
                int i45 = 0;
                while (i45 < size11) {
                    e5.g gVar13 = (e5.g) arrayList9.get(i45);
                    if (((gVar13 instanceof e5.m) && !(gVar13 instanceof e5.p)) || (gVar13 instanceof l) || gVar13.f4303h0 == 8 || ((z13 && gVar13.f4294d.f4894e.f4872j && gVar13.f4296e.f4894e.f4872j) || (gVar13 instanceof e5.p))) {
                        i17 = size11;
                        gVar2 = gVar12;
                        i18 = i44;
                    } else {
                        int r14 = gVar13.r();
                        int l14 = gVar13.l();
                        i17 = size11;
                        int i46 = gVar13.f4291b0;
                        boolean z33 = z29;
                        int i47 = 1;
                        if (i44 == 1) {
                            i47 = 2;
                        }
                        z29 = z33 | nVar.A(i47, gVar13, gVar12);
                        gVar2 = gVar12;
                        int r15 = gVar13.r();
                        i18 = i44;
                        int l15 = gVar13.l();
                        if (r15 != r14) {
                            gVar13.P(r15);
                            if (z32 && gVar13.s() + gVar13.V > max6) {
                                max6 = Math.max(max6, gVar13.j(e5.c.RIGHT).e() + gVar13.s() + gVar13.V);
                            }
                            z29 = true;
                        }
                        if (l15 != l14) {
                            gVar13.M(l15);
                            if (z31 && gVar13.t() + gVar13.W > max7) {
                                max7 = Math.max(max7, gVar13.j(e5.c.BOTTOM).e() + gVar13.t() + gVar13.W);
                            }
                            z29 = true;
                        }
                        if (gVar13.E && i46 != gVar13.f4291b0) {
                            z29 = true;
                        }
                    }
                    i45++;
                    size11 = i17;
                    gVar12 = gVar2;
                    i44 = i18;
                }
                int i48 = size11;
                g gVar14 = gVar12;
                int i49 = i44;
                if (!z29) {
                    break;
                }
                i44 = i49 + 1;
                nVar.K(hVar, i44, r10, l10);
                size11 = i48;
                gVar12 = gVar14;
                z29 = false;
            }
        }
        hVar.G0 = i39;
        c5.c.f2588q = hVar.X(512);
    }

    public final void n(e5.g gVar, f fVar, SparseArray sparseArray, int i2, e5.c cVar) {
        View view = (View) this.A.get(i2);
        e5.g gVar2 = (e5.g) sparseArray.get(i2);
        if (gVar2 != null && view != null && (view.getLayoutParams() instanceof f)) {
            fVar.f6832c0 = true;
            e5.c cVar2 = e5.c.BASELINE;
            if (cVar == cVar2) {
                f fVar2 = (f) view.getLayoutParams();
                fVar2.f6832c0 = true;
                fVar2.p0.E = true;
            }
            gVar.j(cVar2).b(gVar2.j(cVar), fVar.D, fVar.C, true);
            gVar.E = true;
            gVar.j(e5.c.TOP).j();
            gVar.j(e5.c.BOTTOM).j();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i2, int i10, int i11, int i12) {
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            f fVar = (f) childAt.getLayoutParams();
            e5.g gVar = fVar.p0;
            if (childAt.getVisibility() != 8 || fVar.f6834d0 || fVar.f6836e0 || isInEditMode) {
                int s10 = gVar.s();
                int t5 = gVar.t();
                childAt.layout(s10, t5, gVar.r() + s10, gVar.l() + t5);
            }
        }
        ArrayList arrayList = this.B;
        int size = arrayList.size();
        if (size > 0) {
            for (int i14 = 0; i14 < size; i14++) {
                ((c) arrayList.get(i14)).getClass();
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i2, int i10) {
        boolean z10;
        String str;
        int f8;
        String resourceName;
        int id2;
        e5.g gVar;
        String str2;
        boolean z11 = this.f1159e0;
        this.f1159e0 = z11;
        if (!z11) {
            int childCount = getChildCount();
            int i11 = 0;
            while (true) {
                if (i11 >= childCount) {
                    break;
                } else if (getChildAt(i11).isLayoutRequested()) {
                    this.f1159e0 = true;
                    break;
                } else {
                    i11++;
                }
            }
        }
        boolean j2 = j();
        h hVar = this.L;
        hVar.f4336y0 = j2;
        if (this.f1159e0) {
            this.f1159e0 = false;
            int childCount2 = getChildCount();
            int i12 = 0;
            while (true) {
                if (i12 < childCount2) {
                    if (getChildAt(i12).isLayoutRequested()) {
                        z10 = true;
                        break;
                    }
                    i12++;
                } else {
                    z10 = false;
                    break;
                }
            }
            if (z10) {
                boolean isInEditMode = isInEditMode();
                int childCount3 = getChildCount();
                for (int i13 = 0; i13 < childCount3; i13++) {
                    e5.g h2 = h(getChildAt(i13));
                    if (h2 != null) {
                        h2.D();
                    }
                }
                Object obj = null;
                SparseArray sparseArray = this.A;
                if (isInEditMode) {
                    for (int i14 = 0; i14 < childCount3; i14++) {
                        View childAt = getChildAt(i14);
                        try {
                            resourceName = getResources().getResourceName(childAt.getId());
                            Integer valueOf = Integer.valueOf(childAt.getId());
                            if (resourceName != null) {
                                if (this.f1164j0 == null) {
                                    this.f1164j0 = new HashMap();
                                }
                                int indexOf = resourceName.indexOf("/");
                                if (indexOf != -1) {
                                    str2 = resourceName.substring(indexOf + 1);
                                } else {
                                    str2 = resourceName;
                                }
                                this.f1164j0.put(str2, valueOf);
                            }
                            int indexOf2 = resourceName.indexOf(47);
                            if (indexOf2 != -1) {
                                resourceName = resourceName.substring(indexOf2 + 1);
                            }
                            id2 = childAt.getId();
                        } catch (Resources.NotFoundException unused) {
                        }
                        if (id2 != 0) {
                            View view = (View) sparseArray.get(id2);
                            if (view == null && (view = findViewById(id2)) != null && view != this && view.getParent() == this) {
                                onViewAdded(view);
                            }
                            if (view != this) {
                                if (view == null) {
                                    gVar = null;
                                } else {
                                    gVar = ((f) view.getLayoutParams()).p0;
                                }
                                gVar.f4307j0 = resourceName;
                            }
                        }
                        gVar = hVar;
                        gVar.f4307j0 = resourceName;
                    }
                }
                if (this.f1163i0 != -1) {
                    for (int i15 = 0; i15 < childCount3; i15++) {
                        getChildAt(i15).getId();
                    }
                }
                q qVar = this.f1161g0;
                if (qVar != null) {
                    qVar.c(this);
                }
                hVar.f4331t0.clear();
                ArrayList arrayList = this.B;
                int size = arrayList.size();
                if (size > 0) {
                    int i16 = 0;
                    while (i16 < size) {
                        c cVar = (c) arrayList.get(i16);
                        HashMap hashMap = cVar.f6824d0;
                        if (cVar.isInEditMode()) {
                            cVar.setIds(cVar.f6822b0);
                        }
                        e5.m mVar = cVar.R;
                        if (mVar != null) {
                            mVar.f4368u0 = 0;
                            Arrays.fill(mVar.f4367t0, obj);
                            for (int i17 = 0; i17 < cVar.B; i17++) {
                                int i18 = cVar.A[i17];
                                View view2 = (View) sparseArray.get(i18);
                                if (view2 == null && (f8 = cVar.f(this, (str = (String) hashMap.get(Integer.valueOf(i18))))) != 0) {
                                    cVar.A[i17] = f8;
                                    hashMap.put(Integer.valueOf(f8), str);
                                    view2 = (View) sparseArray.get(f8);
                                }
                                if (view2 != null) {
                                    cVar.R.S(h(view2));
                                }
                            }
                            cVar.R.U();
                        }
                        i16++;
                        obj = null;
                    }
                }
                for (int i19 = 0; i19 < childCount3; i19++) {
                    getChildAt(i19);
                }
                SparseArray sparseArray2 = this.f1165k0;
                sparseArray2.clear();
                sparseArray2.put(0, hVar);
                sparseArray2.put(getId(), hVar);
                for (int i20 = 0; i20 < childCount3; i20++) {
                    View childAt2 = getChildAt(i20);
                    sparseArray2.put(childAt2.getId(), h(childAt2));
                }
                for (int i21 = 0; i21 < childCount3; i21++) {
                    View childAt3 = getChildAt(i21);
                    e5.g h10 = h(childAt3);
                    if (h10 != null) {
                        f fVar = (f) childAt3.getLayoutParams();
                        hVar.f4331t0.add(h10);
                        e5.g gVar2 = h10.U;
                        if (gVar2 != null) {
                            ((h) gVar2).f4331t0.remove(h10);
                            h10.D();
                        }
                        h10.U = hVar;
                        g(isInEditMode, childAt3, h10, fVar, sparseArray2);
                    }
                }
            }
            if (z10) {
                hVar.f4332u0.N(hVar);
            }
        }
        hVar.f4337z0.getClass();
        m(hVar, this.f1160f0, i2, i10);
        l(i2, i10, hVar.r(), hVar.l(), hVar.H0, hVar.I0);
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        e5.g h2 = h(view);
        if ((view instanceof i5.t) && !(h2 instanceof l)) {
            f fVar = (f) view.getLayoutParams();
            l lVar = new l();
            fVar.p0 = lVar;
            fVar.f6834d0 = true;
            lVar.T(fVar.V);
        }
        if (view instanceof c) {
            c cVar = (c) view;
            cVar.k();
            ((f) view.getLayoutParams()).f6836e0 = true;
            ArrayList arrayList = this.B;
            if (!arrayList.contains(cVar)) {
                arrayList.add(cVar);
            }
        }
        this.A.put(view.getId(), view);
        this.f1159e0 = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.A.remove(view.getId());
        e5.g h2 = h(view);
        this.L.f4331t0.remove(h2);
        h2.D();
        this.B.remove(view);
        this.f1159e0 = true;
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        this.f1159e0 = true;
        super.requestLayout();
    }

    public void setConstraintSet(q qVar) {
        this.f1161g0 = qVar;
    }

    @Override // android.view.View
    public void setId(int i2) {
        int id2 = getId();
        SparseArray sparseArray = this.A;
        sparseArray.remove(id2);
        super.setId(i2);
        sparseArray.put(getId(), this);
    }

    public void setMaxHeight(int i2) {
        if (i2 == this.f1158d0) {
            return;
        }
        this.f1158d0 = i2;
        requestLayout();
    }

    public void setMaxWidth(int i2) {
        if (i2 == this.f1157c0) {
            return;
        }
        this.f1157c0 = i2;
        requestLayout();
    }

    public void setMinHeight(int i2) {
        if (i2 == this.f1156b0) {
            return;
        }
        this.f1156b0 = i2;
        requestLayout();
    }

    public void setMinWidth(int i2) {
        if (i2 == this.R) {
            return;
        }
        this.R = i2;
        requestLayout();
    }

    public void setOnConstraintsChanged(s sVar) {
        j jVar = this.f1162h0;
        if (jVar != null) {
            jVar.getClass();
        }
    }

    public void setOptimizationLevel(int i2) {
        this.f1160f0 = i2;
        h hVar = this.L;
        hVar.G0 = i2;
        c5.c.f2588q = hVar.X(512);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.A = new SparseArray();
        this.B = new ArrayList(4);
        this.L = new h();
        this.R = 0;
        this.f1156b0 = 0;
        this.f1157c0 = Preference.DEFAULT_ORDER;
        this.f1158d0 = Preference.DEFAULT_ORDER;
        this.f1159e0 = true;
        this.f1160f0 = 257;
        this.f1161g0 = null;
        this.f1162h0 = null;
        this.f1163i0 = -1;
        this.f1164j0 = new HashMap();
        this.f1165k0 = new SparseArray();
        this.f1166l0 = new g(this, this);
        i(attributeSet, i2);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [i5.f, android.view.ViewGroup$LayoutParams, android.view.ViewGroup$MarginLayoutParams] */
    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        ?? marginLayoutParams = new ViewGroup.MarginLayoutParams(layoutParams);
        marginLayoutParams.f6827a = -1;
        marginLayoutParams.f6829b = -1;
        marginLayoutParams.f6831c = -1.0f;
        marginLayoutParams.f6833d = true;
        marginLayoutParams.f6835e = -1;
        marginLayoutParams.f6837f = -1;
        marginLayoutParams.f6839g = -1;
        marginLayoutParams.f6841h = -1;
        marginLayoutParams.f6843i = -1;
        marginLayoutParams.f6845j = -1;
        marginLayoutParams.f6847k = -1;
        marginLayoutParams.f6849l = -1;
        marginLayoutParams.m = -1;
        marginLayoutParams.f6852n = -1;
        marginLayoutParams.f6854o = -1;
        marginLayoutParams.f6856p = -1;
        marginLayoutParams.f6857q = 0;
        marginLayoutParams.f6858r = 0.0f;
        marginLayoutParams.f6859s = -1;
        marginLayoutParams.f6860t = -1;
        marginLayoutParams.f6861u = -1;
        marginLayoutParams.f6862v = -1;
        marginLayoutParams.f6863w = Integer.MIN_VALUE;
        marginLayoutParams.f6864x = Integer.MIN_VALUE;
        marginLayoutParams.f6865y = Integer.MIN_VALUE;
        marginLayoutParams.f6866z = Integer.MIN_VALUE;
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
        marginLayoutParams.f6828a0 = true;
        marginLayoutParams.f6830b0 = true;
        marginLayoutParams.f6832c0 = false;
        marginLayoutParams.f6834d0 = false;
        marginLayoutParams.f6836e0 = false;
        marginLayoutParams.f6838f0 = -1;
        marginLayoutParams.f6840g0 = -1;
        marginLayoutParams.f6842h0 = -1;
        marginLayoutParams.f6844i0 = -1;
        marginLayoutParams.f6846j0 = Integer.MIN_VALUE;
        marginLayoutParams.f6848k0 = Integer.MIN_VALUE;
        marginLayoutParams.f6850l0 = 0.5f;
        marginLayoutParams.p0 = new e5.g();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams;
            ((ViewGroup.MarginLayoutParams) marginLayoutParams).leftMargin = marginLayoutParams2.leftMargin;
            ((ViewGroup.MarginLayoutParams) marginLayoutParams).rightMargin = marginLayoutParams2.rightMargin;
            ((ViewGroup.MarginLayoutParams) marginLayoutParams).topMargin = marginLayoutParams2.topMargin;
            ((ViewGroup.MarginLayoutParams) marginLayoutParams).bottomMargin = marginLayoutParams2.bottomMargin;
            marginLayoutParams.setMarginStart(marginLayoutParams2.getMarginStart());
            marginLayoutParams.setMarginEnd(marginLayoutParams2.getMarginEnd());
        }
        if (layoutParams instanceof f) {
            f fVar = (f) layoutParams;
            marginLayoutParams.f6827a = fVar.f6827a;
            marginLayoutParams.f6829b = fVar.f6829b;
            marginLayoutParams.f6831c = fVar.f6831c;
            marginLayoutParams.f6833d = fVar.f6833d;
            marginLayoutParams.f6835e = fVar.f6835e;
            marginLayoutParams.f6837f = fVar.f6837f;
            marginLayoutParams.f6839g = fVar.f6839g;
            marginLayoutParams.f6841h = fVar.f6841h;
            marginLayoutParams.f6843i = fVar.f6843i;
            marginLayoutParams.f6845j = fVar.f6845j;
            marginLayoutParams.f6847k = fVar.f6847k;
            marginLayoutParams.f6849l = fVar.f6849l;
            marginLayoutParams.m = fVar.m;
            marginLayoutParams.f6852n = fVar.f6852n;
            marginLayoutParams.f6854o = fVar.f6854o;
            marginLayoutParams.f6856p = fVar.f6856p;
            marginLayoutParams.f6857q = fVar.f6857q;
            marginLayoutParams.f6858r = fVar.f6858r;
            marginLayoutParams.f6859s = fVar.f6859s;
            marginLayoutParams.f6860t = fVar.f6860t;
            marginLayoutParams.f6861u = fVar.f6861u;
            marginLayoutParams.f6862v = fVar.f6862v;
            marginLayoutParams.f6863w = fVar.f6863w;
            marginLayoutParams.f6864x = fVar.f6864x;
            marginLayoutParams.f6865y = fVar.f6865y;
            marginLayoutParams.f6866z = fVar.f6866z;
            marginLayoutParams.A = fVar.A;
            marginLayoutParams.B = fVar.B;
            marginLayoutParams.C = fVar.C;
            marginLayoutParams.D = fVar.D;
            marginLayoutParams.E = fVar.E;
            marginLayoutParams.F = fVar.F;
            marginLayoutParams.G = fVar.G;
            marginLayoutParams.H = fVar.H;
            marginLayoutParams.I = fVar.I;
            marginLayoutParams.J = fVar.J;
            marginLayoutParams.K = fVar.K;
            marginLayoutParams.W = fVar.W;
            marginLayoutParams.X = fVar.X;
            marginLayoutParams.L = fVar.L;
            marginLayoutParams.M = fVar.M;
            marginLayoutParams.N = fVar.N;
            marginLayoutParams.P = fVar.P;
            marginLayoutParams.O = fVar.O;
            marginLayoutParams.Q = fVar.Q;
            marginLayoutParams.R = fVar.R;
            marginLayoutParams.S = fVar.S;
            marginLayoutParams.T = fVar.T;
            marginLayoutParams.U = fVar.U;
            marginLayoutParams.V = fVar.V;
            marginLayoutParams.f6828a0 = fVar.f6828a0;
            marginLayoutParams.f6830b0 = fVar.f6830b0;
            marginLayoutParams.f6832c0 = fVar.f6832c0;
            marginLayoutParams.f6834d0 = fVar.f6834d0;
            marginLayoutParams.f6838f0 = fVar.f6838f0;
            marginLayoutParams.f6840g0 = fVar.f6840g0;
            marginLayoutParams.f6842h0 = fVar.f6842h0;
            marginLayoutParams.f6844i0 = fVar.f6844i0;
            marginLayoutParams.f6846j0 = fVar.f6846j0;
            marginLayoutParams.f6848k0 = fVar.f6848k0;
            marginLayoutParams.f6850l0 = fVar.f6850l0;
            marginLayoutParams.Y = fVar.Y;
            marginLayoutParams.Z = fVar.Z;
            marginLayoutParams.p0 = fVar.p0;
            return marginLayoutParams;
        }
        return marginLayoutParams;
    }
}
