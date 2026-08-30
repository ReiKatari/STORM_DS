package defpackage;

import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: mj1  reason: default package */
/* loaded from: classes.dex */
public abstract class mj1 {
    public static final float a = 0.125f / 18.0f;

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00bd, code lost:
        if (defpackage.mb4.b(defpackage.ve2.K(r11, true), 0) == false) goto L19;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0084 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object, m75] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x005e -> B:22:0x0063). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(defpackage.sk6 r17, long r18, defpackage.k11 r20) {
        /*
            Method dump skipped, instructions count: 203
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mj1.a(sk6, long, k11):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009b A[Catch: mp4 -> 0x00a4, TRY_LEAVE, TryCatch #0 {mp4 -> 0x00a4, blocks: (B:12:0x002a, B:34:0x0097, B:36:0x009b, B:30:0x007d), top: B:46:0x0020 }] */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object, n75] */
    /* JADX WARN: Type inference failed for: r10v3, types: [n75] */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r12v8, types: [java.lang.Object, n75] */
    /* JADX WARN: Type inference failed for: r2v3, types: [j75, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(defpackage.sk6 r9, long r10, defpackage.k11 r12) {
        /*
            boolean r0 = r12 instanceof defpackage.ej1
            if (r0 == 0) goto L13
            r0 = r12
            ej1 r0 = (defpackage.ej1) r0
            int r1 = r0.c0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c0 = r1
            goto L18
        L13:
            ej1 r0 = new ej1
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.Z
            p31 r1 = defpackage.p31.COROUTINE_SUSPENDED
            int r2 = r0.c0
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2e
            j75 r9 = r0.Y
            n75 r10 = r0.X
            rp4 r11 = r0.R
            defpackage.me2.a0(r12)     // Catch: defpackage.mp4 -> La4
            goto L97
        L2e:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.n(r9)
            return r4
        L34:
            defpackage.me2.a0(r12)
            uk6 r12 = r9.Y
            kp4 r12 = r12.o0
            boolean r12 = f(r12, r10)
            if (r12 == 0) goto L42
            goto La3
        L42:
            uk6 r12 = r9.Y
            kp4 r12 = r12.o0
            java.util.List r12 = r12.a
            int r2 = r12.size()
            r5 = 0
        L4d:
            if (r5 >= r2) goto L62
            java.lang.Object r6 = r12.get(r5)
            r7 = r6
            rp4 r7 = (defpackage.rp4) r7
            long r7 = r7.a
            boolean r7 = defpackage.cg2.y(r7, r10)
            if (r7 == 0) goto L5f
            goto L63
        L5f:
            int r5 = r5 + 1
            goto L4d
        L62:
            r6 = r4
        L63:
            r11 = r6
            rp4 r11 = (defpackage.rp4) r11
            if (r11 != 0) goto L69
            goto La3
        L69:
            n75 r10 = new n75
            r10.<init>()
            n75 r12 = new n75
            r12.<init>()
            r12.A = r11
            fa7 r2 = r9.f()
            long r5 = r2.c()
            j75 r2 = new j75     // Catch: defpackage.mp4 -> La4
            r2.<init>()     // Catch: defpackage.mp4 -> La4
            fj1 r7 = new fj1     // Catch: defpackage.mp4 -> La4
            r7.<init>(r2, r12, r10, r4)     // Catch: defpackage.mp4 -> La4
            r0.R = r11     // Catch: defpackage.mp4 -> La4
            r0.X = r10     // Catch: defpackage.mp4 -> La4
            r0.Y = r2     // Catch: defpackage.mp4 -> La4
            r0.c0 = r3     // Catch: defpackage.mp4 -> La4
            java.lang.Object r9 = r9.h(r5, r7, r0)     // Catch: defpackage.mp4 -> La4
            if (r9 != r1) goto L96
            return r1
        L96:
            r9 = r2
        L97:
            boolean r9 = r9.A     // Catch: defpackage.mp4 -> La4
            if (r9 == 0) goto La3
            java.lang.Object r9 = r10.A     // Catch: defpackage.mp4 -> La4
            rp4 r9 = (defpackage.rp4) r9     // Catch: defpackage.mp4 -> La4
            if (r9 != 0) goto La2
            return r11
        La2:
            return r9
        La3:
            return r4
        La4:
            java.lang.Object r9 = r10.A
            rp4 r9 = (defpackage.rp4) r9
            if (r9 != 0) goto Lab
            goto Lac
        Lab:
            r11 = r9
        Lac:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mj1.b(sk6, long, k11):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00d2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, m75] */
    /* JADX WARN: Type inference failed for: r13v2, types: [aj2] */
    /* JADX WARN: Type inference failed for: r3v2, types: [m00, gj1] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:57:0x013c -> B:21:0x008e). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:61:0x015f -> B:62:0x0165). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(defpackage.sk6 r18, long r19, defpackage.bt5 r21, defpackage.m00 r22) {
        /*
            Method dump skipped, instructions count: 375
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mj1.c(sk6, long, bt5, m00):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00a3, code lost:
        if (r2 == r4) goto L55;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.Object, m75] */
    /* JADX WARN: Type inference failed for: r13v2, types: [aj2] */
    /* JADX WARN: Type inference failed for: r3v2, types: [m00, hj1] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:55:0x0144 -> B:20:0x008f). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:59:0x0165 -> B:60:0x016c). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d(defpackage.sk6 r18, long r19, int r21, defpackage.z5 r22, defpackage.m00 r23) {
        /*
            Method dump skipped, instructions count: 381
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mj1.d(sk6, long, int, z5, m00):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0043 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0041 -> B:18:0x0044). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object e(defpackage.sk6 r4, long r5, defpackage.mi2 r7, defpackage.k11 r8) {
        /*
            boolean r0 = r8 instanceof defpackage.jj1
            if (r0 == 0) goto L13
            r0 = r8
            jj1 r0 = (defpackage.jj1) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Z = r1
            goto L18
        L13:
            jj1 r0 = new jj1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.Y
            p31 r1 = defpackage.p31.COROUTINE_SUSPENDED
            int r2 = r0.Z
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2d
            mi2 r4 = r0.X
            sk6 r5 = r0.R
            defpackage.me2.a0(r8)
            r7 = r4
            r4 = r5
            goto L44
        L2d:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.n(r4)
            r4 = 0
            return r4
        L34:
            defpackage.me2.a0(r8)
        L37:
            r0.R = r4
            r0.X = r7
            r0.Z = r3
            java.lang.Object r8 = a(r4, r5, r0)
            if (r8 != r1) goto L44
            return r1
        L44:
            rp4 r8 = (defpackage.rp4) r8
            if (r8 != 0) goto L4b
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            return r4
        L4b:
            boolean r5 = defpackage.ve2.q(r8)
            if (r5 == 0) goto L54
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            return r4
        L54:
            r7.n(r8)
            long r5 = r8.a
            goto L37
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mj1.e(sk6, long, mi2, k11):java.lang.Object");
    }

    public static final boolean f(kp4 kp4Var, long j) {
        Object obj;
        List list = kp4Var.a;
        int size = list.size();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i < size) {
                obj = list.get(i);
                if (cg2.y(((rp4) obj).a, j)) {
                    break;
                }
                i++;
            } else {
                obj = null;
                break;
            }
        }
        rp4 rp4Var = (rp4) obj;
        if (rp4Var != null && rp4Var.d) {
            z = true;
        }
        return true ^ z;
    }

    public static final float g(fa7 fa7Var, int i) {
        if (i == 2) {
            return fa7Var.d() * a;
        }
        return fa7Var.d();
    }

    /* JADX WARN: Code restructure failed: missing block: B:168:0x05c9, code lost:
        if (f(r10.Y.o0, r0) != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x0670, code lost:
        if (defpackage.mb4.c(defpackage.ve2.K(r5, true)) == androidx.recyclerview.widget.RecyclerView.A1) goto L52;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:197:0x0664, B:186:0x063f], limit reached: 224 */
    /* JADX WARN: Removed duplicated region for block: B:107:0x041a  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x048c  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x04a2  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x04ef  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0515  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x058b  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x05ab  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x060c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0636  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0639  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x068c  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0692  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0696  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x069a  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x062d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:218:0x04cc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0413 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:227:0x059a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:230:0x02bb A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:234:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:237:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x038b  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0397  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x03ef  */
    /* JADX WARN: Type inference failed for: r10v26, types: [ki2] */
    /* JADX WARN: Type inference failed for: r10v43, types: [mi2] */
    /* JADX WARN: Type inference failed for: r10v6, types: [ki2] */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, m75] */
    /* JADX WARN: Type inference failed for: r12v14, types: [ki2] */
    /* JADX WARN: Type inference failed for: r12v2, types: [bj2] */
    /* JADX WARN: Type inference failed for: r12v42, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v38, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v42, types: [ki2] */
    /* JADX WARN: Type inference failed for: r14v17, types: [bj2] */
    /* JADX WARN: Type inference failed for: r15v15, types: [java.lang.Object, m75] */
    /* JADX WARN: Type inference failed for: r22v0 */
    /* JADX WARN: Type inference failed for: r22v1 */
    /* JADX WARN: Type inference failed for: r22v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r22v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [kj1, m00] */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r3v41, types: [java.lang.Object, m75] */
    /* JADX WARN: Type inference failed for: r4v5, types: [mi2] */
    /* JADX WARN: Type inference failed for: r5v25, types: [bj2] */
    /* JADX WARN: Type inference failed for: r5v4, types: [ki2] */
    /* JADX WARN: Type inference failed for: r6v30, types: [mi2] */
    /* JADX WARN: Type inference failed for: r7v3, types: [bj2] */
    /* JADX WARN: Type inference failed for: r7v30, types: [ki2] */
    /* JADX WARN: Type inference failed for: r7v54, types: [mi2] */
    /* JADX WARN: Type inference failed for: r8v48, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v50 */
    /* JADX WARN: Type inference failed for: r8v53 */
    /* JADX WARN: Type inference failed for: r8v58, types: [ki2] */
    /* JADX WARN: Type inference failed for: r9v25, types: [java.lang.Object, m75] */
    /* JADX WARN: Type inference failed for: r9v34, types: [mi2] */
    /* JADX WARN: Type inference failed for: r9v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:101:0x040a -> B:91:0x03be). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:115:0x0445 -> B:164:0x05a2). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:116:0x044f -> B:117:0x0464). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:154:0x0544 -> B:117:0x0464). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:158:0x057f -> B:159:0x0585). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:163:0x059a -> B:164:0x05a2). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:172:0x05fe -> B:174:0x0601). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x0235 -> B:31:0x0236). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x02ca -> B:31:0x0236). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:67:0x0321 -> B:77:0x0389). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:69:0x0333 -> B:33:0x0252). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:73:0x0375 -> B:74:0x037e). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object h(defpackage.sk6 r25, defpackage.rp4 r26, defpackage.d5 r27, defpackage.km4 r28, defpackage.z5 r29, defpackage.yr3 r30, defpackage.j0 r31, defpackage.m00 r32) {
        /*
            Method dump skipped, instructions count: 1740
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mj1.h(sk6, rp4, d5, km4, z5, yr3, j0, m00):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x00fb, code lost:
        if (r0 == androidx.recyclerview.widget.RecyclerView.A1) goto L50;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0077 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00a4 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object, m75] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0078 -> B:23:0x007e). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object i(defpackage.sk6 r17, long r18, defpackage.j0 r20, defpackage.m00 r21) {
        /*
            Method dump skipped, instructions count: 302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mj1.i(sk6, long, j0, m00):java.lang.Object");
    }
}
