package defpackage;

import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ar5  reason: default package */
/* loaded from: classes.dex */
public final class ar5 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;

    static {
        sn2.e(RecyclerView.A1, RecyclerView.A1, RecyclerView.A1, RecyclerView.A1, 0L);
    }

    public ar5(float f, float f2, float f3, float f4, long j, long j2, long j3, long j4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = j;
        this.f = j2;
        this.g = j3;
        this.h = j4;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ar5) {
                ar5 ar5Var = (ar5) obj;
                if (Float.compare(this.a, ar5Var.a) != 0 || Float.compare(this.b, ar5Var.b) != 0 || Float.compare(this.c, ar5Var.c) != 0 || Float.compare(this.d, ar5Var.d) != 0 || !mh7.J(this.e, ar5Var.e) || !mh7.J(this.f, ar5Var.f) || !mh7.J(this.g, ar5Var.g) || !mh7.J(this.h, ar5Var.h)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Long.hashCode(this.h) + b31.c(this.g, b31.c(this.f, b31.c(this.e, ej6.a(this.d, ej6.a(this.c, ej6.a(this.b, Float.hashCode(this.a) * 31, 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        String str = nl2.b0(this.a) + ", " + nl2.b0(this.b) + ", " + nl2.b0(this.c) + ", " + nl2.b0(this.d);
        long j = this.e;
        long j2 = this.f;
        boolean J = mh7.J(j, j2);
        long j3 = this.g;
        long j4 = this.h;
        if (J && mh7.J(j2, j3) && mh7.J(j3, j4)) {
            int i = (int) (j >> 32);
            int i2 = (int) (j & 4294967295L);
            if (Float.intBitsToFloat(i) == Float.intBitsToFloat(i2)) {
                StringBuilder u = b31.u("RoundRect(rect=", str, ", radius=");
                u.append(nl2.b0(Float.intBitsToFloat(i)));
                u.append(')');
                return u.toString();
            }
            StringBuilder u2 = b31.u("RoundRect(rect=", str, ", x=");
            u2.append(nl2.b0(Float.intBitsToFloat(i)));
            u2.append(", y=");
            u2.append(nl2.b0(Float.intBitsToFloat(i2)));
            u2.append(')');
            return u2.toString();
        }
        StringBuilder u3 = b31.u("RoundRect(rect=", str, ", topLeft=");
        u3.append((Object) mh7.j0(j));
        u3.append(", topRight=");
        u3.append((Object) mh7.j0(j2));
        u3.append(", bottomRight=");
        u3.append((Object) mh7.j0(j3));
        u3.append(", bottomLeft=");
        u3.append((Object) mh7.j0(j4));
        u3.append(')');
        return u3.toString();
    }
}
