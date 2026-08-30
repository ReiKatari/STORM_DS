package defpackage;

import java.util.concurrent.CancellationException;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: q35  reason: default package */
/* loaded from: classes.dex */
public final class q35 {
    public final jm4 a;
    public final o31 b;
    public final k91 c;
    public final Object d;
    public gs0 e;
    public kd6 f;
    public boolean g;

    public q35(jm4 jm4Var, o31 o31Var, k91 k91Var) {
        o31Var.getClass();
        this.a = jm4Var;
        this.b = o31Var;
        this.c = k91Var;
        this.d = new Object();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(20:(2:3|(22:5|6|7|8|(1:(1:(22:12|13|(3:133|(3:136|(2:138|139)|134)|140)|17|18|(1:132)(1:21)|(1:23)(1:131)|24|25|(1:27)|28|(2:31|29)|32|33|(1:35)(4:111|(5:114|(1:116)(1:128)|117|(1:126)(3:122|123|124)|112)|129|130)|36|(1:38)(4:91|(5:94|(1:96)(1:108)|97|(1:106)(3:102|103|104)|92)|109|110)|39|(4:71|(5:74|(1:76)(1:88)|77|(1:86)(3:82|83|84)|72)|89|90)(1:43)|(4:51|(5:54|(1:56)(1:68)|57|(1:66)(3:62|63|64)|52)|69|70)(1:47)|48|49)(2:141|142))(4:143|144|145|146))(5:183|(4:186|(3:188|189|190)(1:192)|191|184)|193|194|(2:196|197)(9:198|199|200|(9:202|203|204|205|206|207|208|209|210)|220|221|222|223|(1:226)(1:225)))|147|148|149|150|(2:153|151)|154|155|(2:158|156)|159|160|(3:171|(2:173|(1:176)(1:175))|177)|162|163|(3:170|166|(1:169)(34:168|13|(1:15)|133|(1:134)|140|17|18|(0)|132|(0)(0)|24|25|(0)|28|(1:29)|32|33|(0)(0)|36|(0)(0)|39|(1:41)|71|(1:72)|89|90|(1:45)|51|(1:52)|69|70|48|49))(0)|165|166|(0)(0)))|8|(0)(0)|147|148|149|150|(1:151)|154|155|(1:156)|159|160|(0)|162|163|(0)(0)|165|166|(0)(0)) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02b4 A[LOOP:0: B:102:0x02ae->B:104:0x02b4, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:241:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x013a A[LOOP:6: B:53:0x0134->B:55:0x013a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0178 A[LOOP:7: B:57:0x0172->B:59:0x0178, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0293  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(defpackage.q35 r28, defpackage.v35 r29, defpackage.k11 r30) {
        /*
            Method dump skipped, instructions count: 1014
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q35.a(q35, v35, k11):java.lang.Object");
    }

    public final Object b(v35 v35Var, hz1 hz1Var) {
        gs0 gs0Var;
        kd6 kd6Var;
        synchronized (this.d) {
            if (!this.g) {
                gs0Var = this.e;
                kd6Var = null;
                if (gs0Var == null) {
                    gs0 gs0Var2 = new gs0();
                    this.e = gs0Var2;
                    kd6Var = tq5.w(this.b, null, s31.LAZY, new m5(gs0Var2, this, v35Var, (j11) null, 24), 1);
                    this.f = kd6Var;
                    kd6Var.R(new zr4(1, gs0Var2, this));
                    gs0Var = gs0Var2;
                }
            } else {
                throw new CancellationException("Pending submission coordinator is closed");
            }
        }
        if (kd6Var != null) {
            kd6Var.start();
        }
        Object h = gs0Var.h(hz1Var);
        p31 p31Var = p31.COROUTINE_SUSPENDED;
        return h;
    }
}
