package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.github.junrar.unpack.decode.Compress;
import com.github.junrar.unpack.ppm.RangeCoder;
import com.github.junrar.unpack.ppm.SubAllocator;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.CommonStatusCodes;
import com.google.mlkit.vision.common.InputImage;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParserException;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {
    public static bh6 o0;
    public final SparseArray A;
    public final ArrayList B;
    public final m21 L;
    public int R;
    public int d0;
    public int e0;
    public int f0;
    public boolean g0;
    public int h0;
    public z11 i0;
    public s11 j0;
    public int k0;
    public HashMap l0;
    public final SparseArray m0;
    public final p11 n0;

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A = new SparseArray();
        this.B = new ArrayList(4);
        this.L = new m21();
        this.R = 0;
        this.d0 = 0;
        this.e0 = Integer.MAX_VALUE;
        this.f0 = Integer.MAX_VALUE;
        this.g0 = true;
        this.h0 = Compress.MC20;
        this.i0 = null;
        this.j0 = null;
        this.k0 = -1;
        this.l0 = new HashMap();
        this.m0 = new SparseArray();
        this.n0 = new p11(this, this);
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

    /* JADX WARN: Type inference failed for: r0v2, types: [bh6, java.lang.Object] */
    public static bh6 getSharedValues() {
        if (o0 == null) {
            ?? obj = new Object();
            new SparseIntArray();
            obj.a = new HashMap();
            o0 = obj;
        }
        return o0;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof o11;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList arrayList = this.B;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i = 0; i < size; i++) {
                ((l11) arrayList.get(i)).getClass();
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
        this.g0 = true;
        super.forceLayout();
    }

    /* JADX WARN: Removed duplicated region for block: B:75:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0181  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:148:0x02a9 -> B:149:0x02aa). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(boolean z, View view, l21 l21Var, o11 o11Var, SparseArray sparseArray) {
        l21 l21Var2;
        l21 l21Var3;
        l21 l21Var4;
        l21 l21Var5;
        o11 o11Var2;
        l21 l21Var6;
        float f;
        int i;
        float f2;
        int i2;
        l21 l21Var7 = l21Var;
        o11Var.a();
        l21Var7.h0 = view.getVisibility();
        l21Var7.g0 = view;
        if (view instanceof l11) {
            ((l11) view).j(l21Var7, this.L.y0);
        }
        int i3 = -1;
        if (o11Var.d0) {
            av2 av2Var = (av2) l21Var7;
            int i4 = o11Var.m0;
            int i5 = o11Var.n0;
            float f3 = o11Var.o0;
            int i6 = (f3 > (-1.0f) ? 1 : (f3 == (-1.0f) ? 0 : -1));
            if (i6 != 0) {
                if (i6 > 0) {
                    av2Var.t0 = f3;
                    av2Var.u0 = -1;
                    av2Var.v0 = -1;
                    return;
                }
                return;
            } else if (i4 != -1) {
                if (i4 > -1) {
                    av2Var.t0 = -1.0f;
                    av2Var.u0 = i4;
                    av2Var.v0 = -1;
                    return;
                }
                return;
            } else if (i5 != -1 && i5 > -1) {
                av2Var.t0 = -1.0f;
                av2Var.u0 = -1;
                av2Var.v0 = i5;
                return;
            } else {
                return;
            }
        }
        int i7 = o11Var.f0;
        int i8 = o11Var.g0;
        int i9 = o11Var.h0;
        int i10 = o11Var.i0;
        int i11 = o11Var.j0;
        int i12 = o11Var.k0;
        float f4 = o11Var.l0;
        int i13 = o11Var.p;
        if (i13 != -1) {
            l21 l21Var8 = (l21) sparseArray.get(i13);
            if (l21Var8 != null) {
                float f5 = o11Var.r;
                int i14 = o11Var.q;
                g11 g11Var = g11.CENTER;
                l21Var.w(g11Var, l21Var8, g11Var, i14, 0);
                l21Var7 = l21Var;
                l21Var7.D = f5;
            }
            l21Var6 = l21Var7;
            o11Var2 = o11Var;
        } else {
            if (i7 != -1) {
                l21 l21Var9 = (l21) sparseArray.get(i7);
                if (l21Var9 != null) {
                    g11 g11Var2 = g11.LEFT;
                    l21Var.w(g11Var2, l21Var9, g11Var2, ((ViewGroup.MarginLayoutParams) o11Var).leftMargin, i11);
                }
            } else if (i8 != -1 && (l21Var2 = (l21) sparseArray.get(i8)) != null) {
                l21Var.w(g11.LEFT, l21Var2, g11.RIGHT, ((ViewGroup.MarginLayoutParams) o11Var).leftMargin, i11);
            }
            if (i9 != -1) {
                l21 l21Var10 = (l21) sparseArray.get(i9);
                if (l21Var10 != null) {
                    l21Var.w(g11.RIGHT, l21Var10, g11.LEFT, ((ViewGroup.MarginLayoutParams) o11Var).rightMargin, i12);
                }
            } else if (i10 != -1 && (l21Var3 = (l21) sparseArray.get(i10)) != null) {
                g11 g11Var3 = g11.RIGHT;
                l21Var.w(g11Var3, l21Var3, g11Var3, ((ViewGroup.MarginLayoutParams) o11Var).rightMargin, i12);
            }
            int i15 = o11Var.i;
            if (i15 != -1) {
                l21 l21Var11 = (l21) sparseArray.get(i15);
                if (l21Var11 != null) {
                    g11 g11Var4 = g11.TOP;
                    l21Var.w(g11Var4, l21Var11, g11Var4, ((ViewGroup.MarginLayoutParams) o11Var).topMargin, o11Var.x);
                }
            } else {
                int i16 = o11Var.j;
                if (i16 != -1 && (l21Var4 = (l21) sparseArray.get(i16)) != null) {
                    l21Var.w(g11.TOP, l21Var4, g11.BOTTOM, ((ViewGroup.MarginLayoutParams) o11Var).topMargin, o11Var.x);
                }
            }
            int i17 = o11Var.k;
            if (i17 != -1) {
                l21 l21Var12 = (l21) sparseArray.get(i17);
                if (l21Var12 != null) {
                    l21Var.w(g11.BOTTOM, l21Var12, g11.TOP, ((ViewGroup.MarginLayoutParams) o11Var).bottomMargin, o11Var.z);
                }
            } else {
                int i18 = o11Var.l;
                if (i18 != -1 && (l21Var5 = (l21) sparseArray.get(i18)) != null) {
                    g11 g11Var5 = g11.BOTTOM;
                    l21Var.w(g11Var5, l21Var5, g11Var5, ((ViewGroup.MarginLayoutParams) o11Var).bottomMargin, o11Var.z);
                }
            }
            int i19 = o11Var.m;
            if (i19 != -1) {
                o11Var2 = o11Var;
                n(l21Var, o11Var2, sparseArray, i19, g11.BASELINE);
            } else {
                o11Var2 = o11Var;
                int i20 = o11Var2.n;
                if (i20 != -1) {
                    n(l21Var, o11Var2, sparseArray, i20, g11.TOP);
                } else {
                    int i21 = o11Var2.o;
                    if (i21 != -1) {
                        n(l21Var, o11Var2, sparseArray, i21, g11.BOTTOM);
                        l21Var6 = l21Var;
                        if (f4 >= RecyclerView.B1) {
                            l21Var6.e0 = f4;
                        }
                        f = o11Var2.F;
                        if (f >= RecyclerView.B1) {
                            l21Var6.f0 = f;
                        }
                    }
                }
            }
            l21Var6 = l21Var;
            if (f4 >= RecyclerView.B1) {
            }
            f = o11Var2.F;
            if (f >= RecyclerView.B1) {
            }
        }
        if (z && ((i2 = o11Var2.T) != -1 || o11Var2.U != -1)) {
            int i22 = o11Var2.U;
            l21Var6.Z = i2;
            l21Var6.a0 = i22;
        }
        int i23 = 0;
        if (!o11Var2.a0) {
            if (((ViewGroup.MarginLayoutParams) o11Var2).width == -1) {
                if (o11Var2.W) {
                    l21Var6.N(k21.MATCH_CONSTRAINT);
                } else {
                    l21Var6.N(k21.MATCH_PARENT);
                }
                l21Var6.j(g11.LEFT).g = ((ViewGroup.MarginLayoutParams) o11Var2).leftMargin;
                l21Var6.j(g11.RIGHT).g = ((ViewGroup.MarginLayoutParams) o11Var2).rightMargin;
            } else {
                l21Var6.N(k21.MATCH_CONSTRAINT);
                l21Var6.P(0);
            }
        } else {
            l21Var6.N(k21.FIXED);
            l21Var6.P(((ViewGroup.MarginLayoutParams) o11Var2).width);
            if (((ViewGroup.MarginLayoutParams) o11Var2).width == -2) {
                l21Var6.N(k21.WRAP_CONTENT);
            }
        }
        if (!o11Var2.b0) {
            if (((ViewGroup.MarginLayoutParams) o11Var2).height == -1) {
                if (o11Var2.X) {
                    l21Var6.O(k21.MATCH_CONSTRAINT);
                } else {
                    l21Var6.O(k21.MATCH_PARENT);
                }
                l21Var6.j(g11.TOP).g = ((ViewGroup.MarginLayoutParams) o11Var2).topMargin;
                l21Var6.j(g11.BOTTOM).g = ((ViewGroup.MarginLayoutParams) o11Var2).bottomMargin;
            } else {
                l21Var6.O(k21.MATCH_CONSTRAINT);
                l21Var6.M(0);
            }
        } else {
            l21Var6.O(k21.FIXED);
            l21Var6.M(((ViewGroup.MarginLayoutParams) o11Var2).height);
            if (((ViewGroup.MarginLayoutParams) o11Var2).height == -2) {
                l21Var6.O(k21.WRAP_CONTENT);
            }
        }
        String str = o11Var2.G;
        if (str != null && str.length() != 0) {
            int length = str.length();
            int indexOf = str.indexOf(44);
            if (indexOf > 0 && indexOf < length - 1) {
                String substring = str.substring(0, indexOf);
                if (substring.equalsIgnoreCase("W")) {
                    i3 = 0;
                } else if (substring.equalsIgnoreCase("H")) {
                    i3 = 1;
                }
                i = indexOf + 1;
            } else {
                i = 0;
            }
            int indexOf2 = str.indexOf(58);
            if (indexOf2 >= 0 && indexOf2 < length - 1) {
                String substring2 = str.substring(i, indexOf2);
                String substring3 = str.substring(indexOf2 + 1);
                if (substring2.length() > 0 && substring3.length() > 0) {
                    float parseFloat = Float.parseFloat(substring2);
                    float parseFloat2 = Float.parseFloat(substring3);
                    if (parseFloat > RecyclerView.B1 && parseFloat2 > RecyclerView.B1) {
                        if (i3 == 1) {
                            f2 = Math.abs(parseFloat2 / parseFloat);
                        } else {
                            f2 = Math.abs(parseFloat / parseFloat2);
                        }
                    }
                }
                f2 = 0.0f;
            } else {
                String substring4 = str.substring(i);
                if (substring4.length() > 0) {
                    f2 = Float.parseFloat(substring4);
                }
                f2 = 0.0f;
            }
            if (f2 > RecyclerView.B1) {
                l21Var6.X = f2;
                l21Var6.Y = i3;
            }
        } else {
            l21Var6.X = RecyclerView.B1;
        }
        float f6 = o11Var2.H;
        float[] fArr = l21Var6.m0;
        fArr[0] = f6;
        fArr[1] = o11Var2.I;
        l21Var6.k0 = o11Var2.J;
        l21Var6.l0 = o11Var2.K;
        int i24 = o11Var2.Z;
        if (i24 >= 0 && i24 <= 3) {
            l21Var6.q = i24;
        }
        int i25 = o11Var2.L;
        int i26 = o11Var2.N;
        int i27 = o11Var2.P;
        float f7 = o11Var2.R;
        l21Var6.r = i25;
        l21Var6.u = i26;
        if (i27 == Integer.MAX_VALUE) {
            i27 = 0;
        }
        l21Var6.v = i27;
        l21Var6.w = f7;
        if (f7 > RecyclerView.B1 && f7 < 1.0f && i25 == 0) {
            l21Var6.r = 2;
        }
        int i28 = o11Var2.M;
        int i29 = o11Var2.O;
        int i30 = o11Var2.Q;
        float f8 = o11Var2.S;
        l21Var6.s = i28;
        l21Var6.x = i29;
        if (i30 != Integer.MAX_VALUE) {
            i23 = i30;
        }
        l21Var6.y = i23;
        l21Var6.z = f8;
        if (f8 > RecyclerView.B1 && f8 < 1.0f && i28 == 0) {
            l21Var6.s = 2;
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new o11();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.view.ViewGroup$LayoutParams, android.view.ViewGroup$MarginLayoutParams, java.lang.Object, o11] */
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
        marginLayoutParams.r = RecyclerView.B1;
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
        marginLayoutParams.p0 = new l21();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e75.b);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            int i2 = n11.a.get(index);
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
                    if (f < RecyclerView.B1) {
                        marginLayoutParams.r = (360.0f - f) % 360.0f;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    marginLayoutParams.a = obtainStyledAttributes.getDimensionPixelOffset(index, marginLayoutParams.a);
                    break;
                case 6:
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
                case 12:
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
                case 15:
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
                case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                    marginLayoutParams.w = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.w);
                    break;
                case 22:
                    marginLayoutParams.x = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.x);
                    break;
                case ConnectionResult.API_DISABLED /* 23 */:
                    marginLayoutParams.y = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.y);
                    break;
                case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                    marginLayoutParams.z = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.z);
                    break;
                case 25:
                    marginLayoutParams.A = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.A);
                    break;
                case SubAllocator.N4 /* 26 */:
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
                case InputImage.IMAGE_FORMAT_YUV_420_888 /* 35 */:
                    marginLayoutParams.R = Math.max((float) RecyclerView.B1, obtainStyledAttributes.getFloat(index, marginLayoutParams.R));
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
                case SubAllocator.N_INDEXES /* 38 */:
                    marginLayoutParams.S = Math.max((float) RecyclerView.B1, obtainStyledAttributes.getFloat(index, marginLayoutParams.S));
                    marginLayoutParams.M = 2;
                    break;
                default:
                    switch (i2) {
                        case 44:
                            z11.n(marginLayoutParams, obtainStyledAttributes.getString(index));
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
                        case Compress.DC20 /* 48 */:
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
                                    z11.m(marginLayoutParams, obtainStyledAttributes, index, 0);
                                    continue;
                                case 65:
                                    z11.m(marginLayoutParams, obtainStyledAttributes, index, 1);
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
        return this.f0;
    }

    public int getMaxWidth() {
        return this.e0;
    }

    public int getMinHeight() {
        return this.d0;
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
        m21 m21Var = this.L;
        if (m21Var.j == null) {
            int id2 = getId();
            if (id2 != -1) {
                m21Var.j = getContext().getResources().getResourceEntryName(id2);
            } else {
                m21Var.j = "parent";
            }
        }
        if (m21Var.j0 == null) {
            m21Var.j0 = m21Var.j;
            Log.v("ConstraintLayout", " setDebugName " + m21Var.j0);
        }
        ArrayList arrayList = m21Var.t0;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            l21 l21Var = (l21) obj;
            View view = l21Var.g0;
            if (view != null) {
                if (l21Var.j == null && (id = view.getId()) != -1) {
                    l21Var.j = getContext().getResources().getResourceEntryName(id);
                }
                if (l21Var.j0 == null) {
                    l21Var.j0 = l21Var.j;
                    Log.v("ConstraintLayout", " setDebugName " + l21Var.j0);
                }
            }
        }
        m21Var.o(sb);
        return sb.toString();
    }

    public final l21 h(View view) {
        if (view == this) {
            return this.L;
        }
        if (view != null) {
            if (view.getLayoutParams() instanceof o11) {
                return ((o11) view.getLayoutParams()).p0;
            }
            view.setLayoutParams(generateLayoutParams(view.getLayoutParams()));
            if (view.getLayoutParams() instanceof o11) {
                return ((o11) view.getLayoutParams()).p0;
            }
            return null;
        }
        return null;
    }

    public final void i(AttributeSet attributeSet, int i) {
        m21 m21Var = this.L;
        m21Var.g0 = this;
        p11 p11Var = this.n0;
        m21Var.x0 = p11Var;
        m21Var.v0.h = p11Var;
        this.A.put(getId(), this);
        this.i0 = null;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, e75.b, i, 0);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                if (index == 16) {
                    this.R = obtainStyledAttributes.getDimensionPixelOffset(index, this.R);
                } else if (index == 17) {
                    this.d0 = obtainStyledAttributes.getDimensionPixelOffset(index, this.d0);
                } else if (index == 14) {
                    this.e0 = obtainStyledAttributes.getDimensionPixelOffset(index, this.e0);
                } else if (index == 15) {
                    this.f0 = obtainStyledAttributes.getDimensionPixelOffset(index, this.f0);
                } else if (index == 113) {
                    this.h0 = obtainStyledAttributes.getInt(index, this.h0);
                } else if (index == 56) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            k(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.j0 = null;
                        }
                    }
                } else if (index == 34) {
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, 0);
                    try {
                        z11 z11Var = new z11();
                        this.i0 = z11Var;
                        z11Var.j(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.i0 = null;
                    }
                    this.k0 = resourceId2;
                }
            }
            obtainStyledAttributes.recycle();
        }
        m21Var.G0 = this.h0;
        jv3.q = m21Var.X(512);
    }

    public final boolean j() {
        if ((getContext().getApplicationInfo().flags & Compress.MAXWINSIZE) != 0 && 1 == getLayoutDirection()) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0087, code lost:
        continue;
     */
    /* JADX WARN: Type inference failed for: r0v0, types: [s11, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void k(int i) {
        String str;
        Context context = getContext();
        ?? obj = new Object();
        obj.a = -1;
        obj.b = -1;
        obj.d = new SparseArray();
        obj.e = new SparseArray();
        obj.c = this;
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            q11 q11Var = null;
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType != 2) {
                    continue;
                } else {
                    String name = xml.getName();
                    switch (name.hashCode()) {
                        case -1349929691:
                            if (name.equals("ConstraintSet")) {
                                obj.b(context, xml);
                                continue;
                            } else {
                                continue;
                            }
                        case 80204913:
                            if (name.equals("State")) {
                                q11 q11Var2 = new q11(context, xml);
                                ((SparseArray) obj.d).put(q11Var2.a, q11Var2);
                                q11Var = q11Var2;
                                continue;
                            } else {
                                continue;
                            }
                        case 1382829617:
                            str = "StateSet";
                            name.equals(str);
                            continue;
                        case 1657696882:
                            str = "layoutDescription";
                            name.equals(str);
                            continue;
                        case 1901439077:
                            if (name.equals("Variant")) {
                                r11 r11Var = new r11(context, xml);
                                if (q11Var != null) {
                                    q11Var.b.add(r11Var);
                                    continue;
                                } else {
                                    continue;
                                }
                            } else {
                                continue;
                            }
                    }
                }
            }
        } catch (IOException e) {
            Log.e("ConstraintLayoutStates", "Error parsing resource: " + i, e);
        } catch (XmlPullParserException e2) {
            Log.e("ConstraintLayoutStates", "Error parsing resource: " + i, e2);
        }
        this.j0 = obj;
    }

    public final void l(int i, int i2, int i3, int i4, boolean z, boolean z2) {
        p11 p11Var = this.n0;
        int i5 = p11Var.e;
        int resolveSizeAndState = View.resolveSizeAndState(i3 + p11Var.d, i, 0);
        int min = Math.min(this.e0, resolveSizeAndState & 16777215);
        int min2 = Math.min(this.f0, View.resolveSizeAndState(i4 + i5, i2, 0) & 16777215);
        if (z) {
            min |= RangeCoder.TOP;
        }
        if (z2) {
            min2 |= RangeCoder.TOP;
        }
        setMeasuredDimension(min, min2);
    }

    public final void m(m21 m21Var, int i, int i2, int i3) {
        k21 k21Var;
        k21 k21Var2;
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
        p11 p11Var;
        int i8;
        boolean z5;
        boolean z6;
        boolean z7;
        int i9;
        p11 p11Var2;
        int i10;
        boolean z8;
        boolean z9;
        boolean z10;
        p11 p11Var3;
        int i11;
        boolean z11;
        boolean z12;
        ly2 ly2Var;
        lm7 lm7Var;
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
        p11 p11Var4 = this.n0;
        p11Var4.b = max2;
        p11Var4.c = max3;
        p11Var4.d = paddingWidth;
        p11Var4.e = i16;
        p11Var4.f = i2;
        p11Var4.g = i3;
        int max4 = Math.max(0, getPaddingStart());
        int max5 = Math.max(0, getPaddingEnd());
        if (max4 <= 0 && max5 <= 0) {
            max4 = Math.max(0, getPaddingLeft());
        } else if (j()) {
            max4 = max5;
        }
        int i17 = size - paddingWidth;
        int i18 = size2 - i16;
        int i19 = p11Var4.e;
        int i20 = p11Var4.d;
        k21 k21Var3 = k21.FIXED;
        int childCount = getChildCount();
        if (mode != Integer.MIN_VALUE) {
            if (mode != 0) {
                if (mode != 1073741824) {
                    i5 = 0;
                } else {
                    i5 = Math.min(this.e0 - i20, i17);
                }
                i4 = Integer.MIN_VALUE;
                k21Var2 = k21Var3;
            } else {
                k21Var = k21.WRAP_CONTENT;
                if (childCount == 0) {
                    max = Math.max(0, this.R);
                    int i21 = max;
                    k21Var2 = k21Var;
                    i5 = i21;
                    i4 = Integer.MIN_VALUE;
                } else {
                    i5 = 0;
                    i4 = Integer.MIN_VALUE;
                    k21Var2 = k21Var;
                }
            }
        } else {
            k21Var = k21.WRAP_CONTENT;
            if (childCount == 0) {
                max = Math.max(0, this.R);
                int i212 = max;
                k21Var2 = k21Var;
                i5 = i212;
                i4 = Integer.MIN_VALUE;
            } else {
                k21Var2 = k21Var;
                i4 = Integer.MIN_VALUE;
                i5 = i17;
            }
        }
        if (mode2 != i4) {
            if (mode2 != 0) {
                if (mode2 == 1073741824) {
                    i6 = Math.min(this.f0 - i19, i18);
                }
                i6 = 0;
            } else {
                k21Var3 = k21.WRAP_CONTENT;
                if (childCount == 0) {
                    i6 = Math.max(0, this.d0);
                }
                i6 = 0;
            }
        } else {
            k21Var3 = k21.WRAP_CONTENT;
            if (childCount == 0) {
                i6 = Math.max(0, this.d0);
            } else {
                i6 = i18;
            }
        }
        int r = m21Var.r();
        ai1 ai1Var = m21Var.v0;
        if (i5 != r || i6 != m21Var.l()) {
            ai1Var.c = true;
        }
        m21Var.Z = 0;
        m21Var.a0 = 0;
        int[] iArr = m21Var.C;
        iArr[0] = this.e0 - i20;
        iArr[1] = this.f0 - i19;
        m21Var.c0 = 0;
        m21Var.d0 = 0;
        m21Var.N(k21Var2);
        m21Var.P(i5);
        m21Var.O(k21Var3);
        m21Var.M(i6);
        int i22 = this.R - i20;
        if (i22 < 0) {
            m21Var.c0 = 0;
        } else {
            m21Var.c0 = i22;
        }
        int i23 = this.d0 - i19;
        if (i23 < 0) {
            m21Var.d0 = 0;
        } else {
            m21Var.d0 = i23;
        }
        m21Var.A0 = max4;
        m21Var.B0 = max2;
        bt btVar = m21Var.u0;
        m21 m21Var2 = (m21) btVar.R;
        ArrayList arrayList2 = (ArrayList) btVar.B;
        p11 p11Var5 = m21Var.x0;
        int size3 = m21Var.t0.size();
        int r2 = m21Var.r();
        int l = m21Var.l();
        boolean v = n16.v(i, 128);
        if (!v && !n16.v(i, 64)) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            int i24 = 0;
            while (i24 < size3) {
                boolean z20 = z;
                l21 l21Var = (l21) m21Var.t0.get(i24);
                i7 = size3;
                k21[] k21VarArr = l21Var.T;
                k21 k21Var4 = k21VarArr[0];
                int i25 = i24;
                k21 k21Var5 = k21.MATCH_CONSTRAINT;
                if (k21Var4 == k21Var5) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                if (k21VarArr[1] == k21Var5) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                if (z17 && z18 && l21Var.X > RecyclerView.B1) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                if ((l21Var.y() && z19) || ((l21Var.z() && z19) || (l21Var instanceof rq7) || l21Var.y() || l21Var.z())) {
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
        if ((mode == 1073741824 && mode2 == 1073741824) || v) {
            z3 = true;
        } else {
            z3 = false;
        }
        boolean z21 = z2 & z3;
        if (z21) {
            int min = Math.min(m21Var.C[0], i17);
            int min2 = Math.min(m21Var.C[1], i18);
            if (mode == 1073741824 && m21Var.r() != min) {
                m21Var.P(min);
                z13 = true;
                ai1Var.b = true;
            } else {
                z13 = true;
            }
            if (mode2 == 1073741824 && m21Var.l() != min2) {
                m21Var.M(min2);
                ai1Var.b = z13;
            }
            if (mode == 1073741824 && mode2 == 1073741824) {
                ArrayList arrayList3 = (ArrayList) ai1Var.f;
                m21 m21Var3 = (m21) ai1Var.d;
                if (!ai1Var.b && !ai1Var.c) {
                    z4 = z21;
                    i14 = 0;
                } else {
                    ArrayList arrayList4 = m21Var3.t0;
                    int size4 = arrayList4.size();
                    z4 = z21;
                    int i26 = 0;
                    while (i26 < size4) {
                        Object obj = arrayList4.get(i26);
                        int i27 = i26 + 1;
                        l21 l21Var2 = (l21) obj;
                        l21Var2.i();
                        l21Var2.a = false;
                        l21Var2.d.n();
                        l21Var2.e.m();
                        arrayList4 = arrayList4;
                        i26 = i27;
                    }
                    m21Var3.i();
                    i14 = 0;
                    m21Var3.a = false;
                    m21Var3.d.n();
                    m21Var3.e.m();
                    ai1Var.c = false;
                }
                ai1Var.c((m21) ai1Var.e);
                m21Var3.Z = i14;
                m21Var3.a0 = i14;
                k21 k = m21Var3.k(i14);
                k21 k2 = m21Var3.k(1);
                if (ai1Var.b) {
                    ai1Var.d();
                }
                int s = m21Var3.s();
                p11Var = p11Var5;
                int t = m21Var3.t();
                arrayList = arrayList2;
                m21Var3.d.h.d(s);
                m21Var3.e.h.d(t);
                ai1Var.i();
                k21 k21Var6 = k21.WRAP_CONTENT;
                if (k != k21Var6 && k2 != k21Var6) {
                    i15 = t;
                } else {
                    if (v) {
                        int size5 = arrayList3.size();
                        i15 = t;
                        int i28 = 0;
                        while (true) {
                            if (i28 >= size5) {
                                break;
                            }
                            Object obj2 = arrayList3.get(i28);
                            i28++;
                            if (!((ct7) obj2).k()) {
                                v = false;
                                break;
                            }
                        }
                    } else {
                        i15 = t;
                    }
                    if (v && k == k21.WRAP_CONTENT) {
                        m21Var3.N(k21.FIXED);
                        m21Var3.P(ai1Var.e(m21Var3, 0));
                        m21Var3.d.e.d(m21Var3.r());
                    }
                    if (v && k2 == k21.WRAP_CONTENT) {
                        m21Var3.O(k21.FIXED);
                        m21Var3.M(ai1Var.e(m21Var3, 1));
                        m21Var3.e.e.d(m21Var3.l());
                    }
                }
                k21 k21Var7 = m21Var3.T[0];
                k21 k21Var8 = k21.FIXED;
                if (k21Var7 != k21Var8 && k21Var7 != k21.MATCH_PARENT) {
                    z16 = false;
                } else {
                    int r3 = m21Var3.r() + s;
                    m21Var3.d.i.d(r3);
                    m21Var3.d.e.d(r3 - s);
                    ai1Var.i();
                    k21 k21Var9 = m21Var3.T[1];
                    if (k21Var9 == k21Var8 || k21Var9 == k21.MATCH_PARENT) {
                        int l2 = m21Var3.l() + i15;
                        m21Var3.e.i.d(l2);
                        m21Var3.e.e.d(l2 - i15);
                    }
                    ai1Var.i();
                    z16 = true;
                }
                int size6 = arrayList3.size();
                int i29 = 0;
                while (i29 < size6) {
                    Object obj3 = arrayList3.get(i29);
                    i29++;
                    ct7 ct7Var = (ct7) obj3;
                    if (ct7Var.b != m21Var3 || ct7Var.g) {
                        ct7Var.e();
                    }
                }
                int size7 = arrayList3.size();
                int i30 = 0;
                while (i30 < size7) {
                    Object obj4 = arrayList3.get(i30);
                    i30++;
                    ct7 ct7Var2 = (ct7) obj4;
                    if (z16 || ct7Var2.b != m21Var3) {
                        if (!ct7Var2.h.j || ((!ct7Var2.i.j && !(ct7Var2 instanceof bv2)) || (!ct7Var2.e.j && !(ct7Var2 instanceof kl0) && !(ct7Var2 instanceof bv2)))) {
                            z5 = false;
                            break;
                        }
                    }
                }
                z5 = true;
                m21Var3.N(k);
                m21Var3.O(k2);
                i8 = 2;
                i13 = 1073741824;
            } else {
                z4 = z21;
                arrayList = arrayList2;
                p11Var = p11Var5;
                m21 m21Var4 = (m21) ai1Var.d;
                if (ai1Var.b) {
                    ArrayList arrayList5 = m21Var4.t0;
                    int size8 = arrayList5.size();
                    int i31 = 0;
                    while (i31 < size8) {
                        Object obj5 = arrayList5.get(i31);
                        i31++;
                        l21 l21Var3 = (l21) obj5;
                        l21Var3.i();
                        l21Var3.a = false;
                        ly2 ly2Var2 = l21Var3.d;
                        ArrayList arrayList6 = arrayList5;
                        ly2Var2.e.j = false;
                        ly2Var2.g = false;
                        ly2Var2.n();
                        lm7 lm7Var2 = l21Var3.e;
                        lm7Var2.e.j = false;
                        lm7Var2.g = false;
                        lm7Var2.m();
                        arrayList5 = arrayList6;
                    }
                    i12 = 0;
                    m21Var4.i();
                    m21Var4.a = false;
                    ly2 ly2Var3 = m21Var4.d;
                    ly2Var3.e.j = false;
                    ly2Var3.g = false;
                    ly2Var3.n();
                    lm7 lm7Var3 = m21Var4.e;
                    lm7Var3.e.j = false;
                    lm7Var3.g = false;
                    lm7Var3.m();
                    ai1Var.d();
                } else {
                    i12 = 0;
                }
                ai1Var.c((m21) ai1Var.e);
                m21Var4.Z = i12;
                m21Var4.a0 = i12;
                m21Var4.d.h.d(i12);
                m21Var4.e.h.d(i12);
                i13 = 1073741824;
                if (mode == 1073741824) {
                    z5 = m21Var.U(i12, v);
                    i8 = 1;
                } else {
                    i8 = 0;
                    z5 = true;
                }
                if (mode2 == 1073741824) {
                    z5 &= m21Var.U(1, v);
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
                m21Var.Q(z14, z15);
            }
        } else {
            z4 = z21;
            arrayList = arrayList2;
            p11Var = p11Var5;
            i8 = 0;
            z5 = false;
        }
        if (z5 && i8 == 2) {
            return;
        }
        int i32 = m21Var.G0;
        if (i7 > 0) {
            int size9 = m21Var.t0.size();
            boolean X = m21Var.X(64);
            p11 p11Var6 = m21Var.x0;
            for (int i33 = 0; i33 < size9; i33++) {
                l21 l21Var4 = (l21) m21Var.t0.get(i33);
                if (!(l21Var4 instanceof av2) && !(l21Var4 instanceof a20) && !l21Var4.F && (!X || (ly2Var = l21Var4.d) == null || (lm7Var = l21Var4.e) == null || !ly2Var.e.j || !lm7Var.e.j)) {
                    k21 k3 = l21Var4.k(0);
                    k21 k4 = l21Var4.k(1);
                    k21 k21Var10 = k21.MATCH_CONSTRAINT;
                    if (k3 == k21Var10 && l21Var4.r != 1 && k4 == k21Var10 && l21Var4.s != 1) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (!z12 && m21Var.X(1) && !(l21Var4 instanceof rq7)) {
                        if (k3 == k21Var10 && l21Var4.r == 0 && k4 != k21Var10 && !l21Var4.y()) {
                            z12 = true;
                        }
                        if (k4 == k21Var10 && l21Var4.s == 0 && k3 != k21Var10 && !l21Var4.y()) {
                            z12 = true;
                        }
                        if ((k3 == k21Var10 || k4 == k21Var10) && l21Var4.X > RecyclerView.B1) {
                            z12 = true;
                        }
                    }
                    if (!z12) {
                        btVar.P(0, p11Var6, l21Var4);
                    }
                }
            }
            ConstraintLayout constraintLayout = p11Var6.a;
            int childCount2 = constraintLayout.getChildCount();
            ArrayList arrayList7 = constraintLayout.B;
            for (int i34 = 0; i34 < childCount2; i34++) {
                constraintLayout.getChildAt(i34);
            }
            int size10 = arrayList7.size();
            if (size10 > 0) {
                for (int i35 = 0; i35 < size10; i35++) {
                    ((l11) arrayList7.get(i35)).getClass();
                }
            }
        }
        btVar.a0(m21Var);
        int size11 = arrayList.size();
        if (i7 > 0) {
            btVar.Z(m21Var, 0, r2, l);
        }
        if (size11 > 0) {
            k21[] k21VarArr2 = m21Var.T;
            k21 k21Var11 = k21VarArr2[0];
            k21 k21Var12 = k21.WRAP_CONTENT;
            if (k21Var11 == k21Var12) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (k21VarArr2[1] == k21Var12) {
                z7 = true;
            } else {
                z7 = false;
            }
            int max6 = Math.max(m21Var.r(), m21Var2.c0);
            int max7 = Math.max(m21Var.l(), m21Var2.d0);
            int i36 = 0;
            boolean z22 = false;
            while (i36 < size11) {
                ArrayList arrayList8 = arrayList;
                l21 l21Var5 = (l21) arrayList8.get(i36);
                if (!(l21Var5 instanceof rq7)) {
                    z9 = z7;
                    z10 = z6;
                    p11Var3 = p11Var;
                } else {
                    int r4 = l21Var5.r();
                    int l3 = l21Var5.l();
                    z9 = z7;
                    z10 = z6;
                    p11Var3 = p11Var;
                    boolean P = z22 | btVar.P(1, p11Var3, l21Var5);
                    int r5 = l21Var5.r();
                    int l4 = l21Var5.l();
                    if (r5 != r4) {
                        l21Var5.P(r5);
                        if (z10 && l21Var5.s() + l21Var5.V > max6) {
                            max6 = Math.max(max6, l21Var5.j(g11.RIGHT).e() + l21Var5.s() + l21Var5.V);
                        }
                        i11 = max6;
                        z11 = true;
                    } else {
                        i11 = max6;
                        z11 = P;
                    }
                    if (l4 != l3) {
                        l21Var5.M(l4);
                        if (z9 && l21Var5.t() + l21Var5.W > max7) {
                            max7 = Math.max(max7, l21Var5.j(g11.BOTTOM).e() + l21Var5.t() + l21Var5.W);
                        }
                        z11 = true;
                    }
                    boolean z23 = ((rq7) l21Var5).B0 | z11;
                    max6 = i11;
                    z22 = z23;
                }
                i36++;
                z6 = z10;
                p11Var = p11Var3;
                arrayList = arrayList8;
                z7 = z9;
            }
            boolean z24 = z7;
            boolean z25 = z6;
            ArrayList arrayList9 = arrayList;
            int i37 = 0;
            while (true) {
                p11 p11Var7 = p11Var;
                if (i37 >= 2) {
                    break;
                }
                int i38 = 0;
                while (i38 < size11) {
                    l21 l21Var6 = (l21) arrayList9.get(i38);
                    if (((l21Var6 instanceof gx2) && !(l21Var6 instanceof rq7)) || (l21Var6 instanceof av2) || l21Var6.h0 == 8 || ((z4 && l21Var6.d.e.j && l21Var6.e.e.j) || (l21Var6 instanceof rq7))) {
                        i9 = size11;
                        p11Var2 = p11Var7;
                        i10 = i37;
                    } else {
                        int r6 = l21Var6.r();
                        int l5 = l21Var6.l();
                        i9 = size11;
                        int i39 = l21Var6.b0;
                        boolean z26 = z22;
                        int i40 = 1;
                        if (i37 == 1) {
                            i40 = 2;
                        }
                        boolean P2 = z26 | btVar.P(i40, p11Var7, l21Var6);
                        p11Var2 = p11Var7;
                        int r7 = l21Var6.r();
                        i10 = i37;
                        int l6 = l21Var6.l();
                        if (r7 != r6) {
                            l21Var6.P(r7);
                            if (z25 && l21Var6.s() + l21Var6.V > max6) {
                                max6 = Math.max(max6, l21Var6.j(g11.RIGHT).e() + l21Var6.s() + l21Var6.V);
                            }
                            z8 = true;
                        } else {
                            z8 = P2;
                        }
                        if (l6 != l5) {
                            l21Var6.M(l6);
                            if (z24 && l21Var6.t() + l21Var6.W > max7) {
                                max7 = Math.max(max7, l21Var6.j(g11.BOTTOM).e() + l21Var6.t() + l21Var6.W);
                            }
                            z8 = true;
                        }
                        if (l21Var6.E && i39 != l21Var6.b0) {
                            z22 = true;
                        } else {
                            z22 = z8;
                        }
                    }
                    i38++;
                    size11 = i9;
                    p11Var7 = p11Var2;
                    i37 = i10;
                }
                int i41 = size11;
                p11Var = p11Var7;
                int i42 = i37;
                if (!z22) {
                    break;
                }
                i37 = i42 + 1;
                btVar.Z(m21Var, i37, r2, l);
                size11 = i41;
                z22 = false;
            }
        }
        m21Var.G0 = i32;
        jv3.q = m21Var.X(512);
    }

    public final void n(l21 l21Var, o11 o11Var, SparseArray sparseArray, int i, g11 g11Var) {
        View view = (View) this.A.get(i);
        l21 l21Var2 = (l21) sparseArray.get(i);
        if (l21Var2 != null && view != null && (view.getLayoutParams() instanceof o11)) {
            o11Var.c0 = true;
            g11 g11Var2 = g11.BASELINE;
            if (g11Var == g11Var2) {
                o11 o11Var2 = (o11) view.getLayoutParams();
                o11Var2.c0 = true;
                o11Var2.p0.E = true;
            }
            l21Var.j(g11Var2).b(l21Var2.j(g11Var), o11Var.D, o11Var.C, true);
            l21Var.E = true;
            l21Var.j(g11.TOP).j();
            l21Var.j(g11.BOTTOM).j();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            o11 o11Var = (o11) childAt.getLayoutParams();
            l21 l21Var = o11Var.p0;
            if (childAt.getVisibility() != 8 || o11Var.d0 || o11Var.e0 || isInEditMode) {
                int s = l21Var.s();
                int t = l21Var.t();
                childAt.layout(s, t, l21Var.r() + s, l21Var.l() + t);
            }
        }
        ArrayList arrayList = this.B;
        int size = arrayList.size();
        if (size > 0) {
            for (int i6 = 0; i6 < size; i6++) {
                ((l11) arrayList.get(i6)).getClass();
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
        l21 l21Var;
        String str2;
        boolean z2 = this.g0;
        this.g0 = z2;
        if (!z2) {
            int childCount = getChildCount();
            int i3 = 0;
            while (true) {
                if (i3 >= childCount) {
                    break;
                } else if (getChildAt(i3).isLayoutRequested()) {
                    this.g0 = true;
                    break;
                } else {
                    i3++;
                }
            }
        }
        boolean j = j();
        m21 m21Var = this.L;
        m21Var.y0 = j;
        if (this.g0) {
            this.g0 = false;
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
                    l21 h = h(getChildAt(i5));
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
                                if (this.l0 == null) {
                                    this.l0 = new HashMap();
                                }
                                int indexOf = resourceName.indexOf("/");
                                if (indexOf != -1) {
                                    str2 = resourceName.substring(indexOf + 1);
                                } else {
                                    str2 = resourceName;
                                }
                                this.l0.put(str2, valueOf);
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
                                    l21Var = null;
                                } else {
                                    l21Var = ((o11) view.getLayoutParams()).p0;
                                }
                                l21Var.j0 = resourceName;
                            }
                        }
                        l21Var = m21Var;
                        l21Var.j0 = resourceName;
                    }
                }
                if (this.k0 != -1) {
                    for (int i7 = 0; i7 < childCount3; i7++) {
                        getChildAt(i7).getId();
                    }
                }
                z11 z11Var = this.i0;
                if (z11Var != null) {
                    z11Var.c(this);
                }
                m21Var.t0.clear();
                ArrayList arrayList = this.B;
                int size = arrayList.size();
                if (size > 0) {
                    int i8 = 0;
                    while (i8 < size) {
                        l11 l11Var = (l11) arrayList.get(i8);
                        HashMap hashMap = l11Var.f0;
                        if (l11Var.isInEditMode()) {
                            l11Var.setIds(l11Var.d0);
                        }
                        gx2 gx2Var = l11Var.R;
                        if (gx2Var != null) {
                            gx2Var.u0 = 0;
                            Arrays.fill(gx2Var.t0, obj);
                            for (int i9 = 0; i9 < l11Var.B; i9++) {
                                int i10 = l11Var.A[i9];
                                View view2 = (View) sparseArray.get(i10);
                                if (view2 == null && (f = l11Var.f(this, (str = (String) hashMap.get(Integer.valueOf(i10))))) != 0) {
                                    l11Var.A[i9] = f;
                                    hashMap.put(Integer.valueOf(f), str);
                                    view2 = (View) sparseArray.get(f);
                                }
                                if (view2 != null) {
                                    l11Var.R.S(h(view2));
                                }
                            }
                            l11Var.R.U();
                        }
                        i8++;
                        obj = null;
                    }
                }
                for (int i11 = 0; i11 < childCount3; i11++) {
                    getChildAt(i11);
                }
                SparseArray sparseArray2 = this.m0;
                sparseArray2.clear();
                sparseArray2.put(0, m21Var);
                sparseArray2.put(getId(), m21Var);
                for (int i12 = 0; i12 < childCount3; i12++) {
                    View childAt2 = getChildAt(i12);
                    sparseArray2.put(childAt2.getId(), h(childAt2));
                }
                for (int i13 = 0; i13 < childCount3; i13++) {
                    View childAt3 = getChildAt(i13);
                    l21 h2 = h(childAt3);
                    if (h2 != null) {
                        o11 o11Var = (o11) childAt3.getLayoutParams();
                        m21Var.t0.add(h2);
                        l21 l21Var2 = h2.U;
                        if (l21Var2 != null) {
                            ((m21) l21Var2).t0.remove(h2);
                            h2.D();
                        }
                        h2.U = m21Var;
                        g(isInEditMode, childAt3, h2, o11Var, sparseArray2);
                    }
                }
            }
            if (z) {
                m21Var.u0.a0(m21Var);
            }
        }
        m21Var.z0.getClass();
        m(m21Var, this.h0, i, i2);
        l(i, i2, m21Var.r(), m21Var.l(), m21Var.H0, m21Var.I0);
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        l21 h = h(view);
        if ((view instanceof zu2) && !(h instanceof av2)) {
            o11 o11Var = (o11) view.getLayoutParams();
            av2 av2Var = new av2();
            o11Var.p0 = av2Var;
            o11Var.d0 = true;
            av2Var.T(o11Var.V);
        }
        if (view instanceof l11) {
            l11 l11Var = (l11) view;
            l11Var.k();
            ((o11) view.getLayoutParams()).e0 = true;
            ArrayList arrayList = this.B;
            if (!arrayList.contains(l11Var)) {
                arrayList.add(l11Var);
            }
        }
        this.A.put(view.getId(), view);
        this.g0 = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.A.remove(view.getId());
        l21 h = h(view);
        this.L.t0.remove(h);
        h.D();
        this.B.remove(view);
        this.g0 = true;
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        this.g0 = true;
        super.requestLayout();
    }

    public void setConstraintSet(z11 z11Var) {
        this.i0 = z11Var;
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
        if (i == this.f0) {
            return;
        }
        this.f0 = i;
        requestLayout();
    }

    public void setMaxWidth(int i) {
        if (i == this.e0) {
            return;
        }
        this.e0 = i;
        requestLayout();
    }

    public void setMinHeight(int i) {
        if (i == this.d0) {
            return;
        }
        this.d0 = i;
        requestLayout();
    }

    public void setMinWidth(int i) {
        if (i == this.R) {
            return;
        }
        this.R = i;
        requestLayout();
    }

    public void setOnConstraintsChanged(r21 r21Var) {
        s11 s11Var = this.j0;
        if (s11Var != null) {
            s11Var.getClass();
        }
    }

    public void setOptimizationLevel(int i) {
        this.h0 = i;
        m21 m21Var = this.L;
        m21Var.G0 = i;
        jv3.q = m21Var.X(512);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A = new SparseArray();
        this.B = new ArrayList(4);
        this.L = new m21();
        this.R = 0;
        this.d0 = 0;
        this.e0 = Integer.MAX_VALUE;
        this.f0 = Integer.MAX_VALUE;
        this.g0 = true;
        this.h0 = Compress.MC20;
        this.i0 = null;
        this.j0 = null;
        this.k0 = -1;
        this.l0 = new HashMap();
        this.m0 = new SparseArray();
        this.n0 = new p11(this, this);
        i(attributeSet, i);
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [android.view.ViewGroup$LayoutParams, android.view.ViewGroup$MarginLayoutParams, o11] */
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
        marginLayoutParams.r = RecyclerView.B1;
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
        marginLayoutParams.p0 = new l21();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams;
            ((ViewGroup.MarginLayoutParams) marginLayoutParams).leftMargin = marginLayoutParams2.leftMargin;
            ((ViewGroup.MarginLayoutParams) marginLayoutParams).rightMargin = marginLayoutParams2.rightMargin;
            ((ViewGroup.MarginLayoutParams) marginLayoutParams).topMargin = marginLayoutParams2.topMargin;
            ((ViewGroup.MarginLayoutParams) marginLayoutParams).bottomMargin = marginLayoutParams2.bottomMargin;
            marginLayoutParams.setMarginStart(marginLayoutParams2.getMarginStart());
            marginLayoutParams.setMarginEnd(marginLayoutParams2.getMarginEnd());
        }
        if (layoutParams instanceof o11) {
            o11 o11Var = (o11) layoutParams;
            marginLayoutParams.a = o11Var.a;
            marginLayoutParams.b = o11Var.b;
            marginLayoutParams.c = o11Var.c;
            marginLayoutParams.d = o11Var.d;
            marginLayoutParams.e = o11Var.e;
            marginLayoutParams.f = o11Var.f;
            marginLayoutParams.g = o11Var.g;
            marginLayoutParams.h = o11Var.h;
            marginLayoutParams.i = o11Var.i;
            marginLayoutParams.j = o11Var.j;
            marginLayoutParams.k = o11Var.k;
            marginLayoutParams.l = o11Var.l;
            marginLayoutParams.m = o11Var.m;
            marginLayoutParams.n = o11Var.n;
            marginLayoutParams.o = o11Var.o;
            marginLayoutParams.p = o11Var.p;
            marginLayoutParams.q = o11Var.q;
            marginLayoutParams.r = o11Var.r;
            marginLayoutParams.s = o11Var.s;
            marginLayoutParams.t = o11Var.t;
            marginLayoutParams.u = o11Var.u;
            marginLayoutParams.v = o11Var.v;
            marginLayoutParams.w = o11Var.w;
            marginLayoutParams.x = o11Var.x;
            marginLayoutParams.y = o11Var.y;
            marginLayoutParams.z = o11Var.z;
            marginLayoutParams.A = o11Var.A;
            marginLayoutParams.B = o11Var.B;
            marginLayoutParams.C = o11Var.C;
            marginLayoutParams.D = o11Var.D;
            marginLayoutParams.E = o11Var.E;
            marginLayoutParams.F = o11Var.F;
            marginLayoutParams.G = o11Var.G;
            marginLayoutParams.H = o11Var.H;
            marginLayoutParams.I = o11Var.I;
            marginLayoutParams.J = o11Var.J;
            marginLayoutParams.K = o11Var.K;
            marginLayoutParams.W = o11Var.W;
            marginLayoutParams.X = o11Var.X;
            marginLayoutParams.L = o11Var.L;
            marginLayoutParams.M = o11Var.M;
            marginLayoutParams.N = o11Var.N;
            marginLayoutParams.P = o11Var.P;
            marginLayoutParams.O = o11Var.O;
            marginLayoutParams.Q = o11Var.Q;
            marginLayoutParams.R = o11Var.R;
            marginLayoutParams.S = o11Var.S;
            marginLayoutParams.T = o11Var.T;
            marginLayoutParams.U = o11Var.U;
            marginLayoutParams.V = o11Var.V;
            marginLayoutParams.a0 = o11Var.a0;
            marginLayoutParams.b0 = o11Var.b0;
            marginLayoutParams.c0 = o11Var.c0;
            marginLayoutParams.d0 = o11Var.d0;
            marginLayoutParams.f0 = o11Var.f0;
            marginLayoutParams.g0 = o11Var.g0;
            marginLayoutParams.h0 = o11Var.h0;
            marginLayoutParams.i0 = o11Var.i0;
            marginLayoutParams.j0 = o11Var.j0;
            marginLayoutParams.k0 = o11Var.k0;
            marginLayoutParams.l0 = o11Var.l0;
            marginLayoutParams.Y = o11Var.Y;
            marginLayoutParams.Z = o11Var.Z;
            marginLayoutParams.p0 = o11Var.p0;
            return marginLayoutParams;
        }
        return marginLayoutParams;
    }
}
