package defpackage;

import android.view.View;
import android.widget.Magnifier;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: no4  reason: default package */
/* loaded from: classes.dex */
public final class no4 implements lo4 {
    public static final no4 b = new no4(0);
    public static final no4 c = new no4(1);
    public final /* synthetic */ int a;

    public /* synthetic */ no4(int i) {
        this.a = i;
    }

    @Override // defpackage.lo4
    public final boolean a() {
        switch (this.a) {
            case 0:
                return false;
            default:
                return true;
        }
    }

    @Override // defpackage.lo4
    public final ko4 b(View view, od1 od1Var) {
        switch (this.a) {
            case 0:
                return new mo4(new Magnifier(view));
            default:
                return new mo4(new Magnifier(view));
        }
    }
}
