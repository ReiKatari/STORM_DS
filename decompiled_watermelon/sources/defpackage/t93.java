package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import androidx.constraintlayout.motion.widget.MotionLayout;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: t93  reason: default package */
/* loaded from: classes.dex */
public final class t93 extends q93 {
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
    public float r = Float.NaN;
    public float s = Float.NaN;

    public t93() {
        this.d = new HashMap();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x009c, code lost:
        if (r1.equals("scaleY") == false) goto L12;
     */
    @Override // defpackage.q93
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(java.util.HashMap r7) {
        /*
            Method dump skipped, instructions count: 574
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t93.a(java.util.HashMap):void");
    }

    @Override // defpackage.q93
    /* renamed from: b */
    public final q93 clone() {
        t93 t93Var = new t93();
        super.c(this);
        t93Var.e = this.e;
        t93Var.f = this.f;
        t93Var.g = this.g;
        t93Var.h = this.h;
        t93Var.i = this.i;
        t93Var.j = this.j;
        t93Var.k = this.k;
        t93Var.l = this.l;
        t93Var.m = this.m;
        t93Var.n = this.n;
        t93Var.o = this.o;
        t93Var.p = this.p;
        t93Var.q = this.q;
        t93Var.r = this.r;
        t93Var.s = this.s;
        return t93Var;
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
        if (!Float.isNaN(this.k)) {
            hashSet.add("transformPivotX");
        }
        if (!Float.isNaN(this.l)) {
            hashSet.add("transformPivotY");
        }
        if (!Float.isNaN(this.p)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.q)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.r)) {
            hashSet.add("translationZ");
        }
        if (!Float.isNaN(this.m)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.n)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.o)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.s)) {
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
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, tx4.e);
        SparseIntArray sparseIntArray = s93.a;
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            SparseIntArray sparseIntArray2 = s93.a;
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
                    Log.e("KeyAttribute", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray2.get(index));
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
                    this.n = obtainStyledAttributes.getFloat(index, this.n);
                    break;
                case 8:
                    this.m = obtainStyledAttributes.getFloat(index, this.m);
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
                    this.o = obtainStyledAttributes.getFloat(index, this.o);
                    break;
                case ig7.e /* 15 */:
                    this.p = obtainStyledAttributes.getDimension(index, this.p);
                    break;
                case 16:
                    this.q = obtainStyledAttributes.getDimension(index, this.q);
                    break;
                case 17:
                    this.r = obtainStyledAttributes.getDimension(index, this.r);
                    break;
                case 18:
                    this.s = obtainStyledAttributes.getFloat(index, this.s);
                    break;
                case 19:
                    this.k = obtainStyledAttributes.getDimension(index, this.k);
                    break;
                case 20:
                    this.l = obtainStyledAttributes.getDimension(index, this.l);
                    break;
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
            if (!Float.isNaN(this.k)) {
                hashMap.put("transformPivotX", Integer.valueOf(this.e));
            }
            if (!Float.isNaN(this.l)) {
                hashMap.put("transformPivotY", Integer.valueOf(this.e));
            }
            if (!Float.isNaN(this.p)) {
                hashMap.put("translationX", Integer.valueOf(this.e));
            }
            if (!Float.isNaN(this.q)) {
                hashMap.put("translationY", Integer.valueOf(this.e));
            }
            if (!Float.isNaN(this.r)) {
                hashMap.put("translationZ", Integer.valueOf(this.e));
            }
            if (!Float.isNaN(this.m)) {
                hashMap.put("transitionPathRotate", Integer.valueOf(this.e));
            }
            if (!Float.isNaN(this.n)) {
                hashMap.put("scaleX", Integer.valueOf(this.e));
            }
            if (!Float.isNaN(this.o)) {
                hashMap.put("scaleY", Integer.valueOf(this.e));
            }
            if (!Float.isNaN(this.s)) {
                hashMap.put("progress", Integer.valueOf(this.e));
            }
            if (this.d.size() > 0) {
                for (String str : this.d.keySet()) {
                    hashMap.put(b31.p("CUSTOM,", str), Integer.valueOf(this.e));
                }
            }
        }
    }
}
