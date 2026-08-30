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
public final class k extends b {

    /* renamed from: e  reason: collision with root package name */
    public int f6163e = -1;

    /* renamed from: f  reason: collision with root package name */
    public float f6164f = Float.NaN;

    /* renamed from: g  reason: collision with root package name */
    public float f6165g = Float.NaN;

    /* renamed from: h  reason: collision with root package name */
    public float f6166h = Float.NaN;

    /* renamed from: i  reason: collision with root package name */
    public float f6167i = Float.NaN;

    /* renamed from: j  reason: collision with root package name */
    public float f6168j = Float.NaN;

    /* renamed from: k  reason: collision with root package name */
    public float f6169k = Float.NaN;

    /* renamed from: l  reason: collision with root package name */
    public float f6170l = Float.NaN;
    public float m = Float.NaN;

    /* renamed from: n  reason: collision with root package name */
    public float f6171n = Float.NaN;

    /* renamed from: o  reason: collision with root package name */
    public float f6172o = Float.NaN;

    /* renamed from: p  reason: collision with root package name */
    public float f6173p = Float.NaN;

    /* renamed from: q  reason: collision with root package name */
    public float f6174q = Float.NaN;

    /* renamed from: r  reason: collision with root package name */
    public int f6175r = 0;

    /* renamed from: s  reason: collision with root package name */
    public float f6176s = Float.NaN;

    /* renamed from: t  reason: collision with root package name */
    public float f6177t = 0.0f;

    public k() {
        this.f6084d = new HashMap();
    }

    @Override // h5.b
    public final void a(HashMap hashMap) {
        throw null;
    }

    @Override // h5.b
    /* renamed from: b */
    public final b clone() {
        k kVar = new k();
        super.c(this);
        kVar.f6163e = this.f6163e;
        kVar.f6175r = this.f6175r;
        kVar.f6176s = this.f6176s;
        kVar.f6177t = this.f6177t;
        kVar.f6174q = this.f6174q;
        kVar.f6164f = this.f6164f;
        kVar.f6165g = this.f6165g;
        kVar.f6166h = this.f6166h;
        kVar.f6169k = this.f6169k;
        kVar.f6167i = this.f6167i;
        kVar.f6168j = this.f6168j;
        kVar.f6170l = this.f6170l;
        kVar.m = this.m;
        kVar.f6171n = this.f6171n;
        kVar.f6172o = this.f6172o;
        kVar.f6173p = this.f6173p;
        return kVar;
    }

