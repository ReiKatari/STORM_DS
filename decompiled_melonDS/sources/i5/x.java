package i5;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Xml;
import java.util.ArrayList;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class x {

    /* renamed from: a  reason: collision with root package name */
    public final int f7016a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f7017b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public final int f7018c;

    public x(Context context, XmlResourceParser xmlResourceParser) {
        this.f7018c = -1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), v.f7008q);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = obtainStyledAttributes.getIndex(i2);
            if (index == 0) {
                this.f7016a = obtainStyledAttributes.getResourceId(index, this.f7016a);
            } else if (index == 1) {
                int resourceId = obtainStyledAttributes.getResourceId(index, this.f7018c);
                this.f7018c = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                "layout".equals(resourceTypeName);
            }
        }
        obtainStyledAttributes.recycle();
    }
}
