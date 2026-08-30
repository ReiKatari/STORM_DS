package ca;

import android.view.View;
import android.widget.CompoundButton;
import com.google.android.material.chip.Chip;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f2768a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ View f2769b;

    public /* synthetic */ a(View view, int i2) {
        this.f2768a = i2;
        this.f2769b = view;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
        switch (this.f2768a) {
            case 0:
                CompoundButton.OnCheckedChangeListener onCheckedChangeListener = ((Chip) this.f2769b).f3017f0;
                if (onCheckedChangeListener != null) {
                    onCheckedChangeListener.onCheckedChanged(compoundButton, z10);
                    return;
                }
                return;
            default:
                compoundButton.getClass();
                ((me.magnum.melonds.ui.layouteditor.b) this.f2769b).L.f9067u.setSelectedScreenOnTop(z10);
                return;
        }
    }
}
