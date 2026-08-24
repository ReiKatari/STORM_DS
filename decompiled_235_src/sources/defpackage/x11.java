package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: x11  reason: default package */
/* loaded from: classes.dex */
public final class x11 {
    public boolean a;
    public int b;
    public int c;
    public float d;
    public float e;

    public final void a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e75.p);
        this.a = true;
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == 1) {
                this.d = obtainStyledAttributes.getFloat(index, this.d);
            } else if (index == 0) {
                int i2 = obtainStyledAttributes.getInt(index, this.b);
                this.b = i2;
                this.b = z11.h[i2];
            } else if (index == 4) {
                this.c = obtainStyledAttributes.getInt(index, this.c);
            } else if (index == 3) {
                this.e = obtainStyledAttributes.getFloat(index, this.e);
            }
        }
        obtainStyledAttributes.recycle();
    }
}
