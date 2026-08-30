package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: l7  reason: default package */
/* loaded from: classes.dex */
public final class l7 extends nk6 implements aj2 {
    public final /* synthetic */ int X = 2;
    public int Y;
    public int Z;
    public Object c0;
    public final /* synthetic */ Object d0;
    public final /* synthetic */ Object e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l7(u92[] u92VarArr, int i, AtomicInteger atomicInteger, q60 q60Var, j11 j11Var) {
        super(2, j11Var);
        this.c0 = u92VarArr;
        this.Z = i;
        this.d0 = atomicInteger;
        this.e0 = q60Var;
    }

    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        int i = this.X;
        o27 o27Var = o27.a;
        o31 o31Var = (o31) obj;
        j11 j11Var = (j11) obj2;
        switch (i) {
            case 0:
                return ((l7) t(j11Var, o31Var)).v(o27Var);
            case 1:
                return ((l7) t(j11Var, o31Var)).v(o27Var);
            default:
                return ((l7) t(j11Var, o31Var)).v(o27Var);
        }
    }

    @Override // defpackage.m00
    public final j11 t(j11 j11Var, Object obj) {
        int i = this.X;
        Object obj2 = this.e0;
        Object obj3 = this.d0;
        switch (i) {
            case 0:
                l7 l7Var = new l7((pk3) obj3, (um) obj2, this.Z, j11Var);
                l7Var.c0 = obj;
                return l7Var;
            case 1:
                return new l7((u92[]) this.c0, this.Z, (AtomicInteger) obj3, (q60) obj2, j11Var);
            default:
                return new l7((hv1) obj3, (ft5) obj2, j11Var);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0067, code lost:
        if (r5 == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x012f, code lost:
        if (defpackage.kp2.c(r14) == r12) goto L77;
     */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:99:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:71:0x012f -> B:73:0x0132). Please submit an issue!!! */
    @Override // defpackage.m00
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object v(java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 410
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l7.v(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l7(pk3 pk3Var, um umVar, int i, j11 j11Var) {
        super(2, j11Var);
        this.d0 = pk3Var;
        this.e0 = umVar;
        this.Z = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l7(hv1 hv1Var, ft5 ft5Var, j11 j11Var) {
        super(2, j11Var);
        this.d0 = hv1Var;
        this.e0 = ft5Var;
    }
}
