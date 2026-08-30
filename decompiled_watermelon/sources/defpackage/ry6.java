package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ry6  reason: default package */
/* loaded from: classes.dex */
public final class ry6 extends nk6 implements aj2 {
    public i94[] X;
    public sy6 Y;
    public qw6 Z;
    public int c0;
    public int d0;
    public int e0;
    public int f0;
    public final /* synthetic */ i94[] g0;
    public final /* synthetic */ sy6 h0;
    public final /* synthetic */ qw6 i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ry6(i94[] i94VarArr, sy6 sy6Var, qw6 qw6Var, j11 j11Var) {
        super(2, j11Var);
        this.g0 = i94VarArr;
        this.h0 = sy6Var;
        this.i0 = qw6Var;
    }

    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        return ((ry6) t((j11) obj2, (zj4) obj)).v(o27.a);
    }

    @Override // defpackage.m00
    public final j11 t(j11 j11Var, Object obj) {
        return new ry6(this.g0, this.h0, this.i0, j11Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0058, code lost:
        if (defpackage.sy6.d(r8, r7, r13, r12) == r0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005b, code lost:
        r6 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0074, code lost:
        if (defpackage.sy6.c(r8, r7, r13, r12) == r0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0076, code lost:
        return r0;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x005b -> B:20:0x005c). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0077 -> B:27:0x0078). Please submit an issue!!! */
    @Override // defpackage.m00
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object v(java.lang.Object r13) {
        /*
            r12 = this;
            p31 r0 = defpackage.p31.COROUTINE_SUSPENDED
            int r1 = r12.f0
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L23
            if (r1 == r4) goto Ld
            if (r1 != r3) goto L1d
        Ld:
            int r1 = r12.e0
            int r5 = r12.d0
            int r6 = r12.c0
            qw6 r7 = r12.Z
            sy6 r8 = r12.Y
            i94[] r9 = r12.X
            defpackage.me2.a0(r13)
            goto L5c
        L1d:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.n(r12)
            return r2
        L23:
            defpackage.me2.a0(r13)
            i94[] r13 = r12.g0
            int r1 = r13.length
            r5 = 0
            sy6 r6 = r12.h0
            qw6 r7 = r12.i0
            r9 = r13
            r13 = r5
            r8 = r6
        L31:
            if (r5 >= r1) goto L7a
            r6 = r9[r5]
            int r10 = r13 + 1
            int[] r11 = defpackage.qy6.a
            int r6 = r6.ordinal()
            r6 = r11[r6]
            if (r6 == r4) goto L77
            if (r6 == r3) goto L62
            r11 = 3
            if (r6 != r11) goto L5e
            r12.X = r9
            r12.Y = r8
            r12.Z = r7
            r12.c0 = r10
            r12.d0 = r5
            r12.e0 = r1
            r12.f0 = r3
            java.lang.Object r13 = defpackage.sy6.d(r8, r7, r13, r12)
            if (r13 != r0) goto L5b
            goto L76
        L5b:
            r6 = r10
        L5c:
            r13 = r6
            goto L78
        L5e:
            defpackage.i.c()
            return r2
        L62:
            r12.X = r9
            r12.Y = r8
            r12.Z = r7
            r12.c0 = r10
            r12.d0 = r5
            r12.e0 = r1
            r12.f0 = r4
            java.lang.Object r13 = defpackage.sy6.c(r8, r7, r13, r12)
            if (r13 != r0) goto L5b
        L76:
            return r0
        L77:
            r13 = r10
        L78:
            int r5 = r5 + r4
            goto L31
        L7a:
            o27 r12 = defpackage.o27.a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ry6.v(java.lang.Object):java.lang.Object");
    }
}
