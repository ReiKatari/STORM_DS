package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ry0  reason: default package */
/* loaded from: classes.dex */
public final class ry0 {
    public static final SparseIntArray n;
    public boolean a;
    public int b;
    public int c;
    public String d;
    public int e;
    public int f;
    public float g;
    public float h;
    public float i;
    public int j;
    public String k;
    public int l;
    public int m;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        n = sparseIntArray;
        sparseIntArray.append(3, 1);
        sparseIntArray.append(5, 2);
        sparseIntArray.append(9, 3);
        sparseIntArray.append(2, 4);
        sparseIntArray.append(1, 5);
        sparseIntArray.append(0, 6);
        sparseIntArray.append(4, 7);
        sparseIntArray.append(8, 8);
        sparseIntArray.append(7, 9);
        sparseIntArray.append(6, 10);
    }

    public final void a(ry0 ry0Var) {
        this.a = ry0Var.a;
        this.b = ry0Var.b;
        this.d = ry0Var.d;
        this.e = ry0Var.e;
        this.f = ry0Var.f;
        this.h = ry0Var.h;
        this.g = ry0Var.g;
    }

    public final void b(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, tx4.k);
        this.a = true;
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            switch (n.get(index)) {
                case 1:
                    this.h = obtainStyledAttributes.getFloat(index, this.h);
                    break;
                case 2:
                    this.e = obtainStyledAttributes.getInt(index, this.e);
                    break;
                case 3:
                    if (obtainStyledAttributes.peekValue(index).type == 3) {
                        this.d = obtainStyledAttributes.getString(index);
                        break;
                    } else {
                        this.d = an1.R[obtainStyledAttributes.getInteger(index, 0)];
                        break;
                    }
                case 4:
                    this.f = obtainStyledAttributes.getInt(index, 0);
                    break;
                case 5:
                    this.b = uy0.l(obtainStyledAttributes, index, this.b);
                    break;
                case ig7.b /* 6 */:
                    this.c = obtainStyledAttributes.getInteger(index, this.c);
                    break;
                case 7:
                    this.g = obtainStyledAttributes.getFloat(index, this.g);
                    break;
                case 8:
                    this.j = obtainStyledAttributes.getInteger(index, this.j);
                    break;
                case 9:
                    this.i = obtainStyledAttributes.getFloat(index, this.i);
                    break;
                case 10:
                    int i2 = obtainStyledAttributes.peekValue(index).type;
                    if (i2 == 1) {
                        int resourceId = obtainStyledAttributes.getResourceId(index, -1);
                        this.m = resourceId;
                        if (resourceId != -1) {
                            this.l = -2;
                            break;
                        } else {
                            break;
                        }
                    } else if (i2 == 3) {
                        String string = obtainStyledAttributes.getString(index);
                        this.k = string;
                        if (string.indexOf("/") > 0) {
                            this.m = obtainStyledAttributes.getResourceId(index, -1);
                            this.l = -2;
                            break;
                        } else {
                            this.l = -1;
                            break;
                        }
                    } else {
                        this.l = obtainStyledAttributes.getInteger(index, this.m);
                        break;
                    }
            }
        }
        obtainStyledAttributes.recycle();
    }
}
