package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import java.util.HashMap;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: l11  reason: default package */
/* loaded from: classes.dex */
public abstract class l11 extends View {
    public int[] A;
    public int B;
    public Context L;
    public gx2 R;
    public String d0;
    public String e0;
    public HashMap f0;

    public l11(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A = new int[32];
        this.f0 = new HashMap();
        this.L = context;
        h(attributeSet);
    }

    public final void a(String str) {
        if (str.length() == 0 || this.L == null) {
            return;
        }
        String trim = str.trim();
        int g = g(trim);
        if (g != 0) {
            this.f0.put(Integer.valueOf(g), trim);
            b(g);
            return;
        }
        Log.w("ConstraintHelper", "Could not find id of \"" + trim + "\"");
    }

    public final void b(int i) {
        if (i == getId()) {
            return;
        }
        int i2 = this.B + 1;
        int[] iArr = this.A;
        if (i2 > iArr.length) {
            this.A = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.A;
        int i3 = this.B;
        iArr2[i3] = i;
        this.B = i3 + 1;
    }

    public final void c(String str) {
        ConstraintLayout constraintLayout;
        if (str.length() != 0 && this.L != null) {
            String trim = str.trim();
            if (getParent() instanceof ConstraintLayout) {
                constraintLayout = (ConstraintLayout) getParent();
            } else {
                constraintLayout = null;
            }
            if (constraintLayout == null) {
                Log.w("ConstraintHelper", "Parent not a ConstraintLayout");
                return;
            }
            int childCount = constraintLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = constraintLayout.getChildAt(i);
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if ((layoutParams instanceof o11) && trim.equals(((o11) layoutParams).Y)) {
                    if (childAt.getId() == -1) {
                        Log.w("ConstraintHelper", "to use ConstraintTag view " + childAt.getClass().getSimpleName() + " must have an ID");
                    } else {
                        b(childAt.getId());
                    }
                }
            }
        }
    }

    public final void d(ConstraintLayout constraintLayout) {
        int visibility = getVisibility();
        float elevation = getElevation();
        for (int i = 0; i < this.B; i++) {
            View view = (View) constraintLayout.A.get(this.A[i]);
            if (view != null) {
                view.setVisibility(visibility);
                if (elevation > RecyclerView.B1) {
                    view.setTranslationZ(view.getTranslationZ() + elevation);
                }
            }
        }
    }

    public final int f(ConstraintLayout constraintLayout, String str) {
        Resources resources;
        String str2;
        if (str != null && (resources = this.L.getResources()) != null) {
            int childCount = constraintLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = constraintLayout.getChildAt(i);
                if (childAt.getId() != -1) {
                    try {
                        str2 = resources.getResourceEntryName(childAt.getId());
                    } catch (Resources.NotFoundException unused) {
                        str2 = null;
                    }
                    if (str.equals(str2)) {
                        return childAt.getId();
                    }
                }
            }
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0045 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int g(String str) {
        ConstraintLayout constraintLayout;
        int i;
        Object obj;
        HashMap hashMap;
        Context context = this.L;
        if (getParent() instanceof ConstraintLayout) {
            constraintLayout = (ConstraintLayout) getParent();
        } else {
            constraintLayout = null;
        }
        if (isInEditMode() && constraintLayout != null) {
            if (str != null && (hashMap = constraintLayout.l0) != null && hashMap.containsKey(str)) {
                obj = constraintLayout.l0.get(str);
            } else {
                obj = null;
            }
            if (obj instanceof Integer) {
                i = ((Integer) obj).intValue();
                if (i == 0 && constraintLayout != null) {
                    i = f(constraintLayout, str);
                }
                if (i == 0) {
                    try {
                        i = z65.class.getField(str).getInt(null);
                    } catch (Exception unused) {
                    }
                }
                if (i != 0) {
                    return context.getResources().getIdentifier(str, "id", context.getPackageName());
                }
                return i;
            }
        }
        i = 0;
        if (i == 0) {
            i = f(constraintLayout, str);
        }
        if (i == 0) {
        }
        if (i != 0) {
        }
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.A, this.B);
    }

    public void h(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, e75.b);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 35) {
                    String string = obtainStyledAttributes.getString(index);
                    this.d0 = string;
                    setIds(string);
                } else if (index == 36) {
                    String string2 = obtainStyledAttributes.getString(index);
                    this.e0 = string2;
                    setReferenceTags(string2);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public void i(u11 u11Var, gx2 gx2Var, o21 o21Var, SparseArray sparseArray) {
        v11 v11Var = u11Var.e;
        int[] iArr = v11Var.j0;
        int i = 0;
        if (iArr != null) {
            setReferencedIds(iArr);
        } else {
            String str = v11Var.k0;
            if (str != null) {
                if (str.length() > 0) {
                    String[] split = v11Var.k0.split(",");
                    int[] iArr2 = new int[split.length];
                    int i2 = 0;
                    for (String str2 : split) {
                        int g = g(str2.trim());
                        if (g != 0) {
                            iArr2[i2] = g;
                            i2++;
                        }
                    }
                    if (i2 != split.length) {
                        iArr2 = Arrays.copyOf(iArr2, i2);
                    }
                    v11Var.j0 = iArr2;
                } else {
                    v11Var.j0 = null;
                }
            }
        }
        gx2Var.u0 = 0;
        Arrays.fill(gx2Var.t0, (Object) null);
        if (v11Var.j0 == null) {
            return;
        }
        while (true) {
            int[] iArr3 = v11Var.j0;
            if (i < iArr3.length) {
                l21 l21Var = (l21) sparseArray.get(iArr3[i]);
                if (l21Var != null) {
                    gx2Var.S(l21Var);
                }
                i++;
            } else {
                return;
            }
        }
    }

    public abstract void j(l21 l21Var, boolean z);

    public final void k() {
        if (this.R != null) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams instanceof o11) {
                ((o11) layoutParams).p0 = this.R;
            }
        }
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.d0;
        if (str != null) {
            setIds(str);
        }
        String str2 = this.e0;
        if (str2 != null) {
            setReferenceTags(str2);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setIds(String str) {
        this.d0 = str;
        if (str == null) {
            return;
        }
        int i = 0;
        this.B = 0;
        while (true) {
            int indexOf = str.indexOf(44, i);
            if (indexOf == -1) {
                a(str.substring(i));
                return;
            } else {
                a(str.substring(i, indexOf));
                i = indexOf + 1;
            }
        }
    }

    public void setReferenceTags(String str) {
        this.e0 = str;
        if (str == null) {
            return;
        }
        int i = 0;
        this.B = 0;
        while (true) {
            int indexOf = str.indexOf(44, i);
            if (indexOf == -1) {
                c(str.substring(i));
                return;
            } else {
                c(str.substring(i, indexOf));
                i = indexOf + 1;
            }
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.d0 = null;
        this.B = 0;
        for (int i : iArr) {
            b(i);
        }
    }

    @Override // android.view.View
    public final void setTag(int i, Object obj) {
        super.setTag(i, obj);
        if (obj == null && this.d0 == null) {
            b(i);
        }
    }

    public void e(ConstraintLayout constraintLayout) {
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
    }
}
