package i5;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class p {

    /* renamed from: o  reason: collision with root package name */
    public static final SparseIntArray f6969o;

    /* renamed from: a  reason: collision with root package name */
    public boolean f6970a;

    /* renamed from: b  reason: collision with root package name */
    public float f6971b;

    /* renamed from: c  reason: collision with root package name */
    public float f6972c;

    /* renamed from: d  reason: collision with root package name */
    public float f6973d;

    /* renamed from: e  reason: collision with root package name */
    public float f6974e;

    /* renamed from: f  reason: collision with root package name */
    public float f6975f;

    /* renamed from: g  reason: collision with root package name */
    public float f6976g;

    /* renamed from: h  reason: collision with root package name */
    public float f6977h;

    /* renamed from: i  reason: collision with root package name */
    public int f6978i;

    /* renamed from: j  reason: collision with root package name */
    public float f6979j;

    /* renamed from: k  reason: collision with root package name */
    public float f6980k;

    /* renamed from: l  reason: collision with root package name */
    public float f6981l;
    public boolean m;

    /* renamed from: n  reason: collision with root package name */
    public float f6982n;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f6969o = sparseIntArray;
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

    public final void a(p pVar) {
        this.f6970a = pVar.f6970a;
        this.f6971b = pVar.f6971b;
        this.f6972c = pVar.f6972c;
        this.f6973d = pVar.f6973d;
        this.f6974e = pVar.f6974e;
        this.f6975f = pVar.f6975f;
        this.f6976g = pVar.f6976g;
        this.f6977h = pVar.f6977h;
        this.f6978i = pVar.f6978i;
        this.f6979j = pVar.f6979j;
        this.f6980k = pVar.f6980k;
        this.f6981l = pVar.f6981l;
        this.m = pVar.m;
        this.f6982n = pVar.f6982n;
    }

    public final void b(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, v.f7010s);
        this.f6970a = true;
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = obtainStyledAttributes.getIndex(i2);
            switch (f6969o.get(index)) {
                case DSiCameraSource.FrontCamera /* 1 */:
                    this.f6971b = obtainStyledAttributes.getFloat(index, this.f6971b);
                    break;
                case 2:
                    this.f6972c = obtainStyledAttributes.getFloat(index, this.f6972c);
                    break;
                case 3:
                    this.f6973d = obtainStyledAttributes.getFloat(index, this.f6973d);
                    break;
                case 4:
                    this.f6974e = obtainStyledAttributes.getFloat(index, this.f6974e);
                    break;
                case l1.c.f8511g /* 5 */:
                    this.f6975f = obtainStyledAttributes.getFloat(index, this.f6975f);
                    break;
                case l1.c.f8509e /* 6 */:
                    this.f6976g = obtainStyledAttributes.getDimension(index, this.f6976g);
                    break;
                case 7:
                    this.f6977h = obtainStyledAttributes.getDimension(index, this.f6977h);
                    break;
                case 8:
                    this.f6979j = obtainStyledAttributes.getDimension(index, this.f6979j);
                    break;
                case l1.c.f8508d /* 9 */:
                    this.f6980k = obtainStyledAttributes.getDimension(index, this.f6980k);
                    break;
                case l1.c.f8510f /* 10 */:
                    this.f6981l = obtainStyledAttributes.getDimension(index, this.f6981l);
                    break;
                case 11:
                    this.m = true;
                    this.f6982n = obtainStyledAttributes.getDimension(index, this.f6982n);
                    break;
                case 12:
                    this.f6978i = q.l(obtainStyledAttributes, index, this.f6978i);
                    break;
            }
        }
        obtainStyledAttributes.recycle();
    }
}
