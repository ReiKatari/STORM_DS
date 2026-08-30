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
/* renamed from: x93  reason: default package */
/* loaded from: classes.dex */
public final class x93 extends q93 {
    public int e = 0;
    public int f = -1;
    public String g = null;
    public float h = Float.NaN;
    public float i = RecyclerView.A1;
    public float j = RecyclerView.A1;
    public float k = Float.NaN;
    public int l = -1;
    public float m = Float.NaN;
    public float n = Float.NaN;
    public float o = Float.NaN;
    public float p = Float.NaN;
    public float q = Float.NaN;
    public float r = Float.NaN;
    public float s = Float.NaN;
    public float t = Float.NaN;
    public float u = Float.NaN;
    public float v = Float.NaN;
    public float w = Float.NaN;

    public x93() {
        this.d = new HashMap();
    }

    @Override // defpackage.q93
    public final void a(HashMap hashMap) {
        throw null;
    }

    @Override // defpackage.q93
    /* renamed from: b */
    public final q93 clone() {
        x93 x93Var = new x93();
        super.c(this);
        x93Var.e = this.e;
        x93Var.f = this.f;
        x93Var.g = this.g;
        x93Var.h = this.h;
        x93Var.i = this.i;
        x93Var.j = this.j;
        x93Var.k = this.k;
        x93Var.l = this.l;
        x93Var.m = this.m;
        x93Var.n = this.n;
        x93Var.o = this.o;
        x93Var.p = this.p;
        x93Var.q = this.q;
        x93Var.r = this.r;
        x93Var.s = this.s;
        x93Var.t = this.t;
        x93Var.u = this.u;
        x93Var.v = this.v;
        x93Var.w = this.w;
        return x93Var;
    }

    @Override // defpackage.q93
    public final void d(HashSet hashSet) {
        if (!Float.isNaN(this.m)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.n)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.o)) {
            hashSet.add("rotation");
        }
        if (!Float.isNaN(this.q)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.r)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.s)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.t)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.p)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.u)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.v)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.w)) {
            hashSet.add("translationZ");
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
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, tx4.f);
        SparseIntArray sparseIntArray = w93.a;
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            SparseIntArray sparseIntArray2 = w93.a;
            switch (sparseIntArray2.get(index)) {
                case 1:
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
                case 2:
                    this.a = obtainStyledAttributes.getInt(index, this.a);
                    break;
                case 3:
                    obtainStyledAttributes.getString(index);
                    break;
                case 4:
                    this.e = obtainStyledAttributes.getInteger(index, this.e);
                    break;
                case 5:
                    if (obtainStyledAttributes.peekValue(index).type == 3) {
                        this.g = obtainStyledAttributes.getString(index);
                        this.f = 7;
                        break;
                    } else {
                        this.f = obtainStyledAttributes.getInt(index, this.f);
                        break;
                    }
                case ig7.b /* 6 */:
                    this.h = obtainStyledAttributes.getFloat(index, this.h);
                    break;
                case 7:
                    int i2 = obtainStyledAttributes.peekValue(index).type;
                    float f = this.i;
                    if (i2 == 5) {
                        this.i = obtainStyledAttributes.getDimension(index, f);
                        break;
                    } else {
                        this.i = obtainStyledAttributes.getFloat(index, f);
                        break;
                    }
                case 8:
                    this.l = obtainStyledAttributes.getInt(index, this.l);
                    break;
                case 9:
                    this.m = obtainStyledAttributes.getFloat(index, this.m);
                    break;
                case 10:
                    this.n = obtainStyledAttributes.getDimension(index, this.n);
                    break;
                case 11:
                    this.o = obtainStyledAttributes.getFloat(index, this.o);
                    break;
                case mj2.L /* 12 */:
                    this.q = obtainStyledAttributes.getFloat(index, this.q);
                    break;
                case 13:
                    this.r = obtainStyledAttributes.getFloat(index, this.r);
                    break;
                case 14:
                    this.p = obtainStyledAttributes.getFloat(index, this.p);
                    break;
                case ig7.e /* 15 */:
                    this.s = obtainStyledAttributes.getFloat(index, this.s);
                    break;
                case 16:
                    this.t = obtainStyledAttributes.getFloat(index, this.t);
                    break;
                case 17:
                    this.u = obtainStyledAttributes.getDimension(index, this.u);
                    break;
                case 18:
                    this.v = obtainStyledAttributes.getDimension(index, this.v);
                    break;
                case 19:
                    this.w = obtainStyledAttributes.getDimension(index, this.w);
                    break;
                case 20:
                    this.k = obtainStyledAttributes.getFloat(index, this.k);
                    break;
                case 21:
                    this.j = obtainStyledAttributes.getFloat(index, this.j) / 360.0f;
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x93.g(java.util.HashMap):void");
    }
}
