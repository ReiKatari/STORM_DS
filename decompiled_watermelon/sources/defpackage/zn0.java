package defpackage;

import android.widget.CompoundButton;
import com.google.android.material.chip.Chip;
import me.magnum.melonds.ui.emulator.EmulatorActivity;
import me.magnum.melonds.ui.layouteditor.b;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: zn0  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class zn0 implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ zn0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                CompoundButton.OnCheckedChangeListener onCheckedChangeListener = ((Chip) obj).g0;
                if (onCheckedChangeListener != null) {
                    onCheckedChangeListener.onCheckedChanged(compoundButton, z);
                    return;
                }
                return;
            case 1:
                int i2 = EmulatorActivity.P1;
                compoundButton.getClass();
                ((mi2) obj).n(Boolean.valueOf(z));
                return;
            default:
                b bVar = (b) obj;
                compoundButton.getClass();
                if (!bVar.p0) {
                    bVar.L.v.setSelectedScreenOnTop(z);
                    return;
                }
                return;
        }
    }
}
