package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: w11  reason: default package */
/* loaded from: classes.dex */
public final class w11 {
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

    public final void a(w11 w11Var) {
        this.a = w11Var.a;
        this.b = w11Var.b;
        this.d = w11Var.d;
        this.e = w11Var.e;
        this.f = w11Var.f;
        this.h = w11Var.h;
        this.g = w11Var.g;
    }

    public final void b(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e75.k);
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
                        this.d = gr1.R[obtainStyledAttributes.getInteger(index, 0)];
                        break;
                    }
                case 4:
                    this.f = obtainStyledAttributes.getInt(index, 0);
                    break;
                case 5:
                    this.b = z11.l(obtainStyledAttributes, index, this.b);
                    break;
                case 6:
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
