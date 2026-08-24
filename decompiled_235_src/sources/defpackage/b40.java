package defpackage;

import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: b40  reason: default package */
/* loaded from: classes.dex */
public final class b40 implements ic {
    public final float a;

    public b40(float f) {
        this.a = f;
    }

    @Override // defpackage.ic
    public final long a(long j, long j2, kk3 kk3Var) {
        long j3 = ((((int) (j2 >> 32)) - ((int) (j >> 32))) << 32) | ((((int) (j2 & 4294967295L)) - ((int) (j & 4294967295L))) & 4294967295L);
        float f = 1.0f + this.a;
        float f2 = (((int) (j3 & 4294967295L)) / 2.0f) * RecyclerView.B1;
        int round = Math.round(f * (((int) (j3 >> 32)) / 2.0f));
        return (Math.round(f2) & 4294967295L) | (round << 32);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof b40) || Float.compare(this.a, ((b40) obj).a) != 0 || Float.compare(-1.0f, -1.0f) != 0) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        return Float.hashCode(-1.0f) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "BiasAbsoluteAlignment(horizontalBias=" + this.a + ", verticalBias=-1.0)";
    }
}
