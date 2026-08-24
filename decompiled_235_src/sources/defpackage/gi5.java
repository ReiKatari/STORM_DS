package defpackage;

import java.util.Arrays;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: gi5  reason: default package */
/* loaded from: classes.dex */
public final class gi5 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final float[] f;
    public final rz g;

    public gi5(long j, long j2, long j3, long j4, long j5, float[] fArr, rz rzVar) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
        this.f = fArr;
        this.g = rzVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        boolean equals;
        if (this == obj) {
            return true;
        }
        if (obj != null && gi5.class == obj.getClass()) {
            gi5 gi5Var = (gi5) obj;
            if (this.a == gi5Var.a && this.b == gi5Var.b && this.e == gi5Var.e && i93.a(this.c, gi5Var.c) && i93.a(this.d, gi5Var.d)) {
                float[] fArr = gi5Var.f;
                float[] fArr2 = this.f;
                if (fArr2 == null) {
                    if (fArr == null) {
                        equals = true;
                        if (equals && this.g == gi5Var.g) {
                            return true;
                        }
                        return false;
                    }
                    equals = false;
                    if (equals) {
                        return true;
                    }
                } else {
                    if (fArr != null) {
                        equals = fArr2.equals(fArr);
                        if (equals) {
                        }
                    }
                    equals = false;
                    if (equals) {
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int c = i61.c(this.d, i61.c(this.c, i61.c(this.e, i61.c(this.b, Long.hashCode(this.a) * 31, 31), 31), 31), 31);
        float[] fArr = this.f;
        if (fArr != null) {
            i = Arrays.hashCode(fArr);
        } else {
            i = 0;
        }
        return this.g.hashCode() + ((c + i) * 31);
    }
}
