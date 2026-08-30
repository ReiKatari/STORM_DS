package na;

import com.google.android.material.button.MaterialButton;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class i extends k7.w {

    /* renamed from: j  reason: collision with root package name */
    public final int f10160j;

    public i(int i2) {
        this.f10160j = i2;
    }

    @Override // k7.w
    public final void G(y yVar, float f8) {
        j jVar = (j) yVar;
        float[] fArr = jVar.f10182v0;
        if (fArr != null) {
            int i2 = this.f10160j;
            if (fArr[i2] != f8) {
                fArr[i2] = f8;
                ah.e eVar = jVar.f10184x0;
                if (eVar != null) {
                    float h2 = jVar.h();
                    MaterialButton materialButton = (MaterialButton) eVar.B;
                    int i10 = (int) (h2 * 0.11f);
                    if (materialButton.f2994u0 != i10) {
                        materialButton.f2994u0 = i10;
                        materialButton.j();
                        materialButton.invalidate();
                    }
                }
                jVar.invalidateSelf();
            }
        }
    }

    @Override // k7.w
    public final float u(y yVar) {
        float[] fArr = ((j) yVar).f10182v0;
        if (fArr != null) {
            return fArr[this.f10160j];
        }
        return 0.0f;
    }
}
