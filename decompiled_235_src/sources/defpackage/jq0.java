package defpackage;

import android.widget.CompoundButton;
import com.google.android.material.chip.Chip;
import me.magnum.melonds.ui.emulator.EmulatorActivity;
import me.magnum.melonds.ui.layouteditor.LayoutEditorView;
import me.magnum.melonds.ui.layouteditor.b;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: jq0  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class jq0 implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ jq0(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                CompoundButton.OnCheckedChangeListener onCheckedChangeListener = ((Chip) obj).h0;
                if (onCheckedChangeListener != null) {
                    onCheckedChangeListener.onCheckedChanged(compoundButton, z);
                    return;
                }
                return;
            case 1:
                int i2 = EmulatorActivity.Z1;
                compoundButton.getClass();
                ((qn2) obj).g(Boolean.valueOf(z));
                return;
            default:
                b bVar = (b) obj;
                compoundButton.getClass();
                if (!bVar.q0) {
                    ((LayoutEditorView) bVar.L.A).setSelectedScreenOnTop(z);
                    return;
                }
                return;
        }
    }
}
