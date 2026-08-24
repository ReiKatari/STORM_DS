package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: y11  reason: default package */
/* loaded from: classes.dex */
public final class y11 {
    public static final SparseIntArray o;
    public boolean a;
    public float b;
    public float c;
    public float d;
    public float e;
    public float f;
    public float g;
    public float h;
    public int i;
    public float j;
    public float k;
    public float l;
    public boolean m;
    public float n;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        o = sparseIntArray;
        sparseIntArray.append(6, 1);
        sparseIntArray.append(7, 2);
        sparseIntArray.append(8, 3);
        sparseIntArray.append(4, 4);
        sparseIntArray.append(5, 5);
        sparseIntArray.append(0, 6);
        sparseIntArray.append(1, 7);
        sparseIntArray.append(2, 8);
        sparseIntArray.append(3, 9);
        sparseIntArray.append(9, 10);
        sparseIntArray.append(10, 11);
        sparseIntArray.append(11, 12);
    }

    public final void a(y11 y11Var) {
        this.a = y11Var.a;
        this.b = y11Var.b;
        this.c = y11Var.c;
        this.d = y11Var.d;
        this.e = y11Var.e;
        this.f = y11Var.f;
        this.g = y11Var.g;
        this.h = y11Var.h;
        this.i = y11Var.i;
        this.j = y11Var.j;
        this.k = y11Var.k;
        this.l = y11Var.l;
        this.m = y11Var.m;
        this.n = y11Var.n;
    }

    public final void b(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e75.s);
        this.a = true;
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            switch (o.get(index)) {
                case 1:
                    this.b = obtainStyledAttributes.getFloat(index, this.b);
                    break;
                case 2:
                    this.c = obtainStyledAttributes.getFloat(index, this.c);
                    break;
                case 3:
                    this.d = obtainStyledAttributes.getFloat(index, this.d);
                    break;
                case 4:
                    this.e = obtainStyledAttributes.getFloat(index, this.e);
                    break;
                case 5:
                    this.f = obtainStyledAttributes.getFloat(index, this.f);
                    break;
                case 6:
                    this.g = obtainStyledAttributes.getDimension(index, this.g);
                    break;
                case 7:
                    this.h = obtainStyledAttributes.getDimension(index, this.h);
                    break;
                case 8:
                    this.j = obtainStyledAttributes.getDimension(index, this.j);
                    break;
                case 9:
                    this.k = obtainStyledAttributes.getDimension(index, this.k);
                    break;
                case 10:
                    this.l = obtainStyledAttributes.getDimension(index, this.l);
                    break;
                case 11:
                    this.m = true;
                    this.n = obtainStyledAttributes.getDimension(index, this.n);
                    break;
                case 12:
                    this.i = z11.l(obtainStyledAttributes, index, this.i);
                    break;
            }
        }
        obtainStyledAttributes.recycle();
    }
}
