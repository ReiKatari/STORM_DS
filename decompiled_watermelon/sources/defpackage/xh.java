package defpackage;

import android.graphics.Bitmap;
import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: xh  reason: default package */
/* loaded from: classes.dex */
public final class xh extends nk6 implements aj2 {
    public final /* synthetic */ int X;
    public int Y;
    public Object Z;
    public Object c0;
    public Object d0;
    public /* synthetic */ Object e0;
    public final /* synthetic */ Object f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xh(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, j11 j11Var, int i) {
        super(2, j11Var);
        this.X = i;
        this.Z = obj;
        this.c0 = obj2;
        this.d0 = obj3;
        this.e0 = obj4;
        this.f0 = obj5;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:56)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:30)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:18)
        */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008b A[Catch: all -> 0x0026, TRY_LEAVE, TryCatch #0 {all -> 0x0026, blocks: (B:15:0x003d, B:25:0x0081, B:22:0x0070, B:27:0x008b, B:8:0x0022), top: B:42:0x000c }] */
    /* JADX WARN: Type inference failed for: r11v2, types: [ku0] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v2, types: [lj0] */
    /* JADX WARN: Type inference failed for: r5v7, types: [lj0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v9, types: [lj0] */
    /* JADX WARN: Type inference failed for: r7v1, types: [dz4] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object, dz4] */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Object, dz4] */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0089 -> B:22:0x0070). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x009c -> B:22:0x0070). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object x(java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.Object r0 = r10.f0
            ki2 r0 = (defpackage.ki2) r0
            p31 r1 = defpackage.p31.COROUTINE_SUSPENDED
            int r2 = r10.Y
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L41
            if (r2 == r5) goto L14
            if (r2 == r4) goto L2f
            if (r2 != r3) goto L29
        L14:
            java.lang.Object r2 = r10.Z
            java.lang.Object r5 = r10.d0
            lj0 r5 = (defpackage.lj0) r5
            java.lang.Object r7 = r10.c0
            dz4 r7 = (defpackage.dz4) r7
            java.lang.Object r8 = r10.e0
            w92 r8 = (defpackage.w92) r8
            defpackage.me2.a0(r11)     // Catch: java.lang.Throwable -> L26
            goto L70
        L26:
            r10 = move-exception
            goto La0
        L29:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.n(r10)
            return r6
        L2f:
            java.lang.Object r2 = r10.Z
            java.lang.Object r5 = r10.d0
            lj0 r5 = (defpackage.lj0) r5
            java.lang.Object r7 = r10.c0
            dz4 r7 = (defpackage.dz4) r7
            java.lang.Object r8 = r10.e0
            w92 r8 = (defpackage.w92) r8
            defpackage.me2.a0(r11)     // Catch: java.lang.Throwable -> L26
            goto L81
        L41:
            defpackage.me2.a0(r11)
            java.lang.Object r11 = r10.e0
            r8 = r11
            w92 r8 = (defpackage.w92) r8
            dz4 r7 = new dz4
            r7.<init>()
            e76 r11 = new e76
            r11.<init>()
            r7.A = r11
            r11 = 6
            q60 r11 = defpackage.n40.f(r5, r6, r6, r11)
            java.lang.Object r2 = r7.y(r11, r0)     // Catch: java.lang.Throwable -> L9e
            r10.e0 = r8     // Catch: java.lang.Throwable -> L9e
            r10.c0 = r7     // Catch: java.lang.Throwable -> L9e
            r10.d0 = r11     // Catch: java.lang.Throwable -> L9e
            r10.Z = r2     // Catch: java.lang.Throwable -> L9e
            r10.Y = r5     // Catch: java.lang.Throwable -> L9e
            java.lang.Object r5 = r8.b(r2, r10)     // Catch: java.lang.Throwable -> L9e
            if (r5 != r1) goto L6f
            goto L9b
        L6f:
            r5 = r11
        L70:
            r10.e0 = r8     // Catch: java.lang.Throwable -> L26
            r10.c0 = r7     // Catch: java.lang.Throwable -> L26
            r10.d0 = r5     // Catch: java.lang.Throwable -> L26
            r10.Z = r2     // Catch: java.lang.Throwable -> L26
            r10.Y = r4     // Catch: java.lang.Throwable -> L26
            java.lang.Object r11 = r5.n(r10)     // Catch: java.lang.Throwable -> L26
            if (r11 != r1) goto L81
            goto L9b
        L81:
            java.lang.Object r11 = r7.y(r5, r0)     // Catch: java.lang.Throwable -> L26
            boolean r9 = defpackage.b53.x(r11, r2)     // Catch: java.lang.Throwable -> L26
            if (r9 != 0) goto L70
            r10.e0 = r8     // Catch: java.lang.Throwable -> L26
            r10.c0 = r7     // Catch: java.lang.Throwable -> L26
            r10.d0 = r5     // Catch: java.lang.Throwable -> L26
            r10.Z = r11     // Catch: java.lang.Throwable -> L26
            r10.Y = r3     // Catch: java.lang.Throwable -> L26
            java.lang.Object r2 = r8.b(r11, r10)     // Catch: java.lang.Throwable -> L26
            if (r2 != r1) goto L9c
        L9b:
            return r1
        L9c:
            r2 = r11
            goto L70
        L9e:
            r10 = move-exception
            r5 = r11
        La0:
            java.lang.Object r11 = r7.A
            ku0 r11 = (defpackage.ku0) r11
            if (r11 == 0) goto La9
            r11.k(r5)
        La9:
            java.lang.Object r11 = r7.A
            ku0 r11 = (defpackage.ku0) r11
            if (r11 == 0) goto Lb0
            goto Lb5
        Lb0:
            java.lang.String r0 = "Called dispose on a manager that has been disposed of"
            defpackage.or4.b(r0)
        Lb5:
            r11.e()
            r7.A = r6
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xh.x(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        int i = this.X;
        o27 o27Var = o27.a;
        switch (i) {
            case 0:
                return ((xh) t((j11) obj2, (o31) obj)).v(o27Var);
            case 1:
                return ((xh) t((j11) obj2, (o31) obj)).v(o27Var);
            case 2:
                return ((xh) t((j11) obj2, (o31) obj)).v(o27Var);
            case 3:
                return ((xh) t((j11) obj2, (o31) obj)).v(o27Var);
            case 4:
                return ((xh) t((j11) obj2, (o31) obj)).v(o27Var);
            case 5:
                return ((xh) t((j11) obj2, (o31) obj)).v(o27Var);
            case ig7.b /* 6 */:
                return ((xh) t((j11) obj2, (o31) obj)).v(o27Var);
            case 7:
                return ((xh) t((j11) obj2, (u92) obj)).v(o27Var);
            case 8:
                return ((xh) t((j11) obj2, (o31) obj)).v(o27Var);
            case 9:
                return ((xh) t((j11) obj2, (o31) obj)).v(o27Var);
            case 10:
                return ((xh) t((j11) obj2, (o31) obj)).v(o27Var);
            case 11:
                return ((xh) t((j11) obj2, (o31) obj)).v(o27Var);
            case mj2.L /* 12 */:
                return ((xh) t((j11) obj2, (w92) obj)).v(o27Var);
            case 13:
                return ((xh) t((j11) obj2, (o31) obj)).v(o27Var);
            default:
                return ((xh) t((j11) obj2, (xw5) obj)).v(o27Var);
        }
    }

    @Override // defpackage.m00
    public final j11 t(j11 j11Var, Object obj) {
        int i = this.X;
        Object obj2 = this.f0;
        switch (i) {
            case 0:
                xh xhVar = new xh((fj) this.c0, (mi2) this.d0, (yh) this.e0, (cm3) obj2, j11Var, 0);
                xhVar.Z = obj;
                return xhVar;
            case 1:
                return new xh((vj) this.e0, (x15) obj2, j11Var, 1);
            case 2:
                return new xh((xj) this.e0, (b25) obj2, j11Var, 2);
            case 3:
                return new xh((tu5) this.Z, (String) this.c0, (String) this.d0, (e00) this.e0, (vy) obj2, j11Var, 3);
            case 4:
                return new xh((hm3) this.Z, (k24) this.c0, (zq6) this.d0, (bq6) this.e0, (hx2) obj2, j11Var, 4);
            case 5:
                return new xh((o50) this.Z, (oq6) this.c0, (hm3) this.d0, (mr6) this.e0, (pb4) obj2, j11Var, 5);
            case ig7.b /* 6 */:
                return new xh((hv1) this.e0, (rg5) obj2, j11Var, 6);
            case 7:
                xh xhVar2 = new xh((yt0) this.c0, (k24) this.d0, (pj4) this.e0, (k24) obj2, j11Var, 7);
                xhVar2.Z = obj;
                return xhVar2;
            case 8:
                return new xh((bj3) this.e0, (List) obj2, j11Var, 8);
            case 9:
                return new xh((vw2) this.Z, (c55) this.c0, (h76) this.d0, (t12) this.e0, (Bitmap) obj2, j11Var, 9);
            case 10:
                xh xhVar3 = new xh((s55) this.d0, (r55) this.e0, (im) obj2, j11Var, 10);
                xhVar3.Z = obj;
                return xhVar3;
            case 11:
                return new xh((by5) this.e0, this.Z, (kx6) obj2, j11Var);
            case mj2.L /* 12 */:
                xh xhVar4 = new xh((ki2) obj2, j11Var);
                xhVar4.e0 = obj;
                return xhVar4;
            case 13:
                xh xhVar5 = new xh((vp4) this.c0, (op6) this.d0, (j4) this.e0, (ht4) obj2, j11Var, 13);
                xhVar5.Z = obj;
                return xhVar5;
            default:
                xh xhVar6 = new xh((mw6) this.d0, (ax5) this.e0, (n75) obj2, j11Var, 14);
                xhVar6.Z = obj;
                return xhVar6;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:249|(1:250)|(2:252|(1:(1:(14:256|257|258|259|260|(1:262)|263|265|266|267|(4:270|(3:272|273|274)(1:276)|275|268)|277|278|279)(2:285|286))(13:287|288|289|290|291|292|293|294|296|297|(11:301|260|(0)|263|265|266|267|(1:268)|277|278|279)|299|300))(3:310|311|312))(5:327|328|329|330|(3:332|299|300))|313|314|(2:316|(1:318))|319|320|(8:322|291|292|293|294|296|297|(0))|299|300) */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x02eb, code lost:
        if (defpackage.by5.p(r8, r22) == r14) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:284:0x05db, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:285:0x05dc, code lost:
        r6 = r5;
        r5 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:331:0x06f8, code lost:
        if (r9.a(r0, r22) == r7) goto L359;
     */
    /* JADX WARN: Code restructure failed: missing block: B:354:0x0798, code lost:
        if (r4 == r3) goto L382;
     */
    /* JADX WARN: Code restructure failed: missing block: B:357:0x07b3, code lost:
        if (r2 == r3) goto L382;
     */
    /* JADX WARN: Code restructure failed: missing block: B:360:0x07ca, code lost:
        if (r5.b(r6, r22) == r3) goto L382;
     */
    /* JADX WARN: Code restructure failed: missing block: B:535:?, code lost:
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0211, code lost:
        if (r5 == r11) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0218, code lost:
        if (r5 == r11) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x021b, code lost:
        r5 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x021c, code lost:
        if (r5 != r11) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0225, code lost:
        if (defpackage.by5.r(r10, r22) == r11) goto L98;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Not initialized variable reg: 3, insn: 0x0487: IF  (r5v54 ?? I:??[int, boolean, OBJECT, ARRAY, byte, short, char]) != (r3 I:??[int, boolean, OBJECT, ARRAY, byte, short, char])  -> B:208:0x048f, block:B:204:0x0487 */
    /* JADX WARN: Removed duplicated region for block: B:12:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x03f5 A[Catch: all -> 0x0478, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x0321, blocks: (B:127:0x031c, B:162:0x03ee, B:163:0x03f4, B:165:0x03f9, B:166:0x03fa, B:168:0x0401, B:170:0x040f, B:172:0x0415, B:175:0x041b, B:177:0x041f, B:178:0x0423, B:179:0x0426, B:180:0x0429, B:164:0x03f5), top: B:473:0x030d }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x0621  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x062c A[Catch: all -> 0x0536, TryCatch #12 {all -> 0x0536, blocks: (B:248:0x052f, B:295:0x0623, B:297:0x062c, B:298:0x0637), top: B:491:0x052f }] */
    /* JADX WARN: Removed duplicated region for block: B:310:0x068c  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0237  */
    /* JADX WARN: Type inference failed for: r2v44, types: [int, a31] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0080 -> B:16:0x0082). Please submit an issue!!! */
    @Override // defpackage.m00
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object v(java.lang.Object r23) {
        /*
            Method dump skipped, instructions count: 2614
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xh.v(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xh(by5 by5Var, Object obj, kx6 kx6Var, j11 j11Var) {
        super(2, j11Var);
        this.X = 11;
        this.e0 = by5Var;
        this.Z = obj;
        this.f0 = kx6Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xh(Object obj, Object obj2, j11 j11Var, int i) {
        super(2, j11Var);
        this.X = i;
        this.e0 = obj;
        this.f0 = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xh(Object obj, Object obj2, Object obj3, j11 j11Var, int i) {
        super(2, j11Var);
        this.X = i;
        this.d0 = obj;
        this.e0 = obj2;
        this.f0 = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xh(Object obj, Object obj2, Object obj3, Object obj4, j11 j11Var, int i) {
        super(2, j11Var);
        this.X = i;
        this.c0 = obj;
        this.d0 = obj2;
        this.e0 = obj3;
        this.f0 = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xh(ki2 ki2Var, j11 j11Var) {
        super(2, j11Var);
        this.X = 12;
        this.f0 = ki2Var;
    }
}
