package defpackage;

import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: g20  reason: default package */
/* loaded from: classes.dex */
public final class g20 implements ub {
    public final float a;

    public g20(float f) {
        this.a = f;
    }

    @Override // defpackage.ub
    public final long a(long j, long j2, sd3 sd3Var) {
        long j3 = ((((int) (j2 >> 32)) - ((int) (j >> 32))) << 32) | ((((int) (j2 & 4294967295L)) - ((int) (j & 4294967295L))) & 4294967295L);
        float f = 1.0f + this.a;
        float f2 = (((int) (j3 & 4294967295L)) / 2.0f) * RecyclerView.A1;
        int round = Math.round(f * (((int) (j3 >> 32)) / 2.0f));
        return (Math.round(f2) & 4294967295L) | (round << 32);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof g20) || Float.compare(this.a, ((g20) obj).a) != 0 || Float.compare(-1.0f, -1.0f) != 0) {
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
