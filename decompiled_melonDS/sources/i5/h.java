package i5;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public final int f6875a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f6876b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public final int f6877c;

    /* renamed from: d  reason: collision with root package name */
    public final q f6878d;

    public h(Context context, XmlResourceParser xmlResourceParser) {
        this.f6877c = -1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), v.f7008q);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = obtainStyledAttributes.getIndex(i2);
            if (index == 0) {
                this.f6875a = obtainStyledAttributes.getResourceId(index, this.f6875a);
            } else if (index == 1) {
                int resourceId = obtainStyledAttributes.getResourceId(index, this.f6877c);
                this.f6877c = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                if ("layout".equals(resourceTypeName)) {
                    q qVar = new q();
                    this.f6878d = qVar;
                    qVar.e((ConstraintLayout) LayoutInflater.from(context).inflate(resourceId, (ViewGroup) null));
                }
            }
        }
        obtainStyledAttributes.recycle();
    }
}
