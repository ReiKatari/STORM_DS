package defpackage;

import android.graphics.Matrix;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ly  reason: default package */
/* loaded from: classes.dex */
public final class ly implements i23 {
    public final sy6 a;
    public final long b;
    public final int c;
    public final Matrix d;
    public final int e;

    public ly(sy6 sy6Var, long j, int i, Matrix matrix, int i2) {
        if (sy6Var != null) {
            this.a = sy6Var;
            this.b = j;
            this.c = i;
            this.d = matrix;
            this.e = i2;
            return;
        }
        u34.x("Null tagBundle");
        throw null;
    }

    @Override // defpackage.i23
    public final sy6 a() {
        return this.a;
    }

    @Override // defpackage.i23
    public final int b() {
        return this.e;
    }

    @Override // defpackage.i23
    public final long c() {
        return this.b;
    }

    @Override // defpackage.i23
    public final int d() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof ly) {
                ly lyVar = (ly) obj;
                if (this.a.equals(lyVar.a) && this.b == lyVar.b && this.c == lyVar.c && this.d.equals(lyVar.d) && this.e == lyVar.e) {
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
        return lb1.o(sb, this.e, "}");
    }
}
