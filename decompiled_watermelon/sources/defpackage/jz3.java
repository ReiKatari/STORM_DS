package defpackage;

import android.graphics.Rect;
import android.util.Log;
import androidx.recyclerview.widget.RecyclerView;
import java.util.HashMap;
import java.util.LinkedHashMap;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: jz3  reason: default package */
/* loaded from: classes.dex */
public final class jz3 implements Comparable {
    public int L;
    public float A = RecyclerView.A1;
    public int B = 0;
    public final LinkedHashMap R = new LinkedHashMap();
    public float X = 1.0f;
    public float Y = RecyclerView.A1;
    public float Z = RecyclerView.A1;
    public float c0 = RecyclerView.A1;
    public float d0 = 1.0f;
    public float e0 = 1.0f;
    public float f0 = Float.NaN;
    public float g0 = Float.NaN;
    public float h0 = RecyclerView.A1;
    public float i0 = RecyclerView.A1;
    public float j0 = RecyclerView.A1;
    public float k0 = Float.NaN;
    public float l0 = Float.NaN;

    public static boolean b(float f, float f2) {
        if (!Float.isNaN(f) && !Float.isNaN(f2)) {
            if (Math.abs(f - f2) > 1.0E-6f) {
                return true;
            }
            return false;
        } else if (Float.isNaN(f) != Float.isNaN(f2)) {
            return true;
        } else {
            return false;
        }
    }

    public final void a(HashMap hashMap, int i) {
        for (String str : hashMap.keySet()) {
            pb7 pb7Var = (pb7) hashMap.get(str);
            if (pb7Var != null) {
                str.getClass();
                char c = 65535;
                switch (str.hashCode()) {
                    case -1249320806:
                        if (str.equals("rotationX")) {
                            c = 0;
                            break;
                        }
                        break;
                    case -1249320805:
                        if (str.equals("rotationY")) {
                            c = 1;
                            break;
                        }
                        break;
                    case -1225497657:
                        if (str.equals("translationX")) {
                            c = 2;
                            break;
                        }
                        break;
                    case -1225497656:
                        if (str.equals("translationY")) {
                            c = 3;
                            break;
                        }
                        break;
                    case -1225497655:
                        if (str.equals("translationZ")) {
                            c = 4;
                            break;
                        }
                        break;
                    case -1001078227:
                        if (str.equals("progress")) {
                            c = 5;
                            break;
                        }
                        break;
                    case -908189618:
                        if (str.equals("scaleX")) {
                            c = 6;
                            break;
                        }
                        break;
                    case -908189617:
                        if (str.equals("scaleY")) {
                            c = 7;
                            break;
                        }
                        break;
                    case -760884510:
                        if (str.equals("transformPivotX")) {
                            c = '\b';
                            break;
                        }
                        break;
                    case -760884509:
                        if (str.equals("transformPivotY")) {
                            c = '\t';
                            break;
                        }
                        break;
                    case -40300674:
                        if (str.equals("rotation")) {
                            c = '\n';
                            break;
                        }
                        break;
                    case -4379043:
                        if (str.equals("elevation")) {
                            c = 11;
                            break;
                        }
                        break;
                    case 37232917:
                        if (str.equals("transitionPathRotate")) {
                            c = '\f';
                            break;
                        }
                        break;
                    case 92909918:
                        if (str.equals("alpha")) {
                            c = '\r';
                            break;
                        }
                        break;
                }
                float f = 1.0f;
                float f2 = RecyclerView.A1;
                switch (c) {
                    case 0:
                        if (!Float.isNaN(this.c0)) {
                            f2 = this.c0;
                        }
                        pb7Var.b(i, f2);
                        continue;
                    case 1:
                        if (!Float.isNaN(this.A)) {
                            f2 = this.A;
                        }
                        pb7Var.b(i, f2);
                        continue;
                    case 2:
                        if (!Float.isNaN(this.h0)) {
                            f2 = this.h0;
                        }
                        pb7Var.b(i, f2);
                        continue;
                    case 3:
                        if (!Float.isNaN(this.i0)) {
                            f2 = this.i0;
                        }
                        pb7Var.b(i, f2);
                        continue;
                    case 4:
                        if (!Float.isNaN(this.j0)) {
                            f2 = this.j0;
                        }
                        pb7Var.b(i, f2);
                        continue;
                    case 5:
                        if (!Float.isNaN(this.l0)) {
                            f2 = this.l0;
                        }
                        pb7Var.b(i, f2);
                        continue;
                    case ig7.b /* 6 */:
                        if (!Float.isNaN(this.d0)) {
                            f = this.d0;
                        }
                        pb7Var.b(i, f);
                        continue;
                    case 7:
                        if (!Float.isNaN(this.e0)) {
                            f = this.e0;
                        }
                        pb7Var.b(i, f);
                        continue;
                    case '\b':
                        if (!Float.isNaN(this.f0)) {
                            f2 = this.f0;
                        }
                        pb7Var.b(i, f2);
                        continue;
                    case '\t':
                        if (!Float.isNaN(this.g0)) {
                            f2 = this.g0;
                        }
                        pb7Var.b(i, f2);
                        continue;
                    case '\n':
                        if (!Float.isNaN(this.Z)) {
                            f2 = this.Z;
                        }
                        pb7Var.b(i, f2);
                        continue;
                    case 11:
                        if (!Float.isNaN(this.Y)) {
                            f2 = this.Y;
                        }
                        pb7Var.b(i, f2);
                        continue;
                    case mj2.L /* 12 */:
                        if (!Float.isNaN(this.k0)) {
                            f2 = this.k0;
                        }
                        pb7Var.b(i, f2);
                        continue;
                    case '\r':
                        if (!Float.isNaN(this.X)) {
                            f = this.X;
                        }
                        pb7Var.b(i, f);
                        continue;
                    default:
                        if (str.startsWith("CUSTOM")) {
                            String str2 = str.split(",")[1];
                            LinkedHashMap linkedHashMap = this.R;
                            if (linkedHashMap.containsKey(str2)) {
                                ey0 ey0Var = (ey0) linkedHashMap.get(str2);
                                if (pb7Var instanceof mb7) {
                                    ((mb7) pb7Var).f.append(i, ey0Var);
                                    break;
                                } else {
                                    Log.e("MotionPaths", str + " ViewSpline not a CustomSet frame = " + i + ", value" + ey0Var.a() + pb7Var);
                                    break;
                                }
                            } else {
                                break;
                            }
                        } else {
                            Log.e("MotionPaths", "UNKNOWN spline ".concat(str));
                            continue;
                        }
                }
            }
        }
    }

