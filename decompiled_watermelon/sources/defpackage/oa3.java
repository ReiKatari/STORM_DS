package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import androidx.constraintlayout.motion.widget.MotionLayout;
import java.util.HashMap;
import java.util.HashSet;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: oa3  reason: default package */
/* loaded from: classes.dex */
public final class oa3 extends q93 {
    public int e = -1;
    public String f = null;
    public int g = -1;
    public int h = 0;
    public float i = Float.NaN;
    public float j = Float.NaN;
    public float k = Float.NaN;
    public float l = Float.NaN;
    public int m = 0;

    @Override // defpackage.q93
    public final void a(HashMap hashMap) {
        throw null;
    }

    @Override // defpackage.q93
    /* renamed from: b */
    public final q93 clone() {
        oa3 oa3Var = new oa3();
        super.c(this);
        oa3Var.f = this.f;
        oa3Var.g = this.g;
        oa3Var.h = this.h;
        oa3Var.i = this.i;
        oa3Var.j = Float.NaN;
        oa3Var.k = this.k;
        oa3Var.l = this.l;
        return oa3Var;
    }

    @Override // defpackage.q93
    public final void e(Context context, AttributeSet attributeSet) {
        SparseIntArray sparseIntArray;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, tx4.g);
        SparseIntArray sparseIntArray2 = na3.a;
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            switch (na3.a.get(index)) {
                case 1:
                    if (MotionLayout.s1) {
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
                        this.f = an1.R[obtainStyledAttributes.getInteger(index, 0)];
                        break;
                    }
                case 4:
                    this.e = obtainStyledAttributes.getInteger(index, this.e);
                    break;
                case 5:
                    this.h = obtainStyledAttributes.getInt(index, this.h);
                    break;
                case ig7.b /* 6 */:
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
                case mj2.L /* 12 */:
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

    @Override // defpackage.q93
    public final void d(HashSet hashSet) {
    }
}
