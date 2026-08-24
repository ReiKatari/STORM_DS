package defpackage;

import android.content.Context;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: sb7  reason: default package */
/* loaded from: classes.dex */
public final class sb7 {
    public static volatile vb1 e;
    public final wr0 a;
    public final wr0 b;
    public final ye1 c;
    public final p87 d;

    public sb7(wr0 wr0Var, wr0 wr0Var2, ye1 ye1Var, p87 p87Var, eb ebVar) {
        this.a = wr0Var;
        this.b = wr0Var2;
        this.c = ye1Var;
        this.d = p87Var;
        ((Executor) ebVar.B).execute(new g15(ebVar, 27));
    }

    public static sb7 a() {
        vb1 vb1Var = e;
        if (vb1Var != null) {
            return (sb7) vb1Var.X.get();
        }
        i.m("Not initialized!");
        return null;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [rh, java.lang.Object] */
    public static void b(Context context) {
        if (e == null) {
            synchronized (sb7.class) {
                try {
                    if (e == null) {
                        ?? obj = new Object();
                        context.getClass();
                        obj.a = context;
                        e = obj.d();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final m44 c(fa0 fa0Var) {
        Set singleton;
        if (fa0Var instanceof fa0) {
            singleton = Collections.unmodifiableSet(fa0.d);
        } else {
            singleton = Collections.singleton(new c42("proto"));
        }
        bt a = fz.a();
        fa0Var.getClass();
        a.B = "cct";
        String str = fa0Var.a;
        String str2 = fa0Var.b;
        if (str2 == null) {
            str2 = "";
        }
        a.L = ("1$" + str + "\\" + str2).getBytes(Charset.forName("UTF-8"));
        return new m44(singleton, a.A(), this, 25);
    }
}
