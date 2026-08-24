package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import androidx.constraintlayout.motion.widget.MotionLayout;
import java.util.HashMap;
import java.util.HashSet;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: gh3  reason: default package */
/* loaded from: classes.dex */
public final class gh3 extends jg3 {
    public int e = -1;
    public String f = null;
    public int g = -1;
    public int h = 0;
    public float i = Float.NaN;
    public float j = Float.NaN;
    public float k = Float.NaN;
    public float l = Float.NaN;
    public int m = 0;

    @Override // defpackage.jg3
    public final void a(HashMap hashMap) {
        throw null;
    }

    @Override // defpackage.jg3
    /* renamed from: b */
    public final jg3 clone() {
        gh3 gh3Var = new gh3();
        super.c(this);
        gh3Var.f = this.f;
        gh3Var.g = this.g;
        gh3Var.h = this.h;
        gh3Var.i = this.i;
        gh3Var.j = Float.NaN;
        gh3Var.k = this.k;
        gh3Var.l = this.l;
        return gh3Var;
    }

    @Override // defpackage.jg3
    public final void e(Context context, AttributeSet attributeSet) {
        SparseIntArray sparseIntArray;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e75.g);
        SparseIntArray sparseIntArray2 = fh3.a;
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            switch (fh3.a.get(index)) {
                case 1:
                    if (MotionLayout.t1) {
                        int resourceId = obtainStyledAttributes.getResourceId(index, this.b);
                        this.b = resourceId;
                        if (resourceId == -1) {
                            this.c = obtainStyledAttributes.getString(index);
                            break;
                        } else {
                            break;
                        }
                    } else if (obtainStyledAttributes.peekValue(index).type == 3) {
                        this.c = obtainStyledAttributes.getString(index);
                        break;
                    } else {
                        this.b = obtainStyledAttributes.getResourceId(index, this.b);
                        break;
                    }
                case 2:
                    this.a = obtainStyledAttributes.getInt(index, this.a);
                    break;
                case 3:
                    if (obtainStyledAttributes.peekValue(index).type == 3) {
                        this.f = obtainStyledAttributes.getString(index);
                        break;
                    } else {
                        this.f = gr1.R[obtainStyledAttributes.getInteger(index, 0)];
                        break;
                    }
                case 4:
                    this.e = obtainStyledAttributes.getInteger(index, this.e);
                    break;
                case 5:
                    this.h = obtainStyledAttributes.getInt(index, this.h);
                    break;
                case 6:
                    this.k = obtainStyledAttributes.getFloat(index, this.k);
                    break;
                case 7:
                    this.l = obtainStyledAttributes.getFloat(index, this.l);
                    break;
                case 8:
                    float f = obtainStyledAttributes.getFloat(index, this.j);
                    this.i = f;
                    this.j = f;
                    break;
                case 9:
                    this.m = obtainStyledAttributes.getInt(index, this.m);
                    break;
                case 10:
                    this.g = obtainStyledAttributes.getInt(index, this.g);
                    break;
                case 11:
                    this.i = obtainStyledAttributes.getFloat(index, this.i);
                    break;
                case 12:
                    this.j = obtainStyledAttributes.getFloat(index, this.j);
                    break;
                default:
                    Log.e("KeyPosition", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                    break;
            }
        }
        if (this.a == -1) {
            Log.e("KeyPosition", "no frame position");
        }
    }

    @Override // defpackage.jg3
    public final void d(HashSet hashSet) {
    }
}
