package defpackage;

import android.content.Context;
import me.magnum.melonds.ui.backgrounds.BackgroundsActivity;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: n10  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class n10 implements on2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ rc4 B;

    public /* synthetic */ n10(rc4 rc4Var, int i) {
        this.A = i;
        this.B = rc4Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0026, code lost:
        if (r3.a() > 1) goto L10;
     */
    @Override // defpackage.on2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c() {
        boolean z;
        int i = this.A;
        jg7 jg7Var = jg7.a;
        rc4 rc4Var = this.B;
        switch (i) {
            case 0:
                int i2 = BackgroundsActivity.B0;
                rc4Var.c();
                return jg7Var;
            case 1:
                d00 d00Var = rc4Var.f;
                if (rc4Var.g) {
                    z = true;
                    break;
                }
                z = false;
                d00Var.f(z);
                return jg7Var;
            default:
                Context context = rc4Var.a;
                rd4 rd4Var = rc4Var.b.s;
                context.getClass();
                rd4Var.getClass();
                return new Object();
        }
    }
}
