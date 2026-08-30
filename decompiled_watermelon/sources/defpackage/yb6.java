package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: yb6  reason: default package */
/* loaded from: classes.dex */
public abstract class yb6 {
    public static final long a = hi2.B(14);
    public static final long b = hi2.B(0);
    public static final long c = xq0.g;
    public static final qq6 d;

    static {
        qq6 qq6Var;
        long j = xq0.b;
        if (j != 16) {
            qq6Var = new fr0(j);
        } else {
            qq6Var = pq6.a;
        }
        d = qq6Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x00b6, code lost:
        if (r15.equals(r24.i) != false) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00c5, code lost:
        if (r39.equals(r24.j) == false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00d4, code lost:
        if (r40.equals(r24.k) == false) goto L6;
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0154  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.xb6 a(defpackage.xb6 r24, long r25, defpackage.b60 r27, float r28, long r29, defpackage.pe2 r31, defpackage.ke2 r32, defpackage.le2 r33, defpackage.pd2 r34, java.lang.String r35, long r36, defpackage.d10 r38, defpackage.rq6 r39, defpackage.fr3 r40, long r41, defpackage.qo6 r43, defpackage.u26 r44, defpackage.yo4 r45, defpackage.ik1 r46) {
        /*
            Method dump skipped, instructions count: 524
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yb6.a(xb6, long, b60, float, long, pe2, ke2, le2, pd2, java.lang.String, long, d10, rq6, fr3, long, qo6, u26, yo4, ik1):xb6");
    }

    public static final Object b(Object obj, Object obj2, float f) {
        if (f < 0.5d) {
            return obj;
        }
        return obj2;
    }

    public static final long c(long j, long j2, float f) {
        int i;
        js6[] js6VarArr = is6.b;
        long j3 = j & 1095216660480L;
        int i2 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        if (i2 == 0 || (1095216660480L & j2) == 0) {
            return ((is6) b(new is6(j), new is6(j2), f)).a;
        }
        if (i2 == 0 || i == 0) {
            oz2.a("Cannot perform operation for Unspecified type.");
        }
        if (!js6.a(is6.b(j), is6.b(j2))) {
            oz2.a("Cannot perform operation for " + ((Object) js6.b(is6.b(j))) + " and " + ((Object) js6.b(is6.b(j2))));
        }
        return hi2.L(ep2.y(is6.c(j), is6.c(j2), f), j3);
    }
}
