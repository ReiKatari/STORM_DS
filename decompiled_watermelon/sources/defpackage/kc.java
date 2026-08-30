package defpackage;

import java.util.ArrayList;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: kc  reason: default package */
/* loaded from: classes.dex */
public final class kc extends nk6 implements mi2 {
    public final /* synthetic */ int X;
    public int Y;
    public Object Z;
    public final /* synthetic */ Object c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kc(t47 t47Var, j11 j11Var) {
        super(1, j11Var);
        this.X = 8;
        this.c0 = t47Var;
    }

    @Override // defpackage.mi2
    public final Object n(Object obj) {
        int i = this.X;
        o27 o27Var = o27.a;
        Object obj2 = this.c0;
        j11 j11Var = (j11) obj;
        switch (i) {
            case 0:
                return new kc((pc) this.Z, (bj2) obj2, j11Var, 0).v(o27Var);
            case 1:
                return new kc((vl) this.Z, (ao6) obj2, j11Var, 1).v(o27Var);
            case 2:
                return new kc((n10) this.Z, (m10) obj2, j11Var, 2).v(o27Var);
            case 3:
                return new kc((sq5) this.Z, (mi2) obj2, j11Var, 3).v(o27Var);
            case 4:
                return new kc((aj2) this.Z, (rg5) obj2, j11Var, 4).v(o27Var);
            case 5:
                return new kc((hv1) this.Z, (j75) obj2, j11Var, 5).v(o27Var);
            case ig7.b /* 6 */:
                return new kc((w92) this.Z, (n75) obj2, j11Var, 6).v(o27Var);
            case 7:
                return new kc((hd5) this.Z, (ArrayList) obj2, j11Var, 7).v(o27Var);
            default:
                return new kc((t47) obj2, j11Var).v(o27Var);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x00a3, code lost:
        if (r0.F(r20) != r5) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00b0, code lost:
        if (r0 == r5) goto L24;
     */
    @Override // defpackage.m00
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object v(java.lang.Object r21) {
        /*
            Method dump skipped, instructions count: 818
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kc.v(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kc(Object obj, Object obj2, j11 j11Var, int i) {
        super(1, j11Var);
        this.X = i;
        this.Z = obj;
        this.c0 = obj2;
    }
}
