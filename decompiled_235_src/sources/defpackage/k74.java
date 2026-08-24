package defpackage;

import android.graphics.Rect;
import android.util.Log;
import androidx.recyclerview.widget.RecyclerView;
import java.util.HashMap;
import java.util.LinkedHashMap;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: k74  reason: default package */
/* loaded from: classes.dex */
public final class k74 implements Comparable {
    public int L;
    public float A = RecyclerView.B1;
    public int B = 0;
    public final LinkedHashMap R = new LinkedHashMap();
    public float X = 1.0f;
    public float Y = RecyclerView.B1;
    public float Z = RecyclerView.B1;
    public float d0 = RecyclerView.B1;
    public float e0 = 1.0f;
    public float f0 = 1.0f;
    public float g0 = Float.NaN;
    public float h0 = Float.NaN;
    public float i0 = RecyclerView.B1;
    public float j0 = RecyclerView.B1;
    public float k0 = RecyclerView.B1;
    public float l0 = Float.NaN;
    public float m0 = Float.NaN;

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
            qp7 qp7Var = (qp7) hashMap.get(str);
            if (qp7Var != null) {
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
                float f2 = RecyclerView.B1;
                switch (c) {
                    case 0:
                        if (!Float.isNaN(this.d0)) {
                            f2 = this.d0;
                        }
                        qp7Var.b(i, f2);
                        continue;
                    case 1:
                        if (!Float.isNaN(this.A)) {
                            f2 = this.A;
                        }
                        qp7Var.b(i, f2);
                        continue;
                    case 2:
                        if (!Float.isNaN(this.i0)) {
                            f2 = this.i0;
                        }
                        qp7Var.b(i, f2);
                        continue;
                    case 3:
                        if (!Float.isNaN(this.j0)) {
                            f2 = this.j0;
                        }
                        qp7Var.b(i, f2);
                        continue;
                    case 4:
                        if (!Float.isNaN(this.k0)) {
                            f2 = this.k0;
                        }
                        qp7Var.b(i, f2);
                        continue;
                    case 5:
                        if (!Float.isNaN(this.m0)) {
                            f2 = this.m0;
                        }
                        qp7Var.b(i, f2);
                        continue;
                    case 6:
                        if (!Float.isNaN(this.e0)) {
                            f = this.e0;
                        }
                        qp7Var.b(i, f);
                        continue;
                    case 7:
                        if (!Float.isNaN(this.f0)) {
                            f = this.f0;
                        }
                        qp7Var.b(i, f);
                        continue;
                    case '\b':
                        if (!Float.isNaN(this.g0)) {
                            f2 = this.g0;
                        }
                        qp7Var.b(i, f2);
                        continue;
                    case '\t':
                        if (!Float.isNaN(this.h0)) {
                            f2 = this.h0;
                        }
                        qp7Var.b(i, f2);
                        continue;
                    case '\n':
                        if (!Float.isNaN(this.Z)) {
                            f2 = this.Z;
                        }
                        qp7Var.b(i, f2);
                        continue;
                    case 11:
                        if (!Float.isNaN(this.Y)) {
                            f2 = this.Y;
                        }
                        qp7Var.b(i, f2);
                        continue;
                    case '\f':
                        if (!Float.isNaN(this.l0)) {
                            f2 = this.l0;
                        }
                        qp7Var.b(i, f2);
                        continue;
                    case '\r':
                        if (!Float.isNaN(this.X)) {
                            f = this.X;
                        }
                        qp7Var.b(i, f);
                        continue;
                    default:
                        if (str.startsWith("CUSTOM")) {
                            String str2 = str.split(",")[1];
                            LinkedHashMap linkedHashMap = this.R;
                            if (linkedHashMap.containsKey(str2)) {
                                j11 j11Var = (j11) linkedHashMap.get(str2);
                                if (qp7Var instanceof np7) {
                                    ((np7) qp7Var).f.append(i, j11Var);
                                    break;
                                } else {
                                    Log.e("MotionPaths", str + " ViewSpline not a CustomSet frame = " + i + ", value" + j11Var.a() + qp7Var);
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

    public final void c(Rect rect, z11 z11Var, int i, int i2) {
        float f;
        rect.width();
        rect.height();
        u11 h = z11Var.h(i2);
        x11 x11Var = h.c;
        w11 w11Var = h.d;
        int i3 = x11Var.c;
        this.B = i3;
        int i4 = x11Var.b;
        this.L = i4;
        if (i4 != 0 && i3 == 0) {
            f = RecyclerView.B1;
        } else {
            f = x11Var.d;
        }
        this.X = f;
        y11 y11Var = h.f;
        boolean z = y11Var.m;
        this.Y = y11Var.n;
        this.Z = y11Var.b;
        this.d0 = y11Var.c;
        this.A = y11Var.d;
        this.e0 = y11Var.e;
        this.f0 = y11Var.f;
        this.g0 = y11Var.g;
        this.h0 = y11Var.h;
        this.i0 = y11Var.j;
        this.j0 = y11Var.k;
        this.k0 = y11Var.l;
        gr1.c(w11Var.d);
        this.l0 = w11Var.h;
        this.m0 = h.c.e;
        for (String str : h.g.keySet()) {
            j11 j11Var = (j11) h.g.get(str);
            int ordinal = j11Var.c.ordinal();
            if (ordinal != 4 && ordinal != 5 && ordinal != 7) {
                this.R.put(str, j11Var);
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
        ((k74) obj).getClass();
        return Float.compare(RecyclerView.B1, RecyclerView.B1);
    }
}
