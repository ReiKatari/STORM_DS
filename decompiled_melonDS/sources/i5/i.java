package i5;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    public final float f6879a;

    /* renamed from: b  reason: collision with root package name */
    public final float f6880b;

    /* renamed from: c  reason: collision with root package name */
    public final float f6881c;

    /* renamed from: d  reason: collision with root package name */
    public final float f6882d;

    /* renamed from: e  reason: collision with root package name */
    public final int f6883e;

    /* renamed from: f  reason: collision with root package name */
    public final q f6884f;

    public i(Context context, XmlResourceParser xmlResourceParser) {
        this.f6879a = Float.NaN;
        this.f6880b = Float.NaN;
        this.f6881c = Float.NaN;
        this.f6882d = Float.NaN;
        this.f6883e = -1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), v.f7012u);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = obtainStyledAttributes.getIndex(i2);
            if (index == 0) {
                int resourceId = obtainStyledAttributes.getResourceId(index, this.f6883e);
                this.f6883e = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                if ("layout".equals(resourceTypeName)) {
                    q qVar = new q();
                    this.f6884f = qVar;
                    qVar.e((ConstraintLayout) LayoutInflater.from(context).inflate(resourceId, (ViewGroup) null));
                }
            } else if (index == 1) {
                this.f6882d = obtainStyledAttributes.getDimension(index, this.f6882d);
            } else if (index == 2) {
                this.f6880b = obtainStyledAttributes.getDimension(index, this.f6880b);
            } else if (index == 3) {
                this.f6881c = obtainStyledAttributes.getDimension(index, this.f6881c);
            } else if (index == 4) {
                this.f6879a = obtainStyledAttributes.getDimension(index, this.f6879a);
            } else {
                Log.v("ConstraintLayoutStates", "Unknown tag");
            }
        }
        obtainStyledAttributes.recycle();
    }

    public final boolean a(float f8, float f10) {
        float f11 = this.f6879a;
        if (!Float.isNaN(f11) && f8 < f11) {
            return false;
        }
        float f12 = this.f6880b;
        if (!Float.isNaN(f12) && f10 < f12) {
            return false;
        }
        float f13 = this.f6881c;
        if (!Float.isNaN(f13) && f8 > f13) {
            return false;
        }
        float f14 = this.f6882d;
        if (!Float.isNaN(f14) && f10 > f14) {
            return false;
        }
        return true;
    }
}
