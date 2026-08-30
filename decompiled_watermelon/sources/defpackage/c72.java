package defpackage;

import android.net.Uri;
import java.util.Set;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: c72  reason: default package */
/* loaded from: classes.dex */
public final class c72 extends nk6 implements aj2 {
    public Uri[] X;
    public int Y;
    public int Z;
    public int c0;
    public /* synthetic */ Object d0;
    public final /* synthetic */ d72 e0;
    public final /* synthetic */ Set f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c72(d72 d72Var, Set set, j11 j11Var) {
        super(2, j11Var);
        this.e0 = d72Var;
        this.f0 = set;
    }

    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        return ((c72) t((j11) obj2, (w92) obj)).v(o27.a);
    }

    @Override // defpackage.m00
    public final j11 t(j11 j11Var, Object obj) {
        c72 c72Var = new c72(this.e0, this.f0, j11Var);
        c72Var.d0 = obj;
        return c72Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0045 -> B:25:0x008b). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0070 -> B:25:0x008b). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0088 -> B:25:0x008b). Please submit an issue!!! */
    @Override // defpackage.m00
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object v(java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.Object r0 = r11.d0
            w92 r0 = (defpackage.w92) r0
            p31 r1 = defpackage.p31.COROUTINE_SUSPENDED
            int r2 = r11.c0
            r3 = 1
            r4 = 0
            d72 r5 = r11.e0
            if (r2 == 0) goto L21
            if (r2 != r3) goto L1b
            int r2 = r11.Z
            int r6 = r11.Y
            android.net.Uri[] r7 = r11.X
            defpackage.me2.a0(r12)
            goto L8b
        L1b:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.n(r11)
            return r4
        L21:
            defpackage.me2.a0(r12)
            w16 r12 = r5.c
            b56 r12 = (defpackage.b56) r12
            android.net.Uri[] r12 = r12.r()
            r5.z(r12)
            int r2 = r12.length
            r6 = 0
            r7 = r12
        L32:
            if (r6 >= r2) goto L8d
            r12 = r7[r6]
            java.lang.String r8 = r12.toString()
            r8.getClass()
            java.util.Set r9 = r11.f0
            if (r9 == 0) goto L48
            boolean r8 = r9.contains(r8)
            if (r8 != 0) goto L48
            goto L8b
        L48:
            boolean r8 = r5.n(r12)
            if (r8 != 0) goto L74
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "ROM directory permission is missing; reauthorization required for "
            r8.<init>(r9)
            r8.append(r12)
            java.lang.String r8 = r8.toString()
            java.lang.String r9 = "FSRomsRepository"
            android.util.Log.w(r9, r8)
            q62 r8 = r5.h(r12)
            if (r8 == 0) goto L6f
            long r8 = r8.c
            java.lang.Long r10 = new java.lang.Long
            r10.<init>(r8)
            goto L70
        L6f:
            r10 = r4
        L70:
            r5.p(r12, r10)
            goto L8b
        L74:
            android.content.Context r8 = r5.a
            c76 r8 = defpackage.uh1.h(r8, r12)
            r11.d0 = r0
            r11.X = r7
            r11.Y = r6
            r11.Z = r2
            r11.c0 = r3
            java.lang.Object r12 = defpackage.d72.c(r5, r12, r8, r0, r11)
            if (r12 != r1) goto L8b
            return r1
        L8b:
            int r6 = r6 + r3
            goto L32
        L8d:
            o27 r11 = defpackage.o27.a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c72.v(java.lang.Object):java.lang.Object");
    }
}
