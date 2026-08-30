package y4;

import a0.j;
import java.util.Arrays;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class c implements a {

    /* renamed from: a  reason: collision with root package name */
    public final float[] f14774a;

    /* renamed from: b  reason: collision with root package name */
    public final float[] f14775b;

    public c(float[] fArr, float[] fArr2) {
        if (fArr.length == fArr2.length && fArr.length != 0) {
            this.f14774a = fArr;
            this.f14775b = fArr2;
            return;
        }
        j.h("Array lengths must match and be nonzero");
        throw null;
    }

    @Override // y4.a
    public final float a(float f8) {
        return l7.a.c(f8, this.f14775b, this.f14774a);
    }

    @Override // y4.a
    public final float b(float f8) {
        return l7.a.c(f8, this.f14774a, this.f14775b);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && (obj instanceof c)) {
                c cVar = (c) obj;
                if (Arrays.equals(this.f14774a, cVar.f14774a) && Arrays.equals(this.f14775b, cVar.f14775b)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f14775b) + (Arrays.hashCode(this.f14774a) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FontScaleConverter{fromSpValues=");
        String arrays = Arrays.toString(this.f14774a);
        arrays.getClass();
        sb2.append(arrays);
        sb2.append(", toDpValues=");
        String arrays2 = Arrays.toString(this.f14775b);
        arrays2.getClass();
        sb2.append(arrays2);
        sb2.append('}');
        return sb2.toString();
    }
}
