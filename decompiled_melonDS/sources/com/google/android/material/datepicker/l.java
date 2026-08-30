package com.google.android.material.datepicker;

import android.os.Message;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.datepicker.m;
import me.magnum.melonds.R;
import me.magnum.melonds.common.camera.DSiCameraSource;
import q.h3;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class l implements View.OnClickListener {
    public final /* synthetic */ int A;
    public final /* synthetic */ Object B;

    public /* synthetic */ l(int i2, Object obj) {
        this.A = i2;
        this.B = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Message message;
        Message message2;
        Message message3;
        Message message4;
        p.n nVar;
        switch (this.A) {
            case 0:
                m mVar = (m) this.B;
                m.a aVar = mVar.X;
                m.a aVar2 = m.a.YEAR;
                if (aVar == aVar2) {
                    mVar.i(m.a.DAY);
                    mVar.f3037b0.announceForAccessibility(mVar.getString(R.string.mtrl_picker_toggled_to_day_selection));
                    return;
                } else if (aVar == m.a.DAY) {
                    mVar.i(aVar2);
                    mVar.Z.announceForAccessibility(mVar.getString(R.string.mtrl_picker_toggled_to_year_selection));
                    return;
                } else {
                    return;
                }
            case DSiCameraSource.FrontCamera /* 1 */:
                l.f fVar = (l.f) this.B;
                if (view == fVar.f8397j && (message4 = fVar.f8399l) != null) {
                    message = Message.obtain(message4);
                } else if (view == fVar.m && (message3 = fVar.f8401o) != null) {
                    message = Message.obtain(message3);
                } else if (view == fVar.f8402p && (message2 = fVar.f8404r) != null) {
                    message = Message.obtain(message2);
                } else {
                    message = null;
                }
                if (message != null) {
                    message.sendToTarget();
                }
                fVar.G.obtainMessage(1, fVar.f8389b).sendToTarget();
                return;
            case 2:
                ((o.a) this.B).a();
                return;
            default:
                h3 h3Var = ((Toolbar) this.B).J0;
                if (h3Var == null) {
                    nVar = null;
                } else {
                    nVar = h3Var.B;
                }
                if (nVar != null) {
                    nVar.collapseActionView();
                    return;
                }
                return;
        }
    }
}
