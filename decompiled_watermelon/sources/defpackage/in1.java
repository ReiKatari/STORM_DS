package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.view.View;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: in1  reason: default package */
/* loaded from: classes.dex */
public final class in1 extends View {
    public final /* synthetic */ w10 A;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public in1(w10 w10Var, Context context) {
        super(context);
        this.A = w10Var;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        configuration.getClass();
        this.A.run();
    }
}