    public final void c(Rect rect, uy0 uy0Var, int i, int i2) {
        float f;
        rect.width();
        rect.height();
        py0 h = uy0Var.h(i2);
        sy0 sy0Var = h.c;
        ry0 ry0Var = h.d;
        int i3 = sy0Var.c;
        this.B = i3;
        int i4 = sy0Var.b;
        this.L = i4;
        if (i4 != 0 && i3 == 0) {
            f = RecyclerView.A1;
        } else {
            f = sy0Var.d;
        }
        this.X = f;
        ty0 ty0Var = h.f;
        boolean z = ty0Var.m;
        this.Y = ty0Var.n;
        this.Z = ty0Var.b;
        this.c0 = ty0Var.c;
        this.A = ty0Var.d;
        this.d0 = ty0Var.e;
        this.e0 = ty0Var.f;
        this.f0 = ty0Var.g;
        this.g0 = ty0Var.h;
        this.h0 = ty0Var.j;
        this.i0 = ty0Var.k;
        this.j0 = ty0Var.l;
        an1.e(ry0Var.d);
        this.k0 = ry0Var.h;
        this.l0 = h.c.e;
        for (String str : h.g.keySet()) {
            ey0 ey0Var = (ey0) h.g.get(str);
            int ordinal = ey0Var.c.ordinal();
            if (ordinal != 4 && ordinal != 5 && ordinal != 7) {
                this.R.put(str, ey0Var);
            }
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return;
                    }
                }
            }
            float f2 = this.Z + 90.0f;
            this.Z = f2;
            if (f2 > 180.0f) {
                this.Z = f2 - 360.0f;
                return;
            }
            return;
        }
        this.Z -= 90.0f;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        ((jz3) obj).getClass();
        return Float.compare(RecyclerView.A1, RecyclerView.A1);
    }
}
