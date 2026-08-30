package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: my0  reason: default package */
/* loaded from: classes.dex */
public final class my0 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final int e;
    public final uy0 f;

    public my0(Context context, XmlResourceParser xmlResourceParser) {
        this.a = Float.NaN;
        this.b = Float.NaN;
        this.c = Float.NaN;
        this.d = Float.NaN;
        this.e = -1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), tx4.u);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == 0) {
                int resourceId = obtainStyledAttributes.getResourceId(index, this.e);
                this.e = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                if ("layout".equals(resourceTypeName)) {
                    uy0 uy0Var = new uy0();
                    this.f = uy0Var;
                    uy0Var.e((ConstraintLayout) LayoutInflater.from(context).inflate(resourceId, (ViewGroup) null));
                }
            } else if (index == 1) {
                this.d = obtainStyledAttributes.getDimension(index, this.d);
            } else if (index == 2) {
                this.b = obtainStyledAttributes.getDimension(index, this.b);
            } else if (index == 3) {
                this.c = obtainStyledAttributes.getDimension(index, this.c);
            } else if (index == 4) {
                this.a = obtainStyledAttributes.getDimension(index, this.a);
            } else {
                Log.v("ConstraintLayoutStates", "Unknown tag");
            }
        }
        obtainStyledAttributes.recycle();
    }

    public final boolean a(float f, float f2) {
        float f3 = this.a;
        if (!Float.isNaN(f3) && f < f3) {
            return false;
        }
        float f4 = this.b;
        if (!Float.isNaN(f4) && f2 < f4) {
            return false;
        }
        float f5 = this.c;
        if (!Float.isNaN(f5) && f > f5) {
            return false;
        }
        float f6 = this.d;
        if (!Float.isNaN(f6) && f2 > f6) {
            return false;
        }
        return true;
    }
}
