package androidx.fragment.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class u0 implements LayoutInflater.Factory2 {
    public final g1 A;

    public u0(g1 g1Var) {
        this.A = g1Var;
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        boolean z10;
        j0 j0Var;
        p1 g10;
        int i2;
        boolean equals = FragmentContainerView.class.getName().equals(str);
        g1 g1Var = this.A;
        if (equals) {
            return new FragmentContainerView(context, attributeSet, g1Var);
        }
        if ("fragment".equals(str)) {
            String attributeValue = attributeSet.getAttributeValue(null, "class");
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, q6.a.f12308a);
            int i10 = 0;
            if (attributeValue == null) {
                attributeValue = obtainStyledAttributes.getString(0);
            }
            int resourceId = obtainStyledAttributes.getResourceId(1, -1);
            String string = obtainStyledAttributes.getString(2);
            obtainStyledAttributes.recycle();
            if (attributeValue != null) {
                try {
                    z10 = j0.class.isAssignableFrom(z0.b(context.getClassLoader(), attributeValue));
                } catch (ClassNotFoundException unused) {
                    z10 = false;
                }
                if (z10) {
                    if (view != null) {
                        i10 = view.getId();
                    }
                    if (i10 == -1 && resourceId == -1 && string == null) {
                        throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
                    }
                    if (resourceId != -1) {
                        j0Var = g1Var.C(resourceId);
                    } else {
                        j0Var = null;
                    }
                    if (j0Var == null && string != null) {
                        j0Var = g1Var.D(string);
                    }
                    if (j0Var == null && i10 != -1) {
                        j0Var = g1Var.C(i10);
                    }
                    if (j0Var == null) {
                        z0 H = g1Var.H();
                        context.getClassLoader();
                        j0Var = H.a(attributeValue);
                        j0Var.mFromLayout = true;
                        if (resourceId != 0) {
                            i2 = resourceId;
                        } else {
                            i2 = i10;
                        }
                        j0Var.mFragmentId = i2;
                        j0Var.mContainerId = i10;
                        j0Var.mTag = string;
                        j0Var.mInLayout = true;
                        j0Var.mFragmentManager = g1Var;
                        s0 s0Var = g1Var.f1331w;
                        j0Var.mHost = s0Var;
                        j0Var.onInflate((Context) s0Var.B, attributeSet, j0Var.mSavedFragmentState);
                        g10 = g1Var.a(j0Var);
                        if (g1.K(2)) {
                            Log.v("FragmentManager", "Fragment " + j0Var + " has been inflated via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                        }
                    } else if (!j0Var.mInLayout) {
                        j0Var.mInLayout = true;
                        j0Var.mFragmentManager = g1Var;
                        s0 s0Var2 = g1Var.f1331w;
                        j0Var.mHost = s0Var2;
                        j0Var.onInflate((Context) s0Var2.B, attributeSet, j0Var.mSavedFragmentState);
                        g10 = g1Var.g(j0Var);
                        if (g1.K(2)) {
                            Log.v("FragmentManager", "Retained Fragment " + j0Var + " has been re-attached via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                        }
                    } else {
                        throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(i10) + " with another fragment for " + attributeValue);
                    }
                    ViewGroup viewGroup = (ViewGroup) view;
                    r6.c cVar = r6.d.f12618a;
                    r6.d.b(new r6.h(j0Var, "Attempting to use <fragment> tag to add fragment " + j0Var + " to container " + viewGroup));
                    r6.d.a(j0Var).getClass();
                    r6.b bVar = r6.b.PENALTY_LOG;
                    j0Var.mContainer = viewGroup;
                    g10.k();
                    g10.j();
                    View view2 = j0Var.mView;
                    if (view2 != null) {
                        if (resourceId != 0) {
                            view2.setId(resourceId);
                        }
                        if (j0Var.mView.getTag() == null) {
                            j0Var.mView.setTag(string);
                        }
                        j0Var.mView.addOnAttachStateChangeListener(new t0(this, g10));
                        return j0Var.mView;
                    }
                    a0.j.p(kc.a.g("Fragment ", attributeValue, " did not create a view."));
                    return null;
                }
            }
        }
        return null;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
