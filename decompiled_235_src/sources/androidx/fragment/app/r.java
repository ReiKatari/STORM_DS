package androidx.fragment.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class r implements LayoutInflater.Factory2 {
    public final u A;

    public r(u uVar) {
        this.A = uVar;
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        boolean z;
        o oVar;
        x g;
        int i;
        boolean equals = FragmentContainerView.class.getName().equals(str);
        u uVar = this.A;
        if (equals) {
            return new FragmentContainerView(context, attributeSet, uVar);
        }
        if ("fragment".equals(str)) {
            String attributeValue = attributeSet.getAttributeValue(null, "class");
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, h75.a);
            int i2 = 0;
            if (attributeValue == null) {
                attributeValue = obtainStyledAttributes.getString(0);
            }
            int resourceId = obtainStyledAttributes.getResourceId(1, -1);
            String string = obtainStyledAttributes.getString(2);
            obtainStyledAttributes.recycle();
            if (attributeValue != null) {
                try {
                    z = o.class.isAssignableFrom(gl2.b(attributeValue, context.getClassLoader()));
                } catch (ClassNotFoundException unused) {
                    z = false;
                }
                if (z) {
                    if (view != null) {
                        i2 = view.getId();
                    }
                    if (i2 == -1 && resourceId == -1 && string == null) {
                        throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
                    }
                    if (resourceId != -1) {
                        oVar = uVar.C(resourceId);
                    } else {
                        oVar = null;
                    }
                    if (oVar == null && string != null) {
                        oVar = uVar.D(string);
                    }
                    if (oVar == null && i2 != -1) {
                        oVar = uVar.C(i2);
                    }
                    if (oVar == null) {
                        gl2 H = uVar.H();
                        context.getClassLoader();
                        oVar = H.a(attributeValue);
                        oVar.mFromLayout = true;
                        if (resourceId != 0) {
                            i = resourceId;
                        } else {
                            i = i2;
                        }
                        oVar.mFragmentId = i;
                        oVar.mContainerId = i2;
                        oVar.mTag = string;
                        oVar.mInLayout = true;
                        oVar.mFragmentManager = uVar;
                        cl2 cl2Var = uVar.w;
                        oVar.mHost = cl2Var;
                        oVar.onInflate((Context) cl2Var.B, attributeSet, oVar.mSavedFragmentState);
                        g = uVar.a(oVar);
                        if (u.K(2)) {
                            Log.v("FragmentManager", "Fragment " + oVar + " has been inflated via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                        }
                    } else if (!oVar.mInLayout) {
                        oVar.mInLayout = true;
                        oVar.mFragmentManager = uVar;
                        cl2 cl2Var2 = uVar.w;
                        oVar.mHost = cl2Var2;
                        oVar.onInflate((Context) cl2Var2.B, attributeSet, oVar.mSavedFragmentState);
                        g = uVar.g(oVar);
                        if (u.K(2)) {
                            Log.v("FragmentManager", "Retained Fragment " + oVar + " has been re-attached via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                        }
                    } else {
                        throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(i2) + " with another fragment for " + attributeValue);
                    }
                    ViewGroup viewGroup = (ViewGroup) view;
                    sl2 sl2Var = tl2.a;
                    tl2.b(new jq7(oVar, "Attempting to use <fragment> tag to add fragment " + oVar + " to container " + viewGroup));
                    tl2.a(oVar).getClass();
                    rl2 rl2Var = rl2.PENALTY_LOG;
                    oVar.mContainer = viewGroup;
                    g.k();
                    g.j();
                    View view2 = oVar.mView;
                    if (view2 != null) {
                        if (resourceId != 0) {
                            view2.setId(resourceId);
                        }
                        if (oVar.mView.getTag() == null) {
                            oVar.mView.setTag(string);
                        }
                        oVar.mView.addOnAttachStateChangeListener(new q(this, g));
                        return oVar.mView;
                    }
                    defpackage.i.m(lb1.A("Fragment ", attributeValue, " did not create a view."));
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
