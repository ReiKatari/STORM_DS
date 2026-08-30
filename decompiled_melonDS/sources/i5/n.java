package i5;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class n {

    /* renamed from: n  reason: collision with root package name */
    public static final SparseIntArray f6951n;

    /* renamed from: a  reason: collision with root package name */
    public boolean f6952a;

    /* renamed from: b  reason: collision with root package name */
    public int f6953b;

    /* renamed from: c  reason: collision with root package name */
    public int f6954c;

    /* renamed from: d  reason: collision with root package name */
    public String f6955d;

    /* renamed from: e  reason: collision with root package name */
    public int f6956e;

    /* renamed from: f  reason: collision with root package name */
    public int f6957f;

    /* renamed from: g  reason: collision with root package name */
    public float f6958g;

    /* renamed from: h  reason: collision with root package name */
    public float f6959h;

    /* renamed from: i  reason: collision with root package name */
    public float f6960i;

    /* renamed from: j  reason: collision with root package name */
    public int f6961j;

    /* renamed from: k  reason: collision with root package name */
    public String f6962k;

    /* renamed from: l  reason: collision with root package name */
    public int f6963l;
    public int m;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f6951n = sparseIntArray;
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

    public final void a(n nVar) {
        this.f6952a = nVar.f6952a;
        this.f6953b = nVar.f6953b;
        this.f6955d = nVar.f6955d;
        this.f6956e = nVar.f6956e;
        this.f6957f = nVar.f6957f;
        this.f6959h = nVar.f6959h;
        this.f6958g = nVar.f6958g;
    }

    public final void b(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, v.f7003k);
        this.f6952a = true;
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = obtainStyledAttributes.getIndex(i2);
            switch (f6951n.get(index)) {
                case DSiCameraSource.FrontCamera /* 1 */:
                    this.f6959h = obtainStyledAttributes.getFloat(index, this.f6959h);
                    break;
                case 2:
                    this.f6956e = obtainStyledAttributes.getInt(index, this.f6956e);
                    break;
                case 3:
                    if (obtainStyledAttributes.peekValue(index).type == 3) {
                        this.f6955d = obtainStyledAttributes.getString(index);
                        break;
                    } else {
                        this.f6955d = d5.e.f3836d[obtainStyledAttributes.getInteger(index, 0)];
                        break;
                    }
                case 4:
                    this.f6957f = obtainStyledAttributes.getInt(index, 0);
                    break;
                case l1.c.f8511g /* 5 */:
                    this.f6953b = q.l(obtainStyledAttributes, index, this.f6953b);
                    break;
                case l1.c.f8509e /* 6 */:
                    this.f6954c = obtainStyledAttributes.getInteger(index, this.f6954c);
                    break;
                case 7:
                    this.f6958g = obtainStyledAttributes.getFloat(index, this.f6958g);
                    break;
                case 8:
                    this.f6961j = obtainStyledAttributes.getInteger(index, this.f6961j);
                    break;
                case l1.c.f8508d /* 9 */:
                    this.f6960i = obtainStyledAttributes.getFloat(index, this.f6960i);
                    break;
                case l1.c.f8510f /* 10 */:
                    int i10 = obtainStyledAttributes.peekValue(index).type;
                    if (i10 == 1) {
                        int resourceId = obtainStyledAttributes.getResourceId(index, -1);
                        this.m = resourceId;
                        if (resourceId != -1) {
                            this.f6963l = -2;
                            break;
                        } else {
                            break;
                        }
                    } else if (i10 == 3) {
                        String string = obtainStyledAttributes.getString(index);
                        this.f6962k = string;
                        if (string.indexOf("/") > 0) {
                            this.m = obtainStyledAttributes.getResourceId(index, -1);
                            this.f6963l = -2;
                            break;
                        } else {
                            this.f6963l = -1;
                            break;
                        }
                    } else {
                        this.f6963l = obtainStyledAttributes.getInteger(index, this.m);
                        break;
                    }
            }
        }
        obtainStyledAttributes.recycle();
    }
}
