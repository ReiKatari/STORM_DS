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
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: gy0  reason: default package */
/* loaded from: classes.dex */
public abstract class gy0 extends View {
    public int[] A;
    public int B;
    public Context L;
    public fr2 R;
    public String c0;
    public String d0;
    public HashMap e0;

    public gy0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A = new int[32];
        this.e0 = new HashMap();
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
            this.e0.put(Integer.valueOf(g), trim);
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
                if ((layoutParams instanceof jy0) && trim.equals(((jy0) layoutParams).Y)) {
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
                if (elevation > RecyclerView.A1) {
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
        To view partially-correct add '--show-bad-code' argument
    */
    public final int g(java.lang.String r6) {
        /*
            r5 = this;
            android.content.Context r0 = r5.L
            android.view.ViewParent r1 = r5.getParent()
            boolean r1 = r1 instanceof androidx.constraintlayout.widget.ConstraintLayout
            r2 = 0
            if (r1 == 0) goto L12
            android.view.ViewParent r1 = r5.getParent()
            androidx.constraintlayout.widget.ConstraintLayout r1 = (androidx.constraintlayout.widget.ConstraintLayout) r1
            goto L13
        L12:
            r1 = r2
        L13:
            boolean r3 = r5.isInEditMode()
            if (r3 == 0) goto L3a
            if (r1 == 0) goto L3a
            if (r6 == 0) goto L2e
            java.util.HashMap r3 = r1.k0
            if (r3 == 0) goto L2e
            boolean r3 = r3.containsKey(r6)
            if (r3 == 0) goto L2e
            java.util.HashMap r3 = r1.k0
            java.lang.Object r3 = r3.get(r6)
            goto L2f
        L2e:
            r3 = r2
        L2f:
            boolean r4 = r3 instanceof java.lang.Integer
            if (r4 == 0) goto L3a
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            goto L3b
        L3a:
            r3 = 0
        L3b:
            if (r3 != 0) goto L43
            if (r1 == 0) goto L43
            int r3 = r5.f(r1, r6)
        L43:
            if (r3 != 0) goto L4f
            java.lang.Class<px4> r5 = defpackage.px4.class
            java.lang.reflect.Field r5 = r5.getField(r6)     // Catch: java.lang.Exception -> L4f
            int r3 = r5.getInt(r2)     // Catch: java.lang.Exception -> L4f
        L4f:
            if (r3 != 0) goto L5f
            android.content.res.Resources r5 = r0.getResources()
            java.lang.String r1 = "id"
            java.lang.String r0 = r0.getPackageName()
            int r3 = r5.getIdentifier(r6, r1, r0)
        L5f:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gy0.g(java.lang.String):int");
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.A, this.B);
    }

    public void h(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, tx4.b);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 35) {
                    String string = obtainStyledAttributes.getString(index);
                    this.c0 = string;
                    setIds(string);
                } else if (index == 36) {
                    String string2 = obtainStyledAttributes.getString(index);
                    this.d0 = string2;
                    setReferenceTags(string2);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public void i(py0 py0Var, fr2 fr2Var, jz0 jz0Var, SparseArray sparseArray) {
        qy0 qy0Var = py0Var.e;
        int[] iArr = qy0Var.j0;
        int i = 0;
        if (iArr != null) {
            setReferencedIds(iArr);
        } else {
            String str = qy0Var.k0;
            if (str != null) {
                if (str.length() > 0) {
                    String[] split = qy0Var.k0.split(",");
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
                    qy0Var.j0 = iArr2;
                } else {
                    qy0Var.j0 = null;
                }
            }
        }
        fr2Var.u0 = 0;
        Arrays.fill(fr2Var.t0, (Object) null);
        if (qy0Var.j0 == null) {
            return;
        }
        while (true) {
            int[] iArr3 = qy0Var.j0;
            if (i < iArr3.length) {
                gz0 gz0Var = (gz0) sparseArray.get(iArr3[i]);
                if (gz0Var != null) {
                    fr2Var.S(gz0Var);
                }
                i++;
            } else {
                return;
            }
        }
    }

    public abstract void j(gz0 gz0Var, boolean z);

    public final void k() {
        if (this.R != null) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams instanceof jy0) {
                ((jy0) layoutParams).p0 = this.R;
            }
        }
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.c0;
        if (str != null) {
            setIds(str);
        }
        String str2 = this.d0;
        if (str2 != null) {
            setReferenceTags(str2);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setIds(String str) {
        this.c0 = str;
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
        this.d0 = str;
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
        this.c0 = null;
        this.B = 0;
        for (int i : iArr) {
            b(i);
        }
    }

    @Override // android.view.View
    public final void setTag(int i, Object obj) {
        super.setTag(i, obj);
        if (obj == null && this.c0 == null) {
            b(i);
        }
    }

    public void e(ConstraintLayout constraintLayout) {
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
    }
}
