package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: xa3  reason: default package */
/* loaded from: classes.dex */
public final class xa3 extends q93 {
    public int e = -1;
    public float f = Float.NaN;
    public float g = Float.NaN;
    public float h = Float.NaN;
    public float i = Float.NaN;
    public float j = Float.NaN;
    public float k = Float.NaN;
    public float l = Float.NaN;
    public float m = Float.NaN;
    public float n = Float.NaN;
    public float o = Float.NaN;
    public float p = Float.NaN;
    public float q = Float.NaN;
    public int r = 0;
    public float s = Float.NaN;
    public float t = RecyclerView.A1;

    public xa3() {
        this.d = new HashMap();
    }

    @Override // defpackage.q93
    public final void a(HashMap hashMap) {
        throw null;
    }

    @Override // defpackage.q93
    /* renamed from: b */
    public final q93 clone() {
        xa3 xa3Var = new xa3();
        super.c(this);
        xa3Var.e = this.e;
        xa3Var.r = this.r;
        xa3Var.s = this.s;
        xa3Var.t = this.t;
        xa3Var.q = this.q;
        xa3Var.f = this.f;
        xa3Var.g = this.g;
        xa3Var.h = this.h;
        xa3Var.k = this.k;
        xa3Var.i = this.i;
        xa3Var.j = this.j;
        xa3Var.l = this.l;
        xa3Var.m = this.m;
        xa3Var.n = this.n;
        xa3Var.o = this.o;
        xa3Var.p = this.p;
        return xa3Var;
    }

    @Override // defpackage.q93
    public final void d(HashSet hashSet) {
        if (!Float.isNaN(this.f)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.g)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.h)) {
            hashSet.add("rotation");
        }
        if (!Float.isNaN(this.i)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.j)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.n)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.o)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.p)) {
            hashSet.add("translationZ");
        }
        if (!Float.isNaN(this.k)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.l)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.m)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.q)) {
            hashSet.add("progress");
        }
        if (this.d.size() > 0) {
            Iterator it = this.d.keySet().iterator();
            while (it.hasNext()) {
                hashSet.add("CUSTOM," + ((String) it.next()));
            }
        }
    }

    @Override // defpackage.q93
    public final void e(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, tx4.h);
        SparseIntArray sparseIntArray = wa3.a;
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            SparseIntArray sparseIntArray2 = wa3.a;
            switch (sparseIntArray2.get(index)) {
                case 1:
                    this.f = obtainStyledAttributes.getFloat(index, this.f);
                    break;
                case 2:
                    this.g = obtainStyledAttributes.getDimension(index, this.g);
                    break;
                case 3:
                case 11:
                default:
                    Log.e("KeyTimeCycle", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray2.get(index));
                    break;
                case 4:
                    this.h = obtainStyledAttributes.getFloat(index, this.h);
                    break;
                case 5:
                    this.i = obtainStyledAttributes.getFloat(index, this.i);
                    break;
                case ig7.b /* 6 */:
                    this.j = obtainStyledAttributes.getFloat(index, this.j);
                    break;
                case 7:
                    this.l = obtainStyledAttributes.getFloat(index, this.l);
                    break;
                case 8:
                    this.k = obtainStyledAttributes.getFloat(index, this.k);
                    break;
                case 9:
                    obtainStyledAttributes.getString(index);
                    break;
                case 10:
                    if (MotionLayout.s1) {
                        int resourceId = obtainStyledAttributes.getResourceId(index, this.b);
                        this.b = resourceId;
                        if (resourceId == -1) {
                            this.c = obtainStyledAttributes.getString(index);
                            break;
                        } else {
                            break;
                        }
                    } else if (obtainStyledAttributes.peekValue(index).type == 3) {
                        this.c = obtainStyledAttributes.getString(index);
                        break;
                    } else {
                        this.b = obtainStyledAttributes.getResourceId(index, this.b);
                        break;
                    }
                case mj2.L /* 12 */:
                    this.a = obtainStyledAttributes.getInt(index, this.a);
                    break;
                case 13:
                    this.e = obtainStyledAttributes.getInteger(index, this.e);
                    break;
                case 14:
                    this.m = obtainStyledAttributes.getFloat(index, this.m);
                    break;
                case ig7.e /* 15 */:
                    this.n = obtainStyledAttributes.getDimension(index, this.n);
                    break;
                case 16:
                    this.o = obtainStyledAttributes.getDimension(index, this.o);
                    break;
                case 17:
                    this.p = obtainStyledAttributes.getDimension(index, this.p);
                    break;
                case 18:
                    this.q = obtainStyledAttributes.getFloat(index, this.q);
                    break;
                case 19:
                    if (obtainStyledAttributes.peekValue(index).type == 3) {
                        obtainStyledAttributes.getString(index);
                        this.r = 7;
                        break;
                    } else {
                        this.r = obtainStyledAttributes.getInt(index, this.r);
                        break;
                    }
                case 20:
                    this.s = obtainStyledAttributes.getFloat(index, this.s);
                    break;
                case 21:
                    int i2 = obtainStyledAttributes.peekValue(index).type;
                    float f = this.t;
                    if (i2 == 5) {
                        this.t = obtainStyledAttributes.getDimension(index, f);
                        break;
                    } else {
                        this.t = obtainStyledAttributes.getFloat(index, f);
                        break;
                    }
            }
        }
    }

    @Override // defpackage.q93
    public final void f(HashMap hashMap) {
        if (this.e != -1) {
            if (!Float.isNaN(this.f)) {
                hashMap.put("alpha", Integer.valueOf(this.e));
            }
            if (!Float.isNaN(this.g)) {
                hashMap.put("elevation", Integer.valueOf(this.e));
            }
            if (!Float.isNaN(this.h)) {
                hashMap.put("rotation", Integer.valueOf(this.e));
            }
            if (!Float.isNaN(this.i)) {
                hashMap.put("rotationX", Integer.valueOf(this.e));
            }
            if (!Float.isNaN(this.j)) {
                hashMap.put("rotationY", Integer.valueOf(this.e));
            }
            if (!Float.isNaN(this.n)) {
                hashMap.put("translationX", Integer.valueOf(this.e));
            }
            if (!Float.isNaN(this.o)) {
                hashMap.put("translationY", Integer.valueOf(this.e));
            }
            if (!Float.isNaN(this.p)) {
                hashMap.put("translationZ", Integer.valueOf(this.e));
            }
            if (!Float.isNaN(this.k)) {
                hashMap.put("transitionPathRotate", Integer.valueOf(this.e));
            }
            if (!Float.isNaN(this.l)) {
                hashMap.put("scaleX", Integer.valueOf(this.e));
            }
            if (!Float.isNaN(this.l)) {
                hashMap.put("scaleY", Integer.valueOf(this.e));
            }
            if (!Float.isNaN(this.q)) {
                hashMap.put("progress", Integer.valueOf(this.e));
            }
            if (this.d.size() > 0) {
                for (String str : this.d.keySet()) {
                    hashMap.put(b31.p("CUSTOM,", str), Integer.valueOf(this.e));
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xa3.g(java.util.HashMap):void");
    }
}
