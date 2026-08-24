package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.view.View;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: sr1  reason: default package */
/* loaded from: classes.dex */
public final class sr1 extends View {
    public final /* synthetic */ q30 A;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sr1(q30 q30Var, Context context) {
        super(context);
        this.A = q30Var;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        configuration.getClass();
        this.A.run();
    }
}
