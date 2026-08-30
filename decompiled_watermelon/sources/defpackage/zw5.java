package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import me.magnum.melonds.ui.shortcutsetup.ShortcutSetupActivity;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: zw5  reason: default package */
/* loaded from: classes.dex */
public final class zw5 extends nk6 implements aj2 {
    public final /* synthetic */ int X;
    public int Y;
    public Object Z;
    public Object c0;
    public final /* synthetic */ Object d0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zw5(Object obj, Object obj2, Object obj3, j11 j11Var, int i) {
        super(2, j11Var);
        this.X = i;
        this.Z = obj;
        this.c0 = obj2;
        this.d0 = obj3;
    }

    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        int i = this.X;
        o27 o27Var = o27.a;
        switch (i) {
            case 0:
                return ((zw5) t((j11) obj2, (dw5) obj)).v(o27Var);
            case 1:
                return ((zw5) t((j11) obj2, (o31) obj)).v(o27Var);
            case 2:
                return ((zw5) t((j11) obj2, (o31) obj)).v(o27Var);
            case 3:
                return ((zw5) t((j11) obj2, (o31) obj)).v(o27Var);
            case 4:
                return ((zw5) t((j11) obj2, (o31) obj)).v(o27Var);
            case 5:
                return ((zw5) t((j11) obj2, (mu4) obj)).v(o27Var);
            case ig7.b /* 6 */:
                return ((zw5) t((j11) obj2, (o31) obj)).v(o27Var);
            case 7:
                return ((zw5) t((j11) obj2, (o31) obj)).v(o27Var);
            case 8:
                return ((zw5) t((j11) obj2, (o31) obj)).v(o27Var);
            case 9:
                return ((zw5) t((j11) obj2, (o31) obj)).v(o27Var);
            case 10:
                return ((zw5) t((j11) obj2, (o31) obj)).v(o27Var);
            case 11:
                return ((zw5) t((j11) obj2, (qw6) obj)).v(o27Var);
            case mj2.L /* 12 */:
                return ((zw5) t((j11) obj2, (hi1) obj)).v(o27Var);
            case 13:
                return ((zw5) t((j11) obj2, (nu4) obj)).v(o27Var);
            case 14:
                return ((zw5) t((j11) obj2, (nu4) obj)).v(o27Var);
            case ig7.e /* 15 */:
                return ((zw5) t((j11) obj2, (o31) obj)).v(o27Var);
            default:
                return ((zw5) t((j11) obj2, (o31) obj)).v(o27Var);
        }
    }

    @Override // defpackage.m00
    public final j11 t(j11 j11Var, Object obj) {
        int i = this.X;
        Object obj2 = this.d0;
        switch (i) {
            case 0:
                zw5 zw5Var = new zw5((ax5) this.c0, (aj2) obj2, j11Var, 0);
                zw5Var.Z = obj;
                return zw5Var;
            case 1:
                zw5 zw5Var2 = new zw5((ae6) this.c0, (um) obj2, j11Var, 1);
                zw5Var2.Z = obj;
                return zw5Var2;
            case 2:
                return new zw5((s3) this.Z, (um) this.c0, (k24) obj2, j11Var, 2);
            case 3:
                return new zw5((ShortcutSetupActivity) this.Z, (rg5) this.c0, (Intent) obj2, j11Var, 3);
            case 4:
                return new zw5((b86) this.Z, (r24) this.c0, (aj2) obj2, j11Var, 4);
            case 5:
                zw5 zw5Var3 = new zw5((e31) this.c0, (u92) obj2, j11Var, 5);
                zw5Var3.Z = obj;
                return zw5Var3;
            case ig7.b /* 6 */:
                return new zw5((hf6) obj2, j11Var, 6);
            case 7:
                return new zw5((op6) this.Z, (ht4) this.c0, (rp4) obj2, j11Var, 7);
            case 8:
                zw5 zw5Var4 = new zw5((c63) this.c0, (aj2) obj2, j11Var, 8);
                zw5Var4.Z = obj;
                return zw5Var4;
            case 9:
                return new zw5((po6) this.c0, (jo6) obj2, j11Var, 9);
            case 10:
                return new zw5((ku0) obj2, j11Var, 10);
            case 11:
                zw5 zw5Var5 = new zw5((sy6) obj2, j11Var, 11);
                zw5Var5.Z = obj;
                return zw5Var5;
            case mj2.L /* 12 */:
                zw5 zw5Var6 = new zw5((v37) this.c0, (us) obj2, j11Var, 12);
                zw5Var6.Z = obj;
                return zw5Var6;
            case 13:
                zw5 zw5Var7 = new zw5((u57) this.c0, (Context) obj2, j11Var, 13);
                zw5Var7.Z = obj;
                return zw5Var7;
            case 14:
                zw5 zw5Var8 = new zw5((u57) this.c0, (Activity) obj2, j11Var, 14);
                zw5Var8.Z = obj;
                return zw5Var8;
            case ig7.e /* 15 */:
                return new zw5((vq2) this.Z, (xh7) this.c0, (nc4) obj2, j11Var, 15);
            default:
                return new zw5((ui7) this.Z, (mq3) this.c0, (fh7) obj2, j11Var, 16);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:108:0x021f, code lost:
        if (r15 != false) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x0321, code lost:
        if (((defpackage.jo6) r20.d0).a(r5, r20) == r7) goto L195;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x032d, code lost:
        if (r3 == r7) goto L195;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0068, code lost:
        if (r2 == r1) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x0372, code lost:
        if (((defpackage.c63) r20.c0).Z(r20) == r0) goto L228;
     */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x0382, code lost:
        if (((defpackage.aj2) r20.d0).j(r1, r20) == r0) goto L228;
     */
    /* JADX WARN: Code restructure failed: missing block: B:256:0x0451, code lost:
        if (r0.a(r1, r20) == r2) goto L284;
     */
    /* JADX WARN: Code restructure failed: missing block: B:259:0x0461, code lost:
        if (defpackage.tq5.G(r1, r5, r20) == r2) goto L284;
     */
    /* JADX WARN: Code restructure failed: missing block: B:311:0x05ce, code lost:
        if (defpackage.dk7.r(r5, r20) == r7) goto L347;
     */
    /* JADX WARN: Code restructure failed: missing block: B:314:0x05e5, code lost:
        if (defpackage.dk7.r(r5, r20) == r7) goto L347;
     */
    /* JADX WARN: Code restructure failed: missing block: B:319:0x060a, code lost:
        if (defpackage.um.c((defpackage.um) r20.c0, r1, null, null, r20, 14) == r7) goto L347;
     */
    /* JADX WARN: Code restructure failed: missing block: B:381:?, code lost:
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:387:?, code lost:
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:395:?, code lost:
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01c3, code lost:
        if (r6 == r1) goto L121;
     */
    @Override // defpackage.m00
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object v(java.lang.Object r21) {
        /*
            Method dump skipped, instructions count: 1708
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zw5.v(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zw5(Object obj, Object obj2, j11 j11Var, int i) {
        super(2, j11Var);
        this.X = i;
        this.c0 = obj;
        this.d0 = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zw5(Object obj, j11 j11Var, int i) {
        super(2, j11Var);
        this.X = i;
        this.d0 = obj;
    }
}
