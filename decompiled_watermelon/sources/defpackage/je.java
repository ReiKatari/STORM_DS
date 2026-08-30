package defpackage;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: je  reason: default package */
/* loaded from: classes.dex */
public final class je extends ic3 implements mi2 {
    public final /* synthetic */ int B;
    public final /* synthetic */ ke L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ je(ke keVar, int i) {
        super(1);
        this.B = i;
        this.L = keVar;
    }

    @Override // defpackage.mi2
    public final Object n(Object obj) {
        int i = this.B;
        ke keVar = this.L;
        switch (i) {
            case 0:
                View view = keVar.R;
                return Boolean.valueOf(view.getParent().requestSendAccessibilityEvent(view, (AccessibilityEvent) obj));
            default:
                cw5 cw5Var = (cw5) obj;
                if (cw5Var.B.contains(cw5Var)) {
                    yg4 snapshotObserver = keVar.R.getSnapshotObserver();
                    snapshotObserver.a.d(cw5Var, keVar.H0, new wd(1, cw5Var, keVar));
                }
                return o27.a;
        }
    }
}