    @Override // h5.b
    public final void d(HashSet hashSet) {
        if (!Float.isNaN(this.f6164f)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.f6165g)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.f6166h)) {
            hashSet.add("rotation");
        }
        if (!Float.isNaN(this.f6167i)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.f6168j)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.f6171n)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.f6172o)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.f6173p)) {
            hashSet.add("translationZ");
        }
        if (!Float.isNaN(this.f6169k)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.f6170l)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.m)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.f6174q)) {
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
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i5.v.f7000h);
        SparseIntArray sparseIntArray = j.f6162a;
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = obtainStyledAttributes.getIndex(i2);
            SparseIntArray sparseIntArray2 = j.f6162a;
            switch (sparseIntArray2.get(index)) {
                case DSiCameraSource.FrontCamera /* 1 */:
                    this.f6164f = obtainStyledAttributes.getFloat(index, this.f6164f);
                    break;
                case 2:
                    this.f6165g = obtainStyledAttributes.getDimension(index, this.f6165g);
                    break;
                case 3:
                case 11:
                default:
                    Log.e("KeyTimeCycle", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray2.get(index));
                    break;
                case 4:
                    this.f6166h = obtainStyledAttributes.getFloat(index, this.f6166h);
                    break;
                case l1.c.f8511g /* 5 */:
                    this.f6167i = obtainStyledAttributes.getFloat(index, this.f6167i);
                    break;
                case l1.c.f8509e /* 6 */:
                    this.f6168j = obtainStyledAttributes.getFloat(index, this.f6168j);
                    break;
                case 7:
                    this.f6170l = obtainStyledAttributes.getFloat(index, this.f6170l);
                    break;
                case 8:
                    this.f6169k = obtainStyledAttributes.getFloat(index, this.f6169k);
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
                    this.f6163e = obtainStyledAttributes.getInteger(index, this.f6163e);
                    break;
                case 14:
                    this.m = obtainStyledAttributes.getFloat(index, this.m);
                    break;
                case l1.c.f8512h /* 15 */:
                    this.f6171n = obtainStyledAttributes.getDimension(index, this.f6171n);
                    break;
                case 16:
                    this.f6172o = obtainStyledAttributes.getDimension(index, this.f6172o);
                    break;
                case 17:
                    this.f6173p = obtainStyledAttributes.getDimension(index, this.f6173p);
                    break;
                case 18:
                    this.f6174q = obtainStyledAttributes.getFloat(index, this.f6174q);
                    break;
                case 19:
                    if (obtainStyledAttributes.peekValue(index).type == 3) {
                        obtainStyledAttributes.getString(index);
                        this.f6175r = 7;
                        break;
                    } else {
                        this.f6175r = obtainStyledAttributes.getInt(index, this.f6175r);
                        break;
                    }
                case 20:
                    this.f6176s = obtainStyledAttributes.getFloat(index, this.f6176s);
                    break;
                case 21:
                    int i10 = obtainStyledAttributes.peekValue(index).type;
                    float f8 = this.f6177t;
                    if (i10 == 5) {
                        this.f6177t = obtainStyledAttributes.getDimension(index, f8);
                        break;
                    } else {
                        this.f6177t = obtainStyledAttributes.getFloat(index, f8);
                        break;
                    }
            }
        }
    }

    @Override // h5.b
    public final void f(HashMap hashMap) {
        if (this.f6163e != -1) {
            if (!Float.isNaN(this.f6164f)) {
                hashMap.put("alpha", Integer.valueOf(this.f6163e));
            }
            if (!Float.isNaN(this.f6165g)) {
                hashMap.put("elevation", Integer.valueOf(this.f6163e));
            }
            if (!Float.isNaN(this.f6166h)) {
                hashMap.put("rotation", Integer.valueOf(this.f6163e));
            }
            if (!Float.isNaN(this.f6167i)) {
                hashMap.put("rotationX", Integer.valueOf(this.f6163e));
            }
            if (!Float.isNaN(this.f6168j)) {
                hashMap.put("rotationY", Integer.valueOf(this.f6163e));
            }
            if (!Float.isNaN(this.f6171n)) {
                hashMap.put("translationX", Integer.valueOf(this.f6163e));
            }
            if (!Float.isNaN(this.f6172o)) {
                hashMap.put("translationY", Integer.valueOf(this.f6163e));
            }
            if (!Float.isNaN(this.f6173p)) {
                hashMap.put("translationZ", Integer.valueOf(this.f6163e));
            }
            if (!Float.isNaN(this.f6169k)) {
                hashMap.put("transitionPathRotate", Integer.valueOf(this.f6163e));
            }
            if (!Float.isNaN(this.f6170l)) {
                hashMap.put("scaleX", Integer.valueOf(this.f6163e));
            }
            if (!Float.isNaN(this.f6170l)) {
                hashMap.put("scaleY", Integer.valueOf(this.f6163e));
            }
            if (!Float.isNaN(this.f6174q)) {
                hashMap.put("progress", Integer.valueOf(this.f6163e));
            }
            if (this.f6084d.size() > 0) {
                Iterator it = this.f6084d.keySet().iterator();
                while (it.hasNext()) {
                    hashMap.put("CUSTOM," + ((String) it.next()), Integer.valueOf(this.f6163e));
                }
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00e2, code lost:
        if (r1.equals("rotationY") == false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(java.util.HashMap r12) {
        /*
            Method dump skipped, instructions count: 626
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: h5.k.g(java.util.HashMap):void");
    }
}
