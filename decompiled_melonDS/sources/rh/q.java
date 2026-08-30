package rh;

import android.widget.SeekBar;
import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class q implements SeekBar.OnSeekBarChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f12743a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ me.magnum.melonds.ui.layouteditor.b f12744b;

    public /* synthetic */ q(me.magnum.melonds.ui.layouteditor.b bVar, int i2) {
        this.f12743a = i2;
        this.f12744b = bVar;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i2, boolean z10) {
        int i10 = this.f12743a;
        seekBar.getClass();
        switch (i10) {
            case 0:
                float max = i2 / seekBar.getMax();
                me.magnum.melonds.ui.layouteditor.b bVar = this.f12744b;
                le.a aVar = bVar.L;
                aVar.f9065s.setText(String.valueOf((int) ((aVar.f9061o.getMax() * max) + bVar.f9544e0)));
                aVar.f9067u.l(max);
                return;
            case DSiCameraSource.FrontCamera /* 1 */:
                me.magnum.melonds.ui.layouteditor.b bVar2 = this.f12744b;
                le.a aVar2 = bVar2.L;
                if (bVar2.f9547h0 && z10 && bVar2.f9549j0.getRatio() != null) {
                    bVar2.o(bVar2.f9549j0, s.WIDTH);
                } else {
                    bVar2.f9545f0 = i2 / aVar2.f9062p.getMax();
                    aVar2.f9066t.setText(String.valueOf((int) ((aVar2.f9062p.getMax() * bVar2.f9545f0) + bVar2.f9544e0)));
                }
                aVar2.f9067u.m(bVar2.f9545f0, bVar2.f9546g0);
                return;
            case 2:
                me.magnum.melonds.ui.layouteditor.b bVar3 = this.f12744b;
                le.a aVar3 = bVar3.L;
                if (bVar3.f9547h0 && z10 && bVar3.f9549j0.getRatio() != null) {
                    bVar3.o(bVar3.f9549j0, s.HEIGHT);
                } else {
                    bVar3.f9546g0 = i2 / aVar3.f9060n.getMax();
                    aVar3.f9064r.setText(String.valueOf((int) ((aVar3.f9060n.getMax() * bVar3.f9546g0) + bVar3.f9544e0)));
                }
                aVar3.f9067u.m(bVar3.f9545f0, bVar3.f9546g0);
                return;
            default:
                this.f12744b.L.f9067u.setSelectedViewAlpha(i2 / 100.0f);
                return;
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
        int i2 = this.f12743a;
        seekBar.getClass();
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        int i2 = this.f12743a;
        seekBar.getClass();
    }
}
