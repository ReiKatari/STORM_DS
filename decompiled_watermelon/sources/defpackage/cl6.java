package defpackage;

import androidx.appcompat.widget.SwitchCompat;
import java.lang.ref.WeakReference;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: cl6  reason: default package */
/* loaded from: classes.dex */
public final class cl6 extends ko1 {
    public final WeakReference A;

    public cl6(SwitchCompat switchCompat) {
        this.A = new WeakReference(switchCompat);
    }

    @Override // defpackage.ko1
    public final void a() {
        SwitchCompat switchCompat = (SwitchCompat) this.A.get();
        if (switchCompat != null) {
            switchCompat.c();
        }
    }

    @Override // defpackage.ko1
    public final void b() {
        SwitchCompat switchCompat = (SwitchCompat) this.A.get();
        if (switchCompat != null) {
            switchCompat.c();
        }
    }
}
