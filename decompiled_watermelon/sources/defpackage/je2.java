package defpackage;

import java.util.Arrays;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: je2  reason: default package */
/* loaded from: classes.dex */
public final class je2 implements he2 {
    public final float[] a;
    public final float[] b;

    public je2(float[] fArr, float[] fArr2) {
        if (fArr.length == fArr2.length && fArr.length != 0) {
            this.a = fArr;
            this.b = fArr2;
            return;
        }
        i.i("Array lengths must match and be nonzero");
        throw null;
    }

    @Override // defpackage.he2
    public final float a(float f) {
        return jo1.n(f, this.b, this.a);
    }

    @Override // defpackage.he2
    public final float b(float f) {
        return jo1.n(f, this.a, this.b);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && (obj instanceof je2)) {
                je2 je2Var = (je2) obj;
                if (Arrays.equals(this.a, je2Var.a) && Arrays.equals(this.b, je2Var.b)) {
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
