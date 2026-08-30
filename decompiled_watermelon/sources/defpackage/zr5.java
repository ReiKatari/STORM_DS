package defpackage;

import java.util.Set;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: zr5  reason: default package */
/* loaded from: classes.dex */
public final class zr5 extends nk6 implements aj2 {
    public final /* synthetic */ int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ Object Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zr5(j11 j11Var, Object obj, Object obj2, int i) {
        super(2, j11Var);
        this.X = i;
        this.Y = obj;
        this.Z = obj2;
    }

    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        int i = this.X;
        o27 o27Var = o27.a;
        o31 o31Var = (o31) obj;
        j11 j11Var = (j11) obj2;
        switch (i) {
            case 0:
                return ((zr5) t(j11Var, o31Var)).v(o27Var);
            case 1:
                ((zr5) t(j11Var, o31Var)).v(o27Var);
                return o27Var;
            case 2:
                ((zr5) t(j11Var, o31Var)).v(o27Var);
                return o27Var;
            case 3:
                ((zr5) t(j11Var, o31Var)).v(o27Var);
                return o27Var;
            default:
                ((zr5) t(j11Var, o31Var)).v(o27Var);
                return o27Var;
        }
    }

    @Override // defpackage.m00
    public final j11 t(j11 j11Var, Object obj) {
        int i = this.X;
        Object obj2 = this.Z;
        switch (i) {
            case 0:
                zr5 zr5Var = new zr5((aj2) obj2, j11Var);
                zr5Var.Y = obj;
                return zr5Var;
            case 1:
                return new zr5((u36) this.Y, (w36) obj2, j11Var, 1);
            case 2:
                return new zr5(j11Var, (Set) this.Y, (zd6) obj2, 2);
            case 3:
                return new zr5(j11Var, (zd6) this.Y, (m75) obj2, 3);
            default:
                return new zr5((f16) this.Y, (gc1) obj2, j11Var, 4);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0068, code lost:
        if (r5 != 3) goto L54;
     */
    /* JADX WARN: Removed duplicated region for block: B:111:0x016e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // defpackage.m00
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object v(java.lang.Object r11) {
        /*
            Method dump skipped, instructions count: 504
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zr5.v(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zr5(aj2 aj2Var, j11 j11Var) {
        super(2, j11Var);
        this.X = 0;
        this.Z = aj2Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zr5(Object obj, Object obj2, j11 j11Var, int i) {
        super(2, j11Var);
        this.X = i;
        this.Y = obj;
        this.Z = obj2;
    }
}
