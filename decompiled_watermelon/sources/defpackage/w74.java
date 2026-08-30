package defpackage;

import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: w74  reason: default package */
/* loaded from: classes.dex */
public abstract class w74 {
    public final ax5 a;
    public final aj2 b;
    public od1 c;
    public boolean d;
    public final k91 e = new k91(7);

    public w74(ax5 ax5Var, aj2 aj2Var, od1 od1Var) {
        this.a = ax5Var;
        this.b = aj2Var;
        this.c = od1Var;
    }

    public static void a(kp4 kp4Var) {
        List list = kp4Var.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((rp4) list.get(i)).a();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.aj2 r7, defpackage.k11 r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.u74
            if (r0 == 0) goto L13
            r0 = r8
            u74 r0 = (defpackage.u74) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            u74 r0 = new u74
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.R
            p31 r1 = defpackage.p31.COROUTINE_SUSPENDED
            int r2 = r0.Y
            r3 = 0
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L2f
            if (r2 != r5) goto L29
            defpackage.me2.a0(r8)
            goto L4b
        L29:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.n(r6)
            return r4
        L2f:
            defpackage.me2.a0(r8)
            r6.d = r5
            v74 r8 = new v74
            r8.<init>(r6, r7, r4, r3)
            r0.Y = r5
            li6 r7 = new li6
            e31 r2 = r0.a()
            r7.<init>(r0, r2)
            java.lang.Object r7 = defpackage.ln2.T(r7, r5, r7, r8)
            if (r7 != r1) goto L4b
            return r1
        L4b:
            r6.d = r3
            o27 r6 = defpackage.o27.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w74.b(aj2, k11):java.lang.Object");
    }
}
