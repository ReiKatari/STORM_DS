package h5;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import androidx.constraintlayout.motion.widget.MotionLayout;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class d extends b {

    /* renamed from: e  reason: collision with root package name */
    public int f6118e = -1;

    /* renamed from: f  reason: collision with root package name */
    public float f6119f = Float.NaN;

    /* renamed from: g  reason: collision with root package name */
    public float f6120g = Float.NaN;

    /* renamed from: h  reason: collision with root package name */
    public float f6121h = Float.NaN;

    /* renamed from: i  reason: collision with root package name */
    public float f6122i = Float.NaN;

    /* renamed from: j  reason: collision with root package name */
    public float f6123j = Float.NaN;

    /* renamed from: k  reason: collision with root package name */
    public float f6124k = Float.NaN;

    /* renamed from: l  reason: collision with root package name */
    public float f6125l = Float.NaN;
    public float m = Float.NaN;

    /* renamed from: n  reason: collision with root package name */
    public float f6126n = Float.NaN;

    /* renamed from: o  reason: collision with root package name */
    public float f6127o = Float.NaN;

    /* renamed from: p  reason: collision with root package name */
    public float f6128p = Float.NaN;

    /* renamed from: q  reason: collision with root package name */
    public float f6129q = Float.NaN;

    /* renamed from: r  reason: collision with root package name */
    public float f6130r = Float.NaN;

    /* renamed from: s  reason: collision with root package name */
    public float f6131s = Float.NaN;

    public d() {
        this.f6084d = new HashMap();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x009c, code lost:
        if (r1.equals("scaleY") == false) goto L12;
     */
    @Override // h5.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(java.util.HashMap r7) {
        /*
            Method dump skipped, instructions count: 574
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: h5.d.a(java.util.HashMap):void");
    }

    @Override // h5.b
    /* renamed from: b */
    public final b clone() {
        d dVar = new d();
        super.c(this);
        dVar.f6118e = this.f6118e;
        dVar.f6119f = this.f6119f;
        dVar.f6120g = this.f6120g;
        dVar.f6121h = this.f6121h;
        dVar.f6122i = this.f6122i;
        dVar.f6123j = this.f6123j;
        dVar.f6124k = this.f6124k;
        dVar.f6125l = this.f6125l;
        dVar.m = this.m;
        dVar.f6126n = this.f6126n;
        dVar.f6127o = this.f6127o;
        dVar.f6128p = this.f6128p;
        dVar.f6129q = this.f6129q;
        dVar.f6130r = this.f6130r;
        dVar.f6131s = this.f6131s;
        return dVar;
    }

    @Override // h5.b
    public final void d(HashSet hashSet) {
        if (!Float.isNaN(this.f6119f)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.f6120g)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.f6121h)) {
            hashSet.add("rotation");
        }
        if (!Float.isNaN(this.f6122i)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.f6123j)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.f6124k)) {
            hashSet.add("transformPivotX");
        }
        if (!Float.isNaN(this.f6125l)) {
            hashSet.add("transformPivotY");
        }
        if (!Float.isNaN(this.f6128p)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.f6129q)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.f6130r)) {
            hashSet.add("translationZ");
        }
        if (!Float.isNaN(this.m)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.f6126n)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.f6127o)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.f6131s)) {
            hashSet.add("progress");
        }
        if (this.f6084d.size() > 0) {
            Iterator it = this.f6084d.keySet().iterator();
            while (it.hasNext()) {
                hashSet.add("CUSTOM," + ((String) it.next()));
            }
        }
    }

    @Override // h5.b
    public final void e(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i5.v.f6997e);
        SparseIntArray sparseIntArray = c.f6097a;
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = obtainStyledAttributes.getIndex(i2);
            SparseIntArray sparseIntArray2 = c.f6097a;
            switch (sparseIntArray2.get(index)) {
                case DSiCameraSource.FrontCamera /* 1 */:
                    this.f6119f = obtainStyledAttributes.getFloat(index, this.f6119f);
                    break;
                case 2:
                    this.f6120g = obtainStyledAttributes.getDimension(index, this.f6120g);
                    break;
                case 3:
                case 11:
                default:
                    Log.e("KeyAttribute", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray2.get(index));
                    break;
                case 4:
                    this.f6121h = obtainStyledAttributes.getFloat(index, this.f6121h);
                    break;
                case l1.c.f8511g /* 5 */:
                    this.f6122i = obtainStyledAttributes.getFloat(index, this.f6122i);
                    break;
                case l1.c.f8509e /* 6 */:
                    this.f6123j = obtainStyledAttributes.getFloat(index, this.f6123j);
                    break;
                case 7:
                    this.f6126n = obtainStyledAttributes.getFloat(index, this.f6126n);
                    break;
                case 8:
                    this.m = obtainStyledAttributes.getFloat(index, this.m);
                    break;
                case l1.c.f8508d /* 9 */:
                    obtainStyledAttributes.getString(index);
                    break;
                case l1.c.f8510f /* 10 */:
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
                case 12:
                    this.f6081a = obtainStyledAttributes.getInt(index, this.f6081a);
                    break;
                case 13:
                    this.f6118e = obtainStyledAttributes.getInteger(index, this.f6118e);
                    break;
                case 14:
                    this.f6127o = obtainStyledAttributes.getFloat(index, this.f6127o);
                    break;
                case l1.c.f8512h /* 15 */:
                    this.f6128p = obtainStyledAttributes.getDimension(index, this.f6128p);
                    break;
                case 16:
                    this.f6129q = obtainStyledAttributes.getDimension(index, this.f6129q);
                    break;
                case 17:
                    this.f6130r = obtainStyledAttributes.getDimension(index, this.f6130r);
                    break;
                case 18:
                    this.f6131s = obtainStyledAttributes.getFloat(index, this.f6131s);
                    break;
                case 19:
                    this.f6124k = obtainStyledAttributes.getDimension(index, this.f6124k);
                    break;
                case 20:
                    this.f6125l = obtainStyledAttributes.getDimension(index, this.f6125l);
                    break;
            }
        }
    }

    @Override // h5.b
    public final void f(HashMap hashMap) {
        if (this.f6118e != -1) {
            if (!Float.isNaN(this.f6119f)) {
                hashMap.put("alpha", Integer.valueOf(this.f6118e));
            }
            if (!Float.isNaN(this.f6120g)) {
                hashMap.put("elevation", Integer.valueOf(this.f6118e));
            }
            if (!Float.isNaN(this.f6121h)) {
                hashMap.put("rotation", Integer.valueOf(this.f6118e));
            }
            if (!Float.isNaN(this.f6122i)) {
                hashMap.put("rotationX", Integer.valueOf(this.f6118e));
            }
            if (!Float.isNaN(this.f6123j)) {
                hashMap.put("rotationY", Integer.valueOf(this.f6118e));
            }
            if (!Float.isNaN(this.f6124k)) {
                hashMap.put("transformPivotX", Integer.valueOf(this.f6118e));
            }
            if (!Float.isNaN(this.f6125l)) {
                hashMap.put("transformPivotY", Integer.valueOf(this.f6118e));
            }
            if (!Float.isNaN(this.f6128p)) {
                hashMap.put("translationX", Integer.valueOf(this.f6118e));
            }
            if (!Float.isNaN(this.f6129q)) {
                hashMap.put("translationY", Integer.valueOf(this.f6118e));
            }
            if (!Float.isNaN(this.f6130r)) {
                hashMap.put("translationZ", Integer.valueOf(this.f6118e));
            }
            if (!Float.isNaN(this.m)) {
                hashMap.put("transitionPathRotate", Integer.valueOf(this.f6118e));
            }
            if (!Float.isNaN(this.f6126n)) {
                hashMap.put("scaleX", Integer.valueOf(this.f6118e));
            }
            if (!Float.isNaN(this.f6127o)) {
                hashMap.put("scaleY", Integer.valueOf(this.f6118e));
            }
            if (!Float.isNaN(this.f6131s)) {
                hashMap.put("progress", Integer.valueOf(this.f6118e));
            }
            if (this.f6084d.size() > 0) {
                Iterator it = this.f6084d.keySet().iterator();
                while (it.hasNext()) {
                    hashMap.put("CUSTOM," + ((String) it.next()), Integer.valueOf(this.f6118e));
                }
            }
        }
    }
}
