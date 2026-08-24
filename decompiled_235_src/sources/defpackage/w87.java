package defpackage;

import android.content.Context;
import android.os.Build;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: w87  reason: default package */
/* loaded from: classes.dex */
public final class w87 {
    public final Context a;
    public final a21 b;
    public final w30 c;
    public final if4 d;
    public final a21 e;

    public w87(Context context, ow7 ow7Var) {
        if4 if4Var;
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        w30 w30Var = new w30(applicationContext, ow7Var, 0);
        Context applicationContext2 = context.getApplicationContext();
        applicationContext2.getClass();
        w30 w30Var2 = new w30(applicationContext2, ow7Var, 1);
        if (Build.VERSION.SDK_INT < 28) {
            Context applicationContext3 = context.getApplicationContext();
            applicationContext3.getClass();
            String str = hf4.a;
            if4Var = new if4(applicationContext3, ow7Var);
        } else {
            if4Var = null;
        }
        Context applicationContext4 = context.getApplicationContext();
        applicationContext4.getClass();
        w30 w30Var3 = new w30(applicationContext4, ow7Var, 2);
        this.a = context;
        this.b = w30Var;
        this.c = w30Var2;
        this.d = if4Var;
        this.e = w30Var3;
    }
}
