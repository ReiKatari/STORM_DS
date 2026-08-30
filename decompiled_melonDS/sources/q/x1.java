package q;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.SearchView;
import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class x1 implements AdapterView.OnItemSelectedListener {
    public final /* synthetic */ int A;
    public final /* synthetic */ Object B;

    public /* synthetic */ x1(int i2, Object obj) {
        this.A = i2;
        this.B = obj;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i2, long j2) {
        r1 r1Var;
        int i10;
        switch (this.A) {
            case 0:
                if (i2 != -1 && (r1Var = ((d2) this.B).L) != null) {
                    r1Var.setListSelectionHidden(false);
                    return;
                }
                return;
            case DSiCameraSource.FrontCamera /* 1 */:
                ((SearchView) this.B).o(i2);
                return;
            default:
                adapterView.getClass();
                me.magnum.melonds.ui.layouteditor.b bVar = (me.magnum.melonds.ui.layouteditor.b) this.B;
                if (bVar.f9547h0 && !bVar.f9552m0) {
                    bVar.f9549j0 = (rh.u) ((fc.b) rh.u.getEntries()).get(i2);
                    ve.c cVar = bVar.f9548i0;
                    if (cVar == null) {
                        i10 = -1;
                    } else {
                        i10 = rh.r.f12745a[cVar.ordinal()];
                    }
                    if (i10 != 1) {
                        if (i10 == 2) {
                            bVar.f9551l0 = bVar.f9549j0;
                        }
                    } else {
                        bVar.f9550k0 = bVar.f9549j0;
                    }
                    bVar.o(bVar.f9549j0, rh.s.WIDTH);
                    return;
                }
                return;
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
        int i2 = this.A;
    }

    private final void a(AdapterView adapterView) {
    }

    private final void b(AdapterView adapterView) {
    }

    private final void c(AdapterView adapterView) {
    }
}
