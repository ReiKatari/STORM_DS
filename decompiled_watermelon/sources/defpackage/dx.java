package defpackage;

import android.graphics.Matrix;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: dx  reason: default package */
/* loaded from: classes.dex */
public final class dx implements ew2 {
    public final im6 a;
    public final long b;
    public final int c;
    public final Matrix d;
    public final int e;

    public dx(im6 im6Var, long j, int i, Matrix matrix, int i2) {
        if (im6Var != null) {
            this.a = im6Var;
            this.b = j;
            this.c = i;
            this.d = matrix;
            this.e = i2;
            return;
        }
        c44.i("Null tagBundle");
        throw null;
    }

    @Override // defpackage.ew2
    public final im6 a() {
        return this.a;
    }

    @Override // defpackage.ew2
    public final int b() {
        return this.e;
    }

    @Override // defpackage.ew2
    public final long c() {
        return this.b;
    }

    @Override // defpackage.ew2
    public final int d() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof dx) {
                dx dxVar = (dx) obj;
                if (this.a.equals(dxVar.a) && this.b == dxVar.b && this.c == dxVar.c && this.d.equals(dxVar.d) && this.e == dxVar.e) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j = this.b;
        return this.e ^ ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ ((int) ((j >>> 32) ^ j))) * 1000003) ^ this.c) * 1000003) ^ this.d.hashCode()) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ImmutableImageInfo{tagBundle=");
        sb.append(this.a);
        sb.append(", timestamp=");
        sb.append(this.b);
        sb.append(", rotationDegrees=");
        sb.append(this.c);
        sb.append(", sensorToBufferTransformMatrix=");
        sb.append(this.d);
        sb.append(", flashState=");
        return wh1.m(sb, this.e, "}");
    }
}
