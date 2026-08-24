package defpackage;

import android.net.Uri;
import me.magnum.melonds.MelonEmulator;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: eh  reason: default package */
/* loaded from: classes.dex */
public final class eh extends hw6 implements eo2 {
    public final /* synthetic */ int X;
    public final /* synthetic */ Uri Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ eh(Uri uri, r41 r41Var, int i) {
        super(2, r41Var);
        this.X = i;
        this.Y = uri;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        int i = this.X;
        jg7 jg7Var = jg7.a;
        w61 w61Var = (w61) obj;
        r41 r41Var = (r41) obj2;
        switch (i) {
            case 0:
                return ((eh) q(r41Var, w61Var)).s(jg7Var);
            default:
                return ((eh) q(r41Var, w61Var)).s(jg7Var);
        }
    }

    @Override // defpackage.d20
    public final r41 q(r41 r41Var, Object obj) {
        switch (this.X) {
            case 0:
                return new eh(this.Y, r41Var, 0);
            default:
                return new eh(this.Y, r41Var, 1);
        }
    }

    @Override // defpackage.d20
    public final Object s(Object obj) {
        int i = this.X;
        Uri uri = this.Y;
        MelonEmulator melonEmulator = MelonEmulator.a;
        switch (i) {
            case 0:
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                oi2.Y(obj);
                return Boolean.valueOf(melonEmulator.c(uri));
            default:
                x61 x61Var2 = x61.COROUTINE_SUSPENDED;
                oi2.Y(obj);
                return Boolean.valueOf(melonEmulator.f(uri));
        }
    }
}
