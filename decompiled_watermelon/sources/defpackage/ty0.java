package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ty0  reason: default package */
/* loaded from: classes.dex */
public final class ty0 {
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

    public final void a(ty0 ty0Var) {
        this.a = ty0Var.a;
        this.b = ty0Var.b;
        this.c = ty0Var.c;
        this.d = ty0Var.d;
        this.e = ty0Var.e;
        this.f = ty0Var.f;
        this.g = ty0Var.g;
        this.h = ty0Var.h;
        this.i = ty0Var.i;
        this.j = ty0Var.j;
        this.k = ty0Var.k;
        this.l = ty0Var.l;
        this.m = ty0Var.m;
        this.n = ty0Var.n;
    }

    public final void b(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, tx4.s);
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
                case ig7.b /* 6 */:
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
                case mj2.L /* 12 */:
                    this.i = uy0.l(obtainStyledAttributes, index, this.i);
                    break;
            }
        }
        obtainStyledAttributes.recycle();
    }
}
