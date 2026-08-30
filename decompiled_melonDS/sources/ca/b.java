package ca;

import android.graphics.Typeface;
import com.google.android.material.chip.Chip;
import ha.g;
import l0.f;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class b extends f {

    /* renamed from: c0  reason: collision with root package name */
    public final /* synthetic */ int f2770c0;

    /* renamed from: d0  reason: collision with root package name */
    public final /* synthetic */ Object f2771d0;

    public /* synthetic */ b(int i2, Object obj) {
        this.f2770c0 = i2;
        this.f2771d0 = obj;
    }

    @Override // l0.f
    public final void x(int i2) {
        switch (this.f2770c0) {
            case 0:
                return;
            default:
                g gVar = (g) this.f2771d0;
                gVar.f6434d = true;
                e eVar = (e) gVar.f6435e.get();
                if (eVar != null) {
                    eVar.A();
                    eVar.invalidateSelf();
                    return;
                }
                return;
        }
    }

    @Override // l0.f
    public final void y(Typeface typeface, boolean z10) {
        CharSequence text;
        switch (this.f2770c0) {
            case 0:
                Chip chip = (Chip) this.f2771d0;
                e eVar = chip.f3013b0;
                if (eVar.F1) {
                    text = eVar.H0;
                } else {
                    text = chip.getText();
                }
                chip.setText(text);
                chip.requestLayout();
                chip.invalidate();
                return;
            default:
                if (!z10) {
                    g gVar = (g) this.f2771d0;
                    gVar.f6434d = true;
                    e eVar2 = (e) gVar.f6435e.get();
                    if (eVar2 != null) {
                        eVar2.A();
                        eVar2.invalidateSelf();
                        return;
                    }
                    return;
                }
                return;
        }
    }

    private final void L(int i2) {
    }
}
