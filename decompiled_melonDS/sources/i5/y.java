package i5;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.Xml;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class y {

    /* renamed from: a  reason: collision with root package name */
    public final float f7019a;

    /* renamed from: b  reason: collision with root package name */
    public final float f7020b;

    /* renamed from: c  reason: collision with root package name */
    public final float f7021c;

    /* renamed from: d  reason: collision with root package name */
    public final float f7022d;

    /* renamed from: e  reason: collision with root package name */
    public final int f7023e;

    public y(Context context, XmlResourceParser xmlResourceParser) {
        this.f7019a = Float.NaN;
        this.f7020b = Float.NaN;
        this.f7021c = Float.NaN;
        this.f7022d = Float.NaN;
        this.f7023e = -1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), v.f7012u);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = obtainStyledAttributes.getIndex(i2);
            if (index == 0) {
                int resourceId = obtainStyledAttributes.getResourceId(index, this.f7023e);
                this.f7023e = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                "layout".equals(resourceTypeName);
            } else if (index == 1) {
                this.f7022d = obtainStyledAttributes.getDimension(index, this.f7022d);
            } else if (index == 2) {
                this.f7020b = obtainStyledAttributes.getDimension(index, this.f7020b);
            } else if (index == 3) {
                this.f7021c = obtainStyledAttributes.getDimension(index, this.f7021c);
            } else if (index == 4) {
                this.f7019a = obtainStyledAttributes.getDimension(index, this.f7019a);
            } else {
                Log.v("ConstraintLayoutStates", "Unknown tag");
            }
        }
        obtainStyledAttributes.recycle();
    }

    public final boolean a(float f8, float f10) {
        float f11 = this.f7019a;
        if (!Float.isNaN(f11) && f8 < f11) {
            return false;
        }
        float f12 = this.f7020b;
        if (!Float.isNaN(f12) && f10 < f12) {
            return false;
        }
        float f13 = this.f7021c;
        if (!Float.isNaN(f13) && f8 > f13) {
            return false;
        }
        float f14 = this.f7022d;
        if (!Float.isNaN(f14) && f10 > f14) {
            return false;
        }
        return true;
    }
}
