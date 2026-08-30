package com.google.android.material.datepicker;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import j7.u0;
import java.util.Calendar;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class f implements View.OnClickListener {
    public final /* synthetic */ int A;
    public final /* synthetic */ u B;
    public final /* synthetic */ m L;

    public /* synthetic */ f(m mVar, u uVar, int i2) {
        this.A = i2;
        this.L = mVar;
        this.B = uVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int G;
        switch (this.A) {
            case 0:
                m mVar = this.L;
                Calendar a10 = x.a(this.B.f3061d.A.A);
                a10.add(2, ((LinearLayoutManager) mVar.f3037b0.getLayoutManager()).N0() - 1);
                mVar.h(new q(a10));
                return;
            default:
                m mVar2 = this.L;
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) mVar2.f3037b0.getLayoutManager();
                View P0 = linearLayoutManager.P0(0, false, linearLayoutManager.v());
                if (P0 == null) {
                    G = -1;
                } else {
                    G = u0.G(P0);
                }
                Calendar a11 = x.a(this.B.f3061d.A.A);
                a11.add(2, G + 1);
                mVar2.h(new q(a11));
                return;
        }
    }
}
