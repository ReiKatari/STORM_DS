package defpackage;

import android.content.Context;
import android.widget.Toast;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: jn2  reason: default package */
/* loaded from: classes.dex */
public final class jn2 extends hw6 implements eo2 {
    public final /* synthetic */ int X;
    public final /* synthetic */ Context Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jn2(Context context, r41 r41Var, int i) {
        super(2, r41Var);
        this.X = i;
        this.Y = context;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        int i = this.X;
        jg7 jg7Var = jg7.a;
        w61 w61Var = (w61) obj;
        r41 r41Var = (r41) obj2;
        switch (i) {
            case 0:
                ((jn2) q(r41Var, w61Var)).s(jg7Var);
                return jg7Var;
            default:
                ((jn2) q(r41Var, w61Var)).s(jg7Var);
                return jg7Var;
        }
    }

    @Override // defpackage.d20
    public final r41 q(r41 r41Var, Object obj) {
        switch (this.X) {
            case 0:
                return new jn2(this.Y, r41Var, 0);
            default:
                return new jn2(this.Y, r41Var, 1);
        }
    }

    @Override // defpackage.d20
    public final Object s(Object obj) {
        int i = this.X;
        jg7 jg7Var = jg7.a;
        Context context = this.Y;
        switch (i) {
            case 0:
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                oi2.Y(obj);
                Toast.makeText(context, "Не удалось загрузить изображение", 0).show();
                return jg7Var;
            default:
                x61 x61Var2 = x61.COROUTINE_SUSPENDED;
                oi2.Y(obj);
                Toast.makeText(context, "Импорт чит-базы запущен...", 0).show();
                return jg7Var;
        }
    }
}
