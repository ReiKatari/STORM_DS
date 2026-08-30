package q;

import androidx.appcompat.widget.SwitchCompat;
import java.lang.ref.WeakReference;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class a3 extends m6.g {
    public final WeakReference A;

    public a3(SwitchCompat switchCompat) {
        this.A = new WeakReference(switchCompat);
    }

    @Override // m6.g
    public final void a() {
        SwitchCompat switchCompat = (SwitchCompat) this.A.get();
        if (switchCompat != null) {
            switchCompat.c();
        }
    }

    @Override // m6.g
    public final void b() {
        SwitchCompat switchCompat = (SwitchCompat) this.A.get();
        if (switchCompat != null) {
            switchCompat.c();
        }
    }
}
