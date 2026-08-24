package defpackage;

import java.util.Arrays;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: hj2  reason: default package */
/* loaded from: classes.dex */
public final class hj2 implements fj2 {
    public final float[] a;
    public final float[] b;

    public hj2(float[] fArr, float[] fArr2) {
        if (fArr.length == fArr2.length && fArr.length != 0) {
            this.a = fArr;
            this.b = fArr2;
            return;
        }
        i.h("Array lengths must match and be nonzero");
        throw null;
    }

    @Override // defpackage.fj2
    public final float a(float f) {
        return x31.m(f, this.b, this.a);
    }

    @Override // defpackage.fj2
    public final float b(float f) {
        return x31.m(f, this.a, this.b);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && (obj instanceof hj2)) {
                hj2 hj2Var = (hj2) obj;
                if (Arrays.equals(this.a, hj2Var.a) && Arrays.equals(this.b, hj2Var.b)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) + (Arrays.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FontScaleConverter{fromSpValues=");
        String arrays = Arrays.toString(this.a);
        arrays.getClass();
        sb.append(arrays);
        sb.append(", toDpValues=");
        String arrays2 = Arrays.toString(this.b);
        arrays2.getClass();
        sb.append(arrays2);
        sb.append('}');
        return sb.toString();
    }
}
