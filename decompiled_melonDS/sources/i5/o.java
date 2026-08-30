package i5;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class o {

    /* renamed from: a  reason: collision with root package name */
    public boolean f6964a;

    /* renamed from: b  reason: collision with root package name */
    public int f6965b;

    /* renamed from: c  reason: collision with root package name */
    public int f6966c;

    /* renamed from: d  reason: collision with root package name */
    public float f6967d;

    /* renamed from: e  reason: collision with root package name */
    public float f6968e;

    public final void a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, v.f7007p);
        this.f6964a = true;
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = obtainStyledAttributes.getIndex(i2);
            if (index == 1) {
                this.f6967d = obtainStyledAttributes.getFloat(index, this.f6967d);
            } else if (index == 0) {
                int i10 = obtainStyledAttributes.getInt(index, this.f6965b);
                this.f6965b = i10;
                this.f6965b = q.f6983h[i10];
            } else if (index == 4) {
                this.f6966c = obtainStyledAttributes.getInt(index, this.f6966c);
            } else if (index == 3) {
                this.f6968e = obtainStyledAttributes.getFloat(index, this.f6968e);
            }
        }
        obtainStyledAttributes.recycle();
    }
}
