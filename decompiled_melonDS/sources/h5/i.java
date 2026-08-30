package h5;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import androidx.constraintlayout.motion.widget.MotionLayout;
import java.util.HashMap;
import java.util.HashSet;
import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class i extends b {

    /* renamed from: e  reason: collision with root package name */
    public int f6154e = -1;

    /* renamed from: f  reason: collision with root package name */
    public String f6155f = null;

    /* renamed from: g  reason: collision with root package name */
    public int f6156g = -1;

    /* renamed from: h  reason: collision with root package name */
    public int f6157h = 0;

    /* renamed from: i  reason: collision with root package name */
    public float f6158i = Float.NaN;

    /* renamed from: j  reason: collision with root package name */
    public float f6159j = Float.NaN;

    /* renamed from: k  reason: collision with root package name */
    public float f6160k = Float.NaN;

    /* renamed from: l  reason: collision with root package name */
    public float f6161l = Float.NaN;
    public int m = 0;

    @Override // h5.b
    public final void a(HashMap hashMap) {
        throw null;
    }

    @Override // h5.b
    /* renamed from: b */
    public final b clone() {
        i iVar = new i();
        super.c(this);
        iVar.f6155f = this.f6155f;
        iVar.f6156g = this.f6156g;
        iVar.f6157h = this.f6157h;
        iVar.f6158i = this.f6158i;
        iVar.f6159j = Float.NaN;
        iVar.f6160k = this.f6160k;
        iVar.f6161l = this.f6161l;
        return iVar;
    }

    @Override // h5.b
    public final void e(Context context, AttributeSet attributeSet) {
        SparseIntArray sparseIntArray;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i5.v.f6999g);
        SparseIntArray sparseIntArray2 = h.f6153a;
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = obtainStyledAttributes.getIndex(i2);
            switch (h.f6153a.get(index)) {
                case DSiCameraSource.FrontCamera /* 1 */:
                    if (MotionLayout.f1074r1) {
                        int resourceId = obtainStyledAttributes.getResourceId(index, this.f6082b);
                        this.f6082b = resourceId;
                        if (resourceId == -1) {
                            this.f6083c = obtainStyledAttributes.getString(index);
                            break;
                        } else {
                            break;
                        }
                    } else if (obtainStyledAttributes.peekValue(index).type == 3) {
                        this.f6083c = obtainStyledAttributes.getString(index);
                        break;
                    } else {
                        this.f6082b = obtainStyledAttributes.getResourceId(index, this.f6082b);
                        break;
                    }
                case 2:
                    this.f6081a = obtainStyledAttributes.getInt(index, this.f6081a);
                    break;
                case 3:
                    if (obtainStyledAttributes.peekValue(index).type == 3) {
                        this.f6155f = obtainStyledAttributes.getString(index);
                        break;
                    } else {
                        this.f6155f = d5.e.f3836d[obtainStyledAttributes.getInteger(index, 0)];
                        break;
                    }
                case 4:
                    this.f6154e = obtainStyledAttributes.getInteger(index, this.f6154e);
                    break;
                case l1.c.f8511g /* 5 */:
                    this.f6157h = obtainStyledAttributes.getInt(index, this.f6157h);
                    break;
                case l1.c.f8509e /* 6 */:
                    this.f6160k = obtainStyledAttributes.getFloat(index, this.f6160k);
                    break;
                case 7:
                    this.f6161l = obtainStyledAttributes.getFloat(index, this.f6161l);
                    break;
                case 8:
                    float f8 = obtainStyledAttributes.getFloat(index, this.f6159j);
                    this.f6158i = f8;
                    this.f6159j = f8;
                    break;
                case l1.c.f8508d /* 9 */:
                    this.m = obtainStyledAttributes.getInt(index, this.m);
                    break;
                case l1.c.f8510f /* 10 */:
                    this.f6156g = obtainStyledAttributes.getInt(index, this.f6156g);
                    break;
                case 11:
                    this.f6158i = obtainStyledAttributes.getFloat(index, this.f6158i);
                    break;
                case 12:
                    this.f6159j = obtainStyledAttributes.getFloat(index, this.f6159j);
                    break;
                default:
                    Log.e("KeyPosition", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                    break;
            }
        }
        if (this.f6081a == -1) {
            Log.e("KeyPosition", "no frame position");
        }
    }

    @Override // h5.b
    public final void d(HashSet hashSet) {
    }
}
