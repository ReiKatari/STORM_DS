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
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: mg3  reason: default package */
/* loaded from: classes.dex */
public final class mg3 extends jg3 {
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

    public mg3() {
        this.d = new HashMap();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x009c, code lost:
        if (r1.equals("scaleY") == false) goto L12;
     */
    @Override // defpackage.jg3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(HashMap hashMap) {
        for (String str : hashMap.keySet()) {
            qp7 qp7Var = (qp7) hashMap.get(str);
            if (qp7Var != null) {
                char c = 7;
                if (str.startsWith("CUSTOM")) {
                    j11 j11Var = (j11) this.d.get(str.substring(7));
                    if (j11Var != null) {
                        ((np7) qp7Var).f.append(this.a, j11Var);
                    }
                } else {
                    switch (str.hashCode()) {
                        case -1249320806:
                            if (str.equals("rotationX")) {
                                c = 0;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1249320805:
                            if (str.equals("rotationY")) {
                                c = 1;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1225497657:
                            if (str.equals("translationX")) {
                                c = 2;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1225497656:
                            if (str.equals("translationY")) {
                                c = 3;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1225497655:
                            if (str.equals("translationZ")) {
                                c = 4;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1001078227:
                            if (str.equals("progress")) {
                                c = 5;
                                break;
                            }
                            c = 65535;
                            break;
                        case -908189618:
                            if (str.equals("scaleX")) {
                                c = 6;
                                break;
                            }
                            c = 65535;
                            break;
                        case -908189617:
                            break;
                        case -760884510:
                            if (str.equals("transformPivotX")) {
                                c = '\b';
                                break;
                            }
                            c = 65535;
                            break;
                        case -760884509:
                            if (str.equals("transformPivotY")) {
                                c = '\t';
                                break;
                            }
                            c = 65535;
                            break;
                        case -40300674:
                            if (str.equals("rotation")) {
                                c = '\n';
                                break;
                            }
                            c = 65535;
                            break;
                        case -4379043:
                            if (str.equals("elevation")) {
                                c = 11;
                                break;
                            }
                            c = 65535;
                            break;
                        case 37232917:
                            if (str.equals("transitionPathRotate")) {
                                c = '\f';
                                break;
                            }
                            c = 65535;
                            break;
                        case 92909918:
                            if (str.equals("alpha")) {
                                c = '\r';
                                break;
                            }
                            c = 65535;
                            break;
                        default:
                            c = 65535;
                            break;
                    }
                    switch (c) {
                        case 0:
                            if (!Float.isNaN(this.i)) {
                                qp7Var.b(this.a, this.i);
                                break;
                            } else {
                                continue;
                            }
                        case 1:
                            if (!Float.isNaN(this.j)) {
                                qp7Var.b(this.a, this.j);
                                break;
                            } else {
                                continue;
                            }
                        case 2:
                            if (!Float.isNaN(this.p)) {
                                qp7Var.b(this.a, this.p);
                                break;
                            } else {
                                continue;
                            }
                        case 3:
                            if (!Float.isNaN(this.q)) {
                                qp7Var.b(this.a, this.q);
                                break;
                            } else {
                                continue;
                            }
                        case 4:
                            if (!Float.isNaN(this.r)) {
                                qp7Var.b(this.a, this.r);
                                break;
                            } else {
                                continue;
                            }
                        case 5:
                            if (!Float.isNaN(this.s)) {
                                qp7Var.b(this.a, this.s);
                                break;
                            } else {
                                continue;
                            }
                        case 6:
                            if (!Float.isNaN(this.n)) {
                                qp7Var.b(this.a, this.n);
                                break;
                            } else {
                                continue;
                            }
                        case 7:
                            if (!Float.isNaN(this.o)) {
                                qp7Var.b(this.a, this.o);
                                break;
                            } else {
                                continue;
                            }
                        case '\b':
                            if (!Float.isNaN(this.i)) {
                                qp7Var.b(this.a, this.k);
                                break;
                            } else {
                                continue;
                            }
                        case '\t':
                            if (!Float.isNaN(this.j)) {
                                qp7Var.b(this.a, this.l);
                                break;
                            } else {
                                continue;
                            }
                        case '\n':
                            if (!Float.isNaN(this.h)) {
                                qp7Var.b(this.a, this.h);
                                break;
                            } else {
                                continue;
                            }
                        case 11:
                            if (!Float.isNaN(this.g)) {
                                qp7Var.b(this.a, this.g);
                                break;
                            } else {
                                continue;
                            }
                        case '\f':
                            if (!Float.isNaN(this.m)) {
                                qp7Var.b(this.a, this.m);
                                break;
                            } else {
                                continue;
                            }
                        case '\r':
                            if (!Float.isNaN(this.f)) {
                                qp7Var.b(this.a, this.f);
                                break;
                            } else {
                                continue;
                            }
                    }
                }
            }
        }
    }

    @Override // defpackage.jg3
    /* renamed from: b */
    public final jg3 clone() {
        mg3 mg3Var = new mg3();
        super.c(this);
        mg3Var.e = this.e;
        mg3Var.f = this.f;
        mg3Var.g = this.g;
        mg3Var.h = this.h;
        mg3Var.i = this.i;
        mg3Var.j = this.j;
        mg3Var.k = this.k;
        mg3Var.l = this.l;
        mg3Var.m = this.m;
        mg3Var.n = this.n;
        mg3Var.o = this.o;
        mg3Var.p = this.p;
        mg3Var.q = this.q;
        mg3Var.r = this.r;
        mg3Var.s = this.s;
        return mg3Var;
    }

    @Override // defpackage.jg3
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

    @Override // defpackage.jg3
    public final void e(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e75.e);
        SparseIntArray sparseIntArray = lg3.a;
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            SparseIntArray sparseIntArray2 = lg3.a;
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
                case 6:
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
                    if (MotionLayout.t1) {
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
                case 12:
                    this.a = obtainStyledAttributes.getInt(index, this.a);
                    break;
                case 13:
                    this.e = obtainStyledAttributes.getInteger(index, this.e);
                    break;
                case 14:
                    this.o = obtainStyledAttributes.getFloat(index, this.o);
                    break;
                case 15:
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

    @Override // defpackage.jg3
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
                    hashMap.put(i61.m("CUSTOM,", str), Integer.valueOf(this.e));
                }
            }
        }
    }
}
