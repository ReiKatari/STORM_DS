package i5;

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
import java.util.Arrays;
import java.util.HashMap;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class c extends View {
    public int[] A;
    public int B;
    public Context L;
    public e5.m R;

    /* renamed from: b0  reason: collision with root package name */
    public String f6822b0;

    /* renamed from: c0  reason: collision with root package name */
    public String f6823c0;

    /* renamed from: d0  reason: collision with root package name */
    public HashMap f6824d0;

    public c(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A = new int[32];
        this.f6824d0 = new HashMap();
        this.L = context;
        h(attributeSet);
    }

    public final void a(String str) {
        if (str.length() == 0 || this.L == null) {
            return;
        }
        String trim = str.trim();
        int g10 = g(trim);
        if (g10 != 0) {
            this.f6824d0.put(Integer.valueOf(g10), trim);
            b(g10);
            return;
        }
        Log.w("ConstraintHelper", "Could not find id of \"" + trim + "\"");
    }

    public final void b(int i2) {
        if (i2 == getId()) {
            return;
        }
        int i10 = this.B + 1;
        int[] iArr = this.A;
        if (i10 > iArr.length) {
            this.A = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.A;
        int i11 = this.B;
        iArr2[i11] = i2;
        this.B = i11 + 1;
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
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = constraintLayout.getChildAt(i2);
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if ((layoutParams instanceof f) && trim.equals(((f) layoutParams).Y)) {
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
        for (int i2 = 0; i2 < this.B; i2++) {
            View view = (View) constraintLayout.A.get(this.A[i2]);
            if (view != null) {
                view.setVisibility(visibility);
                if (elevation > 0.0f) {
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
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = constraintLayout.getChildAt(i2);
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
            java.util.HashMap r3 = r1.f1164j0
            if (r3 == 0) goto L2e
            boolean r3 = r3.containsKey(r6)
            if (r3 == 0) goto L2e
            java.util.HashMap r3 = r1.f1164j0
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
            java.lang.Class<i5.u> r1 = i5.u.class
            java.lang.reflect.Field r1 = r1.getField(r6)     // Catch: java.lang.Exception -> L4f
            int r3 = r1.getInt(r2)     // Catch: java.lang.Exception -> L4f
        L4f:
            if (r3 != 0) goto L5f
            android.content.res.Resources r1 = r0.getResources()
            java.lang.String r2 = "id"
            java.lang.String r0 = r0.getPackageName()
            int r3 = r1.getIdentifier(r6, r2, r0)
        L5f:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: i5.c.g(java.lang.String):int");
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.A, this.B);
    }

    public void h(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, v.f6994b);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                if (index == 35) {
                    String string = obtainStyledAttributes.getString(index);
                    this.f6822b0 = string;
                    setIds(string);
                } else if (index == 36) {
                    String string2 = obtainStyledAttributes.getString(index);
                    this.f6823c0 = string2;
                    setReferenceTags(string2);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public void i(l lVar, e5.m mVar, r rVar, SparseArray sparseArray) {
        m mVar2 = lVar.f6906e;
        int[] iArr = mVar2.f6930j0;
        int i2 = 0;
        if (iArr != null) {
            setReferencedIds(iArr);
        } else {
            String str = mVar2.f6932k0;
            if (str != null) {
                if (str.length() > 0) {
                    String[] split = mVar2.f6932k0.split(",");
                    int[] iArr2 = new int[split.length];
                    int i10 = 0;
                    for (String str2 : split) {
                        int g10 = g(str2.trim());
                        if (g10 != 0) {
                            iArr2[i10] = g10;
                            i10++;
                        }
                    }
                    if (i10 != split.length) {
                        iArr2 = Arrays.copyOf(iArr2, i10);
                    }
                    mVar2.f6930j0 = iArr2;
                } else {
                    mVar2.f6930j0 = null;
                }
            }
        }
        mVar.f4368u0 = 0;
        Arrays.fill(mVar.f4367t0, (Object) null);
        if (mVar2.f6930j0 == null) {
            return;
        }
        while (true) {
            int[] iArr3 = mVar2.f6930j0;
            if (i2 < iArr3.length) {
                e5.g gVar = (e5.g) sparseArray.get(iArr3[i2]);
                if (gVar != null) {
                    mVar.S(gVar);
                }
                i2++;
            } else {
                return;
            }
        }
    }

    public abstract void j(e5.g gVar, boolean z10);

    public final void k() {
        if (this.R != null) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams instanceof f) {
                ((f) layoutParams).p0 = this.R;
            }
        }
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.f6822b0;
        if (str != null) {
            setIds(str);
        }
        String str2 = this.f6823c0;
        if (str2 != null) {
            setReferenceTags(str2);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i2, int i10) {
        setMeasuredDimension(0, 0);
    }

    public void setIds(String str) {
        this.f6822b0 = str;
        if (str == null) {
            return;
        }
        int i2 = 0;
        this.B = 0;
        while (true) {
            int indexOf = str.indexOf(44, i2);
            if (indexOf == -1) {
                a(str.substring(i2));
                return;
            } else {
                a(str.substring(i2, indexOf));
                i2 = indexOf + 1;
            }
        }
    }

    public void setReferenceTags(String str) {
        this.f6823c0 = str;
        if (str == null) {
            return;
        }
        int i2 = 0;
        this.B = 0;
        while (true) {
            int indexOf = str.indexOf(44, i2);
            if (indexOf == -1) {
                c(str.substring(i2));
                return;
            } else {
                c(str.substring(i2, indexOf));
                i2 = indexOf + 1;
            }
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.f6822b0 = null;
        this.B = 0;
        for (int i2 : iArr) {
            b(i2);
        }
    }

    @Override // android.view.View
    public final void setTag(int i2, Object obj) {
        super.setTag(i2, obj);
        if (obj == null && this.f6822b0 == null) {
            b(i2);
        }
    }

    public void e(ConstraintLayout constraintLayout) {
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
    }
}
