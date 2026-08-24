package defpackage;

import android.content.Context;
import android.widget.Toast;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: pe4  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class pe4 implements on2 {
    public final /* synthetic */ int A = 0;
    public final /* synthetic */ on2 B;
    public final /* synthetic */ Context L;

    public /* synthetic */ pe4(on2 on2Var, Context context) {
        this.B = on2Var;
        this.L = context;
    }

    @Override // defpackage.on2
    public final Object c() {
        int i = this.A;
        jg7 jg7Var = jg7.a;
        Context context = this.L;
        on2 on2Var = this.B;
        switch (i) {
            case 0:
                Toast.makeText(context, "NiFi Local Mesh активен. Запустите игру для поиска игроков!", 1).show();
                on2Var.c();
                return jg7Var;
            default:
                on2Var.c();
                Toast.makeText(context, "Синхронизация с сервером RetroAchievements выполнена", 0).show();
                return jg7Var;
        }
    }

    public /* synthetic */ pe4(Context context, on2 on2Var) {
        this.L = context;
        this.B = on2Var;
    }
}
