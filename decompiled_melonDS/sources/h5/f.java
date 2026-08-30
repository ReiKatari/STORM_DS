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
public final class f extends b {

    /* renamed from: e  reason: collision with root package name */
    public int f6133e = 0;

    /* renamed from: f  reason: collision with root package name */
    public int f6134f = -1;

    /* renamed from: g  reason: collision with root package name */
    public String f6135g = null;

    /* renamed from: h  reason: collision with root package name */
    public float f6136h = Float.NaN;

    /* renamed from: i  reason: collision with root package name */
    public float f6137i = 0.0f;

    /* renamed from: j  reason: collision with root package name */
    public float f6138j = 0.0f;

    /* renamed from: k  reason: collision with root package name */
    public float f6139k = Float.NaN;

    /* renamed from: l  reason: collision with root package name */
    public int f6140l = -1;
    public float m = Float.NaN;

    /* renamed from: n  reason: collision with root package name */
    public float f6141n = Float.NaN;

    /* renamed from: o  reason: collision with root package name */
    public float f6142o = Float.NaN;

    /* renamed from: p  reason: collision with root package name */
    public float f6143p = Float.NaN;

    /* renamed from: q  reason: collision with root package name */
    public float f6144q = Float.NaN;

    /* renamed from: r  reason: collision with root package name */
    public float f6145r = Float.NaN;

    /* renamed from: s  reason: collision with root package name */
    public float f6146s = Float.NaN;

    /* renamed from: t  reason: collision with root package name */
    public float f6147t = Float.NaN;

    /* renamed from: u  reason: collision with root package name */
    public float f6148u = Float.NaN;

    /* renamed from: v  reason: collision with root package name */
    public float f6149v = Float.NaN;

    /* renamed from: w  reason: collision with root package name */
    public float f6150w = Float.NaN;

    public f() {
        this.f6084d = new HashMap();
    }

    @Override // h5.b
    public final void a(HashMap hashMap) {
        throw null;
    }

    @Override // h5.b
    /* renamed from: b */
    public final b clone() {
        f fVar = new f();
        super.c(this);
        fVar.f6133e = this.f6133e;
        fVar.f6134f = this.f6134f;
        fVar.f6135g = this.f6135g;
        fVar.f6136h = this.f6136h;
        fVar.f6137i = this.f6137i;
        fVar.f6138j = this.f6138j;
        fVar.f6139k = this.f6139k;
        fVar.f6140l = this.f6140l;
        fVar.m = this.m;
        fVar.f6141n = this.f6141n;
        fVar.f6142o = this.f6142o;
        fVar.f6143p = this.f6143p;
        fVar.f6144q = this.f6144q;
        fVar.f6145r = this.f6145r;
        fVar.f6146s = this.f6146s;
        fVar.f6147t = this.f6147t;
        fVar.f6148u = this.f6148u;
        fVar.f6149v = this.f6149v;
        fVar.f6150w = this.f6150w;
        return fVar;
    }

    @Override // h5.b
    public final void d(HashSet hashSet) {
        if (!Float.isNaN(this.m)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.f6141n)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.f6142o)) {
            hashSet.add("rotation");
        }
        if (!Float.isNaN(this.f6144q)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.f6145r)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.f6146s)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.f6147t)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.f6143p)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.f6148u)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.f6149v)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.f6150w)) {
            hashSet.add("translationZ");
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
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i5.v.f6998f);
        SparseIntArray sparseIntArray = e.f6132a;
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = obtainStyledAttributes.getIndex(i2);
            SparseIntArray sparseIntArray2 = e.f6132a;
            switch (sparseIntArray2.get(index)) {
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
                    obtainStyledAttributes.getString(index);
                    break;
                case 4:
                    this.f6133e = obtainStyledAttributes.getInteger(index, this.f6133e);
                    break;
                case l1.c.f8511g /* 5 */:
                    if (obtainStyledAttributes.peekValue(index).type == 3) {
                        this.f6135g = obtainStyledAttributes.getString(index);
                        this.f6134f = 7;
                        break;
                    } else {
                        this.f6134f = obtainStyledAttributes.getInt(index, this.f6134f);
                        break;
                    }
                case l1.c.f8509e /* 6 */:
                    this.f6136h = obtainStyledAttributes.getFloat(index, this.f6136h);
                    break;
                case 7:
                    int i10 = obtainStyledAttributes.peekValue(index).type;
                    float f8 = this.f6137i;
                    if (i10 == 5) {
                        this.f6137i = obtainStyledAttributes.getDimension(index, f8);
                        break;
                    } else {
                        this.f6137i = obtainStyledAttributes.getFloat(index, f8);
                        break;
                    }
                case 8:
                    this.f6140l = obtainStyledAttributes.getInt(index, this.f6140l);
                    break;
                case l1.c.f8508d /* 9 */:
                    this.m = obtainStyledAttributes.getFloat(index, this.m);
                    break;
                case l1.c.f8510f /* 10 */:
                    this.f6141n = obtainStyledAttributes.getDimension(index, this.f6141n);
                    break;
                case 11:
                    this.f6142o = obtainStyledAttributes.getFloat(index, this.f6142o);
                    break;
                case 12:
                    this.f6144q = obtainStyledAttributes.getFloat(index, this.f6144q);
                    break;
                case 13:
                    this.f6145r = obtainStyledAttributes.getFloat(index, this.f6145r);
                    break;
                case 14:
                    this.f6143p = obtainStyledAttributes.getFloat(index, this.f6143p);
                    break;
                case l1.c.f8512h /* 15 */:
                    this.f6146s = obtainStyledAttributes.getFloat(index, this.f6146s);
                    break;
                case 16:
                    this.f6147t = obtainStyledAttributes.getFloat(index, this.f6147t);
                    break;
                case 17:
                    this.f6148u = obtainStyledAttributes.getDimension(index, this.f6148u);
                    break;
                case 18:
                    this.f6149v = obtainStyledAttributes.getDimension(index, this.f6149v);
                    break;
                case 19:
                    this.f6150w = obtainStyledAttributes.getDimension(index, this.f6150w);
                    break;
                case 20:
                    this.f6139k = obtainStyledAttributes.getFloat(index, this.f6139k);
                    break;
                case 21:
                    this.f6138j = obtainStyledAttributes.getFloat(index, this.f6138j) / 360.0f;
                    break;
                default:
                    Log.e("KeyCycle", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray2.get(index));
                    break;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00c1, code lost:
        if (r1.equals("scaleY") == false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(java.util.HashMap r15) {
        /*
            Method dump skipped, instructions count: 486
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: h5.f.g(java.util.HashMap):void");
    }
}
