package na;

import android.graphics.RectF;
import java.util.Arrays;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class b implements d {

    /* renamed from: a  reason: collision with root package name */
    public final d f10126a;

    /* renamed from: b  reason: collision with root package name */
    public final float f10127b;

    public b(float f8, d dVar) {
        while (dVar instanceof b) {
            dVar = ((b) dVar).f10126a;
            f8 += ((b) dVar).f10127b;
        }
        this.f10126a = dVar;
        this.f10127b = f8;
    }

    @Override // na.d
    public final float a(RectF rectF) {
        return Math.max(0.0f, this.f10126a.a(rectF) + this.f10127b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f10126a.equals(bVar.f10126a) && this.f10127b == bVar.f10127b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f10126a, Float.valueOf(this.f10127b)});
    }
}
