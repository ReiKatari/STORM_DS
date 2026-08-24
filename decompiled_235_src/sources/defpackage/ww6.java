package defpackage;

import androidx.appcompat.widget.SwitchCompat;
import java.lang.ref.WeakReference;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ww6  reason: default package */
/* loaded from: classes.dex */
public final class ww6 extends us1 {
    public final WeakReference A;

    public ww6(SwitchCompat switchCompat) {
        this.A = new WeakReference(switchCompat);
    }

    @Override // defpackage.us1
    public final void a() {
        SwitchCompat switchCompat = (SwitchCompat) this.A.get();
        if (switchCompat != null) {
            switchCompat.c();
        }
    }

    @Override // defpackage.us1
    public final void b() {
        SwitchCompat switchCompat = (SwitchCompat) this.A.get();
        if (switchCompat != null) {
            switchCompat.c();
        }
    }
}
