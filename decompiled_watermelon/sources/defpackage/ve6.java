package defpackage;

import android.widget.Toast;
import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ve6  reason: default package */
/* loaded from: classes.dex */
public final class ve6 extends nk6 implements aj2 {
    public final /* synthetic */ int X;
    public final /* synthetic */ we6 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ve6(we6 we6Var, j11 j11Var, int i) {
        super(2, j11Var);
        this.X = i;
        this.Y = we6Var;
    }

    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        int i = this.X;
        o27 o27Var = o27.a;
        o31 o31Var = (o31) obj;
        j11 j11Var = (j11) obj2;
        switch (i) {
            case 0:
                ((ve6) t(j11Var, o31Var)).v(o27Var);
                return o27Var;
            default:
                ((ve6) t(j11Var, o31Var)).v(o27Var);
                return o27Var;
        }
    }

    @Override // defpackage.m00
    public final j11 t(j11 j11Var, Object obj) {
        int i = this.X;
        we6 we6Var = this.Y;
        switch (i) {
            case 0:
                return new ve6(we6Var, j11Var, 0);
            default:
                return new ve6(we6Var, j11Var, 1);
        }
    }

    @Override // defpackage.m00
    public final Object v(Object obj) {
        int i = this.X;
        o27 o27Var = o27.a;
        we6 we6Var = this.Y;
        switch (i) {
            case 0:
                p31 p31Var = p31.COROUTINE_SUSPENDED;
                me2.a0(obj);
                Toast.makeText(we6Var.a, (int) R.string.no_image_selected, 0).show();
                return o27Var;
            default:
                p31 p31Var2 = p31.COROUTINE_SUSPENDED;
                me2.a0(obj);
                Toast.makeText(we6Var.a, (int) R.string.failed_to_load_image, 0).show();
                return o27Var;
        }
    }
}
