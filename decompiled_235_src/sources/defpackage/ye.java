package defpackage;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ye  reason: default package */
/* loaded from: classes.dex */
public final class ye extends aj3 implements qn2 {
    public final /* synthetic */ int B;
    public final /* synthetic */ ze L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ye(ze zeVar, int i) {
        super(1);
        this.B = i;
        this.L = zeVar;
    }

    @Override // defpackage.qn2
    public final Object g(Object obj) {
        int i = this.B;
        ze zeVar = this.L;
        switch (i) {
            case 0:
                View view = zeVar.R;
                return Boolean.valueOf(view.getParent().requestSendAccessibilityEvent(view, (AccessibilityEvent) obj));
            default:
                o76 o76Var = (o76) obj;
                if (o76Var.B.contains(o76Var)) {
                    bq4 snapshotObserver = zeVar.R.getSnapshotObserver();
                    snapshotObserver.a.d(o76Var, zeVar.I0, new le(1, o76Var, zeVar));
                }
                return jg7.a;
        }
    }
}
