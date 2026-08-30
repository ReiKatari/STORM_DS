package defpackage;

import me.magnum.melonds.domain.model.ConsoleType;
import me.magnum.melonds.domain.model.MicSource;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: bw1  reason: default package */
/* loaded from: classes.dex */
public final class bw1 extends nk6 implements bj2 {
    public final /* synthetic */ int X;
    public /* synthetic */ Object Y;
    public /* synthetic */ Object Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bw1(wn4 wn4Var, j11 j11Var) {
        super(3, j11Var);
        this.X = 1;
        this.Z = wn4Var;
    }

    @Override // defpackage.bj2
    public final Object i(Object obj, Object obj2, Object obj3) {
        int i = this.X;
        o27 o27Var = o27.a;
        switch (i) {
            case 0:
                bw1 bw1Var = new bw1(3, 0, (j11) obj3);
                bw1Var.Y = (m11) obj;
                bw1Var.Z = (rg5) obj2;
                return bw1Var.v(o27Var);
            case 1:
                w92 w92Var = (w92) obj;
                bw1 bw1Var2 = new bw1((wn4) this.Z, (j11) obj3);
                bw1Var2.Y = (Throwable) obj2;
                bw1Var2.v(o27Var);
                return o27Var;
            case 2:
                bw1 bw1Var3 = new bw1(3, 2, (j11) obj3);
                bw1Var3.Y = (ConsoleType) obj;
                bw1Var3.Z = (MicSource) obj2;
                return bw1Var3.v(o27Var);
            case 3:
                bw1 bw1Var4 = new bw1(3, 3, (j11) obj3);
                bw1Var4.Y = (m46) obj;
                bw1Var4.Z = (ue5) obj2;
                return bw1Var4.v(o27Var);
            default:
                bw1 bw1Var5 = new bw1(3, 4, (j11) obj3);
                bw1Var5.Y = (k46) obj;
                bw1Var5.Z = (l46) obj2;
                return bw1Var5.v(o27Var);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a3  */
    @Override // defpackage.m00
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object v(java.lang.Object r22) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bw1.v(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bw1(int i, int i2, j11 j11Var) {
        super(i, j11Var);
        this.X = i2;
    }
}
