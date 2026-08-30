package defpackage;

import android.net.Uri;
import me.magnum.melonds.MelonEmulator;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: rg  reason: default package */
/* loaded from: classes.dex */
public final class rg extends nk6 implements aj2 {
    public final /* synthetic */ int X;
    public final /* synthetic */ Uri Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rg(Uri uri, j11 j11Var, int i) {
        super(2, j11Var);
        this.X = i;
        this.Y = uri;
    }

    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        int i = this.X;
        o27 o27Var = o27.a;
        o31 o31Var = (o31) obj;
        j11 j11Var = (j11) obj2;
        switch (i) {
            case 0:
                return ((rg) t(j11Var, o31Var)).v(o27Var);
            default:
                return ((rg) t(j11Var, o31Var)).v(o27Var);
        }
    }

    @Override // defpackage.m00
    public final j11 t(j11 j11Var, Object obj) {
        switch (this.X) {
            case 0:
                return new rg(this.Y, j11Var, 0);
            default:
                return new rg(this.Y, j11Var, 1);
        }
    }

    @Override // defpackage.m00
    public final Object v(Object obj) {
        int i = this.X;
        Uri uri = this.Y;
        MelonEmulator melonEmulator = MelonEmulator.a;
        switch (i) {
            case 0:
                p31 p31Var = p31.COROUTINE_SUSPENDED;
                me2.a0(obj);
                return Boolean.valueOf(melonEmulator.c(uri));
            default:
                p31 p31Var2 = p31.COROUTINE_SUSPENDED;
                me2.a0(obj);
                return Boolean.valueOf(melonEmulator.f(uri));
        }
    }
}
