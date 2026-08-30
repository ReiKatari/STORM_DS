package na;

import android.graphics.Matrix;
import android.graphics.Path;
import java.util.ArrayList;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class x {

    /* renamed from: a  reason: collision with root package name */
    public float f10241a;

    /* renamed from: b  reason: collision with root package name */
    public float f10242b;

    /* renamed from: c  reason: collision with root package name */
    public float f10243c;

    /* renamed from: d  reason: collision with root package name */
    public float f10244d;

    /* renamed from: e  reason: collision with root package name */
    public float f10245e;

    /* renamed from: f  reason: collision with root package name */
    public final ArrayList f10246f = new ArrayList();

    /* renamed from: g  reason: collision with root package name */
    public final ArrayList f10247g = new ArrayList();

    public x() {
        d(0.0f, 270.0f, 0.0f);
    }

    public final void a(float f8) {
        float f10 = this.f10244d;
        if (f10 != f8) {
            float f11 = ((f8 - f10) + 360.0f) % 360.0f;
            if (f11 > 180.0f) {
                return;
            }
            float f12 = this.f10242b;
            float f13 = this.f10243c;
            t tVar = new t(f12, f13, f12, f13);
            tVar.f10234f = this.f10244d;
            tVar.f10235g = f11;
            this.f10247g.add(new r(tVar));
            this.f10244d = f8;
        }
    }

    public final void b(Matrix matrix, Path path) {
        ArrayList arrayList = this.f10246f;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((v) arrayList.get(i2)).a(matrix, path);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [na.v, na.u, java.lang.Object] */
    public final void c(float f8, float f10) {
        ?? vVar = new v();
        vVar.f10236b = f8;
        vVar.f10237c = f10;
        this.f10246f.add(vVar);
        s sVar = new s(vVar, this.f10242b, this.f10243c);
        a(sVar.b() + 270.0f);
        this.f10247g.add(sVar);
        this.f10244d = sVar.b() + 270.0f;
        this.f10242b = f8;
        this.f10243c = f10;
    }

    public final void d(float f8, float f10, float f11) {
        this.f10241a = f8;
        this.f10242b = 0.0f;
        this.f10243c = f8;
        this.f10244d = f10;
        this.f10245e = (f10 + f11) % 360.0f;
        this.f10246f.clear();
        this.f10247g.clear();
    }
}
